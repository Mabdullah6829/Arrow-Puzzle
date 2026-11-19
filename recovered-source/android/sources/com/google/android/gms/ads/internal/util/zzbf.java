package com.google.android.gms.ads.internal.util;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class zzbf {

    /* JADX INFO: renamed from: a */
    public final String[] f3520a;

    /* JADX INFO: renamed from: b */
    public final double[] f3521b;

    /* JADX INFO: renamed from: c */
    public final double[] f3522c;

    /* JADX INFO: renamed from: d */
    public final int[] f3523d;

    /* JADX INFO: renamed from: e */
    public int f3524e;

    public zzbf(zzbe zzbeVar) {
        ArrayList arrayList = zzbeVar.f3518b;
        int size = arrayList.size();
        this.f3520a = (String[]) zzbeVar.f3517a.toArray(new String[size]);
        int size2 = arrayList.size();
        double[] dArr = new double[size2];
        for (int i2 = 0; i2 < size2; i2++) {
            dArr[i2] = ((Double) arrayList.get(i2)).doubleValue();
        }
        this.f3521b = dArr;
        ArrayList arrayList2 = zzbeVar.f3519c;
        int size3 = arrayList2.size();
        double[] dArr2 = new double[size3];
        for (int i3 = 0; i3 < size3; i3++) {
            dArr2[i3] = ((Double) arrayList2.get(i3)).doubleValue();
        }
        this.f3522c = dArr2;
        this.f3523d = new int[size];
        this.f3524e = 0;
    }
}
