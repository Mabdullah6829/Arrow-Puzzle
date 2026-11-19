package com.google.firebase.sessions;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import androidx.datastore.DataStoreFile;
import androidx.datastore.core.CorruptionException;
import androidx.datastore.core.DataMigration;
import androidx.datastore.core.DataStore;
import androidx.datastore.core.DataStoreFactory;
import androidx.datastore.core.MultiProcessDataStoreFactory;
import androidx.datastore.core.Serializer;
import androidx.datastore.core.handlers.ReplaceFileCorruptionHandler;
import com.google.firebase.FirebaseApp;
import com.google.firebase.annotations.concurrent.Background;
import com.google.firebase.annotations.concurrent.Blocking;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.sessions.dagger.Binds;
import com.google.firebase.sessions.dagger.BindsInstance;
import com.google.firebase.sessions.dagger.Component;
import com.google.firebase.sessions.dagger.Module;
import com.google.firebase.sessions.dagger.Provides;
import com.google.firebase.sessions.settings.CrashlyticsSettingsFetcher;
import com.google.firebase.sessions.settings.LocalOverrideSettings;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.google.firebase.sessions.settings.RemoteSettingsFetcher;
import com.google.firebase.sessions.settings.SessionConfigs;
import com.google.firebase.sessions.settings.SessionConfigsSerializer;
import com.google.firebase.sessions.settings.SessionsSettings;
import com.google.firebase.sessions.settings.SettingsCache;
import com.google.firebase.sessions.settings.SettingsCacheImpl;
import com.google.firebase.sessions.settings.SettingsProvider;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.attribute.FileAttribute;
import java.util.List;
import kotlin.jvm.internal.AbstractC6452k;
import p000A0.AbstractC0069y;
import p000A0.C0059r;
import p000A0.InterfaceC0066v;
import p058e0.C6313u;
import p062g0.InterfaceC6353h;
import p063h.InterfaceC6361g;
import p078p0.InterfaceC6487a;
import p078p0.InterfaceC6498l;

/* JADX INFO: loaded from: classes2.dex */
@Component(modules = {MainModule.class})
public interface FirebaseSessionsComponent {

    @Component.Builder
    public interface Builder {
        @BindsInstance
        Builder appContext(Context context);

        @BindsInstance
        Builder backgroundDispatcher(@Background InterfaceC6353h interfaceC6353h);

        @BindsInstance
        Builder blockingDispatcher(@Blocking InterfaceC6353h interfaceC6353h);

        FirebaseSessionsComponent build();

        @BindsInstance
        Builder firebaseApp(FirebaseApp firebaseApp);

        @BindsInstance
        Builder firebaseInstallationsApi(FirebaseInstallationsApi firebaseInstallationsApi);

        @BindsInstance
        Builder transportFactoryProvider(Provider<InterfaceC6361g> provider);
    }

    @Module
    public interface MainModule {
        public static final Companion Companion = Companion.$$INSTANCE;

        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();

            private Companion() {
            }

            private final <T> DataStore<T> createDataStore(Serializer<T> serializer, ReplaceFileCorruptionHandler<T> replaceFileCorruptionHandler, List<? extends DataMigration<T>> list, InterfaceC0066v interfaceC0066v, InterfaceC6487a interfaceC6487a) {
                return loadDataStoreSharedCounter() ? MultiProcessDataStoreFactory.INSTANCE.create(serializer, replaceFileCorruptionHandler, list, interfaceC0066v, interfaceC6487a) : DataStoreFactory.INSTANCE.create(serializer, replaceFileCorruptionHandler, list, interfaceC0066v, interfaceC6487a);
            }

            public static /* synthetic */ DataStore createDataStore$default(Companion companion, Serializer serializer, ReplaceFileCorruptionHandler replaceFileCorruptionHandler, List list, InterfaceC0066v interfaceC0066v, InterfaceC6487a interfaceC6487a, int i2, Object obj) {
                if ((i2 & 4) != 0) {
                    list = C6313u.f24338s;
                }
                return companion.createDataStore(serializer, replaceFileCorruptionHandler, list, interfaceC0066v, interfaceC6487a);
            }

            private final boolean loadDataStoreSharedCounter() {
                try {
                    System.loadLibrary("datastore_shared_counter");
                    return true;
                } catch (SecurityException | UnsatisfiedLinkError unused) {
                    return false;
                }
            }

