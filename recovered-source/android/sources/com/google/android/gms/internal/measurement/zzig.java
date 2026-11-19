package com.google.android.gms.internal.measurement;

import androidx.datastore.preferences.protobuf.AbstractC1456a;

/* JADX INFO: loaded from: classes2.dex */
public final class zzig extends zzadu implements zzafd {
    private static final zzig zzg;
    private static volatile zzafj zzh;
    private int zzb;
    private int zze = 1;
    private zzaef zzf = zzafm.f22097w;

    static {
        zzig zzigVar = new zzig();
        zzg = zzigVar;
        zzadu.m9561u(zzig.class, zzigVar);
    }

    private zzig() {
    }

    /* JADX INFO: renamed from: A */
    public static zzie m10376A() {
        return (zzie) zzg.m9571q();
    }

    /* JADX INFO: renamed from: B */
    public final void m10377B(zzhu zzhuVar) {
        zzaef zzaefVar = this.zzf;
        if (!zzaefVar.zza()) {
            this.zzf = AbstractC1456a.m2441h(zzaefVar);
        }
        this.zzf.add(zzhuVar);
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
            return new zzafn(zzg, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001᠌\u0000\u0002\u001b", new Object[]{"zzb", "zze", zzif.f22504a, "zzf", zzhu.class});
        }
        if (i3 == 3) {
            return new zzig();
        }
        if (i3 == 4) {
            return new zzie(zzg);
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
        synchronized (zzig.class) {
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
