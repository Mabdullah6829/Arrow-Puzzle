package com.instagram.common.viewpoint.core;

import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.ViewGroup;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.FO */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2815FO extends AbstractC3518Qq<C2802FB> {
    public int A00;
    public final int A01;
    public final C23377M A04;
    public final C4494gi A05;
    public final ViewOnClickListenerC3152Kr A06;
    public final List<String> A08;
    public final Application.ActivityLifecycleCallbacks A02 = new Application.ActivityLifecycleCallbacks() { // from class: com.facebook.ads.internal.view.rewardedvideo.EndCardV2ScreenshotRecyclerAdapter$1
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(Activity activity) {
            if (activity == this.A00.A05.A0E()) {
                this.A00.A03.removeCallbacks(this.A00.A07);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(Activity activity) {
            this.A00.A03.post(this.A00.A07);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(Activity activity) {
        }
    };
    public final Handler A03 = new Handler(Looper.getMainLooper());
    public final Runnable A07 = new RunnableC4359eX(this);

    public C2815FO(C4494gi c4494gi, List<String> screenshotUrls, int i2, C23377M c23377m, ViewOnClickListenerC3152Kr viewOnClickListenerC3152Kr, int i3) {
        this.A08 = screenshotUrls;
        this.A01 = i2;
        this.A05 = c4494gi;
        this.A04 = c23377m;
        this.A06 = viewOnClickListenerC3152Kr;
        this.A00 = i3;
        this.A03.post(this.A07);
        if (Build.VERSION.SDK_INT >= 29 && this.A05.A0E() != null) {
            this.A05.A0E().registerActivityLifecycleCallbacks(this.A02);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.instagram.common.viewpoint.core.AbstractC3518Qq
    /* JADX INFO: renamed from: A05, reason: merged with bridge method [inline-methods] */
    public final C2802FB A0F(ViewGroup viewGroup, int i2) {
        C2800F9 c2800f9 = new C2800F9(this.A05);
        if (C3763Up.A1D(this.A05)) {
            c2800f9.setOnClickListener(new ViewOnClickListenerC4360eY(this));
        }
        return new C2802FB(c2800f9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.instagram.common.viewpoint.core.AbstractC3518Qq
    /* JADX INFO: renamed from: A07, reason: merged with bridge method [inline-methods] */
    public final void A0K(C2802FB c2802fb, int i2) {
        String str = this.A08.get(i2 % this.A08.size());
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(400, -1);
        int i3 = this.A01;
        int actualPosition = this.A01;
        marginLayoutParams.setMargins(i3, 0, actualPosition, 0);
        c2802fb.A0p().setLayoutParams(marginLayoutParams);
        c2802fb.A0p().setUrl(str);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3518Qq
    public final int A0B() {
        return this.A08.size() * 1000;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3518Qq
    public final void A0L(C23377M c23377m) {
        super.A0L(c23377m);
        this.A03.removeCallbacks(this.A07);
        if (Build.VERSION.SDK_INT >= 29 && this.A05.A0E() != null) {
            this.A05.A0E().unregisterActivityLifecycleCallbacks(this.A02);
        }
    }

    public final void A0O(int i2) {
        this.A00 = i2;
    }
}
