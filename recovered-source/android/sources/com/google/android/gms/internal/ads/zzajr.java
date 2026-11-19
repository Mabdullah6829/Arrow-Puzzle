package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class zzajr {

    /* JADX INFO: renamed from: a */
    public static final zzajo f5553a = new zzajo() { // from class: com.google.android.gms.internal.ads.zzajp
    };

    /* JADX WARN: Code duplicated, block: B:25:0x006b A[Catch: all -> 0x0020, TryCatch #0 {all -> 0x0020, blocks: (B:3:0x0006, B:7:0x0013, B:20:0x003e, B:23:0x0049, B:25:0x006b, B:29:0x0071, B:41:0x008d, B:42:0x008f, B:45:0x0095, B:48:0x009f, B:31:0x007b, B:35:0x0082, B:10:0x0023), top: B:54:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x006f  */
    /* JADX WARN: Code duplicated, block: B:28:0x0070  */
    /* JADX WARN: Code duplicated, block: B:30:0x0079 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x007b A[Catch: all -> 0x0020, TryCatch #0 {all -> 0x0020, blocks: (B:3:0x0006, B:7:0x0013, B:20:0x003e, B:23:0x0049, B:25:0x006b, B:29:0x0071, B:41:0x008d, B:42:0x008f, B:45:0x0095, B:48:0x009f, B:31:0x007b, B:35:0x0082, B:10:0x0023), top: B:54:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x007f  */
    /* JADX WARN: Code duplicated, block: B:34:0x0081  */
    /* JADX WARN: Code duplicated, block: B:37:0x0086  */
    /* JADX WARN: Code duplicated, block: B:38:0x0087  */
    /* JADX WARN: Code duplicated, block: B:39:0x0089  */
    /* JADX WARN: Code duplicated, block: B:41:0x008d A[Catch: all -> 0x0020, TryCatch #0 {all -> 0x0020, blocks: (B:3:0x0006, B:7:0x0013, B:20:0x003e, B:23:0x0049, B:25:0x006b, B:29:0x0071, B:41:0x008d, B:42:0x008f, B:45:0x0095, B:48:0x009f, B:31:0x007b, B:35:0x0082, B:10:0x0023), top: B:54:0x0006 }] */
    /* JADX INFO: renamed from: a */
    public static boolean m4150a(zzeu zzeuVar, int i2, int i3, boolean z) {
        boolean z2;
        int iM6373O;
        long jM6373O;
        int iM6370L;
        int i4;
        int i5 = zzeuVar.f14888b;
        while (true) {
            try {
                z2 = true;
                z2 = true;
                int i6 = 1;
                int i7 = 1;
                if (zzeuVar.m6360B() >= i3) {
                    if (i2 >= 3) {
                        iM6373O = zzeuVar.m6376b();
                        jM6373O = zzeuVar.m6374P();
                        iM6370L = zzeuVar.m6370L();
                    } else {
                        iM6373O = zzeuVar.m6373O();
                        jM6373O = zzeuVar.m6373O();
                        iM6370L = 0;
                    }
                    if (iM6373O != 0 || jM6373O != 0 || iM6370L != 0) {
                        if (i2 != 4 || z) {
                            if (i2 == 4) {
                                if ((iM6370L & 64) != 0) {
                                    i6 = 0;
                                }
                                int i8 = i6;
                                i7 = iM6370L & 1;
                                i4 = i8;
                            } else if (i2 == 3) {
                                if ((iM6370L & 32) != 0) {
                                    i4 = 1;
                                } else {
                                    i4 = 0;
                                }
                                if ((iM6370L & 128) != 0) {
                                    i7 = 0;
                                }
                            } else {
                                i4 = 0;
                                i7 = 0;
                            }
                            if (i7 != 0) {
                                i4 += 4;
                            }
                            if (jM6373O >= i4 && zzeuVar.m6360B() >= jM6373O) {
                                zzeuVar.m6365G((int) jM6373O);
                            }
                        } else if ((8421504 & jM6373O) == 0) {
                            long j2 = ((jM6373O >> 16) & 255) << 14;
                            jM6373O = ((jM6373O >> 24) << 21) | j2 | (jM6373O & 255) | (((jM6373O >> 8) & 255) << 7);
                            if (i2 == 4) {
                                if ((iM6370L & 64) != 0) {
                                    i6 = 0;
                                }
                                int i9 = i6;
                                i7 = iM6370L & 1;
                                i4 = i9;
                            } else if (i2 == 3) {
                                if ((iM6370L & 32) != 0) {
                                    i4 = 1;
                                } else {
                                    i4 = 0;
                                }
                                if ((iM6370L & 128) != 0) {
                                    i7 = 0;
                                }
                            } else {
                                i4 = 0;
                                i7 = 0;
                            }
                            if (i7 != 0) {
                                i4 += 4;
                            }
                            if (jM6373O >= i4) {
                                zzeuVar.m6365G((int) jM6373O);
                            }
                        }
                        z2 = false;
                        break;
                    }
                    break;
                }
                break;
            } catch (Throwable th) {
                zzeuVar.m6363E(i5);
                throw th;
            }
        }
        zzeuVar.m6363E(i5);
        return z2;
    }

    /* JADX WARN: Code duplicated, block: B:153:0x026b  */
    /* JADX WARN: Code duplicated, block: B:154:0x026d  */
    /* JADX WARN: Code duplicated, block: B:158:0x0274  */
    /* JADX WARN: Code duplicated, block: B:159:0x027a  */
    /* JADX WARN: Code duplicated, block: B:161:0x027e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:166:0x0297 A[Catch: all -> 0x0130, Exception -> 0x0255, OutOfMemoryError -> 0x025a, TRY_LEAVE, TryCatch #0 {all -> 0x0130, blocks: (B:83:0x0105, B:92:0x013e, B:95:0x0145, B:106:0x016f, B:109:0x01a1, B:117:0x01cc, B:119:0x01e0, B:121:0x01e7, B:120:0x01e3, B:135:0x0206, B:137:0x021d, B:139:0x0244, B:141:0x024b, B:140:0x0247, B:164:0x0284, B:166:0x0297, B:168:0x02a0, B:180:0x02e4, B:182:0x0300, B:184:0x0307, B:183:0x0303, B:176:0x02c2, B:178:0x02de, B:196:0x0325, B:202:0x0366, B:205:0x038f, B:209:0x03a3, B:213:0x03b0, B:214:0x03b6, B:216:0x03bc, B:218:0x03c3, B:219:0x03c7, B:227:0x03ec, B:231:0x0417, B:233:0x0422, B:234:0x0454, B:235:0x045f, B:237:0x0465, B:239:0x046c, B:240:0x0470, B:245:0x0489, B:252:0x049a, B:254:0x04c4, B:255:0x04d3, B:256:0x04de), top: B:268:0x00f2 }] */
    /* JADX WARN: Code duplicated, block: B:170:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:176:0x02c2 A[Catch: all -> 0x0130, Exception -> 0x02bc, OutOfMemoryError -> 0x02bf, TryCatch #0 {all -> 0x0130, blocks: (B:83:0x0105, B:92:0x013e, B:95:0x0145, B:106:0x016f, B:109:0x01a1, B:117:0x01cc, B:119:0x01e0, B:121:0x01e7, B:120:0x01e3, B:135:0x0206, B:137:0x021d, B:139:0x0244, B:141:0x024b, B:140:0x0247, B:164:0x0284, B:166:0x0297, B:168:0x02a0, B:180:0x02e4, B:182:0x0300, B:184:0x0307, B:183:0x0303, B:176:0x02c2, B:178:0x02de, B:196:0x0325, B:202:0x0366, B:205:0x038f, B:209:0x03a3, B:213:0x03b0, B:214:0x03b6, B:216:0x03bc, B:218:0x03c3, B:219:0x03c7, B:227:0x03ec, B:231:0x0417, B:233:0x0422, B:234:0x0454, B:235:0x045f, B:237:0x0465, B:239:0x046c, B:240:0x0470, B:245:0x0489, B:252:0x049a, B:254:0x04c4, B:255:0x04d3, B:256:0x04de), top: B:268:0x00f2 }] */
    /* JADX WARN: Code duplicated, block: B:178:0x02de A[Catch: all -> 0x0130, Exception -> 0x02bc, OutOfMemoryError -> 0x02bf, TryCatch #0 {all -> 0x0130, blocks: (B:83:0x0105, B:92:0x013e, B:95:0x0145, B:106:0x016f, B:109:0x01a1, B:117:0x01cc, B:119:0x01e0, B:121:0x01e7, B:120:0x01e3, B:135:0x0206, B:137:0x021d, B:139:0x0244, B:141:0x024b, B:140:0x0247, B:164:0x0284, B:166:0x0297, B:168:0x02a0, B:180:0x02e4, B:182:0x0300, B:184:0x0307, B:183:0x0303, B:176:0x02c2, B:178:0x02de, B:196:0x0325, B:202:0x0366, B:205:0x038f, B:209:0x03a3, B:213:0x03b0, B:214:0x03b6, B:216:0x03bc, B:218:0x03c3, B:219:0x03c7, B:227:0x03ec, B:231:0x0417, B:233:0x0422, B:234:0x0454, B:235:0x045f, B:237:0x0465, B:239:0x046c, B:240:0x0470, B:245:0x0489, B:252:0x049a, B:254:0x04c4, B:255:0x04d3, B:256:0x04de), top: B:268:0x00f2 }] */
    /* JADX WARN: Code duplicated, block: B:179:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:182:0x0300 A[Catch: all -> 0x0130, Exception -> 0x02bc, OutOfMemoryError -> 0x02bf, TryCatch #0 {all -> 0x0130, blocks: (B:83:0x0105, B:92:0x013e, B:95:0x0145, B:106:0x016f, B:109:0x01a1, B:117:0x01cc, B:119:0x01e0, B:121:0x01e7, B:120:0x01e3, B:135:0x0206, B:137:0x021d, B:139:0x0244, B:141:0x024b, B:140:0x0247, B:164:0x0284, B:166:0x0297, B:168:0x02a0, B:180:0x02e4, B:182:0x0300, B:184:0x0307, B:183:0x0303, B:176:0x02c2, B:178:0x02de, B:196:0x0325, B:202:0x0366, B:205:0x038f, B:209:0x03a3, B:213:0x03b0, B:214:0x03b6, B:216:0x03bc, B:218:0x03c3, B:219:0x03c7, B:227:0x03ec, B:231:0x0417, B:233:0x0422, B:234:0x0454, B:235:0x045f, B:237:0x0465, B:239:0x046c, B:240:0x0470, B:245:0x0489, B:252:0x049a, B:254:0x04c4, B:255:0x04d3, B:256:0x04de), top: B:268:0x00f2 }] */
    /* JADX WARN: Code duplicated, block: B:183:0x0303 A[Catch: all -> 0x0130, Exception -> 0x02bc, OutOfMemoryError -> 0x02bf, TryCatch #0 {all -> 0x0130, blocks: (B:83:0x0105, B:92:0x013e, B:95:0x0145, B:106:0x016f, B:109:0x01a1, B:117:0x01cc, B:119:0x01e0, B:121:0x01e7, B:120:0x01e3, B:135:0x0206, B:137:0x021d, B:139:0x0244, B:141:0x024b, B:140:0x0247, B:164:0x0284, B:166:0x0297, B:168:0x02a0, B:180:0x02e4, B:182:0x0300, B:184:0x0307, B:183:0x0303, B:176:0x02c2, B:178:0x02de, B:196:0x0325, B:202:0x0366, B:205:0x038f, B:209:0x03a3, B:213:0x03b0, B:214:0x03b6, B:216:0x03bc, B:218:0x03c3, B:219:0x03c7, B:227:0x03ec, B:231:0x0417, B:233:0x0422, B:234:0x0454, B:235:0x045f, B:237:0x0465, B:239:0x046c, B:240:0x0470, B:245:0x0489, B:252:0x049a, B:254:0x04c4, B:255:0x04d3, B:256:0x04de), top: B:268:0x00f2 }] */
    /* JADX WARN: Code duplicated, block: B:187:0x0313  */
    /* JADX WARN: Code duplicated, block: B:197:0x035c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:198:0x035e  */
    /* JADX WARN: Code duplicated, block: B:221:0x03e0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:222:0x03e2  */
    /* JADX WARN: Code duplicated, block: B:246:0x048e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:247:0x0490  */
    /* JADX WARN: Code duplicated, block: B:262:0x04fd  */
    /* JADX INFO: renamed from: b */
    public static zzajs m4151b(int i2, zzeu zzeuVar, boolean z, zzajo zzajoVar) {
        int iM6382h;
        int i3;
        int i4;
        boolean z2;
        boolean z3;
        boolean z4;
        zzajs zzajsVar;
        int i5;
        zzajs zzajjVar;
        zzajs zzajvVar;
        int i6;
        byte[] bArr;
        int iM4157h;
        String strM7119a;
        String strConcat;
        int iM4158i;
        byte[] bArrCopyOfRange;
        int iM6369K = zzeuVar.m6369K();
        int iM6369K2 = zzeuVar.m6369K();
        int iM6369K3 = zzeuVar.m6369K();
        int iM6369K4 = i2 >= 3 ? zzeuVar.m6369K() : 0;
        if (i2 == 4) {
            iM6382h = zzeuVar.m6382h();
            if (!z) {
                iM6382h = ((iM6382h >> 24) << 21) | (iM6382h & 255) | (((iM6382h >> 8) & 255) << 7) | (((iM6382h >> 16) & 255) << 14);
            }
        } else {
            iM6382h = i2 == 3 ? zzeuVar.m6382h() : zzeuVar.m6373O();
        }
        int iM6370L = i2 >= 3 ? zzeuVar.m6370L() : 0;
        if (iM6369K == 0 && iM6369K2 == 0 && iM6369K3 == 0 && iM6369K4 == 0 && iM6382h == 0 && iM6370L == 0) {
            zzeuVar.m6363E(zzeuVar.f14889c);
            return null;
        }
        int iM6362D = zzeuVar.m6362D() + iM6382h;
        String str = "Id3Decoder";
        if (iM6362D > zzeuVar.f14889c) {
            zzeh.m6211c("Id3Decoder", "Frame size exceeds remaining tag data");
            zzeuVar.m6363E(zzeuVar.f14889c);
            return null;
        }
        if (zzajoVar != null) {
            zzeuVar.m6363E(iM6362D);
            return null;
        }
        if (i2 == 3) {
            int i7 = iM6370L & 64;
            i3 = (iM6370L & 128) != 0 ? 1 : 0;
            z4 = false;
            z3 = i7 != 0;
            z2 = (iM6370L & 32) != 0;
            i4 = i3;
        } else if (i2 == 4) {
            boolean z5 = (iM6370L & 64) != 0;
            int i8 = (iM6370L & 8) != 0 ? 1 : 0;
            z3 = (iM6370L & 4) != 0;
            z4 = (iM6370L & 2) != 0;
            i4 = iM6370L & 1;
            int i9 = i8;
            z2 = z5;
            i3 = i9;
        } else {
            i3 = 0;
            i4 = 0;
            z2 = false;
            z3 = false;
            z4 = false;
        }
        if (i3 != 0 || z3) {
            zzeh.m6211c("Id3Decoder", "Skipping unsupported compressed or encrypted frame");
            zzeuVar.m6363E(iM6362D);
            return null;
        }
        if (z2) {
            zzeuVar.m6365G(1);
            iM6382h--;
        }
        if (i4 != 0) {
            zzeuVar.m6365G(4);
            iM6382h -= 4;
        }
        if (z4) {
            iM6382h = m4153d(iM6382h, zzeuVar);
        }
        try {
            try {
                if (iM6369K == 84 && iM6369K2 == 88 && iM6369K3 == 88 && (i2 == 2 || iM6369K4 == 88)) {
                    if (iM6382h <= 0) {
                        zzajjVar = null;
                    } else {
                        int iM6369K5 = zzeuVar.m6369K();
                        int i10 = iM6382h - 1;
                        byte[] bArr2 = new byte[i10];
                        zzeuVar.m6366H(bArr2, 0, i10);
                        int iM4156g = m4156g(bArr2, 0, iM6369K5);
                        zzajjVar = new zzajx("TXXX", new String(bArr2, 0, iM4156g, m4154e(iM6369K5)), m4152c(bArr2, iM6369K5, iM4156g + m4158i(iM6369K5)));
                    }
                    str = "Id3Decoder";
                } else {
                    if (iM6369K == 84) {
                        String strM4155f = m4155f(i2, 84, iM6369K2, iM6369K3, iM6369K4);
                        if (iM6382h > 0) {
                            int iM6369K6 = zzeuVar.m6369K();
                            int i11 = iM6382h - 1;
                            byte[] bArr3 = new byte[i11];
                            zzeuVar.m6366H(bArr3, 0, i11);
                            zzajjVar = new zzajx(strM4155f, null, m4152c(bArr3, iM6369K6, 0));
                        }
                        str = "Id3Decoder";
                    } else {
                        if (iM6369K == 87) {
                            if (iM6369K2 != 88 || iM6369K3 != 88 || (i2 != 2 && iM6369K4 != 88)) {
                                i5 = 87;
                            } else if (iM6382h > 0) {
                                int iM6369K7 = zzeuVar.m6369K();
                                int i12 = iM6382h - 1;
                                byte[] bArr4 = new byte[i12];
                                zzeuVar.m6366H(bArr4, 0, i12);
                                int iM4156g2 = m4156g(bArr4, 0, iM6369K7);
                                String str2 = new String(bArr4, 0, iM4156g2, m4154e(iM6369K7));
                                int iM4158i2 = iM4156g2 + m4158i(iM6369K7);
                                zzajjVar = new zzajy("WXXX", str2, m4159j(bArr4, iM4158i2, m4157h(iM4158i2, bArr4), StandardCharsets.ISO_8859_1));
                            }
                            str = "Id3Decoder";
                        } else {
                            i5 = iM6369K;
                        }
                        if (i5 == 87) {
                            String strM4155f2 = m4155f(i2, 87, iM6369K2, iM6369K3, iM6369K4);
                            byte[] bArr5 = new byte[iM6382h];
                            zzeuVar.m6366H(bArr5, 0, iM6382h);
                            zzajjVar = new zzajy(strM4155f2, null, new String(bArr5, 0, m4157h(0, bArr5), StandardCharsets.ISO_8859_1));
                        } else {
                            if (i5 == 80) {
                                if (iM6369K2 == 82 && iM6369K3 == 73 && iM6369K4 == 86) {
                                    byte[] bArr6 = new byte[iM6382h];
                                    zzeuVar.m6366H(bArr6, 0, iM6382h);
                                    int iM4157h2 = m4157h(0, bArr6);
                                    String str3 = new String(bArr6, 0, iM4157h2, StandardCharsets.ISO_8859_1);
                                    int i13 = iM4157h2 + 1;
                                    zzajjVar = new zzajw(str3, iM6382h <= i13 ? zzfm.f16092b : Arrays.copyOfRange(bArr6, i13, iM6382h));
                                } else {
                                    i5 = 80;
                                }
                            }
                            try {
                                if (i5 != 71) {
                                    try {
                                        if (i2 == 2) {
                                            if (i5 != 80 && iM6369K2 == 73 && iM6369K3 == 67) {
                                                int iM6369K8 = zzeuVar.m6369K();
                                                Charset charsetM4154e = m4154e(iM6369K8);
                                                i6 = iM6382h - 1;
                                                bArr = new byte[i6];
                                                zzeuVar.m6366H(bArr, 0, i6);
                                                if (i2 == 2) {
                                                    iM6369K = iM6369K;
                                                    strConcat = "image/".concat(String.valueOf(zzgsz.m7119a(new String(bArr, 0, 3, StandardCharsets.ISO_8859_1))));
                                                    if ("image/jpg".equals(strConcat)) {
                                                        strConcat = "image/jpeg";
                                                    }
                                                    iM4157h = 2;
                                                } else {
                                                    iM6369K = iM6369K;
                                                    iM4157h = m4157h(0, bArr);
                                                    strM7119a = zzgsz.m7119a(new String(bArr, 0, iM4157h, StandardCharsets.ISO_8859_1));
                                                    if (strM7119a.indexOf(47) == -1) {
                                                        strConcat = "image/".concat(strM7119a);
                                                    } else {
                                                        strConcat = strM7119a;
                                                    }
                                                }
                                                int i14 = bArr[iM4157h + 1] & 255;
                                                int i15 = iM4157h + 2;
                                                int iM4156g3 = m4156g(bArr, i15, iM6369K8);
                                                String str4 = new String(bArr, i15, iM4156g3 - i15, charsetM4154e);
                                                iM4158i = iM4156g3 + m4158i(iM6369K8);
                                                if (i6 <= iM4158i) {
                                                    bArrCopyOfRange = zzfm.f16092b;
                                                } else {
                                                    bArrCopyOfRange = Arrays.copyOfRange(bArr, iM4158i, i6);
                                                }
                                                zzajjVar = new zzaji(strConcat, str4, i14, bArrCopyOfRange);
                                            } else {
                                                iM6369K = iM6369K;
                                                if (i5 == 67 || iM6369K2 != 79 || iM6369K3 != 77 || (iM6369K4 != 77 && i2 != 2)) {
                                                    if (i5 != 67 && iM6369K2 == 72 && iM6369K3 == 65 && iM6369K4 == 80) {
                                                        int iM6362D2 = zzeuVar.m6362D();
                                                        int iM4157h3 = m4157h(iM6362D2, zzeuVar.m6364F());
                                                        String str5 = new String(zzeuVar.m6364F(), iM6362D2, iM4157h3 - iM6362D2, StandardCharsets.ISO_8859_1);
                                                        zzeuVar.m6363E(iM4157h3 + 1);
                                                        int iM6376b = zzeuVar.m6376b();
                                                        int iM6376b2 = zzeuVar.m6376b();
                                                        if (iM6376b > iM6376b2) {
                                                            zzajjVar = null;
                                                        } else {
                                                            long jM6374P = zzeuVar.m6374P();
                                                            long j2 = jM6374P == 4294967295L ? -1L : jM6374P;
                                                            long jM6374P2 = zzeuVar.m6374P();
                                                            long j3 = jM6374P2 == 4294967295L ? -1L : jM6374P2;
                                                            ArrayList arrayList = new ArrayList();
                                                            int i16 = iM6362D2 + iM6382h;
                                                            while (zzeuVar.m6362D() < i16) {
                                                                zzajs zzajsVarM4151b = m4151b(i2, zzeuVar, z, null);
                                                                if (zzajsVarM4151b != null) {
                                                                    arrayList.add(zzajsVarM4151b);
                                                                }
                                                            }
                                                            zzajvVar = new zzajk(str5, iM6376b, iM6376b2, j2, j3, (zzajs[]) arrayList.toArray(new zzajs[0]));
                                                        }
                                                    } else if (i5 != 67 && iM6369K2 == 84 && iM6369K3 == 79 && iM6369K4 == 67) {
                                                        int iM6362D3 = zzeuVar.m6362D();
                                                        int iM4157h4 = m4157h(iM6362D3, zzeuVar.m6364F());
                                                        String str6 = new String(zzeuVar.m6364F(), iM6362D3, iM4157h4 - iM6362D3, StandardCharsets.ISO_8859_1);
                                                        zzeuVar.m6363E(iM4157h4 + 1);
                                                        int iM6369K9 = zzeuVar.m6369K();
                                                        boolean z6 = (iM6369K9 & 2) != 0;
                                                        int i17 = iM6369K9 & 1;
                                                        int iM6369K10 = zzeuVar.m6369K();
                                                        String[] strArr = new String[iM6369K10];
                                                        int i18 = 0;
                                                        while (i18 < iM6369K10) {
                                                            int iM6362D4 = zzeuVar.m6362D();
                                                            int iM4157h5 = m4157h(iM6362D4, zzeuVar.m6364F());
                                                            strArr[i18] = new String(zzeuVar.m6364F(), iM6362D4, iM4157h5 - iM6362D4, StandardCharsets.ISO_8859_1);
                                                            zzeuVar.m6363E(iM4157h5 + 1);
                                                            i18++;
                                                            iM6362D3 = iM6362D3;
                                                            iM6369K10 = iM6369K10;
                                                            str6 = str6;
                                                        }
                                                        int i19 = iM6362D3;
                                                        String str7 = str6;
                                                        ArrayList arrayList2 = new ArrayList();
                                                        int i20 = i19 + iM6382h;
                                                        while (zzeuVar.m6362D() < i20) {
                                                            zzajs zzajsVarM4151b2 = m4151b(i2, zzeuVar, z, null);
                                                            if (zzajsVarM4151b2 != null) {
                                                                arrayList2.add(zzajsVarM4151b2);
                                                            }
                                                        }
                                                        zzajvVar = new zzajl(str7, z6, 1 == i17, strArr, (zzajs[]) arrayList2.toArray(new zzajs[0]));
                                                    } else if (i5 != 77 && iM6369K2 == 76 && iM6369K3 == 76 && iM6369K4 == 84) {
                                                        int iM6370L2 = zzeuVar.m6370L();
                                                        int iM6373O = zzeuVar.m6373O();
                                                        int iM6373O2 = zzeuVar.m6373O();
                                                        int iM6369K11 = zzeuVar.m6369K();
                                                        int iM6369K12 = zzeuVar.m6369K();
                                                        zzet zzetVar = new zzet();
                                                        zzetVar.m6338a(zzeuVar);
                                                        int i21 = ((iM6382h - 10) * 8) / (iM6369K11 + iM6369K12);
                                                        int[] iArr = new int[i21];
                                                        int[] iArr2 = new int[i21];
                                                        for (int i22 = 0; i22 < i21; i22++) {
                                                            int iM6345h = zzetVar.m6345h(iM6369K11);
                                                            int iM6345h2 = zzetVar.m6345h(iM6369K12);
                                                            iArr[i22] = iM6345h;
                                                            iArr2[i22] = iM6345h2;
                                                        }
                                                        zzajvVar = new zzajv(iM6370L2, iM6373O, iArr, iArr2, iM6373O2);
                                                    } else {
                                                        String strM4155f3 = m4155f(i2, i5, iM6369K2, iM6369K3, iM6369K4);
                                                        byte[] bArr7 = new byte[iM6382h];
                                                        zzeuVar.m6366H(bArr7, 0, iM6382h);
                                                        zzajjVar = new zzajj(strM4155f3, bArr7);
                                                    }
                                                    zzajjVar = zzajvVar;
                                                } else if (iM6382h < 4) {
                                                    zzajjVar = null;
                                                } else {
                                                    int iM6369K13 = zzeuVar.m6369K();
                                                    Charset charsetM4154e2 = m4154e(iM6369K13);
                                                    byte[] bArr8 = new byte[3];
                                                    zzeuVar.m6366H(bArr8, 0, 3);
                                                    String str8 = new String(bArr8, 0, 3);
                                                    int i23 = iM6382h - 4;
                                                    byte[] bArr9 = new byte[i23];
                                                    zzeuVar.m6366H(bArr9, 0, i23);
                                                    int iM4156g4 = m4156g(bArr9, 0, iM6369K13);
                                                    String str9 = new String(bArr9, 0, iM4156g4, charsetM4154e2);
                                                    int iM4158i3 = iM4156g4 + m4158i(iM6369K13);
                                                    zzajjVar = new zzajm(str8, str9, m4159j(bArr9, iM4158i3, m4156g(bArr9, iM4158i3, iM6369K13), charsetM4154e2));
                                                }
                                            }
                                        } else if (i5 != 65 && iM6369K2 == 80 && iM6369K3 == 73 && iM6369K4 == 67) {
                                            int iM6369K14 = zzeuVar.m6369K();
                                            Charset charsetM4154e3 = m4154e(iM6369K14);
                                            i6 = iM6382h - 1;
                                            bArr = new byte[i6];
                                            zzeuVar.m6366H(bArr, 0, i6);
                                            if (i2 == 2) {
                                                iM6369K = iM6369K;
                                                strConcat = "image/".concat(String.valueOf(zzgsz.m7119a(new String(bArr, 0, 3, StandardCharsets.ISO_8859_1))));
                                                if ("image/jpg".equals(strConcat)) {
                                                    strConcat = "image/jpeg";
                                                }
                                                iM4157h = 2;
                                            } else {
                                                iM6369K = iM6369K;
                                                iM4157h = m4157h(0, bArr);
                                                strM7119a = zzgsz.m7119a(new String(bArr, 0, iM4157h, StandardCharsets.ISO_8859_1));
                                                if (strM7119a.indexOf(47) == -1) {
                                                    strConcat = "image/".concat(strM7119a);
                                                } else {
                                                    strConcat = strM7119a;
                                                }
                                            }
                                            int i110 = bArr[iM4157h + 1] & 255;
                                            int i111 = iM4157h + 2;
                                            int iM4156g5 = m4156g(bArr, i111, iM6369K14);
                                            String str10 = new String(bArr, i111, iM4156g5 - i111, charsetM4154e3);
                                            iM4158i = iM4156g5 + m4158i(iM6369K14);
                                            if (i6 <= iM4158i) {
                                                bArrCopyOfRange = zzfm.f16092b;
                                            } else {
                                                bArrCopyOfRange = Arrays.copyOfRange(bArr, iM4158i, i6);
                                            }
                                            zzajjVar = new zzaji(strConcat, str10, i110, bArrCopyOfRange);
                                        } else {
                                            iM6369K = iM6369K;
                                            if (i5 == 67) {
                                                if (i5 != 67) {
                                                    if (i5 != 67) {
                                                        if (i5 != 77) {
                                                        }
                                                        String strM4155f4 = m4155f(i2, i5, iM6369K2, iM6369K3, iM6369K4);
                                                        byte[] bArr10 = new byte[iM6382h];
                                                        zzeuVar.m6366H(bArr10, 0, iM6382h);
                                                        zzajjVar = new zzajj(strM4155f4, bArr10);
                                                    } else {
                                                        if (i5 != 77) {
                                                        }
                                                        String strM4155f5 = m4155f(i2, i5, iM6369K2, iM6369K3, iM6369K4);
                                                        byte[] bArr11 = new byte[iM6382h];
                                                        zzeuVar.m6366H(bArr11, 0, iM6382h);
                                                        zzajjVar = new zzajj(strM4155f5, bArr11);
                                                    }
                                                } else if (i5 != 67) {
                                                    if (i5 != 77) {
                                                    }
                                                    String strM4155f6 = m4155f(i2, i5, iM6369K2, iM6369K3, iM6369K4);
                                                    byte[] bArr12 = new byte[iM6382h];
                                                    zzeuVar.m6366H(bArr12, 0, iM6382h);
                                                    zzajjVar = new zzajj(strM4155f6, bArr12);
                                                } else {
                                                    if (i5 != 77) {
                                                    }
                                                    String strM4155f7 = m4155f(i2, i5, iM6369K2, iM6369K3, iM6369K4);
                                                    byte[] bArr13 = new byte[iM6382h];
                                                    zzeuVar.m6366H(bArr13, 0, iM6382h);
                                                    zzajjVar = new zzajj(strM4155f7, bArr13);
                                                }
                                            } else if (i5 != 67) {
                                                if (i5 != 67) {
                                                    if (i5 != 77) {
                                                    }
                                                    String strM4155f8 = m4155f(i2, i5, iM6369K2, iM6369K3, iM6369K4);
                                                    byte[] bArr14 = new byte[iM6382h];
                                                    zzeuVar.m6366H(bArr14, 0, iM6382h);
                                                    zzajjVar = new zzajj(strM4155f8, bArr14);
                                                } else {
                                                    if (i5 != 77) {
                                                    }
                                                    String strM4155f9 = m4155f(i2, i5, iM6369K2, iM6369K3, iM6369K4);
                                                    byte[] bArr15 = new byte[iM6382h];
                                                    zzeuVar.m6366H(bArr15, 0, iM6382h);
                                                    zzajjVar = new zzajj(strM4155f9, bArr15);
                                                }
                                            } else if (i5 != 67) {
                                                if (i5 != 77) {
                                                }
                                                String strM4155f10 = m4155f(i2, i5, iM6369K2, iM6369K3, iM6369K4);
                                                byte[] bArr16 = new byte[iM6382h];
                                                zzeuVar.m6366H(bArr16, 0, iM6382h);
                                                zzajjVar = new zzajj(strM4155f10, bArr16);
                                            } else {
                                                if (i5 != 77) {
                                                }
                                                String strM4155f11 = m4155f(i2, i5, iM6369K2, iM6369K3, iM6369K4);
                                                byte[] bArr17 = new byte[iM6382h];
                                                zzeuVar.m6366H(bArr17, 0, iM6382h);
                                                zzajjVar = new zzajj(strM4155f11, bArr17);
                                            }
                                        }
                                    } catch (Exception e) {
                                        e = e;
                                        zzeuVar.m6363E(iM6362D);
                                        zzajsVar = null;
                                    } catch (OutOfMemoryError e2) {
                                        e = e2;
                                        zzeuVar.m6363E(iM6362D);
                                        zzajsVar = null;
                                    }
                                } else if (iM6369K2 != 69 || iM6369K3 != 79) {
                                    i5 = 71;
                                    if (i2 == 2) {
                                        if (i5 != 80) {
                                        }
                                        iM6369K = iM6369K;
                                        if (i5 == 67) {
                                            if (i5 != 67) {
                                                if (i5 != 67) {
                                                    if (i5 != 77) {
                                                    }
                                                    String strM4155f12 = m4155f(i2, i5, iM6369K2, iM6369K3, iM6369K4);
                                                    byte[] bArr18 = new byte[iM6382h];
                                                    zzeuVar.m6366H(bArr18, 0, iM6382h);
                                                    zzajjVar = new zzajj(strM4155f12, bArr18);
                                                } else {
                                                    if (i5 != 77) {
                                                    }
                                                    String strM4155f13 = m4155f(i2, i5, iM6369K2, iM6369K3, iM6369K4);
                                                    byte[] bArr19 = new byte[iM6382h];
                                                    zzeuVar.m6366H(bArr19, 0, iM6382h);
                                                    zzajjVar = new zzajj(strM4155f13, bArr19);
                                                }
                                            } else if (i5 != 67) {
                                                if (i5 != 77) {
                                                }
                                                String strM4155f14 = m4155f(i2, i5, iM6369K2, iM6369K3, iM6369K4);
                                                byte[] bArr110 = new byte[iM6382h];
                                                zzeuVar.m6366H(bArr110, 0, iM6382h);
                                                zzajjVar = new zzajj(strM4155f14, bArr110);
                                            } else {
                                                if (i5 != 77) {
                                                }
                                                String strM4155f15 = m4155f(i2, i5, iM6369K2, iM6369K3, iM6369K4);
                                                byte[] bArr111 = new byte[iM6382h];
                                                zzeuVar.m6366H(bArr111, 0, iM6382h);
                                                zzajjVar = new zzajj(strM4155f15, bArr111);
                                            }
                                        } else if (i5 != 67) {
                                            if (i5 != 67) {
                                                if (i5 != 77) {
                                                }
                                                String strM4155f16 = m4155f(i2, i5, iM6369K2, iM6369K3, iM6369K4);
                                                byte[] bArr112 = new byte[iM6382h];
                                                zzeuVar.m6366H(bArr112, 0, iM6382h);
                                                zzajjVar = new zzajj(strM4155f16, bArr112);
                                            } else {
                                                if (i5 != 77) {
                                                }
                                                String strM4155f17 = m4155f(i2, i5, iM6369K2, iM6369K3, iM6369K4);
                                                byte[] bArr113 = new byte[iM6382h];
                                                zzeuVar.m6366H(bArr113, 0, iM6382h);
                                                zzajjVar = new zzajj(strM4155f17, bArr113);
                                            }
                                        } else if (i5 != 67) {
                                            if (i5 != 77) {
                                            }
                                            String strM4155f18 = m4155f(i2, i5, iM6369K2, iM6369K3, iM6369K4);
                                            byte[] bArr114 = new byte[iM6382h];
                                            zzeuVar.m6366H(bArr114, 0, iM6382h);
                                            zzajjVar = new zzajj(strM4155f18, bArr114);
                                        } else {
                                            if (i5 != 77) {
                                            }
                                            String strM4155f19 = m4155f(i2, i5, iM6369K2, iM6369K3, iM6369K4);
                                            byte[] bArr115 = new byte[iM6382h];
                                            zzeuVar.m6366H(bArr115, 0, iM6382h);
                                            zzajjVar = new zzajj(strM4155f19, bArr115);
                                        }
                                    } else {
                                        if (i5 != 65) {
                                        }
                                        iM6369K = iM6369K;
                                        if (i5 == 67) {
                                            if (i5 != 67) {
                                                if (i5 != 67) {
                                                    if (i5 != 77) {
                                                    }
                                                    String strM4155f110 = m4155f(i2, i5, iM6369K2, iM6369K3, iM6369K4);
                                                    byte[] bArr116 = new byte[iM6382h];
                                                    zzeuVar.m6366H(bArr116, 0, iM6382h);
                                                    zzajjVar = new zzajj(strM4155f110, bArr116);
                                                } else {
                                                    if (i5 != 77) {
                                                    }
                                                    String strM4155f111 = m4155f(i2, i5, iM6369K2, iM6369K3, iM6369K4);
                                                    byte[] bArr117 = new byte[iM6382h];
                                                    zzeuVar.m6366H(bArr117, 0, iM6382h);
                                                    zzajjVar = new zzajj(strM4155f111, bArr117);
                                                }
                                            } else if (i5 != 67) {
                                                if (i5 != 77) {
                                                }
                                                String strM4155f112 = m4155f(i2, i5, iM6369K2, iM6369K3, iM6369K4);
                                                byte[] bArr118 = new byte[iM6382h];
                                                zzeuVar.m6366H(bArr118, 0, iM6382h);
                                                zzajjVar = new zzajj(strM4155f112, bArr118);
                                            } else {
                                                if (i5 != 77) {
                                                }
                                                String strM4155f113 = m4155f(i2, i5, iM6369K2, iM6369K3, iM6369K4);
                                                byte[] bArr119 = new byte[iM6382h];
                                                zzeuVar.m6366H(bArr119, 0, iM6382h);
                                                zzajjVar = new zzajj(strM4155f113, bArr119);
                                            }
                                        } else if (i5 != 67) {
                                            if (i5 != 67) {
                                                if (i5 != 77) {
                                                }
                                                String strM4155f114 = m4155f(i2, i5, iM6369K2, iM6369K3, iM6369K4);
                                                byte[] bArr1110 = new byte[iM6382h];
                                                zzeuVar.m6366H(bArr1110, 0, iM6382h);
                                                zzajjVar = new zzajj(strM4155f114, bArr1110);
                                            } else {
                                                if (i5 != 77) {
                                                }
                                                String strM4155f115 = m4155f(i2, i5, iM6369K2, iM6369K3, iM6369K4);
                                                byte[] bArr1111 = new byte[iM6382h];
                                                zzeuVar.m6366H(bArr1111, 0, iM6382h);
                                                zzajjVar = new zzajj(strM4155f115, bArr1111);
                                            }
                                        } else if (i5 != 67) {
                                            if (i5 != 77) {
                                            }
                                            String strM4155f116 = m4155f(i2, i5, iM6369K2, iM6369K3, iM6369K4);
                                            byte[] bArr1112 = new byte[iM6382h];
                                            zzeuVar.m6366H(bArr1112, 0, iM6382h);
                                            zzajjVar = new zzajj(strM4155f116, bArr1112);
                                        } else {
                                            if (i5 != 77) {
                                            }
                                            String strM4155f117 = m4155f(i2, i5, iM6369K2, iM6369K3, iM6369K4);
                                            byte[] bArr1113 = new byte[iM6382h];
                                            zzeuVar.m6366H(bArr1113, 0, iM6382h);
                                            zzajjVar = new zzajj(strM4155f117, bArr1113);
                                        }
                                    }
                                } else if (iM6369K4 == 66 || i2 == 2) {
                                    try {
                                        int iM6369K15 = zzeuVar.m6369K();
                                        Charset charsetM4154e4 = m4154e(iM6369K15);
                                        int i24 = iM6382h - 1;
                                        byte[] bArr20 = new byte[i24];
                                        zzeuVar.m6366H(bArr20, 0, i24);
                                        int iM4157h6 = m4157h(0, bArr20);
                                        str = "Id3Decoder";
                                        String strM4356h = zzas.m4356h(new String(bArr20, 0, iM4157h6, StandardCharsets.ISO_8859_1));
                                        int i25 = iM4157h6 + 1;
                                        int iM4156g6 = m4156g(bArr20, i25, iM6369K15);
                                        String strM4159j = m4159j(bArr20, i25, iM4156g6, charsetM4154e4);
                                        int iM4158i4 = iM4156g6 + m4158i(iM6369K15);
                                        int iM4156g7 = m4156g(bArr20, iM4158i4, iM6369K15);
                                        String strM4159j2 = m4159j(bArr20, iM4158i4, iM4156g7, charsetM4154e4);
                                        int iM4158i5 = iM4156g7 + m4158i(iM6369K15);
                                        iM6369K = iM6369K;
                                        zzajjVar = new zzajn(strM4356h, i24 <= iM4158i5 ? zzfm.f16092b : Arrays.copyOfRange(bArr20, iM4158i5, i24), strM4159j, strM4159j2);
                                    } catch (Exception e3) {
                                        e = e3;
                                        str = "Id3Decoder";
                                        zzeuVar.m6363E(iM6362D);
                                        zzajsVar = null;
                                    } catch (OutOfMemoryError e4) {
                                        e = e4;
                                        str = "Id3Decoder";
                                        zzeuVar.m6363E(iM6362D);
                                        zzajsVar = null;
                                    }
                                } else {
                                    i5 = 71;
                                    if (i2 == 2) {
                                        if (i5 != 80) {
                                        }
                                        iM6369K = iM6369K;
                                        if (i5 == 67) {
                                            if (i5 != 67) {
                                                if (i5 != 67) {
                                                    if (i5 != 77) {
                                                    }
                                                    String strM4155f118 = m4155f(i2, i5, iM6369K2, iM6369K3, iM6369K4);
                                                    byte[] bArr1114 = new byte[iM6382h];
                                                    zzeuVar.m6366H(bArr1114, 0, iM6382h);
                                                    zzajjVar = new zzajj(strM4155f118, bArr1114);
                                                } else {
                                                    if (i5 != 77) {
                                                    }
                                                    String strM4155f119 = m4155f(i2, i5, iM6369K2, iM6369K3, iM6369K4);
                                                    byte[] bArr1115 = new byte[iM6382h];
                                                    zzeuVar.m6366H(bArr1115, 0, iM6382h);
                                                    zzajjVar = new zzajj(strM4155f119, bArr1115);
                                                }
                                            } else if (i5 != 67) {
                                                if (i5 != 77) {
                                                }
                                                String strM4155f1110 = m4155f(i2, i5, iM6369K2, iM6369K3, iM6369K4);
                                                byte[] bArr1116 = new byte[iM6382h];
                                                zzeuVar.m6366H(bArr1116, 0, iM6382h);
                                                zzajjVar = new zzajj(strM4155f1110, bArr1116);
                                            } else {
                                                if (i5 != 77) {
                                                }
                                                String strM4155f1111 = m4155f(i2, i5, iM6369K2, iM6369K3, iM6369K4);
                                                byte[] bArr1117 = new byte[iM6382h];
                                                zzeuVar.m6366H(bArr1117, 0, iM6382h);
                                                zzajjVar = new zzajj(strM4155f1111, bArr1117);
                                            }
                                        } else if (i5 != 67) {
                                            if (i5 != 67) {
                                                if (i5 != 77) {
                                                }
                                                String strM4155f1112 = m4155f(i2, i5, iM6369K2, iM6369K3, iM6369K4);
                                                byte[] bArr1118 = new byte[iM6382h];
                                                zzeuVar.m6366H(bArr1118, 0, iM6382h);
                                                zzajjVar = new zzajj(strM4155f1112, bArr1118);
                                            } else {
                                                if (i5 != 77) {
                                                }
                                                String strM4155f1113 = m4155f(i2, i5, iM6369K2, iM6369K3, iM6369K4);
                                                byte[] bArr1119 = new byte[iM6382h];
                                                zzeuVar.m6366H(bArr1119, 0, iM6382h);
                                                zzajjVar = new zzajj(strM4155f1113, bArr1119);
                                            }
                                        } else if (i5 != 67) {
                                            if (i5 != 77) {
                                            }
                                            String strM4155f1114 = m4155f(i2, i5, iM6369K2, iM6369K3, iM6369K4);
                                            byte[] bArr11110 = new byte[iM6382h];
                                            zzeuVar.m6366H(bArr11110, 0, iM6382h);
                                            zzajjVar = new zzajj(strM4155f1114, bArr11110);
                                        } else {
                                            if (i5 != 77) {
                                            }
                                            String strM4155f1115 = m4155f(i2, i5, iM6369K2, iM6369K3, iM6369K4);
                                            byte[] bArr11111 = new byte[iM6382h];
                                            zzeuVar.m6366H(bArr11111, 0, iM6382h);
                                            zzajjVar = new zzajj(strM4155f1115, bArr11111);
                                        }
                                    } else {
                                        if (i5 != 65) {
                                        }
                                        iM6369K = iM6369K;
                                        if (i5 == 67) {
                                            if (i5 != 67) {
                                                if (i5 != 67) {
                                                    if (i5 != 77) {
                                                    }
                                                    String strM4155f1116 = m4155f(i2, i5, iM6369K2, iM6369K3, iM6369K4);
                                                    byte[] bArr11112 = new byte[iM6382h];
                                                    zzeuVar.m6366H(bArr11112, 0, iM6382h);
                                                    zzajjVar = new zzajj(strM4155f1116, bArr11112);
                                                } else {
                                                    if (i5 != 77) {
                                                    }
                                                    String strM4155f1117 = m4155f(i2, i5, iM6369K2, iM6369K3, iM6369K4);
                                                    byte[] bArr11113 = new byte[iM6382h];
                                                    zzeuVar.m6366H(bArr11113, 0, iM6382h);
                                                    zzajjVar = new zzajj(strM4155f1117, bArr11113);
                                                }
                                            } else if (i5 != 67) {
                                                if (i5 != 77) {
                                                }
                                                String strM4155f1118 = m4155f(i2, i5, iM6369K2, iM6369K3, iM6369K4);
                                                byte[] bArr11114 = new byte[iM6382h];
                                                zzeuVar.m6366H(bArr11114, 0, iM6382h);
                                                zzajjVar = new zzajj(strM4155f1118, bArr11114);
                                            } else {
                                                if (i5 != 77) {
                                                }
                                                String strM4155f1119 = m4155f(i2, i5, iM6369K2, iM6369K3, iM6369K4);
                                                byte[] bArr11115 = new byte[iM6382h];
                                                zzeuVar.m6366H(bArr11115, 0, iM6382h);
                                                zzajjVar = new zzajj(strM4155f1119, bArr11115);
                                            }
                                        } else if (i5 != 67) {
                                            if (i5 != 67) {
                                                if (i5 != 77) {
                                                }
                                                String strM4155f11110 = m4155f(i2, i5, iM6369K2, iM6369K3, iM6369K4);
                                                byte[] bArr11116 = new byte[iM6382h];
                                                zzeuVar.m6366H(bArr11116, 0, iM6382h);
                                                zzajjVar = new zzajj(strM4155f11110, bArr11116);
                                            } else {
                                                if (i5 != 77) {
                                                }
                                                String strM4155f11111 = m4155f(i2, i5, iM6369K2, iM6369K3, iM6369K4);
                                                byte[] bArr11117 = new byte[iM6382h];
                                                zzeuVar.m6366H(bArr11117, 0, iM6382h);
                                                zzajjVar = new zzajj(strM4155f11111, bArr11117);
                                            }
                                        } else if (i5 != 67) {
                                            if (i5 != 77) {
                                            }
                                            String strM4155f11112 = m4155f(i2, i5, iM6369K2, iM6369K3, iM6369K4);
                                            byte[] bArr11118 = new byte[iM6382h];
                                            zzeuVar.m6366H(bArr11118, 0, iM6382h);
                                            zzajjVar = new zzajj(strM4155f11112, bArr11118);
                                        } else {
                                            if (i5 != 77) {
                                            }
                                            String strM4155f11113 = m4155f(i2, i5, iM6369K2, iM6369K3, iM6369K4);
                                            byte[] bArr11119 = new byte[iM6382h];
                                            zzeuVar.m6366H(bArr11119, 0, iM6382h);
                                            zzajjVar = new zzajj(strM4155f11113, bArr11119);
                                        }
                                    }
                                }
                            } catch (Exception e5) {
                                e = e5;
                            } catch (OutOfMemoryError e6) {
                                e = e6;
                            }
                        }
                        str = "Id3Decoder";
                    }
                    zzajjVar = null;
                    str = "Id3Decoder";
                }
                zzeuVar.m6363E(iM6362D);
                zzajsVar = zzajjVar;
                e = null;
            } catch (Throwable th) {
                zzeuVar.m6363E(iM6362D);
                throw th;
            }
        } catch (Exception e7) {
            e = e7;
            str = "Id3Decoder";
            zzeuVar.m6363E(iM6362D);
            zzajsVar = null;
            if (zzajsVar == null) {
                String strM4155f20 = m4155f(i2, iM6369K, iM6369K2, iM6369K3, iM6369K4);
                StringBuilder sb = new StringBuilder(strM4155f20.length() + 39 + String.valueOf(iM6382h).length());
                sb.append("Failed to decode frame: id=");
                sb.append(strM4155f20);
                sb.append(", frameSize=");
                sb.append(iM6382h);
                zzeh.m6212d(str, sb.toString(), e);
            }
            return zzajsVar;
        } catch (OutOfMemoryError e8) {
            e = e8;
            str = "Id3Decoder";
            zzeuVar.m6363E(iM6362D);
            zzajsVar = null;
            if (zzajsVar == null) {
                String strM4155f21 = m4155f(i2, iM6369K, iM6369K2, iM6369K3, iM6369K4);
                StringBuilder sb2 = new StringBuilder(strM4155f21.length() + 39 + String.valueOf(iM6382h).length());
                sb2.append("Failed to decode frame: id=");
                sb2.append(strM4155f21);
                sb2.append(", frameSize=");
                sb2.append(iM6382h);
                zzeh.m6212d(str, sb2.toString(), e);
            }
            return zzajsVar;
        }
        if (zzajsVar == null) {
            String strM4155f22 = m4155f(i2, iM6369K, iM6369K2, iM6369K3, iM6369K4);
            StringBuilder sb3 = new StringBuilder(strM4155f22.length() + 39 + String.valueOf(iM6382h).length());
            sb3.append("Failed to decode frame: id=");
            sb3.append(strM4155f22);
            sb3.append(", frameSize=");
            sb3.append(iM6382h);
            zzeh.m6212d(str, sb3.toString(), e);
        }
        return zzajsVar;
    }

    /* JADX INFO: renamed from: c */
    public static zzgwt m4152c(byte[] bArr, int i2, int i3) {
        if (i3 >= bArr.length) {
            return zzgwt.m7216n("");
        }
        zzgzi zzgziVar = zzgwt.f18303t;
        zzgwq zzgwqVar = new zzgwq();
        int iM4156g = m4156g(bArr, i3, i2);
        while (i3 < iM4156g) {
            zzgwqVar.m7203c(new String(bArr, i3, iM4156g - i3, m4154e(i2)));
            i3 = m4158i(i2) + iM4156g;
            iM4156g = m4156g(bArr, i3, i2);
        }
        zzgwt zzgwtVarM7214f = zzgwqVar.m7214f();
        return zzgwtVarM7214f.isEmpty() ? zzgwt.m7216n("") : zzgwtVarM7214f;
    }

    /* JADX INFO: renamed from: d */
    public static int m4153d(int i2, zzeu zzeuVar) {
        byte[] bArr = zzeuVar.f14887a;
        int i3 = zzeuVar.f14888b;
        int i4 = i3;
        while (true) {
            int i5 = i4 + 1;
            if (i5 >= i3 + i2) {
                return i2;
            }
            if ((bArr[i4] & 255) == 255 && bArr[i5] == 0) {
                System.arraycopy(bArr, i4 + 2, bArr, i5, (i2 - (i4 - i3)) - 2);
                i2--;
            }
            i4 = i5;
        }
    }

    /* JADX INFO: renamed from: e */
    public static Charset m4154e(int i2) {
        if (i2 == 1) {
            return StandardCharsets.UTF_16;
        }
        if (i2 != 2) {
            return i2 != 3 ? StandardCharsets.ISO_8859_1 : StandardCharsets.UTF_8;
        }
        return StandardCharsets.UTF_16BE;
    }

    /* JADX INFO: renamed from: f */
    public static String m4155f(int i2, int i3, int i4, int i5, int i6) {
        return i2 == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6));
    }

    /* JADX INFO: renamed from: g */
    public static int m4156g(byte[] bArr, int i2, int i3) {
        int iM4157h = m4157h(i2, bArr);
        if (i3 == 0 || i3 == 3) {
            return iM4157h;
        }
        while (true) {
            int length = bArr.length;
            if (iM4157h >= length - 1) {
                return length;
            }
            int i4 = iM4157h + 1;
            if ((iM4157h - i2) % 2 == 0 && bArr[i4] == 0) {
                return iM4157h;
            }
            iM4157h = m4157h(i4, bArr);
        }
    }

    /* JADX INFO: renamed from: h */
    public static int m4157h(int i2, byte[] bArr) {
        while (true) {
            int length = bArr.length;
            if (i2 >= length) {
                return length;
            }
            if (bArr[i2] == 0) {
                return i2;
            }
            i2++;
        }
    }

    /* JADX INFO: renamed from: i */
    public static int m4158i(int i2) {
        return (i2 == 0 || i2 == 3) ? 1 : 2;
    }

    /* JADX INFO: renamed from: j */
    public static String m4159j(byte[] bArr, int i2, int i3, Charset charset) {
        return (i3 <= i2 || i3 > bArr.length) ? "" : new String(bArr, i2, i3 - i2, charset);
    }
}
