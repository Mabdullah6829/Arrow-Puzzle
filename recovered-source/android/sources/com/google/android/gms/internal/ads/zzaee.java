package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
final class zzaee {

    /* JADX INFO: renamed from: a */
    public final zzadw f5100a;

    /* JADX INFO: renamed from: b */
    public final zzadu f5101b = new zzadu();

    /* JADX INFO: renamed from: c */
    public final zzfi f5102c = new zzfi(0);

    /* JADX INFO: renamed from: d */
    public final zzfi f5103d = new zzfi(0);

    /* JADX INFO: renamed from: e */
    public final zzej f5104e;

    /* JADX INFO: renamed from: f */
    public final zzadx f5105f;

    /* JADX INFO: renamed from: g */
    public long f5106g;

    /* JADX INFO: renamed from: h */
    public long f5107h;

    /* JADX INFO: renamed from: i */
    public long f5108i;

    /* JADX INFO: renamed from: j */
    public zzbv f5109j;

    /* JADX INFO: renamed from: k */
    public long f5110k;

    /* JADX INFO: renamed from: l */
    public final zzacw f5111l;

    public zzaee(zzacw zzacwVar, zzadw zzadwVar, zzadx zzadxVar) {
        this.f5111l = zzacwVar;
        this.f5100a = zzadwVar;
        this.f5105f = zzadxVar;
        zzej zzejVar = new zzej();
        int i2 = 16;
        if (Integer.bitCount(16) != 1) {
            int iHighestOneBit = Integer.highestOneBit(15);
            i2 = iHighestOneBit + iHighestOneBit;
        }
        zzejVar.f14004a = 0;
        zzejVar.f14005b = -1;
        zzejVar.f14006c = 0;
        zzejVar.f14007d = new long[i2];
        zzejVar.f14008e = i2 - 1;
        this.f5104e = zzejVar;
        this.f5106g = -9223372036854775807L;
        this.f5109j = zzbv.f9425d;
        this.f5107h = -9223372036854775807L;
        this.f5108i = -9223372036854775807L;
    }

    /* JADX INFO: renamed from: a */
    public final void m4046a(long j2, long j3) {
        final zzacw zzacwVar = this.f5111l;
        zzacx zzacxVar = zzacwVar.f4930b;
        while (true) {
            zzej zzejVar = this.f5104e;
            int i2 = zzejVar.f14006c;
            if (i2 == 0) {
                return;
            }
            if (i2 == 0) {
                throw new NoSuchElementException();
            }
            long j4 = zzejVar.f14007d[zzejVar.f14004a];
            Long l2 = (Long) this.f5103d.m6458d(j4);
            if (l2 != null && l2.longValue() != this.f5110k) {
                this.f5110k = l2.longValue();
                this.f5100a.m4030a(2);
            }
            long j5 = this.f5110k;
            zzadw zzadwVar = this.f5100a;
            zzadu zzaduVar = this.f5101b;
            int iM4035f = zzadwVar.m4035f(j4, j2, j3, j5, false, false, zzaduVar);
            if (iM4035f != 5 && iM4035f != 4) {
                this.f5105f.m4037a(j4, zzaduVar.f5056a);
            }
            if (iM4035f == 0 || iM4035f == 1) {
                this.f5107h = j4;
                long jM6231a = zzejVar.m6231a();
                final zzbv zzbvVar = (zzbv) this.f5102c.m6458d(jM6231a);
                if (zzbvVar != null && !zzbvVar.equals(zzbv.f9425d) && !zzbvVar.equals(this.f5109j)) {
                    this.f5109j = zzbvVar;
                    zzt zztVar = new zzt();
                    zztVar.f20809u = zzbvVar.f9426a;
                    zztVar.f20810v = zzbvVar.f9427b;
                    zztVar.m8853e("video/raw");
                    zzacwVar.f4929a = new zzv(zztVar);
                    zzacxVar.f4939i.execute(new Runnable(zzbvVar) { // from class: com.google.android.gms.internal.ads.zzacv
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            this.f4928s.f4930b.f4938h.getClass();
                        }
                    });
                }
                long jNanoTime = iM4035f == 0 ? System.nanoTime() : zzaduVar.f5057b;
                int i3 = zzadwVar.f5061d;
                zzadwVar.f5061d = 3;
                zzadwVar.f5063f = zzfm.m6519u(zzadwVar.f5068k.zzb());
                if ((i3 != 3) && zzacxVar.f4935e != null) {
                    zzacxVar.f4939i.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzact
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            zzacwVar.f4930b.f4938h.zzb();
                        }
                    });
                }
                zzv zzvVar = zzacwVar.f4929a;
                long j6 = jNanoTime;
                zzacxVar.f4940j.mo3949b(jM6231a, j6, zzvVar == null ? new zzv(new zzt()) : zzvVar, null);
                ((zzaeu) zzacxVar.f4934d.remove()).mo3972e(j6);
            } else if (iM4035f == 2 || iM4035f == 3) {
                this.f5107h = j4;
                zzejVar.m6231a();
                zzacxVar.f4939i.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzacu
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzacwVar.f4930b.f4938h.zzc();
                    }
                });
                ((zzaeu) zzacxVar.f4934d.remove()).zzb();
            } else if (iM4035f != 4) {
                return;
            } else {
                this.f5107h = j4;
            }
        }
    }
}
