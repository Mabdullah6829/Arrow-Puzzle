package com.google.android.gms.internal.ads;

import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class zzdo {

    /* JADX INFO: renamed from: b */
    public int f12407b;

    /* JADX INFO: renamed from: c */
    public int f12408c;

    /* JADX INFO: renamed from: d */
    public int f12409d = 7;

    /* JADX INFO: renamed from: a */
    public int[] f12406a = new int[8];

    /* JADX INFO: renamed from: a */
    public final void m5943a(int i2) {
        int[] iArr = this.f12406a;
        int i3 = this.f12408c;
        iArr[i3] = i2;
        int i4 = this.f12409d & (i3 + 1);
        this.f12408c = i4;
        int i5 = this.f12407b;
        if (i4 == i5) {
            int length = iArr.length;
            int i6 = length - i5;
            int i7 = length + length;
            int[] iArr2 = new int[i7];
            System.arraycopy(iArr, i5, iArr2, 0, i6);
            System.arraycopy(this.f12406a, 0, iArr2, i6, this.f12407b);
            this.f12406a = iArr2;
            this.f12407b = 0;
            this.f12408c = length;
            this.f12409d = i7 - 1;
        }
    }
}
