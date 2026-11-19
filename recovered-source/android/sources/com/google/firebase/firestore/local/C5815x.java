package com.google.firebase.firestore.local;

import android.database.Cursor;
import android.util.SparseArray;
import com.google.firebase.firestore.core.TargetOrPipeline;
import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.model.FieldIndex;
import com.google.firebase.firestore.util.BackgroundQueue;
import com.google.firebase.firestore.util.Consumer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.TreeSet;

/* JADX INFO: renamed from: com.google.firebase.firestore.local.x */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5815x implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f23823a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f23824b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f23825c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f23826d;

    public /* synthetic */ C5815x(Object obj, Object obj2, Object obj3, int i2) {
        this.f23823a = i2;
        this.f23824b = obj;
        this.f23825c = obj2;
        this.f23826d = obj3;
    }

    @Override // com.google.firebase.firestore.util.Consumer
    public final void accept(Object obj) {
        switch (this.f23823a) {
            case 0:
                SQLiteIndexManager.lambda$getExistingIndexEntries$6((TreeSet) this.f23824b, (FieldIndex) this.f23825c, (DocumentKey) this.f23826d, (Cursor) obj);
                break;
            case 1:
                ((SQLiteMutationQueue) this.f23824b).lambda$getAllMutationBatchesAffectingDocumentKeys$8((HashSet) this.f23825c, (ArrayList) this.f23826d, (Cursor) obj);
                break;
            case 2:
                ((SQLiteRemoteDocumentCache) this.f23824b).lambda$getAll$0((BackgroundQueue) this.f23825c, (HashMap) this.f23826d, (Cursor) obj);
                break;
            case 3:
                ((SQLiteTargetCache) this.f23824b).lambda$removeQueries$2((SparseArray) this.f23825c, (int[]) this.f23826d, (Cursor) obj);
                break;
            case 4:
                ((SQLiteTargetCache) this.f23824b).lambda$getTargetData$3((TargetOrPipeline) this.f23825c, (SQLiteTargetCache.TargetDataHolder) this.f23826d, (Cursor) obj);
                break;
            default:
                ((SQLiteDocumentOverlayCache) this.f23824b).lambda$processSingleCollection$1((BackgroundQueue) this.f23825c, (Map) this.f23826d, (Cursor) obj);
                break;
        }
    }
}
