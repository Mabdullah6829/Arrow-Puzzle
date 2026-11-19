package com.google.android.gms.internal.measurement;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhs extends zzadu implements zzafd {
    private static final zzhs zzm;
    private static volatile zzafj zzn;
    private int zzb;
    private zzaef zze = zzafm.f22097w;
    private String zzf = "";
    private long zzg;
    private long zzh;
    private int zzi;
    private long zzj;
    private long zzk;
    private long zzl;

    static {
        zzhs zzhsVar = new zzhs();
        zzm = zzhsVar;
        zzadu.m9561u(zzhs.class, zzhsVar);
    }

    private zzhs() {
    }

    /* JADX INFO: renamed from: Q */
    public static zzhr m10121Q() {
        return (zzhr) zzm.m9571q();
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m10122A(long j2) {
        this.zzb |= 64;
        this.zzl = j2;
    }

    /* JADX INFO: renamed from: B */
    public final void m10123B() {
        zzaef zzaefVar = this.zze;
        if (zzaefVar.zza()) {
            return;
        }
        this.zze = AbstractC1456a.m2441h(zzaefVar);
    }

    /* JADX INFO: renamed from: C */
    public final List m10124C() {
        return this.zze;
    }

    /* JADX INFO: renamed from: D */
    public final int m10125D() {
        return this.zze.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: E */
    public final zzhw m10126E(int i2) {
        return (zzhw) this.zze.get(i2);
    }

    /* JADX INFO: renamed from: F */
    public final String m10127F() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: G */
    public final boolean m10128G() {
        return (this.zzb & 2) != 0;
    }

    /* JADX INFO: renamed from: H */
    public final long m10129H() {
        return this.zzg;
    }

    /* JADX INFO: renamed from: I */
    public final boolean m10130I() {
        return (this.zzb & 4) != 0;
    }

    /* JADX INFO: renamed from: J */
    public final long m10131J() {
        return this.zzh;
    }

    /* JADX INFO: renamed from: K */
    public final boolean m10132K() {
        return (this.zzb & 8) != 0;
    }

    /* JADX INFO: renamed from: L */
    public final int m10133L() {
        return this.zzi;
    }

    /* JADX INFO: renamed from: M */
    public final boolean m10134M() {
        return (this.zzb & 32) != 0;
    }

    /* JADX INFO: renamed from: N */
    public final long m10135N() {
        return this.zzk;
    }

    /* JADX INFO: renamed from: O */
    public final boolean m10136O() {
        return (this.zzb & 64) != 0;
    }

    /* JADX INFO: renamed from: P */
    public final long m10137P() {
        return this.zzl;
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m10138R(int i2, zzhw zzhwVar) {
        m10123B();
        this.zze.set(i2, zzhwVar);
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m10139S(zzhw zzhwVar) {
        zzhwVar.getClass();
        m10123B();
        this.zze.add(zzhwVar);
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m10140T(Iterable iterable) {
        m10123B();
        zzacb.m9343k(iterable, this.zze);
    }

    /* JADX INFO: renamed from: U */
    public final void m10141U() {
        this.zze = zzafm.f22097w;
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m10142V(int i2) {
        m10123B();
        this.zze.remove(i2);
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m10143W(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zzf = str;
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m10144X(long j2) {
        this.zzb |= 2;
        this.zzg = j2;
    }

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ void m10145Y(long j2) {
        this.zzb |= 4;
        this.zzh = j2;
    }

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ void m10146Z(long j2) {
        this.zzb |= 16;
        this.zzj = j2;
    }

    /* JADX INFO: renamed from: a0 */
    public final /* synthetic */ void m10147a0(long j2) {
        this.zzb |= 32;
        this.zzk = j2;
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
            return new zzafn(zzm, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဂ\u0001\u0004ဂ\u0002\u0005င\u0003\u0006ဂ\u0004\u0007ဂ\u0005\bဂ\u0006", new Object[]{"zzb", "zze", zzhw.class, "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
        }
        if (i3 == 3) {
            return new zzhs();
        }
        if (i3 == 4) {
            return new zzhr(zzm);
        }
        if (i3 == 5) {
            return zzm;
        }
        if (i3 != 6) {
            throw null;
        }
        zzafj zzafjVar = zzn;
        if (zzafjVar != null) {
            return zzafjVar;
        }
        synchronized (zzhs.class) {
            try {
                zzadqVar = zzn;
                if (zzadqVar == null) {
                    zzadqVar = new zzadq(zzm);
                    zzn = zzadqVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzadqVar;
    }
}
