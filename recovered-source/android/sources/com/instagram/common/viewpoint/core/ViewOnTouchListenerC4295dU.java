package com.instagram.common.viewpoint.core;

import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.dU */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class ViewOnTouchListenerC4295dU implements View.OnTouchListener {
    public static String[] A01 = {"gOpLt4x0eEJeQNNuJ46yxDU2qUJdqYEL", "PZOrqZevLxuD31hIKj0gHyYQ4Dcgh", "igMzK0YYgnV8ISg3WYQba3hiJQ", "r1F", "hmhkt", "BWRo0uQSzThSh5wdl5bQ5g6bgNQDxstJ", "eE2oRBOJxbFK8ZaewsAA6sP9tyWNw24H", "pn2BkqsWP7aYSksb5nO6IYLmlyBMEu5T"};
    public final /* synthetic */ C22065F A00;

    public ViewOnTouchListenerC4295dU(C22065F c22065f) {
        this.A00 = c22065f;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getActionMasked();
        switch (action) {
            case 0:
                this.A00.A00 = motionEvent.getY();
                return true;
            case 1:
                float browserFinalY = motionEvent.getY();
                float f2 = this.A00.A00;
                String[] strArr = A01;
                String str = strArr[1];
                String str2 = strArr[2];
                int length = str.length();
                int action2 = str2.length();
                if (length != action2) {
                    String[] strArr2 = A01;
                    strArr2[1] = "FGPeZwV3hST1IH5pUqKb6TkoTjuvG";
                    strArr2[2] = "XZOwAM4xH67XqTDn0ifpo8neSL";
                    if (f2 >= browserFinalY) {
                        return true;
                    }
                    C22065F c22065f = this.A00;
                    if (A01[5].charAt(29) != 'h') {
                        A01[4] = "lWtjS";
                        c22065f.A0j(false);
                        return true;
                    }
                }
                throw new RuntimeException();
            default:
                return true;
        }
    }
}
