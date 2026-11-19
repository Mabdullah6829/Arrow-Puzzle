package com.google.firebase.sessions;

import android.content.Context;
import android.util.Log;
import androidx.annotation.Keep;
import androidx.datastore.core.MultiProcessDataStoreFactory;
import com.google.firebase.FirebaseApp;
import com.google.firebase.annotations.concurrent.Background;
import com.google.firebase.annotations.concurrent.Blocking;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Dependency;
import com.google.firebase.components.Qualified;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import java.util.List;
import kotlin.jvm.internal.AbstractC6447f;
import kotlin.jvm.internal.AbstractC6452k;
import p000A0.AbstractC0063t;
import p015J.C0322a;
import p058e0.AbstractC6306n;
import p062g0.InterfaceC6353h;
import p063h.InterfaceC6361g;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public final class FirebaseSessionsRegistrar implements ComponentRegistrar {
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final String LIBRARY_NAME = "fire-sessions";
    private static final Qualified<Context> appContext;
    private static final Qualified<AbstractC0063t> backgroundDispatcher;
    private static final Qualified<AbstractC0063t> blockingDispatcher;
    private static final Qualified<FirebaseApp> firebaseApp;
    private static final Qualified<FirebaseInstallationsApi> firebaseInstallationsApi;
    private static final Qualified<FirebaseSessionsComponent> firebaseSessionsComponent;
    private static final Qualified<InterfaceC6361g> transportFactory;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC6447f abstractC6447f) {
            this();
        }

        public final Qualified<Context> getAppContext() {
            return FirebaseSessionsRegistrar.appContext;
        }

        public final Qualified<AbstractC0063t> getBackgroundDispatcher() {
            return FirebaseSessionsRegistrar.backgroundDispatcher;
        }

        public final Qualified<AbstractC0063t> getBlockingDispatcher() {
            return FirebaseSessionsRegistrar.blockingDispatcher;
        }

        public final Qualified<FirebaseApp> getFirebaseApp() {
            return FirebaseSessionsRegistrar.firebaseApp;
        }

        public final Qualified<FirebaseInstallationsApi> getFirebaseInstallationsApi() {
            return FirebaseSessionsRegistrar.firebaseInstallationsApi;
        }

        public final Qualified<FirebaseSessionsComponent> getFirebaseSessionsComponent() {
            return FirebaseSessionsRegistrar.firebaseSessionsComponent;
        }

        public final Qualified<InterfaceC6361g> getTransportFactory() {
            return FirebaseSessionsRegistrar.transportFactory;
        }

        private Companion() {
        }
    }

    static {
        Qualified<Context> qualifiedUnqualified = Qualified.unqualified(Context.class);
        AbstractC6452k.m12180d(qualifiedUnqualified, "unqualified(...)");
        appContext = qualifiedUnqualified;
        Qualified<FirebaseApp> qualifiedUnqualified2 = Qualified.unqualified(FirebaseApp.class);
        AbstractC6452k.m12180d(qualifiedUnqualified2, "unqualified(...)");
        firebaseApp = qualifiedUnqualified2;
        Qualified<FirebaseInstallationsApi> qualifiedUnqualified3 = Qualified.unqualified(FirebaseInstallationsApi.class);
        AbstractC6452k.m12180d(qualifiedUnqualified3, "unqualified(...)");
        firebaseInstallationsApi = qualifiedUnqualified3;
        Qualified<AbstractC0063t> qualified = Qualified.qualified(Background.class, AbstractC0063t.class);
        AbstractC6452k.m12180d(qualified, "qualified(...)");
        backgroundDispatcher = qualified;
        Qualified<AbstractC0063t> qualified2 = Qualified.qualified(Blocking.class, AbstractC0063t.class);
        AbstractC6452k.m12180d(qualified2, "qualified(...)");
        blockingDispatcher = qualified2;
        Qualified<InterfaceC6361g> qualifiedUnqualified4 = Qualified.unqualified(InterfaceC6361g.class);
        AbstractC6452k.m12180d(qualifiedUnqualified4, "unqualified(...)");
        transportFactory = qualifiedUnqualified4;
        Qualified<FirebaseSessionsComponent> qualifiedUnqualified5 = Qualified.unqualified(FirebaseSessionsComponent.class);
        AbstractC6452k.m12180d(qualifiedUnqualified5, "unqualified(...)");
        firebaseSessionsComponent = qualifiedUnqualified5;
        try {
            MultiProcessDataStoreFactory.INSTANCE.getClass();
        } catch (NoClassDefFoundError unused) {
            Log.w(FirebaseSessions.TAG, "Your app is experiencing a known issue in the Android Gradle plugin, see https://issuetracker.google.com/328687152\n\nIt affects Java-only apps using AGP version 8.3.2 and under. To avoid the issue, either:\n\n1. Upgrade Android Gradle plugin to 8.4.0+\n   Follow the guide at https://developer.android.com/build/agp-upgrade-assistant\n\n2. Or, add the Kotlin plugin to your app\n   Follow the guide at https://developer.android.com/kotlin/add-kotlin\n\n3. Or, do the technical workaround described in https://issuetracker.google.com/issues/328687152#comment3");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FirebaseSessions getComponents$lambda$0(ComponentContainer componentContainer) {
        return ((FirebaseSessionsComponent) componentContainer.get(firebaseSessionsComponent)).getFirebaseSessions();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FirebaseSessionsComponent getComponents$lambda$1(ComponentContainer componentContainer) {
        FirebaseSessionsComponent.Builder builder = DaggerFirebaseSessionsComponent.builder();
        Object obj = componentContainer.get(appContext);
        AbstractC6452k.m12180d(obj, "get(...)");
        FirebaseSessionsComponent.Builder builderAppContext = builder.appContext((Context) obj);
        Object obj2 = componentContainer.get(backgroundDispatcher);
        AbstractC6452k.m12180d(obj2, "get(...)");
        FirebaseSessionsComponent.Builder builderBackgroundDispatcher = builderAppContext.backgroundDispatcher((InterfaceC6353h) obj2);
        Object obj3 = componentContainer.get(blockingDispatcher);
        AbstractC6452k.m12180d(obj3, "get(...)");
        FirebaseSessionsComponent.Builder builderBlockingDispatcher = builderBackgroundDispatcher.blockingDispatcher((InterfaceC6353h) obj3);
        Object obj4 = componentContainer.get(firebaseApp);
        AbstractC6452k.m12180d(obj4, "get(...)");
        FirebaseSessionsComponent.Builder builderFirebaseApp = builderBlockingDispatcher.firebaseApp((FirebaseApp) obj4);
        Object obj5 = componentContainer.get(firebaseInstallationsApi);
        AbstractC6452k.m12180d(obj5, "get(...)");
        FirebaseSessionsComponent.Builder builderFirebaseInstallationsApi = builderFirebaseApp.firebaseInstallationsApi((FirebaseInstallationsApi) obj5);
        Provider<InterfaceC6361g> provider = componentContainer.getProvider(transportFactory);
        AbstractC6452k.m12180d(provider, "getProvider(...)");
        return builderFirebaseInstallationsApi.transportFactoryProvider(provider).build();
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<Component<? extends Object>> getComponents() {
        return AbstractC6306n.m12120r(Component.builder(FirebaseSessions.class).name(LIBRARY_NAME).add(Dependency.required(firebaseSessionsComponent)).factory(new C0322a(10)).eagerInDefaultApp().build(), Component.builder(FirebaseSessionsComponent.class).name("fire-sessions-component").add(Dependency.required(appContext)).add(Dependency.required(backgroundDispatcher)).add(Dependency.required(blockingDispatcher)).add(Dependency.required(firebaseApp)).add(Dependency.required(firebaseInstallationsApi)).add(Dependency.requiredProvider(transportFactory)).factory(new C0322a(11)).build(), LibraryVersionComponent.create(LIBRARY_NAME, BuildConfig.VERSION_NAME));
    }
}
