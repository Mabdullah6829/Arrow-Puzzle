package com.google.firebase.firestore.local;

import android.database.Cursor;
import com.google.firebase.firestore.util.Consumer;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: renamed from: com.google.firebase.firestore.local.p */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5807p implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f23796a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f23797b;

    public /* synthetic */ C5807p(Object obj, int i2) {
        this.f23796a = i2;
        this.f23797b = obj;
    }

    @Override // com.google.firebase.firestore.util.Consumer
    public final void accept(Object obj) {
        switch (this.f23796a) {
            case 0:
                MemoryLruReferenceDelegate.lambda$getSequenceNumberCount$0((long[]) this.f23797b, (Long) obj);
                break;
            case 1:
                SQLiteIndexManager.lambda$start$1((HashMap) this.f23797b, (Cursor) obj);
                break;
            case 2:
                SQLiteLruReferenceDelegate.lambda$forEachOrphanedDocumentSequenceNumber$1((Consumer) this.f23797b, (Cursor) obj);
                break;
            case 3:
                SQLiteTargetCache.lambda$getMatchingKeysForTargetId$4((SQLiteTargetCache.DocumentKeysHolder) this.f23797b, (Cursor) obj);
                break;
            case 4:
                ((SQLiteTargetCache) this.f23797b).lambda$start$0((Cursor) obj);
                break;
            case 5:
                SQLiteOverlayMigrationManager.lambda$hasPendingOverlayMigration$2((Boolean[]) this.f23797b, (Cursor) obj);
                break;
            default:
                SQLiteOverlayMigrationManager.lambda$getAllUserIds$1((HashSet) this.f23797b, (Cursor) obj);
                break;
        }
    }
}
