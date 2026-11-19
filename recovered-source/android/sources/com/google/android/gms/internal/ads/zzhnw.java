package com.google.android.gms.internal.ads;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhnw {

    /* JADX INFO: renamed from: a */
    public final HashMap f19028a;

    /* JADX INFO: renamed from: b */
    public final HashMap f19029b;

    public /* synthetic */ zzhnw(zzhnt zzhntVar) {
        this.f19028a = new HashMap(zzhntVar.f19022a);
        this.f19029b = new HashMap(zzhntVar.f19023b);
    }

    /* JADX INFO: renamed from: a */
    public final Object m7587a(zzhdz zzhdzVar, Class cls) throws GeneralSecurityException {
        zzhnu zzhnuVar = new zzhnu(zzhdzVar.getClass(), cls);
        HashMap map = this.f19028a;
        if (map.containsKey(zzhnuVar)) {
            return ((zzhns) map.get(zzhnuVar)).mo7585a(zzhdzVar);
        }
        String string = zzhnuVar.toString();
        throw new GeneralSecurityException(AbstractC1456a.m2450q(new StringBuilder(string.length() + 102), "No PrimitiveConstructor for ", string, " available, see https://developers.google.com/tink/faq/registration_errors"));
    }
}
