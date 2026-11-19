package com.google.android.material.slider;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableWrapper;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewOverlay;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.SeekBar;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.math.MathUtils;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.customview.widget.ExploreByTouchHelper;
import com.google.android.material.C5183R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.drawable.DrawableUtils;
import com.google.android.material.focus.FocusRingDrawable;
import com.google.android.material.internal.DescendantOffsetUtils;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.resources.MaterialAttributes;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.slider.BaseOnChangeListener;
import com.google.android.material.slider.BaseOnSliderTouchListener;
import com.google.android.material.slider.BaseSlider;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import com.google.android.material.tooltip.TooltipDrawable;
import com.google.android.material.transformation.FabTransformationScrimBehavior;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.math.BigDecimal;
import java.math.MathContext;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import p011H.AbstractC0271e0;

/* JADX INFO: loaded from: classes2.dex */
abstract class BaseSlider<S extends BaseSlider<S, L, T>, L extends BaseOnChangeListener<S>, T extends BaseOnSliderTouchListener<S>> extends View {
    private static final int DEFAULT_LABEL_ANIMATION_ENTER_DURATION = 83;
    private static final int DEFAULT_LABEL_ANIMATION_EXIT_DURATION = 117;
    private static final String EXCEPTION_ILLEGAL_CONTINUOUS_MODE_TICK_COUNT = "The continuousModeTickCount(%s) must be greater than or equal to 0";
    private static final String EXCEPTION_ILLEGAL_DISCRETE_VALUE = "Value(%s) must be equal to valueFrom(%s) plus a multiple of stepSize(%s) when using stepSize(%s)";
    private static final String EXCEPTION_ILLEGAL_MIN_SEPARATION = "minSeparation(%s) must be greater or equal to 0";
    private static final String EXCEPTION_ILLEGAL_MIN_SEPARATION_STEP_SIZE = "minSeparation(%s) must be greater or equal and a multiple of stepSize(%s) when using stepSize(%s)";
    private static final String EXCEPTION_ILLEGAL_MIN_SEPARATION_STEP_SIZE_UNIT = "minSeparation(%s) cannot be set as a dimension when using stepSize(%s)";
    private static final String EXCEPTION_ILLEGAL_STEP_SIZE = "The stepSize(%s) must be 0, or a factor of the valueFrom(%s)-valueTo(%s) range";
    private static final String EXCEPTION_ILLEGAL_VALUE = "Slider value(%s) must be greater or equal to valueFrom(%s), and lower or equal to valueTo(%s)";
    private static final String EXCEPTION_ILLEGAL_VALUE_FROM = "valueFrom(%s) must be smaller than valueTo(%s)";
    private static final int HALO_ALPHA = 63;
    private static final float LEFT_LABEL_PIVOT_X = 1.2f;
    private static final float LEFT_LABEL_PIVOT_Y = 0.5f;
    private static final int MAX_TIMEOUT_TOOLTIP_WITH_ACCESSIBILITY = 120000;
    private static final int MIN_TIMEOUT_TOOLTIP_WITH_ACCESSIBILITY = 10000;
    private static final float RIGHT_LABEL_PIVOT_X = -0.2f;
    private static final float RIGHT_LABEL_PIVOT_Y = 0.5f;
    private static final String TAG = "BaseSlider";
    private static final double THRESHOLD = 1.0E-4d;
    private static final float THUMB_WIDTH_PRESSED_RATIO = 0.5f;
    private static final int TIMEOUT_SEND_ACCESSIBILITY_EVENT = 200;
    private static final float TOP_LABEL_PIVOT_X = 0.5f;
    private static final float TOP_LABEL_PIVOT_Y = 1.2f;
    private static final float TOUCH_SLOP_RATIO = 0.8f;
    private static final int TRACK_CORNER_SIZE_UNSET = -1;
    static final int UNIT_PX = 0;
    static final int UNIT_VALUE = 1;
    private static final String WARNING_FLOATING_POINT_ERROR = "Floating point value used for %s(%s). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.";
    private static final String WARNING_PARSE_ERROR = "Error parsing value(%s), valueFrom(%s), and valueTo(%s) into a float.";
    private BaseSlider<S, L, T>.AccessibilityEventSender accessibilityEventSender;

    @NonNull
    private final AccessibilityHelper accessibilityHelper;
    private final AccessibilityManager accessibilityManager;

    @Px
    private int accessibilityMinTouchTargetSize;
    private int activeThumbIdx;

    @NonNull
    private final Paint activeTicksPaint;

    @NonNull
    private final Paint activeTrackPaint;

    @NonNull
    private final RectF activeTrackRect;
    private boolean centered;

    @NonNull
    private final List<L> changeListeners;
    private int continuousModeTickCount;

    @NonNull
    private final RectF cornerRect;

    @Nullable
    private Drawable customThumbDrawable;

    @NonNull
    private List<Drawable> customThumbDrawablesForValues;

    @NonNull
    private final List<MaterialShapeDrawable> defaultThumbDrawables;
    private int defaultThumbHeight;
    private int defaultThumbRadius;
    private int defaultThumbTrackGapSize;
    private int defaultThumbWidth;
    private int defaultTickActiveRadius;
    private int defaultTickInactiveRadius;
    private int defaultTrackThickness;
    private boolean dirtyConfig;

    @NonNull
    List<Rect> exclusionRects;
    private int focusedThumbIdx;
    private boolean forceDrawCompatHalo;
    private LabelFormatter formatter;

    @NonNull
    private ColorStateList haloColor;

    @NonNull
    private final Paint haloPaint;
    private int haloRadius;

    @NonNull
    private final Rect iconRect;

    @NonNull
    private final RectF iconRectF;

    @NonNull
    private final Paint inactiveTicksPaint;

    @NonNull
    private final RectF inactiveTrackLeftRect;

    @NonNull
    private final Paint inactiveTrackPaint;

    @NonNull
    private final RectF inactiveTrackRightRect;
    private boolean isLongPress;
    private int labelBehavior;
    private int labelPadding;

    @NonNull
    private final Rect labelRect;
    private int labelStyle;

    @NonNull
    private final List<TooltipDrawable> labels;
    private boolean labelsAreAnimatedIn;
    private ValueAnimator labelsInAnimator;
    private ValueAnimator labelsOutAnimator;
    private MotionEvent lastEvent;
    private int minTickSpacing;

    @Px
    private int minTouchTargetSize;
    private int minTrackSidePadding;
    private int minWidgetThickness;

    @NonNull
    private final ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener;

    @NonNull
    private final ViewTreeObserver.OnScrollChangedListener onScrollChangedListener;

    @NonNull
    private List<Float> previousDownTouchEventValues;

    @NonNull
    private final Runnable resetActiveThumbIndex;

    @NonNull
    private final Matrix rotationMatrix;
    private final int scaledTouchSlop;
    private int separationUnit;
    private float stepSize;

    @NonNull
    private final Paint stopIndicatorPaint;
    private boolean thisAndAncestorsVisible;
    private float thumbElevation;
    private int thumbHeight;
    private final int thumbHeightDecreaseFocusRing;
    private boolean thumbIsPressed;

    @NonNull
    private final Paint thumbPaint;

    @Nullable
    private ColorStateList thumbStrokeColor;
    private float thumbStrokeWidth;

    @NonNull
    private ColorStateList thumbTintList;
    private int thumbTrackGapSize;
    private int thumbWidth;
    private int tickActiveRadius;

    @NonNull
    private ColorStateList tickColorActive;

    @NonNull
    private ColorStateList tickColorInactive;
    private int tickInactiveRadius;
    private int tickVisibilityMode;
    private float[] ticksCoordinates;
    private final int tooltipTimeoutMillis;
    private float touchDownAxis1;
    private float touchDownAxis2;

    @NonNull
    private final List<T> touchListeners;
    private float touchPosition;

    @NonNull
    private ColorStateList trackColorActive;

    @NonNull
    private ColorStateList trackColorInactive;
    private int trackCornerSize;

    @Nullable
    private ColorStateList trackIconActiveColor;

    @Nullable
    private Drawable trackIconActiveEnd;
    private boolean trackIconActiveEndMutated;

    @Nullable
    private Drawable trackIconActiveStart;
    private boolean trackIconActiveStartMutated;

    @Nullable
    private ColorStateList trackIconInactiveColor;

    @Nullable
    private Drawable trackIconInactiveEnd;
    private boolean trackIconInactiveEndMutated;

    @Nullable
    private Drawable trackIconInactiveStart;
    private boolean trackIconInactiveStartMutated;

    @Px
    private int trackIconPadding;

    @Px
    private int trackIconSize;
    private int trackInsideCornerSize;

    @NonNull
    private final Path trackPath;
    private int trackSidePadding;
    private int trackStopIndicatorSize;
    private int trackThickness;
    private int trackWidth;
    private float valueFrom;
    private float valueTo;
    private ArrayList<Float> values;

    @NonNull
    private final Rect viewRect;
    private int widgetOrientation;
    private int widgetThickness;
    static final int DEF_STYLE_RES = C5183R.style.Widget_MaterialComponents_Slider;
    private static final int LABEL_ANIMATION_ENTER_DURATION_ATTR = C5183R.attr.motionDurationMedium4;
    private static final int LABEL_ANIMATION_EXIT_DURATION_ATTR = C5183R.attr.motionDurationShort3;
    private static final int LABEL_ANIMATION_ENTER_EASING_ATTR = C5183R.attr.motionEasingEmphasizedInterpolator;
    private static final int LABEL_ANIMATION_EXIT_EASING_ATTR = C5183R.attr.motionEasingEmphasizedAccelerateInterpolator;

    public class AccessibilityEventSender implements Runnable {
        int virtualViewId;

        private AccessibilityEventSender() {
            this.virtualViewId = -1;
        }

        @Override // java.lang.Runnable
        public void run() {
            BaseSlider.this.accessibilityHelper.sendEventForVirtualView(this.virtualViewId, 4);
        }

        public void setVirtualViewId(int i2) {
            this.virtualViewId = i2;
        }
    }

    public static class AccessibilityHelper extends ExploreByTouchHelper {
        private final BaseSlider<?, ?, ?> slider;
        final Rect virtualViewBounds;

        public AccessibilityHelper(BaseSlider<?, ?, ?> baseSlider) {
            super(baseSlider);
            this.virtualViewBounds = new Rect();
            this.slider = baseSlider;
        }

