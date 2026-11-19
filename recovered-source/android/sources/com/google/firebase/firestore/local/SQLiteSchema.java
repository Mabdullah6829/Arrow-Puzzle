package com.google.firebase.firestore.local;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import android.text.TextUtils;
import androidx.annotation.VisibleForTesting;
import androidx.datastore.preferences.protobuf.AbstractC1456a;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.firestore.model.ResourcePath;
import com.google.firebase.firestore.proto.Target;
import com.google.firebase.firestore.util.Assert;
import com.google.firebase.firestore.util.Consumer;
import com.google.firebase.firestore.util.Logger;
import com.google.protobuf.InvalidProtocolBufferException;
import java.util.ArrayList;
import java.util.List;
import p011H.AbstractC0271e0;

/* JADX INFO: loaded from: classes2.dex */
class SQLiteSchema {

    @VisibleForTesting
    static final int MIGRATION_BATCH_SIZE = 100;
    static final int VERSION = 18;

    /* JADX INFO: renamed from: db */
    private final SQLiteDatabase f23754db;
    private final LocalSerializer serializer;

    public SQLiteSchema(SQLiteDatabase sQLiteDatabase, LocalSerializer localSerializer) {
        this.f23754db = sQLiteDatabase;
        this.serializer = localSerializer;
    }

    private void addDocumentType() {
        if (tableContainsColumn("remote_documents", "document_type")) {
            return;
        }
        this.f23754db.execSQL("ALTER TABLE remote_documents ADD COLUMN document_type INTEGER");
    }

    private void addPathLength() {
        if (tableContainsColumn("remote_documents", "path_length")) {
            return;
        }
        this.f23754db.execSQL("ALTER TABLE remote_documents ADD COLUMN path_length INTEGER");
    }

    private void addPendingDataMigration(String str) {
        this.f23754db.execSQL("INSERT OR IGNORE INTO data_migrations (migration_name) VALUES (?)", new String[]{str});
    }

    private void addReadTime() {
        this.f23754db.execSQL("ALTER TABLE remote_documents ADD COLUMN read_time_seconds INTEGER");
        this.f23754db.execSQL("ALTER TABLE remote_documents ADD COLUMN read_time_nanos INTEGER");
    }

    private void addSequenceNumber() {
        if (tableContainsColumn("target_documents", "sequence_number")) {
            return;
        }
        this.f23754db.execSQL("ALTER TABLE target_documents ADD COLUMN sequence_number INTEGER");
    }

    private void addTargetCount() {
        if (!tableContainsColumn("target_globals", "target_count")) {
            this.f23754db.execSQL("ALTER TABLE target_globals ADD COLUMN target_count INTEGER");
        }
        long jQueryNumEntries = DatabaseUtils.queryNumEntries(this.f23754db, "targets");
        ContentValues contentValues = new ContentValues();
        contentValues.put("target_count", Long.valueOf(jQueryNumEntries));
        this.f23754db.update("target_globals", contentValues, null, null);
    }

    private void createBundleCache() {
        ifTablesDontExist(new String[]{"bundles", "named_queries"}, new RunnableC5779H(this, 1));
    }

    private void createDataMigrationTable() {
        ifTablesDontExist(new String[]{"data_migrations"}, new RunnableC5779H(this, 6));
    }

    private void createFieldIndex() {
        ifTablesDontExist(new String[]{"index_configuration", "index_state", "index_entries"}, new RunnableC5779H(this, 4));
    }

    private void createGlobalsTable() {
        ifTablesDontExist(new String[]{"globals"}, new RunnableC5779H(this, 7));
    }

    private void createOverlays() {
        ifTablesDontExist(new String[]{"document_overlays"}, new RunnableC5779H(this, 2));
    }

    private void createV1MutationQueue() {
        ifTablesDontExist(new String[]{"mutation_queues", "mutations", "document_mutations"}, new RunnableC5779H(this, 3));
    }

    private void createV1RemoteDocumentCache() {
        ifTablesDontExist(new String[]{"remote_documents"}, new RunnableC5779H(this, 8));
    }

    private void createV1TargetCache() {
        ifTablesDontExist(new String[]{"targets", "target_globals", "target_documents"}, new RunnableC5779H(this, 5));
    }

