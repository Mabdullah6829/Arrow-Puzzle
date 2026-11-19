package com.google.firebase.firestore.local;

import com.google.firebase.firestore.model.FieldIndex;
import com.google.firebase.firestore.model.mutation.MutationBatch;
import java.util.Comparator;

/* JADX INFO: renamed from: com.google.firebase.firestore.local.a */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5792a implements Comparator {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ int f23756s;

    public /* synthetic */ C5792a(int i2) {
        this.f23756s = i2;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f23756s) {
            case 0:
                return DocumentReference.lambda$static$0((DocumentReference) obj, (DocumentReference) obj2);
            case 1:
                return DocumentReference.lambda$static$1((DocumentReference) obj, (DocumentReference) obj2);
            case 2:
                return LruGarbageCollector.RollingSequenceNumberBuffer.lambda$static$0((Long) obj, (Long) obj2);
            case 3:
                return SQLiteIndexManager.lambda$new$0((FieldIndex) obj, (FieldIndex) obj2);
            case 4:
                return SQLiteMutationQueue.lambda$getAllMutationBatchesAffectingDocumentKeys$9((MutationBatch) obj, (MutationBatch) obj2);
            default:
                return ((Integer) obj).compareTo((Integer) obj2);
        }
    }
}
