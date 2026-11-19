package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class zzeki implements Runnable {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ SQLiteDatabase f14083s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ String f14084t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ com.google.android.gms.ads.internal.util.client.zzu f14085u;

    public /* synthetic */ zzeki(SQLiteDatabase sQLiteDatabase, String str, com.google.android.gms.ads.internal.util.client.zzu zzuVar) {
        this.f14083s = sQLiteDatabase;
        this.f14084t = str;
        this.f14085u = zzuVar;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() throws Throwable {
        int i2 = zzeko.f14094u;
        ContentValues contentValues = new ContentValues();
        contentValues.put("event_state", (Integer) 1);
        String[] strArr = {this.f14084t};
        SQLiteDatabase sQLiteDatabase = this.f14083s;
        sQLiteDatabase.update("offline_buffered_pings", contentValues, "gws_query_id = ?", strArr);
        zzeko.m6257h(sQLiteDatabase, this.f14085u);
    }
}
