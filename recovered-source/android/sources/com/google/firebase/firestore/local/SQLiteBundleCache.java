package com.google.firebase.firestore.local;

import android.database.Cursor;
import androidx.annotation.Nullable;
import com.google.firebase.Timestamp;
import com.google.firebase.firestore.bundle.BundleMetadata;
import com.google.firebase.firestore.bundle.NamedQuery;
import com.google.firebase.firestore.model.SnapshotVersion;
import com.google.firebase.firestore.util.Assert;
import com.google.protobuf.InvalidProtocolBufferException;
import p020M.C0335c;

/* JADX INFO: loaded from: classes2.dex */
class SQLiteBundleCache implements BundleCache {

    /* JADX INFO: renamed from: db */
    private final SQLitePersistence f23744db;
    private final LocalSerializer serializer;

    public SQLiteBundleCache(SQLitePersistence sQLitePersistence, LocalSerializer localSerializer) {
        this.f23744db = sQLitePersistence;
        this.serializer = localSerializer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ BundleMetadata lambda$getBundleMetadata$0(String str, Cursor cursor) {
        if (cursor == null) {
            return null;
        }
        return new BundleMetadata(str, cursor.getInt(0), new SnapshotVersion(new Timestamp(cursor.getLong(1), cursor.getInt(2))), cursor.getInt(3), cursor.getLong(4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ NamedQuery lambda$getNamedQuery$1(String str, Cursor cursor) {
        if (cursor == null) {
            return null;
        }
        try {
            return new NamedQuery(str, this.serializer.decodeBundledQuery(C0335c.m492l(cursor.getBlob(2))), new SnapshotVersion(new Timestamp(cursor.getLong(0), cursor.getInt(1))));
        } catch (InvalidProtocolBufferException e) {
            throw Assert.fail("NamedQuery failed to parse: %s", e);
        }
    }

    @Override // com.google.firebase.firestore.local.BundleCache
    @Nullable
    public BundleMetadata getBundleMetadata(String str) {
        return (BundleMetadata) this.f23744db.query("SELECT schema_version, create_time_seconds, create_time_nanos, total_documents,  total_bytes FROM bundles WHERE bundle_id = ?").binding(str).firstValue(new C5808q(str, 0));
    }

    @Override // com.google.firebase.firestore.local.BundleCache
    @Nullable
    public NamedQuery getNamedQuery(String str) {
        return (NamedQuery) this.f23744db.query("SELECT read_time_seconds, read_time_nanos, bundled_query_proto FROM named_queries WHERE name = ?").binding(str).firstValue(new C5809r(0, this, str));
    }

    @Override // com.google.firebase.firestore.local.BundleCache
    public void saveBundleMetadata(BundleMetadata bundleMetadata) {
        this.f23744db.execute("INSERT OR REPLACE INTO bundles (bundle_id, schema_version, create_time_seconds, create_time_nanos, total_documents, total_bytes) VALUES (?, ?, ?, ?, ?, ?)", bundleMetadata.getBundleId(), Integer.valueOf(bundleMetadata.getSchemaVersion()), Long.valueOf(bundleMetadata.getCreateTime().getTimestamp().getSeconds()), Integer.valueOf(bundleMetadata.getCreateTime().getTimestamp().getNanoseconds()), Integer.valueOf(bundleMetadata.getTotalDocuments()), Long.valueOf(bundleMetadata.getTotalBytes()));
    }

    @Override // com.google.firebase.firestore.local.BundleCache
    public void saveNamedQuery(NamedQuery namedQuery) {
        this.f23744db.execute("INSERT OR REPLACE INTO named_queries (name, read_time_seconds, read_time_nanos, bundled_query_proto) VALUES (?, ?, ?, ?)", namedQuery.getName(), Long.valueOf(namedQuery.getReadTime().getTimestamp().getSeconds()), Integer.valueOf(namedQuery.getReadTime().getTimestamp().getNanoseconds()), this.serializer.encodeBundledQuery(namedQuery.getBundledQuery()).toByteArray());
    }
}
