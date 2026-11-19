package com.google.android.material.loadingindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ProgressBar;
import androidx.annotation.AttrRes;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.C0956R;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import com.google.android.material.C5183R;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.progressindicator.AnimatorDurationScaleProvider;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class LoadingIndicator extends View implements Drawable.Callback {
    static final int DEF_STYLE_RES = C5183R.style.Widget_Material3_LoadingIndicator;
    static final int MAX_HIDE_DELAY = 1000;
    private final Runnable delayedHide;
    private final Runnable delayedShow;

    @NonNull
    private final LoadingIndicatorDrawable drawable;
    private long lastShowStartTime;
    private final int minHideDelay;
    private final int showDelay;

    @NonNull
    private final LoadingIndicatorSpec specs;

    public LoadingIndicator(@NonNull Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void internalHide() {
        getDrawable().setVisible(false, false, true);
        if (getDrawable().isVisible()) {
            return;
        }
        setVisibility(4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void internalShow() {
        if (this.minHideDelay > 0) {
            this.lastShowStartTime = SystemClock.uptimeMillis();
        }
        setVisibility(0);
    }

    @Override // android.view.View
    @NonNull
    public CharSequence getAccessibilityClassName() {
        return ProgressBar.class.getName();
    }

    @ColorInt
    public int getContainerColor() {
        return this.specs.containerColor;
    }

    @Px
    public int getContainerHeight() {
        return this.specs.containerHeight;
    }

    @Px
    public int getContainerWidth() {
        return this.specs.containerWidth;
    }

    @NonNull
    public LoadingIndicatorDrawable getDrawable() {
        return this.drawable;
    }

    @NonNull
    public int[] getIndicatorColor() {
        return this.specs.indicatorColors;
    }

    @Px
    public int getIndicatorSize() {
        return this.specs.indicatorSize;
    }

    public void hide() {
        if (getVisibility() != 0) {
            removeCallbacks(this.delayedShow);
            return;
        }
        removeCallbacks(this.delayedHide);
        long jUptimeMillis = SystemClock.uptimeMillis() - this.lastShowStartTime;
        int i2 = this.minHideDelay;
        if (jUptimeMillis >= i2) {
            this.delayedHide.run();
        } else {
            postDelayed(this.delayedHide, ((long) i2) - jUptimeMillis);
        }
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(@NonNull Drawable drawable) {
        invalidate();
    }

    public boolean isEffectivelyVisible() {
        View view = this;
        while (view.getVisibility() == 0) {
            Object parent = view.getParent();
            if (parent == null) {
                return getWindowVisibility() == 0;
            }
            if (!(parent instanceof View)) {
                return true;
            }
            view = (View) parent;
        }
        return false;
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (visibleToUser()) {
            internalShow();
        }
    }

    @Override // android.view.View
    public void onDraw(@NonNull Canvas canvas) {
        super.onDraw(canvas);
        int iSave = canvas.save();
        if (getPaddingLeft() != 0 || getPaddingTop() != 0) {
            canvas.translate(getPaddingLeft(), getPaddingTop());
        }
        if (getPaddingRight() != 0 || getPaddingBottom() != 0) {
            canvas.clipRect(0, 0, getWidth() - (getPaddingRight() + getPaddingLeft()), getHeight() - (getPaddingBottom() + getPaddingTop()));
        }
        this.drawable.draw(canvas);
        canvas.restoreToCount(iSave);
    }

    @Override // android.view.View
    public void onMeasure(int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i2);
        int size2 = View.MeasureSpec.getSize(i3);
        LoadingIndicatorDrawingDelegate drawingDelegate = this.drawable.getDrawingDelegate();
        int paddingRight = getPaddingRight() + getPaddingLeft() + drawingDelegate.getPreferredWidth();
        int paddingBottom = getPaddingBottom() + getPaddingTop() + drawingDelegate.getPreferredHeight();
        if (mode == Integer.MIN_VALUE) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(size, paddingRight), BasicMeasure.EXACTLY);
        } else if (mode == 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(paddingRight, BasicMeasure.EXACTLY);
        }
        if (mode2 == Integer.MIN_VALUE) {
            i3 = View.MeasureSpec.makeMeasureSpec(Math.min(size2, paddingBottom), BasicMeasure.EXACTLY);
        } else if (mode2 == 0) {
            i3 = View.MeasureSpec.makeMeasureSpec(paddingBottom, BasicMeasure.EXACTLY);
        }
        super.onMeasure(i2, i3);
    }

    @Override // android.view.View
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        this.drawable.setBounds(0, 0, i2, i3);
    }

    @Override // android.view.View
    public void onVisibilityChanged(@NonNull View view, int i2) {
        super.onVisibilityChanged(view, i2);
        this.drawable.setVisible(visibleToUser(), false, i2 == 0);
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i2) {
        super.onWindowVisibilityChanged(i2);
        this.drawable.setVisible(visibleToUser(), false, i2 == 0);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @VisibleForTesting
    public void setAnimatorDurationScaleProvider(@NonNull AnimatorDurationScaleProvider animatorDurationScaleProvider) {
        this.drawable.animatorDurationScaleProvider = animatorDurationScaleProvider;
    }

    public void setContainerColor(@ColorInt int i2) {
        LoadingIndicatorSpec loadingIndicatorSpec = this.specs;
        if (loadingIndicatorSpec.containerColor != i2) {
            loadingIndicatorSpec.containerColor = i2;
            invalidate();
        }
    }

    public void setContainerHeight(@Px int i2) {
        LoadingIndicatorSpec loadingIndicatorSpec = this.specs;
        if (loadingIndicatorSpec.containerHeight != i2) {
            loadingIndicatorSpec.containerHeight = i2;
            requestLayout();
            invalidate();
        }
    }

    public void setContainerWidth(@Px int i2) {
        LoadingIndicatorSpec loadingIndicatorSpec = this.specs;
        if (loadingIndicatorSpec.containerWidth != i2) {
            loadingIndicatorSpec.containerWidth = i2;
            requestLayout();
            invalidate();
        }
    }

    public void setIndicatorColor(@ColorInt int... iArr) {
        if (iArr.length == 0) {
            iArr = new int[]{MaterialColors.getColor(getContext(), C0956R.attr.colorPrimary, -1)};
        }
        if (Arrays.equals(getIndicatorColor(), iArr)) {
            return;
        }
        this.specs.indicatorColors = iArr;
        this.drawable.getAnimatorDelegate().invalidateSpecValues();
        invalidate();
    }

    public void setIndicatorSize(@Px int i2) {
        LoadingIndicatorSpec loadingIndicatorSpec = this.specs;
        if (loadingIndicatorSpec.indicatorSize != i2) {
            loadingIndicatorSpec.indicatorSize = i2;
            requestLayout();
            invalidate();
        }
    }

    public void show() {
        if (this.showDelay <= 0) {
            this.delayedShow.run();
        } else {
            removeCallbacks(this.delayedShow);
            postDelayed(this.delayedShow, this.showDelay);
        }
    }

    public boolean visibleToUser() {
        return isAttachedToWindow() && getWindowVisibility() == 0 && isEffectivelyVisible();
    }

    public LoadingIndicator(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, C5183R.attr.loadingIndicatorStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public LoadingIndicator(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i2) {
        int i3 = DEF_STYLE_RES;
        super(MaterialThemeOverlay.wrap(context, attributeSet, i2, i3), attributeSet, i2);
        this.lastShowStartTime = -1L;
        this.delayedShow = new Runnable() { // from class: com.google.android.material.loadingindicator.LoadingIndicator.1
            @Override // java.lang.Runnable
            public void run() {
                LoadingIndicator.this.internalShow();
            }
        };
        this.delayedHide = new Runnable() { // from class: com.google.android.material.loadingindicator.LoadingIndicator.2
            @Override // java.lang.Runnable
            public void run() {
                LoadingIndicator.this.internalHide();
                LoadingIndicator.this.lastShowStartTime = -1L;
            }
        };
        Context context2 = getContext();
        LoadingIndicatorDrawable loadingIndicatorDrawableCreate = LoadingIndicatorDrawable.create(context2, new LoadingIndicatorSpec(context2, attributeSet, i2));
        this.drawable = loadingIndicatorDrawableCreate;
        loadingIndicatorDrawableCreate.setCallback(this);
        this.specs = loadingIndicatorDrawableCreate.getDrawingDelegate().specs;
        TypedArray typedArrayObtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context2, attributeSet, C5183R.styleable.LoadingIndicator, i2, i3, new int[0]);
        this.showDelay = typedArrayObtainStyledAttributes.getInt(C5183R.styleable.LoadingIndicator_showDelay, -1);
        this.minHideDelay = Math.min(typedArrayObtainStyledAttributes.getInt(C5183R.styleable.LoadingIndicator_minHideDelay, -1), 1000);
        typedArrayObtainStyledAttributes.recycle();
        setAnimatorDurationScaleProvider(new AnimatorDurationScaleProvider());
    }
}
