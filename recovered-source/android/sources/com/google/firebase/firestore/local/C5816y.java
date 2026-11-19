package com.google.firebase.firestore.local;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.google.firebase.firestore.model.ResourcePath;
import com.google.firebase.firestore.util.Consumer;
import java.util.HashMap;

/* JADX INFO: renamed from: com.google.firebase.firestore.local.y */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5816y implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f23827a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f23828b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f23829c;

    public /* synthetic */ C5816y(int i2, Object obj, Object obj2) {
        this.f23827a = i2;
        this.f23828b = obj;
        this.f23829c = obj2;
    }

    @Override // com.google.firebase.firestore.util.Consumer
    public final void accept(Object obj) {
        switch (this.f23827a) {
            case 0:
                ((SQLiteIndexManager) this.f23828b).lambda$start$2((HashMap) this.f23829c, (Cursor) obj);
                break;
            case 1:
                SQLiteSchema.lambda$ensurePathLength$14((boolean[]) this.f23828b, (SQLiteStatement) this.f23829c, (Cursor) obj);
                break;
            case 2:
                SQLiteSchema.lambda$createV8CollectionParentsIndex$10((MemoryIndexManager.MemoryCollectionParentIndex) this.f23828b, (SQLiteStatement) this.f23829c, (ResourcePath) obj);
                break;
            case 3:
                ((SQLiteSchema) this.f23828b).lambda$removeAcknowledgedMutations$1((String) this.f23829c, (Cursor) obj);
                break;
            default:
                ((SQLiteTargetCache) this.f23828b).lambda$forEachTarget$1((Consumer) this.f23829c, (Cursor) obj);
                break;
        }
    }
}
