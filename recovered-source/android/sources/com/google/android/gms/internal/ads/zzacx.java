package com.google.android.gms.internal.ads;

import android.media.MediaFormat;
import android.view.Surface;
import java.util.ArrayDeque;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
final class zzacx implements zzaew {

    /* JADX INFO: renamed from: a */
    public final zzadw f4931a;

    /* JADX INFO: renamed from: b */
    public final zzadx f4932b;

    /* JADX INFO: renamed from: c */
    public final zzaee f4933c;

    /* JADX INFO: renamed from: d */
    public final ArrayDeque f4934d;

    /* JADX INFO: renamed from: e */
    public Surface f4935e;

    /* JADX INFO: renamed from: f */
    public zzv f4936f;

    /* JADX INFO: renamed from: g */
    public long f4937g;

    /* JADX INFO: renamed from: h */
    public zzaet f4938h;

    /* JADX INFO: renamed from: i */
    public Executor f4939i;

    /* JADX INFO: renamed from: j */
    public zzadt f4940j;

    public zzacx(zzadw zzadwVar, zzadx zzadxVar, zzdp zzdpVar) {
        this.f4931a = zzadwVar;
        this.f4932b = zzadxVar;
        zzadwVar.f5068k = zzdpVar;
        this.f4933c = new zzaee(new zzacw(this), zzadwVar, zzadxVar);
        this.f4934d = new ArrayDeque();
        this.f4936f = new zzv(new zzt());
        this.f4937g = -9223372036854775807L;
        this.f4938h = zzaet.f5134a;
        this.f4939i = new Executor() { // from class: com.google.android.gms.internal.ads.zzacs
            @Override // java.util.concurrent.Executor
            public final /* synthetic */ void execute(Runnable runnable) {
            }
        };
        this.f4940j = new zzadt() { // from class: com.google.android.gms.internal.ads.zzacq
            @Override // com.google.android.gms.internal.ads.zzadt
            /* JADX INFO: renamed from: b */
            public final /* synthetic */ void mo3949b(long j2, long j3, zzv zzvVar, MediaFormat mediaFormat) {
            }
        };
    }

