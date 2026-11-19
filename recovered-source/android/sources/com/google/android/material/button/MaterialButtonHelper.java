package com.google.android.material.button;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import androidx.annotation.Dimension;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.dynamicanimation.animation.SpringForce;
import com.google.android.material.C5183R;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.focus.FocusRingDrawable;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.ripple.RippleUtils;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearance;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.Shapeable;
import com.google.android.material.shape.StateListShapeAppearanceModel;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
class MaterialButtonHelper {

    @Nullable
    private ColorStateList backgroundTint;

    @Nullable
    private PorterDuff.Mode backgroundTintMode;
    private boolean checkable;
    private int cornerRadius;

    @Nullable
    private SpringForce cornerSpringForce;
    private int elevation;
    private int insetBottom;
    private int insetLeft;
    private int insetRight;
    private int insetTop;

    @Nullable
    private Drawable maskDrawable;
    private final MaterialButton materialButton;

    @Nullable
    private MaterialShapeDrawable.OnCornerSizeChangeListener onCornerSizeChangeListener;

    @Nullable
    private ColorStateList rippleColor;
    private RippleDrawable rippleDrawable;

    @NonNull
    private ShapeAppearance shapeAppearance;

    @Nullable
    private ColorStateList strokeColor;
    private int strokeWidth;
    private boolean shouldDrawSurfaceColorStroke = false;
    private boolean backgroundOverwritten = false;
    private boolean cornerRadiusSet = false;
    private boolean toggleCheckedStateOnClick = true;

    public MaterialButtonHelper(MaterialButton materialButton, @NonNull ShapeAppearance shapeAppearance) {
        this.materialButton = materialButton;
        this.shapeAppearance = shapeAppearance;
    }

    private Drawable createBackground() {
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(this.shapeAppearance);
        SpringForce springForce = this.cornerSpringForce;
        if (springForce != null) {
            materialShapeDrawable.setCornerSpringForce(springForce);
        }
        MaterialShapeDrawable.OnCornerSizeChangeListener onCornerSizeChangeListener = this.onCornerSizeChangeListener;
        if (onCornerSizeChangeListener != null) {
            materialShapeDrawable.setOnCornerSizeChangeListener(onCornerSizeChangeListener);
        }
        Context context = this.materialButton.getContext();
        materialShapeDrawable.initializeElevationOverlay(context);
        materialShapeDrawable.setTintList(this.backgroundTint);
        PorterDuff.Mode mode = this.backgroundTintMode;
        if (mode != null) {
            materialShapeDrawable.setTintMode(mode);
        }
        materialShapeDrawable.setStroke(this.strokeWidth, this.strokeColor);
        MaterialShapeDrawable materialShapeDrawable2 = new MaterialShapeDrawable(this.shapeAppearance);
        SpringForce springForce2 = this.cornerSpringForce;
        if (springForce2 != null) {
            materialShapeDrawable2.setCornerSpringForce(springForce2);
        }
        materialShapeDrawable2.setTint(0);
        materialShapeDrawable2.setStroke(this.strokeWidth, this.shouldDrawSurfaceColorStroke ? MaterialColors.getColor(this.materialButton, C5183R.attr.colorSurface) : 0);
        MaterialShapeDrawable materialShapeDrawable3 = new MaterialShapeDrawable(this.shapeAppearance);
        this.maskDrawable = materialShapeDrawable3;
        SpringForce springForce3 = this.cornerSpringForce;
        if (springForce3 != null) {
            materialShapeDrawable3.setCornerSpringForce(springForce3);
        }
        this.maskDrawable.setTint(-1);
        RippleDrawable rippleDrawable = new RippleDrawable(RippleUtils.sanitizeRippleDrawableColor(this.rippleColor), wrapDrawableWithInset(new LayerDrawable(new Drawable[]{materialShapeDrawable2, materialShapeDrawable})), this.maskDrawable);
        this.rippleDrawable = rippleDrawable;
        FocusRingDrawable.layer(context, rippleDrawable);
        return this.rippleDrawable;
    }

    @Nullable
    private MaterialShapeDrawable getMaterialShapeDrawable(boolean z) {
        RippleDrawable rippleDrawable = this.rippleDrawable;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (MaterialShapeDrawable) ((LayerDrawable) ((InsetDrawable) this.rippleDrawable.getDrawable(0)).getDrawable()).getDrawable(!z ? 1 : 0);
    }

