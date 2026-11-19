package com.google.android.material.listitem;

import android.R;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.GravityCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.customview.widget.ViewDragHelper;
import com.google.android.material.C5183R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import p011H.AbstractC0271e0;

/* JADX INFO: loaded from: classes2.dex */
public class ListItemLayout extends FrameLayout {
    private static final int DEFAULT_SIGNIFICANT_VEL_THRESHOLD = 500;
    public static final int POSITION_FIRST = 0;
    public static final int POSITION_LAST = 2;
    public static final int POSITION_MIDDLE = 1;
    public static final int POSITION_SINGLE = 3;
    private static final int SETTLING_DURATION = 350;

    @Nullable
    private RevealableListItem activeSwipeToRevealLayout;
    private View contentView;

    @Nullable
    private GestureDetector gestureDetector;
    private int lastStableSwipeState;
    private boolean originalClipToPadding;
    private int originalContentViewLeft;

    @Nullable
    private int[] positionState;
    private int revealViewOffset;
    private final StateSettlingTracker stateSettlingTracker;

    @Nullable
    private View.AccessibilityDelegate swipeAccessibilityDelegate;
    private int swipeState;

    @Nullable
    private View swipeToRevealLayoutLeft;

    @Nullable
    private View swipeToRevealLayoutRight;

    @Nullable
    private ViewDragHelper viewDragHelper;
    private static final int[] FIRST_STATE_SET = {R.attr.state_first};
    private static final int[] MIDDLE_STATE_SET = {R.attr.state_middle};
    private static final int[] LAST_STATE_SET = {R.attr.state_last};
    private static final int[] SINGLE_STATE_SET = {R.attr.state_single};
    private static final TimeInterpolator CUBIC_BEZIER_INTERPOLATOR = new PathInterpolator(0.42f, 1.67f, 0.21f, 0.9f);

    @Retention(RetentionPolicy.SOURCE)
    public @interface Position {
    }

    public class StateSettlingTracker {
        private final Runnable continueSettlingRunnable;
        private boolean isContinueSettlingRunnablePosted;
        private int targetRevealGravity;
        private int targetSwipeState;

