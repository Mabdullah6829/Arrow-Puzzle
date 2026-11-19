package com.google.android.gms.internal.measurement;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzho extends zzadu implements zzafd {
    private static final zzho zze;
    private static volatile zzafj zzf;
    private zzaef zzb = zzafm.f22097w;

    static {
        zzho zzhoVar = new zzho();
        zze = zzhoVar;
        zzadu.m9561u(zzho.class, zzhoVar);
    }

    private zzho() {
    }

    /* JADX INFO: renamed from: B */
    public static zzhh m10095B() {
        return (zzhh) zze.m9571q();
    }

    /* JADX INFO: renamed from: C */
    public static zzho m10096C() {
        return zze;
    }

    /* JADX INFO: renamed from: A */
    public final List m10097A() {
        return this.zzb;
    }

    /* JADX INFO: renamed from: D */
    public final void m10098D(ArrayList arrayList) {
        zzaef zzaefVar = this.zzb;
        if (!zzaefVar.zza()) {
            this.zzb = AbstractC1456a.m2441h(zzaefVar);
        }
        zzacb.m9343k(arrayList, this.zzb);
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
            return new zzafn(zze, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzb", zzhl.class});
        }
        if (i3 == 3) {
            return new zzho();
        }
        if (i3 == 4) {
            return new zzhh(zze);
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
        synchronized (zzho.class) {
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
