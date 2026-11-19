package com.google.firebase.firestore.local;

import com.google.firebase.firestore.util.Supplier;
import p001B.InterfaceC0097w;

/* JADX INFO: renamed from: com.google.firebase.firestore.local.b */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5793b implements InterfaceC0097w, Supplier {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ int f23757s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ Object f23758t;

    public /* synthetic */ C5793b(Object obj, int i2) {
        this.f23757s = i2;
        this.f23758t = obj;
    }

    @Override // p001B.InterfaceC0097w
    public final Object get() {
        switch (this.f23757s) {
            case 0:
                return ((LocalStore) this.f23758t).getIndexManagerForCurrentUser();
            case 1:
                return ((LocalStore) this.f23758t).getLocalDocumentsForCurrentUser();
            case 2:
                return ((LocalStore) this.f23758t).lambda$getFieldIndexes$14();
            default:
                return ((IndexBackfiller) this.f23758t).lambda$backfill$0();
        }
    }
}
