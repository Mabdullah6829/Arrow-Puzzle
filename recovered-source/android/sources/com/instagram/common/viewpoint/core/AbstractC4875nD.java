package com.instagram.common.viewpoint.core;

import android.util.Pair;
import com.facebook.ads.androidx.media3.common.Timeline;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.nD */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC4875nD extends AbstractC2787Ew {
    public static String[] A01 = {"LN1kZ6lR3vZBqqrviA4uTSOzBGS9o2bO", "mUQPITaRnEXTrG2Wr7xIAnPzPHhU6DS3", "avW0I4bwWNzzQZleeOInYpLZY9PTle7", "LGUT8ZIo3joumZn9NybI7JCchk0DSCTG", "S4WFRdtC0lcE2afHWARgiwpUU5tNPmtd", "SbOYlLigHNVPkFHrMvYK7wwtNeL", "2fmBOvz22OTh8nUuYBKjoVDFU", "lR30iWlIbuozJgbVtB9O9DOed4NJenPq"};
    public C2779Eo A00;

    public abstract Pair<C23697s[], InterfaceC4876nE[]> A0d(C2779Eo c2779Eo, int[][][] iArr, int[] iArr2, C4912no c4912no, Timeline timeline) throws C2496AD;

    public static int A0Y(InterfaceC23667p[] interfaceC23667pArr, C5027pg c5027pg, int[] iArr, boolean z) throws C2496AD {
        int length = interfaceC23667pArr.length;
        int formatSupportLevel = 0;
        int i2 = 1;
        for (int i3 = 0; i3 < bestRendererIndex; i3++) {
            InterfaceC23667p interfaceC23667p = interfaceC23667pArr[i3];
            int iMax = 0;
            for (int bestFormatSupportLevel = 0; bestFormatSupportLevel < bestRendererIndex; bestFormatSupportLevel++) {
                int bestRendererIndex = interfaceC23667p.AKM(c5027pg.A08(bestFormatSupportLevel));
                iMax = Math.max(iMax, AbstractC23597i.A03(bestRendererIndex));
            }
            int bestRendererIndex2 = iArr[i3];
            int bestRendererIndex3 = bestRendererIndex2 == 0 ? 1 : 0;
            if (iMax > formatSupportLevel || (iMax == formatSupportLevel && z && i2 == 0 && bestRendererIndex3 != 0)) {
                length = i3;
                formatSupportLevel = iMax;
                i2 = bestRendererIndex3;
            }
        }
        return length;
    }

    public static int[] A0Z(InterfaceC23667p interfaceC23667p, C5027pg c5027pg) throws C2496AD {
        int[] iArr = new int[c5027pg.A01];
        for (int i2 = 0; i2 < c5027pg.A01; i2++) {
            iArr[i2] = interfaceC23667p.AKM(c5027pg.A08(i2));
        }
        return iArr;
    }

    public static int[] A0a(InterfaceC23667p[] interfaceC23667pArr) throws C2496AD {
        int[] iArr = new int[interfaceC23667pArr.length];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            int iAKO = interfaceC23667pArr[i2].AKO();
            String[] strArr = A01;
            String str = strArr[4];
            String str2 = strArr[1];
            int i3 = str.charAt(23);
            if (i3 == str2.charAt(23)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[4] = "1ViYEGUZxGRCVXLKV1NACncyCaxKGcLE";
            strArr2[1] = "WZkUCc71MckdncxFpAml539B1oxWjr0A";
            iArr[i2] = iAKO;
        }
        return iArr;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC2787Ew
    public final C2788Ex A0b(InterfaceC23667p[] interfaceC23667pArr, C4894nW c4894nW, C4912no c4912no, Timeline timeline) throws C2496AD {
        int[] rendererTrackGroupCounts;
        int[] iArr = new int[interfaceC23667pArr.length + 1];
        C5027pg[][] c5027pgArr = new C5027pg[interfaceC23667pArr.length + 1][];
        int[][][] iArr2 = new int[interfaceC23667pArr.length + 1][][];
        for (int i2 = 0; i2 < c5027pgArr.length; i2++) {
            c5027pgArr[i2] = new C5027pg[c4894nW.A01];
            iArr2[i2] = new int[c4894nW.A01][];
        }
        int[] iArrA0a = A0a(interfaceC23667pArr);
        for (int i3 = 0; i3 < c4894nW.A01; i3++) {
            C5027pg c5027pgA05 = c4894nW.A05(i3);
            int groupIndex = A0Y(interfaceC23667pArr, c5027pgA05, iArr, c5027pgA05.A02 == 5);
            if (groupIndex == interfaceC23667pArr.length) {
                rendererTrackGroupCounts = new int[c5027pgA05.A01];
            } else {
                rendererTrackGroupCounts = A0Z(interfaceC23667pArr[groupIndex], c5027pgA05);
            }
            int i4 = iArr[groupIndex];
            c5027pgArr[groupIndex][i4] = c5027pgA05;
            iArr2[groupIndex][i4] = rendererTrackGroupCounts;
            iArr[groupIndex] = iArr[groupIndex] + 1;
        }
        C4894nW[] c4894nWArr = new C4894nW[interfaceC23667pArr.length];
        String[] strArr = new String[interfaceC23667pArr.length];
        int[] iArr3 = new int[interfaceC23667pArr.length];
        int i5 = 0;
        while (true) {
            int length = interfaceC23667pArr.length;
            String[] strArr2 = A01;
            if (strArr2[4].charAt(23) == strArr2[1].charAt(23)) {
                throw new RuntimeException();
            }
            String[] strArr3 = A01;
            strArr3[4] = "hppY0P6sht5kF7is4RCKyMBKsFUVAoRB";
            strArr3[1] = "XeHPWbHBeoBDFVDQc4DbmKa9NYqMdrJh";
            if (i5 < length) {
                int i6 = iArr[i5];
                c4894nWArr[i5] = new C4894nW((C5027pg[]) AbstractC22035C.A1I(c5027pgArr[i5], i6));
                iArr2[i5] = (int[][]) AbstractC22035C.A1I(iArr2[i5], i6);
                strArr[i5] = interfaceC23667pArr[i5].getName();
                iArr3[i5] = interfaceC23667pArr[i5].A9N();
                i5++;
            } else {
                C2779Eo c2779Eo = new C2779Eo(strArr, iArr3, c4894nWArr, iArrA0a, iArr2, new C4894nW((C5027pg[]) AbstractC22035C.A1I(c5027pgArr[interfaceC23667pArr.length], iArr[interfaceC23667pArr.length])));
                Pair<C23697s[], InterfaceC4876nE[]> pairA0d = A0d(c2779Eo, iArr2, iArrA0a, c4912no, timeline);
                return new C2788Ex((C23697s[]) pairA0d.first, (InterfaceC4876nE[]) pairA0d.second, AbstractC2784Et.A00(c2779Eo, (InterfaceC2781Eq[]) pairA0d.second), c2779Eo);
            }
        }
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC2787Ew
    public final void A0c(Object obj) {
        this.A00 = (C2779Eo) obj;
    }
}
