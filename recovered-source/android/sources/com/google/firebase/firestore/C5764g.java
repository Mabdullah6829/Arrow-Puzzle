package com.google.firebase.firestore;

import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.firestore.core.ViewSnapshot;

/* JADX INFO: renamed from: com.google.firebase.firestore.g */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5764g implements EventListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f23695a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f23696b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f23697c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f23698d;

    public /* synthetic */ C5764g(Object obj, Object obj2, Object obj3, int i2) {
        this.f23695a = i2;
        this.f23696b = obj;
        this.f23697c = obj2;
        this.f23698d = obj3;
    }

    @Override // com.google.firebase.firestore.EventListener
    public final void onEvent(Object obj, FirebaseFirestoreException firebaseFirestoreException) {
        switch (this.f23695a) {
            case 0:
                DocumentReference.lambda$getViaSnapshotListener$5((TaskCompletionSource) this.f23696b, (TaskCompletionSource) this.f23697c, (Source) this.f23698d, (DocumentSnapshot) obj, firebaseFirestoreException);
                break;
            case 1:
                Query.lambda$getViaSnapshotListener$2((TaskCompletionSource) this.f23696b, (TaskCompletionSource) this.f23697c, (Source) this.f23698d, (QuerySnapshot) obj, firebaseFirestoreException);
                break;
            default:
                RealtimePipeline.addSnapshotListener$lambda$1((EventListener) this.f23696b, (RealtimePipeline) this.f23697c, (RealtimePipeline.ListenOptions) this.f23698d, (ViewSnapshot) obj, firebaseFirestoreException);
                break;
        }
    }
}
