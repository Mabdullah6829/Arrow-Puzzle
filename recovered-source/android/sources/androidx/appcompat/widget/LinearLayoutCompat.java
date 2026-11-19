package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inspector.PropertyMapper;
import android.view.inspector.PropertyReader;
import android.widget.LinearLayout;
import androidx.activity.AbstractC0949f;
import androidx.appcompat.C0956R;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.core.view.GravityCompat;
import androidx.core.view.InputDeviceCompat;
import androidx.core.view.ViewCompat;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashSet;
import java.util.Set;
import java.util.function.IntFunction;

/* JADX INFO: loaded from: classes.dex */
public class LinearLayoutCompat extends ViewGroup {
    private static final String ACCESSIBILITY_CLASS_NAME = "androidx.appcompat.widget.LinearLayoutCompat";
    public static final int HORIZONTAL = 0;
    private static final int INDEX_BOTTOM = 2;
    private static final int INDEX_CENTER_VERTICAL = 0;
    private static final int INDEX_FILL = 3;
    private static final int INDEX_TOP = 1;
    public static final int SHOW_DIVIDER_BEGINNING = 1;
    public static final int SHOW_DIVIDER_END = 4;
    public static final int SHOW_DIVIDER_MIDDLE = 2;
    public static final int SHOW_DIVIDER_NONE = 0;
    public static final int VERTICAL = 1;
    private static final int VERTICAL_GRAVITY_COUNT = 4;
    private boolean mBaselineAligned;
    private int mBaselineAlignedChildIndex;
    private int mBaselineChildTop;
    private Drawable mDivider;
    private int mDividerHeight;
    private int mDividerPadding;
    private int mDividerWidth;
    private int mGravity;
    private int[] mMaxAscent;
    private int[] mMaxDescent;
    private int mOrientation;
    private int mShowDividers;
    private int mTotalLength;
    private boolean mUseLargestChild;
    private float mWeightSum;

    @Retention(RetentionPolicy.SOURCE)
    public @interface DividerMode {
    }

    public final class InspectionCompanion implements android.view.inspector.InspectionCompanion {
        private int mBaselineAlignedChildIndexId;
        private int mBaselineAlignedId;
        private int mDividerId;
        private int mDividerPaddingId;
        private int mGravityId;
        private int mMeasureWithLargestChildId;
        private int mOrientationId;
        private boolean mPropertiesMapped = false;
        private int mShowDividersId;
        private int mWeightSumId;

        public void mapProperties(PropertyMapper propertyMapper) {
            this.mBaselineAlignedId = propertyMapper.mapBoolean("baselineAligned", R.attr.baselineAligned);
            this.mBaselineAlignedChildIndexId = propertyMapper.mapInt("baselineAlignedChildIndex", R.attr.baselineAlignedChildIndex);
            this.mGravityId = propertyMapper.mapGravity("gravity", R.attr.gravity);
            this.mOrientationId = propertyMapper.mapIntEnum("orientation", R.attr.orientation, new IntFunction<String>() { // from class: androidx.appcompat.widget.LinearLayoutCompat.InspectionCompanion.1
                @Override // java.util.function.IntFunction
                public String apply(int i2) {
                    if (i2 != 0) {
                        return i2 != 1 ? String.valueOf(i2) : "vertical";
                    }
                    return "horizontal";
                }
            });
            this.mWeightSumId = propertyMapper.mapFloat("weightSum", R.attr.weightSum);
            this.mDividerId = propertyMapper.mapObject("divider", C0956R.attr.divider);
            this.mDividerPaddingId = propertyMapper.mapInt("dividerPadding", C0956R.attr.dividerPadding);
            this.mMeasureWithLargestChildId = propertyMapper.mapBoolean("measureWithLargestChild", C0956R.attr.measureWithLargestChild);
            this.mShowDividersId = propertyMapper.mapIntFlag("showDividers", C0956R.attr.showDividers, new IntFunction<Set<String>>() { // from class: androidx.appcompat.widget.LinearLayoutCompat.InspectionCompanion.2
                @Override // java.util.function.IntFunction
                public Set<String> apply(int i2) {
                    HashSet hashSet = new HashSet();
                    if (i2 == 0) {
                        hashSet.add("none");
                    }
                    if (i2 == 1) {
                        hashSet.add("beginning");
                    }
                    if (i2 == 2) {
                        hashSet.add("middle");
                    }
                    if (i2 == 4) {
                        hashSet.add("end");
                    }
                    return hashSet;
                }
            });
            this.mPropertiesMapped = true;
        }

        public void readProperties(LinearLayoutCompat linearLayoutCompat, PropertyReader propertyReader) {
            if (!this.mPropertiesMapped) {
                throw AbstractC0949f.m1871f();
            }
            propertyReader.readBoolean(this.mBaselineAlignedId, linearLayoutCompat.isBaselineAligned());
            propertyReader.readInt(this.mBaselineAlignedChildIndexId, linearLayoutCompat.getBaselineAlignedChildIndex());
            propertyReader.readGravity(this.mGravityId, linearLayoutCompat.getGravity());
            propertyReader.readIntEnum(this.mOrientationId, linearLayoutCompat.getOrientation());
            propertyReader.readFloat(this.mWeightSumId, linearLayoutCompat.getWeightSum());
            propertyReader.readObject(this.mDividerId, linearLayoutCompat.getDividerDrawable());
            propertyReader.readInt(this.mDividerPaddingId, linearLayoutCompat.getDividerPadding());
            propertyReader.readBoolean(this.mMeasureWithLargestChildId, linearLayoutCompat.isMeasureWithLargestChildEnabled());
            propertyReader.readIntFlag(this.mShowDividersId, linearLayoutCompat.getShowDividers());
        }
    }

    public static class LayoutParams extends LinearLayout.LayoutParams {
        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(int i2, int i3) {
            super(i2, i3);
        }

