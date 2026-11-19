package com.google.firebase.firestore;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

/* JADX INFO: renamed from: com.google.firebase.firestore.n */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5819n implements Continuation {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ int f23837s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ Object f23838t;

    public /* synthetic */ C5819n(Object obj, int i2) {
        this.f23837s = i2;
        this.f23838t = obj;
    }

    @Override // com.google.android.gms.tasks.Continuation
    /* JADX INFO: renamed from: a */
    public final Object mo170a(Task task) {
        switch (this.f23837s) {
            case 0:
                return ((FirebaseFirestore) this.f23838t).lambda$getNamedQuery$8(task);
            case 1:
                return ((Query) this.f23838t).lambda$get$1(task);
            default:
                return ((Transaction) this.f23838t).lambda$getAsync$0(task);
        }
    }
}
