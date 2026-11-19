package com.google.android.material.shape;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import androidx.annotation.AttrRes;
import androidx.annotation.ColorInt;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.collection.ScatterMapKt;
import androidx.core.graphics.drawable.TintAwareDrawable;
import androidx.core.util.ObjectsCompat;
import androidx.dynamicanimation.animation.FloatPropertyCompat;
import androidx.dynamicanimation.animation.SpringAnimation;
import androidx.dynamicanimation.animation.SpringForce;
import com.google.android.material.C5183R;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.drawable.DrawableUtils;
import com.google.android.material.elevation.ElevationOverlayProvider;
import com.google.android.material.math.MathUtils;
import com.google.android.material.shadow.ShadowRenderer;
import com.google.android.material.transformation.FabTransformationScrimBehavior;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.BitSet;
import p011H.AbstractC0271e0;

/* JADX INFO: loaded from: classes2.dex */
public class MaterialShapeDrawable extends Drawable implements TintAwareDrawable, Shapeable {
    private static final SpringAnimatedCornerSizeProperty[] CORNER_SIZES_IN_PX;
    static final ShapeAppearanceModel DEFAULT_INTERPOLATION_START_SHAPE_APPEARANCE_MODEL = ShapeAppearanceModel.builder().setAllCorners(0, 0.0f).build();
    public static final int SHADOW_COMPAT_MODE_ALWAYS = 2;
    public static final int SHADOW_COMPAT_MODE_DEFAULT = 0;
    public static final int SHADOW_COMPAT_MODE_NEVER = 1;
    private static final float SHADOW_OFFSET_MULTIPLIER = 0.25f;
    private static final float SHADOW_RADIUS_MULTIPLIER = 0.75f;
    private static final String TAG = "MaterialShapeDrawable";
    private static final Paint clearPaint;
    private final BitSet containsIncompatibleShadowOp;
    private final ShapePath.ShadowCompatOperation[] cornerShadowOperation;

    @NonNull
    SpringAnimation[] cornerSpringAnimations;

    @Nullable
    private SpringForce cornerSpringForce;
    private MaterialShapeDrawableState drawableState;
    private final ShapePath.ShadowCompatOperation[] edgeShadowOperation;
    private final Paint fillPaint;
    private final RectF insetRectF;
    private boolean isRoundRectCornerMorph;
    private final Matrix matrix;

    @Nullable
    private OnCornerSizeChangeListener onCornerSizeChangeListener;
    private final Path path;

    @NonNull
    private final RectF pathBounds;
    private boolean pathDirty;
    private final Path pathInsetByStroke;
    private final ShapeAppearancePathProvider pathProvider;

    @NonNull
    private final ShapeAppearancePathProvider.PathListener pathShadowListener;
    private final RectF rectF;
    private int resolvedTintColor;
    private final Region scratchRegion;
    private boolean shadowBitmapDrawingEnable;
    private final ShadowRenderer shadowRenderer;

    @Nullable
    private float[] springAnimatedCornerSizes;

    @Nullable
    private float[] springAnimatedStrokeCornerSizes;
    private final ShapeAppearanceModel.CornerSizeUnaryOperator strokeInsetCornerSizeUnaryOperator;
    private final Paint strokePaint;
    private boolean strokePathDirty;

    @NonNull
    private ShapeAppearanceModel strokeShapeAppearanceModel;

    @Nullable
    private PorterDuffColorFilter strokeTintFilter;

    @Nullable
    private PorterDuffColorFilter tintFilter;
    private final Region transparentRegion;

    @Retention(RetentionPolicy.SOURCE)
    public @interface CompatibilityShadowMode {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public interface OnCornerSizeChangeListener {
        void onCornerSizeChange(float f2);
    }

    public static class SpringAnimatedCornerSizeProperty extends FloatPropertyCompat<MaterialShapeDrawable> {
        private final int index;

