package com.google.firebase.firestore.local;

import android.database.Cursor;
import com.google.firebase.firestore.RealtimePipeline;
import com.google.firebase.firestore.core.Query;
import com.google.firebase.firestore.model.Document;
import com.google.firebase.firestore.util.Function;

/* JADX INFO: renamed from: com.google.firebase.firestore.local.q */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5808q implements Function {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f23798a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f23799b;

    public /* synthetic */ C5808q(Object obj, int i2) {
        this.f23798a = i2;
        this.f23799b = obj;
    }

    @Override // com.google.firebase.firestore.util.Function
    public final Object apply(Object obj) {
        switch (this.f23798a) {
            case 0:
                return SQLiteBundleCache.lambda$getBundleMetadata$0((String) this.f23799b, (Cursor) obj);
            case 1:
                return ((SQLiteMutationQueue) this.f23799b).lambda$getNextMutationBatchAfterBatchId$4((Cursor) obj);
            case 2:
                return Boolean.valueOf(((Query) this.f23799b).matches((Document) obj));
            case 3:
                return Boolean.valueOf(((RealtimePipeline) this.f23799b).matches$com_google_firebase_firebase_firestore((Document) obj));
            default:
                return ((SQLiteDocumentOverlayCache) this.f23799b).lambda$getOverlay$0((Cursor) obj);
        }
    }
}
