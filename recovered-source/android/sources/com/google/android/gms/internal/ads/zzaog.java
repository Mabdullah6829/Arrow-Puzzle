package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaog implements zzans {

    /* JADX INFO: renamed from: a */
    public final zzeu f6214a = new zzeu();

    /* JADX INFO: renamed from: b */
    public final zzeu f6215b = new zzeu();

    /* JADX INFO: renamed from: c */
    public final zzaof f6216c = new zzaof();

    /* JADX INFO: renamed from: d */
    public Inflater f6217d;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.ads.zzans
    /* JADX INFO: renamed from: a */
    public final void mo4246a(byte[] bArr, int i2, int i3, zzdu zzduVar) {
        zzeu zzeuVar;
        zzcy zzcyVarM5860b;
        int i4;
        zzeu zzeuVar2;
        int i5;
        zzeu zzeuVar3;
        int i6;
        int i7;
        int iM6373O;
        zzeu zzeuVar4 = this.f6214a;
        zzeuVar4.m6397z(i2 + i3, bArr);
        zzeuVar4.m6363E(i2);
        if (this.f6217d == null) {
            this.f6217d = new Inflater();
        }
        Inflater inflater = this.f6217d;
        zzeu zzeuVar5 = this.f6215b;
        if (zzfm.m6507i(zzeuVar4, zzeuVar5, inflater)) {
            zzeuVar4.m6397z(zzeuVar5.f14889c, zzeuVar5.f14887a);
        }
        zzaof zzaofVar = this.f6216c;
        int i8 = 0;
        zzaofVar.f6208d = 0;
        zzeu zzeuVar6 = zzaofVar.f6205a;
        zzaofVar.f6209e = 0;
        zzaofVar.f6210f = 0;
        zzaofVar.f6211g = 0;
        zzaofVar.f6212h = 0;
        zzaofVar.f6213i = 0;
        zzeuVar6.m6396y(0);
        zzaofVar.f6207c = false;
        int[] iArr = zzaofVar.f6206b;
        ArrayList arrayList = new ArrayList();
        while (zzeuVar4.m6360B() >= 3) {
            int i9 = zzeuVar4.f14889c;
            int iM6369K = zzeuVar4.m6369K();
            int iM6370L = zzeuVar4.m6370L();
            int i10 = zzeuVar4.f14888b + iM6370L;
            if (i10 > i9) {
                zzeuVar4.m6363E(i9);
                zzeuVar = zzeuVar6;
                zzcyVarM5860b = null;
                i4 = i8;
                zzeuVar2 = zzeuVar4;
            } else {
                if (iM6369K != 128) {
                    switch (iM6369K) {
                        case 20:
                            if (iM6370L % 5 != 2) {
                                zzeuVar3 = zzeuVar4;
                                zzeuVar = zzeuVar6;
                            } else {
                                zzeuVar4.m6365G(2);
                                Arrays.fill(iArr, i8);
                                int i11 = iM6370L / 5;
                                int i12 = i8;
                                while (i12 < i11) {
                                    int iM6369K2 = zzeuVar4.m6369K();
                                    int iM6369K3 = zzeuVar4.m6369K();
                                    int iM6369K4 = zzeuVar4.m6369K();
                                    int iM6369K5 = zzeuVar4.m6369K();
                                    double d = iM6369K3;
                                    int iM6369K6 = zzeuVar4.m6369K() << 24;
                                    String str = zzfm.f16091a;
                                    zzeu zzeuVar7 = zzeuVar4;
                                    double d2 = iM6369K4 - 128;
                                    double d3 = iM6369K5 - 128;
                                    iArr[iM6369K2] = (Math.max(0, Math.min((int) ((d - (0.34414d * d3)) - (d2 * 0.71414d)), 255)) << 8) | iM6369K6 | (Math.max(0, Math.min((int) ((1.402d * d2) + d), 255)) << 16) | Math.max(0, Math.min((int) ((1.772d * d3) + d), 255));
                                    i12++;
                                    zzeuVar6 = zzeuVar6;
                                    zzeuVar4 = zzeuVar7;
                                }
                                zzeuVar3 = zzeuVar4;
                                zzeuVar = zzeuVar6;
                                zzaofVar.f6207c = true;
                            }
                            zzeuVar2 = zzeuVar3;
                            i4 = 0;
                            zzcyVarM5860b = null;
                            break;
                        case 21:
                            if (iM6370L >= 4) {
                                zzeuVar4.m6365G(3);
                                int i13 = iM6370L - 4;
                                if ((128 & zzeuVar4.m6369K()) == 0) {
                                    i6 = zzeuVar6.f14888b;
                                    i7 = zzeuVar6.f14889c;
                                    if (i6 < i7 && i13 > 0) {
                                        int iMin = Math.min(i13, i7 - i6);
                                        zzeuVar4.m6366H(zzeuVar6.f14887a, i6, iMin);
                                        zzeuVar6.m6363E(i6 + iMin);
                                    }
                                } else if (i13 >= 7 && (iM6373O = zzeuVar4.m6373O()) >= 4) {
                                    zzaofVar.f6212h = zzeuVar4.m6370L();
                                    zzaofVar.f6213i = zzeuVar4.m6370L();
                                    zzeuVar6.m6396y(iM6373O - 4);
                                    i13 = iM6370L - 11;
                                    i6 = zzeuVar6.f14888b;
                                    i7 = zzeuVar6.f14889c;
                                    if (i6 < i7) {
                                        int iMin2 = Math.min(i13, i7 - i6);
                                        zzeuVar4.m6366H(zzeuVar6.f14887a, i6, iMin2);
                                        zzeuVar6.m6363E(i6 + iMin2);
                                    }
                                }
                            }
                            zzeuVar = zzeuVar6;
                            zzcyVarM5860b = null;
                            i4 = i8;
                            zzeuVar2 = zzeuVar4;
                            break;
                        case 22:
                            if (iM6370L >= 19) {
                                zzaofVar.f6208d = zzeuVar4.m6370L();
                                zzaofVar.f6209e = zzeuVar4.m6370L();
                                zzeuVar4.m6365G(11);
                                zzaofVar.f6210f = zzeuVar4.m6370L();
                                zzaofVar.f6211g = zzeuVar4.m6370L();
                            }
                            zzeuVar = zzeuVar6;
                            zzcyVarM5860b = null;
                            i4 = i8;
                            zzeuVar2 = zzeuVar4;
                            break;
                        default:
                            zzeuVar = zzeuVar6;
                            zzcyVarM5860b = null;
                            i4 = i8;
                            zzeuVar2 = zzeuVar4;
                            break;
                    }
                } else {
                    zzeu zzeuVar8 = zzeuVar4;
                    zzeuVar = zzeuVar6;
                    if (zzaofVar.f6208d == 0 || zzaofVar.f6209e == 0 || zzaofVar.f6212h == 0 || zzaofVar.f6213i == 0 || (i5 = zzeuVar.f14889c) == 0 || zzeuVar.f14888b != i5 || !zzaofVar.f6207c) {
                        zzcyVarM5860b = null;
                    } else {
                        zzeuVar.m6363E(0);
                        int i14 = zzaofVar.f6212h * zzaofVar.f6213i;
                        int[] iArr2 = new int[i14];
                        int i15 = 0;
                        while (i15 < i14) {
                            int iM6369K7 = zzeuVar.m6369K();
                            if (iM6369K7 != 0) {
                                iArr2[i15] = iArr[iM6369K7];
                                i15++;
                            } else {
                                int iM6369K8 = zzeuVar.m6369K();
                                if (iM6369K8 != 0) {
                                    int iM6369K9 = iM6369K8 & 63;
                                    if ((iM6369K8 & 64) != 0) {
                                        iM6369K9 = (iM6369K9 << 8) | zzeuVar.m6369K();
                                    }
                                    int i16 = (iM6369K8 & 128) == 0 ? iArr[0] : iArr[zzeuVar.m6369K()];
                                    int i17 = i15 + iM6369K9;
                                    Arrays.fill(iArr2, i15, i17, i16);
                                    i15 = i17;
                                }
                            }
                        }
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iArr2, zzaofVar.f6212h, zzaofVar.f6213i, Bitmap.Config.ARGB_8888);
                        zzcx zzcxVar = new zzcx();
                        zzcxVar.f11650b = bitmapCreateBitmap;
                        zzcxVar.f11649a = null;
                        float f2 = zzaofVar.f6210f;
                        float f3 = zzaofVar.f6208d;
                        zzcxVar.f11656h = f2 / f3;
                        zzcxVar.f11657i = 0;
                        float f4 = zzaofVar.f6211g;
                        float f5 = zzaofVar.f6209e;
                        zzcxVar.f11653e = f4 / f5;
                        zzcxVar.f11654f = 0;
                        zzcxVar.f11655g = 0;
                        zzcxVar.f11660l = zzaofVar.f6212h / f3;
                        zzcxVar.f11661m = zzaofVar.f6213i / f5;
                        zzcyVarM5860b = zzcxVar.m5860b();
                    }
                    i4 = 0;
                    zzaofVar.f6208d = 0;
                    zzaofVar.f6209e = 0;
                    zzaofVar.f6210f = 0;
                    zzaofVar.f6211g = 0;
                    zzaofVar.f6212h = 0;
                    zzaofVar.f6213i = 0;
                    zzeuVar.m6396y(0);
                    zzaofVar.f6207c = false;
                    zzeuVar2 = zzeuVar8;
                }
                zzeuVar2.m6363E(i10);
            }
            if (zzcyVarM5860b != null) {
                arrayList.add(zzcyVarM5860b);
            }
            zzeuVar4 = zzeuVar2;
            i8 = i4;
            zzeuVar6 = zzeuVar;
        }
        ((zzanu) zzduVar).mo3942b(new zzank(arrayList, -9223372036854775807L, -9223372036854775807L));
    }
}
