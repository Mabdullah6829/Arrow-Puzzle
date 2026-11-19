package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class zzpr extends zzadu implements zzafd {
    private static final zzpr zzl;
    private static volatile zzafj zzm;
    private int zzb;
    private boolean zzf;
    private int zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;
    private String zze = "";
    private zzaef zzg = zzafm.f22097w;

    static {
        zzpr zzprVar = new zzpr();
        zzl = zzprVar;
        zzadu.m9561u(zzpr.class, zzprVar);
    }

    private zzpr() {
    }

    /* JADX INFO: renamed from: C */
    public static zzpr m10589C(InputStream inputStream, zzadf zzadfVar) throws zzaeh {
        zzpr zzprVar = zzl;
        zzacv zzacvVarM9430h = zzacv.m9430h(4096, inputStream);
        zzadu zzaduVarM9570p = zzprVar.m9570p();
        try {
            zzafp zzafpVarM9649a = zzafl.f22093c.m9649a(zzaduVarM9570p.getClass());
            Object obj = zzacvVarM9430h.f21990c;
            zzafpVarM9649a.mo9638h(zzaduVarM9570p, obj != null ? (zzacw) obj : new zzacw(zzacvVarM9430h), zzadfVar);
            zzafpVarM9649a.mo9633c(zzaduVarM9570p);
            zzadu.m9564y(zzaduVarM9570p);
            return (zzpr) zzaduVarM9570p;
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

    /* JADX INFO: renamed from: A */
    public final String m10590A() {
        return this.zze;
    }

    /* JADX INFO: renamed from: B */
    public final boolean m10591B() {
        return this.zzf;
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
            return new zzafn(zzl, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003\u001a\u0004᠌\u0002\u0005ဇ\u0003\u0006ဇ\u0005\u0007ဇ\u0004", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", zzaby.f21943a, "zzi", "zzk", "zzj"});
        }
        if (i3 == 3) {
            return new zzpr();
        }
        if (i3 == 4) {
            return new zzpq(zzl);
        }
        if (i3 == 5) {
            return zzl;
        }
        if (i3 != 6) {
            throw null;
        }
        zzafj zzafjVar = zzm;
        if (zzafjVar != null) {
            return zzafjVar;
        }
        synchronized (zzpr.class) {
            try {
                zzadqVar = zzm;
                if (zzadqVar == null) {
                    zzadqVar = new zzadq(zzl);
                    zzm = zzadqVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzadqVar;
    }
}
