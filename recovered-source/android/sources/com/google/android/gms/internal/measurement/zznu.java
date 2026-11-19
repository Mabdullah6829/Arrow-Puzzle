package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes2.dex */
public final class zznu extends zzadu implements zzafd {
    private static final zznu zze;
    private static volatile zzafj zzf;
    private zzaew zzb = zzaew.f22069t;

    static {
        zznu zznuVar = new zznu();
        zze = zznuVar;
        zzadu.m9561u(zznu.class, zznuVar);
    }

    private zznu() {
    }

    /* JADX INFO: renamed from: B */
    public static zznu m10568B() {
        return zze;
    }

    /* JADX INFO: renamed from: A */
    public final zznr m10569A(String str, zznr zznrVar) {
        str.getClass();
        zznr zznrVar2 = (zznr) this.zzb.get(str);
        return zznrVar2 != null ? zznrVar2 : zznrVar;
    }

    /* JADX INFO: renamed from: C */
    public final zzaew m10570C() {
        zzaew zzaewVar = this.zzb;
        if (!zzaewVar.f22070s) {
            this.zzb = zzaewVar.m9605a();
        }
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
            return new zzafn(zze, "\u0004\u0001\u0000\u0000\u0002\u0002\u0001\u0001\u0000\u0000\u00022", new Object[]{"zzb", zzns.f22678a});
        }
        if (i3 == 3) {
            return new zznu();
        }
        if (i3 == 4) {
            return new zznt(zze);
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
        synchronized (zznu.class) {
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
