package com.instagram.common.viewpoint.core;

import android.content.Intent;
import android.os.Build;
import android.widget.RelativeLayout;
import androidx.constraintlayout.widget.C1137R;
import androidx.core.view.ViewCompat;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Rj */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C3573Rj {
    public static byte[] A04;
    public static String[] A05 = {"MJXAzUwyiLvMzZCrP1QJf8uMs9b", "sHuNTXgsBnW3HGqskl7KH5QkikNWpABj", "q8u9vKEVkpk3dMxroB1EFzM5kwDKfJOq", "eyGwnlQBA4bCraIcft5FxvFgN7f8TC5N", "FmmRYKiwjJl3dX1FB2pV6kIWJpsNLC6h", "flBitaWG3wpDSjkerYNuTkR3r5UhRox3", "xkUQOvOGGj42jMnQjSDdoLzQvdQiYUba", "XqZ9VL6XKZ5Y"};
    public final Intent A00;
    public final C3568Re A01;
    public final C4494gi A02;
    public final InterfaceC3784VA A03;

    public static String A0K(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 59);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0L() {
        A04 = new byte[]{99, 127, 4, 1, 58, 1, 4, 17, 4, 58, 7, 16, 11, 1, 9, 0, 43, 41, 36, 36, 45, 58, 28, 49, 56, 45, 119, 124, 117, 125, 122, 113, 112, 85, 112, 80, 117, 96, 117, 86, 97, 122, 112, 120, 113, 35, 44, 41, 49, 32, 55, 32, 33, 26, 38, 41, 44, 38, 46, 26, 33, 32, 41, 36, 60, 26, 40, 54, 123, 97, 77, 100, 32, 77, 118, 119, 97, 123, 117, 124, 116, 123, 110, 115, 108, 127, 91, 126, 94, 123, 110, 123, 88, 111, 116, 126, 118, 127, 32, 55, 37, 51, 32, 54, 55, 54, 4, 59, 54, 55, 61, 19, 54, 22, 51, 38, 51, 16, 39, 60, 54, 62, 55, 22, 9, 4, 5, 15, 63, 20, 9, 13, 5, 63, 16, 15, 12, 12, 9, 14, 7, 63, 9, 14, 20, 5, 18, 22, 1, 12};
    }

    static {
        A0L();
    }

    public C3573Rj(C3568Re c3568Re, Intent intent, InterfaceC3784VA interfaceC3784VA, C4494gi c4494gi) {
        this.A01 = c3568Re;
        this.A00 = intent;
        this.A03 = interfaceC3784VA;
        this.A02 = c4494gi;
    }

    private AbstractC4669jd A00() {
        int i2 = Build.VERSION.SDK_INT;
        String strA0K = A0K(80, 18, 33);
        if (i2 >= 33) {
            return (AbstractC4669jd) this.A00.getSerializableExtra(strA0K, AbstractC4669jd.class);
        }
        Intent intent = this.A00;
        String[] strArr = A05;
        if (strArr[6].charAt(13) != strArr[2].charAt(13)) {
            throw new RuntimeException();
        }
        A05[1] = "LmjecX6z1NXmevkMdudhCsYVgseeBlBL";
        return (AbstractC4669jd) intent.getSerializableExtra(strA0K);
    }

    private C4661jT A01() {
        int i2 = Build.VERSION.SDK_INT;
        String strA0K = A0K(26, 19, 47);
        if (i2 >= 33) {
            return (C4661jT) this.A00.getSerializableExtra(strA0K, C4661jT.class);
        }
        return (C4661jT) this.A00.getSerializableExtra(strA0K);
    }

    private C23647n A02() {
        int i2 = Build.VERSION.SDK_INT;
        String strA0K = A0K(2, 14, 94);
        if (i2 >= 33) {
            return (C23647n) this.A00.getSerializableExtra(strA0K, C23647n.class);
        }
        return (C23647n) this.A00.getSerializableExtra(strA0K);
    }

    private C23627l A03() {
        int i2 = Build.VERSION.SDK_INT;
        String strA0K = A0K(98, 25, 105);
        if (i2 >= 33) {
            return (C23627l) this.A00.getSerializableExtra(strA0K, C23627l.class);
        }
        return (C23627l) this.A00.getSerializableExtra(strA0K);
    }

    private InterfaceC3999Yi A05() {
        boolean booleanExtra = this.A00.getBooleanExtra(A0K(68, 12, 41), false);
        boolean isV2Design = C3763Up.A2w(this.A02);
        if (isV2Design) {
            String stringExtra = this.A00.getStringExtra(A0K(45, 23, 126));
            C3568Re c3568Re = this.A01;
            C4494gi c4494gi = this.A02;
            InterfaceC3784VA interfaceC3784VA = this.A03;
            C4540hS c4540hS = new C4540hS(this.A01);
            String stringExtra2 = this.A00.getStringExtra(A0K(16, 10, 115));
            if (stringExtra == null) {
                stringExtra = A0K(0, 2, C1137R.styleable.ConstraintSet_pivotAnchor);
            }
            int i2 = Integer.parseInt(stringExtra);
            String clickDelayMs = A05[5];
            if (clickDelayMs.charAt(3) != 'i') {
                throw new RuntimeException();
            }
            A05[4] = "YY09SF1W0j6b6KfCSgRusx8TJPca7HgC";
            return new ViewOnClickListenerC23126x(c3568Re, c4494gi, interfaceC3784VA, c4540hS, stringExtra2, i2);
        }
        return new C3441PZ(this.A01, this.A02, this.A03, new C4540hS(this.A01), booleanExtra);
    }

    private InterfaceC3999Yi A06() {
        C23647n c23647nA02 = A02();
        if (c23647nA02 == null) {
            return null;
        }
        return A08(new C232277(this.A01), c23647nA02, c23647nA02.A1G(), new C3240MH());
    }

    private InterfaceC3999Yi A07() {
        C23627l c23627lA03 = A03();
        if (c23627lA03 == null) {
            return null;
        }
        return A08(new C232277(this.A01), c23627lA03, c23627lA03.A1G(), new C3239MG());
    }

    private InterfaceC3999Yi A08(InterfaceC3998Yh interfaceC3998Yh, AbstractC4669jd abstractC4669jd, String str, InterfaceC4047ZU interfaceC4047ZU) {
        if (abstractC4669jd.A29().A0H().A07() != null) {
            C3334No c3334NoA07 = abstractC4669jd.A29().A0H().A07();
            if (abstractC4669jd.A1n()) {
                return new C3255MW(this.A02, this.A03, interfaceC3998Yh, abstractC4669jd, c3334NoA07, str, interfaceC4047ZU);
            }
            return new C3308NO(this.A02, this.A03, interfaceC3998Yh, abstractC4669jd, str, interfaceC4047ZU);
        }
        interfaceC3998Yh.A4j(interfaceC4047ZU.A81());
        interfaceC3998Yh.A4j(interfaceC4047ZU.A7w());
        return null;
    }

    private AbstractC3426PJ A09(EnumC3854WK enumC3854WK) {
        AbstractC4669jd abstractC4669jdA02;
        if (enumC3854WK == EnumC3854WK.A0G) {
            abstractC4669jdA02 = A03();
            String[] strArr = A05;
            if (strArr[6].charAt(13) != strArr[2].charAt(13)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A05;
            strArr2[6] = "BHjTvXd0Vicw2MzqRZQvpavg35ntNS6w";
            strArr2[2] = "NWBwsXtlP0iXXM4o1NBUiSzzY7vvtUxs";
            if (abstractC4669jdA02 == null) {
                return null;
            }
        } else if (enumC3854WK != EnumC3854WK.A0A || (abstractC4669jdA02 = A02()) == null) {
            return null;
        }
        abstractC4669jdA02.A1L(this.A01.A08());
        if (abstractC4669jdA02.A1a()) {
            return new C21594U(this.A02, this.A03, new C3648Sx(this.A02), new C4540hS(this.A01), abstractC4669jdA02);
        }
        return new C21584T(this.A02, this.A03, new C3648Sx(this.A02), new C4540hS(this.A01), abstractC4669jdA02);
    }

    private final C3252MT A0A() {
        return new C3252MT(this.A02, this.A01);
    }

    private C3241MI A0B(RelativeLayout relativeLayout) {
        C3241MI c3241mi = new C3241MI(this.A02, new C4539hR(this), this.A03, new C4540hS(this.A01));
        c3241mi.A05(relativeLayout);
        c3241mi.A04(this.A00.getIntExtra(A0K(123, 27, 91), 200));
        AbstractC3966YB.A0N(relativeLayout, ViewCompat.MEASURED_STATE_MASK);
        return c3241mi;
    }

    private C225966 A0C() {
        C23647n c23647nA02 = A02();
        if (c23647nA02 == null) {
            return null;
        }
        return new C225966(this.A02, this.A03, new C4540hS(this.A01), c23647nA02, new C3240MH(), 1);
    }

    private C225966 A0D() {
        C23627l c23627lA03 = A03();
        if (c23627lA03 == null) {
            return null;
        }
        return new C225966(this.A02, this.A03, new C4540hS(this.A01), c23627lA03, new C3239MG(), 0);
    }

    private C3050JD A0E() {
        C4277dC c4277dCA02;
        AbstractC4669jd abstractC4669jdA00 = A00();
        if (abstractC4669jdA00 == null || (c4277dCA02 = AbstractC4278dD.A02(abstractC4669jdA00.A1D())) == null) {
            return null;
        }
        return new C3050JD(this.A02, new C4540hS(this.A01), c4277dCA02, abstractC4669jdA00.A2E());
    }

    private C2892Ge A0F(EnumC3854WK enumC3854WK) {
        InterfaceC4047ZU c3239mg;
        InterfaceC3998Yh c232277;
        C4661jT c4661jTA01 = A01();
        if (c4661jTA01 == null) {
            return null;
        }
        if (enumC3854WK == EnumC3854WK.A04) {
            c3239mg = new C3240MH();
            c232277 = new C4540hS(this.A01);
        } else {
            c3239mg = new C3239MG();
            c232277 = new C232277(this.A01);
        }
        return new C2892Ge(this.A02, c3239mg, this.A03, c4661jTA01, new C3648Sx(this.A02), c232277);
    }

    private C21884x A0G() {
        C23647n c23647nA02 = A02();
        if (c23647nA02 != null) {
            return new C21884x(this.A02, new C3240MH(), this.A03, c23647nA02, new C3648Sx(this.A02), new C4540hS(this.A01));
        }
        if (A05[1].charAt(5) != 'X') {
            throw new RuntimeException();
        }
        A05[3] = "TvLwsmu9uaa0faVP4fF8b7PGg31O8U7I";
        return null;
    }

    private C21604V A0H() {
        C23647n c23647nA02 = A02();
        if (c23647nA02 == null) {
            return null;
        }
        return new C21604V(this.A02, new C3240MH(), this.A03, c23647nA02, new C3648Sx(this.A02), new C4540hS(this.A01));
    }

    private C21604V A0I() {
        C23627l c23627lA03 = A03();
        if (c23627lA03 == null) {
            return null;
        }
        return new C21604V(this.A02, new C3239MG(), this.A03, c23627lA03, new C3648Sx(this.A02), new C232277(this.A01));
    }

    private C2863GB A0J(EnumC3854WK enumC3854WK) {
        AbstractC4669jd abstractC4669jdA02;
        AbstractC4669jd abstractC4669jdA03;
        if (enumC3854WK == EnumC3854WK.A0J) {
            abstractC4669jdA02 = A03();
            if (abstractC4669jdA02 == null || (abstractC4669jdA03 = A03()) == null) {
                return null;
            }
        } else if (enumC3854WK != EnumC3854WK.A0E || (abstractC4669jdA02 = A02()) == null || (abstractC4669jdA03 = A02()) == null) {
            return null;
        }
        return new C2863GB(this.A02, this.A03, abstractC4669jdA02, abstractC4669jdA03, new C232277(this.A01), this.A01, enumC3854WK);
    }

    public final InterfaceC3999Yi A0M(EnumC3854WK enumC3854WK, RelativeLayout relativeLayout) {
        if (enumC3854WK == null) {
            return null;
        }
        switch (C3572Ri.A00[enumC3854WK.ordinal()]) {
            case 1:
                if (relativeLayout != null) {
                    return A0B(relativeLayout);
                }
                return null;
            case 2:
            case 3:
                return A09(enumC3854WK);
            case 4:
                return A0I();
            case 5:
                return A07();
            case 6:
                InterfaceC3999Yi interfaceC3999YiA05 = A05();
                if (A05[4].charAt(13) != '3') {
                    A05[1] = "IIJ0HXviRARge0yizoGTY0JUA2Nzjczv";
                    return interfaceC3999YiA05;
                }
                String[] strArr = A05;
                strArr[6] = "UHMFNKnwuKHYyMbevaCPtufG1H9dhH1t";
                strArr[2] = "s6UgSHR7PtydXMVItCKPjBxPhDp7nABU";
                return interfaceC3999YiA05;
            case 7:
                return A0H();
            case 8:
                return A0G();
            case 9:
                return A06();
            case 10:
                return A0E();
            case 11:
                C225966 c225966A0C = A0C();
                if (A05[5].charAt(3) != 'i') {
                    throw new RuntimeException();
                }
                A05[3] = "7AQwH6OZkLua7JLoKEhUfmskdEmJStMK";
                return c225966A0C;
            case 12:
                return A0D();
            case 13:
            case 14:
                return A0F(enumC3854WK);
            case 15:
                return A0A();
            case 16:
            case 17:
                return A0J(enumC3854WK);
            default:
                return null;
        }
    }
}
