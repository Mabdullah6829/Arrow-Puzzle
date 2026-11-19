package p036U;

import androidx.core.internal.view.SupportMenu;
import androidx.core.location.LocationRequestCompat;
import java.util.EnumSet;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import javax.net.ssl.SSLSocketFactory;
import p001B.C0092r;
import p030R.AbstractC0516A;
import p030R.AbstractC0542Y;
import p030R.EnumC0521C0;
import p034T.AbstractC0759m0;
import p034T.C0664K0;
import p034T.C0724d1;
import p034T.C0785s2;
import p034T.C0793u2;
import p038V.C0848b;
import p038V.C0849c;
import p038V.EnumC0847a;
import p038V.EnumC0859m;
import p049b0.C1887c;

/* JADX INFO: renamed from: U.h */
/* JADX INFO: loaded from: classes.dex */
public final class C0827h extends AbstractC0516A {

    /* JADX INFO: renamed from: m */
    public static final C0849c f2194m;

    /* JADX INFO: renamed from: n */
    public static final long f2195n;

    /* JADX INFO: renamed from: o */
    public static final C0092r f2196o;

    /* JADX INFO: renamed from: a */
    public final C0724d1 f2197a;

    /* JADX INFO: renamed from: e */
    public SSLSocketFactory f2201e;

    /* JADX INFO: renamed from: b */
    public final C0785s2 f2198b = C0793u2.f2058v;

    /* JADX INFO: renamed from: c */
    public final C0092r f2199c = f2196o;

    /* JADX INFO: renamed from: d */
    public final C0092r f2200d = new C0092r(AbstractC0759m0.f1935q, 8);

    /* JADX INFO: renamed from: f */
    public final C0849c f2202f = f2194m;

    /* JADX INFO: renamed from: g */
    public int f2203g = 1;

    /* JADX INFO: renamed from: h */
    public long f2204h = LocationRequestCompat.PASSIVE_INTERVAL;

    /* JADX INFO: renamed from: i */
    public final long f2205i = AbstractC0759m0.f1930l;

    /* JADX INFO: renamed from: j */
    public final int f2206j = SupportMenu.USER_MASK;

    /* JADX INFO: renamed from: k */
    public final int f2207k = 4194304;

    /* JADX INFO: renamed from: l */
    public final int f2208l = Integer.MAX_VALUE;

    static {
        Logger.getLogger(C0827h.class.getName());
        C0848b c0848b = new C0848b(C0849c.f2336e);
        c0848b.m1758a(EnumC0847a.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, EnumC0847a.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, EnumC0847a.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384, EnumC0847a.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384, EnumC0847a.f2319F, EnumC0847a.f2318E);
        c0848b.m1759b(EnumC0859m.TLS_1_2);
        if (!c0848b.f2332a) {
            throw new IllegalStateException("no TLS extensions for cleartext connections");
        }
        c0848b.f2335d = true;
        f2194m = new C0849c(c0848b);
        f2195n = TimeUnit.DAYS.toNanos(1000L);
        f2196o = new C0092r(new C1887c(4), 8);
        EnumSet.of(EnumC0521C0.f1101s, EnumC0521C0.f1102t);
    }

    public C0827h(String str) {
        this.f2197a = new C0724d1(str, new C0825f(this), new C0825f(this));
    }

    @Override // p030R.AbstractC0542Y
    /* JADX INFO: renamed from: b */
    public final void mo1238b() {
        long nanos = TimeUnit.SECONDS.toNanos(30L);
        this.f2204h = nanos;
        long jMax = Math.max(nanos, C0664K0.f1484k);
        this.f2204h = jMax;
        if (jMax >= f2195n) {
            this.f2204h = LocationRequestCompat.PASSIVE_INTERVAL;
        }
    }

    @Override // p030R.AbstractC0516A
    /* JADX INFO: renamed from: c */
    public final AbstractC0542Y mo1233c() {
        return this.f2197a;
    }
}
