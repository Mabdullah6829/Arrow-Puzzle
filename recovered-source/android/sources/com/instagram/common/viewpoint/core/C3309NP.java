package com.instagram.common.viewpoint.core;

import android.text.TextUtils;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.NP */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C3309NP implements InterfaceC4343eG {
    public static byte[] A01;
    public static String[] A02 = {"BHXiYjXxfgjD7yDB", "kPfw5HKETqo8dV", "SlBKzsC69frNfTspgJs5v90302jxH173", "0t7u2eeKUCj5gcxeWZIOCTpidMAeGJtt", "hTXrvsDVbOi3Q9xrUBZOJj7T", "iLbLRTjnBQIJ87KFXaIFUijyWt7EPIGc", "0utayShxEdwMeaV3UZeoWviAuyaBWRmj", "gyVOCm6F1v6TZALkbG"};
    public final /* synthetic */ C3308NO A00;

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 58);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{25, 23, 9, 22, 7, 16, 13, 7, 15};
    }

    static {
        A01();
    }

    public C3309NP(C3308NO c3308no) {
        this.A00 = c3308no;
    }

    public /* synthetic */ C3309NP(C3308NO c3308no, C3377OV c3377ov) {
        this(c3308no);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC4343eG
    public final void ADX() {
        this.A00.A0W(true, A00(0, 9, 106));
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC4343eG
    public final void AEA() {
        if (!this.A00.A0f) {
            if (!TextUtils.isEmpty(this.A00.A0O.A2E())) {
                this.A00.A0S.ABJ(this.A00.A0O.A2E(), new C4150b9().A03(this.A00.A0B.getViewabilityChecker()).A02(this.A00.A0B.getTouchDataRecorder()).A05());
                C3880Wl.A00(this.A00.A0R).A0E(this.A00.A0X.A8l(), this.A00.A0O.A2E());
                C3326Ng.A07(this.A00.A0O.A2A(), this.A00.A0R);
                AbstractC3382Oa.A02(this.A00.A0O.A0y(), AbstractC3941Xm.A00(this.A00.A0O.A10()));
                this.A00.A0R.A0F().A3L();
                if (this.A00.A0P.A0c()) {
                    this.A00.A0R.A0F().AES();
                }
            }
            C3308NO c3308no = this.A00;
            String[] strArr = A02;
            if (strArr[5].charAt(12) == strArr[2].charAt(12)) {
                throw new RuntimeException();
            }
            A02[4] = "GzK3XL6hk7idJD";
            c3308no.A0W.A4j(this.A00.A0X.A8G());
            return;
        }
        this.A00.A0R.A0F().AET();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC4343eG
    public final void AEh() {
        this.A00.A0W.A4j(this.A00.A0X.A81());
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC4343eG
    public final void AFQ() {
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC4343eG
    public final void AGg() {
        this.A00.A0W.ADJ(15);
    }
}
