package com.google.android.gms.internal.ads;

import android.app.UiModeManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgfx implements zzgfs, zzgfo, zzggd {

    /* JADX INFO: renamed from: u */
    public static final zziib f17163u;

    /* JADX INFO: renamed from: a */
    public final Context f17164a;

    /* JADX INFO: renamed from: b */
    public final zzgew f17165b;

    /* JADX INFO: renamed from: c */
    public final ExecutorService f17166c;

    /* JADX INFO: renamed from: d */
    public final zzgep f17167d;

    /* JADX INFO: renamed from: e */
    public final boolean f17168e;

    /* JADX INFO: renamed from: f */
    public final String f17169f;

    /* JADX INFO: renamed from: g */
    public final long f17170g;

    /* JADX INFO: renamed from: h */
    public final long f17171h;

    /* JADX INFO: renamed from: i */
    public final double f17172i;

    /* JADX INFO: renamed from: j */
    public final String f17173j;

    /* JADX INFO: renamed from: k */
    public final long f17174k;

    /* JADX INFO: renamed from: l */
    public final AtomicBoolean f17175l = new AtomicBoolean(false);

    /* JADX INFO: renamed from: m */
    public final Object f17176m = new Object();

    /* JADX INFO: renamed from: n */
    public final Object f17177n = new Object();

    /* JADX INFO: renamed from: o */
    public final Object f17178o = new Object();

    /* JADX INFO: renamed from: p */
    public final zzaww f17179p = zzawx.m4493D();

    /* JADX INFO: renamed from: q */
    public final ArrayList f17180q = new ArrayList();

    /* JADX INFO: renamed from: r */
    public boolean f17181r = false;

    /* JADX INFO: renamed from: s */
    public final HashMap f17182s = new HashMap();

    /* JADX INFO: renamed from: t */
    public final int f17183t;

    static {
        zziia zziiaVarM8490D = zziib.m8490D();
        zziiaVarM8490D.m8326l();
        ((zziib) zziiaVarM8490D.f19780t).m8491E(17);
        f17163u = (zziib) zziiaVarM8490D.m8328o();
    }

    public zzgfx(Context context, zzgew zzgewVar, ExecutorService executorService, zzgep zzgepVar, Random random, String str, long j2, long j3, double d, String str2, int i2, long j4) {
        this.f17164a = context;
        this.f17165b = zzgewVar;
        this.f17166c = executorService;
        this.f17167d = zzgepVar;
        this.f17169f = str;
        this.f17170g = j2;
        this.f17171h = j3;
        this.f17172i = d;
        this.f17173j = str2;
        this.f17183t = i2;
        this.f17174k = j4;
        this.f17168e = random.nextDouble() < d;
    }

    @Override // com.google.android.gms.internal.ads.zzggd
    /* JADX INFO: renamed from: a */
    public final void mo6974a(zziex zziexVar) {
        synchronized (this.f17176m) {
            zzaww zzawwVar = this.f17179p;
            zzawwVar.m8326l();
            ((zzawx) zzawwVar.f19780t).m4506Q(zziexVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgfs
    /* JADX INFO: renamed from: b */
    public final void mo6973b(int i2, long j2, String str, Throwable th) {
        long jLongValue;
        if (this.f17168e) {
            synchronized (this.f17177n) {
                try {
                    ArrayList arrayList = this.f17180q;
                    synchronized (this.f17178o) {
                        try {
                            HashMap map = this.f17182s;
                            Integer numValueOf = Integer.valueOf(i2);
                            Long l2 = (Long) map.get(numValueOf);
                            if (l2 == null) {
                                l2 = 0L;
                            }
                            jLongValue = 1 + l2.longValue();
                            map.put(numValueOf, Long.valueOf(jLongValue));
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    arrayList.add(new zzgfu(i2, j2, th, str, jLongValue));
                    if (!this.f17181r) {
                        this.f17181r = true;
                        this.f17165b.mo6967a(new Runnable() { // from class: com.google.android.gms.internal.ads.zzgfw
                            @Override // java.lang.Runnable
                            public final void run() {
                                zzaww zzawwVar;
                                zzgwt zzgwtVarM7220t;
                                String string;
                                zzgfx zzgfxVar = this.f17162s;
                                synchronized (zzgfxVar.f17176m) {
                                    zzaww zzawwVar2 = zzgfxVar.f17179p;
                                    zziej zziejVar = (zziej) zzawwVar2.f19779s.mo4492z(zzieo.f19786w, null);
                                    zziejVar.f19780t = zzawwVar2.mo8324j();
                                    zzawwVar = (zzaww) zziejVar;
                                }
                                synchronized (zzgfxVar.f17177n) {
                                    ArrayList arrayList2 = zzgfxVar.f17180q;
                                    zzgwtVarM7220t = zzgwt.m7220t(arrayList2);
                                    arrayList2.clear();
                                    zzgfxVar.f17181r = false;
                                }
                                int size = zzgwtVarM7220t.size();
                                int i3 = 0;
                                int i4 = 0;
                                while (i3 < size) {
                                    zzgfu zzgfuVar = (zzgfu) zzgwtVarM7220t.get(i3);
                                    if (i4 >= zzgfxVar.f17170g) {
                                        zzgfxVar.m6976d((zzawx) zzawwVar.m8328o());
                                        zzawwVar.m8326l();
                                        ((zzawx) zzawwVar.f19780t).m4495F();
                                        i4 = 0;
                                    }
                                    zzaxo zzaxoVarM4522D = zzaxp.m4522D();
                                    long j3 = zzgfuVar.f17156a;
                                    zzaxoVarM4522D.m8326l();
                                    ((zzaxp) zzaxoVarM4522D.f19780t).m4523E(j3);
                                    long j4 = zzgfuVar.f17157b;
                                    zzaxoVarM4522D.m8326l();
                                    ((zzaxp) zzaxoVarM4522D.f19780t).m4524F(j4);
                                    long j5 = zzgfuVar.f17160e;
                                    zzaxoVarM4522D.m8326l();
                                    ((zzaxp) zzaxoVarM4522D.f19780t).m4527I(j5);
                                    String str2 = zzgfuVar.f17159d;
                                    if (str2 != null) {
                                        zzaxoVarM4522D.m8326l();
                                        ((zzaxp) zzaxoVarM4522D.f19780t).m4528J(str2);
                                    }
                                    Throwable th3 = zzgfuVar.f17158c;
                                    int i5 = th3 == null ? 2 : 3;
                                    zzaxoVarM4522D.m8326l();
                                    ((zzaxp) zzaxoVarM4522D.f19780t).m4529K(i5);
                                    if (th3 != null) {
                                        String name = th3.getClass().getName();
                                        zzaxoVarM4522D.m8326l();
                                        ((zzaxp) zzaxoVarM4522D.f19780t).m4525G(name);
                                        try {
                                            StringWriter stringWriter = new StringWriter();
                                            try {
                                                PrintWriter printWriter = new PrintWriter(stringWriter);
                                                try {
                                                    th3.printStackTrace(printWriter);
                                                    string = stringWriter.toString();
                                                    printWriter.close();
                                                    stringWriter.close();
                                                } catch (Throwable th4) {
                                                    try {
                                                        printWriter.close();
                                                    } catch (Throwable th5) {
                                                        th4.addSuppressed(th5);
                                                    }
                                                    throw th4;
                                                }
                                            } catch (Throwable th6) {
                                                try {
                                                    stringWriter.close();
                                                } catch (Throwable th7) {
                                                    th6.addSuppressed(th7);
                                                }
                                                throw th6;
                                            }
                                        } catch (IOException unused) {
                                            string = "";
                                        }
                                        zzaxoVarM4522D.m8326l();
                                        ((zzaxp) zzaxoVarM4522D.f19780t).m4526H(string);
                                    }
                                    zzaxp zzaxpVar = (zzaxp) zzaxoVarM4522D.m8328o();
                                    zzawwVar.m8326l();
                                    ((zzawx) zzawwVar.f19780t).m4494E(zzaxpVar);
                                    i3++;
                                    i4++;
                                }
                                if (i4 > 0) {
                                    zzgfxVar.m6976d((zzawx) zzawwVar.m8328o());
                                    zzawwVar.m8326l();
                                    ((zzawx) zzawwVar.f19780t).m4495F();
                                }
                            }
                        }, this.f17171h);
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzggd
    /* JADX INFO: renamed from: c */
    public final void mo6975c(zzggc zzggcVar) {
        synchronized (this.f17176m) {
            zzaww zzawwVar = this.f17179p;
            String strZza = zzggcVar.zza();
            zzawwVar.m8326l();
            ((zzawx) zzawwVar.f19780t).m4503N(strZza);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m6976d(zzawx zzawxVar) {
        try {
            zzbdw zzbdwVarM4772D = zzbdx.m4772D();
            zziib zziibVar = f17163u;
            zzbdwVarM4772D.m8326l();
            ((zzbdx) zzbdwVarM4772D.f19780t).m4774F(zziibVar);
            zzbdu zzbduVarM4770D = zzbdv.m4770D();
            zzbduVarM4770D.m8326l();
            ((zzbdv) zzbduVarM4770D.f19780t).m4771E(zzawxVar);
            zzbdv zzbdvVar = (zzbdv) zzbduVarM4770D.m8328o();
            zzbdwVarM4772D.m8326l();
            ((zzbdx) zzbdwVarM4772D.f19780t).m4773E(zzbdvVar);
            this.f17167d.mo6966a(this.f17169f, ((zzbdx) zzbdwVarM4772D.m8328o()).m8099h());
        } catch (RuntimeException unused) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgfo
    public final ListenableFuture zza() {
        zzhde zzhdeVar = new zzhde(Executors.callable(new Runnable() { // from class: com.google.android.gms.internal.ads.zzgfv
            @Override // java.lang.Runnable
            public final void run() {
                int i2;
                int i3;
                zzgfx zzgfxVar = this.f17161s;
                if (!zzgfxVar.f17168e || zzgfxVar.f17175l.getAndSet(true)) {
                    return;
                }
                Context context = zzgfxVar.f17164a;
                String str = zzgfxVar.f17173j;
                int i4 = zzgfxVar.f17183t;
                double d = zzgfxVar.f17172i;
                long j2 = zzgfxVar.f17174k;
                Locale locale = Locale.getDefault();
                if (i4 == 1) {
                    zzifc.m8355a();
                    throw null;
                }
                int i5 = i4 - 2;
                if (i5 == 0) {
                    i2 = 2;
                } else if (i5 != 1) {
                    i2 = i5 != 2 ? 5 : 4;
                } else {
                    i2 = 3;
                }
                zzaww zzawwVarM4493D = zzawx.m4493D();
                long j3 = Build.VERSION.SDK_INT;
                zzawwVarM4493D.m8326l();
                ((zzawx) zzawwVarM4493D.f19780t).m4496G(j3);
                String str2 = Build.MODEL;
                zzawwVarM4493D.m8326l();
                ((zzawx) zzawwVarM4493D.f19780t).m4497H(str2);
                String language = locale.getLanguage();
                zzawwVarM4493D.m8326l();
                ((zzawx) zzawwVarM4493D.f19780t).m4498I(language);
                String country = locale.getCountry();
                zzawwVarM4493D.m8326l();
                ((zzawx) zzawwVarM4493D.f19780t).m4499J(country);
                zzawwVarM4493D.m8326l();
                ((zzawx) zzawwVarM4493D.f19780t).m4502M(str);
                zzawwVarM4493D.m8326l();
                ((zzawx) zzawwVarM4493D.f19780t).m4508S(i2);
                zzawwVarM4493D.m8326l();
                ((zzawx) zzawwVarM4493D.f19780t).m4509T(3);
                String packageName = context.getPackageName();
                zzawwVarM4493D.m8326l();
                ((zzawx) zzawwVarM4493D.f19780t).m4500K(packageName);
                zzawwVarM4493D.m8326l();
                ((zzawx) zzawwVarM4493D.f19780t).m4505P(j2);
                if (d > 0.0d) {
                    zzawwVarM4493D.m8326l();
                    ((zzawx) zzawwVarM4493D.f19780t).m4504O((int) (1.0d / d));
                }
                PackageManager packageManager = context.getPackageManager();
                try {
                    long j4 = packageManager.getPackageInfo(context.getPackageName(), 0).versionCode;
                    zzawwVarM4493D.m8326l();
                    ((zzawx) zzawwVarM4493D.f19780t).m4501L(j4);
                } catch (Exception unused) {
                }
                try {
                    if (packageManager.hasSystemFeature("android.hardware.type.automotive")) {
                        i3 = 5;
                    } else if (packageManager.hasSystemFeature("android.hardware.type.watch")) {
                        i3 = 4;
                    } else if (packageManager.hasSystemFeature("android.hardware.type.pc")) {
                        i3 = 7;
                    } else {
                        UiModeManager uiModeManager = (UiModeManager) context.getSystemService("uimode");
                        i3 = (uiModeManager == null || uiModeManager.getCurrentModeType() != 4) ? 2 : 6;
                    }
                    zzawwVarM4493D.m8326l();
                    ((zzawx) zzawwVarM4493D.f19780t).m4507R(i3);
                } catch (RuntimeException unused2) {
                }
                zzawx zzawxVar = (zzawx) zzawwVarM4493D.m8328o();
                synchronized (zzgfxVar.f17176m) {
                    zzgfxVar.f17179p.m8329p(zzawxVar);
                }
            }
        }, null));
        this.f17166c.execute(zzhdeVar);
        return zzhdeVar;
    }
}
