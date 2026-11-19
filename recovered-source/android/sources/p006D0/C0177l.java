package p006D0;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import androidx.core.app.NotificationCompat;
import com.google.android.datatransport.cct.CctBackendFactory;
import com.google.android.datatransport.runtime.backends.TransportBackendDiscovery;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.C6459r;
import kotlinx.coroutines.flow.internal.AbortFlowException;
import p001B.AbstractC0076b;
import p001B.C0086l;
import p001B.C0092r;
import p008E0.C0206i;
import p011H.AbstractC0243G;
import p011H.AbstractC0253Q;
import p011H.AbstractC0271e0;
import p011H.C0254S;
import p011H.C0256U;
import p011H.C0275g0;
import p011H.C0279i0;
import p011H.EnumC0244H;
import p011H.EnumC0246J;
import p011H.ExecutorC0247K;
import p011H.InterfaceC0237A;
import p011H.RunnableC0245I;
import p011H.RunnableFutureC0281j0;
import p024O.C0458a;
import p030R.C0544a;
import p030R.C0546b;
import p030R.C0589w0;
import p030R.RunnableC0595z0;
import p033S0.C0613g;
import p033S0.C0616j;
import p034T.C0783s0;
import p036U.C0833n;
import p036U.EnumC0834o;
import p039W.EnumC0861a;
import p040X.C0872a;
import p049b0.C1887c;
import p050c0.InterfaceC1888a;
import p057d0.C6289k;
import p057d0.InterfaceC6279a;
import p062g0.InterfaceC6348c;
import p064h0.EnumC6363a;
import p072l.C6470e;
import p072l.C6471f;
import p074m.InterfaceC6475b;
import p078p0.InterfaceC6502p;
import p078p0.InterfaceC6503q;
import p081r.C6522a;
import p081r.C6530i;
import p081r.C6532k;

/* JADX INFO: renamed from: D0.l */
/* JADX INFO: loaded from: classes.dex */
public final class C0177l implements InterfaceC0170e, InterfaceC0237A, InterfaceC6475b {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ int f331s;

    /* JADX INFO: renamed from: t */
    public Object f332t;

    /* JADX INFO: renamed from: u */
    public Object f333u;

    public /* synthetic */ C0177l(int i2, Object obj, Object obj2) {
        this.f331s = i2;
        this.f333u = obj;
        this.f332t = obj2;
    }

    /* JADX INFO: renamed from: o */
    public static String m269o(C0613g c0613g) {
        long j2 = c0613g.f1342t;
        if (j2 <= 64) {
            return c0613g.m1383K().mo1405f();
        }
        return c0613g.m1384L((int) Math.min(j2, 64L)).mo1405f() + "...";
    }

    /* JADX INFO: renamed from: a */
    public C0546b m270a() {
        if (((IdentityHashMap) this.f332t) != null) {
            for (Map.Entry entry : ((C0546b) this.f333u).f1155a.entrySet()) {
                if (!((IdentityHashMap) this.f332t).containsKey(entry.getKey())) {
                    ((IdentityHashMap) this.f332t).put((C0544a) entry.getKey(), entry.getValue());
                }
            }
            this.f333u = new C0546b((IdentityHashMap) this.f332t);
            this.f332t = null;
        }
        return (C0546b) this.f333u;
    }

    /* JADX INFO: renamed from: c */
    public void m271c() {
        ((RunnableC0595z0) this.f333u).f1309t = true;
        ((ScheduledFuture) this.f332t).cancel(false);
    }

    @Override // p011H.InterfaceC0237A
    public ListenableFuture call() {
        ExecutorC0247K executorC0247K = (ExecutorC0247K) this.f333u;
        int i2 = ExecutorC0247K.f495w;
        if (executorC0247K.compareAndSet(EnumC0246J.f491s, EnumC0246J.f493u)) {
            return ((InterfaceC0237A) this.f332t).call();
        }
        C0254S c0254s = C0254S.f503z;
        return c0254s != null ? c0254s : new C0254S();
    }

