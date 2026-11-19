package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhmv {

    /* JADX INFO: renamed from: b */
    public static final zzhma f18991b = null;

    /* JADX INFO: renamed from: c */
    public static final zzhmv f18992c;

    /* JADX INFO: renamed from: a */
    public final HashMap f18993a = new HashMap();

    static {
        zzhmu zzhmuVar = new zzhma() { // from class: com.google.android.gms.internal.ads.zzhmu
            @Override // com.google.android.gms.internal.ads.zzhma
            /* JADX INFO: renamed from: a */
            public final zzhdz mo7431a(zzheq zzheqVar, Integer num) throws GeneralSecurityException {
                zzhma zzhmaVar = zzhmv.f18991b;
                zzhte zzhteVar = ((zzhmn) zzheqVar).f18987a.f19043b;
                zzhmb zzhmbVar = zzhmb.f18972d;
                zzhea zzheaVarM7558d = zzhmbVar.m7558d(zzhteVar.m7803D());
                if (!((Boolean) zzhmbVar.f18974b.get(zzhteVar.m7803D())).booleanValue()) {
                    throw new GeneralSecurityException("Creating new keys is not allowed.");
                }
                zzhtb zzhtbVarMo7407a = zzheaVarM7558d.mo7407a(zzhteVar.m7804E());
                zzhnz zzhnzVarM7588a = zzhnz.m7588a(zzhtbVarMo7407a.m7790D(), zzhtbVarMo7407a.m7791E(), zzhtbVarMo7407a.m7792F(), zzhteVar.m7805F(), num);
                zzhey zzheyVar = zzhey.f18574a;
                return new zzhmm(zzhnzVarM7588a);
            }
        };
        zzhmv zzhmvVar = new zzhmv();
        try {
            zzhmvVar.m7564a(zzhmuVar, zzhmn.class);
            f18992c = zzhmvVar;
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException("unexpected error.", e);
        }
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m7564a(zzhma zzhmaVar, Class cls) {
        try {
            HashMap map = this.f18993a;
            zzhma zzhmaVar2 = (zzhma) map.get(cls);
            if (zzhmaVar2 != null && !zzhmaVar2.equals(zzhmaVar)) {
                String string = cls.toString();
                StringBuilder sb = new StringBuilder(string.length() + 60);
                sb.append("Different key creator for parameters class ");
                sb.append(string);
                sb.append(" already inserted");
                throw new GeneralSecurityException(sb.toString());
            }
            map.put(cls, zzhmaVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: b */
    public final zzhdz m7565b(zzheq zzheqVar, Integer num) {
        zzhdz zzhdzVarMo7431a;
        synchronized (this) {
            zzhma zzhmaVar = (zzhma) this.f18993a.get(zzheqVar.getClass());
            if (zzhmaVar == null) {
                String string = zzheqVar.toString();
                StringBuilder sb = new StringBuilder(string.length() + 86);
                sb.append("Cannot create a new key for parameters ");
                sb.append(string);
                sb.append(": no key creator for this class was registered.");
                throw new GeneralSecurityException(sb.toString());
            }
            zzhdzVarMo7431a = zzhmaVar.mo7431a(zzheqVar, num);
        }
        return zzhdzVarMo7431a;
    }
}