            private final void prepDataStoreFile(File file) throws IOException {
                File parentFile = file.getParentFile();
                if (parentFile == null) {
                    return;
                }
                if (parentFile.exists() && !parentFile.isDirectory() && AbstractC6452k.m12177a(parentFile.getName(), "firebaseSessions") && !parentFile.delete()) {
                    throw new IOException("Failed to delete conflicting file: " + parentFile);
                }
                if (parentFile.isDirectory()) {
                    return;
                }
                if (Build.VERSION.SDK_INT >= 26) {
                    try {
                        Files.createDirectories(parentFile.toPath(), new FileAttribute[0]);
                        return;
                    } catch (Exception e) {
                        throw new IOException("Failed to create directory: " + parentFile, e);
                    }
                }
                if (parentFile.mkdirs() || parentFile.isDirectory()) {
                    return;
                }
                throw new IOException("Failed to create directory: " + parentFile);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final SessionConfigs sessionConfigsDataStore$lambda$0(CorruptionException ex) {
                AbstractC6452k.m12181e(ex, "ex");
                Log.w(FirebaseSessions.TAG, "CorruptionException in session configs DataStore", ex);
                return SessionConfigsSerializer.INSTANCE.getDefaultValue();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final File sessionConfigsDataStore$lambda$2(Context context) throws IOException {
                File fileDataStoreFile = DataStoreFile.dataStoreFile(context, "firebaseSessions/sessionConfigsDataStore.data");
                $$INSTANCE.prepDataStoreFile(fileDataStoreFile);
                return fileDataStoreFile;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final SessionData sessionDataStore$lambda$3(SessionDataSerializer sessionDataSerializer, CorruptionException ex) {
                AbstractC6452k.m12181e(ex, "ex");
                Log.w(FirebaseSessions.TAG, "CorruptionException in session data DataStore", ex);
                return sessionDataSerializer.getDefaultValue();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final File sessionDataStore$lambda$5(Context context) throws IOException {
                File fileDataStoreFile = DataStoreFile.dataStoreFile(context, "firebaseSessions/sessionDataStore.data");
                $$INSTANCE.prepDataStoreFile(fileDataStoreFile);
                return fileDataStoreFile;
            }

            @Provides
            public final ApplicationInfo applicationInfo(FirebaseApp firebaseApp) {
                AbstractC6452k.m12181e(firebaseApp, "firebaseApp");
                return SessionEvents.INSTANCE.getApplicationInfo(firebaseApp);
            }

            @Provides
            public final DataStore<SessionConfigs> sessionConfigsDataStore(Context appContext, @Blocking InterfaceC6353h blockingDispatcher) {
                AbstractC6452k.m12181e(appContext, "appContext");
                AbstractC6452k.m12181e(blockingDispatcher, "blockingDispatcher");
                return createDataStore$default(this, SessionConfigsSerializer.INSTANCE, new ReplaceFileCorruptionHandler(new C0059r(25)), null, AbstractC0069y.m102a(blockingDispatcher), new C6046c(appContext, 0), 4, null);
            }

            @Provides
            public final DataStore<SessionData> sessionDataStore(Context appContext, @Blocking InterfaceC6353h blockingDispatcher, final SessionDataSerializer sessionDataSerializer) {
                AbstractC6452k.m12181e(appContext, "appContext");
                AbstractC6452k.m12181e(blockingDispatcher, "blockingDispatcher");
                AbstractC6452k.m12181e(sessionDataSerializer, "sessionDataSerializer");
                return createDataStore$default(this, sessionDataSerializer, new ReplaceFileCorruptionHandler(new InterfaceC6498l() { // from class: com.google.firebase.sessions.d
                    @Override // p078p0.InterfaceC6498l
                    public final Object invoke(Object obj) {
                        return FirebaseSessionsComponent.MainModule.Companion.sessionDataStore$lambda$3(sessionDataSerializer, (CorruptionException) obj);
                    }
                }), null, AbstractC0069y.m102a(blockingDispatcher), new C6046c(appContext, 1), 4, null);
            }

            @Provides
            public final TimeProvider timeProvider() {
                return TimeProviderImpl.INSTANCE;
            }

            @Provides
            public final UuidGenerator uuidGenerator() {
                return UuidGeneratorImpl.INSTANCE;
            }
        }

        @Binds
        CrashlyticsSettingsFetcher crashlyticsSettingsFetcher(RemoteSettingsFetcher remoteSettingsFetcher);

        @Binds
        EventGDTLoggerInterface eventGDTLoggerInterface(EventGDTLogger eventGDTLogger);

        @Binds
        @LocalOverrideSettingsProvider
        SettingsProvider localOverrideSettings(LocalOverrideSettings localOverrideSettings);

        @Binds
        ProcessDataManager processDataManager(ProcessDataManagerImpl processDataManagerImpl);

        @RemoteSettingsProvider
        @Binds
        SettingsProvider remoteSettings(RemoteSettings remoteSettings);

        @Binds
        SessionFirelogPublisher sessionFirelogPublisher(SessionFirelogPublisherImpl sessionFirelogPublisherImpl);

        @Binds
        SettingsCache settingsCache(SettingsCacheImpl settingsCacheImpl);

        @Binds
        SharedSessionRepository sharedSessionRepository(SharedSessionRepositoryImpl sharedSessionRepositoryImpl);
    }

    FirebaseSessions getFirebaseSessions();

    SessionFirelogPublisher getSessionFirelogPublisher();

    SessionGenerator getSessionGenerator();

    SessionsSettings getSessionsSettings();

    SharedSessionRepository getSharedSessionRepository();
}