    private void createV8CollectionParentsIndex() {
        ifTablesDontExist(new String[]{"collection_parents"}, new RunnableC5779H(this, 0));
        final C5816y c5816y = new C5816y(2, new MemoryIndexManager.MemoryCollectionParentIndex(), this.f23754db.compileStatement("INSERT OR REPLACE INTO collection_parents (collection_id, parent) VALUES (?, ?)"));
        final int i2 = 0;
        new SQLitePersistence.Query(this.f23754db, "SELECT path FROM remote_documents").forEach(new Consumer() { // from class: com.google.firebase.firestore.local.K
            @Override // com.google.firebase.firestore.util.Consumer
            public final void accept(Object obj) {
                switch (i2) {
                    case 0:
                        SQLiteSchema.lambda$createV8CollectionParentsIndex$11(c5816y, (Cursor) obj);
                        break;
                    default:
                        SQLiteSchema.lambda$createV8CollectionParentsIndex$12(c5816y, (Cursor) obj);
                        break;
                }
            }
        });
        final int i3 = 1;
        new SQLitePersistence.Query(this.f23754db, "SELECT path FROM document_mutations").forEach(new Consumer() { // from class: com.google.firebase.firestore.local.K
            @Override // com.google.firebase.firestore.util.Consumer
            public final void accept(Object obj) {
                switch (i3) {
                    case 0:
                        SQLiteSchema.lambda$createV8CollectionParentsIndex$11(c5816y, (Cursor) obj);
                        break;
                    default:
                        SQLiteSchema.lambda$createV8CollectionParentsIndex$12(c5816y, (Cursor) obj);
                        break;
                }
            }
        });
    }

    private void dropLastLimboFreeSnapshotVersion() {
        new SQLitePersistence.Query(this.f23754db, "SELECT target_id, target_proto FROM targets").forEach(new C5780I(this, 1));
    }

    private void dropV1TargetCache() {
        if (tableExists("targets")) {
            this.f23754db.execSQL("DROP TABLE targets");
        }
        if (tableExists("target_globals")) {
            this.f23754db.execSQL("DROP TABLE target_globals");
        }
        if (tableExists("target_documents")) {
            this.f23754db.execSQL("DROP TABLE target_documents");
        }
    }

    private void ensurePathLength() {
        boolean[] zArr;
        SQLitePersistence.Query queryBinding = new SQLitePersistence.Query(this.f23754db, "SELECT path FROM remote_documents WHERE path_length IS NULL LIMIT ?").binding(100);
        SQLiteStatement sQLiteStatementCompileStatement = this.f23754db.compileStatement("UPDATE remote_documents SET path_length = ? WHERE path = ?");
        do {
            zArr = new boolean[]{false};
            queryBinding.forEach(new C5816y(1, zArr, sQLiteStatementCompileStatement));
        } while (zArr[0]);
    }

    private void ensureReadTime() {
        this.f23754db.execSQL("UPDATE remote_documents SET read_time_seconds = 0, read_time_nanos = 0 WHERE read_time_seconds IS NULL");
    }

    private void ensureSequenceNumbers() {
        final boolean[] zArr;
        Long l2 = (Long) new SQLitePersistence.Query(this.f23754db, "SELECT highest_listen_sequence_number FROM target_globals LIMIT 1").firstValue(new C5772A(2));
        Assert.hardAssert(l2 != null, "Missing highest sequence number", new Object[0]);
        final long jLongValue = l2.longValue();
        final SQLiteStatement sQLiteStatementCompileStatement = this.f23754db.compileStatement("INSERT INTO target_documents (target_id, path, sequence_number) VALUES (0, ?, ?)");
        SQLitePersistence.Query queryBinding = new SQLitePersistence.Query(this.f23754db, "SELECT RD.path FROM remote_documents AS RD WHERE NOT EXISTS (SELECT TD.path FROM target_documents AS TD WHERE RD.path = TD.path AND TD.target_id = 0) LIMIT ?").binding(100);
        do {
            zArr = new boolean[]{false};
            queryBinding.forEach(new Consumer() { // from class: com.google.firebase.firestore.local.J
                @Override // com.google.firebase.firestore.util.Consumer
                public final void accept(Object obj) {
                    SQLiteSchema.lambda$ensureSequenceNumbers$8(zArr, sQLiteStatementCompileStatement, jLongValue, (Cursor) obj);
                }
            });
        } while (zArr[0]);
    }

    private void ensureTargetGlobal() {
        if (DatabaseUtils.queryNumEntries(this.f23754db, "target_globals") == 1) {
            return;
        }
        this.f23754db.execSQL("INSERT INTO target_globals (highest_target_id, highest_listen_sequence_number, last_remote_snapshot_version_seconds, last_remote_snapshot_version_nanos) VALUES (?, ?, ?, ?)", new String[]{"0", "0", "0", "0"});
    }

