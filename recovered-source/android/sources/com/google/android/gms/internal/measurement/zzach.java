package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes2.dex */
final class zzach {
    /* JADX INFO: renamed from: a */
    public static int m9353a(byte[] bArr, int i2, zzacg zzacgVar) {
        int i3 = i2 + 1;
        byte b = bArr[i2];
        if (b < 0) {
            return m9354b(b, bArr, i3, zzacgVar);
        }
        zzacgVar.f21957a = b;
        return i3;
    }

    /* JADX INFO: renamed from: b */
    public static int m9354b(int i2, byte[] bArr, int i3, zzacg zzacgVar) {
        byte b = bArr[i3];
        int i4 = i3 + 1;
        int i5 = i2 & 127;
        if (b >= 0) {
            zzacgVar.f21957a = i5 | (b << 7);
            return i4;
        }
        int i6 = i5 | ((b & 127) << 7);
        int i7 = i3 + 2;
        byte b2 = bArr[i4];
        if (b2 >= 0) {
            zzacgVar.f21957a = i6 | (b2 << 14);
            return i7;
        }
        int i8 = i6 | ((b2 & 127) << 14);
        int i9 = i3 + 3;
        byte b3 = bArr[i7];
        if (b3 >= 0) {
            zzacgVar.f21957a = i8 | (b3 << 21);
            return i9;
        }
        int i10 = i8 | ((b3 & 127) << 21);
        int i11 = i3 + 4;
        byte b4 = bArr[i9];
        if (b4 >= 0) {
            zzacgVar.f21957a = i10 | (b4 << 28);
            return i11;
        }
        int i12 = i10 | ((b4 & 127) << 28);
        while (true) {
            int i13 = i11 + 1;
            if (bArr[i11] >= 0) {
                zzacgVar.f21957a = i12;
                return i13;
            }
            i11 = i13;
        }
    }

    /* JADX INFO: renamed from: c */
    public static int m9355c(byte[] bArr, int i2, zzacg zzacgVar) {
        long j2 = bArr[i2];
        int i3 = i2 + 1;
        if (j2 >= 0) {
            zzacgVar.f21958b = j2;
            return i3;
        }
        int i4 = i2 + 2;
        byte b = bArr[i3];
        long j3 = (j2 & 127) | (((long) (b & 127)) << 7);
        int i5 = 7;
        while (b < 0) {
            int i6 = i4 + 1;
            byte b2 = bArr[i4];
            i5 += 7;
            j3 |= ((long) (b2 & 127)) << i5;
            b = b2;
            i4 = i6;
        }
        zzacgVar.f21958b = j3;
        return i4;
    }

    /* JADX INFO: renamed from: d */
    public static int m9356d(int i2, byte[] bArr) {
        int i3 = bArr[i2] & 255;
        int i4 = bArr[i2 + 1] & 255;
        int i5 = bArr[i2 + 2] & 255;
        return ((bArr[i2 + 3] & 255) << 24) | (i4 << 8) | i3 | (i5 << 16);
    }

    /* JADX INFO: renamed from: e */
    public static long m9357e(int i2, byte[] bArr) {
        return (((long) bArr[i2]) & 255) | ((((long) bArr[i2 + 1]) & 255) << 8) | ((((long) bArr[i2 + 2]) & 255) << 16) | ((((long) bArr[i2 + 3]) & 255) << 24) | ((((long) bArr[i2 + 4]) & 255) << 32) | ((((long) bArr[i2 + 5]) & 255) << 40) | ((((long) bArr[i2 + 6]) & 255) << 48) | ((((long) bArr[i2 + 7]) & 255) << 56);
    }

