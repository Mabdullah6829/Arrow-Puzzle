package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class zzaou {
    /* JADX INFO: renamed from: a */
    public static zzaov m4277a(zzaov zzaovVar, String[] strArr, Map map) {
        int length;
        int i2 = 0;
        if (zzaovVar == null) {
            if (strArr == null) {
                return null;
            }
            int length2 = strArr.length;
            if (length2 == 1) {
                return (zzaov) map.get(strArr[0]);
            }
            if (length2 > 1) {
                zzaov zzaovVar2 = new zzaov();
                while (i2 < length2) {
                    zzaovVar2.m4280c((zzaov) map.get(strArr[i2]));
                    i2++;
                }
                return zzaovVar2;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                zzaovVar.m4280c((zzaov) map.get(strArr[0]));
                return zzaovVar;
            }
            if (strArr != null && (length = strArr.length) > 1) {
                while (i2 < length) {
                    zzaovVar.m4280c((zzaov) map.get(strArr[i2]));
                    i2++;
                }
            }
        }
        return zzaovVar;
    }
}
