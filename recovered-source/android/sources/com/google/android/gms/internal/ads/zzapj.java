package com.google.android.gms.internal.ads;

import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class zzapj {

    /* JADX INFO: renamed from: a */
    public static final Pattern f6401a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)((?:.|\\f)*+)?$");

    /* JADX INFO: renamed from: b */
    public static final Pattern f6402b = Pattern.compile("(\\S+?):(\\S+)");

    /* JADX INFO: renamed from: c */
    public static final Map f6403c;

    /* JADX INFO: renamed from: d */
    public static final Map f6404d;

    static {
        HashMap map = new HashMap();
        map.put("white", Integer.valueOf(Color.rgb(255, 255, 255)));
        map.put("lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        map.put("cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        map.put("red", Integer.valueOf(Color.rgb(255, 0, 0)));
        map.put("yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        map.put("magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        map.put("blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        map.put("black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f6403c = Collections.unmodifiableMap(map);
        HashMap map2 = new HashMap();
        map2.put("bg_white", Integer.valueOf(Color.rgb(255, 255, 255)));
        map2.put("bg_lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        map2.put("bg_cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        map2.put("bg_red", Integer.valueOf(Color.rgb(255, 0, 0)));
        map2.put("bg_yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        map2.put("bg_magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        map2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        map2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f6404d = Collections.unmodifiableMap(map2);
    }

    /* JADX WARN: Code duplicated, block: B:128:0x0220  */
    /* JADX WARN: Code duplicated, block: B:34:0x009e A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:76:0x0135  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: a */
    public static SpannedString m4295a(String str, String str2, List list) {
        byte b;
        int i2;
        int i3;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList = new ArrayList();
        int i4 = 0;
        int i5 = 0;
        while (true) {
            String strTrim = "";
            if (i5 >= str2.length()) {
                while (!arrayDeque.isEmpty()) {
                    m4298d(str, (zzapg) arrayDeque.pop(), arrayList, spannableStringBuilder, list);
                }
                m4298d(str, new zzapg("", i4, "", Collections.EMPTY_SET), Collections.EMPTY_LIST, spannableStringBuilder, list);
                return SpannedString.valueOf(spannableStringBuilder);
            }
            int i6 = i5 + 1;
            char cCharAt = str2.charAt(i5);
            int i7 = i4;
            if (cCharAt == '&') {
                int iIndexOf = str2.indexOf(59, i6);
                int iIndexOf2 = str2.indexOf(32, i6);
                if (iIndexOf == -1) {
                    iIndexOf = iIndexOf2;
                } else if (iIndexOf2 != -1) {
                    iIndexOf = Math.min(iIndexOf, iIndexOf2);
                }
                if (iIndexOf != -1) {
                    String strSubstring = str2.substring(i6, iIndexOf);
                    int iHashCode = strSubstring.hashCode();
                    if (iHashCode != 3309) {
                        if (iHashCode != 3464) {
                            if (iHashCode != 96708) {
                                if (iHashCode == 3374865 && strSubstring.equals("nbsp")) {
                                    b = 2;
                                } else {
                                    b = -1;
                                }
                            } else if (strSubstring.equals("amp")) {
                                b = 3;
                            } else {
                                b = -1;
                            }
                        } else if (strSubstring.equals("lt")) {
                            b = 0;
                        } else {
                            b = -1;
                        }
                    } else if (strSubstring.equals("gt")) {
                        b = 1;
                    } else {
                        b = -1;
                    }
                    if (b == 0) {
                        spannableStringBuilder.append('<');
                    } else if (b == 1) {
                        spannableStringBuilder.append('>');
                    } else if (b == 2) {
                        spannableStringBuilder.append(' ');
                    } else if (b != 3) {
                        StringBuilder sb = new StringBuilder(strSubstring.length() + 33);
                        sb.append("ignoring unsupported entity: '&");
                        sb.append(strSubstring);
                        sb.append(";'");
                        zzeh.m6211c("WebvttCueParser", sb.toString());
                    } else {
                        spannableStringBuilder.append('&');
                    }
                    if (iIndexOf == iIndexOf2) {
                        spannableStringBuilder.append((CharSequence) " ");
                    }
                    i5 = iIndexOf + 1;
                } else {
                    spannableStringBuilder.append(cCharAt);
                }
                i4 = 0;
            } else if (cCharAt != '<') {
                spannableStringBuilder.append(cCharAt);
            } else if (i6 < str2.length()) {
                char cCharAt2 = str2.charAt(i6);
                int iIndexOf3 = str2.indexOf(62, i6);
                int length = iIndexOf3 == -1 ? str2.length() : iIndexOf3 + 1;
                int i8 = length - 2;
                int i9 = str2.charAt(i8) == '/' ? 1 : i7;
                int i10 = i5 + (cCharAt2 == '/' ? 2 : 1);
                if (i9 == 0) {
                    i8 = length - 1;
                }
                String strSubstring2 = str2.substring(i10, i8);
                if (!strSubstring2.trim().isEmpty()) {
                    String strTrim2 = strSubstring2.trim();
                    zzgtr.m7128a(!strTrim2.isEmpty());
                    String str3 = zzfm.f16091a;
                    String str4 = strTrim2.split("[ \\.]", 2)[i7];
                    int iHashCode2 = str4.hashCode();
                    if (iHashCode2 != 98) {
                        if (iHashCode2 != 99) {
                            if (iHashCode2 != 105) {
                                if (iHashCode2 != 3650) {
                                    if (iHashCode2 != 3314158) {
                                        if (iHashCode2 != 3511770) {
                                            if (iHashCode2 != 117) {
                                                if (iHashCode2 == 118 && str4.equals("v")) {
                                                    i2 = 7;
                                                } else {
                                                    i2 = -1;
                                                }
                                            } else if (str4.equals("u")) {
                                                i2 = 6;
                                            } else {
                                                i2 = -1;
                                            }
                                        } else if (str4.equals("ruby")) {
                                            i2 = 4;
                                        } else {
                                            i2 = -1;
                                        }
                                    } else if (str4.equals("lang")) {
                                        i2 = 3;
                                    } else {
                                        i2 = -1;
                                    }
                                } else if (str4.equals("rt")) {
                                    i2 = 5;
                                } else {
                                    i2 = -1;
                                }
                            } else if (str4.equals("i")) {
                                i2 = 2;
                            } else {
                                i2 = -1;
                            }
                        } else if (str4.equals("c")) {
                            i2 = 1;
                        } else {
                            i2 = -1;
                        }
                    } else if (str4.equals("b")) {
                        i2 = i7;
                    } else {
                        i2 = -1;
                    }
                    switch (i2) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                            if (cCharAt2 != '/') {
                                if (i9 == 0) {
                                    int length2 = spannableStringBuilder.length();
                                    String strTrim3 = strSubstring2.trim();
                                    zzgtr.m7128a(!strTrim3.isEmpty());
                                    int iIndexOf4 = strTrim3.indexOf(" ");
                                    if (iIndexOf4 == -1) {
                                        i3 = i7;
                                    } else {
                                        strTrim = strTrim3.substring(iIndexOf4).trim();
                                        i3 = i7;
                                        strTrim3 = strTrim3.substring(i3, iIndexOf4);
                                    }
                                    String[] strArrSplit = strTrim3.split("\\.", -1);
                                    String str5 = strArrSplit[i3];
                                    HashSet hashSet = new HashSet();
                                    for (int i11 = 1; i11 < strArrSplit.length; i11++) {
                                        hashSet.add(strArrSplit[i11]);
                                    }
                                    arrayDeque.push(new zzapg(str5, length2, strTrim, hashSet));
                                }
                                break;
                            } else {
                                while (!arrayDeque.isEmpty()) {
                                    zzapg zzapgVar = (zzapg) arrayDeque.pop();
                                    m4298d(str, zzapgVar, arrayList, spannableStringBuilder, list);
                                    if (arrayDeque.isEmpty()) {
                                        arrayList.clear();
                                    } else {
                                        arrayList.add(new zzapf(zzapgVar, spannableStringBuilder.length()));
                                    }
                                    if (zzapgVar.f6384a.equals(str4)) {
                                        break;
                                    }
                                }
                                break;
                            }
                        default:
                            i3 = i7;
                            break;
                    }
                } else {
                    i3 = i7;
                }
                i5 = length;
                i4 = i3;
            }
            i5 = i6;
            i4 = 0;
        }
    }

    /* JADX INFO: renamed from: b */
    public static zzapd m4296b(String str, Matcher matcher, zzeu zzeuVar, ArrayList arrayList) {
        zzapi zzapiVar = new zzapi();
        try {
            String strGroup = matcher.group(1);
            if (strGroup == null) {
                throw null;
            }
            zzapiVar.f6390a = zzapl.m4301a(strGroup);
            String strGroup2 = matcher.group(2);
            if (strGroup2 == null) {
                throw null;
            }
            zzapiVar.f6391b = zzapl.m4301a(strGroup2);
            String strGroup3 = matcher.group(3);
            strGroup3.getClass();
            m4297c(strGroup3, zzapiVar);
            StringBuilder sb = new StringBuilder();
            String strM6388n = zzeuVar.m6388n(StandardCharsets.UTF_8);
            while (!TextUtils.isEmpty(strM6388n)) {
                if (sb.length() > 0) {
                    sb.append("\n");
                }
                sb.append(strM6388n.trim());
                strM6388n = zzeuVar.m6388n(StandardCharsets.UTF_8);
            }
            zzapiVar.f6392c = m4295a(str, sb.toString(), arrayList);
            return new zzapd(zzapiVar.m4294a().m5860b(), zzapiVar.f6390a, zzapiVar.f6391b);
        } catch (IllegalArgumentException unused) {
            zzeh.m6211c("WebvttCueParser", "Skipping cue with bad header: ".concat(String.valueOf(matcher.group())));
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:32:0x007f  */
    /* JADX WARN: Code duplicated, block: B:66:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:96:0x0167  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: c */
    public static void m4297c(String str, zzapi zzapiVar) {
        byte b;
        byte b2;
        byte b3;
        Matcher matcher = f6402b.matcher(str);
        while (matcher.find()) {
            int i2 = 1;
            String strGroup = matcher.group(1);
            strGroup.getClass();
            int i3 = 2;
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            try {
                if ("line".equals(strGroup)) {
                    int iIndexOf = strGroup2.indexOf(44);
                    byte b4 = -1;
                    if (iIndexOf != -1) {
                        String strSubstring = strGroup2.substring(iIndexOf + 1);
                        switch (strSubstring.hashCode()) {
                            case -1364013995:
                                if (strSubstring.equals("center")) {
                                    b4 = 1;
                                }
                                break;
                            case -1074341483:
                                if (strSubstring.equals("middle")) {
                                    b4 = 2;
                                }
                                break;
                            case 100571:
                                if (strSubstring.equals("end")) {
                                    b4 = 3;
                                }
                                break;
                            case 109757538:
                                if (strSubstring.equals("start")) {
                                    b4 = 0;
                                }
                                break;
                        }
                        if (b4 == 0) {
                            i3 = 0;
                        } else if (b4 == 1 || b4 == 2) {
                            i3 = 1;
                        } else if (b4 != 3) {
                            zzeh.m6211c("WebvttCueParser", "Invalid anchor value: ".concat(strSubstring));
                            i3 = Integer.MIN_VALUE;
                        }
                        zzapiVar.f6396g = i3;
                        strGroup2 = strGroup2.substring(0, iIndexOf);
                    }
                    if (strGroup2.endsWith("%")) {
                        zzapiVar.f6394e = zzapl.m4302b(strGroup2);
                        zzapiVar.f6395f = 0;
                    } else {
                        zzapiVar.f6394e = Integer.parseInt(strGroup2);
                        zzapiVar.f6395f = 1;
                    }
                } else if ("align".equals(strGroup)) {
                    switch (strGroup2) {
                        case "center":
                            b = 2;
                            break;
                        case "middle":
                            b = 3;
                            break;
                        case "end":
                            b = 4;
                            break;
                        case "left":
                            b = 1;
                            break;
                        case "right":
                            b = 5;
                            break;
                        case "start":
                            b = 0;
                            break;
                        default:
                            b = -1;
                            break;
                    }
                    if (b != 0) {
                        if (b == 1) {
                            i2 = 4;
                        } else if (b == 2 || b == 3) {
                            i2 = 2;
                        } else if (b == 4) {
                            i2 = 3;
                        } else if (b != 5) {
                            zzeh.m6211c("WebvttCueParser", "Invalid alignment value: ".concat(strGroup2));
                            i2 = 2;
                        } else {
                            i2 = 5;
                        }
                    }
                    zzapiVar.f6393d = i2;
                } else if ("position".equals(strGroup)) {
                    int iIndexOf2 = strGroup2.indexOf(44);
                    if (iIndexOf2 != -1) {
                        String strSubstring2 = strGroup2.substring(iIndexOf2 + 1);
                        switch (strSubstring2) {
                            case "line-left":
                                b3 = 0;
                                break;
                            case "center":
                                b3 = 2;
                                break;
                            case "line-right":
                                b3 = 4;
                                break;
                            case "middle":
                                b3 = 3;
                                break;
                            case "end":
                                b3 = 5;
                                break;
                            case "start":
                                b3 = 1;
                                break;
                            default:
                                b3 = -1;
                                break;
                        }
                        if (b3 == 0 || b3 == 1) {
                            i2 = 0;
                        } else if (b3 != 2 && b3 != 3) {
                            if (b3 == 4 || b3 == 5) {
                                i2 = 2;
                            } else {
                                zzeh.m6211c("WebvttCueParser", "Invalid anchor value: ".concat(strSubstring2));
                                i2 = Integer.MIN_VALUE;
                            }
                        }
                        zzapiVar.f6398i = i2;
                        strGroup2 = strGroup2.substring(0, iIndexOf2);
                    }
                    zzapiVar.f6397h = zzapl.m4302b(strGroup2);
                } else if ("size".equals(strGroup)) {
                    zzapiVar.f6399j = zzapl.m4302b(strGroup2);
                } else if ("vertical".equals(strGroup)) {
                    int iHashCode = strGroup2.hashCode();
                    if (iHashCode != 3462) {
                        if (iHashCode == 3642 && strGroup2.equals("rl")) {
                            b2 = 0;
                        } else {
                            b2 = -1;
                        }
                    } else if (strGroup2.equals("lr")) {
                        b2 = 1;
                    } else {
                        b2 = -1;
                    }
                    if (b2 != 0) {
                        if (b2 != 1) {
                            zzeh.m6211c("WebvttCueParser", "Invalid 'vertical' value: ".concat(strGroup2));
                            i2 = Integer.MIN_VALUE;
                        } else {
                            i2 = 2;
                        }
                    }
                    zzapiVar.f6400k = i2;
                } else {
                    StringBuilder sb = new StringBuilder(strGroup.length() + 21 + strGroup2.length());
                    sb.append("Unknown cue setting ");
                    sb.append(strGroup);
                    sb.append(":");
                    sb.append(strGroup2);
                    zzeh.m6211c("WebvttCueParser", sb.toString());
                }
            } catch (NumberFormatException unused) {
                zzeh.m6211c("WebvttCueParser", "Skipping bad cue setting: ".concat(String.valueOf(matcher.group())));
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0086  */
    /* JADX INFO: renamed from: d */
    public static void m4298d(String str, zzapg zzapgVar, List list, SpannableStringBuilder spannableStringBuilder, List list2) {
        byte b;
        int i2;
        int i3;
        int i4;
        int i5 = zzapgVar.f6385b;
        int length = spannableStringBuilder.length();
        String str2 = zzapgVar.f6384a;
        int iHashCode = str2.hashCode();
        int i6 = -1;
        if (iHashCode != 0) {
            if (iHashCode != 105) {
                if (iHashCode != 3314158) {
                    if (iHashCode != 3511770) {
                        if (iHashCode != 98) {
                            if (iHashCode != 99) {
                                if (iHashCode != 117) {
                                    if (iHashCode == 118 && str2.equals("v")) {
                                        b = 5;
                                    } else {
                                        b = -1;
                                    }
                                } else if (str2.equals("u")) {
                                    b = 3;
                                } else {
                                    b = -1;
                                }
                            } else if (str2.equals("c")) {
                                b = 4;
                            } else {
                                b = -1;
                            }
                        } else if (str2.equals("b")) {
                            b = 0;
                        } else {
                            b = -1;
                        }
                    } else if (str2.equals("ruby")) {
                        b = 2;
                    } else {
                        b = -1;
                    }
                } else if (str2.equals("lang")) {
                    b = 6;
                } else {
                    b = -1;
                }
            } else if (str2.equals("i")) {
                b = 1;
            } else {
                b = -1;
            }
        } else if (str2.equals("")) {
            b = 7;
        } else {
            b = -1;
        }
        switch (b) {
            case 0:
                spannableStringBuilder.setSpan(new StyleSpan(1), i5, length, 33);
                break;
            case 1:
                spannableStringBuilder.setSpan(new StyleSpan(2), i5, length, 33);
                break;
            case 2:
                int iM4299e = m4299e(list2, str, zzapgVar);
                ArrayList arrayList = new ArrayList(list.size());
                arrayList.addAll(list);
                Collections.sort(arrayList, zzapf.f6381c);
                int i7 = i5;
                int i8 = 0;
                int length2 = 0;
                while (i8 < arrayList.size()) {
                    if ("rt".equals(((zzapf) arrayList.get(i8)).f6382a.f6384a)) {
                        zzapf zzapfVar = (zzapf) arrayList.get(i8);
                        int iM4299e2 = m4299e(list2, str, zzapfVar.f6382a);
                        if (iM4299e2 == i6) {
                            iM4299e2 = iM4299e != i6 ? iM4299e : 1;
                        }
                        int i9 = zzapfVar.f6382a.f6385b - length2;
                        int i10 = zzapfVar.f6383b - length2;
                        CharSequence charSequenceSubSequence = spannableStringBuilder.subSequence(i9, i10);
                        spannableStringBuilder.delete(i9, i10);
                        spannableStringBuilder.setSpan(new zzdd(charSequenceSubSequence.toString(), iM4299e2), i7, i9, 33);
                        length2 += charSequenceSubSequence.length();
                        i7 = i9;
                    }
                    i8++;
                    i6 = -1;
                }
                break;
            case 3:
                spannableStringBuilder.setSpan(new UnderlineSpan(), i5, length, 33);
                break;
            case 4:
                for (String str3 : zzapgVar.f6387d) {
                    Map map = f6403c;
                    if (map.containsKey(str3)) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(((Integer) map.get(str3)).intValue()), i5, length, 33);
                    } else {
                        Map map2 = f6404d;
                        if (map2.containsKey(str3)) {
                            spannableStringBuilder.setSpan(new BackgroundColorSpan(((Integer) map2.get(str3)).intValue()), i5, length, 33);
                        }
                    }
                }
                break;
            case 5:
                spannableStringBuilder.setSpan(new zzdg(zzapgVar.f6386c), i5, length, 33);
                break;
            case 6:
            case 7:
                break;
            default:
                return;
        }
        ArrayList arrayListM4300f = m4300f(list2, str, zzapgVar);
        for (int i11 = 0; i11 < arrayListM4300f.size(); i11++) {
            zzapc zzapcVar = ((zzaph) arrayListM4300f.get(i11)).f6389t;
            int i12 = zzapcVar.f6371k;
            if (i12 == -1 && zzapcVar.f6372l == -1) {
                i2 = -1;
            } else {
                i2 = (zzapcVar.f6372l == 1 ? (char) 2 : (char) 0) | (i12 == 1 ? (char) 1 : (char) 0);
            }
            if (i2 != -1) {
                int i13 = zzapcVar.f6371k;
                if (i13 == -1 && zzapcVar.f6372l == -1) {
                    i4 = -1;
                    i3 = 1;
                } else {
                    i3 = 1;
                    i4 = (i13 == 1 ? 1 : 0) | (zzapcVar.f6372l == 1 ? 2 : 0);
                }
                zzde.m5906a(spannableStringBuilder, new StyleSpan(i4), i5, length);
            } else {
                i3 = 1;
            }
            if (zzapcVar.f6370j == i3) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i5, length, 33);
            }
            if (zzapcVar.f6367g) {
                if (!zzapcVar.f6367g) {
                    throw new IllegalStateException("Font color not defined");
                }
                zzde.m5906a(spannableStringBuilder, new ForegroundColorSpan(zzapcVar.f6366f), i5, length);
            }
            if (zzapcVar.f6369i) {
                if (!zzapcVar.f6369i) {
                    throw new IllegalStateException("Background color not defined.");
                }
                zzde.m5906a(spannableStringBuilder, new BackgroundColorSpan(zzapcVar.f6368h), i5, length);
            }
            if (zzapcVar.f6365e != null) {
                zzde.m5906a(spannableStringBuilder, new TypefaceSpan(zzapcVar.f6365e), i5, length);
            }
            int i14 = zzapcVar.f6373m;
            if (i14 == 1) {
                zzde.m5906a(spannableStringBuilder, new AbsoluteSizeSpan((int) zzapcVar.f6374n, true), i5, length);
            } else if (i14 == 2) {
                zzde.m5906a(spannableStringBuilder, new RelativeSizeSpan(zzapcVar.f6374n), i5, length);
            } else if (i14 == 3) {
                zzde.m5906a(spannableStringBuilder, new RelativeSizeSpan(zzapcVar.f6374n / 100.0f), i5, length);
            }
            if (zzapcVar.f6376p) {
                spannableStringBuilder.setSpan(new zzdc(), i5, length, 33);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public static int m4299e(List list, String str, zzapg zzapgVar) {
        ArrayList arrayListM4300f = m4300f(list, str, zzapgVar);
        for (int i2 = 0; i2 < arrayListM4300f.size(); i2++) {
            int i3 = ((zzaph) arrayListM4300f.get(i2)).f6389t.f6375o;
            if (i3 != -1) {
                return i3;
            }
        }
        return -1;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0041  */
    /* JADX INFO: renamed from: f */
    public static ArrayList m4300f(List list, String str, zzapg zzapgVar) {
        int size;
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            zzapc zzapcVar = (zzapc) list.get(i2);
            String str2 = zzapgVar.f6384a;
            Set set = zzapgVar.f6387d;
            String str3 = zzapgVar.f6386c;
            if (!zzapcVar.f6361a.isEmpty() || !zzapcVar.f6362b.isEmpty() || !zzapcVar.f6363c.isEmpty() || !zzapcVar.f6364d.isEmpty()) {
                int iM4293a = zzapc.m4293a(zzapc.m4293a(zzapc.m4293a(0, BasicMeasure.EXACTLY, zzapcVar.f6361a, str), 2, zzapcVar.f6362b, str2), 4, zzapcVar.f6364d, str3);
                if (iM4293a == -1 || !set.containsAll(zzapcVar.f6363c)) {
                    size = 0;
                } else {
                    size = iM4293a + (zzapcVar.f6363c.size() * 4);
                }
            } else if (TextUtils.isEmpty(str2)) {
                size = 1;
            } else {
                size = 0;
            }
            if (size > 0) {
                arrayList.add(new zzaph(size, zzapcVar));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }
}
