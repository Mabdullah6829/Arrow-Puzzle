package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhnp {

    /* JADX INFO: renamed from: b */
    public static final zzibk f19017b = zzibk.m8050a(new byte[0]);

    /* JADX INFO: renamed from: a */
    public final Map f19018a;

    /* JADX INFO: renamed from: a */
    public final Iterable m7584a(byte[] bArr) {
        List list;
        zzibk zzibkVar = f19017b;
        Map map = this.f19018a;
        List list2 = (List) map.get(zzibkVar);
        if (bArr.length >= 5) {
            int length = bArr.length;
            list = (List) map.get(new zzibk(bArr, 5 > length ? length : 5));
        } else {
            list = null;
        }
        if (list2 == null && list == null) {
            return new ArrayList();
        }
        if (list2 == null) {
            return list;
        }
        return list == null ? list2 : new zzhnm(this, list, list2);
    }
}
