package com.google.firebase.firestore.local;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import com.google.firebase.Timestamp;
import com.google.firebase.database.collection.ImmutableSortedSet;
import com.google.firebase.firestore.core.TargetOrPipeline;
import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.model.SnapshotVersion;
import com.google.firebase.firestore.proto.Target;
import com.google.firebase.firestore.util.Assert;
import com.google.firebase.firestore.util.Consumer;
import com.google.protobuf.InvalidProtocolBufferException;

/* JADX INFO: loaded from: classes2.dex */
final class SQLiteTargetCache implements TargetCache {

    /* JADX INFO: renamed from: db */
    private final SQLitePersistence f23755db;
    private int highestTargetId;
    private long lastListenSequenceNumber;
    private SnapshotVersion lastRemoteSnapshotVersion = SnapshotVersion.NONE;
    private final LocalSerializer localSerializer;
    private long targetCount;

    public static class DocumentKeysHolder {
        ImmutableSortedSet<DocumentKey> keys;

        private DocumentKeysHolder() {
            this.keys = DocumentKey.emptyKeySet();
        }
    }

    public static class TargetDataHolder {
        TargetData targetData;

        private TargetDataHolder() {
        }
    }

    public SQLiteTargetCache(SQLitePersistence sQLitePersistence, LocalSerializer localSerializer) {
        this.f23755db = sQLitePersistence;
        this.localSerializer = localSerializer;
    }

