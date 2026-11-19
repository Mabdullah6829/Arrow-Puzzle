package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.core.util.Pair;
import com.google.android.material.C5183R;
import com.google.android.material.timepicker.TimeModel;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
class MonthAdapter extends BaseAdapter {
    private static final int NO_DAY_NUMBER = -1;
    final CalendarConstraints calendarConstraints;
    CalendarStyle calendarStyle;
    final DateSelector<?> dateSelector;

    @Nullable
    final DayViewDecorator dayViewDecorator;
    final Month month;
    private Collection<Long> previouslySelectedDates;
    static final int MAXIMUM_WEEKS = UtcDates.getUtcCalendar().getMaximum(4);
    private static final int MAXIMUM_GRID_CELLS = (UtcDates.getUtcCalendar().getMaximum(7) + UtcDates.getUtcCalendar().getMaximum(5)) - 1;

    public MonthAdapter(Month month, DateSelector<?> dateSelector, CalendarConstraints calendarConstraints, @Nullable DayViewDecorator dayViewDecorator) {
        this.month = month;
        this.dateSelector = dateSelector;
        this.calendarConstraints = calendarConstraints;
        this.dayViewDecorator = dayViewDecorator;
        this.previouslySelectedDates = dateSelector.getSelectedDays();
    }

    private String getDayContentDescription(Context context, long j2) {
        return DateStrings.getDayContentDescription(context, j2, isToday(j2), isStartOfRange(j2), isEndOfRange(j2));
    }

    private void initializeStyles(Context context) {
        if (this.calendarStyle == null) {
            this.calendarStyle = new CalendarStyle(context);
        }
    }

    private boolean isSelected(long j2) {
        Iterator<Long> it = this.dateSelector.getSelectedDays().iterator();
        while (it.hasNext()) {
            if (UtcDates.canonicalYearMonthDay(j2) == UtcDates.canonicalYearMonthDay(it.next().longValue())) {
                return true;
            }
        }
        return false;
    }

    private boolean isToday(long j2) {
        return UtcDates.getTodayCalendar().getTimeInMillis() == j2;
    }

    private void updateSelectedState(@Nullable TextView textView, long j2, int i2) {
        boolean zIsSelected;
        CalendarItemStyle calendarItemStyle;
        if (textView == null) {
            return;
        }
        Context context = textView.getContext();
        String dayContentDescription = getDayContentDescription(context, j2);
        textView.setContentDescription(dayContentDescription);
        boolean zIsValid = this.calendarConstraints.getDateValidator().isValid(j2);
        if (zIsValid) {
            textView.setEnabled(true);
            zIsSelected = isSelected(j2);
            textView.setSelected(zIsSelected);
            if (zIsSelected) {
                calendarItemStyle = this.calendarStyle.selectedDay;
            } else {
                calendarItemStyle = isToday(j2) ? this.calendarStyle.todayDay : this.calendarStyle.day;
            }
        } else {
            zIsSelected = false;
            textView.setEnabled(false);
            calendarItemStyle = this.calendarStyle.invalidDay;
        }
        boolean z = zIsSelected;
        DayViewDecorator dayViewDecorator = this.dayViewDecorator;
        if (dayViewDecorator == null || i2 == -1) {
            calendarItemStyle.styleItem(textView);
            return;
        }
        Month month = this.month;
        int i3 = month.year;
        int i4 = month.month;
        calendarItemStyle.styleItem(textView, dayViewDecorator.getBackgroundColor(context, i3, i4, i2, zIsValid, z), this.dayViewDecorator.getTextColor(context, i3, i4, i2, zIsValid, z));
        textView.setCompoundDrawables(this.dayViewDecorator.getCompoundDrawableLeft(context, i3, i4, i2, zIsValid, z), this.dayViewDecorator.getCompoundDrawableTop(context, i3, i4, i2, zIsValid, z), this.dayViewDecorator.getCompoundDrawableRight(context, i3, i4, i2, zIsValid, z), this.dayViewDecorator.getCompoundDrawableBottom(context, i3, i4, i2, zIsValid, z));
        textView.setContentDescription(this.dayViewDecorator.getContentDescription(context, i3, i4, i2, zIsValid, z, dayContentDescription));
    }

    private void updateSelectedStateForDate(MaterialCalendarGridView materialCalendarGridView, long j2) {
        if (Month.create(j2).equals(this.month)) {
            int dayOfMonth = this.month.getDayOfMonth(j2);
            updateSelectedState((TextView) materialCalendarGridView.getChildAt(materialCalendarGridView.getAdapter().dayToPosition(dayOfMonth) - materialCalendarGridView.getFirstVisiblePosition()), j2, dayOfMonth);
        }
    }

    public int dayToPosition(int i2) {
        return firstPositionInMonth() + (i2 - 1);
    }

    public int findFirstValidDayPosition() {
        return findNextValidDayPosition(firstPositionInMonth() - 1);
    }

    public int findLastValidDayPosition() {
        return findPreviousValidDayPosition(lastPositionInMonth() + 1);
    }

