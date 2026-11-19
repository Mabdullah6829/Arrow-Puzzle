package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
final class zzadm implements zzaew {

    /* JADX INFO: renamed from: a */
    public zzgwt f5030a;

    /* JADX INFO: renamed from: b */
    public zzv f5031b;

    /* JADX INFO: renamed from: c */
    public long f5032c;

    /* JADX INFO: renamed from: d */
    public long f5033d;

    /* JADX INFO: renamed from: e */
    public int f5034e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ zzads f5035f;

    public zzadm(zzads zzadsVar, Context context) {
        this.f5035f = zzadsVar;
        zzfm.m6510l(context);
        zzgzi zzgziVar = zzgwt.f18303t;
        this.f5030a = zzgyo.f18355w;
        this.f5033d = -9223372036854775807L;
        zzaet zzaetVar = zzaet.f5134a;
    }

    @Override // com.google.android.gms.internal.ads.zzaew
    /* JADX INFO: renamed from: S */
    public final void mo3950S(boolean z) {
        zzads zzadsVar = this.f5035f;
        if (zzadsVar.f5043d) {
            ((zzacx) zzadsVar.f5044e).mo3950S(z);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaew
    /* JADX INFO: renamed from: a */
    public final boolean mo3951a() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzaew
    /* JADX INFO: renamed from: b */
    public final void mo3952b() {
    }

    @Override // com.google.android.gms.internal.ads.zzaew
    /* JADX INFO: renamed from: c */
    public final void mo3953c(zzadt zzadtVar) {
        ((zzacx) this.f5035f.f5044e).f4940j = zzadtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaew
    /* JADX INFO: renamed from: d */
    public final void mo3954d(float f2) {
        zzads zzadsVar = this.f5035f;
        zzadsVar.f5048i.m4038b(f2);
        ((zzacx) zzadsVar.f5044e).mo3954d(f2);
    }

    @Override // com.google.android.gms.internal.ads.zzaew
    /* JADX INFO: renamed from: e */
    public final void mo3955e(Surface surface, zzev zzevVar) {
        zzads zzadsVar = this.f5035f;
        Pair pair = zzadsVar.f5051l;
        if (pair != null && ((Surface) pair.first).equals(surface) && ((zzev) zzadsVar.f5051l.second).equals(zzevVar)) {
            return;
        }
        zzadsVar.f5051l = Pair.create(surface, zzevVar);
        zzevVar.getClass();
    }

    @Override // com.google.android.gms.internal.ads.zzaew
    /* JADX INFO: renamed from: f */
    public final void mo3956f() {
        zzads zzadsVar = this.f5035f;
        zzadsVar.getClass();
        zzev.f14942c.getClass();
        zzadsVar.f5051l = null;
    }

    @Override // com.google.android.gms.internal.ads.zzaew
    /* JADX INFO: renamed from: h */
    public final void mo3958h(long j2, long j3) {
        ((zzacx) this.f5035f.f5044e).mo3958h(j2 + this.f5032c, j3);
    }

    @Override // com.google.android.gms.internal.ads.zzaew
    /* JADX INFO: renamed from: i */
    public final void mo3959i(int i2) {
        ((zzacx) this.f5035f.f5044e).mo3959i(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzaew
    /* JADX INFO: renamed from: i0 */
    public final boolean mo3960i0(boolean z) {
        return ((zzacx) this.f5035f.f5044e).f4931a.m4034e(false);
    }

    @Override // com.google.android.gms.internal.ads.zzaew
    /* JADX INFO: renamed from: j */
    public final void mo3961j(List list) {
        if (this.f5030a.equals(list)) {
            return;
        }
        this.f5030a = zzgwt.m7220t(list);
        zzv zzvVar = this.f5031b;
        if (zzvVar == null) {
            return;
        }
        zzt zztVar = new zzt(zzvVar);
        zzi zziVar = zzvVar.f21035E;
        if (zziVar == null || !zziVar.m8033d()) {
            zziVar = zzi.f19546h;
        }
        zztVar.f20778D = zziVar;
        zztVar.m8850b();
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzaew
    /* JADX INFO: renamed from: k */
    public final void mo3962k(long j2) {
        this.f5032c = j2;
    }

    @Override // com.google.android.gms.internal.ads.zzaew
    /* JADX INFO: renamed from: l */
    public final boolean mo3963l(long j2, zzaeu zzaeuVar) {
        int i2;
        zzgtr.m7133f(false);
        long j3 = j2 + this.f5032c;
        zzads zzadsVar = this.f5035f;
        zzadx zzadxVar = zzadsVar.f5048i;
        long j4 = zzadxVar.f5071a;
        long j5 = j4 == -9223372036854775807L ? -9223372036854775807L : (long) (((j3 - j4) * zzadxVar.f5073c) + zzadxVar.f5072b);
        if (j5 != -9223372036854775807L && j5 < zzadsVar.f5047h && (i2 = this.f5034e) < 2) {
            this.f5034e = i2 + 1;
            ((zzadc) zzaeuVar).zzb();
            return true;
        }
        int i3 = zzadsVar.f5055p;
        if (i3 == -1 || i3 != 0) {
            return false;
        }
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzaew
    /* JADX INFO: renamed from: m */
    public final void mo3964m(zzv zzvVar, long j2, int i2, List list) {
        zzgtr.m7133f(false);
        this.f5030a = zzgwt.m7220t(list);
        this.f5031b = zzvVar;
        this.f5035f.getClass();
        zzt zztVar = new zzt(zzvVar);
        zzi zziVar = zzvVar.f21035E;
        if (zziVar == null || !zziVar.m8033d()) {
            zziVar = zzi.f19546h;
        }
        zztVar.f20778D = zziVar;
        zztVar.m8850b();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0062 A[Catch: zzdx -> 0x0037, TryCatch #0 {zzdx -> 0x0037, blocks: (B:12:0x001d, B:15:0x0027, B:18:0x002f, B:26:0x003f, B:29:0x0062, B:31:0x0066, B:38:0x0079, B:41:0x0080, B:46:0x00a4, B:36:0x0071), top: B:56:0x001d }] */
    /* JADX WARN: Code duplicated, block: B:35:0x006f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x0071 A[Catch: zzdx -> 0x0037, TryCatch #0 {zzdx -> 0x0037, blocks: (B:12:0x001d, B:15:0x0027, B:18:0x002f, B:26:0x003f, B:29:0x0062, B:31:0x0066, B:38:0x0079, B:41:0x0080, B:46:0x00a4, B:36:0x0071), top: B:56:0x001d }] */
    /* JADX WARN: Code duplicated, block: B:42:0x009d  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:46:0x00a4 A[Catch: zzdx -> 0x0037, TRY_LEAVE, TryCatch #0 {zzdx -> 0x0037, blocks: (B:12:0x001d, B:15:0x0027, B:18:0x002f, B:26:0x003f, B:29:0x0062, B:31:0x0066, B:38:0x0079, B:41:0x0080, B:46:0x00a4, B:36:0x0071), top: B:56:0x001d }] */
    @Override // com.google.android.gms.internal.ads.zzaew
    /* JADX INFO: renamed from: n */
    public final boolean mo3965n(zzv zzvVar) throws zzaev {
        zzads zzadsVar = this.f5035f;
        boolean z = false;
        boolean zM6089c = true;
        zzgtr.m7133f(zzadsVar.f5053n == 0);
        zzi zziVarM7286a = zzvVar.f21035E;
        if (zziVarM7286a == null || !zziVarM7286a.m8033d()) {
            zziVarM7286a = zzi.f19546h;
        }
        try {
            int i2 = zziVarM7286a.f19549c;
            if (i2 != 7) {
                if (i2 == 6) {
                    if (Build.VERSION.SDK_INT >= 33 && zzdy.m6089c("EGL_EXT_gl_colorspace_bt2020_pq")) {
                        z = true;
                    }
                    zM6089c = z;
                } else if (i2 == 7) {
                    zM6089c = zzdy.m6089c("EGL_EXT_gl_colorspace_bt2020_hlg");
                }
                if (zM6089c && Build.VERSION.SDK_INT >= 29) {
                    String str = zzfm.f16091a;
                    Locale locale = Locale.US;
                    zzeh.m6211c("PlaybackVidGraphWrapper", "Color transfer " + i2 + " is not supported. Falling back to OpenGl tone mapping.");
                    zziVarM7286a = zzi.f19546h;
                } else if (i2 != 2 || i2 == 10) {
                    zziVarM7286a = zzi.f19546h;
                }
            } else {
                int i3 = Build.VERSION.SDK_INT;
                if (i3 < 34) {
                    if (i3 >= 33 && zzdy.m6089c("EGL_EXT_gl_colorspace_bt2020_pq")) {
                        zzh zzhVar = new zzh();
                        zzhVar.f18414a = zziVarM7286a.f19547a;
                        zzhVar.f18415b = zziVarM7286a.f19548b;
                        zzhVar.f18417d = zziVarM7286a.f19550d;
                        zzhVar.f18418e = zziVarM7286a.f19551e;
                        zzhVar.f18419f = zziVarM7286a.f19552f;
                        zzhVar.f18416c = 6;
                        zziVarM7286a = zzhVar.m7286a();
                    }
                }
                i2 = 7;
                if (i2 == 6) {
                    if (Build.VERSION.SDK_INT >= 33) {
                        z = true;
                    }
                    zM6089c = z;
                } else if (i2 == 7) {
                    zM6089c = zzdy.m6089c("EGL_EXT_gl_colorspace_bt2020_hlg");
                }
                if (zM6089c) {
                    if (i2 != 2) {
                        zziVarM7286a = zzi.f19546h;
                    } else {
                        zziVarM7286a = zzi.f19546h;
                    }
                } else if (i2 != 2) {
                    zziVarM7286a = zzi.f19546h;
                } else {
                    zziVarM7286a = zzi.f19546h;
                }
            }
            zzi zziVar = zziVarM7286a;
            zzdp zzdpVar = zzadsVar.f5045f;
            Looper looperMyLooper = Looper.myLooper();
            looperMyLooper.getClass();
            final zzea zzeaVarMo5975a = zzdpVar.mo5975a(looperMyLooper, null);
            zzadsVar.f5050k = zzeaVarMo5975a;
            try {
                ((zzadq) zzadsVar.f5041b).mo4029a(zzadsVar.f5040a, zziVar, zzl.f20206a, zzadsVar, new Executor() { // from class: com.google.android.gms.internal.ads.zzadl
                    @Override // java.util.concurrent.Executor
                    public final /* synthetic */ void execute(Runnable runnable) {
                        zzeaVarMo5975a.mo6122g(runnable);
                    }
                });
                throw null;
            } catch (zzbo e) {
                throw new zzaev(e, zzvVar);
            }
        } catch (zzdx e2) {
            throw new zzaev(e2, zzvVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaew
    /* JADX INFO: renamed from: o0 */
    public final void mo3966o0(boolean z) {
        this.f5033d = -9223372036854775807L;
        final zzads zzadsVar = this.f5035f;
        if (zzadsVar.f5053n == 1) {
            zzadsVar.f5052m++;
            ((zzacx) zzadsVar.f5044e).mo3966o0(z);
            while (zzadsVar.f5049j.m6456b() > 1) {
                zzadsVar.f5049j.m6457c();
            }
            if (zzadsVar.f5049j.m6456b() == 1) {
                ((zzadr) zzadsVar.f5049j.m6457c()).getClass();
                throw null;
            }
            zzadsVar.f5054o = -9223372036854775807L;
            zzea zzeaVar = zzadsVar.f5050k;
            zzeaVar.getClass();
            zzeaVar.mo6122g(new Runnable() { // from class: com.google.android.gms.internal.ads.zzadn
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzadsVar.f5052m--;
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaew
    /* JADX INFO: renamed from: r */
    public final void mo3967r() {
        zzads zzadsVar = this.f5035f;
        if (zzadsVar.f5049j.m6456b() == 0) {
            ((zzacx) zzadsVar.f5044e).mo3967r();
            return;
        }
        zzfi zzfiVar = new zzfi(0);
        if (zzadsVar.f5049j.m6456b() <= 0) {
            zzadsVar.f5049j = zzfiVar;
        } else {
            ((zzadr) zzadsVar.f5049j.m6457c()).getClass();
            throw null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaew
    /* JADX INFO: renamed from: s */
    public final void mo3968s() {
        zzads zzadsVar = this.f5035f;
        if (zzadsVar.f5053n == 2) {
            return;
        }
        zzea zzeaVar = zzadsVar.f5050k;
        if (zzeaVar != null) {
            zzeaVar.zzl();
        }
        zzadsVar.f5051l = null;
        zzadsVar.f5053n = 2;
    }

    @Override // com.google.android.gms.internal.ads.zzaew
    public final void zza() {
        zzads zzadsVar = this.f5035f;
        if (zzadsVar.f5043d) {
            ((zzacx) zzadsVar.f5044e).zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaew
    public final void zzb() {
        zzads zzadsVar = this.f5035f;
        if (zzadsVar.f5043d) {
            ((zzacx) zzadsVar.f5044e).zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaew
    public final void zzi() {
        long j2 = this.f5033d;
        zzads zzadsVar = this.f5035f;
        zzadsVar.getClass();
        if (zzadsVar.f5054o >= j2) {
            ((zzacx) zzadsVar.f5044e).zzi();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaew
    public final boolean zzj() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzaew
    public final Surface zzk() {
        zzgtr.m7133f(false);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzaew
    /* JADX INFO: renamed from: g */
    public final void mo3957g(zzaet zzaetVar) {
    }
}