    @Nullable
    private MaterialShapeDrawable getSurfaceColorStrokeDrawable() {
        return getMaterialShapeDrawable(true);
    }

    private void setInsets(@Dimension int i2, @Dimension int i3, @Dimension int i4, @Dimension int i5) {
        int paddingStart = this.materialButton.getPaddingStart();
        int paddingTop = this.materialButton.getPaddingTop();
        int paddingEnd = this.materialButton.getPaddingEnd();
        int paddingBottom = this.materialButton.getPaddingBottom();
        int i6 = this.insetLeft;
        int i7 = this.insetTop;
        int i8 = this.insetRight;
        int i9 = this.insetBottom;
        this.insetLeft = i2;
        this.insetTop = i3;
        this.insetRight = i4;
        this.insetBottom = i5;
        if (!this.backgroundOverwritten) {
            updateBackground();
        }
        this.materialButton.setPaddingRelative((paddingStart + i2) - i6, (paddingTop + i3) - i7, (paddingEnd + i4) - i8, (paddingBottom + i5) - i9);
    }

    private void updateBackground() {
        this.materialButton.setInternalBackground(createBackground());
        MaterialShapeDrawable materialShapeDrawable = getMaterialShapeDrawable();
        if (materialShapeDrawable != null) {
            materialShapeDrawable.setElevation(this.elevation);
            materialShapeDrawable.setState(this.materialButton.getDrawableState());
        }
        FocusRingDrawable focusRingDrawableFind = FocusRingDrawable.find(this.materialButton.getBackground());
        if (focusRingDrawableFind != null) {
            focusRingDrawableFind.setFocusRingMaterialShapeDrawable(materialShapeDrawable);
        }
    }

    private void updateButtonShape() {
        MaterialShapeDrawable materialShapeDrawable = getMaterialShapeDrawable();
        if (materialShapeDrawable != null) {
            materialShapeDrawable.setShapeAppearance(this.shapeAppearance);
            SpringForce springForce = this.cornerSpringForce;
            if (springForce != null) {
                materialShapeDrawable.setCornerSpringForce(springForce);
            }
        }
        MaterialShapeDrawable surfaceColorStrokeDrawable = getSurfaceColorStrokeDrawable();
        if (surfaceColorStrokeDrawable != null) {
            surfaceColorStrokeDrawable.setShapeAppearance(this.shapeAppearance);
            SpringForce springForce2 = this.cornerSpringForce;
            if (springForce2 != null) {
                surfaceColorStrokeDrawable.setCornerSpringForce(springForce2);
            }
        }
        Shapeable maskDrawable = getMaskDrawable();
        if (maskDrawable != null) {
            if (!(maskDrawable instanceof MaterialShapeDrawable)) {
                maskDrawable.setShapeAppearanceModel(this.shapeAppearance.getDefaultShape());
                return;
            }
            MaterialShapeDrawable materialShapeDrawable2 = (MaterialShapeDrawable) maskDrawable;
            materialShapeDrawable2.setShapeAppearance(this.shapeAppearance);
            SpringForce springForce3 = this.cornerSpringForce;
            if (springForce3 != null) {
                materialShapeDrawable2.setCornerSpringForce(springForce3);
            }
        }
    }

    private void updateStroke() {
        MaterialShapeDrawable materialShapeDrawable = getMaterialShapeDrawable();
        MaterialShapeDrawable surfaceColorStrokeDrawable = getSurfaceColorStrokeDrawable();
        if (materialShapeDrawable != null) {
            materialShapeDrawable.setStroke(this.strokeWidth, this.strokeColor);
            if (surfaceColorStrokeDrawable != null) {
                surfaceColorStrokeDrawable.setStroke(this.strokeWidth, this.shouldDrawSurfaceColorStroke ? MaterialColors.getColor(this.materialButton, C5183R.attr.colorSurface) : 0);
            }
        }
    }

    @NonNull
    private InsetDrawable wrapDrawableWithInset(Drawable drawable) {
        return new InsetDrawable(drawable, this.insetLeft, this.insetTop, this.insetRight, this.insetBottom);
    }

    public int getCornerRadius() {
        return this.cornerRadius;
    }

    @Nullable
    public SpringForce getCornerSpringForce() {
        return this.cornerSpringForce;
    }

    public int getInsetBottom() {
        return this.insetBottom;
    }

