package com.instagram.common.viewpoint.core;

import android.util.Log;
import com.facebook.ads.AdError;
import com.facebook.ads.AdSettings;
import com.facebook.ads.internal.protocol.AdErrorType;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.io */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C4620io implements InterfaceC3360OE {
    public static byte[] A05;
    public static String[] A06 = {"LqS4Vpkhy9E", "ge1EwIuJY0TovlYE8lSK4ibgoBpAWn9a", "g9aMV", "tM0yo6k6wg7fwB8A5Xyw1gAw", "QSFbFVun0ml7C8TY77Vqi1TYUccnWCEL", "t0vPMbYvCUeZJjWwsMbVoEbKc6G6LcPD", "iAyfyMUWIOpY9gjOpihEXzDIF", "NOfvqhzewpei8jQqPEPmMqHVwiKNDwof"};
    public AdError A00;
    public EnumC3359OD A01 = EnumC3359OD.A02;
    public EnumC3359OD A02 = EnumC3359OD.A02;
    public final AbstractC4616ik A03;
    public final C4494gi A04;

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 33);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        byte[] bArr = {125, 41, 50, 125, 12, 2, 123, 77, 87, 2, 65, 67, 76, 2, 65, 74, 67, 76, 69, 71, 2, 107, 76, 86, 71, 69, 80, 67, 86, 75, 77, 76, 2, 103, 80, 80, 77, 80, 2, 79, 77, 70, 71, 2, 64, 91, 2, 81, 71, 86, 86, 75, 76, 69, 2, 99, 70, 113, 71, 86, 86, 75, 76, 69, 81, 12, 81, 71, 86, 107, 76, 86, 71, 69, 80, 67, 86, 75, 77, 76, 103, 80, 80, 77, 80, 111, 77, 70, 71, 10, 11, 37, 33, 34, 22, 7, 10, 6, 13, 0, 6, 45, 6, 23, 20, 12, 17, 8, 65, 117, 104, 106, 39, 90, 127, 98, 99, 106, 45, 100, 99, 121, 104, 127, 99, 108, 97, 45, 121, 127, 108, 99, 126, 100, 121, 100, 98, 99, 35, 125, 108, 117, 106, 105, 103, 98, 46, 47, 121, 98, 101, 125, 34, 35, 120, 100, 109, 120, 44, 101, 127, 44, 109, 96, 126, 105, 109, 104, 117, 44, 64, 67, 77, 72, 69, 66, 75, 32, 44, 64, 67, 77, 72, 73, 72, 44, 99, 126, 44, 95, 68, 67, 91, 69, 66, 75, 123, 103, 110, 123, 47, 102, 124, 47, 110, 99, 125, 106, 110, 107, 118, 47, 92, 71, 64, 88, 70, 65, 72, 121, 101, 108, 121, 45, 100, 126, 45, 99, 98, 121, 45, 65, 66, 76, 73, 72, 73};
        String[] strArr = A06;
        if (strArr[1].charAt(28) == strArr[5].charAt(28)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A06;
        strArr2[1] = "uHXyGv91YS5AZybwuzmh7pK9ZkTxCxly";
        strArr2[5] = "aSclBZwoH94XlBt4xX3FAXD0bzJVnGEs";
        A05 = bArr;
    }

    static {
        A01();
    }

    public C4620io(C4494gi c4494gi, AbstractC4616ik abstractC4616ik) {
        this.A04 = c4494gi;
        this.A03 = abstractC4616ik;
    }

    private void A02(EnumC3359OD enumC3359OD, EnumC3359OD enumC3359OD2) {
        String strA00 = A00(113, 26, 44);
        StringBuilder sb = new StringBuilder();
        String errorTitle = A00(108, 5, 38);
        StringBuilder sbAppend = sb.append(errorTitle).append(enumC3359OD);
        String errorTitle2 = A00(0, 4, 124);
        String string = sbAppend.append(errorTitle2).append(enumC3359OD2).toString();
        InterfaceC3689Tc interfaceC3689TcA08 = this.A04.A08();
        int i2 = AbstractC3690Td.A0e;
        C3691Te c3691Te = new C3691Te(strA00, string);
        String errorTitle3 = A00(139, 3, 61);
        interfaceC3689TcA08.ABC(errorTitle3, i2, c3691Te);
        String errorTitle4 = strA00 + ' ' + string;
        this.A04.A0F().ALA(errorTitle4);
    }

    private void A03(String str, String str2, boolean z) {
        AdSettings.IntegrationErrorMode integrationErrorModeA00 = AbstractC3356OA.A00(this.A04);
        String str3 = String.format(Locale.US, AdErrorType.INCORRECT_API_CALL_ERROR.getDefaultErrorMessage(), str, str2);
        String strA00 = A00(139, 3, 61);
        String strA01 = A00(91, 17, 66);
        if (!z) {
            Log.e(strA01, str3);
            this.A04.A08().ABC(strA00, AbstractC3690Td.A0c, new C3691Te(str3));
            this.A04.A0F().AL9(str3);
            return;
        }
        switch (C3358OC.A00[integrationErrorModeA00.ordinal()]) {
            case 1:
                String errorMessage = str3 + A00(4, 87, 3);
                throw new C3361OF(errorMessage);
            case 2:
                this.A03.A08();
                this.A03.A0B(10, AdErrorType.INCORRECT_STATE_ERROR, str3);
                this.A04.A0F().AL9(str3);
                Log.e(strA01, str3);
                this.A04.A08().ABC(strA00, AbstractC3690Td.A0c, new C3691Te(str3));
                break;
        }
        Log.e(strA01, str3);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3360OE
    public final boolean A6U() {
        boolean z = (this.A01 == EnumC3359OD.A02 || this.A01 == EnumC3359OD.A04) && this.A02 != EnumC3359OD.A07;
        if (z) {
            this.A01 = EnumC3359OD.A06;
        } else {
            A03(A00(142, 6, 39), A00(154, 42, 45), false);
        }
        return !z;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3360OE
    public final boolean A6V() {
        if (this.A01 == EnumC3359OD.A04 && this.A00 != null && this.A00.getErrorCode() == 2008) {
            this.A04.A0F().AI5();
            this.A03.A0B(10, AdErrorType.AD_PRESENTATION_ERROR, null);
            return true;
        }
        EnumC3359OD enumC3359OD = this.A01;
        EnumC3359OD enumC3359OD2 = EnumC3359OD.A05;
        String[] strArr = A06;
        if (strArr[6].length() == strArr[2].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A06;
        strArr2[4] = "mF60z106z8KVykzxhCmjg96dV72kpnud";
        strArr2[7] = "JHGcNRxcSq72OhujKZnAiyvPQwA3qgql";
        boolean z = enumC3359OD == enumC3359OD2 && (this.A02 != EnumC3359OD.A07 || C3763Up.A0i(this.A04));
        if (z) {
            this.A01 = EnumC3359OD.A02;
            this.A02 = EnumC3359OD.A07;
        } else {
            EnumC3359OD enumC3359OD3 = this.A01;
            EnumC3359OD enumC3359OD4 = EnumC3359OD.A05;
            String strA00 = A00(148, 6, 43);
            if (enumC3359OD3 != enumC3359OD4) {
                A03(strA00, A00(219, 18, 44), true);
            } else {
                A03(strA00, A00(196, 23, 46), false);
            }
        }
        return !z;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3360OE
    public final EnumC3359OD A6p() {
        return this.A01;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3360OE
    public final EnumC3359OD A6q() {
        return this.A02;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3360OE
    public final void AAw() {
        this.A01 = EnumC3359OD.A06;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3360OE
    public final void AJM(EnumC3359OD enumC3359OD) {
        this.A01 = enumC3359OD;
        this.A02 = enumC3359OD;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3360OE
    public final void AJR(AdError adError) {
        this.A01 = EnumC3359OD.A04;
        this.A02 = EnumC3359OD.A04;
        this.A00 = adError;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3360OE
    public final void AJW() {
        if (this.A01 != EnumC3359OD.A06) {
            A02(this.A01, EnumC3359OD.A05);
        }
        EnumC3359OD enumC3359OD = EnumC3359OD.A05;
        String[] strArr = A06;
        if (strArr[4].charAt(13) == strArr[7].charAt(13)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A06;
        strArr2[6] = "0CQ8O9HdNp0eBnIGd0pIqA2Cb";
        strArr2[2] = "A9QPt";
        this.A01 = enumC3359OD;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3360OE
    public final void AJm() {
        if (this.A02 != EnumC3359OD.A07) {
            A02(this.A01, EnumC3359OD.A08);
        }
        this.A02 = EnumC3359OD.A08;
    }
}
