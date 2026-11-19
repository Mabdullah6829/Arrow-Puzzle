package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class zzas {

    /* JADX INFO: renamed from: a */
    public static final ArrayList f6816a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public static final Pattern f6817b = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    /* JADX INFO: renamed from: a */
    public static boolean m4349a(String str) {
        return "audio".equals(m4358j(str));
    }

    /* JADX INFO: renamed from: b */
    public static boolean m4350b(String str) {
        return "video".equals(m4358j(str));
    }

    /* JADX INFO: renamed from: c */
    public static boolean m4351c(String str) {
        return "image".equals(m4358j(str)) || "application/x-image-uri".equals(str);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:71:0x00fa  */
    /* JADX INFO: renamed from: d */
    public static boolean m4352d(String str, String str2) {
        zzar zzarVarM4357i;
        int iM4335a;
        if (str == null) {
            return false;
        }
        switch (str) {
            case "video/apv":
            case "audio/mpeg":
            case "audio/mpeg-L1":
            case "audio/mpeg-L2":
            case "audio/raw":
            case "audio/g711-alaw":
            case "audio/g711-mlaw":
            case "audio/flac":
            case "audio/ac3":
            case "audio/eac3":
            case "audio/eac3-joc":
            case "application/x-media3-cues":
            case "application/id3":
            case "application/x-emsg":
            case "application/x-scte35":
            case "application/x-icy":
            case "application/vnd.dvb.ait":
            case "application/meta":
            case "application/x-itut-t35":
            case "application/x-camera-motion":
                return true;
            case "audio/mp4a-latm":
                return (str2 == null || (zzarVarM4357i = m4357i(str2)) == null || (iM4335a = zzarVarM4357i.m4335a()) == 0 || iM4335a == 16) ? false : true;
            default:
                return false;
        }
    }

    /* JADX INFO: renamed from: e */
    public static String m4353e(int i2) {
        if (i2 == 32) {
            return "video/mp4v-es";
        }
        if (i2 == 33) {
            return "video/avc";
        }
        if (i2 == 35) {
            return "video/hevc";
        }
        if (i2 == 64) {
            return "audio/mp4a-latm";
        }
        if (i2 == 163) {
            return "video/wvc1";
        }
        if (i2 == 177) {
            return "video/x-vnd.on2.vp9";
        }
        if (i2 == 221) {
            return "audio/vorbis";
        }
        if (i2 == 165) {
            return "audio/ac3";
        }
        if (i2 == 166) {
            return "audio/eac3";
        }
        switch (i2) {
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case 101:
                return "video/mpeg2";
            case 102:
            case 103:
            case 104:
                return "audio/mp4a-latm";
            case 105:
            case 107:
                return "audio/mpeg";
            case 106:
                return "video/mpeg";
            case 108:
                return "image/jpeg";
            default:
                switch (i2) {
                    case 169:
                    case 172:
                        return "audio/vnd.dts";
                    case 170:
                    case 171:
                        return "audio/vnd.dts.hd";
                    case 173:
                        return "audio/opus";
                    case 174:
                        return "audio/ac4";
                    default:
                        return null;
                }
        }
    }

    /* JADX INFO: renamed from: f */
    public static int m4354f(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (m4349a(str)) {
            return 1;
        }
        if (m4350b(str)) {
            return 2;
        }
        if ("text".equals(m4358j(str)) || "application/x-media3-cues".equals(str) || "application/cea-608".equals(str) || "application/cea-708".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/x-subrip".equals(str) || "application/ttml+xml".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-rawcc".equals(str) || "application/vobsub".equals(str) || "application/pgs".equals(str) || "application/dvbsubs".equals(str)) {
            return 3;
        }
        if (m4351c(str)) {
            return 4;
        }
        if ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str) || "application/meta".equals(str) || "application/x-itut-t35".equals(str)) {
            return 5;
        }
        if ("application/x-camera-motion".equals(str)) {
            return 6;
        }
        ArrayList arrayList = f6816a;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((zzaq) arrayList.get(i2)).getClass();
            if (str.equals(null)) {
                return 0;
            }
        }
        return -1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:44:0x009a  */
    /* JADX INFO: renamed from: g */
    public static int m4355g(String str, String str2) {
        zzar zzarVarM4357i;
        switch (str) {
            case "audio/mpeg":
                return 9;
            case "audio/mp4a-latm":
                if (str2 == null || (zzarVarM4357i = m4357i(str2)) == null) {
                    return 0;
                }
                return zzarVarM4357i.m4335a();
            case "audio/ac3":
                return 5;
            case "audio/eac3":
                return 6;
            case "audio/eac3-joc":
                return 18;
            case "audio/ac4":
                return 17;
            case "audio/vnd.dts":
                return 7;
            case "audio/vnd.dts.hd":
            case "audio/vnd.dts.hd;profile=lbr":
                return 8;
            case "audio/vnd.dts.uhd;profile=p2":
                return 30;
            case "audio/true-hd":
                return 14;
            case "audio/opus":
                return 20;
            case "audio/dsd":
                return 31;
            default:
                return 0;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:29:0x0056  */
    /* JADX INFO: renamed from: h */
    public static String m4356h(String str) {
        if (str == null) {
            return null;
        }
        String strM7119a = zzgsz.m7119a(str);
        switch (strM7119a) {
            case "video/x-mvhevc":
                return "video/mv-hevc";
            case "audio/x-flac":
                return "audio/flac";
            case "audio/mp3":
                return "audio/mpeg";
            case "audio/x-wav":
                return "audio/wav";
            case "application/x-mpegurl":
                return "application/x-mpegURL";
            case "audio/mpeg-l1":
                return "audio/mpeg-L1";
            case "audio/mpeg-l2":
                return "audio/mpeg-L2";
            default:
                return strM7119a;
        }
    }

    /* JADX INFO: renamed from: i */
    public static zzar m4357i(String str) {
        Matcher matcher = f6817b.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String strGroup = matcher.group(1);
        strGroup.getClass();
        String strGroup2 = matcher.group(2);
        try {
            Integer.parseInt(strGroup, 16);
            return new zzar(strGroup2 != null ? Integer.parseInt(strGroup2) : 0);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: j */
    public static String m4358j(String str) {
        int iIndexOf;
        if (str == null || (iIndexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, iIndexOf);
    }
}
