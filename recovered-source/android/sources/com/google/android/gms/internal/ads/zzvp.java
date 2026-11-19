package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.os.Build;
import android.util.Pair;
import android.util.Range;
import androidx.core.view.InputDeviceCompat;
import androidx.datastore.preferences.protobuf.AbstractC1456a;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import p011H.AbstractC0271e0;

/* JADX INFO: loaded from: classes2.dex */
public final class zzvp {

    /* JADX INFO: renamed from: a */
    public final String f21111a;

    /* JADX INFO: renamed from: b */
    public final String f21112b;

    /* JADX INFO: renamed from: c */
    public final String f21113c;

    /* JADX INFO: renamed from: d */
    public final MediaCodecInfo.CodecCapabilities f21114d;

    /* JADX INFO: renamed from: e */
    public final boolean f21115e;

    /* JADX INFO: renamed from: f */
    public final boolean f21116f;

    /* JADX INFO: renamed from: g */
    public final boolean f21117g;

    /* JADX INFO: renamed from: h */
    public final boolean f21118h;

    /* JADX INFO: renamed from: i */
    public final boolean f21119i;

    /* JADX INFO: renamed from: j */
    public int f21120j;

    /* JADX INFO: renamed from: k */
    public int f21121k;

    /* JADX INFO: renamed from: l */
    public float f21122l;

