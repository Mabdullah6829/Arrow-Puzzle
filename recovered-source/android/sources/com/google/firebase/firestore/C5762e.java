package com.google.firebase.firestore;

import com.google.firebase.firestore.core.ViewSnapshot;

/* JADX INFO: renamed from: com.google.firebase.firestore.e */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5762e implements EventListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f23687a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ EventListener f23688b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f23689c;

    public /* synthetic */ C5762e(Object obj, EventListener eventListener, int i2) {
        this.f23687a = i2;
        this.f23689c = obj;
        this.f23688b = eventListener;
    }

    @Override // com.google.firebase.firestore.EventListener
    public final void onEvent(Object obj, FirebaseFirestoreException firebaseFirestoreException) {
        switch (this.f23687a) {
            case 0:
                ((DocumentReference) this.f23689c).lambda$addSnapshotListenerInternal$6(this.f23688b, (ViewSnapshot) obj, firebaseFirestoreException);
                break;
            default:
                ((Query) this.f23689c).lambda$addSnapshotListenerInternal$3(this.f23688b, (ViewSnapshot) obj, firebaseFirestoreException);
                break;
        }
    }
}
