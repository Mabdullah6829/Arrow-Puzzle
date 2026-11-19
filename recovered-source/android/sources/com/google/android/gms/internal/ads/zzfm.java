package com.google.android.gms.internal.ads;

import android.app.UiModeManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.constraintlayout.widget.C1137R;
import androidx.core.location.LocationRequestCompat;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.facebook.ads.AdError;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.math.RoundingMode;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.regex.Pattern;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import p011H.AbstractC0271e0;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfm {

    /* JADX INFO: renamed from: a */
    public static final String f16091a;

    /* JADX INFO: renamed from: b */
    public static final byte[] f16092b;

    /* JADX INFO: renamed from: c */
    public static final Pattern f16093c;

    /* JADX INFO: renamed from: d */
    public static HashMap f16094d;

    /* JADX INFO: renamed from: e */
    public static final String[] f16095e;

    /* JADX INFO: renamed from: f */
    public static final String[] f16096f;

    /* JADX INFO: renamed from: g */
    public static final int[] f16097g;

    /* JADX INFO: renamed from: h */
    public static final int[] f16098h;

    /* JADX INFO: renamed from: i */
    public static final int[] f16099i;

    static {
        String str = Build.DEVICE;
        String str2 = Build.MODEL;
        String str3 = Build.MANUFACTURER;
        int i2 = Build.VERSION.SDK_INT;
        int length = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 2 + String.valueOf(str2).length() + 2 + String.valueOf(str3).length() + 2 + String.valueOf(i2).length());
        AbstractC0271e0.m413u(sb, str, ", ", str2, ", ");
        sb.append(str3);
        sb.append(", ");
        sb.append(i2);
        f16091a = sb.toString();
        f16092b = new byte[0];
        f16093c = Pattern.compile("(?:.*\\.)?isml?(?:/(manifest(.*))?)?", 2);
        f16095e = new String[]{"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", "id", "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "arb", "ar-arb", "in", "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};
        f16096f = new String[]{"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
        f16097g = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
        f16098h = new int[]{0, 4129, 8258, 12387, 16516, 20645, 24774, 28903, 33032, 37161, 41290, 45419, 49548, 53677, 57806, 61935};
        f16099i = new int[]{0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, C1137R.styleable.ConstraintSet_quantizeMotionSteps, 126, C1137R.styleable.ConstraintSet_transitionEasing, 108, 107, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, 252, 251, 242, 245, 216, 223, 214, 209, 196, 195, 202, 205, 144, 151, 158, 153, 140, 139, 130, 133, 168, 175, 166, 161, 180, 179, 186, 189, 199, 192, 201, 206, 219, 220, 213, 210, 255, 248, 241, 246, 227, 228, 237, 234, 183, 176, ModuleDescriptor.MODULE_VERSION, 190, 171, 172, 165, 162, 143, 136, 129, 134, 147, 148, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, 102, 115, C1137R.styleable.ConstraintSet_pathMotionArc, 125, C1137R.styleable.ConstraintSet_transitionPathRotate, 137, 142, 135, 128, 149, 146, 155, 156, 177, 182, 191, 184, 173, 170, 163, 164, 249, 254, 247, 240, 229, 226, 235, 236, 193, 198, 207, 200, 221, 218, 211, 212, 105, 110, 103, 96, C1137R.styleable.ConstraintSet_pivotAnchor, 114, 123, 124, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, C1137R.styleable.ConstraintSet_polarRelativeTo, 113, C1137R.styleable.ConstraintSet_stateLabels, 127, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, 160, 167, 178, 181, 188, 187, 150, 145, 152, 159, 138, 141, 132, 131, 222, 217, 208, 215, 194, 197, 204, 203, 230, 225, 232, 239, ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION, 253, 244, 243};
    }

    /* JADX INFO: renamed from: a */
    public static String m6499a(int i2) {
        return new String(new byte[]{(byte) (i2 >> 24), (byte) (i2 >> 16), (byte) (i2 >> 8), (byte) i2}, StandardCharsets.US_ASCII);
    }

    /* JADX INFO: renamed from: b */
    public static int m6500b(int i2, ByteOrder byteOrder) {
        if (i2 == 8) {
            return 3;
        }
        if (i2 == 16) {
            return byteOrder.equals(ByteOrder.LITTLE_ENDIAN) ? 2 : 268435456;
        }
        if (i2 == 24) {
            return byteOrder.equals(ByteOrder.LITTLE_ENDIAN) ? 21 : 1342177280;
        }
        if (i2 != 32) {
            return 0;
        }
        return byteOrder.equals(ByteOrder.LITTLE_ENDIAN) ? 22 : 1610612736;
    }

    /* JADX INFO: renamed from: c */
    public static int m6501c(int i2, ByteOrder byteOrder) {
        if (i2 == 32) {
            return byteOrder.equals(ByteOrder.LITTLE_ENDIAN) ? 4 : 1895825408;
        }
        if (i2 != 64) {
            return 0;
        }
        return byteOrder.equals(ByteOrder.LITTLE_ENDIAN) ? 1879048192 : 1912602624;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m6502d(int i2) {
        return i2 == 3 || i2 == 2 || i2 == 268435456 || i2 == 21 || i2 == 1342177280 || i2 == 22 || i2 == 1610612736 || i2 == 4 || i2 == 1895825408 || i2 == 1879048192 || i2 == 1912602624;
    }

    /* JADX INFO: renamed from: e */
    public static int m6503e(int i2) {
        int i3;
        int i4 = 6396;
        if (i2 != 10) {
            if (i2 == 16) {
                i3 = 205215996;
            } else if (i2 != 24) {
                switch (i2) {
                    case 1:
                        return 4;
                    case 2:
                        return 12;
                    case 3:
                        return 28;
                    case 4:
                        return 204;
                    case 5:
                        return 220;
                    case 6:
                        return 252;
                    case 7:
                        return 1276;
                    case 8:
                        return 6396;
                    default:
                        switch (i2) {
                            case 12:
                                return 743676;
                            case 13:
                                i3 = 30136348;
                                break;
                            case 14:
                                i3 = 202070268;
                                break;
                            default:
                                return 0;
                        }
                        break;
                }
            } else {
                i3 = 67108860;
            }
            i4 = 0;
        } else {
            i3 = 737532;
        }
        return Build.VERSION.SDK_INT >= 32 ? i3 : i4;
    }

    /* JADX INFO: renamed from: f */
    public static int m6504f(int i2) {
        if (i2 != 2) {
            if (i2 == 3) {
                return 1;
            }
            if (i2 != 4) {
                if (i2 != 21) {
                    if (i2 != 22) {
                        if (i2 != 268435456) {
                            if (i2 != 1342177280) {
                                if (i2 != 1610612736) {
                                    if (i2 == 1879048192) {
                                        return 8;
                                    }
                                    if (i2 != 1895825408) {
                                        if (i2 == 1912602624) {
                                            return 8;
                                        }
                                        throw new IllegalArgumentException();
                                    }
                                }
                            }
                        }
                    }
                }
                return 3;
            }
            return 4;
        }
        return 2;
    }

    /* JADX INFO: renamed from: g */
    public static int m6505g(int i2) {
        if (i2 == 2 || i2 == 4) {
            return 6005;
        }
        if (i2 == 10) {
            return 6004;
        }
        if (i2 == 7) {
            return 6005;
        }
        if (i2 == 8) {
            return AdError.AD_ASSETS_UNSUPPORTED_TYPE_ERROR_CODE;
        }
        switch (i2) {
            case 15:
                return AdError.AD_ASSETS_UNSUPPORTED_TYPE_ERROR_CODE;
            case 16:
            case 18:
                return 6005;
            case 17:
            case 19:
            case 20:
            case 21:
            case 22:
                return 6004;
            default:
                switch (i2) {
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                        return AdError.ICONVIEW_MISSING_ERROR_CODE;
                    default:
                        return 6006;
                }
        }
    }

    /* JADX INFO: renamed from: h */
    public static int m6506h(int i2, byte[] bArr, int i3, int i4) {
        while (i2 < i3) {
            i4 = f16097g[(i4 >>> 24) ^ (bArr[i2] & 255)] ^ (i4 << 8);
            i2++;
        }
        return i4;
    }

    /* JADX INFO: renamed from: i */
    public static boolean m6507i(zzeu zzeuVar, zzeu zzeuVar2, Inflater inflater) {
        boolean z;
        if (zzeuVar.m6360B() > 0 && zzeuVar.m6367I() == 120) {
            if (zzeuVar.m6360B() == 0) {
                z = false;
            } else {
                if (zzeuVar2.f14887a.length < zzeuVar.m6360B()) {
                    int iM6360B = zzeuVar.m6360B();
                    zzeuVar2.m6359A(iM6360B + iM6360B);
                }
                if (inflater == null) {
                    inflater = new Inflater();
                }
                inflater.setInput(zzeuVar.f14887a, zzeuVar.f14888b, zzeuVar.m6360B());
                int iInflate = 0;
                while (true) {
                    try {
                        byte[] bArr = zzeuVar2.f14887a;
                        iInflate += inflater.inflate(bArr, iInflate, bArr.length - iInflate);
                        if (inflater.finished()) {
                            zzeuVar2.m6361C(iInflate);
                            z = true;
                            break;
                        }
                        if (inflater.needsDictionary() || inflater.needsInput()) {
                            z = false;
                            break;
                        }
                        byte[] bArr2 = zzeuVar2.f14887a;
                        if (iInflate == bArr2.length) {
                            int length = bArr2.length;
                            zzeuVar2.m6359A(length + length);
                        }
                    } catch (DataFormatException unused) {
                    } catch (Throwable th) {
                        inflater.reset();
                        throw th;
                    }
                }
                inflater.reset();
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: j */
    public static boolean m6508j(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }

    /* JADX INFO: renamed from: k */
    public static int m6509k(String str) {
        String[] strArrSplit;
        int length;
        if (str == null || (length = (strArrSplit = str.split("_", -1)).length) < 2) {
            return 0;
        }
        String str2 = strArrSplit[length - 1];
        boolean z = length >= 3 && "neg".equals(strArrSplit[length + (-2)]);
        try {
            if (str2 == null) {
                throw null;
            }
            int i2 = Integer.parseInt(str2);
            return z ? -i2 : i2;
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    /* JADX INFO: renamed from: l */
    public static boolean m6510l(Context context) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 29 || context.getApplicationInfo().targetSdkVersion < 29) {
            return true;
        }
        if (i2 == 30) {
            String str = Build.MODEL;
            if (zzgsz.m7122d(str, "moto g(20)") || zzgsz.m7122d(str, "rmx3231")) {
                return true;
            }
        }
        return i2 == 34 && zzgsz.m7122d(Build.MODEL, "sm-x200");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:57:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:60:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:61:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:65:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:68:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:70:0x0100  */
    /* JADX INFO: renamed from: m */
    public static long m6511m(long j2, long j3, long j4, RoundingMode roundingMode) {
        double dRint;
        long j5;
        long j6;
        boolean z;
        long jM7298c = zzhai.m7298c(j2, j3);
        if (jM7298c != LocationRequestCompat.PASSIVE_INTERVAL && jM7298c != Long.MIN_VALUE) {
            return zzhai.m7296a(jM7298c, j4, roundingMode);
        }
        long jM7297b = zzhai.m7297b(Math.abs(j3), Math.abs(j4));
        RoundingMode roundingMode2 = RoundingMode.UNNECESSARY;
        long jM7296a = zzhai.m7296a(j3, jM7297b, roundingMode2);
        long jM7296a2 = zzhai.m7296a(j4, jM7297b, roundingMode2);
        long jM7297b2 = zzhai.m7297b(Math.abs(j2), Math.abs(jM7296a2));
        long jM7296a3 = zzhai.m7296a(j2, jM7297b2, roundingMode2);
        long jM7296a4 = zzhai.m7296a(jM7296a2, jM7297b2, roundingMode2);
        long jM7298c2 = zzhai.m7298c(jM7296a3, jM7296a);
        if (jM7298c2 != LocationRequestCompat.PASSIVE_INTERVAL && jM7298c2 != Long.MIN_VALUE) {
            return zzhai.m7296a(jM7298c2, jM7296a4, roundingMode);
        }
        double d = (jM7296a / jM7296a4) * jM7296a3;
        if (d > 9.223372036854776E18d) {
            return LocationRequestCompat.PASSIVE_INTERVAL;
        }
        if (d < -9.223372036854776E18d) {
            return Long.MIN_VALUE;
        }
        int i2 = zzhad.f18422a;
        if (!zzhae.m7294b(d)) {
            throw new ArithmeticException("input is infinite or NaN");
        }
        switch (zzhac.f18421a[roundingMode.ordinal()]) {
            case 1:
                zzhaj.m7300b(zzhad.m7292c(d));
                dRint = d;
                if ((-9.223372036854776E18d) - dRint < 1.0d) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && (dRint < 9.223372036854776E18d)) {
                    return (long) dRint;
                }
                String strValueOf = String.valueOf(roundingMode);
                StringBuilder sb = new StringBuilder(String.valueOf(d).length() + 59 + strValueOf.length());
                sb.append("rounded value is out of range for input ");
                sb.append(d);
                sb.append(" and rounding mode ");
                sb.append(strValueOf);
                throw new ArithmeticException(sb.toString());
            case 2:
                if (d >= 0.0d || zzhad.m7292c(d)) {
                    dRint = d;
                } else {
                    j5 = (long) d;
                    j6 = -1;
                    dRint = j5 + j6;
                }
                if ((-9.223372036854776E18d) - dRint < 1.0d) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && (dRint < 9.223372036854776E18d)) {
                    return (long) dRint;
                }
                String strValueOf2 = String.valueOf(roundingMode);
                StringBuilder sb2 = new StringBuilder(String.valueOf(d).length() + 59 + strValueOf2.length());
                sb2.append("rounded value is out of range for input ");
                sb2.append(d);
                sb2.append(" and rounding mode ");
                sb2.append(strValueOf2);
                throw new ArithmeticException(sb2.toString());
            case 3:
                if (d <= 0.0d || zzhad.m7292c(d)) {
                    dRint = d;
                } else {
                    j5 = (long) d;
                    j6 = 1;
                    dRint = j5 + j6;
                }
                if ((-9.223372036854776E18d) - dRint < 1.0d) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && (dRint < 9.223372036854776E18d)) {
                    return (long) dRint;
                }
                String strValueOf3 = String.valueOf(roundingMode);
                StringBuilder sb3 = new StringBuilder(String.valueOf(d).length() + 59 + strValueOf3.length());
                sb3.append("rounded value is out of range for input ");
                sb3.append(d);
                sb3.append(" and rounding mode ");
                sb3.append(strValueOf3);
                throw new ArithmeticException(sb3.toString());
            case 4:
                dRint = d;
                if ((-9.223372036854776E18d) - dRint < 1.0d) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && (dRint < 9.223372036854776E18d)) {
                    return (long) dRint;
                }
                String strValueOf4 = String.valueOf(roundingMode);
                StringBuilder sb4 = new StringBuilder(String.valueOf(d).length() + 59 + strValueOf4.length());
                sb4.append("rounded value is out of range for input ");
                sb4.append(d);
                sb4.append(" and rounding mode ");
                sb4.append(strValueOf4);
                throw new ArithmeticException(sb4.toString());
            case 5:
                if (zzhad.m7292c(d)) {
                    dRint = d;
                } else {
                    dRint = ((long) d) + ((long) (d > 0.0d ? 1 : -1));
                }
                if ((-9.223372036854776E18d) - dRint < 1.0d) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && (dRint < 9.223372036854776E18d)) {
                    return (long) dRint;
                }
                String strValueOf5 = String.valueOf(roundingMode);
                StringBuilder sb5 = new StringBuilder(String.valueOf(d).length() + 59 + strValueOf5.length());
                sb5.append("rounded value is out of range for input ");
                sb5.append(d);
                sb5.append(" and rounding mode ");
                sb5.append(strValueOf5);
                throw new ArithmeticException(sb5.toString());
            case 6:
                dRint = Math.rint(d);
                if ((-9.223372036854776E18d) - dRint < 1.0d) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && (dRint < 9.223372036854776E18d)) {
                    return (long) dRint;
                }
                String strValueOf6 = String.valueOf(roundingMode);
                StringBuilder sb6 = new StringBuilder(String.valueOf(d).length() + 59 + strValueOf6.length());
                sb6.append("rounded value is out of range for input ");
                sb6.append(d);
                sb6.append(" and rounding mode ");
                sb6.append(strValueOf6);
                throw new ArithmeticException(sb6.toString());
            case 7:
                dRint = Math.rint(d);
                if (Math.abs(d - dRint) == 0.5d) {
                    dRint = Math.copySign(0.5d, d) + d;
                }
                if ((-9.223372036854776E18d) - dRint < 1.0d) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && (dRint < 9.223372036854776E18d)) {
                    return (long) dRint;
                }
                String strValueOf7 = String.valueOf(roundingMode);
                StringBuilder sb7 = new StringBuilder(String.valueOf(d).length() + 59 + strValueOf7.length());
                sb7.append("rounded value is out of range for input ");
                sb7.append(d);
                sb7.append(" and rounding mode ");
                sb7.append(strValueOf7);
                throw new ArithmeticException(sb7.toString());
            case 8:
                dRint = Math.rint(d);
                if (Math.abs(d - dRint) == 0.5d) {
                    dRint = d;
                }
                if ((-9.223372036854776E18d) - dRint < 1.0d) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && (dRint < 9.223372036854776E18d)) {
                    return (long) dRint;
                }
                String strValueOf8 = String.valueOf(roundingMode);
                StringBuilder sb8 = new StringBuilder(String.valueOf(d).length() + 59 + strValueOf8.length());
                sb8.append("rounded value is out of range for input ");
                sb8.append(d);
                sb8.append(" and rounding mode ");
                sb8.append(strValueOf8);
                throw new ArithmeticException(sb8.toString());
            default:
                throw new AssertionError();
        }
    }

    /* JADX INFO: renamed from: n */
    public static String m6512n(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, str);
        } catch (Exception e) {
            zzeh.m6214f("Util", "Failed to read system property ".concat(str), e);
            return null;
        }
    }

    /* JADX INFO: renamed from: o */
    public static Object[] m6513o(int i2, Object[] objArr) {
        zzgtr.m7128a(i2 <= objArr.length);
        return Arrays.copyOf(objArr, i2);
    }

    /* JADX INFO: renamed from: p */
    public static Handler m6514p() {
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        return new Handler(looperMyLooper, null);
    }

    /* JADX INFO: renamed from: q */
    public static String m6515q(String str) {
        if (str == null) {
            return null;
        }
        String strReplace = str.replace('_', '-');
        if (!strReplace.isEmpty() && !strReplace.equals("und")) {
            str = strReplace;
        }
        String strM7119a = zzgsz.m7119a(str);
        int i2 = 0;
        String str2 = strM7119a.split("-", 2)[0];
        if (f16094d == null) {
            String[] iSOLanguages = Locale.getISOLanguages();
            int length = iSOLanguages.length;
            String[] strArr = f16095e;
            int length2 = strArr.length;
            HashMap map = new HashMap(length + 88);
            for (String str3 : iSOLanguages) {
                try {
                    String iSO3Language = new Locale(str3).getISO3Language();
                    if (!TextUtils.isEmpty(iSO3Language)) {
                        map.put(iSO3Language, str3);
                    }
                } catch (MissingResourceException unused) {
                }
            }
            for (int i3 = 0; i3 < 88; i3 += 2) {
                map.put(strArr[i3], strArr[i3 + 1]);
            }
            f16094d = map;
        }
        String str4 = (String) f16094d.get(str2);
        if (str4 != null) {
            strM7119a = str4.concat(String.valueOf(strM7119a.substring(str2.length())));
            str2 = str4;
        }
        if (!"no".equals(str2) && !"i".equals(str2) && !"zh".equals(str2)) {
            return strM7119a;
        }
        while (true) {
            String[] strArr2 = f16096f;
            int length3 = strArr2.length;
            if (i2 >= 18) {
                return strM7119a;
            }
            if (strM7119a.startsWith(strArr2[i2])) {
                return String.valueOf(strArr2[i2 + 1]).concat(String.valueOf(strM7119a.substring(strArr2[i2].length())));
            }
            i2 += 2;
        }
    }

    /* JADX INFO: renamed from: r */
    public static int m6516r(int[] iArr, int i2, boolean z, boolean z2) {
        int i3;
        int i4;
        int iBinarySearch = Arrays.binarySearch(iArr, i2);
        if (iBinarySearch < 0) {
            i4 = -(iBinarySearch + 2);
        } else {
            while (true) {
                i3 = iBinarySearch - 1;
                if (i3 < 0 || iArr[i3] != i2) {
                    break;
                }
                iBinarySearch = i3;
            }
            i4 = z ? iBinarySearch : i3;
        }
        return z2 ? Math.max(0, i4) : i4;
    }

    /* JADX INFO: renamed from: s */
    public static int m6517s(long[] jArr, long j2, boolean z) {
        int i2;
        int iBinarySearch = Arrays.binarySearch(jArr, j2);
        if (iBinarySearch < 0) {
            i2 = -(iBinarySearch + 2);
        } else {
            while (true) {
                int i3 = iBinarySearch - 1;
                if (i3 < 0 || jArr[i3] != j2) {
                    break;
                }
                iBinarySearch = i3;
            }
            i2 = iBinarySearch;
        }
        return z ? Math.max(0, i2) : i2;
    }

    /* JADX INFO: renamed from: t */
    public static long m6518t(long j2) {
        return (j2 == -9223372036854775807L || j2 == Long.MIN_VALUE) ? j2 : j2 / 1000;
    }

    /* JADX INFO: renamed from: u */
    public static long m6519u(long j2) {
        return (j2 == -9223372036854775807L || j2 == Long.MIN_VALUE) ? j2 : j2 * 1000;
    }

    /* JADX INFO: renamed from: v */
    public static long m6520v(int i2, long j2) {
        return m6521w(j2, 1000000L, i2, RoundingMode.DOWN);
    }

    /* JADX INFO: renamed from: w */
    public static long m6521w(long j2, long j3, long j4, RoundingMode roundingMode) {
        if (j2 == 0 || j3 == 0) {
            return 0L;
        }
        if (j4 >= j3 && j4 % j3 == 0) {
            return zzhai.m7296a(j2, zzhai.m7296a(j4, j3, RoundingMode.UNNECESSARY), roundingMode);
        }
        if (j4 < j3 && j3 % j4 == 0) {
            return zzhai.m7298c(j2, zzhai.m7296a(j3, j4, RoundingMode.UNNECESSARY));
        }
        if (j4 < j2 || j4 % j2 != 0) {
            return (j4 >= j2 || j2 % j4 != 0) ? m6511m(j2, j3, j4, roundingMode) : zzhai.m7298c(j3, zzhai.m7296a(j2, j4, RoundingMode.UNNECESSARY));
        }
        return zzhai.m7296a(j3, zzhai.m7296a(j4, j2, RoundingMode.UNNECESSARY), roundingMode);
    }

    /* JADX INFO: renamed from: x */
    public static void m6522x(long[] jArr, long j2) {
        long j3;
        RoundingMode roundingMode = RoundingMode.DOWN;
        int i2 = 0;
        if (j2 >= 1000000 && j2 % 1000000 == 0) {
            long jM7296a = zzhai.m7296a(j2, 1000000L, RoundingMode.UNNECESSARY);
            while (i2 < jArr.length) {
                jArr[i2] = zzhai.m7296a(jArr[i2], jM7296a, roundingMode);
                i2++;
            }
            return;
        }
        if (j2 < 1000000 && 1000000 % j2 == 0) {
            long jM7296a2 = zzhai.m7296a(1000000L, j2, RoundingMode.UNNECESSARY);
            while (i2 < jArr.length) {
                jArr[i2] = zzhai.m7298c(jArr[i2], jM7296a2);
                i2++;
            }
            return;
        }
        int i3 = 0;
        while (i3 < jArr.length) {
            long j4 = jArr[i3];
            if (j4 != 0) {
                if (j2 >= j4 && j2 % j4 == 0) {
                    jArr[i3] = zzhai.m7296a(1000000L, zzhai.m7296a(j2, j4, RoundingMode.UNNECESSARY), roundingMode);
                } else if (j2 >= j4 || j4 % j2 != 0) {
                    j3 = j2;
                    jArr[i3] = m6511m(j4, 1000000L, j3, roundingMode);
                } else {
                    jArr[i3] = zzhai.m7298c(1000000L, zzhai.m7296a(j4, j2, RoundingMode.UNNECESSARY));
                }
                j3 = j2;
            } else {
                j3 = j2;
            }
            i3++;
            j2 = j3;
        }
    }

    /* JADX INFO: renamed from: y */
    public static long m6523y(long j2, float f2) {
        return f2 == 1.0f ? j2 : Math.round(j2 * ((double) f2));
    }
}
