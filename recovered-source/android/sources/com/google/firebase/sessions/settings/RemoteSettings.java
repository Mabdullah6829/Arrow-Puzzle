package com.google.firebase.sessions.settings;

import android.os.Build;
import android.util.Log;
import androidx.annotation.VisibleForTesting;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.sessions.ApplicationInfo;
import com.google.firebase.sessions.FirebaseSessions;
import com.google.firebase.sessions.InstallationId;
import com.google.firebase.sessions.TimeProvider;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AbstractC6447f;
import kotlin.jvm.internal.AbstractC6452k;
import p011H.AbstractC0243G;
import p014I0.C0315d;
import p014I0.InterfaceC0312a;
import p022N.AbstractC0355G;
import p057d0.C6283e;
import p057d0.C6289k;
import p058e0.AbstractC6318z;
import p062g0.InterfaceC6348c;
import p064h0.EnumC6363a;
import p066i0.AbstractC6373c;
import p066i0.InterfaceC6375e;
import p091y0.C6573c;
import p092z0.C6583a;
import p092z0.EnumC6585c;

/* JADX INFO: loaded from: classes2.dex */
public final class RemoteSettings implements SettingsProvider {
    private static final Companion Companion = new Companion(null);
    private static final int defaultCacheDuration;
    private static final C6573c sanitizeRegex;
    private final ApplicationInfo appInfo;
    private final CrashlyticsSettingsFetcher configsFetcher;
    private final InterfaceC0312a fetchInProgress;
    private final FirebaseInstallationsApi firebaseInstallationsApi;
    private final SettingsCache settingsCache;
    private final TimeProvider timeProvider;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC6447f abstractC6447f) {
            this();
        }

        public final int getDefaultCacheDuration() {
            return RemoteSettings.defaultCacheDuration;
        }

        public final C6573c getSanitizeRegex() {
            return RemoteSettings.sanitizeRegex;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.sessions.settings.RemoteSettings$updateSettings$1 */
    @InterfaceC6375e(m12158c = "com.google.firebase.sessions.settings.RemoteSettings", m12159f = "RemoteSettings.kt", m12160l = {165, 78, 95}, m12161m = "updateSettings")
    public static final class C60501 extends AbstractC6373c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C60501(InterfaceC6348c interfaceC6348c) {
            super(interfaceC6348c);
        }

        @Override // p066i0.AbstractC6371a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RemoteSettings.this.updateSettings(this);
        }
    }

    static {
        int i2 = C6583a.f24808v;
        defaultCacheDuration = (int) C6583a.m12240f(AbstractC0355G.m560n(24, EnumC6585c.HOURS), EnumC6585c.SECONDS);
        sanitizeRegex = new C6573c("com/google/firebase/sessions//");
    }

    public RemoteSettings(TimeProvider timeProvider, FirebaseInstallationsApi firebaseInstallationsApi, ApplicationInfo appInfo, CrashlyticsSettingsFetcher configsFetcher, SettingsCache settingsCache) {
        AbstractC6452k.m12181e(timeProvider, "timeProvider");
        AbstractC6452k.m12181e(firebaseInstallationsApi, "firebaseInstallationsApi");
        AbstractC6452k.m12181e(appInfo, "appInfo");
        AbstractC6452k.m12181e(configsFetcher, "configsFetcher");
        AbstractC6452k.m12181e(settingsCache, "settingsCache");
        this.timeProvider = timeProvider;
        this.firebaseInstallationsApi = firebaseInstallationsApi;
        this.appInfo = appInfo;
        this.configsFetcher = configsFetcher;
        this.settingsCache = settingsCache;
        this.fetchInProgress = new C0315d();
    }

    private final String sanitize(String input) {
        C6573c c6573c = sanitizeRegex;
        c6573c.getClass();
        AbstractC6452k.m12181e(input, "input");
        String strReplaceAll = c6573c.f24805s.matcher(input).replaceAll("");
        AbstractC6452k.m12180d(strReplaceAll, "replaceAll(...)");
        return strReplaceAll;
    }

    @VisibleForTesting
    public final Object clearCachedSettings$com_google_firebase_firebase_sessions(InterfaceC6348c interfaceC6348c) {
        Object objUpdateConfigs = this.settingsCache.updateConfigs(SessionConfigsSerializer.INSTANCE.getDefaultValue(), interfaceC6348c);
        return objUpdateConfigs == EnumC6363a.f24419s ? objUpdateConfigs : C6289k.f24318a;
    }

    @Override // com.google.firebase.sessions.settings.SettingsProvider
    public Double getSamplingRate() {
        return this.settingsCache.sessionSamplingRate();
    }

    @Override // com.google.firebase.sessions.settings.SettingsProvider
    public Boolean getSessionEnabled() {
        return this.settingsCache.sessionsEnabled();
    }

    @Override // com.google.firebase.sessions.settings.SettingsProvider
    /* JADX INFO: renamed from: getSessionRestartTimeout-FghU774 */
    public C6583a mo12337getSessionRestartTimeoutFghU774() {
        Integer numSessionRestartTimeout = this.settingsCache.sessionRestartTimeout();
        if (numSessionRestartTimeout == null) {
            return null;
        }
        int i2 = C6583a.f24808v;
        return new C6583a(AbstractC0355G.m560n(numSessionRestartTimeout.intValue(), EnumC6585c.SECONDS));
    }

    @Override // com.google.firebase.sessions.settings.SettingsProvider
    public boolean isSettingsStale() {
        return this.settingsCache.hasCacheExpired();
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00b7 A[Catch: all -> 0x004a, TRY_LEAVE, TryCatch #2 {all -> 0x004a, blocks: (B:21:0x0046, B:45:0x00a9, B:47:0x00b7, B:50:0x00c2), top: B:61:0x0046 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00c2 A[Catch: all -> 0x004a, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x004a, blocks: (B:21:0x0046, B:45:0x00a9, B:47:0x00b7, B:50:0x00c2), top: B:61:0x0046 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x0145  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Instruction removed from duplicated block: B:50:0x00c2, please report this as an issue */
    @Override // com.google.firebase.sessions.settings.SettingsProvider
    public Object updateSettings(InterfaceC6348c interfaceC6348c) throws Throwable {
        C60501 c60501;
        InterfaceC0312a interfaceC0312a;
        InterfaceC0312a interfaceC0312a2;
        Throwable th;
        InterfaceC0312a interfaceC0312a3;
        String fid;
        LinkedHashMap linkedHashMap;
        CrashlyticsSettingsFetcher crashlyticsSettingsFetcher;
        RemoteSettings$updateSettings$2$1 remoteSettings$updateSettings$2$1;
        RemoteSettings$updateSettings$2$2 remoteSettings$updateSettings$2$2;
        InterfaceC0312a interfaceC0312a4;
        if (interfaceC6348c instanceof C60501) {
            c60501 = (C60501) interfaceC6348c;
            int i2 = c60501.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c60501.label = i2 - Integer.MIN_VALUE;
            } else {
                c60501 = new C60501(interfaceC6348c);
            }
        } else {
            c60501 = new C60501(interfaceC6348c);
        }
        Object obj = c60501.result;
        EnumC6363a enumC6363a = EnumC6363a.f24419s;
        int i3 = c60501.label;
        C6289k c6289k = C6289k.f24318a;
        try {
            if (i3 == 0) {
                AbstractC0243G.m377o(obj);
                if (!((C0315d) this.fetchInProgress).m461c() && !this.settingsCache.hasCacheExpired()) {
                    return c6289k;
                }
                InterfaceC0312a interfaceC0312a5 = this.fetchInProgress;
                c60501.L$0 = interfaceC0312a5;
                c60501.label = 1;
                C0315d c0315d = (C0315d) interfaceC0312a5;
                Object objM462d = c0315d.m462d(c60501);
                interfaceC0312a = c0315d;
                if (objM462d != enumC6363a) {
                }
                return enumC6363a;
            }
            if (i3 != 1) {
                if (i3 == 2) {
                    InterfaceC0312a interfaceC0312a6 = (InterfaceC0312a) c60501.L$0;
                    try {
                        AbstractC0243G.m377o(obj);
                        interfaceC0312a3 = interfaceC0312a6;
                        fid = ((InstallationId) obj).getFid();
                        if (AbstractC6452k.m12177a(fid, "")) {
                            Log.w(FirebaseSessions.TAG, "Error getting Firebase Installation ID. Skipping this Session Event.");
                            ((C0315d) interfaceC0312a3).m464f(null);
                            return c6289k;
                        }
                        C6283e c6283e = new C6283e("X-Crashlytics-Installation-ID", fid);
                        C6283e c6283e2 = new C6283e("X-Crashlytics-Device-Model", sanitize(Build.MANUFACTURER + Build.MODEL));
                        String INCREMENTAL = Build.VERSION.INCREMENTAL;
                        AbstractC6452k.m12180d(INCREMENTAL, "INCREMENTAL");
                        C6283e c6283e3 = new C6283e("X-Crashlytics-OS-Build-Version", sanitize(INCREMENTAL));
                        String RELEASE = Build.VERSION.RELEASE;
                        AbstractC6452k.m12180d(RELEASE, "RELEASE");
                        C6283e[] c6283eArr = {c6283e, c6283e2, c6283e3, new C6283e("X-Crashlytics-OS-Display-Version", sanitize(RELEASE)), new C6283e("X-Crashlytics-API-Client-Version", this.appInfo.getSessionSdkVersion())};
                        linkedHashMap = new LinkedHashMap(AbstractC6318z.m12126t(5));
                        AbstractC6318z.m12129w(linkedHashMap, c6283eArr);
                        Log.d(FirebaseSessions.TAG, "Fetching settings from server.");
                        crashlyticsSettingsFetcher = this.configsFetcher;
                        remoteSettings$updateSettings$2$1 = new RemoteSettings$updateSettings$2$1(this, null);
                        remoteSettings$updateSettings$2$2 = new RemoteSettings$updateSettings$2$2(null);
                        c60501.L$0 = interfaceC0312a3;
                        c60501.label = 3;
                        if (crashlyticsSettingsFetcher.doConfigFetch(linkedHashMap, remoteSettings$updateSettings$2$1, remoteSettings$updateSettings$2$2, c60501) != enumC6363a) {
                            interfaceC0312a4 = interfaceC0312a3;
                            ((C0315d) interfaceC0312a4).m464f(null);
                            return c6289k;
                        }
                        return enumC6363a;
                    } catch (Throwable th2) {
                        th = th2;
                        interfaceC0312a2 = interfaceC0312a6;
                    }
                } else {
                    if (i3 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    interfaceC0312a2 = (InterfaceC0312a) c60501.L$0;
                    try {
                        AbstractC0243G.m377o(obj);
                        interfaceC0312a4 = interfaceC0312a2;
                        ((C0315d) interfaceC0312a4).m464f(null);
                        return c6289k;
                    } catch (Throwable th3) {
                        th = th3;
                    }
                }
                ((C0315d) interfaceC0312a2).m464f(null);
                throw th;
            }
            InterfaceC0312a interfaceC0312a7 = (InterfaceC0312a) c60501.L$0;
            AbstractC0243G.m377o(obj);
            interfaceC0312a = interfaceC0312a7;
            if (!this.settingsCache.hasCacheExpired()) {
                Log.d(FirebaseSessions.TAG, "Remote settings cache not expired. Using cached values.");
                ((C0315d) interfaceC0312a).m464f(null);
                return c6289k;
            }
            InstallationId.Companion companion = InstallationId.Companion;
            FirebaseInstallationsApi firebaseInstallationsApi = this.firebaseInstallationsApi;
            c60501.L$0 = interfaceC0312a;
            c60501.label = 2;
            Object objCreate = companion.create(firebaseInstallationsApi, c60501);
            if (objCreate != enumC6363a) {
                interfaceC0312a3 = interfaceC0312a;
                obj = objCreate;
                fid = ((InstallationId) obj).getFid();
                if (AbstractC6452k.m12177a(fid, "")) {
                    Log.w(FirebaseSessions.TAG, "Error getting Firebase Installation ID. Skipping this Session Event.");
                    ((C0315d) interfaceC0312a3).m464f(null);
                    return c6289k;
                }
                C6283e c6283e4 = new C6283e("X-Crashlytics-Installation-ID", fid);
                C6283e c6283e5 = new C6283e("X-Crashlytics-Device-Model", sanitize(Build.MANUFACTURER + Build.MODEL));
                String INCREMENTAL2 = Build.VERSION.INCREMENTAL;
                AbstractC6452k.m12180d(INCREMENTAL2, "INCREMENTAL");
                C6283e c6283e6 = new C6283e("X-Crashlytics-OS-Build-Version", sanitize(INCREMENTAL2));
                String RELEASE2 = Build.VERSION.RELEASE;
                AbstractC6452k.m12180d(RELEASE2, "RELEASE");
                C6283e[] c6283eArr2 = {c6283e4, c6283e5, c6283e6, new C6283e("X-Crashlytics-OS-Display-Version", sanitize(RELEASE2)), new C6283e("X-Crashlytics-API-Client-Version", this.appInfo.getSessionSdkVersion())};
                linkedHashMap = new LinkedHashMap(AbstractC6318z.m12126t(5));
                AbstractC6318z.m12129w(linkedHashMap, c6283eArr2);
                Log.d(FirebaseSessions.TAG, "Fetching settings from server.");
                crashlyticsSettingsFetcher = this.configsFetcher;
                remoteSettings$updateSettings$2$1 = new RemoteSettings$updateSettings$2$1(this, null);
                remoteSettings$updateSettings$2$2 = new RemoteSettings$updateSettings$2$2(null);
                c60501.L$0 = interfaceC0312a3;
                c60501.label = 3;
                if (crashlyticsSettingsFetcher.doConfigFetch(linkedHashMap, remoteSettings$updateSettings$2$1, remoteSettings$updateSettings$2$2, c60501) != enumC6363a) {
                    interfaceC0312a4 = interfaceC0312a3;
                    ((C0315d) interfaceC0312a4).m464f(null);
                    return c6289k;
                }
            }
            return enumC6363a;
        } catch (Throwable th4) {
            interfaceC0312a2 = interfaceC0312a;
            th = th4;
        }
    }
}
