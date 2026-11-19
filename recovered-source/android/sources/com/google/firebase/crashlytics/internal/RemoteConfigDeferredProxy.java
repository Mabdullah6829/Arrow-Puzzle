package com.google.firebase.crashlytics.internal;

import androidx.constraintlayout.core.state.C1106a;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;
import com.google.firebase.remoteconfig.interop.FirebaseRemoteConfigInterop;

/* JADX INFO: loaded from: classes2.dex */
public class RemoteConfigDeferredProxy {
    private final Deferred<FirebaseRemoteConfigInterop> remoteConfigInteropDeferred;

    public RemoteConfigDeferredProxy(Deferred<FirebaseRemoteConfigInterop> deferred) {
        this.remoteConfigInteropDeferred = deferred;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$setupListener$0(CrashlyticsRemoteConfigListener crashlyticsRemoteConfigListener, Provider provider) {
        ((FirebaseRemoteConfigInterop) provider.get()).registerRolloutsStateSubscriber("firebase", crashlyticsRemoteConfigListener);
        Logger.getLogger().m11167d("Registering RemoteConfig Rollouts subscriber");
    }

    public void setupListener(UserMetadata userMetadata) {
        if (userMetadata == null) {
            Logger.getLogger().m11175w("Didn't successfully register with UserMetadata for rollouts listener");
        } else {
            this.remoteConfigInteropDeferred.whenAvailable(new C1106a(new CrashlyticsRemoteConfigListener(userMetadata), 7));
        }
    }
}
