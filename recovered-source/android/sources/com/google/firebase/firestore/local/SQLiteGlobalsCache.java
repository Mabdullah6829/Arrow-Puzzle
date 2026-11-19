package com.google.firebase.firestore.local;

import android.database.Cursor;
import androidx.annotation.NonNull;
import com.google.protobuf.AbstractC6251n;

/* JADX INFO: loaded from: classes2.dex */
public class SQLiteGlobalsCache implements GlobalsCache {
    private static final String SESSION_TOKEN = "sessionToken";

    /* JADX INFO: renamed from: db */
    private final SQLitePersistence f23746db;

    public SQLiteGlobalsCache(SQLitePersistence sQLitePersistence) {
        this.f23746db = sQLitePersistence;
    }

    private byte[] get(@NonNull String str) {
        return (byte[]) this.f23746db.query("SELECT value FROM globals WHERE name = ?").binding(str).firstValue(new C5772A(3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ byte[] lambda$get$0(Cursor cursor) {
        return cursor.getBlob(0);
    }

    private void set(@NonNull String str, @NonNull byte[] bArr) {
        this.f23746db.execute("INSERT OR REPLACE INTO globals (name, value) VALUES (?, ?)", str, bArr);
    }

    @Override // com.google.firebase.firestore.local.GlobalsCache
    @NonNull
    public AbstractC6251n getSessionsToken() {
        byte[] bArr = get(SESSION_TOKEN);
        return bArr == null ? AbstractC6251n.f24219t : AbstractC6251n.m11896j(bArr, 0, bArr.length);
    }

    @Override // com.google.firebase.firestore.local.GlobalsCache
    public void setSessionToken(@NonNull AbstractC6251n abstractC6251n) {
        set(SESSION_TOKEN, abstractC6251n.m11897w());
    }
}
