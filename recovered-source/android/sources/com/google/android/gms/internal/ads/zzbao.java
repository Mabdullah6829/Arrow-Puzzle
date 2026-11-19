package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbao implements zzbar {

    /* JADX INFO: renamed from: J */
    public static zzbao f7441J;

    /* JADX INFO: renamed from: A */
    public final zzfzg f7442A;

    /* JADX INFO: renamed from: C */
    public final zzbci f7444C;

    /* JADX INFO: renamed from: D */
    public final zzbca f7445D;

    /* JADX INFO: renamed from: E */
    public final zzbbr f7446E;

    /* JADX INFO: renamed from: H */
    public volatile boolean f7449H;

    /* JADX INFO: renamed from: I */
    public volatile boolean f7450I;

    /* JADX INFO: renamed from: s */
    public final Context f7451s;

    /* JADX INFO: renamed from: t */
    public final zzfza f7452t;

    /* JADX INFO: renamed from: u */
    public final zzfzh f7453u;

    /* JADX INFO: renamed from: v */
    public final zzfzj f7454v;

    /* JADX INFO: renamed from: w */
    public final zzbbt f7455w;

    /* JADX INFO: renamed from: x */
    public final zzfxq f7456x;

    /* JADX INFO: renamed from: y */
    public final Executor f7457y;

    /* JADX INFO: renamed from: z */
    public final zzbdz f7458z;

    /* JADX INFO: renamed from: F */
    public volatile long f7447F = 0;

    /* JADX INFO: renamed from: G */
    public final Object f7448G = new Object();

    /* JADX INFO: renamed from: B */
    public final CountDownLatch f7443B = new CountDownLatch(1);

    public zzbao(Context context, zzfxq zzfxqVar, zzfza zzfzaVar, zzfzh zzfzhVar, zzfzj zzfzjVar, zzbbt zzbbtVar, Executor executor, zzfxl zzfxlVar, zzbdz zzbdzVar, zzbci zzbciVar, zzbca zzbcaVar, zzbbr zzbbrVar) {
        this.f7450I = false;
        this.f7451s = context;
        this.f7456x = zzfxqVar;
        this.f7452t = zzfzaVar;
        this.f7453u = zzfzhVar;
        this.f7454v = zzfzjVar;
        this.f7455w = zzbbtVar;
        this.f7457y = executor;
        this.f7458z = zzbdzVar;
        this.f7444C = zzbciVar;
        this.f7445D = zzbcaVar;
        this.f7446E = zzbbrVar;
        this.f7450I = false;
        this.f7442A = new zzbam(this, zzfxlVar);
    }

    /* JADX INFO: renamed from: j */
    public static synchronized zzbao m4685j(Context context, zzawv zzawvVar, boolean z) {
        zzfxu zzfxuVar;
        zzfxuVar = new zzfxu();
        zzfxuVar.f16770b = false;
        byte b = (byte) (zzfxuVar.f16774f | 1);
        zzfxuVar.f16771c = true;
        zzfxuVar.f16772d = 100L;
        zzfxuVar.f16773e = 300L;
        zzfxuVar.f16774f = (byte) (((byte) (((byte) (((byte) (((byte) (b | 2)) | 4)) | 8)) | 16)) | 32);
        String strM4486D = zzawvVar.m4486D();
        if (strM4486D == null) {
            throw new NullPointerException("Null clientVersion");
        }
        zzfxuVar.f16769a = strM4486D;
        zzfxuVar.f16770b = zzawvVar.m4487E();
        zzfxuVar.f16774f = (byte) (zzfxuVar.f16774f | 1);
        return m4686n(context, Executors.newCachedThreadPool(), zzfxuVar.m6770a(), z);
    }

    /* JADX INFO: renamed from: n */
    public static synchronized zzbao m4686n(Context context, ExecutorService executorService, zzfxs zzfxsVar, boolean z) {
        try {
            if (f7441J == null) {
                zzfxq zzfxqVarM6760a = zzfxq.m6760a(context, executorService, z);
                zzbbc zzbbcVarM4718a = zzbbc.m4718a(context);
                zzbci zzbciVarM4749a = zzbci.m4749a(context, executorService);
                zzbca zzbcaVar = new zzbca();
                zzbbr zzbbrVar = new zzbbr();
                final zzfyg zzfygVar = new zzfyg(context, executorService, zzfxqVarM6760a, new zzfyc());
                Task taskM10773c = Tasks.m10773c(executorService, new Callable() { // from class: com.google.android.gms.internal.ads.zzfye
                    @Override // java.util.concurrent.Callable
                    public final /* synthetic */ Object call() throws PackageManager.NameNotFoundException {
                        Context context2 = zzfygVar.f16804a;
                        return zzfxx.m6773a(context2, context2.getPackageName(), Integer.toString(context2.getPackageManager().getPackageInfo(context2.getPackageName(), 0).versionCode));
                    }
                });
                taskM10773c.addOnFailureListener(executorService, new OnFailureListener() { // from class: com.google.android.gms.internal.ads.zzfyd
                    @Override // com.google.android.gms.tasks.OnFailureListener
                    public final /* synthetic */ void onFailure(Exception exc) {
                        if (exc instanceof InterruptedException) {
                            Thread.currentThread().interrupt();
                        }
                        zzfygVar.f16806c.mo6762c(2025, -1L, exc);
                    }
                });
                zzfygVar.f16807d = taskM10773c;
                zzbbs zzbbsVar = new zzbbs(context);
                zzbbt zzbbtVar = new zzbbt(zzfxsVar, zzfygVar, new zzbcg(context, zzbbsVar), zzbbsVar, zzbbcVarM4718a, zzbciVarM4749a, zzbcaVar, zzbbrVar);
                zzbdz zzbdzVarM6787b = zzfyn.m6787b(context, zzfxqVarM6760a);
                zzfxl zzfxlVar = new zzfxl();
                zzbao zzbaoVar = new zzbao(context, zzfxqVarM6760a, new zzfza(context, zzbdzVarM6787b), new zzfzh(context, zzbdzVarM6787b, new zzbal(zzfxqVarM6760a), ((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8559h3)).booleanValue()), new zzfzj(context, zzbbtVar, zzfxqVarM6760a, zzfxlVar, false), zzbbtVar, executorService, zzfxlVar, zzbdzVarM6787b, zzbciVarM4749a, zzbcaVar, zzbbrVar);
                f7441J = zzbaoVar;
                zzbaoVar.m4687k();
                f7441J.m4688l();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f7441J;
    }

    @Override // com.google.android.gms.internal.ads.zzbar
    /* JADX INFO: renamed from: a */
    public final void mo3254a(int i2, int i3, int i4) {
        DisplayMetrics displayMetrics;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8789ud)).booleanValue() || (displayMetrics = this.f7451s.getResources().getDisplayMetrics()) == null) {
            return;
        }
        float f2 = i2;
        float f3 = displayMetrics.density;
        float f4 = i3;
        MotionEvent motionEventObtain = MotionEvent.obtain(0L, 0L, 0, f2 * f3, f4 * f3, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        mo3255b(motionEventObtain);
        motionEventObtain.recycle();
        float f5 = displayMetrics.density;
        MotionEvent motionEventObtain2 = MotionEvent.obtain(0L, 0L, 2, f2 * f5, f4 * f5, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        mo3255b(motionEventObtain2);
        motionEventObtain2.recycle();
        float f6 = displayMetrics.density;
        MotionEvent motionEventObtain3 = MotionEvent.obtain(0L, i4, 1, f2 * f6, f4 * f6, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        mo3255b(motionEventObtain3);
        motionEventObtain3.recycle();
    }

    @Override // com.google.android.gms.internal.ads.zzbar
    /* JADX INFO: renamed from: b */
    public final void mo3255b(MotionEvent motionEvent) {
        zzfxt zzfxtVarM6819b = this.f7454v.m6819b();
        if (zzfxtVarM6819b != null) {
            try {
                ((zzfyy) zzfxtVarM6819b).m6794d(motionEvent);
            } catch (zzfzi e) {
                this.f7456x.mo6762c(e.f16850s, -1L, e);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbar
    /* JADX INFO: renamed from: c */
    public final String mo3256c(Context context, String str, View view, Activity activity) {
        zzbci zzbciVar = this.f7444C;
        if (zzbciVar.f7607d) {
            zzbciVar.f7605b = System.currentTimeMillis();
        }
        zzbca zzbcaVar = this.f7445D;
        zzbcaVar.f7569h = zzbcaVar.f7568g;
        zzbcaVar.f7568g = SystemClock.uptimeMillis();
        m4688l();
        zzfxt zzfxtVarM6819b = this.f7454v.m6819b();
        if (zzfxtVarM6819b == null) {
            return "";
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strM6793c = ((zzfyy) zzfxtVarM6819b).m6793c(context, str, view, activity);
        this.f7456x.m6764e(5000, System.currentTimeMillis() - jCurrentTimeMillis, null, strM6793c, null);
        return strM6793c;
    }

    @Override // com.google.android.gms.internal.ads.zzbar
    /* JADX INFO: renamed from: d */
    public final String mo3257d(Context context) {
        return "19";
    }

    @Override // com.google.android.gms.internal.ads.zzbar
    /* JADX INFO: renamed from: e */
    public final void mo3258e(StackTraceElement[] stackTraceElementArr) {
        this.f7446E.f7529a = new ArrayList(Arrays.asList(stackTraceElementArr));
    }

    @Override // com.google.android.gms.internal.ads.zzbar
    /* JADX INFO: renamed from: f */
    public final String mo3259f(Context context) {
        zzbci zzbciVar = this.f7444C;
        if (zzbciVar.f7607d) {
            zzbciVar.f7605b = System.currentTimeMillis();
        }
        zzbca zzbcaVar = this.f7445D;
        zzbcaVar.f7563b = zzbcaVar.f7562a;
        zzbcaVar.f7562a = SystemClock.uptimeMillis();
        m4688l();
        zzfxt zzfxtVarM6819b = this.f7454v.m6819b();
        if (zzfxtVarM6819b == null) {
            return "";
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strM6791a = ((zzfyy) zzfxtVarM6819b).m6791a(context);
        this.f7456x.m6764e(5001, System.currentTimeMillis() - jCurrentTimeMillis, null, strM6791a, null);
        return strM6791a;
    }

    @Override // com.google.android.gms.internal.ads.zzbar
    /* JADX INFO: renamed from: g */
    public final void mo3260g(View view) {
        this.f7455w.f7533c.m4744a(view);
    }

    @Override // com.google.android.gms.internal.ads.zzbar
    /* JADX INFO: renamed from: h */
    public final String mo3261h(Context context, String str, View view) {
        return mo3256c(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.zzbar
    /* JADX INFO: renamed from: i */
    public final String mo3262i(Context context, View view, Activity activity) {
        zzbci zzbciVar = this.f7444C;
        if (zzbciVar.f7607d) {
            zzbciVar.f7605b = System.currentTimeMillis();
        }
        this.f7445D.m4741a(context, view);
        m4688l();
        zzfxt zzfxtVarM6819b = this.f7454v.m6819b();
        if (zzfxtVarM6819b == null) {
            return "";
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strM6792b = ((zzfyy) zzfxtVarM6819b).m6792b(context, view, activity);
        this.f7456x.m6764e(5002, System.currentTimeMillis() - jCurrentTimeMillis, null, strM6792b, null);
        return strM6792b;
    }

    /* JADX INFO: renamed from: k */
    public final synchronized void m4687k() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        zzfyz zzfyzVarM4690o = m4690o();
        if (zzfyzVarM4690o == null) {
            this.f7456x.mo6761b(4013, System.currentTimeMillis() - jCurrentTimeMillis);
        } else if (this.f7454v.m6818a(zzfyzVarM4690o)) {
            this.f7450I = true;
            this.f7443B.countDown();
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m4688l() {
        zzfyz zzfyzVar;
        if (this.f7449H) {
            return;
        }
        synchronized (this.f7448G) {
            try {
                if (!this.f7449H) {
                    if ((System.currentTimeMillis() / 1000) - this.f7447F < 3600) {
                        return;
                    }
                    zzfzj zzfzjVar = this.f7454v;
                    synchronized (zzfzjVar.f16858g) {
                        try {
                            zzfyy zzfyyVar = zzfzjVar.f16857f;
                            zzfyzVar = zzfyyVar != null ? zzfyyVar.f16820b : null;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    if ((zzfyzVar == null || zzfyzVar.f16824a.m4798F() - (System.currentTimeMillis() / 1000) < 3600) && zzfyn.m6786a(this.f7458z)) {
                        this.f7457y.execute(new zzban(this));
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00cc A[Catch: all -> 0x0094, zzifh -> 0x0097, TryCatch #0 {zzifh -> 0x0097, blocks: (B:6:0x0019, B:8:0x0027, B:12:0x002d, B:13:0x003b, B:15:0x0049, B:17:0x0057, B:20:0x0064, B:34:0x009a, B:38:0x00b3, B:44:0x00cc, B:45:0x00d9, B:47:0x00df, B:49:0x00e7, B:50:0x00ea, B:41:0x00bd, B:42:0x00c4, B:23:0x006b, B:25:0x006f, B:27:0x0081, B:51:0x00f4, B:52:0x0101, B:53:0x010e), top: B:60:0x0019, outer: #1 }] */
    /* JADX INFO: renamed from: m */
    public final void m4689m() {
        String strM4796D;
        String strM4797E;
        int length;
        zzfyz zzfyzVarM4690o;
        zzbei zzbeiVar;
        boolean zM6802a;
        long jCurrentTimeMillis = System.currentTimeMillis();
        zzfyz zzfyzVarM4690o2 = m4690o();
        if (zzfyzVarM4690o2 != null) {
            strM4796D = zzfyzVarM4690o2.f16824a.m4796D();
            strM4797E = zzfyzVarM4690o2.f16824a.m4797E();
        } else {
            strM4796D = null;
            strM4797E = null;
        }
        try {
            try {
                Context context = this.f7451s;
                zzbdz zzbdzVar = this.f7458z;
                zzfxq zzfxqVar = this.f7456x;
                zzfze zzfzeVarM6776a = zzfxz.m6776a(context, zzbdzVar, strM4796D, strM4797E, zzfxqVar);
                byte[] bArr = zzfzeVarM6776a.f16842t;
                if (bArr == null || (length = bArr.length) == 0) {
                    zzfxqVar.mo6761b(5009, System.currentTimeMillis() - jCurrentTimeMillis);
                } else {
                    try {
                        zzidl zzidlVarM8149y = zzidl.m8149y(bArr, 0, length);
                        zzidz zzidzVar = zzidz.f19758b;
                        int i2 = zzicy.f19697a;
                        zzbeb zzbebVarM4778G = zzbeb.m4778G(zzidlVarM8149y, zzidz.f19759c);
                        if (zzbebVarM4778G.m4780D().m4796D().isEmpty() || zzbebVarM4778G.m4780D().m4797E().isEmpty() || zzbebVarM4778G.m4782F().m8151a().length == 0 || ((zzfyzVarM4690o = m4690o()) != null && (zzbeiVar = zzfyzVarM4690o.f16824a) != null && zzbebVarM4778G.m4780D().m4796D().equals(zzbeiVar.m4796D()) && zzbebVarM4778G.m4780D().m4797E().equals(zzbeiVar.m4797E()))) {
                            this.f7456x.mo6761b(5010, System.currentTimeMillis() - jCurrentTimeMillis);
                        } else {
                            zzfzg zzfzgVar = this.f7442A;
                            int i3 = zzfzeVarM6776a.f16843u;
                            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8525f3)).booleanValue()) {
                                zM6802a = this.f7452t.m6802a(zzbebVarM4778G, zzfzgVar);
                            } else if (i3 == 3) {
                                zM6802a = this.f7453u.m6814b(zzbebVarM4778G);
                            } else if (i3 == 4) {
                                zM6802a = this.f7453u.m6813a(zzbebVarM4778G, zzfzgVar);
                            } else {
                                this.f7456x.mo6761b(4009, System.currentTimeMillis() - jCurrentTimeMillis);
                            }
                            if (zM6802a) {
                                zzfyz zzfyzVarM4690o3 = m4690o();
                                if (zzfyzVarM4690o3 != null) {
                                    if (this.f7454v.m6818a(zzfyzVarM4690o3)) {
                                        this.f7450I = true;
                                    }
                                    this.f7447F = System.currentTimeMillis() / 1000;
                                }
                            } else {
                                this.f7456x.mo6761b(4009, System.currentTimeMillis() - jCurrentTimeMillis);
                            }
                        }
                    } catch (NullPointerException unused) {
                        this.f7456x.mo6761b(2030, System.currentTimeMillis() - jCurrentTimeMillis);
                    }
                }
            } catch (zzifh e) {
                this.f7456x.mo6762c(4002, System.currentTimeMillis() - jCurrentTimeMillis, e);
            }
        } finally {
            this.f7443B.countDown();
        }
    }

    /* JADX INFO: renamed from: o */
    public final zzfyz m4690o() {
        if (zzfyn.m6786a(this.f7458z)) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8525f3)).booleanValue()) {
                zzfzh zzfzhVar = this.f7453u;
                long jCurrentTimeMillis = System.currentTimeMillis();
                synchronized (zzfzh.f16844f) {
                    try {
                        zzbei zzbeiVarM6817f = zzfzhVar.m6817f(1);
                        if (zzbeiVarM6817f == null) {
                            zzfzhVar.m6816e(4022, jCurrentTimeMillis);
                            return null;
                        }
                        File fileM6815c = zzfzhVar.m6815c(zzbeiVarM6817f.m4796D());
                        File file = new File(fileM6815c, "pcam.jar");
                        if (!file.exists()) {
                            file = new File(fileM6815c, "pcam");
                        }
                        File file2 = new File(fileM6815c, "pcbc");
                        File file3 = new File(fileM6815c, "pcopt");
                        zzfzhVar.m6816e(5016, jCurrentTimeMillis);
                        return new zzfyz(zzbeiVarM6817f, file, file2, file3);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            zzfza zzfzaVar = this.f7452t;
            zzbei zzbeiVarM6803b = zzfzaVar.m6803b(1);
            if (zzbeiVarM6803b != null) {
                String strM4796D = zzbeiVarM6803b.m4796D();
                File fileM6807a = zzfzb.m6807a(strM4796D, zzfzaVar.m6804c(), "pcam.jar");
                if (!fileM6807a.exists()) {
                    fileM6807a = zzfzb.m6807a(strM4796D, zzfzaVar.m6804c(), "pcam");
                }
                return new zzfyz(zzbeiVarM6803b, fileM6807a, zzfzb.m6807a(strM4796D, zzfzaVar.m6804c(), "pcbc"), zzfzb.m6807a(strM4796D, zzfzaVar.m6804c(), "pcopt"));
            }
        }
        return null;
    }
}
