package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class zzmq extends zzadu implements zzafd {
    private static final zzmq zzj;
    private static volatile zzafj zzk;
    private int zzb;
    private long zzh;
    private zzaew zzi = zzaew.f22069t;
    private String zze = "";
    private zzacr zzf = zzacr.f21972t;
    private String zzg = "";

    static {
        zzmq zzmqVar = new zzmq();
        zzj = zzmqVar;
        zzadu.m9561u(zzmq.class, zzmqVar);
    }

    private zzmq() {
    }

    /* JADX INFO: renamed from: G */
    public static zzmq m10519G(zzacv zzacvVar, zzadf zzadfVar) throws zzaeh {
        zzadu zzaduVarM9570p = zzj.m9570p();
        try {
            zzafp zzafpVarM9649a = zzafl.f22093c.m9649a(zzaduVarM9570p.getClass());
            Object obj = zzacvVar.f21990c;
            zzafpVarM9649a.mo9638h(zzaduVarM9570p, obj != null ? (zzacw) obj : new zzacw(zzacvVar), zzadfVar);
            zzafpVarM9649a.mo9633c(zzaduVarM9570p);
            zzadu.m9564y(zzaduVarM9570p);
            return (zzmq) zzaduVarM9570p;
        } catch (zzaeh e) {
            if (e.f22041s) {
                throw new zzaeh(e.getMessage(), e);
            }
            throw e;
        } catch (zzafy e2) {
            throw e2.m9674a();
        } catch (IOException e3) {
            if (e3.getCause() instanceof zzaeh) {
                throw ((zzaeh) e3.getCause());
            }
            throw new zzaeh(e3.getMessage(), e3);
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof zzaeh) {
                throw ((zzaeh) e4.getCause());
            }
            throw e4;
        }
    }

    /* JADX INFO: renamed from: H */
    public static zzmq m10520H() {
        return zzj;
    }

    /* JADX INFO: renamed from: A */
    public final String m10521A() {
        return this.zze;
    }

    /* JADX INFO: renamed from: B */
    public final zzacr m10522B() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: C */
    public final String m10523C() {
        return this.zzg;
    }

    /* JADX INFO: renamed from: D */
    public final long m10524D() {
        return this.zzh;
    }

    /* JADX INFO: renamed from: E */
    public final int m10525E() {
        return this.zzi.size();
    }

    /* JADX INFO: renamed from: F */
    public final Map m10526F() {
        return Collections.unmodifiableMap(this.zzi);
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
            return new zzafn(zzj, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0001\u0000\u0000\u0001ဈ\u0000\u0002ည\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u00052", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", zzmp.f22651a});
        }
        if (i3 == 3) {
            return new zzmq();
        }
        if (i3 == 4) {
            return new zzmo(zzj);
        }
        if (i3 == 5) {
            return zzj;
        }
        if (i3 != 6) {
            throw null;
        }
        zzafj zzafjVar = zzk;
        if (zzafjVar != null) {
            return zzafjVar;
        }
        synchronized (zzmq.class) {
            try {
                zzadqVar = zzk;
                if (zzadqVar == null) {
                    zzadqVar = new zzadq(zzj);
                    zzk = zzadqVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzadqVar;
    }
}
