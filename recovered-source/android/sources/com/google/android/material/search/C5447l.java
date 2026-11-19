package com.google.android.material.search;

import android.animation.Animator;
import android.view.View;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.material.animation.AnimatableView;
import com.google.android.material.internal.ViewUtils;

/* JADX INFO: renamed from: com.google.android.material.search.l */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5447l implements ViewUtils.OnApplyWindowInsetsListener, OnApplyWindowInsetsListener, AnimatableView.Listener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f23475a;

    public /* synthetic */ C5447l(Object obj) {
        this.f23475a = obj;
    }

    @Override // com.google.android.material.animation.AnimatableView.Listener
    public void onAnimationEnd() {
        ((Animator) this.f23475a).start();
    }

    @Override // androidx.core.view.OnApplyWindowInsetsListener
    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        return ((SearchView) this.f23475a).lambda$setUpStatusBarSpacerInsetListener$6(view, windowInsetsCompat);
    }

    @Override // com.google.android.material.internal.ViewUtils.OnApplyWindowInsetsListener
    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat, ViewUtils.RelativePadding relativePadding) {
        return ((SearchView) this.f23475a).lambda$setUpToolbarInsetListener$5(view, windowInsetsCompat, relativePadding);
    }
}
