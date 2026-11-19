package com.instagram.common.viewpoint.core;

import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import androidx.constraintlayout.widget.C1137R;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.KO */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC3123KO {
    public static byte[] A00;
    public static String[] A01 = {"KgPme38LEDVaM0D12Uwlfvq6nYMDVVkT", "a5g98XiYqimDBheiX8ybcf7PetcT8W7U", "dRcctykKkiCtpnpKZqpaePhb1Qg1PkeN", "6JMbAfNKE0NkFS9oLsx1Zln6Fen7GSJu", "0ohFdoD3UqF2FgjtvUgt7lzB", "HqtC3No697vYpZ7G6OCOOOlSljo", "Ih90XUpH", "6OUjWPhHhDm3iVNi78UT7lOYQX351vXz"};

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static C3121KM A00(C3121KM c3121km, Map<String, C3128KT> map) {
        while (c3121km != null) {
            C3128KT c3128ktA02 = A02(c3121km.A04, c3121km.A0H(), map);
            if (c3128ktA02 != null && c3128ktA02.A09() == 1) {
                return c3121km;
            }
            c3121km = c3121km.A03;
        }
        return null;
    }

    public static String A03(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        int i5 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A01;
            if (strArr[3].charAt(23) != strArr[0].charAt(23)) {
                throw new RuntimeException();
            }
            A01[6] = "lLmUOaES";
            if (i5 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 115);
            i5++;
        }
    }

    public static void A05() {
        if (A01[2].charAt(10) == 'x') {
            throw new RuntimeException();
        }
        String[] strArr = A01;
        strArr[1] = "BbbzftLMD2m3WHwPv0bAANWrbX2mWIyE";
        strArr[7] = "7lYjBODxVBmaGubq4OQdXtxLEf46a0ab";
        A00 = new byte[]{-117, -75, -78, -103, -40, -30, -62, -40, -30, 64, 88, 86, 93, 93, 86, 91, 84, 13, 95, 98, 79, 102, 65, 82, 101, 97, 13, 91, 92, 81, 82, 13, 100, 86, 97, 85, 92, 98, 97, 13, 82, 101, 78, 80, 97, 89, 102, 13, 92, 91, 82, 13, 97, 82, 101, 97, 13, 80, 85, 86, 89, 81, 27, -10, 22, 15, 14, -12, 7, 16, 6, 7, 20, -9, 22, 11, 14, 73, 14, -9, 74, 102, 30, 48, -6, -5, 75, 25};
    }

    static {
        A05();
    }

    public static C3121KM A01(C3121KM c3121km, Map<String, C3128KT> map) {
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(c3121km);
        while (!arrayDeque.isEmpty()) {
            C3121KM c3121km2 = (C3121KM) arrayDeque.pop();
            C3128KT c3128kt = c3121km2.A04;
            String[] strArrA0H = c3121km2.A0H();
            if (A01[6].length() != 8) {
                throw new RuntimeException();
            }
            A01[6] = "prCmMBcG";
            C3128KT c3128ktA02 = A02(c3128kt, strArrA0H, map);
            if (c3128ktA02 != null && c3128ktA02.A09() == 3) {
                return c3121km2;
            }
            for (int iA0C = c3121km2.A0C() - 1; iA0C >= 0; iA0C--) {
                arrayDeque.push(c3121km2.A0D(iA0C));
            }
        }
        return null;
    }

    public static C3128KT A02(C3128KT c3128kt, String[] strArr, Map<String, C3128KT> map) {
        int i2 = 0;
        if (c3128kt == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                C3128KT c3128kt2 = new C3128KT();
                int length = strArr.length;
                while (i2 < length) {
                    c3128kt2.A0O(map.get(strArr[i2]));
                    i2++;
                }
                return c3128kt2;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                String str = strArr[0];
                String[] strArr2 = A01;
                if (strArr2[1].charAt(10) != strArr2[7].charAt(10)) {
                    throw new RuntimeException();
                }
                A01[5] = "FXnyxRIFGSjHG1Q4pZ8iBycDDGv";
                return c3128kt.A0O(map.get(str));
            }
            if (strArr != null) {
                int length2 = strArr.length;
                if (A01[2].charAt(10) == 'x') {
                    throw new RuntimeException();
                }
                A01[5] = "6UN5UNrVzg6BSs5KXnnHYvLLh5S";
                if (length2 > 1) {
                    int length3 = strArr.length;
                    while (i2 < length3) {
                        C3128KT c3128kt3 = map.get(strArr[i2]);
                        if (A01[5].length() != 27) {
                            throw new RuntimeException();
                        }
                        A01[2] = "LBM9N0gh5w8sQTAl6eCIViVepwnbqV6U";
                        c3128kt.A0O(c3128kt3);
                        i2++;
                    }
                    return c3128kt;
                }
            }
        }
        return c3128kt;
    }

    public static String A04(String str) {
        String strA03 = A03(1, 2, 53);
        String strA04 = A03(0, 1, 14);
        String strReplaceAll = str.replaceAll(strA03, strA04);
        String out = A03(4, 5, 69);
        String strReplaceAll2 = strReplaceAll.replaceAll(out, strA04);
        String strA05 = A03(3, 1, 6);
        String strReplaceAll3 = strReplaceAll2.replaceAll(strA04, strA05);
        String out2 = A03(77, 11, 123);
        return strReplaceAll3.replaceAll(out2, strA05);
    }

    /* JADX WARN: Code duplicated, block: B:72:0x0174  */
    public static void A06(Spannable spannable, int i2, int i3, C3128KT c3128kt, C3121KM c3121km, Map<String, C3128KT> map, int i4) {
        C3121KM c3121kmA01;
        C3128KT c3128ktA02;
        int i5;
        int i6;
        int i7;
        if (c3128kt.A0A() != -1) {
            spannable.setSpan(new StyleSpan(c3128kt.A0A()), i2, i3, 33);
        }
        if (c3128kt.A0b()) {
            spannable.setSpan(new StrikethroughSpan(), i2, i3, 33);
        }
        if (c3128kt.A0c()) {
            spannable.setSpan(new UnderlineSpan(), i2, i3, 33);
        }
        if (c3128kt.A0a()) {
            AbstractC21223t.A00(spannable, new ForegroundColorSpan(c3128kt.A06()), i2, i3, 33);
        }
        boolean zA0Z = c3128kt.A0Z();
        if (A01[5].length() == 27) {
            A01[2] = "DOLHbyxdL1TIGmJ49PhqpcsDL7xIVQFO";
            if (zA0Z) {
                AbstractC21223t.A00(spannable, new BackgroundColorSpan(c3128kt.A05()), i2, i3, 33);
            }
            if (c3128kt.A0W() != null) {
                AbstractC21223t.A00(spannable, new TypefaceSpan(c3128kt.A0W()), i2, i3, 33);
            }
            if (c3128kt.A0D() != null) {
                C3117KI c3117ki = (C3117KI) AbstractC21273y.A01(c3128kt.A0D());
                if (c3117ki.A01 == -1) {
                    String[] strArr = A01;
                    if (strArr[1].charAt(10) == strArr[7].charAt(10)) {
                        A01[5] = "2MSbzH5cEcM3iPzp1Bk7CXgbIPr";
                        if (i4 == 2 || i4 == 1) {
                            i5 = 3;
                        } else {
                            i5 = 1;
                        }
                        i6 = 1;
                    }
                } else {
                    i5 = c3117ki.A01;
                    i6 = c3117ki.A00;
                }
                if (c3117ki.A02 == -2) {
                    i7 = 1;
                } else {
                    i7 = c3117ki.A02;
                }
                AbstractC21223t.A00(spannable, new C5009pO(i5, i6, i7), i2, i3, 33);
            }
            switch (c3128kt.A09()) {
                case 2:
                    C3121KM c3121kmA00 = A00(c3121km, map);
                    if (c3121kmA00 != null && (c3121kmA01 = A01(c3121kmA00, map)) != null) {
                        if (c3121kmA01.A0C() != 1) {
                            AbstractC21714g.A06(A03(63, 14, 47), A03(9, 54, C1137R.styleable.ConstraintSet_transitionPathRotate));
                        } else {
                            C3121KM containerNode = c3121kmA01.A0D(0);
                            if (containerNode.A08 != null) {
                                C3121KM containerNode2 = c3121kmA01.A0D(0);
                                String str = (String) AbstractC22035C.A0f(containerNode2.A08);
                                C3128KT c3128ktA03 = A02(c3121kmA01.A04, c3121kmA01.A0H(), map);
                                int iA08 = c3128ktA03 != null ? c3128ktA03.A08() : -1;
                                if (iA08 == -1 && (c3128ktA02 = A02(c3121kmA00.A04, c3121kmA00.A0H(), map)) != null) {
                                    iA08 = c3128ktA02.A08();
                                }
                                spannable.setSpan(new C5010pP(str, iA08), i2, i3, 33);
                            } else {
                                AbstractC21714g.A06(A03(63, 14, 47), A03(9, 54, C1137R.styleable.ConstraintSet_transitionPathRotate));
                            }
                        }
                    }
                    break;
                case 3:
                case 4:
                    spannable.setSpan(new C3114KF(), i2, i3, 33);
                    break;
            }
            if (c3128kt.A0Y()) {
                AbstractC21223t.A00(spannable, new C5011pQ(), i2, i3, 33);
            }
            switch (c3128kt.A07()) {
                case 1:
                    AbstractC21223t.A00(spannable, new AbsoluteSizeSpan((int) c3128kt.A03(), true), i2, i3, 33);
                    return;
                case 2:
                    AbstractC21223t.A00(spannable, new RelativeSizeSpan(c3128kt.A03()), i2, i3, 33);
                    return;
                case 3:
                    AbstractC21223t.A00(spannable, new RelativeSizeSpan(c3128kt.A03() / 100.0f), i2, i3, 33);
                    return;
                default:
                    return;
            }
        }
        throw new RuntimeException();
    }

    public static void A07(SpannableStringBuilder spannableStringBuilder) {
        int length = spannableStringBuilder.length() - 1;
        while (length >= 0 && spannableStringBuilder.charAt(length) == ' ') {
            length--;
        }
        if (length >= 0 && spannableStringBuilder.charAt(length) != '\n') {
            spannableStringBuilder.append('\n');
        }
    }
}
