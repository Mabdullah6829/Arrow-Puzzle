package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.ads.zzawu;
import com.google.android.gms.internal.ads.zzawv;
import com.google.android.gms.internal.ads.zzazt;
import com.google.android.gms.internal.ads.zzbak;
import com.google.android.gms.internal.ads.zzbao;
import com.google.android.gms.internal.ads.zzbar;
import com.google.android.gms.internal.ads.zzbas;
import com.google.android.gms.internal.ads.zzbat;
import com.google.android.gms.internal.ads.zzbau;
import com.google.android.gms.internal.ads.zzbav;
import com.google.android.gms.internal.ads.zzbaz;
import com.google.android.gms.internal.ads.zzbbc;
import com.google.android.gms.internal.ads.zzbca;
import com.google.android.gms.internal.ads.zzbci;
import com.google.android.gms.internal.ads.zzbei;
import com.google.android.gms.internal.ads.zzbio;
import com.google.android.gms.internal.ads.zzbiv;
import com.google.android.gms.internal.ads.zzbix;
import com.google.android.gms.internal.ads.zzcfy;
import com.google.android.gms.internal.ads.zzfxq;
import com.google.android.gms.internal.ads.zzfyn;
import com.google.android.gms.internal.ads.zzfzh;
import com.google.android.gms.internal.ads.zzgax;
import com.google.android.gms.internal.ads.zzhay;
import com.google.android.gms.internal.ads.zzhcf;
import java.io.File;
import java.util.Vector;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class zzk implements Runnable, zzbar {

    /* JADX INFO: renamed from: H */
    public static final long f3658H = System.currentTimeMillis();

    /* JADX INFO: renamed from: A */
    public Context f3659A;

    /* JADX INFO: renamed from: B */
    public final Context f3660B;

    /* JADX INFO: renamed from: C */
    public VersionInfoParcel f3661C;

    /* JADX INFO: renamed from: D */
    public final VersionInfoParcel f3662D;

    /* JADX INFO: renamed from: E */
    public final boolean f3663E;

    /* JADX INFO: renamed from: G */
    public int f3665G;

    /* JADX INFO: renamed from: v */
    public boolean f3669v;

    /* JADX INFO: renamed from: w */
    public final boolean f3670w;

    /* JADX INFO: renamed from: x */
    public final boolean f3671x;

    /* JADX INFO: renamed from: y */
    public final ExecutorService f3672y;

    /* JADX INFO: renamed from: z */
    public final zzfxq f3673z;

    /* JADX INFO: renamed from: s */
    public final Vector f3666s = new Vector();

    /* JADX INFO: renamed from: t */
    public final AtomicReference f3667t = new AtomicReference();

    /* JADX INFO: renamed from: u */
    public final AtomicReference f3668u = new AtomicReference();

    /* JADX INFO: renamed from: F */
    public final CountDownLatch f3664F = new CountDownLatch(1);

    public zzk(Context context, VersionInfoParcel versionInfoParcel) {
        this.f3659A = context;
        this.f3660B = context;
        this.f3661C = versionInfoParcel;
        this.f3662D = versionInfoParcel;
        ExecutorService executorServiceNewCachedThreadPool = Executors.newCachedThreadPool();
        this.f3672y = executorServiceNewCachedThreadPool;
        zzbio zzbioVar = zzbix.f8592j3;
        zzba zzbaVar = zzba.f3095e;
        boolean zBooleanValue = ((Boolean) zzbaVar.f3098c.m5030a(zzbioVar)).booleanValue();
        this.f3663E = zBooleanValue;
        this.f3673z = zzfxq.m6760a(context, executorServiceNewCachedThreadPool, zBooleanValue);
        zzbio zzbioVar2 = zzbix.f8542g3;
        zzbiv zzbivVar = zzbaVar.f3098c;
        this.f3670w = ((Boolean) zzbivVar.m5030a(zzbioVar2)).booleanValue();
        this.f3671x = ((Boolean) zzbivVar.m5030a(zzbix.f8609k3)).booleanValue();
        if (((Boolean) zzbivVar.m5030a(zzbix.f8576i3)).booleanValue()) {
            this.f3665G = 2;
        } else {
            this.f3665G = 1;
        }
        if (!((Boolean) zzbivVar.m5030a(zzbix.f8678o4)).booleanValue()) {
            this.f3669v = m3265l();
        }
        if (((Boolean) zzbivVar.m5030a(zzbix.f8610k4)).booleanValue()) {
            zzcfy.f9946a.execute(this);
            return;
        }
        com.google.android.gms.ads.internal.util.client.zzf zzfVar = zzay.f3085g.f3086a;
        zzgax zzgaxVar = com.google.android.gms.ads.internal.util.client.zzf.f3409b;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            zzcfy.f9946a.execute(this);
        } else {
            run();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbar
    /* JADX INFO: renamed from: a */
    public final void mo3254a(int i2, int i3, int i4) {
        zzbar zzbarVarM3268o = m3268o();
        if (zzbarVarM3268o == null) {
            this.f3666s.add(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)});
        } else {
            m3266m();
            try {
                zzbarVarM3268o.mo3254a(i2, i3, i4);
            } catch (NullPointerException unused) {
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbar
    /* JADX INFO: renamed from: b */
    public final void mo3255b(MotionEvent motionEvent) {
        zzbar zzbarVarM3268o = m3268o();
        if (zzbarVarM3268o == null) {
            this.f3666s.add(new Object[]{motionEvent});
            return;
        }
        m3266m();
        try {
            zzbarVarM3268o.mo3255b(motionEvent);
        } catch (NullPointerException unused) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbar
    /* JADX INFO: renamed from: c */
    public final String mo3256c(Context context, String str, View view, Activity activity) {
        if (!m3263j()) {
            return "";
        }
        zzbar zzbarVarM3268o = m3268o();
        if (((Boolean) zzba.f3095e.f3098c.m5030a(zzbix.f8466bc)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zzs zzsVar = zzt.f3698C.f3703c;
            com.google.android.gms.ads.internal.util.zzs.m3211j(view, 4);
        }
        if (zzbarVarM3268o == null) {
            return "";
        }
        m3266m();
        try {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            return zzbarVarM3268o.mo3256c(context, str, view, activity);
        } catch (NullPointerException unused) {
            return "";
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbar
    /* JADX INFO: renamed from: d */
    public final String mo3257d(final Context context) {
        try {
            return (String) ((zzhay) zzhcf.m7369c(this.f3672y, new Callable() { // from class: com.google.android.gms.ads.internal.zzj
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    return this.f3656a.m3264k(context);
                }
            })).get(((Integer) zzba.f3095e.f3098c.m5030a(zzbix.f8830x3)).intValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException unused) {
            return Integer.toString(17);
        } catch (TimeoutException unused2) {
            return zzbak.m4683a(context, this.f3662D.f3396s, f3658H);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbar
    /* JADX INFO: renamed from: e */
    public final void mo3258e(StackTraceElement[] stackTraceElementArr) {
        zzbar zzbarVarM3268o;
        zzbar zzbarVarM3268o2;
        if (((Boolean) zzba.f3095e.f3098c.m5030a(zzbix.f8057D3)).booleanValue()) {
            if (this.f3664F.getCount() != 0 || (zzbarVarM3268o2 = m3268o()) == null) {
                return;
            }
            try {
                zzbarVarM3268o2.mo3258e(stackTraceElementArr);
                return;
            } catch (NullPointerException unused) {
                return;
            }
        }
        if (!m3263j() || (zzbarVarM3268o = m3268o()) == null) {
            return;
        }
        try {
            zzbarVarM3268o.mo3258e(stackTraceElementArr);
        } catch (NullPointerException unused2) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbar
    /* JADX INFO: renamed from: f */
    public final String mo3259f(Context context) {
        return m3264k(context);
    }

    @Override // com.google.android.gms.internal.ads.zzbar
    /* JADX INFO: renamed from: g */
    public final void mo3260g(View view) {
        zzbar zzbarVarM3268o = m3268o();
        if (zzbarVarM3268o != null) {
            try {
                zzbarVarM3268o.mo3260g(view);
            } catch (NullPointerException unused) {
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbar
    /* JADX INFO: renamed from: h */
    public final String mo3261h(Context context, String str, View view) {
        return mo3256c(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.zzbar
    /* JADX INFO: renamed from: i */
    public final String mo3262i(Context context, View view, Activity activity) {
        zzbio zzbioVar = zzbix.f8449ac;
        zzba zzbaVar = zzba.f3095e;
        zzbiv zzbivVar = zzbaVar.f3098c;
        zzbiv zzbivVar2 = zzbaVar.f3098c;
        try {
            if (!((Boolean) zzbivVar.m5030a(zzbioVar)).booleanValue()) {
                zzbar zzbarVarM3268o = m3268o();
                if (((Boolean) zzbivVar2.m5030a(zzbix.f8466bc)).booleanValue()) {
                    com.google.android.gms.ads.internal.util.zzs zzsVar = zzt.f3698C.f3703c;
                    com.google.android.gms.ads.internal.util.zzs.m3211j(view, 2);
                }
                return zzbarVarM3268o != null ? zzbarVarM3268o.mo3262i(context, view, activity) : "";
            }
            if (!m3263j()) {
                return "";
            }
            zzbar zzbarVarM3268o2 = m3268o();
            if (((Boolean) zzbivVar2.m5030a(zzbix.f8466bc)).booleanValue()) {
                com.google.android.gms.ads.internal.util.zzs zzsVar2 = zzt.f3698C.f3703c;
                com.google.android.gms.ads.internal.util.zzs.m3211j(view, 2);
            }
            return zzbarVarM3268o2 != null ? zzbarVarM3268o2.mo3262i(context, view, activity) : "";
        } catch (NullPointerException unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: j */
    public final boolean m3263j() {
        try {
            this.f3664F.await();
            return true;
        } catch (InterruptedException e) {
            int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3074g("Interrupted during GADSignals creation.", e);
            return false;
        }
    }

    /* JADX INFO: renamed from: k */
    public final String m3264k(Context context) {
        zzbar zzbarVarM3268o;
        if (!m3263j() || (zzbarVarM3268o = m3268o()) == null) {
            return "";
        }
        m3266m();
        try {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            return zzbarVarM3268o.mo3259f(context);
        } catch (NullPointerException unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: l */
    public final boolean m3265l() {
        Context context = this.f3659A;
        zzh zzhVar = new zzh(this);
        zzfzh zzfzhVar = new zzfzh(context, zzfyn.m6787b(context, this.f3673z), zzhVar, ((Boolean) zzba.f3095e.f3098c.m5030a(zzbix.f8559h3)).booleanValue());
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (zzfzh.f16844f) {
            try {
                zzbei zzbeiVarM6817f = zzfzhVar.m6817f(1);
                if (zzbeiVarM6817f == null) {
                    zzfzhVar.m6816e(4025, jCurrentTimeMillis);
                    return false;
                }
                File fileM6815c = zzfzhVar.m6815c(zzbeiVarM6817f.m4796D());
                if (!new File(fileM6815c, "pcam.jar").exists()) {
                    zzfzhVar.m6816e(4026, jCurrentTimeMillis);
                    return false;
                }
                if (new File(fileM6815c, "pcbc").exists()) {
                    zzfzhVar.m6816e(5019, jCurrentTimeMillis);
                    return true;
                }
                zzfzhVar.m6816e(4027, jCurrentTimeMillis);
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m3266m() {
        zzbar zzbarVarM3268o = m3268o();
        Vector<Object[]> vector = this.f3666s;
        if (vector.isEmpty() || zzbarVarM3268o == null) {
            return;
        }
        for (Object[] objArr : vector) {
            try {
                int length = objArr.length;
                if (length == 1) {
                    zzbarVarM3268o.mo3255b((MotionEvent) objArr[0]);
                } else if (length == 3) {
                    zzbarVarM3268o.mo3254a(((Integer) objArr[0]).intValue(), ((Integer) objArr[1]).intValue(), ((Integer) objArr[2]).intValue());
                }
            } catch (NullPointerException unused) {
            }
        }
        vector.clear();
    }

    /* JADX INFO: renamed from: n */
    public final void m3267n(boolean z) {
        String str = this.f3661C.f3396s;
        Context context = this.f3659A;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        zzawu zzawuVarM4485H = zzawv.m4485H();
        zzawuVarM4485H.m8326l();
        ((zzawv) zzawuVarM4485H.f19780t).m4491J(z);
        zzawuVarM4485H.m8326l();
        ((zzawv) zzawuVarM4485H.f19780t).m4490I(str);
        zzbat zzbatVar = new zzbat((zzawv) zzawuVarM4485H.m8328o());
        synchronized (zzbau.class) {
            if (!zzbau.f7490Q) {
                zzbau.f7491R = System.currentTimeMillis() / 1000;
                zzbas.f7465M = zzbau.m4699q(context, zzbatVar.f7486a);
                zzbau.f7492S = zzbbc.m4718a(context);
                ExecutorService executorService = zzbas.f7465M.f7548b;
                zzbau.f7493T = zzbci.m4749a(context, executorService);
                zzbau.f7494U = new zzbca();
                zzbaz zzbazVar = new zzbaz(context, executorService);
                zzbau.f7496W = zzbazVar;
                zzbau.f7495V = new zzazt(context, executorService, zzbatVar.f7488c, zzbazVar);
                zzbau.f7490Q = true;
            }
        }
        this.f3667t.set(new zzbav(context, zzbatVar));
    }

    /* JADX INFO: renamed from: o */
    public final zzbar m3268o() {
        return ((!this.f3670w || this.f3669v) ? this.f3665G : 1) == 2 ? (zzbar) this.f3668u.get() : (zzbar) this.f3667t.get();
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        try {
            zzbio zzbioVar = zzbix.f8678o4;
            zzba zzbaVar = zzba.f3095e;
            if (((Boolean) zzbaVar.f3098c.m5030a(zzbioVar)).booleanValue()) {
                this.f3669v = m3265l();
            }
            boolean z2 = this.f3661C.f3399v;
            final boolean z3 = false;
            if (!((Boolean) zzbaVar.f3098c.m5030a(zzbix.f8072E1)).booleanValue() && z2) {
                z3 = true;
            }
            if (((!this.f3670w || this.f3669v) ? this.f3665G : 1) == 1) {
                m3267n(z3);
                if (this.f3665G == 2) {
                    this.f3672y.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.zzi
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzk zzkVar = this.f3654s;
                            boolean z4 = z3;
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            try {
                                Context context = zzkVar.f3660B;
                                VersionInfoParcel versionInfoParcel = zzkVar.f3662D;
                                boolean z5 = zzkVar.f3663E;
                                zzawu zzawuVarM4485H = zzawv.m4485H();
                                zzawuVarM4485H.m8326l();
                                ((zzawv) zzawuVarM4485H.f19780t).m4491J(z4);
                                String str = versionInfoParcel.f3396s;
                                zzawuVarM4485H.m8326l();
                                ((zzawv) zzawuVarM4485H.f19780t).m4490I(str);
                                zzawv zzawvVar = (zzawv) zzawuVarM4485H.m8328o();
                                Context applicationContext = context.getApplicationContext();
                                if (applicationContext != null) {
                                    context = applicationContext;
                                }
                                zzbao.m4685j(context, zzawvVar, z5).m4688l();
                            } catch (NullPointerException e) {
                                zzkVar.f3673z.mo6762c(2027, System.currentTimeMillis() - jCurrentTimeMillis, e);
                            }
                        }
                    });
                }
            } else {
                long jCurrentTimeMillis = System.currentTimeMillis();
                try {
                    Context context = this.f3659A;
                    VersionInfoParcel versionInfoParcel = this.f3661C;
                    boolean z4 = this.f3663E;
                    zzawu zzawuVarM4485H = zzawv.m4485H();
                    zzawuVarM4485H.m8326l();
                    ((zzawv) zzawuVarM4485H.f19780t).m4491J(z3);
                    String str = versionInfoParcel.f3396s;
                    zzawuVarM4485H.m8326l();
                    ((zzawv) zzawuVarM4485H.f19780t).m4490I(str);
                    zzawv zzawvVar = (zzawv) zzawuVarM4485H.m8328o();
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext != null) {
                        context = applicationContext;
                    }
                    zzbao zzbaoVarM4685j = zzbao.m4685j(context, zzawvVar, z4);
                    this.f3668u.set(zzbaoVarM4685j);
                    if (this.f3671x) {
                        synchronized (zzbaoVarM4685j) {
                            z = zzbaoVarM4685j.f7450I;
                        }
                        if (!z) {
                            this.f3665G = 1;
                            m3267n(z3);
                        }
                    }
                } catch (NullPointerException e) {
                    this.f3665G = 1;
                    m3267n(z3);
                    this.f3673z.mo6762c(2031, System.currentTimeMillis() - jCurrentTimeMillis, e);
                }
            }
            this.f3664F.countDown();
            this.f3659A = null;
            this.f3661C = null;
        } catch (Throwable th) {
            this.f3664F.countDown();
            this.f3659A = null;
            this.f3661C = null;
            throw th;
        }
    }
}
