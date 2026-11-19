package com.google.firebase.firestore.local;

import com.google.firebase.database.collection.ImmutableSortedMap;
import com.google.firebase.firestore.model.SnapshotVersion;
import com.google.firebase.firestore.remote.RemoteEvent;
import com.google.firebase.firestore.util.Supplier;

/* JADX INFO: renamed from: com.google.firebase.firestore.local.m */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5804m implements Supplier {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ int f23787s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ LocalStore f23788t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ Object f23789u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ Object f23790v;

    public /* synthetic */ C5804m(LocalStore localStore, Object obj, Object obj2, int i2) {
        this.f23787s = i2;
        this.f23788t = localStore;
        this.f23789u = obj;
        this.f23790v = obj2;
    }

    @Override // com.google.firebase.firestore.util.Supplier
    public final Object get() {
        switch (this.f23787s) {
            case 0:
                return this.f23788t.lambda$applyRemoteEvent$6((RemoteEvent) this.f23789u, (SnapshotVersion) this.f23790v);
            default:
                return this.f23788t.lambda$applyBundledDocuments$11((ImmutableSortedMap) this.f23789u, (TargetData) this.f23790v);
        }
    }
}
