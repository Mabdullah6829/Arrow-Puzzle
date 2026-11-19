package androidx.transition;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Base64;
import android.util.Log;
import androidx.core.os.CancellationSignal;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsTasks;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import p011H.AbstractC0242F;
import p034T.C0742i;
import p063h.C6357c;
import p063h.EnumC6358d;
import p069k.C6428i;
import p069k.C6429j;
import p069k.C6430k;
import p069k.C6433n;
import p076n.C6477a;
import p076n.C6478b;
import p076n.C6480d;
import p076n.C6481e;
import p076n.C6482f;
import p076n.C6483g;
import p076n.EnumC6479c;
import p077p.C6484a;
import p081r.C6522a;
import p081r.C6523b;
import p081r.C6530i;
import p081r.InterfaceC6528g;
import p082s.InterfaceC6533a;
import p085u.AbstractC6540a;

/* JADX INFO: renamed from: androidx.transition.a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1750a implements CancellationSignal.OnCancelListener, Continuation, InterfaceC6533a, InterfaceC6528g {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ int f2842s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ Object f2843t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ Object f2844u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ Object f2845v;

    public /* synthetic */ C1750a(Object obj, Object obj2, Object obj3, int i2) {
        this.f2842s = i2;
        this.f2843t = obj;
        this.f2844u = obj2;
        this.f2845v = obj3;
    }

    @Override // com.google.android.gms.tasks.Continuation
    /* JADX INFO: renamed from: a */
    public Object mo170a(Task task) {
        return CrashlyticsTasks.lambda$race$0((TaskCompletionSource) this.f2843t, (AtomicBoolean) this.f2844u, (CancellationTokenSource) this.f2845v, task);
    }

    @Override // p081r.InterfaceC6528g
    public Object apply(Object obj) throws Throwable {
        Cursor cursor;
        String str;
        long jInsert;
        EnumC6479c enumC6479c;
        int i2 = this.f2842s;
        String str2 = "bytes";
        int i3 = 6;
        int i4 = 5;
        int i5 = 4;
        int i6 = 3;
        EnumC6479c enumC6479c2 = EnumC6479c.CACHE_FULL;
        int i7 = 2;
        Object obj2 = this.f2845v;
        Object obj3 = this.f2844u;
        int i8 = 0;
        C6530i c6530i = (C6530i) this.f2843t;
        switch (i2) {
            case 3:
                ArrayList arrayList = (ArrayList) obj3;
                C6430k c6430k = (C6430k) obj2;
                Cursor cursor2 = (Cursor) obj;
                while (cursor2.moveToNext()) {
                    long j2 = cursor2.getLong(0);
                    boolean z = cursor2.getInt(7) != 0;
                    C6428i c6428i = new C6428i();
                    c6428i.f24583f = new HashMap();
                    String string = cursor2.getString(1);
                    if (string == null) {
                        throw new NullPointerException("Null transportName");
                    }
                    c6428i.f24578a = string;
                    c6428i.f24581d = Long.valueOf(cursor2.getLong(i7));
                    c6428i.f24582e = Long.valueOf(cursor2.getLong(i6));
                    if (z) {
                        String string2 = cursor2.getString(4);
                        c6428i.f24580c = new C6433n(string2 == null ? C6530i.f24751x : new C6357c(string2), cursor2.getBlob(5));
                        str = str2;
                    } else {
                        String string3 = cursor2.getString(4);
                        C6357c c6357c = string3 == null ? C6530i.f24751x : new C6357c(string3);
                        Cursor cursorQuery = c6530i.m12203c().query("event_payloads", new String[]{str2}, "event_id = ?", new String[]{String.valueOf(j2)}, null, null, "sequence_num");
                        try {
                            ArrayList arrayList2 = new ArrayList();
                            int length = 0;
                            while (cursorQuery.moveToNext()) {
                                byte[] blob = cursorQuery.getBlob(0);
                                arrayList2.add(blob);
                                length += blob.length;
                            }
                            byte[] bArr = new byte[length];
                            int i9 = 0;
                            int length2 = 0;
                            while (i9 < arrayList2.size()) {
                                byte[] bArr2 = (byte[]) arrayList2.get(i9);
                                String str3 = str2;
                                cursor = cursorQuery;
                                try {
                                    System.arraycopy(bArr2, 0, bArr, length2, bArr2.length);
                                    length2 += bArr2.length;
                                    i9++;
                                    cursorQuery = cursor;
                                    str2 = str3;
                                } catch (Throwable th) {
                                    th = th;
                                    cursor.close();
                                    throw th;
                                }
                            }
                            str = str2;
                            cursorQuery.close();
                            c6428i.f24580c = new C6433n(c6357c, bArr);
                        } catch (Throwable th2) {
                            th = th2;
                            cursor = cursorQuery;
                        }
                    }
                    if (!cursor2.isNull(6)) {
                        c6428i.f24579b = Integer.valueOf(cursor2.getInt(6));
                    }
                    if (!cursor2.isNull(8)) {
                        c6428i.f24584g = Integer.valueOf(cursor2.getInt(8));
                    }
                    if (!cursor2.isNull(9)) {
                        c6428i.f24585h = cursor2.getString(9);
                    }
                    if (!cursor2.isNull(10)) {
                        c6428i.f24586i = cursor2.getBlob(10);
                    }
                    if (!cursor2.isNull(11)) {
                        c6428i.f24587j = cursor2.getBlob(11);
                    }
                    arrayList.add(new C6523b(j2, c6430k, c6428i.m12165b()));
                    str2 = str;
                    i6 = 3;
                    i7 = 2;
                }
                return null;
            case 4:
                C6429j c6429j = (C6429j) obj3;
                C6433n c6433n = c6429j.f24590c;
                String str4 = c6429j.f24588a;
                C6430k c6430k2 = (C6430k) obj2;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                long jSimpleQueryForLong = c6530i.m12203c().compileStatement("PRAGMA page_size").simpleQueryForLong() * c6530i.m12203c().compileStatement("PRAGMA page_count").simpleQueryForLong();
                C6522a c6522a = c6530i.f24755v;
                if (jSimpleQueryForLong >= c6522a.f24737a) {
                    c6530i.m12206j(1L, enumC6479c2, str4);
                    return -1L;
                }
                Long lM12200e = C6530i.m12200e(sQLiteDatabase, c6430k2);
                if (lM12200e != null) {
                    jInsert = lM12200e.longValue();
                } else {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("backend_name", c6430k2.f24598a);
                    contentValues.put("priority", Integer.valueOf(AbstractC6540a.m12211a(c6430k2.f24600c)));
                    contentValues.put("next_request_ms", (Integer) 0);
                    byte[] bArr3 = c6430k2.f24599b;
                    if (bArr3 != null) {
                        contentValues.put("extras", Base64.encodeToString(bArr3, 0));
                    }
                    jInsert = sQLiteDatabase.insert("transport_contexts", null, contentValues);
                }
                int i10 = c6522a.f24741e;
                byte[] bArr4 = c6433n.f24609b;
                boolean z2 = bArr4.length <= i10;
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("context_id", Long.valueOf(jInsert));
                contentValues2.put("transport_name", str4);
                contentValues2.put("timestamp_ms", Long.valueOf(c6429j.f24591d));
                contentValues2.put("uptime_ms", Long.valueOf(c6429j.f24592e));
                contentValues2.put("payload_encoding", c6433n.f24608a.f24414a);
                contentValues2.put("code", c6429j.f24589b);
                contentValues2.put("num_attempts", (Integer) 0);
                contentValues2.put("inline", Boolean.valueOf(z2));
                contentValues2.put("payload", z2 ? bArr4 : new byte[0]);
                contentValues2.put(FirebaseAnalytics.Param.PRODUCT_ID, c6429j.f24594g);
                contentValues2.put("pseudonymous_id", c6429j.f24595h);
                contentValues2.put("experiment_ids_clear_blob", c6429j.f24596i);
                contentValues2.put("experiment_ids_encrypted_blob", c6429j.f24597j);
                long jInsert2 = sQLiteDatabase.insert("events", null, contentValues2);
                if (!z2) {
                    int iCeil = (int) Math.ceil(((double) bArr4.length) / ((double) i10));
                    for (int i11 = 1; i11 <= iCeil; i11++) {
                        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr4, (i11 - 1) * i10, Math.min(i11 * i10, bArr4.length));
                        ContentValues contentValues3 = new ContentValues();
                        contentValues3.put("event_id", Long.valueOf(jInsert2));
                        contentValues3.put("sequence_num", Integer.valueOf(i11));
                        contentValues3.put("bytes", bArrCopyOfRange);
                        sQLiteDatabase.insert("event_payloads", null, contentValues3);
                    }
                }
                for (Map.Entry entry : Collections.unmodifiableMap(c6429j.f24593f).entrySet()) {
                    ContentValues contentValues4 = new ContentValues();
                    contentValues4.put("event_id", Long.valueOf(jInsert2));
                    contentValues4.put(AppMeasurementSdk.ConditionalUserProperty.NAME, (String) entry.getKey());
                    contentValues4.put("value", (String) entry.getValue());
                    sQLiteDatabase.insert("event_metadata", null, contentValues4);
                }
                return Long.valueOf(jInsert2);
            default:
                HashMap map = (HashMap) obj3;
                C0742i c0742i = (C0742i) obj2;
                Cursor cursor3 = (Cursor) obj;
                c6530i.getClass();
                while (cursor3.moveToNext()) {
                    String string4 = cursor3.getString(i8);
                    int i12 = cursor3.getInt(1);
                    EnumC6479c enumC6479c3 = EnumC6479c.REASON_UNKNOWN;
                    if (i12 != 0) {
                        if (i12 == 1) {
                            enumC6479c3 = EnumC6479c.MESSAGE_TOO_OLD;
                        } else if (i12 == 2) {
                            enumC6479c = enumC6479c2;
                        } else if (i12 == 3) {
                            enumC6479c3 = EnumC6479c.PAYLOAD_TOO_BIG;
                        } else if (i12 == i5) {
                            enumC6479c3 = EnumC6479c.MAX_RETRIES_REACHED;
                        } else if (i12 == i4) {
                            enumC6479c3 = EnumC6479c.INVALID_PAYLOD;
                        } else if (i12 == i3) {
                            enumC6479c3 = EnumC6479c.SERVER_ERROR;
                        } else {
                            AbstractC0242F.m350f("SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN", Integer.valueOf(i12));
                        }
                        enumC6479c = enumC6479c3;
                    } else {
                        enumC6479c = enumC6479c3;
                    }
                    long j3 = cursor3.getLong(2);
                    if (!map.containsKey(string4)) {
                        map.put(string4, new ArrayList());
                    }
                    ((List) map.get(string4)).add(new C6480d(j3, enumC6479c));
                    i8 = 0;
                    i3 = 6;
                    i4 = 5;
                    i5 = 4;
                }
                for (Map.Entry entry2 : map.entrySet()) {
                    int i13 = C6481e.f24677c;
                    new ArrayList();
                    ((ArrayList) c0742i.f1887t).add(new C6481e((String) entry2.getKey(), Collections.unmodifiableList((List) entry2.getValue())));
                }
                long jM2719f = c6530i.f24753t.m2719f();
                SQLiteDatabase sQLiteDatabaseM12203c = c6530i.m12203c();
                sQLiteDatabaseM12203c.beginTransaction();
                try {
                    Cursor cursorRawQuery = sQLiteDatabaseM12203c.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]);
                    try {
                        cursorRawQuery.moveToNext();
                        C6483g c6483g = new C6483g(cursorRawQuery.getLong(0), jM2719f);
                        cursorRawQuery.close();
                        sQLiteDatabaseM12203c.setTransactionSuccessful();
                        sQLiteDatabaseM12203c.endTransaction();
                        c0742i.f1886s = c6483g;
                        c0742i.f1888u = new C6478b(new C6482f(c6530i.m12203c().compileStatement("PRAGMA page_size").simpleQueryForLong() * c6530i.m12203c().compileStatement("PRAGMA page_count").simpleQueryForLong(), C6522a.f24736f.f24737a));
                        c0742i.f1889v = (String) c6530i.f24756w.get();
                        return new C6477a((C6483g) c0742i.f1886s, Collections.unmodifiableList((ArrayList) c0742i.f1887t), (C6478b) c0742i.f1888u, (String) c0742i.f1889v);
                    } catch (Throwable th3) {
                        cursorRawQuery.close();
                        throw th3;
                    }
                } catch (Throwable th4) {
                    sQLiteDatabaseM12203c.endTransaction();
                    throw th4;
                }
        }
    }

    @Override // p082s.InterfaceC6533a
    public Object execute() {
        C6484a c6484a = (C6484a) this.f2843t;
        C6430k c6430k = (C6430k) this.f2844u;
        C6429j c6429j = (C6429j) this.f2845v;
        C6530i c6530i = (C6530i) c6484a.f24688d;
        c6530i.getClass();
        EnumC6358d enumC6358d = c6430k.f24600c;
        String str = c6429j.f24588a;
        String str2 = c6430k.f24598a;
        String strM355l = AbstractC0242F.m355l("SQLiteEventStore");
        if (Log.isLoggable(strM355l, 3)) {
            Log.d(strM355l, "Storing event with priority=" + enumC6358d + ", name=" + str + " for destination " + str2);
        }
        ((Long) c6530i.m12204h(new C1750a(c6530i, c6429j, c6430k, 4))).longValue();
        c6484a.f24685a.m12198a(c6430k, 1, false);
        return null;
    }

    @Override // androidx.core.os.CancellationSignal.OnCancelListener
    public void onCancel() {
        FragmentTransitionSupport.lambda$setListenerForTransitionEnd$0((Runnable) this.f2843t, (Transition) this.f2845v, (Runnable) this.f2844u);
    }

    public /* synthetic */ C1750a(Runnable runnable, Transition transition, Runnable runnable2) {
        this.f2842s = 0;
        this.f2843t = runnable;
        this.f2845v = transition;
        this.f2844u = runnable2;
    }
}
