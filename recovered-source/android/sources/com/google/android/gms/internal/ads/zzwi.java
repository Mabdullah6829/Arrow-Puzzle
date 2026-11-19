package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzwi {

    /* JADX INFO: renamed from: a */
    public static final HashMap f21212a = new HashMap();

    /* JADX INFO: renamed from: a */
    public static synchronized List m8973a(String str, boolean z, boolean z2) {
        try {
            zzvz zzvzVar = new zzvz(str, z, z2);
            HashMap map = f21212a;
            List list = (List) map.get(zzvzVar);
            if (list != null) {
                return list;
            }
            ArrayList arrayListM8977e = m8977e(zzvzVar, new zzwd(z, z2, str.equals("video/mv-hevc")));
            if (z) {
                arrayListM8977e.isEmpty();
            }
            if ("audio/raw".equals(str)) {
                if (Build.VERSION.SDK_INT < 26 && Build.DEVICE.equals("R9") && arrayListM8977e.size() == 1 && ((zzvp) arrayListM8977e.get(0)).f21111a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                    arrayListM8977e.add(zzvp.m8943a("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, false));
                }
                Collections.sort(arrayListM8977e, new zzwf(new zzwh() { // from class: com.google.android.gms.internal.ads.zzwe
                    @Override // com.google.android.gms.internal.ads.zzwh
                    /* JADX INFO: renamed from: b */
                    public final /* synthetic */ int mo8972b(Object obj) {
                        HashMap map2 = zzwi.f21212a;
                        String str2 = ((zzvp) obj).f21111a;
                        if (str2.startsWith("OMX.google") || str2.startsWith("c2.android")) {
                            return 1;
                        }
                        return (Build.VERSION.SDK_INT >= 26 || !str2.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
                    }
                }));
            }
            if (Build.VERSION.SDK_INT < 32 && arrayListM8977e.size() > 1 && "OMX.qti.audio.decoder.flac".equals(((zzvp) arrayListM8977e.get(0)).f21111a)) {
                arrayListM8977e.add((zzvp) arrayListM8977e.remove(0));
            }
            zzgwt zzgwtVarM7220t = zzgwt.m7220t(arrayListM8977e);
            map.put(zzvzVar, zzgwtVarM7220t);
            return zzgwtVarM7220t;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: b */
    public static List m8974b(zzvy zzvyVar, zzv zzvVar, boolean z, boolean z2) {
        List listMo8971a;
        List listMo8971a2 = zzvyVar.mo8971a(zzvVar.f21061o, z, z2);
        String strM8976d = m8976d(zzvVar);
        if (strM8976d == null) {
            zzgzi zzgziVar = zzgwt.f18303t;
            listMo8971a = zzgyo.f18355w;
        } else {
            listMo8971a = zzvyVar.mo8971a(strM8976d, z, z2);
        }
        zzgzi zzgziVar2 = zzgwt.f18303t;
        zzgwq zzgwqVar = new zzgwq();
        zzgwqVar.m7204d(listMo8971a2);
        zzgwqVar.m7204d(listMo8971a);
        return zzgwqVar.m7214f();
    }

    /* JADX INFO: renamed from: c */
    public static MediaCodecInfo.CodecProfileLevel m8975c(int i2, int i3) {
        MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
        codecProfileLevel.profile = i2;
        codecProfileLevel.level = i3;
        return codecProfileLevel;
    }

    /* JADX INFO: renamed from: d */
    public static String m8976d(zzv zzvVar) {
        zzdq zzdqVarM6034c;
        boolean z;
        String str = zzvVar.f21061o;
        if ("audio/eac3-joc".equals(str)) {
            return "audio/eac3";
        }
        if ("audio/vnd.dts.hd".equals(str) || "audio/vnd.dts.uhd;profile=p2".equals(str)) {
            return "audio/vnd.dts";
        }
        if ("video/dolby-vision".equals(str) && (zzdqVarM6034c = zzdr.m6034c(zzvVar)) != null && (z = zzdqVarM6034c.f12606c)) {
            zzgtr.m7133f(z);
            int i2 = zzdqVarM6034c.f12604a;
            if (i2 == 16 || i2 == 256) {
                return "video/hevc";
            }
            if (i2 == 512) {
                return "video/avc";
            }
            if (i2 == 1024) {
                zzi zziVar = zzvVar.f21035E;
                if (zziVar != null && zziVar.f19549c == 6 && zziVar.f19548b == 1) {
                    return null;
                }
                return "video/av01";
            }
        }
        if ("video/mv-hevc".equals(str)) {
            return "video/hevc";
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:105:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:34:0x009c A[EDGE_INSN: B:34:0x009c->B:58:0x00f4 BREAK  A[LOOP:1: B:19:0x0065->B:23:0x0073]] */
    /* JADX WARN: Code duplicated, block: B:67:0x0110 A[PHI: r18
  0x0110: PHI (r18v3 int) = (r18v2 int), (r18v5 int) binds: [B:66:0x010e, B:94:0x0175] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:73:0x0126 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:74:0x0128 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:75:0x012a  */
    /* JADX WARN: Code duplicated, block: B:76:0x012d  */
    /* JADX WARN: Code duplicated, block: B:79:0x0137 A[Catch: Exception -> 0x013c, TryCatch #0 {Exception -> 0x013c, blocks: (B:62:0x0107, B:70:0x0116, B:77:0x012f, B:79:0x0137, B:86:0x014b, B:88:0x0154, B:89:0x0158, B:91:0x0168, B:93:0x0170, B:82:0x0140), top: B:111:0x0107 }] */
    /* JADX WARN: Code duplicated, block: B:82:0x0140 A[Catch: Exception -> 0x013c, TryCatch #0 {Exception -> 0x013c, blocks: (B:62:0x0107, B:70:0x0116, B:77:0x012f, B:79:0x0137, B:86:0x014b, B:88:0x0154, B:89:0x0158, B:91:0x0168, B:93:0x0170, B:82:0x0140), top: B:111:0x0107 }] */
    /* JADX WARN: Code duplicated, block: B:84:0x0146  */
    /* JADX WARN: Code duplicated, block: B:85:0x0149  */
    /* JADX WARN: Code duplicated, block: B:88:0x0154 A[Catch: Exception -> 0x013c, TryCatch #0 {Exception -> 0x013c, blocks: (B:62:0x0107, B:70:0x0116, B:77:0x012f, B:79:0x0137, B:86:0x014b, B:88:0x0154, B:89:0x0158, B:91:0x0168, B:93:0x0170, B:82:0x0140), top: B:111:0x0107 }] */
    /* JADX WARN: Code duplicated, block: B:89:0x0158 A[Catch: Exception -> 0x013c, TryCatch #0 {Exception -> 0x013c, blocks: (B:62:0x0107, B:70:0x0116, B:77:0x012f, B:79:0x0137, B:86:0x014b, B:88:0x0154, B:89:0x0158, B:91:0x0168, B:93:0x0170, B:82:0x0140), top: B:111:0x0107 }] */
    /* JADX WARN: Code duplicated, block: B:91:0x0168 A[Catch: Exception -> 0x013c, TryCatch #0 {Exception -> 0x013c, blocks: (B:62:0x0107, B:70:0x0116, B:77:0x012f, B:79:0x0137, B:86:0x014b, B:88:0x0154, B:89:0x0158, B:91:0x0168, B:93:0x0170, B:82:0x0140), top: B:111:0x0107 }] */
    /* JADX WARN: Code duplicated, block: B:96:0x0178  */
    /* JADX INFO: renamed from: e */
    public static ArrayList m8977e(zzvz zzvzVar, zzwd zzwdVar) throws zzwa {
        int i2;
        int i3;
        String str;
        String str2;
        boolean zIsFeatureSupported;
        boolean z;
        boolean z2;
        int i4;
        boolean zIsHardwareAccelerated;
        boolean z3;
        String strM7119a;
        zzvz zzvzVar2 = zzvzVar;
        zzwd zzwdVar2 = zzwdVar;
        int i5 = zzwdVar2.f21206a;
        try {
            ArrayList arrayList = new ArrayList();
            String str3 = zzvzVar2.f21203a;
            if (zzwdVar2.f21207b == null) {
                zzwdVar2.f21207b = new MediaCodecList(i5).getCodecInfos();
            }
            int length = zzwdVar2.f21207b.length;
            int i6 = 0;
            while (i6 < length) {
                if (zzwdVar2.f21207b == null) {
                    zzwdVar2.f21207b = new MediaCodecList(i5).getCodecInfos();
                }
                MediaCodecInfo mediaCodecInfo = zzwdVar2.f21207b[i6];
                if (Build.VERSION.SDK_INT < 29 || !mediaCodecInfo.isAlias()) {
                    int i7 = i6;
                    String name = mediaCodecInfo.getName();
                    if (mediaCodecInfo.isEncoder()) {
                        i2 = i5;
                        i3 = i7;
                    } else {
                        String[] supportedTypes = mediaCodecInfo.getSupportedTypes();
                        int length2 = supportedTypes.length;
                        int i8 = 0;
                        while (true) {
                            if (i8 >= length2) {
                                if (!str3.equals("video/dolby-vision")) {
                                    if (!str3.equals("video/mv-hevc")) {
                                        if (!str3.equals("audio/alac") || !"OMX.lge.alac.decoder".equals(name)) {
                                            if (!str3.equals("audio/flac") || !"OMX.lge.flac.decoder".equals(name)) {
                                                if (!str3.equals("audio/ac3") || !"OMX.lge.ac3.decoder".equals(name)) {
                                                    str = null;
                                                    break;
                                                }
                                                str = "audio/lg-ac3";
                                                break;
                                            }
                                            str = "audio/x-lg-flac";
                                            break;
                                        }
                                        str = "audio/x-lg-alac";
                                        break;
                                    }
                                    if (!"c2.qti.mvhevc.decoder".equals(name) && !"c2.qti.mvhevc.decoder.secure".equals(name)) {
                                        str = null;
                                        break;
                                    }
                                    str = "video/x-mvhevc";
                                    break;
                                }
                                if (!"OMX.MS.HEVCDV.Decoder".equals(name)) {
                                    if (!"OMX.RTK.video.decoder".equals(name) && !"OMX.realtek.video.decoder.tunneled".equals(name)) {
                                        str = null;
                                        break;
                                    }
                                    str = "video/dv_hevc";
                                    break;
                                }
                                str = "video/hevcdv";
                                break;
                            }
                            int i9 = i8;
                            str = supportedTypes[i9];
                            if (str.equalsIgnoreCase(str3)) {
                                break;
                            }
                            i8 = i9 + 1;
                        }
                        if (str != null) {
                            try {
                                MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(str);
                                boolean zIsFeatureSupported2 = capabilitiesForType.isFeatureSupported("tunneled-playback");
                                boolean zIsFeatureRequired = capabilitiesForType.isFeatureRequired("tunneled-playback");
                                String str4 = str;
                                try {
                                    if (!zzvzVar2.f21205c) {
                                        if (!zIsFeatureRequired) {
                                            zIsFeatureSupported = capabilitiesForType.isFeatureSupported("secure-playback");
                                            boolean zIsFeatureRequired2 = capabilitiesForType.isFeatureRequired("secure-playback");
                                            z = zzvzVar2.f21204b;
                                            if (z || !zIsFeatureRequired2) {
                                                if (!z) {
                                                    z2 = zIsFeatureSupported;
                                                } else if (zIsFeatureSupported) {
                                                    z2 = true;
                                                }
                                                i4 = Build.VERSION.SDK_INT;
                                                i2 = i5;
                                                if (i4 >= 29) {
                                                    zIsHardwareAccelerated = mediaCodecInfo.isHardwareAccelerated();
                                                } else if (m8978f(mediaCodecInfo, str3)) {
                                                    zIsHardwareAccelerated = false;
                                                } else {
                                                    zIsHardwareAccelerated = true;
                                                }
                                                m8978f(mediaCodecInfo, str3);
                                                z3 = zIsHardwareAccelerated;
                                                if (i4 >= 29) {
                                                    mediaCodecInfo.isVendor();
                                                } else {
                                                    strM7119a = zzgsz.m7119a(mediaCodecInfo.getName());
                                                    if (!strM7119a.startsWith("omx.google.") && !strM7119a.startsWith("c2.android.")) {
                                                        strM7119a.startsWith("c2.google.");
                                                    }
                                                }
                                                if (z == z2) {
                                                    i3 = i7;
                                                    str2 = str4;
                                                    try {
                                                        arrayList.add(zzvp.m8943a(name, str3, str2, capabilitiesForType, z3, false));
                                                    } catch (Exception e) {
                                                        e = e;
                                                        StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 24 + str2.length() + 1);
                                                        sb.append("Failed to query codec ");
                                                        sb.append(name);
                                                        sb.append(" (");
                                                        sb.append(str2);
                                                        sb.append(")");
                                                        zzeh.m6213e("MediaCodecUtil", sb.toString());
                                                        throw e;
                                                    }
                                                }
                                            }
                                        }
                                        i3 = i7;
                                    } else if (zIsFeatureSupported2) {
                                        zIsFeatureSupported = capabilitiesForType.isFeatureSupported("secure-playback");
                                        boolean zIsFeatureRequired3 = capabilitiesForType.isFeatureRequired("secure-playback");
                                        z = zzvzVar2.f21204b;
                                        if (z) {
                                            if (!z) {
                                                if (zIsFeatureSupported) {
                                                    z2 = true;
                                                }
                                                i3 = i7;
                                            } else {
                                                z2 = zIsFeatureSupported;
                                            }
                                            i4 = Build.VERSION.SDK_INT;
                                            i2 = i5;
                                            if (i4 >= 29) {
                                                zIsHardwareAccelerated = mediaCodecInfo.isHardwareAccelerated();
                                            } else if (m8978f(mediaCodecInfo, str3)) {
                                                zIsHardwareAccelerated = true;
                                            } else {
                                                zIsHardwareAccelerated = false;
                                            }
                                            m8978f(mediaCodecInfo, str3);
                                            z3 = zIsHardwareAccelerated;
                                            if (i4 >= 29) {
                                                mediaCodecInfo.isVendor();
                                            } else {
                                                strM7119a = zzgsz.m7119a(mediaCodecInfo.getName());
                                                if (!strM7119a.startsWith("omx.google.")) {
                                                    strM7119a.startsWith("c2.google.");
                                                }
                                            }
                                            if (z == z2) {
                                                i3 = i7;
                                            } else {
                                                i3 = i7;
                                                str2 = str4;
                                                arrayList.add(zzvp.m8943a(name, str3, str2, capabilitiesForType, z3, false));
                                            }
                                        } else {
                                            if (!z) {
                                                if (zIsFeatureSupported) {
                                                    z2 = true;
                                                }
                                                i3 = i7;
                                            } else {
                                                z2 = zIsFeatureSupported;
                                            }
                                            i4 = Build.VERSION.SDK_INT;
                                            i2 = i5;
                                            if (i4 >= 29) {
                                                zIsHardwareAccelerated = mediaCodecInfo.isHardwareAccelerated();
                                            } else if (m8978f(mediaCodecInfo, str3)) {
                                                zIsHardwareAccelerated = true;
                                            } else {
                                                zIsHardwareAccelerated = false;
                                            }
                                            m8978f(mediaCodecInfo, str3);
                                            z3 = zIsHardwareAccelerated;
                                            if (i4 >= 29) {
                                                mediaCodecInfo.isVendor();
                                            } else {
                                                strM7119a = zzgsz.m7119a(mediaCodecInfo.getName());
                                                if (!strM7119a.startsWith("omx.google.")) {
                                                    strM7119a.startsWith("c2.google.");
                                                }
                                            }
                                            if (z == z2) {
                                                i3 = i7;
                                            } else {
                                                i3 = i7;
                                                str2 = str4;
                                                arrayList.add(zzvp.m8943a(name, str3, str2, capabilitiesForType, z3, false));
                                            }
                                        }
                                    }
                                    i2 = i5;
                                    i3 = i7;
                                } catch (Exception e2) {
                                    e = e2;
                                    str2 = str4;
                                }
                            } catch (Exception e3) {
                                e = e3;
                                str2 = str;
                            }
                        } else {
                            i2 = i5;
                            i3 = i7;
                        }
                    }
                } else {
                    i2 = i5;
                    i3 = i6;
                }
                i6 = i3 + 1;
                zzvzVar2 = zzvzVar;
                zzwdVar2 = zzwdVar;
                i5 = i2;
            }
            return arrayList;
        } catch (Exception e4) {
            throw new zzwa("Failed to query underlying media codecs", e4);
        }
    }

    /* JADX INFO: renamed from: f */
    public static boolean m8978f(MediaCodecInfo mediaCodecInfo, String str) {
        if (Build.VERSION.SDK_INT >= 29) {
            return mediaCodecInfo.isSoftwareOnly();
        }
        if (zzas.m4349a(str)) {
            return true;
        }
        String strM7119a = zzgsz.m7119a(mediaCodecInfo.getName());
        if (strM7119a.startsWith("arc.")) {
            return false;
        }
        if (strM7119a.startsWith("omx.google.") || strM7119a.startsWith("omx.ffmpeg.")) {
            return true;
        }
        if ((strM7119a.startsWith("omx.sec.") && strM7119a.contains(".sw.")) || strM7119a.equals("omx.qcom.video.decoder.hevcswvdec") || strM7119a.startsWith("c2.android.") || strM7119a.startsWith("c2.google.")) {
            return true;
        }
        return (strM7119a.startsWith("omx.") || strM7119a.startsWith("c2.")) ? false : true;
    }
}
