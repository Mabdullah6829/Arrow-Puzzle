package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
final class zzwp {

    /* JADX INFO: renamed from: a */
    public final int[] f23045a;

    /* JADX INFO: renamed from: b */
    public final zzwn f23046b;

    /* JADX INFO: renamed from: c */
    public zzwn f23047c;

    /* JADX INFO: renamed from: d */
    public int f23048d;

    /* JADX INFO: renamed from: e */
    public int f23049e;

    /* JADX INFO: renamed from: f */
    public int f23050f;

    public zzwp(int[] iArr) {
        this.f23045a = iArr;
        zzwn zzwnVar = new zzwn(-1, -1);
        this.f23046b = zzwnVar;
        this.f23047c = zzwnVar;
    }

    /* JADX INFO: renamed from: a */
    public final void m10696a() {
        if (this.f23049e == 0) {
            return;
        }
        HashMap map = this.f23047c.f23041d;
        int i2 = this.f23048d;
        int[] iArr = this.f23045a;
        zzwn zzwnVar = (zzwn) map.get(Integer.valueOf(iArr[i2]));
        while (true) {
            int i3 = (zzwnVar.f23039b - zzwnVar.f23038a) + 1;
            int i4 = this.f23049e;
            if (i3 > i4) {
                return;
            }
            int i5 = this.f23048d + i3;
            this.f23048d = i5;
            this.f23047c = zzwnVar;
            int i6 = i4 - i3;
            this.f23049e = i6;
            if (i6 > 0) {
                zzwnVar = (zzwn) zzwnVar.f23041d.get(Integer.valueOf(iArr[i5]));
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m10697b() {
        zzwn zzwnVar = this.f23047c.f23040c;
        if (zzwnVar != null) {
            this.f23047c = zzwnVar;
        } else {
            this.f23047c = this.f23046b;
            int i2 = this.f23049e;
            if (i2 > 0) {
                this.f23049e = i2 - 1;
            }
            if (this.f23050f > 0) {
                this.f23048d++;
            }
        }
        m10696a();
    }

    /* JADX INFO: renamed from: c */
    public final void m10698c(zzwn zzwnVar, StringBuilder sb) {
        for (zzwn zzwnVar2 : zzwnVar.f23041d.values()) {
            sb.append("  ");
            sb.append(zzwnVar);
            sb.append(" -> ");
            sb.append(zzwnVar2);
            sb.append(" [label=\"");
            int i2 = zzwnVar2.f23038a;
            int i3 = zzwnVar2.f23039b + 1;
            int[] iArr = this.f23045a;
            sb.append(Arrays.toString(Arrays.copyOfRange(iArr, i2, Math.min(iArr.length, i3))));
            sb.append("\"]\n");
            m10698c(zzwnVar2, sb);
        }
    }

    /* JADX INFO: renamed from: d */
    public final boolean m10699d(int i2, int i3, int i4, int i5) {
        if (i2 >= 0 && i4 >= 0) {
            int[] iArr = this.f23045a;
            int length = iArr.length;
            int iMin = Math.min(length, i3);
            if (iMin - i2 == Math.min(length, i5) - i4) {
                for (int i6 = i2; i6 <= iMin; i6++) {
                    if (iArr[i6] != iArr[(i4 + i6) - i2]) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("digraph {\n");
        m10698c(this.f23046b, sb);
        sb.append("}");
        return sb.toString();
    }
}
