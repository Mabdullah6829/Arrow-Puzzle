package com.google.android.gms.internal.measurement;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhw extends zzadu implements zzafd {
    private static final zzhw zzk;
    private static volatile zzafj zzl;
    private int zzb;
    private long zzg;
    private float zzh;
    private double zzi;
    private String zze = "";
    private String zzf = "";
    private zzaef zzj = zzafm.f22097w;

    static {
        zzhw zzhwVar = new zzhw();
        zzk = zzhwVar;
        zzadu.m9561u(zzhw.class, zzhwVar);
    }

    private zzhw() {
    }

    /* JADX INFO: renamed from: M */
    public static zzhv m10154M() {
        return (zzhv) zzk.m9571q();
    }

    /* JADX INFO: renamed from: A */
    public final boolean m10155A() {
        return (this.zzb & 1) != 0;
    }

    /* JADX INFO: renamed from: B */
    public final String m10156B() {
        return this.zze;
    }

    /* JADX INFO: renamed from: C */
    public final boolean m10157C() {
        return (this.zzb & 2) != 0;
    }

    /* JADX INFO: renamed from: D */
    public final String m10158D() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: E */
    public final boolean m10159E() {
        return (this.zzb & 4) != 0;
    }

    /* JADX INFO: renamed from: F */
    public final long m10160F() {
        return this.zzg;
    }

    /* JADX INFO: renamed from: G */
    public final boolean m10161G() {
        return (this.zzb & 8) != 0;
    }

    /* JADX INFO: renamed from: H */
    public final float m10162H() {
        return this.zzh;
    }

    /* JADX INFO: renamed from: I */
    public final boolean m10163I() {
        return (this.zzb & 16) != 0;
    }

    /* JADX INFO: renamed from: J */
    public final double m10164J() {
        return this.zzi;
    }

    /* JADX INFO: renamed from: K */
    public final zzaef m10165K() {
        return this.zzj;
    }

    /* JADX INFO: renamed from: L */
    public final int m10166L() {
        return this.zzj.size();
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m10167N(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zze = str;
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m10168O(String str) {
        str.getClass();
        this.zzb |= 2;
        this.zzf = str;
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m10169P() {
        this.zzb &= -3;
        this.zzf = zzk.zzf;
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m10170Q(long j2) {
        this.zzb |= 4;
        this.zzg = j2;
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m10171R() {
        this.zzb &= -5;
        this.zzg = 0L;
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m10172S(double d) {
        this.zzb |= 16;
        this.zzi = d;
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m10173T() {
        this.zzb &= -17;
        this.zzi = 0.0d;
    }

    /* JADX INFO: renamed from: U */
    public final void m10174U(zzhw zzhwVar) {
        zzaef zzaefVar = this.zzj;
        if (!zzaefVar.zza()) {
            this.zzj = AbstractC1456a.m2441h(zzaefVar);
        }
        this.zzj.add(zzhwVar);
    }

    /* JADX INFO: renamed from: V */
    public final void m10175V(ArrayList arrayList) {
        zzaef zzaefVar = this.zzj;
        if (!zzaefVar.zza()) {
            this.zzj = AbstractC1456a.m2441h(zzaefVar);
        }
        zzacb.m9343k(arrayList, this.zzj);
    }

    /* JADX INFO: renamed from: W */
    public final void m10176W() {
        this.zzj = zzafm.f22097w;
    }

    @Override // com.google.android.gms.internal.measurement.zzadu
    /* JADX INFO: renamed from: z */
    public final Object mo9574z(int i2) {
        zzafj zzadqVar;
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new zzafn(zzk, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ခ\u0003\u0005က\u0004\u0006\u001b", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", zzhw.class});
        }
        if (i3 == 3) {
            return new zzhw();
        }
        if (i3 == 4) {
            return new zzhv(zzk);
        }
        if (i3 == 5) {
            return zzk;
        }
        if (i3 != 6) {
            throw null;
        }
        zzafj zzafjVar = zzl;
        if (zzafjVar != null) {
            return zzafjVar;
        }
        synchronized (zzhw.class) {
            try {
                zzadqVar = zzl;
                if (zzadqVar == null) {
                    zzadqVar = new zzadq(zzk);
                    zzl = zzadqVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzadqVar;
    }
}
