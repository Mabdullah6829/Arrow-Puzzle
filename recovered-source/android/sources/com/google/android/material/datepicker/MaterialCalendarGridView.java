package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.core.util.Pair;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.C5183R;
import com.google.android.material.focus.FocusRingDrawable;
import com.google.android.material.internal.ViewUtils;
import java.util.Calendar;

/* JADX INFO: loaded from: classes2.dex */
final class MaterialCalendarGridView extends GridView {
    private final Calendar dayCompute;
    private final boolean nestedScrollable;

    @Nullable
    private MaterialCalendar.OnMonthNavigationListener onMonthNavigationListener;

    public MaterialCalendarGridView(Context context) {
        this(context, null);
    }

    private void ensureFocusRingSelector(MonthAdapter monthAdapter) {
        Drawable selector = getSelector();
        if (selector instanceof FocusRingDrawable) {
            return;
        }
        Drawable drawableWrap = FocusRingDrawable.wrap(getContext(), selector);
        if (drawableWrap instanceof FocusRingDrawable) {
            FocusRingDrawable focusRingDrawable = (FocusRingDrawable) drawableWrap;
            CalendarStyle calendarStyle = monthAdapter.calendarStyle;
            if (calendarStyle != null) {
                focusRingDrawable.setFocusRingShapeAppearance(calendarStyle.day.getItemShapeAppearanceModel());
            }
            setDrawSelectorOnTop(true);
            setSelector(focusRingDrawable);
        }
    }

    private void gainFocus(int i2, Rect rect) {
        int iFindLastValidDayPosition;
        if (i2 == 33 || i2 == 1) {
            iFindLastValidDayPosition = getAdapter().findLastValidDayPosition();
        } else {
            iFindLastValidDayPosition = (i2 == 130 || i2 == 2) ? getAdapter().findFirstValidDayPosition() : -1;
        }
        if (iFindLastValidDayPosition != -1) {
            setSelection(iFindLastValidDayPosition);
        } else {
            super.onFocusChanged(true, i2, rect);
        }
    }

    private View getChildAtPosition(int i2) {
        return getChildAt(i2 - getFirstVisiblePosition());
    }

    private boolean handleHorizontalNavigation(int i2, boolean z) {
        MaterialCalendar.OnMonthNavigationListener onMonthNavigationListener;
        MaterialCalendar.OnMonthNavigationListener onMonthNavigationListener2;
        int iFindNextValidDayPosition = z ? getAdapter().findNextValidDayPosition(i2) : getAdapter().findPreviousValidDayPosition(i2);
        if (iFindNextValidDayPosition != -1) {
            setSelection(iFindNextValidDayPosition);
            return true;
        }
        if (!z && (onMonthNavigationListener2 = this.onMonthNavigationListener) != null) {
            return onMonthNavigationListener2.onMonthNavigationPrevious();
        }
        if (!z || (onMonthNavigationListener = this.onMonthNavigationListener) == null) {
            return true;
        }
        return onMonthNavigationListener.onMonthNavigationNext();
    }

    private boolean handleTabNavigation(int i2, KeyEvent keyEvent) {
        int iFindPreviousValidDayPosition = keyEvent.isShiftPressed() ? getAdapter().findPreviousValidDayPosition(i2) : getAdapter().findNextValidDayPosition(i2);
        if (iFindPreviousValidDayPosition == -1) {
            return false;
        }
        setSelection(iFindPreviousValidDayPosition);
        return true;
    }

