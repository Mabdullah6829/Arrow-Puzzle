package com.google.android.gms.internal.ads;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class zzzv extends zzzx {
    /* JADX INFO: renamed from: c */
    public static void m9067c(ArrayList arrayList, long[] jArr) {
        long j2 = 0;
        for (int i2 = 0; i2 < 2; i2++) {
            j2 += jArr[i2];
        }
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            zzgwq zzgwqVar = (zzgwq) arrayList.get(i3);
            if (zzgwqVar != null) {
                zzgwqVar.m7203c(new zzzt(j2, jArr[i3]));
            }
        }
    }
}
