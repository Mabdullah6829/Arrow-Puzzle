package com.google.android.gms.internal.ads;

import java.util.LinkedList;

/* JADX INFO: loaded from: classes2.dex */
final class zzfmu {

    /* JADX INFO: renamed from: b */
    public final int f16123b;

    /* JADX INFO: renamed from: c */
    public final int f16124c;

    /* JADX INFO: renamed from: a */
    public final LinkedList f16122a = new LinkedList();

    /* JADX INFO: renamed from: d */
    public final zzfnt f16125d = new zzfnt();

    public zzfmu(int i2, int i3) {
        this.f16123b = i2;
        this.f16124c = i3;
    }

    /* JADX INFO: renamed from: a */
    public final void m6539a() {
        while (true) {
            LinkedList linkedList = this.f16122a;
            if (linkedList.isEmpty()) {
                return;
            }
            zzfne zzfneVar = (zzfne) linkedList.getFirst();
            com.google.android.gms.ads.internal.zzt.f3698C.f3711k.getClass();
            if (System.currentTimeMillis() - zzfneVar.f16158d < this.f16124c) {
                return;
            }
            zzfnt zzfntVar = this.f16125d;
            zzfntVar.f16182f++;
            zzfntVar.f16178b.f16176t++;
            linkedList.remove();
        }
    }
}