    /* JADX WARN: Code duplicated, block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x005c  */
    /* JADX WARN: Code duplicated, block: B:41:0x008e  */
    /* JADX WARN: Code duplicated, block: B:66:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    @Override // p006D0.InterfaceC0170e
    public Object collect(InterfaceC0171f interfaceC0171f, InterfaceC6348c interfaceC6348c) throws Throwable {
        C0176k c0176k;
        Throwable th;
        C0206i c0206i;
        C0177l c0177l;
        InterfaceC0171f interfaceC0171f2;
        InterfaceC0170e interfaceC0170e;
        C0178m c0178m;
        C0177l c0177l2;
        C0184s c0184s;
        C0181p c0181p;
        switch (this.f331s) {
            case 0:
                if (interfaceC6348c instanceof C0176k) {
                    c0176k = (C0176k) interfaceC6348c;
                    int i2 = c0176k.f326t;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        c0176k.f326t = i2 - Integer.MIN_VALUE;
                    } else {
                        c0176k = new C0176k(this, interfaceC6348c);
                    }
                } else {
                    c0176k = new C0176k(this, interfaceC6348c);
                }
                Object obj = c0176k.f325s;
                EnumC6363a enumC6363a = EnumC6363a.f24419s;
                int i3 = c0176k.f326t;
                if (i3 == 0) {
                    AbstractC0243G.m377o(obj);
                    C0206i c0206i2 = new C0206i(interfaceC0171f, c0176k.getContext());
                    try {
                        InterfaceC6502p interfaceC6502p = (InterfaceC6502p) this.f333u;
                        c0176k.f328v = this;
                        c0176k.f329w = interfaceC0171f;
                        c0176k.f330x = c0206i2;
                        c0176k.f326t = 1;
                        if (interfaceC6502p.invoke(c0206i2, c0176k) == enumC6363a) {
                            return enumC6363a;
                        }
                        c0177l = this;
                        interfaceC0171f2 = interfaceC0171f;
                        c0206i = c0206i2;
                        c0206i.releaseIntercepted();
                        interfaceC0170e = (InterfaceC0170e) c0177l.f332t;
                        c0176k.f328v = null;
                        c0176k.f329w = null;
                        c0176k.f330x = null;
                        c0176k.f326t = 2;
                        if (interfaceC0170e.collect(interfaceC0171f2, c0176k) == enumC6363a) {
                            return enumC6363a;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        c0206i = c0206i2;
                        c0206i.releaseIntercepted();
                        throw th;
                    }
                } else if (i3 == 1) {
                    c0206i = c0176k.f330x;
                    interfaceC0171f2 = c0176k.f329w;
                    c0177l = c0176k.f328v;
                    try {
                        AbstractC0243G.m377o(obj);
                        c0206i.releaseIntercepted();
                        interfaceC0170e = (InterfaceC0170e) c0177l.f332t;
                        c0176k.f328v = null;
                        c0176k.f329w = null;
                        c0176k.f330x = null;
                        c0176k.f326t = 2;
                        if (interfaceC0170e.collect(interfaceC0171f2, c0176k) == enumC6363a) {
                            return enumC6363a;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        c0206i.releaseIntercepted();
                        throw th;
                    }
                } else {
                    if (i3 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC0243G.m377o(obj);
                }
                return C6289k.f24318a;
            case 1:
                if (interfaceC6348c instanceof C0178m) {
                    c0178m = (C0178m) interfaceC6348c;
                    int i4 = c0178m.f335t;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        c0178m.f335t = i4 - Integer.MIN_VALUE;
                    } else {
                        c0178m = new C0178m(this, interfaceC6348c);
                    }
                } else {
                    c0178m = new C0178m(this, interfaceC6348c);
                }
                Object objM260b = c0178m.f334s;
                Object obj2 = EnumC6363a.f24419s;
                int i5 = c0178m.f335t;
                if (i5 != 0) {
                    if (i5 == 1) {
                        interfaceC0171f = c0178m.f338w;
                        c0177l2 = c0178m.f337v;
                        AbstractC0243G.m377o(objM260b);
                    } else {
                        if (i5 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC0243G.m377o(objM260b);
                    }
                    return C6289k.f24318a;
                }
                AbstractC0243G.m377o(objM260b);
                InterfaceC0170e interfaceC0170e2 = (InterfaceC0170e) this.f332t;
                c0178m.f337v = this;
                c0178m.f338w = interfaceC0171f;
                c0178m.f335t = 1;
                objM260b = AbstractC0163C.m260b(interfaceC0170e2, interfaceC0171f, c0178m);
                if (objM260b == obj2) {
                    return obj2;
                }
                c0177l2 = this;
                Throwable th4 = (Throwable) objM260b;
                if (th4 != null) {
                    InterfaceC6503q interfaceC6503q = (InterfaceC6503q) c0177l2.f333u;
                    c0178m.f337v = null;
                    c0178m.f338w = null;
                    c0178m.f335t = 2;
                    if (interfaceC6503q.invoke(interfaceC0171f, th4, c0178m) == obj2) {
                        return obj2;
                    }
                }
                return C6289k.f24318a;
            case 2:
                Object objCollect = ((C0177l) this.f332t).collect(new C0183r(new C6459r(), interfaceC0171f, (InterfaceC6502p) this.f333u), interfaceC6348c);
                return objCollect == EnumC6363a.f24419s ? objCollect : C6289k.f24318a;
            default:
                if (interfaceC6348c instanceof C0184s) {
                    c0184s = (C0184s) interfaceC6348c;
                    int i6 = c0184s.f359t;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        c0184s.f359t = i6 - Integer.MIN_VALUE;
                    } else {
                        c0184s = new C0184s(this, interfaceC6348c);
                    }
                } else {
                    c0184s = new C0184s(this, interfaceC6348c);
                }
                Object obj3 = c0184s.f358s;
                EnumC6363a enumC6363a2 = EnumC6363a.f24419s;
                int i7 = c0184s.f359t;
                if (i7 != 0) {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c0181p = c0184s.f361v;
                    try {
                        AbstractC0243G.m377o(obj3);
                    } catch (AbortFlowException e) {
                        e = e;
                        if (e.f24639s != c0181p) {
                            throw e;
                        }
                    }
                    break;
                } else {
                    AbstractC0243G.m377o(obj3);
                    C0177l c0177l3 = (C0177l) this.f332t;
                    C0181p c0181p2 = new C0181p((InterfaceC6502p) this.f333u, interfaceC0171f);
                    try {
                        c0184s.f361v = c0181p2;
                        c0184s.f359t = 1;
                        if (c0177l3.collect(c0181p2, c0184s) == enumC6363a2) {
                            return enumC6363a2;
                        }
                    } catch (AbortFlowException e2) {
                        e = e2;
                        c0181p = c0181p2;
                        if (e.f24639s != c0181p) {
                            throw e;
                        }
                    }
                }
                return C6289k.f24318a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003e  */
    /* JADX WARN: Code duplicated, block: B:17:0x0046  */
    /* JADX WARN: Code duplicated, block: B:20:0x0059  */
    /* JADX INFO: renamed from: d */
    public CctBackendFactory m272d(String str) {
        Bundle bundle;
        Map map;
        Object obj;
        if (((Map) this.f332t) == null) {
            Context context = (Context) this.f333u;
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    Log.w("BackendRegistry", "Context has no PackageManager.");
                } else {
                    ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) TransportBackendDiscovery.class), 128);
                    if (serviceInfo == null) {
                        Log.w("BackendRegistry", "TransportBackendDiscovery has no service info.");
                    } else {
                        bundle = serviceInfo.metaData;
                    }
                    if (bundle == null) {
                        Log.w("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
                        map = Collections.EMPTY_MAP;
                    } else {
                        HashMap map2 = new HashMap();
                        for (String str2 : bundle.keySet()) {
                            obj = bundle.get(str2);
                            if (!(obj instanceof String) && str2.startsWith("backend:")) {
                                for (String str3 : ((String) obj).split(",", -1)) {
                                    String strTrim = str3.trim();
                                    if (!strTrim.isEmpty()) {
                                        map2.put(strTrim, str2.substring(8));
                                    }
                                }
                            }
                        }
                        map = map2;
                    }
                    this.f332t = map;
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("BackendRegistry", "Application info not found.");
            }
            bundle = null;
            if (bundle == null) {
                Log.w("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
                map = Collections.EMPTY_MAP;
            } else {
                HashMap map3 = new HashMap();
                while (r6.hasNext()) {
                    obj = bundle.get(str2);
                    if (!(obj instanceof String)) {
                    }
                }
                map = map3;
            }
            this.f332t = map;
        }
        String str4 = (String) ((Map) this.f332t).get(str);
        if (str4 == null) {
            return null;
        }
        try {
            return (CctBackendFactory) Class.forName(str4).asSubclass(CctBackendFactory.class).getDeclaredConstructor(null).newInstance(null);
        } catch (ClassNotFoundException e) {
            Log.w("BackendRegistry", "Class " + str4 + " is not found.", e);
            return null;
        } catch (IllegalAccessException e2) {
            Log.w("BackendRegistry", "Could not instantiate " + str4 + ".", e2);
            return null;
        } catch (InstantiationException e3) {
            Log.w("BackendRegistry", "Could not instantiate " + str4 + ".", e3);
            return null;
        } catch (NoSuchMethodException e4) {
            Log.w("BackendRegistry", "Could not instantiate ".concat(str4), e4);
            return null;
        } catch (InvocationTargetException e5) {
            Log.w("BackendRegistry", "Could not instantiate ".concat(str4), e5);
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    public void m273e(String str, String str2) {
        ArrayList arrayList = ((C0783s0) this.f332t).f2033b;
        if (str.isEmpty()) {
            throw new IllegalArgumentException("name is empty");
        }
        int length = str.length();
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            char cCharAt = str.charAt(i3);
            if (cCharAt <= 31 || cCharAt >= 127) {
                throw new IllegalArgumentException(String.format(Locale.US, "Unexpected char %#04x at %d in header name: %s", Integer.valueOf(cCharAt), Integer.valueOf(i3), str));
            }
        }
        if (str2 == null) {
            throw new IllegalArgumentException("value == null");
        }
        int length2 = str2.length();
        for (int i4 = 0; i4 < length2; i4++) {
            char cCharAt2 = str2.charAt(i4);
            if (cCharAt2 <= 31 || cCharAt2 >= 127) {
                throw new IllegalArgumentException(String.format(Locale.US, "Unexpected char %#04x at %d in header value: %s", Integer.valueOf(cCharAt2), Integer.valueOf(i4), str2));
            }
        }
        while (i2 < arrayList.size()) {
            if (str.equalsIgnoreCase((String) arrayList.get(i2))) {
                arrayList.remove(i2);
                arrayList.remove(i2);
                i2 -= 2;
            }
            i2 += 2;
        }
        arrayList.add(str);
        arrayList.add(str2.trim());
    }

    /* JADX INFO: renamed from: f */
    public boolean m274f() {
        return ((Logger) this.f333u).isLoggable((Level) this.f332t);
    }

    /* JADX INFO: renamed from: g */
    public void m275g(int i2, int i3, C0613g c0613g, int i4, boolean z) {
        if (m274f()) {
            ((Logger) this.f333u).log((Level) this.f332t, AbstractC0271e0.m417y(i2) + " DATA: streamId=" + i3 + " endStream=" + z + " length=" + i4 + " bytes=" + m269o(c0613g));
        }
    }

    @Override // p050c0.InterfaceC1888a
    public Object get() {
        switch (this.f331s) {
            case 16:
                return new C6471f((Context) ((C0092r) this.f333u).f130t, (C6470e) ((C0092r) this.f332t).get());
            default:
                C1887c c1887c = new C1887c(11);
                C1887c c1887c2 = new C1887c(10);
                Object obj = ((InterfaceC1888a) this.f333u).get();
                InterfaceC1888a interfaceC1888a = (InterfaceC1888a) this.f332t;
                return new C6530i(c1887c, c1887c2, C6522a.f24736f, (C6532k) obj, interfaceC1888a);
        }
    }

    /* JADX INFO: renamed from: h */
    public void m276h(int i2, int i3, EnumC0861a enumC0861a, C0616j c0616j) {
        if (m274f()) {
            Logger logger = (Logger) this.f333u;
            Level level = (Level) this.f332t;
            StringBuilder sb = new StringBuilder();
            sb.append(AbstractC0271e0.m417y(i2));
            sb.append(" GO_AWAY: lastStreamId=");
            sb.append(i3);
            sb.append(" errorCode=");
            sb.append(enumC0861a);
            sb.append(" length=");
            sb.append(c0616j.mo1404e());
            sb.append(" bytes=");
            C0613g c0613g = new C0613g();
            c0613g.m1386N(c0616j);
            sb.append(m269o(c0613g));
            logger.log(level, sb.toString());
        }
    }

    /* JADX INFO: renamed from: i */
    public void m277i(int i2, long j2) {
        if (m274f()) {
            ((Logger) this.f333u).log((Level) this.f332t, AbstractC0271e0.m417y(i2) + " PING: ack=false bytes=" + j2);
        }
    }

    /* JADX INFO: renamed from: j */
    public void m278j(int i2, int i3, EnumC0861a enumC0861a) {
        if (m274f()) {
            ((Logger) this.f333u).log((Level) this.f332t, AbstractC0271e0.m417y(i2) + " RST_STREAM: streamId=" + i3 + " errorCode=" + enumC0861a);
        }
    }

    /* JADX INFO: renamed from: k */
    public void m279k(int i2, C0458a c0458a) {
        if (m274f()) {
            Logger logger = (Logger) this.f333u;
            Level level = (Level) this.f332t;
            StringBuilder sb = new StringBuilder();
            sb.append(AbstractC0271e0.m417y(i2));
            sb.append(" SETTINGS: ack=false settings=");
            EnumMap enumMap = new EnumMap(EnumC0834o.class);
            for (EnumC0834o enumC0834o : EnumC0834o.values()) {
                if (c0458a.m973g(enumC0834o.f2283s)) {
                    enumMap.put(enumC0834o, Integer.valueOf(c0458a.f784c[enumC0834o.f2283s]));
                }
            }
            sb.append(enumMap.toString());
            logger.log(level, sb.toString());
        }
    }

    /* JADX INFO: renamed from: l */
    public void m280l(long j2, int i2, int i3) {
        if (m274f()) {
            ((Logger) this.f333u).log((Level) this.f332t, AbstractC0271e0.m417y(i2) + " WINDOW_UPDATE: streamId=" + i3 + " windowSizeIncrement=" + j2);
        }
    }

    /* JADX INFO: renamed from: m */
    public void m281m(C0544a c0544a, Object obj) {
        if (((IdentityHashMap) this.f332t) == null) {
            this.f332t = new IdentityHashMap(1);
        }
        ((IdentityHashMap) this.f332t).put(c0544a, obj);
    }

    /* JADX INFO: renamed from: n */
    public ListenableFuture m282n(InterfaceC0237A interfaceC0237A, Executor executor) {
        executor.getClass();
        ExecutorC0247K executorC0247K = new ExecutorC0247K(EnumC0246J.f491s);
        executorC0247K.f497t = executor;
        executorC0247K.f496s = this;
        C0177l c0177l = new C0177l(4, executorC0247K, interfaceC0237A);
        C0275g0 c0275g0 = new C0275g0();
        ListenableFuture listenableFuture = (ListenableFuture) ((AtomicReference) this.f333u).getAndSet(c0275g0);
        RunnableFutureC0281j0 runnableFutureC0281j0 = new RunnableFutureC0281j0();
        runnableFutureC0281j0.f553A = new C0279i0(runnableFutureC0281j0, c0177l);
        listenableFuture.addListener(runnableFutureC0281j0, executorC0247K);
        ListenableFuture listenableFutureM382e = AbstractC0253Q.m382e(runnableFutureC0281j0);
        RunnableC0245I runnableC0245I = new RunnableC0245I(runnableFutureC0281j0, c0275g0, listenableFuture, listenableFutureM382e, executorC0247K, 0);
        EnumC0244H enumC0244H = EnumC0244H.f483s;
        listenableFutureM382e.addListener(runnableC0245I, enumC0244H);
        runnableFutureC0281j0.addListener(runnableC0245I, enumC0244H);
        return listenableFutureM382e;
    }

    public String toString() {
        switch (this.f331s) {
            case 4:
                return ((InterfaceC0237A) this.f332t).toString();
            case 12:
                return "Request{url=" + ((C0872a) this.f333u) + '}';
            default:
                return super.toString();
        }
    }

    public /* synthetic */ C0177l(InterfaceC0170e interfaceC0170e, InterfaceC6279a interfaceC6279a, int i2) {
        this.f331s = i2;
        this.f332t = interfaceC0170e;
        this.f333u = interfaceC6279a;
    }

    public C0177l(C0177l c0177l) {
        this.f331s = 12;
        this.f333u = (C0872a) c0177l.f333u;
        C0783s0 c0783s0 = (C0783s0) c0177l.f332t;
        c0783s0.getClass();
        this.f332t = new C0092r(c0783s0);
    }

    public C0177l(C0589w0 c0589w0, Object obj) {
        this.f331s = 8;
        AbstractC0076b.m133h(c0589w0, NotificationCompat.CATEGORY_STATUS);
        this.f333u = c0589w0;
        this.f332t = obj;
    }

    public C0177l(Context context) {
        this.f331s = 15;
        this.f332t = null;
        this.f333u = context;
    }

    public C0177l(int i2) {
        this.f331s = i2;
        switch (i2) {
            case 10:
                Level level = Level.FINE;
                Logger logger = Logger.getLogger(C0833n.class.getName());
                AbstractC0076b.m133h(level, FirebaseAnalytics.Param.LEVEL);
                this.f332t = level;
                AbstractC0076b.m133h(logger, "logger");
                this.f333u = logger;
                break;
            case 11:
                break;
            case 12:
            case 13:
            default:
                this.f333u = new AtomicReference(C0256U.f504t);
                this.f332t = new C0086l(1);
                break;
            case 14:
                this.f333u = new AtomicLong();
                this.f332t = new AtomicLong();
                break;
        }
    }

    public C0177l(C0546b c0546b) {
        this.f331s = 7;
        this.f333u = c0546b;
    }

    public C0177l(RunnableC0595z0 runnableC0595z0, ScheduledFuture scheduledFuture) {
        this.f331s = 9;
        this.f333u = runnableC0595z0;
        AbstractC0076b.m133h(scheduledFuture, "future");
        this.f332t = scheduledFuture;
    }
}
