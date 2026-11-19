package com.google.firebase.crashlytics.internal.settings;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.common.CurrentTimeProvider;
import com.google.firebase.crashlytics.internal.common.DataCollectionArbiter;
import com.google.firebase.crashlytics.internal.common.DeliveryMechanism;
import com.google.firebase.crashlytics.internal.common.IdManager;
import com.google.firebase.crashlytics.internal.common.SystemCurrentTimeProvider;
import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers;
import com.google.firebase.crashlytics.internal.network.HttpRequestFactory;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;
import p011H.AbstractC0271e0;

/* JADX INFO: loaded from: classes2.dex */
public class SettingsController implements SettingsProvider {
    private static final String PREFS_BUILD_INSTANCE_IDENTIFIER = "existing_instance_identifier";
    private static final String SETTINGS_URL_FORMAT = "https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/%s/settings";
    private final CachedSettingsIo cachedSettingsIo;
    private final Context context;
    private final CurrentTimeProvider currentTimeProvider;
    private final DataCollectionArbiter dataCollectionArbiter;
    private final AtomicReference<Settings> settings;
    private final SettingsJsonParser settingsJsonParser;
    private final SettingsRequest settingsRequest;
    private final SettingsSpiCall settingsSpiCall;
    private final AtomicReference<TaskCompletionSource<Settings>> settingsTask;

    /* JADX INFO: renamed from: com.google.firebase.crashlytics.internal.settings.SettingsController$1 */
    public class C56991 implements SuccessContinuation<Void, Void> {
        final /* synthetic */ CrashlyticsWorkers val$crashlyticsWorkers;

        public C56991(CrashlyticsWorkers crashlyticsWorkers) {
            this.val$crashlyticsWorkers = crashlyticsWorkers;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ JSONObject lambda$then$0() {
            return SettingsController.this.settingsSpiCall.invoke(SettingsController.this.settingsRequest, true);
        }

        @Override // com.google.android.gms.tasks.SuccessContinuation
        @NonNull
        public Task<Void> then(@Nullable Void r5) throws Throwable {
            JSONObject jSONObject = (JSONObject) this.val$crashlyticsWorkers.network.getExecutor().submit(new Callable() { // from class: com.google.firebase.crashlytics.internal.settings.a
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.f23639a.lambda$then$0();
                }
            }).get();
            if (jSONObject != null) {
                Settings settingsJson = SettingsController.this.settingsJsonParser.parseSettingsJson(jSONObject);
                SettingsController.this.cachedSettingsIo.writeCachedSettings(settingsJson.expiresAtMillis, jSONObject);
                SettingsController.this.logSettings(jSONObject, "Loaded settings: ");
                SettingsController settingsController = SettingsController.this;
                settingsController.setStoredBuildInstanceIdentifier(settingsController.settingsRequest.instanceId);
                SettingsController.this.settings.set(settingsJson);
                ((TaskCompletionSource) SettingsController.this.settingsTask.get()).m10770d(settingsJson);
            }
            return Tasks.m10776f(null);
        }
    }

    public SettingsController(Context context, SettingsRequest settingsRequest, CurrentTimeProvider currentTimeProvider, SettingsJsonParser settingsJsonParser, CachedSettingsIo cachedSettingsIo, SettingsSpiCall settingsSpiCall, DataCollectionArbiter dataCollectionArbiter) {
        AtomicReference<Settings> atomicReference = new AtomicReference<>();
        this.settings = atomicReference;
        this.settingsTask = new AtomicReference<>(new TaskCompletionSource());
        this.context = context;
        this.settingsRequest = settingsRequest;
        this.currentTimeProvider = currentTimeProvider;
        this.settingsJsonParser = settingsJsonParser;
        this.cachedSettingsIo = cachedSettingsIo;
        this.settingsSpiCall = settingsSpiCall;
        this.dataCollectionArbiter = dataCollectionArbiter;
        atomicReference.set(DefaultSettingsJsonTransform.defaultSettings(currentTimeProvider));
    }

