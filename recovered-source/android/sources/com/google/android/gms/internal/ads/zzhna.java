package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhna {

    /* JADX INFO: renamed from: b */
    public static final zzhna f18999b = new zzhna();

    /* JADX INFO: renamed from: a */
    public final HashMap f19000a = new HashMap();

    /* JADX INFO: renamed from: a */
    public final synchronized void m7567a(String str, zzheq zzheqVar) {
        try {
            HashMap map = this.f19000a;
            if (!map.containsKey(str)) {
                map.put(str, zzheqVar);
                return;
            }
            if (((zzheq) map.get(str)).equals(zzheqVar)) {
                return;
            }
            String strValueOf = String.valueOf(map.get(str));
            String strValueOf2 = String.valueOf(zzheqVar);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 45 + strValueOf.length() + 17 + strValueOf2.length());
            sb.append("Parameters object with name ");
            sb.append(str);
            sb.append(" already exists (");
            sb.append(strValueOf);
            sb.append("), cannot insert ");
            sb.append(strValueOf2);
            throw new GeneralSecurityException(sb.toString());
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m7568b(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            m7567a((String) entry.getKey(), (zzheq) entry.getValue());
        }
    }
}
