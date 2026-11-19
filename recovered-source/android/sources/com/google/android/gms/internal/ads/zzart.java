package com.google.android.gms.internal.ads;

import androidx.constraintlayout.widget.C1137R;
import androidx.datastore.preferences.protobuf.AbstractC1456a;
import java.math.RoundingMode;

/* JADX INFO: loaded from: classes2.dex */
final class zzart implements zzaru {

    /* JADX INFO: renamed from: m */
    public static final int[] f6778m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};

    /* JADX INFO: renamed from: n */
    public static final int[] f6779n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, C1137R.styleable.ConstraintSet_polarRelativeTo, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};

    /* JADX INFO: renamed from: a */
    public final zzagd f6780a;

    /* JADX INFO: renamed from: b */
    public final zzahm f6781b;

    /* JADX INFO: renamed from: c */
    public final zzary f6782c;

    /* JADX INFO: renamed from: d */
    public final int f6783d;

    /* JADX INFO: renamed from: e */
    public final byte[] f6784e;

    /* JADX INFO: renamed from: f */
    public final zzeu f6785f;

    /* JADX INFO: renamed from: g */
    public final int f6786g;

    /* JADX INFO: renamed from: h */
    public final zzv f6787h;

    /* JADX INFO: renamed from: i */
    public int f6788i;

    /* JADX INFO: renamed from: j */
    public long f6789j;

    /* JADX INFO: renamed from: k */
    public int f6790k;

    /* JADX INFO: renamed from: l */
    public long f6791l;

    public zzart(zzagd zzagdVar, zzahm zzahmVar, zzary zzaryVar) throws zzat {
        this.f6780a = zzagdVar;
        this.f6781b = zzahmVar;
        this.f6782c = zzaryVar;
        int i2 = zzaryVar.f6809b;
        int iMax = Math.max(1, i2 / 10);
        this.f6786g = iMax;
        zzeu zzeuVar = new zzeu(zzaryVar.f6812e);
        zzeuVar.m6371M();
        int iM6371M = zzeuVar.m6371M();
        this.f6783d = iM6371M;
        int i3 = zzaryVar.f6808a;
        int i4 = zzaryVar.f6810c;
        int iM2436c = AbstractC1456a.m2436c(i4 - (i3 * 4), 8, zzaryVar.f6811d * i3, 1);
        if (iM6371M != iM2436c) {
            throw zzat.m4383a(null, AbstractC1456a.m2449p(new StringBuilder(String.valueOf(iM2436c).length() + 34 + String.valueOf(iM6371M).length()), "Expected frames per block: ", iM2436c, "; got: ", iM6371M));
        }
        String str = zzfm.f16091a;
        int i5 = ((iMax + iM6371M) - 1) / iM6371M;
        this.f6784e = new byte[i5 * i4];
        this.f6785f = new zzeu((iM6371M + iM6371M) * i3 * i5);
        int i6 = ((i4 * i2) * 8) / iM6371M;
        zzt zztVar = new zzt();
        zztVar.m8853e("audio/raw");
        zztVar.f20796h = i6;
        zztVar.f20797i = i6;
        zztVar.f20803o = (iMax + iMax) * i3;
        zztVar.f20780F = i3;
        int i7 = zzaryVar.f6813f;
        zztVar.f20781G = i7 != 0 ? i7 << 2 : -1;
        zztVar.f20782H = i2;
        zztVar.f20783I = 2;
        this.f6787h = new zzv(zztVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaru
    /* JADX INFO: renamed from: a */
    public final void mo4344a(int i2, long j2) {
        this.f6780a.mo4108d(new zzasb(this.f6782c, this.f6783d, i2, j2));
        this.f6781b.mo4097e(this.f6787h);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004a  */
    /* JADX WARN: Code duplicated, block: B:19:0x004f  */
    /* JADX WARN: Code duplicated, block: B:22:0x0054  */
    /* JADX WARN: Code duplicated, block: B:25:0x009b  */
    /* JADX WARN: Code duplicated, block: B:27:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:28:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:31:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:37:0x0135  */
    /* JADX WARN: Code duplicated, block: B:39:0x013a  */
    /* JADX WARN: Code duplicated, block: B:41:0x0142  */
    /* JADX WARN: Code duplicated, block: B:43:0x0045 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x010d A[EDGE_INSN: B:47:0x010d->B:35:0x010d BREAK  A[LOOP:1: B:17:0x004b->B:34:0x0105], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:0x00ca A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0028  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x003c -> B:4:0x0021). Please report as a decompilation issue!!! */
    @Override // com.google.android.gms.internal.ads.zzaru
    /* JADX INFO: renamed from: b */
    public final boolean mo4345b(zzagb zzagbVar, long j2) {
        byte[] bArr;
        int i2;
        int i3;
        int i4;
        zzeu zzeuVar;
        int i5;
        int i6;
        int i7;
        int i8;
        byte[] bArr2;
        int i9;
        int i10;
        int iMin;
        int[] iArr;
        int i11;
        int iMax;
        int i12;
        int i13;
        byte b;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int iMo4082b;
        int i19 = this.f6790k;
        zzary zzaryVar = this.f6782c;
        int i20 = zzaryVar.f6808a;
        int i21 = i19 / (i20 + i20);
        int i22 = this.f6786g;
        String str = zzfm.f16091a;
        int i23 = this.f6783d;
        int i24 = zzaryVar.f6810c;
        int i25 = ((((i22 - i21) + i23) - 1) / i23) * i24;
        boolean z = j2 == 0;
        while (true) {
            bArr = this.f6784e;
            if (z && (i18 = this.f6788i) < i25) {
                iMo4082b = zzagbVar.mo4082b(bArr, this.f6788i, (int) Math.min(i25 - i18, j2));
                if (iMo4082b == -1) {
                    break;
                }
                this.f6788i += iMo4082b;
                bArr = this.f6784e;
                if (z) {
                }
            }
            i2 = this.f6788i / i24;
            if (i2 > 0) {
                i4 = 0;
                while (true) {
                    zzeuVar = this.f6785f;
                    if (i4 < i2) {
                        break;
                    }
                    i7 = 0;
                    while (true) {
                        i8 = zzaryVar.f6808a;
                        if (i7 < i8) {
                            bArr2 = zzeuVar.f14887a;
                            i9 = (i24 / i8) - 4;
                            i10 = (i7 * 4) + (i4 * i24);
                            int i26 = bArr[i10 + 1] & 255;
                            int i27 = bArr[i10] & 255;
                            int i28 = i2;
                            iMin = Math.min(bArr[i10 + 2] & 255, 88);
                            iArr = f6779n;
                            i11 = iArr[iMin];
                            int i29 = (i4 * i23 * i8) + i7;
                            iMax = (short) (i27 | (i26 << 8));
                            i12 = i29 + i29;
                            bArr2[i12] = (byte) (iMax & 255);
                            bArr2[i12 + 1] = (byte) (iMax >> 8);
                            i13 = 0;
                            while (i13 < i9 + i9) {
                                b = bArr[((i13 / 8) * i8 * 4) + (i8 * 4) + i10 + ((i13 / 2) % 4)];
                                i14 = i13;
                                i15 = b & 255;
                                if (i14 % 2 == 0) {
                                    i16 = b & 15;
                                } else {
                                    i16 = i15 >> 4;
                                }
                                int i30 = i16 & 7;
                                i17 = (((i30 + i30) + 1) * i11) >> 3;
                                if ((i16 & 8) != 0) {
                                    i17 = -i17;
                                }
                                iMax = Math.max(-32768, Math.min(iMax + i17, 32767));
                                i12 = i8 + i8 + i12;
                                bArr2[i12] = (byte) (iMax & 255);
                                bArr2[i12 + 1] = (byte) (iMax >> 8);
                                iMin = Math.max(0, Math.min(iMin + f6778m[i16], 88));
                                i11 = iArr[iMin];
                                i13 = i14 + 1;
                            }
                            i7++;
                            i2 = i28;
                        }
                    }
                    i4++;
                }
                int i31 = i2;
                int i32 = i23 * i31;
                int i33 = (i32 + i32) * zzaryVar.f6808a;
                zzeuVar.m6363E(0);
                zzeuVar.m6361C(i33);
                this.f6788i -= i31 * i24;
                int i34 = zzeuVar.f14889c;
                this.f6781b.mo4121a(i34, zzeuVar);
                i5 = this.f6790k + i34;
                this.f6790k = i5;
                i6 = zzaryVar.f6808a;
                if (i5 / (i6 + i6) >= i22) {
                    m4346c(i22);
                }
            }
            if (z) {
                int i35 = this.f6790k;
                int i36 = zzaryVar.f6808a;
                i3 = i35 / (i36 + i36);
                if (i3 > 0) {
                    m4346c(i3);
                }
            }
            return z;
        }
        while (true) {
            bArr = this.f6784e;
            if (z) {
            }
            i2 = this.f6788i / i24;
            if (i2 > 0) {
                i4 = 0;
                while (true) {
                    zzeuVar = this.f6785f;
                    if (i4 < i2) {
                        break;
                        break;
                    }
                    i7 = 0;
                    while (true) {
                        i8 = zzaryVar.f6808a;
                        if (i7 < i8) {
                            bArr2 = zzeuVar.f14887a;
                            i9 = (i24 / i8) - 4;
                            i10 = (i7 * 4) + (i4 * i24);
                            int i210 = bArr[i10 + 1] & 255;
                            int i211 = bArr[i10] & 255;
                            int i212 = i2;
                            iMin = Math.min(bArr[i10 + 2] & 255, 88);
                            iArr = f6779n;
                            i11 = iArr[iMin];
                            int i213 = (i4 * i23 * i8) + i7;
                            iMax = (short) (i211 | (i210 << 8));
                            i12 = i213 + i213;
                            bArr2[i12] = (byte) (iMax & 255);
                            bArr2[i12 + 1] = (byte) (iMax >> 8);
                            i13 = 0;
                            while (i13 < i9 + i9) {
                                b = bArr[((i13 / 8) * i8 * 4) + (i8 * 4) + i10 + ((i13 / 2) % 4)];
                                i14 = i13;
                                i15 = b & 255;
                                if (i14 % 2 == 0) {
                                    i16 = b & 15;
                                } else {
                                    i16 = i15 >> 4;
                                }
                                int i37 = i16 & 7;
                                i17 = (((i37 + i37) + 1) * i11) >> 3;
                                if ((i16 & 8) != 0) {
                                    i17 = -i17;
                                }
                                iMax = Math.max(-32768, Math.min(iMax + i17, 32767));
                                i12 = i8 + i8 + i12;
                                bArr2[i12] = (byte) (iMax & 255);
                                bArr2[i12 + 1] = (byte) (iMax >> 8);
                                iMin = Math.max(0, Math.min(iMin + f6778m[i16], 88));
                                i11 = iArr[iMin];
                                i13 = i14 + 1;
                            }
                            i7++;
                            i2 = i212;
                        }
                    }
                    i4++;
                }
                int i38 = i2;
                int i39 = i23 * i38;
                int i310 = (i39 + i39) * zzaryVar.f6808a;
                zzeuVar.m6363E(0);
                zzeuVar.m6361C(i310);
                this.f6788i -= i38 * i24;
                int i311 = zzeuVar.f14889c;
                this.f6781b.mo4121a(i311, zzeuVar);
                i5 = this.f6790k + i311;
                this.f6790k = i5;
                i6 = zzaryVar.f6808a;
                if (i5 / (i6 + i6) >= i22) {
                    m4346c(i22);
                }
            }
            if (z) {
                int i312 = this.f6790k;
                int i313 = zzaryVar.f6808a;
                i3 = i312 / (i313 + i313);
                if (i3 > 0) {
                    m4346c(i3);
                }
            }
            return z;
            this.f6788i += iMo4082b;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m4346c(int i2) {
        zzary zzaryVar = this.f6782c;
        long jM6521w = this.f6789j + zzfm.m6521w(this.f6791l, 1000000L, zzaryVar.f6809b, RoundingMode.DOWN);
        int i3 = (i2 + i2) * zzaryVar.f6808a;
        this.f6781b.mo4095b(jM6521w, 1, i3, this.f6790k - i3, null);
        this.f6791l += (long) i2;
        this.f6790k -= i3;
    }

    @Override // com.google.android.gms.internal.ads.zzaru
    /* JADX INFO: renamed from: e */
    public final void mo4347e(long j2) {
        this.f6788i = 0;
        this.f6789j = j2;
        this.f6790k = 0;
        this.f6791l = 0L;
    }
}