        public SpringAnimatedCornerSizeProperty(int i2) {
            super(AbstractC0271e0.m396d(i2, "cornerSizeAtIndex"));
            this.index = i2;
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public float getValue(@NonNull MaterialShapeDrawable materialShapeDrawable) {
            if (materialShapeDrawable.springAnimatedCornerSizes != null) {
                return materialShapeDrawable.springAnimatedCornerSizes[this.index];
            }
            return 0.0f;
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public void setValue(@NonNull MaterialShapeDrawable materialShapeDrawable, float f2) {
            if (materialShapeDrawable.springAnimatedCornerSizes == null || materialShapeDrawable.springAnimatedCornerSizes[this.index] == f2) {
                return;
            }
            materialShapeDrawable.springAnimatedCornerSizes[this.index] = f2;
            if (materialShapeDrawable.onCornerSizeChangeListener != null) {
                materialShapeDrawable.onCornerSizeChangeListener.onCornerSizeChange(materialShapeDrawable.getCornerSizeDiffX());
            }
            materialShapeDrawable.invalidateSelf();
        }
    }

    static {
        int i2 = 0;
        Paint paint = new Paint(1);
        clearPaint = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        CORNER_SIZES_IN_PX = new SpringAnimatedCornerSizeProperty[4];
        while (true) {
            SpringAnimatedCornerSizeProperty[] springAnimatedCornerSizePropertyArr = CORNER_SIZES_IN_PX;
            if (i2 >= springAnimatedCornerSizePropertyArr.length) {
                return;
            }
            springAnimatedCornerSizePropertyArr[i2] = new SpringAnimatedCornerSizeProperty(i2);
            i2++;
        }
    }

    public MaterialShapeDrawable() {
        this(new ShapeAppearanceModel());
    }

    @Nullable
    private PorterDuffColorFilter calculatePaintColorTintFilter(@NonNull Paint paint, boolean z) {
        if (!z) {
            return null;
        }
        int color = paint.getColor();
        int iCompositeElevationOverlayIfNeeded = compositeElevationOverlayIfNeeded(color);
        this.resolvedTintColor = iCompositeElevationOverlayIfNeeded;
        if (iCompositeElevationOverlayIfNeeded != color) {
            return new PorterDuffColorFilter(iCompositeElevationOverlayIfNeeded, PorterDuff.Mode.SRC_IN);
        }
        return null;
    }

    private void calculatePath(@NonNull RectF rectF, @NonNull Path path) {
        calculatePathForSize(rectF, path);
        if (this.drawableState.scale != 1.0f) {
            this.matrix.reset();
            Matrix matrix = this.matrix;
            float f2 = this.drawableState.scale;
            matrix.setScale(f2, f2, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(this.matrix);
        }
        path.computeBounds(this.pathBounds, true);
    }

    private void calculateStrokePath() {
        this.pathProvider.calculatePath(this.strokeShapeAppearanceModel, this.springAnimatedStrokeCornerSizes, this.drawableState.interpolation, getBoundsInsetByStroke(), null, this.pathInsetByStroke);
    }

    @NonNull
    private PorterDuffColorFilter calculateTintColorTintFilter(@NonNull ColorStateList colorStateList, @NonNull PorterDuff.Mode mode, boolean z) {
        int colorForState = colorStateList.getColorForState(getState(), 0);
        if (z) {
            colorForState = compositeElevationOverlayIfNeeded(colorForState);
        }
        this.resolvedTintColor = colorForState;
        return new PorterDuffColorFilter(colorForState, mode);
    }

    @NonNull
    private PorterDuffColorFilter calculateTintFilter(@Nullable ColorStateList colorStateList, @Nullable PorterDuff.Mode mode, @NonNull Paint paint, boolean z) {
        return (colorStateList == null || mode == null) ? calculatePaintColorTintFilter(paint, z) : calculateTintColorTintFilter(colorStateList, mode, z);
    }

    @NonNull
    public static MaterialShapeDrawable createWithElevationOverlay(Context context) {
        return createWithElevationOverlay(context, 0.0f);
    }

    private void drawCompatShadow(@NonNull Canvas canvas) {
        if (this.containsIncompatibleShadowOp.cardinality() > 0) {
            Log.w(TAG, "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        if (this.drawableState.shadowCompatOffset != 0) {
            canvas.drawPath(this.path, this.shadowRenderer.getShadowPaint());
        }
        for (int i2 = 0; i2 < 4; i2++) {
            this.cornerShadowOperation[i2].draw(this.shadowRenderer, this.drawableState.shadowCompatRadius, canvas);
            this.edgeShadowOperation[i2].draw(this.shadowRenderer, this.drawableState.shadowCompatRadius, canvas);
        }
        if (this.shadowBitmapDrawingEnable) {
            int shadowOffsetX = getShadowOffsetX();
            int shadowOffsetY = getShadowOffsetY();
            canvas.translate(-shadowOffsetX, -shadowOffsetY);
            canvas.drawPath(this.path, clearPaint);
            canvas.translate(shadowOffsetX, shadowOffsetY);
        }
    }

    private void drawFillShape(@NonNull Canvas canvas) {
        drawShape(canvas, this.fillPaint, this.path, this.drawableState.shapeAppearance.getDefaultShape(), this.springAnimatedCornerSizes, getBoundsAsRectF());
    }

    @NonNull
    private RectF getBoundsInsetByStroke() {
        this.insetRectF.set(getBoundsAsRectF());
        float strokeInsetLength = getStrokeInsetLength();
        this.insetRectF.inset(strokeInsetLength, strokeInsetLength);
        return this.insetRectF;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getStrokeInsetLength() {
        if (hasStroke()) {
            return this.strokePaint.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    private boolean hasCompatShadow() {
        MaterialShapeDrawableState materialShapeDrawableState = this.drawableState;
        int i2 = materialShapeDrawableState.shadowCompatMode;
        if (i2 == 1 || materialShapeDrawableState.shadowCompatRadius <= 0) {
            return false;
        }
        return i2 == 2 || requiresCompatShadow();
    }

    private boolean hasFill() {
        Paint.Style style = this.drawableState.paintStyle;
        return style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL;
    }

    private boolean hasStroke() {
        Paint.Style style = this.drawableState.paintStyle;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.strokePaint.getStrokeWidth() > 0.0f;
    }

    private void invalidateSelfIgnoreShape() {
        super.invalidateSelf();
    }

    private boolean isCornerSpringAnimationRunning() {
        for (SpringAnimation springAnimation : this.cornerSpringAnimations) {
            if (springAnimation != null && springAnimation.isRunning()) {
                return true;
            }
        }
        return false;
    }

    private void maybeDrawCompatShadow(@NonNull Canvas canvas) {
        if (hasCompatShadow()) {
            canvas.save();
            prepareCanvasForShadow(canvas);
            if (!this.shadowBitmapDrawingEnable) {
                drawCompatShadow(canvas);
                canvas.restore();
                return;
            }
            Rect bounds = getBounds();
            int iWidth = (int) (this.pathBounds.width() - bounds.width());
            int iHeight = (int) (this.pathBounds.height() - bounds.height());
            if (iWidth < 0 || iHeight < 0) {
                StringBuilder sbM409q = AbstractC0271e0.m409q("Invalid shadow bounds. Check that the treatments result in a valid path. extra width: ", iWidth, " extra height: ", iHeight, " path bounds: ");
                sbM409q.append(this.pathBounds);
                throw new IllegalStateException(sbM409q.toString());
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap((this.drawableState.shadowCompatRadius * 2) + ((int) this.pathBounds.width()) + iWidth, (this.drawableState.shadowCompatRadius * 2) + ((int) this.pathBounds.height()) + iHeight, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(bitmapCreateBitmap);
            int i2 = bounds.left;
            int i3 = this.drawableState.shadowCompatRadius;
            float f2 = (i2 - i3) - iWidth;
            float f3 = (bounds.top - i3) - iHeight;
            canvas2.translate(-f2, -f3);
            drawCompatShadow(canvas2);
            canvas.drawBitmap(bitmapCreateBitmap, f2, f3, (Paint) null);
            bitmapCreateBitmap.recycle();
            canvas.restore();
        }
    }

    private static int modulateAlpha(int i2, int i3) {
        return ((i3 + (i3 >>> 7)) * i2) >>> 8;
    }

    private void prepareCanvasForShadow(@NonNull Canvas canvas) {
        canvas.translate(getShadowOffsetX(), getShadowOffsetY());
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    private void setStateListShapeAppearanceModel(@NonNull StateListShapeAppearanceModel stateListShapeAppearanceModel) {
        MaterialShapeDrawableState materialShapeDrawableState = this.drawableState;
        if (materialShapeDrawableState.shapeAppearance != stateListShapeAppearanceModel) {
            materialShapeDrawableState.shapeAppearance = stateListShapeAppearanceModel;
            updateShape(getState(), true);
            invalidateSelf();
        }
    }

    private boolean shouldCalculatePath() {
        return hasCompatShadow() || !isRoundRect();
    }

    private boolean updateColorsForState(int[] iArr) {
        boolean z;
        int color;
        int colorForState;
        int color2;
        int colorForState2;
        if (this.drawableState.fillColor == null || color2 == (colorForState2 = this.drawableState.fillColor.getColorForState(iArr, (color2 = this.fillPaint.getColor())))) {
            z = false;
        } else {
            this.fillPaint.setColor(colorForState2);
            z = true;
        }
        if (this.drawableState.strokeColor == null || color == (colorForState = this.drawableState.strokeColor.getColorForState(iArr, (color = this.strokePaint.getColor())))) {
            return z;
        }
        this.strokePaint.setColor(colorForState);
        return true;
    }

    private void updateShape(int[] iArr) {
        updateShape(iArr, false);
    }

    private void updateStrokeShapeAppearanceModels() {
        this.strokeShapeAppearanceModel = getShapeAppearanceModel().withTransformedCornerSizes(this.strokeInsetCornerSizeUnaryOperator);
        float[] fArr = this.springAnimatedCornerSizes;
        if (fArr == null) {
            this.springAnimatedStrokeCornerSizes = null;
            return;
        }
        if (this.springAnimatedStrokeCornerSizes == null) {
            this.springAnimatedStrokeCornerSizes = new float[fArr.length];
        }
        float strokeInsetLength = getStrokeInsetLength();
        int i2 = 0;
        while (true) {
            float[] fArr2 = this.springAnimatedCornerSizes;
            if (i2 >= fArr2.length) {
                return;
            }
            this.springAnimatedStrokeCornerSizes[i2] = Math.max(0.0f, fArr2[i2] - strokeInsetLength);
            i2++;
        }
    }

    private boolean updateTintFilter() {
        PorterDuffColorFilter porterDuffColorFilter = this.tintFilter;
        PorterDuffColorFilter porterDuffColorFilter2 = this.strokeTintFilter;
        MaterialShapeDrawableState materialShapeDrawableState = this.drawableState;
        this.tintFilter = calculateTintFilter(materialShapeDrawableState.tintList, materialShapeDrawableState.tintMode, this.fillPaint, true);
        MaterialShapeDrawableState materialShapeDrawableState2 = this.drawableState;
        this.strokeTintFilter = calculateTintFilter(materialShapeDrawableState2.strokeTintList, materialShapeDrawableState2.tintMode, this.strokePaint, false);
        MaterialShapeDrawableState materialShapeDrawableState3 = this.drawableState;
        if (materialShapeDrawableState3.useTintColorForShadow) {
            this.shadowRenderer.setShadowColor(materialShapeDrawableState3.tintList.getColorForState(getState(), 0));
        }
        return (ObjectsCompat.equals(porterDuffColorFilter, this.tintFilter) && ObjectsCompat.equals(porterDuffColorFilter2, this.strokeTintFilter)) ? false : true;
    }

    private void updateZ() {
        float z = getZ();
        this.drawableState.shadowCompatRadius = (int) Math.ceil(0.75f * z);
        this.drawableState.shadowCompatOffset = (int) Math.ceil(z * SHADOW_OFFSET_MULTIPLIER);
        updateTintFilter();
        if (shouldCalculatePath()) {
            invalidateSelf();
        } else {
            invalidateSelfIgnoreShape();
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void calculatePathForSize(@NonNull RectF rectF, @NonNull Path path) {
        this.pathProvider.calculatePath(this.drawableState.shapeAppearance.getDefaultShape(), this.springAnimatedCornerSizes, this.drawableState.interpolation, rectF, this.pathShadowListener, path);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public float calculateRoundRectCornerSize() {
        float fCalculateRoundRectCornerSize = calculateRoundRectCornerSize(getBoundsAsRectF(), this.drawableState.shapeAppearance.getDefaultShape(), this.springAnimatedCornerSizes);
        return fCalculateRoundRectCornerSize >= 0.0f ? fCalculateRoundRectCornerSize * this.drawableState.interpolation : fCalculateRoundRectCornerSize;
    }

    @ColorInt
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int compositeElevationOverlayIfNeeded(@ColorInt int i2) {
        float parentAbsoluteElevation = getParentAbsoluteElevation() + getZ();
        ElevationOverlayProvider elevationOverlayProvider = this.drawableState.elevationOverlayProvider;
        return elevationOverlayProvider != null ? elevationOverlayProvider.compositeOverlayIfNeeded(i2, parentAbsoluteElevation) : i2;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        this.fillPaint.setColorFilter(this.tintFilter);
        int alpha = this.fillPaint.getAlpha();
        this.fillPaint.setAlpha(modulateAlpha(alpha, this.drawableState.alpha));
        this.strokePaint.setColorFilter(this.strokeTintFilter);
        this.strokePaint.setStrokeWidth(this.drawableState.strokeWidth);
        int alpha2 = this.strokePaint.getAlpha();
        this.strokePaint.setAlpha(modulateAlpha(alpha2, this.drawableState.alpha));
        boolean zShouldCalculatePath = shouldCalculatePath();
        if (hasFill()) {
            if (this.pathDirty) {
                if (zShouldCalculatePath) {
                    calculatePath(getBoundsAsRectF(), this.path);
                }
                this.pathDirty = false;
            }
            maybeDrawCompatShadow(canvas);
            drawFillShape(canvas);
        }
        if (hasStroke()) {
            if (this.strokePathDirty) {
                updateStrokeShapeAppearanceModels();
                if (zShouldCalculatePath) {
                    calculateStrokePath();
                }
                this.strokePathDirty = false;
            }
            drawStrokeShape(canvas);
        }
        this.fillPaint.setAlpha(alpha);
        this.strokePaint.setAlpha(alpha2);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void drawShape(@NonNull Canvas canvas, @NonNull Paint paint, @NonNull Path path, @NonNull RectF rectF) {
        drawShape(canvas, paint, path, this.drawableState.shapeAppearance.getDefaultShape(), this.springAnimatedCornerSizes, rectF);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void drawStrokeShape(@NonNull Canvas canvas) {
        drawShape(canvas, this.strokePaint, this.pathInsetByStroke, this.strokeShapeAppearanceModel, this.springAnimatedStrokeCornerSizes, getBoundsInsetByStroke());
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.drawableState.alpha;
    }

    public float getBottomLeftCornerResolvedSize() {
        float[] fArr = this.springAnimatedCornerSizes;
        return fArr != null ? fArr[2] : this.drawableState.shapeAppearance.getDefaultShape().getBottomLeftCornerSize().getCornerSize(getBoundsAsRectF());
    }

    public float getBottomRightCornerResolvedSize() {
        float[] fArr = this.springAnimatedCornerSizes;
        return fArr != null ? fArr[1] : this.drawableState.shapeAppearance.getDefaultShape().getBottomRightCornerSize().getCornerSize(getBoundsAsRectF());
    }

    @NonNull
    public RectF getBoundsAsRectF() {
        this.rectF.set(getBounds());
        return this.rectF;
    }

    @Override // android.graphics.drawable.Drawable
    @Nullable
    public Drawable.ConstantState getConstantState() {
        return this.drawableState;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public float getCornerSizeDiffX() {
        float[] fArr = this.springAnimatedCornerSizes;
        if (fArr != null) {
            return (((fArr[3] + fArr[2]) - fArr[1]) - fArr[0]) / 2.0f;
        }
        RectF boundsAsRectF = getBoundsAsRectF();
        return (((this.pathProvider.getCornerSizeForIndex(2, getShapeAppearanceModel()).getCornerSize(boundsAsRectF) + this.pathProvider.getCornerSizeForIndex(3, getShapeAppearanceModel()).getCornerSize(boundsAsRectF)) - this.pathProvider.getCornerSizeForIndex(1, getShapeAppearanceModel()).getCornerSize(boundsAsRectF)) - this.pathProvider.getCornerSizeForIndex(0, getShapeAppearanceModel()).getCornerSize(boundsAsRectF)) / 2.0f;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public SpringForce getCornerSpringForce() {
        return this.cornerSpringForce;
    }

    public float getElevation() {
        return this.drawableState.elevation;
    }

    @Nullable
    public ColorStateList getFillColor() {
        return this.drawableState.fillColor;
    }

    public float getInterpolation() {
        return this.drawableState.interpolation;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(@NonNull Outline outline) {
        if (this.drawableState.shadowCompatMode == 2) {
            return;
        }
        RectF boundsAsRectF = getBoundsAsRectF();
        if (boundsAsRectF.isEmpty()) {
            return;
        }
        float fCalculateRoundRectCornerSize = calculateRoundRectCornerSize(boundsAsRectF, this.drawableState.shapeAppearance.getDefaultShape(), this.springAnimatedCornerSizes);
        if (fCalculateRoundRectCornerSize >= 0.0f) {
            outline.setRoundRect(getBounds(), fCalculateRoundRectCornerSize * this.drawableState.interpolation);
            return;
        }
        if (this.pathDirty) {
            calculatePath(boundsAsRectF, this.path);
            this.pathDirty = false;
        }
        DrawableUtils.setOutlineToPath(outline, this.path);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(@NonNull Rect rect) {
        Rect rect2 = this.drawableState.padding;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    public Paint.Style getPaintStyle() {
        return this.drawableState.paintStyle;
    }

    public float getParentAbsoluteElevation() {
        return this.drawableState.parentAbsoluteElevation;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public Path getPath() {
        return this.path;
    }

    @Deprecated
    public void getPathForSize(int i2, int i3, @NonNull Path path) {
        calculatePathForSize(new RectF(0.0f, 0.0f, i2, i3), path);
    }

    @ColorInt
    public int getResolvedTintColor() {
        return this.resolvedTintColor;
    }

    public float getScale() {
        return this.drawableState.scale;
    }

    public int getShadowCompatRotation() {
        return this.drawableState.shadowCompatRotation;
    }

    public int getShadowCompatibilityMode() {
        return this.drawableState.shadowCompatMode;
    }

    @Deprecated
    public int getShadowElevation() {
        return (int) getElevation();
    }

    public int getShadowOffsetX() {
        MaterialShapeDrawableState materialShapeDrawableState = this.drawableState;
        return (int) (Math.sin(Math.toRadians(materialShapeDrawableState.shadowCompatRotation)) * ((double) materialShapeDrawableState.shadowCompatOffset));
    }

    public int getShadowOffsetY() {
        MaterialShapeDrawableState materialShapeDrawableState = this.drawableState;
        return (int) (Math.cos(Math.toRadians(materialShapeDrawableState.shadowCompatRotation)) * ((double) materialShapeDrawableState.shadowCompatOffset));
    }

    public int getShadowRadius() {
        return this.drawableState.shadowCompatRadius;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int getShadowVerticalOffset() {
        return this.drawableState.shadowCompatOffset;
    }

    @Override // com.google.android.material.shape.Shapeable
    @NonNull
    public ShapeAppearanceModel getShapeAppearanceModel() {
        return this.drawableState.shapeAppearance.getDefaultShape();
    }

    @Nullable
    @Deprecated
    public ShapePathModel getShapedViewModel() {
        ShapeAppearanceModel shapeAppearanceModel = getShapeAppearanceModel();
        if (shapeAppearanceModel instanceof ShapePathModel) {
            return (ShapePathModel) shapeAppearanceModel;
        }
        return null;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public StateListShapeAppearanceModel getStateListShapeAppearanceModel() {
        ShapeAppearance shapeAppearance = this.drawableState.shapeAppearance;
        if (shapeAppearance instanceof StateListShapeAppearanceModel) {
            return (StateListShapeAppearanceModel) shapeAppearance;
        }
        return null;
    }

    @Nullable
    public ColorStateList getStrokeColor() {
        return this.drawableState.strokeColor;
    }

    @Nullable
    public ColorStateList getStrokeTintList() {
        return this.drawableState.strokeTintList;
    }

    public float getStrokeWidth() {
        return this.drawableState.strokeWidth;
    }

    @Nullable
    public ColorStateList getTintList() {
        return this.drawableState.tintList;
    }

    public float getTopLeftCornerResolvedSize() {
        float[] fArr = this.springAnimatedCornerSizes;
        return fArr != null ? fArr[3] : this.drawableState.shapeAppearance.getDefaultShape().getTopLeftCornerSize().getCornerSize(getBoundsAsRectF());
    }

    public float getTopRightCornerResolvedSize() {
        float[] fArr = this.springAnimatedCornerSizes;
        return fArr != null ? fArr[0] : this.drawableState.shapeAppearance.getDefaultShape().getTopRightCornerSize().getCornerSize(getBoundsAsRectF());
    }

    public float getTranslationZ() {
        return this.drawableState.translationZ;
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        this.transparentRegion.set(getBounds());
        calculatePath(getBoundsAsRectF(), this.path);
        this.scratchRegion.setPath(this.path, this.transparentRegion);
        this.transparentRegion.op(this.scratchRegion, Region.Op.DIFFERENCE);
        return this.transparentRegion;
    }

    public float getZ() {
        return getTranslationZ() + getElevation();
    }

    public void initializeElevationOverlay(Context context) {
        this.drawableState.elevationOverlayProvider = new ElevationOverlayProvider(context);
        updateZ();
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        this.pathDirty = true;
        this.strokePathDirty = true;
        super.invalidateSelf();
    }

    public boolean isElevationOverlayEnabled() {
        ElevationOverlayProvider elevationOverlayProvider = this.drawableState.elevationOverlayProvider;
        return elevationOverlayProvider != null && elevationOverlayProvider.isThemeElevationOverlayEnabled();
    }

    public boolean isElevationOverlayInitialized() {
        return this.drawableState.elevationOverlayProvider != null;
    }

    public boolean isPointInTransparentRegion(int i2, int i3) {
        return getTransparentRegion().contains(i2, i3);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean isRoundRect() {
        if (this.drawableState.shapeAppearance.getShapeForState(getState()).isRoundRect(getBoundsAsRectF())) {
            return this.springAnimatedCornerSizes == null || this.isRoundRectCornerMorph;
        }
        return false;
    }

    @Deprecated
    public boolean isShadowEnabled() {
        int i2 = this.drawableState.shadowCompatMode;
        return i2 == 0 || i2 == 2;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (super.isStateful()) {
            return true;
        }
        ColorStateList colorStateList = this.drawableState.tintList;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        ColorStateList colorStateList2 = this.drawableState.strokeTintList;
        if (colorStateList2 != null && colorStateList2.isStateful()) {
            return true;
        }
        ColorStateList colorStateList3 = this.drawableState.strokeColor;
        if (colorStateList3 != null && colorStateList3.isStateful()) {
            return true;
        }
        ColorStateList colorStateList4 = this.drawableState.fillColor;
        return (colorStateList4 != null && colorStateList4.isStateful()) || this.drawableState.shapeAppearance.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    @NonNull
    public Drawable mutate() {
        this.drawableState = new MaterialShapeDrawableState(this.drawableState);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        this.pathDirty = true;
        this.strokePathDirty = true;
        super.onBoundsChange(rect);
        if (!this.drawableState.shapeAppearance.isStateful() || rect.isEmpty()) {
            return;
        }
        updateShape(getState(), true ^ isCornerSpringAnimationRunning());
    }

    @Override // android.graphics.drawable.Drawable, com.google.android.material.internal.TextDrawableHelper.TextDrawableDelegate
    public boolean onStateChange(int[] iArr) {
        if (this.drawableState.shapeAppearance.isStateful()) {
            updateShape(iArr);
        }
        boolean z = updateColorsForState(iArr) || updateTintFilter();
        if (z) {
            invalidateSelf();
        }
        return z;
    }

    public boolean requiresCompatShadow() {
        return (isRoundRect() || this.path.isConvex() || Build.VERSION.SDK_INT >= 29) ? false : true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(@IntRange(from = FabTransformationScrimBehavior.COLLAPSE_DELAY, m1893to = ScatterMapKt.Sentinel) int i2) {
        MaterialShapeDrawableState materialShapeDrawableState = this.drawableState;
        if (materialShapeDrawableState.alpha != i2) {
            materialShapeDrawableState.alpha = i2;
            invalidateSelfIgnoreShape();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
        this.drawableState.colorFilter = colorFilter;
        invalidateSelfIgnoreShape();
    }

    public void setCornerSize(float f2) {
        setShapeAppearanceModel(this.drawableState.shapeAppearance.withCornerSize(f2));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setCornerSpringForce(@NonNull SpringForce springForce) {
        if (this.cornerSpringForce == springForce) {
            return;
        }
        this.cornerSpringForce = springForce;
        int i2 = 0;
        while (true) {
            SpringAnimation[] springAnimationArr = this.cornerSpringAnimations;
            if (i2 >= springAnimationArr.length) {
                updateShape(getState(), true);
                invalidateSelf();
                return;
            } else {
                if (springAnimationArr[i2] == null) {
                    springAnimationArr[i2] = new SpringAnimation(this, CORNER_SIZES_IN_PX[i2]);
                }
                this.cornerSpringAnimations[i2].setSpring(new SpringForce().setDampingRatio(springForce.getDampingRatio()).setStiffness(springForce.getStiffness()));
                i2++;
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setEdgeIntersectionCheckEnable(boolean z) {
        this.pathProvider.setEdgeIntersectionCheckEnable(z);
    }

    public void setElevation(float f2) {
        MaterialShapeDrawableState materialShapeDrawableState = this.drawableState;
        if (materialShapeDrawableState.elevation != f2) {
            materialShapeDrawableState.elevation = f2;
            updateZ();
        }
    }

    public void setFillColor(@Nullable ColorStateList colorStateList) {
        MaterialShapeDrawableState materialShapeDrawableState = this.drawableState;
        if (materialShapeDrawableState.fillColor != colorStateList) {
            materialShapeDrawableState.fillColor = colorStateList;
            onStateChange(getState());
        }
    }

    public void setInterpolation(float f2) {
        MaterialShapeDrawableState materialShapeDrawableState = this.drawableState;
        if (materialShapeDrawableState.interpolation != f2) {
            materialShapeDrawableState.interpolation = f2;
            this.pathDirty = true;
            this.strokePathDirty = true;
            invalidateSelf();
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setOnCornerSizeChangeListener(@Nullable OnCornerSizeChangeListener onCornerSizeChangeListener) {
        this.onCornerSizeChangeListener = onCornerSizeChangeListener;
    }

    public void setPadding(int i2, int i3, int i4, int i5) {
        MaterialShapeDrawableState materialShapeDrawableState = this.drawableState;
        if (materialShapeDrawableState.padding == null) {
            materialShapeDrawableState.padding = new Rect();
        }
        this.drawableState.padding.set(i2, i3, i4, i5);
        invalidateSelf();
    }

    public void setPaintStyle(Paint.Style style) {
        this.drawableState.paintStyle = style;
        invalidateSelfIgnoreShape();
    }

    public void setParentAbsoluteElevation(float f2) {
        MaterialShapeDrawableState materialShapeDrawableState = this.drawableState;
        if (materialShapeDrawableState.parentAbsoluteElevation != f2) {
            materialShapeDrawableState.parentAbsoluteElevation = f2;
            updateZ();
        }
    }

    public void setScale(float f2) {
        MaterialShapeDrawableState materialShapeDrawableState = this.drawableState;
        if (materialShapeDrawableState.scale != f2) {
            materialShapeDrawableState.scale = f2;
            invalidateSelf();
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setShadowBitmapDrawingEnable(boolean z) {
        this.shadowBitmapDrawingEnable = z;
    }

    public void setShadowColor(int i2) {
        this.shadowRenderer.setShadowColor(i2);
        this.drawableState.useTintColorForShadow = false;
        invalidateSelfIgnoreShape();
    }

    public void setShadowCompatRotation(int i2) {
        MaterialShapeDrawableState materialShapeDrawableState = this.drawableState;
        if (materialShapeDrawableState.shadowCompatRotation != i2) {
            materialShapeDrawableState.shadowCompatRotation = i2;
            invalidateSelfIgnoreShape();
        }
    }

    public void setShadowCompatibilityMode(int i2) {
        MaterialShapeDrawableState materialShapeDrawableState = this.drawableState;
        if (materialShapeDrawableState.shadowCompatMode != i2) {
            materialShapeDrawableState.shadowCompatMode = i2;
            invalidateSelfIgnoreShape();
        }
    }

    @Deprecated
    public void setShadowElevation(int i2) {
        setElevation(i2);
    }

    @Deprecated
    public void setShadowEnabled(boolean z) {
        setShadowCompatibilityMode(!z ? 1 : 0);
    }

    @Deprecated
    public void setShadowRadius(int i2) {
        this.drawableState.shadowCompatRadius = i2;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setShadowVerticalOffset(int i2) {
        MaterialShapeDrawableState materialShapeDrawableState = this.drawableState;
        if (materialShapeDrawableState.shadowCompatOffset != i2) {
            materialShapeDrawableState.shadowCompatOffset = i2;
            invalidateSelfIgnoreShape();
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setShapeAppearance(@NonNull ShapeAppearance shapeAppearance) {
        if (shapeAppearance instanceof ShapeAppearanceModel) {
            setShapeAppearanceModel((ShapeAppearanceModel) shapeAppearance);
        } else {
            setStateListShapeAppearanceModel((StateListShapeAppearanceModel) shapeAppearance);
        }
    }

    @Override // com.google.android.material.shape.Shapeable
    public void setShapeAppearanceModel(@NonNull ShapeAppearanceModel shapeAppearanceModel) {
        this.drawableState.shapeAppearance = shapeAppearanceModel;
        this.springAnimatedCornerSizes = null;
        this.springAnimatedStrokeCornerSizes = null;
        invalidateSelf();
    }

    @Deprecated
    public void setShapedViewModel(@NonNull ShapePathModel shapePathModel) {
        setShapeAppearanceModel(shapePathModel);
    }

    public void setStroke(float f2, @ColorInt int i2) {
        setStrokeWidth(f2);
        setStrokeColor(ColorStateList.valueOf(i2));
    }

    public void setStrokeColor(@Nullable ColorStateList colorStateList) {
        MaterialShapeDrawableState materialShapeDrawableState = this.drawableState;
        if (materialShapeDrawableState.strokeColor != colorStateList) {
            materialShapeDrawableState.strokeColor = colorStateList;
            onStateChange(getState());
        }
    }

    public void setStrokeTint(ColorStateList colorStateList) {
        this.drawableState.strokeTintList = colorStateList;
        updateTintFilter();
        invalidateSelfIgnoreShape();
    }

    public void setStrokeWidth(float f2) {
        this.drawableState.strokeWidth = f2;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTint(@ColorInt int i2) {
        setTintList(ColorStateList.valueOf(i2));
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTintList(@Nullable ColorStateList colorStateList) {
        this.drawableState.tintList = colorStateList;
        updateTintFilter();
        invalidateSelfIgnoreShape();
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTintMode(@Nullable PorterDuff.Mode mode) {
        MaterialShapeDrawableState materialShapeDrawableState = this.drawableState;
        if (materialShapeDrawableState.tintMode != mode) {
            materialShapeDrawableState.tintMode = mode;
            updateTintFilter();
            invalidateSelfIgnoreShape();
        }
    }

    public void setTranslationZ(float f2) {
        MaterialShapeDrawableState materialShapeDrawableState = this.drawableState;
        if (materialShapeDrawableState.translationZ != f2) {
            materialShapeDrawableState.translationZ = f2;
            updateZ();
        }
    }

    public void setUseTintColorForShadow(boolean z) {
        MaterialShapeDrawableState materialShapeDrawableState = this.drawableState;
        if (materialShapeDrawableState.useTintColorForShadow != z) {
            materialShapeDrawableState.useTintColorForShadow = z;
            invalidateSelf();
        }
    }

    public void setZ(float f2) {
        setTranslationZ(f2 - getElevation());
    }

    public MaterialShapeDrawable(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i2, @StyleRes int i3) {
        this(ShapeAppearanceModel.builder(context, attributeSet, i2, i3).build());
    }

    @NonNull
    public static MaterialShapeDrawable createWithElevationOverlay(@NonNull Context context, float f2) {
        return createWithElevationOverlay(context, f2, null);
    }

    private void updateShape(int[] iArr, boolean z) {
        RectF boundsAsRectF = getBoundsAsRectF();
        if (!this.drawableState.shapeAppearance.isStateful() || boundsAsRectF.isEmpty()) {
            return;
        }
        boolean z2 = z | (this.cornerSpringForce == null);
        if (this.springAnimatedCornerSizes == null) {
            this.springAnimatedCornerSizes = new float[4];
        }
        ShapeAppearanceModel shapeForState = this.drawableState.shapeAppearance.getShapeForState(iArr);
        boolean z3 = MathUtils.areAllElementsEqual(this.springAnimatedCornerSizes) && shapeForState.isRoundRect(getBoundsAsRectF());
        this.isRoundRectCornerMorph = z3;
        if (!z3) {
            this.pathDirty = true;
            this.strokePathDirty = true;
        }
        for (int i2 = 0; i2 < 4; i2++) {
            float cornerSize = this.pathProvider.getCornerSizeForIndex(i2, shapeForState).getCornerSize(boundsAsRectF);
            if (z2) {
                this.springAnimatedCornerSizes[i2] = cornerSize;
            }
            SpringAnimation springAnimation = this.cornerSpringAnimations[i2];
            if (springAnimation != null) {
                springAnimation.animateToFinalPosition(cornerSize);
                if (z2) {
                    this.cornerSpringAnimations[i2].skipToEnd();
                }
            }
        }
        if (z2) {
            invalidateSelf();
        }
    }

    public void setCornerSize(@NonNull CornerSize cornerSize) {
        setShapeAppearanceModel(this.drawableState.shapeAppearance.withCornerSize(cornerSize));
    }

    @Deprecated
    public MaterialShapeDrawable(@NonNull ShapePathModel shapePathModel) {
        this((ShapeAppearanceModel) shapePathModel);
    }

    @NonNull
    public static MaterialShapeDrawable createWithElevationOverlay(@NonNull Context context, float f2, @Nullable ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(MaterialColors.getColor(context, C5183R.attr.colorSurface, "MaterialShapeDrawable"));
        }
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
        materialShapeDrawable.initializeElevationOverlay(context);
        materialShapeDrawable.setFillColor(colorStateList);
        materialShapeDrawable.setElevation(f2);
        return materialShapeDrawable;
    }

    public void setStroke(float f2, @Nullable ColorStateList colorStateList) {
        setStrokeWidth(f2);
        setStrokeColor(colorStateList);
    }

    public MaterialShapeDrawable(@NonNull ShapeAppearanceModel shapeAppearanceModel) {
        this(new MaterialShapeDrawableState(shapeAppearanceModel, null));
    }

    private void drawShape(@NonNull Canvas canvas, @NonNull Paint paint, @NonNull Path path, @NonNull ShapeAppearanceModel shapeAppearanceModel, @Nullable float[] fArr, @NonNull RectF rectF) {
        float fCalculateRoundRectCornerSize = calculateRoundRectCornerSize(rectF, shapeAppearanceModel, fArr);
        if (fCalculateRoundRectCornerSize >= 0.0f) {
            float f2 = fCalculateRoundRectCornerSize * this.drawableState.interpolation;
            canvas.drawRoundRect(rectF, f2, f2, paint);
        } else {
            canvas.drawPath(path, paint);
        }
    }

    public void setStrokeTint(@ColorInt int i2) {
        setStrokeTint(ColorStateList.valueOf(i2));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public MaterialShapeDrawable(@NonNull ShapeAppearance shapeAppearance) {
        this(new MaterialShapeDrawableState(shapeAppearance, null));
    }

    private float calculateRoundRectCornerSize(@NonNull RectF rectF, @NonNull ShapeAppearanceModel shapeAppearanceModel, @Nullable float[] fArr) {
        if (fArr == null) {
            if (shapeAppearanceModel.isRoundRect(rectF)) {
                return shapeAppearanceModel.getTopLeftCornerSize().getCornerSize(rectF);
            }
            return -1.0f;
        }
        if (this.isRoundRectCornerMorph) {
            return fArr[0];
        }
        return -1.0f;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public MaterialShapeDrawable(@NonNull MaterialShapeDrawableState materialShapeDrawableState) {
        this.strokeInsetCornerSizeUnaryOperator = new ShapeAppearanceModel.CornerSizeUnaryOperator() { // from class: com.google.android.material.shape.MaterialShapeDrawable.1
            @Override // com.google.android.material.shape.ShapeAppearanceModel.CornerSizeUnaryOperator
            @NonNull
            public CornerSize apply(@NonNull CornerSize cornerSize) {
                return cornerSize instanceof RelativeCornerSize ? cornerSize : new AdjustedCornerSize(-MaterialShapeDrawable.this.getStrokeInsetLength(), cornerSize);
            }
        };
        this.cornerShadowOperation = new ShapePath.ShadowCompatOperation[4];
        this.edgeShadowOperation = new ShapePath.ShadowCompatOperation[4];
        this.containsIncompatibleShadowOp = new BitSet(8);
        this.matrix = new Matrix();
        this.path = new Path();
        this.pathInsetByStroke = new Path();
        this.rectF = new RectF();
        this.insetRectF = new RectF();
        this.transparentRegion = new Region();
        this.scratchRegion = new Region();
        Paint paint = new Paint(1);
        this.fillPaint = paint;
        Paint paint2 = new Paint(1);
        this.strokePaint = paint2;
        this.shadowRenderer = new ShadowRenderer();
        this.pathProvider = ShapeAppearancePathProvider.getInstanceOrCreate();
        this.pathBounds = new RectF();
        this.shadowBitmapDrawingEnable = true;
        this.isRoundRectCornerMorph = true;
        this.cornerSpringAnimations = new SpringAnimation[4];
        this.drawableState = materialShapeDrawableState;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        updateTintFilter();
        updateColorsForState(getState());
        this.pathShadowListener = new ShapeAppearancePathProvider.PathListener() { // from class: com.google.android.material.shape.MaterialShapeDrawable.2
            @Override // com.google.android.material.shape.ShapeAppearancePathProvider.PathListener
            public void onCornerPathCreated(@NonNull ShapePath shapePath, Matrix matrix, int i2) {
                MaterialShapeDrawable.this.containsIncompatibleShadowOp.set(i2, shapePath.containsIncompatibleShadowOp());
                MaterialShapeDrawable.this.cornerShadowOperation[i2] = shapePath.createShadowCompatOperation(matrix);
            }

            @Override // com.google.android.material.shape.ShapeAppearancePathProvider.PathListener
            public void onEdgePathCreated(@NonNull ShapePath shapePath, Matrix matrix, int i2) {
                MaterialShapeDrawable.this.containsIncompatibleShadowOp.set(i2 + 4, shapePath.containsIncompatibleShadowOp());
                MaterialShapeDrawable.this.edgeShadowOperation[i2] = shapePath.createShadowCompatOperation(matrix);
            }
        };
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static class MaterialShapeDrawableState extends Drawable.ConstantState {
        int alpha;

        @Nullable
        ColorFilter colorFilter;
        float elevation;

        @Nullable
        ElevationOverlayProvider elevationOverlayProvider;

        @Nullable
        ColorStateList fillColor;
        float interpolation;

        @Nullable
        Rect padding;
        Paint.Style paintStyle;
        float parentAbsoluteElevation;
        float scale;
        int shadowCompatMode;
        int shadowCompatOffset;
        int shadowCompatRadius;
        int shadowCompatRotation;

        @NonNull
        ShapeAppearance shapeAppearance;

        @Nullable
        ColorStateList strokeColor;

        @Nullable
        ColorStateList strokeTintList;
        float strokeWidth;

        @Nullable
        ColorStateList tintList;

        @Nullable
        PorterDuff.Mode tintMode;
        float translationZ;
        boolean useTintColorForShadow;

        public MaterialShapeDrawableState(@NonNull ShapeAppearance shapeAppearance, @Nullable ElevationOverlayProvider elevationOverlayProvider) {
            this.fillColor = null;
            this.strokeColor = null;
            this.strokeTintList = null;
            this.tintList = null;
            this.tintMode = PorterDuff.Mode.SRC_IN;
            this.padding = null;
            this.scale = 1.0f;
            this.interpolation = 1.0f;
            this.alpha = 255;
            this.parentAbsoluteElevation = 0.0f;
            this.elevation = 0.0f;
            this.translationZ = 0.0f;
            this.shadowCompatMode = 0;
            this.shadowCompatRadius = 0;
            this.shadowCompatOffset = 0;
            this.shadowCompatRotation = 0;
            this.useTintColorForShadow = false;
            this.paintStyle = Paint.Style.FILL_AND_STROKE;
            this.shapeAppearance = shapeAppearance;
            this.elevationOverlayProvider = elevationOverlayProvider;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public Drawable newDrawable() {
            MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(this);
            materialShapeDrawable.pathDirty = true;
            materialShapeDrawable.strokePathDirty = true;
            return materialShapeDrawable;
        }

        public MaterialShapeDrawableState(@NonNull MaterialShapeDrawableState materialShapeDrawableState) {
            this.fillColor = null;
            this.strokeColor = null;
            this.strokeTintList = null;
            this.tintList = null;
            this.tintMode = PorterDuff.Mode.SRC_IN;
            this.padding = null;
            this.scale = 1.0f;
            this.interpolation = 1.0f;
            this.alpha = 255;
            this.parentAbsoluteElevation = 0.0f;
            this.elevation = 0.0f;
            this.translationZ = 0.0f;
            this.shadowCompatMode = 0;
            this.shadowCompatRadius = 0;
            this.shadowCompatOffset = 0;
            this.shadowCompatRotation = 0;
            this.useTintColorForShadow = false;
            this.paintStyle = Paint.Style.FILL_AND_STROKE;
            this.shapeAppearance = materialShapeDrawableState.shapeAppearance;
            this.elevationOverlayProvider = materialShapeDrawableState.elevationOverlayProvider;
            this.strokeWidth = materialShapeDrawableState.strokeWidth;
            this.colorFilter = materialShapeDrawableState.colorFilter;
            this.fillColor = materialShapeDrawableState.fillColor;
            this.strokeColor = materialShapeDrawableState.strokeColor;
            this.tintMode = materialShapeDrawableState.tintMode;
            this.tintList = materialShapeDrawableState.tintList;
            this.alpha = materialShapeDrawableState.alpha;
            this.scale = materialShapeDrawableState.scale;
            this.shadowCompatOffset = materialShapeDrawableState.shadowCompatOffset;
            this.shadowCompatMode = materialShapeDrawableState.shadowCompatMode;
            this.useTintColorForShadow = materialShapeDrawableState.useTintColorForShadow;
            this.interpolation = materialShapeDrawableState.interpolation;
            this.parentAbsoluteElevation = materialShapeDrawableState.parentAbsoluteElevation;
            this.elevation = materialShapeDrawableState.elevation;
            this.translationZ = materialShapeDrawableState.translationZ;
            this.shadowCompatRadius = materialShapeDrawableState.shadowCompatRadius;
            this.shadowCompatRotation = materialShapeDrawableState.shadowCompatRotation;
            this.strokeTintList = materialShapeDrawableState.strokeTintList;
            this.paintStyle = materialShapeDrawableState.paintStyle;
            if (materialShapeDrawableState.padding != null) {
                this.padding = new Rect(materialShapeDrawableState.padding);
            }
        }
    }
}
