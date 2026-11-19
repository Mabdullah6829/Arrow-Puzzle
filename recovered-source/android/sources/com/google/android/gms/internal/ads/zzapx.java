package com.google.android.gms.internal.ads;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzapx implements zzarn {

    /* JADX INFO: renamed from: a */
    public final List f6481a;

    public zzapx(List list) {
        this.f6481a = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX INFO: renamed from: a */
    public final List m4307a(zzarm zzarmVar) {
        String str;
        int i2;
        List listSingletonList;
        zzeu zzeuVar = new zzeu(zzarmVar.f6768c);
        ArrayList arrayList = this.f6481a;
        while (zzeuVar.m6360B() > 0) {
            int iM6369K = zzeuVar.m6369K();
            int iM6369K2 = zzeuVar.f14888b + zzeuVar.m6369K();
            if (iM6369K == 134) {
                arrayList = new ArrayList();
                int iM6369K3 = zzeuVar.m6369K() & 31;
                for (int i3 = 0; i3 < iM6369K3; i3++) {
                    String strM6385k = zzeuVar.m6385k(3, StandardCharsets.UTF_8);
                    int iM6369K4 = zzeuVar.m6369K();
                    boolean z = (iM6369K4 & 128) != 0;
                    if (z) {
                        i2 = iM6369K4 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i2 = 1;
                    }
                    byte bM6369K = (byte) zzeuVar.m6369K();
                    zzeuVar.m6365G(1);
                    if (z) {
                        int i4 = bM6369K & 64;
                        byte[] bArr = zzdr.f12695a;
                        listSingletonList = Collections.singletonList(i4 != 0 ? new byte[]{1} : new byte[]{0});
                    } else {
                        listSingletonList = null;
                    }
                    zzt zztVar = new zzt();
                    zztVar.m8853e(str);
                    zztVar.f20792d = strM6385k;
                    zztVar.f20786L = i2;
                    zztVar.f20805q = listSingletonList;
                    arrayList.add(new zzv(zztVar));
                }
            }
            zzeuVar.m6363E(iM6369K2);
            arrayList = arrayList;
        }
        return arrayList;
    }

    public zzapx() {
        this(0);
    }

    public zzapx(int i2) {
        zzgzi zzgziVar = zzgwt.f18303t;
        this.f6481a = zzgyo.f18355w;
    }
}
