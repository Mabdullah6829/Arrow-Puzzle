package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzacd implements zzafj {
    static {
        zzadf zzadfVar = zzadf.f22012b;
        int i2 = zzacf.f21956a;
    }

    @Override // com.google.android.gms.internal.measurement.zzafj
    /* JADX INFO: renamed from: a */
    public final zzadu mo9350a(InputStream inputStream, zzadf zzadfVar) throws zzaeh {
        zzacv zzacvVarM9430h = zzacv.m9430h(4096, inputStream);
        int i2 = zzadu.zzd;
        zzadu zzaduVarM9570p = ((zzadq) this).f22031a.m9570p();
        try {
            zzafp zzafpVarM9649a = zzafl.f22093c.m9649a(zzaduVarM9570p.getClass());
            Object obj = zzacvVarM9430h.f21990c;
            zzafpVarM9649a.mo9638h(zzaduVarM9570p, obj != null ? (zzacw) obj : new zzacw(zzacvVarM9430h), zzadfVar);
            zzafpVarM9649a.mo9633c(zzaduVarM9570p);
            zzacvVarM9430h.mo9407m(0);
            if (zzadu.m9563x(zzaduVarM9570p, true)) {
                return zzaduVarM9570p;
            }
            throw new zzafy().m9674a();
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
}
