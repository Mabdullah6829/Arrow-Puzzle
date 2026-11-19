package com.google.android.gms.ads.internal.util;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class zzbe {

    /* JADX INFO: renamed from: a */
    public final ArrayList f3517a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public final ArrayList f3518b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public final ArrayList f3519c = new ArrayList();

    /* JADX INFO: renamed from: a */
    public final void m3109a(String str, double d, double d2) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        int i2 = 0;
        while (true) {
            arrayList = this.f3517a;
            int size = arrayList.size();
            arrayList2 = this.f3518b;
            arrayList3 = this.f3519c;
            if (i2 >= size) {
                break;
            }
            double dDoubleValue = ((Double) arrayList3.get(i2)).doubleValue();
            double dDoubleValue2 = ((Double) arrayList2.get(i2)).doubleValue();
            if (d < dDoubleValue || (dDoubleValue == d && d2 < dDoubleValue2)) {
                break;
            } else {
                i2++;
            }
        }
        arrayList.add(i2, str);
        arrayList3.add(i2, Double.valueOf(d));
        arrayList2.add(i2, Double.valueOf(d2));
    }
}
