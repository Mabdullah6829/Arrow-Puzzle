package com.google.android.material.timepicker;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Outline;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.C5183R;
import com.google.android.material.resources.MaterialResources;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
class ClockFaceView extends RadialViewGroup implements ClockHandView.OnRotateListener {
    private static final float EPSILON = 0.001f;
    private static final int INITIAL_CAPACITY = 12;
    private static final String VALUE_PLACEHOLDER = "";
    private final int clockHandPadding;
    private final ClockHandView clockHandView;
    private final int clockSize;
    private float currentHandRotation;
    private final int[] gradientColors;
    private final float[] gradientPositions;
    private final int minimumHeight;
    private final int minimumWidth;
    private OnEnterKeyPressedListener onEnterKeyPressedListener;
    private final RectF scratch;
    private final Rect scratchLineBounds;
    private final ColorStateList textColor;
    private final SparseArray<TextView> textViewPool;
    private final Rect textViewRect;
    private final AccessibilityDelegateCompat valueAccessibilityDelegate;
    private String[] values;

    public interface OnEnterKeyPressedListener {
        void onEnterKeyPressed();
    }

    public ClockFaceView(@NonNull Context context) {
        this(context, null);
    }

    private void findIntersectingTextView() {
        RectF currentSelectorBox = this.clockHandView.getCurrentSelectorBox();
        TextView selectedTextView = getSelectedTextView(currentSelectorBox);
        for (int i2 = 0; i2 < this.textViewPool.size(); i2++) {
            TextView textView = this.textViewPool.get(i2);
            if (textView != null) {
                textView.setSelected(textView == selectedTextView);
                textView.getPaint().setShader(getGradientForTextView(currentSelectorBox, textView));
                textView.invalidate();
            }
        }
    }

    @Nullable
    private RadialGradient getGradientForTextView(RectF rectF, TextView textView) {
        textView.getHitRect(this.textViewRect);
        this.scratch.set(this.textViewRect);
        textView.getLineBounds(0, this.scratchLineBounds);
        RectF rectF2 = this.scratch;
        Rect rect = this.scratchLineBounds;
        rectF2.inset(rect.left, rect.top);
        if (RectF.intersects(rectF, this.scratch)) {
            return new RadialGradient(rectF.centerX() - this.scratch.left, rectF.centerY() - this.scratch.top, rectF.width() * 0.5f, this.gradientColors, this.gradientPositions, Shader.TileMode.CLAMP);
        }
        return null;
    }

    private int getSelectedIndex() {
        for (int i2 = 0; i2 < this.textViewPool.size(); i2++) {
            TextView textViewValueAt = this.textViewPool.valueAt(i2);
            if (textViewValueAt.isSelected()) {
                return ((Integer) textViewValueAt.getTag(C5183R.id.material_value_index)).intValue();
            }
        }
        return -1;
    }

    @Nullable
    private TextView getSelectedTextView(RectF rectF) {
        float f2 = Float.MAX_VALUE;
        TextView textView = null;
        for (int i2 = 0; i2 < this.textViewPool.size(); i2++) {
            TextView textView2 = this.textViewPool.get(i2);
            if (textView2 != null) {
                textView2.getHitRect(this.textViewRect);
                this.scratch.set(this.textViewRect);
                this.scratch.union(rectF);
                float fHeight = this.scratch.height() * this.scratch.width();
                if (fHeight < f2) {
                    textView = textView2;
                    f2 = fHeight;
                }
            }
        }
        return textView;
    }

    private static float max3(float f2, float f3, float f4) {
        return Math.max(Math.max(f2, f3), f4);
    }

    private void updateTextViews(@StringRes int i2) {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        int size = this.textViewPool.size();
        boolean z = false;
        for (int i3 = 0; i3 < Math.max(this.values.length, size); i3++) {
            TextView textView = this.textViewPool.get(i3);
            if (i3 >= this.values.length) {
                removeView(textView);
                this.textViewPool.remove(i3);
            } else {
                if (textView == null) {
                    textView = (TextView) layoutInflaterFrom.inflate(C5183R.layout.material_clockface_textview, (ViewGroup) this, false);
                    this.textViewPool.put(i3, textView);
                    addView(textView);
                }
                textView.setText(this.values[i3]);
                textView.setTag(C5183R.id.material_value_index, Integer.valueOf(i3));
                int i4 = (i3 / 12) + 1;
                textView.setTag(C5183R.id.material_clock_level, Integer.valueOf(i4));
                if (i4 > 1) {
                    z = true;
                }
                ViewCompat.setAccessibilityDelegate(textView, this.valueAccessibilityDelegate);
                textView.setTextColor(this.textColor);
                if (i2 != 0) {
                    textView.setContentDescription(getResources().getString(i2, this.values[i3]));
                }
            }
        }
        this.clockHandView.setMultiLevel(z);
    }

