package com.google.android.material.focus;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableWrapper;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.util.AttributeSet;
import android.util.FloatProperty;
import android.util.StateSet;
import android.util.TypedValue;
import android.view.animation.OvershootInterpolator;
import androidx.annotation.ColorInt;
import androidx.annotation.DimenRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.StyleableRes;
import androidx.core.view.ViewCompat;
import com.google.android.material.C5183R;
import com.google.android.material.resources.MaterialAttributes;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearance;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.ShapeAppearancePathProvider;
import com.google.android.material.shape.StateListShapeAppearanceModel;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes2.dex */
public class FocusRingDrawable extends DrawableWrapper {
    private static final int ANIMATION_DURATION = 300;
    private static final boolean DEBUG_COLORS = false;
    private static final Drawable EMPTY_DRAWABLE = new ColorDrawable(0);
    private static final int[] FOCUSED_STATE_SET = {R.attr.state_focused, R.attr.state_window_focused};
    private static final TimeInterpolator INTERPOLATOR = new OvershootInterpolator(4.0f);

    @RequiresApi(24)
    private static final FloatProperty<FocusRingDrawable> PROPERTY_INTERPOLATION = new FloatProperty<FocusRingDrawable>("interpolation") { // from class: com.google.android.material.focus.FocusRingDrawable.1
        @Override // android.util.Property
        public Float get(FocusRingDrawable focusRingDrawable) {
            return Float.valueOf(focusRingDrawable.interpolation);
        }

        @Override // android.util.FloatProperty
        public void setValue(FocusRingDrawable focusRingDrawable, float f2) {
            focusRingDrawable.interpolation = f2;
            focusRingDrawable.invalidateSelf();
        }
    };

    @Nullable
    private ObjectAnimator animator;
    private boolean focused;
    private float interpolation;

    @Nullable
    private WeakReference<MaterialShapeDrawable> materialShapeDrawable;
    private final Matrix matrix;
    private boolean mutated;
    private final Paint paint;
    private final ShapeAppearancePathProvider pathProvider;
    private boolean previousStateSetEmpty;
    private float shapeAppearanceCornerSize;
    private final Path shapeAppearancePath;

    @NonNull
    private FocusRingState state;
    private final Path tmpPath;
    private final Rect tmpRect;
    private final RectF tmpRectF;

    public static final class FocusRingState extends Drawable.ConstantState {
        int mChangingConfigurations;

        @Nullable
        private Rect ringCustomBounds;
        private boolean ringEnabled;
        private int ringEnabledAttr;
        private boolean ringEnabledInflated;
        private int ringInnerColor;
        private int ringInnerColorAttr;
        private float ringInnerInset;
        private int ringInnerInsetAttr;
        private float ringInnerStrokeWidth;
        private int ringInnerStrokeWidthAttr;
        private float ringInset;
        private int ringInsetAttr;
        private int ringOuterColor;
        private int ringOuterColorAttr;
        private float ringOuterStrokeWidth;
        private int ringOuterStrokeWidthAttr;
        private float ringRadius;
        private int ringRadiusAttr;

        @Nullable
        private ShapeAppearance ringShapeAppearance;
        private int ringShapeAppearanceAttr;
        private int ringShapeAppearanceResId;

        @NonNull
        private int[] ringStateSet;
        Drawable.ConstantState wrappedState;

