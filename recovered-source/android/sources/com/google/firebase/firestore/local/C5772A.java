package com.google.firebase.firestore.local;

import android.database.Cursor;
import com.google.firebase.firestore.util.Function;

/* JADX INFO: renamed from: com.google.firebase.firestore.local.A */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5772A implements Function {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f23712a;

    public /* synthetic */ C5772A(int i2) {
        this.f23712a = i2;
    }

    @Override // com.google.firebase.firestore.util.Function
    public final Object apply(Object obj) {
        Cursor cursor = (Cursor) obj;
        switch (this.f23712a) {
            case 0:
                return SQLiteLruReferenceDelegate.lambda$getSequenceNumberCount$0(cursor);
            case 1:
                return SQLiteMutationQueue.lambda$getHighestUnacknowledgedBatchId$5(cursor);
            case 2:
                return SQLiteSchema.lambda$ensureSequenceNumbers$7(cursor);
            case 3:
                return SQLiteGlobalsCache.lambda$get$0(cursor);
            case 4:
                return SQLitePersistence.lambda$getPageCount$1(cursor);
            default:
                return SQLitePersistence.lambda$getPageSize$0(cursor);
        }
    }
}