    public int findNearestValidDayPositionInRow(int i2) {
        if (isDayPositionValid(i2)) {
            return i2;
        }
        long itemId = getItemId(i2);
        for (int i3 = 1; i3 < this.month.daysInWeek; i3++) {
            int i4 = i2 + i3;
            if (i4 < getCount() && getItemId(i4) == itemId && isDayPositionValid(i4)) {
                return i4;
            }
            int i5 = i2 - i3;
            if (i5 >= 0 && getItemId(i5) == itemId && isDayPositionValid(i5)) {
                return i5;
            }
        }
        return -1;
    }

    public int findNextValidDayPosition(int i2) {
        do {
            i2++;
            if (i2 > lastPositionInMonth()) {
                return -1;
            }
        } while (!isDayPositionValid(i2));
        return i2;
    }

    public int findPreviousValidDayPosition(int i2) {
        do {
            i2--;
            if (i2 < firstPositionInMonth()) {
                return -1;
            }
        } while (!isDayPositionValid(i2));
        return i2;
    }

    public int firstPositionInMonth() {
        return this.month.daysFromStartOfWeekToFirstOfMonth(this.calendarConstraints.getFirstDayOfWeek());
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return MAXIMUM_GRID_CELLS;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i2) {
        return i2 / this.month.daysInWeek;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return true;
    }

    public boolean isDayPositionValid(int i2) {
        Long item = getItem(i2);
        return item != null && this.calendarConstraints.getDateValidator().isValid(item.longValue());
    }

    @VisibleForTesting
    public boolean isEndOfRange(long j2) {
        Iterator<Pair<Long, Long>> it = this.dateSelector.getSelectedRanges().iterator();
        while (it.hasNext()) {
            Long l2 = it.next().second;
            if (l2 != null && l2.longValue() == j2) {
                return true;
            }
        }
        return false;
    }

    public boolean isFirstInRow(int i2) {
        return i2 % this.month.daysInWeek == 0;
    }

    public boolean isLastInRow(int i2) {
        return (i2 + 1) % this.month.daysInWeek == 0;
    }

    @VisibleForTesting
    public boolean isStartOfRange(long j2) {
        Iterator<Pair<Long, Long>> it = this.dateSelector.getSelectedRanges().iterator();
        while (it.hasNext()) {
            Long l2 = it.next().first;
            if (l2 != null && l2.longValue() == j2) {
                return true;
            }
        }
        return false;
    }

    public int lastPositionInMonth() {
        return (firstPositionInMonth() + this.month.daysInMonth) - 1;
    }

    public int positionToDay(int i2) {
        return (i2 - firstPositionInMonth()) + 1;
    }

    public void updateSelectedStates(MaterialCalendarGridView materialCalendarGridView) {
        Iterator<Long> it = this.previouslySelectedDates.iterator();
        while (it.hasNext()) {
            updateSelectedStateForDate(materialCalendarGridView, it.next().longValue());
        }
        DateSelector<?> dateSelector = this.dateSelector;
        if (dateSelector != null) {
            Iterator<Long> it2 = dateSelector.getSelectedDays().iterator();
            while (it2.hasNext()) {
                updateSelectedStateForDate(materialCalendarGridView, it2.next().longValue());
            }
            this.previouslySelectedDates = this.dateSelector.getSelectedDays();
        }
    }

    public boolean withinMonth(int i2) {
        return i2 >= firstPositionInMonth() && i2 <= lastPositionInMonth();
    }

    @Override // android.widget.Adapter
    @Nullable
    public Long getItem(int i2) {
        if (i2 < firstPositionInMonth() || i2 > lastPositionInMonth()) {
            return null;
        }
        return Long.valueOf(this.month.getDay(positionToDay(i2)));
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0054  */
    @Override // android.widget.Adapter
    @NonNull
    public TextView getView(int i2, @Nullable View view, @NonNull ViewGroup viewGroup) {
        int i3;
        initializeStyles(viewGroup.getContext());
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(C5183R.layout.mtrl_calendar_day, viewGroup, false);
        }
        int iFirstPositionInMonth = i2 - firstPositionInMonth();
        if (iFirstPositionInMonth >= 0) {
            Month month = this.month;
            if (iFirstPositionInMonth >= month.daysInMonth) {
                textView.setVisibility(8);
                textView.setEnabled(false);
                i3 = -1;
            } else {
                i3 = iFirstPositionInMonth + 1;
                textView.setTag(month);
                textView.setText(String.format(textView.getResources().getConfiguration().locale, TimeModel.NUMBER_FORMAT, Integer.valueOf(i3)));
                textView.setVisibility(0);
                textView.setEnabled(true);
            }
        } else {
            textView.setVisibility(8);
            textView.setEnabled(false);
            i3 = -1;
        }
        Long item = getItem(i2);
        if (item == null) {
            return textView;
        }
        updateSelectedState(textView, item.longValue(), i3);
        return textView;
    }
}
