package com.google.firebase.firestore.local;

import android.database.Cursor;
import com.google.firebase.firestore.util.Consumer;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.google.firebase.firestore.local.B */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5773B implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f23713a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ SQLiteMutationQueue f23714b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ArrayList f23715c;

    public /* synthetic */ C5773B(SQLiteMutationQueue sQLiteMutationQueue, ArrayList arrayList, int i2) {
        this.f23713a = i2;
        this.f23714b = sQLiteMutationQueue;
        this.f23715c = arrayList;
    }

    @Override // com.google.firebase.firestore.util.Consumer
    public final void accept(Object obj) {
        switch (this.f23713a) {
            case 0:
                this.f23714b.lambda$getAllMutationBatchesAffectingDocumentKey$7(this.f23715c, (Cursor) obj);
                break;
            default:
                this.f23714b.lambda$getAllMutationBatches$6(this.f23715c, (Cursor) obj);
                break;
        }
    }
}
