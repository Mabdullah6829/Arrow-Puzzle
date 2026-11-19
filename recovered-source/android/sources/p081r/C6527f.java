package p081r;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import p063h.EnumC6358d;
import p069k.C6430k;
import p085u.AbstractC6540a;

/* JADX INFO: renamed from: r.f */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C6527f implements InterfaceC6528g {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ long f24747s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ C6430k f24748t;

    public /* synthetic */ C6527f(long j2, C6430k c6430k) {
        this.f24747s = j2;
        this.f24748t = c6430k;
    }

    @Override // p081r.InterfaceC6528g
    public final Object apply(Object obj) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(this.f24747s));
        C6430k c6430k = this.f24748t;
        String str = c6430k.f24598a;
        EnumC6358d enumC6358d = c6430k.f24600c;
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{str, String.valueOf(AbstractC6540a.m12211a(enumC6358d))}) < 1) {
            contentValues.put("backend_name", str);
            contentValues.put("priority", Integer.valueOf(AbstractC6540a.m12211a(enumC6358d)));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }
}