    /* JADX INFO: renamed from: f */
    public static int m9358f(byte[] bArr, int i2, zzacg zzacgVar) throws zzaeh {
        int iM9353a = m9353a(bArr, i2, zzacgVar);
        int i3 = zzacgVar.f21957a;
        if (i3 < 0) {
            throw new zzaeh("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i3 == 0) {
            zzacgVar.f21959c = "";
            return iM9353a;
        }
        zzacgVar.f21959c = zzagl.m9719d(bArr, iM9353a, i3);
        return iM9353a + i3;
    }

    /* JADX INFO: renamed from: g */
    public static int m9359g(byte[] bArr, int i2, zzacg zzacgVar) throws zzaeh {
        int iM9353a = m9353a(bArr, i2, zzacgVar);
        int i3 = zzacgVar.f21957a;
        if (i3 < 0) {
            throw new zzaeh("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i3 > bArr.length - iM9353a) {
            throw new zzaeh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        if (i3 == 0) {
            zzacgVar.f21959c = zzacr.f21972t;
            return iM9353a;
        }
        zzacgVar.f21959c = zzacr.m9379m(bArr, iM9353a, i3);
        return iM9353a + i3;
    }

    /* JADX INFO: renamed from: h */
    public static int m9360h(Object obj, zzafp zzafpVar, byte[] bArr, int i2, int i3, zzacg zzacgVar) throws zzaeh {
        int iM9354b = i2 + 1;
        int i4 = bArr[i2];
        if (i4 < 0) {
            iM9354b = m9354b(i4, bArr, iM9354b, zzacgVar);
            i4 = zzacgVar.f21957a;
        }
        int i5 = iM9354b;
        if (i4 < 0 || i4 > i3 - i5) {
            throw new zzaeh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i6 = zzacgVar.f21961e + 1;
        zzacgVar.f21961e = i6;
        if (i6 >= 100) {
            throw new zzaeh("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i7 = i5 + i4;
        zzafpVar.mo9637g(obj, bArr, i5, i7, zzacgVar);
        zzacgVar.f21961e--;
        zzacgVar.f21959c = obj;
        return i7;
    }

    /* JADX INFO: renamed from: i */
    public static int m9361i(Object obj, zzafp zzafpVar, byte[] bArr, int i2, int i3, int i4, zzacg zzacgVar) throws zzaeh {
        zzaff zzaffVar = (zzaff) zzafpVar;
        int i5 = zzacgVar.f21961e + 1;
        zzacgVar.f21961e = i5;
        if (i5 >= 100) {
            throw new zzaeh("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int iM9648y = zzaffVar.m9648y(obj, bArr, i2, i3, i4, zzacgVar);
        zzacgVar.f21961e--;
        zzacgVar.f21959c = obj;
        return iM9648y;
    }

    /* JADX INFO: renamed from: j */
    public static int m9362j(int i2, byte[] bArr, int i3, int i4, zzaef zzaefVar, zzacg zzacgVar) {
        zzadv zzadvVar = (zzadv) zzaefVar;
        int iM9353a = m9353a(bArr, i3, zzacgVar);
        zzadvVar.m9575b(zzacgVar.f21957a);
        while (iM9353a < i4) {
            int iM9353a2 = m9353a(bArr, iM9353a, zzacgVar);
            if (i2 != zzacgVar.f21957a) {
                break;
            }
            iM9353a = m9353a(bArr, iM9353a2, zzacgVar);
            zzadvVar.m9575b(zzacgVar.f21957a);
        }
        return iM9353a;
    }

    /* JADX INFO: renamed from: k */
    public static int m9363k(byte[] bArr, int i2, zzaef zzaefVar, zzacg zzacgVar) throws zzaeh {
        zzadv zzadvVar = (zzadv) zzaefVar;
        int iM9353a = m9353a(bArr, i2, zzacgVar);
        int i3 = zzacgVar.f21957a + iM9353a;
        while (iM9353a < i3) {
            iM9353a = m9353a(bArr, iM9353a, zzacgVar);
            zzadvVar.m9575b(zzacgVar.f21957a);
        }
        if (iM9353a == i3) {
            return iM9353a;
        }
        throw new zzaeh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    /* JADX INFO: renamed from: l */
    public static int m9364l(zzafp zzafpVar, int i2, byte[] bArr, int i3, int i4, zzaef zzaefVar, zzacg zzacgVar) throws zzaeh {
        Object objZza = zzafpVar.zza();
        zzafp zzafpVar2 = zzafpVar;
        byte[] bArr2 = bArr;
        int i5 = i4;
        zzacg zzacgVar2 = zzacgVar;
        int iM9360h = m9360h(objZza, zzafpVar2, bArr2, i3, i5, zzacgVar2);
        zzafpVar2.mo9633c(objZza);
        zzacgVar2.f21959c = objZza;
        zzaefVar.add(objZza);
        while (iM9360h < i5) {
            zzacg zzacgVar3 = zzacgVar2;
            int i6 = i5;
            int iM9353a = m9353a(bArr2, iM9360h, zzacgVar3);
            if (i2 != zzacgVar3.f21957a) {
                break;
            }
            byte[] bArr3 = bArr2;
            zzafp zzafpVar3 = zzafpVar2;
            Object objZza2 = zzafpVar3.zza();
            iM9360h = m9360h(objZza2, zzafpVar3, bArr3, iM9353a, i6, zzacgVar3);
            zzafpVar2 = zzafpVar3;
            bArr2 = bArr3;
            i5 = i6;
            zzacgVar2 = zzacgVar3;
            zzafpVar2.mo9633c(objZza2);
            zzacgVar2.f21959c = objZza2;
            zzaefVar.add(objZza2);
        }
        return iM9360h;
    }

    /* JADX INFO: renamed from: m */
    public static int m9365m(int i2, byte[] bArr, int i3, int i4, zzaga zzagaVar, zzacg zzacgVar) throws zzaeh {
        if ((i2 >>> 3) == 0) {
            throw new zzaeh("Protocol message contained an invalid tag (zero).");
        }
        int i5 = i2 & 7;
        if (i5 == 0) {
            int iM9355c = m9355c(bArr, i3, zzacgVar);
            zzagaVar.m9689d(i2, Long.valueOf(zzacgVar.f21958b));
            return iM9355c;
        }
        if (i5 == 1) {
            zzagaVar.m9689d(i2, Long.valueOf(m9357e(i3, bArr)));
            return i3 + 8;
        }
        if (i5 == 2) {
            int iM9353a = m9353a(bArr, i3, zzacgVar);
            int i6 = zzacgVar.f21957a;
            if (i6 < 0) {
                throw new zzaeh("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            if (i6 > bArr.length - iM9353a) {
                throw new zzaeh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if (i6 == 0) {
                zzagaVar.m9689d(i2, zzacr.f21972t);
            } else {
                zzagaVar.m9689d(i2, zzacr.m9379m(bArr, iM9353a, i6));
            }
            return iM9353a + i6;
        }
        if (i5 != 3) {
            if (i5 != 5) {
                throw new zzaeh("Protocol message contained an invalid tag (zero).");
            }
            zzagaVar.m9689d(i2, Integer.valueOf(m9356d(i3, bArr)));
            return i3 + 4;
        }
        int i7 = (i2 & (-8)) | 4;
        zzaga zzagaVarM9686a = zzaga.m9686a();
        int i8 = zzacgVar.f21961e + 1;
        zzacgVar.f21961e = i8;
        if (i8 >= 100) {
            throw new zzaeh("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i9 = 0;
        while (i3 < i4) {
            int iM9353a2 = m9353a(bArr, i3, zzacgVar);
            int i10 = zzacgVar.f21957a;
            if (i10 == i7) {
                i9 = i10;
                i3 = iM9353a2;
                break;
            }
            i3 = m9365m(i10, bArr, iM9353a2, i4, zzagaVarM9686a, zzacgVar);
            i9 = i10;
        }
        zzacgVar.f21961e--;
        if (i3 > i4 || i9 != i7) {
            throw new zzaeh("Failed to parse the message.");
        }
        zzagaVar.m9689d(i2, zzagaVarM9686a);
        return i3;
    }

    /* JADX INFO: renamed from: n */
    public static int m9366n(int i2, byte[] bArr, int i3, int i4, zzacg zzacgVar) throws zzaeh {
        if ((i2 >>> 3) == 0) {
            throw new zzaeh("Protocol message contained an invalid tag (zero).");
        }
        int i5 = i2 & 7;
        if (i5 == 0) {
            return m9355c(bArr, i3, zzacgVar);
        }
        if (i5 == 1) {
            return i3 + 8;
        }
        if (i5 == 2) {
            return m9353a(bArr, i3, zzacgVar) + zzacgVar.f21957a;
        }
        if (i5 != 3) {
            if (i5 == 5) {
                return i3 + 4;
            }
            throw new zzaeh("Protocol message contained an invalid tag (zero).");
        }
        int i6 = (i2 & (-8)) | 4;
        int i7 = 0;
        while (i3 < i4) {
            i3 = m9353a(bArr, i3, zzacgVar);
            i7 = zzacgVar.f21957a;
            if (i7 == i6) {
                break;
            }
            i3 = m9366n(i7, bArr, i3, i4, zzacgVar);
        }
        if (i3 > i4 || i7 != i6) {
            throw new zzaeh("Failed to parse the message.");
        }
        return i3;
    }
}