        public FocusRingState(@Nullable FocusRingState focusRingState) {
            this.mChangingConfigurations = 0;
            this.ringEnabled = false;
            this.ringEnabledAttr = Integer.MIN_VALUE;
            this.ringEnabledInflated = false;
            this.ringOuterColor = Integer.MIN_VALUE;
            this.ringOuterColorAttr = Integer.MIN_VALUE;
            this.ringInnerColor = Integer.MIN_VALUE;
            this.ringInnerColorAttr = Integer.MIN_VALUE;
            this.ringOuterStrokeWidth = Float.NaN;
            this.ringOuterStrokeWidthAttr = Integer.MIN_VALUE;
            this.ringInnerStrokeWidth = Float.NaN;
            this.ringInnerStrokeWidthAttr = Integer.MIN_VALUE;
            this.ringRadius = Float.NaN;
            this.ringRadiusAttr = Integer.MIN_VALUE;
            this.ringInset = Float.NaN;
            this.ringInsetAttr = Integer.MIN_VALUE;
            this.ringInnerInset = Float.NaN;
            this.ringInnerInsetAttr = Integer.MIN_VALUE;
            this.ringShapeAppearance = null;
            this.ringShapeAppearanceResId = Integer.MIN_VALUE;
            this.ringShapeAppearanceAttr = Integer.MIN_VALUE;
            this.ringCustomBounds = null;
            this.ringStateSet = FocusRingDrawable.FOCUSED_STATE_SET;
            if (focusRingState != null) {
                this.wrappedState = focusRingState.wrappedState;
                this.mChangingConfigurations = focusRingState.mChangingConfigurations;
                this.ringEnabled = focusRingState.ringEnabled;
                this.ringEnabledAttr = focusRingState.ringEnabledAttr;
                this.ringEnabledInflated = focusRingState.ringEnabledInflated;
                this.ringOuterColor = focusRingState.ringOuterColor;
                this.ringOuterColorAttr = focusRingState.ringOuterColorAttr;
                this.ringInnerColor = focusRingState.ringInnerColor;
                this.ringInnerColorAttr = focusRingState.ringInnerColorAttr;
                this.ringOuterStrokeWidth = focusRingState.ringOuterStrokeWidth;
                this.ringOuterStrokeWidthAttr = focusRingState.ringOuterStrokeWidthAttr;
                this.ringInnerStrokeWidth = focusRingState.ringInnerStrokeWidth;
                this.ringInnerStrokeWidthAttr = focusRingState.ringInnerStrokeWidthAttr;
                this.ringRadius = focusRingState.ringRadius;
                this.ringRadiusAttr = focusRingState.ringRadiusAttr;
                this.ringInset = focusRingState.ringInset;
                this.ringInsetAttr = focusRingState.ringInsetAttr;
                this.ringInnerInset = focusRingState.ringInnerInset;
                this.ringInnerInsetAttr = focusRingState.ringInnerInsetAttr;
                this.ringShapeAppearanceResId = focusRingState.ringShapeAppearanceResId;
                this.ringShapeAppearanceAttr = focusRingState.ringShapeAppearanceAttr;
                ShapeAppearance shapeAppearance = focusRingState.ringShapeAppearance;
                if (shapeAppearance instanceof ShapeAppearanceModel) {
                    this.ringShapeAppearance = ((ShapeAppearanceModel) shapeAppearance).toBuilder().build();
                } else if (shapeAppearance instanceof StateListShapeAppearanceModel) {
                    this.ringShapeAppearance = ((StateListShapeAppearanceModel) shapeAppearance).toBuilder().build();
                } else {
                    this.ringShapeAppearance = shapeAppearance;
                }
                if (focusRingState.ringCustomBounds != null) {
                    this.ringCustomBounds = new Rect(focusRingState.ringCustomBounds);
                }
                int[] iArr = focusRingState.ringStateSet;
                this.ringStateSet = Arrays.copyOf(iArr, iArr.length);
            }
        }

