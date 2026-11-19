package com.instagram.common.viewpoint.core;

import android.content.Intent;
import android.graphics.Color;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.C1137R;
import com.facebook.ads.AudienceNetworkActivity;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.SK */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C3610SK {
    public static byte[] A03;
    public static String[] A04 = {"7eYgc6nX0dsf322XCwrRtT4qf3VEDMEl", "N2aCi32Gol", "cuafTeer1Z9Nb4my1kZzytDheJ", "azEUnMktT72nkCVYlmExjP7IGMIAzJqn", "aTKXKGIT8RKHn5PSJkltcYzomGOefmaB", "Nd0le1Epfxq6", "TvHh8Lt9J0iHJl7ueer52F53TQqp", "ytw5TrFQH6uy2HyuHBs1okCv8Ad5jbub"};
    public C4147b6 A00;
    public final AudienceNetworkActivity A01;
    public final C4494gi A02;

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 24);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{98, -125, -128, -109, -123, -7, -15, -16, -11, -19, 0, -11, -5, -6, -48, -19, 0, -19, -27, -31, -42, -40, -38, -30, -38, -29, -23, -66, -39, -73, -86, -74, -70, -86, -72, -71, -103, -82, -78, -86};
    }

    static {
        A01();
    }

    public C3610SK(C4494gi c4494gi, AudienceNetworkActivity audienceNetworkActivity) {
        this.A02 = c4494gi;
        this.A01 = audienceNetworkActivity;
    }

    private void A02(int i2, int i3) {
        if (this.A01.getWindow() != null) {
            this.A01.getWindow().setFlags(i2, i3);
        }
    }

    public final C4342eF A03(Intent intent, RelativeLayout relativeLayout) {
        String stringExtra = intent.getStringExtra(A00(5, 13, C1137R.styleable.ConstraintSet_pathMotionArc));
        if (stringExtra != null) {
            C4494gi c4494gi = this.A02;
            String[] strArr = A04;
            if (strArr[3].charAt(3) == strArr[4].charAt(3)) {
                throw new RuntimeException();
            }
            A04[0] = "OM7lzL5hLk1NAc94R8uXA4rWzYteyBdY";
            C4342eF c4342eFA01 = AbstractC4341eE.A01(c4494gi, stringExtra);
            if (c4342eFA01 != null) {
                relativeLayout.addView(c4342eFA01, new RelativeLayout.LayoutParams(-1, -1));
            }
            return c4342eFA01;
        }
        return null;
    }

    public final void A04() {
        if (C3763Up.A2J(this.A01)) {
            A02(16777216, 16777216);
        }
    }

    public final void A05() {
        if (this.A00 != null && C3763Up.A1C(this.A01)) {
            this.A00.A07();
        }
    }

    public final void A06() {
        if (C3763Up.A2R(this.A01)) {
            A02(128, 128);
        }
    }

    public final void A07(Intent intent, EnumC3854WK enumC3854WK, RelativeLayout relativeLayout) {
        if (C3763Up.A1C(this.A01)) {
            EnumC3854WK enumC3854WK2 = EnumC3854WK.A03;
            if (A04[1].length() == 14) {
                throw new RuntimeException();
            }
            A04[7] = "MXPR3PNgo3gwYNs9J3I1TINqSxswEDcD";
            if (enumC3854WK != enumC3854WK2) {
                this.A00 = new C4147b6();
                this.A00.A0C(intent.getStringExtra(A00(18, 11, 93)));
                C4147b6 c4147b6 = this.A00;
                String placementId = this.A01.getPackageName();
                c4147b6.A0B(placementId);
                long longExtra = intent.getLongExtra(A00(29, 11, 45), 0L);
                if (longExtra != 0) {
                    C4147b6 c4147b7 = this.A00;
                    String[] strArr = A04;
                    if (strArr[3].charAt(3) == strArr[4].charAt(3)) {
                        throw new RuntimeException();
                    }
                    String[] strArr2 = A04;
                    strArr2[2] = "JayLC9GMOZb39CtRqvAFG5wuJA";
                    strArr2[5] = "0wpddTnUpSmY";
                    c4147b7.A09(longExtra);
                }
                TextView textView = new TextView(this.A01);
                String placementId2 = A00(0, 5, 6);
                textView.setText(placementId2);
                textView.setTextColor(-1);
                AbstractC3966YB.A0N(textView, Color.argb(160, 0, 0, 0));
                textView.setPadding(5, 5, 5, 5);
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                layoutParams.addRule(12, -1);
                layoutParams.addRule(11, -1);
                textView.setLayoutParams(layoutParams);
                ViewOnLongClickListenerC3580Rq viewOnLongClickListenerC3580Rq = new ViewOnLongClickListenerC3580Rq(this.A00, relativeLayout);
                textView.setOnLongClickListener(viewOnLongClickListenerC3580Rq);
                relativeLayout.setOnLongClickListener(viewOnLongClickListenerC3580Rq);
                relativeLayout.getOverlay().add(this.A00);
            }
        }
    }

    public final void A08(EnumC3854WK enumC3854WK, boolean z) {
        if (C3763Up.A2w(this.A02)) {
            EnumC3854WK enumC3854WK2 = EnumC3854WK.A03;
            if (A04[6].length() != 28) {
                throw new RuntimeException();
            }
            A04[7] = "F6KEK3QPfCxrYVAsBDZ1FiU7CVmTBzj2";
            if (enumC3854WK == enumC3854WK2 && z) {
                String[] strArr = A04;
                if (strArr[2].length() != strArr[5].length()) {
                    A04[7] = "F5zIc02zmRZruFOjSfi1BFnSSwvtFdhl";
                    A02(512, 512);
                    return;
                } else {
                    A04[6] = "OJkKw3fFO6sWC1hd1CstPV3CXDwl";
                    A02(512, 512);
                    return;
                }
            }
        }
        this.A01.requestWindowFeature(1);
        A02(1024, 1024);
    }
}
