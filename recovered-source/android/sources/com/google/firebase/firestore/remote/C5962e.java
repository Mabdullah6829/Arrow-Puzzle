package com.google.firebase.firestore.remote;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.util.HashMap;
import p030R.C0567l0;

/* JADX INFO: renamed from: com.google.firebase.firestore.remote.e */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5962e implements Continuation {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ int f23938s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ Object f23939t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ Object f23940u;

    public /* synthetic */ C5962e(int i2, Object obj, Object obj2) {
        this.f23938s = i2;
        this.f23939t = obj;
        this.f23940u = obj2;
    }

    @Override // com.google.android.gms.tasks.Continuation
    /* JADX INFO: renamed from: a */
    public final Object mo170a(Task task) {
        switch (this.f23938s) {
            case 0:
                return ((Datastore) this.f23939t).lambda$runAggregateQuery$1((HashMap) this.f23940u, task);
            default:
                return ((GrpcCallProvider) this.f23939t).lambda$createClientCall$0((C0567l0) this.f23940u, task);
        }
    }
}
