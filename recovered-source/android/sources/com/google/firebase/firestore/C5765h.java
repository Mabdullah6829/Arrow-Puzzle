package com.google.firebase.firestore;

import com.google.firebase.firestore.core.AsyncEventListener;
import com.google.firebase.firestore.core.FirestoreClient;
import com.google.firebase.firestore.core.QueryListener;

/* JADX INFO: renamed from: com.google.firebase.firestore.h */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5765h implements ListenerRegistration {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f23699a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AsyncEventListener f23700b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ FirestoreClient f23701c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ QueryListener f23702d;

    public /* synthetic */ C5765h(AsyncEventListener asyncEventListener, FirestoreClient firestoreClient, QueryListener queryListener, int i2) {
        this.f23699a = i2;
        this.f23700b = asyncEventListener;
        this.f23701c = firestoreClient;
        this.f23702d = queryListener;
    }

    @Override // com.google.firebase.firestore.ListenerRegistration
    public final void remove() {
        switch (this.f23699a) {
            case 0:
                DocumentReference.lambda$addSnapshotListenerInternal$7(this.f23700b, this.f23701c, this.f23702d);
                break;
            case 1:
                Query.lambda$addSnapshotListenerInternal$4(this.f23700b, this.f23701c, this.f23702d);
                break;
            default:
                RealtimePipeline.addSnapshotListener$lambda$3$lambda$2(this.f23700b, this.f23701c, this.f23702d);
                break;
        }
    }
}
