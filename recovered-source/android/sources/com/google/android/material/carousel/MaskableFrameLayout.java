package com.google.android.material.carousel;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.constraintlayout.core.state.C1106a;
import androidx.core.math.MathUtils;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.focus.FocusRingDrawable;
import com.google.android.material.shape.AbsoluteCornerSize;
import com.google.android.material.shape.ClampedCornerSize;
import com.google.android.material.shape.CornerSize;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.Shapeable;
import com.google.android.material.shape.ShapeableDelegate;
import p001B.C0099y;

/* JADX INFO: loaded from: classes2.dex */
public class MaskableFrameLayout extends FrameLayout implements Maskable, Shapeable {
    private static final int NOT_SET = -1;

    @Nullable
    private View.OnHoverListener hoverListener;
    private boolean isHovered;
    private final RectF maskRect;
    private float maskXPercentage;

    @Nullable
    private OnMaskChangedListener onMaskChangedListener;

    @Nullable
    private Boolean savedForceCompatClippingEnabled;
    private final Rect screenBoundsRect;

    @NonNull
    private ShapeAppearanceModel shapeAppearanceModel;
    private final ShapeableDelegate shapeableDelegate;

    public MaskableFrameLayout(@NonNull Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$dispatchDraw$1(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ CornerSize lambda$setShapeAppearanceModel$0(CornerSize cornerSize) {
        return cornerSize instanceof AbsoluteCornerSize ? ClampedCornerSize.createFromCornerSize((AbsoluteCornerSize) cornerSize) : cornerSize;
    }

    private void maybeUpdateFocusRingDrawableShapeAppearance(@Nullable Drawable drawable, @NonNull ShapeAppearanceModel shapeAppearanceModel) {
        FocusRingDrawable focusRingDrawableFindAndMutate = FocusRingDrawable.findAndMutate(drawable);
        if (focusRingDrawableFindAndMutate != null) {
            focusRingDrawableFindAndMutate.setFocusRingShapeAppearance(shapeAppearanceModel);
        }
    }

    private void onMaskChanged() {
        this.shapeableDelegate.onMaskChanged(this, this.maskRect);
        OnMaskChangedListener onMaskChangedListener = this.onMaskChangedListener;
        if (onMaskChangedListener != null) {
            onMaskChangedListener.onMaskChanged(this.maskRect);
        }
    }

    private void updateMaskRectForMaskXPercentage() {
        if (this.maskXPercentage != -1.0f) {
            float fLerp = AnimationUtils.lerp(0.0f, getWidth() / 2.0f, 0.0f, 1.0f, this.maskXPercentage);
            setMaskRectF(new RectF(fLerp, 0.0f, getWidth() - fLerp, getHeight()));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        this.shapeableDelegate.maybeClip(canvas, new C1106a(this, 4));
    }

    @Override // android.view.View
    public void getFocusedRect(Rect rect) {
        RectF rectF = this.maskRect;
        rect.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
    }

    @Override // com.google.android.material.carousel.Maskable
    @NonNull
    public RectF getMaskRectF() {
        return this.maskRect;
    }

    @Override // com.google.android.material.carousel.Maskable
    @Deprecated
    public float getMaskXPercentage() {
        return this.maskXPercentage;
    }

    @Override // com.google.android.material.shape.Shapeable
    @NonNull
    public ShapeAppearanceModel getShapeAppearanceModel() {
        return this.shapeAppearanceModel;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Boolean bool = this.savedForceCompatClippingEnabled;
        if (bool != null) {
            this.shapeableDelegate.setForceCompatClippingEnabled(this, bool.booleanValue());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.savedForceCompatClippingEnabled = Boolean.valueOf(this.shapeableDelegate.isForceCompatClippingEnabled());
        this.shapeableDelegate.setForceCompatClippingEnabled(this, true);
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (!this.maskRect.isEmpty() && (action == 9 || action == 10 || action == 7)) {
            if (!this.maskRect.contains(motionEvent.getX(), motionEvent.getY())) {
                if (this.isHovered && this.hoverListener != null) {
                    motionEvent.setAction(10);
                    this.hoverListener.onHover(this, motionEvent);
                }
                this.isHovered = false;
                return false;
            }
        }
        if (this.hoverListener != null) {
            if (!this.isHovered && action == 7) {
                motionEvent.setAction(9);
                this.isHovered = true;
            }
            if (action == 7 || action == 9) {
                this.isHovered = true;
            }
            this.hoverListener.onHover(this, motionEvent);
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.getBoundsInScreen(this.screenBoundsRect);
        if (getX() > 0.0f) {
            Rect rect = this.screenBoundsRect;
            rect.left = (int) (rect.left + this.maskRect.left);
        }
        if (getY() > 0.0f) {
            Rect rect2 = this.screenBoundsRect;
            rect2.top = (int) (rect2.top + this.maskRect.top);
        }
        Rect rect3 = this.screenBoundsRect;
        rect3.right = Math.round(this.maskRect.width()) + rect3.left;
        Rect rect4 = this.screenBoundsRect;
        rect4.bottom = Math.round(this.maskRect.height()) + rect4.top;
        accessibilityNodeInfo.setBoundsInScreen(this.screenBoundsRect);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.maskRect.isEmpty()) {
            if (!this.maskRect.contains(motionEvent.getX(), motionEvent.getY())) {
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        if (this.maskXPercentage != -1.0f) {
            updateMaskRectForMaskXPercentage();
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.maskRect.isEmpty() && motionEvent.getAction() == 0) {
            if (!this.maskRect.contains(motionEvent.getX(), motionEvent.getY())) {
                return false;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @VisibleForTesting
    public void setForceCompatClipping(boolean z) {
        this.shapeableDelegate.setForceCompatClippingEnabled(this, z);
    }

    @Override // com.google.android.material.carousel.Maskable
    public void setMaskRectF(@NonNull RectF rectF) {
        this.maskRect.set(rectF);
        onMaskChanged();
    }

    @Override // com.google.android.material.carousel.Maskable
    @Deprecated
    public void setMaskXPercentage(float f2) {
        float fClamp = MathUtils.clamp(f2, 0.0f, 1.0f);
        if (this.maskXPercentage != fClamp) {
            this.maskXPercentage = fClamp;
            updateMaskRectForMaskXPercentage();
        }
    }

    @Override // android.view.View
    public void setOnHoverListener(@Nullable View.OnHoverListener onHoverListener) {
        this.hoverListener = onHoverListener;
    }

    @Override // com.google.android.material.carousel.Maskable
    public void setOnMaskChangedListener(@Nullable OnMaskChangedListener onMaskChangedListener) {
        this.onMaskChangedListener = onMaskChangedListener;
    }

    @Override // com.google.android.material.shape.Shapeable
    public void setShapeAppearanceModel(@NonNull ShapeAppearanceModel shapeAppearanceModel) {
        ShapeAppearanceModel shapeAppearanceModelWithTransformedCornerSizes = shapeAppearanceModel.withTransformedCornerSizes(new C0099y(8));
        this.shapeAppearanceModel = shapeAppearanceModelWithTransformedCornerSizes;
        this.shapeableDelegate.onShapeAppearanceChanged(this, shapeAppearanceModelWithTransformedCornerSizes);
        maybeUpdateFocusRingDrawableShapeAppearance(getBackground(), this.shapeAppearanceModel);
        maybeUpdateFocusRingDrawableShapeAppearance(getForeground(), this.shapeAppearanceModel);
    }

    public MaskableFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MaskableFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.maskXPercentage = -1.0f;
        this.maskRect = new RectF();
        this.screenBoundsRect = new Rect();
        this.shapeableDelegate = ShapeableDelegate.create(this);
        this.savedForceCompatClippingEnabled = null;
        this.isHovered = false;
        setShapeAppearanceModel(ShapeAppearanceModel.builder(context, attributeSet, i2, 0, 0).build());
    }
}