        @NonNull
        private String startOrEndDescription(int i2) {
            if (i2 == this.slider.getValues().size() - 1) {
                return this.slider.getContext().getString(C5183R.string.material_slider_range_end);
            }
            return i2 == 0 ? this.slider.getContext().getString(C5183R.string.material_slider_range_start) : "";
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        public int getVirtualViewAt(float f2, float f3) {
            for (int i2 = 0; i2 < this.slider.getValues().size(); i2++) {
                this.slider.updateBoundsForVirtualViewId(i2, this.virtualViewBounds);
                if (this.virtualViewBounds.contains((int) f2, (int) f3)) {
                    return i2;
                }
            }
            return -1;
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        public void getVisibleVirtualViews(@NonNull List<Integer> list) {
            for (int i2 = 0; i2 < this.slider.getValues().size(); i2++) {
                list.add(Integer.valueOf(i2));
            }
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        public boolean onPerformActionForVirtualView(int i2, int i3, @Nullable Bundle bundle) {
            if (!this.slider.isEnabled()) {
                return false;
            }
            if (i3 != 4096 && i3 != 8192) {
                if (i3 == 16908349 && bundle != null && bundle.containsKey(AccessibilityNodeInfoCompat.ACTION_ARGUMENT_PROGRESS_VALUE)) {
                    if (this.slider.snapThumbToValue(i2, bundle.getFloat(AccessibilityNodeInfoCompat.ACTION_ARGUMENT_PROGRESS_VALUE))) {
                        this.slider.updateHaloHotspot();
                        this.slider.postInvalidate();
                        return true;
                    }
                }
                return false;
            }
            float fCalculateStepIncrement = this.slider.calculateStepIncrement(20);
            if (i3 == 8192) {
                fCalculateStepIncrement = -fCalculateStepIncrement;
            }
            if (this.slider.isRtl()) {
                fCalculateStepIncrement = -fCalculateStepIncrement;
            }
            if (!this.slider.snapThumbToValue(i2, MathUtils.clamp(this.slider.getValues().get(i2).floatValue() + fCalculateStepIncrement, this.slider.getValueFrom(), this.slider.getValueTo()))) {
                return false;
            }
            this.slider.setActiveThumbIndex(i2);
            this.slider.scheduleTooltipTimeout();
            this.slider.updateHaloHotspot();
            this.slider.postInvalidate();
            return true;
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        public void onPopulateNodeForVirtualView(int i2, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            accessibilityNodeInfoCompat.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SET_PROGRESS);
            List<Float> values = this.slider.getValues();
            Float f2 = values.get(i2);
            float fFloatValue = f2.floatValue();
            float valueFrom = this.slider.getValueFrom();
            float valueTo = this.slider.getValueTo();
            if (this.slider.isEnabled()) {
                if (fFloatValue > valueFrom) {
                    accessibilityNodeInfoCompat.addAction(8192);
                }
                if (fFloatValue < valueTo) {
                    accessibilityNodeInfoCompat.addAction(4096);
                }
            }
            NumberFormat numberInstance = NumberFormat.getNumberInstance();
            numberInstance.setMaximumFractionDigits(2);
            try {
                valueFrom = numberInstance.parse(numberInstance.format(valueFrom)).floatValue();
                valueTo = numberInstance.parse(numberInstance.format(valueTo)).floatValue();
                fFloatValue = numberInstance.parse(numberInstance.format(fFloatValue)).floatValue();
            } catch (ParseException unused) {
                Log.w(BaseSlider.TAG, "Error parsing value(" + f2 + "), valueFrom(" + valueFrom + "), and valueTo(" + valueTo + ") into a float.");
            }
            accessibilityNodeInfoCompat.setRangeInfo(AccessibilityNodeInfoCompat.RangeInfoCompat.obtain(1, valueFrom, valueTo, fFloatValue));
            accessibilityNodeInfoCompat.setClassName(SeekBar.class.getName());
            StringBuilder sb = new StringBuilder();
            if (this.slider.getContentDescription() != null) {
                sb.append(this.slider.getContentDescription());
                sb.append(",");
            }
            String value = this.slider.formatValue(fFloatValue);
            String string = this.slider.getContext().getString(C5183R.string.material_slider_value);
            if (values.size() > 1) {
                string = startOrEndDescription(i2);
            }
            CharSequence stateDescription = ViewCompat.getStateDescription(this.slider);
            if (TextUtils.isEmpty(stateDescription)) {
                Locale.getDefault();
                sb.append(string + ", " + value);
            } else {
                accessibilityNodeInfoCompat.setStateDescription(stateDescription);
            }
            accessibilityNodeInfoCompat.setContentDescription(sb.toString());
            this.slider.updateBoundsForVirtualViewId(i2, this.virtualViewBounds);
            accessibilityNodeInfoCompat.setBoundsInParent(this.virtualViewBounds);
        }
    }

    public enum FullCornerDirection {
        BOTH,
        LEFT,
        RIGHT,
        NONE
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface Orientation {
    }

    public static class SliderState extends View.BaseSavedState {
        public static final Parcelable.Creator<SliderState> CREATOR = new Parcelable.Creator<SliderState>() { // from class: com.google.android.material.slider.BaseSlider.SliderState.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NonNull
            public SliderState createFromParcel(@NonNull Parcel parcel) {
                return new SliderState(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NonNull
            public SliderState[] newArray(int i2) {
                return new SliderState[i2];
            }
        };
        boolean hasFocus;
        float stepSize;
        float valueFrom;
        float valueTo;
        ArrayList<Float> values;

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeFloat(this.valueFrom);
            parcel.writeFloat(this.valueTo);
            parcel.writeList(this.values);
            parcel.writeFloat(this.stepSize);
            parcel.writeBooleanArray(new boolean[]{this.hasFocus});
        }

        public SliderState(Parcelable parcelable) {
            super(parcelable);
        }

        private SliderState(@NonNull Parcel parcel) {
            super(parcel);
            this.valueFrom = parcel.readFloat();
            this.valueTo = parcel.readFloat();
            ArrayList<Float> arrayList = new ArrayList<>();
            this.values = arrayList;
            parcel.readList(arrayList, Float.class.getClassLoader());
            this.stepSize = parcel.readFloat();
            this.hasFocus = parcel.createBooleanArray()[0];
        }
    }

    public BaseSlider(@NonNull Context context) {
        this(context, null);
    }

    private void adjustCustomThumbDrawableBounds(Drawable drawable) {
        adjustCustomThumbDrawableBounds(this.thumbWidth, drawable);
    }

    private void attachLabelToContentView(TooltipDrawable tooltipDrawable) {
        tooltipDrawable.setRelativeToView(ViewUtils.getContentView(this));
    }

    private void calculateBoundsAndDrawTrackIcon(@NonNull Canvas canvas, @NonNull RectF rectF, @Nullable Drawable drawable, boolean z) {
        if (drawable != null) {
            calculateTrackIconBounds(rectF, this.iconRectF, this.trackIconSize, this.trackIconPadding, z);
            if (this.iconRectF.isEmpty()) {
                return;
            }
            drawTrackIcon(canvas, this.iconRectF, drawable);
        }
    }

    private float calculateEndTrackCornerSize(float f2) {
        if (this.values.isEmpty() || !hasGapBetweenThumbAndTrack()) {
            return f2;
        }
        float fValueToX = valueToX(this.values.get((isRtl() || isVertical()) ? 0 : this.values.size() - 1).floatValue()) - this.trackSidePadding;
        int i2 = this.trackWidth;
        return fValueToX > ((float) i2) - f2 ? Math.max(i2 - fValueToX, this.trackInsideCornerSize) : f2;
    }

    @Nullable
    private Float calculateIncrementForKey(int i2) {
        float fCalculateStepIncrement = this.isLongPress ? calculateStepIncrement(20) : calculateStepIncrement();
        if (i2 == 21) {
            if (!isRtl()) {
                fCalculateStepIncrement = -fCalculateStepIncrement;
            }
            return Float.valueOf(fCalculateStepIncrement);
        }
        if (i2 == 22) {
            if (isRtl()) {
                fCalculateStepIncrement = -fCalculateStepIncrement;
            }
            return Float.valueOf(fCalculateStepIncrement);
        }
        if (i2 == 69) {
            return Float.valueOf(-fCalculateStepIncrement);
        }
        if (i2 == 70 || i2 == 81) {
            return Float.valueOf(fCalculateStepIncrement);
        }
        return null;
    }

    private void calculateLabelBounds(TooltipDrawable tooltipDrawable, float f2) {
        int iNormalizeValue;
        int intrinsicWidth;
        int iCalculateTrackCenter;
        int intrinsicHeight;
        int i2;
        if (isVertical()) {
            iNormalizeValue = (this.trackSidePadding + ((int) (normalizeValue(f2) * this.trackWidth))) - (tooltipDrawable.getIntrinsicHeight() / 2);
            intrinsicWidth = tooltipDrawable.getIntrinsicHeight() + iNormalizeValue;
            if (isRtl()) {
                iCalculateTrackCenter = calculateTrackCenter() - ((this.thumbHeight / 2) + this.labelPadding);
                intrinsicHeight = tooltipDrawable.getIntrinsicWidth();
            } else {
                int iCalculateTrackCenter2 = calculateTrackCenter() + (this.thumbHeight / 2) + this.labelPadding;
                iCalculateTrackCenter = tooltipDrawable.getIntrinsicWidth() + iCalculateTrackCenter2;
                i2 = iCalculateTrackCenter2;
            }
            this.labelRect.set(iNormalizeValue, i2, intrinsicWidth, iCalculateTrackCenter);
        }
        iNormalizeValue = (this.trackSidePadding + ((int) (normalizeValue(f2) * this.trackWidth))) - (tooltipDrawable.getIntrinsicWidth() / 2);
        intrinsicWidth = tooltipDrawable.getIntrinsicWidth() + iNormalizeValue;
        iCalculateTrackCenter = calculateTrackCenter() - ((this.thumbHeight / 2) + this.labelPadding);
        intrinsicHeight = tooltipDrawable.getIntrinsicHeight();
        i2 = iCalculateTrackCenter - intrinsicHeight;
        this.labelRect.set(iNormalizeValue, i2, intrinsicWidth, iCalculateTrackCenter);
    }

    private float calculateStartTrackCornerSize(float f2) {
        if (this.values.isEmpty() || !hasGapBetweenThumbAndTrack()) {
            return f2;
        }
        float fValueToX = valueToX(this.values.get((isRtl() || isVertical()) ? this.values.size() - 1 : 0).floatValue()) - this.trackSidePadding;
        return fValueToX < f2 ? Math.max(fValueToX, this.trackInsideCornerSize) : f2;
    }

    private float calculateStepIncrement() {
        float f2 = this.stepSize;
        if (f2 == 0.0f) {
            return 1.0f;
        }
        return f2;
    }

    private int calculateThumbTrackGapSize(int i2) {
        if (!this.thumbIsPressed || i2 != this.activeThumbIdx || this.customThumbDrawable != null || !this.customThumbDrawablesForValues.isEmpty()) {
            return this.thumbTrackGapSize;
        }
        return this.thumbTrackGapSize - ((this.thumbWidth - Math.round(this.thumbWidth * 0.5f)) / 2);
    }

    private int calculateTrackCenter() {
        int i2 = this.widgetThickness / 2;
        int intrinsicHeight = 0;
        if ((this.labelBehavior == 1 || shouldAlwaysShowLabel()) && !this.labels.isEmpty()) {
            intrinsicHeight = this.labels.get(0).getIntrinsicHeight();
        }
        return i2 + intrinsicHeight;
    }

    private void calculateTrackIconBounds(@NonNull RectF rectF, @NonNull RectF rectF2, @Px int i2, @Px int i3, boolean z) {
        if (rectF.right - rectF.left < (i3 * 2) + i2) {
            rectF2.setEmpty();
            return;
        }
        float f2 = z ^ (isRtl() || isVertical()) ? rectF.left + i3 : (rectF.right - i3) - i2;
        float f3 = i2;
        float fCalculateTrackCenter = calculateTrackCenter() - (f3 / 2.0f);
        rectF2.set(f2, fCalculateTrackCenter, f2 + f3, f3 + fCalculateTrackCenter);
    }

    private int convertToTickVisibilityMode(boolean z) {
        return z ? 0 : 2;
    }

    private ValueAnimator createLabelAnimator(boolean z) {
        int iResolveThemeDuration;
        TimeInterpolator timeInterpolatorResolveThemeInterpolator;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(getAnimatorCurrentValueOrDefault(z ? this.labelsOutAnimator : this.labelsInAnimator, z ? 0.0f : 1.0f), z ? 1.0f : 0.0f);
        if (z) {
            iResolveThemeDuration = MotionUtils.resolveThemeDuration(getContext(), LABEL_ANIMATION_ENTER_DURATION_ATTR, 83);
            timeInterpolatorResolveThemeInterpolator = MotionUtils.resolveThemeInterpolator(getContext(), LABEL_ANIMATION_ENTER_EASING_ATTR, AnimationUtils.DECELERATE_INTERPOLATOR);
        } else {
            iResolveThemeDuration = MotionUtils.resolveThemeDuration(getContext(), LABEL_ANIMATION_EXIT_DURATION_ATTR, 117);
            timeInterpolatorResolveThemeInterpolator = MotionUtils.resolveThemeInterpolator(getContext(), LABEL_ANIMATION_EXIT_EASING_ATTR, AnimationUtils.FAST_OUT_LINEAR_IN_INTERPOLATOR);
        }
        valueAnimatorOfFloat.setDuration(iResolveThemeDuration);
        valueAnimatorOfFloat.setInterpolator(timeInterpolatorResolveThemeInterpolator);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.slider.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f23495a.lambda$createLabelAnimator$1(valueAnimator);
            }
        });
        return valueAnimatorOfFloat;
    }

    private void createLabelPool() {
        if (this.labels.size() > this.values.size()) {
            List<TooltipDrawable> listSubList = this.labels.subList(this.values.size(), this.labels.size());
            for (TooltipDrawable tooltipDrawable : listSubList) {
                if (isAttachedToWindow()) {
                    detachLabelFromContentView(tooltipDrawable);
                }
            }
            listSubList.clear();
        }
        while (true) {
            if (this.labels.size() >= this.values.size()) {
                break;
            }
            TooltipDrawable tooltipDrawableCreateFromAttributes = TooltipDrawable.createFromAttributes(getContext(), null, 0, this.labelStyle);
            this.labels.add(tooltipDrawableCreateFromAttributes);
            if (isAttachedToWindow()) {
                attachLabelToContentView(tooltipDrawableCreateFromAttributes);
            }
        }
        int i2 = this.labels.size() != 1 ? 1 : 0;
        Iterator<TooltipDrawable> it = this.labels.iterator();
        while (it.hasNext()) {
            it.next().setStrokeWidth(i2);
        }
    }

    private MaterialShapeDrawable createNewDefaultThumb() {
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
        materialShapeDrawable.setShadowCompatibilityMode(2);
        materialShapeDrawable.setFillColor(getThumbTintList());
        materialShapeDrawable.setShapeAppearanceModel(ShapeAppearanceModel.builder().setAllCorners(0, this.thumbWidth / 2.0f).build());
        materialShapeDrawable.setBounds(0, 0, this.thumbWidth, this.thumbHeight);
        materialShapeDrawable.setElevation(getThumbElevation());
        materialShapeDrawable.setStrokeWidth(getThumbStrokeWidth());
        materialShapeDrawable.setStrokeTint(getThumbStrokeColor());
        materialShapeDrawable.setState(getDrawableState());
        return materialShapeDrawable;
    }

    private void detachLabelFromContentView(TooltipDrawable tooltipDrawable) {
        ViewGroup contentView = ViewUtils.getContentView(this);
        if (contentView == null) {
            return;
        }
        contentView.getOverlay().remove(tooltipDrawable);
        tooltipDrawable.detachView(contentView);
    }

    private float dimenToValue(float f2) {
        if (f2 == 0.0f) {
            return 0.0f;
        }
        float f3 = (f2 - this.trackSidePadding) / this.trackWidth;
        float f4 = this.valueFrom;
        return AbstractC0271e0.m394b(f4, this.valueTo, f3, f4);
    }

    private void dispatchOnChangedFromUser(int i2) {
        Iterator<L> it = this.changeListeners.iterator();
        while (it.hasNext()) {
            it.next().onValueChange(this, this.values.get(i2).floatValue(), true);
        }
        AccessibilityManager accessibilityManager = this.accessibilityManager;
        if (accessibilityManager == null || !accessibilityManager.isEnabled()) {
            return;
        }
        scheduleAccessibilityEventSender(i2);
        this.accessibilityHelper.invalidateVirtualView(i2);
    }

    private void dispatchOnChangedProgrammatically() {
        for (L l2 : this.changeListeners) {
            ArrayList<Float> arrayList = this.values;
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Float f2 = arrayList.get(i2);
                i2++;
                l2.onValueChange(this, f2.floatValue(), false);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:53:0x00e0  */
    private void drawActiveTracks(@NonNull Canvas canvas, int i2, int i3) {
        int iCalculateThumbTrackGapSize;
        Canvas canvas2;
        float[] activeRange = getActiveRange();
        int i4 = this.trackSidePadding;
        float f2 = i2;
        float fValueToX = (activeRange[1] * f2) + i4;
        float fCalculateThumbTrackGapSize = (activeRange[0] * f2) + i4;
        if (fCalculateThumbTrackGapSize >= fValueToX) {
            this.activeTrackRect.setEmpty();
            return;
        }
        FullCornerDirection fullCornerDirection = FullCornerDirection.NONE;
        if (this.values.size() == 1 && !isCentered()) {
            fullCornerDirection = (isRtl() || isVertical()) ? FullCornerDirection.RIGHT : FullCornerDirection.LEFT;
        }
        FullCornerDirection fullCornerDirection2 = fullCornerDirection;
        int i5 = 0;
        while (i5 < this.values.size()) {
            if (this.values.size() > 1) {
                fValueToX = i5 > 0 ? valueToX(this.values.get(i5 - 1).floatValue()) : fCalculateThumbTrackGapSize;
                float fValueToX2 = valueToX(this.values.get(i5).floatValue());
                if (isRtl() || isVertical()) {
                    fCalculateThumbTrackGapSize = fValueToX2;
                } else {
                    fCalculateThumbTrackGapSize = fValueToX;
                    fValueToX = fValueToX2;
                }
            }
            int trackCornerSize = getTrackCornerSize();
            int iOrdinal = fullCornerDirection2.ordinal();
            if (iOrdinal != 1) {
                if (iOrdinal == 2) {
                    fCalculateThumbTrackGapSize += calculateThumbTrackGapSize(i5);
                    fValueToX += trackCornerSize;
                } else if (iOrdinal == 3) {
                    if (i5 > 0) {
                        fCalculateThumbTrackGapSize += calculateThumbTrackGapSize(i5 - 1);
                        iCalculateThumbTrackGapSize = calculateThumbTrackGapSize(i5);
                    } else if (activeRange[1] == 0.5f) {
                        fCalculateThumbTrackGapSize += calculateThumbTrackGapSize(i5);
                    } else if (activeRange[0] == 0.5f) {
                        iCalculateThumbTrackGapSize = calculateThumbTrackGapSize(i5);
                    }
                }
                if (fCalculateThumbTrackGapSize >= fValueToX) {
                    this.activeTrackRect.setEmpty();
                    canvas2 = canvas;
                } else {
                    RectF rectF = this.activeTrackRect;
                    float f3 = i3;
                    int i6 = this.trackThickness;
                    rectF.set(fCalculateThumbTrackGapSize, f3 - (i6 / 2.0f), fValueToX, (i6 / 2.0f) + f3);
                    canvas2 = canvas;
                    updateTrack(canvas2, this.activeTrackPaint, this.activeTrackRect, trackCornerSize, fullCornerDirection2);
                }
                i5++;
                canvas = canvas2;
            } else {
                fCalculateThumbTrackGapSize -= trackCornerSize;
                iCalculateThumbTrackGapSize = calculateThumbTrackGapSize(i5);
            }
            fValueToX -= iCalculateThumbTrackGapSize;
            if (fCalculateThumbTrackGapSize >= fValueToX) {
                this.activeTrackRect.setEmpty();
                canvas2 = canvas;
            } else {
                RectF rectF2 = this.activeTrackRect;
                float f4 = i3;
                int i7 = this.trackThickness;
                rectF2.set(fCalculateThumbTrackGapSize, f4 - (i7 / 2.0f), fValueToX, (i7 / 2.0f) + f4);
                canvas2 = canvas;
                updateTrack(canvas2, this.activeTrackPaint, this.activeTrackRect, trackCornerSize, fullCornerDirection2);
            }
            i5++;
            canvas = canvas2;
        }
    }

    private void drawInactiveTrackSection(float f2, float f3, float f4, float f5, @NonNull Canvas canvas, RectF rectF, FullCornerDirection fullCornerDirection, int i2) {
        if (f3 - f2 > getTrackCornerSize() - i2) {
            rectF.set(f2, f4, f3, f5);
        } else {
            rectF.setEmpty();
        }
        updateTrack(canvas, this.inactiveTrackPaint, rectF, getTrackCornerSize(), fullCornerDirection);
    }

    private void drawInactiveTracks(@NonNull Canvas canvas, int i2, int i3) {
        int iCalculateThumbTrackGapSize;
        int iCalculateThumbTrackGapSize2;
        float[] activeRange = getActiveRange();
        float f2 = i3;
        int i4 = this.trackThickness;
        float f3 = f2 - (i4 / 2.0f);
        float f4 = (i4 / 2.0f) + f2;
        int size = 0;
        if (isCentered() && activeRange[0] == 0.5f) {
            iCalculateThumbTrackGapSize = this.thumbTrackGapSize;
        } else {
            iCalculateThumbTrackGapSize = calculateThumbTrackGapSize((isRtl() || isVertical()) ? this.values.size() - 1 : 0);
        }
        int i5 = iCalculateThumbTrackGapSize;
        float f5 = i2;
        drawInactiveTrackSection(this.trackSidePadding - getTrackCornerSize(), ((activeRange[0] * f5) + this.trackSidePadding) - i5, f3, f4, canvas, this.inactiveTrackLeftRect, FullCornerDirection.LEFT, i5);
        if (isCentered() && activeRange[1] == 0.5f) {
            iCalculateThumbTrackGapSize2 = this.thumbTrackGapSize;
        } else {
            if (!isRtl() && !isVertical()) {
                size = this.values.size() - 1;
            }
            iCalculateThumbTrackGapSize2 = calculateThumbTrackGapSize(size);
        }
        int i6 = iCalculateThumbTrackGapSize2;
        int i7 = this.trackSidePadding;
        drawInactiveTrackSection((activeRange[1] * f5) + i7 + i6, i7 + i2 + getTrackCornerSize(), f3, f4, canvas, this.inactiveTrackRightRect, FullCornerDirection.RIGHT, i6);
    }

    private void drawStopIndicator(@NonNull Canvas canvas, float f2, float f3) {
        for (int i2 = 0; i2 < this.values.size(); i2++) {
            float fValueToX = valueToX(this.values.get(i2).floatValue());
            float fCalculateThumbTrackGapSize = (this.thumbWidth / 2.0f) + calculateThumbTrackGapSize(i2);
            if (f2 >= fValueToX - fCalculateThumbTrackGapSize && f2 <= fValueToX + fCalculateThumbTrackGapSize) {
                return;
            }
        }
        if (isVertical()) {
            canvas.drawPoint(f3, f2, this.stopIndicatorPaint);
        } else {
            canvas.drawPoint(f2, f3, this.stopIndicatorPaint);
        }
    }

    private void drawThumbDrawable(@NonNull Canvas canvas, int i2, int i3, float f2, @NonNull Drawable drawable) {
        canvas.save();
        if (isVertical()) {
            canvas.concat(this.rotationMatrix);
        }
        canvas.translate((this.trackSidePadding + ((int) (normalizeValue(f2) * i2))) - (drawable.getBounds().width() / 2.0f), i3 - (drawable.getBounds().height() / 2.0f));
        drawable.draw(canvas);
        canvas.restore();
    }

    private void drawThumbs(@NonNull Canvas canvas, int i2, int i3) {
        Canvas canvas2;
        int i4;
        int i5;
        int i6 = 0;
        while (i6 < this.values.size()) {
            float fFloatValue = this.values.get(i6).floatValue();
            Drawable drawable = this.customThumbDrawable;
            if (drawable != null) {
                canvas2 = canvas;
                i4 = i2;
                i5 = i3;
                drawThumbDrawable(canvas2, i4, i5, fFloatValue, drawable);
            } else {
                canvas2 = canvas;
                i4 = i2;
                i5 = i3;
                if (i6 < this.customThumbDrawablesForValues.size()) {
                    drawThumbDrawable(canvas2, i4, i5, fFloatValue, this.customThumbDrawablesForValues.get(i6));
                } else {
                    if (!isEnabled()) {
                        canvas2.drawCircle((normalizeValue(fFloatValue) * i4) + this.trackSidePadding, i5, getThumbRadius(), this.thumbPaint);
                    }
                    drawThumbDrawable(canvas2, i4, i5, fFloatValue, this.defaultThumbDrawables.get(i6));
                }
            }
            i6++;
            canvas = canvas2;
            i2 = i4;
            i3 = i5;
        }
    }

    private void drawTicks(int i2, int i3, Canvas canvas, Paint paint) {
        while (i2 < i3) {
            float f2 = isVertical() ? this.ticksCoordinates[i2 + 1] : this.ticksCoordinates[i2];
            if (!isOverlappingThumb(f2) && (!isCentered() || !isOverlappingCenterGap(f2))) {
                float[] fArr = this.ticksCoordinates;
                canvas.drawPoint(fArr[i2], fArr[i2 + 1], paint);
            }
            i2 += 2;
        }
    }

    private void drawTrackIcon(@NonNull Canvas canvas, @NonNull RectF rectF, @NonNull Drawable drawable) {
        if (isVertical()) {
            this.rotationMatrix.mapRect(rectF);
        }
        rectF.round(this.iconRect);
        drawable.setBounds(this.iconRect);
        drawable.draw(canvas);
    }

    private void drawTrackIcons(@NonNull Canvas canvas, @NonNull RectF rectF, @NonNull RectF rectF2) {
        if (hasTrackIcons()) {
            if (this.values.size() > 1) {
                Log.w(TAG, "Track icons can only be used when only 1 thumb is present.");
            }
            calculateBoundsAndDrawTrackIcon(canvas, rectF, this.trackIconActiveStart, true);
            calculateBoundsAndDrawTrackIcon(canvas, rectF2, this.trackIconInactiveStart, true);
            calculateBoundsAndDrawTrackIcon(canvas, rectF, this.trackIconActiveEnd, false);
            calculateBoundsAndDrawTrackIcon(canvas, rectF2, this.trackIconInactiveEnd, false);
        }
    }

    private void ensureLabelsAdded(boolean z) {
        if (!this.labelsAreAnimatedIn) {
            this.labelsAreAnimatedIn = true;
            ValueAnimator valueAnimatorCreateLabelAnimator = createLabelAnimator(true);
            this.labelsInAnimator = valueAnimatorCreateLabelAnimator;
            this.labelsOutAnimator = null;
            valueAnimatorCreateLabelAnimator.start();
        }
        Iterator<TooltipDrawable> it = this.labels.iterator();
        if (z) {
            for (int i2 = 0; i2 < this.values.size() && it.hasNext(); i2++) {
                if (i2 != this.focusedThumbIdx) {
                    setValueForLabel(it.next(), this.values.get(i2).floatValue());
                }
            }
        }
        if (!it.hasNext()) {
            throw new IllegalStateException(String.format("Not enough labels(%d) to display all the values(%d)", Integer.valueOf(this.labels.size()), Integer.valueOf(this.values.size())));
        }
        setValueForLabel(it.next(), this.values.get(this.focusedThumbIdx).floatValue());
    }

    private void ensureLabelsRemoved() {
        if (this.labelsAreAnimatedIn) {
            this.labelsAreAnimatedIn = false;
            ValueAnimator valueAnimatorCreateLabelAnimator = createLabelAnimator(false);
            this.labelsOutAnimator = valueAnimatorCreateLabelAnimator;
            this.labelsInAnimator = null;
            valueAnimatorCreateLabelAnimator.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.slider.BaseSlider.1
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    ViewOverlay contentViewOverlay = BaseSlider.this.getContentViewOverlay();
                    if (contentViewOverlay == null) {
                        return;
                    }
                    Iterator it = BaseSlider.this.labels.iterator();
                    while (it.hasNext()) {
                        contentViewOverlay.remove((TooltipDrawable) it.next());
                    }
                }
            });
            this.labelsOutAnimator.start();
        }
    }

