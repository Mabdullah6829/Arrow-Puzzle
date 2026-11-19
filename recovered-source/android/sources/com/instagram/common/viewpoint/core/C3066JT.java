package com.instagram.common.viewpoint.core;

import java.util.Arrays;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.JT */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C3066JT implements InterfaceC4268d3 {
    public static byte[] A01;
    public static String[] A02 = {"6Ak70sx20HAu1BK2okLsJl8UIfFL7Thw", "WSdr2bwsModx8vqlXsCh2pEoV44R6fWS", "6pV", "IuCwGgbRSGcwid05Jmd", "uJw8pmawU", "I8uJtZilJAfxYDsx8vrQS9VBJj4oHqwc", "yyzynLMQXuMe1chn921CH2O0saed", "KEJISc72f74GCBhZaRDCVEoQGHcnATpn"};
    public final /* synthetic */ C225966 A00;

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        int i5 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A02;
            if (strArr[7].charAt(3) == strArr[1].charAt(3)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[3] = "LF603a9wKS17yr1vDnM";
            strArr2[4] = "LZWmWJ2r4";
            if (i5 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 113);
            i5++;
        }
    }

    public static void A01() {
        byte[] bArr = {92, 64, 77, 85};
        String[] strArr = A02;
        if (strArr[7].charAt(3) == strArr[1].charAt(3)) {
            throw new RuntimeException();
        }
        A02[5] = "ka1vQ6UiXKbqG0foqwxWJkzjeHAuiIwi";
        A01 = bArr;
    }

    static {
        A01();
    }

    public C3066JT(C225966 c225966) {
        this.A00 = c225966;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC4268d3
    public final void AGR(String str, JSONObject jSONObject) {
        if (str.equals(A00(0, 4, 93))) {
            this.A00.AKD();
            if (C3763Up.A1z(this.A00.A07)) {
                this.A00.A07.A0B().ADb();
            }
        }
        C4277dC c4277dC = this.A00.A0F;
        if (A02[5].charAt(30) != 'w') {
            throw new RuntimeException();
        }
        A02[5] = "i1qJJe2Rv2sTY7cj85c4P5DDFviddUwN";
        c4277dC.A0h(str, jSONObject);
    }
}
