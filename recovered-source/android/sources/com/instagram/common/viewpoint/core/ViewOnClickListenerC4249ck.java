package com.instagram.common.viewpoint.core;

import android.net.Uri;
import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ck */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC4249ck implements View.OnClickListener {
    public static String[] A01 = {"UbVTWMkCbiTkCH46K3jgevn4ZrjXJwTz", "QhkEmn79eJKUC441fbjRvFrP8rMFuK10", "M1y17FrLcKCq9CffRIAOFt9KL", "7BuiCs8qfizRNQQacuqpq", "NMEBAQB23JfGHe29j4ICw6", "tA", "w4e9O4TDm2cMnnpInxw7", "enarAElxAt9QJNN7p9xKH4Zm0Hlbhkd5"};
    public final /* synthetic */ C3081Ji A00;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        Uri uriA0M;
        if (AbstractC3863WU.A02(this)) {
            return;
        }
        try {
            if (this.A00.A0W == null || (uriA0M = ((C238285) this.A00.A0W).A0M()) == null) {
                return;
            }
            if (!this.A00.A0D) {
                this.A00.A0E = true;
                this.A00.A0m(uriA0M.toString());
                if (this.A00.A0b.A0D() != null) {
                    this.A00.A0b.A0D().ACQ();
                }
                if (this.A00.A0X.A0q() >= 0) {
                    this.A00.A0R.postDelayed(this.A00.A0c, this.A00.A0X.A0q());
                }
            }
            if (this.A00.A09 != null) {
                this.A00.A09.A0B();
                this.A00.A09 = null;
            }
            this.A00.A0q(this.A00.A0D ? false : true);
        } catch (Throwable th) {
            String[] strArr = A01;
            if (strArr[6].length() == strArr[2].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[4] = "NGdQEP5eIhe6T0Nr5s0Gdk";
            strArr2[5] = "GP";
            AbstractC3863WU.A00(th, this);
        }
    }

    public ViewOnClickListenerC4249ck(C3081Ji c3081Ji) {
        this.A00 = c3081Ji;
    }
}
