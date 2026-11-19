package com.google.android.material.behavior;

import android.view.View;
import android.view.accessibility.AccessibilityManager;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: renamed from: com.google.android.material.behavior.a */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class AccessibilityManagerTouchExplorationStateChangeListenerC5205a implements AccessibilityManager.TouchExplorationStateChangeListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f23364a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ View f23365b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ CoordinatorLayout.Behavior f23366c;

    public /* synthetic */ AccessibilityManagerTouchExplorationStateChangeListenerC5205a(CoordinatorLayout.Behavior behavior, View view, int i2) {
        this.f23364a = i2;
        this.f23366c = behavior;
        this.f23365b = view;
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z) {
        switch (this.f23364a) {
            case 0:
                ((HideBottomViewOnScrollBehavior) this.f23366c).lambda$disableIfTouchExplorationEnabled$0(this.f23365b, z);
                break;
            default:
                ((HideViewOnScrollBehavior) this.f23366c).lambda$disableIfTouchExplorationEnabled$0(this.f23365b, z);
                break;
        }
    }
}
