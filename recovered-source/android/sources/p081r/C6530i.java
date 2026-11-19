package p081r;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import androidx.transition.C1750a;
import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import p049b0.C1887c;
import p050c0.InterfaceC1888a;
import p063h.C6357c;
import p069k.AbstractC6437r;
import p069k.C6430k;
import p076n.EnumC6479c;
import p079q.C6516g;
import p082s.InterfaceC6533a;
import p082s.InterfaceC6534b;
import p085u.AbstractC6540a;

/* JADX INFO: renamed from: r.i */
/* JADX INFO: loaded from: classes.dex */
public final class C6530i implements InterfaceC6525d, InterfaceC6534b, InterfaceC6524c {

    /* JADX INFO: renamed from: x */
    public static final C6357c f24751x = new C6357c("proto");

    /* JADX INFO: renamed from: s */
    public final C6532k f24752s;

    /* JADX INFO: renamed from: t */
    public final C1887c f24753t;

    /* JADX INFO: renamed from: u */
    public final C1887c f24754u;

    /* JADX INFO: renamed from: v */
    public final C6522a f24755v;

    /* JADX INFO: renamed from: w */
    public final InterfaceC1888a f24756w;

    public C6530i(C1887c c1887c, C1887c c1887c2, C6522a c6522a, C6532k c6532k, InterfaceC1888a interfaceC1888a) {
        this.f24752s = c6532k;
        this.f24753t = c1887c;
        this.f24754u = c1887c2;
        this.f24755v = c6522a;
        this.f24756w = interfaceC1888a;
    }

    /* JADX INFO: renamed from: e */
    public static Long m12200e(SQLiteDatabase sQLiteDatabase, AbstractC6437r abstractC6437r) {
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        C6430k c6430k = (C6430k) abstractC6437r;
        ArrayList arrayList = new ArrayList(Arrays.asList(c6430k.f24598a, String.valueOf(AbstractC6540a.m12211a(c6430k.f24600c))));
        byte[] bArr = c6430k.f24599b;
        if (bArr != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(bArr, 0));
        } else {
            sb.append(" and extras is null");
        }
        Cursor cursorQuery = sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null);
        try {
            return !cursorQuery.moveToNext() ? null : Long.valueOf(cursorQuery.getLong(0));
        } finally {
            cursorQuery.close();
        }
    }

    /* JADX INFO: renamed from: n */
    public static String m12201n(Iterable iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(((C6523b) it.next()).f24742a);
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    /* JADX INFO: renamed from: o */
    public static Object m12202o(Cursor cursor, InterfaceC6528g interfaceC6528g) {
        try {
            return interfaceC6528g.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    /* JADX INFO: renamed from: c */
    public final SQLiteDatabase m12203c() {
        C6532k c6532k = this.f24752s;
        Objects.requireNonNull(c6532k);
        C1887c c1887c = this.f24754u;
        long jM2719f = c1887c.m2719f();
        while (true) {
            try {
                return c6532k.getWritableDatabase();
            } catch (SQLiteDatabaseLockedException e) {
                if (c1887c.m2719f() >= ((long) this.f24755v.f24739c) + jM2719f) {
                    throw new SynchronizationException("Timed out while trying to open db.", e);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f24752s.close();
    }

    /* JADX INFO: renamed from: h */
    public final Object m12204h(InterfaceC6528g interfaceC6528g) {
        SQLiteDatabase sQLiteDatabaseM12203c = m12203c();
        sQLiteDatabaseM12203c.beginTransaction();
        try {
            Object objApply = interfaceC6528g.apply(sQLiteDatabaseM12203c);
            sQLiteDatabaseM12203c.setTransactionSuccessful();
            return objApply;
        } finally {
            sQLiteDatabaseM12203c.endTransaction();
        }
    }

    /* JADX INFO: renamed from: i */
    public final ArrayList m12205i(SQLiteDatabase sQLiteDatabase, C6430k c6430k, int i2) {
        ArrayList arrayList = new ArrayList();
        Long lM12200e = m12200e(sQLiteDatabase, c6430k);
        if (lM12200e == null) {
            return arrayList;
        }
        m12202o(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline", FirebaseAnalytics.Param.PRODUCT_ID, "pseudonymous_id", "experiment_ids_clear_blob", "experiment_ids_encrypted_blob"}, "context_id = ?", new String[]{lM12200e.toString()}, null, null, null, String.valueOf(i2)), new C1750a(this, arrayList, c6430k, 3));
        return arrayList;
    }

    /* JADX INFO: renamed from: j */
    public final void m12206j(long j2, EnumC6479c enumC6479c, String str) {
        m12204h(new C6516g(j2, str, enumC6479c));
    }

    /* JADX INFO: renamed from: l */
    public final Object m12207l(InterfaceC6533a interfaceC6533a) {
        SQLiteDatabase sQLiteDatabaseM12203c = m12203c();
        C1887c c1887c = this.f24754u;
        long jM2719f = c1887c.m2719f();
        while (true) {
            try {
                sQLiteDatabaseM12203c.beginTransaction();
                try {
                    Object objExecute = interfaceC6533a.execute();
                    sQLiteDatabaseM12203c.setTransactionSuccessful();
                    return objExecute;
                } finally {
                    sQLiteDatabaseM12203c.endTransaction();
                }
            } catch (SQLiteDatabaseLockedException e) {
                if (c1887c.m2719f() >= ((long) this.f24755v.f24739c) + jM2719f) {
                    throw new SynchronizationException("Timed out while trying to acquire the lock.", e);
                }
                SystemClock.sleep(50L);
            }
        }
    }
}
