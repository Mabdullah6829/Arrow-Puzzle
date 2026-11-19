package androidx.privacysandbox.ads.adservices.java.internal;

import android.content.IntentSender;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.arrow.puzzle.escape.maze.free.game.activity.StartActivity;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.appupdate.AppUpdateInfo;
import com.google.android.play.core.appupdate.AppUpdateManager;
import com.google.firebase.firestore.core.Transaction;
import com.google.firebase.firestore.core.TransactionRunner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import p000A0.InterfaceC0001B;
import p001B.C0092r;
import p063h.EnumC6358d;
import p069k.C6428i;
import p069k.C6430k;
import p076n.EnumC6479c;
import p079q.C6517h;
import p081r.C6522a;
import p081r.C6523b;
import p081r.C6529h;
import p081r.C6530i;
import p081r.InterfaceC6528g;
import p082s.InterfaceC6533a;

/* JADX INFO: renamed from: androidx.privacysandbox.ads.adservices.java.internal.a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1622a implements CallbackToFutureAdapter.Resolver, OnCompleteListener, OnSuccessListener, InterfaceC6533a, InterfaceC6528g {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ int f2819s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ Object f2820t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ Object f2821u;

    public /* synthetic */ C1622a(int i2, Object obj, Object obj2) {
        this.f2819s = i2;
        this.f2820t = obj;
        this.f2821u = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0054  */
    /* JADX WARN: Code duplicated, block: B:19:0x0066  */
    /* JADX WARN: Code duplicated, block: B:24:0x0091 A[Catch: all -> 0x0117, TryCatch #0 {all -> 0x0117, blocks: (B:22:0x008b, B:24:0x0091, B:26:0x00a1, B:27:0x00ad), top: B:54:0x008b }] */
    /* JADX WARN: Code duplicated, block: B:26:0x00a1 A[Catch: all -> 0x0117, TryCatch #0 {all -> 0x0117, blocks: (B:22:0x008b, B:24:0x0091, B:26:0x00a1, B:27:0x00ad), top: B:54:0x008b }] */
    /* JADX WARN: Code duplicated, block: B:32:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:38:0x00f9 A[LOOP:4: B:36:0x00f3->B:38:0x00f9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:64:0x006b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x00ad A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x00df A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x00c6 A[SYNTHETIC] */
    @Override // p081r.InterfaceC6528g
    public Object apply(Object obj) {
        HashMap map;
        StringBuilder sb;
        int i2;
        Cursor cursorQuery;
        ListIterator listIterator;
        C6523b c6523b;
        long j2;
        C6428i c6428iM12168c;
        long j3;
        Set hashSet;
        switch (this.f2819s) {
            case 6:
                C6530i c6530i = (C6530i) this.f2820t;
                String str = (String) this.f2821u;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                c6530i.getClass();
                sQLiteDatabase.compileStatement(str).execute();
                Cursor cursorRawQuery = sQLiteDatabase.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name", null);
                while (cursorRawQuery.moveToNext()) {
                    try {
                        c6530i.m12206j(cursorRawQuery.getInt(0), EnumC6479c.MAX_RETRIES_REACHED, cursorRawQuery.getString(1));
                    } catch (Throwable th) {
                        cursorRawQuery.close();
                        throw th;
                    }
                }
                cursorRawQuery.close();
                sQLiteDatabase.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
                return null;
            default:
                C6530i c6530i2 = (C6530i) this.f2820t;
                C6430k c6430k = (C6430k) this.f2821u;
                SQLiteDatabase sQLiteDatabase2 = (SQLiteDatabase) obj;
                C6522a c6522a = c6530i2.f24755v;
                ArrayList arrayListM12205i = c6530i2.m12205i(sQLiteDatabase2, c6430k, c6522a.f24738b);
                for (EnumC6358d enumC6358d : EnumC6358d.values()) {
                    if (enumC6358d != c6430k.f24600c) {
                        int size = c6522a.f24738b - arrayListM12205i.size();
                        if (size <= 0) {
                            map = new HashMap();
                            sb = new StringBuilder("event_id IN (");
                            for (i2 = 0; i2 < arrayListM12205i.size(); i2++) {
                                sb.append(((C6523b) arrayListM12205i.get(i2)).f24742a);
                                if (i2 < arrayListM12205i.size() - 1) {
                                    sb.append(',');
                                }
                            }
                            sb.append(')');
                            cursorQuery = sQLiteDatabase2.query("event_metadata", new String[]{"event_id", AppMeasurementSdk.ConditionalUserProperty.NAME, "value"}, sb.toString(), null, null, null, null);
                            while (cursorQuery.moveToNext()) {
                                try {
                                    j3 = cursorQuery.getLong(0);
                                    hashSet = (Set) map.get(Long.valueOf(j3));
                                    if (hashSet == null) {
                                        hashSet = new HashSet();
                                        map.put(Long.valueOf(j3), hashSet);
                                    }
                                    hashSet.add(new C6529h(cursorQuery.getString(1), cursorQuery.getString(2)));
                                } catch (Throwable th2) {
                                    cursorQuery.close();
                                    throw th2;
                                }
                                break;
                            }
                            cursorQuery.close();
                            listIterator = arrayListM12205i.listIterator();
                            while (listIterator.hasNext()) {
                                c6523b = (C6523b) listIterator.next();
                                j2 = c6523b.f24742a;
                                if (!map.containsKey(Long.valueOf(j2))) {
                                    c6428iM12168c = c6523b.f24744c.m12168c();
                                    for (C6529h c6529h : (Set) map.get(Long.valueOf(j2))) {
                                        c6428iM12168c.m12164a(c6529h.f24749a, c6529h.f24750b);
                                    }
                                    listIterator.set(new C6523b(j2, c6523b.f24743b, c6428iM12168c.m12165b()));
                                }
                            }
                            return arrayListM12205i;
                        }
                        arrayListM12205i.addAll(c6530i2.m12205i(sQLiteDatabase2, c6430k.m12169a(enumC6358d), size));
                    }
                }
                map = new HashMap();
                sb = new StringBuilder("event_id IN (");
                while (i2 < arrayListM12205i.size()) {
                    sb.append(((C6523b) arrayListM12205i.get(i2)).f24742a);
                    if (i2 < arrayListM12205i.size() - 1) {
                        sb.append(',');
                    }
                }
                sb.append(')');
                cursorQuery = sQLiteDatabase2.query("event_metadata", new String[]{"event_id", AppMeasurementSdk.ConditionalUserProperty.NAME, "value"}, sb.toString(), null, null, null, null);
                while (cursorQuery.moveToNext()) {
                    j3 = cursorQuery.getLong(0);
                    hashSet = (Set) map.get(Long.valueOf(j3));
                    if (hashSet == null) {
                        hashSet = new HashSet();
                        map.put(Long.valueOf(j3), hashSet);
                    }
                    hashSet.add(new C6529h(cursorQuery.getString(1), cursorQuery.getString(2)));
                    break;
                }
                cursorQuery.close();
                listIterator = arrayListM12205i.listIterator();
                while (listIterator.hasNext()) {
                    c6523b = (C6523b) listIterator.next();
                    j2 = c6523b.f24742a;
                    if (!map.containsKey(Long.valueOf(j2))) {
                        c6428iM12168c = c6523b.f24744c.m12168c();
                        while (r5.hasNext()) {
                            c6428iM12168c.m12164a(c6529h.f24749a, c6529h.f24750b);
                        }
                        listIterator.set(new C6523b(j2, c6523b.f24743b, c6428iM12168c.m12165b()));
                    }
                }
                return arrayListM12205i;
        }
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
    public Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
        return CoroutineAdapterKt.asListenableFuture$lambda$0((InterfaceC0001B) this.f2820t, this.f2821u, completer);
    }

    @Override // p082s.InterfaceC6533a
    public Object execute() {
        switch (this.f2819s) {
            case 4:
                C6517h c6517h = (C6517h) this.f2820t;
                Iterable iterable = (Iterable) this.f2821u;
                C6530i c6530i = (C6530i) c6517h.f24718c;
                c6530i.getClass();
                if (iterable.iterator().hasNext()) {
                    c6530i.m12203c().compileStatement("DELETE FROM events WHERE _id in " + C6530i.m12201n(iterable)).execute();
                    break;
                }
                break;
            default:
                C6517h c6517h2 = (C6517h) this.f2820t;
                for (Map.Entry entry : ((HashMap) this.f2821u).entrySet()) {
                    ((C6530i) c6517h2.f24724i).m12206j(((Integer) entry.getValue()).intValue(), EnumC6479c.INVALID_PAYLOD, (String) entry.getKey());
                }
                break;
        }
        return null;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        switch (this.f2819s) {
            case 1:
                ((TransactionRunner) this.f2820t).lambda$runWithBackoff$0((Task) this.f2821u, task);
                break;
            default:
                ((TransactionRunner) this.f2820t).lambda$runWithBackoff$1((Transaction) this.f2821u, task);
                break;
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        C0092r c0092r = (C0092r) this.f2820t;
        AppUpdateManager appUpdateManager = (AppUpdateManager) this.f2821u;
        AppUpdateInfo appUpdateInfo = (AppUpdateInfo) obj;
        if (appUpdateInfo.updateAvailability() == 2) {
            try {
                appUpdateManager.startUpdateFlowForResult(appUpdateInfo, 1, (StartActivity) c0092r.f130t, 24564);
            } catch (IntentSender.SendIntentException e) {
                e.printStackTrace();
            }
        }
    }
}