    public int getCurrentLevel() {
        return this.clockHandView.getCurrentLevel();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        AccessibilityNodeInfoCompat.wrap(accessibilityNodeInfo).setCollectionInfo(AccessibilityNodeInfoCompat.CollectionInfoCompat.obtain(1, this.values.length, false, 1));
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        int length;
        int selectedIndex = getSelectedIndex();
        if (!isShown() || selectedIndex == -1) {
            return super.onKeyDown(i2, keyEvent);
        }
        if (i2 != 66) {
            switch (i2) {
                case 19:
                case 22:
                    length = (selectedIndex + 1) % this.values.length;
                    break;
                case 20:
                case 21:
                    String[] strArr = this.values;
                    length = ((selectedIndex - 1) + strArr.length) % strArr.length;
                    break;
                case 23:
                    break;
                default:
                    return super.onKeyDown(i2, keyEvent);
            }
            if (length == selectedIndex) {
                return super.onKeyDown(i2, keyEvent);
            }
            int i3 = (length / 12) + 1;
            if (i3 != getCurrentLevel()) {
                setCurrentLevel(i3);
            }
            setHandRotation((length % 12) * 30.0f);
            return true;
        }
        OnEnterKeyPressedListener onEnterKeyPressedListener = this.onEnterKeyPressedListener;
        if (onEnterKeyPressedListener != null) {
            onEnterKeyPressedListener.onEnterKeyPressed();
        }
        return true;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        findIntersectingTextView();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public void onMeasure(int i2, int i3) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int iMax3 = (int) (this.clockSize / max3(this.minimumHeight / displayMetrics.heightPixels, this.minimumWidth / displayMetrics.widthPixels, 1.0f));
        if (View.MeasureSpec.getMode(i2) != 0) {
            iMax3 = Math.min(iMax3, View.MeasureSpec.getSize(i2));
        }
        if (View.MeasureSpec.getMode(i3) != 0) {
            iMax3 = Math.min(iMax3, View.MeasureSpec.getSize(i3));
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax3, BasicMeasure.EXACTLY);
        int selectorRadius = ((iMax3 / 2) - this.clockHandView.getSelectorRadius()) - this.clockHandPadding;
        if (selectorRadius != getRadius()) {
            setRadius(selectorRadius);
        }
        super.onMeasure(iMakeMeasureSpec, iMakeMeasureSpec);
    }

    @Override // com.google.android.material.timepicker.ClockHandView.OnRotateListener
    public void onRotate(float f2, boolean z) {
        if (Math.abs(this.currentHandRotation - f2) > EPSILON) {
            this.currentHandRotation = f2;
            findIntersectingTextView();
        }
    }

    public void setCurrentLevel(int i2) {
        this.clockHandView.setCurrentLevel(i2);
    }

    public void setHandRotation(@FloatRange(from = 0.0d, m1892to = 360.0d) float f2) {
        this.clockHandView.setHandRotation(f2);
        findIntersectingTextView();
    }

    public void setOnEnterKeyPressedListener(OnEnterKeyPressedListener onEnterKeyPressedListener) {
        this.onEnterKeyPressedListener = onEnterKeyPressedListener;
    }

    @Override // com.google.android.material.timepicker.RadialViewGroup
    public void setRadius(int i2) {
        if (i2 != getRadius()) {
            super.setRadius(i2);
            this.clockHandView.setCircleRadius(getRadius());
        }
    }

    public void setValues(String[] strArr, @StringRes int i2) {
        this.values = strArr;
        updateTextViews(i2);
    }

