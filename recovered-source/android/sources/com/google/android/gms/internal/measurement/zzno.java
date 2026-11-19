package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes2.dex */
public final class zzno extends zzadu implements zzafd {
    private static final zzno zzg;
    private static volatile zzafj zzh;
    private int zzb;
    private zzni zze;
    private zznk zzf;

    static {
        zzno zznoVar = new zzno();
        zzg = zznoVar;
        zzadu.m9561u(zzno.class, zznoVar);
    }

    private zzno() {
    }

    /* JADX INFO: renamed from: C */
    public static zzno m10555C(byte[] bArr, zzadf zzadfVar) {
        return (zzno) zzadu.m9559l(zzg, bArr, zzadfVar);
    }

    /* JADX INFO: renamed from: D */
    public static zznn m10556D() {
        return (zznn) zzg.m9571q();
    }

    /* JADX INFO: renamed from: A */
    public final zzni m10557A() {
        zzni zzniVar = this.zze;
        return zzniVar == null ? zzni.m10536O() : zzniVar;
    }

    /* JADX INFO: renamed from: B */
    public final zznk m10558B() {
        zznk zznkVar = this.zzf;
        return zznkVar == null ? zznk.m10551A() : zznkVar;
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m10559E(zzni zzniVar) {
        this.zze = zzniVar;
        this.zzb |= 1;
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
            return new zzafn(zzg, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zzb", "zze", "zzf"});
        }
        if (i3 == 3) {
            return new zzno();
        }
        if (i3 == 4) {
            return new zznn(zzg);
        }
        if (i3 == 5) {
            return zzg;
        }
        if (i3 != 6) {
            throw null;
        }
        zzafj zzafjVar = zzh;
        if (zzafjVar != null) {
            return zzafjVar;
        }
        synchronized (zzno.class) {
            try {
                zzadqVar = zzh;
                if (zzadqVar == null) {
                    zzadqVar = new zzadq(zzg);
                    zzh = zzadqVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzadqVar;
    }
}