    public zzvp(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4) {
        str.getClass();
        this.f21111a = str;
        this.f21112b = str2;
        this.f21113c = str3;
        this.f21114d = codecCapabilities;
        this.f21117g = z;
        this.f21115e = z2;
        this.f21116f = z3;
        this.f21118h = z4;
        this.f21119i = zzas.m4350b(str2);
        this.f21122l = -3.4028235E38f;
        this.f21120j = -1;
        this.f21121k = -1;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0061  */
    /* JADX INFO: renamed from: a */
    public static zzvp m8943a(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2) {
        boolean z3;
        boolean z4 = codecCapabilities != null && codecCapabilities.isFeatureSupported("adaptive-playback");
        if (codecCapabilities != null) {
            codecCapabilities.isFeatureSupported("tunneled-playback");
        }
        boolean z5 = z2 || (codecCapabilities != null && codecCapabilities.isFeatureSupported("secure-playback"));
        if (Build.VERSION.SDK_INT < 35 || codecCapabilities == null || !codecCapabilities.isFeatureSupported("detached-surface")) {
            z3 = false;
        } else {
            String str4 = Build.MANUFACTURER;
            if (str4.equals("Xiaomi") || str4.equals("OPPO") || str4.equals("realme") || str4.equals("motorola") || str4.equals("LENOVO")) {
                z3 = false;
            } else {
                z3 = true;
            }
        }
        return new zzvp(str, str2, str3, codecCapabilities, z, z4, z5, z3);
    }

    /* JADX INFO: renamed from: i */
    public static boolean m8944i(MediaCodecInfo.VideoCapabilities videoCapabilities, int i2, int i3, double d) {
        Point pointM8945j = m8945j(videoCapabilities, i2, i3);
        int i4 = pointM8945j.x;
        int i5 = pointM8945j.y;
        if (d == -1.0d || d < 1.0d) {
            return videoCapabilities.isSizeSupported(i4, i5);
        }
        double dFloor = Math.floor(d);
        if (!videoCapabilities.areSizeAndRateSupported(i4, i5, dFloor)) {
            return false;
        }
        Range<Double> achievableFrameRatesFor = videoCapabilities.getAchievableFrameRatesFor(i4, i5);
        return achievableFrameRatesFor == null || dFloor <= ((Double) achievableFrameRatesFor.getUpper()).doubleValue();
    }

    /* JADX INFO: renamed from: j */
    public static Point m8945j(MediaCodecInfo.VideoCapabilities videoCapabilities, int i2, int i3) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        String str = zzfm.f16091a;
        return new Point((((i2 + widthAlignment) - 1) / widthAlignment) * widthAlignment, (((i3 + heightAlignment) - 1) / heightAlignment) * heightAlignment);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m8946b(Context context, zzv zzvVar) {
        int i2;
        int i3;
        String str = zzvVar.f21061o;
        String str2 = this.f21112b;
        if ((!str2.equals(str) && !str2.equals(zzwi.m8976d(zzvVar))) || !m8950f(context, zzvVar, true) || !m8951g(zzvVar)) {
            return false;
        }
        if (this.f21119i) {
            int i4 = zzvVar.f21068v;
            if (i4 > 0 && (i3 = zzvVar.f21069w) > 0) {
                return m8949e(i4, i3, zzvVar.f21072z);
            }
        } else {
            int i5 = zzvVar.f21039I;
            MediaCodecInfo.CodecCapabilities codecCapabilities = this.f21114d;
            if (i5 != -1) {
                if (codecCapabilities == null) {
                    m8952h("sampleRate.caps");
                    return false;
                }
                MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
                if (audioCapabilities == null) {
                    m8952h("sampleRate.aCaps");
                    return false;
                }
                if (!audioCapabilities.isSampleRateSupported(i5)) {
                    StringBuilder sb = new StringBuilder(String.valueOf(i5).length() + 20);
                    sb.append("sampleRate.support, ");
                    sb.append(i5);
                    m8952h(sb.toString());
                    return false;
                }
            }
            int i6 = zzvVar.f21037G;
            if (i6 != -1) {
                if (codecCapabilities == null) {
                    m8952h("channelCount.caps");
                    return false;
                }
                MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities.getAudioCapabilities();
                if (audioCapabilities2 == null) {
                    m8952h("channelCount.aCaps");
                    return false;
                }
                int maxInputChannelCount = audioCapabilities2.getMaxInputChannelCount();
                if (maxInputChannelCount <= 1 && ((Build.VERSION.SDK_INT < 26 || maxInputChannelCount <= 0) && !"audio/mpeg".equals(str2) && !"audio/3gpp".equals(str2) && !"audio/amr-wb".equals(str2) && !"audio/mp4a-latm".equals(str2) && !"audio/vorbis".equals(str2) && !"audio/opus".equals(str2) && !"audio/raw".equals(str2) && !"audio/flac".equals(str2) && !"audio/g711-alaw".equals(str2) && !"audio/g711-mlaw".equals(str2) && !"audio/gsm".equals(str2))) {
                    if ("audio/ac3".equals(str2)) {
                        i2 = 6;
                    } else {
                        i2 = "audio/eac3".equals(str2) ? 16 : 30;
                    }
                    String str3 = this.f21111a;
                    StringBuilder sb2 = new StringBuilder(AbstractC1456a.m2438e(String.valueOf(maxInputChannelCount).length() + str3.length() + 32 + 4, 1, String.valueOf(i2)));
                    sb2.append("AssumedMaxChannelAdjustment: ");
                    sb2.append(str3);
                    sb2.append(", [");
                    sb2.append(maxInputChannelCount);
                    sb2.append(" to ");
                    sb2.append(i2);
                    sb2.append("]");
                    zzeh.m6211c("MediaCodecInfo", sb2.toString());
                    maxInputChannelCount = i2;
                }
                if (maxInputChannelCount < i6) {
                    StringBuilder sb3 = new StringBuilder(String.valueOf(i6).length() + 22);
                    sb3.append("channelCount.support, ");
                    sb3.append(i6);
                    m8952h(sb3.toString());
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m8947c(zzv zzvVar) {
        boolean z;
        if (this.f21119i) {
            return this.f21115e;
        }
        zzdq zzdqVarM6034c = zzdr.m6034c(zzvVar);
        if (zzdqVarM6034c == null || !(z = zzdqVarM6034c.f12606c)) {
            return false;
        }
        zzgtr.m7133f(z);
        return zzdqVarM6034c.f12604a == 42;
    }

    /* JADX INFO: renamed from: d */
    public final zzje m8948d(zzv zzvVar, zzv zzvVar2) {
        zzv zzvVar3;
        zzv zzvVar4;
        int i2;
        String str = zzvVar.f21061o;
        String str2 = zzvVar2.f21061o;
        zzi zziVar = zzvVar2.f21035E;
        int i3 = true != Objects.equals(str, str2) ? 8 : 0;
        if (this.f21119i) {
            if (zzvVar.f21031A != zzvVar2.f21031A) {
                i3 |= 1024;
            }
            boolean z = (zzvVar.f21068v == zzvVar2.f21068v && zzvVar.f21069w == zzvVar2.f21069w) ? false : true;
            if (!this.f21115e && z) {
                i3 |= 512;
            }
            zzi zziVar2 = zzvVar.f21035E;
            if ((!zzi.m8027a(zziVar2) || !zzi.m8027a(zziVar)) && !Objects.equals(zziVar2, zziVar)) {
                i3 |= 2048;
            }
            boolean zStartsWith = Build.MODEL.startsWith("SM-T230");
            String str3 = this.f21111a;
            if (zStartsWith && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str3) && !zzvVar.m8928b(zzvVar2)) {
                i3 |= 2;
            }
            int i4 = zzvVar.f21070x;
            if (i4 != -1 && (i2 = zzvVar.f21071y) != -1 && i4 == zzvVar2.f21070x && i2 == zzvVar2.f21071y && z) {
                i3 |= 2;
            }
            if (i3 == 0 && Objects.equals(str2, "video/dolby-vision")) {
                Pair pairM6033b = zzdr.m6033b(zzvVar);
                Pair pairM6033b2 = zzdr.m6033b(zzvVar2);
                if (pairM6033b == null || pairM6033b2 == null || !((Integer) pairM6033b.first).equals(pairM6033b2.first)) {
                    i3 = 2;
                }
            }
            if (i3 == 0) {
                return new zzje(str3, zzvVar, zzvVar2, true == zzvVar.m8928b(zzvVar2) ? 3 : 2, 0);
            }
            zzvVar3 = zzvVar;
            zzvVar4 = zzvVar2;
        } else {
            zzvVar3 = zzvVar;
            zzvVar4 = zzvVar2;
            if (zzvVar3.f21037G != zzvVar4.f21037G) {
                i3 |= 4096;
            }
            if (zzvVar3.f21039I != zzvVar4.f21039I) {
                i3 |= 8192;
            }
            if (zzvVar3.f21040J != zzvVar4.f21040J) {
                i3 |= 16384;
            }
            String str4 = this.f21112b;
            if (i3 == 0 && (str4.equals("audio/mp4a-latm") || str4.equals("audio/ac4"))) {
                Pair pairM6033b3 = zzdr.m6033b(zzvVar3);
                Pair pairM6033b4 = zzdr.m6033b(zzvVar4);
                if (pairM6033b3 != null && pairM6033b4 != null) {
                    int iIntValue = ((Integer) pairM6033b3.first).intValue();
                    int iIntValue2 = ((Integer) pairM6033b4.first).intValue();
                    if (iIntValue == 42 && iIntValue2 == 42) {
                        return new zzje(this.f21111a, zzvVar3, zzvVar4, 3, 0);
                    }
                    if (str4.equals("audio/ac4") && pairM6033b3.equals(pairM6033b4)) {
                        return new zzje(this.f21111a, zzvVar3, zzvVar4, 3, 0);
                    }
                }
            }
            if (i3 == 0 && (str4.equals("audio/eac3-joc") || str4.equals("audio/eac3"))) {
                return new zzje(this.f21111a, zzvVar3, zzvVar4, 3, 0);
            }
            if (!zzvVar3.m8928b(zzvVar4)) {
                i3 |= 32;
            }
            if ("audio/opus".equals(str4)) {
                i3 |= 2;
            }
            if (i3 == 0) {
                return new zzje(this.f21111a, zzvVar3, zzvVar4, 1, 0);
            }
        }
        return new zzje(this.f21111a, zzvVar3, zzvVar4, 0, i3);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0067  */
    /* JADX WARN: Code duplicated, block: B:47:0x0086  */
    /* JADX WARN: Code duplicated, block: B:56:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:58:0x00cb  */
    /* JADX INFO: renamed from: e */
    public final boolean m8949e(int i2, int i3, double d) {
        String str;
        char c;
        Boolean bool;
        List supportedPerformancePoints;
        boolean z;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f21114d;
        if (codecCapabilities == null) {
            m8952h("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            m8952h("sizeAndRate.vCaps");
            return false;
        }
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 29) {
            if (i4 < 29 || (((bool = zzvr.f21123a) != null && bool.booleanValue()) || (supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints()) == null || supportedPerformancePoints.isEmpty())) {
                c = 0;
            } else {
                MediaCodecInfo.VideoCapabilities.PerformancePoint performancePointM3820d = AbstractC5156j.m3820d(i2, i3, (int) d);
                int i5 = 0;
                while (true) {
                    if (i5 >= supportedPerformancePoints.size()) {
                        c = 1;
                        break;
                    }
                    if (AbstractC5156j.m3821e(supportedPerformancePoints.get(i5)).covers(performancePointM3820d)) {
                        c = 2;
                        break;
                    }
                    i5++;
                }
                if (c == 1 && zzvr.f21123a == null) {
                    if (i4 >= 37) {
                        z = false;
                    } else {
                        int iM8953a = zzvq.m8953a(true);
                        if (i4 < 35 ? zzvq.m8953a(false) != 2 || iM8953a == 1 : iM8953a == 1) {
                            z = true;
                        } else {
                            z = false;
                        }
                    }
                    zzvr.f21123a = Boolean.valueOf(z);
                    if (z) {
                        c = 0;
                    }
                }
            }
            if (c != 2) {
                if (c == 1) {
                    StringBuilder sb = new StringBuilder(AbstractC1456a.m2438e(String.valueOf(i2).length() + 20, 1, String.valueOf(i3)) + String.valueOf(d).length());
                    AbstractC1456a.m2455v(sb, "sizeAndRate.cover, ", i2, "x", i3);
                    sb.append("@");
                    sb.append(d);
                    m8952h(sb.toString());
                    return false;
                }
                if (!m8944i(videoCapabilities, i2, i3, d)) {
                    if (i2 < i3) {
                        str = this.f21111a;
                        if ("OMX.MTK.VIDEO.DECODER.HEVC".equals(str)) {
                            StringBuilder sb2 = new StringBuilder(String.valueOf(i3).length() + AbstractC1456a.m2434a(i2, 22) + 1 + String.valueOf(d).length());
                            AbstractC1456a.m2455v(sb2, "sizeAndRate.rotated, ", i2, "x", i3);
                            sb2.append("@");
                            sb2.append(d);
                            String string = sb2.toString();
                            int length = str.length();
                            String str2 = zzfm.f16091a;
                            String str3 = this.f21112b;
                            StringBuilder sb3 = new StringBuilder(string.length() + 19 + length + 2 + String.valueOf(str3).length() + 3 + String.valueOf(str2).length() + 1);
                            sb3.append("AssumedSupport [");
                            sb3.append(string);
                            sb3.append("] [");
                            sb3.append(str);
                            AbstractC0271e0.m413u(sb3, ", ", str3, "] [", str2);
                            sb3.append("]");
                            zzeh.m6209a("MediaCodecInfo", sb3.toString());
                            return true;
                        }
                        StringBuilder sb4 = new StringBuilder(String.valueOf(i3).length() + AbstractC1456a.m2434a(i2, 22) + 1 + String.valueOf(d).length());
                        AbstractC1456a.m2455v(sb4, "sizeAndRate.rotated, ", i2, "x", i3);
                        sb4.append("@");
                        sb4.append(d);
                        String string2 = sb4.toString();
                        int length2 = str.length();
                        String str4 = zzfm.f16091a;
                        String str5 = this.f21112b;
                        StringBuilder sb5 = new StringBuilder(string2.length() + 19 + length2 + 2 + String.valueOf(str5).length() + 3 + String.valueOf(str4).length() + 1);
                        sb5.append("AssumedSupport [");
                        sb5.append(string2);
                        sb5.append("] [");
                        sb5.append(str);
                        AbstractC0271e0.m413u(sb5, ", ", str5, "] [", str4);
                        sb5.append("]");
                        zzeh.m6209a("MediaCodecInfo", sb5.toString());
                        return true;
                    }
                    StringBuilder sb6 = new StringBuilder(String.valueOf(i3).length() + AbstractC1456a.m2434a(i2, 22) + 1 + String.valueOf(d).length());
                    AbstractC1456a.m2455v(sb6, "sizeAndRate.support, ", i2, "x", i3);
                    sb6.append("@");
                    sb6.append(d);
                    m8952h(sb6.toString());
                    return false;
                }
            }
        } else if (!m8944i(videoCapabilities, i2, i3, d)) {
            if (i2 < i3) {
                str = this.f21111a;
                if (("OMX.MTK.VIDEO.DECODER.HEVC".equals(str) || !"mcv5a".equals(Build.DEVICE)) && m8944i(videoCapabilities, i3, i2, d)) {
                    StringBuilder sb7 = new StringBuilder(String.valueOf(i3).length() + AbstractC1456a.m2434a(i2, 22) + 1 + String.valueOf(d).length());
                    AbstractC1456a.m2455v(sb7, "sizeAndRate.rotated, ", i2, "x", i3);
                    sb7.append("@");
                    sb7.append(d);
                    String string3 = sb7.toString();
                    int length3 = str.length();
                    String str6 = zzfm.f16091a;
                    String str7 = this.f21112b;
                    StringBuilder sb8 = new StringBuilder(string3.length() + 19 + length3 + 2 + String.valueOf(str7).length() + 3 + String.valueOf(str6).length() + 1);
                    sb8.append("AssumedSupport [");
                    sb8.append(string3);
                    sb8.append("] [");
                    sb8.append(str);
                    AbstractC0271e0.m413u(sb8, ", ", str7, "] [", str6);
                    sb8.append("]");
                    zzeh.m6209a("MediaCodecInfo", sb8.toString());
                    return true;
                }
            }
            StringBuilder sb9 = new StringBuilder(String.valueOf(i3).length() + AbstractC1456a.m2434a(i2, 22) + 1 + String.valueOf(d).length());
            AbstractC1456a.m2455v(sb9, "sizeAndRate.support, ", i2, "x", i3);
            sb9.append("@");
            sb9.append(d);
            m8952h(sb9.toString());
            return false;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00f1  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v25 */
    /* JADX WARN: Type inference failed for: r9v26 */
    /* JADX WARN: Type inference failed for: r9v27 */
    /* JADX INFO: renamed from: f */
    public final boolean m8950f(Context context, zzv zzvVar, boolean z) {
        byte b;
        boolean z2;
        ?? r2;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.AudioCapabilities audioCapabilities;
        ?? r9;
        zzdq zzdqVar;
        String strM6032a;
        zzdq zzdqVarM6034c = zzdr.m6034c(zzvVar);
        String str = zzvVar.f21061o;
        int i2 = 3;
        String str2 = this.f21113c;
        if (str == null || !str.equals("video/mv-hevc")) {
            b = -1;
            z2 = false;
        } else {
            String strM4356h = zzas.m4356h(str2);
            if (strM4356h.equals("video/mv-hevc")) {
                return true;
            }
            if (strM4356h.equals("video/hevc")) {
                HashMap map = zzwi.f21212a;
                List list = zzvVar.f21064r;
                int i3 = 0;
                loop0: while (true) {
                    if (i3 >= list.size()) {
                        zzdqVar = null;
                        z2 = false;
                        strM6032a = null;
                        break;
                    }
                    byte[] bArr = (byte[]) list.get(i3);
                    int length = bArr.length;
                    if (length > i2) {
                        boolean[] zArr = new boolean[i2];
                        zzgzi zzgziVar = zzgwt.f18303t;
                        z2 = false;
                        zzgwq zzgwqVar = new zzgwq();
                        int i4 = 0;
                        while (true) {
                            int length2 = bArr.length;
                            if (i4 >= length2) {
                                break;
                            }
                            int iM7086g = zzgr.m7086g(bArr, i4, length2, zArr);
                            if (iM7086g != length2) {
                                zzgwqVar.m7203c(Integer.valueOf(iM7086g));
                            }
                            i4 = iM7086g + 3;
                        }
                        zzgwt zzgwtVarM7214f = zzgwqVar.m7214f();
                        int i5 = 0;
                        while (true) {
                            zzgyo zzgyoVar = (zzgyo) zzgwtVarM7214f;
                            if (i5 >= zzgyoVar.f18357v) {
                                break;
                            }
                            if (((Integer) zzgyoVar.get(i5)).intValue() + i2 < length) {
                                zzgy zzgyVar = new zzgy(bArr, ((Integer) zzgyoVar.get(i5)).intValue() + i2, length);
                                zzgf zzgfVarM7088i = zzgr.m7088i(zzgyVar);
                                if (zzgfVarM7088i.f17123a == 33 && zzgfVarM7088i.f17124b == 0) {
                                    zzgyVar.m7253b(4);
                                    int iM7256e = zzgyVar.m7256e(3);
                                    zzgyVar.m7252a();
                                    zzdqVar = null;
                                    zzgg zzggVarM7089j = zzgr.m7089j(zzgyVar, true, iM7256e, null);
                                    strM6032a = zzdr.m6032a(zzggVarM7089j.f17184a, zzggVarM7089j.f17185b, zzggVarM7089j.f17186c, zzggVarM7089j.f17187d, zzggVarM7089j.f17188e, zzggVarM7089j.f17189f);
                                    break loop0;
                                }
                            }
                            i5++;
                            i2 = 3;
                        }
                    }
                    i3++;
                    i2 = 3;
                }
                if (strM6032a == null) {
                    zzdqVarM6034c = zzdqVar;
                    b = -1;
                } else {
                    String strTrim = strM6032a.trim();
                    String str3 = zzfm.f16091a;
                    b = -1;
                    zzdqVarM6034c = zzdr.m6035d(strM6032a, strTrim.split("\\.", -1), zzvVar.f21035E);
                }
            } else {
                b = -1;
                z2 = false;
            }
        }
        if (zzdqVarM6034c == null) {
            return true;
        }
        boolean z3 = zzdqVarM6034c.f12606c;
        if (!z3) {
            return z2;
        }
        zzgtr.m7133f(z3);
        int i6 = zzdqVarM6034c.f12604a;
        zzgtr.m7133f(z3);
        int i7 = zzdqVarM6034c.f12605b;
        boolean zEquals = "video/dolby-vision".equals(str);
        String str4 = this.f21112b;
        int i8 = 8;
        if (zEquals) {
            int iHashCode = str4.hashCode();
            if (iHashCode != -1662735862) {
                if (iHashCode != -1662541442) {
                    if (iHashCode == 1331836730 && str4.equals("video/avc")) {
                        r2 = i7;
                        r9 = b;
                        r9 = b;
                        r9 = z2;
                    }
                } else if (str4.equals("video/hevc")) {
                    r2 = i7;
                    r9 = b;
                    r9 = 1;
                }
            } else if (str4.equals("video/av01")) {
                r2 = i7;
                r9 = b;
                r9 = 2;
            }
            if (r9 != 0) {
                r2 = i7;
                i6 = (r9 == 1 || r9 == 2) ? 2 : 8;
            }
            r2 = z2;
        }
        r2 = i7;
        if (!this.f21119i && !str4.equals("audio/ac4") && i6 != 42) {
            return true;
        }
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f21114d;
        if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
            codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[z2];
        }
        if (str4.equals("audio/ac4") && codecProfileLevelArr.length == 0) {
            if (codecCapabilities != null && (audioCapabilities = codecCapabilities.getAudioCapabilities()) != null && audioCapabilities.getMaxInputChannelCount() > 18) {
                i8 = 16;
            }
            codecProfileLevelArr = context.getPackageManager().hasSystemFeature("android.hardware.type.automotive") ? new MediaCodecInfo.CodecProfileLevel[]{zzwi.m8975c(1026, i8)} : new MediaCodecInfo.CodecProfileLevel[]{zzwi.m8975c(257, i8), zzwi.m8975c(InputDeviceCompat.SOURCE_DPAD, i8), zzwi.m8975c(514, i8), zzwi.m8975c(1026, i8), zzwi.m8975c(1028, i8)};
        }
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : codecProfileLevelArr) {
            if (codecProfileLevel.profile == i6 && (codecProfileLevel.level >= r2 || !z)) {
                if (!"video/hevc".equals(str4) || i6 != 2) {
                    return true;
                }
                String str5 = Build.DEVICE;
                if (!"sailfish".equals(str5) && !"marlin".equals(str5)) {
                    return true;
                }
            }
        }
        String str6 = zzvVar.f21057k;
        m8952h(AbstractC1456a.m2451r(new StringBuilder(str2.length() + String.valueOf(str6).length() + 22), "codec.profileLevel, ", str6, ", ", str2));
        return false;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m8951g(zzv zzvVar) {
        return (Objects.equals(zzvVar.f21061o, "audio/flac") && zzvVar.f21040J == 22 && Build.VERSION.SDK_INT < 34 && this.f21111a.equals("c2.android.flac.decoder")) ? false : true;
    }

    /* JADX INFO: renamed from: h */
    public final void m8952h(String str) {
        String str2 = zzfm.f16091a;
        String str3 = this.f21112b;
        int length = String.valueOf(str3).length();
        int length2 = String.valueOf(str2).length();
        int length3 = str.length() + 14;
        String str4 = this.f21111a;
        StringBuilder sb = new StringBuilder(str4.length() + length3 + 2 + length + 3 + length2 + 1);
        AbstractC0271e0.m413u(sb, "NoSupport [", str, "] [", str4);
        AbstractC0271e0.m413u(sb, ", ", str3, "] [", str2);
        sb.append("]");
        zzeh.m6209a("MediaCodecInfo", sb.toString());
    }

    public final String toString() {
        return this.f21111a;
    }
}
