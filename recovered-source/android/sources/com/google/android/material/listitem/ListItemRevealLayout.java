package com.google.android.material.listitem;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.appcompat.widget.TintTypedArray;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.core.view.ViewCompat;
import com.google.android.material.C5183R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import java.lang.ref.WeakReference;
import p011H.AbstractC0271e0;

/* JADX INFO: loaded from: classes2.dex */
public class ListItemRevealLayout extends ViewGroup implements RevealableListItem {
    private static final int UNSET = -1;
    private int intrinsicHeight;
    private int intrinsicWidth;
    private int minChildWidth;
    private int[] originalChildHeights;
    private int[] originalChildWidths;
    private int originalHeightMeasureSpec;
    private int originalWidthMeasureSpec;
    private int primaryActionSwipeMode;
    private int revealedWidth;

    @Nullable
    private WeakReference<View> siblingSwipeableView;

    public ListItemRevealLayout(Context context) {
        this(context, null);
    }

    private int calculateFullRevealableWidth() {
        WeakReference<View> weakReference = this.siblingSwipeableView;
        if (weakReference == null || weakReference.get() == null) {
            return getParent() instanceof View ? ((View) getParent()).getMeasuredWidth() : this.intrinsicWidth;
        }
        return this.siblingSwipeableView.get().getMeasuredWidth();
    }

