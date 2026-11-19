package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhnt {

    /* JADX INFO: renamed from: a */
    public final HashMap f19022a;

    /* JADX INFO: renamed from: b */
    public final HashMap f19023b;

    private zzhnt() {
        this.f19022a = new HashMap();
        this.f19023b = new HashMap();
    }

    /* JADX INFO: renamed from: a */
    public final void m7586a(zzhns zzhnsVar) throws GeneralSecurityException {
        if (zzhnsVar == null) {
            throw new NullPointerException("primitive constructor must be non-null");
        }
        zzhnu zzhnuVar = new zzhnu(zzhnsVar.f19020a, zzhnsVar.f19021b);
        HashMap map = this.f19022a;
        if (!map.containsKey(zzhnuVar)) {
            map.put(zzhnuVar, zzhnsVar);
            return;
        }
        zzhns zzhnsVar2 = (zzhns) map.get(zzhnuVar);
        if (!zzhnsVar2.equals(zzhnsVar) || !zzhnsVar.equals(zzhnsVar2)) {
            throw new GeneralSecurityException("Attempt to register non-equal PrimitiveConstructor object for already existing object of type: ".concat(zzhnuVar.toString()));
        }
    }

    public /* synthetic */ zzhnt(zzhnw zzhnwVar) {
        this.f19022a = new HashMap(zzhnwVar.f19028a);
        this.f19023b = new HashMap(zzhnwVar.f19029b);
    }

    public /* synthetic */ zzhnt(int i2) {
        this.f19022a = new HashMap();
        this.f19023b = new HashMap();
    }
}
