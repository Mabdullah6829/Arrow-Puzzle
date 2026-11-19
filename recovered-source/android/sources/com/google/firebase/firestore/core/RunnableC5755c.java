package com.google.firebase.firestore.core;

import com.google.firebase.firestore.EventListener;

/* JADX INFO: renamed from: com.google.firebase.firestore.core.c */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC5755c implements Runnable {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ int f23671s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ FirestoreClient f23672t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ EventListener f23673u;

    public /* synthetic */ RunnableC5755c(FirestoreClient firestoreClient, EventListener eventListener, int i2) {
        this.f23671s = i2;
        this.f23672t = firestoreClient;
        this.f23673u = eventListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f23671s) {
            case 0:
                this.f23672t.lambda$addSnapshotsInSyncListener$19(this.f23673u);
                break;
            default:
                this.f23672t.lambda$removeSnapshotsInSyncListener$25(this.f23673u);
                break;
        }
    }
}
