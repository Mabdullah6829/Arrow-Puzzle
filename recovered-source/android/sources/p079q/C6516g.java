package p079q;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import p069k.C6430k;
import p076n.EnumC6479c;
import p081r.C6527f;
import p081r.C6530i;
import p081r.InterfaceC6525d;
import p081r.InterfaceC6528g;
import p082s.InterfaceC6533a;

/* JADX INFO: renamed from: q.g */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C6516g implements InterfaceC6533a, InterfaceC6528g {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ long f24713s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ Object f24714t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ Object f24715u;

    public /* synthetic */ C6516g(long j2, Object obj, Object obj2) {
        this.f24714t = obj;
        this.f24715u = obj2;
        this.f24713s = j2;
    }

    @Override // p081r.InterfaceC6528g
    public Object apply(Object obj) {
        String str = (String) this.f24714t;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        int i2 = ((EnumC6479c) this.f24715u).f24674s;
        Cursor cursorRawQuery = sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(i2)});
        try {
            boolean z = cursorRawQuery.getCount() > 0;
            cursorRawQuery.close();
            long j2 = this.f24713s;
            if (z) {
                sQLiteDatabase.execSQL("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + " + j2 + " WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(i2)});
                return null;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("log_source", str);
            contentValues.put("reason", Integer.valueOf(i2));
            contentValues.put("events_dropped_count", Long.valueOf(j2));
            sQLiteDatabase.insert("log_event_dropped", null, contentValues);
            return null;
        } catch (Throwable th) {
            cursorRawQuery.close();
            throw th;
        }
    }

    @Override // p082s.InterfaceC6533a
    public Object execute() {
        C6517h c6517h = (C6517h) this.f24714t;
        C6430k c6430k = (C6430k) this.f24715u;
        InterfaceC6525d interfaceC6525d = c6517h.f24718c;
        long jM2719f = c6517h.f24722g.m2719f() + this.f24713s;
        C6530i c6530i = (C6530i) interfaceC6525d;
        c6530i.getClass();
        c6530i.m12204h(new C6527f(jM2719f, c6430k));
        return null;
    }
}
