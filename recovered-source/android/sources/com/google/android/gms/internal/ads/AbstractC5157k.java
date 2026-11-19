package com.google.android.gms.internal.ads;

import sun.misc.Unsafe;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.k */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC5157k {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ boolean m3837a(Unsafe unsafe, zzhay zzhayVar, long j2, Object obj, Object obj2) {
        while (!unsafe.compareAndSwapObject(zzhayVar, j2, obj, obj2)) {
            if (unsafe.getObject(zzhayVar, j2) != obj) {
                return false;
            }
        }
        return true;
    }
}
