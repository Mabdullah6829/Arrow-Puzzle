package com.google.android.gms.internal.ads;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzfzx extends SQLiteOpenHelper {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfzx(Context context, String str, int i2) {
        super(context, true == str.equals("") ? null : str, (SQLiteDatabase.CursorFactory) null, i2);
        zzfzv zzfzvVar = zzfzu.f16872a;
    }
}
