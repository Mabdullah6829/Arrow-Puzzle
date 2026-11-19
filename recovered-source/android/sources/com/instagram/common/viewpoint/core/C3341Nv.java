package com.instagram.common.viewpoint.core;

import androidx.constraintlayout.widget.C1137R;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Nv */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C3341Nv implements InterfaceC3916XN {
    public static byte[] A01;
    public static String[] A02 = {"RKj", "", "UN15gotjq8", "ajoBiEUEQKFJNLqm", "ifgUnXqkKiJSPGKzKRtyUVwCV1ynqJ", "MgNPOwYKG3krpOkrgoqalUsb7GIlLECG", "4d5pH5OlBXd1RidH0kkNXmSukCNaNWUQ", "ZdfTYbLhRFsUmKvgir0oysIbzYx0fUOP"};
    public final /* synthetic */ C3308NO A00;

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 17);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-31, -7, -21, -23, -7, -29};
    }

    static {
        A01();
    }

    public C3341Nv(C3308NO c3308no) {
        this.A00 = c3308no;
    }

    public /* synthetic */ C3341Nv(C3308NO c3308no, C3377OV c3377ov) {
        this(c3308no);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3916XN
    public final void ADS() {
        this.A00.A0g.setToolbarActionMessage(A00(0, 0, 19));
        this.A00.A0I();
        if (this.A00.A0d) {
            boolean zA0X = this.A00.A0X();
            String[] strArr = A02;
            if (strArr[5].charAt(0) == strArr[7].charAt(0)) {
                throw new RuntimeException();
            }
            A02[4] = "QDC88FCswtzFK8CArK72WEL9jXMBl5";
            if (zA0X) {
                this.A00.A0g.setToolbarActionMode(1);
                return;
            }
        }
        this.A00.A0g.setToolbarActionMode(0);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3916XN
    public final void AFV(float f2) {
        float fA04;
        this.A00.A0Q((int) f2);
        if (this.A00.A0e) {
            if (this.A00.A0J) {
                AbstractC4669jd abstractC4669jd = this.A00.A0O;
                if (A02[6].charAt(27) != 'a') {
                    throw new RuntimeException();
                }
                A02[4] = "3MuDy2E798EtOoHK0e0a3SiH1QgAy5";
                fA04 = 1.0f - (f2 / abstractC4669jd.A29().A0H().A03());
                if (this.A00.A0M || fA04 < 1.0f) {
                    this.A00.A0M = false;
                    this.A00.A0g.setToolbarActionMessage(this.A00.A0O.A2D().A06().replace(A00(0, 6, C1137R.styleable.ConstraintSet_pivotAnchor), String.valueOf((int) f2)));
                } else {
                    this.A00.A0M = true;
                    AbstractC3992Yb abstractC3992Yb = this.A00.A0g;
                    String strA00 = A00(0, 0, 19);
                    if (A02[3].length() != 16) {
                        abstractC3992Yb.setToolbarActionMessage(strA00);
                    } else {
                        String[] strArr = A02;
                        strArr[5] = "wpbUz5ctYXHuYyRf6fVCU3uRzsMt7dE8";
                        strArr[7] = "BBfRd69Z77LUH69GeqVAIKhho7h2fuMA";
                        abstractC3992Yb.setToolbarActionMessage(strA00);
                    }
                }
            } else {
                fA04 = 1.0f - (f2 / this.A00.A0O.A29().A0H().A04());
            }
            this.A00.A0g.setProgress(100.0f * fA04);
            float fA03 = this.A00.A0O.A29().A0H().A03() - f2;
            float percentageOfReward = this.A00.A0O.A29().A0H().A04();
            boolean z = fA03 >= percentageOfReward;
            if (!this.A00.A0M && z) {
                this.A00.A0g.setToolbarActionMode(1);
                return;
            }
            return;
        }
        this.A00.A0g.setProgress(100.0f * (1.0f - (f2 / this.A00.A0P.A0C())));
    }
}
