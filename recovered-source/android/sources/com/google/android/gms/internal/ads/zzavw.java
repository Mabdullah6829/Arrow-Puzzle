package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* JADX INFO: loaded from: classes2.dex */
final class zzavw implements Comparator {
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        int length;
        zzavx zzavxVar = (zzavx) obj;
        zzavx zzavxVar2 = (zzavx) obj2;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            length = zzavxVar.f7096a.length;
            if (i2 >= length || i3 >= zzavxVar2.f7096a.length) {
                break;
            }
            int iCompare = Integer.compare(zzavx.m4446f(zzavxVar.m4448b(i2)), zzavx.m4446f(zzavxVar2.m4448b(i3)));
            if (iCompare != 0) {
                return iCompare;
            }
            i2++;
            i3++;
        }
        return Integer.compare(length, zzavxVar2.f7096a.length);
    }
}