        public boolean canConstantState() {
            return this.wrappedState != null;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            Drawable.ConstantState constantState = this.wrappedState;
            return (constantState != null ? constantState.getChangingConfigurations() : 0) | this.mChangingConfigurations;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public Drawable newDrawable() {
            return new FocusRingDrawable(this, null);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public Drawable newDrawable(@Nullable Resources resources) {
            return new FocusRingDrawable(this, resources);
        }
    }

    private void calculateBounds(RectF rectF) {
        if (this.state.ringCustomBounds != null) {
            rectF.set(this.state.ringCustomBounds);
            return;
        }
        WeakReference<MaterialShapeDrawable> weakReference = this.materialShapeDrawable;
        if (weakReference != null && weakReference.get() != null) {
            rectF.set(this.materialShapeDrawable.get().getBounds());
            return;
        }
        if (!(getDrawable() instanceof RippleDrawable)) {
            rectF.set(getBounds());
            return;
        }
        RippleDrawable rippleDrawable = (RippleDrawable) getDrawable();
        rippleDrawable.getHotspotBounds(this.tmpRect);
        int radius = rippleDrawable.getRadius();
        if (radius > 0) {
            this.tmpRect.inset(Math.max(0, (this.tmpRect.width() / 2) - radius), Math.max(0, (this.tmpRect.height() / 2) - radius));
        }
        rectF.set(this.tmpRect);
    }

    private float calculateInnerInset() {
        return ((this.state.ringInnerStrokeWidth / 2.0f) * this.interpolation) + this.state.ringInset + this.state.ringInnerInset;
    }

    private float calculateInnerRadius(float f2) {
        return Math.max(0.0f, f2 - (this.state.ringOuterStrokeWidth / 2.0f));
    }

    private float calculateOuterInset() {
        return ((this.state.ringOuterStrokeWidth / 2.0f) * this.interpolation) + this.state.ringInset;
    }

    private float calculateOuterRadius() {
        int radius;
        if (!Float.isNaN(this.state.ringRadius)) {
            return this.state.ringRadius;
        }
        float f2 = this.shapeAppearanceCornerSize;
        if (f2 >= 0.0f) {
            return f2;
        }
        WeakReference<MaterialShapeDrawable> weakReference = this.materialShapeDrawable;
        if (weakReference != null && weakReference.get() != null) {
            float fCalculateRoundRectCornerSize = this.materialShapeDrawable.get().calculateRoundRectCornerSize();
            if (fCalculateRoundRectCornerSize >= 0.0f) {
                return Math.max(0.0f, fCalculateRoundRectCornerSize - (this.state.ringOuterStrokeWidth / 2.0f));
            }
        }
        Drawable drawable = getDrawable();
        if (!(drawable instanceof RippleDrawable) || (radius = ((RippleDrawable) drawable).getRadius()) < 0) {
            return 0.0f;
        }
        return radius;
    }

    private void calculateShapeAppearanceRoundRectOrPath() {
        if (this.state.ringShapeAppearance != null) {
            updateShapeAppearanceCornerSizeOrPath(this.state.ringShapeAppearance);
        } else {
            if (updateFocusRingShapeAppearanceFromWrappedDrawable()) {
                return;
            }
            this.shapeAppearanceCornerSize = -1.0f;
            this.shapeAppearancePath.reset();
        }
    }

    @RequiresApi(24)
    private ObjectAnimator createAnimator() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, PROPERTY_INTERPOLATION, 0.0f, 1.0f);
        objectAnimatorOfFloat.setDuration(300L);
        objectAnimatorOfFloat.setInterpolator(INTERPOLATOR);
        objectAnimatorOfFloat.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.focus.FocusRingDrawable.2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                super.onAnimationCancel(animator);
                FocusRingDrawable.this.interpolation = 1.0f;
                FocusRingDrawable.this.invalidateSelf();
            }
        });
        return objectAnimatorOfFloat;
    }

    private void drawPath(Canvas canvas, Path path, float f2, float f3, int i2) {
        calculateBounds(this.tmpRectF);
        float f4 = f2 * 2.0f;
        float fWidth = 1.0f - (f4 / this.tmpRectF.width());
        float fHeight = 1.0f - (f4 / this.tmpRectF.height());
        this.matrix.reset();
        this.matrix.postScale(fWidth, fHeight, this.tmpRectF.centerX(), this.tmpRectF.centerY());
        path.transform(this.matrix, this.tmpPath);
        this.paint.setStrokeWidth(f3 * this.interpolation);
        this.paint.setColor(i2);
        canvas.drawPath(this.tmpPath, this.paint);
    }

    private void drawRoundRect(Canvas canvas, float f2, float f3, float f4, int i2) {
        calculateBounds(this.tmpRectF);
        this.tmpRectF.inset(f3, f3);
        this.paint.setStrokeWidth(f4 * this.interpolation);
        this.paint.setColor(i2);
        canvas.drawRoundRect(this.tmpRectF, f2, f2, this.paint);
    }

    @Nullable
    public static FocusRingDrawable find(@Nullable Drawable drawable) {
        if (drawable instanceof FocusRingDrawable) {
            return (FocusRingDrawable) drawable;
        }
        if (drawable instanceof DrawableWrapper) {
            Drawable drawable2 = ((DrawableWrapper) drawable).getDrawable();
            if (drawable2 instanceof FocusRingDrawable) {
                return (FocusRingDrawable) drawable2;
            }
        }
        if (!(drawable instanceof LayerDrawable)) {
            return null;
        }
        LayerDrawable layerDrawable = (LayerDrawable) drawable;
        for (int i2 = 0; i2 < layerDrawable.getNumberOfLayers(); i2++) {
            Drawable drawable3 = layerDrawable.getDrawable(i2);
            if (drawable3 instanceof FocusRingDrawable) {
                return (FocusRingDrawable) drawable3;
            }
        }
        return null;
    }

    @Nullable
    public static FocusRingDrawable findAndMutate(@Nullable Drawable drawable) {
        if (drawable == null || find(drawable) == null) {
            return null;
        }
        drawable.mutate();
        return find(drawable);
    }

    @Nullable
    @RequiresApi(api = 24)
    private float[] getCornerRadiiOrNull(GradientDrawable gradientDrawable) {
        try {
            return gradientDrawable.getCornerRadii();
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @RequiresApi(api = 24)
    private float getCornerRadius(GradientDrawable gradientDrawable) {
        try {
            return gradientDrawable.getCornerRadius();
        } catch (NullPointerException unused) {
            return -1.0f;
        }
    }

    @Nullable
    private Path getNonEmptyPath() {
        if (!this.shapeAppearancePath.isEmpty()) {
            return this.shapeAppearancePath;
        }
        WeakReference<MaterialShapeDrawable> weakReference = this.materialShapeDrawable;
        if (weakReference == null || weakReference.get() == null) {
            return null;
        }
        Path path = this.materialShapeDrawable.get().getPath();
        if (path.isEmpty()) {
            return null;
        }
        return path;
    }

    private int getResIdIfReference(TypedArray typedArray, @StyleableRes int i2) {
        if (typedArray.getType(i2) == 1) {
            return typedArray.getResourceId(i2, Integer.MIN_VALUE);
        }
        return Integer.MIN_VALUE;
    }

    private int getValueDataIfAttr(TypedArray typedArray, @StyleableRes int i2) {
        if (typedArray.getType(i2) != 2) {
            return Integer.MIN_VALUE;
        }
        TypedValue typedValue = new TypedValue();
        if (typedArray.getValue(i2, typedValue)) {
            return typedValue.data;
        }
        return Integer.MIN_VALUE;
    }

    private void inflateChildDrawable(@NonNull Resources resources, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, @Nullable Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth = xmlPullParser.getDepth();
        Drawable drawableCreateFromXmlInner = null;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1 || (next == 3 && xmlPullParser.getDepth() <= depth)) {
                break;
            } else if (next == 2) {
                drawableCreateFromXmlInner = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
            }
        }
        if (drawableCreateFromXmlInner != null) {
            setDrawable(drawableCreateFromXmlInner);
            this.state.wrappedState = drawableCreateFromXmlInner.getConstantState();
        } else {
            Drawable drawable = EMPTY_DRAWABLE;
            setDrawable(drawable);
            this.state.wrappedState = drawable.getConstantState();
        }
    }

    private void init(@NonNull Resources.Theme theme) {
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(C5183R.styleable.FocusRingDrawable);
        updateStateFromTypedArrayWithThemeAttrsAndDefaults(typedArrayObtainStyledAttributes, theme);
        typedArrayObtainStyledAttributes.recycle();
        updateLocalState();
    }

    @Nullable
    public static FocusRingDrawable layer(@NonNull Context context, @NonNull LayerDrawable layerDrawable) {
        return layer(context, layerDrawable, null);
    }

    private void maybeAnimate(boolean z) {
        ObjectAnimator objectAnimator = this.animator;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            this.animator = null;
        }
        if (!z) {
            this.interpolation = 1.0f;
            return;
        }
        ObjectAnimator objectAnimatorCreateAnimator = createAnimator();
        this.animator = objectAnimatorCreateAnimator;
        objectAnimatorCreateAnimator.start();
    }

    private int maybeResolveColor(int i2, @NonNull Resources.Theme theme, @StyleableRes int i3, @NonNull TypedArray typedArray, @StyleableRes int i4, int i5) {
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        if (i3 != Integer.MIN_VALUE) {
            TypedValue typedValue = new TypedValue();
            if (theme.resolveAttribute(i3, typedValue, true)) {
                return typedValue.data;
            }
        }
        return typedArray.getColor(i4, i5);
    }

    private float maybeResolveDimension(float f2, @NonNull Resources.Theme theme, @StyleableRes int i2, @NonNull TypedArray typedArray, @StyleableRes int i3, @DimenRes int i4) {
        if (!Float.isNaN(f2)) {
            return f2;
        }
        Resources resources = theme.getResources();
        if (i2 != Float.MIN_VALUE) {
            TypedValue typedValue = new TypedValue();
            if (theme.resolveAttribute(i2, typedValue, true)) {
                return typedValue.getDimension(resources.getDisplayMetrics());
            }
        }
        float dimension = typedArray.getDimension(i3, Float.NaN);
        if (!Float.isNaN(dimension)) {
            return dimension;
        }
        if (i4 == 0) {
            return Float.NaN;
        }
        return resources.getDimension(i4);
    }

    private static boolean shouldUseFocusRing(@NonNull Context context) {
        return MaterialAttributes.resolveBoolean(context.getTheme(), C5183R.attr.focusRingsEnabled, false);
    }

    @Nullable
    private ShapeAppearance toShapeAppearance(@Nullable Drawable drawable) {
        if (drawable instanceof ShapeDrawable) {
            return toShapeAppearance((ShapeDrawable) drawable);
        }
        if (drawable instanceof GradientDrawable) {
            return toShapeAppearance((GradientDrawable) drawable);
        }
        return null;
    }

    private void updateLocalState() {
        this.paint.setStyle(Paint.Style.STROKE);
        if (Float.isNaN(this.state.ringOuterStrokeWidth)) {
            return;
        }
        this.paint.setStrokeWidth(this.state.ringOuterStrokeWidth);
    }

    private void updateShapeAppearanceCornerSizeOrPath(ShapeAppearance shapeAppearance) {
        calculateBounds(this.tmpRectF);
        ShapeAppearanceModel shapeForState = shapeAppearance.getShapeForState(FOCUSED_STATE_SET);
        if (!shapeForState.isRoundRect(this.tmpRectF)) {
            this.pathProvider.calculatePath(shapeForState, null, 1.0f, this.tmpRectF, null, this.shapeAppearancePath);
            this.shapeAppearanceCornerSize = -1.0f;
        } else {
            float fCalculateOuterInset = calculateOuterInset();
            this.tmpRectF.inset(fCalculateOuterInset, fCalculateOuterInset);
            this.shapeAppearanceCornerSize = shapeForState.getTopLeftCornerSize().getCornerSize(this.tmpRectF);
            this.shapeAppearancePath.reset();
        }
    }

    private void updateStateFromTypedArrayWithThemeAttrsAndDefaults(@NonNull TypedArray typedArray, @NonNull Resources.Theme theme) {
        TypedValue typedValueResolve;
        if (this.state.ringEnabledAttr != Integer.MIN_VALUE && (typedValueResolve = MaterialAttributes.resolve(theme, this.state.ringEnabledAttr)) != null) {
            this.state.ringEnabled = typedValueResolve.data != 0;
            this.state.ringEnabledInflated = true;
        }
        if (!this.state.ringEnabledInflated) {
            FocusRingState focusRingState = this.state;
            focusRingState.ringEnabled = MaterialAttributes.resolveBoolean(theme, C5183R.attr.focusRingsEnabled, focusRingState.ringEnabled);
        }
        if (this.state.ringEnabled) {
            FocusRingState focusRingState2 = this.state;
            focusRingState2.ringOuterColor = maybeResolveColor(focusRingState2.ringOuterColor, theme, this.state.ringOuterColorAttr, typedArray, C5183R.styleable.FocusRingDrawable_focusRingsOuterStrokeColor, ViewCompat.MEASURED_STATE_MASK);
            FocusRingState focusRingState3 = this.state;
            focusRingState3.ringInnerColor = maybeResolveColor(focusRingState3.ringInnerColor, theme, this.state.ringInnerColorAttr, typedArray, C5183R.styleable.FocusRingDrawable_focusRingsInnerStrokeColor, -1);
            FocusRingState focusRingState4 = this.state;
            focusRingState4.ringOuterStrokeWidth = maybeResolveDimension(focusRingState4.ringOuterStrokeWidth, theme, this.state.ringOuterStrokeWidthAttr, typedArray, C5183R.styleable.FocusRingDrawable_focusRingsOuterStrokeWidth, C5183R.dimen.mtrl_focus_ring_outer_stroke_width);
            FocusRingState focusRingState5 = this.state;
            focusRingState5.ringInnerStrokeWidth = maybeResolveDimension(focusRingState5.ringInnerStrokeWidth, theme, this.state.ringInnerStrokeWidthAttr, typedArray, C5183R.styleable.FocusRingDrawable_focusRingsInnerStrokeWidth, C5183R.dimen.mtrl_focus_ring_inner_stroke_width);
            FocusRingState focusRingState6 = this.state;
            focusRingState6.ringRadius = maybeResolveDimension(focusRingState6.ringRadius, theme, this.state.ringRadiusAttr, typedArray, C5183R.styleable.FocusRingDrawable_focusRingsRadius, 0);
            FocusRingState focusRingState7 = this.state;
            focusRingState7.ringInset = maybeResolveDimension(focusRingState7.ringInset, theme, this.state.ringInsetAttr, typedArray, C5183R.styleable.FocusRingDrawable_focusRingsInset, 0);
            if (Float.isNaN(this.state.ringInset)) {
                this.state.ringInset = 0.0f;
            }
            FocusRingState focusRingState8 = this.state;
            focusRingState8.ringInnerInset = maybeResolveDimension(focusRingState8.ringInnerInset, theme, this.state.ringInnerInsetAttr, typedArray, C5183R.styleable.FocusRingDrawable_focusRingsInnerStrokeInset, C5183R.dimen.mtrl_focus_ring_inner_stroke_inset);
            if (this.state.ringShapeAppearanceResId != Integer.MIN_VALUE) {
                FocusRingState focusRingState9 = this.state;
                focusRingState9.ringShapeAppearance = ShapeAppearanceModel.builder(theme, focusRingState9.ringShapeAppearanceResId).build();
            } else {
                TypedValue typedValueResolve2 = MaterialAttributes.resolve(theme, this.state.ringShapeAppearanceAttr != Integer.MIN_VALUE ? this.state.ringShapeAppearanceAttr : C5183R.attr.focusRingsShapeAppearance);
                if (typedValueResolve2 != null) {
                    this.state.ringShapeAppearance = ShapeAppearanceModel.builder(theme, typedValueResolve2.resourceId).build();
                }
            }
        }
    }

    private void updateStateFromTypedArrayWithoutThemeAttrsOrDefaults(@NonNull TypedArray typedArray) {
        FocusRingState focusRingState = this.state;
        int i2 = C5183R.styleable.FocusRingDrawable_focusRingsEnabled;
        focusRingState.ringEnabledAttr = getValueDataIfAttr(typedArray, i2);
        if (this.state.ringEnabledAttr == Integer.MIN_VALUE && typedArray.hasValue(i2)) {
            FocusRingState focusRingState2 = this.state;
            focusRingState2.ringEnabled = typedArray.getBoolean(i2, focusRingState2.ringEnabled);
            this.state.ringEnabledInflated = true;
        }
        FocusRingState focusRingState3 = this.state;
        int i3 = C5183R.styleable.FocusRingDrawable_focusRingsOuterStrokeColor;
        focusRingState3.ringOuterColorAttr = getValueDataIfAttr(typedArray, i3);
        if (this.state.ringOuterColorAttr == Integer.MIN_VALUE) {
            this.state.ringOuterColor = typedArray.getColor(i3, Integer.MIN_VALUE);
        }
        FocusRingState focusRingState4 = this.state;
        int i4 = C5183R.styleable.FocusRingDrawable_focusRingsInnerStrokeColor;
        focusRingState4.ringInnerColorAttr = getValueDataIfAttr(typedArray, i4);
        if (this.state.ringInnerColorAttr == Integer.MIN_VALUE) {
            this.state.ringInnerColor = typedArray.getColor(i4, Integer.MIN_VALUE);
        }
        FocusRingState focusRingState5 = this.state;
        int i5 = C5183R.styleable.FocusRingDrawable_focusRingsOuterStrokeWidth;
        focusRingState5.ringOuterStrokeWidthAttr = getValueDataIfAttr(typedArray, i5);
        if (this.state.ringOuterStrokeWidthAttr == Integer.MIN_VALUE) {
            this.state.ringOuterStrokeWidth = typedArray.getDimension(i5, Float.NaN);
        }
        FocusRingState focusRingState6 = this.state;
        int i6 = C5183R.styleable.FocusRingDrawable_focusRingsInnerStrokeWidth;
        focusRingState6.ringInnerStrokeWidthAttr = getValueDataIfAttr(typedArray, i6);
        if (this.state.ringInnerStrokeWidthAttr == Integer.MIN_VALUE) {
            this.state.ringInnerStrokeWidth = typedArray.getDimension(i6, Float.NaN);
        }
        this.state.ringInnerStrokeWidthAttr = getValueDataIfAttr(typedArray, i6);
        if (this.state.ringInnerStrokeWidthAttr == Integer.MIN_VALUE) {
            this.state.ringInnerStrokeWidth = typedArray.getDimension(i6, Float.NaN);
        }
        FocusRingState focusRingState7 = this.state;
        int i7 = C5183R.styleable.FocusRingDrawable_focusRingsRadius;
        focusRingState7.ringRadiusAttr = getValueDataIfAttr(typedArray, i7);
        if (this.state.ringRadiusAttr == Integer.MIN_VALUE) {
            this.state.ringRadius = typedArray.getDimension(i7, Float.NaN);
        }
        FocusRingState focusRingState8 = this.state;
        int i8 = C5183R.styleable.FocusRingDrawable_focusRingsInset;
        focusRingState8.ringInsetAttr = getValueDataIfAttr(typedArray, i8);
        if (this.state.ringInsetAttr == Integer.MIN_VALUE) {
            this.state.ringInset = typedArray.getDimension(i8, Float.NaN);
        }
        FocusRingState focusRingState9 = this.state;
        int i9 = C5183R.styleable.FocusRingDrawable_focusRingsInnerStrokeInset;
        focusRingState9.ringInnerInsetAttr = getValueDataIfAttr(typedArray, i9);
        if (this.state.ringInnerInsetAttr == Integer.MIN_VALUE) {
            this.state.ringInnerInset = typedArray.getDimension(i9, Float.NaN);
        }
        FocusRingState focusRingState10 = this.state;
        int i10 = C5183R.styleable.FocusRingDrawable_focusRingsShapeAppearance;
        focusRingState10.ringShapeAppearanceAttr = getValueDataIfAttr(typedArray, i10);
        this.state.ringShapeAppearanceResId = getResIdIfReference(typedArray, i10);
    }

    @Nullable
    public static Drawable wrap(@NonNull Context context, @Nullable Drawable drawable) {
        return !shouldUseFocusRing(context) ? drawable : new FocusRingDrawable(context, drawable);
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public void applyTheme(@NonNull Resources.Theme theme) {
        super.applyTheme(theme);
        init(theme);
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        return true;
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        super.draw(canvas);
        if (this.state.ringEnabled && this.focused) {
            float fCalculateOuterInset = calculateOuterInset();
            float fCalculateInnerInset = calculateInnerInset();
            Path nonEmptyPath = getNonEmptyPath();
            if (nonEmptyPath != null) {
                drawPath(canvas, nonEmptyPath, fCalculateInnerInset, this.state.ringInnerStrokeWidth, this.state.ringInnerColor);
                drawPath(canvas, nonEmptyPath, fCalculateOuterInset, this.state.ringOuterStrokeWidth, this.state.ringOuterColor);
            } else {
                float fCalculateOuterRadius = calculateOuterRadius();
                drawRoundRect(canvas, calculateInnerRadius(fCalculateOuterRadius), fCalculateInnerInset, this.state.ringInnerStrokeWidth, this.state.ringInnerColor);
                drawRoundRect(canvas, fCalculateOuterRadius, fCalculateOuterInset, this.state.ringOuterStrokeWidth, this.state.ringOuterColor);
            }
        }
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    @Nullable
    public Drawable.ConstantState getConstantState() {
        if (!this.state.canConstantState()) {
            return null;
        }
        this.state.mChangingConfigurations = getChangingConfigurations();
        return this.state;
    }

    @Nullable
    public Rect getFocusRingBounds() {
        return this.state.ringCustomBounds;
    }

    public float getFocusRingInnerInset() {
        return this.state.ringInnerInset;
    }

    @ColorInt
    public int getFocusRingInnerStrokeColor() {
        return this.state.ringInnerColor;
    }

    public float getFocusRingInnerStrokeWidth() {
        return this.state.ringInnerStrokeWidth;
    }

    public float getFocusRingInset() {
        return this.state.ringInset;
    }

    @Nullable
    public MaterialShapeDrawable getFocusRingMaterialShapeDrawable() {
        WeakReference<MaterialShapeDrawable> weakReference = this.materialShapeDrawable;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @ColorInt
    public int getFocusRingOuterStrokeColor() {
        return this.state.ringOuterColor;
    }

    public float getFocusRingOuterStrokeWidth() {
        return this.state.ringOuterStrokeWidth;
    }

    public float getFocusRingRadius() {
        return this.state.ringRadius;
    }

    @Nullable
    public ShapeAppearance getFocusRingShapeAppearance() {
        return this.state.ringShapeAppearance;
    }

    @NonNull
    public int[] getFocusRingStateSet() {
        return this.state.ringStateSet;
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public boolean hasFocusStateSpecified() {
        try {
            return super.hasFocusStateSpecified() || this.state.ringEnabled;
        } catch (NoSuchMethodError unused) {
            return this.state.ringEnabled;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(@NonNull Resources resources, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet) throws XmlPullParserException, IOException {
        inflate(resources, xmlPullParser, attributeSet, null);
    }

    public boolean isFocusRingEnabled() {
        return this.state.ringEnabled;
    }

    @Override // android.graphics.drawable.Drawable
    @RequiresApi(api = 29)
    public boolean isProjected() {
        Drawable drawable = getDrawable();
        return drawable != null && drawable.isProjected();
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public boolean isStateful() {
        return super.isStateful() || this.state.ringEnabled;
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        super.jumpToCurrentState();
        ObjectAnimator objectAnimator = this.animator;
        if (objectAnimator != null) {
            objectAnimator.end();
            this.animator = null;
        }
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    @NonNull
    public Drawable mutate() {
        if (!this.mutated && super.mutate() == this) {
            this.state = new FocusRingState(this.state);
            Drawable drawable = getDrawable();
            if (drawable != null) {
                this.state.wrappedState = drawable.getConstantState();
            }
            this.mutated = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        if (this.state.ringEnabled) {
            calculateShapeAppearanceRoundRectOrPath();
        }
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public boolean onStateChange(@NonNull int[] iArr) {
        if (!this.state.ringEnabled) {
            this.focused = false;
            return super.onStateChange(iArr);
        }
        boolean zStateSetMatches = StateSet.stateSetMatches(this.state.ringStateSet, iArr);
        boolean z = this.focused != zStateSetMatches;
        this.focused = zStateSetMatches;
        if (z && iArr.length > 0 && !this.previousStateSetEmpty) {
            maybeAnimate(zStateSetMatches);
        }
        this.previousStateSetEmpty = iArr.length == 0;
        return super.onStateChange(iArr) || z;
    }

    public void setFocusRingBounds(@Nullable Rect rect) {
        this.state.ringCustomBounds = rect;
    }

    public void setFocusRingEnabled(boolean z) {
        this.state.ringEnabled = z;
    }

    public void setFocusRingInnerInset(float f2) {
        this.state.ringInnerInset = f2;
    }

    public void setFocusRingInnerStrokeColor(@ColorInt int i2) {
        this.state.ringInnerColor = i2;
    }

    public void setFocusRingInnerStrokeWidth(float f2) {
        this.state.ringInnerStrokeWidth = f2;
    }

    public void setFocusRingInset(float f2) {
        this.state.ringInset = f2;
    }

    public void setFocusRingMaterialShapeDrawable(@Nullable MaterialShapeDrawable materialShapeDrawable) {
        this.materialShapeDrawable = new WeakReference<>(materialShapeDrawable);
    }

    public void setFocusRingOuterStrokeColor(@ColorInt int i2) {
        this.state.ringOuterColor = i2;
    }

    public void setFocusRingOuterStrokeWidth(float f2) {
        this.state.ringOuterStrokeWidth = f2;
    }

    public void setFocusRingRadius(float f2) {
        this.state.ringRadius = f2;
    }

    public void setFocusRingShapeAppearance(@Nullable ShapeAppearance shapeAppearance) {
        this.state.ringShapeAppearance = shapeAppearance;
    }

    public void setFocusRingStateSet(@NonNull int[] iArr) {
        this.state.ringStateSet = iArr;
    }

    public boolean updateFocusRingShapeAppearanceFromWrappedDrawable() {
        ShapeAppearance shapeAppearance = toShapeAppearance(getDrawable());
        if (shapeAppearance == null) {
            return false;
        }
        updateShapeAppearanceCornerSizeOrPath(shapeAppearance);
        return true;
    }

    public FocusRingDrawable() {
        super(null);
        this.paint = new Paint(1);
        this.tmpRectF = new RectF();
        this.tmpRect = new Rect();
        this.tmpPath = new Path();
        this.shapeAppearancePath = new Path();
        this.matrix = new Matrix();
        this.pathProvider = ShapeAppearancePathProvider.getInstanceOrCreate();
        this.shapeAppearanceCornerSize = -1.0f;
        this.interpolation = 1.0f;
        this.focused = false;
        this.mutated = false;
        this.state = new FocusRingState(null);
    }

    @Nullable
    public static FocusRingDrawable layer(@NonNull Context context, @NonNull LayerDrawable layerDrawable, @Nullable MaterialShapeDrawable materialShapeDrawable) {
        if (!shouldUseFocusRing(context)) {
            return null;
        }
        FocusRingDrawable focusRingDrawable = new FocusRingDrawable(context, EMPTY_DRAWABLE);
        if (materialShapeDrawable != null) {
            focusRingDrawable.setFocusRingMaterialShapeDrawable(materialShapeDrawable);
        }
        layerDrawable.addLayer(focusRingDrawable);
        focusRingDrawable.setCallback(layerDrawable);
        return focusRingDrawable;
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public void inflate(@NonNull Resources resources, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, @Nullable Resources.Theme theme) throws XmlPullParserException, IOException {
        super.inflate(resources, xmlPullParser, attributeSet, theme);
        TypedArray typedArrayObtainStyledAttributes = theme != null ? theme.obtainStyledAttributes(attributeSet, C5183R.styleable.FocusRingDrawable, 0, 0) : resources.obtainAttributes(attributeSet, C5183R.styleable.FocusRingDrawable);
        updateStateFromTypedArrayWithoutThemeAttrsOrDefaults(typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
        inflateChildDrawable(resources, xmlPullParser, attributeSet, theme);
    }

    public void setFocusRingBounds(int i2, int i3, int i4, int i5) {
        if (this.state.ringCustomBounds == null) {
            this.state.ringCustomBounds = new Rect();
        }
        this.state.ringCustomBounds.set(i2, i3, i4, i5);
    }

    @Nullable
    private ShapeAppearance toShapeAppearance(@NonNull ShapeDrawable shapeDrawable) {
        Outline outline = new Outline();
        shapeDrawable.getOutline(outline);
        if (outline.getRadius() > 0.0f) {
            return ShapeAppearanceModel.builder().setAllCornerSizes(outline.getRadius()).build();
        }
        return null;
    }

    @Nullable
    private ShapeAppearance toShapeAppearance(@NonNull GradientDrawable gradientDrawable) {
        float[] cornerRadiiOrNull = getCornerRadiiOrNull(gradientDrawable);
        if (cornerRadiiOrNull != null) {
            return ShapeAppearanceModel.builder().setTopLeftCornerSize(Math.min(cornerRadiiOrNull[0], cornerRadiiOrNull[1])).setTopRightCornerSize(Math.min(cornerRadiiOrNull[2], cornerRadiiOrNull[3])).setBottomRightCornerSize(Math.min(cornerRadiiOrNull[4], cornerRadiiOrNull[5])).setBottomLeftCornerSize(Math.min(cornerRadiiOrNull[6], cornerRadiiOrNull[7])).build();
        }
        float cornerRadius = getCornerRadius(gradientDrawable);
        if (cornerRadius > 0.0f) {
            return ShapeAppearanceModel.builder().setAllCornerSizes(cornerRadius).build();
        }
        return null;
    }

    public FocusRingDrawable(@NonNull Context context, @Nullable Drawable drawable) {
        super(drawable);
        this.paint = new Paint(1);
        this.tmpRectF = new RectF();
        this.tmpRect = new Rect();
        this.tmpPath = new Path();
        this.shapeAppearancePath = new Path();
        this.matrix = new Matrix();
        this.pathProvider = ShapeAppearancePathProvider.getInstanceOrCreate();
        this.shapeAppearanceCornerSize = -1.0f;
        this.interpolation = 1.0f;
        this.focused = false;
        this.mutated = false;
        FocusRingState focusRingState = new FocusRingState(null);
        this.state = focusRingState;
        if (drawable != null) {
            focusRingState.wrappedState = drawable.getConstantState();
        }
        init(context.getTheme());
    }

    private FocusRingDrawable(@NonNull FocusRingState focusRingState, @Nullable Resources resources) {
        Drawable drawableNewDrawable;
        super(null);
        this.paint = new Paint(1);
        this.tmpRectF = new RectF();
        this.tmpRect = new Rect();
        this.tmpPath = new Path();
        this.shapeAppearancePath = new Path();
        this.matrix = new Matrix();
        this.pathProvider = ShapeAppearancePathProvider.getInstanceOrCreate();
        this.shapeAppearanceCornerSize = -1.0f;
        this.interpolation = 1.0f;
        this.focused = false;
        this.mutated = false;
        FocusRingState focusRingState2 = new FocusRingState(focusRingState);
        this.state = focusRingState2;
        Drawable.ConstantState constantState = focusRingState2.wrappedState;
        if (constantState != null) {
            if (resources != null) {
                drawableNewDrawable = constantState.newDrawable(resources);
            } else {
                drawableNewDrawable = constantState.newDrawable();
            }
            setDrawable(drawableNewDrawable);
        }
        updateLocalState();
    }
}
