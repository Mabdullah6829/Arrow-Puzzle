package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import androidx.core.view.ViewCompat;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaoe implements zzans {

    /* JADX INFO: renamed from: h */
    public static final byte[] f6195h = {0, 7, 8, 15};

    /* JADX INFO: renamed from: i */
    public static final byte[] f6196i = {0, 119, -120, -1};

    /* JADX INFO: renamed from: j */
    public static final byte[] f6197j = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};

    /* JADX INFO: renamed from: a */
    public final Paint f6198a;

    /* JADX INFO: renamed from: b */
    public final Paint f6199b;

    /* JADX INFO: renamed from: c */
    public final Canvas f6200c;

    /* JADX INFO: renamed from: d */
    public final zzanx f6201d;

    /* JADX INFO: renamed from: e */
    public final zzanw f6202e;

    /* JADX INFO: renamed from: f */
    public final zzaod f6203f;

    /* JADX INFO: renamed from: g */
    public Bitmap f6204g;

    public zzaoe(List list) {
        zzeu zzeuVar = new zzeu((byte[]) list.get(0));
        int iM6370L = zzeuVar.m6370L();
        int iM6370L2 = zzeuVar.m6370L();
        Paint paint = new Paint();
        this.f6198a = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.f6199b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.f6200c = new Canvas();
        this.f6201d = new zzanx(719, 575, 0, 719, 0, 575);
        this.f6202e = new zzanw(0, new int[]{0, -1, ViewCompat.MEASURED_STATE_MASK, -8421505}, m4250d(), m4251e());
        this.f6203f = new zzaod(iM6370L, iM6370L2);
    }

    /* JADX INFO: renamed from: b */
    public static zzanw m4248b(zzet zzetVar, int i2) {
        int[] iArr;
        int iM6345h;
        int iM6345h2;
        int iM6345h3;
        int iM6345h4;
        int i3 = 8;
        int iM6345h5 = zzetVar.m6345h(8);
        zzetVar.m6343f(8);
        int i4 = 0;
        int[] iArr2 = {0, -1, ViewCompat.MEASURED_STATE_MASK, -8421505};
        int[] iArrM4250d = m4250d();
        int[] iArrM4251e = m4251e();
        int i5 = i2 - 2;
        while (i5 > 0) {
            int iM6345h6 = zzetVar.m6345h(i3);
            int iM6345h7 = zzetVar.m6345h(i3);
            if ((iM6345h7 & 128) != 0) {
                iArr = iArr2;
            } else {
                iArr = (iM6345h7 & 64) != 0 ? iArrM4250d : iArrM4251e;
            }
            if ((iM6345h7 & 1) != 0) {
                iM6345h3 = zzetVar.m6345h(i3);
                iM6345h4 = zzetVar.m6345h(i3);
                iM6345h = zzetVar.m6345h(i3);
                iM6345h2 = zzetVar.m6345h(i3);
                i5 -= 6;
            } else {
                int iM6345h8 = zzetVar.m6345h(6) << 2;
                int iM6345h9 = zzetVar.m6345h(4) << 4;
                i5 -= 4;
                iM6345h = zzetVar.m6345h(4) << 4;
                iM6345h2 = zzetVar.m6345h(2) << 6;
                iM6345h3 = iM6345h8;
                iM6345h4 = iM6345h9;
            }
            if (iM6345h3 == 0) {
                iM6345h2 = 255;
            }
            if (iM6345h3 == 0) {
                iM6345h = i4;
            }
            if (iM6345h3 == 0) {
                iM6345h4 = i4;
            }
            double d = iM6345h3;
            String str = zzfm.f16091a;
            double d2 = iM6345h4 - 128;
            double d3 = iM6345h - 128;
            iArr[iM6345h6] = m4252f((byte) (255 - (iM6345h2 & 255)), Math.max(0, Math.min((int) ((1.402d * d2) + d), 255)), Math.max(0, Math.min((int) ((d - (0.34414d * d3)) - (d2 * 0.71414d)), 255)), Math.max(0, Math.min((int) ((d3 * 1.772d) + d), 255)));
            i4 = 0;
            iM6345h5 = iM6345h5;
            iArrM4251e = iArrM4251e;
            i3 = 8;
        }
        return new zzanw(iM6345h5, iArr2, iArrM4250d, iArrM4251e);
    }

    /* JADX INFO: renamed from: c */
    public static zzany m4249c(zzet zzetVar) {
        byte[] bArr;
        int iM6345h = zzetVar.m6345h(16);
        zzetVar.m6343f(4);
        int iM6345h2 = zzetVar.m6345h(2);
        boolean zM6344g = zzetVar.m6344g();
        zzetVar.m6343f(1);
        byte[] bArr2 = zzfm.f16092b;
        if (iM6345h2 != 1) {
            if (iM6345h2 == 0) {
                int iM6345h3 = zzetVar.m6345h(16);
                int iM6345h4 = zzetVar.m6345h(16);
                if (iM6345h3 > 0) {
                    bArr2 = new byte[iM6345h3];
                    zzgtr.m7133f(zzetVar.f14825c == 0);
                    System.arraycopy(zzetVar.f14823a, zzetVar.f14824b, bArr2, 0, iM6345h3);
                    zzetVar.f14824b += iM6345h3;
                    zzetVar.m6350m();
                }
                if (iM6345h4 > 0) {
                    bArr = new byte[iM6345h4];
                    zzgtr.m7133f(zzetVar.f14825c == 0);
                    System.arraycopy(zzetVar.f14823a, zzetVar.f14824b, bArr, 0, iM6345h4);
                    zzetVar.f14824b += iM6345h4;
                    zzetVar.m6350m();
                }
            }
            return new zzany(iM6345h, zM6344g, bArr2, bArr);
        }
        zzetVar.m6343f(zzetVar.m6345h(8) * 16);
        bArr = bArr2;
        return new zzany(iM6345h, zM6344g, bArr2, bArr);
    }

    /* JADX INFO: renamed from: d */
    public static int[] m4250d() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i2 = 1; i2 < 16; i2++) {
            int i3 = i2 & 4;
            int i4 = i2 & 2;
            int i5 = i2 & 1;
            if (i2 < 8) {
                iArr[i2] = m4252f(255, 1 != i5 ? 0 : 255, i4 != 0 ? 255 : 0, i3 != 0 ? 255 : 0);
            } else {
                iArr[i2] = m4252f(255, 1 != i5 ? 0 : 127, i4 != 0 ? 127 : 0, i3 == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    /* JADX INFO: renamed from: e */
    public static int[] m4251e() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i2 = 0; i2 < 256; i2++) {
            if (i2 < 8) {
                iArr[i2] = m4252f(63, 1 != (i2 & 1) ? 0 : 255, (i2 & 2) != 0 ? 255 : 0, (i2 & 4) == 0 ? 0 : 255);
            } else {
                int i3 = i2 & 136;
                if (i3 == 0) {
                    iArr[i2] = m4252f(255, (1 != (i2 & 1) ? 0 : 85) + ((i2 & 16) != 0 ? 170 : 0), ((i2 & 2) != 0 ? 85 : 0) + ((i2 & 32) != 0 ? 170 : 0), ((i2 & 4) == 0 ? 0 : 85) + ((i2 & 64) == 0 ? 0 : 170));
                } else if (i3 == 8) {
                    iArr[i2] = m4252f(127, (1 != (i2 & 1) ? 0 : 85) + ((i2 & 16) != 0 ? 170 : 0), ((i2 & 2) != 0 ? 85 : 0) + ((i2 & 32) != 0 ? 170 : 0), ((i2 & 4) == 0 ? 0 : 85) + ((i2 & 64) == 0 ? 0 : 170));
                } else if (i3 == 128) {
                    iArr[i2] = m4252f(255, (1 != (i2 & 1) ? 0 : 43) + 127 + ((i2 & 16) != 0 ? 85 : 0), ((i2 & 2) != 0 ? 43 : 0) + 127 + ((i2 & 32) != 0 ? 85 : 0), ((i2 & 4) == 0 ? 0 : 43) + 127 + ((i2 & 64) == 0 ? 0 : 85));
                } else if (i3 == 136) {
                    iArr[i2] = m4252f(255, (1 != (i2 & 1) ? 0 : 43) + ((i2 & 16) != 0 ? 85 : 0), ((i2 & 2) != 0 ? 43 : 0) + ((i2 & 32) != 0 ? 85 : 0), ((i2 & 4) == 0 ? 0 : 43) + ((i2 & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    /* JADX INFO: renamed from: f */
    public static int m4252f(int i2, int i3, int i4, int i5) {
        return (i2 << 24) | (i3 << 16) | (i4 << 8) | i5;
    }

    /* JADX WARN: Code duplicated, block: B:112:0x01d0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:117:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:122:0x0201 A[LOOP:3: B:89:0x0163->B:122:0x0201, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:144:0x01fa A[SYNTHETIC] */
    /* JADX INFO: renamed from: g */
    public static void m4253g(byte[] bArr, int[] iArr, int i2, int i3, int i4, Paint paint, Canvas canvas) {
        byte[] bArr2;
        byte[] bArr3;
        char c;
        int iM6345h;
        int iM6345h2;
        int iM6345h3;
        int i5;
        int iM6345h4;
        int iM6345h5;
        int i6;
        int i7;
        int iM6345h6;
        int i8;
        Paint paint2 = paint;
        zzet zzetVar = new zzet(bArr, bArr.length);
        int i9 = i3;
        int i10 = i4;
        byte[] bArrM4254h = null;
        byte[] bArrM4254h2 = null;
        byte[] bArrM4254h3 = null;
        while (zzetVar.m6339b() != 0) {
            int iM6345h7 = zzetVar.m6345h(8);
            if (iM6345h7 != 240) {
                int i11 = 4;
                int i12 = 1;
                int i13 = 2;
                switch (iM6345h7) {
                    case 16:
                        int i14 = 1;
                        if (i2 == 3) {
                            if (bArrM4254h == null) {
                                bArr3 = f6196i;
                                bArr2 = bArr3;
                            } else {
                                bArr2 = bArrM4254h;
                            }
                        } else if (i2 != 2) {
                            bArr2 = null;
                        } else if (bArrM4254h3 == null) {
                            bArr3 = f6195h;
                            bArr2 = bArr3;
                        } else {
                            bArr2 = bArrM4254h3;
                        }
                        int i15 = 0;
                        while (true) {
                            int iM6345h8 = zzetVar.m6345h(2);
                            if (iM6345h8 != 0) {
                                iM6345h2 = i14;
                                iM6345h = iM6345h8;
                            } else {
                                if (zzetVar.m6344g()) {
                                    iM6345h3 = zzetVar.m6345h(3) + 3;
                                    iM6345h = zzetVar.m6345h(2);
                                } else {
                                    if (zzetVar.m6344g()) {
                                        iM6345h2 = i14;
                                        iM6345h = 0;
                                    } else {
                                        int iM6345h9 = zzetVar.m6345h(2);
                                        if (iM6345h9 == 0) {
                                            c = 4;
                                            i15 = i14;
                                            iM6345h = 0;
                                            iM6345h2 = 0;
                                        } else if (iM6345h9 == i14) {
                                            c = 4;
                                            i15 = i15;
                                            iM6345h2 = 2;
                                            iM6345h = 0;
                                        } else if (iM6345h9 == 2) {
                                            c = 4;
                                            i15 = i15;
                                            iM6345h2 = zzetVar.m6345h(4) + 12;
                                            iM6345h = zzetVar.m6345h(2);
                                        } else if (iM6345h9 != 3) {
                                            iM6345h = 0;
                                            iM6345h2 = 0;
                                        } else {
                                            iM6345h3 = zzetVar.m6345h(8) + 29;
                                            iM6345h = zzetVar.m6345h(2);
                                        }
                                        if (iM6345h2 == 0 && paint2 != null) {
                                            int i16 = i10 + 1;
                                            float f2 = i10;
                                            if (bArr2 != 0) {
                                                iM6345h = bArr2[iM6345h];
                                            }
                                            paint2.setColor(iArr[iM6345h]);
                                            canvas.drawRect(i9, f2, i9 + iM6345h2, i16, paint2);
                                        }
                                        i9 += iM6345h2;
                                        if (i15 != 0) {
                                            zzetVar.m6348k();
                                        } else {
                                            paint2 = paint;
                                            i15 = i15;
                                            i14 = 1;
                                        }
                                    }
                                    c = 4;
                                    if (iM6345h2 == 0) {
                                    }
                                    i9 += iM6345h2;
                                    if (i15 != 0) {
                                        zzetVar.m6348k();
                                    } else {
                                        paint2 = paint;
                                        i15 = i15;
                                        i14 = 1;
                                    }
                                }
                                iM6345h2 = iM6345h3;
                            }
                            c = 4;
                            if (iM6345h2 == 0) {
                            }
                            i9 += iM6345h2;
                            if (i15 != 0) {
                                zzetVar.m6348k();
                            } else {
                                paint2 = paint;
                                i15 = i15;
                                i14 = 1;
                            }
                            break;
                        }
                        break;
                    case 17:
                        byte[] bArr4 = i2 == 3 ? bArrM4254h2 == null ? f6197j : bArrM4254h2 : null;
                        boolean z = false;
                        while (true) {
                            int iM6345h10 = zzetVar.m6345h(i11);
                            if (iM6345h10 != 0) {
                                i5 = 1;
                                z = z;
                            } else if (zzetVar.m6344g()) {
                                if (zzetVar.m6344g()) {
                                    int iM6345h11 = zzetVar.m6345h(i13);
                                    if (iM6345h11 == 0) {
                                        i5 = 1;
                                    } else if (iM6345h11 == 1) {
                                        i5 = i13;
                                    } else if (iM6345h11 == i13) {
                                        iM6345h4 = zzetVar.m6345h(i11) + 9;
                                        iM6345h5 = zzetVar.m6345h(i11);
                                    } else if (iM6345h11 != 3) {
                                        z = z;
                                        iM6345h10 = 0;
                                        i5 = 0;
                                    } else {
                                        iM6345h4 = zzetVar.m6345h(8) + 25;
                                        iM6345h5 = zzetVar.m6345h(i11);
                                    }
                                    iM6345h10 = 0;
                                } else {
                                    iM6345h4 = zzetVar.m6345h(i13) + i11;
                                    iM6345h5 = zzetVar.m6345h(i11);
                                }
                                i5 = iM6345h4;
                                z = z;
                                iM6345h10 = iM6345h5;
                            } else {
                                int iM6345h12 = zzetVar.m6345h(3);
                                if (iM6345h12 != 0) {
                                    i5 = iM6345h12 + 2;
                                    iM6345h10 = 0;
                                } else {
                                    z = true;
                                    iM6345h10 = 0;
                                    i5 = 0;
                                }
                            }
                            if (i5 == 0 || paint2 == null) {
                                i6 = i13;
                            } else {
                                int i17 = i10 + 1;
                                float f3 = i10;
                                if (bArr4 != 0) {
                                    iM6345h10 = bArr4[iM6345h10];
                                }
                                paint2.setColor(iArr[iM6345h10]);
                                i6 = 2;
                                canvas.drawRect(i9, f3, i9 + i5, i17, paint2);
                            }
                            i9 += i5;
                            if (z) {
                                zzetVar.m6348k();
                                continue;
                            } else {
                                i13 = i6;
                                z = z;
                                i11 = 4;
                            }
                            break;
                        }
                        break;
                    case 18:
                        int i18 = i9;
                        int i19 = 0;
                        while (true) {
                            int iM6345h13 = zzetVar.m6345h(8);
                            if (iM6345h13 != 0) {
                                i7 = i19;
                                iM6345h6 = i12;
                            } else if (zzetVar.m6344g()) {
                                i7 = i19;
                                iM6345h6 = zzetVar.m6345h(7);
                                iM6345h13 = zzetVar.m6345h(8);
                            } else {
                                int iM6345h14 = zzetVar.m6345h(7);
                                if (iM6345h14 != 0) {
                                    i7 = i19;
                                    iM6345h6 = iM6345h14;
                                    iM6345h13 = 0;
                                } else {
                                    i7 = i12;
                                    iM6345h13 = 0;
                                    iM6345h6 = 0;
                                }
                            }
                            if (iM6345h6 == 0 || paint2 == null) {
                                i8 = i12;
                            } else {
                                paint2.setColor(iArr[iM6345h13]);
                                i8 = i12;
                                canvas.drawRect(i18, i10, i18 + iM6345h6, i10 + 1, paint2);
                            }
                            i18 += iM6345h6;
                            if (i7 != 0) {
                                i9 = i18;
                                continue;
                            } else {
                                i12 = i8;
                                i19 = i7;
                            }
                            break;
                        }
                        break;
                    default:
                        switch (iM6345h7) {
                            case 32:
                                bArrM4254h3 = m4254h(4, 4, zzetVar);
                                break;
                            case 33:
                                bArrM4254h = m4254h(4, 8, zzetVar);
                                break;
                            case 34:
                                bArrM4254h2 = m4254h(16, 8, zzetVar);
                                break;
                            default:
                                continue;
                        }
                        break;
                }
            } else {
                i10 += 2;
                i9 = i3;
            }
            paint2 = paint;
        }
    }

    /* JADX INFO: renamed from: h */
    public static byte[] m4254h(int i2, int i3, zzet zzetVar) {
        byte[] bArr = new byte[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            bArr[i4] = (byte) zzetVar.m6345h(i3);
        }
        return bArr;
    }

    @Override // com.google.android.gms.internal.ads.zzans
    /* JADX INFO: renamed from: a */
    public final void mo4246a(byte[] bArr, int i2, int i3, zzdu zzduVar) {
        zzaod zzaodVar;
        boolean z;
        zzank zzankVar;
        char c;
        char c2;
        char c3;
        int i4;
        zzaob zzaobVar;
        int i5;
        zzaob zzaobVar2;
        int iM6345h;
        int iM6345h2;
        int i6;
        int iM6345h3;
        zzet zzetVar = new zzet(bArr, i2 + i3);
        zzetVar.m6341d(i2);
        while (true) {
            int iM6339b = zzetVar.m6339b();
            zzaodVar = this.f6203f;
            z = true;
            if (iM6339b >= 48 && zzetVar.m6345h(8) == 15) {
                int iM6345h4 = zzetVar.m6345h(8);
                int iM6345h5 = zzetVar.m6345h(16);
                int iM6345h6 = zzetVar.m6345h(16);
                int iM6340c = zzetVar.m6340c() + iM6345h6;
                if (iM6345h6 * 8 > zzetVar.m6339b()) {
                    zzeh.m6211c("DvbParser", "Data field length exceeds limit");
                    zzetVar.m6343f(zzetVar.m6339b());
                } else {
                    switch (iM6345h4) {
                        case 16:
                            if (iM6345h5 == zzaodVar.f6186a) {
                                zzanz zzanzVar = zzaodVar.f6194i;
                                zzetVar.m6345h(8);
                                int iM6345h7 = zzetVar.m6345h(4);
                                int iM6345h8 = zzetVar.m6345h(2);
                                zzetVar.m6343f(2);
                                SparseArray sparseArray = new SparseArray();
                                for (int i7 = iM6345h6 - 2; i7 > 0; i7 -= 6) {
                                    int iM6345h9 = zzetVar.m6345h(8);
                                    zzetVar.m6343f(8);
                                    sparseArray.put(iM6345h9, new zzaoa(zzetVar.m6345h(16), zzetVar.m6345h(16)));
                                }
                                zzanz zzanzVar2 = new zzanz(iM6345h7, iM6345h8, sparseArray);
                                if (iM6345h8 != 0) {
                                    zzaodVar.f6194i = zzanzVar2;
                                    zzaodVar.f6188c.clear();
                                    zzaodVar.f6189d.clear();
                                    zzaodVar.f6190e.clear();
                                } else if (zzanzVar != null && zzanzVar.f6169a != iM6345h7) {
                                    zzaodVar.f6194i = zzanzVar2;
                                }
                            }
                            break;
                        case 17:
                            zzanz zzanzVar3 = zzaodVar.f6194i;
                            SparseArray sparseArray2 = zzaodVar.f6188c;
                            if (iM6345h5 == zzaodVar.f6186a && zzanzVar3 != null) {
                                int iM6345h10 = zzetVar.m6345h(8);
                                zzetVar.m6343f(4);
                                boolean zM6344g = zzetVar.m6344g();
                                zzetVar.m6343f(3);
                                int iM6345h11 = zzetVar.m6345h(16);
                                int iM6345h12 = zzetVar.m6345h(16);
                                zzetVar.m6345h(3);
                                int iM6345h13 = zzetVar.m6345h(3);
                                zzetVar.m6343f(2);
                                int iM6345h14 = zzetVar.m6345h(8);
                                int iM6345h15 = zzetVar.m6345h(8);
                                int iM6345h16 = zzetVar.m6345h(4);
                                int iM6345h17 = zzetVar.m6345h(2);
                                zzetVar.m6343f(2);
                                int i8 = iM6345h6 - 10;
                                SparseArray sparseArray3 = new SparseArray();
                                while (i8 > 0) {
                                    int iM6345h18 = zzetVar.m6345h(16);
                                    int iM6345h19 = zzetVar.m6345h(2);
                                    zzetVar.m6345h(2);
                                    int iM6345h20 = zzetVar.m6345h(12);
                                    zzetVar.m6343f(4);
                                    int iM6345h21 = zzetVar.m6345h(12);
                                    int i9 = i8 - 6;
                                    if (iM6345h19 == 1 || iM6345h19 == 2) {
                                        zzetVar.m6345h(8);
                                        zzetVar.m6345h(8);
                                        i8 -= 8;
                                    } else {
                                        i8 = i9;
                                    }
                                    sparseArray3.put(iM6345h18, new zzaoc(iM6345h20, iM6345h21));
                                }
                                zzaob zzaobVar3 = new zzaob(iM6345h10, zM6344g, iM6345h11, iM6345h12, iM6345h13, iM6345h14, iM6345h15, iM6345h16, iM6345h17, sparseArray3);
                                if (zzanzVar3.f6170b == 0 && (zzaobVar2 = (zzaob) sparseArray2.get(iM6345h10)) != null) {
                                    int i10 = 0;
                                    while (true) {
                                        SparseArray sparseArray4 = zzaobVar2.f6183j;
                                        if (i10 < sparseArray4.size()) {
                                            zzaobVar3.f6183j.put(sparseArray4.keyAt(i10), (zzaoc) sparseArray4.valueAt(i10));
                                            i10++;
                                        }
                                    }
                                }
                                sparseArray2.put(zzaobVar3.f6174a, zzaobVar3);
                            }
                            break;
                        case 18:
                            if (iM6345h5 == zzaodVar.f6186a) {
                                zzanw zzanwVarM4248b = m4248b(zzetVar, iM6345h6);
                                zzaodVar.f6189d.put(zzanwVarM4248b.f6155a, zzanwVarM4248b);
                            } else if (iM6345h5 == zzaodVar.f6187b) {
                                zzanw zzanwVarM4248b2 = m4248b(zzetVar, iM6345h6);
                                zzaodVar.f6191f.put(zzanwVarM4248b2.f6155a, zzanwVarM4248b2);
                            }
                            break;
                        case 19:
                            if (iM6345h5 == zzaodVar.f6186a) {
                                zzany zzanyVarM4249c = m4249c(zzetVar);
                                zzaodVar.f6190e.put(zzanyVarM4249c.f6165a, zzanyVarM4249c);
                            } else if (iM6345h5 == zzaodVar.f6187b) {
                                zzany zzanyVarM4249c2 = m4249c(zzetVar);
                                zzaodVar.f6192g.put(zzanyVarM4249c2.f6165a, zzanyVarM4249c2);
                            }
                            break;
                        case 20:
                            if (iM6345h5 == zzaodVar.f6186a) {
                                zzetVar.m6343f(4);
                                boolean zM6344g2 = zzetVar.m6344g();
                                zzetVar.m6343f(3);
                                int iM6345h22 = zzetVar.m6345h(16);
                                int iM6345h23 = zzetVar.m6345h(16);
                                if (zM6344g2) {
                                    int iM6345h24 = zzetVar.m6345h(16);
                                    iM6345h = zzetVar.m6345h(16);
                                    iM6345h3 = zzetVar.m6345h(16);
                                    iM6345h2 = zzetVar.m6345h(16);
                                    i6 = iM6345h24;
                                } else {
                                    iM6345h = iM6345h22;
                                    iM6345h2 = iM6345h23;
                                    i6 = 0;
                                    iM6345h3 = 0;
                                }
                                zzaodVar.f6193h = new zzanx(iM6345h22, iM6345h23, i6, iM6345h, iM6345h3, iM6345h2);
                            }
                            break;
                    }
                    zzetVar.m6349l(iM6340c - zzetVar.m6340c());
                }
            }
        }
        zzanz zzanzVar4 = zzaodVar.f6194i;
        if (zzanzVar4 == null) {
            zzgzi zzgziVar = zzgwt.f18303t;
            zzankVar = new zzank(zzgyo.f18355w, -9223372036854775807L, -9223372036854775807L);
        } else {
            zzanx zzanxVar = zzaodVar.f6193h;
            if (zzanxVar == null) {
                zzanxVar = this.f6201d;
            }
            Bitmap bitmap = this.f6204g;
            Canvas canvas = this.f6200c;
            if (bitmap == null || zzanxVar.f6159a + 1 != bitmap.getWidth() || zzanxVar.f6160b + 1 != this.f6204g.getHeight()) {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(zzanxVar.f6159a + 1, zzanxVar.f6160b + 1, Bitmap.Config.ARGB_8888);
                this.f6204g = bitmapCreateBitmap;
                canvas.setBitmap(bitmapCreateBitmap);
            }
            ArrayList arrayList = new ArrayList();
            SparseArray sparseArray5 = zzanzVar4.f6171c;
            int i11 = 0;
            while (i11 < sparseArray5.size()) {
                canvas.save();
                zzaoa zzaoaVar = (zzaoa) sparseArray5.valueAt(i11);
                zzaob zzaobVar4 = (zzaob) zzaodVar.f6188c.get(sparseArray5.keyAt(i11));
                int i12 = zzaoaVar.f6172a + zzanxVar.f6161c;
                int i13 = zzaoaVar.f6173b + zzanxVar.f6163e;
                int i14 = zzaobVar4.f6176c;
                int i15 = i12 + i14;
                int iMin = Math.min(i15, zzanxVar.f6162d);
                boolean z2 = z;
                int i16 = zzaobVar4.f6177d;
                int i17 = i13 + i16;
                canvas.clipRect(i12, i13, iMin, Math.min(i17, zzanxVar.f6164f));
                int i18 = zzaobVar4.f6179f;
                zzanw zzanwVar = (zzanw) zzaodVar.f6189d.get(i18);
                if (zzanwVar == null && (zzanwVar = (zzanw) zzaodVar.f6191f.get(i18)) == null) {
                    zzanwVar = this.f6202e;
                }
                zzanw zzanwVar2 = zzanwVar;
                SparseArray sparseArray6 = zzaobVar4.f6183j;
                SparseArray sparseArray7 = sparseArray5;
                int i19 = i13;
                int i20 = 0;
                while (true) {
                    Canvas canvas2 = canvas;
                    if (i20 < sparseArray6.size()) {
                        int iKeyAt = sparseArray6.keyAt(i20);
                        zzaoc zzaocVar = (zzaoc) sparseArray6.valueAt(i20);
                        int i21 = i20;
                        zzany zzanyVar = (zzany) zzaodVar.f6190e.get(iKeyAt);
                        if (zzanyVar == null) {
                            zzanyVar = (zzany) zzaodVar.f6192g.get(iKeyAt);
                        }
                        if (zzanyVar != null) {
                            Paint paint = zzanyVar.f6166b ? null : this.f6198a;
                            int i22 = i12;
                            int i23 = zzaobVar4.f6178e;
                            int i24 = zzaocVar.f6184a + i22;
                            int i25 = i19 + zzaocVar.f6185b;
                            canvas = canvas2;
                            i5 = i22;
                            zzaob zzaobVar5 = zzaobVar4;
                            int[] iArr = i23 == 3 ? zzanwVar2.f6158d : i23 == 2 ? zzanwVar2.f6157c : zzanwVar2.f6156b;
                            zzaobVar = zzaobVar5;
                            Paint paint2 = paint;
                            m4253g(zzanyVar.f6167c, iArr, i23, i24, i25, paint2, canvas);
                            m4253g(zzanyVar.f6168d, iArr, i23, i24, i25 + 1, paint2, canvas);
                        } else {
                            zzaobVar = zzaobVar4;
                            canvas = canvas2;
                            i5 = i12;
                        }
                        i20 = i21 + 1;
                        i15 = i15;
                        zzaobVar4 = zzaobVar;
                        i12 = i5;
                        i11 = i11;
                        zzaodVar = zzaodVar;
                        zzanxVar = zzanxVar;
                        i14 = i14;
                        sparseArray6 = sparseArray6;
                        i19 = i19;
                        arrayList = arrayList;
                    } else {
                        zzanx zzanxVar2 = zzanxVar;
                        zzaod zzaodVar2 = zzaodVar;
                        zzaob zzaobVar6 = zzaobVar4;
                        int i26 = i14;
                        int i27 = i15;
                        canvas = canvas2;
                        ArrayList arrayList2 = arrayList;
                        int i28 = i19;
                        int i29 = i11;
                        int i30 = i12;
                        float f2 = i28;
                        float f3 = i30;
                        if (zzaobVar6.f6175b) {
                            int i31 = zzaobVar6.f6178e;
                            if (i31 == 3) {
                                i4 = zzanwVar2.f6158d[zzaobVar6.f6180g];
                                c3 = 2;
                            } else {
                                c3 = 2;
                                i4 = i31 == 2 ? zzanwVar2.f6157c[zzaobVar6.f6181h] : zzanwVar2.f6156b[zzaobVar6.f6182i];
                            }
                            Paint paint3 = this.f6199b;
                            paint3.setColor(i4);
                            c2 = 3;
                            c = c3;
                            canvas.drawRect(f3, f2, i27, i17, paint3);
                        } else {
                            c = 2;
                            c2 = 3;
                        }
                        zzcx zzcxVar = new zzcx();
                        zzcxVar.f11650b = Bitmap.createBitmap(this.f6204g, i30, i28, i26, i16);
                        zzcxVar.f11649a = null;
                        zzanxVar = zzanxVar2;
                        float f4 = zzanxVar.f6159a;
                        zzcxVar.f11656h = f3 / f4;
                        zzcxVar.f11657i = 0;
                        float f5 = zzanxVar.f6160b;
                        zzcxVar.f11653e = f2 / f5;
                        zzcxVar.f11654f = 0;
                        zzcxVar.f11655g = 0;
                        zzcxVar.f11660l = i26 / f4;
                        zzcxVar.f11661m = i16 / f5;
                        arrayList2.add(zzcxVar.m5860b());
                        canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                        canvas.restore();
                        i11 = i29 + 1;
                        z = z2;
                        arrayList = arrayList2;
                        sparseArray5 = sparseArray7;
                        zzaodVar = zzaodVar2;
                    }
                }
            }
            zzankVar = new zzank(arrayList, -9223372036854775807L, -9223372036854775807L);
        }
        ((zzanu) zzduVar).mo3942b(zzankVar);
    }
}
