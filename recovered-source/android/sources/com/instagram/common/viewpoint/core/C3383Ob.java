package com.instagram.common.viewpoint.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ob */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C3383Ob extends AbstractC4438fo {
    public static String[] A01 = {"M3Te92XvVv4q3bfKEkaCq6oPQP87x4vv", "LzmiiHhJsyKuUkJv7K1Ir2o", "KopJ75", "b4r1pmUHtrvrrbICXjY", "ceBgm8EiRhrot5ffXZtZ35omPt2ZFFf0", "0EayevzsZQe4lRY4RLfa4MEWre", "N9h8Vj", "K1Ob6mZ8MwS9WZtXZ80XEzEALvtTcRJ2"};
    public final /* synthetic */ C4019Z2 A00;

    public C3383Ob(C4019Z2 c4019z2) {
        this.A00 = c4019z2;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC4438fo
    public final void A03() {
        if (this.A00.A08 == null || this.A00.A08.A0G()) {
            this.A00.A0A.A0V();
            if (!this.A00.A06.A07()) {
                this.A00.A06.A05();
            }
            InterfaceC4018Z1 listener = (InterfaceC4018Z1) this.A00.A0C.get();
            if (listener != null) {
                listener.AEA();
            }
            C4019Z2 c4019z2 = this.A00;
            String[] strArr = A01;
            if (strArr[1].length() == strArr[3].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[1] = "2rS8p9kEkH8XxeBlGl7RSlB";
            strArr2[3] = "nqXy6qNf0NylKakjBUJ";
            c4019z2.A0A.A0V();
            return;
        }
        this.A00.A0A.A0T();
    }
}
