package com.instagram.common.viewpoint.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.V1 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C3775V1 {
    public static String[] A04 = {"VndfGBIDInq1AmGKWEXIYtH", "X1ufgR44W1Z84U", "n", "", "za8Aa", "xjBfTCMiG1bFh7NB9hwMlLVXQHNbTqdl", "vkDSrNK7CnANJUjGZxXcCXY", "njWPP"};
    public EnumC3772Uy A01 = EnumC3772Uy.A03;
    public EnumC3773Uz A02 = EnumC3773Uz.A06;
    public EnumC3774V0 A03 = EnumC3774V0.A02;
    public EnumC3771Ux A00 = EnumC3771Ux.A02;

    public final void A00() {
        this.A00 = EnumC3771Ux.A03;
    }

    public final void A01() {
        this.A02 = EnumC3773Uz.A04;
    }

    public final void A02() {
        this.A02 = EnumC3773Uz.A05;
    }

    public final void A03() {
        this.A03 = EnumC3774V0.A03;
    }

    public final boolean A04() {
        if (this.A02 != EnumC3773Uz.A06) {
            EnumC3773Uz enumC3773Uz = this.A02;
            String[] strArr = A04;
            if (strArr[6].length() != strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A04;
            strArr2[6] = "r152EQyYeE04Ovy9QYMfnLx";
            strArr2[0] = "I6yTYbMajK96Zgvn6mn7gLC";
            if (enumC3773Uz != EnumC3773Uz.A02 && this.A02 != EnumC3773Uz.A05) {
                return false;
            }
        }
        return true;
    }

    public final boolean A05() {
        return this.A02 == EnumC3773Uz.A06 || this.A02 == EnumC3773Uz.A02;
    }

    public final boolean A06() {
        return this.A03 == EnumC3774V0.A03;
    }

    public final boolean A07() {
        return this.A00 == EnumC3771Ux.A03;
    }
}
