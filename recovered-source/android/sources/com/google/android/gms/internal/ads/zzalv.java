package com.google.android.gms.internal.ads;

import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;

/* JADX INFO: loaded from: classes2.dex */
final class zzalv {

    /* JADX INFO: renamed from: a */
    public final zzahm f5842a;

    /* JADX INFO: renamed from: d */
    public zzams f5845d;

    /* JADX INFO: renamed from: e */
    public zzalp f5846e;

    /* JADX INFO: renamed from: f */
    public int f5847f;

    /* JADX INFO: renamed from: g */
    public int f5848g;

    /* JADX INFO: renamed from: h */
    public int f5849h;

    /* JADX INFO: renamed from: i */
    public int f5850i;

    /* JADX INFO: renamed from: j */
    public final zzv f5851j;

    /* JADX INFO: renamed from: m */
    public boolean f5854m;

    /* JADX INFO: renamed from: b */
    public final zzamr f5843b = new zzamr();

    /* JADX INFO: renamed from: c */
    public final zzeu f5844c = new zzeu();

    /* JADX INFO: renamed from: k */
    public final zzeu f5852k = new zzeu(1);

    /* JADX INFO: renamed from: l */
    public final zzeu f5853l = new zzeu();

    public zzalv(zzahm zzahmVar, zzams zzamsVar, zzalp zzalpVar, zzv zzvVar) {
        this.f5842a = zzahmVar;
        this.f5845d = zzamsVar;
        this.f5846e = zzalpVar;
        this.f5851j = zzvVar;
        this.f5845d = zzamsVar;
        this.f5846e = zzalpVar;
        zzahmVar.mo4097e(zzvVar);
        m4204a();
    }

    /* JADX INFO: renamed from: a */
    public final void m4204a() {
        zzamr zzamrVar = this.f5843b;
        zzamrVar.f6018d = 0;
        zzamrVar.f6030p = 0L;
        zzamrVar.f6031q = false;
        zzamrVar.f6025k = false;
        zzamrVar.f6029o = false;
        zzamrVar.f6027m = null;
        this.f5847f = 0;
        this.f5849h = 0;
        this.f5848g = 0;
        this.f5850i = 0;
        this.f5854m = false;
    }

    /* JADX INFO: renamed from: b */
    public final int m4205b() {
        int i2;
        if (this.f5854m) {
            i2 = this.f5843b.f6024j[this.f5847f] ? 1 : 0;
        } else {
            i2 = this.f5845d.f6038g[this.f5847f];
        }
        return m4208e() != null ? i2 | BasicMeasure.EXACTLY : i2;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m4206c() {
        this.f5847f++;
        if (!this.f5854m) {
            return false;
        }
        int i2 = this.f5848g + 1;
        this.f5848g = i2;
        int[] iArr = this.f5843b.f6021g;
        int i3 = this.f5849h;
        if (i2 != iArr[i3]) {
            return true;
        }
        this.f5849h = i3 + 1;
        this.f5848g = 0;
        return false;
    }

    /* JADX INFO: renamed from: d */
    public final int m4207d(int i2, int i3) {
        zzeu zzeuVar;
        zzamq zzamqVarM4208e = m4208e();
        if (zzamqVarM4208e == null) {
            return 0;
        }
        int length = zzamqVarM4208e.f6013d;
        zzamr zzamrVar = this.f5843b;
        if (length != 0) {
            zzeuVar = zzamrVar.f6028n;
        } else {
            byte[] bArr = zzamqVarM4208e.f6014e;
            String str = zzfm.f16091a;
            length = bArr.length;
            zzeu zzeuVar2 = this.f5853l;
            zzeuVar2.m6397z(length, bArr);
            zzeuVar = zzeuVar2;
        }
        boolean z = zzamrVar.f6025k && zzamrVar.f6026l[this.f5847f];
        boolean z2 = z || i3 != 0;
        int i4 = true != z2 ? 0 : 128;
        zzeu zzeuVar3 = this.f5852k;
        zzeuVar3.f14887a[0] = (byte) (i4 | length);
        zzeuVar3.m6363E(0);
        zzahm zzahmVar = this.f5842a;
        zzahmVar.mo4098f(zzeuVar3, 1, 1);
        zzahmVar.mo4098f(zzeuVar, length, 1);
        if (!z2) {
            return length + 1;
        }
        zzeu zzeuVar4 = this.f5844c;
        if (!z) {
            zzeuVar4.m6396y(8);
            byte[] bArr2 = zzeuVar4.f14887a;
            bArr2[0] = 0;
            bArr2[1] = 1;
            bArr2[2] = 0;
            bArr2[3] = (byte) i3;
            bArr2[4] = (byte) ((i2 >> 24) & 255);
            bArr2[5] = (byte) ((i2 >> 16) & 255);
            bArr2[6] = (byte) ((i2 >> 8) & 255);
            bArr2[7] = (byte) (i2 & 255);
            zzahmVar.mo4098f(zzeuVar4, 8, 1);
            return length + 9;
        }
        int i5 = length + 1;
        zzeu zzeuVar5 = zzamrVar.f6028n;
        int iM6370L = zzeuVar5.m6370L();
        zzeuVar5.m6365G(-2);
        int i6 = (iM6370L * 6) + 2;
        if (i3 != 0) {
            zzeuVar4.m6396y(i6);
            byte[] bArr3 = zzeuVar4.f14887a;
            zzeuVar5.m6366H(bArr3, 0, i6);
            int i7 = (((bArr3[2] & 255) << 8) | (bArr3[3] & 255)) + i3;
            bArr3[2] = (byte) ((i7 >> 8) & 255);
            bArr3[3] = (byte) (i7 & 255);
        } else {
            zzeuVar4 = zzeuVar5;
        }
        zzahmVar.mo4098f(zzeuVar4, i6, 1);
        return i5 + i6;
    }

    /* JADX INFO: renamed from: e */
    public final zzamq m4208e() {
        if (this.f5854m) {
            zzamr zzamrVar = this.f5843b;
            zzalp zzalpVar = zzamrVar.f6015a;
            String str = zzfm.f16091a;
            int i2 = zzalpVar.f5829a;
            zzamq zzamqVar = zzamrVar.f6027m;
            if (zzamqVar == null) {
                zzamq[] zzamqVarArr = this.f5845d.f6032a.f6009n;
                zzamqVar = zzamqVarArr == null ? null : zzamqVarArr[i2];
            }
            if (zzamqVar != null && zzamqVar.f6010a) {
                return zzamqVar;
            }
        }
        return null;
    }
}
