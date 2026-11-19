package p049b0;

import android.os.SystemClock;
import android.util.Log;
import androidx.work.WorkRequest;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.DocumentSnapshot;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.jvm.internal.AbstractC6452k;
import p022N.AbstractC0355G;
import p033S0.C0613g;
import p033S0.C0616j;
import p033S0.C0627u;
import p034T.AbstractC0759m0;
import p034T.InterfaceC0769o2;
import p035T0.AbstractC0811c;
import p035T0.C0815g;
import p036U.C0840u;
import p063h.EnumC6358d;
import p074m.InterfaceC6475b;
import p079q.C6510a;
import p079q.C6511b;
import p079q.EnumC6513d;
import p091y0.AbstractC6582l;

/* JADX INFO: renamed from: b0.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1887c implements InterfaceC0769o2, OnCompleteListener, InterfaceC6475b {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ int f2863s;

    public /* synthetic */ C1887c(int i2) {
        this.f2863s = i2;
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m2716a(C0627u c0627u) {
        C0627u c0627u2 = C0815g.f2132c;
        return !AbstractC6582l.m12233r(c0627u.m1452c(), ".class", true);
    }

    /* JADX INFO: renamed from: c */
    public static C0840u m2717c(int i2) {
        return new C0840u(new C0613g(), Math.min(1048576, Math.max(4096, i2)));
    }

    /* JADX INFO: renamed from: e */
    public static C0627u m2718e(String str, boolean z) {
        AbstractC6452k.m12181e(str, "<this>");
        C0616j c0616j = AbstractC0811c.f2120a;
        C0613g c0613g = new C0613g();
        c0613g.m1389Q(str);
        return AbstractC0811c.m1692d(c0613g, z);
    }

    @Override // p034T.InterfaceC0769o2
    /* JADX INFO: renamed from: b */
    public Object mo1646b() {
        return Executors.newCachedThreadPool(AbstractC0759m0.m1624e("grpc-okhttp-%d"));
    }

    @Override // p034T.InterfaceC0769o2
    /* JADX INFO: renamed from: d */
    public void mo1647d(Object obj) {
        ((ExecutorService) ((Executor) obj)).shutdown();
    }

    /* JADX INFO: renamed from: f */
    public long m2719f() {
        switch (this.f2863s) {
            case 10:
                return SystemClock.elapsedRealtime();
            default:
                return System.currentTimeMillis();
        }
    }

    @Override // p050c0.InterfaceC1888a
    public Object get() {
        C1887c c1887c = new C1887c(11);
        HashMap map = new HashMap();
        Set set = Collections.EMPTY_SET;
        if (set == null) {
            throw new NullPointerException("Null flags");
        }
        map.put(EnumC6358d.f24415s, new C6511b(WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS, 86400000L, set));
        if (set == null) {
            throw new NullPointerException("Null flags");
        }
        map.put(EnumC6358d.f24417u, new C6511b(1000L, 86400000L, set));
        if (set == null) {
            throw new NullPointerException("Null flags");
        }
        Set setUnmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(EnumC6513d.f24704t)));
        if (setUnmodifiableSet == null) {
            throw new NullPointerException("Null flags");
        }
        map.put(EnumC6358d.f24416t, new C6511b(86400000L, 86400000L, setUnmodifiableSet));
        if (map.keySet().size() < EnumC6358d.values().length) {
            throw new IllegalStateException("Not all priorities have been configured");
        }
        new HashMap();
        return new C6510a(c1887c, map);
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        if (!task.isSuccessful()) {
            Log.e("aaaaaaaa", "Error getting documents.", task.getException());
            return;
        }
        AbstractC0355G.f702z = ((DocumentSnapshot) task.getResult()).getData().get("admob_banner").toString();
        ((DocumentSnapshot) task.getResult()).getData().get("fb_banner").toString();
        AbstractC0355G.f689A = ((DocumentSnapshot) task.getResult()).getData().get("admob_full").toString();
        AbstractC0355G.f690B = ((DocumentSnapshot) task.getResult()).getData().get("fb_full").toString();
        AbstractC0355G.f691C = ((DocumentSnapshot) task.getResult()).getData().get("admob_rewarded").toString();
        AbstractC0355G.f692D = ((DocumentSnapshot) task.getResult()).getData().get("admob_native").toString();
        AbstractC0355G.f693E = ((DocumentSnapshot) task.getResult()).getData().get("fb_native").toString();
        AbstractC0355G.f694F = ((DocumentSnapshot) task.getResult()).getData().get("admob_open").toString();
        AbstractC0355G.f695G = ((DocumentSnapshot) task.getResult()).getData().get("ad_counter").toString();
    }
}
