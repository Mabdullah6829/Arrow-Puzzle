package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* JADX INFO: loaded from: classes2.dex */
public final class zzacj {

    /* JADX INFO: renamed from: g */
    public static final Comparator f4905g = new Comparator() { // from class: com.google.android.gms.internal.ads.zzaci
        @Override // java.util.Comparator
        public final /* synthetic */ int compare(Object obj, Object obj2) {
            return ((zzacg) obj).f4900a - ((zzacg) obj2).f4900a;
        }
    };

    /* JADX INFO: renamed from: h */
    public static final Comparator f4906h = new Comparator() { // from class: com.google.android.gms.internal.ads.zzach
        @Override // java.util.Comparator
        public final /* synthetic */ int compare(Object obj, Object obj2) {
            return Float.compare(((zzacg) obj).f4902c, ((zzacg) obj2).f4902c);
        }
    };

    /* JADX INFO: renamed from: d */
    public int f4910d;

    /* JADX INFO: renamed from: e */
    public int f4911e;

    /* JADX INFO: renamed from: f */
    public int f4912f;

    /* JADX INFO: renamed from: b */
    public final zzacg[] f4908b = new zzacg[5];

    /* JADX INFO: renamed from: a */
    public final ArrayList f4907a = new ArrayList();

    /* JADX INFO: renamed from: c */
    public int f4909c = -1;

    /* JADX INFO: renamed from: a */
    public final void m3946a(float f2, int i2) {
        zzacg zzacgVar;
        int i3 = this.f4909c;
        ArrayList arrayList = this.f4907a;
        if (i3 != 1) {
            Collections.sort(arrayList, f4905g);
            this.f4909c = 1;
        }
        int i4 = this.f4912f;
        zzacg[] zzacgVarArr = this.f4908b;
        if (i4 > 0) {
            int i5 = i4 - 1;
            this.f4912f = i5;
            zzacgVar = zzacgVarArr[i5];
        } else {
            zzacgVar = new zzacg();
        }
        int i6 = this.f4910d;
        this.f4910d = i6 + 1;
        zzacgVar.f4900a = i6;
        zzacgVar.f4901b = i2;
        zzacgVar.f4902c = f2;
        arrayList.add(zzacgVar);
        this.f4911e += i2;
        while (true) {
            int i7 = this.f4911e;
            if (i7 <= 2000) {
                return;
            }
            int i8 = i7 - 2000;
            zzacg zzacgVar2 = (zzacg) arrayList.get(0);
            int i9 = zzacgVar2.f4901b;
            if (i9 <= i8) {
                this.f4911e -= i9;
                arrayList.remove(0);
                int i10 = this.f4912f;
                if (i10 < 5) {
                    this.f4912f = i10 + 1;
                    zzacgVarArr[i10] = zzacgVar2;
                }
            } else {
                zzacgVar2.f4901b = i9 - i8;
                this.f4911e -= i8;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final float m3947b() {
        int i2 = this.f4909c;
        ArrayList arrayList = this.f4907a;
        if (i2 != 0) {
            Collections.sort(arrayList, f4906h);
            this.f4909c = 0;
        }
        float f2 = this.f4911e;
        int i3 = 0;
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            float f3 = 0.5f * f2;
            zzacg zzacgVar = (zzacg) arrayList.get(i4);
            i3 += zzacgVar.f4901b;
            if (i3 >= f3) {
                return zzacgVar.f4902c;
            }
        }
        if (arrayList.isEmpty()) {
            return Float.NaN;
        }
        return ((zzacg) arrayList.get(arrayList.size() - 1)).f4902c;
    }
}
