package com.google.firebase.firestore;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

/* JADX INFO: renamed from: com.google.firebase.firestore.c */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5743c implements Continuation {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ int f23655s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ DocumentReference f23656t;

    public /* synthetic */ C5743c(DocumentReference documentReference, int i2) {
        this.f23655s = i2;
        this.f23656t = documentReference;
    }

    @Override // com.google.android.gms.tasks.Continuation
    /* JADX INFO: renamed from: a */
    public final Object mo170a(Task task) {
        switch (this.f23655s) {
            case 0:
                return CollectionReference.lambda$add$0(this.f23656t, task);
            default:
                return this.f23656t.lambda$get$4(task);
        }
    }
}
