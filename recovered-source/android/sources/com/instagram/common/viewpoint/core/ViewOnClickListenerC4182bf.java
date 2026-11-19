package com.instagram.common.viewpoint.core;

import android.view.View;
import java.util.Iterator;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bf */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC4182bf implements View.OnClickListener {
    public final /* synthetic */ C4185bi A00;

    public ViewOnClickListenerC4182bf(C4185bi c4185bi) {
        this.A00 = c4185bi;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (AbstractC3863WU.A02(this)) {
            return;
        }
        try {
            this.A00.A05.AEm();
            if (this.A00.A00 != null) {
                AbstractC3966YB.A0L(this.A00.A00);
            }
            Iterator it = this.A00.A07.iterator();
            while (it.hasNext()) {
                AbstractC3966YB.A0O((View) it.next(), 0);
            }
            AbstractC3966YB.A0J(this.A00);
            if (this.A00.A06 == null) {
                return;
            }
            AbstractC3966YB.A0O(this.A00.A06, 0);
            this.A00.A06.A0e(EnumC4381et.A02, 14);
        } catch (Throwable th) {
            AbstractC3863WU.A00(th, this);
        }
    }
}