    public int getInsetLeft() {
        return this.insetLeft;
    }

    public int getInsetRight() {
        return this.insetRight;
    }

    public int getInsetTop() {
        return this.insetTop;
    }

    @Nullable
    public Shapeable getMaskDrawable() {
        RippleDrawable rippleDrawable = this.rippleDrawable;
        if (rippleDrawable == null) {
            return null;
        }
        Object objFindDrawableByLayerId = rippleDrawable.findDrawableByLayerId(R.id.mask);
        if (objFindDrawableByLayerId instanceof Shapeable) {
            return (Shapeable) objFindDrawableByLayerId;
        }
        return null;
    }

    @Nullable
    public ColorStateList getRippleColor() {
        return this.rippleColor;
    }

    @NonNull
    public ShapeAppearance getShapeAppearance() {
        return this.shapeAppearance;
    }

    @NonNull
    public ShapeAppearanceModel getShapeAppearanceModel() {
        return this.shapeAppearance.getDefaultShape();
    }

    @Nullable
    public ColorStateList getStrokeColor() {
        return this.strokeColor;
    }

    public int getStrokeWidth() {
        return this.strokeWidth;
    }

    public ColorStateList getSupportBackgroundTintList() {
        return this.backgroundTint;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return this.backgroundTintMode;
    }

    public boolean isBackgroundOverwritten() {
        return this.backgroundOverwritten;
    }

    public boolean isCheckable() {
        return this.checkable;
    }

    public boolean isToggleCheckedStateOnClick() {
        return this.toggleCheckedStateOnClick;
    }

    public void loadFromAttributes(@NonNull TypedArray typedArray) {
        this.insetLeft = typedArray.getDimensionPixelOffset(C5183R.styleable.MaterialButton_android_insetLeft, 0);
        this.insetRight = typedArray.getDimensionPixelOffset(C5183R.styleable.MaterialButton_android_insetRight, 0);
        this.insetTop = typedArray.getDimensionPixelOffset(C5183R.styleable.MaterialButton_android_insetTop, 0);
        this.insetBottom = typedArray.getDimensionPixelOffset(C5183R.styleable.MaterialButton_android_insetBottom, 0);
        int i2 = C5183R.styleable.MaterialButton_cornerRadius;
        if (typedArray.hasValue(i2)) {
            int dimensionPixelSize = typedArray.getDimensionPixelSize(i2, -1);
            this.cornerRadius = dimensionPixelSize;
            setShapeAppearance(this.shapeAppearance.withCornerSize(dimensionPixelSize));
            this.cornerRadiusSet = true;
        }
        this.strokeWidth = typedArray.getDimensionPixelSize(C5183R.styleable.MaterialButton_strokeWidth, 0);
        this.backgroundTintMode = ViewUtils.parseTintMode(typedArray.getInt(C5183R.styleable.MaterialButton_backgroundTintMode, -1), PorterDuff.Mode.SRC_IN);
        this.backgroundTint = MaterialResources.getColorStateList(this.materialButton.getContext(), typedArray, C5183R.styleable.MaterialButton_backgroundTint);
        this.strokeColor = MaterialResources.getColorStateList(this.materialButton.getContext(), typedArray, C5183R.styleable.MaterialButton_strokeColor);
        this.rippleColor = MaterialResources.getColorStateList(this.materialButton.getContext(), typedArray, C5183R.styleable.MaterialButton_rippleColor);
        this.checkable = typedArray.getBoolean(C5183R.styleable.MaterialButton_android_checkable, false);
        this.elevation = typedArray.getDimensionPixelSize(C5183R.styleable.MaterialButton_elevation, 0);
        this.toggleCheckedStateOnClick = typedArray.getBoolean(C5183R.styleable.MaterialButton_toggleCheckedStateOnClick, true);
        int paddingStart = this.materialButton.getPaddingStart();
        int paddingTop = this.materialButton.getPaddingTop();
        int paddingEnd = this.materialButton.getPaddingEnd();
        int paddingBottom = this.materialButton.getPaddingBottom();
        if (typedArray.hasValue(C5183R.styleable.MaterialButton_android_background)) {
            setBackgroundOverwritten();
        } else {
            updateBackground();
        }
        this.materialButton.setPaddingRelative(paddingStart + this.insetLeft, paddingTop + this.insetTop, paddingEnd + this.insetRight, paddingBottom + this.insetBottom);
    }

