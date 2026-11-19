package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Random;

/* JADX INFO: loaded from: classes2.dex */
public final class zzzg {

    /* JADX INFO: renamed from: a */
    public final Random f21470a;

    /* JADX INFO: renamed from: b */
    public final int[] f21471b;

    /* JADX INFO: renamed from: c */
    public final int[] f21472c;

    public zzzg() {
        this(new Random());
    }

    /* JADX INFO: renamed from: a */
    public final zzzg m9064a(int i2) {
        int[] iArr;
        Random random;
        int[] iArr2 = new int[i2];
        int[] iArr3 = new int[i2];
        int i3 = 0;
        while (true) {
            iArr = this.f21471b;
            random = this.f21470a;
            if (i3 >= i2) {
                break;
            }
            iArr2[i3] = random.nextInt(iArr.length + 1);
            int i4 = i3 + 1;
            int iNextInt = random.nextInt(i4);
            iArr3[i3] = iArr3[iNextInt];
            iArr3[iNextInt] = i3;
            i3 = i4;
        }
        Arrays.sort(iArr2);
        int[] iArr4 = new int[iArr.length + i2];
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < iArr.length + i2; i7++) {
            if (i5 >= i2 || i6 != iArr2[i5]) {
                int i8 = i6 + 1;
                int i9 = iArr[i6];
                iArr4[i7] = i9;
                if (i9 >= 0) {
                    iArr4[i7] = i9 + i2;
                }
                i6 = i8;
            } else {
                iArr4[i7] = iArr3[i5];
                i5++;
            }
        }
        return new zzzg(iArr4, new Random(random.nextLong()));
    }

    public zzzg(Random random) {
        this(new int[0], random);
    }

    public zzzg(int[] iArr, Random random) {
        this.f21471b = iArr;
        this.f21470a = random;
        this.f21472c = new int[iArr.length];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            this.f21472c[iArr[i2]] = i2;
        }
    }
}
