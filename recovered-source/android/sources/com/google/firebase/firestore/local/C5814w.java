package com.google.firebase.firestore.local;

import android.database.Cursor;
import com.google.firebase.firestore.util.Consumer;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.google.firebase.firestore.local.w */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5814w implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f23821a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ArrayList f23822b;

    public /* synthetic */ C5814w(ArrayList arrayList, int i2) {
        this.f23821a = i2;
        this.f23822b = arrayList;
    }

    @Override // com.google.firebase.firestore.util.Consumer
    public final void accept(Object obj) {
        switch (this.f23821a) {
            case 0:
                SQLiteIndexManager.lambda$getCollectionParents$3(this.f23822b, (Cursor) obj);
                break;
            case 1:
                SQLiteIndexManager.lambda$getDocumentsMatchingTarget$7(this.f23822b, (Cursor) obj);
                break;
            case 2:
                SQLiteMutationQueue.lambda$performConsistencyCheck$11(this.f23822b, (Cursor) obj);
                break;
            default:
                SQLiteMutationQueue.lambda$loadNextBatchIdAcrossAllUsers$1(this.f23822b, (Cursor) obj);
                break;
        }
    }
}
