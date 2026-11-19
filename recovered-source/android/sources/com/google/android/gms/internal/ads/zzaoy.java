package com.google.android.gms.internal.ads;

import android.graphics.Rect;
import androidx.core.view.ViewCompat;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
final class zzaoy {

    /* JADX INFO: renamed from: d */
    public boolean f6342d;

    /* JADX INFO: renamed from: e */
    public boolean f6343e;

    /* JADX INFO: renamed from: f */
    public int[] f6344f;

    /* JADX INFO: renamed from: g */
    public int f6345g;

    /* JADX INFO: renamed from: h */
    public int f6346h;

    /* JADX INFO: renamed from: i */
    public Rect f6347i;

    /* JADX INFO: renamed from: b */
    public long f6340b = -9223372036854775807L;

    /* JADX INFO: renamed from: c */
    public long f6341c = -9223372036854775807L;

    /* JADX INFO: renamed from: a */
    public final int[] f6339a = new int[4];

    /* JADX INFO: renamed from: j */
    public int f6348j = -1;

    /* JADX INFO: renamed from: k */
    public int f6349k = -1;

    /* JADX INFO: renamed from: a */
    public static int m4284a(int i2, int i3) {
        return (i2 & ViewCompat.MEASURED_SIZE_MASK) | ((i3 * 17) << 24);
    }

    /* JADX INFO: renamed from: b */
    public final void m4285b(zzet zzetVar, boolean z, Rect rect, int[] iArr) {
        int i2;
        int i3;
        int i4 = !z ? 1 : 0;
        int iWidth = rect.width();
        int i5 = i4 * iWidth;
        int iHeight = rect.height();
        while (true) {
            int i6 = 0;
            do {
                int i7 = 1;
                int iM6345h = 0;
                while (true) {
                    if (iM6345h >= i7 || i7 > 64) {
                        i2 = iM6345h & 3;
                        if (iM6345h >= 4) {
                            i3 = iM6345h >> 2;
                            break;
                        } else {
                            i3 = iWidth;
                            break;
                        }
                    }
                    if (zzetVar.m6339b() < 4) {
                        i2 = -1;
                        i3 = 0;
                        break;
                    } else {
                        iM6345h = (iM6345h << 4) | zzetVar.m6345h(4);
                        i7 <<= 2;
                    }
                }
                int iMin = Math.min(i3, iWidth - i6);
                if (iMin > 0) {
                    int i8 = i5 + iMin;
                    Arrays.fill(iArr, i5, i8, this.f6339a[i2]);
                    i6 += iMin;
                    i5 = i8;
                }
            } while (i6 < iWidth);
            i4 += 2;
            if (i4 >= iHeight) {
                return;
            }
            i5 = i4 * iWidth;
            zzetVar.m6348k();
        }
    }
}
