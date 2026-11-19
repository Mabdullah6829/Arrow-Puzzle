package com.google.android.gms.internal.ads;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaff {

    /* JADX INFO: renamed from: a */
    public final ArrayList f5163a;

    /* JADX INFO: renamed from: b */
    public final int f5164b;

    /* JADX INFO: renamed from: c */
    public final int f5165c;

    /* JADX INFO: renamed from: d */
    public final int f5166d;

    /* JADX INFO: renamed from: e */
    public final int f5167e;

    /* JADX INFO: renamed from: f */
    public final int f5168f;

    /* JADX INFO: renamed from: g */
    public final int f5169g;

    /* JADX INFO: renamed from: h */
    public final int f5170h;

    /* JADX INFO: renamed from: i */
    public final int f5171i;

    /* JADX INFO: renamed from: j */
    public final int f5172j;

    /* JADX INFO: renamed from: k */
    public final float f5173k;

    /* JADX INFO: renamed from: l */
    public final String f5174l;

    public zzaff(ArrayList arrayList, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, float f2, String str) {
        this.f5163a = arrayList;
        this.f5164b = i2;
        this.f5165c = i3;
        this.f5166d = i4;
        this.f5167e = i5;
        this.f5168f = i6;
        this.f5169g = i7;
        this.f5170h = i8;
        this.f5171i = i9;
        this.f5172j = i10;
        this.f5173k = f2;
        this.f5174l = str;
    }

    /* JADX INFO: renamed from: a */
    public static zzaff m4063a(zzeu zzeuVar) throws zzat {
        String str;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        float f2;
        int i8;
        int i9;
        try {
            zzeuVar.m6365G(4);
            int iM6369K = (zzeuVar.m6369K() & 3) + 1;
            if (iM6369K == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int iM6369K2 = zzeuVar.m6369K() & 31;
            for (int i10 = 0; i10 < iM6369K2; i10++) {
                int iM6370L = zzeuVar.m6370L();
                int i11 = zzeuVar.f14888b;
                zzeuVar.m6365G(iM6370L);
                byte[] bArr = zzeuVar.f14887a;
                byte[] bArr2 = zzdr.f12695a;
                byte[] bArr3 = new byte[iM6370L + 4];
                System.arraycopy(zzdr.f12695a, 0, bArr3, 0, 4);
                System.arraycopy(bArr, i11, bArr3, 4, iM6370L);
                arrayList.add(bArr3);
            }
            int iM6369K3 = zzeuVar.m6369K();
            for (int i12 = 0; i12 < iM6369K3; i12++) {
                int iM6370L2 = zzeuVar.m6370L();
                int i13 = zzeuVar.f14888b;
                zzeuVar.m6365G(iM6370L2);
                byte[] bArr4 = zzeuVar.f14887a;
                byte[] bArr5 = zzdr.f12695a;
                byte[] bArr6 = new byte[iM6370L2 + 4];
                System.arraycopy(zzdr.f12695a, 0, bArr6, 0, 4);
                System.arraycopy(bArr4, i13, bArr6, 4, iM6370L2);
                arrayList.add(bArr6);
            }
            if (iM6369K2 > 0) {
                zzgq zzgqVarM7083d = zzgr.m7083d((byte[]) arrayList.get(0), 5, ((byte[]) arrayList.get(0)).length);
                int i14 = zzgqVarM7083d.f18022e;
                int i15 = zzgqVarM7083d.f18023f;
                int i16 = zzgqVarM7083d.f18025h + 8;
                int i17 = zzgqVarM7083d.f18026i + 8;
                int i18 = zzgqVarM7083d.f18027j;
                int i19 = zzgqVarM7083d.f18028k;
                int i20 = zzgqVarM7083d.f18029l;
                int i21 = zzgqVarM7083d.f18030m;
                float f3 = zzgqVarM7083d.f18024g;
                int i22 = zzgqVarM7083d.f18018a;
                int i23 = zzgqVarM7083d.f18019b;
                int i24 = zzgqVarM7083d.f18020c;
                byte[] bArr7 = zzdr.f12695a;
                str = String.format("avc1.%02X%02X%02X", Integer.valueOf(i22), Integer.valueOf(i23), Integer.valueOf(i24));
                i5 = i19;
                i6 = i20;
                i7 = i21;
                f2 = f3;
                i3 = i15;
                i4 = i16;
                i8 = i17;
                i9 = i18;
                i2 = i14;
            } else {
                str = null;
                i2 = -1;
                i3 = -1;
                i4 = -1;
                i5 = -1;
                i6 = -1;
                i7 = 16;
                f2 = 1.0f;
                i8 = -1;
                i9 = -1;
            }
            return new zzaff(arrayList, iM6369K, i2, i3, i4, i8, i9, i5, i6, i7, f2, str);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw zzat.m4383a(e, "Error parsing AVC config");
        }
    }
}
