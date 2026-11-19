package com.google.android.gms.internal.ads;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
final class zzani extends zzang {

    /* JADX INFO: renamed from: n */
    public zzanh f6129n;

    /* JADX INFO: renamed from: o */
    public int f6130o;

    /* JADX INFO: renamed from: p */
    public boolean f6131p;

    /* JADX INFO: renamed from: q */
    public zzhf f6132q;

    /* JADX INFO: renamed from: r */
    public zzhd f6133r;

    @Override // com.google.android.gms.internal.ads.zzang
    /* JADX INFO: renamed from: a */
    public final void mo4229a(boolean z) {
        super.mo4229a(z);
        if (z) {
            this.f6129n = null;
            this.f6132q = null;
            this.f6133r = null;
        }
        this.f6130o = 0;
        this.f6131p = false;
    }

    @Override // com.google.android.gms.internal.ads.zzang
    /* JADX INFO: renamed from: b */
    public final long mo4230b(zzeu zzeuVar) {
        if ((zzeuVar.f14887a[0] & 1) == 1) {
            return -1L;
        }
        zzanh zzanhVar = this.f6129n;
        zzanhVar.getClass();
        byte b = zzeuVar.f14887a[0];
        zzhf zzhfVar = zzanhVar.f6125a;
        zzhe[] zzheVarArr = zzanhVar.f6128d;
        int i2 = zzheVarArr[(b >> 1) & (255 >>> (8 - zzhg.m7442a(zzheVarArr.length + (-1))))].f18546a ? zzhfVar.f18580f : zzhfVar.f18579e;
        int i3 = this.f6131p ? (this.f6130o + i2) / 4 : 0;
        byte[] bArr = zzeuVar.f14887a;
        int length = bArr.length;
        int i4 = zzeuVar.f14889c;
        if (length < i4 + 4) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, i4 + 4);
            zzeuVar.m6397z(bArrCopyOf.length, bArrCopyOf);
        } else {
            zzeuVar.m6361C(i4 + 4);
        }
        long j2 = i3;
        byte[] bArr2 = zzeuVar.f14887a;
        int i5 = zzeuVar.f14889c;
        bArr2[i5 - 4] = (byte) (j2 & 255);
        bArr2[i5 - 3] = (byte) ((j2 >>> 8) & 255);
        bArr2[i5 - 2] = (byte) ((j2 >>> 16) & 255);
        bArr2[i5 - 1] = (byte) ((j2 >>> 24) & 255);
        this.f6131p = true;
        this.f6130o = i2;
        return j2;
    }

    /* JADX WARN: Code duplicated, block: B:161:0x03be A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:163:0x03c1  */
    @Override // com.google.android.gms.internal.ads.zzang
    /* JADX INFO: renamed from: c */
    public final boolean mo4231c(zzeu zzeuVar, long j2, zzane zzaneVar) throws zzat {
        zzanh zzanhVar;
        int i2;
        if (this.f6129n != null) {
            zzaneVar.f6110a.getClass();
            return false;
        }
        zzhf zzhfVar = this.f6132q;
        int i3 = 4;
        if (zzhfVar != null) {
            zzhd zzhdVar = this.f6133r;
            if (zzhdVar == null) {
                this.f6133r = zzhg.m7443b(zzeuVar, true, true);
            } else {
                int i4 = zzeuVar.f14889c;
                byte[] bArr = new byte[i4];
                System.arraycopy(zzeuVar.f14887a, 0, bArr, 0, i4);
                int i5 = zzhfVar.f18575a;
                int i6 = 5;
                zzhg.m7444c(5, zzeuVar, false);
                int iM6369K = zzeuVar.m6369K() + 1;
                zzhc zzhcVar = new zzhc(zzeuVar.f14887a);
                int i7 = 8;
                zzhcVar.m7364c(zzeuVar.f14888b * 8);
                int i8 = 0;
                while (true) {
                    int i9 = 2;
                    int i10 = i7;
                    int i11 = 16;
                    if (i8 >= iM6369K) {
                        int i12 = 6;
                        int iM7363b = zzhcVar.m7363b(6) + 1;
                        for (int i13 = 0; i13 < iM7363b; i13++) {
                            if (zzhcVar.m7363b(16) != 0) {
                                throw zzat.m4383a(null, "placeholder of time domain transforms not zeroed out");
                            }
                        }
                        int i14 = 1;
                        int iM7363b2 = zzhcVar.m7363b(6) + 1;
                        int i15 = 0;
                        while (true) {
                            int i16 = 3;
                            if (i15 >= iM7363b2) {
                                int iM7363b3 = zzhcVar.m7363b(i12) + 1;
                                int i17 = 0;
                                while (i17 < iM7363b3) {
                                    if (zzhcVar.m7363b(16) > 2) {
                                        throw zzat.m4383a(null, "residueType greater than 2 is not decodable");
                                    }
                                    zzhcVar.m7364c(24);
                                    zzhcVar.m7364c(24);
                                    zzhcVar.m7364c(24);
                                    int iM7363b4 = zzhcVar.m7363b(i12) + 1;
                                    int i18 = 8;
                                    zzhcVar.m7364c(8);
                                    int[] iArr = new int[iM7363b4];
                                    for (int i19 = 0; i19 < iM7363b4; i19++) {
                                        iArr[i19] = ((zzhcVar.m7362a() ? zzhcVar.m7363b(5) : 0) * 8) + zzhcVar.m7363b(3);
                                    }
                                    int i20 = 0;
                                    while (i20 < iM7363b4) {
                                        int i21 = 0;
                                        while (i21 < i18) {
                                            if ((iArr[i20] & (1 << i21)) != 0) {
                                                zzhcVar.m7364c(i18);
                                            }
                                            i21++;
                                            i18 = 8;
                                        }
                                        i20++;
                                        i18 = 8;
                                    }
                                    i17++;
                                    i12 = 6;
                                }
                                int iM7363b5 = zzhcVar.m7363b(i12) + 1;
                                for (int i22 = 0; i22 < iM7363b5; i22++) {
                                    int iM7363b6 = zzhcVar.m7363b(16);
                                    if (iM7363b6 != 0) {
                                        StringBuilder sb = new StringBuilder(AbstractC1456a.m2434a(iM7363b6, 41));
                                        sb.append("mapping type other than 0 not supported: ");
                                        sb.append(iM7363b6);
                                        zzeh.m6213e("VorbisUtil", sb.toString());
                                    } else {
                                        int iM7363b7 = zzhcVar.m7362a() ? zzhcVar.m7363b(4) + 1 : 1;
                                        if (zzhcVar.m7362a()) {
                                            int iM7363b8 = zzhcVar.m7363b(8) + 1;
                                            for (int i23 = 0; i23 < iM7363b8; i23++) {
                                                int i24 = i5 - 1;
                                                zzhcVar.m7364c(zzhg.m7442a(i24));
                                                zzhcVar.m7364c(zzhg.m7442a(i24));
                                            }
                                        }
                                        if (zzhcVar.m7363b(2) != 0) {
                                            throw zzat.m4383a(null, "to reserved bits must be zero after mapping coupling steps");
                                        }
                                        if (iM7363b7 > 1) {
                                            for (int i25 = 0; i25 < i5; i25++) {
                                                zzhcVar.m7364c(4);
                                            }
                                        }
                                        for (int i26 = 0; i26 < iM7363b7; i26++) {
                                            zzhcVar.m7364c(8);
                                            zzhcVar.m7364c(8);
                                            zzhcVar.m7364c(8);
                                        }
                                    }
                                }
                                int iM7363b9 = zzhcVar.m7363b(6) + 1;
                                zzhe[] zzheVarArr = new zzhe[iM7363b9];
                                for (int i27 = 0; i27 < iM7363b9; i27++) {
                                    boolean zM7362a = zzhcVar.m7362a();
                                    zzhcVar.m7363b(16);
                                    zzhcVar.m7363b(16);
                                    zzhcVar.m7363b(8);
                                    zzheVarArr[i27] = new zzhe(zM7362a);
                                }
                                if (!zzhcVar.m7362a()) {
                                    throw zzat.m4383a(null, "framing bit after modes not set as expected");
                                }
                                zzanhVar = new zzanh(zzhfVar, zzhdVar, bArr, zzheVarArr);
                                break;
                            }
                            int iM7363b10 = zzhcVar.m7363b(i11);
                            if (iM7363b10 == 0) {
                                int i28 = i10;
                                zzhcVar.m7364c(i28);
                                zzhcVar.m7364c(16);
                                zzhcVar.m7364c(16);
                                zzhcVar.m7364c(6);
                                zzhcVar.m7364c(i28);
                                int iM7363b11 = zzhcVar.m7363b(4) + 1;
                                int i29 = 0;
                                while (i29 < iM7363b11) {
                                    zzhcVar.m7364c(i28);
                                    i29++;
                                    i28 = 8;
                                }
                            } else {
                                if (iM7363b10 != i14) {
                                    StringBuilder sb2 = new StringBuilder(AbstractC1456a.m2434a(iM7363b10, 41));
                                    sb2.append("floor type greater than 1 not decodable: ");
                                    sb2.append(iM7363b10);
                                    throw zzat.m4383a(null, sb2.toString());
                                }
                                int iM7363b12 = zzhcVar.m7363b(5);
                                int[] iArr2 = new int[iM7363b12];
                                int i30 = -1;
                                for (int i31 = 0; i31 < iM7363b12; i31++) {
                                    int iM7363b13 = zzhcVar.m7363b(4);
                                    iArr2[i31] = iM7363b13;
                                    if (iM7363b13 > i30) {
                                        i30 = iM7363b13;
                                    }
                                }
                                int i32 = i30 + 1;
                                int[] iArr3 = new int[i32];
                                int i33 = 0;
                                while (i33 < i32) {
                                    iArr3[i33] = zzhcVar.m7363b(i16) + 1;
                                    int iM7363b14 = zzhcVar.m7363b(2);
                                    if (iM7363b14 > 0) {
                                        i2 = i10;
                                        zzhcVar.m7364c(i2);
                                    } else {
                                        i2 = i10;
                                    }
                                    int i34 = i32;
                                    int i35 = 0;
                                    for (int i36 = 1; i35 < (i36 << iM7363b14); i36 = 1) {
                                        zzhcVar.m7364c(i2);
                                        i35++;
                                        i2 = 8;
                                    }
                                    i33++;
                                    i32 = i34;
                                    i10 = 8;
                                    i16 = 3;
                                }
                                zzhcVar.m7364c(2);
                                int iM7363b15 = zzhcVar.m7363b(4);
                                int i37 = 0;
                                int i38 = 0;
                                for (int i39 = 0; i39 < iM7363b12; i39++) {
                                    i37 += iArr3[iArr2[i39]];
                                    while (i38 < i37) {
                                        zzhcVar.m7364c(iM7363b15);
                                        i38++;
                                    }
                                }
                            }
                            i15++;
                            i10 = 8;
                            i12 = 6;
                            i14 = 1;
                            i11 = 16;
                        }
                    } else {
                        if (zzhcVar.m7363b(24) != 5653314) {
                            int i40 = (zzhcVar.f18511c * 8) + zzhcVar.f18512d;
                            StringBuilder sb3 = new StringBuilder(String.valueOf(i40).length() + 55);
                            sb3.append("expected code book to start with [0x56, 0x43, 0x42] at ");
                            sb3.append(i40);
                            throw zzat.m4383a(null, sb3.toString());
                        }
                        int iM7363b16 = zzhcVar.m7363b(16);
                        int iM7363b17 = zzhcVar.m7363b(24);
                        if (zzhcVar.m7362a()) {
                            zzhcVar.m7364c(i6);
                            for (int iM7363b18 = 0; iM7363b18 < iM7363b17; iM7363b18 += zzhcVar.m7363b(zzhg.m7442a(iM7363b17 - iM7363b18))) {
                            }
                        } else {
                            boolean zM7362a2 = zzhcVar.m7362a();
                            for (int i41 = 0; i41 < iM7363b17; i41++) {
                                if (!zM7362a2) {
                                    zzhcVar.m7364c(i6);
                                } else if (zzhcVar.m7362a()) {
                                    zzhcVar.m7364c(i6);
                                }
                            }
                        }
                        int iM7363b19 = zzhcVar.m7363b(i3);
                        if (iM7363b19 > 2) {
                            StringBuilder sb4 = new StringBuilder(String.valueOf(iM7363b19).length() + 42);
                            sb4.append("lookup type greater than 2 not decodable: ");
                            sb4.append(iM7363b19);
                            throw zzat.m4383a(null, sb4.toString());
                        }
                        if (iM7363b19 != 1) {
                            if (iM7363b19 != 2) {
                                iM6369K = iM6369K;
                            }
                            i8++;
                            i7 = i10;
                            iM6369K = iM6369K;
                            i3 = 4;
                            i6 = 5;
                        } else {
                            i9 = iM7363b19;
                        }
                        zzhcVar.m7364c(32);
                        zzhcVar.m7364c(32);
                        int iM7363b20 = zzhcVar.m7363b(i3) + 1;
                        zzhcVar.m7364c(1);
                        zzhcVar.m7364c((int) ((i9 == 1 ? iM7363b16 != 0 ? (long) Math.floor(Math.pow(iM7363b17, 1.0d / ((double) iM7363b16))) : 0L : ((long) iM7363b17) * ((long) iM7363b16)) * ((long) iM7363b20)));
                        i8++;
                        i7 = i10;
                        iM6369K = iM6369K;
                        i3 = 4;
                        i6 = 5;
                    }
                }
            }
            this.f6129n = zzanhVar;
            if (zzanhVar == null) {
                return true;
            }
            ArrayList arrayList = new ArrayList();
            zzhf zzhfVar2 = zzanhVar.f6125a;
            arrayList.add(zzhfVar2.f18581g);
            arrayList.add(zzanhVar.f6127c);
            zzap zzapVarM4132a = zzaho.m4132a(zzgwt.m7221u(zzanhVar.f6126b.f18534a));
            zzt zztVar = new zzt();
            zztVar.m8852d("audio/ogg");
            zztVar.m8853e("audio/vorbis");
            zztVar.f20796h = zzhfVar2.f18578d;
            zztVar.f20797i = zzhfVar2.f18577c;
            zztVar.f20780F = zzhfVar2.f18575a;
            zztVar.f20782H = zzhfVar2.f18576b;
            zztVar.f20805q = arrayList;
            zztVar.f20799k = zzapVarM4132a;
            zzaneVar.f6110a = new zzv(zztVar);
            return true;
        }
        zzhg.m7444c(1, zzeuVar, false);
        zzeuVar.m6383i();
        int iM6369K2 = zzeuVar.m6369K();
        int iM6383i = zzeuVar.m6383i();
        int iM6377c = zzeuVar.m6377c();
        int i42 = iM6377c <= 0 ? -1 : iM6377c;
        int iM6377c2 = zzeuVar.m6377c();
        int i43 = iM6377c2 <= 0 ? -1 : iM6377c2;
        zzeuVar.m6377c();
        int iM6369K3 = zzeuVar.m6369K();
        int iPow = (int) Math.pow(2.0d, iM6369K3 & 15);
        int iPow2 = (int) Math.pow(2.0d, (iM6369K3 & 240) >> 4);
        zzeuVar.m6369K();
        this.f6132q = new zzhf(iM6369K2, iM6383i, i42, i43, iPow, iPow2, Arrays.copyOf(zzeuVar.f14887a, zzeuVar.f14889c));
        zzanhVar = null;
        this.f6129n = zzanhVar;
        if (zzanhVar == null) {
            return true;
        }
        ArrayList arrayList2 = new ArrayList();
        zzhf zzhfVar3 = zzanhVar.f6125a;
        arrayList2.add(zzhfVar3.f18581g);
        arrayList2.add(zzanhVar.f6127c);
        zzap zzapVarM4132a2 = zzaho.m4132a(zzgwt.m7221u(zzanhVar.f6126b.f18534a));
        zzt zztVar2 = new zzt();
        zztVar2.m8852d("audio/ogg");
        zztVar2.m8853e("audio/vorbis");
        zztVar2.f20796h = zzhfVar3.f18578d;
        zztVar2.f20797i = zzhfVar3.f18577c;
        zztVar2.f20780F = zzhfVar3.f18575a;
        zztVar2.f20782H = zzhfVar3.f18576b;
        zztVar2.f20805q = arrayList2;
        zztVar2.f20799k = zzapVarM4132a2;
        zzaneVar.f6110a = new zzv(zztVar2);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzang
    /* JADX INFO: renamed from: d */
    public final void mo4239d(long j2) {
        this.f6118g = j2;
        this.f6131p = j2 != 0;
        zzhf zzhfVar = this.f6132q;
        this.f6130o = zzhfVar != null ? zzhfVar.f18579e : 0;
    }
}
