package com.instagram.common.viewpoint.core;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.widget.LinearLayout;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Yb */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC3992Yb extends LinearLayout {
    public static int A00 = (int) (AbstractC3926XX.A02 * 56.0f);
    public static int A01 = (int) (AbstractC3926XX.A02 * 56.0f);

    public abstract void A09();

    public abstract void A0A();

    public abstract void A0B();

    public abstract void A0C(float f2, int i2);

    public abstract void A0D(C3320Na c3320Na, boolean z);

    public abstract boolean A0E();

    public abstract int getToolbarActionMode();

    public abstract int getToolbarHeight();

    public abstract InterfaceC3991Ya getToolbarListener();

    public abstract void setAdReportingVisible(boolean z);

    public abstract void setCTAClickListener(View.OnClickListener onClickListener);

    public abstract void setCTAClickListener(ViewOnClickListenerC3152Kr viewOnClickListenerC3152Kr);

    public abstract void setFullscreen(boolean z);

    public abstract void setPageDetails(C3332Nm c3332Nm, String str, int i2, C3338Ns c3338Ns);

    public abstract void setPageDetailsVisible(boolean z);

    public abstract void setProgress(float f2);

    public abstract void setProgressClickListener(View.OnClickListener onClickListener);

    public abstract void setProgressImage(EnumC3977YM enumC3977YM);

    public abstract void setProgressImmediate(float f2);

    public abstract void setProgressSpinnerInvisible(boolean z);

    public abstract void setToolbarActionMessage(String str);

    public abstract void setToolbarActionMode(int i2);

    public abstract void setToolbarListener(InterfaceC3991Ya interfaceC3991Ya);

    public AbstractC3992Yb(Context context) {
        super(context);
    }

    public void A08() {
    }

    public Rect getRequestedMargins() {
        return null;
    }
}
