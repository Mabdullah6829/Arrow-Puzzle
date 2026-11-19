package com.google.android.gms.internal.ads;

import android.text.Layout;
import android.text.TextUtils;
import com.google.firebase.messaging.Constants;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaos implements zzans {

    /* JADX INFO: renamed from: b */
    public static final Pattern f6287b = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");

    /* JADX INFO: renamed from: c */
    public static final Pattern f6288c = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");

    /* JADX INFO: renamed from: d */
    public static final Pattern f6289d = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");

    /* JADX INFO: renamed from: e */
    public static final Pattern f6290e = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");

    /* JADX INFO: renamed from: f */
    public static final Pattern f6291f = Pattern.compile("^([-+]?\\d+\\.?\\d*?)% ([-+]?\\d+\\.?\\d*?)%$");

    /* JADX INFO: renamed from: g */
    public static final Pattern f6292g = Pattern.compile("^([-+]?\\d+\\.?\\d*?)px ([-+]?\\d+\\.?\\d*?)px$");

    /* JADX INFO: renamed from: h */
    public static final Pattern f6293h = Pattern.compile("^(\\d+) (\\d+)$");

    /* JADX INFO: renamed from: i */
    public static final zzaoq f6294i = new zzaoq(30.0f, 1, 1);

    /* JADX INFO: renamed from: a */
    public final XmlPullParserFactory f6295a;

    public zzaos() {
        try {
            XmlPullParserFactory xmlPullParserFactoryNewInstance = XmlPullParserFactory.newInstance();
            this.f6295a = xmlPullParserFactoryNewInstance;
            xmlPullParserFactoryNewInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:105:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:129:0x022d  */
    /* JADX WARN: Code duplicated, block: B:136:0x023d  */
    /* JADX WARN: Code duplicated, block: B:153:0x0277  */
    /* JADX WARN: Code duplicated, block: B:173:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:200:0x0326  */
    /* JADX WARN: Code duplicated, block: B:223:0x0378  */
    /* JADX WARN: Code duplicated, block: B:260:0x042e  */
    /* JADX WARN: Code duplicated, block: B:58:0x00da  */
    /* JADX WARN: Code duplicated, block: B:91:0x018d  */
    /* JADX INFO: renamed from: c */
    public static zzaov m4272c(XmlPullParser xmlPullParser, zzaov zzaovVar) {
        Matcher matcher;
        byte b;
        byte b2;
        byte b3;
        byte b4;
        byte b5;
        zzaoo zzaooVar;
        byte b6;
        int i2;
        byte b7;
        int i3;
        int attributeCount = xmlPullParser.getAttributeCount();
        zzaov zzaovVarM4273d = zzaovVar;
        for (int i4 = 0; i4 < attributeCount; i4++) {
            String attributeValue = xmlPullParser.getAttributeValue(i4);
            switch (xmlPullParser.getAttributeName(i4)) {
                case "id":
                    if ("style".equals(xmlPullParser.getName())) {
                        zzaovVarM4273d = m4273d(zzaovVarM4273d);
                        zzaovVarM4273d.f6317l = attributeValue;
                        continue;
                    }
                    break;
                case "backgroundColor":
                    zzaovVarM4273d = m4273d(zzaovVarM4273d);
                    try {
                        zzaovVarM4273d.f6309d = zzds.m6043a(attributeValue, false);
                        zzaovVarM4273d.f6310e = true;
                        continue;
                    } catch (IllegalArgumentException unused) {
                        AbstractC5152f.m3775g(attributeValue, "Failed parsing background value: ", "TtmlParser");
                    }
                    break;
                case "color":
                    zzaovVarM4273d = m4273d(zzaovVarM4273d);
                    try {
                        zzaovVarM4273d.f6307b = zzds.m6043a(attributeValue, false);
                        zzaovVarM4273d.f6308c = true;
                        break;
                    } catch (IllegalArgumentException unused2) {
                        AbstractC5152f.m3775g(attributeValue, "Failed parsing color value: ", "TtmlParser");
                        break;
                    }
                    break;
                case "fontFamily":
                    zzaovVarM4273d = m4273d(zzaovVarM4273d);
                    zzaovVarM4273d.f6306a = attributeValue;
                    break;
                case "fontSize":
                    try {
                        zzaovVarM4273d = m4273d(zzaovVarM4273d);
                        String str = zzfm.f16091a;
                        String[] strArrSplit = attributeValue.split("\\s+", -1);
                        int length = strArrSplit.length;
                        Pattern pattern = f6289d;
                        if (length == 1) {
                            matcher = pattern.matcher(attributeValue);
                        } else {
                            if (length != 2) {
                                StringBuilder sb = new StringBuilder(String.valueOf(length).length() + 41);
                                sb.append("Invalid number of entries for fontSize: ");
                                sb.append(length);
                                sb.append(".");
                                throw new zzano(sb.toString());
                            }
                            matcher = pattern.matcher(strArrSplit[1]);
                            zzeh.m6211c("TtmlParser", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
                        }
                        if (!matcher.matches()) {
                            StringBuilder sb2 = new StringBuilder(attributeValue.length() + 36);
                            sb2.append("Invalid expression for fontSize: '");
                            sb2.append(attributeValue);
                            sb2.append("'.");
                            throw new zzano(sb2.toString());
                        }
                        String strGroup = matcher.group(3);
                        if (strGroup == null) {
                            throw null;
                        }
                        int iHashCode = strGroup.hashCode();
                        if (iHashCode != 37) {
                            if (iHashCode != 3240) {
                                if (iHashCode == 3592 && strGroup.equals("px")) {
                                    b = 0;
                                } else {
                                    b = -1;
                                }
                            } else if (strGroup.equals("em")) {
                                b = 1;
                            } else {
                                b = -1;
                            }
                        } else if (strGroup.equals("%")) {
                            b = 2;
                        } else {
                            b = -1;
                        }
                        if (b == 0) {
                            zzaovVarM4273d.f6315j = 1;
                        } else if (b == 1) {
                            zzaovVarM4273d.f6315j = 2;
                        } else {
                            if (b != 2) {
                                StringBuilder sb3 = new StringBuilder(strGroup.length() + 30);
                                sb3.append("Invalid unit for fontSize: '");
                                sb3.append(strGroup);
                                sb3.append("'.");
                                throw new zzano(sb3.toString());
                            }
                            zzaovVarM4273d.f6315j = 3;
                        }
                        String strGroup2 = matcher.group(1);
                        if (strGroup2 == null) {
                            throw null;
                        }
                        zzaovVarM4273d.f6316k = Float.parseFloat(strGroup2);
                        break;
                    } catch (zzano unused3) {
                        AbstractC5152f.m3775g(attributeValue, "Failed parsing fontSize value: ", "TtmlParser");
                        break;
                    }
                    break;
                case "fontWeight":
                    zzaovVarM4273d = m4273d(zzaovVarM4273d);
                    zzaovVarM4273d.f6313h = "bold".equalsIgnoreCase(attributeValue) ? 1 : 0;
                    break;
                case "fontStyle":
                    zzaovVarM4273d = m4273d(zzaovVarM4273d);
                    zzaovVarM4273d.f6314i = "italic".equalsIgnoreCase(attributeValue) ? 1 : 0;
                    break;
                case "textAlign":
                    zzaovVarM4273d = m4273d(zzaovVarM4273d);
                    zzaovVarM4273d.f6320o = m4274e(attributeValue);
                    break;
                case "multiRowAlign":
                    zzaovVarM4273d = m4273d(zzaovVarM4273d);
                    zzaovVarM4273d.f6321p = m4274e(attributeValue);
                    break;
                case "textCombine":
                    String strM7119a = zzgsz.m7119a(attributeValue);
                    int iHashCode2 = strM7119a.hashCode();
                    if (iHashCode2 != 96673) {
                        if (iHashCode2 == 3387192 && strM7119a.equals("none")) {
                            b2 = 0;
                        } else {
                            b2 = -1;
                        }
                    } else if (strM7119a.equals("all")) {
                        b2 = 1;
                    } else {
                        b2 = -1;
                    }
                    if (b2 != 0) {
                        if (b2 == 1) {
                            zzaovVarM4273d = m4273d(zzaovVarM4273d);
                            zzaovVarM4273d.f6322q = 1;
                        }
                        break;
                    } else {
                        zzaovVarM4273d = m4273d(zzaovVarM4273d);
                        zzaovVarM4273d.f6322q = 0;
                    }
                    break;
                case "ruby":
                    switch (zzgsz.m7119a(attributeValue)) {
                        case "baseContainer":
                            b3 = 2;
                            break;
                        case "container":
                            b3 = 0;
                            break;
                        case "delimiter":
                            b3 = 5;
                            break;
                        case "textContainer":
                            b3 = 4;
                            break;
                        case "base":
                            b3 = 1;
                            break;
                        case "text":
                            b3 = 3;
                            break;
                        default:
                            b3 = -1;
                            break;
                    }
                    if (b3 == 0) {
                        zzaovVarM4273d = m4273d(zzaovVarM4273d);
                        zzaovVarM4273d.f6318m = 1;
                        break;
                    } else {
                        if (b3 == 1 || b3 == 2) {
                            zzaovVarM4273d = m4273d(zzaovVarM4273d);
                            zzaovVarM4273d.f6318m = 2;
                        } else if (b3 == 3 || b3 == 4) {
                            zzaovVarM4273d = m4273d(zzaovVarM4273d);
                            zzaovVarM4273d.f6318m = 3;
                        } else if (b3 == 5) {
                            zzaovVarM4273d = m4273d(zzaovVarM4273d);
                            zzaovVarM4273d.f6318m = 4;
                        }
                        break;
                    }
                    break;
                case "rubyPosition":
                    String strM7119a2 = zzgsz.m7119a(attributeValue);
                    int iHashCode3 = strM7119a2.hashCode();
                    if (iHashCode3 != -1392885889) {
                        if (iHashCode3 == 92734940 && strM7119a2.equals("after")) {
                            b4 = 1;
                        } else {
                            b4 = -1;
                        }
                    } else if (strM7119a2.equals("before")) {
                        b4 = 0;
                    } else {
                        b4 = -1;
                    }
                    if (b4 == 0) {
                        zzaovVarM4273d = m4273d(zzaovVarM4273d);
                        zzaovVarM4273d.f6319n = 1;
                        break;
                    } else {
                        if (b4 == 1) {
                            zzaovVarM4273d = m4273d(zzaovVarM4273d);
                            zzaovVarM4273d.f6319n = 2;
                        }
                        break;
                    }
                    break;
                case "textDecoration":
                    switch (zzgsz.m7119a(attributeValue)) {
                        case "nounderline":
                            b5 = 3;
                            break;
                        case "underline":
                            b5 = 2;
                            break;
                        case "nolinethrough":
                            b5 = 1;
                            break;
                        case "linethrough":
                            b5 = 0;
                            break;
                        default:
                            b5 = -1;
                            break;
                    }
                    if (b5 == 0) {
                        zzaovVarM4273d = m4273d(zzaovVarM4273d);
                        zzaovVarM4273d.f6311f = 1;
                        break;
                    } else {
                        if (b5 == 1) {
                            zzaovVarM4273d = m4273d(zzaovVarM4273d);
                            zzaovVarM4273d.f6311f = 0;
                        } else if (b5 == 2) {
                            zzaovVarM4273d = m4273d(zzaovVarM4273d);
                            zzaovVarM4273d.f6312g = 1;
                        } else if (b5 == 3) {
                            zzaovVarM4273d = m4273d(zzaovVarM4273d);
                            zzaovVarM4273d.f6312g = 0;
                        }
                        break;
                    }
                    break;
                case "textEmphasis":
                    zzaovVarM4273d = m4273d(zzaovVarM4273d);
                    Pattern pattern2 = zzaoo.f6261d;
                    if (attributeValue == null) {
                        zzaooVar = null;
                    } else {
                        String strM7119a3 = zzgsz.m7119a(attributeValue.trim());
                        if (strM7119a3.isEmpty()) {
                            zzaooVar = null;
                        } else {
                            zzgxd zzgxdVarM7242s = zzgxd.m7242s(TextUtils.split(strM7119a3, zzaoo.f6261d));
                            String str2 = (String) zzgxh.m7247a("outside", zzgzd.m7268a(zzaoo.f6265h, zzgxdVarM7242s));
                            int iHashCode4 = str2.hashCode();
                            if (iHashCode4 != -1106037339) {
                                if (iHashCode4 == 92734940 && str2.equals("after")) {
                                    b6 = 0;
                                } else {
                                    b6 = -1;
                                }
                            } else if (str2.equals("outside")) {
                                b6 = 1;
                            } else {
                                b6 = -1;
                            }
                            int i5 = b6 != 0 ? b6 != 1 ? 1 : -2 : 2;
                            zzgyy zzgyyVar = (zzgyy) zzgzd.m7268a(zzaoo.f6262e, zzgxdVarM7242s);
                            if (zzgyyVar.isEmpty()) {
                                zzgzc zzgzcVarM7268a = zzgzd.m7268a(zzaoo.f6264g, zzgxdVarM7242s);
                                zzgzc zzgzcVarM7268a2 = zzgzd.m7268a(zzaoo.f6263f, zzgxdVarM7242s);
                                if (((zzgyy) zzgzcVarM7268a).isEmpty() && ((zzgyy) zzgzcVarM7268a2).isEmpty()) {
                                    i2 = 0;
                                    i3 = -1;
                                } else {
                                    String str3 = (String) zzgxh.m7247a("filled", zzgzcVarM7268a);
                                    i2 = (str3.hashCode() == 3417674 && str3.equals("open")) ? 2 : 1;
                                    String str4 = (String) zzgxh.m7247a("circle", zzgzcVarM7268a2);
                                    int iHashCode5 = str4.hashCode();
                                    if (iHashCode5 != -905816648) {
                                        if (iHashCode5 == 99657 && str4.equals("dot")) {
                                            b7 = 0;
                                        } else {
                                            b7 = -1;
                                        }
                                    } else if (str4.equals("sesame")) {
                                        b7 = 1;
                                    } else {
                                        b7 = -1;
                                    }
                                    i3 = b7 != 0 ? b7 != 1 ? 1 : 3 : 2;
                                }
                            } else {
                                String str5 = (String) ((zzgur) zzgyyVar.iterator()).next();
                                if (str5.hashCode() == 3387192 && str5.equals("none")) {
                                    i2 = 0;
                                    i3 = 0;
                                } else {
                                    i2 = 0;
                                    i3 = -1;
                                }
                            }
                            zzaooVar = new zzaoo(i3, i2, i5);
                        }
                    }
                    zzaovVarM4273d.f6323r = zzaooVar;
                    break;
                case "shear":
                    zzaov zzaovVarM4273d2 = m4273d(zzaovVarM4273d);
                    Matcher matcher2 = f6290e.matcher(attributeValue);
                    float fMin = Float.MAX_VALUE;
                    if (matcher2.matches()) {
                        try {
                            String strGroup3 = matcher2.group(1);
                            if (strGroup3 == null) {
                                throw null;
                            }
                            fMin = Math.min(100.0f, Math.max(-100.0f, Float.parseFloat(strGroup3)));
                        } catch (NumberFormatException e) {
                            zzeh.m6212d("TtmlParser", "Failed to parse shear: ".concat(String.valueOf(attributeValue)), e);
                        }
                    } else {
                        AbstractC5152f.m3775g(attributeValue, "Invalid value for shear: ", "TtmlParser");
                    }
                    zzaovVarM4273d2.f6324s = fMin;
                    zzaovVarM4273d = zzaovVarM4273d2;
                    break;
                case "origin":
                    zzaovVarM4273d = m4273d(zzaovVarM4273d);
                    zzaovVarM4273d.f6325t = attributeValue;
                    break;
                case "extent":
                    zzaovVarM4273d = m4273d(zzaovVarM4273d);
                    zzaovVarM4273d.f6326u = attributeValue;
                    break;
            }
        }
        return zzaovVarM4273d;
    }

    /* JADX INFO: renamed from: d */
    public static zzaov m4273d(zzaov zzaovVar) {
        return zzaovVar == null ? new zzaov() : zzaovVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:20:0x0042  */
    /* JADX INFO: renamed from: e */
    public static Layout.Alignment m4274e(String str) {
        byte b;
        switch (zzgsz.m7119a(str)) {
            case "center":
                b = 4;
                break;
            case "end":
                b = 3;
                break;
            case "left":
                b = 0;
                break;
            case "right":
                b = 2;
                break;
            case "start":
                b = 1;
                break;
            default:
                b = -1;
                break;
        }
        if (b == 0 || b == 1) {
            return Layout.Alignment.ALIGN_NORMAL;
        }
        if (b == 2 || b == 3) {
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        if (b != 4) {
            return null;
        }
        return Layout.Alignment.ALIGN_CENTER;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00f2  */
    /* JADX INFO: renamed from: f */
    public static long m4275f(String str, zzaoq zzaoqVar) throws zzano {
        double d;
        double d2;
        Matcher matcher = f6287b.matcher(str);
        byte b = 2;
        if (matcher.matches()) {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            long j2 = Long.parseLong(strGroup) * 3600;
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            long j3 = Long.parseLong(strGroup2) * 60;
            String strGroup3 = matcher.group(3);
            strGroup3.getClass();
            double d3 = j2 + j3;
            double d4 = Long.parseLong(strGroup3);
            String strGroup4 = matcher.group(4);
            double d5 = 0.0d;
            double d6 = strGroup4 != null ? Double.parseDouble(strGroup4) : 0.0d;
            double d7 = d3 + d4;
            String strGroup5 = matcher.group(5);
            double d8 = strGroup5 != null ? Long.parseLong(strGroup5) / zzaoqVar.f6282a : 0.0d;
            double d9 = d7 + d6;
            String strGroup6 = matcher.group(6);
            if (strGroup6 != null) {
                d5 = (Long.parseLong(strGroup6) / ((double) zzaoqVar.f6283b)) / ((double) zzaoqVar.f6282a);
            }
            return (long) ((d9 + d8 + d5) * 1000000.0d);
        }
        Matcher matcher2 = f6288c.matcher(str);
        if (!matcher2.matches()) {
            throw new zzano("Malformed time expression: ".concat(String.valueOf(str)));
        }
        String strGroup7 = matcher2.group(1);
        strGroup7.getClass();
        double d10 = Double.parseDouble(strGroup7);
        String strGroup8 = matcher2.group(2);
        strGroup8.getClass();
        int iHashCode = strGroup8.hashCode();
        if (iHashCode != 102) {
            if (iHashCode != 104) {
                if (iHashCode != 109) {
                    if (iHashCode != 3494) {
                        if (iHashCode != 115) {
                            if (iHashCode == 116 && strGroup8.equals("t")) {
                                b = 5;
                            } else {
                                b = -1;
                            }
                        } else if (!strGroup8.equals("s")) {
                            b = -1;
                        }
                    } else if (strGroup8.equals("ms")) {
                        b = 3;
                    } else {
                        b = -1;
                    }
                } else if (strGroup8.equals("m")) {
                    b = 1;
                } else {
                    b = -1;
                }
            } else if (strGroup8.equals("h")) {
                b = 0;
            } else {
                b = -1;
            }
        } else if (strGroup8.equals("f")) {
            b = 4;
        } else {
            b = -1;
        }
        if (b != 0) {
            if (b != 1) {
                if (b == 3) {
                    d2 = 1000.0d;
                } else if (b == 4) {
                    d2 = zzaoqVar.f6282a;
                } else if (b == 5) {
                    d2 = zzaoqVar.f6284c;
                }
                d10 /= d2;
            } else {
                d = 60.0d;
            }
            return (long) (d10 * 1000000.0d);
        }
        d = 3600.0d;
        d10 *= d;
        return (long) (d10 * 1000000.0d);
    }

    @Override // com.google.android.gms.internal.ads.zzans
    /* JADX INFO: renamed from: a */
    public final void mo4246a(byte[] bArr, int i2, int i3, zzdu zzduVar) {
        zzanm.m4243a(m4276b(bArr, i2, i3), zzduVar);
    }

    /* JADX WARN: Code duplicated, block: B:160:0x0355  */
    /* JADX WARN: Code duplicated, block: B:163:0x0367  */
    /* JADX WARN: Code duplicated, block: B:166:0x0370 A[Catch: IOException -> 0x0096, XmlPullParserException -> 0x0099, NumberFormatException -> 0x0388, TryCatch #2 {NumberFormatException -> 0x0388, blocks: (B:164:0x036a, B:166:0x0370, B:168:0x037d, B:170:0x0386, B:171:0x0387), top: B:452:0x036a, outer: #17 }] */
    /* JADX WARN: Code duplicated, block: B:168:0x037d A[Catch: IOException -> 0x0096, XmlPullParserException -> 0x0099, NumberFormatException -> 0x0388, TryCatch #2 {NumberFormatException -> 0x0388, blocks: (B:164:0x036a, B:166:0x0370, B:168:0x037d, B:170:0x0386, B:171:0x0387), top: B:452:0x036a, outer: #17 }] */
    /* JADX WARN: Code duplicated, block: B:174:0x0395 A[Catch: IOException -> 0x0096, XmlPullParserException -> 0x0099, TryCatch #17 {IOException -> 0x0096, XmlPullParserException -> 0x0099, blocks: (B:3:0x0008, B:6:0x005c, B:8:0x006b, B:11:0x0077, B:14:0x0087, B:16:0x008f, B:23:0x009f, B:25:0x00a7, B:29:0x00bd, B:31:0x00d8, B:33:0x00e2, B:34:0x00e6, B:36:0x00f2, B:37:0x00f6, B:71:0x018d, B:90:0x01e6, B:93:0x01fa, B:95:0x0200, B:97:0x0208, B:99:0x0210, B:101:0x0218, B:103:0x0220, B:105:0x0228, B:107:0x022e, B:109:0x0236, B:111:0x023e, B:113:0x0244, B:115:0x024a, B:117:0x0250, B:119:0x0258, B:122:0x0261, B:437:0x07de, B:123:0x0293, B:126:0x029b, B:128:0x02a4, B:130:0x02b5, B:132:0x02bf, B:134:0x02cf, B:136:0x02d5, B:138:0x02eb, B:140:0x02f1, B:293:0x0598, B:133:0x02c6, B:142:0x0300, B:145:0x030e, B:277:0x0548, B:148:0x032b, B:150:0x0333, B:152:0x033b, B:154:0x0343, B:161:0x0357, B:164:0x036a, B:166:0x0370, B:168:0x037d, B:190:0x03e5, B:192:0x03eb, B:194:0x03f1, B:196:0x03f9, B:198:0x03ff, B:201:0x040e, B:203:0x0414, B:205:0x0421, B:225:0x0498, B:227:0x04a0, B:247:0x04eb, B:249:0x04f5, B:275:0x053b, B:206:0x042c, B:207:0x042d, B:208:0x042e, B:209:0x043b, B:212:0x0443, B:215:0x0451, B:217:0x0457, B:219:0x0462, B:220:0x0476, B:221:0x0477, B:222:0x0478, B:223:0x0485, B:170:0x0386, B:171:0x0387, B:172:0x0388, B:174:0x0395, B:177:0x039f, B:180:0x03a8, B:182:0x03ae, B:184:0x03b9, B:185:0x03c9, B:186:0x03ca, B:187:0x03cb, B:188:0x03d3, B:280:0x055b, B:282:0x0568, B:284:0x0573, B:286:0x0579, B:288:0x0585, B:298:0x05bf, B:301:0x05e1, B:366:0x06d0, B:335:0x0652, B:337:0x065a, B:409:0x075e, B:343:0x0671, B:346:0x067a, B:349:0x0685, B:351:0x0693, B:350:0x068a, B:361:0x06ac, B:364:0x06b3, B:365:0x06bf, B:371:0x06eb, B:375:0x06f7, B:379:0x0700, B:387:0x0713, B:394:0x0723, B:396:0x0733, B:398:0x0738, B:400:0x073c, B:401:0x0743, B:390:0x071a, B:74:0x019a, B:76:0x01a4, B:79:0x01ad, B:81:0x01b3, B:83:0x01be, B:84:0x01c8, B:85:0x01c9, B:86:0x01ca, B:41:0x0112, B:43:0x011e, B:46:0x012a, B:48:0x0130, B:50:0x013d, B:60:0x015e, B:62:0x0162, B:63:0x0175, B:70:0x0185, B:67:0x017f, B:69:0x0184, B:414:0x0783, B:416:0x078f, B:417:0x0796, B:419:0x079d, B:422:0x07a1, B:424:0x07ab, B:426:0x07b5, B:430:0x07bd, B:428:0x07ba, B:433:0x07d5, B:436:0x07db, B:442:0x07fb), top: B:473:0x0008, inners: #2, #12, #13, #15, #16 }] */
    /* JADX WARN: Code duplicated, block: B:176:0x039d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:177:0x039f A[Catch: IOException -> 0x0096, XmlPullParserException -> 0x0099, TRY_LEAVE, TryCatch #17 {IOException -> 0x0096, XmlPullParserException -> 0x0099, blocks: (B:3:0x0008, B:6:0x005c, B:8:0x006b, B:11:0x0077, B:14:0x0087, B:16:0x008f, B:23:0x009f, B:25:0x00a7, B:29:0x00bd, B:31:0x00d8, B:33:0x00e2, B:34:0x00e6, B:36:0x00f2, B:37:0x00f6, B:71:0x018d, B:90:0x01e6, B:93:0x01fa, B:95:0x0200, B:97:0x0208, B:99:0x0210, B:101:0x0218, B:103:0x0220, B:105:0x0228, B:107:0x022e, B:109:0x0236, B:111:0x023e, B:113:0x0244, B:115:0x024a, B:117:0x0250, B:119:0x0258, B:122:0x0261, B:437:0x07de, B:123:0x0293, B:126:0x029b, B:128:0x02a4, B:130:0x02b5, B:132:0x02bf, B:134:0x02cf, B:136:0x02d5, B:138:0x02eb, B:140:0x02f1, B:293:0x0598, B:133:0x02c6, B:142:0x0300, B:145:0x030e, B:277:0x0548, B:148:0x032b, B:150:0x0333, B:152:0x033b, B:154:0x0343, B:161:0x0357, B:164:0x036a, B:166:0x0370, B:168:0x037d, B:190:0x03e5, B:192:0x03eb, B:194:0x03f1, B:196:0x03f9, B:198:0x03ff, B:201:0x040e, B:203:0x0414, B:205:0x0421, B:225:0x0498, B:227:0x04a0, B:247:0x04eb, B:249:0x04f5, B:275:0x053b, B:206:0x042c, B:207:0x042d, B:208:0x042e, B:209:0x043b, B:212:0x0443, B:215:0x0451, B:217:0x0457, B:219:0x0462, B:220:0x0476, B:221:0x0477, B:222:0x0478, B:223:0x0485, B:170:0x0386, B:171:0x0387, B:172:0x0388, B:174:0x0395, B:177:0x039f, B:180:0x03a8, B:182:0x03ae, B:184:0x03b9, B:185:0x03c9, B:186:0x03ca, B:187:0x03cb, B:188:0x03d3, B:280:0x055b, B:282:0x0568, B:284:0x0573, B:286:0x0579, B:288:0x0585, B:298:0x05bf, B:301:0x05e1, B:366:0x06d0, B:335:0x0652, B:337:0x065a, B:409:0x075e, B:343:0x0671, B:346:0x067a, B:349:0x0685, B:351:0x0693, B:350:0x068a, B:361:0x06ac, B:364:0x06b3, B:365:0x06bf, B:371:0x06eb, B:375:0x06f7, B:379:0x0700, B:387:0x0713, B:394:0x0723, B:396:0x0733, B:398:0x0738, B:400:0x073c, B:401:0x0743, B:390:0x071a, B:74:0x019a, B:76:0x01a4, B:79:0x01ad, B:81:0x01b3, B:83:0x01be, B:84:0x01c8, B:85:0x01c9, B:86:0x01ca, B:41:0x0112, B:43:0x011e, B:46:0x012a, B:48:0x0130, B:50:0x013d, B:60:0x015e, B:62:0x0162, B:63:0x0175, B:70:0x0185, B:67:0x017f, B:69:0x0184, B:414:0x0783, B:416:0x078f, B:417:0x0796, B:419:0x079d, B:422:0x07a1, B:424:0x07ab, B:426:0x07b5, B:430:0x07bd, B:428:0x07ba, B:433:0x07d5, B:436:0x07db, B:442:0x07fb), top: B:473:0x0008, inners: #2, #12, #13, #15, #16 }] */
    /* JADX WARN: Code duplicated, block: B:179:0x03a7  */
    /* JADX WARN: Code duplicated, block: B:182:0x03ae A[Catch: IOException -> 0x0096, XmlPullParserException -> 0x0099, NumberFormatException -> 0x03cb, TryCatch #16 {NumberFormatException -> 0x03cb, blocks: (B:180:0x03a8, B:182:0x03ae, B:184:0x03b9, B:185:0x03c9, B:186:0x03ca), top: B:472:0x03a8, outer: #17 }] */
    /* JADX WARN: Code duplicated, block: B:184:0x03b9 A[Catch: IOException -> 0x0096, XmlPullParserException -> 0x0099, NumberFormatException -> 0x03cb, TryCatch #16 {NumberFormatException -> 0x03cb, blocks: (B:180:0x03a8, B:182:0x03ae, B:184:0x03b9, B:185:0x03c9, B:186:0x03ca), top: B:472:0x03a8, outer: #17 }] */
    /* JADX WARN: Code duplicated, block: B:188:0x03d3 A[Catch: IOException -> 0x0096, XmlPullParserException -> 0x0099, TryCatch #17 {IOException -> 0x0096, XmlPullParserException -> 0x0099, blocks: (B:3:0x0008, B:6:0x005c, B:8:0x006b, B:11:0x0077, B:14:0x0087, B:16:0x008f, B:23:0x009f, B:25:0x00a7, B:29:0x00bd, B:31:0x00d8, B:33:0x00e2, B:34:0x00e6, B:36:0x00f2, B:37:0x00f6, B:71:0x018d, B:90:0x01e6, B:93:0x01fa, B:95:0x0200, B:97:0x0208, B:99:0x0210, B:101:0x0218, B:103:0x0220, B:105:0x0228, B:107:0x022e, B:109:0x0236, B:111:0x023e, B:113:0x0244, B:115:0x024a, B:117:0x0250, B:119:0x0258, B:122:0x0261, B:437:0x07de, B:123:0x0293, B:126:0x029b, B:128:0x02a4, B:130:0x02b5, B:132:0x02bf, B:134:0x02cf, B:136:0x02d5, B:138:0x02eb, B:140:0x02f1, B:293:0x0598, B:133:0x02c6, B:142:0x0300, B:145:0x030e, B:277:0x0548, B:148:0x032b, B:150:0x0333, B:152:0x033b, B:154:0x0343, B:161:0x0357, B:164:0x036a, B:166:0x0370, B:168:0x037d, B:190:0x03e5, B:192:0x03eb, B:194:0x03f1, B:196:0x03f9, B:198:0x03ff, B:201:0x040e, B:203:0x0414, B:205:0x0421, B:225:0x0498, B:227:0x04a0, B:247:0x04eb, B:249:0x04f5, B:275:0x053b, B:206:0x042c, B:207:0x042d, B:208:0x042e, B:209:0x043b, B:212:0x0443, B:215:0x0451, B:217:0x0457, B:219:0x0462, B:220:0x0476, B:221:0x0477, B:222:0x0478, B:223:0x0485, B:170:0x0386, B:171:0x0387, B:172:0x0388, B:174:0x0395, B:177:0x039f, B:180:0x03a8, B:182:0x03ae, B:184:0x03b9, B:185:0x03c9, B:186:0x03ca, B:187:0x03cb, B:188:0x03d3, B:280:0x055b, B:282:0x0568, B:284:0x0573, B:286:0x0579, B:288:0x0585, B:298:0x05bf, B:301:0x05e1, B:366:0x06d0, B:335:0x0652, B:337:0x065a, B:409:0x075e, B:343:0x0671, B:346:0x067a, B:349:0x0685, B:351:0x0693, B:350:0x068a, B:361:0x06ac, B:364:0x06b3, B:365:0x06bf, B:371:0x06eb, B:375:0x06f7, B:379:0x0700, B:387:0x0713, B:394:0x0723, B:396:0x0733, B:398:0x0738, B:400:0x073c, B:401:0x0743, B:390:0x071a, B:74:0x019a, B:76:0x01a4, B:79:0x01ad, B:81:0x01b3, B:83:0x01be, B:84:0x01c8, B:85:0x01c9, B:86:0x01ca, B:41:0x0112, B:43:0x011e, B:46:0x012a, B:48:0x0130, B:50:0x013d, B:60:0x015e, B:62:0x0162, B:63:0x0175, B:70:0x0185, B:67:0x017f, B:69:0x0184, B:414:0x0783, B:416:0x078f, B:417:0x0796, B:419:0x079d, B:422:0x07a1, B:424:0x07ab, B:426:0x07b5, B:430:0x07bd, B:428:0x07ba, B:433:0x07d5, B:436:0x07db, B:442:0x07fb), top: B:473:0x0008, inners: #2, #12, #13, #15, #16 }] */
    /* JADX WARN: Code duplicated, block: B:189:0x03db  */
    /* JADX WARN: Code duplicated, block: B:198:0x03ff A[Catch: IOException -> 0x0096, XmlPullParserException -> 0x0099, TRY_LEAVE, TryCatch #17 {IOException -> 0x0096, XmlPullParserException -> 0x0099, blocks: (B:3:0x0008, B:6:0x005c, B:8:0x006b, B:11:0x0077, B:14:0x0087, B:16:0x008f, B:23:0x009f, B:25:0x00a7, B:29:0x00bd, B:31:0x00d8, B:33:0x00e2, B:34:0x00e6, B:36:0x00f2, B:37:0x00f6, B:71:0x018d, B:90:0x01e6, B:93:0x01fa, B:95:0x0200, B:97:0x0208, B:99:0x0210, B:101:0x0218, B:103:0x0220, B:105:0x0228, B:107:0x022e, B:109:0x0236, B:111:0x023e, B:113:0x0244, B:115:0x024a, B:117:0x0250, B:119:0x0258, B:122:0x0261, B:437:0x07de, B:123:0x0293, B:126:0x029b, B:128:0x02a4, B:130:0x02b5, B:132:0x02bf, B:134:0x02cf, B:136:0x02d5, B:138:0x02eb, B:140:0x02f1, B:293:0x0598, B:133:0x02c6, B:142:0x0300, B:145:0x030e, B:277:0x0548, B:148:0x032b, B:150:0x0333, B:152:0x033b, B:154:0x0343, B:161:0x0357, B:164:0x036a, B:166:0x0370, B:168:0x037d, B:190:0x03e5, B:192:0x03eb, B:194:0x03f1, B:196:0x03f9, B:198:0x03ff, B:201:0x040e, B:203:0x0414, B:205:0x0421, B:225:0x0498, B:227:0x04a0, B:247:0x04eb, B:249:0x04f5, B:275:0x053b, B:206:0x042c, B:207:0x042d, B:208:0x042e, B:209:0x043b, B:212:0x0443, B:215:0x0451, B:217:0x0457, B:219:0x0462, B:220:0x0476, B:221:0x0477, B:222:0x0478, B:223:0x0485, B:170:0x0386, B:171:0x0387, B:172:0x0388, B:174:0x0395, B:177:0x039f, B:180:0x03a8, B:182:0x03ae, B:184:0x03b9, B:185:0x03c9, B:186:0x03ca, B:187:0x03cb, B:188:0x03d3, B:280:0x055b, B:282:0x0568, B:284:0x0573, B:286:0x0579, B:288:0x0585, B:298:0x05bf, B:301:0x05e1, B:366:0x06d0, B:335:0x0652, B:337:0x065a, B:409:0x075e, B:343:0x0671, B:346:0x067a, B:349:0x0685, B:351:0x0693, B:350:0x068a, B:361:0x06ac, B:364:0x06b3, B:365:0x06bf, B:371:0x06eb, B:375:0x06f7, B:379:0x0700, B:387:0x0713, B:394:0x0723, B:396:0x0733, B:398:0x0738, B:400:0x073c, B:401:0x0743, B:390:0x071a, B:74:0x019a, B:76:0x01a4, B:79:0x01ad, B:81:0x01b3, B:83:0x01be, B:84:0x01c8, B:85:0x01c9, B:86:0x01ca, B:41:0x0112, B:43:0x011e, B:46:0x012a, B:48:0x0130, B:50:0x013d, B:60:0x015e, B:62:0x0162, B:63:0x0175, B:70:0x0185, B:67:0x017f, B:69:0x0184, B:414:0x0783, B:416:0x078f, B:417:0x0796, B:419:0x079d, B:422:0x07a1, B:424:0x07ab, B:426:0x07b5, B:430:0x07bd, B:428:0x07ba, B:433:0x07d5, B:436:0x07db, B:442:0x07fb), top: B:473:0x0008, inners: #2, #12, #13, #15, #16 }] */
    /* JADX WARN: Code duplicated, block: B:200:0x040d  */
    /* JADX WARN: Code duplicated, block: B:203:0x0414 A[Catch: IOException -> 0x0096, XmlPullParserException -> 0x0099, NumberFormatException -> 0x042e, TryCatch #13 {NumberFormatException -> 0x042e, blocks: (B:201:0x040e, B:203:0x0414, B:205:0x0421, B:206:0x042c, B:207:0x042d), top: B:468:0x040e, outer: #17 }] */
    /* JADX WARN: Code duplicated, block: B:205:0x0421 A[Catch: IOException -> 0x0096, XmlPullParserException -> 0x0099, NumberFormatException -> 0x042e, TryCatch #13 {NumberFormatException -> 0x042e, blocks: (B:201:0x040e, B:203:0x0414, B:205:0x0421, B:206:0x042c, B:207:0x042d), top: B:468:0x040e, outer: #17 }] */
    /* JADX WARN: Code duplicated, block: B:209:0x043b A[Catch: IOException -> 0x0096, XmlPullParserException -> 0x0099, TryCatch #17 {IOException -> 0x0096, XmlPullParserException -> 0x0099, blocks: (B:3:0x0008, B:6:0x005c, B:8:0x006b, B:11:0x0077, B:14:0x0087, B:16:0x008f, B:23:0x009f, B:25:0x00a7, B:29:0x00bd, B:31:0x00d8, B:33:0x00e2, B:34:0x00e6, B:36:0x00f2, B:37:0x00f6, B:71:0x018d, B:90:0x01e6, B:93:0x01fa, B:95:0x0200, B:97:0x0208, B:99:0x0210, B:101:0x0218, B:103:0x0220, B:105:0x0228, B:107:0x022e, B:109:0x0236, B:111:0x023e, B:113:0x0244, B:115:0x024a, B:117:0x0250, B:119:0x0258, B:122:0x0261, B:437:0x07de, B:123:0x0293, B:126:0x029b, B:128:0x02a4, B:130:0x02b5, B:132:0x02bf, B:134:0x02cf, B:136:0x02d5, B:138:0x02eb, B:140:0x02f1, B:293:0x0598, B:133:0x02c6, B:142:0x0300, B:145:0x030e, B:277:0x0548, B:148:0x032b, B:150:0x0333, B:152:0x033b, B:154:0x0343, B:161:0x0357, B:164:0x036a, B:166:0x0370, B:168:0x037d, B:190:0x03e5, B:192:0x03eb, B:194:0x03f1, B:196:0x03f9, B:198:0x03ff, B:201:0x040e, B:203:0x0414, B:205:0x0421, B:225:0x0498, B:227:0x04a0, B:247:0x04eb, B:249:0x04f5, B:275:0x053b, B:206:0x042c, B:207:0x042d, B:208:0x042e, B:209:0x043b, B:212:0x0443, B:215:0x0451, B:217:0x0457, B:219:0x0462, B:220:0x0476, B:221:0x0477, B:222:0x0478, B:223:0x0485, B:170:0x0386, B:171:0x0387, B:172:0x0388, B:174:0x0395, B:177:0x039f, B:180:0x03a8, B:182:0x03ae, B:184:0x03b9, B:185:0x03c9, B:186:0x03ca, B:187:0x03cb, B:188:0x03d3, B:280:0x055b, B:282:0x0568, B:284:0x0573, B:286:0x0579, B:288:0x0585, B:298:0x05bf, B:301:0x05e1, B:366:0x06d0, B:335:0x0652, B:337:0x065a, B:409:0x075e, B:343:0x0671, B:346:0x067a, B:349:0x0685, B:351:0x0693, B:350:0x068a, B:361:0x06ac, B:364:0x06b3, B:365:0x06bf, B:371:0x06eb, B:375:0x06f7, B:379:0x0700, B:387:0x0713, B:394:0x0723, B:396:0x0733, B:398:0x0738, B:400:0x073c, B:401:0x0743, B:390:0x071a, B:74:0x019a, B:76:0x01a4, B:79:0x01ad, B:81:0x01b3, B:83:0x01be, B:84:0x01c8, B:85:0x01c9, B:86:0x01ca, B:41:0x0112, B:43:0x011e, B:46:0x012a, B:48:0x0130, B:50:0x013d, B:60:0x015e, B:62:0x0162, B:63:0x0175, B:70:0x0185, B:67:0x017f, B:69:0x0184, B:414:0x0783, B:416:0x078f, B:417:0x0796, B:419:0x079d, B:422:0x07a1, B:424:0x07ab, B:426:0x07b5, B:430:0x07bd, B:428:0x07ba, B:433:0x07d5, B:436:0x07db, B:442:0x07fb), top: B:473:0x0008, inners: #2, #12, #13, #15, #16 }] */
    /* JADX WARN: Code duplicated, block: B:211:0x0441 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:212:0x0443 A[Catch: IOException -> 0x0096, XmlPullParserException -> 0x0099, TRY_LEAVE, TryCatch #17 {IOException -> 0x0096, XmlPullParserException -> 0x0099, blocks: (B:3:0x0008, B:6:0x005c, B:8:0x006b, B:11:0x0077, B:14:0x0087, B:16:0x008f, B:23:0x009f, B:25:0x00a7, B:29:0x00bd, B:31:0x00d8, B:33:0x00e2, B:34:0x00e6, B:36:0x00f2, B:37:0x00f6, B:71:0x018d, B:90:0x01e6, B:93:0x01fa, B:95:0x0200, B:97:0x0208, B:99:0x0210, B:101:0x0218, B:103:0x0220, B:105:0x0228, B:107:0x022e, B:109:0x0236, B:111:0x023e, B:113:0x0244, B:115:0x024a, B:117:0x0250, B:119:0x0258, B:122:0x0261, B:437:0x07de, B:123:0x0293, B:126:0x029b, B:128:0x02a4, B:130:0x02b5, B:132:0x02bf, B:134:0x02cf, B:136:0x02d5, B:138:0x02eb, B:140:0x02f1, B:293:0x0598, B:133:0x02c6, B:142:0x0300, B:145:0x030e, B:277:0x0548, B:148:0x032b, B:150:0x0333, B:152:0x033b, B:154:0x0343, B:161:0x0357, B:164:0x036a, B:166:0x0370, B:168:0x037d, B:190:0x03e5, B:192:0x03eb, B:194:0x03f1, B:196:0x03f9, B:198:0x03ff, B:201:0x040e, B:203:0x0414, B:205:0x0421, B:225:0x0498, B:227:0x04a0, B:247:0x04eb, B:249:0x04f5, B:275:0x053b, B:206:0x042c, B:207:0x042d, B:208:0x042e, B:209:0x043b, B:212:0x0443, B:215:0x0451, B:217:0x0457, B:219:0x0462, B:220:0x0476, B:221:0x0477, B:222:0x0478, B:223:0x0485, B:170:0x0386, B:171:0x0387, B:172:0x0388, B:174:0x0395, B:177:0x039f, B:180:0x03a8, B:182:0x03ae, B:184:0x03b9, B:185:0x03c9, B:186:0x03ca, B:187:0x03cb, B:188:0x03d3, B:280:0x055b, B:282:0x0568, B:284:0x0573, B:286:0x0579, B:288:0x0585, B:298:0x05bf, B:301:0x05e1, B:366:0x06d0, B:335:0x0652, B:337:0x065a, B:409:0x075e, B:343:0x0671, B:346:0x067a, B:349:0x0685, B:351:0x0693, B:350:0x068a, B:361:0x06ac, B:364:0x06b3, B:365:0x06bf, B:371:0x06eb, B:375:0x06f7, B:379:0x0700, B:387:0x0713, B:394:0x0723, B:396:0x0733, B:398:0x0738, B:400:0x073c, B:401:0x0743, B:390:0x071a, B:74:0x019a, B:76:0x01a4, B:79:0x01ad, B:81:0x01b3, B:83:0x01be, B:84:0x01c8, B:85:0x01c9, B:86:0x01ca, B:41:0x0112, B:43:0x011e, B:46:0x012a, B:48:0x0130, B:50:0x013d, B:60:0x015e, B:62:0x0162, B:63:0x0175, B:70:0x0185, B:67:0x017f, B:69:0x0184, B:414:0x0783, B:416:0x078f, B:417:0x0796, B:419:0x079d, B:422:0x07a1, B:424:0x07ab, B:426:0x07b5, B:430:0x07bd, B:428:0x07ba, B:433:0x07d5, B:436:0x07db, B:442:0x07fb), top: B:473:0x0008, inners: #2, #12, #13, #15, #16 }] */
    /* JADX WARN: Code duplicated, block: B:214:0x0450  */
    /* JADX WARN: Code duplicated, block: B:217:0x0457 A[Catch: IOException -> 0x0096, XmlPullParserException -> 0x0099, NumberFormatException -> 0x0478, TryCatch #12 {NumberFormatException -> 0x0478, blocks: (B:215:0x0451, B:217:0x0457, B:219:0x0462, B:220:0x0476, B:221:0x0477), top: B:467:0x0451, outer: #17 }] */
    /* JADX WARN: Code duplicated, block: B:219:0x0462 A[Catch: IOException -> 0x0096, XmlPullParserException -> 0x0099, NumberFormatException -> 0x0478, TryCatch #12 {NumberFormatException -> 0x0478, blocks: (B:215:0x0451, B:217:0x0457, B:219:0x0462, B:220:0x0476, B:221:0x0477), top: B:467:0x0451, outer: #17 }] */
    /* JADX WARN: Code duplicated, block: B:223:0x0485 A[Catch: IOException -> 0x0096, XmlPullParserException -> 0x0099, TryCatch #17 {IOException -> 0x0096, XmlPullParserException -> 0x0099, blocks: (B:3:0x0008, B:6:0x005c, B:8:0x006b, B:11:0x0077, B:14:0x0087, B:16:0x008f, B:23:0x009f, B:25:0x00a7, B:29:0x00bd, B:31:0x00d8, B:33:0x00e2, B:34:0x00e6, B:36:0x00f2, B:37:0x00f6, B:71:0x018d, B:90:0x01e6, B:93:0x01fa, B:95:0x0200, B:97:0x0208, B:99:0x0210, B:101:0x0218, B:103:0x0220, B:105:0x0228, B:107:0x022e, B:109:0x0236, B:111:0x023e, B:113:0x0244, B:115:0x024a, B:117:0x0250, B:119:0x0258, B:122:0x0261, B:437:0x07de, B:123:0x0293, B:126:0x029b, B:128:0x02a4, B:130:0x02b5, B:132:0x02bf, B:134:0x02cf, B:136:0x02d5, B:138:0x02eb, B:140:0x02f1, B:293:0x0598, B:133:0x02c6, B:142:0x0300, B:145:0x030e, B:277:0x0548, B:148:0x032b, B:150:0x0333, B:152:0x033b, B:154:0x0343, B:161:0x0357, B:164:0x036a, B:166:0x0370, B:168:0x037d, B:190:0x03e5, B:192:0x03eb, B:194:0x03f1, B:196:0x03f9, B:198:0x03ff, B:201:0x040e, B:203:0x0414, B:205:0x0421, B:225:0x0498, B:227:0x04a0, B:247:0x04eb, B:249:0x04f5, B:275:0x053b, B:206:0x042c, B:207:0x042d, B:208:0x042e, B:209:0x043b, B:212:0x0443, B:215:0x0451, B:217:0x0457, B:219:0x0462, B:220:0x0476, B:221:0x0477, B:222:0x0478, B:223:0x0485, B:170:0x0386, B:171:0x0387, B:172:0x0388, B:174:0x0395, B:177:0x039f, B:180:0x03a8, B:182:0x03ae, B:184:0x03b9, B:185:0x03c9, B:186:0x03ca, B:187:0x03cb, B:188:0x03d3, B:280:0x055b, B:282:0x0568, B:284:0x0573, B:286:0x0579, B:288:0x0585, B:298:0x05bf, B:301:0x05e1, B:366:0x06d0, B:335:0x0652, B:337:0x065a, B:409:0x075e, B:343:0x0671, B:346:0x067a, B:349:0x0685, B:351:0x0693, B:350:0x068a, B:361:0x06ac, B:364:0x06b3, B:365:0x06bf, B:371:0x06eb, B:375:0x06f7, B:379:0x0700, B:387:0x0713, B:394:0x0723, B:396:0x0733, B:398:0x0738, B:400:0x073c, B:401:0x0743, B:390:0x071a, B:74:0x019a, B:76:0x01a4, B:79:0x01ad, B:81:0x01b3, B:83:0x01be, B:84:0x01c8, B:85:0x01c9, B:86:0x01ca, B:41:0x0112, B:43:0x011e, B:46:0x012a, B:48:0x0130, B:50:0x013d, B:60:0x015e, B:62:0x0162, B:63:0x0175, B:70:0x0185, B:67:0x017f, B:69:0x0184, B:414:0x0783, B:416:0x078f, B:417:0x0796, B:419:0x079d, B:422:0x07a1, B:424:0x07ab, B:426:0x07b5, B:430:0x07bd, B:428:0x07ba, B:433:0x07d5, B:436:0x07db, B:442:0x07fb), top: B:473:0x0008, inners: #2, #12, #13, #15, #16 }] */
    /* JADX WARN: Code duplicated, block: B:224:0x0494  */
    /* JADX WARN: Code duplicated, block: B:227:0x04a0 A[Catch: IOException -> 0x0096, XmlPullParserException -> 0x0099, TRY_LEAVE, TryCatch #17 {IOException -> 0x0096, XmlPullParserException -> 0x0099, blocks: (B:3:0x0008, B:6:0x005c, B:8:0x006b, B:11:0x0077, B:14:0x0087, B:16:0x008f, B:23:0x009f, B:25:0x00a7, B:29:0x00bd, B:31:0x00d8, B:33:0x00e2, B:34:0x00e6, B:36:0x00f2, B:37:0x00f6, B:71:0x018d, B:90:0x01e6, B:93:0x01fa, B:95:0x0200, B:97:0x0208, B:99:0x0210, B:101:0x0218, B:103:0x0220, B:105:0x0228, B:107:0x022e, B:109:0x0236, B:111:0x023e, B:113:0x0244, B:115:0x024a, B:117:0x0250, B:119:0x0258, B:122:0x0261, B:437:0x07de, B:123:0x0293, B:126:0x029b, B:128:0x02a4, B:130:0x02b5, B:132:0x02bf, B:134:0x02cf, B:136:0x02d5, B:138:0x02eb, B:140:0x02f1, B:293:0x0598, B:133:0x02c6, B:142:0x0300, B:145:0x030e, B:277:0x0548, B:148:0x032b, B:150:0x0333, B:152:0x033b, B:154:0x0343, B:161:0x0357, B:164:0x036a, B:166:0x0370, B:168:0x037d, B:190:0x03e5, B:192:0x03eb, B:194:0x03f1, B:196:0x03f9, B:198:0x03ff, B:201:0x040e, B:203:0x0414, B:205:0x0421, B:225:0x0498, B:227:0x04a0, B:247:0x04eb, B:249:0x04f5, B:275:0x053b, B:206:0x042c, B:207:0x042d, B:208:0x042e, B:209:0x043b, B:212:0x0443, B:215:0x0451, B:217:0x0457, B:219:0x0462, B:220:0x0476, B:221:0x0477, B:222:0x0478, B:223:0x0485, B:170:0x0386, B:171:0x0387, B:172:0x0388, B:174:0x0395, B:177:0x039f, B:180:0x03a8, B:182:0x03ae, B:184:0x03b9, B:185:0x03c9, B:186:0x03ca, B:187:0x03cb, B:188:0x03d3, B:280:0x055b, B:282:0x0568, B:284:0x0573, B:286:0x0579, B:288:0x0585, B:298:0x05bf, B:301:0x05e1, B:366:0x06d0, B:335:0x0652, B:337:0x065a, B:409:0x075e, B:343:0x0671, B:346:0x067a, B:349:0x0685, B:351:0x0693, B:350:0x068a, B:361:0x06ac, B:364:0x06b3, B:365:0x06bf, B:371:0x06eb, B:375:0x06f7, B:379:0x0700, B:387:0x0713, B:394:0x0723, B:396:0x0733, B:398:0x0738, B:400:0x073c, B:401:0x0743, B:390:0x071a, B:74:0x019a, B:76:0x01a4, B:79:0x01ad, B:81:0x01b3, B:83:0x01be, B:84:0x01c8, B:85:0x01c9, B:86:0x01ca, B:41:0x0112, B:43:0x011e, B:46:0x012a, B:48:0x0130, B:50:0x013d, B:60:0x015e, B:62:0x0162, B:63:0x0175, B:70:0x0185, B:67:0x017f, B:69:0x0184, B:414:0x0783, B:416:0x078f, B:417:0x0796, B:419:0x079d, B:422:0x07a1, B:424:0x07ab, B:426:0x07b5, B:430:0x07bd, B:428:0x07ba, B:433:0x07d5, B:436:0x07db, B:442:0x07fb), top: B:473:0x0008, inners: #2, #12, #13, #15, #16 }] */
    /* JADX WARN: Code duplicated, block: B:230:0x04ad  */
    /* JADX WARN: Code duplicated, block: B:236:0x04bd  */
    /* JADX WARN: Code duplicated, block: B:238:0x04c5  */
    /* JADX WARN: Code duplicated, block: B:239:0x04c7  */
    /* JADX WARN: Code duplicated, block: B:241:0x04ca  */
    /* JADX WARN: Code duplicated, block: B:243:0x04cd  */
    /* JADX WARN: Code duplicated, block: B:244:0x04d4  */
    /* JADX WARN: Code duplicated, block: B:245:0x04dd  */
    /* JADX WARN: Code duplicated, block: B:249:0x04f5 A[Catch: IOException -> 0x0096, XmlPullParserException -> 0x0099, TRY_LEAVE, TryCatch #17 {IOException -> 0x0096, XmlPullParserException -> 0x0099, blocks: (B:3:0x0008, B:6:0x005c, B:8:0x006b, B:11:0x0077, B:14:0x0087, B:16:0x008f, B:23:0x009f, B:25:0x00a7, B:29:0x00bd, B:31:0x00d8, B:33:0x00e2, B:34:0x00e6, B:36:0x00f2, B:37:0x00f6, B:71:0x018d, B:90:0x01e6, B:93:0x01fa, B:95:0x0200, B:97:0x0208, B:99:0x0210, B:101:0x0218, B:103:0x0220, B:105:0x0228, B:107:0x022e, B:109:0x0236, B:111:0x023e, B:113:0x0244, B:115:0x024a, B:117:0x0250, B:119:0x0258, B:122:0x0261, B:437:0x07de, B:123:0x0293, B:126:0x029b, B:128:0x02a4, B:130:0x02b5, B:132:0x02bf, B:134:0x02cf, B:136:0x02d5, B:138:0x02eb, B:140:0x02f1, B:293:0x0598, B:133:0x02c6, B:142:0x0300, B:145:0x030e, B:277:0x0548, B:148:0x032b, B:150:0x0333, B:152:0x033b, B:154:0x0343, B:161:0x0357, B:164:0x036a, B:166:0x0370, B:168:0x037d, B:190:0x03e5, B:192:0x03eb, B:194:0x03f1, B:196:0x03f9, B:198:0x03ff, B:201:0x040e, B:203:0x0414, B:205:0x0421, B:225:0x0498, B:227:0x04a0, B:247:0x04eb, B:249:0x04f5, B:275:0x053b, B:206:0x042c, B:207:0x042d, B:208:0x042e, B:209:0x043b, B:212:0x0443, B:215:0x0451, B:217:0x0457, B:219:0x0462, B:220:0x0476, B:221:0x0477, B:222:0x0478, B:223:0x0485, B:170:0x0386, B:171:0x0387, B:172:0x0388, B:174:0x0395, B:177:0x039f, B:180:0x03a8, B:182:0x03ae, B:184:0x03b9, B:185:0x03c9, B:186:0x03ca, B:187:0x03cb, B:188:0x03d3, B:280:0x055b, B:282:0x0568, B:284:0x0573, B:286:0x0579, B:288:0x0585, B:298:0x05bf, B:301:0x05e1, B:366:0x06d0, B:335:0x0652, B:337:0x065a, B:409:0x075e, B:343:0x0671, B:346:0x067a, B:349:0x0685, B:351:0x0693, B:350:0x068a, B:361:0x06ac, B:364:0x06b3, B:365:0x06bf, B:371:0x06eb, B:375:0x06f7, B:379:0x0700, B:387:0x0713, B:394:0x0723, B:396:0x0733, B:398:0x0738, B:400:0x073c, B:401:0x0743, B:390:0x071a, B:74:0x019a, B:76:0x01a4, B:79:0x01ad, B:81:0x01b3, B:83:0x01be, B:84:0x01c8, B:85:0x01c9, B:86:0x01ca, B:41:0x0112, B:43:0x011e, B:46:0x012a, B:48:0x0130, B:50:0x013d, B:60:0x015e, B:62:0x0162, B:63:0x0175, B:70:0x0185, B:67:0x017f, B:69:0x0184, B:414:0x0783, B:416:0x078f, B:417:0x0796, B:419:0x079d, B:422:0x07a1, B:424:0x07ab, B:426:0x07b5, B:430:0x07bd, B:428:0x07ba, B:433:0x07d5, B:436:0x07db, B:442:0x07fb), top: B:473:0x0008, inners: #2, #12, #13, #15, #16 }] */
    /* JADX WARN: Code duplicated, block: B:252:0x0501  */
    /* JADX WARN: Code duplicated, block: B:254:0x0506  */
    /* JADX WARN: Code duplicated, block: B:260:0x0516  */
    /* JADX WARN: Code duplicated, block: B:262:0x051e  */
    /* JADX WARN: Code duplicated, block: B:263:0x0520  */
    /* JADX WARN: Code duplicated, block: B:265:0x0528  */
    /* JADX WARN: Code duplicated, block: B:266:0x052a  */
    /* JADX WARN: Code duplicated, block: B:272:0x0533  */
    /* JADX WARN: Code duplicated, block: B:274:0x0539  */
    /* JADX WARN: Code duplicated, block: B:480:0x0387 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:481:0x0386 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:482:0x03ca A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:483:0x03c9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:484:0x042d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:485:0x042c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:486:0x0477 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:487:0x0476 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v41 */
    /* JADX WARN: Type inference failed for: r0v46 */
    /* JADX WARN: Type inference failed for: r0v76, types: [com.google.android.gms.internal.ads.zzaot, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v78 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6, types: [com.google.android.gms.internal.ads.zzaor] */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v10 */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v17 */
    /* JADX WARN: Type inference failed for: r16v18 */
    /* JADX WARN: Type inference failed for: r16v19 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v20 */
    /* JADX WARN: Type inference failed for: r16v21 */
    /* JADX WARN: Type inference failed for: r16v22 */
    /* JADX WARN: Type inference failed for: r16v23 */
    /* JADX WARN: Type inference failed for: r16v24 */
    /* JADX WARN: Type inference failed for: r16v25 */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r16v5 */
    /* JADX WARN: Type inference failed for: r16v6 */
    /* JADX WARN: Type inference failed for: r16v7 */
    /* JADX WARN: Type inference failed for: r16v8 */
    /* JADX WARN: Type inference failed for: r16v9 */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v16 */
    /* JADX WARN: Type inference failed for: r17v18 */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r17v25 */
    /* JADX WARN: Type inference failed for: r17v28 */
    /* JADX WARN: Type inference failed for: r17v29 */
    /* JADX WARN: Type inference failed for: r17v3 */
    /* JADX WARN: Type inference failed for: r17v30 */
    /* JADX WARN: Type inference failed for: r17v31 */
    /* JADX WARN: Type inference failed for: r17v32 */
    /* JADX WARN: Type inference failed for: r17v33 */
    /* JADX WARN: Type inference failed for: r17v34 */
    /* JADX WARN: Type inference failed for: r17v35 */
    /* JADX WARN: Type inference failed for: r17v36 */
    /* JADX WARN: Type inference failed for: r17v37 */
    /* JADX WARN: Type inference failed for: r17v38 */
    /* JADX WARN: Type inference failed for: r17v39 */
    /* JADX WARN: Type inference failed for: r17v4 */
    /* JADX WARN: Type inference failed for: r17v40 */
    /* JADX WARN: Type inference failed for: r17v5 */
    /* JADX WARN: Type inference failed for: r17v6 */
    /* JADX WARN: Type inference failed for: r17v7 */
    /* JADX WARN: Type inference failed for: r17v8 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v67 */
    /* JADX WARN: Type inference failed for: r4v24, types: [com.google.android.gms.internal.ads.zzaoq] */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v26, types: [com.google.android.gms.internal.ads.zzaoq] */
    /* JADX WARN: Type inference failed for: r4v27, types: [com.google.android.gms.internal.ads.zzaoq] */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v37 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v42 */
    /* JADX WARN: Type inference failed for: r4v43 */
    /* JADX WARN: Type inference failed for: r4v44 */
    /* JADX WARN: Type inference failed for: r4v45 */
    /* JADX WARN: Type inference failed for: r4v46 */
    /* JADX WARN: Type inference failed for: r4v47 */
    /* JADX WARN: Type inference failed for: r4v48 */
    /* JADX WARN: Type inference failed for: r4v49 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r51v1, types: [com.google.android.gms.internal.ads.zzaov, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r9v39, types: [com.google.android.gms.internal.ads.zzaoq] */
    /* JADX INFO: renamed from: b */
    public final zzann m4276b(byte[] bArr, int i2, int i3) {
        String str;
        String str2;
        String str3;
        HashMap map;
        HashMap map2;
        zzaoq zzaoqVar;
        zzaow zzaowVar;
        ?? r17;
        ?? r16;
        ?? r18;
        ?? r19;
        ?? r2;
        ?? r11;
        int i4;
        ?? r4;
        int i5;
        zzaop zzaopVar;
        zzaop zzaopVar2;
        long j2;
        Object obj;
        byte b;
        String str4;
        ?? r5;
        String[] strArrSplit;
        ?? r6;
        String str5;
        String str6;
        String strM6728c;
        String str7;
        String strM4278a;
        String str8;
        Pattern pattern;
        HashMap map3;
        float f2;
        float f3;
        ?? zzaotVar;
        String strM6728c2;
        float f4;
        float f5;
        String strM6728c3;
        float f6;
        int i6;
        String strM6728c4;
        int i7;
        String strM7119a;
        int iHashCode;
        byte b2;
        String strM7119a2;
        int iHashCode2;
        byte b3;
        Matcher matcher;
        Matcher matcher2;
        String strGroup;
        int i8;
        String strGroup2;
        String strGroup3;
        float f7;
        String strGroup4;
        String strM6728c5;
        zzaov zzaovVar;
        Matcher matcher3;
        Matcher matcher4;
        String strGroup5;
        int i9;
        String strGroup6;
        float f8;
        String strGroup7;
        String strGroup8;
        zzaov zzaovVar2;
        String[] strArrSplit2;
        float f9;
        boolean z;
        int i10;
        ?? r110;
        ?? zzaorVar;
        ?? r111;
        String str9 = "";
        String str10 = "http://www.w3.org/ns/ttml#parameter";
        String str11 = "Ignoring unsupported tag: ";
        try {
            XmlPullParser xmlPullParserNewPullParser = this.f6295a.newPullParser();
            HashMap map4 = new HashMap();
            HashMap map5 = new HashMap();
            HashMap map6 = new HashMap();
            map5.put("", new zzaot("", -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE));
            Object obj2 = null;
            xmlPullParserNewPullParser.setInput(new ByteArrayInputStream(bArr, i2, i3), null);
            ArrayDeque arrayDeque = new ArrayDeque();
            int eventType = xmlPullParserNewPullParser.getEventType();
            zzaoq zzaoqVar2 = f6294i;
            zzaow zzaowVar2 = null;
            ?? zzaoqVar3 = 0;
            ?? r112 = zzaoqVar2;
            int i11 = 0;
            int i12 = 15;
            while (eventType != 1) {
                ?? r51 = obj2;
                zzaop zzaopVar3 = (zzaop) arrayDeque.peek();
                int i13 = 0;
                if (i11 == 0) {
                    String name = xmlPullParserNewPullParser.getName();
                    str = str9;
                    if (eventType == 2) {
                        boolean zEquals = "tt".equals(name);
                        Pattern pattern2 = f6292g;
                        zzaowVar = zzaowVar2;
                        if (zEquals) {
                            String attributeValue = xmlPullParserNewPullParser.getAttributeValue(str10, "frameRate");
                            int i14 = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
                            String attributeValue2 = xmlPullParserNewPullParser.getAttributeValue(str10, "frameRateMultiplier");
                            if (attributeValue2 != null) {
                                String str12 = zzfm.f16091a;
                                String[] strArrSplit3 = attributeValue2.split(" ", -1);
                                zzgtr.m7129b("frameRateMultiplier doesn't have 2 parts", strArrSplit3.length == 2);
                                f9 = Integer.parseInt(strArrSplit3[0]) / Integer.parseInt(strArrSplit3[1]);
                            } else {
                                f9 = 1.0f;
                            }
                            int i15 = zzaoqVar2.f6283b;
                            String attributeValue3 = xmlPullParserNewPullParser.getAttributeValue(str10, "subFrameRate");
                            if (attributeValue3 != null) {
                                i15 = Integer.parseInt(attributeValue3);
                            }
                            int i16 = zzaoqVar2.f6284c;
                            float f10 = f9;
                            String attributeValue4 = xmlPullParserNewPullParser.getAttributeValue(str10, "tickRate");
                            if (attributeValue4 != null) {
                                i16 = Integer.parseInt(attributeValue4);
                            }
                            zzaoqVar3 = new zzaoq(i14 * f10, i15, i16);
                            String attributeValue5 = xmlPullParserNewPullParser.getAttributeValue(str10, "cellResolution");
                            if (attributeValue5 == null) {
                                str2 = str10;
                                r111 = zzaoqVar3;
                                zzaoqVar = zzaoqVar2;
                                i12 = 15;
                                r110 = r111;
                            } else {
                                Matcher matcher5 = f6293h.matcher(attributeValue5);
                                if (matcher5.matches()) {
                                    str2 = str10;
                                    try {
                                        String strGroup9 = matcher5.group(1);
                                        try {
                                            if (strGroup9 == null) {
                                                throw r51;
                                            }
                                            int i17 = Integer.parseInt(strGroup9);
                                            String strGroup10 = matcher5.group(2);
                                            if (strGroup10 == null) {
                                                throw r51;
                                            }
                                            int i18 = Integer.parseInt(strGroup10);
                                            if (i17 == 0) {
                                                z = false;
                                                i10 = i18;
                                            } else if (i18 != 0) {
                                                i10 = i18;
                                                z = true;
                                            } else {
                                                i10 = 0;
                                                z = false;
                                            }
                                            if (z) {
                                                r110 = zzaoqVar3;
                                                zzaoqVar = zzaoqVar2;
                                                i12 = i10;
                                            } else {
                                                try {
                                                    throw new IllegalArgumentException(zzgui.m7149b("Invalid cell resolution %s %s", Integer.valueOf(i17), Integer.valueOf(i10)));
                                                } catch (NumberFormatException unused) {
                                                }
                                            }
                                        } catch (NumberFormatException unused2) {
                                            zzeh.m6211c("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue5));
                                            r111 = zzaoqVar3;
                                            i12 = 15;
                                            r110 = r111;
                                        }
                                    } catch (NumberFormatException unused3) {
                                    }
                                    zzaoqVar = zzaoqVar2;
                                    zzeh.m6211c("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue5));
                                    r111 = zzaoqVar3;
                                    i12 = 15;
                                    r110 = r111;
                                } else {
                                    zzeh.m6211c("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue5));
                                    str2 = str10;
                                    r111 = zzaoqVar3;
                                    zzaoqVar = zzaoqVar2;
                                    i12 = 15;
                                    r110 = r111;
                                }
                            }
                            String strM6728c6 = zzfv.m6728c(xmlPullParserNewPullParser, "extent");
                            if (strM6728c6 == null) {
                                zzaorVar = r51;
                                r2 = r110;
                                r11 = zzaorVar;
                            } else {
                                Matcher matcher6 = pattern2.matcher(strM6728c6);
                                if (matcher6.matches()) {
                                    try {
                                        String strGroup11 = matcher6.group(1);
                                        if (strGroup11 == null) {
                                            throw r51;
                                        }
                                        int i19 = Integer.parseInt(strGroup11);
                                        String strGroup12 = matcher6.group(2);
                                        if (strGroup12 == null) {
                                            throw r51;
                                        }
                                        zzaorVar = new zzaor(i19, Integer.parseInt(strGroup12));
                                        r2 = r110;
                                        r11 = zzaorVar;
                                    } catch (NumberFormatException unused4) {
                                        zzeh.m6211c("TtmlParser", "Ignoring malformed tts extent: ".concat(strM6728c6));
                                        zzaorVar = r51;
                                    }
                                } else {
                                    zzeh.m6211c("TtmlParser", "Ignoring non-pixel tts extent: ".concat(strM6728c6));
                                }
                                zzaorVar = r51;
                                r2 = r110;
                                r11 = zzaorVar;
                            }
                        } else {
                            str2 = str10;
                            zzaopVar3 = zzaopVar3;
                            arrayDeque = arrayDeque;
                            zzaoqVar = zzaoqVar2;
                            r2 = r112;
                            r11 = zzaoqVar3;
                        }
                        int i20 = i12;
                        String str13 = "image";
                        String str14 = "metadata";
                        String str15 = "region";
                        r16 = r2;
                        String str16 = "head";
                        HashMap map7 = map6;
                        if (name.equals("tt") || name.equals("head") || name.equals("body") || name.equals("div") || name.equals("p") || name.equals("span") || name.equals("br") || name.equals("style") || name.equals("styling") || name.equals("layout") || name.equals("region") || name.equals("metadata") || name.equals("image") || name.equals(Constants.ScionAnalytics.MessageType.DATA_MESSAGE) || name.equals("information")) {
                            boolean zEquals2 = "head".equals(name);
                            String str17 = "\\s+";
                            if (zEquals2) {
                                while (true) {
                                    xmlPullParserNewPullParser.next();
                                    if (zzfv.m6727b(xmlPullParserNewPullParser, "style")) {
                                        String strM6728c7 = zzfv.m6728c(xmlPullParserNewPullParser, "style");
                                        str3 = str11;
                                        zzaov zzaovVarM4272c = m4272c(xmlPullParserNewPullParser, new zzaov());
                                        if (strM6728c7 != null) {
                                            String strTrim = strM6728c7.trim();
                                            if (strTrim.isEmpty()) {
                                                strArrSplit2 = new String[i13];
                                            } else {
                                                String str18 = zzfm.f16091a;
                                                strArrSplit2 = strTrim.split(str17, -1);
                                            }
                                            int i21 = 0;
                                            for (int length = strArrSplit2.length; i21 < length; length = length) {
                                                zzaovVarM4272c.m4280c((zzaov) map4.get(strArrSplit2[i21]));
                                                i21++;
                                            }
                                        } else {
                                            str16 = str16;
                                        }
                                        String strM4281d = zzaovVarM4272c.m4281d();
                                        if (strM4281d != null) {
                                            map4.put(strM4281d, zzaovVarM4272c);
                                        }
                                        map = map5;
                                        str5 = str14;
                                        str16 = str16;
                                        map2 = map7;
                                        str6 = str13;
                                        i4 = i20;
                                    } else {
                                        String str19 = str16;
                                        str3 = str11;
                                        str17 = str17;
                                        if (zzfv.m6727b(xmlPullParserNewPullParser, str15)) {
                                            String str20 = str13;
                                            String str21 = "Ignoring region with unsupported extent: ";
                                            String strM6728c8 = zzfv.m6728c(xmlPullParserNewPullParser, "id");
                                            if (strM6728c8 == null) {
                                                zzaotVar = r51;
                                                map3 = map5;
                                                i4 = i20;
                                                str8 = str14;
                                            } else {
                                                String strM6728c9 = zzfv.m6728c(xmlPullParserNewPullParser, "origin");
                                                if (strM6728c9 == null) {
                                                    str7 = strM6728c9;
                                                    String strM6728c10 = zzfv.m6728c(xmlPullParserNewPullParser, "style");
                                                    if (strM6728c10 != null && (zzaovVar2 = (zzaov) map4.get(strM6728c10)) != null) {
                                                        strM4278a = zzaovVar2.m4278a();
                                                    }
                                                    str8 = str14;
                                                    pattern = f6291f;
                                                    if (strM4278a != null) {
                                                        map3 = map5;
                                                        matcher3 = pattern.matcher(strM4278a);
                                                        i4 = i20;
                                                        matcher4 = pattern2.matcher(strM4278a);
                                                        if (matcher3.matches()) {
                                                            try {
                                                                strGroup7 = matcher3.group(1);
                                                                if (strGroup7 != null) {
                                                                    throw r51;
                                                                }
                                                                f8 = Float.parseFloat(strGroup7) / 100.0f;
                                                                strGroup8 = matcher3.group(2);
                                                                if (strGroup8 != null) {
                                                                    throw r51;
                                                                }
                                                                f2 = Float.parseFloat(strGroup8) / 100.0f;
                                                                f3 = f8;
                                                            } catch (NumberFormatException unused5) {
                                                                zzeh.m6211c("TtmlParser", "Ignoring region with malformed origin: ".concat(strM4278a));
                                                            }
                                                        } else {
                                                            if (matcher4.matches()) {
                                                                zzeh.m6211c("TtmlParser", "Ignoring region with unsupported origin: ".concat(strM4278a));
                                                            } else if (r11 == 0) {
                                                                zzeh.m6211c("TtmlParser", "Ignoring region with missing tts:extent: ".concat(strM4278a));
                                                            } else {
                                                                try {
                                                                    strGroup5 = matcher4.group(1);
                                                                    if (strGroup5 != null) {
                                                                        throw r51;
                                                                    }
                                                                    i9 = Integer.parseInt(strGroup5);
                                                                    strGroup6 = matcher4.group(2);
                                                                    if (strGroup6 != null) {
                                                                        throw r51;
                                                                    }
                                                                    int i22 = Integer.parseInt(strGroup6);
                                                                    f8 = i9 / r11.f6285a;
                                                                    f2 = i22 / r11.f6286b;
                                                                    f3 = f8;
                                                                } catch (NumberFormatException unused6) {
                                                                    zzeh.m6211c("TtmlParser", "Ignoring region with malformed origin: ".concat(strM4278a));
                                                                }
                                                            }
                                                            zzaotVar = r51;
                                                            i4 = i4;
                                                        }
                                                    } else {
                                                        str21 = "Ignoring region with unsupported extent: ";
                                                        map3 = map5;
                                                        i4 = i20;
                                                        f2 = 0.0f;
                                                        f3 = 0.0f;
                                                    }
                                                    strM6728c2 = zzfv.m6728c(xmlPullParserNewPullParser, "extent");
                                                    if (strM6728c2 == null && (strM6728c5 = zzfv.m6728c(xmlPullParserNewPullParser, "style")) != null && (zzaovVar = (zzaov) map4.get(strM6728c5)) != null) {
                                                        strM6728c2 = zzaovVar.m4279b();
                                                    }
                                                    if (strM6728c2 != null) {
                                                        matcher = pattern.matcher(strM6728c2);
                                                        matcher2 = pattern2.matcher(strM6728c2);
                                                        if (matcher.matches()) {
                                                            try {
                                                                strGroup3 = matcher.group(1);
                                                                if (strGroup3 != null) {
                                                                    throw r51;
                                                                }
                                                                f7 = Float.parseFloat(strGroup3) / 100.0f;
                                                                strGroup4 = matcher.group(2);
                                                                if (strGroup4 != null) {
                                                                    throw r51;
                                                                }
                                                                f4 = f7;
                                                                f5 = Float.parseFloat(strGroup4) / 100.0f;
                                                            } catch (NumberFormatException unused7) {
                                                                zzeh.m6211c("TtmlParser", "Ignoring region with malformed extent: ".concat(String.valueOf(strM4278a)));
                                                                zzaotVar = r51;
                                                                i4 = i4;
                                                            }
                                                        } else {
                                                            if (matcher2.matches()) {
                                                                zzeh.m6211c("TtmlParser", str21.concat(String.valueOf(strM4278a)));
                                                            } else if (r11 == 0) {
                                                                zzeh.m6211c("TtmlParser", "Ignoring region with missing tts:extent: ".concat(String.valueOf(strM4278a)));
                                                            } else {
                                                                try {
                                                                    strGroup = matcher2.group(1);
                                                                    if (strGroup != null) {
                                                                        throw r51;
                                                                    }
                                                                    i8 = Integer.parseInt(strGroup);
                                                                    strGroup2 = matcher2.group(2);
                                                                    if (strGroup2 != null) {
                                                                        throw r51;
                                                                    }
                                                                    int i23 = Integer.parseInt(strGroup2);
                                                                    float f11 = i8 / r11.f6285a;
                                                                    f5 = i23 / r11.f6286b;
                                                                    f4 = f11;
                                                                } catch (NumberFormatException unused8) {
                                                                    zzeh.m6211c("TtmlParser", "Ignoring region with malformed extent: ".concat(String.valueOf(strM4278a)));
                                                                    zzaotVar = r51;
                                                                    i4 = i4;
                                                                }
                                                            }
                                                            zzaotVar = r51;
                                                            i4 = i4;
                                                        }
                                                    } else {
                                                        f4 = 1.0f;
                                                        f5 = 1.0f;
                                                    }
                                                    strM6728c3 = zzfv.m6728c(xmlPullParserNewPullParser, "displayAlign");
                                                    if (strM6728c3 != null) {
                                                        strM7119a2 = zzgsz.m7119a(strM6728c3);
                                                        iHashCode2 = strM7119a2.hashCode();
                                                        if (iHashCode2 != -1364013995) {
                                                            if (iHashCode2 != 92734940 && strM7119a2.equals("after")) {
                                                                b3 = 1;
                                                            } else {
                                                                b3 = -1;
                                                            }
                                                        } else if (strM7119a2.equals("center")) {
                                                            b3 = 0;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        if (b3 != 0) {
                                                            f6 = f2 + (f5 / 2.0f);
                                                            i6 = 1;
                                                        } else if (b3 != 1) {
                                                            f6 = f2;
                                                            i6 = 0;
                                                        } else {
                                                            f6 = f2 + f5;
                                                            i6 = 2;
                                                        }
                                                    } else {
                                                        f6 = f2;
                                                        i6 = 0;
                                                    }
                                                    float f12 = 1.0f / i4;
                                                    strM6728c4 = zzfv.m6728c(xmlPullParserNewPullParser, "writingMode");
                                                    if (strM6728c4 != null) {
                                                        strM7119a = zzgsz.m7119a(strM6728c4);
                                                        iHashCode = strM7119a.hashCode();
                                                        if (iHashCode != 3694) {
                                                            if (iHashCode != 3553396) {
                                                                if (iHashCode != 3553576 && strM7119a.equals("tbrl")) {
                                                                    b2 = 2;
                                                                } else {
                                                                    b2 = -1;
                                                                }
                                                            } else if (strM7119a.equals("tblr")) {
                                                                b2 = 1;
                                                            } else {
                                                                b2 = -1;
                                                            }
                                                        } else if (strM7119a.equals("tb")) {
                                                            b2 = 0;
                                                        } else {
                                                            b2 = -1;
                                                        }
                                                        if (b2 != 0 || b2 == 1) {
                                                            i7 = 2;
                                                        } else if (b2 != 2) {
                                                            i7 = Integer.MIN_VALUE;
                                                        } else {
                                                            i7 = 1;
                                                        }
                                                    } else {
                                                        i7 = Integer.MIN_VALUE;
                                                    }
                                                    zzaotVar = new zzaot(strM6728c8, f3, f6, 0, i6, f4, f5, 1, f12, i7);
                                                } else {
                                                    str7 = strM6728c9;
                                                }
                                                strM4278a = str7;
                                                str8 = str14;
                                                pattern = f6291f;
                                                if (strM4278a != null) {
                                                    map3 = map5;
                                                    matcher3 = pattern.matcher(strM4278a);
                                                    i4 = i20;
                                                    matcher4 = pattern2.matcher(strM4278a);
                                                    if (matcher3.matches()) {
                                                        strGroup7 = matcher3.group(1);
                                                        if (strGroup7 != null) {
                                                            throw r51;
                                                        }
                                                        f8 = Float.parseFloat(strGroup7) / 100.0f;
                                                        strGroup8 = matcher3.group(2);
                                                        if (strGroup8 != null) {
                                                            throw r51;
                                                        }
                                                        f2 = Float.parseFloat(strGroup8) / 100.0f;
                                                        f3 = f8;
                                                    } else {
                                                        if (matcher4.matches()) {
                                                            zzeh.m6211c("TtmlParser", "Ignoring region with unsupported origin: ".concat(strM4278a));
                                                        } else if (r11 == 0) {
                                                            zzeh.m6211c("TtmlParser", "Ignoring region with missing tts:extent: ".concat(strM4278a));
                                                        } else {
                                                            strGroup5 = matcher4.group(1);
                                                            if (strGroup5 != null) {
                                                                throw r51;
                                                            }
                                                            i9 = Integer.parseInt(strGroup5);
                                                            strGroup6 = matcher4.group(2);
                                                            if (strGroup6 != null) {
                                                                throw r51;
                                                            }
                                                            int i24 = Integer.parseInt(strGroup6);
                                                            f8 = i9 / r11.f6285a;
                                                            f2 = i24 / r11.f6286b;
                                                            f3 = f8;
                                                        }
                                                        zzaotVar = r51;
                                                        i4 = i4;
                                                    }
                                                } else {
                                                    str21 = "Ignoring region with unsupported extent: ";
                                                    map3 = map5;
                                                    i4 = i20;
                                                    f2 = 0.0f;
                                                    f3 = 0.0f;
                                                }
                                                strM6728c2 = zzfv.m6728c(xmlPullParserNewPullParser, "extent");
                                                if (strM6728c2 == null) {
                                                    strM6728c2 = zzaovVar.m4279b();
                                                }
                                                if (strM6728c2 != null) {
                                                    matcher = pattern.matcher(strM6728c2);
                                                    matcher2 = pattern2.matcher(strM6728c2);
                                                    if (matcher.matches()) {
                                                        strGroup3 = matcher.group(1);
                                                        if (strGroup3 != null) {
                                                            throw r51;
                                                        }
                                                        f7 = Float.parseFloat(strGroup3) / 100.0f;
                                                        strGroup4 = matcher.group(2);
                                                        if (strGroup4 != null) {
                                                            throw r51;
                                                        }
                                                        f4 = f7;
                                                        f5 = Float.parseFloat(strGroup4) / 100.0f;
                                                    } else {
                                                        if (matcher2.matches()) {
                                                            zzeh.m6211c("TtmlParser", str21.concat(String.valueOf(strM4278a)));
                                                        } else if (r11 == 0) {
                                                            zzeh.m6211c("TtmlParser", "Ignoring region with missing tts:extent: ".concat(String.valueOf(strM4278a)));
                                                        } else {
                                                            strGroup = matcher2.group(1);
                                                            if (strGroup != null) {
                                                                throw r51;
                                                            }
                                                            i8 = Integer.parseInt(strGroup);
                                                            strGroup2 = matcher2.group(2);
                                                            if (strGroup2 != null) {
                                                                throw r51;
                                                            }
                                                            int i25 = Integer.parseInt(strGroup2);
                                                            float f13 = i8 / r11.f6285a;
                                                            f5 = i25 / r11.f6286b;
                                                            f4 = f13;
                                                        }
                                                        zzaotVar = r51;
                                                        i4 = i4;
                                                    }
                                                } else {
                                                    f4 = 1.0f;
                                                    f5 = 1.0f;
                                                }
                                                strM6728c3 = zzfv.m6728c(xmlPullParserNewPullParser, "displayAlign");
                                                if (strM6728c3 != null) {
                                                    strM7119a2 = zzgsz.m7119a(strM6728c3);
                                                    iHashCode2 = strM7119a2.hashCode();
                                                    if (iHashCode2 != -1364013995) {
                                                        if (iHashCode2 != 92734940) {
                                                            b3 = -1;
                                                        } else {
                                                            b3 = 1;
                                                        }
                                                    } else if (strM7119a2.equals("center")) {
                                                        b3 = 0;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    if (b3 != 0) {
                                                        f6 = f2 + (f5 / 2.0f);
                                                        i6 = 1;
                                                    } else if (b3 != 1) {
                                                        f6 = f2;
                                                        i6 = 0;
                                                    } else {
                                                        f6 = f2 + f5;
                                                        i6 = 2;
                                                    }
                                                } else {
                                                    f6 = f2;
                                                    i6 = 0;
                                                }
                                                float f14 = 1.0f / i4;
                                                strM6728c4 = zzfv.m6728c(xmlPullParserNewPullParser, "writingMode");
                                                if (strM6728c4 != null) {
                                                    strM7119a = zzgsz.m7119a(strM6728c4);
                                                    iHashCode = strM7119a.hashCode();
                                                    if (iHashCode != 3694) {
                                                        if (iHashCode != 3553396) {
                                                            if (iHashCode != 3553576) {
                                                                b2 = -1;
                                                            } else {
                                                                b2 = 2;
                                                            }
                                                        } else if (strM7119a.equals("tblr")) {
                                                            b2 = 1;
                                                        } else {
                                                            b2 = -1;
                                                        }
                                                    } else if (strM7119a.equals("tb")) {
                                                        b2 = 0;
                                                    } else {
                                                        b2 = -1;
                                                    }
                                                    if (b2 != 0) {
                                                        i7 = 2;
                                                    } else {
                                                        i7 = 2;
                                                    }
                                                } else {
                                                    i7 = Integer.MIN_VALUE;
                                                }
                                                zzaotVar = new zzaot(strM6728c8, f3, f6, 0, i6, f4, f5, 1, f14, i7);
                                            }
                                            if (zzaotVar != 0) {
                                                map = map3;
                                                map.put(zzaotVar.f6296a, zzaotVar);
                                            } else {
                                                map = map3;
                                            }
                                            str16 = str19;
                                            map2 = map7;
                                            str6 = str20;
                                            str5 = str8;
                                        } else {
                                            String str22 = str13;
                                            map = map5;
                                            i4 = i20;
                                            str5 = str14;
                                            if (zzfv.m6727b(xmlPullParserNewPullParser, str5)) {
                                                while (true) {
                                                    xmlPullParserNewPullParser.next();
                                                    str6 = str22;
                                                    if (!zzfv.m6727b(xmlPullParserNewPullParser, str6) || (strM6728c = zzfv.m6728c(xmlPullParserNewPullParser, "id")) == null) {
                                                        map2 = map7;
                                                    } else {
                                                        map2 = map7;
                                                        map2.put(strM6728c, xmlPullParserNewPullParser.nextText());
                                                    }
                                                    if (!zzfv.m6726a(xmlPullParserNewPullParser, str5)) {
                                                        str22 = str6;
                                                        map7 = map2;
                                                    }
                                                }
                                            } else {
                                                map2 = map7;
                                                str6 = str22;
                                            }
                                            str16 = str19;
                                        }
                                    }
                                    if (zzfv.m6726a(xmlPullParserNewPullParser, str16)) {
                                        r6 = r16;
                                        arrayDeque = arrayDeque;
                                    } else {
                                        str14 = str5;
                                        i20 = i4;
                                        str13 = str6;
                                        map7 = map2;
                                        str17 = str17;
                                        str15 = str15;
                                        i13 = 0;
                                        map5 = map;
                                        str11 = str3;
                                    }
                                }
                            } else {
                                str3 = str11;
                                map = map5;
                                i4 = i20;
                                String str23 = "\\s+";
                                Object obj3 = "region";
                                map2 = map7;
                                try {
                                    int attributeCount = xmlPullParserNewPullParser.getAttributeCount();
                                    zzaov zzaovVarM4272c2 = m4272c(xmlPullParserNewPullParser, r51);
                                    String str24 = str;
                                    int i26 = 0;
                                    long jM4275f = -9223372036854775807L;
                                    long jM4275f2 = -9223372036854775807L;
                                    String[] strArr = null;
                                    String strSubstring = null;
                                    long jM4275f3 = -9223372036854775807L;
                                    while (i26 < attributeCount) {
                                        try {
                                            String attributeName = xmlPullParserNewPullParser.getAttributeName(i26);
                                            String attributeValue6 = xmlPullParserNewPullParser.getAttributeValue(i26);
                                            switch (attributeName.hashCode()) {
                                                case -934795532:
                                                    obj = obj3;
                                                    b = attributeName.equals(obj) ? (byte) 4 : (byte) -1;
                                                    break;
                                                case 99841:
                                                    if (attributeName.equals("dur")) {
                                                        obj = obj3;
                                                        b = 2;
                                                    } else {
                                                        obj = obj3;
                                                    }
                                                    break;
                                                case 100571:
                                                    if (attributeName.equals("end")) {
                                                        obj = obj3;
                                                        b = 1;
                                                    } else {
                                                        obj = obj3;
                                                    }
                                                    break;
                                                case 93616297:
                                                    if (attributeName.equals("begin")) {
                                                        obj = obj3;
                                                        b = 0;
                                                    } else {
                                                        obj = obj3;
                                                    }
                                                    break;
                                                case 109780401:
                                                    if (attributeName.equals("style")) {
                                                        obj = obj3;
                                                        b = 3;
                                                    } else {
                                                        obj = obj3;
                                                    }
                                                    break;
                                                case 1292595405:
                                                    if (attributeName.equals("backgroundImage")) {
                                                        b = 5;
                                                        obj = obj3;
                                                    } else {
                                                        obj = obj3;
                                                    }
                                                    break;
                                                default:
                                                    obj = obj3;
                                                    break;
                                            }
                                            if (b != 0) {
                                                i5 = 1;
                                                if (b == 1) {
                                                    ?? r7 = r16;
                                                    str4 = str23;
                                                    jM4275f = m4275f(attributeValue6, r7);
                                                    r5 = r7;
                                                } else if (b != 2) {
                                                    if (b == 3) {
                                                        try {
                                                            String strTrim2 = attributeValue6.trim();
                                                            if (strTrim2.isEmpty()) {
                                                                try {
                                                                    strArrSplit = new String[0];
                                                                    str4 = str23;
                                                                } catch (zzano e) {
                                                                    e = e;
                                                                    r4 = r16;
                                                                    arrayDeque = arrayDeque;
                                                                    zzeh.m6212d("TtmlParser", "Suppressing parser error", e);
                                                                    i12 = i4;
                                                                    r16 = r4;
                                                                    i11 = i5;
                                                                    r17 = r11;
                                                                    zzaowVar2 = zzaowVar;
                                                                    xmlPullParserNewPullParser.next();
                                                                    eventType = xmlPullParserNewPullParser.getEventType();
                                                                    arrayDeque = arrayDeque;
                                                                    map6 = map2;
                                                                    str9 = str;
                                                                    str10 = str2;
                                                                    zzaoqVar2 = zzaoqVar;
                                                                    obj2 = null;
                                                                    map5 = map;
                                                                    str11 = str3;
                                                                    r112 = r16;
                                                                    zzaoqVar3 = r17;
                                                                }
                                                            } else {
                                                                String str25 = zzfm.f16091a;
                                                                str4 = str23;
                                                                strArrSplit = strTrim2.split(str4, -1);
                                                            }
                                                            if (strArrSplit.length > 0) {
                                                                strArr = strArrSplit;
                                                            }
                                                        } catch (zzano e2) {
                                                            e = e2;
                                                        }
                                                    } else if (b != 4) {
                                                        if (b == 5) {
                                                            try {
                                                                if (attributeValue6.startsWith("#")) {
                                                                    strSubstring = attributeValue6.substring(1);
                                                                    str4 = str23;
                                                                    r5 = r16;
                                                                }
                                                            } catch (zzano e3) {
                                                                e = e3;
                                                                r4 = r16;
                                                                zzeh.m6212d("TtmlParser", "Suppressing parser error", e);
                                                                i12 = i4;
                                                                r16 = r4;
                                                                i11 = i5;
                                                                r17 = r11;
                                                                zzaowVar2 = zzaowVar;
                                                                xmlPullParserNewPullParser.next();
                                                                eventType = xmlPullParserNewPullParser.getEventType();
                                                                arrayDeque = arrayDeque;
                                                                map6 = map2;
                                                                str9 = str;
                                                                str10 = str2;
                                                                zzaoqVar2 = zzaoqVar;
                                                                obj2 = null;
                                                                map5 = map;
                                                                str11 = str3;
                                                                r112 = r16;
                                                                zzaoqVar3 = r17;
                                                            }
                                                        }
                                                        str4 = str23;
                                                    } else {
                                                        if (map.containsKey(attributeValue6)) {
                                                            str24 = attributeValue6;
                                                            str4 = str23;
                                                            r5 = r16;
                                                        }
                                                        str4 = str23;
                                                    }
                                                    r5 = r16;
                                                } else {
                                                    ?? r8 = r16;
                                                    str4 = str23;
                                                    jM4275f3 = m4275f(attributeValue6, r8);
                                                    r5 = r8;
                                                }
                                            } else {
                                                ?? r9 = r16;
                                                str4 = str23;
                                                i5 = 1;
                                                jM4275f2 = m4275f(attributeValue6, r9);
                                                r5 = r9;
                                            }
                                            try {
                                                i26++;
                                                r16 = r5;
                                                obj3 = obj;
                                                str23 = str4;
                                            } catch (zzano e4) {
                                                e = e4;
                                                r4 = r5;
                                                arrayDeque = arrayDeque;
                                                zzeh.m6212d("TtmlParser", "Suppressing parser error", e);
                                                i12 = i4;
                                                r16 = r4;
                                                i11 = i5;
                                                r17 = r11;
                                                zzaowVar2 = zzaowVar;
                                                xmlPullParserNewPullParser.next();
                                                eventType = xmlPullParserNewPullParser.getEventType();
                                                arrayDeque = arrayDeque;
                                                map6 = map2;
                                                str9 = str;
                                                str10 = str2;
                                                zzaoqVar2 = zzaoqVar;
                                                obj2 = null;
                                                map5 = map;
                                                str11 = str3;
                                                r112 = r16;
                                                zzaoqVar3 = r17;
                                            }
                                        } catch (zzano e5) {
                                            e = e5;
                                            r4 = r16;
                                            i5 = 1;
                                        }
                                    }
                                    r4 = r16;
                                    i5 = 1;
                                    long j3 = -9223372036854775807L;
                                    if (zzaopVar3 != null) {
                                        zzaopVar = zzaopVar3;
                                        long j4 = zzaopVar.f6272d;
                                        if (j4 == -9223372036854775807L) {
                                            zzaopVar2 = zzaopVar;
                                        } else {
                                            jM4275f2 = jM4275f2 != -9223372036854775807L ? jM4275f2 + j4 : -9223372036854775807L;
                                            if (jM4275f != -9223372036854775807L) {
                                                jM4275f += j4;
                                                zzaopVar2 = zzaopVar;
                                            } else {
                                                zzaopVar2 = zzaopVar;
                                                jM4275f = -9223372036854775807L;
                                            }
                                        }
                                    } else {
                                        zzaopVar = zzaopVar3;
                                        zzaopVar2 = null;
                                    }
                                    if (jM4275f == -9223372036854775807L) {
                                        if (jM4275f3 != -9223372036854775807L) {
                                            j2 = jM4275f2 + jM4275f3;
                                        } else if (zzaopVar2 != null) {
                                            j2 = zzaopVar2.f6273e;
                                            if (j2 != -9223372036854775807L) {
                                            }
                                        }
                                        j3 = j2;
                                    } else {
                                        j3 = jM4275f;
                                    }
                                    zzaop zzaopVarM4263b = zzaop.m4263b(xmlPullParserNewPullParser.getName(), jM4275f2, j3, zzaovVarM4272c2, strArr, str24, strSubstring, zzaopVar2);
                                    arrayDeque = arrayDeque;
                                    try {
                                        arrayDeque.push(zzaopVarM4263b);
                                        r6 = r4;
                                        if (zzaopVar != null) {
                                            if (zzaopVar.f6281m == null) {
                                                zzaopVar.f6281m = new ArrayList();
                                            }
                                            zzaopVar.f6281m.add(zzaopVarM4263b);
                                            r6 = r4;
                                        }
                                    } catch (zzano e6) {
                                        e = e6;
                                        zzeh.m6212d("TtmlParser", "Suppressing parser error", e);
                                        i12 = i4;
                                        r16 = r4;
                                        i11 = i5;
                                        r17 = r11;
                                        zzaowVar2 = zzaowVar;
                                    }
                                } catch (zzano e7) {
                                    e = e7;
                                    r4 = r16;
                                    i5 = 1;
                                }
                            }
                            i12 = i4;
                            r19 = r6;
                            r18 = r11;
                        } else {
                            String name2 = xmlPullParserNewPullParser.getName();
                            StringBuilder sb = new StringBuilder(String.valueOf(name2).length() + 26);
                            sb.append(str11);
                            sb.append(name2);
                            zzeh.m6210b("TtmlParser", sb.toString());
                            str3 = str11;
                            map = map5;
                            i12 = i20;
                            r17 = r11;
                            zzaowVar2 = zzaowVar;
                            arrayDeque = arrayDeque;
                            map2 = map7;
                            i11 = 1;
                        }
                    } else {
                        str2 = str10;
                        str3 = str11;
                        map = map5;
                        map2 = map6;
                        arrayDeque = arrayDeque;
                        zzaoqVar = zzaoqVar2;
                        zzaowVar = zzaowVar2;
                        i11 = i11;
                        if (eventType != 4) {
                            if (eventType == 3) {
                                if (xmlPullParserNewPullParser.getName().equals("tt")) {
                                    zzaop zzaopVar4 = (zzaop) arrayDeque.peek();
                                    if (zzaopVar4 == null) {
                                        r19 = r112;
                                        r18 = zzaoqVar3;
                                        throw null;
                                    }
                                    r19 = r112;
                                    r18 = zzaoqVar3;
                                    zzaowVar2 = new zzaow(zzaopVar4, map4, map, map2);
                                } else {
                                    r19 = r112;
                                    r18 = zzaoqVar3;
                                    zzaowVar2 = zzaowVar;
                                }
                                arrayDeque.pop();
                                r16 = r112;
                                r17 = zzaoqVar3;
                            }
                            i11 = i11;
                        } else {
                            if (zzaopVar3 == null) {
                                throw null;
                            }
                            zzaop zzaopVarM4262a = zzaop.m4262a(xmlPullParserNewPullParser.getText());
                            if (zzaopVar3.f6281m == null) {
                                zzaopVar3.f6281m = new ArrayList();
                            }
                            zzaopVar3.f6281m.add(zzaopVarM4262a);
                            r19 = r112;
                            r18 = zzaoqVar3;
                        }
                    }
                    r19 = r112;
                    r18 = zzaoqVar3;
                    r19 = r112;
                    r18 = zzaoqVar3;
                    zzaowVar2 = zzaowVar;
                    r16 = r19;
                    r17 = r18;
                    i11 = i11;
                } else {
                    str = str9;
                    str2 = str10;
                    str3 = str11;
                    map = map5;
                    map2 = map6;
                    arrayDeque = arrayDeque;
                    zzaoqVar = zzaoqVar2;
                    zzaowVar = zzaowVar2;
                    i11 = i11;
                    if (eventType == 2) {
                        i11++;
                        r16 = r112;
                        r17 = zzaoqVar3;
                    } else {
                        if (eventType == 3) {
                            r19 = r112;
                            r18 = zzaoqVar3;
                            i11--;
                            r16 = r112;
                            r17 = zzaoqVar3;
                        }
                        r19 = r112;
                        r18 = zzaoqVar3;
                        r19 = r112;
                        r18 = zzaoqVar3;
                        zzaowVar2 = zzaowVar;
                        r16 = r19;
                        r17 = r18;
                        i11 = i11;
                    }
                    zzaowVar2 = zzaowVar;
                }
                xmlPullParserNewPullParser.next();
                eventType = xmlPullParserNewPullParser.getEventType();
                arrayDeque = arrayDeque;
                map6 = map2;
                str9 = str;
                str10 = str2;
                zzaoqVar2 = zzaoqVar;
                obj2 = null;
                map5 = map;
                str11 = str3;
                r112 = r16;
                zzaoqVar3 = r17;
            }
            zzaow zzaowVar3 = zzaowVar2;
            if (zzaowVar3 != null) {
                return zzaowVar3;
            }
            throw null;
        } catch (IOException e8) {
            throw new IllegalStateException("Unexpected error when reading input.", e8);
        } catch (XmlPullParserException e9) {
            throw new IllegalStateException("Unable to decode source", e9);
        }
    }
}
