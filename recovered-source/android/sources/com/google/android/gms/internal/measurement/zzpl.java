package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzpl extends zzadu implements zzafd {
    private static final zzpl zze;
    private static volatile zzafj zzf;
    private zzaef zzb = zzafm.f22097w;

    static {
        zzpl zzplVar = new zzpl();
        zze = zzplVar;
        zzadu.m9561u(zzpl.class, zzplVar);
    }

    private zzpl() {
    }

    /* JADX INFO: renamed from: B */
    public static zzpl m10583B(byte[] bArr, zzadf zzadfVar) {
        return (zzpl) zzadu.m9559l(zze, bArr, zzadfVar);
    }

    /* JADX INFO: renamed from: A */
    public final List m10584A() {
        return this.zzb;
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
            return new zzafn(zze, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"zzb"});
        }
        if (i3 == 3) {
            return new zzpl();
        }
        if (i3 == 4) {
            return new zzpk(zze);
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
        synchronized (zzpl.class) {
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
