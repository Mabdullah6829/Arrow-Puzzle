package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes2.dex */
public final class zznk extends zzadu implements zzafd {
    private static final zznk zzo;
    private static volatile zzafj zzp;
    private int zzb;
    private boolean zzf;
    private zzaef zzh;
    private zzaef zzi;
    private zzaeb zzj;
    private zznm zzk;
    private boolean zzl;
    private boolean zzm;
    private zznf zzn;
    private zzacr zze = zzacr.f21972t;
    private String zzg = "";

    static {
        zznk zznkVar = new zznk();
        zzo = zznkVar;
        zzadu.m9561u(zznk.class, zznkVar);
    }

    private zznk() {
        zzafm zzafmVar = zzafm.f22097w;
        this.zzh = zzafmVar;
        this.zzi = zzafmVar;
        this.zzj = zzadv.f22033w;
    }

    /* JADX INFO: renamed from: A */
    public static zznk m10551A() {
        return zzo;
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
            return new zzafn(zzo, "\u0004\n\u0000\u0001\u0001\f\n\u0000\u0003\u0000\u0001ည\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004\u001a\u0005\u001a\u0007ࠬ\bဉ\u0003\nဇ\u0004\u000bဇ\u0005\fဉ\u0006", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", zzaby.f21943a, "zzk", "zzl", "zzm", "zzn"});
        }
        if (i3 == 3) {
            return new zznk();
        }
        if (i3 == 4) {
            return new zznj(zzo);
        }
        if (i3 == 5) {
            return zzo;
        }
        if (i3 != 6) {
            throw null;
        }
        zzafj zzafjVar = zzp;
        if (zzafjVar != null) {
            return zzafjVar;
        }
        synchronized (zznk.class) {
            try {
                zzadqVar = zzp;
                if (zzadqVar == null) {
                    zzadqVar = new zzadq(zzo);
                    zzp = zzadqVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzadqVar;
    }
}