    private TargetData decodeTargetData(byte[] bArr) {
        try {
            return this.localSerializer.decodeTargetData(Target.parseFrom(bArr));
        } catch (InvalidProtocolBufferException e) {
            throw Assert.fail("TargetData failed to parse: %s", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$forEachTarget$1(Consumer consumer, Cursor cursor) {
        consumer.accept(decodeTargetData(cursor.getBlob(0)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$getMatchingKeysForTargetId$4(DocumentKeysHolder documentKeysHolder, Cursor cursor) {
        documentKeysHolder.keys = documentKeysHolder.keys.insert(DocumentKey.fromPath(EncodedPath.decodeResourcePath(cursor.getString(0))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getTargetData$3(TargetOrPipeline targetOrPipeline, TargetDataHolder targetDataHolder, Cursor cursor) {
        TargetData targetDataDecodeTargetData = decodeTargetData(cursor.getBlob(0));
        if (targetOrPipeline.equals(targetDataDecodeTargetData.getTarget())) {
            targetDataHolder.targetData = targetDataDecodeTargetData;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$removeQueries$2(SparseArray sparseArray, int[] iArr, Cursor cursor) {
        int i2 = cursor.getInt(0);
        if (sparseArray.get(i2) == null) {
            removeTarget(i2);
            iArr[0] = iArr[0] + 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$start$0(Cursor cursor) {
        this.highestTargetId = cursor.getInt(0);
        this.lastListenSequenceNumber = cursor.getInt(1);
        this.lastRemoteSnapshotVersion = new SnapshotVersion(new Timestamp(cursor.getLong(2), cursor.getInt(3)));
        this.targetCount = cursor.getLong(4);
    }

    private void removeTarget(int i2) {
        removeMatchingKeysForTargetId(i2);
        this.f23755db.execute("DELETE FROM targets WHERE target_id = ?", Integer.valueOf(i2));
        this.targetCount--;
    }

    private void saveTargetData(TargetData targetData) {
        int targetId = targetData.getTargetId();
        String strCanonicalId = targetData.getTarget().canonicalId();
        Timestamp timestamp = targetData.getSnapshotVersion().getTimestamp();
        this.f23755db.execute("INSERT OR REPLACE INTO targets (target_id, canonical_id, snapshot_version_seconds, snapshot_version_nanos, resume_token, last_listen_sequence_number, target_proto) VALUES (?, ?, ?, ?, ?, ?, ?)", Integer.valueOf(targetId), strCanonicalId, Long.valueOf(timestamp.getSeconds()), Integer.valueOf(timestamp.getNanoseconds()), targetData.getResumeToken().m11897w(), Long.valueOf(targetData.getSequenceNumber()), this.localSerializer.encodeTargetData(targetData).toByteArray());
    }

    private boolean updateMetadata(TargetData targetData) {
        boolean z;
        if (targetData.getTargetId() > this.highestTargetId) {
            this.highestTargetId = targetData.getTargetId();
            z = true;
        } else {
            z = false;
        }
        if (targetData.getSequenceNumber() <= this.lastListenSequenceNumber) {
            return z;
        }
        this.lastListenSequenceNumber = targetData.getSequenceNumber();
        return true;
    }

    private void writeMetadata() {
        this.f23755db.execute("UPDATE target_globals SET highest_target_id = ?, highest_listen_sequence_number = ?, last_remote_snapshot_version_seconds = ?, last_remote_snapshot_version_nanos = ?, target_count = ?", Integer.valueOf(this.highestTargetId), Long.valueOf(this.lastListenSequenceNumber), Long.valueOf(this.lastRemoteSnapshotVersion.getTimestamp().getSeconds()), Integer.valueOf(this.lastRemoteSnapshotVersion.getTimestamp().getNanoseconds()), Long.valueOf(this.targetCount));
    }

    @Override // com.google.firebase.firestore.local.TargetCache
    public void addMatchingKeys(ImmutableSortedSet<DocumentKey> immutableSortedSet, int i2) {
        SQLiteStatement sQLiteStatementPrepare = this.f23755db.prepare("INSERT OR IGNORE INTO target_documents (target_id, path) VALUES (?, ?)");
        SQLiteLruReferenceDelegate referenceDelegate = this.f23755db.getReferenceDelegate();
        for (DocumentKey documentKey : immutableSortedSet) {
            this.f23755db.execute(sQLiteStatementPrepare, Integer.valueOf(i2), EncodedPath.encode(documentKey.getPath()));
            referenceDelegate.addReference(documentKey);
        }
    }

    @Override // com.google.firebase.firestore.local.TargetCache
    public void addTargetData(TargetData targetData) {
        saveTargetData(targetData);
        updateMetadata(targetData);
        this.targetCount++;
        writeMetadata();
    }

    @Override // com.google.firebase.firestore.local.TargetCache
    public boolean containsKey(DocumentKey documentKey) {
        return !this.f23755db.query("SELECT target_id FROM target_documents WHERE path = ? AND target_id != 0 LIMIT 1").binding(EncodedPath.encode(documentKey.getPath())).isEmpty();
    }

    @Override // com.google.firebase.firestore.local.TargetCache
    public void forEachTarget(Consumer<TargetData> consumer) {
        this.f23755db.query("SELECT target_proto FROM targets").forEach(new C5816y(4, this, consumer));
    }

    @Override // com.google.firebase.firestore.local.TargetCache
    public long getHighestListenSequenceNumber() {
        return this.lastListenSequenceNumber;
    }

    @Override // com.google.firebase.firestore.local.TargetCache
    public int getHighestTargetId() {
        return this.highestTargetId;
    }

    @Override // com.google.firebase.firestore.local.TargetCache
    public SnapshotVersion getLastRemoteSnapshotVersion() {
        return this.lastRemoteSnapshotVersion;
    }

    @Override // com.google.firebase.firestore.local.TargetCache
    public ImmutableSortedSet<DocumentKey> getMatchingKeysForTargetId(int i2) {
        DocumentKeysHolder documentKeysHolder = new DocumentKeysHolder();
        this.f23755db.query("SELECT path FROM target_documents WHERE target_id = ?").binding(Integer.valueOf(i2)).forEach(new C5807p(documentKeysHolder, 3));
        return documentKeysHolder.keys;
    }

    @Override // com.google.firebase.firestore.local.TargetCache
    public long getTargetCount() {
        return this.targetCount;
    }

    @Override // com.google.firebase.firestore.local.TargetCache
    @Nullable
    public TargetData getTargetData(TargetOrPipeline targetOrPipeline) {
        String strCanonicalId = targetOrPipeline.canonicalId();
        TargetDataHolder targetDataHolder = new TargetDataHolder();
        this.f23755db.query("SELECT target_proto FROM targets WHERE canonical_id = ?").binding(strCanonicalId).forEach(new C5815x(this, targetOrPipeline, targetDataHolder, 4));
        return targetDataHolder.targetData;
    }

    @Override // com.google.firebase.firestore.local.TargetCache
    public void removeMatchingKeys(ImmutableSortedSet<DocumentKey> immutableSortedSet, int i2) {
        SQLiteStatement sQLiteStatementPrepare = this.f23755db.prepare("DELETE FROM target_documents WHERE target_id = ? AND path = ?");
        SQLiteLruReferenceDelegate referenceDelegate = this.f23755db.getReferenceDelegate();
        for (DocumentKey documentKey : immutableSortedSet) {
            this.f23755db.execute(sQLiteStatementPrepare, Integer.valueOf(i2), EncodedPath.encode(documentKey.getPath()));
            referenceDelegate.removeReference(documentKey);
        }
    }

    @Override // com.google.firebase.firestore.local.TargetCache
    public void removeMatchingKeysForTargetId(int i2) {
        this.f23755db.execute("DELETE FROM target_documents WHERE target_id = ?", Integer.valueOf(i2));
    }

    public int removeQueries(long j2, SparseArray<?> sparseArray) {
        int[] iArr = new int[1];
        this.f23755db.query("SELECT target_id FROM targets WHERE last_listen_sequence_number <= ?").binding(Long.valueOf(j2)).forEach(new C5815x(this, sparseArray, iArr, 3));
        writeMetadata();
        return iArr[0];
    }

    @Override // com.google.firebase.firestore.local.TargetCache
    public void removeTargetData(TargetData targetData) {
        removeTarget(targetData.getTargetId());
        writeMetadata();
    }

    @Override // com.google.firebase.firestore.local.TargetCache
    public void setLastRemoteSnapshotVersion(SnapshotVersion snapshotVersion) {
        this.lastRemoteSnapshotVersion = snapshotVersion;
        writeMetadata();
    }

    public void start() {
        Assert.hardAssert(this.f23755db.query("SELECT highest_target_id, highest_listen_sequence_number, last_remote_snapshot_version_seconds, last_remote_snapshot_version_nanos, target_count FROM target_globals LIMIT 1").first(new C5807p(this, 4)) == 1, "Missing target_globals entry", new Object[0]);
    }

    @Override // com.google.firebase.firestore.local.TargetCache
    public void updateTargetData(TargetData targetData) {
        saveTargetData(targetData);
        if (updateMetadata(targetData)) {
            writeMetadata();
        }
    }
}
