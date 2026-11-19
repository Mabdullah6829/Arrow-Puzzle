package com.google.android.material.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityManager;
import androidx.annotation.Dimension;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.content.ContextCompat;
import com.google.android.material.C5183R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.motion.MotionUtils;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p011H.AbstractC0271e0;

/* JADX INFO: loaded from: classes2.dex */
public class HideViewOnScrollBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {
    private static final int DEFAULT_ENTER_ANIMATION_DURATION_MS = 225;
    private static final int DEFAULT_EXIT_ANIMATION_DURATION_MS = 175;
    public static final int EDGE_BOTTOM = 1;
    public static final int EDGE_LEFT = 2;
    public static final int EDGE_RIGHT = 0;
    public static final int STATE_SCROLLED_IN = 2;
    public static final int STATE_SCROLLED_OUT = 1;
    private AccessibilityManager accessibilityManager;
    private int additionalHiddenOffset;

    @Nullable
    private ViewPropertyAnimator currentAnimator;
    private int currentState;
    private boolean disableOnTouchExploration;
    private int enterAnimDuration;

    @Nullable
    private TimeInterpolator enterAnimInterpolator;
    private int exitAnimDuration;

    @Nullable
    private TimeInterpolator exitAnimInterpolator;
    private HideViewOnScrollDelegate hideOnScrollViewDelegate;

    @NonNull
    private final LinkedHashSet<OnScrollStateChangedListener> onScrollStateChangedListeners;
    private int savedImportantForAccessibility;
    private int savedVisibility;
    private int size;
    private AccessibilityManager.TouchExplorationStateChangeListener touchExplorationListener;
    private boolean viewEdgeOverride;
    private static final int ENTER_ANIM_DURATION_ATTR = C5183R.attr.motionDurationLong2;
    private static final int EXIT_ANIM_DURATION_ATTR = C5183R.attr.motionDurationMedium4;
    private static final int ENTER_EXIT_ANIM_EASING_ATTR = C5183R.attr.motionEasingEmphasizedInterpolator;

    public interface OnScrollStateChangedListener {
        void onStateChanged(@NonNull View view, int i2);
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface ScrollState {
    }

    public HideViewOnScrollBehavior() {
        this.disableOnTouchExploration = true;
        this.onScrollStateChangedListeners = new LinkedHashSet<>();
        this.size = 0;
        this.currentState = 2;
        this.additionalHiddenOffset = 0;
        this.savedImportantForAccessibility = 0;
        this.savedVisibility = 0;
        this.viewEdgeOverride = false;
    }

