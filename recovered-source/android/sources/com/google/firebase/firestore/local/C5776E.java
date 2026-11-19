package com.google.firebase.firestore.local;

import android.database.Cursor;
import com.google.firebase.firestore.util.Consumer;

/* JADX INFO: renamed from: com.google.firebase.firestore.local.E */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5776E implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f23721a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ SQLiteMutationQueue f23722b;

    public /* synthetic */ C5776E(SQLiteMutationQueue sQLiteMutationQueue, int i2) {
        this.f23721a = i2;
        this.f23722b = sQLiteMutationQueue;
    }

    @Override // com.google.firebase.firestore.util.Consumer
    public final void accept(Object obj) {
        switch (this.f23721a) {
            case 0:
                this.f23722b.lambda$start$0((Cursor) obj);
                break;
            default:
                this.f23722b.lambda$loadNextBatchIdAcrossAllUsers$2((Cursor) obj);
                break;
        }
    }
}