    @Nullable
    private Integer findFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            if (getChildAt(i2).getVisibility() != 8) {
                return Integer.valueOf(i2);
            }
        }
        return null;
    }

    @Nullable
    private Integer findLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (getChildAt(childCount).getVisibility() != 8) {
                return Integer.valueOf(childCount);
            }
        }
        return null;
    }

    @Nullable
    private View findSiblingSwipeableView() {
        if (!(getParent() instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) getParent();
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if (childAt instanceof SwipeableListItem) {
                return childAt;
            }
        }
        return null;
    }

    private void measureByGrowingPrimarySwipeAction(int i2) {
        Integer numFindFirstVisibleChildIndex = ListItemUtils.isRightAligned(this) == (getLayoutDirection() == 1) ? findFirstVisibleChildIndex() : findLastVisibleChildIndex();
        if (numFindFirstVisibleChildIndex != null) {
            int paddingEnd = getPaddingEnd() + getPaddingStart();
            int i3 = this.revealedWidth;
            int i4 = this.intrinsicWidth;
            float fMax = Math.max(0.0f, Math.min(1.0f, (i3 - i4) / (i2 - i4)));
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                if (childAt.getVisibility() != 8 && i5 != numFindFirstVisibleChildIndex.intValue()) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(AnimationUtils.lerp(Math.max(this.originalChildWidths[i5], this.minChildWidth), this.minChildWidth, fMax), BasicMeasure.EXACTLY), View.MeasureSpec.makeMeasureSpec(this.originalChildHeights[i5], BasicMeasure.EXACTLY));
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
                    int i6 = marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + this.minChildWidth + paddingEnd;
                    if (childAt instanceof MaterialButton) {
                        MaterialButton materialButton = (MaterialButton) childAt;
                        if (materialButton.getIcon() != null) {
                            materialButton.getIcon().setAlpha(AnimationUtils.lerp(255, 0, fMax));
                        }
                    }
                    paddingEnd = i6;
                }
            }
            View childAt2 = getChildAt(numFindFirstVisibleChildIndex.intValue());
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) childAt2.getLayoutParams();
            childAt2.measure(View.MeasureSpec.makeMeasureSpec(AnimationUtils.lerp(this.originalChildWidths[numFindFirstVisibleChildIndex.intValue()], ((i2 - paddingEnd) - marginLayoutParams2.rightMargin) - marginLayoutParams2.leftMargin, fMax) + Math.max(this.revealedWidth - i2, 0), BasicMeasure.EXACTLY), View.MeasureSpec.makeMeasureSpec(this.originalChildHeights[numFindFirstVisibleChildIndex.intValue()], BasicMeasure.EXACTLY));
            if (childAt2 instanceof MaterialButton) {
                MaterialButton materialButton2 = (MaterialButton) childAt2;
                if (materialButton2.getIcon() != null) {
                    materialButton2.getIcon().setAlpha(255);
                }
            }
        }
        setMeasuredDimension(this.revealedWidth, this.intrinsicHeight);
    }

    private void measureByPreservingSwipeActionRatios(int i2) {
        int i3 = this.intrinsicWidth;
        int iLerp = (int) AnimationUtils.lerp(0.0f, 255.0f, i3 / 4.0f, i3 / 2.0f, this.revealedWidth);
        float f2 = this.revealedWidth / this.intrinsicWidth;
        int paddingLeft = (int) (getPaddingLeft() * f2);
        int paddingRight = (int) (getPaddingRight() * f2);
        int iM395c = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                int iMax = Math.max(this.minChildWidth, (int) (this.originalChildWidths[i4] * f2));
                childAt.measure(View.MeasureSpec.makeMeasureSpec(iMax, BasicMeasure.EXACTLY), View.MeasureSpec.makeMeasureSpec(this.originalChildHeights[i4], BasicMeasure.EXACTLY));
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
                iM395c = AbstractC0271e0.m395c(iMax, (int) (marginLayoutParams.leftMargin * f2), (int) (marginLayoutParams.rightMargin * f2), iM395c);
                if (childAt instanceof MaterialButton) {
                    MaterialButton materialButton = (MaterialButton) childAt;
                    if (materialButton.getIcon() != null) {
                        materialButton.getIcon().setAlpha(iLerp);
                    }
                }
            }
        }
        setMeasuredDimension(Math.max(this.revealedWidth, iM395c + paddingLeft + paddingRight), this.intrinsicHeight);
    }

    private void saveOriginalChildSizes(int i2) {
        this.originalChildWidths = new int[i2];
        this.originalChildHeights = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                this.originalChildWidths[i3] = childAt.getMeasuredWidth();
                this.originalChildHeights[i3] = childAt.getMeasuredHeight();
                if (((ViewGroup.MarginLayoutParams) childAt.getLayoutParams()).height == -1) {
                    this.originalChildHeights[i3] = this.intrinsicHeight;
                }
            }
        }
    }

    private boolean shouldRemeasureIntrinsicSizes(int i2, int i3, int i4) {
        int mode;
        if (i4 == -1) {
            return true;
        }
        return (i2 == i3 || (mode = View.MeasureSpec.getMode(i3)) == 0 || (mode == 1073741824 && View.MeasureSpec.getSize(i3) == i4)) ? false : true;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-2, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // com.google.android.material.listitem.RevealableListItem
    @Px
    public int getIntrinsicWidth() {
        int i2 = this.intrinsicWidth;
        if (i2 != -1) {
            return i2;
        }
        return 0;
    }

    @Px
    public int getMinChildWidth() {
        return this.minChildWidth;
    }

    @Override // com.google.android.material.listitem.RevealableListItem
    public int getPrimaryActionSwipeMode() {
        return this.primaryActionSwipeMode;
    }

    public void measureIntrinsicSize(int i2, int i3) {
        int i4;
        int i5;
        int childCount = getChildCount();
        int i6 = 0;
        int measuredWidth = 0;
        int iMax = 0;
        int iCombineMeasuredStates = 0;
        while (i6 < childCount) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() == 8) {
                i4 = i2;
                i5 = i3;
            } else {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
                i4 = i2;
                i5 = i3;
                measureChildWithMargins(childAt, i4, measuredWidth, i5, 0);
                measuredWidth += childAt.getMeasuredWidth() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
                iMax = Math.max(iMax, childAt.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin);
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
            }
            i6++;
            i2 = i4;
            i3 = i5;
        }
        int i7 = i2;
        int i8 = i3;
        int iMax2 = Math.max(getPaddingRight() + getPaddingLeft() + measuredWidth, getSuggestedMinimumWidth());
        int iResolveSizeAndState = View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + iMax, getSuggestedMinimumHeight()), i8, 0) & ViewCompat.MEASURED_SIZE_MASK;
        this.intrinsicWidth = View.resolveSizeAndState(iMax2, i7, 0);
        this.intrinsicHeight = View.resolveSizeAndState(iResolveSizeAndState, i8, iCombineMeasuredStates << 16);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        int i6;
        int i7 = this.revealedWidth;
        int i8 = this.intrinsicWidth;
        float f2 = i7 >= i8 ? 1.0f : i7 / i8;
        int paddingLeft = (int) (getPaddingLeft() * f2);
        int paddingTop = getPaddingTop();
        int childCount = getChildCount();
        int i9 = 1;
        if (getLayoutDirection() == 1) {
            i6 = childCount - 1;
            i9 = -1;
        } else {
            i6 = 0;
        }
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt((i9 * i10) + i6);
            if (childAt.getVisibility() != 8) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i11 = marginLayoutParams.topMargin + paddingTop;
                int i12 = (int) (marginLayoutParams.leftMargin * f2);
                int i13 = (int) (marginLayoutParams.rightMargin * f2);
                int i14 = paddingLeft + i12;
                childAt.layout(i14, i11, i14 + measuredWidth, measuredHeight + i11);
                paddingLeft = i12 + measuredWidth + i13 + paddingLeft;
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i2, int i3) {
        int childCount = getChildCount();
        if (shouldRemeasureIntrinsicSizes(this.originalHeightMeasureSpec, i3, this.intrinsicHeight) || shouldRemeasureIntrinsicSizes(this.originalWidthMeasureSpec, i2, this.intrinsicWidth)) {
            this.originalHeightMeasureSpec = i3;
            this.originalWidthMeasureSpec = i2;
            measureIntrinsicSize(i2, i3);
            saveOriginalChildSizes(childCount);
        }
        WeakReference<View> weakReference = this.siblingSwipeableView;
        if (weakReference == null || weakReference.get() == null) {
            this.siblingSwipeableView = new WeakReference<>(findSiblingSwipeableView());
        }
        int swipeMaxOvershoot = this.siblingSwipeableView.get() != null ? ((SwipeableListItem) this.siblingSwipeableView.get()).getSwipeMaxOvershoot() : 0;
        int iCalculateFullRevealableWidth = calculateFullRevealableWidth();
        setVisibility(this.revealedWidth == 0 ? 4 : 0);
        int i4 = this.revealedWidth;
        if (i4 == 0) {
            setMeasuredDimension(0, this.intrinsicHeight);
            return;
        }
        if (childCount == 0) {
            setMeasuredDimension(i4, this.intrinsicHeight);
            return;
        }
        if (this.primaryActionSwipeMode != 0) {
            int i5 = this.intrinsicWidth;
            if (i4 > swipeMaxOvershoot + i5 && iCalculateFullRevealableWidth > i5) {
                measureByGrowingPrimarySwipeAction(iCalculateFullRevealableWidth);
                return;
            }
        }
        measureByPreservingSwipeActionRatios(childCount);
    }

    public void resetIntrinsicWidth() {
        this.intrinsicWidth = -1;
        requestLayout();
    }

    public void setMinChildWidth(@Px int i2) {
        if (this.minChildWidth == i2) {
            return;
        }
        this.minChildWidth = i2;
        requestLayout();
    }

    @Override // com.google.android.material.listitem.RevealableListItem
    public void setPrimaryActionSwipeMode(int i2) {
        this.primaryActionSwipeMode = i2;
    }

    @Override // com.google.android.material.listitem.RevealableListItem
    public void setRevealedWidth(int i2) {
        int iMax = Math.max(0, i2);
        if (this.revealedWidth == iMax) {
            return;
        }
        this.revealedWidth = iMax;
        requestLayout();
    }

    public ListItemRevealLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C5183R.attr.listItemRevealLayoutStyle);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ViewGroup.MarginLayoutParams(layoutParams);
    }

    public ListItemRevealLayout(Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, C5183R.style.Widget_Material3_ListItemRevealLayout);
    }

    public ListItemRevealLayout(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(MaterialThemeOverlay.wrap(context, attributeSet, i2, i3), attributeSet, i2);
        this.intrinsicWidth = -1;
        this.intrinsicHeight = -1;
        this.revealedWidth = 0;
        this.originalWidthMeasureSpec = -1;
        this.originalHeightMeasureSpec = -1;
        Context context2 = getContext();
        setClipToPadding(false);
        TintTypedArray tintTypedArrayObtainTintedStyledAttributes = ThemeEnforcement.obtainTintedStyledAttributes(context2, attributeSet, C5183R.styleable.ListItemRevealLayout, i2, i3, new int[0]);
        this.minChildWidth = tintTypedArrayObtainTintedStyledAttributes.getDimensionPixelSize(C5183R.styleable.ListItemRevealLayout_minChildWidth, getResources().getDimensionPixelSize(C5183R.dimen.m3_list_reveal_min_child_width));
        this.primaryActionSwipeMode = tintTypedArrayObtainTintedStyledAttributes.getInt(C5183R.styleable.ListItemRevealLayout_primaryActionSwipeMode, 0);
        tintTypedArrayObtainTintedStyledAttributes.recycle();
    }
}