    private static int horizontalMidPoint(@NonNull View view) {
        return (view.getWidth() / 2) + view.getLeft();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onAttachedToWindow$0() {
        ensureFocusRingSelector(getAdapter());
    }

    private static boolean skipMonth(@Nullable Long l2, @Nullable Long l3, @Nullable Long l4, @Nullable Long l5) {
        return l2 == null || l3 == null || l4 == null || l5 == null || l4.longValue() > l3.longValue() || l5.longValue() < l2.longValue();
    }

    private boolean trySelectNearestValidDayPosition(int i2) {
        int iFindNearestValidDayPositionInRow = getAdapter().findNearestValidDayPositionInRow(i2);
        if (iFindNearestValidDayPositionInRow == -1) {
            return false;
        }
        setSelection(iFindNearestValidDayPositionInRow);
        return true;
    }

    @VisibleForTesting
    public boolean handleVerticalNavigationOnDisabledDay(int i2, int i3) {
        MonthAdapter adapter = getAdapter();
        if (trySelectNearestValidDayPosition(i3)) {
            return true;
        }
        if (19 == i2) {
            int numColumns = getNumColumns();
            while (true) {
                i3 -= numColumns;
                if (i3 < adapter.firstPositionInMonth()) {
                    return false;
                }
                if (trySelectNearestValidDayPosition(i3)) {
                    return true;
                }
                numColumns = getNumColumns();
            }
        } else {
            if (i2 != 20) {
                return false;
            }
            int numColumns2 = getNumColumns();
            while (true) {
                numColumns2 += i3;
                if (numColumns2 > adapter.lastPositionInMonth()) {
                    return false;
                }
                if (trySelectNearestValidDayPosition(numColumns2)) {
                    return true;
                }
                i3 = getNumColumns();
            }
        }
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getAdapter().notifyDataSetChanged();
        post(new RunnableC5313d(this, 0));
    }

    @Override // android.view.View
    public final void onDraw(@NonNull Canvas canvas) {
        int iDayToPosition;
        int iHorizontalMidPoint;
        int iDayToPosition2;
        int iHorizontalMidPoint2;
        int width;
        int i2;
        MaterialCalendarGridView materialCalendarGridView = this;
        super.onDraw(canvas);
        MonthAdapter adapter = materialCalendarGridView.getAdapter();
        DateSelector<?> dateSelector = adapter.dateSelector;
        CalendarStyle calendarStyle = adapter.calendarStyle;
        int iMax = Math.max(adapter.firstPositionInMonth(), materialCalendarGridView.getFirstVisiblePosition());
        int iMin = Math.min(adapter.lastPositionInMonth(), materialCalendarGridView.getLastVisiblePosition());
        Long item = adapter.getItem(iMax);
        Long item2 = adapter.getItem(iMin);
        for (Pair<Long, Long> pair : dateSelector.getSelectedRanges()) {
            Long l2 = pair.first;
            if (l2 == null) {
                materialCalendarGridView = this;
            } else if (pair.second != null) {
                Long l3 = l2;
                long jLongValue = l3.longValue();
                Long l4 = pair.second;
                long jLongValue2 = l4.longValue();
                if (!skipMonth(item, item2, l3, l4)) {
                    boolean zIsLayoutRtl = ViewUtils.isLayoutRtl(materialCalendarGridView);
                    if (jLongValue < item.longValue()) {
                        iHorizontalMidPoint = adapter.isFirstInRow(iMax) ? 0 : !zIsLayoutRtl ? materialCalendarGridView.getChildAtPosition(iMax - 1).getRight() : materialCalendarGridView.getChildAtPosition(iMax - 1).getLeft();
                        iDayToPosition = iMax;
                    } else {
                        materialCalendarGridView.dayCompute.setTimeInMillis(jLongValue);
                        iDayToPosition = adapter.dayToPosition(materialCalendarGridView.dayCompute.get(5));
                        iHorizontalMidPoint = horizontalMidPoint(materialCalendarGridView.getChildAtPosition(iDayToPosition));
                    }
                    if (jLongValue2 > item2.longValue()) {
                        iHorizontalMidPoint2 = adapter.isLastInRow(iMin) ? materialCalendarGridView.getWidth() : !zIsLayoutRtl ? materialCalendarGridView.getChildAtPosition(iMin).getRight() : materialCalendarGridView.getChildAtPosition(iMin).getLeft();
                        iDayToPosition2 = iMin;
                    } else {
                        materialCalendarGridView.dayCompute.setTimeInMillis(jLongValue2);
                        iDayToPosition2 = adapter.dayToPosition(materialCalendarGridView.dayCompute.get(5));
                        iHorizontalMidPoint2 = horizontalMidPoint(materialCalendarGridView.getChildAtPosition(iDayToPosition2));
                    }
                    int itemId = (int) adapter.getItemId(iDayToPosition);
                    int i3 = iMax;
                    int i4 = iMin;
                    int itemId2 = (int) adapter.getItemId(iDayToPosition2);
                    while (itemId <= itemId2) {
                        int numColumns = materialCalendarGridView.getNumColumns() * itemId;
                        int numColumns2 = (materialCalendarGridView.getNumColumns() + numColumns) - 1;
                        View childAtPosition = materialCalendarGridView.getChildAtPosition(numColumns);
                        int top = childAtPosition.getTop() + calendarStyle.day.getTopInset();
                        MonthAdapter monthAdapter = adapter;
                        int bottom = childAtPosition.getBottom() - calendarStyle.day.getBottomInset();
                        if (zIsLayoutRtl) {
                            int i5 = iDayToPosition2 > numColumns2 ? 0 : iHorizontalMidPoint2;
                            width = numColumns > iDayToPosition ? getWidth() : iHorizontalMidPoint;
                            i2 = i5;
                        } else {
                            i2 = numColumns > iDayToPosition ? 0 : iHorizontalMidPoint;
                            width = iDayToPosition2 > numColumns2 ? getWidth() : iHorizontalMidPoint2;
                        }
                        canvas.drawRect(i2, top, width, bottom, calendarStyle.rangeFill);
                        itemId++;
                        materialCalendarGridView = this;
                        adapter = monthAdapter;
                    }
                    materialCalendarGridView = this;
                    iMax = i3;
                    iMin = i4;
                }
            }
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public void onFocusChanged(boolean z, int i2, Rect rect) {
        if (z) {
            gainFocus(i2, rect);
        } else {
            super.onFocusChanged(false, i2, rect);
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        int selectedItemPosition = getSelectedItemPosition();
        if (selectedItemPosition == -1) {
            return super.onKeyDown(i2, keyEvent);
        }
        boolean zIsLayoutRtl = ViewUtils.isLayoutRtl(this);
        if (i2 == 21) {
            return handleHorizontalNavigation(selectedItemPosition, zIsLayoutRtl);
        }
        if (i2 == 22) {
            return handleHorizontalNavigation(selectedItemPosition, !zIsLayoutRtl);
        }
        if (i2 == 61) {
            return handleTabNavigation(selectedItemPosition, keyEvent);
        }
        if (!super.onKeyDown(i2, keyEvent)) {
            return false;
        }
        MonthAdapter adapter = getAdapter();
        int selectedItemPosition2 = getSelectedItemPosition();
        if (selectedItemPosition2 == -1 || adapter.isDayPositionValid(selectedItemPosition2)) {
            return true;
        }
        return handleVerticalNavigationOnDisabledDay(i2, selectedItemPosition2);
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public void onMeasure(int i2, int i3) {
        if (!this.nestedScrollable) {
            super.onMeasure(i2, i3);
            return;
        }
        super.onMeasure(i2, View.MeasureSpec.makeMeasureSpec(ViewCompat.MEASURED_SIZE_MASK, Integer.MIN_VALUE));
        getLayoutParams().height = getMeasuredHeight();
    }

    public void setOnMonthNavigationListener(@Nullable MaterialCalendar.OnMonthNavigationListener onMonthNavigationListener) {
        this.onMonthNavigationListener = onMonthNavigationListener;
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public void setSelection(int i2) {
        super.setSelection(Math.max(i2, getAdapter().findFirstValidDayPosition()));
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        if (!(listAdapter instanceof MonthAdapter)) {
            throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), MonthAdapter.class.getCanonicalName()));
        }
        super.setAdapter(listAdapter);
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.dayCompute = UtcDates.getUtcCalendar();
        if (MaterialDatePicker.isFullscreen(getContext())) {
            setNextFocusLeftId(C5183R.id.cancel_button);
            setNextFocusRightId(C5183R.id.confirm_button);
        }
        this.nestedScrollable = MaterialDatePicker.isNestedScrollable(getContext());
        ViewCompat.setAccessibilityDelegate(this, new AccessibilityDelegateCompat() { // from class: com.google.android.material.datepicker.MaterialCalendarGridView.1
            @Override // androidx.core.view.AccessibilityDelegateCompat
            public void onInitializeAccessibilityNodeInfo(View view, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
                accessibilityNodeInfoCompat.setCollectionInfo(null);
            }
        });
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    @NonNull
    public MonthAdapter getAdapter() {
        return (MonthAdapter) super.getAdapter();
    }
}
