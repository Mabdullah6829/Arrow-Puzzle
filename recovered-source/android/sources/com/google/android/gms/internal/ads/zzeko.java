package com.google.android.gms.internal.ads;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeko extends zzfzx {

    /* JADX INFO: renamed from: u */
    public static final /* synthetic */ int f14094u = 0;

    /* JADX INFO: renamed from: s */
    public final Context f14095s;

    /* JADX INFO: renamed from: t */
    public final zzhcp f14096t;

    /* JADX WARN: Illegal instructions before constructor call */
    public zzeko(Context context, zzhcp zzhcpVar) {
        int iIntValue = ((Integer) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8012A9)).intValue();
        int i2 = zzfzz.f16873a;
        super(context, "AdMobOfflineBufferedPings.db", iIntValue);
        this.f14095s = context;
        this.f14096t = zzhcpVar;
    }

    /* JADX INFO: renamed from: h */
    public static void m6257h(SQLiteDatabase sQLiteDatabase, com.google.android.gms.ads.internal.util.client.zzu zzuVar) throws Throwable {
        SQLiteDatabase sQLiteDatabase2;
        String string;
        sQLiteDatabase.beginTransaction();
        try {
            String[] strArr = {"timestamp", "url"};
            StringBuilder sb = new StringBuilder(15);
            sb.append("event_state = 1");
            String string2 = sb.toString();
            sQLiteDatabase2 = sQLiteDatabase;
            try {
                Cursor cursorQuery = sQLiteDatabase2.query("offline_buffered_pings", strArr, string2, null, null, null, "timestamp ASC", null);
                int count = cursorQuery.getCount();
                String[] strArr2 = new String[count];
                int i2 = 0;
                while (cursorQuery.moveToNext()) {
                    int columnIndex = cursorQuery.getColumnIndex("timestamp");
                    int columnIndex2 = cursorQuery.getColumnIndex("url");
                    if (columnIndex2 != -1) {
                        long j2 = cursorQuery.getLong(columnIndex);
                        String string3 = cursorQuery.getString(columnIndex2);
                        if (string3 == null) {
                            string = "";
                        } else {
                            Uri uri = Uri.parse(string3);
                            com.google.android.gms.ads.internal.zzt.f3698C.f3711k.getClass();
                            long jCurrentTimeMillis = System.currentTimeMillis() - j2;
                            String encodedQuery = uri.getEncodedQuery();
                            Uri.Builder builderClearQuery = uri.buildUpon().clearQuery();
                            builderClearQuery.appendQueryParameter("bd", Long.toString(jCurrentTimeMillis));
                            String strValueOf = String.valueOf(builderClearQuery.build());
                            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 1 + String.valueOf(encodedQuery).length());
                            sb2.append(strValueOf);
                            sb2.append("&");
                            sb2.append(encodedQuery);
                            string = sb2.toString();
                        }
                        strArr2[i2] = string;
                    }
                    i2++;
                }
                cursorQuery.close();
                sQLiteDatabase2.delete("offline_buffered_pings", "event_state = ?", new String[]{Integer.toString(1)});
                sQLiteDatabase2.setTransactionSuccessful();
                sQLiteDatabase2.endTransaction();
                for (int i3 = 0; i3 < count; i3++) {
                    zzuVar.m3081a(null, strArr2[i3]);
                }
            } catch (Throwable th) {
                th = th;
                Throwable th2 = th;
                sQLiteDatabase2.endTransaction();
                throw th2;
            }
        } catch (Throwable th3) {
            th = th3;
            sQLiteDatabase2 = sQLiteDatabase;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m6258c(zzfos zzfosVar) {
        Callable callable = new Callable() { // from class: com.google.android.gms.internal.ads.zzekn
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.f14093a.getWritableDatabase();
            }
        };
        zzhcp zzhcpVar = this.f14096t;
        ListenableFuture listenableFutureSubmit = zzhcpVar.submit(callable);
        listenableFutureSubmit.addListener(new zzhcd(listenableFutureSubmit, new zzekh(this, zzfosVar)), zzhcpVar);
    }

    /* JADX INFO: renamed from: e */
    public final void m6259e(final String str) {
        m6258c(new zzfos() { // from class: com.google.android.gms.internal.ads.zzekk
            @Override // com.google.android.gms.internal.ads.zzfos
            /* JADX INFO: renamed from: b */
            public final Object mo5874b(Object obj) {
                int i2 = zzeko.f14094u;
                ((SQLiteDatabase) obj).delete("offline_buffered_pings", "gws_query_id = ? AND event_state = ?", new String[]{str, Integer.toString(0)});
                return null;
            }
        });
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE offline_buffered_pings (timestamp INTEGER PRIMARY_KEY, gws_query_id TEXT, url TEXT, event_state INTEGER)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS offline_buffered_pings");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS offline_buffered_pings");
    }
}
