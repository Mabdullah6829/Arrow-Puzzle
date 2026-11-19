package com.google.android.gms.internal.ads;

import android.graphics.Color;
import android.text.TextUtils;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.InputDeviceCompat;
import androidx.core.view.ViewCompat;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class zzds {

    /* JADX INFO: renamed from: a */
    public static final Pattern f12769a = Pattern.compile("^rgb\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");

    /* JADX INFO: renamed from: b */
    public static final Pattern f12770b = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");

    /* JADX INFO: renamed from: c */
    public static final Pattern f12771c = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d*\\.?\\d*?)\\)$");

    /* JADX INFO: renamed from: d */
    public static final HashMap f12772d;

    static {
        HashMap map = new HashMap();
        f12772d = map;
        AbstractC5152f.m3773e(-984833, map, "aliceblue", -332841, "antiquewhite");
        map.put("aqua", -16711681);
        map.put("aquamarine", -8388652);
        AbstractC5152f.m3773e(-983041, map, "azure", -657956, "beige");
        AbstractC5152f.m3773e(-6972, map, "bisque", ViewCompat.MEASURED_STATE_MASK, "black");
        AbstractC5152f.m3773e(-5171, map, "blanchedalmond", -16776961, "blue");
        AbstractC5152f.m3773e(-7722014, map, "blueviolet", -5952982, "brown");
        AbstractC5152f.m3773e(-2180985, map, "burlywood", -10510688, "cadetblue");
        AbstractC5152f.m3773e(-8388864, map, "chartreuse", -2987746, "chocolate");
        AbstractC5152f.m3773e(-32944, map, "coral", -10185235, "cornflowerblue");
        AbstractC5152f.m3773e(-1828, map, "cornsilk", -2354116, "crimson");
        map.put("cyan", -16711681);
        map.put("darkblue", -16777077);
        AbstractC5152f.m3773e(-16741493, map, "darkcyan", -4684277, "darkgoldenrod");
        map.put("darkgray", -5658199);
        map.put("darkgreen", -16751616);
        map.put("darkgrey", -5658199);
        map.put("darkkhaki", -4343957);
        AbstractC5152f.m3773e(-7667573, map, "darkmagenta", -11179217, "darkolivegreen");
        AbstractC5152f.m3773e(-29696, map, "darkorange", -6737204, "darkorchid");
        AbstractC5152f.m3773e(-7667712, map, "darkred", -1468806, "darksalmon");
        AbstractC5152f.m3773e(-7357297, map, "darkseagreen", -12042869, "darkslateblue");
        map.put("darkslategray", -13676721);
        map.put("darkslategrey", -13676721);
        map.put("darkturquoise", -16724271);
        map.put("darkviolet", -7077677);
        AbstractC5152f.m3773e(-60269, map, "deeppink", -16728065, "deepskyblue");
        map.put("dimgray", -9868951);
        map.put("dimgrey", -9868951);
        map.put("dodgerblue", -14774017);
        map.put("firebrick", -5103070);
        AbstractC5152f.m3773e(-1296, map, "floralwhite", -14513374, "forestgreen");
        map.put("fuchsia", -65281);
        map.put("gainsboro", -2302756);
        AbstractC5152f.m3773e(-460545, map, "ghostwhite", -10496, "gold");
        map.put("goldenrod", -2448096);
        map.put("gray", -8355712);
        AbstractC5152f.m3773e(-16744448, map, "green", -5374161, "greenyellow");
        map.put("grey", -8355712);
        map.put("honeydew", -983056);
        AbstractC5152f.m3773e(-38476, map, "hotpink", -3318692, "indianred");
        AbstractC5152f.m3773e(-11861886, map, "indigo", -16, "ivory");
        AbstractC5152f.m3773e(-989556, map, "khaki", -1644806, "lavender");
        AbstractC5152f.m3773e(-3851, map, "lavenderblush", -8586240, "lawngreen");
        AbstractC5152f.m3773e(-1331, map, "lemonchiffon", -5383962, "lightblue");
        AbstractC5152f.m3773e(-1015680, map, "lightcoral", -2031617, "lightcyan");
        map.put("lightgoldenrodyellow", -329006);
        map.put("lightgray", -2894893);
        map.put("lightgreen", -7278960);
        map.put("lightgrey", -2894893);
        AbstractC5152f.m3773e(-18751, map, "lightpink", -24454, "lightsalmon");
        AbstractC5152f.m3773e(-14634326, map, "lightseagreen", -7876870, "lightskyblue");
        map.put("lightslategray", -8943463);
        map.put("lightslategrey", -8943463);
        map.put("lightsteelblue", -5192482);
        map.put("lightyellow", -32);
        AbstractC5152f.m3773e(-16711936, map, "lime", -13447886, "limegreen");
        map.put("linen", -331546);
        map.put("magenta", -65281);
        AbstractC5152f.m3773e(-8388608, map, "maroon", -10039894, "mediumaquamarine");
        AbstractC5152f.m3773e(-16777011, map, "mediumblue", -4565549, "mediumorchid");
        AbstractC5152f.m3773e(-7114533, map, "mediumpurple", -12799119, "mediumseagreen");
        AbstractC5152f.m3773e(-8689426, map, "mediumslateblue", -16713062, "mediumspringgreen");
        AbstractC5152f.m3773e(-12004916, map, "mediumturquoise", -3730043, "mediumvioletred");
        AbstractC5152f.m3773e(-15132304, map, "midnightblue", -655366, "mintcream");
        AbstractC5152f.m3773e(-6943, map, "mistyrose", -6987, "moccasin");
        AbstractC5152f.m3773e(-8531, map, "navajowhite", -16777088, "navy");
        AbstractC5152f.m3773e(-133658, map, "oldlace", -8355840, "olive");
        AbstractC5152f.m3773e(-9728477, map, "olivedrab", -23296, "orange");
        AbstractC5152f.m3773e(-47872, map, "orangered", -2461482, "orchid");
        AbstractC5152f.m3773e(-1120086, map, "palegoldenrod", -6751336, "palegreen");
        AbstractC5152f.m3773e(-5247250, map, "paleturquoise", -2396013, "palevioletred");
        AbstractC5152f.m3773e(-4139, map, "papayawhip", -9543, "peachpuff");
        AbstractC5152f.m3773e(-3308225, map, "peru", -16181, "pink");
        AbstractC5152f.m3773e(-2252579, map, "plum", -5185306, "powderblue");
        AbstractC5152f.m3773e(-8388480, map, "purple", -10079335, "rebeccapurple");
        AbstractC5152f.m3773e(SupportMenu.CATEGORY_MASK, map, "red", -4419697, "rosybrown");
        AbstractC5152f.m3773e(-12490271, map, "royalblue", -7650029, "saddlebrown");
        AbstractC5152f.m3773e(-360334, map, "salmon", -744352, "sandybrown");
        AbstractC5152f.m3773e(-13726889, map, "seagreen", -2578, "seashell");
        AbstractC5152f.m3773e(-6270419, map, "sienna", -4144960, "silver");
        AbstractC5152f.m3773e(-7876885, map, "skyblue", -9807155, "slateblue");
        map.put("slategray", -9404272);
        map.put("slategrey", -9404272);
        map.put("snow", -1286);
        map.put("springgreen", -16711809);
        AbstractC5152f.m3773e(-12156236, map, "steelblue", -2968436, "tan");
        AbstractC5152f.m3773e(-16744320, map, "teal", -2572328, "thistle");
        AbstractC5152f.m3773e(-40121, map, "tomato", 0, "transparent");
        AbstractC5152f.m3773e(-12525360, map, "turquoise", -1146130, "violet");
        AbstractC5152f.m3773e(-663885, map, "wheat", -1, "white");
        AbstractC5152f.m3773e(-657931, map, "whitesmoke", InputDeviceCompat.SOURCE_ANY, "yellow");
        map.put("yellowgreen", -6632142);
    }

    /* JADX INFO: renamed from: a */
    public static int m6043a(String str, boolean z) {
        int i2;
        zzgtr.m7128a(!TextUtils.isEmpty(str));
        String strReplace = str.replace(" ", "");
        if (strReplace.charAt(0) == '#') {
            int i3 = (int) Long.parseLong(strReplace.substring(1), 16);
            if (strReplace.length() == 7) {
                return (-16777216) | i3;
            }
            if (strReplace.length() == 9) {
                return ((i3 & 255) << 24) | (i3 >>> 8);
            }
            throw new IllegalArgumentException();
        }
        if (strReplace.startsWith("rgba")) {
            Matcher matcher = (z ? f12771c : f12770b).matcher(strReplace);
            if (matcher.matches()) {
                if (z) {
                    String strGroup = matcher.group(4);
                    strGroup.getClass();
                    i2 = (int) (Float.parseFloat(strGroup) * 255.0f);
                } else {
                    String strGroup2 = matcher.group(4);
                    strGroup2.getClass();
                    i2 = Integer.parseInt(strGroup2, 10);
                }
                String strGroup3 = matcher.group(1);
                strGroup3.getClass();
                int i4 = Integer.parseInt(strGroup3, 10);
                String strGroup4 = matcher.group(2);
                strGroup4.getClass();
                int i5 = Integer.parseInt(strGroup4, 10);
                String strGroup5 = matcher.group(3);
                strGroup5.getClass();
                return Color.argb(i2, i4, i5, Integer.parseInt(strGroup5, 10));
            }
        } else if (strReplace.startsWith("rgb")) {
            Matcher matcher2 = f12769a.matcher(strReplace);
            if (matcher2.matches()) {
                String strGroup6 = matcher2.group(1);
                strGroup6.getClass();
                int i6 = Integer.parseInt(strGroup6, 10);
                String strGroup7 = matcher2.group(2);
                strGroup7.getClass();
                int i7 = Integer.parseInt(strGroup7, 10);
                String strGroup8 = matcher2.group(3);
                strGroup8.getClass();
                return Color.rgb(i6, i7, Integer.parseInt(strGroup8, 10));
            }
        } else {
            Integer num = (Integer) f12772d.get(zzgsz.m7119a(strReplace));
            if (num != null) {
                return num.intValue();
            }
        }
        throw new IllegalArgumentException();
    }
}
