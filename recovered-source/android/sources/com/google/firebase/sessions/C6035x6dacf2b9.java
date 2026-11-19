package com.google.firebase.sessions;

import com.google.firebase.sessions.dagger.internal.DaggerGenerated;
import com.google.firebase.sessions.dagger.internal.Factory;
import com.google.firebase.sessions.dagger.internal.Preconditions;
import com.google.firebase.sessions.dagger.internal.QualifierMetadata;
import com.google.firebase.sessions.dagger.internal.ScopeMetadata;

/* JADX INFO: renamed from: com.google.firebase.sessions.FirebaseSessionsComponent_MainModule_Companion_UuidGeneratorFactory */
/* JADX INFO: loaded from: classes2.dex */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
public final class C6035x6dacf2b9 implements Factory<UuidGenerator> {

    /* JADX INFO: renamed from: com.google.firebase.sessions.FirebaseSessionsComponent_MainModule_Companion_UuidGeneratorFactory$InstanceHolder */
    public static final class InstanceHolder {
        static final C6035x6dacf2b9 INSTANCE = new C6035x6dacf2b9();

        private InstanceHolder() {
        }
    }

    public static C6035x6dacf2b9 create() {
        return InstanceHolder.INSTANCE;
    }

    public static UuidGenerator uuidGenerator() {
        return (UuidGenerator) Preconditions.checkNotNullFromProvides(FirebaseSessionsComponent.MainModule.Companion.uuidGenerator());
    }

    @Override // com.google.firebase.sessions.dagger.internal.Factory, com.google.firebase.sessions.dagger.internal.Provider, p050c0.InterfaceC1888a
    public UuidGenerator get() {
        return uuidGenerator();
    }
}
