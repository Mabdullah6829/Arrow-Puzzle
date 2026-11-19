package com.instagram.common.viewpoint.core;

import android.text.TextUtils;
import androidx.constraintlayout.widget.C1137R;
import java.util.Arrays;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.KI */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C3117KI {
    public static byte[] A03;
    public static String[] A04 = {"", "Q0QXG7UXIASt6u", "Y6SVRxSvJsGy", "wBfOUWbjS5LHnahIVXYrmUjJKL6", "ipHEpqQaRUeTeVi", "GLcEQz2dRHwid1MPYevx9K5BLffqxfdD", "Wfr02cBS22Xusns9ZD5ofvGEf4mY", "O3Zlf7dyK7vHpITYdVNftiUJDGPL2j8I"};
    public static final AbstractC2569BO<String> A05;
    public static final AbstractC2569BO<String> A06;
    public static final AbstractC2569BO<String> A07;
    public static final AbstractC2569BO<String> A08;
    public static final Pattern A09;
    public final int A00;
    public final int A01;
    public final int A02;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:11:0x0042  */
    /* JADX WARN: Code duplicated, block: B:42:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:49:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:4:0x0020  */
    /* JADX WARN: Code duplicated, block: B:52:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:53:0x00f9  */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 13 out of bounds for length 10
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static C3117KI A00(AbstractC2569BO<String> abstractC2569BO) {
        byte b;
        int i2;
        byte b2;
        int i3;
        int i4;
        int i5;
        C2541Aw c2541AwA02 = AbstractC5087qj.A02(A07, abstractC2569BO);
        String strA02 = A02(41, 7, C1137R.styleable.ConstraintSet_stateLabels);
        String str = (String) AbstractC4987p2.A00(c2541AwA02, strA02);
        byte b3 = 2;
        byte b4 = 1;
        switch (str.hashCode()) {
            case -1392885889:
                if (!str.equals(A02(12, 6, 124))) {
                    b = -1;
                } else {
                    b = 2;
                }
                break;
            case -1106037339:
                if (!str.equals(strA02)) {
                    b = -1;
                } else {
                    b = 1;
                }
                break;
            case 92734940:
                if (!str.equals(A02(3, 5, 92))) {
                    b = -1;
                } else {
                    b = 0;
                }
                break;
            default:
                b = -1;
                break;
        }
        switch (b) {
            case 0:
                i2 = 2;
                break;
            case 1:
                i2 = -2;
                break;
            default:
                i2 = 1;
                break;
        }
        C2541Aw c2541AwA03 = AbstractC5087qj.A02(A08, abstractC2569BO);
        if (!c2541AwA03.isEmpty()) {
            String str2 = (String) c2541AwA03.iterator().next();
            switch (str2.hashCode()) {
                case 3005871:
                    if (!str2.equals(A02(8, 4, 55))) {
                        b4 = -1;
                    }
                    break;
                case 3387192:
                    if (!str2.equals(A02(33, 4, 110))) {
                        b4 = -1;
                    } else {
                        b4 = 0;
                    }
                    break;
                default:
                    b4 = -1;
                    break;
            }
            switch (b4) {
                case 0:
                    i5 = 0;
                    break;
                default:
                    i5 = -1;
                    break;
            }
            return new C3117KI(i5, 0, i2);
        }
        C2541Aw c2541AwA04 = AbstractC5087qj.A02(A05, abstractC2569BO);
        C2541Aw c2541AwA05 = AbstractC5087qj.A02(A06, abstractC2569BO);
        if (c2541AwA04.isEmpty() && c2541AwA05.isEmpty()) {
            return new C3117KI(-1, 0, i2);
        }
        String strA03 = A02(27, 6, 34);
        String str3 = (String) AbstractC4987p2.A00(c2541AwA04, strA03);
        switch (str3.hashCode()) {
            case -1274499742:
                if (!str3.equals(strA03)) {
                    b2 = -1;
                } else {
                    b2 = 1;
                }
                break;
            case 3417674:
                if (!str3.equals(A02(37, 4, 110))) {
                    b2 = -1;
                } else {
                    b2 = 0;
                }
                break;
            default:
                b2 = -1;
                break;
        }
        switch (b2) {
            case 0:
                i3 = 2;
                break;
            default:
                i3 = 1;
                break;
        }
        String strA04 = A02(18, 6, 126);
        String str4 = (String) AbstractC4987p2.A00(c2541AwA05, strA04);
        switch (str4.hashCode()) {
            case -1360216880:
                if (!str4.equals(strA04)) {
                    b3 = -1;
                }
                switch (b3) {
                    case 0:
                        i4 = 2;
                        break;
                    case 1:
                        i4 = 3;
                        break;
                    default:
                        i4 = 1;
                        break;
                }
                return new C3117KI(i4, i3, i2);
            case -905816648:
                String[] strArr = A04;
                if (strArr[1].length() == strArr[3].length()) {
                    throw new RuntimeException();
                }
                A04[2] = "eITMiFQvxpZW";
                if (str4.equals(A02(48, 6, 85))) {
                    b3 = 1;
                } else {
                    b3 = -1;
                }
                switch (b3) {
                    case 0:
                        i4 = 2;
                        break;
                    case 1:
                        i4 = 3;
                        break;
                    default:
                        i4 = 1;
                        break;
                }
                return new C3117KI(i4, i3, i2);
            case 99657:
                if (str4.equals(A02(24, 3, 110))) {
                    b3 = 0;
                } else {
                    b3 = -1;
                }
                switch (b3) {
                    case 0:
                        i4 = 2;
                        break;
                    case 1:
                        i4 = 3;
                        break;
                    default:
                        i4 = 1;
                        break;
                }
                return new C3117KI(i4, i3, i2);
            default:
                b3 = -1;
                switch (b3) {
                    case 0:
                        i4 = 2;
                        break;
                    case 1:
                        i4 = 3;
                        break;
                    default:
                        i4 = 1;
                        break;
                }
                return new C3117KI(i4, i3, i2);
        }
    }

    public static String A02(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 95);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A03 = new byte[]{56, 23, 79, 98, 101, 119, 102, 113, 9, 29, 28, 7, 65, 70, 69, 76, 81, 70, 66, 72, 83, 66, 77, 68, 85, 94, 69, 27, 20, 17, 17, 24, 25, 95, 94, 95, 84, 94, 65, 84, 95, 72, 82, 83, 84, 78, 67, 66, 121, 111, 121, 107, 103, 111};
    }

    static {
        A03();
        A09 = Pattern.compile(A02(0, 3, 59));
        A08 = AbstractC2569BO.A05(A02(8, 4, 55), A02(33, 4, 110));
        A06 = AbstractC2569BO.A06(A02(24, 3, 110), A02(48, 6, 85), A02(18, 6, 126));
        A05 = AbstractC2569BO.A05(A02(27, 6, 34), A02(37, 4, 110));
        A07 = AbstractC2569BO.A06(A02(3, 5, 92), A02(12, 6, 124), A02(41, 7, C1137R.styleable.ConstraintSet_stateLabels));
    }

    public C3117KI(int i2, int i3, int i4) {
        this.A01 = i2;
        this.A00 = i3;
        this.A02 = i4;
    }

    public static C3117KI A01(String str) {
        if (str == null) {
            return null;
        }
        String parsingValue = AbstractC4699k7.A01(str.trim());
        if (parsingValue.isEmpty()) {
            return null;
        }
        AbstractC2569BO abstractC2569BOA08 = AbstractC2569BO.A08(TextUtils.split(parsingValue, A09));
        String[] strArr = A04;
        if (strArr[1].length() == strArr[3].length()) {
            throw new RuntimeException();
        }
        A04[5] = "GSUJCg4XeXOvDUAO5uYW1LZcLl5OFxUg";
        return A00(abstractC2569BOA08);
    }
}