    @Override // com.google.android.material.timepicker.RadialViewGroup
    public void updateLayoutParams() {
        super.updateLayoutParams();
        for (int i2 = 0; i2 < this.textViewPool.size(); i2++) {
            this.textViewPool.get(i2).setVisibility(0);
        }
    }

    public ClockFaceView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, C5183R.attr.materialClockStyle);
    }

    public ClockFaceView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.textViewRect = new Rect();
        this.scratch = new RectF();
        this.scratchLineBounds = new Rect();
        this.textViewPool = new SparseArray<>();
        this.gradientPositions = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C5183R.styleable.ClockFaceView, i2, C5183R.style.Widget_MaterialComponents_TimePicker_Clock);
        Resources resources = getResources();
        ColorStateList colorStateList = MaterialResources.getColorStateList(context, typedArrayObtainStyledAttributes, C5183R.styleable.ClockFaceView_clockNumberTextColor);
        this.textColor = colorStateList;
        LayoutInflater.from(context).inflate(C5183R.layout.material_clockface_view, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(C5183R.id.material_clock_hand);
        this.clockHandView = clockHandView;
        this.clockHandPadding = resources.getDimensionPixelSize(C5183R.dimen.material_clock_hand_padding);
        int colorForState = colorStateList.getColorForState(new int[]{R.attr.state_selected}, colorStateList.getDefaultColor());
        this.gradientColors = new int[]{colorForState, colorForState, colorStateList.getDefaultColor()};
        clockHandView.addOnRotateListener(this);
        int defaultColor = AppCompatResources.getColorStateList(context, C5183R.color.material_timepicker_clockface).getDefaultColor();
        ColorStateList colorStateList2 = MaterialResources.getColorStateList(context, typedArrayObtainStyledAttributes, C5183R.styleable.ClockFaceView_clockFaceBackgroundColor);
        setBackgroundColor(colorStateList2 != null ? colorStateList2.getDefaultColor() : defaultColor);
        typedArrayObtainStyledAttributes.recycle();
        setOutlineProvider(new ViewOutlineProvider() { // from class: com.google.android.material.timepicker.ClockFaceView.1
            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view, Outline outline) {
                outline.setOval(0, 0, view.getWidth(), view.getHeight());
            }
        });
        setFocusable(true);
        setClipToOutline(true);
        this.valueAccessibilityDelegate = new AccessibilityDelegateCompat() { // from class: com.google.android.material.timepicker.ClockFaceView.2
            @Override // androidx.core.view.AccessibilityDelegateCompat
            public void onInitializeAccessibilityNodeInfo(View view, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
                int iIntValue = ((Integer) view.getTag(C5183R.id.material_value_index)).intValue();
                if (iIntValue > 0) {
                    accessibilityNodeInfoCompat.setTraversalAfter((View) ClockFaceView.this.textViewPool.get(iIntValue - 1));
                }
                accessibilityNodeInfoCompat.setCollectionItemInfo(AccessibilityNodeInfoCompat.CollectionItemInfoCompat.obtain(0, 1, iIntValue, 1, false, view.isSelected()));
                accessibilityNodeInfoCompat.setClickable(true);
                accessibilityNodeInfoCompat.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_CLICK);
            }

            @Override // androidx.core.view.AccessibilityDelegateCompat
            public boolean performAccessibilityAction(View view, int i3, Bundle bundle) {
                if (i3 != 16) {
                    return super.performAccessibilityAction(view, i3, bundle);
                }
                long jUptimeMillis = SystemClock.uptimeMillis();
                view.getHitRect(ClockFaceView.this.textViewRect);
                float fCenterX = ClockFaceView.this.textViewRect.centerX();
                float fCenterY = ClockFaceView.this.textViewRect.centerY();
                ClockFaceView.this.clockHandView.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 0, fCenterX, fCenterY, 0));
                ClockFaceView.this.clockHandView.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 1, fCenterX, fCenterY, 0));
                return true;
            }
        };
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        setValues(strArr, 0);
        this.minimumHeight = resources.getDimensionPixelSize(C5183R.dimen.material_time_picker_minimum_screen_height);
        this.minimumWidth = resources.getDimensionPixelSize(C5183R.dimen.material_time_picker_minimum_screen_width);
        this.clockSize = resources.getDimensionPixelSize(C5183R.dimen.material_clock_size);
    }
}