    private boolean hasReadTime() {
        boolean zTableContainsColumn = tableContainsColumn("remote_documents", "read_time_seconds");
        boolean zTableContainsColumn2 = tableContainsColumn("remote_documents", "read_time_nanos");
        Assert.hardAssert(zTableContainsColumn == zTableContainsColumn2, "Table contained just one of read_time_seconds or read_time_nanos", new Object[0]);
        return zTableContainsColumn && zTableContainsColumn2;
    }

    private void ifTablesDontExist(String[] strArr, Runnable runnable) {
        String strM403k = AbstractC0271e0.m403k(new StringBuilder("["), TextUtils.join(", ", strArr), "]");
        boolean z = false;
        for (int i2 = 0; i2 < strArr.length; i2++) {
            String str = strArr[i2];
            boolean zTableExists = tableExists(str);
            if (i2 == 0) {
                z = zTableExists;
            } else if (zTableExists != z) {
                String strM399g = AbstractC0271e0.m399g("Expected all of ", strM403k, " to either exist or not, but ");
                throw new IllegalStateException(z ? AbstractC1456a.m2451r(AbstractC0271e0.m408p(strM399g), strArr[0], " exists and ", str, " does not") : AbstractC1456a.m2451r(AbstractC0271e0.m408p(strM399g), strArr[0], " does not exist and ", str, " does"));
            }
        }
        if (z) {
            Logger.debug("SQLiteSchema", AbstractC0271e0.m399g("Skipping migration because all of ", strM403k, " already exist"), new Object[0]);
        } else {
            runnable.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createBundleCache$15() {
        this.f23754db.execSQL("CREATE TABLE bundles (bundle_id TEXT PRIMARY KEY, create_time_seconds INTEGER, create_time_nanos INTEGER, schema_version INTEGER, total_documents INTEGER, total_bytes INTEGER)");
        this.f23754db.execSQL("CREATE TABLE named_queries (name TEXT PRIMARY KEY, read_time_seconds INTEGER, read_time_nanos INTEGER, bundled_query_proto BLOB)");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createDataMigrationTable$17() {
        this.f23754db.execSQL("CREATE TABLE data_migrations (migration_name TEXT, PRIMARY KEY (migration_name))");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createFieldIndex$5() {
        this.f23754db.execSQL("CREATE TABLE index_configuration (index_id INTEGER, collection_group TEXT, index_proto BLOB, PRIMARY KEY (index_id))");
        this.f23754db.execSQL("CREATE TABLE index_state (index_id INTEGER, uid TEXT, sequence_number INTEGER, read_time_seconds INTEGER, read_time_nanos INTEGER, document_key TEXT, largest_batch_id INTEGER, PRIMARY KEY (index_id, uid))");
        this.f23754db.execSQL("CREATE TABLE index_entries (index_id INTEGER, uid TEXT, array_value BLOB, directional_value BLOB, document_key TEXT, PRIMARY KEY (index_id, uid, array_value, directional_value, document_key))");
        this.f23754db.execSQL("CREATE INDEX read_time ON remote_documents(read_time_seconds, read_time_nanos)");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createGlobalsTable$18() {
        this.f23754db.execSQL("CREATE TABLE globals (name TEXT PRIMARY KEY, value BLOB)");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createOverlays$16() {
        this.f23754db.execSQL("CREATE TABLE document_overlays (uid TEXT, collection_path TEXT, document_id TEXT, collection_group TEXT, largest_batch_id INTEGER, overlay_mutation BLOB, PRIMARY KEY (uid, collection_path, document_id))");
        this.f23754db.execSQL("CREATE INDEX batch_id_overlay ON document_overlays (uid, largest_batch_id)");
        this.f23754db.execSQL("CREATE INDEX collection_group_overlay ON document_overlays (uid, collection_group)");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createV1MutationQueue$0() {
        this.f23754db.execSQL("CREATE TABLE mutation_queues (uid TEXT PRIMARY KEY, last_acknowledged_batch_id INTEGER, last_stream_token BLOB)");
        this.f23754db.execSQL("CREATE TABLE mutations (uid TEXT, batch_id INTEGER, mutations BLOB, PRIMARY KEY (uid, batch_id))");
        this.f23754db.execSQL("CREATE TABLE document_mutations (uid TEXT, path TEXT, batch_id INTEGER, PRIMARY KEY (uid, path, batch_id))");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createV1RemoteDocumentCache$4() {
        this.f23754db.execSQL("CREATE TABLE remote_documents (path TEXT PRIMARY KEY, contents BLOB)");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createV1TargetCache$3() {
        this.f23754db.execSQL("CREATE TABLE targets (target_id INTEGER PRIMARY KEY, canonical_id TEXT, snapshot_version_seconds INTEGER, snapshot_version_nanos INTEGER, resume_token BLOB, last_listen_sequence_number INTEGER,target_proto BLOB)");
        this.f23754db.execSQL("CREATE INDEX query_targets ON targets (canonical_id, target_id)");
        this.f23754db.execSQL("CREATE TABLE target_globals (highest_target_id INTEGER, highest_listen_sequence_number INTEGER, last_remote_snapshot_version_seconds INTEGER, last_remote_snapshot_version_nanos INTEGER)");
        this.f23754db.execSQL("CREATE TABLE target_documents (target_id INTEGER, path TEXT, PRIMARY KEY (target_id, path))");
        this.f23754db.execSQL("CREATE INDEX document_targets ON target_documents (path, target_id)");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$createV8CollectionParentsIndex$10(MemoryIndexManager.MemoryCollectionParentIndex memoryCollectionParentIndex, SQLiteStatement sQLiteStatement, ResourcePath resourcePath) {
        if (memoryCollectionParentIndex.add(resourcePath)) {
            String lastSegment = resourcePath.getLastSegment();
            ResourcePath resourcePathPopLast = resourcePath.popLast();
            sQLiteStatement.clearBindings();
            sQLiteStatement.bindString(1, lastSegment);
            sQLiteStatement.bindString(2, EncodedPath.encode(resourcePathPopLast));
            sQLiteStatement.execute();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$createV8CollectionParentsIndex$11(Consumer consumer, Cursor cursor) {
        consumer.accept(EncodedPath.decodeResourcePath(cursor.getString(0)).popLast());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$createV8CollectionParentsIndex$12(Consumer consumer, Cursor cursor) {
        consumer.accept(EncodedPath.decodeResourcePath(cursor.getString(0)).popLast());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createV8CollectionParentsIndex$9() {
        this.f23754db.execSQL("CREATE TABLE collection_parents (collection_id TEXT, parent TEXT, PRIMARY KEY(collection_id, parent))");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$dropLastLimboFreeSnapshotVersion$6(Cursor cursor) {
        int i2 = cursor.getInt(0);
        try {
            this.f23754db.execSQL("UPDATE targets SET target_proto = ? WHERE target_id = ?", new Object[]{((Target) ((Target.Builder) Target.parseFrom(cursor.getBlob(1)).m12349toBuilder()).clearLastLimboFreeSnapshotVersion().m12341build()).toByteArray(), Integer.valueOf(i2)});
        } catch (InvalidProtocolBufferException unused) {
            throw Assert.fail("Failed to decode Query data for target %s", Integer.valueOf(i2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$ensurePathLength$14(boolean[] zArr, SQLiteStatement sQLiteStatement, Cursor cursor) {
        zArr[0] = true;
        String string = cursor.getString(0);
        ResourcePath resourcePathDecodeResourcePath = EncodedPath.decodeResourcePath(string);
        sQLiteStatement.clearBindings();
        sQLiteStatement.bindLong(1, resourcePathDecodeResourcePath.length());
        sQLiteStatement.bindString(2, string);
        Assert.hardAssert(sQLiteStatement.executeUpdateDelete() != -1, "Failed to update document path", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Long lambda$ensureSequenceNumbers$7(Cursor cursor) {
        return Long.valueOf(cursor.getLong(0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$ensureSequenceNumbers$8(boolean[] zArr, SQLiteStatement sQLiteStatement, long j2, Cursor cursor) {
        zArr[0] = true;
        sQLiteStatement.clearBindings();
        sQLiteStatement.bindString(1, cursor.getString(0));
        sQLiteStatement.bindLong(2, j2);
        Assert.hardAssert(sQLiteStatement.executeInsert() != -1, "Failed to insert a sentinel row", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$removeAcknowledgedMutations$1(String str, Cursor cursor) {
        removeMutationBatch(str, cursor.getInt(0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$removeAcknowledgedMutations$2(Cursor cursor) {
        String string = cursor.getString(0);
        new SQLitePersistence.Query(this.f23754db, "SELECT batch_id FROM mutations WHERE uid = ? AND batch_id <= ?").binding(string, Long.valueOf(cursor.getLong(1))).forEach(new C5816y(3, this, string));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$rewriteCanonicalIds$13(Cursor cursor) {
        int i2 = cursor.getInt(0);
        try {
            this.f23754db.execSQL("UPDATE targets SET canonical_id  = ? WHERE target_id = ?", new Object[]{this.serializer.decodeTargetData(Target.parseFrom(cursor.getBlob(1))).getTarget().canonicalId(), Integer.valueOf(i2)});
        } catch (InvalidProtocolBufferException unused) {
            throw Assert.fail("Failed to decode Query data for target %s", Integer.valueOf(i2));
        }
    }

    private void removeAcknowledgedMutations() {
        new SQLitePersistence.Query(this.f23754db, "SELECT uid, last_acknowledged_batch_id FROM mutation_queues").forEach(new C5780I(this, 0));
    }

    private void removeMutationBatch(String str, int i2) {
        SQLiteStatement sQLiteStatementCompileStatement = this.f23754db.compileStatement("DELETE FROM mutations WHERE uid = ? AND batch_id = ?");
        sQLiteStatementCompileStatement.bindString(1, str);
        sQLiteStatementCompileStatement.bindLong(2, i2);
        Assert.hardAssert(sQLiteStatementCompileStatement.executeUpdateDelete() != 0, "Mutation batch (%s, %d) did not exist", str, Integer.valueOf(i2));
        this.f23754db.execSQL("DELETE FROM document_mutations WHERE uid = ? AND batch_id = ?", new Object[]{str, Integer.valueOf(i2)});
    }

    private void rewriteCanonicalIds() {
        new SQLitePersistence.Query(this.f23754db, "SELECT target_id, target_proto FROM targets").forEach(new C5780I(this, 2));
    }

    private boolean tableContainsColumn(String str, String str2) {
        return getTableColumns(str).indexOf(str2) != -1;
    }

    private boolean tableExists(String str) {
        return !new SQLitePersistence.Query(this.f23754db, "SELECT 1=1 FROM sqlite_master WHERE tbl_name = ?").binding(str).isEmpty();
    }

    @VisibleForTesting
    public List<String> getTableColumns(String str) {
        ArrayList arrayList = new ArrayList();
        Cursor cursorRawQuery = null;
        try {
            cursorRawQuery = this.f23754db.rawQuery("PRAGMA table_info(" + str + ")", null);
            int columnIndex = cursorRawQuery.getColumnIndex(AppMeasurementSdk.ConditionalUserProperty.NAME);
            while (cursorRawQuery.moveToNext()) {
                arrayList.add(cursorRawQuery.getString(columnIndex));
            }
            cursorRawQuery.close();
            return arrayList;
        } catch (Throwable th) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th;
        }
    }

    public void runSchemaUpgrades() {
        runSchemaUpgrades(0);
    }

    public void runSchemaUpgrades(int i2) {
        runSchemaUpgrades(i2, 18);
    }

    public void runSchemaUpgrades(int i2, int i3) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (i2 < 1 && i3 >= 1) {
            createV1MutationQueue();
            createV1TargetCache();
            createV1RemoteDocumentCache();
        }
        if (i2 < 3 && i3 >= 3 && i2 != 0) {
            dropV1TargetCache();
            createV1TargetCache();
        }
        if (i2 < 4 && i3 >= 4) {
            ensureTargetGlobal();
            addTargetCount();
        }
        if (i2 < 5 && i3 >= 5) {
            addSequenceNumber();
        }
        if (i2 < 6 && i3 >= 6) {
            removeAcknowledgedMutations();
        }
        if (i2 < 7 && i3 >= 7) {
            ensureSequenceNumbers();
        }
        if (i2 < 8 && i3 >= 8) {
            createV8CollectionParentsIndex();
        }
        if (i2 < 9 && i3 >= 9) {
            if (!hasReadTime()) {
                addReadTime();
            } else {
                dropLastLimboFreeSnapshotVersion();
            }
        }
        if (i2 == 9 && i3 >= 10) {
            dropLastLimboFreeSnapshotVersion();
        }
        if (i2 < 11 && i3 >= 11) {
            rewriteCanonicalIds();
        }
        if (i2 < 12 && i3 >= 12) {
            createBundleCache();
        }
        if (i2 < 13 && i3 >= 13) {
            addPathLength();
            ensurePathLength();
        }
        if (i2 < 14 && i3 >= 14) {
            createOverlays();
            createDataMigrationTable();
            addPendingDataMigration(Persistence.DATA_MIGRATION_BUILD_OVERLAYS);
        }
        if (i2 < 15 && i3 >= 15) {
            ensureReadTime();
        }
        if (i2 < 16 && i3 >= 16) {
            createFieldIndex();
        }
        if (i2 < 17 && i3 >= 17) {
            createGlobalsTable();
        }
        if (i2 < 18 && i3 >= 18) {
            addDocumentType();
        }
        Logger.debug("SQLiteSchema", "Migration from version %s to %s took %s milliseconds", Integer.valueOf(i2), Integer.valueOf(i3), Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
    }
}
