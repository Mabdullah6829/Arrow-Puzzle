package com.google.android.gms.internal.ads;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import java.io.EOFException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class zzagv {

    /* JADX INFO: renamed from: a */
    public final zzeu f5285a = new zzeu(10);

    /* JADX WARN: Code duplicated, block: B:100:0x0157 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:102:0x0149 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:53:0x010b  */
    /* JADX WARN: Code duplicated, block: B:54:0x010f  */
    /* JADX WARN: Code duplicated, block: B:56:0x0115  */
    /* JADX WARN: Code duplicated, block: B:59:0x011c  */
    /* JADX WARN: Code duplicated, block: B:62:0x012a  */
    /* JADX WARN: Code duplicated, block: B:67:0x0148  */
    /* JADX WARN: Code duplicated, block: B:70:0x014f  */
    /* JADX INFO: renamed from: a */
    public final zzap m4126a(zzagb zzagbVar, zzajo zzajoVar, int i2) {
        zzeu zzeuVar;
        int i3;
        boolean z;
        int i4;
        boolean z2;
        zzajq zzajqVar;
        int i5;
        int i6;
        boolean z3;
        int iM4153d;
        zzajs zzajsVarM4151b;
        int i7 = 0;
        zzap zzapVar = null;
        while (true) {
            int i8 = 0;
            while (true) {
                int i9 = i8 % 10;
                zzeuVar = this.f5285a;
                if (i9 == 0) {
                    if (i8 != 0) {
                        byte[] bArr = zzeuVar.f14887a;
                        System.arraycopy(bArr, 10, bArr, 0, 9);
                    }
                    i3 = 0;
                } else {
                    i3 = i9;
                }
                z = true;
                int i10 = i8 == 0 ? 10 : 1;
                try {
                    int i11 = i9 + 10;
                    zzagbVar.mo4078H(zzeuVar.f14887a, i11 - i10, i10);
                    zzeuVar.m6363E(i3);
                    zzeuVar.m6361C(i11);
                    if (zzeuVar.m6360B() < 3) {
                        int i12 = zzeuVar.f14888b;
                        int i13 = zzeuVar.f14889c;
                        throw new IndexOutOfBoundsException(AbstractC1456a.m2449p(new StringBuilder(String.valueOf(i12).length() + 17 + String.valueOf(i13).length()), "position=", i12, ", limit=", i13));
                    }
                    int iM6373O = zzeuVar.m6373O();
                    i4 = zzeuVar.f14888b - 3;
                    zzeuVar.f14888b = i4;
                    if (iM6373O == 4801587) {
                        break;
                    }
                    if (zzagy.m4128a(zzeuVar.m6368J()) == -1) {
                        if (i8 == 0) {
                            zzeuVar.m6359A(20);
                        }
                        i8++;
                        if (i8 > i2) {
                        }
                    }
                    zzagbVar.zzl();
                    zzagbVar.mo4075E(i7);
                    return zzapVar;
                } catch (EOFException unused) {
                }
            }
            zzeuVar.m6365G(6);
            int iM6381g = zzeuVar.m6381g();
            int i14 = iM6381g + 10;
            if (zzapVar == null) {
                byte[] bArr2 = new byte[i14];
                System.arraycopy(zzeuVar.f14887a, i4, bArr2, 0, 10);
                zzagbVar.mo4078H(bArr2, 10, iM6381g);
                new zzajc();
                zzajo zzajoVar2 = zzajr.f5553a;
                ArrayList arrayList = new ArrayList();
                zzeu zzeuVar2 = new zzeu(bArr2, i14);
                if (zzeuVar2.m6360B() < 10) {
                    zzeh.m6211c("Id3Decoder", "Data too short to be an ID3 tag");
                } else {
                    int iM6373O2 = zzeuVar2.m6373O();
                    if (iM6373O2 != 4801587) {
                        zzeh.m6211c("Id3Decoder", "Unexpected first three bytes of ID3 tag header: 0x".concat(String.format("%06X", Integer.valueOf(iM6373O2))));
                    } else {
                        int iM6369K = zzeuVar2.m6369K();
                        zzeuVar2.m6365G(1);
                        int iM6369K2 = zzeuVar2.m6369K();
                        int iM6381g2 = zzeuVar2.m6381g();
                        if (iM6369K != 2) {
                            if (iM6369K == 3) {
                                if ((iM6369K2 & 64) != 0) {
                                    int iM6376b = zzeuVar2.m6376b();
                                    zzeuVar2.m6365G(iM6376b);
                                    iM6381g2 -= iM6376b + 4;
                                }
                            } else if (iM6369K == 4) {
                                if ((iM6369K2 & 64) != 0) {
                                    int iM6381g3 = zzeuVar2.m6381g();
                                    zzeuVar2.m6365G(iM6381g3 - 4);
                                    iM6381g2 -= iM6381g3;
                                }
                                if ((iM6369K2 & 16) != 0) {
                                    iM6381g2 -= 10;
                                }
                            } else {
                                AbstractC5152f.m3776h(new StringBuilder(String.valueOf(iM6369K).length() + 46), "Skipped ID3 tag with unsupported majorVersion=", iM6369K, "Id3Decoder");
                            }
                            int i15 = iM6381g2;
                            if (iM6369K < 4) {
                                z2 = false;
                            } else {
                                z2 = false;
                            }
                            zzajqVar = new zzajq(iM6369K, i15, z2);
                        } else if ((iM6369K2 & 64) != 0) {
                            zzeh.m6211c("Id3Decoder", "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                        } else {
                            int i16 = iM6381g2;
                            if (iM6369K < 4 || (iM6369K2 & 128) == 0) {
                                z2 = false;
                            } else {
                                z2 = true;
                            }
                            zzajqVar = new zzajq(iM6369K, i16, z2);
                        }
                        if (zzajqVar == null) {
                            zzapVar = null;
                        } else {
                            i5 = zzajqVar.f5550a;
                            int i17 = zzeuVar2.f14888b;
                            i6 = i5 == 2 ? 6 : 10;
                            z3 = zzajqVar.f5551b;
                            iM4153d = zzajqVar.f5552c;
                            if (z3) {
                                iM4153d = zzajr.m4153d(iM4153d, zzeuVar2);
                            }
                            zzeuVar2.m6361C(i17 + iM4153d);
                            if (zzajr.m4150a(zzeuVar2, i5, i6, false)) {
                                z = false;
                            } else if (i5 == 4 || !zzajr.m4150a(zzeuVar2, 4, i6, true)) {
                                AbstractC5152f.m3776h(new StringBuilder(String.valueOf(i5).length() + 45), "Failed to validate ID3 tag with majorVersion=", i5, "Id3Decoder");
                                zzapVar = null;
                            }
                            while (zzeuVar2.m6360B() >= i6) {
                                zzajsVarM4151b = zzajr.m4151b(i5, zzeuVar2, z, zzajoVar);
                                if (zzajsVarM4151b != null) {
                                    arrayList.add(zzajsVarM4151b);
                                }
                            }
                            zzapVar = new zzap(arrayList);
                        }
                    }
                }
                zzajqVar = null;
                if (zzajqVar == null) {
                    zzapVar = null;
                } else {
                    i5 = zzajqVar.f5550a;
                    int i18 = zzeuVar2.f14888b;
                    if (i5 == 2) {
                    }
                    z3 = zzajqVar.f5551b;
                    iM4153d = zzajqVar.f5552c;
                    if (z3) {
                        iM4153d = zzajr.m4153d(iM4153d, zzeuVar2);
                    }
                    zzeuVar2.m6361C(i18 + iM4153d);
                    if (zzajr.m4150a(zzeuVar2, i5, i6, false)) {
                        if (i5 == 4) {
                        }
                        AbstractC5152f.m3776h(new StringBuilder(String.valueOf(i5).length() + 45), "Failed to validate ID3 tag with majorVersion=", i5, "Id3Decoder");
                        zzapVar = null;
                    } else {
                        z = false;
                    }
                    while (zzeuVar2.m6360B() >= i6) {
                        zzajsVarM4151b = zzajr.m4151b(i5, zzeuVar2, z, zzajoVar);
                        if (zzajsVarM4151b != null) {
                            arrayList.add(zzajsVarM4151b);
                        }
                    }
                    zzapVar = new zzap(arrayList);
                }
            } else {
                zzagbVar.mo4075E(iM6381g);
            }
            i7 += i14;
        }
    }
}