    private void focusThumbOnFocusGained(int i2) {
        if (i2 == 1) {
            moveFocus(Integer.MAX_VALUE);
            return;
        }
        if (i2 == 2) {
            moveFocus(Integer.MIN_VALUE);
        } else if (i2 == 17) {
            moveFocusInAbsoluteDirection(Integer.MAX_VALUE);
        } else {
            if (i2 != 66) {
                return;
            }
            moveFocusInAbsoluteDirection(Integer.MIN_VALUE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String formatValue(float f2) {
        if (hasLabelFormatter()) {
            return this.formatter.getFormattedValue(f2);
        }
        return String.format(((float) ((int) f2)) == f2 ? "%.0f" : "%.2f", Float.valueOf(f2));
    }

    private float[] getActiveRange() {
        float fFloatValue = this.values.get(0).floatValue();
        ArrayList<Float> arrayList = this.values;
        float fFloatValue2 = arrayList.get(arrayList.size() - 1).floatValue();
        if (this.values.size() == 1) {
            fFloatValue = this.valueFrom;
        }
        float fNormalizeValue = normalizeValue(fFloatValue);
        float fNormalizeValue2 = normalizeValue(fFloatValue2);
        if (isCentered()) {
            float fMin = Math.min(0.5f, fNormalizeValue2);
            fNormalizeValue2 = Math.max(0.5f, fNormalizeValue2);
            fNormalizeValue = fMin;
        }
        return (isCentered() || !(isRtl() || isVertical())) ? new float[]{fNormalizeValue, fNormalizeValue2} : new float[]{fNormalizeValue2, fNormalizeValue};
    }

    private static float getAnimatorCurrentValueOrDefault(ValueAnimator valueAnimator, float f2) {
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            return f2;
        }
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        valueAnimator.cancel();
        return fFloatValue;
    }

    @Nullable
    private RippleDrawable getBackgroundRipple() {
        Drawable background = getBackground();
        if (background instanceof DrawableWrapper) {
            background = ((DrawableWrapper) background).getDrawable();
        }
        if (background instanceof RippleDrawable) {
            return (RippleDrawable) background;
        }
        return null;
    }

    private float getClampedValue(int i2, float f2) {
        float minSeparation = getMinSeparation();
        if (this.separationUnit == 0) {
            minSeparation = dimenToValue(minSeparation);
        }
        if (isRtl() || isVertical()) {
            minSeparation = -minSeparation;
        }
        int i3 = i2 + 1;
        int i4 = i2 - 1;
        return MathUtils.clamp(f2, i4 < 0 ? this.valueFrom : this.values.get(i4).floatValue() + minSeparation, i3 >= this.values.size() ? this.valueTo : this.values.get(i3).floatValue() - minSeparation);
    }

    @ColorInt
    private int getColorForState(@NonNull ColorStateList colorStateList) {
        return colorStateList.getColorForState(getDrawableState(), colorStateList.getDefaultColor());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Nullable
    public ViewOverlay getContentViewOverlay() {
        ViewGroup contentView = ViewUtils.getContentView(this);
        if (contentView == null) {
            return null;
        }
        return contentView.getOverlay();
    }

    private float[] getCornerRadii(float f2, float f3) {
        return isVertical() ? new float[]{f2, f2, f2, f2, f3, f3, f3, f3} : new float[]{f2, f2, f3, f3, f3, f3, f2, f2};
    }

    private int getDesiredTickCount() {
        return (int) (((this.valueTo - this.valueFrom) / this.stepSize) + 1.0f);
    }

    @Nullable
    private FocusRingDrawable getFocusRing() {
        return FocusRingDrawable.find(getBackground());
    }

    private int getMaxTickCount() {
        return (this.trackWidth / this.minTickSpacing) + 1;
    }

    private float getValueOfTouchPosition() {
        double dSnapPosition = snapPosition(this.touchPosition);
        if (isRtl() || isVertical()) {
            dSnapPosition = 1.0d - dSnapPosition;
        }
        float f2 = this.valueTo;
        float f3 = this.valueFrom;
        return (float) ((dSnapPosition * ((double) (f2 - f3))) + ((double) f3));
    }

    private float getValueOfTouchPositionAbsolute() {
        float f2 = this.touchPosition;
        if (isRtl() || isVertical()) {
            f2 = 1.0f - f2;
        }
        float f3 = this.valueTo;
        float f4 = this.valueFrom;
        return AbstractC0271e0.m394b(f3, f4, f2, f4);
    }

    private boolean hasGapBetweenThumbAndTrack() {
        return this.thumbTrackGapSize > 0;
    }

    private boolean hasTrackIcons() {
        return (this.trackIconActiveStart == null && this.trackIconActiveEnd == null && this.trackIconInactiveStart == null && this.trackIconInactiveEnd == null) ? false : true;
    }

    private Drawable initializeCustomThumbDrawable(Drawable drawable) {
        Drawable drawableNewDrawable = drawable.mutate().getConstantState().newDrawable();
        adjustCustomThumbDrawableBounds(drawableNewDrawable);
        return drawableNewDrawable;
    }

    private void invalidateTrack() {
        this.inactiveTrackPaint.setStrokeWidth(this.trackThickness);
        this.activeTrackPaint.setStrokeWidth(this.trackThickness);
    }

    private boolean isFocusRingEnabled() {
        FocusRingDrawable focusRing = getFocusRing();
        return focusRing != null && focusRing.isFocusRingEnabled();
    }

    private boolean isInHorizontalScrollingContainer() {
        for (ViewParent parent = getParent(); parent instanceof ViewGroup; parent = parent.getParent()) {
            ViewGroup viewGroup = (ViewGroup) parent;
            if ((viewGroup.canScrollHorizontally(1) || viewGroup.canScrollHorizontally(-1)) && viewGroup.shouldDelayChildPressedState()) {
                return true;
            }
        }
        return false;
    }

    private boolean isInVerticalScrollingContainer() {
        for (ViewParent parent = getParent(); parent instanceof ViewGroup; parent = parent.getParent()) {
            ViewGroup viewGroup = (ViewGroup) parent;
            if ((viewGroup.canScrollVertically(1) || viewGroup.canScrollVertically(-1)) && viewGroup.shouldDelayChildPressedState()) {
                return true;
            }
        }
        return false;
    }

    private static boolean isMouseEvent(MotionEvent motionEvent) {
        return motionEvent.getToolType(0) == 3;
    }

    private boolean isMultipleOfStepSize(double d) {
        double dDoubleValue = new BigDecimal(Double.toString(d)).divide(new BigDecimal(Float.toString(this.stepSize)), MathContext.DECIMAL64).doubleValue();
        return Math.abs(((double) Math.round(dDoubleValue)) - dDoubleValue) < THRESHOLD;
    }

    private boolean isOverlappingCenterGap(float f2) {
        float f3 = ((this.trackSidePadding * 2) + this.trackWidth) / 2.0f;
        int i2 = this.thumbTrackGapSize;
        return f2 >= f3 - ((float) i2) && f2 <= f3 + ((float) i2);
    }

    private boolean isOverlappingThumb(float f2) {
        for (int i2 = 0; i2 < this.values.size(); i2++) {
            float fValueToX = valueToX(this.values.get(i2).floatValue());
            float fCalculateThumbTrackGapSize = (this.thumbWidth / 2.0f) + calculateThumbTrackGapSize(i2);
            if (f2 >= fValueToX - fCalculateThumbTrackGapSize && f2 <= fValueToX + fCalculateThumbTrackGapSize) {
                return true;
            }
        }
        return false;
    }

    private boolean isPotentialHorizontalScroll(MotionEvent motionEvent) {
        return !isMouseEvent(motionEvent) && isInHorizontalScrollingContainer();
    }

    private boolean isPotentialVerticalScroll(MotionEvent motionEvent) {
        return !isMouseEvent(motionEvent) && isInVerticalScrollingContainer();
    }

    private boolean isSliderVisibleOnScreen() {
        Rect rect = new Rect();
        ViewUtils.getContentView(this).getHitRect(rect);
        return getLocalVisibleRect(rect) && isThisAndAncestorsVisible();
    }

    private boolean isThisAndAncestorsVisible() {
        return this.thisAndAncestorsVisible;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createLabelAnimator$1(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        Iterator<TooltipDrawable> it = this.labels.iterator();
        while (it.hasNext()) {
            it.next().setRevealFraction(fFloatValue);
        }
        postInvalidateOnAnimation();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0() {
        setActiveThumbIndex(-1);
        invalidate();
    }

    private void loadResources(@NonNull Resources resources) {
        this.minWidgetThickness = resources.getDimensionPixelSize(C5183R.dimen.mtrl_slider_widget_height);
        int dimensionPixelOffset = resources.getDimensionPixelOffset(C5183R.dimen.mtrl_slider_track_side_padding);
        this.minTrackSidePadding = dimensionPixelOffset;
        this.trackSidePadding = dimensionPixelOffset;
        this.defaultThumbRadius = resources.getDimensionPixelSize(C5183R.dimen.mtrl_slider_thumb_radius);
        this.defaultTrackThickness = resources.getDimensionPixelSize(C5183R.dimen.mtrl_slider_track_height);
        int i2 = C5183R.dimen.mtrl_slider_tick_radius;
        this.defaultTickActiveRadius = resources.getDimensionPixelSize(i2);
        this.defaultTickInactiveRadius = resources.getDimensionPixelSize(i2);
        this.minTickSpacing = resources.getDimensionPixelSize(C5183R.dimen.mtrl_slider_tick_min_spacing);
        this.labelPadding = resources.getDimensionPixelSize(C5183R.dimen.mtrl_slider_label_padding);
        this.trackIconPadding = resources.getDimensionPixelOffset(C5183R.dimen.m3_slider_track_icon_padding);
        this.accessibilityMinTouchTargetSize = resources.getDimensionPixelSize(C5183R.dimen.mtrl_min_touch_target_size);
    }

    private void maybeDrawCompatHalo(@NonNull Canvas canvas, int i2, int i3) {
        Canvas canvas2;
        if (shouldDrawCompatHalo()) {
            float[] fArr = {(normalizeValue(this.values.get(this.focusedThumbIdx).floatValue()) * i2) + this.trackSidePadding, i3};
            if (isVertical()) {
                this.rotationMatrix.mapPoints(fArr);
            }
            if (Build.VERSION.SDK_INT < 28) {
                float f2 = fArr[0];
                int i4 = this.haloRadius;
                float f3 = fArr[1];
                canvas2 = canvas;
                canvas2.clipRect(f2 - i4, f3 - i4, f2 + i4, f3 + i4, Region.Op.UNION);
            } else {
                canvas2 = canvas;
            }
            canvas2.drawCircle(fArr[0], fArr[1], this.haloRadius, this.haloPaint);
        }
    }

    private void maybeDrawStopIndicator(@NonNull Canvas canvas, int i2) {
        if (this.trackStopIndicatorSize <= 0 || this.values.isEmpty()) {
            return;
        }
        ArrayList<Float> arrayList = this.values;
        float fFloatValue = arrayList.get(arrayList.size() - 1).floatValue();
        float f2 = this.valueTo;
        if (fFloatValue < f2) {
            drawStopIndicator(canvas, valueToX(f2), i2);
        }
        if (isCentered() || (this.values.size() > 1 && this.values.get(0).floatValue() > this.valueFrom)) {
            drawStopIndicator(canvas, valueToX(this.valueFrom), i2);
        }
    }

    private void maybeDrawTicks(@NonNull Canvas canvas) {
        float[] fArr = this.ticksCoordinates;
        if (fArr == null || fArr.length == 0) {
            return;
        }
        float[] activeRange = getActiveRange();
        int iCeil = (int) Math.ceil(((this.ticksCoordinates.length / 2.0f) - 1.0f) * activeRange[0]);
        int iFloor = (int) Math.floor(((this.ticksCoordinates.length / 2.0f) - 1.0f) * activeRange[1]);
        if (iCeil > 0) {
            drawTicks(0, iCeil * 2, canvas, this.inactiveTicksPaint);
        }
        if (iCeil <= iFloor) {
            drawTicks(iCeil * 2, (iFloor + 1) * 2, canvas, this.activeTicksPaint);
        }
        int i2 = (iFloor + 1) * 2;
        float[] fArr2 = this.ticksCoordinates;
        if (i2 < fArr2.length) {
            drawTicks(i2, fArr2.length, canvas, this.inactiveTicksPaint);
        }
    }

    private boolean maybeIncreaseTrackSidePadding() {
        int iMax = Math.max(Math.max(Math.max((this.thumbWidth / 2) - this.defaultThumbRadius, 0), Math.max((this.trackThickness - this.defaultTrackThickness) / 2, 0)), Math.max(Math.max(this.tickActiveRadius - this.defaultTickActiveRadius, 0), Math.max(this.tickInactiveRadius - this.defaultTickInactiveRadius, 0))) + this.minTrackSidePadding;
        if (this.trackSidePadding == iMax) {
            return false;
        }
        this.trackSidePadding = iMax;
        if (!isLaidOut()) {
            return true;
        }
        updateTrackWidth(isVertical() ? getHeight() : getWidth());
        return true;
    }

    private boolean maybeIncreaseWidgetThickness() {
        int paddingTop;
        int paddingBottom;
        if (isVertical()) {
            paddingTop = getPaddingLeft();
            paddingBottom = getPaddingRight();
        } else {
            paddingTop = getPaddingTop();
            paddingBottom = getPaddingBottom();
        }
        int i2 = paddingBottom + paddingTop;
        int iMax = Math.max(this.minWidgetThickness, Math.max(this.trackThickness + i2, this.thumbHeight + i2));
        if (iMax == this.widgetThickness) {
            return false;
        }
        this.widgetThickness = iMax;
        return true;
    }

    private boolean moveFocus(int i2) {
        int i3 = this.focusedThumbIdx;
        int iClamp = (int) MathUtils.clamp(((long) i3) + ((long) i2), 0L, this.values.size() - 1);
        this.focusedThumbIdx = iClamp;
        if (iClamp == i3) {
            return false;
        }
        this.activeThumbIdx = iClamp;
        updateThumbWidthWhenPressed();
        updateHaloHotspot();
        postInvalidate();
        return true;
    }

    private boolean moveFocusInAbsoluteDirection(int i2) {
        if (isRtl() || isVertical()) {
            i2 = i2 == Integer.MIN_VALUE ? Integer.MAX_VALUE : -i2;
        }
        return moveFocus(i2);
    }

    private float normalizeValue(float f2) {
        float f3 = this.valueFrom;
        float f4 = (f2 - f3) / (this.valueTo - f3);
        return (isRtl() || isVertical()) ? 1.0f - f4 : f4;
    }

    private void onStartTrackingTouch() {
        Iterator<T> it = this.touchListeners.iterator();
        while (it.hasNext()) {
            it.next().onStartTrackingTouch(this);
        }
    }

    private void onStopTrackingTouch() {
        Iterator<T> it = this.touchListeners.iterator();
        while (it.hasNext()) {
            it.next().onStopTrackingTouch(this);
        }
    }

    private void positionLabel(TooltipDrawable tooltipDrawable, float f2) {
        calculateLabelBounds(tooltipDrawable, f2);
        if (isVertical()) {
            RectF rectF = new RectF(this.labelRect);
            this.rotationMatrix.mapRect(rectF);
            rectF.round(this.labelRect);
        }
        DescendantOffsetUtils.offsetDescendantRect(ViewUtils.getContentView(this), this, this.labelRect);
        tooltipDrawable.setBounds(this.labelRect);
    }

    private void processAttributes(Context context, AttributeSet attributeSet, int i2) {
        TypedArray typedArrayObtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context, attributeSet, C5183R.styleable.Slider, i2, DEF_STYLE_RES, new int[0]);
        setOrientation(typedArrayObtainStyledAttributes.getInt(C5183R.styleable.Slider_android_orientation, 0));
        this.labelStyle = typedArrayObtainStyledAttributes.getResourceId(C5183R.styleable.Slider_labelStyle, C5183R.style.Widget_MaterialComponents_Tooltip);
        this.valueFrom = typedArrayObtainStyledAttributes.getFloat(C5183R.styleable.Slider_android_valueFrom, 0.0f);
        this.valueTo = typedArrayObtainStyledAttributes.getFloat(C5183R.styleable.Slider_android_valueTo, 1.0f);
        setCentered(typedArrayObtainStyledAttributes.getBoolean(C5183R.styleable.Slider_centered, false));
        this.stepSize = typedArrayObtainStyledAttributes.getFloat(C5183R.styleable.Slider_android_stepSize, 0.0f);
        this.continuousModeTickCount = typedArrayObtainStyledAttributes.getInt(C5183R.styleable.Slider_continuousModeTickCount, 0);
        this.minTouchTargetSize = (int) Math.ceil(typedArrayObtainStyledAttributes.getDimension(C5183R.styleable.Slider_minTouchTargetSize, MaterialAttributes.resolveMinimumAccessibleTouchTarget(context)));
        int i3 = C5183R.styleable.Slider_trackColor;
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(i3);
        int i4 = zHasValue ? i3 : C5183R.styleable.Slider_trackColorInactive;
        if (!zHasValue) {
            i3 = C5183R.styleable.Slider_trackColorActive;
        }
        ColorStateList colorStateList = MaterialResources.getColorStateList(context, typedArrayObtainStyledAttributes, i4);
        if (colorStateList == null) {
            colorStateList = AppCompatResources.getColorStateList(context, C5183R.color.material_slider_inactive_track_color);
        }
        setTrackInactiveTintList(colorStateList);
        ColorStateList colorStateList2 = MaterialResources.getColorStateList(context, typedArrayObtainStyledAttributes, i3);
        if (colorStateList2 == null) {
            colorStateList2 = AppCompatResources.getColorStateList(context, C5183R.color.material_slider_active_track_color);
        }
        setTrackActiveTintList(colorStateList2);
        ColorStateList colorStateList3 = MaterialResources.getColorStateList(context, typedArrayObtainStyledAttributes, C5183R.styleable.Slider_thumbColor);
        if (colorStateList3 == null) {
            colorStateList3 = AppCompatResources.getColorStateList(context, C5183R.color.material_slider_thumb_color);
        }
        setThumbTintList(colorStateList3);
        int i5 = C5183R.styleable.Slider_thumbStrokeColor;
        if (typedArrayObtainStyledAttributes.hasValue(i5)) {
            setThumbStrokeColor(MaterialResources.getColorStateList(context, typedArrayObtainStyledAttributes, i5));
        }
        setThumbStrokeWidth(typedArrayObtainStyledAttributes.getDimension(C5183R.styleable.Slider_thumbStrokeWidth, 0.0f));
        ColorStateList colorStateList4 = MaterialResources.getColorStateList(context, typedArrayObtainStyledAttributes, C5183R.styleable.Slider_haloColor);
        if (colorStateList4 == null) {
            colorStateList4 = AppCompatResources.getColorStateList(context, C5183R.color.material_slider_halo_color);
        }
        setHaloTintList(colorStateList4);
        int i6 = C5183R.styleable.Slider_tickVisibilityMode;
        this.tickVisibilityMode = typedArrayObtainStyledAttributes.hasValue(i6) ? typedArrayObtainStyledAttributes.getInt(i6, -1) : convertToTickVisibilityMode(typedArrayObtainStyledAttributes.getBoolean(C5183R.styleable.Slider_tickVisible, true));
        int i7 = C5183R.styleable.Slider_tickColor;
        boolean zHasValue2 = typedArrayObtainStyledAttributes.hasValue(i7);
        int i8 = zHasValue2 ? i7 : C5183R.styleable.Slider_tickColorInactive;
        if (!zHasValue2) {
            i7 = C5183R.styleable.Slider_tickColorActive;
        }
        ColorStateList colorStateList5 = MaterialResources.getColorStateList(context, typedArrayObtainStyledAttributes, i8);
        if (colorStateList5 == null) {
            colorStateList5 = AppCompatResources.getColorStateList(context, C5183R.color.material_slider_inactive_tick_marks_color);
        }
        setTickInactiveTintList(colorStateList5);
        ColorStateList colorStateList6 = MaterialResources.getColorStateList(context, typedArrayObtainStyledAttributes, i7);
        if (colorStateList6 == null) {
            colorStateList6 = AppCompatResources.getColorStateList(context, C5183R.color.material_slider_active_tick_marks_color);
        }
        setTickActiveTintList(colorStateList6);
        setThumbTrackGapSize(typedArrayObtainStyledAttributes.getDimensionPixelSize(C5183R.styleable.Slider_thumbTrackGapSize, 0));
        setTrackStopIndicatorSize(typedArrayObtainStyledAttributes.getDimensionPixelSize(C5183R.styleable.Slider_trackStopIndicatorSize, 0));
        setTrackCornerSize(typedArrayObtainStyledAttributes.getDimensionPixelSize(C5183R.styleable.Slider_trackCornerSize, -1));
        setTrackInsideCornerSize(typedArrayObtainStyledAttributes.getDimensionPixelSize(C5183R.styleable.Slider_trackInsideCornerSize, 0));
        setTrackIconActiveStart(MaterialResources.getDrawable(context, typedArrayObtainStyledAttributes, C5183R.styleable.Slider_trackIconActiveStart));
        setTrackIconActiveEnd(MaterialResources.getDrawable(context, typedArrayObtainStyledAttributes, C5183R.styleable.Slider_trackIconActiveEnd));
        setTrackIconActiveColor(MaterialResources.getColorStateList(context, typedArrayObtainStyledAttributes, C5183R.styleable.Slider_trackIconActiveColor));
        setTrackIconInactiveStart(MaterialResources.getDrawable(context, typedArrayObtainStyledAttributes, C5183R.styleable.Slider_trackIconInactiveStart));
        setTrackIconInactiveEnd(MaterialResources.getDrawable(context, typedArrayObtainStyledAttributes, C5183R.styleable.Slider_trackIconInactiveEnd));
        setTrackIconInactiveColor(MaterialResources.getColorStateList(context, typedArrayObtainStyledAttributes, C5183R.styleable.Slider_trackIconInactiveColor));
        setTrackIconSize(typedArrayObtainStyledAttributes.getDimensionPixelSize(C5183R.styleable.Slider_trackIconSize, 0));
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(C5183R.styleable.Slider_thumbRadius, 0) * 2;
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(C5183R.styleable.Slider_thumbWidth, dimensionPixelSize);
        int dimensionPixelSize3 = typedArrayObtainStyledAttributes.getDimensionPixelSize(C5183R.styleable.Slider_thumbHeight, dimensionPixelSize);
        setThumbWidth(dimensionPixelSize2);
        setThumbHeight(dimensionPixelSize3);
        setHaloRadius(typedArrayObtainStyledAttributes.getDimensionPixelSize(C5183R.styleable.Slider_haloRadius, 0));
        setThumbElevation(typedArrayObtainStyledAttributes.getDimension(C5183R.styleable.Slider_thumbElevation, 0.0f));
        setTrackHeight(typedArrayObtainStyledAttributes.getDimensionPixelSize(C5183R.styleable.Slider_trackHeight, 0));
        setTickActiveRadius(typedArrayObtainStyledAttributes.getDimensionPixelSize(C5183R.styleable.Slider_tickRadiusActive, this.trackStopIndicatorSize / 2));
        setTickInactiveRadius(typedArrayObtainStyledAttributes.getDimensionPixelSize(C5183R.styleable.Slider_tickRadiusInactive, this.trackStopIndicatorSize / 2));
        setLabelBehavior(typedArrayObtainStyledAttributes.getInt(C5183R.styleable.Slider_labelBehavior, 0));
        if (!typedArrayObtainStyledAttributes.getBoolean(C5183R.styleable.Slider_android_enabled, true)) {
            setEnabled(false);
        }
        setValues(Float.valueOf(this.valueFrom));
        typedArrayObtainStyledAttributes.recycle();
    }

    private void resetThumbWidth() {
        int i2;
        if (!hasGapBetweenThumbAndTrack() || (i2 = this.defaultThumbWidth) == -1 || this.defaultThumbTrackGapSize == -1) {
            return;
        }
        setThumbSize(i2, this.defaultThumbHeight, Integer.valueOf(this.activeThumbIdx));
    }

    private void scheduleAccessibilityEventSender(int i2) {
        BaseSlider<S, L, T>.AccessibilityEventSender accessibilityEventSender = this.accessibilityEventSender;
        if (accessibilityEventSender == null) {
            this.accessibilityEventSender = new AccessibilityEventSender();
        } else {
            removeCallbacks(accessibilityEventSender);
        }
        this.accessibilityEventSender.setVirtualViewId(i2);
        postDelayed(this.accessibilityEventSender, 200L);
    }

    private void setThumbSize(@IntRange(from = FabTransformationScrimBehavior.COLLAPSE_DELAY) @Px int i2, @Px int i3, @Nullable Integer num) {
        for (int i4 = 0; i4 < this.defaultThumbDrawables.size(); i4++) {
            if (num == null || i4 == num.intValue()) {
                this.defaultThumbDrawables.get(i4).setShapeAppearanceModel(ShapeAppearanceModel.builder().setAllCorners(0, i2 / 2.0f).build());
                this.defaultThumbDrawables.get(i4).setBounds(0, 0, i2, i3 >= 0 ? i3 : this.thumbHeight);
            }
        }
        updateWidgetLayout(false);
    }

    private void setValueForLabel(TooltipDrawable tooltipDrawable, float f2) {
        tooltipDrawable.setText(formatValue(f2));
        positionLabel(tooltipDrawable, f2);
        ViewOverlay contentViewOverlay = getContentViewOverlay();
        if (contentViewOverlay == null) {
            return;
        }
        contentViewOverlay.add(tooltipDrawable);
    }

    private void setValuesInternal(@NonNull ArrayList<Float> arrayList) {
        if (arrayList.isEmpty()) {
            throw new IllegalArgumentException("At least one value must be set");
        }
        Collections.sort(arrayList);
        if (this.values.size() == arrayList.size() && this.values.equals(arrayList)) {
            return;
        }
        this.values = arrayList;
        this.dirtyConfig = true;
        updateDefaultThumbDrawables();
        this.focusedThumbIdx = 0;
        updateHaloHotspot();
        createLabelPool();
        dispatchOnChangedProgrammatically();
        postInvalidate();
    }

    private boolean shouldAlwaysShowLabel() {
        return this.labelBehavior == 3;
    }

    private boolean shouldDrawCompatHalo() {
        return this.forceDrawCompatHalo || getBackgroundRipple() == null;
    }

    private boolean snapActiveThumbToValue(float f2) {
        return snapThumbToValue(this.activeThumbIdx, f2);
    }

    private double snapPosition(float f2) {
        float f3 = this.stepSize;
        if (f3 <= 0.0f) {
            return f2;
        }
        int i2 = (int) ((this.valueTo - this.valueFrom) / f3);
        return ((double) Math.round(f2 * i2)) / ((double) i2);
    }

    private void snapThumbToPreviousDownTouchEventValue() {
        if (this.activeThumbIdx == -1 || this.previousDownTouchEventValues.isEmpty()) {
            return;
        }
        for (int i2 = 0; i2 < this.values.size(); i2++) {
            if (i2 == this.activeThumbIdx) {
                snapThumbToValue(i2, this.previousDownTouchEventValues.get(i2).floatValue());
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean snapThumbToValue(int i2, float f2) {
        this.focusedThumbIdx = i2;
        if (Math.abs(f2 - this.values.get(i2).floatValue()) < THRESHOLD) {
            return false;
        }
        this.values.set(i2, Float.valueOf(getClampedValue(i2, f2)));
        dispatchOnChangedFromUser(i2);
        return true;
    }

    private boolean snapTouchPosition() {
        return snapActiveThumbToValue(getValueOfTouchPosition());
    }

    private void updateDefaultThumbDrawables() {
        if (this.defaultThumbDrawables.size() != this.values.size()) {
            this.defaultThumbDrawables.clear();
            for (int i2 = 0; i2 < this.values.size(); i2++) {
                this.defaultThumbDrawables.add(createNewDefaultThumb());
            }
        }
    }

    private void updateFocusRingBounds(float f2, float f3) {
        float f4;
        float f5;
        float f6;
        float f7;
        FocusRingDrawable focusRing = getFocusRing();
        if (focusRing != null) {
            float dimensionPixelOffset = getResources().getDimensionPixelOffset(C5183R.dimen.m3_slider_focus_ring_padding);
            float f8 = (dimensionPixelOffset * 2.0f) + (this.thumbWidth / 2.0f);
            float f9 = (this.thumbHeight / 2.0f) + dimensionPixelOffset;
            if (isVertical()) {
                f4 = f3 - f9;
                float f10 = f3 + f9;
                f5 = f2 - f8;
                f6 = f2 + f8;
                f7 = f10;
            } else {
                f4 = f2 - f8;
                f7 = f2 + f8;
                f5 = f3 - f9;
                f6 = f3 + f9;
            }
            focusRing.mutate();
            focusRing.setFocusRingBounds((int) f4, (int) f5, (int) f7, (int) f6);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateHaloHotspot() {
        RippleDrawable backgroundRipple;
        float fNormalizeValue = (normalizeValue(this.values.get(this.focusedThumbIdx).floatValue()) * this.trackWidth) + this.trackSidePadding;
        int iCalculateTrackCenter = calculateTrackCenter();
        if (!shouldDrawCompatHalo() && getMeasuredWidth() > 0 && (backgroundRipple = getBackgroundRipple()) != null) {
            int i2 = this.haloRadius;
            float[] fArr = {fNormalizeValue - i2, iCalculateTrackCenter - i2, i2 + fNormalizeValue, i2 + iCalculateTrackCenter};
            if (isVertical()) {
                this.rotationMatrix.mapPoints(fArr);
            }
            backgroundRipple.setHotspotBounds((int) fArr[0], (int) fArr[1], (int) fArr[2], (int) fArr[3]);
        }
        updateFocusRingBounds(fNormalizeValue, iCalculateTrackCenter);
    }

    private void updateLabelPivots() {
        float f2;
        boolean zIsVertical = isVertical();
        boolean zIsRtl = isRtl();
        float f3 = 0.5f;
        if (zIsVertical && zIsRtl) {
            f2 = 0.5f;
            f3 = -0.2f;
        } else {
            f2 = 1.2f;
            if (zIsVertical) {
                f3 = 1.2f;
                f2 = 0.5f;
            }
        }
        Iterator<TooltipDrawable> it = this.labels.iterator();
        while (it.hasNext()) {
            it.next().setPivots(f3, f2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateLabels() {
        updateLabelPivots();
        int i2 = this.labelBehavior;
        if (i2 == 0 || i2 == 1) {
            if (this.activeThumbIdx == -1 || !isEnabled()) {
                ensureLabelsRemoved();
                return;
            } else {
                ensureLabelsAdded(false);
                return;
            }
        }
        if (i2 == 2) {
            ensureLabelsRemoved();
            return;
        }
        if (i2 != 3) {
            throw new IllegalArgumentException("Unexpected labelBehavior: " + this.labelBehavior);
        }
        if (isEnabled() && isSliderVisibleOnScreen()) {
            ensureLabelsAdded(true);
        } else {
            ensureLabelsRemoved();
        }
    }

    private void updateRotationMatrix() {
        float fCalculateTrackCenter = calculateTrackCenter();
        this.rotationMatrix.reset();
        this.rotationMatrix.setRotate(90.0f, fCalculateTrackCenter, fCalculateTrackCenter);
    }

    private void updateThumbWidthWhenPressed() {
        if (hasGapBetweenThumbAndTrack() && this.customThumbDrawable == null && this.customThumbDrawablesForValues.isEmpty()) {
            int i2 = this.thumbWidth;
            this.defaultThumbWidth = i2;
            this.defaultThumbHeight = this.thumbHeight;
            this.defaultThumbTrackGapSize = this.thumbTrackGapSize;
            setThumbSize(Math.round(i2 * 0.5f), isFocusRingEnabled() ? this.thumbHeight - this.thumbHeightDecreaseFocusRing : -1, Integer.valueOf(this.activeThumbIdx));
        }
    }

    private void updateTicksCoordinates() {
        int iMin;
        validateConfigurationIfDirty();
        if (this.stepSize <= 0.0f) {
            updateTicksCoordinates(this.continuousModeTickCount);
            return;
        }
        int i2 = this.tickVisibilityMode;
        if (i2 != 0) {
            iMin = 0;
            if (i2 == 1) {
                int desiredTickCount = getDesiredTickCount();
                if (desiredTickCount <= getMaxTickCount()) {
                    iMin = desiredTickCount;
                }
            } else if (i2 != 2) {
                throw new IllegalStateException("Unexpected tickVisibilityMode: " + this.tickVisibilityMode);
            }
        } else {
            iMin = Math.min(getDesiredTickCount(), getMaxTickCount());
        }
        updateTicksCoordinates(iMin);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0039  */
    /* JADX WARN: Code duplicated, block: B:20:0x0047  */
    /* JADX WARN: Code duplicated, block: B:23:0x005b  */
    /* JADX WARN: Code duplicated, block: B:25:0x006c  */
    /* JADX WARN: Code duplicated, block: B:27:0x008b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x008d  */
    /* JADX WARN: Code duplicated, block: B:29:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:30:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:33:0x00c3  */
    private void updateTrack(Canvas canvas, Paint paint, RectF rectF, float f2, FullCornerDirection fullCornerDirection) {
        int i2;
        RectF rectF2;
        float fMax;
        int iOrdinal;
        if (rectF.isEmpty()) {
            return;
        }
        float fCalculateStartTrackCornerSize = calculateStartTrackCornerSize(f2);
        float fCalculateEndTrackCornerSize = calculateEndTrackCornerSize(f2);
        int iOrdinal2 = fullCornerDirection.ordinal();
        if (iOrdinal2 != 1) {
            if (iOrdinal2 == 2) {
                fCalculateStartTrackCornerSize = this.trackInsideCornerSize;
            } else if (iOrdinal2 == 3) {
                i2 = this.trackInsideCornerSize;
                fCalculateStartTrackCornerSize = i2;
            }
            paint.setStyle(Paint.Style.FILL);
            paint.setStrokeCap(Paint.Cap.BUTT);
            if (hasGapBetweenThumbAndTrack()) {
                paint.setAntiAlias(true);
            }
            rectF2 = new RectF(rectF);
            if (isVertical()) {
                this.rotationMatrix.mapRect(rectF2);
            }
            this.trackPath.reset();
            if (rectF.width() >= fCalculateStartTrackCornerSize + fCalculateEndTrackCornerSize) {
                this.trackPath.addRoundRect(rectF2, getCornerRadii(fCalculateStartTrackCornerSize, fCalculateEndTrackCornerSize), Path.Direction.CW);
                canvas.drawPath(this.trackPath, paint);
                return;
            }
            float fMin = Math.min(fCalculateStartTrackCornerSize, fCalculateEndTrackCornerSize);
            fMax = Math.max(fCalculateStartTrackCornerSize, fCalculateEndTrackCornerSize);
            canvas.save();
            this.trackPath.addRoundRect(rectF2, fMin, fMin, Path.Direction.CW);
            canvas.clipPath(this.trackPath);
            iOrdinal = fullCornerDirection.ordinal();
            if (iOrdinal != 1) {
                RectF rectF3 = this.cornerRect;
                float f3 = rectF.left;
                rectF3.set(f3, rectF.top, (2.0f * fMax) + f3, rectF.bottom);
            } else if (iOrdinal != 2) {
                this.cornerRect.set(rectF.centerX() - fMax, rectF.top, rectF.centerX() + fMax, rectF.bottom);
            } else {
                RectF rectF4 = this.cornerRect;
                float f4 = rectF.right;
                rectF4.set(f4 - (2.0f * fMax), rectF.top, f4, rectF.bottom);
            }
            if (isVertical()) {
                this.rotationMatrix.mapRect(this.cornerRect);
            }
            canvas.drawRoundRect(this.cornerRect, fMax, fMax, paint);
            canvas.restore();
        }
        i2 = this.trackInsideCornerSize;
        fCalculateEndTrackCornerSize = i2;
        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeCap(Paint.Cap.BUTT);
        if (hasGapBetweenThumbAndTrack()) {
            paint.setAntiAlias(true);
        }
        rectF2 = new RectF(rectF);
        if (isVertical()) {
            this.rotationMatrix.mapRect(rectF2);
        }
        this.trackPath.reset();
        if (rectF.width() >= fCalculateStartTrackCornerSize + fCalculateEndTrackCornerSize) {
            this.trackPath.addRoundRect(rectF2, getCornerRadii(fCalculateStartTrackCornerSize, fCalculateEndTrackCornerSize), Path.Direction.CW);
            canvas.drawPath(this.trackPath, paint);
            return;
        }
        float fMin2 = Math.min(fCalculateStartTrackCornerSize, fCalculateEndTrackCornerSize);
        fMax = Math.max(fCalculateStartTrackCornerSize, fCalculateEndTrackCornerSize);
        canvas.save();
        this.trackPath.addRoundRect(rectF2, fMin2, fMin2, Path.Direction.CW);
        canvas.clipPath(this.trackPath);
        iOrdinal = fullCornerDirection.ordinal();
        if (iOrdinal != 1) {
            RectF rectF5 = this.cornerRect;
            float f5 = rectF.left;
            rectF5.set(f5, rectF.top, (2.0f * fMax) + f5, rectF.bottom);
        } else if (iOrdinal != 2) {
            this.cornerRect.set(rectF.centerX() - fMax, rectF.top, rectF.centerX() + fMax, rectF.bottom);
        } else {
            RectF rectF6 = this.cornerRect;
            float f6 = rectF.right;
            rectF6.set(f6 - (2.0f * fMax), rectF.top, f6, rectF.bottom);
        }
        if (isVertical()) {
            this.rotationMatrix.mapRect(this.cornerRect);
        }
        canvas.drawRoundRect(this.cornerRect, fMax, fMax, paint);
        canvas.restore();
    }

    private void updateTrackIconActiveEnd() {
        Drawable drawable = this.trackIconActiveEnd;
        if (drawable != null) {
            if (!this.trackIconActiveEndMutated && this.trackIconActiveColor != null) {
                this.trackIconActiveEnd = DrawableCompat.wrap(drawable).mutate();
                this.trackIconActiveEndMutated = true;
            }
            if (this.trackIconActiveEndMutated) {
                this.trackIconActiveEnd.setTintList(this.trackIconActiveColor);
            }
        }
    }

    private void updateTrackIconActiveStart() {
        Drawable drawable = this.trackIconActiveStart;
        if (drawable != null) {
            if (!this.trackIconActiveStartMutated && this.trackIconActiveColor != null) {
                this.trackIconActiveStart = DrawableCompat.wrap(drawable).mutate();
                this.trackIconActiveStartMutated = true;
            }
            if (this.trackIconActiveStartMutated) {
                this.trackIconActiveStart.setTintList(this.trackIconActiveColor);
            }
        }
    }

    private void updateTrackIconInactiveEnd() {
        Drawable drawable = this.trackIconInactiveEnd;
        if (drawable != null) {
            if (!this.trackIconInactiveEndMutated && this.trackIconInactiveColor != null) {
                this.trackIconInactiveEnd = DrawableCompat.wrap(drawable).mutate();
                this.trackIconInactiveEndMutated = true;
            }
            if (this.trackIconInactiveEndMutated) {
                this.trackIconInactiveEnd.setTintList(this.trackIconInactiveColor);
            }
        }
    }

    private void updateTrackIconInactiveStart() {
        Drawable drawable = this.trackIconInactiveStart;
        if (drawable != null) {
            if (!this.trackIconInactiveStartMutated && this.trackIconInactiveColor != null) {
                this.trackIconInactiveStart = DrawableCompat.wrap(drawable).mutate();
                this.trackIconInactiveStartMutated = true;
            }
            if (this.trackIconInactiveStartMutated) {
                this.trackIconInactiveStart.setTintList(this.trackIconInactiveColor);
            }
        }
    }

    private void updateTrackWidth(int i2) {
        this.trackWidth = Math.max(i2 - (this.trackSidePadding * 2), 0);
        updateTicksCoordinates();
    }

    private void updateWidgetLayout(boolean z) {
        boolean zMaybeIncreaseWidgetThickness = maybeIncreaseWidgetThickness();
        boolean zMaybeIncreaseTrackSidePadding = maybeIncreaseTrackSidePadding();
        if (isVertical()) {
            updateRotationMatrix();
        }
        if (zMaybeIncreaseWidgetThickness || z) {
            requestLayout();
        } else if (zMaybeIncreaseTrackSidePadding) {
            postInvalidate();
        }
    }

    private void validateConfigurationIfDirty() {
        if (this.dirtyConfig) {
            validateValues();
            validateStepSize();
            validateMinSeparation();
            warnAboutFloatingPointError();
            this.dirtyConfig = false;
        }
    }

    private void validateMinSeparation() {
        float minSeparation = getMinSeparation();
        if (minSeparation < 0.0f) {
            throw new IllegalStateException("minSeparation(" + minSeparation + ") must be greater or equal to 0");
        }
        float f2 = this.stepSize;
        if (f2 <= 0.0f || minSeparation <= 0.0f) {
            return;
        }
        if (this.separationUnit != 1) {
            throw new IllegalStateException("minSeparation(" + minSeparation + ") cannot be set as a dimension when using stepSize(" + this.stepSize + ")");
        }
        if (minSeparation < f2 || !isMultipleOfStepSize(minSeparation)) {
            throw new IllegalStateException("minSeparation(" + minSeparation + ") must be greater or equal and a multiple of stepSize(" + this.stepSize + ") when using stepSize(" + this.stepSize + ")");
        }
    }

    private void validateStepSize() {
        if (this.stepSize <= 0.0f || valueLandsOnTick(this.valueTo)) {
            return;
        }
        throw new IllegalStateException("The stepSize(" + this.stepSize + ") must be 0, or a factor of the valueFrom(" + this.valueFrom + ")-valueTo(" + this.valueTo + ") range");
    }

    private void validateValues() {
        if (this.valueFrom >= this.valueTo) {
            throw new IllegalStateException("valueFrom(" + this.valueFrom + ") must be smaller than valueTo(" + this.valueTo + ")");
        }
        ArrayList<Float> arrayList = this.values;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Float f2 = arrayList.get(i2);
            i2++;
            Float f3 = f2;
            if (f3.floatValue() < this.valueFrom || f3.floatValue() > this.valueTo) {
                throw new IllegalStateException("Slider value(" + f3 + ") must be greater or equal to valueFrom(" + this.valueFrom + "), and lower or equal to valueTo(" + this.valueTo + ")");
            }
            if (this.stepSize > 0.0f && !valueLandsOnTick(f3.floatValue())) {
                throw new IllegalStateException("Value(" + f3 + ") must be equal to valueFrom(" + this.valueFrom + ") plus a multiple of stepSize(" + this.stepSize + ") when using stepSize(" + this.stepSize + ")");
            }
        }
    }

    private boolean valueLandsOnTick(float f2) {
        return isMultipleOfStepSize(new BigDecimal(Float.toString(f2)).subtract(new BigDecimal(Float.toString(this.valueFrom)), MathContext.DECIMAL64).doubleValue());
    }

    private float valueToX(float f2) {
        return (normalizeValue(f2) * this.trackWidth) + this.trackSidePadding;
    }

    private void warnAboutFloatingPointError() {
        float f2 = this.stepSize;
        if (f2 == 0.0f) {
            return;
        }
        if (((int) f2) != f2) {
            Log.w(TAG, "Floating point value used for stepSize(" + f2 + "). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.");
        }
        float f3 = this.valueFrom;
        if (((int) f3) != f3) {
            Log.w(TAG, "Floating point value used for valueFrom(" + f3 + "). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.");
        }
        float f4 = this.valueTo;
        if (((int) f4) != f4) {
            Log.w(TAG, "Floating point value used for valueTo(" + f4 + "). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.");
        }
    }

    public void addOnChangeListener(@NonNull L l2) {
        this.changeListeners.add(l2);
    }

    public void addOnSliderTouchListener(@NonNull T t) {
        this.touchListeners.add(t);
    }

    public void clearOnChangeListeners() {
        this.changeListeners.clear();
    }

    public void clearOnSliderTouchListeners() {
        this.touchListeners.clear();
    }

    @Override // android.view.View
    public boolean dispatchHoverEvent(@NonNull MotionEvent motionEvent) {
        return this.accessibilityHelper.dispatchHoverEvent(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean dispatchKeyEvent(@NonNull KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        this.inactiveTrackPaint.setColor(getColorForState(this.trackColorInactive));
        this.activeTrackPaint.setColor(getColorForState(this.trackColorActive));
        this.inactiveTicksPaint.setColor(getColorForState(this.tickColorInactive));
        this.activeTicksPaint.setColor(getColorForState(this.tickColorActive));
        this.stopIndicatorPaint.setColor(getColorForState(this.tickColorInactive));
        for (TooltipDrawable tooltipDrawable : this.labels) {
            if (tooltipDrawable.isStateful()) {
                tooltipDrawable.setState(getDrawableState());
            }
        }
        for (int i2 = 0; i2 < this.defaultThumbDrawables.size(); i2++) {
            if (this.defaultThumbDrawables.get(i2).isStateful()) {
                this.defaultThumbDrawables.get(i2).setState(getDrawableState());
            }
        }
        this.haloPaint.setColor(getColorForState(this.haloColor));
        this.haloPaint.setAlpha(63);
    }

    @VisibleForTesting
    public void forceDrawCompatHalo(boolean z) {
        this.forceDrawCompatHalo = z;
    }

    @Override // android.view.View
    @NonNull
    public CharSequence getAccessibilityClassName() {
        return SeekBar.class.getName();
    }

    @VisibleForTesting
    public final int getAccessibilityFocusedVirtualViewId() {
        return this.accessibilityHelper.getAccessibilityFocusedVirtualViewId();
    }

    public int getActiveThumbIndex() {
        return this.activeThumbIdx;
    }

    public int getContinuousModeTickCount() {
        return this.continuousModeTickCount;
    }

    public int getFocusedThumbIndex() {
        return this.focusedThumbIdx;
    }

    @Px
    public int getHaloRadius() {
        return this.haloRadius;
    }

    @NonNull
    public ColorStateList getHaloTintList() {
        return this.haloColor;
    }

    public int getLabelBehavior() {
        return this.labelBehavior;
    }

    public float getMinSeparation() {
        return 0.0f;
    }

    public float getStepSize() {
        return this.stepSize;
    }

    public float getThumbElevation() {
        return this.thumbElevation;
    }

    @Px
    public int getThumbHeight() {
        return this.thumbHeight;
    }

    @Px
    public int getThumbRadius() {
        return this.thumbWidth / 2;
    }

    @Nullable
    public ColorStateList getThumbStrokeColor() {
        return this.thumbStrokeColor;
    }

    public float getThumbStrokeWidth() {
        return this.thumbStrokeWidth;
    }

    @NonNull
    public ColorStateList getThumbTintList() {
        return this.thumbTintList;
    }

    public int getThumbTrackGapSize() {
        return this.thumbTrackGapSize;
    }

    @Px
    public int getThumbWidth() {
        return this.thumbWidth;
    }

    @Px
    public int getTickActiveRadius() {
        return this.tickActiveRadius;
    }

    @NonNull
    public ColorStateList getTickActiveTintList() {
        return this.tickColorActive;
    }

    @Px
    public int getTickInactiveRadius() {
        return this.tickInactiveRadius;
    }

    @NonNull
    public ColorStateList getTickInactiveTintList() {
        return this.tickColorInactive;
    }

    @NonNull
    public ColorStateList getTickTintList() {
        if (this.tickColorInactive.equals(this.tickColorActive)) {
            return this.tickColorActive;
        }
        throw new IllegalStateException("The inactive and active ticks are different colors. Use the getTickColorInactive() and getTickColorActive() methods instead.");
    }

    public int getTickVisibilityMode() {
        return this.tickVisibilityMode;
    }

    @NonNull
    public ColorStateList getTrackActiveTintList() {
        return this.trackColorActive;
    }

    @Px
    public int getTrackCornerSize() {
        int i2 = this.trackCornerSize;
        return i2 == -1 ? this.trackThickness / 2 : i2;
    }

    @Px
    public int getTrackHeight() {
        return this.trackThickness;
    }

    @Nullable
    public ColorStateList getTrackIconActiveColor() {
        return this.trackIconActiveColor;
    }

    @Nullable
    public Drawable getTrackIconActiveEnd() {
        return this.trackIconActiveEnd;
    }

    @Nullable
    public Drawable getTrackIconActiveStart() {
        return this.trackIconActiveStart;
    }

    @Nullable
    public ColorStateList getTrackIconInactiveColor() {
        return this.trackIconInactiveColor;
    }

    @Nullable
    public Drawable getTrackIconInactiveEnd() {
        return this.trackIconInactiveEnd;
    }

    @Nullable
    public Drawable getTrackIconInactiveStart() {
        return this.trackIconInactiveStart;
    }

    public int getTrackIconSize() {
        return this.trackIconSize;
    }

    @NonNull
    public ColorStateList getTrackInactiveTintList() {
        return this.trackColorInactive;
    }

    public int getTrackInsideCornerSize() {
        return this.trackInsideCornerSize;
    }

    @Px
    public int getTrackSidePadding() {
        return this.trackSidePadding;
    }

    public int getTrackStopIndicatorSize() {
        return this.trackStopIndicatorSize;
    }

    @NonNull
    public ColorStateList getTrackTintList() {
        if (this.trackColorInactive.equals(this.trackColorActive)) {
            return this.trackColorActive;
        }
        throw new IllegalStateException("The inactive and active parts of the track are different colors. Use the getInactiveTrackColor() and getActiveTrackColor() methods instead.");
    }

    @Px
    public int getTrackWidth() {
        return this.trackWidth;
    }

    public float getValueFrom() {
        return this.valueFrom;
    }

    public float getValueTo() {
        return this.valueTo;
    }

    @NonNull
    public List<Float> getValues() {
        return new ArrayList(this.values);
    }

    public boolean hasLabelFormatter() {
        return this.formatter != null;
    }

    public boolean isCentered() {
        return this.centered;
    }

    public final boolean isRtl() {
        return getLayoutDirection() == 1;
    }

    public boolean isTickVisible() {
        int i2 = this.tickVisibilityMode;
        if (i2 == 0) {
            return true;
        }
        if (i2 == 1) {
            return getDesiredTickCount() <= getMaxTickCount();
        }
        if (i2 == 2) {
            return false;
        }
        throw new IllegalStateException("Unexpected tickVisibilityMode: " + this.tickVisibilityMode);
    }

    public boolean isVertical() {
        return this.widgetOrientation == 1;
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.thisAndAncestorsVisible = isShown();
        getViewTreeObserver().addOnScrollChangedListener(this.onScrollChangedListener);
        getViewTreeObserver().addOnGlobalLayoutListener(this.onGlobalLayoutListener);
        Iterator<TooltipDrawable> it = this.labels.iterator();
        while (it.hasNext()) {
            attachLabelToContentView(it.next());
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        BaseSlider<S, L, T>.AccessibilityEventSender accessibilityEventSender = this.accessibilityEventSender;
        if (accessibilityEventSender != null) {
            removeCallbacks(accessibilityEventSender);
        }
        this.labelsAreAnimatedIn = false;
        Iterator<TooltipDrawable> it = this.labels.iterator();
        while (it.hasNext()) {
            detachLabelFromContentView(it.next());
        }
        getViewTreeObserver().removeOnScrollChangedListener(this.onScrollChangedListener);
        getViewTreeObserver().removeOnGlobalLayoutListener(this.onGlobalLayoutListener);
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(@NonNull Canvas canvas) {
        if (this.dirtyConfig) {
            validateConfigurationIfDirty();
            updateTicksCoordinates();
        }
        super.onDraw(canvas);
        int iCalculateTrackCenter = calculateTrackCenter();
        drawInactiveTracks(canvas, this.trackWidth, iCalculateTrackCenter);
        drawActiveTracks(canvas, this.trackWidth, iCalculateTrackCenter);
        if (isRtl() || isVertical()) {
            drawTrackIcons(canvas, this.activeTrackRect, this.inactiveTrackLeftRect);
        } else {
            drawTrackIcons(canvas, this.activeTrackRect, this.inactiveTrackRightRect);
        }
        maybeDrawTicks(canvas);
        maybeDrawStopIndicator(canvas, iCalculateTrackCenter);
        if ((this.thumbIsPressed || isFocused()) && isEnabled()) {
            maybeDrawCompatHalo(canvas, this.trackWidth, iCalculateTrackCenter);
        }
        updateLabels();
        drawThumbs(canvas, this.trackWidth, iCalculateTrackCenter);
    }

    @Override // android.view.View
    public void onFocusChanged(boolean z, int i2, @Nullable Rect rect) {
        super.onFocusChanged(z, i2, rect);
        if (!z) {
            resetThumbWidth();
            this.activeThumbIdx = -1;
            this.accessibilityHelper.clearKeyboardFocusForVirtualView(this.focusedThumbIdx);
        } else {
            if (this.activeThumbIdx == -1) {
                focusThumbOnFocusGained(i2);
                this.activeThumbIdx = this.focusedThumbIdx;
            }
            resetThumbWidth();
            updateThumbWidthWhenPressed();
            this.accessibilityHelper.requestKeyboardFocusForVirtualView(this.focusedThumbIdx);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setVisibleToUser(false);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i2, @NonNull KeyEvent keyEvent) {
        if (!isEnabled()) {
            return super.onKeyDown(i2, keyEvent);
        }
        this.activeThumbIdx = this.focusedThumbIdx;
        this.isLongPress |= keyEvent.isLongPress();
        Float fCalculateIncrementForKey = calculateIncrementForKey(i2);
        if (fCalculateIncrementForKey != null) {
            if (snapActiveThumbToValue(fCalculateIncrementForKey.floatValue() + this.values.get(this.activeThumbIdx).floatValue())) {
                updateHaloHotspot();
                postInvalidate();
            }
            return true;
        }
        if (i2 != 61) {
            return super.onKeyDown(i2, keyEvent);
        }
        resetThumbWidth();
        if (keyEvent.hasNoModifiers()) {
            return moveFocus(1);
        }
        if (keyEvent.isShiftPressed()) {
            return moveFocus(-1);
        }
        return false;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i2, @NonNull KeyEvent keyEvent) {
        this.isLongPress = false;
        return super.onKeyUp(i2, keyEvent);
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        Rect rect = this.viewRect;
        rect.left = 0;
        rect.top = 0;
        rect.right = i4 - i2;
        rect.bottom = i5 - i3;
        if (!this.exclusionRects.contains(rect)) {
            this.exclusionRects.add(this.viewRect);
        }
        ViewCompat.setSystemGestureExclusionRects(this, this.exclusionRects);
    }

    @Override // android.view.View
    public void onMeasure(int i2, int i3) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.widgetThickness + ((this.labelBehavior == 1 || shouldAlwaysShowLabel()) ? this.labels.get(0).getIntrinsicHeight() : 0), BasicMeasure.EXACTLY);
        if (isVertical()) {
            super.onMeasure(iMakeMeasureSpec, i3);
        } else {
            super.onMeasure(i2, iMakeMeasureSpec);
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        SliderState sliderState = (SliderState) parcelable;
        super.onRestoreInstanceState(sliderState.getSuperState());
        this.valueFrom = sliderState.valueFrom;
        this.valueTo = sliderState.valueTo;
        setValuesInternal(sliderState.values);
        this.stepSize = sliderState.stepSize;
        if (sliderState.hasFocus) {
            requestFocus();
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SliderState sliderState = new SliderState(super.onSaveInstanceState());
        sliderState.valueFrom = this.valueFrom;
        sliderState.valueTo = this.valueTo;
        sliderState.values = new ArrayList<>(this.values);
        sliderState.stepSize = this.stepSize;
        sliderState.hasFocus = hasFocus();
        return sliderState;
    }

    @Override // android.view.View
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        if (isVertical()) {
            i2 = i3;
        }
        updateTrackWidth(i2);
        updateHaloHotspot();
    }

    @Override // android.view.View
    public boolean onTouchEvent(@NonNull MotionEvent motionEvent) {
        if (!isEnabled()) {
            return false;
        }
        float y2 = isVertical() ? motionEvent.getY() : motionEvent.getX();
        float x = isVertical() ? motionEvent.getX() : motionEvent.getY();
        float f2 = (y2 - this.trackSidePadding) / this.trackWidth;
        this.touchPosition = f2;
        float fMax = Math.max(0.0f, f2);
        this.touchPosition = fMax;
        this.touchPosition = Math.min(1.0f, fMax);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.touchDownAxis1 = y2;
            this.touchDownAxis2 = x;
            this.previousDownTouchEventValues.clear();
            this.previousDownTouchEventValues = getValues();
            if ((isVertical() || !isPotentialVerticalScroll(motionEvent)) && (!isVertical() || !isPotentialHorizontalScroll(motionEvent))) {
                getParent().requestDisallowInterceptTouchEvent(true);
                if (pickActiveThumb()) {
                    requestFocus();
                    this.thumbIsPressed = true;
                    updateThumbWidthWhenPressed();
                    onStartTrackingTouch();
                    snapTouchPosition();
                    updateHaloHotspot();
                    invalidate();
                }
            }
        } else if (actionMasked == 1) {
            this.thumbIsPressed = false;
            MotionEvent motionEvent2 = this.lastEvent;
            if (motionEvent2 != null && motionEvent2.getActionMasked() == 0 && Math.abs(this.lastEvent.getX() - motionEvent.getX()) <= this.scaledTouchSlop && Math.abs(this.lastEvent.getY() - motionEvent.getY()) <= this.scaledTouchSlop && pickActiveThumb()) {
                onStartTrackingTouch();
            }
            if (this.activeThumbIdx != -1) {
                snapTouchPosition();
                updateHaloHotspot();
                resetThumbWidth();
                this.activeThumbIdx = -1;
                onStopTrackingTouch();
            }
            invalidate();
        } else if (actionMasked != 2) {
            if (actionMasked == 3) {
                this.thumbIsPressed = false;
                snapThumbToPreviousDownTouchEventValue();
                updateHaloHotspot();
                resetThumbWidth();
                this.activeThumbIdx = -1;
                onStopTrackingTouch();
                invalidate();
            }
        } else if (this.thumbIsPressed) {
            snapTouchPosition();
            updateHaloHotspot();
            invalidate();
        } else {
            if (!isVertical() && isPotentialVerticalScroll(motionEvent) && Math.abs(y2 - this.touchDownAxis1) < this.scaledTouchSlop) {
                return false;
            }
            if (isVertical() && isPotentialHorizontalScroll(motionEvent) && Math.abs(x - this.touchDownAxis2) < this.scaledTouchSlop * TOUCH_SLOP_RATIO) {
                return false;
            }
            getParent().requestDisallowInterceptTouchEvent(true);
            if (pickActiveThumb()) {
                this.thumbIsPressed = true;
                updateThumbWidthWhenPressed();
                onStartTrackingTouch();
                snapTouchPosition();
                updateHaloHotspot();
                invalidate();
            }
        }
        setPressed(this.thumbIsPressed);
        this.lastEvent = MotionEvent.obtain(motionEvent);
        return true;
    }

    @Override // android.view.View
    public void onVisibilityAggregated(boolean z) {
        super.onVisibilityAggregated(z);
        this.thisAndAncestorsVisible = z;
    }

    @Override // android.view.View
    public void onVisibilityChanged(@NonNull View view, int i2) {
        ViewOverlay contentViewOverlay;
        super.onVisibilityChanged(view, i2);
        if (i2 == 0 || (contentViewOverlay = getContentViewOverlay()) == null) {
            return;
        }
        Iterator<TooltipDrawable> it = this.labels.iterator();
        while (it.hasNext()) {
            contentViewOverlay.remove(it.next());
        }
    }

    public boolean pickActiveThumb() {
        if (this.activeThumbIdx != -1) {
            return true;
        }
        float valueOfTouchPositionAbsolute = getValueOfTouchPositionAbsolute();
        float fValueToX = valueToX(valueOfTouchPositionAbsolute);
        this.activeThumbIdx = 0;
        float fAbs = Math.abs(this.values.get(0).floatValue() - valueOfTouchPositionAbsolute);
        for (int i2 = 1; i2 < this.values.size(); i2++) {
            float fAbs2 = Math.abs(this.values.get(i2).floatValue() - valueOfTouchPositionAbsolute);
            float fValueToX2 = valueToX(this.values.get(i2).floatValue());
            if (Float.compare(fAbs2, fAbs) > 0) {
                break;
            }
            boolean z = isRtl() || isVertical() ? fValueToX2 - fValueToX > 0.0f : fValueToX2 - fValueToX < 0.0f;
            if (Float.compare(fAbs2, fAbs) < 0) {
                this.activeThumbIdx = i2;
            } else {
                if (Float.compare(fAbs2, fAbs) != 0) {
                    continue;
                } else {
                    if (Math.abs(fValueToX2 - fValueToX) < this.scaledTouchSlop) {
                        this.activeThumbIdx = -1;
                        return false;
                    }
                    if (z) {
                        this.activeThumbIdx = i2;
                    }
                }
            }
            fAbs = fAbs2;
        }
        return this.activeThumbIdx != -1;
    }

    public void removeOnChangeListener(@NonNull L l2) {
        this.changeListeners.remove(l2);
    }

    public void removeOnSliderTouchListener(@NonNull T t) {
        this.touchListeners.remove(t);
    }

    public void scheduleTooltipTimeout() {
        removeCallbacks(this.resetActiveThumbIndex);
        postDelayed(this.resetActiveThumbIndex, this.tooltipTimeoutMillis);
    }

    public void setActiveThumbIndex(int i2) {
        this.activeThumbIdx = i2;
    }

    public void setCentered(boolean z) {
        if (this.centered == z) {
            return;
        }
        this.centered = z;
        if (z) {
            setValues(Float.valueOf((this.valueFrom + this.valueTo) / 2.0f));
        } else {
            setValues(Float.valueOf(this.valueFrom));
        }
        updateWidgetLayout(true);
    }

    public void setContinuousModeTickCount(int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException(AbstractC0271e0.m397e(i2, "The continuousModeTickCount(", ") must be greater than or equal to 0"));
        }
        if (this.continuousModeTickCount != i2) {
            this.continuousModeTickCount = i2;
            this.dirtyConfig = true;
            postInvalidate();
        }
    }

    public void setCustomThumbDrawable(@DrawableRes int i2) {
        setCustomThumbDrawable(getResources().getDrawable(i2));
    }

    public void setCustomThumbDrawablesForValues(@NonNull @DrawableRes int... iArr) {
        Drawable[] drawableArr = new Drawable[iArr.length];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            drawableArr[i2] = getResources().getDrawable(iArr[i2]);
        }
        setCustomThumbDrawablesForValues(drawableArr);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        setLayerType(z ? 0 : 2, null);
    }

    public void setFocusedThumbIndex(int i2) {
        if (i2 < 0 || i2 >= this.values.size()) {
            throw new IllegalArgumentException("index out of range");
        }
        this.focusedThumbIdx = i2;
        this.accessibilityHelper.requestKeyboardFocusForVirtualView(i2);
        postInvalidate();
    }

    public void setHaloRadius(@IntRange(from = FabTransformationScrimBehavior.COLLAPSE_DELAY) @Px int i2) {
        if (i2 == this.haloRadius) {
            return;
        }
        this.haloRadius = i2;
        RippleDrawable backgroundRipple = getBackgroundRipple();
        if (shouldDrawCompatHalo() || backgroundRipple == null) {
            postInvalidate();
        } else {
            DrawableUtils.setRippleDrawableRadius(backgroundRipple, this.haloRadius);
        }
    }

    public void setHaloRadiusResource(@DimenRes int i2) {
        setHaloRadius(getResources().getDimensionPixelSize(i2));
    }

    public void setHaloTintList(@NonNull ColorStateList colorStateList) {
        if (colorStateList.equals(this.haloColor)) {
            return;
        }
        this.haloColor = colorStateList;
        RippleDrawable backgroundRipple = getBackgroundRipple();
        if (!shouldDrawCompatHalo() && backgroundRipple != null) {
            backgroundRipple.setColor(colorStateList);
            return;
        }
        this.haloPaint.setColor(getColorForState(colorStateList));
        this.haloPaint.setAlpha(63);
        invalidate();
    }

    public void setLabelBehavior(int i2) {
        if (this.labelBehavior != i2) {
            this.labelBehavior = i2;
            updateWidgetLayout(true);
        }
    }

    public void setLabelFormatter(@Nullable LabelFormatter labelFormatter) {
        this.formatter = labelFormatter;
    }

    public void setOrientation(int i2) {
        if (this.widgetOrientation == i2) {
            return;
        }
        this.widgetOrientation = i2;
        updateWidgetLayout(true);
    }

    public void setSeparationUnit(int i2) {
        this.separationUnit = i2;
        this.dirtyConfig = true;
        postInvalidate();
    }

    public void setStepSize(float f2) {
        if (f2 >= 0.0f) {
            if (this.stepSize != f2) {
                this.stepSize = f2;
                this.dirtyConfig = true;
                postInvalidate();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("The stepSize(" + f2 + ") must be 0, or a factor of the valueFrom(" + this.valueFrom + ")-valueTo(" + this.valueTo + ") range");
    }

    public void setThumbElevation(float f2) {
        if (f2 == this.thumbElevation) {
            return;
        }
        this.thumbElevation = f2;
        for (int i2 = 0; i2 < this.defaultThumbDrawables.size(); i2++) {
            this.defaultThumbDrawables.get(i2).setElevation(this.thumbElevation);
        }
    }

    public void setThumbElevationResource(@DimenRes int i2) {
        setThumbElevation(getResources().getDimension(i2));
    }

    public void setThumbHeight(@IntRange(from = FabTransformationScrimBehavior.COLLAPSE_DELAY) @Px int i2) {
        if (i2 == this.thumbHeight) {
            return;
        }
        this.thumbHeight = i2;
        for (int i3 = 0; i3 < this.defaultThumbDrawables.size(); i3++) {
            this.defaultThumbDrawables.get(i3).setBounds(0, 0, this.thumbWidth, this.thumbHeight);
        }
        Drawable drawable = this.customThumbDrawable;
        if (drawable != null) {
            adjustCustomThumbDrawableBounds(drawable);
        }
        Iterator<Drawable> it = this.customThumbDrawablesForValues.iterator();
        while (it.hasNext()) {
            adjustCustomThumbDrawableBounds(it.next());
        }
        updateWidgetLayout(false);
    }

    public void setThumbHeightResource(@DimenRes int i2) {
        setThumbHeight(getResources().getDimensionPixelSize(i2));
    }

    public void setThumbRadius(@IntRange(from = FabTransformationScrimBehavior.COLLAPSE_DELAY) @Px int i2) {
        int i3 = i2 * 2;
        setThumbWidth(i3);
        setThumbHeight(i3);
    }

    public void setThumbRadiusResource(@DimenRes int i2) {
        setThumbRadius(getResources().getDimensionPixelSize(i2));
    }

    public void setThumbStrokeColor(@Nullable ColorStateList colorStateList) {
        if (colorStateList == this.thumbStrokeColor) {
            return;
        }
        this.thumbStrokeColor = colorStateList;
        for (int i2 = 0; i2 < this.defaultThumbDrawables.size(); i2++) {
            this.defaultThumbDrawables.get(i2).setStrokeColor(colorStateList);
        }
        postInvalidate();
    }

    public void setThumbStrokeColorResource(@ColorRes int i2) {
        if (i2 != 0) {
            setThumbStrokeColor(AppCompatResources.getColorStateList(getContext(), i2));
        }
    }

    public void setThumbStrokeWidth(float f2) {
        if (f2 == this.thumbStrokeWidth) {
            return;
        }
        this.thumbStrokeWidth = f2;
        for (int i2 = 0; i2 < this.defaultThumbDrawables.size(); i2++) {
            this.defaultThumbDrawables.get(i2).setStrokeWidth(f2);
        }
        postInvalidate();
    }

    public void setThumbStrokeWidthResource(@DimenRes int i2) {
        if (i2 != 0) {
            setThumbStrokeWidth(getResources().getDimension(i2));
        }
    }

    public void setThumbTintList(@NonNull ColorStateList colorStateList) {
        if (colorStateList.equals(this.thumbTintList)) {
            return;
        }
        this.thumbTintList = colorStateList;
        for (int i2 = 0; i2 < this.defaultThumbDrawables.size(); i2++) {
            this.defaultThumbDrawables.get(i2).setFillColor(this.thumbTintList);
        }
        invalidate();
    }

    public void setThumbTrackGapSize(@Px int i2) {
        if (this.thumbTrackGapSize == i2) {
            return;
        }
        this.thumbTrackGapSize = i2;
        invalidate();
    }

    public void setThumbWidth(@IntRange(from = FabTransformationScrimBehavior.COLLAPSE_DELAY) @Px int i2) {
        if (i2 == this.thumbWidth) {
            return;
        }
        this.thumbWidth = i2;
        Drawable drawable = this.customThumbDrawable;
        if (drawable != null) {
            adjustCustomThumbDrawableBounds(i2, drawable);
        }
        for (int i3 = 0; i3 < this.customThumbDrawablesForValues.size(); i3++) {
            adjustCustomThumbDrawableBounds(i2, this.customThumbDrawablesForValues.get(i3));
        }
        setThumbSize(i2, -1, null);
    }

    public void setThumbWidthResource(@DimenRes int i2) {
        setThumbWidth(getResources().getDimensionPixelSize(i2));
    }

    public void setTickActiveRadius(@IntRange(from = FabTransformationScrimBehavior.COLLAPSE_DELAY) @Px int i2) {
        if (this.tickActiveRadius != i2) {
            this.tickActiveRadius = i2;
            this.activeTicksPaint.setStrokeWidth(i2 * 2);
            updateWidgetLayout(false);
        }
    }

    public void setTickActiveTintList(@NonNull ColorStateList colorStateList) {
        if (colorStateList.equals(this.tickColorActive)) {
            return;
        }
        this.tickColorActive = colorStateList;
        this.activeTicksPaint.setColor(getColorForState(colorStateList));
        invalidate();
    }

    public void setTickInactiveRadius(@IntRange(from = FabTransformationScrimBehavior.COLLAPSE_DELAY) @Px int i2) {
        if (this.tickInactiveRadius != i2) {
            this.tickInactiveRadius = i2;
            this.inactiveTicksPaint.setStrokeWidth(i2 * 2);
            updateWidgetLayout(false);
        }
    }

    public void setTickInactiveTintList(@NonNull ColorStateList colorStateList) {
        if (colorStateList.equals(this.tickColorInactive)) {
            return;
        }
        this.tickColorInactive = colorStateList;
        this.inactiveTicksPaint.setColor(getColorForState(colorStateList));
        invalidate();
    }

    public void setTickTintList(@NonNull ColorStateList colorStateList) {
        setTickInactiveTintList(colorStateList);
        setTickActiveTintList(colorStateList);
    }

    public void setTickVisibilityMode(int i2) {
        if (this.tickVisibilityMode != i2) {
            this.tickVisibilityMode = i2;
            postInvalidate();
        }
    }

    @Deprecated
    public void setTickVisible(boolean z) {
        setTickVisibilityMode(convertToTickVisibilityMode(z));
    }

    public void setTrackActiveTintList(@NonNull ColorStateList colorStateList) {
        if (colorStateList.equals(this.trackColorActive)) {
            return;
        }
        this.trackColorActive = colorStateList;
        this.activeTrackPaint.setColor(getColorForState(colorStateList));
        invalidate();
    }

    public void setTrackCornerSize(@Px int i2) {
        if (this.trackCornerSize == i2) {
            return;
        }
        this.trackCornerSize = i2;
        invalidate();
    }

    public void setTrackHeight(@IntRange(from = FabTransformationScrimBehavior.COLLAPSE_DELAY) @Px int i2) {
        if (this.trackThickness != i2) {
            this.trackThickness = i2;
            invalidateTrack();
            updateWidgetLayout(false);
        }
    }

    public void setTrackIconActiveColor(@Nullable ColorStateList colorStateList) {
        if (colorStateList == this.trackIconActiveColor) {
            return;
        }
        this.trackIconActiveColor = colorStateList;
        updateTrackIconActiveStart();
        updateTrackIconActiveEnd();
        invalidate();
    }

    public void setTrackIconActiveEnd(@Nullable Drawable drawable) {
        if (drawable == this.trackIconActiveEnd) {
            return;
        }
        this.trackIconActiveEnd = drawable;
        this.trackIconActiveEndMutated = false;
        updateTrackIconActiveEnd();
        invalidate();
    }

    public void setTrackIconActiveStart(@Nullable Drawable drawable) {
        if (drawable == this.trackIconActiveStart) {
            return;
        }
        this.trackIconActiveStart = drawable;
        this.trackIconActiveStartMutated = false;
        updateTrackIconActiveStart();
        invalidate();
    }

    public void setTrackIconInactiveColor(@Nullable ColorStateList colorStateList) {
        if (colorStateList == this.trackIconInactiveColor) {
            return;
        }
        this.trackIconInactiveColor = colorStateList;
        updateTrackIconInactiveStart();
        updateTrackIconInactiveEnd();
        invalidate();
    }

    public void setTrackIconInactiveEnd(@Nullable Drawable drawable) {
        if (drawable == this.trackIconInactiveEnd) {
            return;
        }
        this.trackIconInactiveEnd = drawable;
        this.trackIconInactiveEndMutated = false;
        updateTrackIconInactiveEnd();
        invalidate();
    }

    public void setTrackIconInactiveStart(@Nullable Drawable drawable) {
        if (drawable == this.trackIconInactiveStart) {
            return;
        }
        this.trackIconInactiveStart = drawable;
        this.trackIconInactiveStartMutated = false;
        updateTrackIconInactiveStart();
        invalidate();
    }

    public void setTrackIconSize(@Px int i2) {
        if (this.trackIconSize == i2) {
            return;
        }
        this.trackIconSize = i2;
        invalidate();
    }

    public void setTrackInactiveTintList(@NonNull ColorStateList colorStateList) {
        if (colorStateList.equals(this.trackColorInactive)) {
            return;
        }
        this.trackColorInactive = colorStateList;
        this.inactiveTrackPaint.setColor(getColorForState(colorStateList));
        invalidate();
    }

    public void setTrackInsideCornerSize(@Px int i2) {
        if (this.trackInsideCornerSize == i2) {
            return;
        }
        this.trackInsideCornerSize = i2;
        invalidate();
    }

    public void setTrackStopIndicatorSize(@Px int i2) {
        if (this.trackStopIndicatorSize == i2) {
            return;
        }
        this.trackStopIndicatorSize = i2;
        this.stopIndicatorPaint.setStrokeWidth(i2);
        invalidate();
    }

    public void setTrackTintList(@NonNull ColorStateList colorStateList) {
        setTrackInactiveTintList(colorStateList);
        setTrackActiveTintList(colorStateList);
    }

    public void setValueFrom(float f2) {
        this.valueFrom = f2;
        this.dirtyConfig = true;
        postInvalidate();
    }

    public void setValueTo(float f2) {
        this.valueTo = f2;
        this.dirtyConfig = true;
        postInvalidate();
    }

    public void setValues(@NonNull Float... fArr) {
        ArrayList<Float> arrayList = new ArrayList<>();
        Collections.addAll(arrayList, fArr);
        setValuesInternal(arrayList);
    }

    public void updateBoundsForVirtualViewId(int i2, Rect rect) {
        int iNormalizeValue = this.trackSidePadding + ((int) (normalizeValue(getValues().get(i2).floatValue()) * this.trackWidth));
        int iCalculateTrackCenter = calculateTrackCenter();
        int iMax = Math.max(this.minTouchTargetSize, this.accessibilityMinTouchTargetSize) / 2;
        int iMax2 = Math.max(this.thumbWidth / 2, iMax);
        int iMax3 = Math.max(this.thumbHeight / 2, iMax);
        RectF rectF = new RectF(iNormalizeValue - iMax2, iCalculateTrackCenter - iMax3, iNormalizeValue + iMax2, iCalculateTrackCenter + iMax3);
        if (isVertical()) {
            this.rotationMatrix.mapRect(rectF);
        }
        rect.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
    }

    public BaseSlider(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, C5183R.attr.sliderStyle);
    }

    private void adjustCustomThumbDrawableBounds(@IntRange(from = FabTransformationScrimBehavior.COLLAPSE_DELAY) @Px int i2, Drawable drawable) {
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth == -1 && intrinsicHeight == -1) {
            drawable.setBounds(0, 0, i2, this.thumbHeight);
        } else {
            float fMax = Math.max(i2, this.thumbHeight) / Math.max(intrinsicWidth, intrinsicHeight);
            drawable.setBounds(0, 0, (int) (intrinsicWidth * fMax), (int) (intrinsicHeight * fMax));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float calculateStepIncrement(int i2) {
        float fCalculateStepIncrement = calculateStepIncrement();
        float f2 = (this.valueTo - this.valueFrom) / fCalculateStepIncrement;
        float f3 = i2;
        return f2 <= f3 ? fCalculateStepIncrement : Math.round(f2 / f3) * fCalculateStepIncrement;
    }

    public void setCustomThumbDrawable(@NonNull Drawable drawable) {
        this.customThumbDrawable = initializeCustomThumbDrawable(drawable);
        this.customThumbDrawablesForValues.clear();
        postInvalidate();
    }

    public BaseSlider(@NonNull Context context, @Nullable AttributeSet attributeSet, int i2) {
        super(MaterialThemeOverlay.wrap(context, attributeSet, i2, DEF_STYLE_RES), attributeSet, i2);
        this.labels = new ArrayList();
        this.changeListeners = new ArrayList();
        this.touchListeners = new ArrayList();
        this.labelsAreAnimatedIn = false;
        this.defaultThumbWidth = -1;
        this.defaultThumbTrackGapSize = -1;
        this.defaultThumbHeight = -1;
        this.centered = false;
        this.trackIconActiveStartMutated = false;
        this.trackIconActiveEndMutated = false;
        this.trackIconInactiveStartMutated = false;
        this.trackIconInactiveEndMutated = false;
        this.viewRect = new Rect();
        this.exclusionRects = new ArrayList();
        this.previousDownTouchEventValues = new ArrayList();
        this.thumbIsPressed = false;
        this.values = new ArrayList<>();
        this.activeThumbIdx = -1;
        this.focusedThumbIdx = -1;
        this.stepSize = 0.0f;
        this.continuousModeTickCount = 0;
        this.isLongPress = false;
        this.trackPath = new Path();
        this.activeTrackRect = new RectF();
        this.inactiveTrackLeftRect = new RectF();
        this.inactiveTrackRightRect = new RectF();
        this.cornerRect = new RectF();
        this.labelRect = new Rect();
        this.iconRectF = new RectF();
        this.iconRect = new Rect();
        this.rotationMatrix = new Matrix();
        this.defaultThumbDrawables = new ArrayList();
        this.customThumbDrawablesForValues = Collections.EMPTY_LIST;
        this.separationUnit = 0;
        this.onScrollChangedListener = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.google.android.material.slider.b
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                this.f23496s.updateLabels();
            }
        };
        this.onGlobalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.google.android.material.slider.c
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                this.f23497s.updateLabels();
            }
        };
        this.resetActiveThumbIndex = new Runnable() { // from class: com.google.android.material.slider.d
            @Override // java.lang.Runnable
            public final void run() {
                this.f23498s.lambda$new$0();
            }
        };
        Context context2 = getContext();
        this.thisAndAncestorsVisible = isShown();
        this.inactiveTrackPaint = new Paint();
        this.activeTrackPaint = new Paint();
        Paint paint = new Paint(1);
        this.thumbPaint = paint;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        Paint paint2 = new Paint(1);
        this.haloPaint = paint2;
        paint2.setStyle(style);
        Paint paint3 = new Paint();
        this.inactiveTicksPaint = paint3;
        Paint.Style style2 = Paint.Style.STROKE;
        paint3.setStyle(style2);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint3.setStrokeCap(cap);
        Paint paint4 = new Paint();
        this.activeTicksPaint = paint4;
        paint4.setStyle(style2);
        paint4.setStrokeCap(cap);
        Paint paint5 = new Paint();
        this.stopIndicatorPaint = paint5;
        paint5.setStyle(style);
        paint5.setStrokeCap(cap);
        this.thumbHeightDecreaseFocusRing = context2.getResources().getDimensionPixelSize(C5183R.dimen.m3_slider_focus_ring_thumb_height_decrease);
        loadResources(context2.getResources());
        processAttributes(context2, attributeSet, i2);
        setFocusable(true);
        setClickable(true);
        this.scaledTouchSlop = ViewConfiguration.get(context2).getScaledTouchSlop();
        AccessibilityHelper accessibilityHelper = new AccessibilityHelper(this);
        this.accessibilityHelper = accessibilityHelper;
        ViewCompat.setAccessibilityDelegate(this, accessibilityHelper);
        AccessibilityManager accessibilityManager = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.accessibilityManager = accessibilityManager;
        if (Build.VERSION.SDK_INT >= 29) {
            this.tooltipTimeoutMillis = accessibilityManager.getRecommendedTimeoutMillis(10000, 6);
        } else {
            this.tooltipTimeoutMillis = MAX_TIMEOUT_TOOLTIP_WITH_ACCESSIBILITY;
        }
    }

    public void setValues(@NonNull List<Float> list) {
        setValuesInternal(new ArrayList<>(list));
    }

    public void setCustomThumbDrawablesForValues(@NonNull Drawable... drawableArr) {
        this.customThumbDrawable = null;
        this.customThumbDrawablesForValues = new ArrayList();
        for (Drawable drawable : drawableArr) {
            this.customThumbDrawablesForValues.add(initializeCustomThumbDrawable(drawable));
        }
        postInvalidate();
    }

    public void setTrackIconActiveEnd(@DrawableRes int i2) {
        setTrackIconActiveEnd(i2 != 0 ? AppCompatResources.getDrawable(getContext(), i2) : null);
    }

    public void setTrackIconActiveStart(@DrawableRes int i2) {
        setTrackIconActiveStart(i2 != 0 ? AppCompatResources.getDrawable(getContext(), i2) : null);
    }

    public void setTrackIconInactiveEnd(@DrawableRes int i2) {
        setTrackIconInactiveEnd(i2 != 0 ? AppCompatResources.getDrawable(getContext(), i2) : null);
    }

    public void setTrackIconInactiveStart(@DrawableRes int i2) {
        setTrackIconInactiveStart(i2 != 0 ? AppCompatResources.getDrawable(getContext(), i2) : null);
    }

    private void updateTicksCoordinates(int i2) {
        if (i2 == 0) {
            this.ticksCoordinates = null;
            return;
        }
        float[] fArr = this.ticksCoordinates;
        if (fArr == null || fArr.length != i2 * 2) {
            this.ticksCoordinates = new float[i2 * 2];
        }
        float f2 = this.trackWidth / (i2 - 1);
        float fCalculateTrackCenter = calculateTrackCenter();
        for (int i3 = 0; i3 < i2 * 2; i3 += 2) {
            float[] fArr2 = this.ticksCoordinates;
            fArr2[i3] = ((i3 / 2.0f) * f2) + this.trackSidePadding;
            fArr2[i3 + 1] = fCalculateTrackCenter;
        }
        if (isVertical()) {
            this.rotationMatrix.mapPoints(this.ticksCoordinates);
        }
    }
}
