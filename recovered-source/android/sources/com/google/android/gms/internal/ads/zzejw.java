package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: loaded from: classes2.dex */
public final class zzejw {
    /* JADX INFO: renamed from: a */
    public static int m6238a(SQLiteDatabase sQLiteDatabase, int i2) {
        int i3 = 0;
        if (i2 == 2) {
            return 0;
        }
        Cursor cursorM6240c = m6240c(sQLiteDatabase, i2);
        if (cursorM6240c.getCount() > 0) {
            cursorM6240c.moveToNext();
            i3 = cursorM6240c.getInt(cursorM6240c.getColumnIndexOrThrow("value"));
        }
        cursorM6240c.close();
        return i3;
    }

    /* JADX INFO: renamed from: b */
    public static void m6239b(SQLiteDatabase sQLiteDatabase, long j2, byte[] bArr) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("timestamp", Long.valueOf(j2));
        contentValues.put("serialized_proto_data", bArr);
        if (sQLiteDatabase.update("offline_signal_contents", contentValues, "timestamp = ?", new String[]{String.valueOf(j2)}) == 0) {
            sQLiteDatabase.insert("offline_signal_contents", null, contentValues);
        }
    }

    /* JADX INFO: renamed from: c */
    public static Cursor m6240c(SQLiteDatabase sQLiteDatabase, int i2) {
        String[] strArr = {"value"};
        String[] strArr2 = new String[1];
        if (i2 == 0) {
            strArr2[0] = "failed_requests";
        } else if (i2 == 1) {
            strArr2[0] = "total_requests";
        } else if (i2 != 2) {
            strArr2[0] = "completed_requests";
        } else {
            strArr2[0] = "last_successful_request_time";
        }
        return sQLiteDatabase.query("offline_signal_statistics", strArr, "statistic_name = ?", strArr2, null, null, null);
    }

    /* JADX INFO: renamed from: d */
    public static void m6241d(SQLiteDatabase sQLiteDatabase, String str) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("value", (Integer) 0);
        sQLiteDatabase.update("offline_signal_statistics", contentValues, "statistic_name = ?", new String[]{str});
    }

    /* JADX INFO: renamed from: e */
    public static void m6242e(SQLiteDatabase sQLiteDatabase, String str) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("statistic_name", str);
        contentValues.put("value", (Integer) 0);
        sQLiteDatabase.insert("offline_signal_statistics", null, contentValues);
    }
}
