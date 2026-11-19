package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgbi extends zziep implements zziga {
    private static final zzgbi zzb;
    private static volatile zzigh zzc;
    private zzift zza = zzift.f19836t;

    static {
        zzgbi zzgbiVar = new zzgbi();
        zzb = zzgbiVar;
        zziep.m8338y(zzgbi.class, zzgbiVar);
    }

    private zzgbi() {
    }

    /* JADX INFO: renamed from: F */
    public static zzgbi m6864F(InputStream inputStream) throws zzifh {
        zzgbi zzgbiVar = zzb;
        zzidp zzidpVarM8198e = zzidp.m8198e(inputStream);
        zzidz zzidzVar = zzidz.f19758b;
        int i2 = zzicy.f19697a;
        zziep zziepVarM8334r = zziep.m8334r(zzgbiVar, zzidpVarM8198e, zzidz.f19759c);
        zziep.m8332C(zziepVarM8334r);
        return (zzgbi) zziepVarM8334r;
    }

    /* JADX INFO: renamed from: G */
    public static zzgbi m6865G() {
        return zzb;
    }

    /* JADX INFO: renamed from: D */
    public final int m6866D() {
        return this.zza.size();
    }

    /* JADX INFO: renamed from: E */
    public final Map m6867E() {
        return Collections.unmodifiableMap(this.zza);
    }

    /* JADX INFO: renamed from: H */
    public final zzift m6868H() {
        zzift zziftVar = this.zza;
        if (!zziftVar.f19837s) {
            this.zza = zziftVar.m8366a();
        }
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zziep
    /* JADX INFO: renamed from: z */
    public final Object mo4492z(zzieo zzieoVar, zziep zziepVar) {
        zzigh zziekVar;
        int iOrdinal = zzieoVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return new zzigl(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"zza", zzgbh.f16893a});
        }
        if (iOrdinal == 3) {
            return new zzgbi();
        }
        if (iOrdinal == 4) {
            return new zzgbg(zzb);
        }
        if (iOrdinal == 5) {
            return zzb;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzigh zzighVar = zzc;
        if (zzighVar != null) {
            return zzighVar;
        }
        synchronized (zzgbi.class) {
            try {
                zziekVar = zzc;
                if (zziekVar == null) {
                    zziekVar = new zziek(zzb);
                    zzc = zziekVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zziekVar;
    }
}
