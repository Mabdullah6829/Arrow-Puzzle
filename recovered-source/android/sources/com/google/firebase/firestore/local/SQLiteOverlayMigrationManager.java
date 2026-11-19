package com.google.firebase.firestore.local;

import android.database.Cursor;
import androidx.annotation.VisibleForTesting;
import com.google.firebase.firestore.auth.User;
import com.google.firebase.firestore.model.mutation.MutationBatch;
import com.google.firebase.firestore.util.Assert;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class SQLiteOverlayMigrationManager implements OverlayMigrationManager {

    /* JADX INFO: renamed from: db */
    private final SQLitePersistence f23749db;

    public SQLiteOverlayMigrationManager(SQLitePersistence sQLitePersistence) {
        this.f23749db = sQLitePersistence;
    }

    private void buildOverlays() {
        this.f23749db.runTransaction("build overlays", new RunnableC5794c(this, 2));
    }

    private Set<String> getAllUserIds() {
        HashSet hashSet = new HashSet();
        this.f23749db.query("SELECT DISTINCT uid FROM mutation_queues").forEach(new C5807p(hashSet, 6));
        return hashSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$buildOverlays$0() {
        if (hasPendingOverlayMigration()) {
            Set<String> allUserIds = getAllUserIds();
            RemoteDocumentCache remoteDocumentCache = this.f23749db.getRemoteDocumentCache();
            Iterator<String> it = allUserIds.iterator();
            while (it.hasNext()) {
                User user = new User(it.next());
                SQLitePersistence sQLitePersistence = this.f23749db;
                MutationQueue mutationQueue = sQLitePersistence.getMutationQueue(user, sQLitePersistence.getIndexManager(user));
                HashSet hashSet = new HashSet();
                Iterator<MutationBatch> it2 = mutationQueue.getAllMutationBatches().iterator();
                while (it2.hasNext()) {
                    hashSet.addAll(it2.next().getKeys());
                }
                new LocalDocumentsView(remoteDocumentCache, mutationQueue, this.f23749db.getDocumentOverlayCache(user), this.f23749db.getIndexManager(user)).recalculateAndSaveOverlays(hashSet);
            }
            removePendingOverlayMigrations();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$getAllUserIds$1(Set set, Cursor cursor) {
        set.add(cursor.getString(0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$hasPendingOverlayMigration$2(Boolean[] boolArr, Cursor cursor) {
        try {
            if (Persistence.DATA_MIGRATION_BUILD_OVERLAYS.equals(cursor.getString(0))) {
                boolArr[0] = Boolean.TRUE;
            }
        } catch (IllegalArgumentException e) {
            throw Assert.fail("SQLitePersistence.DataMigration failed to parse: %s", e);
        }
    }

    private void removePendingOverlayMigrations() {
        this.f23749db.execute("DELETE FROM data_migrations WHERE migration_name = ?", Persistence.DATA_MIGRATION_BUILD_OVERLAYS);
    }

    @VisibleForTesting
    public boolean hasPendingOverlayMigration() {
        Boolean[] boolArr = {Boolean.FALSE};
        this.f23749db.query("SELECT migration_name FROM data_migrations").forEach(new C5807p(boolArr, 5));
        return boolArr[0].booleanValue();
    }

    @Override // com.google.firebase.firestore.local.OverlayMigrationManager
    public void run() {
        buildOverlays();
    }
}