    public void setBackgroundColor(int i2) {
        if (getMaterialShapeDrawable() != null) {
            getMaterialShapeDrawable().setTint(i2);
        }
    }

    public void setBackgroundOverwritten() {
        this.backgroundOverwritten = true;
        this.materialButton.setSupportBackgroundTintList(this.backgroundTint);
        this.materialButton.setSupportBackgroundTintMode(this.backgroundTintMode);
    }

    public void setCheckable(boolean z) {
        this.checkable = z;
    }

    public void setCornerRadius(int i2) {
        if (this.cornerRadiusSet && this.cornerRadius == i2) {
            return;
        }
        this.cornerRadius = i2;
        this.cornerRadiusSet = true;
        setShapeAppearance(this.shapeAppearance.withCornerSize(i2));
    }

    public void setCornerSizeChangeListener(@Nullable MaterialShapeDrawable.OnCornerSizeChangeListener onCornerSizeChangeListener) {
        this.onCornerSizeChangeListener = onCornerSizeChangeListener;
        MaterialShapeDrawable materialShapeDrawable = getMaterialShapeDrawable();
        if (materialShapeDrawable != null) {
            materialShapeDrawable.setOnCornerSizeChangeListener(onCornerSizeChangeListener);
        }
    }

    public void setCornerSpringForce(@NonNull SpringForce springForce) {
        this.cornerSpringForce = springForce;
        if (this.shapeAppearance instanceof StateListShapeAppearanceModel) {
            updateButtonShape();
        }
    }

    public void setInsetBottom(@Dimension int i2) {
        setInsets(this.insetLeft, this.insetTop, this.insetRight, i2);
    }

    public void setInsetLeft(@Dimension int i2) {
        setInsets(i2, this.insetTop, this.insetRight, this.insetBottom);
    }

    public void setInsetRight(@Dimension int i2) {
        setInsets(this.insetLeft, this.insetTop, i2, this.insetBottom);
    }

    public void setInsetTop(@Dimension int i2) {
        setInsets(this.insetLeft, i2, this.insetRight, this.insetBottom);
    }

    public void setRippleColor(@Nullable ColorStateList colorStateList) {
        if (this.rippleColor != colorStateList) {
            this.rippleColor = colorStateList;
            if (this.materialButton.getBackground() instanceof RippleDrawable) {
                ((RippleDrawable) this.materialButton.getBackground()).setColor(RippleUtils.sanitizeRippleDrawableColor(colorStateList));
            }
        }
    }

    public void setShapeAppearance(@NonNull ShapeAppearance shapeAppearance) {
        this.shapeAppearance = shapeAppearance;
        updateButtonShape();
    }

    public void setShouldDrawSurfaceColorStroke(boolean z) {
        this.shouldDrawSurfaceColorStroke = z;
        updateStroke();
    }

    public void setStrokeColor(@Nullable ColorStateList colorStateList) {
        if (this.strokeColor != colorStateList) {
            this.strokeColor = colorStateList;
            updateStroke();
        }
    }

    public void setStrokeWidth(int i2) {
        if (this.strokeWidth != i2) {
            this.strokeWidth = i2;
            updateStroke();
        }
    }

    public void setSupportBackgroundTintList(@Nullable ColorStateList colorStateList) {
        if (this.backgroundTint != colorStateList) {
            this.backgroundTint = colorStateList;
            if (getMaterialShapeDrawable() != null) {
                getMaterialShapeDrawable().setTintList(this.backgroundTint);
            }
        }
    }

    public void setSupportBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        if (this.backgroundTintMode != mode) {
            this.backgroundTintMode = mode;
            if (getMaterialShapeDrawable() == null || this.backgroundTintMode == null) {
                return;
            }
            getMaterialShapeDrawable().setTintMode(this.backgroundTintMode);
        }
    }

    public void setToggleCheckedStateOnClick(boolean z) {
        this.toggleCheckedStateOnClick = z;
    }

    public void updateMaskBounds(int i2, int i3) {
        Drawable drawable = this.maskDrawable;
        if (drawable != null) {
            drawable.setBounds(this.insetLeft, this.insetTop, i3 - this.insetRight, i2 - this.insetBottom);
        }
    }

    @Nullable
    public MaterialShapeDrawable getMaterialShapeDrawable() {
        return getMaterialShapeDrawable(false);
    }
}
