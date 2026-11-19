package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzida {
    /* JADX INFO: renamed from: a */
    public static int m8109a(byte[] bArr, int i2, zzicz zziczVar) {
        int i3 = i2 + 1;
        byte b = bArr[i2];
        if (b < 0) {
            return m8110b(b, bArr, i3, zziczVar);
        }
        zziczVar.f19698a = b;
        return i3;
    }

    /* JADX INFO: renamed from: b */
    public static int m8110b(int i2, byte[] bArr, int i3, zzicz zziczVar) {
        byte b = bArr[i3];
        int i4 = i3 + 1;
        int i5 = i2 & 127;
        if (b >= 0) {
            zziczVar.f19698a = i5 | (b << 7);
            return i4;
        }
        int i6 = i5 | ((b & 127) << 7);
        int i7 = i3 + 2;
        byte b2 = bArr[i4];
        if (b2 >= 0) {
            zziczVar.f19698a = i6 | (b2 << 14);
            return i7;
        }
        int i8 = i6 | ((b2 & 127) << 14);
        int i9 = i3 + 3;
        byte b3 = bArr[i7];
        if (b3 >= 0) {
            zziczVar.f19698a = i8 | (b3 << 21);
            return i9;
        }
        int i10 = i8 | ((b3 & 127) << 21);
        int i11 = i3 + 4;
        byte b4 = bArr[i9];
        if (b4 >= 0) {
            zziczVar.f19698a = i10 | (b4 << 28);
            return i11;
        }
        int i12 = i10 | ((b4 & 127) << 28);
        while (true) {
            int i13 = i11 + 1;
            if (bArr[i11] >= 0) {
                zziczVar.f19698a = i12;
                return i13;
            }
            i11 = i13;
        }
    }

    /* JADX INFO: renamed from: c */
    public static int m8111c(byte[] bArr, int i2, zzicz zziczVar) {
        long j2 = bArr[i2];
        int i3 = i2 + 1;
        if (j2 >= 0) {
            zziczVar.f19699b = j2;
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
        zziczVar.f19699b = j3;
        return i4;
    }

    /* JADX INFO: renamed from: d */
    public static int m8112d(int i2, byte[] bArr) {
        int i3 = bArr[i2] & 255;
        int i4 = bArr[i2 + 1] & 255;
        int i5 = bArr[i2 + 2] & 255;
        return ((bArr[i2 + 3] & 255) << 24) | (i4 << 8) | i3 | (i5 << 16);
    }

    /* JADX INFO: renamed from: e */
    public static long m8113e(int i2, byte[] bArr) {
        return (((long) bArr[i2]) & 255) | ((((long) bArr[i2 + 1]) & 255) << 8) | ((((long) bArr[i2 + 2]) & 255) << 16) | ((((long) bArr[i2 + 3]) & 255) << 24) | ((((long) bArr[i2 + 4]) & 255) << 32) | ((((long) bArr[i2 + 5]) & 255) << 40) | ((((long) bArr[i2 + 6]) & 255) << 48) | ((((long) bArr[i2 + 7]) & 255) << 56);
    }

    /* JADX INFO: renamed from: f */
    public static int m8114f(byte[] bArr, int i2, zzicz zziczVar) throws zzifh {
        int iM8109a = m8109a(bArr, i2, zziczVar);
        int i3 = zziczVar.f19698a;
        if (i3 < 0) {
            throw new zzifh("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i3 == 0) {
            zziczVar.f19700c = "";
            return iM8109a;
        }
        zziczVar.f19700c = zzihp.m8489d(bArr, iM8109a, i3);
        return iM8109a + i3;
    }

    /* JADX INFO: renamed from: g */
    public static int m8115g(byte[] bArr, int i2, zzicz zziczVar) throws zzifh {
        int iM8109a = m8109a(bArr, i2, zziczVar);
        int i3 = zziczVar.f19698a;
        if (i3 < 0) {
            throw new zzifh("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i3 > bArr.length - iM8109a) {
            throw new zzifh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        if (i3 == 0) {
            zziczVar.f19700c = zzidl.f19719t;
            return iM8109a;
        }
        zziczVar.f19700c = zzidl.m8149y(bArr, iM8109a, i3);
        return iM8109a + i3;
    }

    /* JADX INFO: renamed from: h */
    public static int m8116h(Object obj, zzigr zzigrVar, byte[] bArr, int i2, int i3, zzicz zziczVar) throws zzifh {
        int iM8110b = i2 + 1;
        int i4 = bArr[i2];
        if (i4 < 0) {
            iM8110b = m8110b(i4, bArr, iM8110b, zziczVar);
            i4 = zziczVar.f19698a;
        }
        int i5 = iM8110b;
        if (i4 < 0 || i4 > i3 - i5) {
            throw new zzifh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i6 = zziczVar.f19702e + 1;
        zziczVar.f19702e = i6;
        m8123o(i6);
        int i7 = i5 + i4;
        zzigrVar.mo8397e(obj, bArr, i5, i7, zziczVar);
        zziczVar.f19702e--;
        zziczVar.f19700c = obj;
        return i7;
    }

    /* JADX INFO: renamed from: i */
    public static int m8117i(Object obj, zzigr zzigrVar, byte[] bArr, int i2, int i3, int i4, zzicz zziczVar) throws zzifh {
        int i5 = zziczVar.f19702e + 1;
        zziczVar.f19702e = i5;
        m8123o(i5);
        int iM8410y = ((zzigc) zzigrVar).m8410y(obj, bArr, i2, i3, i4, zziczVar);
        zziczVar.f19702e--;
        zziczVar.f19700c = obj;
        return iM8410y;
    }

    /* JADX INFO: renamed from: j */
    public static int m8118j(int i2, byte[] bArr, int i3, int i4, zzifb zzifbVar, zzicz zziczVar) {
        zzieq zzieqVar = (zzieq) zzifbVar;
        int iM8109a = m8109a(bArr, i3, zziczVar);
        zzieqVar.mo8348I(zziczVar.f19698a);
        while (iM8109a < i4) {
            int iM8109a2 = m8109a(bArr, iM8109a, zziczVar);
            if (i2 != zziczVar.f19698a) {
                break;
            }
            iM8109a = m8109a(bArr, iM8109a2, zziczVar);
            zzieqVar.mo8348I(zziczVar.f19698a);
        }
        return iM8109a;
    }

    /* JADX INFO: renamed from: k */
    public static int m8119k(byte[] bArr, int i2, zzifb zzifbVar, zzicz zziczVar) throws zzifh {
        zzieq zzieqVar = (zzieq) zzifbVar;
        int iM8109a = m8109a(bArr, i2, zziczVar);
        int i3 = zziczVar.f19698a + iM8109a;
        while (iM8109a < i3) {
            iM8109a = m8109a(bArr, iM8109a, zziczVar);
            zzieqVar.mo8348I(zziczVar.f19698a);
        }
        if (iM8109a == i3) {
            return iM8109a;
        }
        throw new zzifh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    /* JADX INFO: renamed from: l */
    public static int m8120l(zzigr zzigrVar, int i2, byte[] bArr, int i3, int i4, zzifb zzifbVar, zzicz zziczVar) throws zzifh {
        Object objZza = zzigrVar.zza();
        zzigr zzigrVar2 = zzigrVar;
        byte[] bArr2 = bArr;
        int i5 = i4;
        zzicz zziczVar2 = zziczVar;
        int iM8116h = m8116h(objZza, zzigrVar2, bArr2, i3, i5, zziczVar2);
        zzigrVar2.mo8395c(objZza);
        zziczVar2.f19700c = objZza;
        zzifbVar.add(objZza);
        while (iM8116h < i5) {
            zzicz zziczVar3 = zziczVar2;
            int i6 = i5;
            int iM8109a = m8109a(bArr2, iM8116h, zziczVar3);
            if (i2 != zziczVar3.f19698a) {
                break;
            }
            byte[] bArr3 = bArr2;
            zzigr zzigrVar3 = zzigrVar2;
            Object objZza2 = zzigrVar3.zza();
            iM8116h = m8116h(objZza2, zzigrVar3, bArr3, iM8109a, i6, zziczVar3);
            zzigrVar2 = zzigrVar3;
            bArr2 = bArr3;
            i5 = i6;
            zziczVar2 = zziczVar3;
            zzigrVar2.mo8395c(objZza2);
            zziczVar2.f19700c = objZza2;
            zzifbVar.add(objZza2);
        }
        return iM8116h;
    }

    /* JADX INFO: renamed from: m */
    public static int m8121m(int i2, byte[] bArr, int i3, int i4, zzihe zziheVar, zzicz zziczVar) throws zzifh {
        if ((i2 >>> 3) == 0) {
            throw new zzifh("Protocol message contained an invalid tag (zero).");
        }
        int i5 = i2 & 7;
        if (i5 == 0) {
            int iM8111c = m8111c(bArr, i3, zziczVar);
            zziheVar.m8457d(i2, Long.valueOf(zziczVar.f19699b));
            return iM8111c;
        }
        if (i5 == 1) {
            zziheVar.m8457d(i2, Long.valueOf(m8113e(i3, bArr)));
            return i3 + 8;
        }
        if (i5 == 2) {
            int iM8109a = m8109a(bArr, i3, zziczVar);
            int i6 = zziczVar.f19698a;
            if (i6 < 0) {
                throw new zzifh("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            if (i6 > bArr.length - iM8109a) {
                throw new zzifh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if (i6 == 0) {
                zziheVar.m8457d(i2, zzidl.f19719t);
            } else {
                zziheVar.m8457d(i2, zzidl.m8149y(bArr, iM8109a, i6));
            }
            return iM8109a + i6;
        }
        if (i5 != 3) {
            if (i5 != 5) {
                throw new zzifh("Protocol message contained an invalid tag (zero).");
            }
            zziheVar.m8457d(i2, Integer.valueOf(m8112d(i3, bArr)));
            return i3 + 4;
        }
        int i7 = (i2 & (-8)) | 4;
        zzihe zziheVarM8454a = zzihe.m8454a();
        int i8 = zziczVar.f19702e + 1;
        zziczVar.f19702e = i8;
        m8123o(i8);
        int i9 = 0;
        while (i3 < i4) {
            int iM8109a2 = m8109a(bArr, i3, zziczVar);
            int i10 = zziczVar.f19698a;
            if (i10 == i7) {
                i9 = i10;
                i3 = iM8109a2;
                break;
            }
            i3 = m8121m(i10, bArr, iM8109a2, i4, zziheVarM8454a, zziczVar);
            i9 = i10;
        }
        zziczVar.f19702e--;
        if (i3 > i4 || i9 != i7) {
            throw new zzifh("Failed to parse the message.");
        }
        zziheVar.m8457d(i2, zziheVarM8454a);
        return i3;
    }

    /* JADX INFO: renamed from: n */
    public static int m8122n(int i2, byte[] bArr, int i3, int i4, zzicz zziczVar) throws zzifh {
        if ((i2 >>> 3) == 0) {
            throw new zzifh("Protocol message contained an invalid tag (zero).");
        }
        int i5 = i2 & 7;
        if (i5 == 0) {
            return m8111c(bArr, i3, zziczVar);
        }
        if (i5 == 1) {
            return i3 + 8;
        }
        if (i5 == 2) {
            return m8109a(bArr, i3, zziczVar) + zziczVar.f19698a;
        }
        if (i5 != 3) {
            if (i5 == 5) {
                return i3 + 4;
            }
            throw new zzifh("Protocol message contained an invalid tag (zero).");
        }
        int i6 = (i2 & (-8)) | 4;
        int i7 = zziczVar.f19702e + 1;
        zziczVar.f19702e = i7;
        m8123o(i7);
        int i8 = 0;
        while (i3 < i4) {
            i3 = m8109a(bArr, i3, zziczVar);
            i8 = zziczVar.f19698a;
            if (i8 == i6) {
                break;
            }
            i3 = m8122n(i8, bArr, i3, i4, zziczVar);
        }
        zziczVar.f19702e--;
        if (i3 > i4 || i8 != i6) {
            throw new zzifh("Failed to parse the message.");
        }
        return i3;
    }

    /* JADX INFO: renamed from: o */
    public static void m8123o(int i2) throws zzifh {
        if (i2 >= 100) {
            throw new zzifh("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
    }
}
