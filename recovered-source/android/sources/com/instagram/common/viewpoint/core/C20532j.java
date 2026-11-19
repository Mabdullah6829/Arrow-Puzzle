package com.instagram.common.viewpoint.core;

import android.view.View;
import android.view.animation.AlphaAnimation;
import com.facebook.ads.internal.api.BuildConfigApi;
import com.facebook.ads.internal.settings.AdInternalSettings;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.2j */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C20532j extends AbstractC3476Q9<C4439fp> implements InterfaceC3655T4 {
    public C4494gi A00;
    public boolean A01;

    public C20532j(C4439fp c4439fp, C4494gi c4494gi) {
        super(c4439fp);
        this.A00 = c4494gi;
        this.A01 = false;
    }

    private void A00(int i2) {
        if (!this.A01) {
            this.A00.A0F().A3v(i2);
        }
        this.A01 = true;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC3871Wc
    public final void A07() {
        C4439fp c4439fpA08 = A08();
        int iIntValue = 0;
        if (c4439fpA08 == null) {
            A00(0);
            return;
        }
        View view = c4439fpA08.A0C;
        AbstractC4438fo abstractC4438fo = (AbstractC4438fo) c4439fpA08.A0E.get();
        int i2 = 1;
        boolean z = view == null;
        if (!z && abstractC4438fo != null) {
            C4440fq c4440fqA0E = C4439fp.A0E(view, c4439fpA08.A0A, this.A00);
            if (c4440fqA0E.A04()) {
                C4439fp.A05(c4439fpA08);
            } else {
                c4439fpA08.A00 = 0;
            }
            boolean z2 = c4439fpA08.A00 > c4439fpA08.A09;
            boolean wasViewable = c4439fpA08.A05 != null && c4439fpA08.A05.A04();
            if (z2 || !c4440fqA0E.A04()) {
                c4439fpA08.A05 = c4440fqA0E;
            }
            String strValueOf = String.valueOf(c4440fqA0E.A01());
            synchronized (c4439fpA08) {
                if (c4439fpA08.A06.containsKey(strValueOf)) {
                    iIntValue = ((Integer) c4439fpA08.A06.get(strValueOf)).intValue();
                }
                c4439fpA08.A06.put(strValueOf, Integer.valueOf(iIntValue + 1));
            }
            if (z2 && !wasViewable) {
                this.A01 = true;
                c4439fpA08.A03 = System.currentTimeMillis();
                if (c4439fpA08.A07) {
                    this.A00.A0F().A3w();
                }
                abstractC4438fo.A03();
                if (BuildConfigApi.isDebug() && AdInternalSettings.isVisibleAnimation()) {
                    AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                    alphaAnimation.setDuration(500L);
                    view.startAnimation(alphaAnimation);
                }
                if (!c4439fpA08.A0F) {
                    return;
                }
            } else if (!z2 && wasViewable) {
                this.A01 = true;
                if (c4439fpA08.A07) {
                    this.A00.A0F().A3S(c4440fqA0E.A02());
                }
                abstractC4438fo.A00();
            } else {
                abstractC4438fo.A02();
                if (!this.A01 && c4439fpA08.A07) {
                    this.A00.A0F().A3u(c4440fqA0E.A02());
                }
                this.A01 = true;
            }
            if (!c4439fpA08.A08 && c4439fpA08.A04 != null) {
                c4439fpA08.A0B.postDelayed(c4439fpA08.A04, c4439fpA08.A02);
                return;
            }
            return;
        }
        if (c4439fpA08.A07) {
            if (!z) {
                i2 = 2;
            }
            A00(i2);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3655T4
    public final C4494gi A6m() {
        return this.A00;
    }
}
