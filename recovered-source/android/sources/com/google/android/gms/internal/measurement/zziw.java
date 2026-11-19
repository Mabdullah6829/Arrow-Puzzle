package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zziw extends zzadu implements zzafd {
    private static final zziw zze;
    private static volatile zzafj zzf;
    private zzaef zzb = zzafm.f22097w;

    static {
        zziw zziwVar = new zziw();
        zze = zziwVar;
        zzadu.m9561u(zziw.class, zziwVar);
    }

    private zziw() {
    }

    /* JADX INFO: renamed from: C */
    public static zziw m10438C() {
        return zze;
    }

    /* JADX INFO: renamed from: A */
    public final List m10439A() {
        return this.zzb;
    }

    /* JADX INFO: renamed from: B */
    public final int m10440B() {
        return this.zzb.size();
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
            return new zzafn(zze, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzb", zziy.class});
        }
        if (i3 == 3) {
            return new zziw();
        }
        if (i3 == 4) {
            return new zziv(zze);
        }
        if (i3 == 5) {
            return zze;
        }
        if (i3 != 6) {
            throw null;
        }
        zzafj zzafjVar = zzf;
        if (zzafjVar != null) {
            return zzafjVar;
        }
        synchronized (zziw.class) {
            try {
                zzadqVar = zzf;
                if (zzadqVar == null) {
                    zzadqVar = new zzadq(zze);
                    zzf = zzadqVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzadqVar;
    }
}
