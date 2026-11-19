package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhnn {

    /* JADX INFO: renamed from: a */
    public final HashMap f19014a = new HashMap();

    /* JADX INFO: renamed from: a */
    public final void m7583a(zzibk zzibkVar, Object obj) throws GeneralSecurityException {
        List list;
        byte[] bArr = zzibkVar.f19614a;
        if (bArr.length != 0 && bArr.length != 5) {
            throw new GeneralSecurityException("PrefixMap only supports 0 and 5 byte prefixes");
        }
        HashMap map = this.f19014a;
        if (map.containsKey(zzibkVar)) {
            list = (List) map.get(zzibkVar);
        } else {
            ArrayList arrayList = new ArrayList();
            map.put(zzibkVar, arrayList);
            list = arrayList;
        }
        list.add(obj);
    }
}