    public static SettingsController create(Context context, String str, IdManager idManager, HttpRequestFactory httpRequestFactory, String str2, String str3, FileStore fileStore, DataCollectionArbiter dataCollectionArbiter) {
        String installerPackageName = idManager.getInstallerPackageName();
        SystemCurrentTimeProvider systemCurrentTimeProvider = new SystemCurrentTimeProvider();
        SettingsJsonParser settingsJsonParser = new SettingsJsonParser(systemCurrentTimeProvider);
        CachedSettingsIo cachedSettingsIo = new CachedSettingsIo(fileStore);
        Locale locale = Locale.US;
        return new SettingsController(context, new SettingsRequest(str, idManager.getModelName(), idManager.getOsBuildVersionString(), idManager.getOsDisplayVersionString(), idManager, CommonUtils.createInstanceIdFrom(CommonUtils.getMappingFileId(context), str, str3, str2), str3, str2, DeliveryMechanism.determineFrom(installerPackageName).getId()), systemCurrentTimeProvider, settingsJsonParser, cachedSettingsIo, new DefaultSettingsSpiCall(AbstractC0271e0.m399g("https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/", str, "/settings"), httpRequestFactory), dataCollectionArbiter);
    }

    private Settings getCachedSettingsData(SettingsCacheBehavior settingsCacheBehavior) throws Throwable {
        Settings settings = null;
        try {
            if (!SettingsCacheBehavior.SKIP_CACHE_LOOKUP.equals(settingsCacheBehavior)) {
                JSONObject cachedSettings = this.cachedSettingsIo.readCachedSettings();
                if (cachedSettings != null) {
                    Settings settingsJson = this.settingsJsonParser.parseSettingsJson(cachedSettings);
                    if (settingsJson == null) {
                        Logger.getLogger().m11170e("Failed to parse cached settings data.", null);
                        return null;
                    }
                    logSettings(cachedSettings, "Loaded cached settings: ");
                    long currentTimeMillis = this.currentTimeProvider.getCurrentTimeMillis();
                    if (!SettingsCacheBehavior.IGNORE_CACHE_EXPIRATION.equals(settingsCacheBehavior) && settingsJson.isExpired(currentTimeMillis)) {
                        Logger.getLogger().m11173v("Cached settings have expired.");
                        return null;
                    }
                    try {
                        Logger.getLogger().m11173v("Returning cached settings.");
                        return settingsJson;
                    } catch (Exception e) {
                        e = e;
                        settings = settingsJson;
                        Logger.getLogger().m11170e("Failed to get cached settings", e);
                        return settings;
                    }
                }
                Logger.getLogger().m11167d("No cached settings data found.");
            }
            return null;
        } catch (Exception e2) {
            e = e2;
        }
    }

    private String getStoredBuildInstanceIdentifier() {
        return CommonUtils.getSharedPrefs(this.context).getString(PREFS_BUILD_INSTANCE_IDENTIFIER, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void logSettings(JSONObject jSONObject, String str) {
        Logger logger = Logger.getLogger();
        StringBuilder sbM408p = AbstractC0271e0.m408p(str);
        sbM408p.append(jSONObject.toString());
        logger.m11167d(sbM408p.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean setStoredBuildInstanceIdentifier(String str) {
        SharedPreferences.Editor editorEdit = CommonUtils.getSharedPrefs(this.context).edit();
        editorEdit.putString(PREFS_BUILD_INSTANCE_IDENTIFIER, str);
        editorEdit.apply();
        return true;
    }

    public boolean buildInstanceIdentifierChanged() {
        return !getStoredBuildInstanceIdentifier().equals(this.settingsRequest.instanceId);
    }

    @Override // com.google.firebase.crashlytics.internal.settings.SettingsProvider
    public Task<Settings> getSettingsAsync() {
        return this.settingsTask.get().f23216a;
    }

    @Override // com.google.firebase.crashlytics.internal.settings.SettingsProvider
    public Settings getSettingsSync() {
        return this.settings.get();
    }

    public Task<Void> loadSettingsData(CrashlyticsWorkers crashlyticsWorkers) {
        return loadSettingsData(SettingsCacheBehavior.USE_CACHE, crashlyticsWorkers);
    }

    public Task<Void> loadSettingsData(SettingsCacheBehavior settingsCacheBehavior, CrashlyticsWorkers crashlyticsWorkers) throws Throwable {
        Settings cachedSettingsData;
        if (!buildInstanceIdentifierChanged() && (cachedSettingsData = getCachedSettingsData(settingsCacheBehavior)) != null) {
            this.settings.set(cachedSettingsData);
            this.settingsTask.get().m10770d(cachedSettingsData);
            return Tasks.m10776f(null);
        }
        Settings cachedSettingsData2 = getCachedSettingsData(SettingsCacheBehavior.IGNORE_CACHE_EXPIRATION);
        if (cachedSettingsData2 != null) {
            this.settings.set(cachedSettingsData2);
            this.settingsTask.get().m10770d(cachedSettingsData2);
        }
        return this.dataCollectionArbiter.waitForDataCollectionPermission().onSuccessTask(crashlyticsWorkers.common, new C56991(crashlyticsWorkers));
    }
}
