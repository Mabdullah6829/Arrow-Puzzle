package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzari implements zzara {

    /* JADX INFO: renamed from: a */
    public final zzet f6742a;

    /* JADX INFO: renamed from: b */
    public final SparseArray f6743b;

    /* JADX INFO: renamed from: c */
    public final SparseIntArray f6744c;

    /* JADX INFO: renamed from: d */
    public final int f6745d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ zzark f6746e;

    public zzari(zzark zzarkVar, int i2) {
        Objects.requireNonNull(zzarkVar);
        this.f6746e = zzarkVar;
        this.f6742a = new zzet(new byte[5], 5);
        this.f6743b = new SparseArray();
        this.f6744c = new SparseIntArray();
        this.f6745d = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzara
    /* JADX INFO: renamed from: b */
    public final void mo4327b(zzfj zzfjVar, zzagd zzagdVar, zzaro zzaroVar) {
    }

    /* JADX WARN: Code duplicated, block: B:102:0x020b  */
    /* JADX WARN: Code duplicated, block: B:103:0x020d  */
    /* JADX WARN: Code duplicated, block: B:120:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:121:0x0308  */
    /* JADX WARN: Code duplicated, block: B:124:0x0326  */
    /* JADX WARN: Code duplicated, block: B:19:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:22:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:26:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:53:0x0146 A[PHI: r22 r23
  0x0146: PHI (r22v3 java.lang.String) = (r22v2 java.lang.String), (r22v1 java.lang.String), (r22v1 java.lang.String) binds: [B:52:0x0137, B:45:0x011e, B:28:0x00f0] A[DONT_GENERATE, DONT_INLINE]
  0x0146: PHI (r23v3 int) = (r23v2 int), (r23v1 int), (r23v1 int) binds: [B:52:0x0137, B:45:0x011e, B:28:0x00f0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:69:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:72:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:74:0x01cf  */
    @Override // com.google.android.gms.internal.ads.zzara
    /* JADX INFO: renamed from: c */
    public final void mo4328c(zzeu zzeuVar) {
        SparseArray sparseArray;
        zzarm zzarmVar;
        String str;
        int i2;
        zzarp zzaqtVar;
        zzarp zzaqtVar2;
        int i3;
        if (zzeuVar.m6369K() == 2) {
            zzark zzarkVar = this.f6746e;
            List list = zzarkVar.f6749b;
            SparseArray sparseArray2 = zzarkVar.f6754g;
            SparseBooleanArray sparseBooleanArray = zzarkVar.f6755h;
            int i4 = 0;
            zzfj zzfjVar = (zzfj) list.get(0);
            if ((zzeuVar.m6369K() & 128) != 0) {
                zzeuVar.m6365G(1);
                int iM6370L = zzeuVar.m6370L();
                int i5 = 3;
                zzeuVar.m6365G(3);
                zzet zzetVar = this.f6742a;
                zzeuVar.m6366H(zzetVar.f14823a, 0, 2);
                zzetVar.m6341d(0);
                zzetVar.m6343f(3);
                int i6 = 13;
                zzarkVar.f6763p = zzetVar.m6345h(13);
                zzeuVar.m6366H(zzetVar.f14823a, 0, 2);
                zzetVar.m6341d(0);
                int i7 = 4;
                zzetVar.m6343f(4);
                zzeuVar.m6365G(zzetVar.m6345h(12));
                SparseArray sparseArray3 = this.f6743b;
                sparseArray3.clear();
                SparseIntArray sparseIntArray = this.f6744c;
                sparseIntArray.clear();
                int iM6360B = zzeuVar.m6360B();
                while (iM6360B > 0) {
                    zzeuVar.m6366H(zzetVar.f14823a, i4, 5);
                    zzetVar.m6341d(i4);
                    int iM6345h = zzetVar.m6345h(8);
                    zzetVar.m6343f(i5);
                    int iM6345h2 = zzetVar.m6345h(i6);
                    zzetVar.m6343f(i7);
                    int iM6345h3 = zzetVar.m6345h(12);
                    int i8 = zzeuVar.f14888b;
                    int i9 = i8 + iM6345h3;
                    String strTrim = null;
                    ArrayList arrayList = null;
                    int i10 = -1;
                    int iM6369K = 0;
                    while (zzeuVar.f14888b < i9) {
                        int iM6369K2 = zzeuVar.m6369K();
                        int iM6369K3 = zzeuVar.f14888b + zzeuVar.m6369K();
                        if (iM6369K3 > i9) {
                            SparseArray sparseArray4 = sparseArray2;
                            zzet zzetVar2 = zzetVar;
                            zzeuVar.m6363E(i9);
                            zzarmVar = new zzarm(i10, strTrim, iM6369K, arrayList, Arrays.copyOfRange(zzeuVar.f14887a, i8, i9));
                            str = strTrim;
                            if (iM6345h != 6 || iM6345h == 5) {
                                iM6345h = i10;
                            }
                            iM6360B -= iM6345h3 + 5;
                            if (sparseBooleanArray.get(iM6345h2)) {
                                i7 = 4;
                                i2 = 3;
                            } else {
                                zzapx zzapxVar = zzarkVar.f6752e;
                                zzapxVar.getClass();
                                if (iM6345h != 2) {
                                    i2 = 3;
                                    i7 = 4;
                                    if (iM6345h != 3 || iM6345h == 4) {
                                        zzaqtVar2 = new zzaqt(new zzaqm(str, zzarmVar.m4338a(), "video/mp2t"));
                                    } else {
                                        if (iM6345h == 21) {
                                            zzaqtVar = new zzaqt(new zzaqk());
                                        } else if (iM6345h == 27) {
                                            zzaqtVar = new zzaqt(new zzaqh(new zzard(zzapxVar.m4307a(zzarmVar))));
                                        } else if (iM6345h == 36) {
                                            zzaqtVar = new zzaqt(new zzaqj(new zzard(zzapxVar.m4307a(zzarmVar))));
                                        } else if (iM6345h == 45) {
                                            zzaqtVar = new zzaqt(new zzaqn());
                                        } else if (iM6345h == 89) {
                                            zzaqtVar = new zzaqt(new zzapz(zzarmVar.f6767b));
                                        } else if (iM6345h == 172) {
                                            zzaqtVar2 = new zzaqt(new zzapt(str, zzarmVar.m4338a(), "video/mp2t"));
                                        } else if (iM6345h == 257) {
                                            zzaqtVar = new zzarb(new zzaqs("application/vnd.dvb.ait"));
                                        } else if (iM6345h != 128) {
                                            if (iM6345h == 129) {
                                                zzaqtVar2 = new zzaqt(new zzapq(str, zzarmVar.m4338a(), "video/mp2t"));
                                            } else if (iM6345h == 138) {
                                                zzaqtVar2 = new zzaqt(new zzapy(str, zzarmVar.m4338a(), 4096));
                                            } else if (iM6345h != 139) {
                                                switch (iM6345h) {
                                                    case 15:
                                                        zzaqtVar2 = new zzaqt(new zzapw(zzarmVar.m4338a(), str, "video/mp2t", false));
                                                        break;
                                                    case 16:
                                                        zzaqtVar = new zzaqt(new zzaqf(new zzars(zzapxVar.m4307a(zzarmVar))));
                                                        break;
                                                    case 17:
                                                        zzaqtVar2 = new zzaqt(new zzaql(str, zzarmVar.m4338a()));
                                                        break;
                                                    default:
                                                        switch (iM6345h) {
                                                            case 134:
                                                                zzaqtVar = new zzarb(new zzaqs("application/x-scte35"));
                                                                break;
                                                            case 135:
                                                                zzaqtVar2 = new zzaqt(new zzapq(str, zzarmVar.m4338a(), "video/mp2t"));
                                                                break;
                                                            case 136:
                                                                zzaqtVar2 = new zzaqt(new zzapy(str, zzarmVar.m4338a(), 4096));
                                                                break;
                                                            default:
                                                                zzaqtVar = null;
                                                                break;
                                                        }
                                                        break;
                                                }
                                            } else {
                                                zzaqtVar2 = new zzaqt(new zzapy(str, zzarmVar.m4338a(), 5408));
                                            }
                                        }
                                        sparseIntArray.put(iM6345h2, iM6345h2);
                                        sparseArray3.put(iM6345h2, zzaqtVar);
                                    }
                                    zzaqtVar = zzaqtVar2;
                                    sparseIntArray.put(iM6345h2, iM6345h2);
                                    sparseArray3.put(iM6345h2, zzaqtVar);
                                } else {
                                    i7 = 4;
                                    i2 = 3;
                                }
                                zzaqtVar = new zzaqt(new zzaqc(new zzars(zzapxVar.m4307a(zzarmVar)), "video/mp2t"));
                                sparseIntArray.put(iM6345h2, iM6345h2);
                                sparseArray3.put(iM6345h2, zzaqtVar);
                            }
                            i5 = i2;
                            zzetVar = zzetVar2;
                            sparseArray2 = sparseArray4;
                            i4 = 0;
                            i6 = 13;
                        } else {
                            zzet zzetVar3 = zzetVar;
                            if (iM6369K2 == 5) {
                                long jM6374P = zzeuVar.m6374P();
                                if (jM6374P == 1094921523) {
                                    sparseArray2 = sparseArray2;
                                    i3 = iM6369K3;
                                    i10 = 129;
                                } else if (jM6374P == 1161904947) {
                                    i10 = 135;
                                    i3 = iM6369K3;
                                } else if (jM6374P == 1094921524) {
                                    sparseArray2 = sparseArray2;
                                    i3 = iM6369K3;
                                    i10 = 172;
                                } else if (jM6374P == 1212503619) {
                                    sparseArray2 = sparseArray2;
                                    i3 = iM6369K3;
                                    i10 = 36;
                                } else {
                                    i3 = iM6369K3;
                                }
                            } else if (iM6369K2 == 106) {
                                sparseArray2 = sparseArray2;
                                i3 = iM6369K3;
                                i10 = 129;
                            } else {
                                if (iM6369K2 == 122) {
                                    i10 = 135;
                                } else if (iM6369K2 == 127) {
                                    int iM6369K4 = zzeuVar.m6369K();
                                    if (iM6369K4 == 21) {
                                        sparseArray2 = sparseArray2;
                                        i3 = iM6369K3;
                                        i10 = 172;
                                    } else if (iM6369K4 == 14) {
                                        i10 = 136;
                                    } else if (iM6369K4 == 33) {
                                        sparseArray2 = sparseArray2;
                                        i3 = iM6369K3;
                                        i10 = 139;
                                    }
                                } else if (iM6369K2 == 123) {
                                    sparseArray2 = sparseArray2;
                                    i3 = iM6369K3;
                                    i10 = 138;
                                } else if (iM6369K2 == 10) {
                                    strTrim = zzeuVar.m6385k(3, StandardCharsets.UTF_8).trim();
                                    iM6369K = zzeuVar.m6369K();
                                } else if (iM6369K2 == 89) {
                                    ArrayList arrayList2 = new ArrayList();
                                    while (zzeuVar.f14888b < iM6369K3) {
                                        String strTrim2 = zzeuVar.m6385k(3, StandardCharsets.UTF_8).trim();
                                        zzeuVar.m6369K();
                                        byte[] bArr = new byte[4];
                                        zzeuVar.m6366H(bArr, 0, 4);
                                        arrayList2.add(new zzarl(strTrim2, bArr));
                                        iM6369K3 = iM6369K3;
                                        sparseArray2 = sparseArray2;
                                    }
                                    sparseArray2 = sparseArray2;
                                    i3 = iM6369K3;
                                    arrayList = arrayList2;
                                    i10 = 89;
                                } else {
                                    sparseArray2 = sparseArray2;
                                    i3 = iM6369K3;
                                    if (iM6369K2 == 111) {
                                        i10 = 257;
                                    }
                                }
                                i3 = iM6369K3;
                            }
                            zzeuVar.m6365G(i3 - zzeuVar.f14888b);
                            zzetVar = zzetVar3;
                            sparseArray2 = sparseArray2;
                        }
                    }
                    SparseArray sparseArray5 = sparseArray2;
                    zzet zzetVar4 = zzetVar;
                    zzeuVar.m6363E(i9);
                    zzarmVar = new zzarm(i10, strTrim, iM6369K, arrayList, Arrays.copyOfRange(zzeuVar.f14887a, i8, i9));
                    str = strTrim;
                    if (iM6345h != 6) {
                        iM6345h = i10;
                    } else {
                        iM6345h = i10;
                    }
                    iM6360B -= iM6345h3 + 5;
                    if (sparseBooleanArray.get(iM6345h2)) {
                        zzapx zzapxVar2 = zzarkVar.f6752e;
                        zzapxVar2.getClass();
                        if (iM6345h != 2) {
                            i2 = 3;
                            i7 = 4;
                            if (iM6345h != 3) {
                                zzaqtVar2 = new zzaqt(new zzaqm(str, zzarmVar.m4338a(), "video/mp2t"));
                                zzaqtVar = zzaqtVar2;
                            } else {
                                zzaqtVar2 = new zzaqt(new zzaqm(str, zzarmVar.m4338a(), "video/mp2t"));
                                zzaqtVar = zzaqtVar2;
                            }
                            sparseIntArray.put(iM6345h2, iM6345h2);
                            sparseArray3.put(iM6345h2, zzaqtVar);
                        } else {
                            i7 = 4;
                            i2 = 3;
                        }
                        zzaqtVar = new zzaqt(new zzaqc(new zzars(zzapxVar2.m4307a(zzarmVar)), "video/mp2t"));
                        sparseIntArray.put(iM6345h2, iM6345h2);
                        sparseArray3.put(iM6345h2, zzaqtVar);
                    } else {
                        i7 = 4;
                        i2 = 3;
                    }
                    i5 = i2;
                    zzetVar = zzetVar4;
                    sparseArray2 = sparseArray5;
                    i4 = 0;
                    i6 = 13;
                }
                SparseArray sparseArray6 = sparseArray2;
                int size = sparseIntArray.size();
                int i11 = 0;
                while (i11 < size) {
                    int iKeyAt = sparseIntArray.keyAt(i11);
                    int iValueAt = sparseIntArray.valueAt(i11);
                    sparseBooleanArray.put(iKeyAt, true);
                    zzarkVar.f6756i.put(iValueAt, true);
                    zzarp zzarpVar = (zzarp) sparseArray3.valueAt(i11);
                    if (zzarpVar != null) {
                        zzarpVar.mo4330b(zzfjVar, zzarkVar.f6759l, new zzaro(iM6370L, iKeyAt, 8192));
                        sparseArray = sparseArray6;
                        sparseArray.put(iValueAt, zzarpVar);
                    } else {
                        sparseArray = sparseArray6;
                    }
                    i11++;
                    sparseArray6 = sparseArray;
                }
                sparseArray6.remove(this.f6745d);
                zzarkVar.f6759l.mo4110v();
                zzarkVar.f6760m = true;
            }
        }
    }
}