        public LayoutParams(int i2, int i3, float f2) {
            super(i2, i3, f2);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface OrientationMode {
    }

    public LinearLayoutCompat(Context context) {
        this(context, null);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0036  */
    private void forceUniformHeight(int i2, int i3) {
        int i4;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), BasicMeasure.EXACTLY);
        int i5 = 0;
        while (i5 < i2) {
            View virtualChildAt = getVirtualChildAt(i5);
            if (virtualChildAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) virtualChildAt.getLayoutParams();
                if (((LinearLayout.LayoutParams) layoutParams).height == -1) {
                    int i6 = ((LinearLayout.LayoutParams) layoutParams).width;
                    ((LinearLayout.LayoutParams) layoutParams).width = virtualChildAt.getMeasuredWidth();
                    i4 = i3;
                    measureChildWithMargins(virtualChildAt, i4, 0, iMakeMeasureSpec, 0);
                    ((LinearLayout.LayoutParams) layoutParams).width = i6;
                } else {
                    i4 = i3;
                }
            } else {
                i4 = i3;
            }
            i5++;
            i3 = i4;
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0036  */
    private void forceUniformWidth(int i2, int i3) {
        int i4;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), BasicMeasure.EXACTLY);
        int i5 = 0;
        while (i5 < i2) {
            View virtualChildAt = getVirtualChildAt(i5);
            if (virtualChildAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) virtualChildAt.getLayoutParams();
                if (((LinearLayout.LayoutParams) layoutParams).width == -1) {
                    int i6 = ((LinearLayout.LayoutParams) layoutParams).height;
                    ((LinearLayout.LayoutParams) layoutParams).height = virtualChildAt.getMeasuredHeight();
                    i4 = i3;
                    measureChildWithMargins(virtualChildAt, iMakeMeasureSpec, 0, i4, 0);
                    ((LinearLayout.LayoutParams) layoutParams).height = i6;
                } else {
                    i4 = i3;
                }
            } else {
                i4 = i3;
            }
            i5++;
            i3 = i4;
        }
    }

    private void setChildFrame(View view, int i2, int i3, int i4, int i5) {
        view.layout(i2, i3, i4 + i2, i5 + i3);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    public void drawDividersHorizontal(Canvas canvas) {
        int right;
        int left;
        int i2;
        int virtualChildCount = getVirtualChildCount();
        boolean zIsLayoutRtl = ViewUtils.isLayoutRtl(this);
        for (int i3 = 0; i3 < virtualChildCount; i3++) {
            View virtualChildAt = getVirtualChildAt(i3);
            if (virtualChildAt != null && virtualChildAt.getVisibility() != 8 && hasDividerBeforeChildAt(i3)) {
                LayoutParams layoutParams = (LayoutParams) virtualChildAt.getLayoutParams();
                drawVerticalDivider(canvas, zIsLayoutRtl ? virtualChildAt.getRight() + ((LinearLayout.LayoutParams) layoutParams).rightMargin : (virtualChildAt.getLeft() - ((LinearLayout.LayoutParams) layoutParams).leftMargin) - this.mDividerWidth);
            }
        }
        if (hasDividerBeforeChildAt(virtualChildCount)) {
            View virtualChildAt2 = getVirtualChildAt(virtualChildCount - 1);
            if (virtualChildAt2 != null) {
                LayoutParams layoutParams2 = (LayoutParams) virtualChildAt2.getLayoutParams();
                if (zIsLayoutRtl) {
                    left = virtualChildAt2.getLeft() - ((LinearLayout.LayoutParams) layoutParams2).leftMargin;
                    i2 = this.mDividerWidth;
                    right = left - i2;
                } else {
                    right = virtualChildAt2.getRight() + ((LinearLayout.LayoutParams) layoutParams2).rightMargin;
                }
            } else if (zIsLayoutRtl) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i2 = this.mDividerWidth;
                right = left - i2;
            }
            drawVerticalDivider(canvas, right);
        }
    }

    public void drawDividersVertical(Canvas canvas) {
        int virtualChildCount = getVirtualChildCount();
        for (int i2 = 0; i2 < virtualChildCount; i2++) {
            View virtualChildAt = getVirtualChildAt(i2);
            if (virtualChildAt != null && virtualChildAt.getVisibility() != 8 && hasDividerBeforeChildAt(i2)) {
                drawHorizontalDivider(canvas, (virtualChildAt.getTop() - ((LinearLayout.LayoutParams) ((LayoutParams) virtualChildAt.getLayoutParams())).topMargin) - this.mDividerHeight);
            }
        }
        if (hasDividerBeforeChildAt(virtualChildCount)) {
            View virtualChildAt2 = getVirtualChildAt(virtualChildCount - 1);
            drawHorizontalDivider(canvas, virtualChildAt2 == null ? (getHeight() - getPaddingBottom()) - this.mDividerHeight : virtualChildAt2.getBottom() + ((LinearLayout.LayoutParams) ((LayoutParams) virtualChildAt2.getLayoutParams())).bottomMargin);
        }
    }

    public void drawHorizontalDivider(Canvas canvas, int i2) {
        this.mDivider.setBounds(getPaddingLeft() + this.mDividerPadding, i2, (getWidth() - getPaddingRight()) - this.mDividerPadding, this.mDividerHeight + i2);
        this.mDivider.draw(canvas);
    }

    public void drawVerticalDivider(Canvas canvas, int i2) {
        this.mDivider.setBounds(i2, getPaddingTop() + this.mDividerPadding, this.mDividerWidth + i2, (getHeight() - getPaddingBottom()) - this.mDividerPadding);
        this.mDivider.draw(canvas);
    }

    @Override // android.view.View
    public int getBaseline() {
        int i2;
        if (this.mBaselineAlignedChildIndex < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i3 = this.mBaselineAlignedChildIndex;
        if (childCount <= i3) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i3);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.mBaselineAlignedChildIndex == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int bottom = this.mBaselineChildTop;
        if (this.mOrientation == 1 && (i2 = this.mGravity & 112) != 48) {
            if (i2 == 16) {
                bottom += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.mTotalLength) / 2;
            } else if (i2 == 80) {
                bottom = ((getBottom() - getTop()) - getPaddingBottom()) - this.mTotalLength;
            }
        }
        return bottom + ((LinearLayout.LayoutParams) ((LayoutParams) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.mBaselineAlignedChildIndex;
    }

    public int getChildrenSkipCount(View view, int i2) {
        return 0;
    }

    public Drawable getDividerDrawable() {
        return this.mDivider;
    }

    public int getDividerPadding() {
        return this.mDividerPadding;
    }

    public int getDividerWidth() {
        return this.mDividerWidth;
    }

    public int getGravity() {
        return this.mGravity;
    }

    public int getLocationOffset(View view) {
        return 0;
    }

    public int getNextLocationOffset(View view) {
        return 0;
    }

    public int getOrientation() {
        return this.mOrientation;
    }

    public int getShowDividers() {
        return this.mShowDividers;
    }

    public View getVirtualChildAt(int i2) {
        return getChildAt(i2);
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.mWeightSum;
    }

    public boolean hasDividerBeforeChildAt(int i2) {
        if (i2 == 0) {
            return (this.mShowDividers & 1) != 0;
        }
        if (i2 == getChildCount()) {
            return (this.mShowDividers & 4) != 0;
        }
        if ((this.mShowDividers & 2) != 0) {
            for (int i3 = i2 - 1; i3 >= 0; i3--) {
                if (getChildAt(i3).getVisibility() != 8) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isBaselineAligned() {
        return this.mBaselineAligned;
    }

    public boolean isMeasureWithLargestChildEnabled() {
        return this.mUseLargestChild;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:32:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:34:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:36:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:37:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:39:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:41:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:43:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:47:0x0101  */
    /* JADX WARN: Code duplicated, block: B:48:0x0106  */
    public void layoutHorizontal(int i2, int i3, int i4, int i5) {
        int paddingLeft;
        int i6;
        int i7;
        char c;
        char c2;
        int i8;
        int childrenSkipCount;
        int i9;
        int baseline;
        int i10;
        int i11;
        int i12;
        int measuredHeight;
        int i13;
        boolean zIsLayoutRtl = ViewUtils.isLayoutRtl(this);
        int paddingTop = getPaddingTop();
        int i14 = i5 - i3;
        int paddingBottom = i14 - getPaddingBottom();
        int paddingBottom2 = (i14 - paddingTop) - getPaddingBottom();
        int virtualChildCount = getVirtualChildCount();
        int i15 = this.mGravity;
        int i16 = i15 & 112;
        boolean z = this.mBaselineAligned;
        int[] iArr = this.mMaxAscent;
        int[] iArr2 = this.mMaxDescent;
        int absoluteGravity = GravityCompat.getAbsoluteGravity(8388615 & i15, getLayoutDirection());
        char c3 = 2;
        char c4 = 1;
        if (absoluteGravity != 1) {
            paddingLeft = absoluteGravity != 5 ? getPaddingLeft() : ((getPaddingLeft() + i4) - i2) - this.mTotalLength;
        } else {
            paddingLeft = getPaddingLeft() + (((i4 - i2) - this.mTotalLength) / 2);
        }
        if (zIsLayoutRtl) {
            i6 = virtualChildCount - 1;
            i7 = -1;
        } else {
            i6 = 0;
            i7 = 1;
        }
        int i17 = 0;
        while (i17 < virtualChildCount) {
            int i18 = (i7 * i17) + i6;
            int i19 = i17;
            View virtualChildAt = getVirtualChildAt(i18);
            if (virtualChildAt == null) {
                paddingLeft = measureNullChild(i18) + paddingLeft;
                childrenSkipCount = i19;
                i8 = paddingTop;
                c = c3;
                c2 = c4;
            } else {
                c = c3;
                c2 = c4;
                if (virtualChildAt.getVisibility() != 8) {
                    int measuredWidth = virtualChildAt.getMeasuredWidth();
                    int measuredHeight2 = virtualChildAt.getMeasuredHeight();
                    LayoutParams layoutParams = (LayoutParams) virtualChildAt.getLayoutParams();
                    int i20 = paddingLeft;
                    if (z) {
                        i9 = measuredHeight2;
                        baseline = ((LinearLayout.LayoutParams) layoutParams).height != -1 ? virtualChildAt.getBaseline() : -1;
                        i10 = ((LinearLayout.LayoutParams) layoutParams).gravity;
                        if (i10 < 0) {
                            i10 = i16;
                        }
                        i11 = i10 & 112;
                        i8 = paddingTop;
                        if (i11 != 16) {
                            if (i11 != 48) {
                                i12 = i8 + ((LinearLayout.LayoutParams) layoutParams).topMargin;
                                if (baseline != -1) {
                                    i12 = (iArr[c2] - baseline) + i12;
                                }
                            } else if (i11 != 80) {
                                i12 = i8;
                            } else {
                                i12 = (paddingBottom - i9) - ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                                if (baseline != -1) {
                                    measuredHeight = iArr2[c] - (virtualChildAt.getMeasuredHeight() - baseline);
                                }
                            }
                            if (hasDividerBeforeChildAt(i18)) {
                                i13 = i20 + this.mDividerWidth;
                            } else {
                                i13 = i20;
                            }
                            int i21 = ((LinearLayout.LayoutParams) layoutParams).leftMargin + i13;
                            setChildFrame(virtualChildAt, getLocationOffset(virtualChildAt) + i21, i12, measuredWidth, i9);
                            int nextLocationOffset = getNextLocationOffset(virtualChildAt) + ((LinearLayout.LayoutParams) layoutParams).rightMargin + measuredWidth + i21;
                            childrenSkipCount = getChildrenSkipCount(virtualChildAt, i18) + i19;
                            paddingLeft = nextLocationOffset;
                        } else {
                            i12 = ((paddingBottom2 - i9) / 2) + i8 + ((LinearLayout.LayoutParams) layoutParams).topMargin;
                            measuredHeight = ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                        }
                        i12 -= measuredHeight;
                        if (hasDividerBeforeChildAt(i18)) {
                            i13 = i20 + this.mDividerWidth;
                        } else {
                            i13 = i20;
                        }
                        int i22 = ((LinearLayout.LayoutParams) layoutParams).leftMargin + i13;
                        setChildFrame(virtualChildAt, getLocationOffset(virtualChildAt) + i22, i12, measuredWidth, i9);
                        int nextLocationOffset2 = getNextLocationOffset(virtualChildAt) + ((LinearLayout.LayoutParams) layoutParams).rightMargin + measuredWidth + i22;
                        childrenSkipCount = getChildrenSkipCount(virtualChildAt, i18) + i19;
                        paddingLeft = nextLocationOffset2;
                    } else {
                        i9 = measuredHeight2;
                    }
                    i10 = ((LinearLayout.LayoutParams) layoutParams).gravity;
                    if (i10 < 0) {
                        i10 = i16;
                    }
                    i11 = i10 & 112;
                    i8 = paddingTop;
                    if (i11 != 16) {
                        if (i11 != 48) {
                            i12 = i8 + ((LinearLayout.LayoutParams) layoutParams).topMargin;
                            if (baseline != -1) {
                                i12 = (iArr[c2] - baseline) + i12;
                            }
                        } else if (i11 != 80) {
                            i12 = i8;
                        } else {
                            i12 = (paddingBottom - i9) - ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                            if (baseline != -1) {
                                measuredHeight = iArr2[c] - (virtualChildAt.getMeasuredHeight() - baseline);
                            }
                        }
                        if (hasDividerBeforeChildAt(i18)) {
                            i13 = i20 + this.mDividerWidth;
                        } else {
                            i13 = i20;
                        }
                        int i23 = ((LinearLayout.LayoutParams) layoutParams).leftMargin + i13;
                        setChildFrame(virtualChildAt, getLocationOffset(virtualChildAt) + i23, i12, measuredWidth, i9);
                        int nextLocationOffset3 = getNextLocationOffset(virtualChildAt) + ((LinearLayout.LayoutParams) layoutParams).rightMargin + measuredWidth + i23;
                        childrenSkipCount = getChildrenSkipCount(virtualChildAt, i18) + i19;
                        paddingLeft = nextLocationOffset3;
                    } else {
                        i12 = ((paddingBottom2 - i9) / 2) + i8 + ((LinearLayout.LayoutParams) layoutParams).topMargin;
                        measuredHeight = ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                    }
                    i12 -= measuredHeight;
                    if (hasDividerBeforeChildAt(i18)) {
                        i13 = i20 + this.mDividerWidth;
                    } else {
                        i13 = i20;
                    }
                    int i24 = ((LinearLayout.LayoutParams) layoutParams).leftMargin + i13;
                    setChildFrame(virtualChildAt, getLocationOffset(virtualChildAt) + i24, i12, measuredWidth, i9);
                    int nextLocationOffset4 = getNextLocationOffset(virtualChildAt) + ((LinearLayout.LayoutParams) layoutParams).rightMargin + measuredWidth + i24;
                    childrenSkipCount = getChildrenSkipCount(virtualChildAt, i18) + i19;
                    paddingLeft = nextLocationOffset4;
                } else {
                    i8 = paddingTop;
                    childrenSkipCount = i19;
                }
            }
            i17 = childrenSkipCount + 1;
            c3 = c;
            c4 = c2;
            paddingTop = i8;
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x009a  */
    public void layoutVertical(int i2, int i3, int i4, int i5) {
        int paddingTop;
        int i6;
        int i7;
        int i8;
        int paddingLeft = getPaddingLeft();
        int i9 = i4 - i2;
        int paddingRight = i9 - getPaddingRight();
        int paddingRight2 = (i9 - paddingLeft) - getPaddingRight();
        int virtualChildCount = getVirtualChildCount();
        int i10 = this.mGravity;
        int i11 = i10 & 112;
        int i12 = i10 & GravityCompat.RELATIVE_HORIZONTAL_GRAVITY_MASK;
        if (i11 != 16) {
            paddingTop = i11 != 80 ? getPaddingTop() : ((getPaddingTop() + i5) - i3) - this.mTotalLength;
        } else {
            paddingTop = (((i5 - i3) - this.mTotalLength) / 2) + getPaddingTop();
        }
        int childrenSkipCount = 0;
        while (childrenSkipCount < virtualChildCount) {
            View virtualChildAt = getVirtualChildAt(childrenSkipCount);
            if (virtualChildAt == null) {
                paddingTop = measureNullChild(childrenSkipCount) + paddingTop;
            } else {
                if (virtualChildAt.getVisibility() != 8) {
                    int measuredWidth = virtualChildAt.getMeasuredWidth();
                    int measuredHeight = virtualChildAt.getMeasuredHeight();
                    LayoutParams layoutParams = (LayoutParams) virtualChildAt.getLayoutParams();
                    int i13 = ((LinearLayout.LayoutParams) layoutParams).gravity;
                    if (i13 < 0) {
                        i13 = i12;
                    }
                    int absoluteGravity = GravityCompat.getAbsoluteGravity(i13, getLayoutDirection()) & 7;
                    if (absoluteGravity != 1) {
                        if (absoluteGravity != 5) {
                            i8 = ((LinearLayout.LayoutParams) layoutParams).leftMargin + paddingLeft;
                        } else {
                            i6 = paddingRight - measuredWidth;
                            i7 = ((LinearLayout.LayoutParams) layoutParams).rightMargin;
                        }
                        int i14 = i8;
                        if (hasDividerBeforeChildAt(childrenSkipCount)) {
                            paddingTop += this.mDividerHeight;
                        }
                        int i15 = paddingTop + ((LinearLayout.LayoutParams) layoutParams).topMargin;
                        setChildFrame(virtualChildAt, i14, getLocationOffset(virtualChildAt) + i15, measuredWidth, measuredHeight);
                        int nextLocationOffset = getNextLocationOffset(virtualChildAt) + measuredHeight + ((LinearLayout.LayoutParams) layoutParams).bottomMargin + i15;
                        childrenSkipCount += getChildrenSkipCount(virtualChildAt, childrenSkipCount);
                        paddingTop = nextLocationOffset;
                    } else {
                        i6 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft + ((LinearLayout.LayoutParams) layoutParams).leftMargin;
                        i7 = ((LinearLayout.LayoutParams) layoutParams).rightMargin;
                    }
                    i8 = i6 - i7;
                    int i16 = i8;
                    if (hasDividerBeforeChildAt(childrenSkipCount)) {
                        paddingTop += this.mDividerHeight;
                    }
                    int i17 = paddingTop + ((LinearLayout.LayoutParams) layoutParams).topMargin;
                    setChildFrame(virtualChildAt, i16, getLocationOffset(virtualChildAt) + i17, measuredWidth, measuredHeight);
                    int nextLocationOffset2 = getNextLocationOffset(virtualChildAt) + measuredHeight + ((LinearLayout.LayoutParams) layoutParams).bottomMargin + i17;
                    childrenSkipCount += getChildrenSkipCount(virtualChildAt, childrenSkipCount);
                    paddingTop = nextLocationOffset2;
                }
                childrenSkipCount++;
            }
            childrenSkipCount++;
        }
    }

    public void measureChildBeforeLayout(View view, int i2, int i3, int i4, int i5, int i6) {
        measureChildWithMargins(view, i3, i4, i5, i6);
    }

    /* JADX WARN: Code duplicated, block: B:203:0x0463  */
    public void measureHorizontal(int i2, int i3) {
        int i4;
        int i5;
        float f2;
        int i6;
        int i7;
        int i8;
        int i9;
        int iMax;
        int i10;
        int baseline;
        int i11;
        int i12;
        byte b;
        int i13;
        int i14;
        int i15;
        boolean z;
        View view;
        boolean z2;
        int baseline2;
        this.mTotalLength = 0;
        int virtualChildCount = getVirtualChildCount();
        int mode = View.MeasureSpec.getMode(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        if (this.mMaxAscent == null || this.mMaxDescent == null) {
            this.mMaxAscent = new int[4];
            this.mMaxDescent = new int[4];
        }
        int[] iArr = this.mMaxAscent;
        int[] iArr2 = this.mMaxDescent;
        iArr[3] = -1;
        iArr[2] = -1;
        iArr[1] = -1;
        iArr[0] = -1;
        iArr2[3] = -1;
        iArr2[2] = -1;
        iArr2[1] = -1;
        iArr2[0] = -1;
        boolean z3 = this.mBaselineAligned;
        boolean z4 = this.mUseLargestChild;
        int i16 = BasicMeasure.EXACTLY;
        boolean z5 = mode == 1073741824;
        boolean z6 = z4;
        int childrenSkipCount = 0;
        int i17 = 0;
        int iMax2 = 0;
        boolean z7 = false;
        int iCombineMeasuredStates = 0;
        boolean z8 = false;
        boolean z9 = true;
        float f3 = 0.0f;
        int iMax3 = 0;
        int iMax4 = 0;
        while (true) {
            i4 = i17;
            if (childrenSkipCount >= virtualChildCount) {
                break;
            }
            boolean z10 = z3;
            View virtualChildAt = getVirtualChildAt(childrenSkipCount);
            if (virtualChildAt == null) {
                this.mTotalLength = measureNullChild(childrenSkipCount) + this.mTotalLength;
            } else {
                if (virtualChildAt.getVisibility() == 8) {
                    childrenSkipCount += getChildrenSkipCount(virtualChildAt, childrenSkipCount);
                } else {
                    if (hasDividerBeforeChildAt(childrenSkipCount)) {
                        this.mTotalLength += this.mDividerWidth;
                    }
                    LayoutParams layoutParams = (LayoutParams) virtualChildAt.getLayoutParams();
                    float f4 = ((LinearLayout.LayoutParams) layoutParams).weight;
                    float f5 = f3 + f4;
                    if (mode == i16 && ((LinearLayout.LayoutParams) layoutParams).width == 0 && f4 > 0.0f) {
                        if (z5) {
                            this.mTotalLength = ((LinearLayout.LayoutParams) layoutParams).leftMargin + ((LinearLayout.LayoutParams) layoutParams).rightMargin + this.mTotalLength;
                        } else {
                            int i18 = this.mTotalLength;
                            this.mTotalLength = Math.max(i18, ((LinearLayout.LayoutParams) layoutParams).leftMargin + i18 + ((LinearLayout.LayoutParams) layoutParams).rightMargin);
                        }
                        if (z10) {
                            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                            virtualChildAt.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                        } else {
                            z7 = true;
                        }
                        i14 = i4;
                        i15 = BasicMeasure.EXACTLY;
                        z = z6;
                        view = virtualChildAt;
                    } else {
                        if (((LinearLayout.LayoutParams) layoutParams).width != 0 || f4 <= 0.0f) {
                            b = -2;
                            i13 = Integer.MIN_VALUE;
                        } else {
                            b = -2;
                            ((LinearLayout.LayoutParams) layoutParams).width = -2;
                            i13 = 0;
                        }
                        int i19 = f5 == 0.0f ? this.mTotalLength : 0;
                        virtualChildCount = virtualChildCount;
                        mode = mode;
                        iArr = iArr;
                        i14 = i4;
                        i15 = BasicMeasure.EXACTLY;
                        z = z6;
                        iArr2 = iArr2;
                        int i20 = i13;
                        measureChildBeforeLayout(virtualChildAt, childrenSkipCount, i2, i19, i3, 0);
                        view = virtualChildAt;
                        if (i20 != Integer.MIN_VALUE) {
                            ((LinearLayout.LayoutParams) layoutParams).width = i20;
                        }
                        int measuredWidth = view.getMeasuredWidth();
                        if (z5) {
                            this.mTotalLength = getNextLocationOffset(view) + ((LinearLayout.LayoutParams) layoutParams).leftMargin + measuredWidth + ((LinearLayout.LayoutParams) layoutParams).rightMargin + this.mTotalLength;
                        } else {
                            int i21 = this.mTotalLength;
                            this.mTotalLength = Math.max(i21, getNextLocationOffset(view) + i21 + measuredWidth + ((LinearLayout.LayoutParams) layoutParams).leftMargin + ((LinearLayout.LayoutParams) layoutParams).rightMargin);
                        }
                        if (z) {
                            iMax2 = Math.max(measuredWidth, iMax2);
                        }
                    }
                    if (mode2 == i15 || ((LinearLayout.LayoutParams) layoutParams).height != -1) {
                        z2 = false;
                    } else {
                        z2 = true;
                        z8 = true;
                    }
                    int i22 = ((LinearLayout.LayoutParams) layoutParams).topMargin + ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                    int measuredHeight = view.getMeasuredHeight() + i22;
                    iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                    if (z10 && (baseline2 = view.getBaseline()) != -1) {
                        int i23 = ((LinearLayout.LayoutParams) layoutParams).gravity;
                        if (i23 < 0) {
                            i23 = this.mGravity;
                        }
                        int i24 = (((i23 & 112) >> 4) & (-2)) >> 1;
                        iArr[i24] = Math.max(iArr[i24], baseline2);
                        iArr2[i24] = Math.max(iArr2[i24], measuredHeight - baseline2);
                    }
                    int iMax5 = Math.max(i14, measuredHeight);
                    z9 = z9 && ((LinearLayout.LayoutParams) layoutParams).height == -1;
                    if (((LinearLayout.LayoutParams) layoutParams).weight > 0.0f) {
                        if (!z2) {
                            i22 = measuredHeight;
                        }
                        iMax4 = Math.max(iMax4, i22);
                    } else {
                        if (z2 == 0) {
                            i22 = measuredHeight;
                        }
                        iMax3 = Math.max(iMax3, i22);
                    }
                    childrenSkipCount += getChildrenSkipCount(view, childrenSkipCount);
                    i17 = iMax5;
                    f3 = f5;
                }
                childrenSkipCount++;
                z6 = z;
                iArr2 = iArr2;
                z3 = z10;
                mode = mode;
                iArr = iArr;
                virtualChildCount = virtualChildCount;
                i16 = BasicMeasure.EXACTLY;
            }
            virtualChildCount = virtualChildCount;
            mode = mode;
            iArr = iArr;
            iArr2 = iArr2;
            i17 = i4;
            z = z6;
            childrenSkipCount++;
            z6 = z;
            iArr2 = iArr2;
            z3 = z10;
            mode = mode;
            iArr = iArr;
            virtualChildCount = virtualChildCount;
            i16 = BasicMeasure.EXACTLY;
        }
        boolean z11 = z3;
        int i25 = virtualChildCount;
        int i26 = mode;
        int[] iArr3 = iArr;
        int[] iArr4 = iArr2;
        int i27 = iCombineMeasuredStates;
        boolean z12 = z6;
        if (this.mTotalLength > 0) {
            i5 = i25;
            if (hasDividerBeforeChildAt(i5)) {
                this.mTotalLength += this.mDividerWidth;
            }
        } else {
            i5 = i25;
        }
        int i28 = iArr3[1];
        int iMax6 = (i28 == -1 && iArr3[0] == -1 && iArr3[2] == -1 && iArr3[3] == -1) ? i4 : Math.max(i4, Math.max(iArr4[3], Math.max(iArr4[0], Math.max(iArr4[1], iArr4[2]))) + Math.max(iArr3[3], Math.max(iArr3[0], Math.max(i28, iArr3[2]))));
        if (z12) {
            i6 = i26;
            if (i6 == Integer.MIN_VALUE || i6 == 0) {
                this.mTotalLength = 0;
                int childrenSkipCount2 = 0;
                while (childrenSkipCount2 < i5) {
                    View virtualChildAt2 = getVirtualChildAt(childrenSkipCount2);
                    if (virtualChildAt2 == null) {
                        this.mTotalLength = measureNullChild(childrenSkipCount2) + this.mTotalLength;
                    } else {
                        if (virtualChildAt2.getVisibility() == 8) {
                            childrenSkipCount2 += getChildrenSkipCount(virtualChildAt2, childrenSkipCount2);
                        } else {
                            LayoutParams layoutParams2 = (LayoutParams) virtualChildAt2.getLayoutParams();
                            if (z5) {
                                this.mTotalLength = getNextLocationOffset(virtualChildAt2) + ((LinearLayout.LayoutParams) layoutParams2).leftMargin + iMax2 + ((LinearLayout.LayoutParams) layoutParams2).rightMargin + this.mTotalLength;
                            } else {
                                f3 = f3;
                                int i29 = this.mTotalLength;
                                this.mTotalLength = Math.max(i29, getNextLocationOffset(virtualChildAt2) + i29 + iMax2 + ((LinearLayout.LayoutParams) layoutParams2).leftMargin + ((LinearLayout.LayoutParams) layoutParams2).rightMargin);
                            }
                        }
                        childrenSkipCount2++;
                        f3 = f3;
                        iMax6 = iMax6;
                    }
                    childrenSkipCount2++;
                    f3 = f3;
                    iMax6 = iMax6;
                }
            }
            f2 = f3;
        } else {
            f2 = f3;
            i6 = i26;
        }
        int iMax7 = iMax6;
        int paddingRight = getPaddingRight() + getPaddingLeft() + this.mTotalLength;
        this.mTotalLength = paddingRight;
        int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i2, 0);
        int i30 = (16777215 & iResolveSizeAndState) - this.mTotalLength;
        if (z7 || (i30 != 0 && f2 > 0.0f)) {
            float f6 = this.mWeightSum;
            if (f6 > 0.0f) {
                f2 = f6;
            }
            iArr3[3] = -1;
            iArr3[2] = -1;
            iArr3[1] = -1;
            iArr3[0] = -1;
            iArr4[3] = -1;
            iArr4[2] = -1;
            iArr4[1] = -1;
            iArr4[0] = -1;
            this.mTotalLength = 0;
            int iCombineMeasuredStates2 = i27;
            int iMax8 = -1;
            int i31 = 0;
            while (i31 < i5) {
                View virtualChildAt3 = getVirtualChildAt(i31);
                if (virtualChildAt3 == null || virtualChildAt3.getVisibility() == 8) {
                    iResolveSizeAndState = iResolveSizeAndState;
                } else {
                    LayoutParams layoutParams3 = (LayoutParams) virtualChildAt3.getLayoutParams();
                    float f7 = ((LinearLayout.LayoutParams) layoutParams3).weight;
                    if (f7 > 0.0f) {
                        int i32 = (int) ((i30 * f7) / f2);
                        f2 -= f7;
                        i30 -= i32;
                        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + ((LinearLayout.LayoutParams) layoutParams3).topMargin + ((LinearLayout.LayoutParams) layoutParams3).bottomMargin, ((LinearLayout.LayoutParams) layoutParams3).height);
                        if (((LinearLayout.LayoutParams) layoutParams3).width == 0) {
                            i12 = BasicMeasure.EXACTLY;
                            if (i6 == 1073741824) {
                                if (i32 <= 0) {
                                    i32 = 0;
                                }
                                virtualChildAt3.measure(View.MeasureSpec.makeMeasureSpec(i32, BasicMeasure.EXACTLY), childMeasureSpec);
                            }
                            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, virtualChildAt3.getMeasuredState() & ViewCompat.MEASURED_STATE_MASK);
                        } else {
                            i12 = BasicMeasure.EXACTLY;
                        }
                        int measuredWidth2 = virtualChildAt3.getMeasuredWidth() + i32;
                        if (measuredWidth2 < 0) {
                            measuredWidth2 = 0;
                        }
                        virtualChildAt3.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth2, i12), childMeasureSpec);
                        iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, virtualChildAt3.getMeasuredState() & ViewCompat.MEASURED_STATE_MASK);
                    }
                    if (z5) {
                        this.mTotalLength = getNextLocationOffset(virtualChildAt3) + virtualChildAt3.getMeasuredWidth() + ((LinearLayout.LayoutParams) layoutParams3).leftMargin + ((LinearLayout.LayoutParams) layoutParams3).rightMargin + this.mTotalLength;
                    } else {
                        int i33 = this.mTotalLength;
                        this.mTotalLength = Math.max(i33, getNextLocationOffset(virtualChildAt3) + virtualChildAt3.getMeasuredWidth() + i33 + ((LinearLayout.LayoutParams) layoutParams3).leftMargin + ((LinearLayout.LayoutParams) layoutParams3).rightMargin);
                    }
                    boolean z13 = mode2 != 1073741824 && ((LinearLayout.LayoutParams) layoutParams3).height == -1;
                    int i34 = ((LinearLayout.LayoutParams) layoutParams3).topMargin + ((LinearLayout.LayoutParams) layoutParams3).bottomMargin;
                    int measuredHeight2 = virtualChildAt3.getMeasuredHeight() + i34;
                    iMax8 = Math.max(iMax8, measuredHeight2);
                    if (!z13) {
                        i34 = measuredHeight2;
                    }
                    int iMax9 = Math.max(iMax3, i34);
                    if (z9) {
                        i10 = -1;
                        boolean z14 = ((LinearLayout.LayoutParams) layoutParams3).height == -1;
                        if (z11 && (baseline = virtualChildAt3.getBaseline()) != i10) {
                            i11 = ((LinearLayout.LayoutParams) layoutParams3).gravity;
                            if (i11 < 0) {
                                i11 = this.mGravity;
                            }
                            int i35 = (((i11 & 112) >> 4) & (-2)) >> 1;
                            iArr3[i35] = Math.max(iArr3[i35], baseline);
                            iArr4[i35] = Math.max(iArr4[i35], measuredHeight2 - baseline);
                        }
                        iMax3 = iMax9;
                        z9 = z14;
                    } else {
                        i10 = -1;
                    }
                    if (z11) {
                        i11 = ((LinearLayout.LayoutParams) layoutParams3).gravity;
                        if (i11 < 0) {
                            i11 = this.mGravity;
                        }
                        int i36 = (((i11 & 112) >> 4) & (-2)) >> 1;
                        iArr3[i36] = Math.max(iArr3[i36], baseline);
                        iArr4[i36] = Math.max(iArr4[i36], measuredHeight2 - baseline);
                    }
                    iMax3 = iMax9;
                    z9 = z14;
                }
                i31++;
                iResolveSizeAndState = iResolveSizeAndState;
            }
            i7 = iResolveSizeAndState;
            i8 = ViewCompat.MEASURED_STATE_MASK;
            this.mTotalLength = getPaddingRight() + getPaddingLeft() + this.mTotalLength;
            int i37 = iArr3[1];
            iMax7 = (i37 == -1 && iArr3[0] == -1 && iArr3[2] == -1 && iArr3[3] == -1) ? iMax8 : Math.max(iMax8, Math.max(iArr4[3], Math.max(iArr4[0], Math.max(iArr4[1], iArr4[2]))) + Math.max(iArr3[3], Math.max(iArr3[0], Math.max(i37, iArr3[2]))));
            i9 = iCombineMeasuredStates2;
            iMax = iMax3;
        } else {
            iMax = Math.max(iMax3, iMax4);
            if (z12 && i6 != 1073741824) {
                for (int i38 = 0; i38 < i5; i38++) {
                    View virtualChildAt4 = getVirtualChildAt(i38);
                    if (virtualChildAt4 != null && virtualChildAt4.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((LayoutParams) virtualChildAt4.getLayoutParams())).weight > 0.0f) {
                        virtualChildAt4.measure(View.MeasureSpec.makeMeasureSpec(iMax2, BasicMeasure.EXACTLY), View.MeasureSpec.makeMeasureSpec(virtualChildAt4.getMeasuredHeight(), BasicMeasure.EXACTLY));
                    }
                }
            }
            i7 = iResolveSizeAndState;
            i9 = i27;
            i8 = ViewCompat.MEASURED_STATE_MASK;
        }
        if (z9 || mode2 == 1073741824) {
            iMax = iMax7;
        }
        setMeasuredDimension(i7 | (i9 & i8), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + iMax, getSuggestedMinimumHeight()), i3, i9 << 16));
        if (z8) {
            forceUniformHeight(i5, i2);
        }
    }

    public int measureNullChild(int i2) {
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:64:0x0156 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:66:0x0159  */
    /* JADX WARN: Code duplicated, block: B:68:0x0160 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:70:0x0163  */
    public void measureVertical(int i2, int i3) {
        int i4;
        int iMax;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        View view;
        boolean z;
        int iMax2;
        boolean z2;
        int iMax3;
        int i14;
        this.mTotalLength = 0;
        int virtualChildCount = getVirtualChildCount();
        int mode = View.MeasureSpec.getMode(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int i15 = this.mBaselineAlignedChildIndex;
        boolean z3 = this.mUseLargestChild;
        int childrenSkipCount = 0;
        int i16 = 0;
        int iMax4 = 0;
        int i17 = 0;
        int i18 = 0;
        int iMax5 = 0;
        boolean z4 = false;
        boolean z5 = false;
        float f2 = 0.0f;
        boolean z6 = true;
        while (true) {
            int i19 = 8;
            if (childrenSkipCount >= virtualChildCount) {
                float f3 = f2;
                int i20 = i16;
                int i21 = virtualChildCount;
                int i22 = mode2;
                boolean z7 = z3;
                int i23 = iMax4;
                int iMax6 = i17;
                int iCombineMeasuredStates = i18;
                if (this.mTotalLength > 0) {
                    i4 = i21;
                    if (hasDividerBeforeChildAt(i4)) {
                        this.mTotalLength += this.mDividerHeight;
                    }
                } else {
                    i4 = i21;
                }
                int i24 = i22;
                if (z7 && (i24 == Integer.MIN_VALUE || i24 == 0)) {
                    this.mTotalLength = 0;
                    int childrenSkipCount2 = 0;
                    while (childrenSkipCount2 < i4) {
                        View virtualChildAt = getVirtualChildAt(childrenSkipCount2);
                        if (virtualChildAt == null) {
                            this.mTotalLength = measureNullChild(childrenSkipCount2) + this.mTotalLength;
                        } else if (virtualChildAt.getVisibility() == i19) {
                            childrenSkipCount2 += getChildrenSkipCount(virtualChildAt, childrenSkipCount2);
                        } else {
                            LayoutParams layoutParams = (LayoutParams) virtualChildAt.getLayoutParams();
                            int i25 = this.mTotalLength;
                            this.mTotalLength = Math.max(i25, getNextLocationOffset(virtualChildAt) + i25 + i23 + ((LinearLayout.LayoutParams) layoutParams).topMargin + ((LinearLayout.LayoutParams) layoutParams).bottomMargin);
                        }
                        childrenSkipCount2++;
                        i19 = 8;
                    }
                }
                int paddingBottom = getPaddingBottom() + getPaddingTop() + this.mTotalLength;
                this.mTotalLength = paddingBottom;
                int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i3, 0);
                int i26 = (16777215 & iResolveSizeAndState) - this.mTotalLength;
                if (z4 || (i26 != 0 && f3 > 0.0f)) {
                    float f4 = this.mWeightSum;
                    if (f4 <= 0.0f) {
                        f4 = f3;
                    }
                    this.mTotalLength = 0;
                    float f5 = f4;
                    int i27 = i26;
                    int i28 = 0;
                    while (i28 < i4) {
                        View virtualChildAt2 = getVirtualChildAt(i28);
                        if (virtualChildAt2.getVisibility() == 8) {
                            i24 = i24;
                            i28 = i28;
                        } else {
                            LayoutParams layoutParams2 = (LayoutParams) virtualChildAt2.getLayoutParams();
                            float f6 = ((LinearLayout.LayoutParams) layoutParams2).weight;
                            if (f6 > 0.0f) {
                                int i29 = (int) ((i27 * f6) / f5);
                                f5 -= f6;
                                i27 -= i29;
                                int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, getPaddingRight() + getPaddingLeft() + ((LinearLayout.LayoutParams) layoutParams2).leftMargin + ((LinearLayout.LayoutParams) layoutParams2).rightMargin, ((LinearLayout.LayoutParams) layoutParams2).width);
                                if (((LinearLayout.LayoutParams) layoutParams2).height == 0) {
                                    i6 = BasicMeasure.EXACTLY;
                                    if (i24 == 1073741824) {
                                        virtualChildAt2.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(i29 > 0 ? i29 : 0, BasicMeasure.EXACTLY));
                                    }
                                    iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, virtualChildAt2.getMeasuredState() & InputDeviceCompat.SOURCE_ANY);
                                } else {
                                    i6 = BasicMeasure.EXACTLY;
                                }
                                int measuredHeight = virtualChildAt2.getMeasuredHeight() + i29;
                                if (measuredHeight < 0) {
                                    measuredHeight = 0;
                                }
                                virtualChildAt2.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(measuredHeight, i6));
                                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, virtualChildAt2.getMeasuredState() & InputDeviceCompat.SOURCE_ANY);
                            } else {
                                i24 = i24;
                            }
                            int i30 = ((LinearLayout.LayoutParams) layoutParams2).leftMargin + ((LinearLayout.LayoutParams) layoutParams2).rightMargin;
                            int measuredWidth = virtualChildAt2.getMeasuredWidth() + i30;
                            iMax6 = Math.max(iMax6, measuredWidth);
                            if (mode != 1073741824) {
                                i5 = -1;
                                if (((LinearLayout.LayoutParams) layoutParams2).width == -1) {
                                    measuredWidth = i30;
                                }
                            } else {
                                i5 = -1;
                            }
                            int iMax7 = Math.max(iMax5, measuredWidth);
                            boolean z8 = z6 && ((LinearLayout.LayoutParams) layoutParams2).width == i5;
                            int i31 = this.mTotalLength;
                            this.mTotalLength = Math.max(i31, getNextLocationOffset(virtualChildAt2) + virtualChildAt2.getMeasuredHeight() + i31 + ((LinearLayout.LayoutParams) layoutParams2).topMargin + ((LinearLayout.LayoutParams) layoutParams2).bottomMargin);
                            iMax5 = iMax7;
                            z6 = z8;
                        }
                        i28++;
                        i24 = i24;
                    }
                    this.mTotalLength = getPaddingBottom() + getPaddingTop() + this.mTotalLength;
                    iMax = iMax5;
                } else {
                    iMax = Math.max(iMax5, i20);
                    if (z7 && i24 != 1073741824) {
                        for (int i32 = 0; i32 < i4; i32++) {
                            View virtualChildAt3 = getVirtualChildAt(i32);
                            if (virtualChildAt3 != null && virtualChildAt3.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((LayoutParams) virtualChildAt3.getLayoutParams())).weight > 0.0f) {
                                virtualChildAt3.measure(View.MeasureSpec.makeMeasureSpec(virtualChildAt3.getMeasuredWidth(), BasicMeasure.EXACTLY), View.MeasureSpec.makeMeasureSpec(i23, BasicMeasure.EXACTLY));
                            }
                        }
                    }
                }
                if (!z6 && mode != 1073741824) {
                    iMax6 = iMax;
                }
                setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + iMax6, getSuggestedMinimumWidth()), i2, iCombineMeasuredStates), iResolveSizeAndState);
                if (z5) {
                    forceUniformWidth(i4, i3);
                    return;
                }
                return;
            }
            float f7 = f2;
            View virtualChildAt4 = getVirtualChildAt(childrenSkipCount);
            if (virtualChildAt4 == null) {
                this.mTotalLength = measureNullChild(childrenSkipCount) + this.mTotalLength;
            } else {
                if (virtualChildAt4.getVisibility() == 8) {
                    childrenSkipCount += getChildrenSkipCount(virtualChildAt4, childrenSkipCount);
                } else {
                    if (hasDividerBeforeChildAt(childrenSkipCount)) {
                        this.mTotalLength += this.mDividerHeight;
                    }
                    LayoutParams layoutParams3 = (LayoutParams) virtualChildAt4.getLayoutParams();
                    float f8 = ((LinearLayout.LayoutParams) layoutParams3).weight;
                    float f9 = f7 + f8;
                    if (mode2 == 1073741824 && ((LinearLayout.LayoutParams) layoutParams3).height == 0 && f8 > 0.0f) {
                        int i33 = this.mTotalLength;
                        this.mTotalLength = Math.max(i33, ((LinearLayout.LayoutParams) layoutParams3).topMargin + i33 + ((LinearLayout.LayoutParams) layoutParams3).bottomMargin);
                        iMax2 = i16;
                        i10 = virtualChildCount;
                        i11 = mode2;
                        z4 = true;
                        i13 = i17;
                        i12 = i18;
                        z = z3;
                    } else {
                        if (((LinearLayout.LayoutParams) layoutParams3).height != 0 || f8 <= 0.0f) {
                            i7 = Integer.MIN_VALUE;
                        } else {
                            ((LinearLayout.LayoutParams) layoutParams3).height = -2;
                            i7 = 0;
                        }
                        if (f9 == 0.0f) {
                            int i34 = i18;
                            i9 = this.mTotalLength;
                            i8 = i34;
                        } else {
                            i8 = i18;
                            i9 = 0;
                        }
                        int i35 = iMax4;
                        i10 = virtualChildCount;
                        i11 = mode2;
                        i12 = i8;
                        i13 = i17;
                        view = virtualChildAt4;
                        z = z3;
                        iMax2 = i16;
                        measureChildBeforeLayout(view, childrenSkipCount, i2, 0, i3, i9);
                        if (i7 != Integer.MIN_VALUE) {
                            ((LinearLayout.LayoutParams) layoutParams3).height = i7;
                        }
                        int measuredHeight2 = view.getMeasuredHeight();
                        int i36 = this.mTotalLength;
                        this.mTotalLength = Math.max(i36, getNextLocationOffset(view) + i36 + measuredHeight2 + ((LinearLayout.LayoutParams) layoutParams3).topMargin + ((LinearLayout.LayoutParams) layoutParams3).bottomMargin);
                        iMax4 = z ? Math.max(measuredHeight2, i35) : i35;
                    }
                    if (i15 >= 0 && i15 == childrenSkipCount + 1) {
                        view = virtualChildAt4;
                        this.mBaselineChildTop = this.mTotalLength;
                    }
                    if (childrenSkipCount < i15 && ((LinearLayout.LayoutParams) layoutParams3).weight > 0.0f) {
                        throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                    }
                    if (mode == 1073741824 || ((LinearLayout.LayoutParams) layoutParams3).width != -1) {
                        z2 = false;
                    } else {
                        z2 = true;
                        z5 = true;
                    }
                    int i37 = ((LinearLayout.LayoutParams) layoutParams3).leftMargin + ((LinearLayout.LayoutParams) layoutParams3).rightMargin;
                    int measuredWidth2 = view.getMeasuredWidth() + i37;
                    iMax3 = Math.max(i13, measuredWidth2);
                    int i38 = iMax4;
                    int iCombineMeasuredStates2 = View.combineMeasuredStates(i12, view.getMeasuredState());
                    if (z6) {
                        i14 = iCombineMeasuredStates2;
                        z6 = ((LinearLayout.LayoutParams) layoutParams3).width == -1;
                        if (((LinearLayout.LayoutParams) layoutParams3).weight > 0.0f) {
                            if (!z2) {
                                i37 = measuredWidth2;
                            }
                            iMax2 = Math.max(iMax2, i37);
                        } else {
                            if (!z2) {
                                i37 = measuredWidth2;
                            }
                            iMax5 = Math.max(iMax5, i37);
                        }
                        childrenSkipCount += getChildrenSkipCount(view, childrenSkipCount);
                        f2 = f9;
                        iMax4 = i38;
                        i18 = i14;
                    } else {
                        i14 = iCombineMeasuredStates2;
                    }
                    if (((LinearLayout.LayoutParams) layoutParams3).weight > 0.0f) {
                        if (!z2) {
                            i37 = measuredWidth2;
                        }
                        iMax2 = Math.max(iMax2, i37);
                    } else {
                        if (!z2) {
                            i37 = measuredWidth2;
                        }
                        iMax5 = Math.max(iMax5, i37);
                    }
                    childrenSkipCount += getChildrenSkipCount(view, childrenSkipCount);
                    f2 = f9;
                    iMax4 = i38;
                    i18 = i14;
                }
                childrenSkipCount++;
                i17 = iMax3;
                i16 = iMax2;
                z3 = z;
                mode2 = i11;
                virtualChildCount = i10;
            }
            iMax2 = i16;
            i10 = virtualChildCount;
            i11 = mode2;
            z = z3;
            f2 = f7;
            iMax3 = i17;
            childrenSkipCount++;
            i17 = iMax3;
            i16 = iMax2;
            z3 = z;
            mode2 = i11;
            virtualChildCount = i10;
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (this.mDivider == null) {
            return;
        }
        if (this.mOrientation == 1) {
            drawDividersVertical(canvas);
        } else {
            drawDividersHorizontal(canvas);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(ACCESSIBILITY_CLASS_NAME);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(ACCESSIBILITY_CLASS_NAME);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        if (this.mOrientation == 1) {
            layoutVertical(i2, i3, i4, i5);
        } else {
            layoutHorizontal(i2, i3, i4, i5);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i2, int i3) {
        if (this.mOrientation == 1) {
            measureVertical(i2, i3);
        } else {
            measureHorizontal(i2, i3);
        }
    }

    public void setBaselineAligned(boolean z) {
        this.mBaselineAligned = z;
    }

    public void setBaselineAlignedChildIndex(int i2) {
        if (i2 >= 0 && i2 < getChildCount()) {
            this.mBaselineAlignedChildIndex = i2;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.mDivider) {
            return;
        }
        this.mDivider = drawable;
        if (drawable != null) {
            this.mDividerWidth = drawable.getIntrinsicWidth();
            this.mDividerHeight = drawable.getIntrinsicHeight();
        } else {
            this.mDividerWidth = 0;
            this.mDividerHeight = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i2) {
        this.mDividerPadding = i2;
    }

    public void setGravity(int i2) {
        if (this.mGravity != i2) {
            if ((8388615 & i2) == 0) {
                i2 |= GravityCompat.START;
            }
            if ((i2 & 112) == 0) {
                i2 |= 48;
            }
            this.mGravity = i2;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i2) {
        int i3 = i2 & GravityCompat.RELATIVE_HORIZONTAL_GRAVITY_MASK;
        int i4 = this.mGravity;
        if ((8388615 & i4) != i3) {
            this.mGravity = i3 | ((-8388616) & i4);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z) {
        this.mUseLargestChild = z;
    }

    public void setOrientation(int i2) {
        if (this.mOrientation != i2) {
            this.mOrientation = i2;
            requestLayout();
        }
    }

    public void setShowDividers(int i2) {
        if (i2 != this.mShowDividers) {
            requestLayout();
        }
        this.mShowDividers = i2;
    }

    public void setVerticalGravity(int i2) {
        int i3 = i2 & 112;
        int i4 = this.mGravity;
        if ((i4 & 112) != i3) {
            this.mGravity = i3 | (i4 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f2) {
        this.mWeightSum = Math.max(0.0f, f2);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public LinearLayoutCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.ViewGroup
    public LayoutParams generateDefaultLayoutParams() {
        int i2 = this.mOrientation;
        if (i2 == 0) {
            return new LayoutParams(-2, -2);
        }
        if (i2 == 1) {
            return new LayoutParams(-1, -2);
        }
        return null;
    }

    public LinearLayoutCompat(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.mBaselineAligned = true;
        this.mBaselineAlignedChildIndex = -1;
        this.mBaselineChildTop = 0;
        this.mGravity = 8388659;
        int[] iArr = C0956R.styleable.LinearLayoutCompat;
        TintTypedArray tintTypedArrayObtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, attributeSet, iArr, i2, 0);
        ViewCompat.saveAttributeDataForStyleable(this, context, iArr, attributeSet, tintTypedArrayObtainStyledAttributes.getWrappedTypeArray(), i2, 0);
        int i3 = tintTypedArrayObtainStyledAttributes.getInt(C0956R.styleable.LinearLayoutCompat_android_orientation, -1);
        if (i3 >= 0) {
            setOrientation(i3);
        }
        int i4 = tintTypedArrayObtainStyledAttributes.getInt(C0956R.styleable.LinearLayoutCompat_android_gravity, -1);
        if (i4 >= 0) {
            setGravity(i4);
        }
        boolean z = tintTypedArrayObtainStyledAttributes.getBoolean(C0956R.styleable.LinearLayoutCompat_android_baselineAligned, true);
        if (!z) {
            setBaselineAligned(z);
        }
        this.mWeightSum = tintTypedArrayObtainStyledAttributes.getFloat(C0956R.styleable.LinearLayoutCompat_android_weightSum, -1.0f);
        this.mBaselineAlignedChildIndex = tintTypedArrayObtainStyledAttributes.getInt(C0956R.styleable.LinearLayoutCompat_android_baselineAlignedChildIndex, -1);
        this.mUseLargestChild = tintTypedArrayObtainStyledAttributes.getBoolean(C0956R.styleable.LinearLayoutCompat_measureWithLargestChild, false);
        setDividerDrawable(tintTypedArrayObtainStyledAttributes.getDrawable(C0956R.styleable.LinearLayoutCompat_divider));
        this.mShowDividers = tintTypedArrayObtainStyledAttributes.getInt(C0956R.styleable.LinearLayoutCompat_showDividers, 0);
        this.mDividerPadding = tintTypedArrayObtainStyledAttributes.getDimensionPixelSize(C0956R.styleable.LinearLayoutCompat_dividerPadding, 0);
        tintTypedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LayoutParams) {
            return new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new LayoutParams(layoutParams);
    }
}