    @Override // com.google.android.gms.internal.ads.zzaew
    /* JADX INFO: renamed from: S */
    public final void mo3950S(boolean z) {
        zzadw zzadwVar = this.f4931a;
        zzadwVar.f5066i = z;
        zzadwVar.f5065h = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zzaew
    /* JADX INFO: renamed from: a */
    public final boolean mo3951a() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzaew
    /* JADX INFO: renamed from: b */
    public final void mo3952b() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.zzaew
    /* JADX INFO: renamed from: c */
    public final void mo3953c(zzadt zzadtVar) {
        this.f4940j = zzadtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaew
    /* JADX INFO: renamed from: d */
    public final void mo3954d(float f2) {
        this.f4931a.m4036g(f2);
    }

    @Override // com.google.android.gms.internal.ads.zzaew
    /* JADX INFO: renamed from: e */
    public final void mo3955e(Surface surface, zzev zzevVar) {
        this.f4935e = surface;
        this.f4931a.m4032c(surface);
    }

    @Override // com.google.android.gms.internal.ads.zzaew
    /* JADX INFO: renamed from: f */
    public final void mo3956f() {
        this.f4935e = null;
        this.f4931a.m4032c(null);
    }

    @Override // com.google.android.gms.internal.ads.zzaew
    /* JADX INFO: renamed from: g */
    public final void mo3957g(zzaet zzaetVar) {
        this.f4938h = zzaetVar;
        this.f4939i = zzhbu.f18506s;
    }

    @Override // com.google.android.gms.internal.ads.zzaew
    /* JADX INFO: renamed from: h */
    public final void mo3958h(long j2, long j3) {
        try {
            this.f4933c.m4046a(j2, j3);
        } catch (zzjm e) {
            throw new zzaev(e, this.f4936f);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaew
    /* JADX INFO: renamed from: i */
    public final void mo3959i(int i2) {
        zzaed zzaedVar = this.f4931a.f5059b;
        if (zzaedVar.f5090j == i2) {
            return;
        }
        zzaedVar.f5090j = i2;
        zzaedVar.m4044c(true);
    }

    @Override // com.google.android.gms.internal.ads.zzaew
    /* JADX INFO: renamed from: i0 */
    public final boolean mo3960i0(boolean z) {
        return this.f4931a.m4034e(z);
    }

    @Override // com.google.android.gms.internal.ads.zzaew
    /* JADX INFO: renamed from: j */
    public final void mo3961j(List list) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.zzaew
    /* JADX INFO: renamed from: k */
    public final void mo3962k(long j2) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.zzaew
    /* JADX INFO: renamed from: l */
    public final boolean mo3963l(long j2, zzaeu zzaeuVar) {
        this.f4934d.add(zzaeuVar);
        zzaee zzaeeVar = this.f4933c;
        zzej zzejVar = zzaeeVar.f5104e;
        int i2 = zzejVar.f14006c;
        long[] jArr = zzejVar.f14007d;
        int length = jArr.length;
        if (i2 == length) {
            int i3 = length + length;
            if (i3 < 0) {
                throw new IllegalStateException();
            }
            long[] jArr2 = new long[i3];
            int i4 = zzejVar.f14004a;
            int i5 = length - i4;
            System.arraycopy(jArr, i4, jArr2, 0, i5);
            System.arraycopy(zzejVar.f14007d, 0, jArr2, i5, i4);
            zzejVar.f14004a = 0;
            zzejVar.f14005b = zzejVar.f14006c - 1;
            zzejVar.f14007d = jArr2;
            zzejVar.f14008e = i3 - 1;
            jArr = jArr2;
        }
        int i6 = (zzejVar.f14005b + 1) & zzejVar.f14008e;
        zzejVar.f14005b = i6;
        jArr[i6] = j2;
        zzejVar.f14006c++;
        zzaeeVar.f5106g = j2;
        zzaeeVar.f5108i = -9223372036854775807L;
        this.f4939i.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzacr
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f4924s.f4938h.zza();
            }
        });
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzaew
    /* JADX INFO: renamed from: m */
    public final void mo3964m(zzv zzvVar, long j2, int i2, List list) {
        zzgtr.m7133f(list.isEmpty());
        int i3 = zzvVar.f21068v;
        int i4 = zzvVar.f21069w;
        zzv zzvVar2 = this.f4936f;
        int i5 = zzvVar2.f21068v;
        zzaee zzaeeVar = this.f4933c;
        if (i3 != i5 || i4 != zzvVar2.f21069w) {
            long j3 = zzaeeVar.f5106g;
            zzaeeVar.f5102c.m6455a(j3 == -9223372036854775807L ? 0L : j3 + 1, new zzbv(i3, i4, 1.0f));
        }
        float f2 = zzvVar.f21072z;
        if (f2 != this.f4936f.f21072z) {
            this.f4931a.m4033d(f2);
        }
        this.f4936f = zzvVar;
        if (j2 != this.f4937g) {
            if (zzaeeVar.f5104e.f14006c == 0) {
                zzaeeVar.f5100a.m4030a(i2);
                zzaeeVar.f5110k = j2;
            } else {
                zzfi zzfiVar = zzaeeVar.f5103d;
                long j4 = zzaeeVar.f5106g;
                zzfiVar.m6455a(j4 == -9223372036854775807L ? -4611686018427387904L : j4 + 1, Long.valueOf(j2));
            }
            this.f4937g = j2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaew
    /* JADX INFO: renamed from: n */
    public final boolean mo3965n(zzv zzvVar) {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzaew
    /* JADX INFO: renamed from: o0 */
    public final void mo3966o0(boolean z) {
        if (z) {
            zzadw zzadwVar = this.f4931a;
            zzadwVar.f5059b.m4042a();
            zzadwVar.f5064g = -9223372036854775807L;
            zzadwVar.f5062e = -9223372036854775807L;
            zzadwVar.f5061d = Math.min(zzadwVar.f5061d, 1);
            zzadwVar.f5065h = -9223372036854775807L;
            zzadwVar.f5070m = false;
        }
        this.f4932b.m4039c();
        zzaee zzaeeVar = this.f4933c;
        zzej zzejVar = zzaeeVar.f5104e;
        zzejVar.f14004a = 0;
        zzejVar.f14005b = -1;
        zzejVar.f14006c = 0;
        zzaeeVar.f5106g = -9223372036854775807L;
        zzaeeVar.f5107h = -9223372036854775807L;
        zzaeeVar.f5108i = -9223372036854775807L;
        zzfi zzfiVar = zzaeeVar.f5103d;
        if (zzfiVar.m6456b() > 0) {
            zzgtr.m7128a(zzfiVar.m6456b() > 0);
            while (zzfiVar.m6456b() > 1) {
                zzfiVar.m6457c();
            }
            Object objM6457c = zzfiVar.m6457c();
            objM6457c.getClass();
            zzaeeVar.f5110k = ((Long) objM6457c).longValue();
        }
        zzfi zzfiVar2 = zzaeeVar.f5102c;
        if (zzfiVar2.m6456b() > 0) {
            zzgtr.m7128a(zzfiVar2.m6456b() > 0);
            while (zzfiVar2.m6456b() > 1) {
                zzfiVar2.m6457c();
            }
            Object objM6457c2 = zzfiVar2.m6457c();
            objM6457c2.getClass();
            zzfiVar2.m6455a(0L, (zzbv) objM6457c2);
        }
        this.f4934d.clear();
    }

    @Override // com.google.android.gms.internal.ads.zzaew
    /* JADX INFO: renamed from: r */
    public final void mo3967r() {
        zzadw zzadwVar = this.f4931a;
        if (zzadwVar.f5061d == 0) {
            zzadwVar.f5061d = 1;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaew
    /* JADX INFO: renamed from: s */
    public final void mo3968s() {
    }

    @Override // com.google.android.gms.internal.ads.zzaew
    public final void zza() {
        this.f4932b.m4039c();
        this.f4931a.m4031b();
    }

    @Override // com.google.android.gms.internal.ads.zzaew
    public final void zzb() {
        this.f4932b.m4039c();
        zzadw zzadwVar = this.f4931a;
        zzadwVar.f5060c = false;
        zzadwVar.f5065h = -9223372036854775807L;
        zzaed zzaedVar = zzadwVar.f5059b;
        zzaedVar.f5084d = false;
        zzadz zzadzVar = zzaedVar.f5083c;
        if (zzadzVar != null) {
            zzadzVar.mo4041b();
        }
        zzaedVar.m4045d();
    }

    @Override // com.google.android.gms.internal.ads.zzaew
    public final void zzi() {
        zzaee zzaeeVar = this.f4933c;
        long j2 = zzaeeVar.f5106g;
        if (j2 == -9223372036854775807L) {
            j2 = Long.MIN_VALUE;
            zzaeeVar.f5106g = Long.MIN_VALUE;
            zzaeeVar.f5107h = Long.MIN_VALUE;
        }
        zzaeeVar.f5108i = j2;
    }

    @Override // com.google.android.gms.internal.ads.zzaew
    public final boolean zzj() {
        zzaee zzaeeVar = this.f4933c;
        long j2 = zzaeeVar.f5108i;
        return j2 != -9223372036854775807L && zzaeeVar.f5107h == j2;
    }

    @Override // com.google.android.gms.internal.ads.zzaew
    public final Surface zzk() {
        Surface surface = this.f4935e;
        surface.getClass();
        return surface;
    }
}
