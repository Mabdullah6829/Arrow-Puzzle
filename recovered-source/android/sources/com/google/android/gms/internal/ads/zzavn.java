package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzavn implements zzavl {

    /* JADX INFO: renamed from: a */
    public int f7025a = -1;

    /* JADX INFO: renamed from: b */
    public final byte[] f7026b = new byte[8];

    /* JADX INFO: renamed from: c */
    public final zzavp f7027c;

    public zzavn(zzavp zzavpVar) {
        this.f7027c = zzavpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzavl
    /* JADX INFO: renamed from: a */
    public final byte mo4439a(zzavx zzavxVar, int i2) {
        int i3 = ((((~1264448664) & 231739608) | 1128901767) + ((1264448664 & 479203675) | 860794247)) - 1823332376;
        int i4 = 1761855727 % 1384724137;
        int i5 = (((((~143154913) & 992498304) | 439467622) + ((143154913 & 1627930754) | 1212551295)) - (-2089988634)) ^ (2033018190 % 70061690);
        int i6 = ((((~1661299468) & 613450408) | 2017391535) + ((1661299468 & 109051904) | 2071555381)) - (-441392543);
        int i7 = 1694830070 % 1383960411;
        int i8 = i2 >>> i5;
        int i9 = this.f7025a;
        byte[] bArr = this.f7026b;
        if (i8 != i9) {
            this.f7027c.m4441a(i8, bArr);
            this.f7025a = i8;
        }
        int i10 = i6 ^ i7;
        return (byte) (((zzavxVar.m4448b(i2) ^ bArr[i2 % (i3 ^ i4)]) << i10) >> i10);
    }

    @Override // com.google.android.gms.internal.ads.zzavl
    /* JADX INFO: renamed from: b */
    public final zzavx mo4440b(zzavx zzavxVar, int i2, int i3) {
        if (i2 < 0 || i2 > i3 || i3 > zzavxVar.f7096a.length) {
            throw new IndexOutOfBoundsException();
        }
        byte[] bArr = new byte[i3 - i2];
        int i4 = 0;
        while (i2 < i3) {
            bArr[i4] = mo4439a(zzavxVar, i2);
            i2++;
            i4++;
        }
        return zzavx.m4445e(bArr);
    }

    @Override // com.google.android.gms.internal.ads.zzavl
    public final /* bridge */ /* synthetic */ zzavl zzc() {
        return new zzavn(this.f7027c);
    }
}