    private void animateChildTo(@NonNull final V v, int i2, long j2, @NonNull TimeInterpolator timeInterpolator) {
        this.currentAnimator = this.hideOnScrollViewDelegate.getViewTranslationAnimator(v, i2).setInterpolator(timeInterpolator).setDuration(j2).setListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.behavior.HideViewOnScrollBehavior.2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                HideViewOnScrollBehavior.this.currentAnimator = null;
                if (HideViewOnScrollBehavior.this.currentState == 1 && v.getVisibility() == 0) {
                    v.setVisibility(4);
                }
            }
        });
    }

    private void disableIfTouchExplorationEnabled(V v) {
        if (this.accessibilityManager == null) {
            this.accessibilityManager = (AccessibilityManager) ContextCompat.getSystemService(v.getContext(), AccessibilityManager.class);
        }
        AccessibilityManager accessibilityManager = this.accessibilityManager;
        if (accessibilityManager == null || this.touchExplorationListener != null) {
            return;
        }
        AccessibilityManagerTouchExplorationStateChangeListenerC5205a accessibilityManagerTouchExplorationStateChangeListenerC5205a = new AccessibilityManagerTouchExplorationStateChangeListenerC5205a(this, v, 1);
        this.touchExplorationListener = accessibilityManagerTouchExplorationStateChangeListenerC5205a;
        accessibilityManager.addTouchExplorationStateChangeListener(accessibilityManagerTouchExplorationStateChangeListenerC5205a);
        v.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.google.android.material.behavior.HideViewOnScrollBehavior.1
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(@NonNull View view) {
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(@NonNull View view) {
                if (HideViewOnScrollBehavior.this.touchExplorationListener == null || HideViewOnScrollBehavior.this.accessibilityManager == null) {
                    return;
                }
                HideViewOnScrollBehavior.this.accessibilityManager.removeTouchExplorationStateChangeListener(HideViewOnScrollBehavior.this.touchExplorationListener);
                HideViewOnScrollBehavior.this.touchExplorationListener = null;
            }
        });
    }

    @NonNull
    public static <V extends View> HideViewOnScrollBehavior<V> from(@NonNull V v) {
        ViewGroup.LayoutParams layoutParams = v.getLayoutParams();
        if (!(layoutParams instanceof CoordinatorLayout.LayoutParams)) {
            throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
        }
        CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.LayoutParams) layoutParams).getBehavior();
        if (behavior instanceof HideViewOnScrollBehavior) {
            return (HideViewOnScrollBehavior) behavior;
        }
        throw new IllegalArgumentException("The view is not associated with HideViewOnScrollBehavior");
    }

    private boolean isGravityBottom(int i2) {
        return i2 == 80 || i2 == 81;
    }

    private boolean isGravityLeft(int i2) {
        return i2 == 3 || i2 == 19;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$disableIfTouchExplorationEnabled$0(View view, boolean z) {
        if (this.disableOnTouchExploration && z && isScrolledOut()) {
            slideIn(view);
        }
    }

    private void setViewEdge(@NonNull V v, int i2) {
        if (this.viewEdgeOverride) {
            return;
        }
        int i3 = ((CoordinatorLayout.LayoutParams) v.getLayoutParams()).gravity;
        if (isGravityBottom(i3)) {
            setViewEdgeInternal(1);
        } else {
            setViewEdgeInternal(isGravityLeft(Gravity.getAbsoluteGravity(i3, i2)) ? 2 : 0);
        }
    }

    private void setViewEdgeInternal(int i2) {
        HideViewOnScrollDelegate hideViewOnScrollDelegate = this.hideOnScrollViewDelegate;
        if (hideViewOnScrollDelegate == null || hideViewOnScrollDelegate.getViewEdge() != i2) {
            if (i2 == 0) {
                this.hideOnScrollViewDelegate = new HideRightViewOnScrollDelegate();
            } else if (i2 == 1) {
                this.hideOnScrollViewDelegate = new HideBottomViewOnScrollDelegate();
            } else {
                if (i2 != 2) {
                    throw new IllegalArgumentException(AbstractC0271e0.m397e(i2, "Invalid view edge position value: ", ". Must be 0, 1 or 2."));
                }
                this.hideOnScrollViewDelegate = new HideLeftViewOnScrollDelegate();
            }
        }
    }

    private void updateCurrentState(@NonNull V v, int i2) {
        this.currentState = i2;
        updateViewPropertiesForState(v, i2);
        Iterator<OnScrollStateChangedListener> it = this.onScrollStateChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().onStateChanged(v, this.currentState);
        }
    }

    private void updateViewPropertiesForState(@NonNull V v, int i2) {
        if (i2 == 1) {
            if (v.hasFocus()) {
                v.clearFocus();
            }
            if (v.getImportantForAccessibility() != 4) {
                this.savedImportantForAccessibility = v.getImportantForAccessibility();
            }
            if (v.getVisibility() != 4) {
                this.savedVisibility = v.getVisibility();
            }
            v.setImportantForAccessibility(4);
            return;
        }
        if (i2 == 2) {
            if (v.getImportantForAccessibility() == 4) {
                v.setImportantForAccessibility(this.savedImportantForAccessibility);
            }
            if (v.getVisibility() == 4) {
                v.setVisibility(this.savedVisibility);
            }
        }
    }

    public void addOnScrollStateChangedListener(@NonNull OnScrollStateChangedListener onScrollStateChangedListener) {
        this.onScrollStateChangedListeners.add(onScrollStateChangedListener);
    }

    public void clearOnScrollStateChangedListeners() {
        this.onScrollStateChangedListeners.clear();
    }

    public void disableOnTouchExploration(boolean z) {
        this.disableOnTouchExploration = z;
    }

    public boolean isDisabledOnTouchExploration() {
        return this.disableOnTouchExploration;
    }

    public boolean isScrolledIn() {
        return this.currentState == 2;
    }

    public boolean isScrolledOut() {
        return this.currentState == 1;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onLayoutChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, int i2) {
        disableIfTouchExplorationEnabled(v);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) v.getLayoutParams();
        setViewEdge(v, i2);
        this.size = this.hideOnScrollViewDelegate.getSize(v, marginLayoutParams);
        this.enterAnimDuration = MotionUtils.resolveThemeDuration(v.getContext(), ENTER_ANIM_DURATION_ATTR, DEFAULT_ENTER_ANIMATION_DURATION_MS);
        this.exitAnimDuration = MotionUtils.resolveThemeDuration(v.getContext(), EXIT_ANIM_DURATION_ATTR, DEFAULT_EXIT_ANIMATION_DURATION_MS);
        Context context = v.getContext();
        int i3 = ENTER_EXIT_ANIM_EASING_ATTR;
        this.enterAnimInterpolator = MotionUtils.resolveThemeInterpolator(context, i3, AnimationUtils.LINEAR_OUT_SLOW_IN_INTERPOLATOR);
        this.exitAnimInterpolator = MotionUtils.resolveThemeInterpolator(v.getContext(), i3, AnimationUtils.FAST_OUT_LINEAR_IN_INTERPOLATOR);
        return super.onLayoutChild(coordinatorLayout, v, i2);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, int i2, int i3, int i4, int i5, int i6, @NonNull int[] iArr) {
        if (i3 > 0) {
            slideOut(v);
        } else if (i3 < 0) {
            slideIn(v);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onStartNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, @NonNull View view2, int i2, int i3) {
        return i2 == 2;
    }

    public void removeOnScrollStateChangedListener(@NonNull OnScrollStateChangedListener onScrollStateChangedListener) {
        this.onScrollStateChangedListeners.remove(onScrollStateChangedListener);
    }

    public void setAdditionalHiddenOffset(@NonNull V v, @Dimension int i2) {
        this.additionalHiddenOffset = i2;
        if (this.currentState == 1) {
            this.hideOnScrollViewDelegate.setAdditionalHiddenOffset(v, this.size, i2);
        }
    }

    public void slideIn(@NonNull V v) {
        slideIn(v, true);
    }

    public void slideOut(@NonNull V v) {
        slideOut(v, true);
    }

    public void slideIn(@NonNull V v, boolean z) {
        if (isScrolledIn()) {
            return;
        }
        updateCurrentState(v, 2);
        ViewPropertyAnimator viewPropertyAnimator = this.currentAnimator;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            v.clearAnimation();
        }
        int targetTranslation = this.hideOnScrollViewDelegate.getTargetTranslation();
        if (z) {
            animateChildTo(v, targetTranslation, this.enterAnimDuration, this.enterAnimInterpolator);
        } else {
            this.hideOnScrollViewDelegate.setViewTranslation(v, targetTranslation);
        }
    }

    public void slideOut(@NonNull V v, boolean z) {
        AccessibilityManager accessibilityManager;
        if (isScrolledOut() || (this.disableOnTouchExploration && (accessibilityManager = this.accessibilityManager) != null && accessibilityManager.isTouchExplorationEnabled())) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.currentAnimator;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            v.clearAnimation();
        }
        updateCurrentState(v, 1);
        int i2 = this.size + this.additionalHiddenOffset;
        if (z) {
            animateChildTo(v, i2, this.exitAnimDuration, this.exitAnimInterpolator);
            return;
        }
        this.hideOnScrollViewDelegate.setViewTranslation(v, i2);
        if (v.getVisibility() == 0) {
            v.setVisibility(4);
        }
    }

    public void setViewEdge(int i2) {
        this.viewEdgeOverride = true;
        setViewEdgeInternal(i2);
    }

    public HideViewOnScrollBehavior(int i2) {
        this();
        setViewEdge(i2);
    }

    public HideViewOnScrollBehavior(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.disableOnTouchExploration = true;
        this.onScrollStateChangedListeners = new LinkedHashSet<>();
        this.size = 0;
        this.currentState = 2;
        this.additionalHiddenOffset = 0;
        this.savedImportantForAccessibility = 0;
        this.savedVisibility = 0;
        this.viewEdgeOverride = false;
    }
}
