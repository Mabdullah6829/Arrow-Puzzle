package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public final class zzakl {

    /* JADX INFO: renamed from: P */
    public byte[] f5625P;

    /* JADX INFO: renamed from: W */
    public zzahn f5632W;

    /* JADX INFO: renamed from: Y */
    public boolean f5634Y;

    /* JADX INFO: renamed from: a */
    public boolean f5636a;

    /* JADX INFO: renamed from: b */
    public String f5638b;

    /* JADX INFO: renamed from: b0 */
    public zzahm f5639b0;

    /* JADX INFO: renamed from: c */
    public String f5640c;

    /* JADX INFO: renamed from: c0 */
    public zzv f5641c0;

    /* JADX INFO: renamed from: d */
    public int f5642d;

    /* JADX INFO: renamed from: d0 */
    public int f5643d0;

    /* JADX INFO: renamed from: e */
    public long f5644e;

    /* JADX INFO: renamed from: f */
    public int f5645f;

    /* JADX INFO: renamed from: g */
    public int f5646g;

    /* JADX INFO: renamed from: h */
    public int f5647h;

    /* JADX INFO: renamed from: i */
    public int f5648i;

    /* JADX INFO: renamed from: j */
    public boolean f5649j;

    /* JADX INFO: renamed from: k */
    public byte[] f5650k;

    /* JADX INFO: renamed from: l */
    public zzahl f5651l;

    /* JADX INFO: renamed from: m */
    public byte[] f5652m;

    /* JADX INFO: renamed from: n */
    public zzq f5653n;

    /* JADX INFO: renamed from: o */
    public int f5654o = -1;

    /* JADX INFO: renamed from: p */
    public int f5655p = -1;

    /* JADX INFO: renamed from: q */
    public int f5656q = -1;

    /* JADX INFO: renamed from: r */
    public int f5657r = -1;

    /* JADX INFO: renamed from: s */
    public int f5658s = -1;

    /* JADX INFO: renamed from: t */
    public int f5659t = 0;

    /* JADX INFO: renamed from: u */
    public int f5660u = -1;

    /* JADX INFO: renamed from: v */
    public float f5661v = 0.0f;

    /* JADX INFO: renamed from: w */
    public float f5662w = 0.0f;

    /* JADX INFO: renamed from: x */
    public float f5663x = 0.0f;

    /* JADX INFO: renamed from: y */
    public byte[] f5664y = null;

    /* JADX INFO: renamed from: z */
    public int f5665z = -1;

    /* JADX INFO: renamed from: A */
    public int f5610A = -1;

    /* JADX INFO: renamed from: B */
    public int f5611B = -1;

    /* JADX INFO: renamed from: C */
    public int f5612C = -1;

    /* JADX INFO: renamed from: D */
    public int f5613D = 1000;

    /* JADX INFO: renamed from: E */
    public int f5614E = 200;

    /* JADX INFO: renamed from: F */
    public float f5615F = -1.0f;

    /* JADX INFO: renamed from: G */
    public float f5616G = -1.0f;

    /* JADX INFO: renamed from: H */
    public float f5617H = -1.0f;

    /* JADX INFO: renamed from: I */
    public float f5618I = -1.0f;

    /* JADX INFO: renamed from: J */
    public float f5619J = -1.0f;

    /* JADX INFO: renamed from: K */
    public float f5620K = -1.0f;

    /* JADX INFO: renamed from: L */
    public float f5621L = -1.0f;

    /* JADX INFO: renamed from: M */
    public float f5622M = -1.0f;

    /* JADX INFO: renamed from: N */
    public float f5623N = -1.0f;

    /* JADX INFO: renamed from: O */
    public float f5624O = -1.0f;

    /* JADX INFO: renamed from: Q */
    public int f5626Q = 1;

    /* JADX INFO: renamed from: R */
    public int f5627R = -1;

    /* JADX INFO: renamed from: S */
    public int f5628S = -1;

    /* JADX INFO: renamed from: T */
    public int f5629T = 8000;

    /* JADX INFO: renamed from: U */
    public long f5630U = 0;

    /* JADX INFO: renamed from: V */
    public long f5631V = 0;

    /* JADX INFO: renamed from: X */
    public boolean f5633X = false;

    /* JADX INFO: renamed from: Z */
    public boolean f5635Z = true;

    /* JADX INFO: renamed from: a0 */
    public String f5637a0 = "eng";

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:107:0x0197  */
    /* JADX WARN: Code duplicated, block: B:129:0x0239 A[PHI: r1
  0x0239: PHI (r1v75 int) = (r1v64 int), (r1v68 int), (r1v72 int), (r1v77 int) binds: [B:160:0x02f8, B:134:0x0274, B:131:0x0245, B:127:0x0213] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:212:0x0454 A[PHI: r15
  0x0454: PHI (r15v16 java.lang.String) = (r15v0 java.lang.String), (r15v1 java.lang.String), (r15v3 java.lang.String), (r15v5 java.lang.String) binds: [B:109:0x01b5, B:273:0x05a4, B:262:0x0571, B:260:0x0569] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:276:0x05ac  */
    /* JADX WARN: Code duplicated, block: B:278:0x05bb  */
    /* JADX WARN: Code duplicated, block: B:279:0x05bf A[PHI: r2 r22
  0x05bf: PHI (r2v192 java.lang.Object) = (r2v191 java.lang.Object), (r2v199 java.lang.Object) binds: [B:275:0x05aa, B:278:0x05bb] A[DONT_GENERATE, DONT_INLINE]
  0x05bf: PHI (r22v22 java.lang.String) = (r22v21 java.lang.String), (r22v25 java.lang.String) binds: [B:275:0x05aa, B:278:0x05bb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:282:0x05ce  */
    /* JADX WARN: Code duplicated, block: B:283:0x05d1  */
    /* JADX WARN: Code duplicated, block: B:286:0x05e0  */
    /* JADX WARN: Code duplicated, block: B:287:0x05f0  */
    /* JADX WARN: Code duplicated, block: B:289:0x05f6  */
    /* JADX WARN: Code duplicated, block: B:291:0x05fa  */
    /* JADX WARN: Code duplicated, block: B:293:0x05ff  */
    /* JADX WARN: Code duplicated, block: B:296:0x0607  */
    /* JADX WARN: Code duplicated, block: B:298:0x060c  */
    /* JADX WARN: Code duplicated, block: B:301:0x0613  */
    /* JADX WARN: Code duplicated, block: B:304:0x0621  */
    /* JADX WARN: Code duplicated, block: B:306:0x0624 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:307:0x0626  */
    /* JADX WARN: Code duplicated, block: B:308:0x0628  */
    /* JADX WARN: Code duplicated, block: B:309:0x062a  */
    /* JADX WARN: Code duplicated, block: B:312:0x0633  */
    /* JADX WARN: Code duplicated, block: B:314:0x063b  */
    /* JADX WARN: Code duplicated, block: B:318:0x0643  */
    /* JADX WARN: Code duplicated, block: B:320:0x0647  */
    /* JADX WARN: Code duplicated, block: B:321:0x064a  */
    /* JADX WARN: Code duplicated, block: B:322:0x064c  */
    /* JADX WARN: Code duplicated, block: B:325:0x0653  */
    /* JADX WARN: Code duplicated, block: B:345:0x0713  */
    /* JADX WARN: Code duplicated, block: B:348:0x072e  */
    /* JADX WARN: Code duplicated, block: B:350:0x0736  */
    /* JADX WARN: Code duplicated, block: B:351:0x0743  */
    /* JADX WARN: Code duplicated, block: B:354:0x0748  */
    /* JADX WARN: Code duplicated, block: B:372:0x0794  */
    /* JADX WARN: Code duplicated, block: B:374:0x07ac  */
    /* JADX WARN: Code duplicated, block: B:376:0x07b2  */
    /* JADX WARN: Code duplicated, block: B:391:0x07dd  */
    /* JADX WARN: Code duplicated, block: B:396:0x07f3  */
    /* JADX WARN: Code duplicated, block: B:397:0x07f6  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v39 */
    /* JADX WARN: Type inference failed for: r1v40, types: [java.lang.RuntimeException] */
    /* JADX WARN: Type inference failed for: r1v43 */
    /* JADX WARN: Type inference failed for: r2v196, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11, types: [java.lang.RuntimeException] */
    /* JADX INFO: renamed from: a */
    public final void m4163a(int i2) {
        byte b;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        List listM7216n;
        int iM6500b;
        String str;
        int i9;
        int i10;
        int i11;
        int i12;
        String str2;
        List list;
        List list2;
        Pair pair;
        Object obj;
        String str3;
        List list3;
        String str4;
        List list4;
        Object obj2;
        String str5;
        int i13;
        zzt zztVar;
        int i14;
        int i15;
        float f2;
        int i16;
        int i17;
        byte[] bArr;
        String str6;
        int iIntValue;
        int i18;
        Map map;
        int i19;
        int i20;
        int i21;
        int i22;
        String str7;
        String str8;
        zzfw zzfwVarM6736a;
        List list5;
        List listSingletonList;
        zzgwt zzgwtVarM7217q;
        String str9 = this.f5640c;
        ?? r7 = 4;
        switch (str9) {
            case "V_MPEG4/ISO/AP":
                b = 6;
                break;
            case "V_MPEG4/ISO/SP":
                b = 4;
                break;
            case "A_MS/ACM":
                b = 23;
                break;
            case "A_TRUEHD":
                b = 18;
                break;
            case "A_VORBIS":
                b = 11;
                break;
            case "A_MPEG/L2":
                b = 14;
                break;
            case "A_MPEG/L3":
                b = 15;
                break;
            case "V_MS/VFW/FOURCC":
                b = 9;
                break;
            case "S_DVBSUB":
                b = 33;
                break;
            case "V_MPEG4/ISO/ASP":
                b = 5;
                break;
            case "V_MPEG4/ISO/AVC":
                b = 7;
                break;
            case "S_VOBSUB":
                b = 31;
                break;
            case "A_DTS/LOSSLESS":
                b = 21;
                break;
            case "A_AAC":
                b = 13;
                break;
            case "A_AC3":
                b = 16;
                break;
            case "A_DTS":
                b = 19;
                break;
            case "V_AV1":
                b = 2;
                break;
            case "V_VP8":
                b = 0;
                break;
            case "V_VP9":
                b = 1;
                break;
            case "S_HDMV/PGS":
                b = 32;
                break;
            case "V_THEORA":
                b = 10;
                break;
            case "A_DTS/EXPRESS":
                b = 20;
                break;
            case "A_PCM/FLOAT/IEEE":
                b = 26;
                break;
            case "A_PCM/INT/BIG":
                b = 25;
                break;
            case "A_PCM/INT/LIT":
                b = 24;
                break;
            case "S_TEXT/ASS":
                b = 28;
                break;
            case "S_TEXT/SSA":
                b = 29;
                break;
            case "V_MPEGH/ISO/HEVC":
                b = 8;
                break;
            case "S_TEXT/WEBVTT":
                b = 30;
                break;
            case "S_TEXT/UTF8":
                b = 27;
                break;
            case "V_MPEG2":
                b = 3;
                break;
            case "A_EAC3":
                b = 17;
                break;
            case "A_FLAC":
                b = 22;
                break;
            case "A_OPUS":
                b = 12;
                break;
            default:
                b = -1;
                break;
        }
        String str10 = "video/x-unknown";
        String str11 = "audio/x-unknown";
        ArrayList arrayList = null;
        Object obj3 = null;
        list = null;
        list = null;
        List list6 = null;
        List list7 = null;
        List list8 = null;
        switch (b) {
            case 0:
                str10 = "video/x-vnd.on2.vp8";
                str11 = str10;
                iM6500b = -1;
                obj3 = null;
                i7 = -1;
                i3 = -1;
                i6 = -1;
                list3 = null;
                i4 = -1;
                i8 = -1;
                i5 = -1;
                list4 = list3;
                if (this.f5625P != null) {
                    obj2 = obj3;
                    zzfwVarM6736a = zzfw.m6736a(new zzeu(this.f5625P));
                    if (zzfwVarM6736a != null) {
                        obj3 = zzfwVarM6736a.f16688a;
                        str11 = "video/dolby-vision";
                        obj2 = obj3;
                    }
                } else {
                    obj2 = obj3;
                }
                str5 = str11;
                boolean z = this.f5635Z;
                List list9 = list4;
                if (true != this.f5634Y) {
                    i13 = 0;
                } else {
                    i13 = 2;
                }
                int i23 = (z ? 1 : 0) | i13;
                zztVar = new zzt();
                if (zzas.m4349a(str5)) {
                    zztVar.f20780F = this.f5626Q;
                    zztVar.f20781G = this.f5628S;
                    zztVar.f20782H = this.f5629T;
                    zztVar.f20783I = iM6500b;
                } else if (zzas.m4350b(str5)) {
                    if (this.f5659t == 0) {
                        i21 = this.f5657r;
                        i14 = -1;
                        if (i21 == -1) {
                            i21 = this.f5654o;
                        }
                        this.f5657r = i21;
                        i22 = this.f5658s;
                        if (i22 == -1) {
                            i22 = this.f5655p;
                        }
                        this.f5658s = i22;
                    } else {
                        i14 = -1;
                    }
                    i15 = this.f5657r;
                    if (i15 != i14 || (i20 = this.f5658s) == i14) {
                        f2 = -1.0f;
                    } else {
                        f2 = (this.f5655p * i15) / (this.f5654o * i20);
                    }
                    if (i6 == i14) {
                        if (i8 != i14) {
                            i6 = i14;
                        } else if (i4 == i14 && this.f5612C == i14) {
                            i6 = this.f5610A;
                            i8 = this.f5611B;
                        } else {
                            i6 = this.f5610A;
                            i8 = this.f5611B;
                            i4 = this.f5612C;
                        }
                    }
                    if (i7 == i14 && (i7 = this.f5656q) == i14) {
                        i7 = 8;
                    }
                    if (i3 == i14) {
                        i19 = this.f5656q;
                        if (i19 == i14) {
                            i16 = 8;
                        } else {
                            i16 = i19;
                        }
                    } else {
                        i16 = i3;
                    }
                    if (this.f5615F != -1.0f || this.f5616G == -1.0f || this.f5617H == -1.0f || this.f5618I == -1.0f || this.f5619J == -1.0f || this.f5620K == -1.0f || this.f5621L == -1.0f || this.f5622M == -1.0f || this.f5623N == -1.0f) {
                        i17 = 0;
                        bArr = null;
                    } else if (this.f5624O == -1.0f) {
                        bArr = null;
                        i17 = 0;
                    } else {
                        bArr = new byte[25];
                        ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                        i17 = 0;
                        byteBufferOrder.put((byte) 0);
                        byteBufferOrder.putShort((short) ((this.f5615F * 50000.0f) + 0.5f));
                        byteBufferOrder.putShort((short) ((this.f5616G * 50000.0f) + 0.5f));
                        byteBufferOrder.putShort((short) ((this.f5617H * 50000.0f) + 0.5f));
                        byteBufferOrder.putShort((short) ((this.f5618I * 50000.0f) + 0.5f));
                        byteBufferOrder.putShort((short) ((this.f5619J * 50000.0f) + 0.5f));
                        byteBufferOrder.putShort((short) ((this.f5620K * 50000.0f) + 0.5f));
                        byteBufferOrder.putShort((short) ((this.f5621L * 50000.0f) + 0.5f));
                        byteBufferOrder.putShort((short) ((this.f5622M * 50000.0f) + 0.5f));
                        byteBufferOrder.putShort((short) (this.f5623N + 0.5f));
                        byteBufferOrder.putShort((short) (this.f5624O + 0.5f));
                        byteBufferOrder.putShort((short) this.f5613D);
                        byteBufferOrder.putShort((short) this.f5614E);
                    }
                    zzh zzhVar = new zzh();
                    zzhVar.f18414a = i6;
                    zzhVar.f18415b = i4;
                    zzhVar.f18416c = i8;
                    zzhVar.f18417d = bArr;
                    zzhVar.f18418e = i7;
                    zzhVar.f18419f = i16;
                    zzi zziVarM7286a = zzhVar.m7286a();
                    str6 = this.f5638b;
                    if (str6 != null) {
                        map = zzakm.f5671r0;
                        if (map.containsKey(str6)) {
                            iIntValue = ((Integer) map.get(this.f5638b)).intValue();
                        } else {
                            iIntValue = i14;
                        }
                    } else {
                        iIntValue = i14;
                    }
                    if (this.f5660u == 0 || Float.compare(this.f5661v, 0.0f) != 0 || Float.compare(this.f5662w, 0.0f) != 0) {
                        i18 = iIntValue;
                    } else if (Float.compare(this.f5663x, 0.0f) == 0) {
                        i18 = i17;
                    } else if (Float.compare(this.f5663x, 90.0f) == 0) {
                        i18 = 90;
                    } else {
                        i18 = 180;
                        if (Float.compare(this.f5663x, -180.0f) != 0 && Float.compare(this.f5663x, 180.0f) != 0) {
                            if (Float.compare(this.f5663x, -90.0f) == 0) {
                                i18 = 270;
                            } else {
                                i18 = iIntValue;
                            }
                        }
                    }
                    zztVar.f20809u = this.f5654o;
                    zztVar.f20810v = this.f5655p;
                    zztVar.f20775A = f2;
                    zztVar.f20814z = i18;
                    zztVar.f20776B = this.f5664y;
                    zztVar.f20777C = this.f5665z;
                    zztVar.f20778D = zziVarM7286a;
                } else if (!"application/x-subrip".equals(str5) && !"text/x-ssa".equals(str5) && !"text/vtt".equals(str5) && !"application/vobsub".equals(str5) && !"application/pgs".equals(str5) && !"application/dvbsubs".equals(str5)) {
                    throw zzat.m4383a(null, "Unexpected MIME type.");
                }
                str7 = this.f5638b;
                if (str7 != null && !zzakm.f5671r0.containsKey(str7)) {
                    zztVar.f20790b = this.f5638b;
                }
                zztVar.m8851c(i2);
                if (true != this.f5636a) {
                    str8 = "video/x-matroska";
                } else {
                    str8 = "video/webm";
                }
                zztVar.m8852d(str8);
                zztVar.m8853e(str5);
                zztVar.f20803o = i5;
                zztVar.f20792d = this.f5637a0;
                zztVar.f20793e = i23;
                zztVar.f20805q = list9;
                zztVar.f20798j = obj2;
                zztVar.f20806r = this.f5653n;
                this.f5641c0 = new zzv(zztVar);
                return;
            case 1:
                byte[] bArr2 = this.f5652m;
                str10 = "video/x-vnd.on2.vp9";
                listM7216n = bArr2 == null ? null : zzgwt.m7216n(bArr2);
                listM7216n = zzgwtVarM7216n;
                list7 = listM7216n;
                str11 = str10;
                iM6500b = -1;
                obj3 = null;
                i7 = -1;
                i3 = -1;
                i6 = -1;
                list3 = list7;
                i4 = -1;
                i8 = -1;
                i5 = -1;
                list4 = list3;
                if (this.f5625P != null) {
                    obj2 = obj3;
                    zzfwVarM6736a = zzfw.m6736a(new zzeu(this.f5625P));
                    if (zzfwVarM6736a != null) {
                        obj3 = zzfwVarM6736a.f16688a;
                        str11 = "video/dolby-vision";
                        obj2 = obj3;
                    }
                } else {
                    obj2 = obj3;
                }
                str5 = str11;
                boolean z2 = this.f5635Z;
                List list10 = list4;
                if (true != this.f5634Y) {
                    i13 = 0;
                } else {
                    i13 = 2;
                }
                int i24 = (z2 ? 1 : 0) | i13;
                zztVar = new zzt();
                if (zzas.m4349a(str5)) {
                    zztVar.f20780F = this.f5626Q;
                    zztVar.f20781G = this.f5628S;
                    zztVar.f20782H = this.f5629T;
                    zztVar.f20783I = iM6500b;
                } else if (zzas.m4350b(str5)) {
                    if (this.f5659t == 0) {
                        i21 = this.f5657r;
                        i14 = -1;
                        if (i21 == -1) {
                            i21 = this.f5654o;
                        }
                        this.f5657r = i21;
                        i22 = this.f5658s;
                        if (i22 == -1) {
                            i22 = this.f5655p;
                        }
                        this.f5658s = i22;
                    } else {
                        i14 = -1;
                    }
                    i15 = this.f5657r;
                    if (i15 != i14) {
                        f2 = -1.0f;
                    } else {
                        f2 = -1.0f;
                    }
                    if (i6 == i14) {
                        if (i8 != i14) {
                            i6 = i14;
                        } else if (i4 == i14) {
                            i6 = this.f5610A;
                            i8 = this.f5611B;
                            i4 = this.f5612C;
                        } else {
                            i6 = this.f5610A;
                            i8 = this.f5611B;
                            i4 = this.f5612C;
                        }
                    }
                    if (i7 == i14) {
                        i7 = 8;
                    }
                    if (i3 == i14) {
                        i19 = this.f5656q;
                        if (i19 == i14) {
                            i16 = 8;
                        } else {
                            i16 = i19;
                        }
                    } else {
                        i16 = i3;
                    }
                    if (this.f5615F != -1.0f) {
                        i17 = 0;
                        bArr = null;
                    } else {
                        i17 = 0;
                        bArr = null;
                    }
                    zzh zzhVar2 = new zzh();
                    zzhVar2.f18414a = i6;
                    zzhVar2.f18415b = i4;
                    zzhVar2.f18416c = i8;
                    zzhVar2.f18417d = bArr;
                    zzhVar2.f18418e = i7;
                    zzhVar2.f18419f = i16;
                    zzi zziVarM7286a2 = zzhVar2.m7286a();
                    str6 = this.f5638b;
                    if (str6 != null) {
                        map = zzakm.f5671r0;
                        if (map.containsKey(str6)) {
                            iIntValue = ((Integer) map.get(this.f5638b)).intValue();
                        } else {
                            iIntValue = i14;
                        }
                    } else {
                        iIntValue = i14;
                    }
                    if (this.f5660u == 0) {
                        i18 = iIntValue;
                    } else {
                        i18 = iIntValue;
                    }
                    zztVar.f20809u = this.f5654o;
                    zztVar.f20810v = this.f5655p;
                    zztVar.f20775A = f2;
                    zztVar.f20814z = i18;
                    zztVar.f20776B = this.f5664y;
                    zztVar.f20777C = this.f5665z;
                    zztVar.f20778D = zziVarM7286a2;
                } else if (!"application/x-subrip".equals(str5)) {
                    throw zzat.m4383a(null, "Unexpected MIME type.");
                }
                str7 = this.f5638b;
                if (str7 != null) {
                    zztVar.f20790b = this.f5638b;
                }
                zztVar.m8851c(i2);
                if (true != this.f5636a) {
                    str8 = "video/x-matroska";
                } else {
                    str8 = "video/webm";
                }
                zztVar.m8852d(str8);
                zztVar.m8853e(str5);
                zztVar.f20803o = i5;
                zztVar.f20792d = this.f5637a0;
                zztVar.f20793e = i24;
                zztVar.f20805q = list10;
                zztVar.f20798j = obj2;
                zztVar.f20806r = this.f5653n;
                this.f5641c0 = new zzv(zztVar);
                return;
            case 2:
                byte[] bArr3 = this.f5652m;
                str10 = "video/av01";
                if (bArr3 == null) {
                    str11 = str10;
                    iM6500b = -1;
                    obj3 = null;
                    i7 = -1;
                    i3 = -1;
                    i6 = -1;
                    list3 = null;
                } else {
                    zzgwt zzgwtVarM7216n = zzgwt.m7216n(bArr3);
                    zzafe zzafeVarM4062a = zzafe.m4062a(this.f5652m);
                    if (zzafeVarM4062a != null) {
                        listM7216n = zzgwtVarM7216n;
                        String str12 = zzafeVarM4062a.f5162e;
                        i3 = zzafeVarM4062a.f5158a;
                        int i25 = zzafeVarM4062a.f5160c;
                        int i26 = zzafeVarM4062a.f5161d;
                        i4 = i25;
                        str11 = "video/av01";
                        i5 = -1;
                        i6 = zzafeVarM4062a.f5159b;
                        obj3 = str12;
                        i7 = i3;
                        i8 = i26;
                        list5 = zzgwtVarM7216n;
                        list2 = list5;
                        iM6500b = -1;
                        list4 = list2;
                        if (this.f5625P != null) {
                            obj2 = obj3;
                            zzfwVarM6736a = zzfw.m6736a(new zzeu(this.f5625P));
                            if (zzfwVarM6736a != null) {
                                obj3 = zzfwVarM6736a.f16688a;
                                str11 = "video/dolby-vision";
                                obj2 = obj3;
                            }
                        } else {
                            obj2 = obj3;
                        }
                        str5 = str11;
                        boolean z3 = this.f5635Z;
                        List list11 = list4;
                        if (true != this.f5634Y) {
                            i13 = 0;
                        } else {
                            i13 = 2;
                        }
                        int i27 = (z3 ? 1 : 0) | i13;
                        zztVar = new zzt();
                        if (zzas.m4349a(str5)) {
                            zztVar.f20780F = this.f5626Q;
                            zztVar.f20781G = this.f5628S;
                            zztVar.f20782H = this.f5629T;
                            zztVar.f20783I = iM6500b;
                        } else if (zzas.m4350b(str5)) {
                            if (this.f5659t == 0) {
                                i21 = this.f5657r;
                                i14 = -1;
                                if (i21 == -1) {
                                    i21 = this.f5654o;
                                }
                                this.f5657r = i21;
                                i22 = this.f5658s;
                                if (i22 == -1) {
                                    i22 = this.f5655p;
                                }
                                this.f5658s = i22;
                            } else {
                                i14 = -1;
                            }
                            i15 = this.f5657r;
                            if (i15 != i14) {
                                f2 = -1.0f;
                            } else {
                                f2 = -1.0f;
                            }
                            if (i6 == i14) {
                                if (i8 != i14) {
                                    i6 = i14;
                                } else if (i4 == i14) {
                                    i6 = this.f5610A;
                                    i8 = this.f5611B;
                                    i4 = this.f5612C;
                                } else {
                                    i6 = this.f5610A;
                                    i8 = this.f5611B;
                                    i4 = this.f5612C;
                                }
                            }
                            if (i7 == i14) {
                                i7 = 8;
                            }
                            if (i3 == i14) {
                                i19 = this.f5656q;
                                if (i19 == i14) {
                                    i16 = 8;
                                } else {
                                    i16 = i19;
                                }
                            } else {
                                i16 = i3;
                            }
                            if (this.f5615F != -1.0f) {
                                i17 = 0;
                                bArr = null;
                            } else {
                                i17 = 0;
                                bArr = null;
                            }
                            zzh zzhVar3 = new zzh();
                            zzhVar3.f18414a = i6;
                            zzhVar3.f18415b = i4;
                            zzhVar3.f18416c = i8;
                            zzhVar3.f18417d = bArr;
                            zzhVar3.f18418e = i7;
                            zzhVar3.f18419f = i16;
                            zzi zziVarM7286a3 = zzhVar3.m7286a();
                            str6 = this.f5638b;
                            if (str6 != null) {
                                map = zzakm.f5671r0;
                                if (map.containsKey(str6)) {
                                    iIntValue = ((Integer) map.get(this.f5638b)).intValue();
                                } else {
                                    iIntValue = i14;
                                }
                            } else {
                                iIntValue = i14;
                            }
                            if (this.f5660u == 0) {
                                i18 = iIntValue;
                            } else {
                                i18 = iIntValue;
                            }
                            zztVar.f20809u = this.f5654o;
                            zztVar.f20810v = this.f5655p;
                            zztVar.f20775A = f2;
                            zztVar.f20814z = i18;
                            zztVar.f20776B = this.f5664y;
                            zztVar.f20777C = this.f5665z;
                            zztVar.f20778D = zziVarM7286a3;
                        } else if (!"application/x-subrip".equals(str5)) {
                            throw zzat.m4383a(null, "Unexpected MIME type.");
                        }
                        str7 = this.f5638b;
                        if (str7 != null) {
                            zztVar.f20790b = this.f5638b;
                        }
                        zztVar.m8851c(i2);
                        if (true != this.f5636a) {
                            str8 = "video/x-matroska";
                        } else {
                            str8 = "video/webm";
                        }
                        zztVar.m8852d(str8);
                        zztVar.m8853e(str5);
                        zztVar.f20803o = i5;
                        zztVar.f20792d = this.f5637a0;
                        zztVar.f20793e = i27;
                        zztVar.f20805q = list11;
                        zztVar.f20798j = obj2;
                        zztVar.f20806r = this.f5653n;
                        this.f5641c0 = new zzv(zztVar);
                        return;
                    }
                    listM7216n = zzgwtVarM7216n;
                    list7 = listM7216n;
                    str11 = str10;
                    iM6500b = -1;
                    obj3 = null;
                    i7 = -1;
                    i3 = -1;
                    i6 = -1;
                    list3 = list7;
                }
                i4 = -1;
                i8 = -1;
                i5 = -1;
                list4 = list3;
                if (this.f5625P != null) {
                    obj2 = obj3;
                    zzfwVarM6736a = zzfw.m6736a(new zzeu(this.f5625P));
                    if (zzfwVarM6736a != null) {
                        obj3 = zzfwVarM6736a.f16688a;
                        str11 = "video/dolby-vision";
                        obj2 = obj3;
                    }
                } else {
                    obj2 = obj3;
                }
                str5 = str11;
                boolean z4 = this.f5635Z;
                List list12 = list4;
                if (true != this.f5634Y) {
                    i13 = 0;
                } else {
                    i13 = 2;
                }
                int i28 = (z4 ? 1 : 0) | i13;
                zztVar = new zzt();
                if (zzas.m4349a(str5)) {
                    zztVar.f20780F = this.f5626Q;
                    zztVar.f20781G = this.f5628S;
                    zztVar.f20782H = this.f5629T;
                    zztVar.f20783I = iM6500b;
                } else if (zzas.m4350b(str5)) {
                    if (this.f5659t == 0) {
                        i21 = this.f5657r;
                        i14 = -1;
                        if (i21 == -1) {
                            i21 = this.f5654o;
                        }
                        this.f5657r = i21;
                        i22 = this.f5658s;
                        if (i22 == -1) {
                            i22 = this.f5655p;
                        }
                        this.f5658s = i22;
                    } else {
                        i14 = -1;
                    }
                    i15 = this.f5657r;
                    if (i15 != i14) {
                        f2 = -1.0f;
                    } else {
                        f2 = -1.0f;
                    }
                    if (i6 == i14) {
                        if (i8 != i14) {
                            i6 = i14;
                        } else if (i4 == i14) {
                            i6 = this.f5610A;
                            i8 = this.f5611B;
                            i4 = this.f5612C;
                        } else {
                            i6 = this.f5610A;
                            i8 = this.f5611B;
                            i4 = this.f5612C;
                        }
                    }
                    if (i7 == i14) {
                        i7 = 8;
                    }
                    if (i3 == i14) {
                        i19 = this.f5656q;
                        if (i19 == i14) {
                            i16 = 8;
                        } else {
                            i16 = i19;
                        }
                    } else {
                        i16 = i3;
                    }
                    if (this.f5615F != -1.0f) {
                        i17 = 0;
                        bArr = null;
                    } else {
                        i17 = 0;
                        bArr = null;
                    }
                    zzh zzhVar4 = new zzh();
                    zzhVar4.f18414a = i6;
                    zzhVar4.f18415b = i4;
                    zzhVar4.f18416c = i8;
                    zzhVar4.f18417d = bArr;
                    zzhVar4.f18418e = i7;
                    zzhVar4.f18419f = i16;
                    zzi zziVarM7286a4 = zzhVar4.m7286a();
                    str6 = this.f5638b;
                    if (str6 != null) {
                        map = zzakm.f5671r0;
                        if (map.containsKey(str6)) {
                            iIntValue = ((Integer) map.get(this.f5638b)).intValue();
                        } else {
                            iIntValue = i14;
                        }
                    } else {
                        iIntValue = i14;
                    }
                    if (this.f5660u == 0) {
                        i18 = iIntValue;
                    } else {
                        i18 = iIntValue;
                    }
                    zztVar.f20809u = this.f5654o;
                    zztVar.f20810v = this.f5655p;
                    zztVar.f20775A = f2;
                    zztVar.f20814z = i18;
                    zztVar.f20776B = this.f5664y;
                    zztVar.f20777C = this.f5665z;
                    zztVar.f20778D = zziVarM7286a4;
                } else if (!"application/x-subrip".equals(str5)) {
                    throw zzat.m4383a(null, "Unexpected MIME type.");
                }
                str7 = this.f5638b;
                if (str7 != null) {
                    zztVar.f20790b = this.f5638b;
                }
                zztVar.m8851c(i2);
                if (true != this.f5636a) {
                    str8 = "video/x-matroska";
                } else {
                    str8 = "video/webm";
                }
                zztVar.m8852d(str8);
                zztVar.m8853e(str5);
                zztVar.f20803o = i5;
                zztVar.f20792d = this.f5637a0;
                zztVar.f20793e = i28;
                zztVar.f20805q = list12;
                zztVar.f20798j = obj2;
                zztVar.f20806r = this.f5653n;
                this.f5641c0 = new zzv(zztVar);
                return;
            case 3:
                str10 = "video/mpeg2";
                str11 = str10;
                iM6500b = -1;
                obj3 = null;
                i7 = -1;
                i3 = -1;
                i6 = -1;
                list3 = null;
                i4 = -1;
                i8 = -1;
                i5 = -1;
                list4 = list3;
                if (this.f5625P != null) {
                    obj2 = obj3;
                    zzfwVarM6736a = zzfw.m6736a(new zzeu(this.f5625P));
                    if (zzfwVarM6736a != null) {
                        obj3 = zzfwVarM6736a.f16688a;
                        str11 = "video/dolby-vision";
                        obj2 = obj3;
                    }
                } else {
                    obj2 = obj3;
                }
                str5 = str11;
                boolean z5 = this.f5635Z;
                List list13 = list4;
                if (true != this.f5634Y) {
                    i13 = 0;
                } else {
                    i13 = 2;
                }
                int i29 = (z5 ? 1 : 0) | i13;
                zztVar = new zzt();
                if (zzas.m4349a(str5)) {
                    zztVar.f20780F = this.f5626Q;
                    zztVar.f20781G = this.f5628S;
                    zztVar.f20782H = this.f5629T;
                    zztVar.f20783I = iM6500b;
                } else if (zzas.m4350b(str5)) {
                    if (this.f5659t == 0) {
                        i21 = this.f5657r;
                        i14 = -1;
                        if (i21 == -1) {
                            i21 = this.f5654o;
                        }
                        this.f5657r = i21;
                        i22 = this.f5658s;
                        if (i22 == -1) {
                            i22 = this.f5655p;
                        }
                        this.f5658s = i22;
                    } else {
                        i14 = -1;
                    }
                    i15 = this.f5657r;
                    if (i15 != i14) {
                        f2 = -1.0f;
                    } else {
                        f2 = -1.0f;
                    }
                    if (i6 == i14) {
                        if (i8 != i14) {
                            i6 = i14;
                        } else if (i4 == i14) {
                            i6 = this.f5610A;
                            i8 = this.f5611B;
                            i4 = this.f5612C;
                        } else {
                            i6 = this.f5610A;
                            i8 = this.f5611B;
                            i4 = this.f5612C;
                        }
                    }
                    if (i7 == i14) {
                        i7 = 8;
                    }
                    if (i3 == i14) {
                        i19 = this.f5656q;
                        if (i19 == i14) {
                            i16 = 8;
                        } else {
                            i16 = i19;
                        }
                    } else {
                        i16 = i3;
                    }
                    if (this.f5615F != -1.0f) {
                        i17 = 0;
                        bArr = null;
                    } else {
                        i17 = 0;
                        bArr = null;
                    }
                    zzh zzhVar5 = new zzh();
                    zzhVar5.f18414a = i6;
                    zzhVar5.f18415b = i4;
                    zzhVar5.f18416c = i8;
                    zzhVar5.f18417d = bArr;
                    zzhVar5.f18418e = i7;
                    zzhVar5.f18419f = i16;
                    zzi zziVarM7286a5 = zzhVar5.m7286a();
                    str6 = this.f5638b;
                    if (str6 != null) {
                        map = zzakm.f5671r0;
                        if (map.containsKey(str6)) {
                            iIntValue = ((Integer) map.get(this.f5638b)).intValue();
                        } else {
                            iIntValue = i14;
                        }
                    } else {
                        iIntValue = i14;
                    }
                    if (this.f5660u == 0) {
                        i18 = iIntValue;
                    } else {
                        i18 = iIntValue;
                    }
                    zztVar.f20809u = this.f5654o;
                    zztVar.f20810v = this.f5655p;
                    zztVar.f20775A = f2;
                    zztVar.f20814z = i18;
                    zztVar.f20776B = this.f5664y;
                    zztVar.f20777C = this.f5665z;
                    zztVar.f20778D = zziVarM7286a5;
                } else if (!"application/x-subrip".equals(str5)) {
                    throw zzat.m4383a(null, "Unexpected MIME type.");
                }
                str7 = this.f5638b;
                if (str7 != null) {
                    zztVar.f20790b = this.f5638b;
                }
                zztVar.m8851c(i2);
                if (true != this.f5636a) {
                    str8 = "video/x-matroska";
                } else {
                    str8 = "video/webm";
                }
                zztVar.m8852d(str8);
                zztVar.m8853e(str5);
                zztVar.f20803o = i5;
                zztVar.f20792d = this.f5637a0;
                zztVar.f20793e = i29;
                zztVar.f20805q = list13;
                zztVar.f20798j = obj2;
                zztVar.f20806r = this.f5653n;
                this.f5641c0 = new zzv(zztVar);
                return;
            case 4:
            case 5:
            case 6:
                byte[] bArr4 = this.f5652m;
                str10 = "video/mp4v-es";
                listM7216n = bArr4 == null ? null : Collections.singletonList(bArr4);
                listM7216n = zzgwtVarM7216n;
                list7 = listM7216n;
                str11 = str10;
                iM6500b = -1;
                obj3 = null;
                i7 = -1;
                i3 = -1;
                i6 = -1;
                list3 = list7;
                i4 = -1;
                i8 = -1;
                i5 = -1;
                list4 = list3;
                if (this.f5625P != null) {
                    obj2 = obj3;
                    zzfwVarM6736a = zzfw.m6736a(new zzeu(this.f5625P));
                    if (zzfwVarM6736a != null) {
                        obj3 = zzfwVarM6736a.f16688a;
                        str11 = "video/dolby-vision";
                        obj2 = obj3;
                    }
                } else {
                    obj2 = obj3;
                }
                str5 = str11;
                boolean z6 = this.f5635Z;
                List list14 = list4;
                if (true != this.f5634Y) {
                    i13 = 0;
                } else {
                    i13 = 2;
                }
                int i210 = (z6 ? 1 : 0) | i13;
                zztVar = new zzt();
                if (zzas.m4349a(str5)) {
                    zztVar.f20780F = this.f5626Q;
                    zztVar.f20781G = this.f5628S;
                    zztVar.f20782H = this.f5629T;
                    zztVar.f20783I = iM6500b;
                } else if (zzas.m4350b(str5)) {
                    if (this.f5659t == 0) {
                        i21 = this.f5657r;
                        i14 = -1;
                        if (i21 == -1) {
                            i21 = this.f5654o;
                        }
                        this.f5657r = i21;
                        i22 = this.f5658s;
                        if (i22 == -1) {
                            i22 = this.f5655p;
                        }
                        this.f5658s = i22;
                    } else {
                        i14 = -1;
                    }
                    i15 = this.f5657r;
                    if (i15 != i14) {
                        f2 = -1.0f;
                    } else {
                        f2 = -1.0f;
                    }
                    if (i6 == i14) {
                        if (i8 != i14) {
                            i6 = i14;
                        } else if (i4 == i14) {
                            i6 = this.f5610A;
                            i8 = this.f5611B;
                            i4 = this.f5612C;
                        } else {
                            i6 = this.f5610A;
                            i8 = this.f5611B;
                            i4 = this.f5612C;
                        }
                    }
                    if (i7 == i14) {
                        i7 = 8;
                    }
                    if (i3 == i14) {
                        i19 = this.f5656q;
                        if (i19 == i14) {
                            i16 = 8;
                        } else {
                            i16 = i19;
                        }
                    } else {
                        i16 = i3;
                    }
                    if (this.f5615F != -1.0f) {
                        i17 = 0;
                        bArr = null;
                    } else {
                        i17 = 0;
                        bArr = null;
                    }
                    zzh zzhVar6 = new zzh();
                    zzhVar6.f18414a = i6;
                    zzhVar6.f18415b = i4;
                    zzhVar6.f18416c = i8;
                    zzhVar6.f18417d = bArr;
                    zzhVar6.f18418e = i7;
                    zzhVar6.f18419f = i16;
                    zzi zziVarM7286a6 = zzhVar6.m7286a();
                    str6 = this.f5638b;
                    if (str6 != null) {
                        map = zzakm.f5671r0;
                        if (map.containsKey(str6)) {
                            iIntValue = ((Integer) map.get(this.f5638b)).intValue();
                        } else {
                            iIntValue = i14;
                        }
                    } else {
                        iIntValue = i14;
                    }
                    if (this.f5660u == 0) {
                        i18 = iIntValue;
                    } else {
                        i18 = iIntValue;
                    }
                    zztVar.f20809u = this.f5654o;
                    zztVar.f20810v = this.f5655p;
                    zztVar.f20775A = f2;
                    zztVar.f20814z = i18;
                    zztVar.f20776B = this.f5664y;
                    zztVar.f20777C = this.f5665z;
                    zztVar.f20778D = zziVarM7286a6;
                } else if (!"application/x-subrip".equals(str5)) {
                    throw zzat.m4383a(null, "Unexpected MIME type.");
                }
                str7 = this.f5638b;
                if (str7 != null) {
                    zztVar.f20790b = this.f5638b;
                }
                zztVar.m8851c(i2);
                if (true != this.f5636a) {
                    str8 = "video/x-matroska";
                } else {
                    str8 = "video/webm";
                }
                zztVar.m8852d(str8);
                zztVar.m8853e(str5);
                zztVar.f20803o = i5;
                zztVar.f20792d = this.f5637a0;
                zztVar.f20793e = i210;
                zztVar.f20805q = list14;
                zztVar.f20798j = obj2;
                zztVar.f20806r = this.f5653n;
                this.f5641c0 = new zzv(zztVar);
                return;
            case 7:
                zzaff zzaffVarM4063a = zzaff.m4063a(new zzeu(m4164b(this.f5640c)));
                ArrayList arrayList2 = zzaffVarM4063a.f5163a;
                this.f5643d0 = zzaffVarM4063a.f5164b;
                str = zzaffVarM4063a.f5174l;
                i6 = zzaffVarM4063a.f5169g;
                i9 = zzaffVarM4063a.f5171i;
                i10 = zzaffVarM4063a.f5170h;
                i11 = zzaffVarM4063a.f5167e;
                i12 = zzaffVarM4063a.f5168f;
                str2 = "video/avc";
                list = arrayList2;
                i4 = i10;
                str11 = str2;
                i5 = -1;
                i8 = i9;
                list2 = list;
                obj3 = str;
                i7 = i11;
                i3 = i12;
                iM6500b = -1;
                list4 = list2;
                if (this.f5625P != null) {
                    obj2 = obj3;
                    zzfwVarM6736a = zzfw.m6736a(new zzeu(this.f5625P));
                    if (zzfwVarM6736a != null) {
                        obj3 = zzfwVarM6736a.f16688a;
                        str11 = "video/dolby-vision";
                        obj2 = obj3;
                    }
                } else {
                    obj2 = obj3;
                }
                str5 = str11;
                boolean z7 = this.f5635Z;
                List list15 = list4;
                if (true != this.f5634Y) {
                    i13 = 0;
                } else {
                    i13 = 2;
                }
                int i211 = (z7 ? 1 : 0) | i13;
                zztVar = new zzt();
                if (zzas.m4349a(str5)) {
                    zztVar.f20780F = this.f5626Q;
                    zztVar.f20781G = this.f5628S;
                    zztVar.f20782H = this.f5629T;
                    zztVar.f20783I = iM6500b;
                } else if (zzas.m4350b(str5)) {
                    if (this.f5659t == 0) {
                        i21 = this.f5657r;
                        i14 = -1;
                        if (i21 == -1) {
                            i21 = this.f5654o;
                        }
                        this.f5657r = i21;
                        i22 = this.f5658s;
                        if (i22 == -1) {
                            i22 = this.f5655p;
                        }
                        this.f5658s = i22;
                    } else {
                        i14 = -1;
                    }
                    i15 = this.f5657r;
                    if (i15 != i14) {
                        f2 = -1.0f;
                    } else {
                        f2 = -1.0f;
                    }
                    if (i6 == i14) {
                        if (i8 != i14) {
                            i6 = i14;
                        } else if (i4 == i14) {
                            i6 = this.f5610A;
                            i8 = this.f5611B;
                            i4 = this.f5612C;
                        } else {
                            i6 = this.f5610A;
                            i8 = this.f5611B;
                            i4 = this.f5612C;
                        }
                    }
                    if (i7 == i14) {
                        i7 = 8;
                    }
                    if (i3 == i14) {
                        i19 = this.f5656q;
                        if (i19 == i14) {
                            i16 = 8;
                        } else {
                            i16 = i19;
                        }
                    } else {
                        i16 = i3;
                    }
                    if (this.f5615F != -1.0f) {
                        i17 = 0;
                        bArr = null;
                    } else {
                        i17 = 0;
                        bArr = null;
                    }
                    zzh zzhVar7 = new zzh();
                    zzhVar7.f18414a = i6;
                    zzhVar7.f18415b = i4;
                    zzhVar7.f18416c = i8;
                    zzhVar7.f18417d = bArr;
                    zzhVar7.f18418e = i7;
                    zzhVar7.f18419f = i16;
                    zzi zziVarM7286a7 = zzhVar7.m7286a();
                    str6 = this.f5638b;
                    if (str6 != null) {
                        map = zzakm.f5671r0;
                        if (map.containsKey(str6)) {
                            iIntValue = ((Integer) map.get(this.f5638b)).intValue();
                        } else {
                            iIntValue = i14;
                        }
                    } else {
                        iIntValue = i14;
                    }
                    if (this.f5660u == 0) {
                        i18 = iIntValue;
                    } else {
                        i18 = iIntValue;
                    }
                    zztVar.f20809u = this.f5654o;
                    zztVar.f20810v = this.f5655p;
                    zztVar.f20775A = f2;
                    zztVar.f20814z = i18;
                    zztVar.f20776B = this.f5664y;
                    zztVar.f20777C = this.f5665z;
                    zztVar.f20778D = zziVarM7286a7;
                } else if (!"application/x-subrip".equals(str5)) {
                    throw zzat.m4383a(null, "Unexpected MIME type.");
                }
                str7 = this.f5638b;
                if (str7 != null) {
                    zztVar.f20790b = this.f5638b;
                }
                zztVar.m8851c(i2);
                if (true != this.f5636a) {
                    str8 = "video/x-matroska";
                } else {
                    str8 = "video/webm";
                }
                zztVar.m8852d(str8);
                zztVar.m8853e(str5);
                zztVar.f20803o = i5;
                zztVar.f20792d = this.f5637a0;
                zztVar.f20793e = i211;
                zztVar.f20805q = list15;
                zztVar.f20798j = obj2;
                zztVar.f20806r = this.f5653n;
                this.f5641c0 = new zzv(zztVar);
                return;
            case 8:
                zzagu zzaguVarM4125a = zzagu.m4125a(new zzeu(m4164b(this.f5640c)), false, null);
                List list16 = zzaguVarM4125a.f5270a;
                this.f5643d0 = zzaguVarM4125a.f5271b;
                str = zzaguVarM4125a.f5283n;
                i6 = zzaguVarM4125a.f5277h;
                i9 = zzaguVarM4125a.f5279j;
                i10 = zzaguVarM4125a.f5278i;
                i11 = zzaguVarM4125a.f5275f;
                i12 = zzaguVarM4125a.f5276g;
                str2 = "video/hevc";
                list = list16;
                i4 = i10;
                str11 = str2;
                i5 = -1;
                i8 = i9;
                list2 = list;
                obj3 = str;
                i7 = i11;
                i3 = i12;
                iM6500b = -1;
                list4 = list2;
                if (this.f5625P != null) {
                    obj2 = obj3;
                    zzfwVarM6736a = zzfw.m6736a(new zzeu(this.f5625P));
                    if (zzfwVarM6736a != null) {
                        obj3 = zzfwVarM6736a.f16688a;
                        str11 = "video/dolby-vision";
                        obj2 = obj3;
                    }
                } else {
                    obj2 = obj3;
                }
                str5 = str11;
                boolean z8 = this.f5635Z;
                List list17 = list4;
                if (true != this.f5634Y) {
                    i13 = 0;
                } else {
                    i13 = 2;
                }
                int i212 = (z8 ? 1 : 0) | i13;
                zztVar = new zzt();
                if (zzas.m4349a(str5)) {
                    zztVar.f20780F = this.f5626Q;
                    zztVar.f20781G = this.f5628S;
                    zztVar.f20782H = this.f5629T;
                    zztVar.f20783I = iM6500b;
                } else if (zzas.m4350b(str5)) {
                    if (this.f5659t == 0) {
                        i21 = this.f5657r;
                        i14 = -1;
                        if (i21 == -1) {
                            i21 = this.f5654o;
                        }
                        this.f5657r = i21;
                        i22 = this.f5658s;
                        if (i22 == -1) {
                            i22 = this.f5655p;
                        }
                        this.f5658s = i22;
                    } else {
                        i14 = -1;
                    }
                    i15 = this.f5657r;
                    if (i15 != i14) {
                        f2 = -1.0f;
                    } else {
                        f2 = -1.0f;
                    }
                    if (i6 == i14) {
                        if (i8 != i14) {
                            i6 = i14;
                        } else if (i4 == i14) {
                            i6 = this.f5610A;
                            i8 = this.f5611B;
                            i4 = this.f5612C;
                        } else {
                            i6 = this.f5610A;
                            i8 = this.f5611B;
                            i4 = this.f5612C;
                        }
                    }
                    if (i7 == i14) {
                        i7 = 8;
                    }
                    if (i3 == i14) {
                        i19 = this.f5656q;
                        if (i19 == i14) {
                            i16 = 8;
                        } else {
                            i16 = i19;
                        }
                    } else {
                        i16 = i3;
                    }
                    if (this.f5615F != -1.0f) {
                        i17 = 0;
                        bArr = null;
                    } else {
                        i17 = 0;
                        bArr = null;
                    }
                    zzh zzhVar8 = new zzh();
                    zzhVar8.f18414a = i6;
                    zzhVar8.f18415b = i4;
                    zzhVar8.f18416c = i8;
                    zzhVar8.f18417d = bArr;
                    zzhVar8.f18418e = i7;
                    zzhVar8.f18419f = i16;
                    zzi zziVarM7286a8 = zzhVar8.m7286a();
                    str6 = this.f5638b;
                    if (str6 != null) {
                        map = zzakm.f5671r0;
                        if (map.containsKey(str6)) {
                            iIntValue = ((Integer) map.get(this.f5638b)).intValue();
                        } else {
                            iIntValue = i14;
                        }
                    } else {
                        iIntValue = i14;
                    }
                    if (this.f5660u == 0) {
                        i18 = iIntValue;
                    } else {
                        i18 = iIntValue;
                    }
                    zztVar.f20809u = this.f5654o;
                    zztVar.f20810v = this.f5655p;
                    zztVar.f20775A = f2;
                    zztVar.f20814z = i18;
                    zztVar.f20776B = this.f5664y;
                    zztVar.f20777C = this.f5665z;
                    zztVar.f20778D = zziVarM7286a8;
                } else if (!"application/x-subrip".equals(str5)) {
                    throw zzat.m4383a(null, "Unexpected MIME type.");
                }
                str7 = this.f5638b;
                if (str7 != null) {
                    zztVar.f20790b = this.f5638b;
                }
                zztVar.m8851c(i2);
                if (true != this.f5636a) {
                    str8 = "video/x-matroska";
                } else {
                    str8 = "video/webm";
                }
                zztVar.m8852d(str8);
                zztVar.m8853e(str5);
                zztVar.f20803o = i5;
                zztVar.f20792d = this.f5637a0;
                zztVar.f20793e = i212;
                zztVar.f20805q = list17;
                zztVar.f20798j = obj2;
                zztVar.f20806r = this.f5653n;
                this.f5641c0 = new zzv(zztVar);
                return;
            case 9:
                zzeu zzeuVar = new zzeu(m4164b(this.f5640c));
                try {
                    zzeuVar.m6365G(16);
                    long jM6375a = zzeuVar.m6375a();
                    try {
                        if (jM6375a == 1482049860) {
                            pair = new Pair("video/divx", null);
                        } else {
                            if (jM6375a != 859189832) {
                                if (jM6375a == 826496599) {
                                    int i30 = zzeuVar.f14888b + 20;
                                    byte[] bArr5 = zzeuVar.f14887a;
                                    while (true) {
                                        int length = bArr5.length;
                                        if (i30 >= length - 4) {
                                            throw zzat.m4383a(null, "Failed to find FourCC VC1 initialization data");
                                        }
                                        int i31 = i30 + 1;
                                        if (bArr5[i30] == 0 && bArr5[i31] == 0 && bArr5[i30 + 2] == 1) {
                                            if (bArr5[i30 + 3] == 15) {
                                                pair = new Pair("video/wvc1", Collections.singletonList(Arrays.copyOfRange(bArr5, i30, length)));
                                            }
                                        }
                                        i30 = i31;
                                    }
                                } else {
                                    zzeh.m6211c("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                                    obj = null;
                                    pair = new Pair("video/x-unknown", null);
                                }
                                str3 = (String) pair.first;
                                list8 = (List) pair.second;
                                obj3 = obj;
                                str11 = str3;
                                list6 = list8;
                                iM6500b = -1;
                                list7 = list6;
                                i7 = -1;
                                i3 = -1;
                                i6 = -1;
                                list3 = list7;
                                i4 = -1;
                                i8 = -1;
                                i5 = -1;
                                list4 = list3;
                                if (this.f5625P != null) {
                                    obj2 = obj3;
                                    zzfwVarM6736a = zzfw.m6736a(new zzeu(this.f5625P));
                                    if (zzfwVarM6736a != null) {
                                        obj3 = zzfwVarM6736a.f16688a;
                                        str11 = "video/dolby-vision";
                                        obj2 = obj3;
                                    }
                                } else {
                                    obj2 = obj3;
                                }
                                str5 = str11;
                                boolean z9 = this.f5635Z;
                                List list18 = list4;
                                if (true != this.f5634Y) {
                                    i13 = 0;
                                } else {
                                    i13 = 2;
                                }
                                int i213 = (z9 ? 1 : 0) | i13;
                                zztVar = new zzt();
                                if (zzas.m4349a(str5)) {
                                    zztVar.f20780F = this.f5626Q;
                                    zztVar.f20781G = this.f5628S;
                                    zztVar.f20782H = this.f5629T;
                                    zztVar.f20783I = iM6500b;
                                } else if (zzas.m4350b(str5)) {
                                    if (this.f5659t == 0) {
                                        i21 = this.f5657r;
                                        i14 = -1;
                                        if (i21 == -1) {
                                            i21 = this.f5654o;
                                        }
                                        this.f5657r = i21;
                                        i22 = this.f5658s;
                                        if (i22 == -1) {
                                            i22 = this.f5655p;
                                        }
                                        this.f5658s = i22;
                                    } else {
                                        i14 = -1;
                                    }
                                    i15 = this.f5657r;
                                    if (i15 != i14) {
                                        f2 = -1.0f;
                                    } else {
                                        f2 = -1.0f;
                                    }
                                    if (i6 == i14) {
                                        if (i8 != i14) {
                                            i6 = i14;
                                        } else if (i4 == i14) {
                                            i6 = this.f5610A;
                                            i8 = this.f5611B;
                                            i4 = this.f5612C;
                                        } else {
                                            i6 = this.f5610A;
                                            i8 = this.f5611B;
                                            i4 = this.f5612C;
                                        }
                                    }
                                    if (i7 == i14) {
                                        i7 = 8;
                                    }
                                    if (i3 == i14) {
                                        i19 = this.f5656q;
                                        if (i19 == i14) {
                                            i16 = 8;
                                        } else {
                                            i16 = i19;
                                        }
                                    } else {
                                        i16 = i3;
                                    }
                                    if (this.f5615F != -1.0f) {
                                        i17 = 0;
                                        bArr = null;
                                    } else {
                                        i17 = 0;
                                        bArr = null;
                                    }
                                    zzh zzhVar9 = new zzh();
                                    zzhVar9.f18414a = i6;
                                    zzhVar9.f18415b = i4;
                                    zzhVar9.f18416c = i8;
                                    zzhVar9.f18417d = bArr;
                                    zzhVar9.f18418e = i7;
                                    zzhVar9.f18419f = i16;
                                    zzi zziVarM7286a9 = zzhVar9.m7286a();
                                    str6 = this.f5638b;
                                    if (str6 != null) {
                                        map = zzakm.f5671r0;
                                        if (map.containsKey(str6)) {
                                            iIntValue = ((Integer) map.get(this.f5638b)).intValue();
                                        } else {
                                            iIntValue = i14;
                                        }
                                    } else {
                                        iIntValue = i14;
                                    }
                                    if (this.f5660u == 0) {
                                        i18 = iIntValue;
                                    } else {
                                        i18 = iIntValue;
                                    }
                                    zztVar.f20809u = this.f5654o;
                                    zztVar.f20810v = this.f5655p;
                                    zztVar.f20775A = f2;
                                    zztVar.f20814z = i18;
                                    zztVar.f20776B = this.f5664y;
                                    zztVar.f20777C = this.f5665z;
                                    zztVar.f20778D = zziVarM7286a9;
                                } else if (!"application/x-subrip".equals(str5)) {
                                    throw zzat.m4383a(null, "Unexpected MIME type.");
                                }
                                str7 = this.f5638b;
                                if (str7 != null) {
                                    zztVar.f20790b = this.f5638b;
                                }
                                zztVar.m8851c(i2);
                                if (true != this.f5636a) {
                                    str8 = "video/x-matroska";
                                } else {
                                    str8 = "video/webm";
                                }
                                zztVar.m8852d(str8);
                                zztVar.m8853e(str5);
                                zztVar.f20803o = i5;
                                zztVar.f20792d = this.f5637a0;
                                zztVar.f20793e = i213;
                                zztVar.f20805q = list18;
                                zztVar.f20798j = obj2;
                                zztVar.f20806r = this.f5653n;
                                this.f5641c0 = new zzv(zztVar);
                                return;
                            }
                            pair = new Pair("video/3gpp", null);
                        }
                        obj = null;
                        str3 = (String) pair.first;
                        list8 = (List) pair.second;
                        obj3 = obj;
                        str11 = str3;
                        list6 = list8;
                        iM6500b = -1;
                        list7 = list6;
                        i7 = -1;
                        i3 = -1;
                        i6 = -1;
                        list3 = list7;
                        i4 = -1;
                        i8 = -1;
                        i5 = -1;
                        list4 = list3;
                        if (this.f5625P != null) {
                            obj2 = obj3;
                            zzfwVarM6736a = zzfw.m6736a(new zzeu(this.f5625P));
                            if (zzfwVarM6736a != null) {
                                obj3 = zzfwVarM6736a.f16688a;
                                str11 = "video/dolby-vision";
                                obj2 = obj3;
                            }
                        } else {
                            obj2 = obj3;
                        }
                        str5 = str11;
                        boolean z10 = this.f5635Z;
                        List list19 = list4;
                        if (true != this.f5634Y) {
                            i13 = 0;
                        } else {
                            i13 = 2;
                        }
                        int i214 = (z10 ? 1 : 0) | i13;
                        zztVar = new zzt();
                        if (zzas.m4349a(str5)) {
                            zztVar.f20780F = this.f5626Q;
                            zztVar.f20781G = this.f5628S;
                            zztVar.f20782H = this.f5629T;
                            zztVar.f20783I = iM6500b;
                        } else if (zzas.m4350b(str5)) {
                            if (this.f5659t == 0) {
                                i21 = this.f5657r;
                                i14 = -1;
                                if (i21 == -1) {
                                    i21 = this.f5654o;
                                }
                                this.f5657r = i21;
                                i22 = this.f5658s;
                                if (i22 == -1) {
                                    i22 = this.f5655p;
                                }
                                this.f5658s = i22;
                            } else {
                                i14 = -1;
                            }
                            i15 = this.f5657r;
                            if (i15 != i14) {
                                f2 = -1.0f;
                            } else {
                                f2 = -1.0f;
                            }
                            if (i6 == i14) {
                                if (i8 != i14) {
                                    i6 = i14;
                                } else if (i4 == i14) {
                                    i6 = this.f5610A;
                                    i8 = this.f5611B;
                                    i4 = this.f5612C;
                                } else {
                                    i6 = this.f5610A;
                                    i8 = this.f5611B;
                                    i4 = this.f5612C;
                                }
                            }
                            if (i7 == i14) {
                                i7 = 8;
                            }
                            if (i3 == i14) {
                                i19 = this.f5656q;
                                if (i19 == i14) {
                                    i16 = 8;
                                } else {
                                    i16 = i19;
                                }
                            } else {
                                i16 = i3;
                            }
                            if (this.f5615F != -1.0f) {
                                i17 = 0;
                                bArr = null;
                            } else {
                                i17 = 0;
                                bArr = null;
                            }
                            zzh zzhVar10 = new zzh();
                            zzhVar10.f18414a = i6;
                            zzhVar10.f18415b = i4;
                            zzhVar10.f18416c = i8;
                            zzhVar10.f18417d = bArr;
                            zzhVar10.f18418e = i7;
                            zzhVar10.f18419f = i16;
                            zzi zziVarM7286a10 = zzhVar10.m7286a();
                            str6 = this.f5638b;
                            if (str6 != null) {
                                map = zzakm.f5671r0;
                                if (map.containsKey(str6)) {
                                    iIntValue = ((Integer) map.get(this.f5638b)).intValue();
                                } else {
                                    iIntValue = i14;
                                }
                            } else {
                                iIntValue = i14;
                            }
                            if (this.f5660u == 0) {
                                i18 = iIntValue;
                            } else {
                                i18 = iIntValue;
                            }
                            zztVar.f20809u = this.f5654o;
                            zztVar.f20810v = this.f5655p;
                            zztVar.f20775A = f2;
                            zztVar.f20814z = i18;
                            zztVar.f20776B = this.f5664y;
                            zztVar.f20777C = this.f5665z;
                            zztVar.f20778D = zziVarM7286a10;
                        } else if (!"application/x-subrip".equals(str5)) {
                            throw zzat.m4383a(null, "Unexpected MIME type.");
                        }
                        str7 = this.f5638b;
                        if (str7 != null) {
                            zztVar.f20790b = this.f5638b;
                        }
                        zztVar.m8851c(i2);
                        if (true != this.f5636a) {
                            str8 = "video/x-matroska";
                        } else {
                            str8 = "video/webm";
                        }
                        zztVar.m8852d(str8);
                        zztVar.m8853e(str5);
                        zztVar.f20803o = i5;
                        zztVar.f20792d = this.f5637a0;
                        zztVar.f20793e = i214;
                        zztVar.f20805q = list19;
                        zztVar.f20798j = obj2;
                        zztVar.f20806r = this.f5653n;
                        this.f5641c0 = new zzv(zztVar);
                        return;
                    } catch (ArrayIndexOutOfBoundsException unused) {
                        throw zzat.m4383a(r7, "Error parsing FourCC private data");
                    }
                } catch (ArrayIndexOutOfBoundsException unused2) {
                    r7 = 0;
                }
                break;
            case 10:
                str11 = str10;
                iM6500b = -1;
                obj3 = null;
                i7 = -1;
                i3 = -1;
                i6 = -1;
                list3 = null;
                i4 = -1;
                i8 = -1;
                i5 = -1;
                list4 = list3;
                if (this.f5625P != null) {
                    obj2 = obj3;
                    zzfwVarM6736a = zzfw.m6736a(new zzeu(this.f5625P));
                    if (zzfwVarM6736a != null) {
                        obj3 = zzfwVarM6736a.f16688a;
                        str11 = "video/dolby-vision";
                        obj2 = obj3;
                    }
                } else {
                    obj2 = obj3;
                }
                str5 = str11;
                boolean z11 = this.f5635Z;
                List list110 = list4;
                if (true != this.f5634Y) {
                    i13 = 0;
                } else {
                    i13 = 2;
                }
                int i215 = (z11 ? 1 : 0) | i13;
                zztVar = new zzt();
                if (zzas.m4349a(str5)) {
                    zztVar.f20780F = this.f5626Q;
                    zztVar.f20781G = this.f5628S;
                    zztVar.f20782H = this.f5629T;
                    zztVar.f20783I = iM6500b;
                } else if (zzas.m4350b(str5)) {
                    if (this.f5659t == 0) {
                        i21 = this.f5657r;
                        i14 = -1;
                        if (i21 == -1) {
                            i21 = this.f5654o;
                        }
                        this.f5657r = i21;
                        i22 = this.f5658s;
                        if (i22 == -1) {
                            i22 = this.f5655p;
                        }
                        this.f5658s = i22;
                    } else {
                        i14 = -1;
                    }
                    i15 = this.f5657r;
                    if (i15 != i14) {
                        f2 = -1.0f;
                    } else {
                        f2 = -1.0f;
                    }
                    if (i6 == i14) {
                        if (i8 != i14) {
                            i6 = i14;
                        } else if (i4 == i14) {
                            i6 = this.f5610A;
                            i8 = this.f5611B;
                            i4 = this.f5612C;
                        } else {
                            i6 = this.f5610A;
                            i8 = this.f5611B;
                            i4 = this.f5612C;
                        }
                    }
                    if (i7 == i14) {
                        i7 = 8;
                    }
                    if (i3 == i14) {
                        i19 = this.f5656q;
                        if (i19 == i14) {
                            i16 = 8;
                        } else {
                            i16 = i19;
                        }
                    } else {
                        i16 = i3;
                    }
                    if (this.f5615F != -1.0f) {
                        i17 = 0;
                        bArr = null;
                    } else {
                        i17 = 0;
                        bArr = null;
                    }
                    zzh zzhVar11 = new zzh();
                    zzhVar11.f18414a = i6;
                    zzhVar11.f18415b = i4;
                    zzhVar11.f18416c = i8;
                    zzhVar11.f18417d = bArr;
                    zzhVar11.f18418e = i7;
                    zzhVar11.f18419f = i16;
                    zzi zziVarM7286a11 = zzhVar11.m7286a();
                    str6 = this.f5638b;
                    if (str6 != null) {
                        map = zzakm.f5671r0;
                        if (map.containsKey(str6)) {
                            iIntValue = ((Integer) map.get(this.f5638b)).intValue();
                        } else {
                            iIntValue = i14;
                        }
                    } else {
                        iIntValue = i14;
                    }
                    if (this.f5660u == 0) {
                        i18 = iIntValue;
                    } else {
                        i18 = iIntValue;
                    }
                    zztVar.f20809u = this.f5654o;
                    zztVar.f20810v = this.f5655p;
                    zztVar.f20775A = f2;
                    zztVar.f20814z = i18;
                    zztVar.f20776B = this.f5664y;
                    zztVar.f20777C = this.f5665z;
                    zztVar.f20778D = zziVarM7286a11;
                } else if (!"application/x-subrip".equals(str5)) {
                    throw zzat.m4383a(null, "Unexpected MIME type.");
                }
                str7 = this.f5638b;
                if (str7 != null) {
                    zztVar.f20790b = this.f5638b;
                }
                zztVar.m8851c(i2);
                if (true != this.f5636a) {
                    str8 = "video/x-matroska";
                } else {
                    str8 = "video/webm";
                }
                zztVar.m8852d(str8);
                zztVar.m8853e(str5);
                zztVar.f20803o = i5;
                zztVar.f20792d = this.f5637a0;
                zztVar.f20793e = i215;
                zztVar.f20805q = list110;
                zztVar.f20798j = obj2;
                zztVar.f20806r = this.f5653n;
                this.f5641c0 = new zzv(zztVar);
                return;
            case 11:
                byte[] bArrM4164b = m4164b(str9);
                try {
                    try {
                        if (bArrM4164b[0] != 2) {
                            throw zzat.m4383a(null, "Error parsing vorbis codec private");
                        }
                        int i32 = 1;
                        int i33 = 0;
                        while (true) {
                            int i34 = bArrM4164b[i32];
                            i32++;
                            int i35 = i34 & 255;
                            if (i35 == 255) {
                                i33 += 255;
                            } else {
                                int i36 = i33 + i35;
                                int i37 = 0;
                                while (true) {
                                    try {
                                        int i38 = bArrM4164b[i32];
                                        i32++;
                                        int i39 = i38 & 255;
                                        if (i39 != 255) {
                                            int i40 = i37 + i39;
                                            if (bArrM4164b[i32] != 1) {
                                                throw zzat.m4383a(null, "Error parsing vorbis codec private");
                                            }
                                            byte[] bArr6 = new byte[i36];
                                            System.arraycopy(bArrM4164b, i32, bArr6, 0, i36);
                                            int i41 = i32 + i36;
                                            if (bArrM4164b[i41] != 3) {
                                                throw zzat.m4383a(null, "Error parsing vorbis codec private");
                                            }
                                            int i42 = i41 + i40;
                                            if (bArrM4164b[i42] != 5) {
                                                throw zzat.m4383a(null, "Error parsing vorbis codec private");
                                            }
                                            int length2 = bArrM4164b.length - i42;
                                            byte[] bArr7 = new byte[length2];
                                            System.arraycopy(bArrM4164b, i42, bArr7, 0, length2);
                                            ArrayList arrayList3 = new ArrayList(2);
                                            arrayList3.add(bArr6);
                                            arrayList3.add(bArr7);
                                            arrayList = arrayList3;
                                            i5 = 8192;
                                            str11 = "audio/vorbis";
                                            iM6500b = -1;
                                            obj3 = null;
                                            i7 = -1;
                                            i3 = -1;
                                            i6 = -1;
                                            i4 = -1;
                                            i8 = -1;
                                            list4 = arrayList;
                                            if (this.f5625P != null) {
                                                obj2 = obj3;
                                                zzfwVarM6736a = zzfw.m6736a(new zzeu(this.f5625P));
                                                if (zzfwVarM6736a != null) {
                                                    obj3 = zzfwVarM6736a.f16688a;
                                                    str11 = "video/dolby-vision";
                                                    obj2 = obj3;
                                                }
                                            } else {
                                                obj2 = obj3;
                                            }
                                            str5 = str11;
                                            boolean z12 = this.f5635Z;
                                            List list111 = list4;
                                            if (true != this.f5634Y) {
                                                i13 = 0;
                                            } else {
                                                i13 = 2;
                                            }
                                            int i216 = (z12 ? 1 : 0) | i13;
                                            zztVar = new zzt();
                                            if (zzas.m4349a(str5)) {
                                                zztVar.f20780F = this.f5626Q;
                                                zztVar.f20781G = this.f5628S;
                                                zztVar.f20782H = this.f5629T;
                                                zztVar.f20783I = iM6500b;
                                            } else if (zzas.m4350b(str5)) {
                                                if (this.f5659t == 0) {
                                                    i21 = this.f5657r;
                                                    i14 = -1;
                                                    if (i21 == -1) {
                                                        i21 = this.f5654o;
                                                    }
                                                    this.f5657r = i21;
                                                    i22 = this.f5658s;
                                                    if (i22 == -1) {
                                                        i22 = this.f5655p;
                                                    }
                                                    this.f5658s = i22;
                                                } else {
                                                    i14 = -1;
                                                }
                                                i15 = this.f5657r;
                                                if (i15 != i14) {
                                                    f2 = -1.0f;
                                                } else {
                                                    f2 = -1.0f;
                                                }
                                                if (i6 == i14) {
                                                    if (i8 != i14) {
                                                        i6 = i14;
                                                    } else if (i4 == i14) {
                                                        i6 = this.f5610A;
                                                        i8 = this.f5611B;
                                                        i4 = this.f5612C;
                                                    } else {
                                                        i6 = this.f5610A;
                                                        i8 = this.f5611B;
                                                        i4 = this.f5612C;
                                                    }
                                                }
                                                if (i7 == i14) {
                                                    i7 = 8;
                                                }
                                                if (i3 == i14) {
                                                    i19 = this.f5656q;
                                                    if (i19 == i14) {
                                                        i16 = 8;
                                                    } else {
                                                        i16 = i19;
                                                    }
                                                } else {
                                                    i16 = i3;
                                                }
                                                if (this.f5615F != -1.0f) {
                                                    i17 = 0;
                                                    bArr = null;
                                                } else {
                                                    i17 = 0;
                                                    bArr = null;
                                                }
                                                zzh zzhVar12 = new zzh();
                                                zzhVar12.f18414a = i6;
                                                zzhVar12.f18415b = i4;
                                                zzhVar12.f18416c = i8;
                                                zzhVar12.f18417d = bArr;
                                                zzhVar12.f18418e = i7;
                                                zzhVar12.f18419f = i16;
                                                zzi zziVarM7286a12 = zzhVar12.m7286a();
                                                str6 = this.f5638b;
                                                if (str6 != null) {
                                                    map = zzakm.f5671r0;
                                                    if (map.containsKey(str6)) {
                                                        iIntValue = ((Integer) map.get(this.f5638b)).intValue();
                                                    } else {
                                                        iIntValue = i14;
                                                    }
                                                } else {
                                                    iIntValue = i14;
                                                }
                                                if (this.f5660u == 0) {
                                                    i18 = iIntValue;
                                                } else {
                                                    i18 = iIntValue;
                                                }
                                                zztVar.f20809u = this.f5654o;
                                                zztVar.f20810v = this.f5655p;
                                                zztVar.f20775A = f2;
                                                zztVar.f20814z = i18;
                                                zztVar.f20776B = this.f5664y;
                                                zztVar.f20777C = this.f5665z;
                                                zztVar.f20778D = zziVarM7286a12;
                                            } else if (!"application/x-subrip".equals(str5)) {
                                                throw zzat.m4383a(null, "Unexpected MIME type.");
                                            }
                                            str7 = this.f5638b;
                                            if (str7 != null) {
                                                zztVar.f20790b = this.f5638b;
                                            }
                                            zztVar.m8851c(i2);
                                            if (true != this.f5636a) {
                                                str8 = "video/x-matroska";
                                            } else {
                                                str8 = "video/webm";
                                            }
                                            zztVar.m8852d(str8);
                                            zztVar.m8853e(str5);
                                            zztVar.f20803o = i5;
                                            zztVar.f20792d = this.f5637a0;
                                            zztVar.f20793e = i216;
                                            zztVar.f20805q = list111;
                                            zztVar.f20798j = obj2;
                                            zztVar.f20806r = this.f5653n;
                                            this.f5641c0 = new zzv(zztVar);
                                            return;
                                        }
                                        i37 += 255;
                                    } catch (ArrayIndexOutOfBoundsException unused3) {
                                        bArrM4164b = 0;
                                    }
                                }
                            }
                        }
                    } catch (ArrayIndexOutOfBoundsException unused4) {
                    }
                } catch (ArrayIndexOutOfBoundsException unused5) {
                    bArrM4164b = 0;
                }
                throw zzat.m4383a(bArrM4164b, "Error parsing vorbis codec private");
            case 12:
                ArrayList arrayList4 = new ArrayList(3);
                arrayList4.add(m4164b(this.f5640c));
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
                ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                arrayList4.add(byteBufferAllocate.order(byteOrder).putLong(this.f5630U).array());
                arrayList4.add(ByteBuffer.allocate(8).order(byteOrder).putLong(this.f5631V).array());
                obj3 = null;
                str11 = "audio/opus";
                i5 = 5760;
                i7 = -1;
                i3 = -1;
                i6 = -1;
                i4 = -1;
                i8 = -1;
                list5 = arrayList4;
                list2 = list5;
                iM6500b = -1;
                list4 = list2;
                if (this.f5625P != null) {
                    obj2 = obj3;
                    zzfwVarM6736a = zzfw.m6736a(new zzeu(this.f5625P));
                    if (zzfwVarM6736a != null) {
                        obj3 = zzfwVarM6736a.f16688a;
                        str11 = "video/dolby-vision";
                        obj2 = obj3;
                    }
                } else {
                    obj2 = obj3;
                }
                str5 = str11;
                boolean z13 = this.f5635Z;
                List list112 = list4;
                if (true != this.f5634Y) {
                    i13 = 0;
                } else {
                    i13 = 2;
                }
                int i217 = (z13 ? 1 : 0) | i13;
                zztVar = new zzt();
                if (zzas.m4349a(str5)) {
                    zztVar.f20780F = this.f5626Q;
                    zztVar.f20781G = this.f5628S;
                    zztVar.f20782H = this.f5629T;
                    zztVar.f20783I = iM6500b;
                } else if (zzas.m4350b(str5)) {
                    if (this.f5659t == 0) {
                        i21 = this.f5657r;
                        i14 = -1;
                        if (i21 == -1) {
                            i21 = this.f5654o;
                        }
                        this.f5657r = i21;
                        i22 = this.f5658s;
                        if (i22 == -1) {
                            i22 = this.f5655p;
                        }
                        this.f5658s = i22;
                    } else {
                        i14 = -1;
                    }
                    i15 = this.f5657r;
                    if (i15 != i14) {
                        f2 = -1.0f;
                    } else {
                        f2 = -1.0f;
                    }
                    if (i6 == i14) {
                        if (i8 != i14) {
                            i6 = i14;
                        } else if (i4 == i14) {
                            i6 = this.f5610A;
                            i8 = this.f5611B;
                            i4 = this.f5612C;
                        } else {
                            i6 = this.f5610A;
                            i8 = this.f5611B;
                            i4 = this.f5612C;
                        }
                    }
                    if (i7 == i14) {
                        i7 = 8;
                    }
                    if (i3 == i14) {
                        i19 = this.f5656q;
                        if (i19 == i14) {
                            i16 = 8;
                        } else {
                            i16 = i19;
                        }
                    } else {
                        i16 = i3;
                    }
                    if (this.f5615F != -1.0f) {
                        i17 = 0;
                        bArr = null;
                    } else {
                        i17 = 0;
                        bArr = null;
                    }
                    zzh zzhVar13 = new zzh();
                    zzhVar13.f18414a = i6;
                    zzhVar13.f18415b = i4;
                    zzhVar13.f18416c = i8;
                    zzhVar13.f18417d = bArr;
                    zzhVar13.f18418e = i7;
                    zzhVar13.f18419f = i16;
                    zzi zziVarM7286a13 = zzhVar13.m7286a();
                    str6 = this.f5638b;
                    if (str6 != null) {
                        map = zzakm.f5671r0;
                        if (map.containsKey(str6)) {
                            iIntValue = ((Integer) map.get(this.f5638b)).intValue();
                        } else {
                            iIntValue = i14;
                        }
                    } else {
                        iIntValue = i14;
                    }
                    if (this.f5660u == 0) {
                        i18 = iIntValue;
                    } else {
                        i18 = iIntValue;
                    }
                    zztVar.f20809u = this.f5654o;
                    zztVar.f20810v = this.f5655p;
                    zztVar.f20775A = f2;
                    zztVar.f20814z = i18;
                    zztVar.f20776B = this.f5664y;
                    zztVar.f20777C = this.f5665z;
                    zztVar.f20778D = zziVarM7286a13;
                } else if (!"application/x-subrip".equals(str5)) {
                    throw zzat.m4383a(null, "Unexpected MIME type.");
                }
                str7 = this.f5638b;
                if (str7 != null) {
                    zztVar.f20790b = this.f5638b;
                }
                zztVar.m8851c(i2);
                if (true != this.f5636a) {
                    str8 = "video/x-matroska";
                } else {
                    str8 = "video/webm";
                }
                zztVar.m8852d(str8);
                zztVar.m8853e(str5);
                zztVar.f20803o = i5;
                zztVar.f20792d = this.f5637a0;
                zztVar.f20793e = i217;
                zztVar.f20805q = list112;
                zztVar.f20798j = obj2;
                zztVar.f20806r = this.f5653n;
                this.f5641c0 = new zzv(zztVar);
                return;
            case 13:
                List listSingletonList2 = Collections.singletonList(m4164b(str9));
                byte[] bArr8 = this.f5652m;
                zzaex zzaexVarM4054a = zzaey.m4054a(new zzet(bArr8, bArr8.length), false);
                this.f5629T = zzaexVarM4054a.f5136a;
                this.f5626Q = zzaexVarM4054a.f5137b;
                obj3 = zzaexVarM4054a.f5138c;
                str3 = "audio/mp4a-latm";
                list8 = listSingletonList2;
                str11 = str3;
                list6 = list8;
                iM6500b = -1;
                list7 = list6;
                i7 = -1;
                i3 = -1;
                i6 = -1;
                list3 = list7;
                i4 = -1;
                i8 = -1;
                i5 = -1;
                list4 = list3;
                if (this.f5625P != null) {
                    obj2 = obj3;
                    zzfwVarM6736a = zzfw.m6736a(new zzeu(this.f5625P));
                    if (zzfwVarM6736a != null) {
                        obj3 = zzfwVarM6736a.f16688a;
                        str11 = "video/dolby-vision";
                        obj2 = obj3;
                    }
                } else {
                    obj2 = obj3;
                }
                str5 = str11;
                boolean z14 = this.f5635Z;
                List list113 = list4;
                if (true != this.f5634Y) {
                    i13 = 0;
                } else {
                    i13 = 2;
                }
                int i218 = (z14 ? 1 : 0) | i13;
                zztVar = new zzt();
                if (zzas.m4349a(str5)) {
                    zztVar.f20780F = this.f5626Q;
                    zztVar.f20781G = this.f5628S;
                    zztVar.f20782H = this.f5629T;
                    zztVar.f20783I = iM6500b;
                } else if (zzas.m4350b(str5)) {
                    if (this.f5659t == 0) {
                        i21 = this.f5657r;
                        i14 = -1;
                        if (i21 == -1) {
                            i21 = this.f5654o;
                        }
                        this.f5657r = i21;
                        i22 = this.f5658s;
                        if (i22 == -1) {
                            i22 = this.f5655p;
                        }
                        this.f5658s = i22;
                    } else {
                        i14 = -1;
                    }
                    i15 = this.f5657r;
                    if (i15 != i14) {
                        f2 = -1.0f;
                    } else {
                        f2 = -1.0f;
                    }
                    if (i6 == i14) {
                        if (i8 != i14) {
                            i6 = i14;
                        } else if (i4 == i14) {
                            i6 = this.f5610A;
                            i8 = this.f5611B;
                            i4 = this.f5612C;
                        } else {
                            i6 = this.f5610A;
                            i8 = this.f5611B;
                            i4 = this.f5612C;
                        }
                    }
                    if (i7 == i14) {
                        i7 = 8;
                    }
                    if (i3 == i14) {
                        i19 = this.f5656q;
                        if (i19 == i14) {
                            i16 = 8;
                        } else {
                            i16 = i19;
                        }
                    } else {
                        i16 = i3;
                    }
                    if (this.f5615F != -1.0f) {
                        i17 = 0;
                        bArr = null;
                    } else {
                        i17 = 0;
                        bArr = null;
                    }
                    zzh zzhVar14 = new zzh();
                    zzhVar14.f18414a = i6;
                    zzhVar14.f18415b = i4;
                    zzhVar14.f18416c = i8;
                    zzhVar14.f18417d = bArr;
                    zzhVar14.f18418e = i7;
                    zzhVar14.f18419f = i16;
                    zzi zziVarM7286a14 = zzhVar14.m7286a();
                    str6 = this.f5638b;
                    if (str6 != null) {
                        map = zzakm.f5671r0;
                        if (map.containsKey(str6)) {
                            iIntValue = ((Integer) map.get(this.f5638b)).intValue();
                        } else {
                            iIntValue = i14;
                        }
                    } else {
                        iIntValue = i14;
                    }
                    if (this.f5660u == 0) {
                        i18 = iIntValue;
                    } else {
                        i18 = iIntValue;
                    }
                    zztVar.f20809u = this.f5654o;
                    zztVar.f20810v = this.f5655p;
                    zztVar.f20775A = f2;
                    zztVar.f20814z = i18;
                    zztVar.f20776B = this.f5664y;
                    zztVar.f20777C = this.f5665z;
                    zztVar.f20778D = zziVarM7286a14;
                } else if (!"application/x-subrip".equals(str5)) {
                    throw zzat.m4383a(null, "Unexpected MIME type.");
                }
                str7 = this.f5638b;
                if (str7 != null) {
                    zztVar.f20790b = this.f5638b;
                }
                zztVar.m8851c(i2);
                if (true != this.f5636a) {
                    str8 = "video/x-matroska";
                } else {
                    str8 = "video/webm";
                }
                zztVar.m8852d(str8);
                zztVar.m8853e(str5);
                zztVar.f20803o = i5;
                zztVar.f20792d = this.f5637a0;
                zztVar.f20793e = i218;
                zztVar.f20805q = list113;
                zztVar.f20798j = obj2;
                zztVar.f20806r = this.f5653n;
                this.f5641c0 = new zzv(zztVar);
                return;
            case 14:
                str4 = "audio/mpeg-L2";
                obj3 = null;
                str11 = str4;
                i5 = 4096;
                iM6500b = -1;
                i7 = -1;
                i3 = -1;
                i6 = -1;
                i4 = -1;
                i8 = -1;
                list4 = arrayList;
                if (this.f5625P != null) {
                    obj2 = obj3;
                    zzfwVarM6736a = zzfw.m6736a(new zzeu(this.f5625P));
                    if (zzfwVarM6736a != null) {
                        obj3 = zzfwVarM6736a.f16688a;
                        str11 = "video/dolby-vision";
                        obj2 = obj3;
                    }
                } else {
                    obj2 = obj3;
                }
                str5 = str11;
                boolean z15 = this.f5635Z;
                List list114 = list4;
                if (true != this.f5634Y) {
                    i13 = 0;
                } else {
                    i13 = 2;
                }
                int i219 = (z15 ? 1 : 0) | i13;
                zztVar = new zzt();
                if (zzas.m4349a(str5)) {
                    zztVar.f20780F = this.f5626Q;
                    zztVar.f20781G = this.f5628S;
                    zztVar.f20782H = this.f5629T;
                    zztVar.f20783I = iM6500b;
                } else if (zzas.m4350b(str5)) {
                    if (this.f5659t == 0) {
                        i21 = this.f5657r;
                        i14 = -1;
                        if (i21 == -1) {
                            i21 = this.f5654o;
                        }
                        this.f5657r = i21;
                        i22 = this.f5658s;
                        if (i22 == -1) {
                            i22 = this.f5655p;
                        }
                        this.f5658s = i22;
                    } else {
                        i14 = -1;
                    }
                    i15 = this.f5657r;
                    if (i15 != i14) {
                        f2 = -1.0f;
                    } else {
                        f2 = -1.0f;
                    }
                    if (i6 == i14) {
                        if (i8 != i14) {
                            i6 = i14;
                        } else if (i4 == i14) {
                            i6 = this.f5610A;
                            i8 = this.f5611B;
                            i4 = this.f5612C;
                        } else {
                            i6 = this.f5610A;
                            i8 = this.f5611B;
                            i4 = this.f5612C;
                        }
                    }
                    if (i7 == i14) {
                        i7 = 8;
                    }
                    if (i3 == i14) {
                        i19 = this.f5656q;
                        if (i19 == i14) {
                            i16 = 8;
                        } else {
                            i16 = i19;
                        }
                    } else {
                        i16 = i3;
                    }
                    if (this.f5615F != -1.0f) {
                        i17 = 0;
                        bArr = null;
                    } else {
                        i17 = 0;
                        bArr = null;
                    }
                    zzh zzhVar15 = new zzh();
                    zzhVar15.f18414a = i6;
                    zzhVar15.f18415b = i4;
                    zzhVar15.f18416c = i8;
                    zzhVar15.f18417d = bArr;
                    zzhVar15.f18418e = i7;
                    zzhVar15.f18419f = i16;
                    zzi zziVarM7286a15 = zzhVar15.m7286a();
                    str6 = this.f5638b;
                    if (str6 != null) {
                        map = zzakm.f5671r0;
                        if (map.containsKey(str6)) {
                            iIntValue = ((Integer) map.get(this.f5638b)).intValue();
                        } else {
                            iIntValue = i14;
                        }
                    } else {
                        iIntValue = i14;
                    }
                    if (this.f5660u == 0) {
                        i18 = iIntValue;
                    } else {
                        i18 = iIntValue;
                    }
                    zztVar.f20809u = this.f5654o;
                    zztVar.f20810v = this.f5655p;
                    zztVar.f20775A = f2;
                    zztVar.f20814z = i18;
                    zztVar.f20776B = this.f5664y;
                    zztVar.f20777C = this.f5665z;
                    zztVar.f20778D = zziVarM7286a15;
                } else if (!"application/x-subrip".equals(str5)) {
                    throw zzat.m4383a(null, "Unexpected MIME type.");
                }
                str7 = this.f5638b;
                if (str7 != null) {
                    zztVar.f20790b = this.f5638b;
                }
                zztVar.m8851c(i2);
                if (true != this.f5636a) {
                    str8 = "video/x-matroska";
                } else {
                    str8 = "video/webm";
                }
                zztVar.m8852d(str8);
                zztVar.m8853e(str5);
                zztVar.f20803o = i5;
                zztVar.f20792d = this.f5637a0;
                zztVar.f20793e = i219;
                zztVar.f20805q = list114;
                zztVar.f20798j = obj2;
                zztVar.f20806r = this.f5653n;
                this.f5641c0 = new zzv(zztVar);
                return;
            case 15:
                str4 = "audio/mpeg";
                obj3 = null;
                str11 = str4;
                i5 = 4096;
                iM6500b = -1;
                i7 = -1;
                i3 = -1;
                i6 = -1;
                i4 = -1;
                i8 = -1;
                list4 = arrayList;
                if (this.f5625P != null) {
                    obj2 = obj3;
                    zzfwVarM6736a = zzfw.m6736a(new zzeu(this.f5625P));
                    if (zzfwVarM6736a != null) {
                        obj3 = zzfwVarM6736a.f16688a;
                        str11 = "video/dolby-vision";
                        obj2 = obj3;
                    }
                } else {
                    obj2 = obj3;
                }
                str5 = str11;
                boolean z16 = this.f5635Z;
                List list115 = list4;
                if (true != this.f5634Y) {
                    i13 = 0;
                } else {
                    i13 = 2;
                }
                int i2110 = (z16 ? 1 : 0) | i13;
                zztVar = new zzt();
                if (zzas.m4349a(str5)) {
                    zztVar.f20780F = this.f5626Q;
                    zztVar.f20781G = this.f5628S;
                    zztVar.f20782H = this.f5629T;
                    zztVar.f20783I = iM6500b;
                } else if (zzas.m4350b(str5)) {
                    if (this.f5659t == 0) {
                        i21 = this.f5657r;
                        i14 = -1;
                        if (i21 == -1) {
                            i21 = this.f5654o;
                        }
                        this.f5657r = i21;
                        i22 = this.f5658s;
                        if (i22 == -1) {
                            i22 = this.f5655p;
                        }
                        this.f5658s = i22;
                    } else {
                        i14 = -1;
                    }
                    i15 = this.f5657r;
                    if (i15 != i14) {
                        f2 = -1.0f;
                    } else {
                        f2 = -1.0f;
                    }
                    if (i6 == i14) {
                        if (i8 != i14) {
                            i6 = i14;
                        } else if (i4 == i14) {
                            i6 = this.f5610A;
                            i8 = this.f5611B;
                            i4 = this.f5612C;
                        } else {
                            i6 = this.f5610A;
                            i8 = this.f5611B;
                            i4 = this.f5612C;
                        }
                    }
                    if (i7 == i14) {
                        i7 = 8;
                    }
                    if (i3 == i14) {
                        i19 = this.f5656q;
                        if (i19 == i14) {
                            i16 = 8;
                        } else {
                            i16 = i19;
                        }
                    } else {
                        i16 = i3;
                    }
                    if (this.f5615F != -1.0f) {
                        i17 = 0;
                        bArr = null;
                    } else {
                        i17 = 0;
                        bArr = null;
                    }
                    zzh zzhVar16 = new zzh();
                    zzhVar16.f18414a = i6;
                    zzhVar16.f18415b = i4;
                    zzhVar16.f18416c = i8;
                    zzhVar16.f18417d = bArr;
                    zzhVar16.f18418e = i7;
                    zzhVar16.f18419f = i16;
                    zzi zziVarM7286a16 = zzhVar16.m7286a();
                    str6 = this.f5638b;
                    if (str6 != null) {
                        map = zzakm.f5671r0;
                        if (map.containsKey(str6)) {
                            iIntValue = ((Integer) map.get(this.f5638b)).intValue();
                        } else {
                            iIntValue = i14;
                        }
                    } else {
                        iIntValue = i14;
                    }
                    if (this.f5660u == 0) {
                        i18 = iIntValue;
                    } else {
                        i18 = iIntValue;
                    }
                    zztVar.f20809u = this.f5654o;
                    zztVar.f20810v = this.f5655p;
                    zztVar.f20775A = f2;
                    zztVar.f20814z = i18;
                    zztVar.f20776B = this.f5664y;
                    zztVar.f20777C = this.f5665z;
                    zztVar.f20778D = zziVarM7286a16;
                } else if (!"application/x-subrip".equals(str5)) {
                    throw zzat.m4383a(null, "Unexpected MIME type.");
                }
                str7 = this.f5638b;
                if (str7 != null) {
                    zztVar.f20790b = this.f5638b;
                }
                zztVar.m8851c(i2);
                if (true != this.f5636a) {
                    str8 = "video/x-matroska";
                } else {
                    str8 = "video/webm";
                }
                zztVar.m8852d(str8);
                zztVar.m8853e(str5);
                zztVar.f20803o = i5;
                zztVar.f20792d = this.f5637a0;
                zztVar.f20793e = i2110;
                zztVar.f20805q = list115;
                zztVar.f20798j = obj2;
                zztVar.f20806r = this.f5653n;
                this.f5641c0 = new zzv(zztVar);
                return;
            case 16:
                str3 = "audio/ac3";
                obj3 = null;
                str11 = str3;
                list6 = list8;
                iM6500b = -1;
                list7 = list6;
                i7 = -1;
                i3 = -1;
                i6 = -1;
                list3 = list7;
                i4 = -1;
                i8 = -1;
                i5 = -1;
                list4 = list3;
                if (this.f5625P != null) {
                    obj2 = obj3;
                    zzfwVarM6736a = zzfw.m6736a(new zzeu(this.f5625P));
                    if (zzfwVarM6736a != null) {
                        obj3 = zzfwVarM6736a.f16688a;
                        str11 = "video/dolby-vision";
                        obj2 = obj3;
                    }
                } else {
                    obj2 = obj3;
                }
                str5 = str11;
                boolean z17 = this.f5635Z;
                List list116 = list4;
                if (true != this.f5634Y) {
                    i13 = 0;
                } else {
                    i13 = 2;
                }
                int i2111 = (z17 ? 1 : 0) | i13;
                zztVar = new zzt();
                if (zzas.m4349a(str5)) {
                    zztVar.f20780F = this.f5626Q;
                    zztVar.f20781G = this.f5628S;
                    zztVar.f20782H = this.f5629T;
                    zztVar.f20783I = iM6500b;
                } else if (zzas.m4350b(str5)) {
                    if (this.f5659t == 0) {
                        i21 = this.f5657r;
                        i14 = -1;
                        if (i21 == -1) {
                            i21 = this.f5654o;
                        }
                        this.f5657r = i21;
                        i22 = this.f5658s;
                        if (i22 == -1) {
                            i22 = this.f5655p;
                        }
                        this.f5658s = i22;
                    } else {
                        i14 = -1;
                    }
                    i15 = this.f5657r;
                    if (i15 != i14) {
                        f2 = -1.0f;
                    } else {
                        f2 = -1.0f;
                    }
                    if (i6 == i14) {
                        if (i8 != i14) {
                            i6 = i14;
                        } else if (i4 == i14) {
                            i6 = this.f5610A;
                            i8 = this.f5611B;
                            i4 = this.f5612C;
                        } else {
                            i6 = this.f5610A;
                            i8 = this.f5611B;
                            i4 = this.f5612C;
                        }
                    }
                    if (i7 == i14) {
                        i7 = 8;
                    }
                    if (i3 == i14) {
                        i19 = this.f5656q;
                        if (i19 == i14) {
                            i16 = 8;
                        } else {
                            i16 = i19;
                        }
                    } else {
                        i16 = i3;
                    }
                    if (this.f5615F != -1.0f) {
                        i17 = 0;
                        bArr = null;
                    } else {
                        i17 = 0;
                        bArr = null;
                    }
                    zzh zzhVar17 = new zzh();
                    zzhVar17.f18414a = i6;
                    zzhVar17.f18415b = i4;
                    zzhVar17.f18416c = i8;
                    zzhVar17.f18417d = bArr;
                    zzhVar17.f18418e = i7;
                    zzhVar17.f18419f = i16;
                    zzi zziVarM7286a17 = zzhVar17.m7286a();
                    str6 = this.f5638b;
                    if (str6 != null) {
                        map = zzakm.f5671r0;
                        if (map.containsKey(str6)) {
                            iIntValue = ((Integer) map.get(this.f5638b)).intValue();
                        } else {
                            iIntValue = i14;
                        }
                    } else {
                        iIntValue = i14;
                    }
                    if (this.f5660u == 0) {
                        i18 = iIntValue;
                    } else {
                        i18 = iIntValue;
                    }
                    zztVar.f20809u = this.f5654o;
                    zztVar.f20810v = this.f5655p;
                    zztVar.f20775A = f2;
                    zztVar.f20814z = i18;
                    zztVar.f20776B = this.f5664y;
                    zztVar.f20777C = this.f5665z;
                    zztVar.f20778D = zziVarM7286a17;
                } else if (!"application/x-subrip".equals(str5)) {
                    throw zzat.m4383a(null, "Unexpected MIME type.");
                }
                str7 = this.f5638b;
                if (str7 != null) {
                    zztVar.f20790b = this.f5638b;
                }
                zztVar.m8851c(i2);
                if (true != this.f5636a) {
                    str8 = "video/x-matroska";
                } else {
                    str8 = "video/webm";
                }
                zztVar.m8852d(str8);
                zztVar.m8853e(str5);
                zztVar.f20803o = i5;
                zztVar.f20792d = this.f5637a0;
                zztVar.f20793e = i2111;
                zztVar.f20805q = list116;
                zztVar.f20798j = obj2;
                zztVar.f20806r = this.f5653n;
                this.f5641c0 = new zzv(zztVar);
                return;
            case 17:
                str3 = "audio/eac3";
                obj3 = null;
                str11 = str3;
                list6 = list8;
                iM6500b = -1;
                list7 = list6;
                i7 = -1;
                i3 = -1;
                i6 = -1;
                list3 = list7;
                i4 = -1;
                i8 = -1;
                i5 = -1;
                list4 = list3;
                if (this.f5625P != null) {
                    obj2 = obj3;
                    zzfwVarM6736a = zzfw.m6736a(new zzeu(this.f5625P));
                    if (zzfwVarM6736a != null) {
                        obj3 = zzfwVarM6736a.f16688a;
                        str11 = "video/dolby-vision";
                        obj2 = obj3;
                    }
                } else {
                    obj2 = obj3;
                }
                str5 = str11;
                boolean z18 = this.f5635Z;
                List list117 = list4;
                if (true != this.f5634Y) {
                    i13 = 0;
                } else {
                    i13 = 2;
                }
                int i2112 = (z18 ? 1 : 0) | i13;
                zztVar = new zzt();
                if (zzas.m4349a(str5)) {
                    zztVar.f20780F = this.f5626Q;
                    zztVar.f20781G = this.f5628S;
                    zztVar.f20782H = this.f5629T;
                    zztVar.f20783I = iM6500b;
                } else if (zzas.m4350b(str5)) {
                    if (this.f5659t == 0) {
                        i21 = this.f5657r;
                        i14 = -1;
                        if (i21 == -1) {
                            i21 = this.f5654o;
                        }
                        this.f5657r = i21;
                        i22 = this.f5658s;
                        if (i22 == -1) {
                            i22 = this.f5655p;
                        }
                        this.f5658s = i22;
                    } else {
                        i14 = -1;
                    }
                    i15 = this.f5657r;
                    if (i15 != i14) {
                        f2 = -1.0f;
                    } else {
                        f2 = -1.0f;
                    }
                    if (i6 == i14) {
                        if (i8 != i14) {
                            i6 = i14;
                        } else if (i4 == i14) {
                            i6 = this.f5610A;
                            i8 = this.f5611B;
                            i4 = this.f5612C;
                        } else {
                            i6 = this.f5610A;
                            i8 = this.f5611B;
                            i4 = this.f5612C;
                        }
                    }
                    if (i7 == i14) {
                        i7 = 8;
                    }
                    if (i3 == i14) {
                        i19 = this.f5656q;
                        if (i19 == i14) {
                            i16 = 8;
                        } else {
                            i16 = i19;
                        }
                    } else {
                        i16 = i3;
                    }
                    if (this.f5615F != -1.0f) {
                        i17 = 0;
                        bArr = null;
                    } else {
                        i17 = 0;
                        bArr = null;
                    }
                    zzh zzhVar18 = new zzh();
                    zzhVar18.f18414a = i6;
                    zzhVar18.f18415b = i4;
                    zzhVar18.f18416c = i8;
                    zzhVar18.f18417d = bArr;
                    zzhVar18.f18418e = i7;
                    zzhVar18.f18419f = i16;
                    zzi zziVarM7286a18 = zzhVar18.m7286a();
                    str6 = this.f5638b;
                    if (str6 != null) {
                        map = zzakm.f5671r0;
                        if (map.containsKey(str6)) {
                            iIntValue = ((Integer) map.get(this.f5638b)).intValue();
                        } else {
                            iIntValue = i14;
                        }
                    } else {
                        iIntValue = i14;
                    }
                    if (this.f5660u == 0) {
                        i18 = iIntValue;
                    } else {
                        i18 = iIntValue;
                    }
                    zztVar.f20809u = this.f5654o;
                    zztVar.f20810v = this.f5655p;
                    zztVar.f20775A = f2;
                    zztVar.f20814z = i18;
                    zztVar.f20776B = this.f5664y;
                    zztVar.f20777C = this.f5665z;
                    zztVar.f20778D = zziVarM7286a18;
                } else if (!"application/x-subrip".equals(str5)) {
                    throw zzat.m4383a(null, "Unexpected MIME type.");
                }
                str7 = this.f5638b;
                if (str7 != null) {
                    zztVar.f20790b = this.f5638b;
                }
                zztVar.m8851c(i2);
                if (true != this.f5636a) {
                    str8 = "video/x-matroska";
                } else {
                    str8 = "video/webm";
                }
                zztVar.m8852d(str8);
                zztVar.m8853e(str5);
                zztVar.f20803o = i5;
                zztVar.f20792d = this.f5637a0;
                zztVar.f20793e = i2112;
                zztVar.f20805q = list117;
                zztVar.f20798j = obj2;
                zztVar.f20806r = this.f5653n;
                this.f5641c0 = new zzv(zztVar);
                return;
            case 18:
                this.f5632W = new zzahn();
                str3 = "audio/true-hd";
                obj3 = null;
                str11 = str3;
                list6 = list8;
                iM6500b = -1;
                list7 = list6;
                i7 = -1;
                i3 = -1;
                i6 = -1;
                list3 = list7;
                i4 = -1;
                i8 = -1;
                i5 = -1;
                list4 = list3;
                if (this.f5625P != null) {
                    obj2 = obj3;
                    zzfwVarM6736a = zzfw.m6736a(new zzeu(this.f5625P));
                    if (zzfwVarM6736a != null) {
                        obj3 = zzfwVarM6736a.f16688a;
                        str11 = "video/dolby-vision";
                        obj2 = obj3;
                    }
                } else {
                    obj2 = obj3;
                }
                str5 = str11;
                boolean z19 = this.f5635Z;
                List list118 = list4;
                if (true != this.f5634Y) {
                    i13 = 0;
                } else {
                    i13 = 2;
                }
                int i2113 = (z19 ? 1 : 0) | i13;
                zztVar = new zzt();
                if (zzas.m4349a(str5)) {
                    zztVar.f20780F = this.f5626Q;
                    zztVar.f20781G = this.f5628S;
                    zztVar.f20782H = this.f5629T;
                    zztVar.f20783I = iM6500b;
                } else if (zzas.m4350b(str5)) {
                    if (this.f5659t == 0) {
                        i21 = this.f5657r;
                        i14 = -1;
                        if (i21 == -1) {
                            i21 = this.f5654o;
                        }
                        this.f5657r = i21;
                        i22 = this.f5658s;
                        if (i22 == -1) {
                            i22 = this.f5655p;
                        }
                        this.f5658s = i22;
                    } else {
                        i14 = -1;
                    }
                    i15 = this.f5657r;
                    if (i15 != i14) {
                        f2 = -1.0f;
                    } else {
                        f2 = -1.0f;
                    }
                    if (i6 == i14) {
                        if (i8 != i14) {
                            i6 = i14;
                        } else if (i4 == i14) {
                            i6 = this.f5610A;
                            i8 = this.f5611B;
                            i4 = this.f5612C;
                        } else {
                            i6 = this.f5610A;
                            i8 = this.f5611B;
                            i4 = this.f5612C;
                        }
                    }
                    if (i7 == i14) {
                        i7 = 8;
                    }
                    if (i3 == i14) {
                        i19 = this.f5656q;
                        if (i19 == i14) {
                            i16 = 8;
                        } else {
                            i16 = i19;
                        }
                    } else {
                        i16 = i3;
                    }
                    if (this.f5615F != -1.0f) {
                        i17 = 0;
                        bArr = null;
                    } else {
                        i17 = 0;
                        bArr = null;
                    }
                    zzh zzhVar19 = new zzh();
                    zzhVar19.f18414a = i6;
                    zzhVar19.f18415b = i4;
                    zzhVar19.f18416c = i8;
                    zzhVar19.f18417d = bArr;
                    zzhVar19.f18418e = i7;
                    zzhVar19.f18419f = i16;
                    zzi zziVarM7286a19 = zzhVar19.m7286a();
                    str6 = this.f5638b;
                    if (str6 != null) {
                        map = zzakm.f5671r0;
                        if (map.containsKey(str6)) {
                            iIntValue = ((Integer) map.get(this.f5638b)).intValue();
                        } else {
                            iIntValue = i14;
                        }
                    } else {
                        iIntValue = i14;
                    }
                    if (this.f5660u == 0) {
                        i18 = iIntValue;
                    } else {
                        i18 = iIntValue;
                    }
                    zztVar.f20809u = this.f5654o;
                    zztVar.f20810v = this.f5655p;
                    zztVar.f20775A = f2;
                    zztVar.f20814z = i18;
                    zztVar.f20776B = this.f5664y;
                    zztVar.f20777C = this.f5665z;
                    zztVar.f20778D = zziVarM7286a19;
                } else if (!"application/x-subrip".equals(str5)) {
                    throw zzat.m4383a(null, "Unexpected MIME type.");
                }
                str7 = this.f5638b;
                if (str7 != null) {
                    zztVar.f20790b = this.f5638b;
                }
                zztVar.m8851c(i2);
                if (true != this.f5636a) {
                    str8 = "video/x-matroska";
                } else {
                    str8 = "video/webm";
                }
                zztVar.m8852d(str8);
                zztVar.m8853e(str5);
                zztVar.f20803o = i5;
                zztVar.f20792d = this.f5637a0;
                zztVar.f20793e = i2113;
                zztVar.f20805q = list118;
                zztVar.f20798j = obj2;
                zztVar.f20806r = this.f5653n;
                this.f5641c0 = new zzv(zztVar);
                return;
            case 19:
            case 20:
                this.f5633X = true;
                str3 = "audio/vnd.dts";
                obj3 = null;
                str11 = str3;
                list6 = list8;
                iM6500b = -1;
                list7 = list6;
                i7 = -1;
                i3 = -1;
                i6 = -1;
                list3 = list7;
                i4 = -1;
                i8 = -1;
                i5 = -1;
                list4 = list3;
                if (this.f5625P != null) {
                    obj2 = obj3;
                    zzfwVarM6736a = zzfw.m6736a(new zzeu(this.f5625P));
                    if (zzfwVarM6736a != null) {
                        obj3 = zzfwVarM6736a.f16688a;
                        str11 = "video/dolby-vision";
                        obj2 = obj3;
                    }
                } else {
                    obj2 = obj3;
                }
                str5 = str11;
                boolean z110 = this.f5635Z;
                List list119 = list4;
                if (true != this.f5634Y) {
                    i13 = 0;
                } else {
                    i13 = 2;
                }
                int i2114 = (z110 ? 1 : 0) | i13;
                zztVar = new zzt();
                if (zzas.m4349a(str5)) {
                    zztVar.f20780F = this.f5626Q;
                    zztVar.f20781G = this.f5628S;
                    zztVar.f20782H = this.f5629T;
                    zztVar.f20783I = iM6500b;
                } else if (zzas.m4350b(str5)) {
                    if (this.f5659t == 0) {
                        i21 = this.f5657r;
                        i14 = -1;
                        if (i21 == -1) {
                            i21 = this.f5654o;
                        }
                        this.f5657r = i21;
                        i22 = this.f5658s;
                        if (i22 == -1) {
                            i22 = this.f5655p;
                        }
                        this.f5658s = i22;
                    } else {
                        i14 = -1;
                    }
                    i15 = this.f5657r;
                    if (i15 != i14) {
                        f2 = -1.0f;
                    } else {
                        f2 = -1.0f;
                    }
                    if (i6 == i14) {
                        if (i8 != i14) {
                            i6 = i14;
                        } else if (i4 == i14) {
                            i6 = this.f5610A;
                            i8 = this.f5611B;
                            i4 = this.f5612C;
                        } else {
                            i6 = this.f5610A;
                            i8 = this.f5611B;
                            i4 = this.f5612C;
                        }
                    }
                    if (i7 == i14) {
                        i7 = 8;
                    }
                    if (i3 == i14) {
                        i19 = this.f5656q;
                        if (i19 == i14) {
                            i16 = 8;
                        } else {
                            i16 = i19;
                        }
                    } else {
                        i16 = i3;
                    }
                    if (this.f5615F != -1.0f) {
                        i17 = 0;
                        bArr = null;
                    } else {
                        i17 = 0;
                        bArr = null;
                    }
                    zzh zzhVar110 = new zzh();
                    zzhVar110.f18414a = i6;
                    zzhVar110.f18415b = i4;
                    zzhVar110.f18416c = i8;
                    zzhVar110.f18417d = bArr;
                    zzhVar110.f18418e = i7;
                    zzhVar110.f18419f = i16;
                    zzi zziVarM7286a110 = zzhVar110.m7286a();
                    str6 = this.f5638b;
                    if (str6 != null) {
                        map = zzakm.f5671r0;
                        if (map.containsKey(str6)) {
                            iIntValue = ((Integer) map.get(this.f5638b)).intValue();
                        } else {
                            iIntValue = i14;
                        }
                    } else {
                        iIntValue = i14;
                    }
                    if (this.f5660u == 0) {
                        i18 = iIntValue;
                    } else {
                        i18 = iIntValue;
                    }
                    zztVar.f20809u = this.f5654o;
                    zztVar.f20810v = this.f5655p;
                    zztVar.f20775A = f2;
                    zztVar.f20814z = i18;
                    zztVar.f20776B = this.f5664y;
                    zztVar.f20777C = this.f5665z;
                    zztVar.f20778D = zziVarM7286a110;
                } else if (!"application/x-subrip".equals(str5)) {
                    throw zzat.m4383a(null, "Unexpected MIME type.");
                }
                str7 = this.f5638b;
                if (str7 != null) {
                    zztVar.f20790b = this.f5638b;
                }
                zztVar.m8851c(i2);
                if (true != this.f5636a) {
                    str8 = "video/x-matroska";
                } else {
                    str8 = "video/webm";
                }
                zztVar.m8852d(str8);
                zztVar.m8853e(str5);
                zztVar.f20803o = i5;
                zztVar.f20792d = this.f5637a0;
                zztVar.f20793e = i2114;
                zztVar.f20805q = list119;
                zztVar.f20798j = obj2;
                zztVar.f20806r = this.f5653n;
                this.f5641c0 = new zzv(zztVar);
                return;
            case 21:
                str3 = "audio/vnd.dts.hd";
                obj3 = null;
                str11 = str3;
                list6 = list8;
                iM6500b = -1;
                list7 = list6;
                i7 = -1;
                i3 = -1;
                i6 = -1;
                list3 = list7;
                i4 = -1;
                i8 = -1;
                i5 = -1;
                list4 = list3;
                if (this.f5625P != null) {
                    obj2 = obj3;
                    zzfwVarM6736a = zzfw.m6736a(new zzeu(this.f5625P));
                    if (zzfwVarM6736a != null) {
                        obj3 = zzfwVarM6736a.f16688a;
                        str11 = "video/dolby-vision";
                        obj2 = obj3;
                    }
                } else {
                    obj2 = obj3;
                }
                str5 = str11;
                boolean z111 = this.f5635Z;
                List list1110 = list4;
                if (true != this.f5634Y) {
                    i13 = 0;
                } else {
                    i13 = 2;
                }
                int i2115 = (z111 ? 1 : 0) | i13;
                zztVar = new zzt();
                if (zzas.m4349a(str5)) {
                    zztVar.f20780F = this.f5626Q;
                    zztVar.f20781G = this.f5628S;
                    zztVar.f20782H = this.f5629T;
                    zztVar.f20783I = iM6500b;
                } else if (zzas.m4350b(str5)) {
                    if (this.f5659t == 0) {
                        i21 = this.f5657r;
                        i14 = -1;
                        if (i21 == -1) {
                            i21 = this.f5654o;
                        }
                        this.f5657r = i21;
                        i22 = this.f5658s;
                        if (i22 == -1) {
                            i22 = this.f5655p;
                        }
                        this.f5658s = i22;
                    } else {
                        i14 = -1;
                    }
                    i15 = this.f5657r;
                    if (i15 != i14) {
                        f2 = -1.0f;
                    } else {
                        f2 = -1.0f;
                    }
                    if (i6 == i14) {
                        if (i8 != i14) {
                            i6 = i14;
                        } else if (i4 == i14) {
                            i6 = this.f5610A;
                            i8 = this.f5611B;
                            i4 = this.f5612C;
                        } else {
                            i6 = this.f5610A;
                            i8 = this.f5611B;
                            i4 = this.f5612C;
                        }
                    }
                    if (i7 == i14) {
                        i7 = 8;
                    }
                    if (i3 == i14) {
                        i19 = this.f5656q;
                        if (i19 == i14) {
                            i16 = 8;
                        } else {
                            i16 = i19;
                        }
                    } else {
                        i16 = i3;
                    }
                    if (this.f5615F != -1.0f) {
                        i17 = 0;
                        bArr = null;
                    } else {
                        i17 = 0;
                        bArr = null;
                    }
                    zzh zzhVar111 = new zzh();
                    zzhVar111.f18414a = i6;
                    zzhVar111.f18415b = i4;
                    zzhVar111.f18416c = i8;
                    zzhVar111.f18417d = bArr;
                    zzhVar111.f18418e = i7;
                    zzhVar111.f18419f = i16;
                    zzi zziVarM7286a111 = zzhVar111.m7286a();
                    str6 = this.f5638b;
                    if (str6 != null) {
                        map = zzakm.f5671r0;
                        if (map.containsKey(str6)) {
                            iIntValue = ((Integer) map.get(this.f5638b)).intValue();
                        } else {
                            iIntValue = i14;
                        }
                    } else {
                        iIntValue = i14;
                    }
                    if (this.f5660u == 0) {
                        i18 = iIntValue;
                    } else {
                        i18 = iIntValue;
                    }
                    zztVar.f20809u = this.f5654o;
                    zztVar.f20810v = this.f5655p;
                    zztVar.f20775A = f2;
                    zztVar.f20814z = i18;
                    zztVar.f20776B = this.f5664y;
                    zztVar.f20777C = this.f5665z;
                    zztVar.f20778D = zziVarM7286a111;
                } else if (!"application/x-subrip".equals(str5)) {
                    throw zzat.m4383a(null, "Unexpected MIME type.");
                }
                str7 = this.f5638b;
                if (str7 != null) {
                    zztVar.f20790b = this.f5638b;
                }
                zztVar.m8851c(i2);
                if (true != this.f5636a) {
                    str8 = "video/x-matroska";
                } else {
                    str8 = "video/webm";
                }
                zztVar.m8852d(str8);
                zztVar.m8853e(str5);
                zztVar.f20803o = i5;
                zztVar.f20792d = this.f5637a0;
                zztVar.f20793e = i2115;
                zztVar.f20805q = list1110;
                zztVar.f20798j = obj2;
                zztVar.f20806r = this.f5653n;
                this.f5641c0 = new zzv(zztVar);
                return;
            case 22:
                str11 = "audio/flac";
                listSingletonList = Collections.singletonList(m4164b(str9));
                i7 = -1;
                i3 = -1;
                i6 = -1;
                i4 = -1;
                i8 = -1;
                i5 = -1;
                list5 = listSingletonList;
                list2 = list5;
                iM6500b = -1;
                list4 = list2;
                if (this.f5625P != null) {
                    obj2 = obj3;
                    zzfwVarM6736a = zzfw.m6736a(new zzeu(this.f5625P));
                    if (zzfwVarM6736a != null) {
                        obj3 = zzfwVarM6736a.f16688a;
                        str11 = "video/dolby-vision";
                        obj2 = obj3;
                    }
                } else {
                    obj2 = obj3;
                }
                str5 = str11;
                boolean z112 = this.f5635Z;
                List list1111 = list4;
                if (true != this.f5634Y) {
                    i13 = 0;
                } else {
                    i13 = 2;
                }
                int i2116 = (z112 ? 1 : 0) | i13;
                zztVar = new zzt();
                if (zzas.m4349a(str5)) {
                    zztVar.f20780F = this.f5626Q;
                    zztVar.f20781G = this.f5628S;
                    zztVar.f20782H = this.f5629T;
                    zztVar.f20783I = iM6500b;
                } else if (zzas.m4350b(str5)) {
                    if (this.f5659t == 0) {
                        i21 = this.f5657r;
                        i14 = -1;
                        if (i21 == -1) {
                            i21 = this.f5654o;
                        }
                        this.f5657r = i21;
                        i22 = this.f5658s;
                        if (i22 == -1) {
                            i22 = this.f5655p;
                        }
                        this.f5658s = i22;
                    } else {
                        i14 = -1;
                    }
                    i15 = this.f5657r;
                    if (i15 != i14) {
                        f2 = -1.0f;
                    } else {
                        f2 = -1.0f;
                    }
                    if (i6 == i14) {
                        if (i8 != i14) {
                            i6 = i14;
                        } else if (i4 == i14) {
                            i6 = this.f5610A;
                            i8 = this.f5611B;
                            i4 = this.f5612C;
                        } else {
                            i6 = this.f5610A;
                            i8 = this.f5611B;
                            i4 = this.f5612C;
                        }
                    }
                    if (i7 == i14) {
                        i7 = 8;
                    }
                    if (i3 == i14) {
                        i19 = this.f5656q;
                        if (i19 == i14) {
                            i16 = 8;
                        } else {
                            i16 = i19;
                        }
                    } else {
                        i16 = i3;
                    }
                    if (this.f5615F != -1.0f) {
                        i17 = 0;
                        bArr = null;
                    } else {
                        i17 = 0;
                        bArr = null;
                    }
                    zzh zzhVar112 = new zzh();
                    zzhVar112.f18414a = i6;
                    zzhVar112.f18415b = i4;
                    zzhVar112.f18416c = i8;
                    zzhVar112.f18417d = bArr;
                    zzhVar112.f18418e = i7;
                    zzhVar112.f18419f = i16;
                    zzi zziVarM7286a112 = zzhVar112.m7286a();
                    str6 = this.f5638b;
                    if (str6 != null) {
                        map = zzakm.f5671r0;
                        if (map.containsKey(str6)) {
                            iIntValue = ((Integer) map.get(this.f5638b)).intValue();
                        } else {
                            iIntValue = i14;
                        }
                    } else {
                        iIntValue = i14;
                    }
                    if (this.f5660u == 0) {
                        i18 = iIntValue;
                    } else {
                        i18 = iIntValue;
                    }
                    zztVar.f20809u = this.f5654o;
                    zztVar.f20810v = this.f5655p;
                    zztVar.f20775A = f2;
                    zztVar.f20814z = i18;
                    zztVar.f20776B = this.f5664y;
                    zztVar.f20777C = this.f5665z;
                    zztVar.f20778D = zziVarM7286a112;
                } else if (!"application/x-subrip".equals(str5)) {
                    throw zzat.m4383a(null, "Unexpected MIME type.");
                }
                str7 = this.f5638b;
                if (str7 != null) {
                    zztVar.f20790b = this.f5638b;
                }
                zztVar.m8851c(i2);
                if (true != this.f5636a) {
                    str8 = "video/x-matroska";
                } else {
                    str8 = "video/webm";
                }
                zztVar.m8852d(str8);
                zztVar.m8853e(str5);
                zztVar.f20803o = i5;
                zztVar.f20792d = this.f5637a0;
                zztVar.f20793e = i2116;
                zztVar.f20805q = list1111;
                zztVar.f20798j = obj2;
                zztVar.f20806r = this.f5653n;
                this.f5641c0 = new zzv(zztVar);
                return;
            case 23:
                zzeu zzeuVar2 = new zzeu(m4164b(this.f5640c));
                try {
                    int iM6371M = zzeuVar2.m6371M();
                    if (iM6371M != 1) {
                        if (iM6371M == 65534) {
                            zzeuVar2.m6363E(20);
                            int iM6383i = zzeuVar2.m6383i();
                            if ((iM6383i >> 18) == 0 && (iM6383i == 0 || Integer.bitCount(iM6383i) == this.f5626Q)) {
                                this.f5628S = iM6383i == 0 ? -1 : iM6383i << 2;
                            }
                            long jM6378d = zzeuVar2.m6378d();
                            UUID uuid = zzakm.f5670q0;
                            if (jM6378d != uuid.getMostSignificantBits() || zzeuVar2.m6378d() != uuid.getLeastSignificantBits()) {
                            }
                            obj3 = null;
                            iM6500b = -1;
                            list7 = list6;
                            i7 = -1;
                            i3 = -1;
                            i6 = -1;
                            list3 = list7;
                            i4 = -1;
                            i8 = -1;
                            i5 = -1;
                            list4 = list3;
                            if (this.f5625P != null) {
                                obj2 = obj3;
                                zzfwVarM6736a = zzfw.m6736a(new zzeu(this.f5625P));
                                if (zzfwVarM6736a != null) {
                                    obj3 = zzfwVarM6736a.f16688a;
                                    str11 = "video/dolby-vision";
                                    obj2 = obj3;
                                }
                            } else {
                                obj2 = obj3;
                            }
                            str5 = str11;
                            boolean z113 = this.f5635Z;
                            List list1112 = list4;
                            if (true != this.f5634Y) {
                                i13 = 0;
                            } else {
                                i13 = 2;
                            }
                            int i2117 = (z113 ? 1 : 0) | i13;
                            zztVar = new zzt();
                            if (zzas.m4349a(str5)) {
                                zztVar.f20780F = this.f5626Q;
                                zztVar.f20781G = this.f5628S;
                                zztVar.f20782H = this.f5629T;
                                zztVar.f20783I = iM6500b;
                            } else if (zzas.m4350b(str5)) {
                                if (this.f5659t == 0) {
                                    i21 = this.f5657r;
                                    i14 = -1;
                                    if (i21 == -1) {
                                        i21 = this.f5654o;
                                    }
                                    this.f5657r = i21;
                                    i22 = this.f5658s;
                                    if (i22 == -1) {
                                        i22 = this.f5655p;
                                    }
                                    this.f5658s = i22;
                                } else {
                                    i14 = -1;
                                }
                                i15 = this.f5657r;
                                if (i15 != i14) {
                                    f2 = -1.0f;
                                } else {
                                    f2 = -1.0f;
                                }
                                if (i6 == i14) {
                                    if (i8 != i14) {
                                        i6 = i14;
                                    } else if (i4 == i14) {
                                        i6 = this.f5610A;
                                        i8 = this.f5611B;
                                        i4 = this.f5612C;
                                    } else {
                                        i6 = this.f5610A;
                                        i8 = this.f5611B;
                                        i4 = this.f5612C;
                                    }
                                }
                                if (i7 == i14) {
                                    i7 = 8;
                                }
                                if (i3 == i14) {
                                    i19 = this.f5656q;
                                    if (i19 == i14) {
                                        i16 = 8;
                                    } else {
                                        i16 = i19;
                                    }
                                } else {
                                    i16 = i3;
                                }
                                if (this.f5615F != -1.0f) {
                                    i17 = 0;
                                    bArr = null;
                                } else {
                                    i17 = 0;
                                    bArr = null;
                                }
                                zzh zzhVar113 = new zzh();
                                zzhVar113.f18414a = i6;
                                zzhVar113.f18415b = i4;
                                zzhVar113.f18416c = i8;
                                zzhVar113.f18417d = bArr;
                                zzhVar113.f18418e = i7;
                                zzhVar113.f18419f = i16;
                                zzi zziVarM7286a113 = zzhVar113.m7286a();
                                str6 = this.f5638b;
                                if (str6 != null) {
                                    map = zzakm.f5671r0;
                                    if (map.containsKey(str6)) {
                                        iIntValue = ((Integer) map.get(this.f5638b)).intValue();
                                    } else {
                                        iIntValue = i14;
                                    }
                                } else {
                                    iIntValue = i14;
                                }
                                if (this.f5660u == 0) {
                                    i18 = iIntValue;
                                } else {
                                    i18 = iIntValue;
                                }
                                zztVar.f20809u = this.f5654o;
                                zztVar.f20810v = this.f5655p;
                                zztVar.f20775A = f2;
                                zztVar.f20814z = i18;
                                zztVar.f20776B = this.f5664y;
                                zztVar.f20777C = this.f5665z;
                                zztVar.f20778D = zziVarM7286a113;
                            } else if (!"application/x-subrip".equals(str5)) {
                                throw zzat.m4383a(null, "Unexpected MIME type.");
                            }
                            str7 = this.f5638b;
                            if (str7 != null) {
                                zztVar.f20790b = this.f5638b;
                            }
                            zztVar.m8851c(i2);
                            if (true != this.f5636a) {
                                str8 = "video/x-matroska";
                            } else {
                                str8 = "video/webm";
                            }
                            zztVar.m8852d(str8);
                            zztVar.m8853e(str5);
                            zztVar.f20803o = i5;
                            zztVar.f20792d = this.f5637a0;
                            zztVar.f20793e = i2117;
                            zztVar.f20805q = list1112;
                            zztVar.f20798j = obj2;
                            zztVar.f20806r = this.f5653n;
                            this.f5641c0 = new zzv(zztVar);
                            return;
                        }
                        zzeh.m6211c("MatroskaExtractor", "Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown");
                        obj3 = null;
                        iM6500b = -1;
                        list7 = list6;
                        i7 = -1;
                        i3 = -1;
                        i6 = -1;
                        list3 = list7;
                        i4 = -1;
                        i8 = -1;
                        i5 = -1;
                        list4 = list3;
                        if (this.f5625P != null) {
                            obj2 = obj3;
                            zzfwVarM6736a = zzfw.m6736a(new zzeu(this.f5625P));
                            if (zzfwVarM6736a != null) {
                                obj3 = zzfwVarM6736a.f16688a;
                                str11 = "video/dolby-vision";
                                obj2 = obj3;
                            }
                        } else {
                            obj2 = obj3;
                        }
                        str5 = str11;
                        boolean z114 = this.f5635Z;
                        List list1113 = list4;
                        if (true != this.f5634Y) {
                            i13 = 0;
                        } else {
                            i13 = 2;
                        }
                        int i2118 = (z114 ? 1 : 0) | i13;
                        zztVar = new zzt();
                        if (zzas.m4349a(str5)) {
                            zztVar.f20780F = this.f5626Q;
                            zztVar.f20781G = this.f5628S;
                            zztVar.f20782H = this.f5629T;
                            zztVar.f20783I = iM6500b;
                        } else if (zzas.m4350b(str5)) {
                            if (this.f5659t == 0) {
                                i21 = this.f5657r;
                                i14 = -1;
                                if (i21 == -1) {
                                    i21 = this.f5654o;
                                }
                                this.f5657r = i21;
                                i22 = this.f5658s;
                                if (i22 == -1) {
                                    i22 = this.f5655p;
                                }
                                this.f5658s = i22;
                            } else {
                                i14 = -1;
                            }
                            i15 = this.f5657r;
                            if (i15 != i14) {
                                f2 = -1.0f;
                            } else {
                                f2 = -1.0f;
                            }
                            if (i6 == i14) {
                                if (i8 != i14) {
                                    i6 = i14;
                                } else if (i4 == i14) {
                                    i6 = this.f5610A;
                                    i8 = this.f5611B;
                                    i4 = this.f5612C;
                                } else {
                                    i6 = this.f5610A;
                                    i8 = this.f5611B;
                                    i4 = this.f5612C;
                                }
                            }
                            if (i7 == i14) {
                                i7 = 8;
                            }
                            if (i3 == i14) {
                                i19 = this.f5656q;
                                if (i19 == i14) {
                                    i16 = 8;
                                } else {
                                    i16 = i19;
                                }
                            } else {
                                i16 = i3;
                            }
                            if (this.f5615F != -1.0f) {
                                i17 = 0;
                                bArr = null;
                            } else {
                                i17 = 0;
                                bArr = null;
                            }
                            zzh zzhVar114 = new zzh();
                            zzhVar114.f18414a = i6;
                            zzhVar114.f18415b = i4;
                            zzhVar114.f18416c = i8;
                            zzhVar114.f18417d = bArr;
                            zzhVar114.f18418e = i7;
                            zzhVar114.f18419f = i16;
                            zzi zziVarM7286a114 = zzhVar114.m7286a();
                            str6 = this.f5638b;
                            if (str6 != null) {
                                map = zzakm.f5671r0;
                                if (map.containsKey(str6)) {
                                    iIntValue = ((Integer) map.get(this.f5638b)).intValue();
                                } else {
                                    iIntValue = i14;
                                }
                            } else {
                                iIntValue = i14;
                            }
                            if (this.f5660u == 0) {
                                i18 = iIntValue;
                            } else {
                                i18 = iIntValue;
                            }
                            zztVar.f20809u = this.f5654o;
                            zztVar.f20810v = this.f5655p;
                            zztVar.f20775A = f2;
                            zztVar.f20814z = i18;
                            zztVar.f20776B = this.f5664y;
                            zztVar.f20777C = this.f5665z;
                            zztVar.f20778D = zziVarM7286a114;
                        } else if (!"application/x-subrip".equals(str5)) {
                            throw zzat.m4383a(null, "Unexpected MIME type.");
                        }
                        str7 = this.f5638b;
                        if (str7 != null) {
                            zztVar.f20790b = this.f5638b;
                        }
                        zztVar.m8851c(i2);
                        if (true != this.f5636a) {
                            str8 = "video/x-matroska";
                        } else {
                            str8 = "video/webm";
                        }
                        zztVar.m8852d(str8);
                        zztVar.m8853e(str5);
                        zztVar.f20803o = i5;
                        zztVar.f20792d = this.f5637a0;
                        zztVar.f20793e = i2118;
                        zztVar.f20805q = list1113;
                        zztVar.f20798j = obj2;
                        zztVar.f20806r = this.f5653n;
                        this.f5641c0 = new zzv(zztVar);
                        return;
                    }
                    iM6500b = zzfm.m6500b(this.f5627R, ByteOrder.LITTLE_ENDIAN);
                    if (iM6500b == 0) {
                        int i43 = this.f5627R;
                        StringBuilder sb = new StringBuilder(String.valueOf(i43).length() + 64);
                        sb.append("Unsupported PCM bit depth: ");
                        sb.append(i43);
                        sb.append(". Setting mimeType to audio/x-unknown");
                        zzeh.m6211c("MatroskaExtractor", sb.toString());
                        obj3 = null;
                        iM6500b = -1;
                        list7 = list6;
                    } else {
                        obj3 = null;
                        str11 = "audio/raw";
                    }
                    i7 = -1;
                    i3 = -1;
                    i6 = -1;
                    list3 = list7;
                    i4 = -1;
                    i8 = -1;
                    i5 = -1;
                    list4 = list3;
                    if (this.f5625P != null) {
                        obj2 = obj3;
                        zzfwVarM6736a = zzfw.m6736a(new zzeu(this.f5625P));
                        if (zzfwVarM6736a != null) {
                            obj3 = zzfwVarM6736a.f16688a;
                            str11 = "video/dolby-vision";
                            obj2 = obj3;
                        }
                    } else {
                        obj2 = obj3;
                    }
                    str5 = str11;
                    boolean z115 = this.f5635Z;
                    List list1114 = list4;
                    if (true != this.f5634Y) {
                        i13 = 0;
                    } else {
                        i13 = 2;
                    }
                    int i2119 = (z115 ? 1 : 0) | i13;
                    zztVar = new zzt();
                    if (zzas.m4349a(str5)) {
                        zztVar.f20780F = this.f5626Q;
                        zztVar.f20781G = this.f5628S;
                        zztVar.f20782H = this.f5629T;
                        zztVar.f20783I = iM6500b;
                    } else if (zzas.m4350b(str5)) {
                        if (this.f5659t == 0) {
                            i21 = this.f5657r;
                            i14 = -1;
                            if (i21 == -1) {
                                i21 = this.f5654o;
                            }
                            this.f5657r = i21;
                            i22 = this.f5658s;
                            if (i22 == -1) {
                                i22 = this.f5655p;
                            }
                            this.f5658s = i22;
                        } else {
                            i14 = -1;
                        }
                        i15 = this.f5657r;
                        if (i15 != i14) {
                            f2 = -1.0f;
                        } else {
                            f2 = -1.0f;
                        }
                        if (i6 == i14) {
                            if (i8 != i14) {
                                i6 = i14;
                            } else if (i4 == i14) {
                                i6 = this.f5610A;
                                i8 = this.f5611B;
                                i4 = this.f5612C;
                            } else {
                                i6 = this.f5610A;
                                i8 = this.f5611B;
                                i4 = this.f5612C;
                            }
                        }
                        if (i7 == i14) {
                            i7 = 8;
                        }
                        if (i3 == i14) {
                            i19 = this.f5656q;
                            if (i19 == i14) {
                                i16 = 8;
                            } else {
                                i16 = i19;
                            }
                        } else {
                            i16 = i3;
                        }
                        if (this.f5615F != -1.0f) {
                            i17 = 0;
                            bArr = null;
                        } else {
                            i17 = 0;
                            bArr = null;
                        }
                        zzh zzhVar115 = new zzh();
                        zzhVar115.f18414a = i6;
                        zzhVar115.f18415b = i4;
                        zzhVar115.f18416c = i8;
                        zzhVar115.f18417d = bArr;
                        zzhVar115.f18418e = i7;
                        zzhVar115.f18419f = i16;
                        zzi zziVarM7286a115 = zzhVar115.m7286a();
                        str6 = this.f5638b;
                        if (str6 != null) {
                            map = zzakm.f5671r0;
                            if (map.containsKey(str6)) {
                                iIntValue = ((Integer) map.get(this.f5638b)).intValue();
                            } else {
                                iIntValue = i14;
                            }
                        } else {
                            iIntValue = i14;
                        }
                        if (this.f5660u == 0) {
                            i18 = iIntValue;
                        } else {
                            i18 = iIntValue;
                        }
                        zztVar.f20809u = this.f5654o;
                        zztVar.f20810v = this.f5655p;
                        zztVar.f20775A = f2;
                        zztVar.f20814z = i18;
                        zztVar.f20776B = this.f5664y;
                        zztVar.f20777C = this.f5665z;
                        zztVar.f20778D = zziVarM7286a115;
                    } else if (!"application/x-subrip".equals(str5)) {
                        throw zzat.m4383a(null, "Unexpected MIME type.");
                    }
                    str7 = this.f5638b;
                    if (str7 != null) {
                        zztVar.f20790b = this.f5638b;
                    }
                    zztVar.m8851c(i2);
                    if (true != this.f5636a) {
                        str8 = "video/x-matroska";
                    } else {
                        str8 = "video/webm";
                    }
                    zztVar.m8852d(str8);
                    zztVar.m8853e(str5);
                    zztVar.f20803o = i5;
                    zztVar.f20792d = this.f5637a0;
                    zztVar.f20793e = i2119;
                    zztVar.f20805q = list1114;
                    zztVar.f20798j = obj2;
                    zztVar.f20806r = this.f5653n;
                    this.f5641c0 = new zzv(zztVar);
                    return;
                } catch (ArrayIndexOutOfBoundsException unused6) {
                    throw zzat.m4383a(null, "Error parsing MS/ACM codec private");
                }
            case 24:
                iM6500b = zzfm.m6500b(this.f5627R, ByteOrder.LITTLE_ENDIAN);
                if (iM6500b == 0) {
                    int i44 = this.f5627R;
                    StringBuilder sb2 = new StringBuilder(String.valueOf(i44).length() + 78);
                    sb2.append("Unsupported little endian PCM bit depth: ");
                    sb2.append(i44);
                    sb2.append(". Setting mimeType to audio/x-unknown");
                    zzeh.m6211c("MatroskaExtractor", sb2.toString());
                    obj3 = null;
                    iM6500b = -1;
                    list7 = list6;
                } else {
                    obj3 = null;
                    str11 = "audio/raw";
                }
                i7 = -1;
                i3 = -1;
                i6 = -1;
                list3 = list7;
                i4 = -1;
                i8 = -1;
                i5 = -1;
                list4 = list3;
                if (this.f5625P != null) {
                    obj2 = obj3;
                    zzfwVarM6736a = zzfw.m6736a(new zzeu(this.f5625P));
                    if (zzfwVarM6736a != null) {
                        obj3 = zzfwVarM6736a.f16688a;
                        str11 = "video/dolby-vision";
                        obj2 = obj3;
                    }
                } else {
                    obj2 = obj3;
                }
                str5 = str11;
                boolean z116 = this.f5635Z;
                List list1115 = list4;
                if (true != this.f5634Y) {
                    i13 = 0;
                } else {
                    i13 = 2;
                }
                int i21110 = (z116 ? 1 : 0) | i13;
                zztVar = new zzt();
                if (zzas.m4349a(str5)) {
                    zztVar.f20780F = this.f5626Q;
                    zztVar.f20781G = this.f5628S;
                    zztVar.f20782H = this.f5629T;
                    zztVar.f20783I = iM6500b;
                } else if (zzas.m4350b(str5)) {
                    if (this.f5659t == 0) {
                        i21 = this.f5657r;
                        i14 = -1;
                        if (i21 == -1) {
                            i21 = this.f5654o;
                        }
                        this.f5657r = i21;
                        i22 = this.f5658s;
                        if (i22 == -1) {
                            i22 = this.f5655p;
                        }
                        this.f5658s = i22;
                    } else {
                        i14 = -1;
                    }
                    i15 = this.f5657r;
                    if (i15 != i14) {
                        f2 = -1.0f;
                    } else {
                        f2 = -1.0f;
                    }
                    if (i6 == i14) {
                        if (i8 != i14) {
                            i6 = i14;
                        } else if (i4 == i14) {
                            i6 = this.f5610A;
                            i8 = this.f5611B;
                            i4 = this.f5612C;
                        } else {
                            i6 = this.f5610A;
                            i8 = this.f5611B;
                            i4 = this.f5612C;
                        }
                    }
                    if (i7 == i14) {
                        i7 = 8;
                    }
                    if (i3 == i14) {
                        i19 = this.f5656q;
                        if (i19 == i14) {
                            i16 = 8;
                        } else {
                            i16 = i19;
                        }
                    } else {
                        i16 = i3;
                    }
                    if (this.f5615F != -1.0f) {
                        i17 = 0;
                        bArr = null;
                    } else {
                        i17 = 0;
                        bArr = null;
                    }
                    zzh zzhVar116 = new zzh();
                    zzhVar116.f18414a = i6;
                    zzhVar116.f18415b = i4;
                    zzhVar116.f18416c = i8;
                    zzhVar116.f18417d = bArr;
                    zzhVar116.f18418e = i7;
                    zzhVar116.f18419f = i16;
                    zzi zziVarM7286a116 = zzhVar116.m7286a();
                    str6 = this.f5638b;
                    if (str6 != null) {
                        map = zzakm.f5671r0;
                        if (map.containsKey(str6)) {
                            iIntValue = ((Integer) map.get(this.f5638b)).intValue();
                        } else {
                            iIntValue = i14;
                        }
                    } else {
                        iIntValue = i14;
                    }
                    if (this.f5660u == 0) {
                        i18 = iIntValue;
                    } else {
                        i18 = iIntValue;
                    }
                    zztVar.f20809u = this.f5654o;
                    zztVar.f20810v = this.f5655p;
                    zztVar.f20775A = f2;
                    zztVar.f20814z = i18;
                    zztVar.f20776B = this.f5664y;
                    zztVar.f20777C = this.f5665z;
                    zztVar.f20778D = zziVarM7286a116;
                } else if (!"application/x-subrip".equals(str5)) {
                    throw zzat.m4383a(null, "Unexpected MIME type.");
                }
                str7 = this.f5638b;
                if (str7 != null) {
                    zztVar.f20790b = this.f5638b;
                }
                zztVar.m8851c(i2);
                if (true != this.f5636a) {
                    str8 = "video/x-matroska";
                } else {
                    str8 = "video/webm";
                }
                zztVar.m8852d(str8);
                zztVar.m8853e(str5);
                zztVar.f20803o = i5;
                zztVar.f20792d = this.f5637a0;
                zztVar.f20793e = i21110;
                zztVar.f20805q = list1115;
                zztVar.f20798j = obj2;
                zztVar.f20806r = this.f5653n;
                this.f5641c0 = new zzv(zztVar);
                return;
            case 25:
                iM6500b = zzfm.m6500b(this.f5627R, ByteOrder.BIG_ENDIAN);
                if (iM6500b == 0) {
                    int i45 = this.f5627R;
                    StringBuilder sb3 = new StringBuilder(String.valueOf(i45).length() + 75);
                    sb3.append("Unsupported big endian PCM bit depth: ");
                    sb3.append(i45);
                    sb3.append(". Setting mimeType to audio/x-unknown");
                    zzeh.m6211c("MatroskaExtractor", sb3.toString());
                    obj3 = null;
                    iM6500b = -1;
                    list7 = list6;
                } else {
                    obj3 = null;
                    str11 = "audio/raw";
                }
                i7 = -1;
                i3 = -1;
                i6 = -1;
                list3 = list7;
                i4 = -1;
                i8 = -1;
                i5 = -1;
                list4 = list3;
                if (this.f5625P != null) {
                    obj2 = obj3;
                    zzfwVarM6736a = zzfw.m6736a(new zzeu(this.f5625P));
                    if (zzfwVarM6736a != null) {
                        obj3 = zzfwVarM6736a.f16688a;
                        str11 = "video/dolby-vision";
                        obj2 = obj3;
                    }
                } else {
                    obj2 = obj3;
                }
                str5 = str11;
                boolean z117 = this.f5635Z;
                List list1116 = list4;
                if (true != this.f5634Y) {
                    i13 = 0;
                } else {
                    i13 = 2;
                }
                int i21111 = (z117 ? 1 : 0) | i13;
                zztVar = new zzt();
                if (zzas.m4349a(str5)) {
                    zztVar.f20780F = this.f5626Q;
                    zztVar.f20781G = this.f5628S;
                    zztVar.f20782H = this.f5629T;
                    zztVar.f20783I = iM6500b;
                } else if (zzas.m4350b(str5)) {
                    if (this.f5659t == 0) {
                        i21 = this.f5657r;
                        i14 = -1;
                        if (i21 == -1) {
                            i21 = this.f5654o;
                        }
                        this.f5657r = i21;
                        i22 = this.f5658s;
                        if (i22 == -1) {
                            i22 = this.f5655p;
                        }
                        this.f5658s = i22;
                    } else {
                        i14 = -1;
                    }
                    i15 = this.f5657r;
                    if (i15 != i14) {
                        f2 = -1.0f;
                    } else {
                        f2 = -1.0f;
                    }
                    if (i6 == i14) {
                        if (i8 != i14) {
                            i6 = i14;
                        } else if (i4 == i14) {
                            i6 = this.f5610A;
                            i8 = this.f5611B;
                            i4 = this.f5612C;
                        } else {
                            i6 = this.f5610A;
                            i8 = this.f5611B;
                            i4 = this.f5612C;
                        }
                    }
                    if (i7 == i14) {
                        i7 = 8;
                    }
                    if (i3 == i14) {
                        i19 = this.f5656q;
                        if (i19 == i14) {
                            i16 = 8;
                        } else {
                            i16 = i19;
                        }
                    } else {
                        i16 = i3;
                    }
                    if (this.f5615F != -1.0f) {
                        i17 = 0;
                        bArr = null;
                    } else {
                        i17 = 0;
                        bArr = null;
                    }
                    zzh zzhVar117 = new zzh();
                    zzhVar117.f18414a = i6;
                    zzhVar117.f18415b = i4;
                    zzhVar117.f18416c = i8;
                    zzhVar117.f18417d = bArr;
                    zzhVar117.f18418e = i7;
                    zzhVar117.f18419f = i16;
                    zzi zziVarM7286a117 = zzhVar117.m7286a();
                    str6 = this.f5638b;
                    if (str6 != null) {
                        map = zzakm.f5671r0;
                        if (map.containsKey(str6)) {
                            iIntValue = ((Integer) map.get(this.f5638b)).intValue();
                        } else {
                            iIntValue = i14;
                        }
                    } else {
                        iIntValue = i14;
                    }
                    if (this.f5660u == 0) {
                        i18 = iIntValue;
                    } else {
                        i18 = iIntValue;
                    }
                    zztVar.f20809u = this.f5654o;
                    zztVar.f20810v = this.f5655p;
                    zztVar.f20775A = f2;
                    zztVar.f20814z = i18;
                    zztVar.f20776B = this.f5664y;
                    zztVar.f20777C = this.f5665z;
                    zztVar.f20778D = zziVarM7286a117;
                } else if (!"application/x-subrip".equals(str5)) {
                    throw zzat.m4383a(null, "Unexpected MIME type.");
                }
                str7 = this.f5638b;
                if (str7 != null) {
                    zztVar.f20790b = this.f5638b;
                }
                zztVar.m8851c(i2);
                if (true != this.f5636a) {
                    str8 = "video/x-matroska";
                } else {
                    str8 = "video/webm";
                }
                zztVar.m8852d(str8);
                zztVar.m8853e(str5);
                zztVar.f20803o = i5;
                zztVar.f20792d = this.f5637a0;
                zztVar.f20793e = i21111;
                zztVar.f20805q = list1116;
                zztVar.f20798j = obj2;
                zztVar.f20806r = this.f5653n;
                this.f5641c0 = new zzv(zztVar);
                return;
            case 26:
                iM6500b = zzfm.m6501c(this.f5627R, ByteOrder.LITTLE_ENDIAN);
                if (iM6500b == 0) {
                    int i46 = this.f5627R;
                    StringBuilder sb4 = new StringBuilder(String.valueOf(i46).length() + 79);
                    sb4.append("Unsupported floating point PCM bit depth: ");
                    sb4.append(i46);
                    sb4.append(". Setting mimeType to audio/x-unknown");
                    zzeh.m6211c("MatroskaExtractor", sb4.toString());
                    obj3 = null;
                    iM6500b = -1;
                    list7 = list6;
                } else {
                    obj3 = null;
                    str11 = "audio/raw";
                }
                i7 = -1;
                i3 = -1;
                i6 = -1;
                list3 = list7;
                i4 = -1;
                i8 = -1;
                i5 = -1;
                list4 = list3;
                if (this.f5625P != null) {
                    obj2 = obj3;
                    zzfwVarM6736a = zzfw.m6736a(new zzeu(this.f5625P));
                    if (zzfwVarM6736a != null) {
                        obj3 = zzfwVarM6736a.f16688a;
                        str11 = "video/dolby-vision";
                        obj2 = obj3;
                    }
                } else {
                    obj2 = obj3;
                }
                str5 = str11;
                boolean z118 = this.f5635Z;
                List list1117 = list4;
                if (true != this.f5634Y) {
                    i13 = 0;
                } else {
                    i13 = 2;
                }
                int i21112 = (z118 ? 1 : 0) | i13;
                zztVar = new zzt();
                if (zzas.m4349a(str5)) {
                    zztVar.f20780F = this.f5626Q;
                    zztVar.f20781G = this.f5628S;
                    zztVar.f20782H = this.f5629T;
                    zztVar.f20783I = iM6500b;
                } else if (zzas.m4350b(str5)) {
                    if (this.f5659t == 0) {
                        i21 = this.f5657r;
                        i14 = -1;
                        if (i21 == -1) {
                            i21 = this.f5654o;
                        }
                        this.f5657r = i21;
                        i22 = this.f5658s;
                        if (i22 == -1) {
                            i22 = this.f5655p;
                        }
                        this.f5658s = i22;
                    } else {
                        i14 = -1;
                    }
                    i15 = this.f5657r;
                    if (i15 != i14) {
                        f2 = -1.0f;
                    } else {
                        f2 = -1.0f;
                    }
                    if (i6 == i14) {
                        if (i8 != i14) {
                            i6 = i14;
                        } else if (i4 == i14) {
                            i6 = this.f5610A;
                            i8 = this.f5611B;
                            i4 = this.f5612C;
                        } else {
                            i6 = this.f5610A;
                            i8 = this.f5611B;
                            i4 = this.f5612C;
                        }
                    }
                    if (i7 == i14) {
                        i7 = 8;
                    }
                    if (i3 == i14) {
                        i19 = this.f5656q;
                        if (i19 == i14) {
                            i16 = 8;
                        } else {
                            i16 = i19;
                        }
                    } else {
                        i16 = i3;
                    }
                    if (this.f5615F != -1.0f) {
                        i17 = 0;
                        bArr = null;
                    } else {
                        i17 = 0;
                        bArr = null;
                    }
                    zzh zzhVar118 = new zzh();
                    zzhVar118.f18414a = i6;
                    zzhVar118.f18415b = i4;
                    zzhVar118.f18416c = i8;
                    zzhVar118.f18417d = bArr;
                    zzhVar118.f18418e = i7;
                    zzhVar118.f18419f = i16;
                    zzi zziVarM7286a118 = zzhVar118.m7286a();
                    str6 = this.f5638b;
                    if (str6 != null) {
                        map = zzakm.f5671r0;
                        if (map.containsKey(str6)) {
                            iIntValue = ((Integer) map.get(this.f5638b)).intValue();
                        } else {
                            iIntValue = i14;
                        }
                    } else {
                        iIntValue = i14;
                    }
                    if (this.f5660u == 0) {
                        i18 = iIntValue;
                    } else {
                        i18 = iIntValue;
                    }
                    zztVar.f20809u = this.f5654o;
                    zztVar.f20810v = this.f5655p;
                    zztVar.f20775A = f2;
                    zztVar.f20814z = i18;
                    zztVar.f20776B = this.f5664y;
                    zztVar.f20777C = this.f5665z;
                    zztVar.f20778D = zziVarM7286a118;
                } else if (!"application/x-subrip".equals(str5)) {
                    throw zzat.m4383a(null, "Unexpected MIME type.");
                }
                str7 = this.f5638b;
                if (str7 != null) {
                    zztVar.f20790b = this.f5638b;
                }
                zztVar.m8851c(i2);
                if (true != this.f5636a) {
                    str8 = "video/x-matroska";
                } else {
                    str8 = "video/webm";
                }
                zztVar.m8852d(str8);
                zztVar.m8853e(str5);
                zztVar.f20803o = i5;
                zztVar.f20792d = this.f5637a0;
                zztVar.f20793e = i21112;
                zztVar.f20805q = list1117;
                zztVar.f20798j = obj2;
                zztVar.f20806r = this.f5653n;
                this.f5641c0 = new zzv(zztVar);
                return;
            case 27:
                obj3 = null;
                str11 = "application/x-subrip";
                iM6500b = -1;
                list7 = list6;
                i7 = -1;
                i3 = -1;
                i6 = -1;
                list3 = list7;
                i4 = -1;
                i8 = -1;
                i5 = -1;
                list4 = list3;
                if (this.f5625P != null) {
                    obj2 = obj3;
                    zzfwVarM6736a = zzfw.m6736a(new zzeu(this.f5625P));
                    if (zzfwVarM6736a != null) {
                        obj3 = zzfwVarM6736a.f16688a;
                        str11 = "video/dolby-vision";
                        obj2 = obj3;
                    }
                } else {
                    obj2 = obj3;
                }
                str5 = str11;
                boolean z119 = this.f5635Z;
                List list1118 = list4;
                if (true != this.f5634Y) {
                    i13 = 0;
                } else {
                    i13 = 2;
                }
                int i21113 = (z119 ? 1 : 0) | i13;
                zztVar = new zzt();
                if (zzas.m4349a(str5)) {
                    zztVar.f20780F = this.f5626Q;
                    zztVar.f20781G = this.f5628S;
                    zztVar.f20782H = this.f5629T;
                    zztVar.f20783I = iM6500b;
                } else if (zzas.m4350b(str5)) {
                    if (this.f5659t == 0) {
                        i21 = this.f5657r;
                        i14 = -1;
                        if (i21 == -1) {
                            i21 = this.f5654o;
                        }
                        this.f5657r = i21;
                        i22 = this.f5658s;
                        if (i22 == -1) {
                            i22 = this.f5655p;
                        }
                        this.f5658s = i22;
                    } else {
                        i14 = -1;
                    }
                    i15 = this.f5657r;
                    if (i15 != i14) {
                        f2 = -1.0f;
                    } else {
                        f2 = -1.0f;
                    }
                    if (i6 == i14) {
                        if (i8 != i14) {
                            i6 = i14;
                        } else if (i4 == i14) {
                            i6 = this.f5610A;
                            i8 = this.f5611B;
                            i4 = this.f5612C;
                        } else {
                            i6 = this.f5610A;
                            i8 = this.f5611B;
                            i4 = this.f5612C;
                        }
                    }
                    if (i7 == i14) {
                        i7 = 8;
                    }
                    if (i3 == i14) {
                        i19 = this.f5656q;
                        if (i19 == i14) {
                            i16 = 8;
                        } else {
                            i16 = i19;
                        }
                    } else {
                        i16 = i3;
                    }
                    if (this.f5615F != -1.0f) {
                        i17 = 0;
                        bArr = null;
                    } else {
                        i17 = 0;
                        bArr = null;
                    }
                    zzh zzhVar119 = new zzh();
                    zzhVar119.f18414a = i6;
                    zzhVar119.f18415b = i4;
                    zzhVar119.f18416c = i8;
                    zzhVar119.f18417d = bArr;
                    zzhVar119.f18418e = i7;
                    zzhVar119.f18419f = i16;
                    zzi zziVarM7286a119 = zzhVar119.m7286a();
                    str6 = this.f5638b;
                    if (str6 != null) {
                        map = zzakm.f5671r0;
                        if (map.containsKey(str6)) {
                            iIntValue = ((Integer) map.get(this.f5638b)).intValue();
                        } else {
                            iIntValue = i14;
                        }
                    } else {
                        iIntValue = i14;
                    }
                    if (this.f5660u == 0) {
                        i18 = iIntValue;
                    } else {
                        i18 = iIntValue;
                    }
                    zztVar.f20809u = this.f5654o;
                    zztVar.f20810v = this.f5655p;
                    zztVar.f20775A = f2;
                    zztVar.f20814z = i18;
                    zztVar.f20776B = this.f5664y;
                    zztVar.f20777C = this.f5665z;
                    zztVar.f20778D = zziVarM7286a119;
                } else if (!"application/x-subrip".equals(str5)) {
                    throw zzat.m4383a(null, "Unexpected MIME type.");
                }
                str7 = this.f5638b;
                if (str7 != null) {
                    zztVar.f20790b = this.f5638b;
                }
                zztVar.m8851c(i2);
                if (true != this.f5636a) {
                    str8 = "video/x-matroska";
                } else {
                    str8 = "video/webm";
                }
                zztVar.m8852d(str8);
                zztVar.m8853e(str5);
                zztVar.f20803o = i5;
                zztVar.f20792d = this.f5637a0;
                zztVar.f20793e = i21113;
                zztVar.f20805q = list1118;
                zztVar.f20798j = obj2;
                zztVar.f20806r = this.f5653n;
                this.f5641c0 = new zzv(zztVar);
                return;
            case 28:
            case 29:
                byte[] bArr9 = zzakm.f5666m0;
                str11 = "text/x-ssa";
                zzgwtVarM7217q = zzgwt.m7217q(zzakm.f5667n0, m4164b(this.f5640c));
                listSingletonList = zzgwtVarM7217q;
                i7 = -1;
                i3 = -1;
                i6 = -1;
                i4 = -1;
                i8 = -1;
                i5 = -1;
                list5 = listSingletonList;
                list2 = list5;
                iM6500b = -1;
                list4 = list2;
                if (this.f5625P != null) {
                    obj2 = obj3;
                    zzfwVarM6736a = zzfw.m6736a(new zzeu(this.f5625P));
                    if (zzfwVarM6736a != null) {
                        obj3 = zzfwVarM6736a.f16688a;
                        str11 = "video/dolby-vision";
                        obj2 = obj3;
                    }
                } else {
                    obj2 = obj3;
                }
                str5 = str11;
                boolean z1110 = this.f5635Z;
                List list1119 = list4;
                if (true != this.f5634Y) {
                    i13 = 0;
                } else {
                    i13 = 2;
                }
                int i21114 = (z1110 ? 1 : 0) | i13;
                zztVar = new zzt();
                if (zzas.m4349a(str5)) {
                    zztVar.f20780F = this.f5626Q;
                    zztVar.f20781G = this.f5628S;
                    zztVar.f20782H = this.f5629T;
                    zztVar.f20783I = iM6500b;
                } else if (zzas.m4350b(str5)) {
                    if (this.f5659t == 0) {
                        i21 = this.f5657r;
                        i14 = -1;
                        if (i21 == -1) {
                            i21 = this.f5654o;
                        }
                        this.f5657r = i21;
                        i22 = this.f5658s;
                        if (i22 == -1) {
                            i22 = this.f5655p;
                        }
                        this.f5658s = i22;
                    } else {
                        i14 = -1;
                    }
                    i15 = this.f5657r;
                    if (i15 != i14) {
                        f2 = -1.0f;
                    } else {
                        f2 = -1.0f;
                    }
                    if (i6 == i14) {
                        if (i8 != i14) {
                            i6 = i14;
                        } else if (i4 == i14) {
                            i6 = this.f5610A;
                            i8 = this.f5611B;
                            i4 = this.f5612C;
                        } else {
                            i6 = this.f5610A;
                            i8 = this.f5611B;
                            i4 = this.f5612C;
                        }
                    }
                    if (i7 == i14) {
                        i7 = 8;
                    }
                    if (i3 == i14) {
                        i19 = this.f5656q;
                        if (i19 == i14) {
                            i16 = 8;
                        } else {
                            i16 = i19;
                        }
                    } else {
                        i16 = i3;
                    }
                    if (this.f5615F != -1.0f) {
                        i17 = 0;
                        bArr = null;
                    } else {
                        i17 = 0;
                        bArr = null;
                    }
                    zzh zzhVar1110 = new zzh();
                    zzhVar1110.f18414a = i6;
                    zzhVar1110.f18415b = i4;
                    zzhVar1110.f18416c = i8;
                    zzhVar1110.f18417d = bArr;
                    zzhVar1110.f18418e = i7;
                    zzhVar1110.f18419f = i16;
                    zzi zziVarM7286a1110 = zzhVar1110.m7286a();
                    str6 = this.f5638b;
                    if (str6 != null) {
                        map = zzakm.f5671r0;
                        if (map.containsKey(str6)) {
                            iIntValue = ((Integer) map.get(this.f5638b)).intValue();
                        } else {
                            iIntValue = i14;
                        }
                    } else {
                        iIntValue = i14;
                    }
                    if (this.f5660u == 0) {
                        i18 = iIntValue;
                    } else {
                        i18 = iIntValue;
                    }
                    zztVar.f20809u = this.f5654o;
                    zztVar.f20810v = this.f5655p;
                    zztVar.f20775A = f2;
                    zztVar.f20814z = i18;
                    zztVar.f20776B = this.f5664y;
                    zztVar.f20777C = this.f5665z;
                    zztVar.f20778D = zziVarM7286a1110;
                } else if (!"application/x-subrip".equals(str5)) {
                    throw zzat.m4383a(null, "Unexpected MIME type.");
                }
                str7 = this.f5638b;
                if (str7 != null) {
                    zztVar.f20790b = this.f5638b;
                }
                zztVar.m8851c(i2);
                if (true != this.f5636a) {
                    str8 = "video/x-matroska";
                } else {
                    str8 = "video/webm";
                }
                zztVar.m8852d(str8);
                zztVar.m8853e(str5);
                zztVar.f20803o = i5;
                zztVar.f20792d = this.f5637a0;
                zztVar.f20793e = i21114;
                zztVar.f20805q = list1119;
                zztVar.f20798j = obj2;
                zztVar.f20806r = this.f5653n;
                this.f5641c0 = new zzv(zztVar);
                return;
            case 30:
                obj3 = null;
                str11 = "text/vtt";
                iM6500b = -1;
                list7 = list6;
                i7 = -1;
                i3 = -1;
                i6 = -1;
                list3 = list7;
                i4 = -1;
                i8 = -1;
                i5 = -1;
                list4 = list3;
                if (this.f5625P != null) {
                    obj2 = obj3;
                    zzfwVarM6736a = zzfw.m6736a(new zzeu(this.f5625P));
                    if (zzfwVarM6736a != null) {
                        obj3 = zzfwVarM6736a.f16688a;
                        str11 = "video/dolby-vision";
                        obj2 = obj3;
                    }
                } else {
                    obj2 = obj3;
                }
                str5 = str11;
                boolean z1111 = this.f5635Z;
                List list11110 = list4;
                if (true != this.f5634Y) {
                    i13 = 0;
                } else {
                    i13 = 2;
                }
                int i21115 = (z1111 ? 1 : 0) | i13;
                zztVar = new zzt();
                if (zzas.m4349a(str5)) {
                    zztVar.f20780F = this.f5626Q;
                    zztVar.f20781G = this.f5628S;
                    zztVar.f20782H = this.f5629T;
                    zztVar.f20783I = iM6500b;
                } else if (zzas.m4350b(str5)) {
                    if (this.f5659t == 0) {
                        i21 = this.f5657r;
                        i14 = -1;
                        if (i21 == -1) {
                            i21 = this.f5654o;
                        }
                        this.f5657r = i21;
                        i22 = this.f5658s;
                        if (i22 == -1) {
                            i22 = this.f5655p;
                        }
                        this.f5658s = i22;
                    } else {
                        i14 = -1;
                    }
                    i15 = this.f5657r;
                    if (i15 != i14) {
                        f2 = -1.0f;
                    } else {
                        f2 = -1.0f;
                    }
                    if (i6 == i14) {
                        if (i8 != i14) {
                            i6 = i14;
                        } else if (i4 == i14) {
                            i6 = this.f5610A;
                            i8 = this.f5611B;
                            i4 = this.f5612C;
                        } else {
                            i6 = this.f5610A;
                            i8 = this.f5611B;
                            i4 = this.f5612C;
                        }
                    }
                    if (i7 == i14) {
                        i7 = 8;
                    }
                    if (i3 == i14) {
                        i19 = this.f5656q;
                        if (i19 == i14) {
                            i16 = 8;
                        } else {
                            i16 = i19;
                        }
                    } else {
                        i16 = i3;
                    }
                    if (this.f5615F != -1.0f) {
                        i17 = 0;
                        bArr = null;
                    } else {
                        i17 = 0;
                        bArr = null;
                    }
                    zzh zzhVar1111 = new zzh();
                    zzhVar1111.f18414a = i6;
                    zzhVar1111.f18415b = i4;
                    zzhVar1111.f18416c = i8;
                    zzhVar1111.f18417d = bArr;
                    zzhVar1111.f18418e = i7;
                    zzhVar1111.f18419f = i16;
                    zzi zziVarM7286a1111 = zzhVar1111.m7286a();
                    str6 = this.f5638b;
                    if (str6 != null) {
                        map = zzakm.f5671r0;
                        if (map.containsKey(str6)) {
                            iIntValue = ((Integer) map.get(this.f5638b)).intValue();
                        } else {
                            iIntValue = i14;
                        }
                    } else {
                        iIntValue = i14;
                    }
                    if (this.f5660u == 0) {
                        i18 = iIntValue;
                    } else {
                        i18 = iIntValue;
                    }
                    zztVar.f20809u = this.f5654o;
                    zztVar.f20810v = this.f5655p;
                    zztVar.f20775A = f2;
                    zztVar.f20814z = i18;
                    zztVar.f20776B = this.f5664y;
                    zztVar.f20777C = this.f5665z;
                    zztVar.f20778D = zziVarM7286a1111;
                } else if (!"application/x-subrip".equals(str5)) {
                    throw zzat.m4383a(null, "Unexpected MIME type.");
                }
                str7 = this.f5638b;
                if (str7 != null) {
                    zztVar.f20790b = this.f5638b;
                }
                zztVar.m8851c(i2);
                if (true != this.f5636a) {
                    str8 = "video/x-matroska";
                } else {
                    str8 = "video/webm";
                }
                zztVar.m8852d(str8);
                zztVar.m8853e(str5);
                zztVar.f20803o = i5;
                zztVar.f20792d = this.f5637a0;
                zztVar.f20793e = i21115;
                zztVar.f20805q = list11110;
                zztVar.f20798j = obj2;
                zztVar.f20806r = this.f5653n;
                this.f5641c0 = new zzv(zztVar);
                return;
            case 31:
                str11 = "application/vobsub";
                zzgwtVarM7217q = zzgwt.m7216n(m4164b(str9));
                listSingletonList = zzgwtVarM7217q;
                i7 = -1;
                i3 = -1;
                i6 = -1;
                i4 = -1;
                i8 = -1;
                i5 = -1;
                list5 = listSingletonList;
                list2 = list5;
                iM6500b = -1;
                list4 = list2;
                if (this.f5625P != null) {
                    obj2 = obj3;
                    zzfwVarM6736a = zzfw.m6736a(new zzeu(this.f5625P));
                    if (zzfwVarM6736a != null) {
                        obj3 = zzfwVarM6736a.f16688a;
                        str11 = "video/dolby-vision";
                        obj2 = obj3;
                    }
                } else {
                    obj2 = obj3;
                }
                str5 = str11;
                boolean z1112 = this.f5635Z;
                List list11111 = list4;
                if (true != this.f5634Y) {
                    i13 = 0;
                } else {
                    i13 = 2;
                }
                int i21116 = (z1112 ? 1 : 0) | i13;
                zztVar = new zzt();
                if (zzas.m4349a(str5)) {
                    zztVar.f20780F = this.f5626Q;
                    zztVar.f20781G = this.f5628S;
                    zztVar.f20782H = this.f5629T;
                    zztVar.f20783I = iM6500b;
                } else if (zzas.m4350b(str5)) {
                    if (this.f5659t == 0) {
                        i21 = this.f5657r;
                        i14 = -1;
                        if (i21 == -1) {
                            i21 = this.f5654o;
                        }
                        this.f5657r = i21;
                        i22 = this.f5658s;
                        if (i22 == -1) {
                            i22 = this.f5655p;
                        }
                        this.f5658s = i22;
                    } else {
                        i14 = -1;
                    }
                    i15 = this.f5657r;
                    if (i15 != i14) {
                        f2 = -1.0f;
                    } else {
                        f2 = -1.0f;
                    }
                    if (i6 == i14) {
                        if (i8 != i14) {
                            i6 = i14;
                        } else if (i4 == i14) {
                            i6 = this.f5610A;
                            i8 = this.f5611B;
                            i4 = this.f5612C;
                        } else {
                            i6 = this.f5610A;
                            i8 = this.f5611B;
                            i4 = this.f5612C;
                        }
                    }
                    if (i7 == i14) {
                        i7 = 8;
                    }
                    if (i3 == i14) {
                        i19 = this.f5656q;
                        if (i19 == i14) {
                            i16 = 8;
                        } else {
                            i16 = i19;
                        }
                    } else {
                        i16 = i3;
                    }
                    if (this.f5615F != -1.0f) {
                        i17 = 0;
                        bArr = null;
                    } else {
                        i17 = 0;
                        bArr = null;
                    }
                    zzh zzhVar1112 = new zzh();
                    zzhVar1112.f18414a = i6;
                    zzhVar1112.f18415b = i4;
                    zzhVar1112.f18416c = i8;
                    zzhVar1112.f18417d = bArr;
                    zzhVar1112.f18418e = i7;
                    zzhVar1112.f18419f = i16;
                    zzi zziVarM7286a1112 = zzhVar1112.m7286a();
                    str6 = this.f5638b;
                    if (str6 != null) {
                        map = zzakm.f5671r0;
                        if (map.containsKey(str6)) {
                            iIntValue = ((Integer) map.get(this.f5638b)).intValue();
                        } else {
                            iIntValue = i14;
                        }
                    } else {
                        iIntValue = i14;
                    }
                    if (this.f5660u == 0) {
                        i18 = iIntValue;
                    } else {
                        i18 = iIntValue;
                    }
                    zztVar.f20809u = this.f5654o;
                    zztVar.f20810v = this.f5655p;
                    zztVar.f20775A = f2;
                    zztVar.f20814z = i18;
                    zztVar.f20776B = this.f5664y;
                    zztVar.f20777C = this.f5665z;
                    zztVar.f20778D = zziVarM7286a1112;
                } else if (!"application/x-subrip".equals(str5)) {
                    throw zzat.m4383a(null, "Unexpected MIME type.");
                }
                str7 = this.f5638b;
                if (str7 != null) {
                    zztVar.f20790b = this.f5638b;
                }
                zztVar.m8851c(i2);
                if (true != this.f5636a) {
                    str8 = "video/x-matroska";
                } else {
                    str8 = "video/webm";
                }
                zztVar.m8852d(str8);
                zztVar.m8853e(str5);
                zztVar.f20803o = i5;
                zztVar.f20792d = this.f5637a0;
                zztVar.f20793e = i21116;
                zztVar.f20805q = list11111;
                zztVar.f20798j = obj2;
                zztVar.f20806r = this.f5653n;
                this.f5641c0 = new zzv(zztVar);
                return;
            case 32:
                str11 = "application/pgs";
                obj3 = null;
                iM6500b = -1;
                list7 = list6;
                i7 = -1;
                i3 = -1;
                i6 = -1;
                list3 = list7;
                i4 = -1;
                i8 = -1;
                i5 = -1;
                list4 = list3;
                if (this.f5625P != null) {
                    obj2 = obj3;
                    zzfwVarM6736a = zzfw.m6736a(new zzeu(this.f5625P));
                    if (zzfwVarM6736a != null) {
                        obj3 = zzfwVarM6736a.f16688a;
                        str11 = "video/dolby-vision";
                        obj2 = obj3;
                    }
                } else {
                    obj2 = obj3;
                }
                str5 = str11;
                boolean z1113 = this.f5635Z;
                List list11112 = list4;
                if (true != this.f5634Y) {
                    i13 = 0;
                } else {
                    i13 = 2;
                }
                int i21117 = (z1113 ? 1 : 0) | i13;
                zztVar = new zzt();
                if (zzas.m4349a(str5)) {
                    zztVar.f20780F = this.f5626Q;
                    zztVar.f20781G = this.f5628S;
                    zztVar.f20782H = this.f5629T;
                    zztVar.f20783I = iM6500b;
                } else if (zzas.m4350b(str5)) {
                    if (this.f5659t == 0) {
                        i21 = this.f5657r;
                        i14 = -1;
                        if (i21 == -1) {
                            i21 = this.f5654o;
                        }
                        this.f5657r = i21;
                        i22 = this.f5658s;
                        if (i22 == -1) {
                            i22 = this.f5655p;
                        }
                        this.f5658s = i22;
                    } else {
                        i14 = -1;
                    }
                    i15 = this.f5657r;
                    if (i15 != i14) {
                        f2 = -1.0f;
                    } else {
                        f2 = -1.0f;
                    }
                    if (i6 == i14) {
                        if (i8 != i14) {
                            i6 = i14;
                        } else if (i4 == i14) {
                            i6 = this.f5610A;
                            i8 = this.f5611B;
                            i4 = this.f5612C;
                        } else {
                            i6 = this.f5610A;
                            i8 = this.f5611B;
                            i4 = this.f5612C;
                        }
                    }
                    if (i7 == i14) {
                        i7 = 8;
                    }
                    if (i3 == i14) {
                        i19 = this.f5656q;
                        if (i19 == i14) {
                            i16 = 8;
                        } else {
                            i16 = i19;
                        }
                    } else {
                        i16 = i3;
                    }
                    if (this.f5615F != -1.0f) {
                        i17 = 0;
                        bArr = null;
                    } else {
                        i17 = 0;
                        bArr = null;
                    }
                    zzh zzhVar1113 = new zzh();
                    zzhVar1113.f18414a = i6;
                    zzhVar1113.f18415b = i4;
                    zzhVar1113.f18416c = i8;
                    zzhVar1113.f18417d = bArr;
                    zzhVar1113.f18418e = i7;
                    zzhVar1113.f18419f = i16;
                    zzi zziVarM7286a1113 = zzhVar1113.m7286a();
                    str6 = this.f5638b;
                    if (str6 != null) {
                        map = zzakm.f5671r0;
                        if (map.containsKey(str6)) {
                            iIntValue = ((Integer) map.get(this.f5638b)).intValue();
                        } else {
                            iIntValue = i14;
                        }
                    } else {
                        iIntValue = i14;
                    }
                    if (this.f5660u == 0) {
                        i18 = iIntValue;
                    } else {
                        i18 = iIntValue;
                    }
                    zztVar.f20809u = this.f5654o;
                    zztVar.f20810v = this.f5655p;
                    zztVar.f20775A = f2;
                    zztVar.f20814z = i18;
                    zztVar.f20776B = this.f5664y;
                    zztVar.f20777C = this.f5665z;
                    zztVar.f20778D = zziVarM7286a1113;
                } else if (!"application/x-subrip".equals(str5)) {
                    throw zzat.m4383a(null, "Unexpected MIME type.");
                }
                str7 = this.f5638b;
                if (str7 != null) {
                    zztVar.f20790b = this.f5638b;
                }
                zztVar.m8851c(i2);
                if (true != this.f5636a) {
                    str8 = "video/x-matroska";
                } else {
                    str8 = "video/webm";
                }
                zztVar.m8852d(str8);
                zztVar.m8853e(str5);
                zztVar.f20803o = i5;
                zztVar.f20792d = this.f5637a0;
                zztVar.f20793e = i21117;
                zztVar.f20805q = list11112;
                zztVar.f20798j = obj2;
                zztVar.f20806r = this.f5653n;
                this.f5641c0 = new zzv(zztVar);
                return;
            case 33:
                byte[] bArr10 = new byte[4];
                System.arraycopy(m4164b(str9), 0, bArr10, 0, 4);
                str11 = "application/dvbsubs";
                zzgwtVarM7217q = zzgwt.m7216n(bArr10);
                listSingletonList = zzgwtVarM7217q;
                i7 = -1;
                i3 = -1;
                i6 = -1;
                i4 = -1;
                i8 = -1;
                i5 = -1;
                list5 = listSingletonList;
                list2 = list5;
                iM6500b = -1;
                list4 = list2;
                if (this.f5625P != null) {
                    obj2 = obj3;
                    zzfwVarM6736a = zzfw.m6736a(new zzeu(this.f5625P));
                    if (zzfwVarM6736a != null) {
                        obj3 = zzfwVarM6736a.f16688a;
                        str11 = "video/dolby-vision";
                        obj2 = obj3;
                    }
                } else {
                    obj2 = obj3;
                }
                str5 = str11;
                boolean z1114 = this.f5635Z;
                List list11113 = list4;
                if (true != this.f5634Y) {
                    i13 = 0;
                } else {
                    i13 = 2;
                }
                int i21118 = (z1114 ? 1 : 0) | i13;
                zztVar = new zzt();
                if (zzas.m4349a(str5)) {
                    zztVar.f20780F = this.f5626Q;
                    zztVar.f20781G = this.f5628S;
                    zztVar.f20782H = this.f5629T;
                    zztVar.f20783I = iM6500b;
                } else if (zzas.m4350b(str5)) {
                    if (this.f5659t == 0) {
                        i21 = this.f5657r;
                        i14 = -1;
                        if (i21 == -1) {
                            i21 = this.f5654o;
                        }
                        this.f5657r = i21;
                        i22 = this.f5658s;
                        if (i22 == -1) {
                            i22 = this.f5655p;
                        }
                        this.f5658s = i22;
                    } else {
                        i14 = -1;
                    }
                    i15 = this.f5657r;
                    if (i15 != i14) {
                        f2 = -1.0f;
                    } else {
                        f2 = -1.0f;
                    }
                    if (i6 == i14) {
                        if (i8 != i14) {
                            i6 = i14;
                        } else if (i4 == i14) {
                            i6 = this.f5610A;
                            i8 = this.f5611B;
                            i4 = this.f5612C;
                        } else {
                            i6 = this.f5610A;
                            i8 = this.f5611B;
                            i4 = this.f5612C;
                        }
                    }
                    if (i7 == i14) {
                        i7 = 8;
                    }
                    if (i3 == i14) {
                        i19 = this.f5656q;
                        if (i19 == i14) {
                            i16 = 8;
                        } else {
                            i16 = i19;
                        }
                    } else {
                        i16 = i3;
                    }
                    if (this.f5615F != -1.0f) {
                        i17 = 0;
                        bArr = null;
                    } else {
                        i17 = 0;
                        bArr = null;
                    }
                    zzh zzhVar1114 = new zzh();
                    zzhVar1114.f18414a = i6;
                    zzhVar1114.f18415b = i4;
                    zzhVar1114.f18416c = i8;
                    zzhVar1114.f18417d = bArr;
                    zzhVar1114.f18418e = i7;
                    zzhVar1114.f18419f = i16;
                    zzi zziVarM7286a1114 = zzhVar1114.m7286a();
                    str6 = this.f5638b;
                    if (str6 != null) {
                        map = zzakm.f5671r0;
                        if (map.containsKey(str6)) {
                            iIntValue = ((Integer) map.get(this.f5638b)).intValue();
                        } else {
                            iIntValue = i14;
                        }
                    } else {
                        iIntValue = i14;
                    }
                    if (this.f5660u == 0) {
                        i18 = iIntValue;
                    } else {
                        i18 = iIntValue;
                    }
                    zztVar.f20809u = this.f5654o;
                    zztVar.f20810v = this.f5655p;
                    zztVar.f20775A = f2;
                    zztVar.f20814z = i18;
                    zztVar.f20776B = this.f5664y;
                    zztVar.f20777C = this.f5665z;
                    zztVar.f20778D = zziVarM7286a1114;
                } else if (!"application/x-subrip".equals(str5)) {
                    throw zzat.m4383a(null, "Unexpected MIME type.");
                }
                str7 = this.f5638b;
                if (str7 != null) {
                    zztVar.f20790b = this.f5638b;
                }
                zztVar.m8851c(i2);
                if (true != this.f5636a) {
                    str8 = "video/x-matroska";
                } else {
                    str8 = "video/webm";
                }
                zztVar.m8852d(str8);
                zztVar.m8853e(str5);
                zztVar.f20803o = i5;
                zztVar.f20792d = this.f5637a0;
                zztVar.f20793e = i21118;
                zztVar.f20805q = list11113;
                zztVar.f20798j = obj2;
                zztVar.f20806r = this.f5653n;
                this.f5641c0 = new zzv(zztVar);
                return;
            default:
                throw zzat.m4383a(null, "Unrecognized codec identifier.");
        }
    }

    /* JADX INFO: renamed from: b */
    public final byte[] m4164b(String str) throws zzat {
        byte[] bArr = this.f5652m;
        if (bArr != null) {
            return bArr;
        }
        throw zzat.m4383a(null, "Missing CodecPrivate for codec ".concat(String.valueOf(str)));
    }
}
