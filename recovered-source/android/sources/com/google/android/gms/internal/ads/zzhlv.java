package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhlv {

    /* JADX INFO: renamed from: a */
    public final Map f18958a;

    /* JADX INFO: renamed from: b */
    public final Map f18959b;

    public /* synthetic */ zzhlv(Map map, Map map2) {
        this.f18958a = map;
        this.f18959b = map2;
    }

    /* JADX INFO: renamed from: a */
    public static zzhlu m7539a() {
        return new zzhlu(0);
    }

    /* JADX INFO: renamed from: b */
    public final Enum m7540b(Object obj) throws GeneralSecurityException {
        Enum r0 = (Enum) this.f18959b.get(obj);
        if (r0 != null) {
            return r0;
        }
        throw new GeneralSecurityException("Unable to convert object enum: ".concat(String.valueOf(obj)));
    }

    /* JADX INFO: renamed from: c */
    public final Object m7541c(Enum r3) throws GeneralSecurityException {
        Object obj = this.f18958a.get(r3);
        if (obj != null) {
            return obj;
        }
        throw new GeneralSecurityException("Unable to convert proto enum: ".concat(String.valueOf(r3)));
    }
}
