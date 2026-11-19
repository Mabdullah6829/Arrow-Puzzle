package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzagi {
    /* JADX WARN: Code duplicated, block: B:57:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:59:0x00c6 A[LOOP:0: B:58:0x00c4->B:59:0x00c6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:62:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:65:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:68:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:70:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:72:0x00f0  */
    /* JADX INFO: renamed from: a */
    public static boolean m4113a(zzeu zzeuVar, zzagn zzagnVar, int i2, zzagh zzaghVar) {
        int iM6369K;
        byte[] bArr;
        int i3;
        int i4;
        int iM6367I;
        int i5;
        long jM6374P = zzeuVar.m6374P();
        long j2 = jM6374P >>> 16;
        if (j2 != i2) {
            return false;
        }
        boolean z = (j2 & 1) == 1;
        long j3 = jM6374P >> 12;
        long j4 = jM6374P >> 8;
        long j5 = jM6374P >> 4;
        long j6 = jM6374P >> 1;
        long j7 = jM6374P & 1;
        int i6 = (int) (j5 & 15);
        if (i6 > 7 ? !(i6 > 10 || zzagnVar.f5256g != 2) : i6 == zzagnVar.f5256g - 1) {
            int i7 = (int) (j6 & 7);
            if ((i7 == 0 || i7 == zzagnVar.f5258i) && j7 != 1 && m4115c(zzeuVar, zzagnVar, z, zzaghVar)) {
                long j8 = zzaghVar.f5244a;
                int iM4114b = m4114b((int) (j3 & 15), zzeuVar);
                long j9 = zzagnVar.f5259j;
                boolean z2 = j9 == 0 || j8 + ((long) iM4114b) >= j9;
                if (iM4114b != -1 && ((z2 || iM4114b >= zzagnVar.f5250a) && iM4114b <= zzagnVar.f5251b)) {
                    int i8 = zzagnVar.f5254e;
                    int i9 = (int) (j4 & 15);
                    if (i9 == 0) {
                        iM6369K = zzeuVar.m6369K();
                        int i10 = zzeuVar.f14888b;
                        bArr = zzeuVar.f14887a;
                        i3 = i10 - 1;
                        i4 = 0;
                        for (int i11 = zzeuVar.f14888b; i11 < i3; i11++) {
                            i4 = zzfm.f16099i[i4 ^ (bArr[i11] & 255)];
                        }
                        String str = zzfm.f16091a;
                        if (iM6369K == i4) {
                            if (zzeuVar.m6360B() != 0) {
                                iM6367I = zzeuVar.m6367I();
                                if ((iM6367I & 128) == 0) {
                                    i5 = (iM6367I & 126) >> 1;
                                    if (i5 < 2) {
                                        StringBuilder sb = new StringBuilder(String.valueOf(i5).length() + 57);
                                        sb.append("Ignoring frame where first subframe has a reserved type: ");
                                        sb.append(i5);
                                        zzeh.m6210b("FlacFrameReader", sb.toString());
                                    } else {
                                        StringBuilder sb2 = new StringBuilder(String.valueOf(i5).length() + 57);
                                        sb2.append("Ignoring frame where first subframe has a reserved type: ");
                                        sb2.append(i5);
                                        zzeh.m6210b("FlacFrameReader", sb2.toString());
                                    }
                                }
                            }
                            return true;
                        }
                    } else if (i9 <= 11) {
                        if (i9 == zzagnVar.f5255f) {
                            iM6369K = zzeuVar.m6369K();
                            int i12 = zzeuVar.f14888b;
                            bArr = zzeuVar.f14887a;
                            i3 = i12 - 1;
                            i4 = 0;
                            while (i11 < i3) {
                                i4 = zzfm.f16099i[i4 ^ (bArr[i11] & 255)];
                            }
                            String str2 = zzfm.f16091a;
                            if (iM6369K == i4) {
                                if (zzeuVar.m6360B() != 0) {
                                    iM6367I = zzeuVar.m6367I();
                                    if ((iM6367I & 128) == 0) {
                                        i5 = (iM6367I & 126) >> 1;
                                        if ((i5 < 2 && i5 <= 7) || (i5 >= 13 && i5 <= 31)) {
                                            StringBuilder sb3 = new StringBuilder(String.valueOf(i5).length() + 57);
                                            sb3.append("Ignoring frame where first subframe has a reserved type: ");
                                            sb3.append(i5);
                                            zzeh.m6210b("FlacFrameReader", sb3.toString());
                                        }
                                    }
                                }
                                return true;
                            }
                        }
                    } else if (i9 == 12) {
                        if (zzeuVar.m6369K() * 1000 == i8) {
                            iM6369K = zzeuVar.m6369K();
                            int i13 = zzeuVar.f14888b;
                            bArr = zzeuVar.f14887a;
                            i3 = i13 - 1;
                            i4 = 0;
                            while (i11 < i3) {
                                i4 = zzfm.f16099i[i4 ^ (bArr[i11] & 255)];
                            }
                            String str3 = zzfm.f16091a;
                            if (iM6369K == i4) {
                                if (zzeuVar.m6360B() != 0) {
                                    iM6367I = zzeuVar.m6367I();
                                    if ((iM6367I & 128) == 0) {
                                        i5 = (iM6367I & 126) >> 1;
                                        if (i5 < 2) {
                                            StringBuilder sb4 = new StringBuilder(String.valueOf(i5).length() + 57);
                                            sb4.append("Ignoring frame where first subframe has a reserved type: ");
                                            sb4.append(i5);
                                            zzeh.m6210b("FlacFrameReader", sb4.toString());
                                        } else {
                                            StringBuilder sb5 = new StringBuilder(String.valueOf(i5).length() + 57);
                                            sb5.append("Ignoring frame where first subframe has a reserved type: ");
                                            sb5.append(i5);
                                            zzeh.m6210b("FlacFrameReader", sb5.toString());
                                        }
                                    }
                                }
                                return true;
                            }
                        }
                    } else if (i9 <= 14) {
                        int iM6370L = zzeuVar.m6370L();
                        if (i9 == 14) {
                            iM6370L *= 10;
                        }
                        if (iM6370L == i8) {
                            iM6369K = zzeuVar.m6369K();
                            int i14 = zzeuVar.f14888b;
                            bArr = zzeuVar.f14887a;
                            i3 = i14 - 1;
                            i4 = 0;
                            while (i11 < i3) {
                                i4 = zzfm.f16099i[i4 ^ (bArr[i11] & 255)];
                            }
                            String str4 = zzfm.f16091a;
                            if (iM6369K == i4) {
                                if (zzeuVar.m6360B() != 0) {
                                    iM6367I = zzeuVar.m6367I();
                                    if ((iM6367I & 128) == 0) {
                                        i5 = (iM6367I & 126) >> 1;
                                        if (i5 < 2) {
                                            StringBuilder sb6 = new StringBuilder(String.valueOf(i5).length() + 57);
                                            sb6.append("Ignoring frame where first subframe has a reserved type: ");
                                            sb6.append(i5);
                                            zzeh.m6210b("FlacFrameReader", sb6.toString());
                                        } else {
                                            StringBuilder sb7 = new StringBuilder(String.valueOf(i5).length() + 57);
                                            sb7.append("Ignoring frame where first subframe has a reserved type: ");
                                            sb7.append(i5);
                                            zzeh.m6210b("FlacFrameReader", sb7.toString());
                                        }
                                    }
                                }
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static int m4114b(int i2, zzeu zzeuVar) {
        switch (i2) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i2 - 2);
            case 6:
                return zzeuVar.m6369K() + 1;
            case 7:
                return zzeuVar.m6370L() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i2 - 8);
            default:
                return -1;
        }
    }

    /* JADX INFO: renamed from: c */
    public static boolean m4115c(zzeu zzeuVar, zzagn zzagnVar, boolean z, zzagh zzaghVar) {
        try {
            long jM6389o = zzeuVar.m6389o();
            if (!z) {
                jM6389o *= (long) zzagnVar.f5251b;
            }
            long j2 = zzagnVar.f5259j;
            if (j2 != 0 && jM6389o > j2) {
                return false;
            }
            zzaghVar.f5244a = jM6389o;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }
}
