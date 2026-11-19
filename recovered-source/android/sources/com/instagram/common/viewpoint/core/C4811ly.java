package com.instagram.common.viewpoint.core;

import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ly */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C4811ly extends AbstractC3074Jb {
    public static String[] A02 = {"WZkrugZ9k", "x4SWtznAL", "HpTT9hwXiF", "GejxPsVIqdMqn4uNSueU2CvK5QdcE", "kY6PJZpIMUpeuimCFjYxSQzMMPc04", "AyPx1MENxNPCbM7HZGi1kOnAmMtkHxm9", "mMmHuZ9NaaUgibHMJoRcA4q0AdWca5ys", "Hii3DdXYVzyt8ReiNrO7wglp0i"};
    public C2933HJ A00;
    public C4812lz A01;

    private int A00(C21864v c21864v) {
        int i2 = (c21864v.A0l()[2] & 255) >> 4;
        if (i2 == 6 || i2 == 7) {
            c21864v.A0g(4);
            String[] strArr = A02;
            String str = strArr[6];
            String str2 = strArr[5];
            int iCharAt = str.charAt(19);
            int blockSizeKey = str2.charAt(19);
            if (iCharAt == blockSizeKey) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[1] = "Cisj8wK8S";
            strArr2[0] = "koTyuZ08X";
            c21864v.A0S();
        }
        int result = AbstractC2929HF.A00(c21864v, i2);
        c21864v.A0f(0);
        return result;
    }

    public static boolean A01(C21864v c21864v) {
        return c21864v.A07() >= 5 && c21864v.A0I() == 127 && c21864v.A0Q() == 1179402563;
    }

    public static boolean A02(byte[] bArr) {
        return bArr[0] == -1;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3074Jb
    public final long A09(C21864v c21864v) {
        if (!A02(c21864v.A0l())) {
            return -1L;
        }
        return A00(c21864v);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3074Jb
    public final void A0B(boolean z) {
        super.A0B(z);
        if (z) {
            this.A00 = null;
            this.A01 = null;
        }
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3074Jb
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    public final boolean A0C(C21864v c21864v, long j2, C3073Ja c3073Ja) {
        byte[] bArrA0l = c21864v.A0l();
        C2933HJ c2933hj = this.A00;
        if (c2933hj == null) {
            C2933HJ c2933hj2 = new C2933HJ(bArrA0l, 17);
            this.A00 = c2933hj2;
            c3073Ja.A00 = c2933hj2.A08(Arrays.copyOfRange(bArrA0l, 9, c21864v.A0A()), null);
            return true;
        }
        if ((bArrA0l[0] & 127) == 3) {
            C2932HI c2932hiA03 = AbstractC2931HH.A03(c21864v);
            C2933HJ streamMetadata = c2933hj.A09(c2932hiA03);
            this.A00 = streamMetadata;
            this.A01 = new C4812lz(streamMetadata, c2932hiA03);
            return true;
        }
        if (!A02(bArrA0l)) {
            return true;
        }
        if (this.A01 != null) {
            this.A01.A00(j2);
            c3073Ja.A01 = this.A01;
        }
        C5064qI c5064qI = c3073Ja.A00;
        String[] strArr = A02;
        if (strArr[4].length() == strArr[7].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A02;
        strArr2[3] = "zwTfeKiQLRobCpiZaAgtU0oyP8s29";
        strArr2[2] = "wrCWS6iAkk";
        AbstractC21273y.A01(c5064qI);
        return false;
    }
}