        private StateSettlingTracker() {
            this.continueSettlingRunnable = new Runnable() { // from class: com.google.android.material.listitem.b
                @Override // java.lang.Runnable
                public final void run() {
                    this.f23444s.lambda$new$0();
                }
            };
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void continueSettlingToState(int i2, int i3) {
            this.targetSwipeState = i2;
            this.targetRevealGravity = i3;
            if (this.isContinueSettlingRunnablePosted) {
                return;
            }
            ListItemLayout.this.post(this.continueSettlingRunnable);
            this.isContinueSettlingRunnablePosted = true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$new$0() {
            this.isContinueSettlingRunnablePosted = false;
            if (ListItemLayout.this.viewDragHelper != null && ListItemLayout.this.viewDragHelper.continueSettling(true)) {
                continueSettlingToState(this.targetSwipeState, this.targetRevealGravity);
            } else if (ListItemLayout.this.swipeState == 2) {
                ListItemLayout.this.setSwipeStateInternal(this.targetSwipeState, this.targetRevealGravity);
            }
        }
    }

    public ListItemLayout(@NonNull Context context) {
        this(context, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <T extends View & RevealableListItem> T castToView(RevealableListItem revealableListItem) {
        return (T) ((View) revealableListItem);
    }

    private GestureDetector createGestureDetector() {
        return new GestureDetector(getContext(), new GestureDetector.SimpleOnGestureListener() { // from class: com.google.android.material.listitem.ListItemLayout.2
            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
                if (ListItemLayout.this.getParent() == null) {
                    return false;
                }
                ListItemLayout.this.getParent().requestDisallowInterceptTouchEvent(true);
                return false;
            }
        });
    }

    private View.AccessibilityDelegate createSwipeAccessibilityDelegate() {
        return new View.AccessibilityDelegate() { // from class: com.google.android.material.listitem.ListItemLayout.3
            private void addSwipeAccessibilityActions(@Nullable View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                        View childAt = viewGroup.getChildAt(i2);
                        if (shouldAddAccessibilityAction(childAt)) {
                            accessibilityNodeInfoCompat.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(getAccessibilityActionId(childAt), childAt.getContentDescription()));
                        }
                    }
                }
            }

            private int getAccessibilityActionId(View view) {
                return view.getId();
            }

            private boolean performRevealViewAction(@Nullable View view, int i2) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                        View childAt = viewGroup.getChildAt(i3);
                        if (getAccessibilityActionId(childAt) == i2) {
                            return childAt.performClick();
                        }
                    }
                }
                return false;
            }

            private boolean shouldAddAccessibilityAction(View view) {
                return view.isClickable() && view.getContentDescription() != null && view.isEnabled() && view.getVisibility() == 0;
            }

            @Override // android.view.View.AccessibilityDelegate
            public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                AccessibilityNodeInfoCompat accessibilityNodeInfoCompatWrap = AccessibilityNodeInfoCompat.wrap(accessibilityNodeInfo);
                addSwipeAccessibilityActions(ListItemLayout.this.swipeToRevealLayoutLeft, accessibilityNodeInfoCompatWrap);
                addSwipeAccessibilityActions(ListItemLayout.this.swipeToRevealLayoutRight, accessibilityNodeInfoCompatWrap);
            }

            @Override // android.view.View.AccessibilityDelegate
            public boolean performAccessibilityAction(View view, int i2, Bundle bundle) {
                if (performRevealViewAction(ListItemLayout.this.swipeToRevealLayoutLeft, i2) || performRevealViewAction(ListItemLayout.this.swipeToRevealLayoutRight, i2)) {
                    return true;
                }
                return super.performAccessibilityAction(view, i2, bundle);
            }
        };
    }

    private ViewDragHelper createViewDragHelper() {
        return ViewDragHelper.create(this, new ViewDragHelper.Callback() { // from class: com.google.android.material.listitem.ListItemLayout.1
            /* JADX WARN: Multi-variable type inference failed */
            private int calculateMaxSwipeDistance(@NonNull RevealableListItem revealableListItem) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) ((View) revealableListItem).getLayoutParams();
                if (revealableListItem.getPrimaryActionSwipeMode() == 0) {
                    return marginLayoutParams.getMarginEnd() + marginLayoutParams.getMarginStart() + revealableListItem.getIntrinsicWidth();
                }
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) ListItemLayout.this.contentView.getLayoutParams();
                return ListItemLayout.this.contentView.getMeasuredWidth() + (ListItemUtils.isRightAligned((View) revealableListItem) ? marginLayoutParams2.leftMargin : marginLayoutParams2.rightMargin);
            }

            private int calculateTargetSwipeState(int i2, @NonNull RevealableListItem revealableListItem, float f2, int i3) {
                if (!ListItemLayout.this.swipeToRevealLayoutExistsForGravity(i2)) {
                    return 3;
                }
                if (i2 != 3) {
                    f2 = -f2;
                }
                return calculateTargetSwipeStateForRevealLayout(i3, f2, revealableListItem, ListItemLayout.this.getSwipeRevealViewRevealedOffset(i2), ListItemLayout.this.getSwipeToActionOffset(i2));
            }

            private int calculateTargetSwipeStateForRevealLayout(int i2, float f2, @NonNull RevealableListItem revealableListItem, int i3, int i4) {
                boolean z = revealableListItem.getPrimaryActionSwipeMode() != 0;
                boolean z2 = revealableListItem.getPrimaryActionSwipeMode() == 2;
                if (f2 > 500.0f) {
                    return (!z || (ListItemLayout.this.lastStableSwipeState == 3 && !z2)) ? 4 : 5;
                }
                if (f2 < -500.0f) {
                    return (z2 || ListItemLayout.this.lastStableSwipeState != 5) ? 3 : 4;
                }
                if (z && Math.abs(i2 - i4) < Math.abs(i2 - i3)) {
                    return 5;
                }
                if (z && z2) {
                    i3 = i4;
                }
                if (Math.abs(i2 - i3) < Math.abs(i2 - ListItemLayout.this.getSwipeViewClosedOffset())) {
                    return (z && z2) ? 5 : 4;
                }
                return 3;
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public int clampViewPositionHorizontal(@NonNull View view, int i2, int i3) {
                if (!(ListItemLayout.this.contentView instanceof SwipeableListItem) || !ListItemLayout.this.swipeToRevealLayoutExists()) {
                    return 0;
                }
                SwipeableListItem swipeableListItem = (SwipeableListItem) ListItemLayout.this.contentView;
                int swipeMaxOvershoot = ListItemLayout.this.originalContentViewLeft;
                int swipeMaxOvershoot2 = ListItemLayout.this.originalContentViewLeft;
                if (ListItemLayout.this.swipeToRevealLayoutRight instanceof RevealableListItem) {
                    swipeMaxOvershoot = ListItemLayout.this.originalContentViewLeft - (swipeableListItem.getSwipeMaxOvershoot() + calculateMaxSwipeDistance((RevealableListItem) ListItemLayout.this.swipeToRevealLayoutRight));
                }
                if (ListItemLayout.this.swipeToRevealLayoutLeft instanceof RevealableListItem) {
                    int iCalculateMaxSwipeDistance = calculateMaxSwipeDistance((RevealableListItem) ListItemLayout.this.swipeToRevealLayoutLeft);
                    swipeMaxOvershoot2 = swipeableListItem.getSwipeMaxOvershoot() + iCalculateMaxSwipeDistance + ListItemLayout.this.originalContentViewLeft;
                }
                return Math.max(swipeMaxOvershoot, Math.min(i2, swipeMaxOvershoot2));
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public int getViewHorizontalDragRange(@NonNull View view) {
                int intrinsicWidth = 0;
                if (ListItemLayout.this.contentView instanceof SwipeableListItem) {
                    SwipeableListItem swipeableListItem = (SwipeableListItem) ListItemLayout.this.contentView;
                    intrinsicWidth = ListItemLayout.this.swipeToRevealLayoutLeft instanceof RevealableListItem ? ((RevealableListItem) ListItemLayout.this.swipeToRevealLayoutLeft).getIntrinsicWidth() + swipeableListItem.getSwipeMaxOvershoot() : 0;
                    if (ListItemLayout.this.swipeToRevealLayoutRight instanceof RevealableListItem) {
                        return swipeableListItem.getSwipeMaxOvershoot() + ((RevealableListItem) ListItemLayout.this.swipeToRevealLayoutRight).getIntrinsicWidth() + intrinsicWidth;
                    }
                }
                return intrinsicWidth;
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public void onViewPositionChanged(@NonNull View view, int i2, int i3, int i4, int i5) {
                if (ListItemLayout.this.viewDragHelper != null && (ListItemLayout.this.contentView instanceof SwipeableListItem) && ListItemLayout.this.swipeToRevealLayoutExists()) {
                    super.onViewPositionChanged(view, i2, i3, i4, i5);
                    ListItemLayout.this.updateSwipeProgress(i2);
                    if (ListItemLayout.this.viewDragHelper.getViewDragState() != 1 || ListItemLayout.this.activeSwipeToRevealLayout == null) {
                        return;
                    }
                    ListItemLayout listItemLayout = ListItemLayout.this;
                    listItemLayout.setSwipeStateInternal(1, listItemLayout.getAbsoluteRevealGravity((View) listItemLayout.activeSwipeToRevealLayout));
                }
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public void onViewReleased(@NonNull View view, float f2, float f3) {
                int left;
                if ((ListItemLayout.this.contentView instanceof SwipeableListItem) && ListItemLayout.this.swipeToRevealLayoutExists() && (left = view.getLeft()) != ListItemLayout.this.originalContentViewLeft) {
                    int i2 = left > ListItemLayout.this.originalContentViewLeft ? 3 : 5;
                    RevealableListItem revealableListItem = i2 == 3 ? (RevealableListItem) ListItemLayout.this.swipeToRevealLayoutLeft : (RevealableListItem) ListItemLayout.this.swipeToRevealLayoutRight;
                    if (revealableListItem == null) {
                        return;
                    }
                    int iCalculateTargetSwipeState = calculateTargetSwipeState(i2, revealableListItem, f2, left);
                    ListItemLayout listItemLayout = ListItemLayout.this;
                    listItemLayout.startSettling(listItemLayout.contentView, iCalculateTargetSwipeState, i2);
                }
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public boolean tryCaptureView(@NonNull View view, int i2) {
                if ((!(ListItemLayout.this.contentView instanceof SwipeableListItem) || ((SwipeableListItem) ListItemLayout.this.contentView).isSwipeEnabled()) && ListItemLayout.this.swipeToRevealLayoutExists() && ListItemLayout.this.contentView != null) {
                    ListItemLayout.this.viewDragHelper.captureChildView(ListItemLayout.this.contentView, i2);
                }
                return false;
            }
        });
    }

    private boolean ensureSwipeToRevealSetupIfNeeded() {
        if (!swipeToRevealLayoutExists() || this.contentView == null) {
            return false;
        }
        if (this.viewDragHelper == null) {
            this.viewDragHelper = createViewDragHelper();
        }
        if (this.gestureDetector == null) {
            this.gestureDetector = createGestureDetector();
        }
        if (this.swipeAccessibilityDelegate == null) {
            View.AccessibilityDelegate accessibilityDelegateCreateSwipeAccessibilityDelegate = createSwipeAccessibilityDelegate();
            this.swipeAccessibilityDelegate = accessibilityDelegateCreateSwipeAccessibilityDelegate;
            this.contentView.setAccessibilityDelegate(accessibilityDelegateCreateSwipeAccessibilityDelegate);
        }
        if (!getClipToPadding()) {
            return true;
        }
        this.originalClipToPadding = getClipToPadding();
        setClipToPadding(false);
        return true;
    }

    private int getAbsoluteHorizontalGravity(int i2) {
        int absoluteGravity = GravityCompat.getAbsoluteGravity(i2, getLayoutDirection()) & 7;
        if (absoluteGravity == 3) {
            return 3;
        }
        return (absoluteGravity != 5 && getLayoutDirection() == 1) ? 3 : 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getAbsoluteRevealGravity(@NonNull View view) {
        return ListItemUtils.isRightAligned(view) ? 5 : 3;
    }

    private int getOffsetForSwipeState(int i2, int i3) {
        if (!swipeToRevealLayoutExistsForGravity(i3)) {
            throw new IllegalArgumentException(AbstractC0271e0.m396d(i3, "No RevealableListItem with gravity "));
        }
        if (i2 == 3) {
            return getSwipeViewClosedOffset();
        }
        if (i2 == 4) {
            return getSwipeRevealViewRevealedOffset(i3);
        }
        if (i2 == 5) {
            return getSwipeToActionOffset(i3);
        }
        throw new IllegalArgumentException(AbstractC0271e0.m396d(i2, "Invalid state to get swipe offset: "));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public int getSwipeRevealViewRevealedOffset(int i2) {
        View view;
        View view2;
        int i3;
        View view3;
        if (isRevealGravityLeft(i2)) {
            view3 = this.swipeToRevealLayoutLeft;
        } else {
            view = this.swipeToRevealLayoutRight;
        }
        if (view2 == 0) {
            view2 = view;
            view2 = view3;
            return 0;
        }
        view2 = view;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view2.getLayoutParams();
        int intrinsicWidth = ((RevealableListItem) view2).getIntrinsicWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
        if (isRevealGravityLeft(i2)) {
            view2 = view3;
            i3 = 1;
        } else {
            view2 = view3;
            i3 = -1;
        }
        return (i3 * intrinsicWidth) + this.originalContentViewLeft;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getSwipeToActionOffset(int i2) {
        View view = this.contentView;
        if (view == null) {
            return 0;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return ((isRevealGravityLeft(i2) ? 1 : -1) * (this.contentView.getMeasuredWidth() + layoutParams.leftMargin + layoutParams.rightMargin)) + this.originalContentViewLeft;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getSwipeViewClosedOffset() {
        return this.originalContentViewLeft;
    }

    private boolean isRevealGravityLeft(int i2) {
        return getAbsoluteHorizontalGravity(i2) == 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setSwipeState$0(boolean z, int i2, int i3) {
        if (z) {
            startSettling(this.contentView, i2, i3);
            return;
        }
        ViewDragHelper viewDragHelper = this.viewDragHelper;
        if (viewDragHelper != null) {
            viewDragHelper.abort();
        }
        int offsetForSwipeState = getOffsetForSwipeState(i2, i3);
        View view = this.contentView;
        view.offsetLeftAndRight(offsetForSwipeState - view.getLeft());
        updateSwipeProgress(offsetForSwipeState);
        setSwipeStateInternal(i2, i3);
    }

    private void layoutRevealView(@NonNull View view, int i2, int i3) {
        int measuredWidth;
        int measuredWidth2;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        if (ListItemUtils.isRightAligned(view)) {
            measuredWidth2 = i3 - layoutParams.rightMargin;
            measuredWidth = measuredWidth2 - view.getMeasuredWidth();
        } else {
            measuredWidth = i2 + layoutParams.leftMargin;
            measuredWidth2 = view.getMeasuredWidth() + measuredWidth;
        }
        view.layout(measuredWidth, view.getTop(), measuredWidth2, view.getBottom());
    }

    private void maybeSwapRevealLayoutsForGravity() {
        View view = this.swipeToRevealLayoutLeft;
        boolean z = false;
        boolean z2 = view != null && ListItemUtils.isRightAligned(view);
        View view2 = this.swipeToRevealLayoutRight;
        if (view2 != null && !ListItemUtils.isRightAligned(view2)) {
            z = true;
        }
        if (z2 && z) {
            View view3 = this.swipeToRevealLayoutLeft;
            this.swipeToRevealLayoutLeft = this.swipeToRevealLayoutRight;
            this.swipeToRevealLayoutRight = view3;
            this.revealViewOffset *= -1;
            return;
        }
        if (z2) {
            if (this.swipeToRevealLayoutRight != null) {
                throw new IllegalStateException("Cannot have more than one RevealableListItem with the same absolute gravity.");
            }
            this.swipeToRevealLayoutRight = this.swipeToRevealLayoutLeft;
            this.swipeToRevealLayoutLeft = null;
            this.revealViewOffset *= -1;
            return;
        }
        if (z) {
            if (this.swipeToRevealLayoutLeft != null) {
                throw new IllegalStateException("Cannot have more than one RevealableListItem with the same absolute gravity.");
            }
            this.swipeToRevealLayoutLeft = this.swipeToRevealLayoutRight;
            this.swipeToRevealLayoutRight = null;
            this.revealViewOffset *= -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void setSwipeStateInternal(int i2, int i3) {
        RevealableListItem revealableListItem;
        Object obj;
        int absoluteHorizontalGravity = getAbsoluteHorizontalGravity(i3);
        if (i2 == this.swipeState && ((obj = this.activeSwipeToRevealLayout) == null || getAbsoluteRevealGravity((View) obj) == absoluteHorizontalGravity)) {
            return;
        }
        if (i2 == 3 || swipeToRevealLayoutExistsForGravity(absoluteHorizontalGravity)) {
            if (i2 == 5 && ((revealableListItem = this.activeSwipeToRevealLayout) == null || revealableListItem.getPrimaryActionSwipeMode() == 0)) {
                return;
            }
            RevealableListItem revealableListItem2 = isRevealGravityLeft(absoluteHorizontalGravity) ? (RevealableListItem) this.swipeToRevealLayoutLeft : (RevealableListItem) this.swipeToRevealLayoutRight;
            this.activeSwipeToRevealLayout = revealableListItem2;
            this.swipeState = i2;
            if (i2 != 1 && i2 != 2) {
                this.lastStableSwipeState = i2;
            }
            if (revealableListItem2 != 0) {
                absoluteHorizontalGravity = ((FrameLayout.LayoutParams) ((View) revealableListItem2).getLayoutParams()).gravity;
            }
            SwipeableListItem swipeableListItem = (SwipeableListItem) this.contentView;
            View viewCastToView = castToView(this.activeSwipeToRevealLayout);
            if (absoluteHorizontalGravity == -1) {
                absoluteHorizontalGravity = GravityCompat.END;
            }
            swipeableListItem.onSwipeStateChanged(i2, viewCastToView, absoluteHorizontalGravity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startSettling(View view, int i2, int i3) {
        if (this.viewDragHelper == null) {
            return;
        }
        int offsetForSwipeState = getOffsetForSwipeState(i2, i3);
        if (!(i2 == 4 ? this.viewDragHelper.smoothSlideViewTo(view, offsetForSwipeState, view.getTop(), SETTLING_DURATION, (Interpolator) CUBIC_BEZIER_INTERPOLATOR) : this.viewDragHelper.smoothSlideViewTo(view, offsetForSwipeState, view.getTop()))) {
            setSwipeStateInternal(i2, i3);
        } else {
            setSwipeStateInternal(2, i3);
            this.stateSettlingTracker.continueSettlingToState(i2, i3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean swipeToRevealLayoutExists() {
        return (this.swipeToRevealLayoutLeft instanceof RevealableListItem) || (this.swipeToRevealLayoutRight instanceof RevealableListItem);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean swipeToRevealLayoutExistsForGravity(int i2) {
        maybeSwapRevealLayoutsForGravity();
        return isRevealGravityLeft(i2) ? this.swipeToRevealLayoutLeft instanceof RevealableListItem : this.swipeToRevealLayoutRight instanceof RevealableListItem;
    }

    private void updateAlphaFade(int i2, int i3) {
        int swipeViewClosedOffset = i3 == i2 ? (getSwipeViewClosedOffset() + i2) / 2 : (i3 + i2) / 2;
        this.contentView.setAlpha(AnimationUtils.lerp(1.0f, 0.0f, (this.revealViewOffset - swipeViewClosedOffset) / (i2 - swipeViewClosedOffset)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:18:0x002b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x002d  */
    /* JADX WARN: Code duplicated, block: B:21:0x0033  */
    public void updateSwipeProgress(int i2) {
        KeyEvent.Callback callback;
        if ((this.contentView instanceof SwipeableListItem) && swipeToRevealLayoutExists()) {
            int i3 = i2 - this.originalContentViewLeft;
            this.revealViewOffset = i3;
            boolean z = i3 > 0;
            boolean z2 = i3 < 0;
            if (z) {
                KeyEvent.Callback callback2 = this.swipeToRevealLayoutLeft;
                if (callback2 instanceof RevealableListItem) {
                    this.activeSwipeToRevealLayout = (RevealableListItem) callback2;
                } else if (z2) {
                    callback = this.swipeToRevealLayoutRight;
                    if (callback instanceof RevealableListItem) {
                        this.activeSwipeToRevealLayout = (RevealableListItem) callback;
                    }
                }
            } else if (z2) {
                callback = this.swipeToRevealLayoutRight;
                if (callback instanceof RevealableListItem) {
                    this.activeSwipeToRevealLayout = (RevealableListItem) callback;
                }
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.contentView.getLayoutParams();
            View view = this.swipeToRevealLayoutLeft;
            if (view instanceof RevealableListItem) {
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) view.getLayoutParams();
                int iMax = Math.max(0, ((Math.abs(this.originalContentViewLeft - this.contentView.getLeft()) - layoutParams.leftMargin) - layoutParams2.getMarginStart()) - layoutParams2.getMarginEnd());
                if (!z) {
                    iMax = 0;
                }
                ((RevealableListItem) this.swipeToRevealLayoutLeft).setRevealedWidth(iMax);
            }
            View view2 = this.swipeToRevealLayoutRight;
            if (view2 instanceof RevealableListItem) {
                FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) view2.getLayoutParams();
                ((RevealableListItem) this.swipeToRevealLayoutRight).setRevealedWidth(z2 ? Math.max(0, ((Math.abs(this.originalContentViewLeft - this.contentView.getLeft()) - layoutParams.rightMargin) - layoutParams3.getMarginStart()) - layoutParams3.getMarginEnd()) : 0);
            }
            ((SwipeableListItem) this.contentView).onSwipe(this.revealViewOffset);
            if (z2 && (this.swipeToRevealLayoutRight instanceof RevealableListItem)) {
                updateAlphaFade(getSwipeToActionOffset(5), getSwipeRevealViewRevealedOffset(5));
            } else if (z && (this.swipeToRevealLayoutLeft instanceof RevealableListItem)) {
                updateAlphaFade(getSwipeToActionOffset(3), getSwipeRevealViewRevealedOffset(3));
            } else {
                this.contentView.setAlpha(1.0f);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i2, layoutParams);
        if (!(view instanceof RevealableListItem)) {
            if (this.contentView != null && (view instanceof SwipeableListItem)) {
                throw new UnsupportedOperationException("Only one SwipeableListItem view is allowed in a ListItemLayout.");
            }
            if (view instanceof SwipeableListItem) {
                this.contentView = view;
                return;
            }
            return;
        }
        if (ListItemUtils.isRightAligned(view)) {
            if (this.swipeToRevealLayoutRight != null) {
                throw new UnsupportedOperationException("Only one RevealableListItem with end gravity is supported.");
            }
            this.swipeToRevealLayoutRight = view;
        } else {
            if (this.swipeToRevealLayoutLeft != null) {
                throw new UnsupportedOperationException("Only one RevealableListItem with start gravity is supported.");
            }
            this.swipeToRevealLayoutLeft = view;
        }
        ((RevealableListItem) view).setRevealedWidth(0);
        view.setElevation(getElevation() - 1.0f);
    }

    public int getSwipeState() {
        return this.swipeState;
    }

    @Override // android.view.ViewGroup, android.view.View
    public int[] onCreateDrawableState(int i2) {
        return this.positionState == null ? super.onCreateDrawableState(i2) : View.mergeDrawableStates(super.onCreateDrawableState(i2 + 1), this.positionState);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!ensureSwipeToRevealSetupIfNeeded()) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 3 || actionMasked == 1) {
            this.viewDragHelper.cancel();
            return false;
        }
        this.gestureDetector.onTouchEvent(motionEvent);
        return this.viewDragHelper.shouldInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        maybeSwapRevealLayoutsForGravity();
        if (this.contentView != null && swipeToRevealLayoutExists() && ensureSwipeToRevealSetupIfNeeded()) {
            this.originalContentViewLeft = this.contentView.getLeft();
            int right = this.contentView.getRight();
            this.contentView.offsetLeftAndRight(this.revealViewOffset);
            View view = this.swipeToRevealLayoutLeft;
            if (view != null) {
                layoutRevealView(view, this.originalContentViewLeft, right);
            }
            View view2 = this.swipeToRevealLayoutRight;
            if (view2 != null) {
                layoutRevealView(view2, this.originalContentViewLeft, right);
            }
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (ensureSwipeToRevealSetupIfNeeded()) {
            this.viewDragHelper.processTouchEvent(motionEvent);
            this.gestureDetector.onTouchEvent(motionEvent);
            if (this.viewDragHelper.getViewDragState() == 1) {
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view == this.swipeToRevealLayoutLeft) {
            this.swipeToRevealLayoutLeft = null;
        } else if (view == this.swipeToRevealLayoutRight) {
            this.swipeToRevealLayoutRight = null;
        } else if (this.contentView == view) {
            this.contentView = null;
        }
        if (!swipeToRevealLayoutExists() || this.contentView == null) {
            this.viewDragHelper = null;
            this.gestureDetector = null;
            this.swipeAccessibilityDelegate = null;
            setClipToPadding(this.originalClipToPadding);
        }
    }

    public <T extends View & RevealableListItem> void setSwipeState(int i2, @NonNull T t) {
        setSwipeState(i2, (View) t, true);
    }

    public void updateAppearance(int i2, int i3) {
        if (i2 < 0 || i3 < 0) {
            this.positionState = null;
        } else if (i3 == 1) {
            this.positionState = SINGLE_STATE_SET;
        } else if (i2 == 0) {
            this.positionState = FIRST_STATE_SET;
        } else if (i2 == i3 - 1) {
            this.positionState = LAST_STATE_SET;
        } else {
            this.positionState = MIDDLE_STATE_SET;
        }
        refreshDrawableState();
    }

    public ListItemLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, C5183R.attr.listItemLayoutStyle);
    }

    public <T extends View & RevealableListItem> void setSwipeState(int i2, @NonNull T t, boolean z) {
        if (t != this.swipeToRevealLayoutLeft && t != this.swipeToRevealLayoutRight) {
            throw new IllegalArgumentException("revealView must be a child of ListItemLayout.");
        }
        setSwipeState(i2, ((FrameLayout.LayoutParams) t.getLayoutParams()).gravity, z);
    }

    public ListItemLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, C5183R.style.Widget_Material3_ListItemLayout);
    }

    public ListItemLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i2, int i3) {
        super(MaterialThemeOverlay.wrap(context, attributeSet, i2, i3), attributeSet, i2);
        this.swipeState = 3;
        this.lastStableSwipeState = 3;
        this.stateSettlingTracker = new StateSettlingTracker();
        getContext();
    }

    public void setSwipeState(int i2, int i3) {
        setSwipeState(i2, i3, true);
    }

    public void setSwipeState(final int i2, final int i3, final boolean z) {
        if (i2 != 3 && i2 != 4 && i2 != 5) {
            throw new IllegalArgumentException(AbstractC0271e0.m396d(i2, "Invalid swipe state: "));
        }
        if ((this.contentView instanceof SwipeableListItem) && swipeToRevealLayoutExists()) {
            if (i2 != 3 && !swipeToRevealLayoutExistsForGravity(i3)) {
                throw new IllegalArgumentException(AbstractC0271e0.m396d(i3, "No RevealableListItem is defined for the given gravity: "));
            }
            Runnable runnable = new Runnable() { // from class: com.google.android.material.listitem.a
                @Override // java.lang.Runnable
                public final void run() {
                    this.f23440s.lambda$setSwipeState$0(z, i2, i3);
                }
            };
            if (isLaidOut()) {
                runnable.run();
                return;
            } else {
                post(runnable);
                return;
            }
        }
        throw new IllegalArgumentException("ListItemLayout must have a SwipeableListItem child and a RevealableListItem child to be swiped.");
    }

    public void updateAppearance(int i2) {
        if (i2 == 0) {
            this.positionState = FIRST_STATE_SET;
        } else if (i2 == 1) {
            this.positionState = MIDDLE_STATE_SET;
        } else if (i2 == 2) {
            this.positionState = LAST_STATE_SET;
        } else if (i2 == 3) {
            this.positionState = SINGLE_STATE_SET;
        }
        refreshDrawableState();
    }
}
