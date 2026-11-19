package com.google.firebase.sessions;

import android.content.Context;
import p078p0.InterfaceC6487a;

/* JADX INFO: renamed from: com.google.firebase.sessions.c */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C6046c implements InterfaceC6487a {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ int f24042s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ Object f24043t;

    public /* synthetic */ C6046c(Object obj, int i2) {
        this.f24042s = i2;
        this.f24043t = obj;
    }

    @Override // p078p0.InterfaceC6487a
    public final Object invoke() {
        switch (this.f24042s) {
            case 0:
                return FirebaseSessionsComponent.MainModule.Companion.sessionConfigsDataStore$lambda$2((Context) this.f24043t);
            case 1:
                return FirebaseSessionsComponent.MainModule.Companion.sessionDataStore$lambda$5((Context) this.f24043t);
            default:
                return ProcessDataManagerImpl.myUuid_delegate$lambda$1((UuidGenerator) this.f24043t);
        }
    }
}
