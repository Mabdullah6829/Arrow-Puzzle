package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzja extends zzadu implements zzafd {
    private static final zzja zzg;
    private static volatile zzafj zzh;
    private int zzb;
    private zzaef zze = zzafm.f22097w;
    private zziw zzf;

    static {
        zzja zzjaVar = new zzja();
        zzg = zzjaVar;
        zzadu.m9561u(zzja.class, zzjaVar);
    }

    private zzja() {
    }

    /* JADX INFO: renamed from: A */
    public final List m10443A() {
        return this.zze;
    }

    /* JADX INFO: renamed from: B */
    public final zziw m10444B() {
        zziw zziwVar = this.zzf;
        return zziwVar == null ? zziw.m10438C() : zziwVar;
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
            return new zzafn(zzg, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"zzb", "zze", zzje.class, "zzf"});
        }
        if (i3 == 3) {
            return new zzja();
        }
        if (i3 == 4) {
            return new zziz(zzg);
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
        synchronized (zzja.class) {
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
