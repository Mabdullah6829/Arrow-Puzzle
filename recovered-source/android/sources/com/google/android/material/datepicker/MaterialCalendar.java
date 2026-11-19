package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.widget.TooltipCompat;
import androidx.core.util.Pair;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.PagerSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.C5183R;
import com.google.android.material.button.MaterialButton;
import java.util.Calendar;
import java.util.Iterator;
import p011H.AbstractC0271e0;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class MaterialCalendar<S> extends PickerFragment<S> {
    private static final String CALENDAR_CONSTRAINTS_KEY = "CALENDAR_CONSTRAINTS_KEY";
    private static final String CURRENT_MONTH_KEY = "CURRENT_MONTH_KEY";
    private static final String DAY_VIEW_DECORATOR_KEY = "DAY_VIEW_DECORATOR_KEY";
    private static final String GRID_SELECTOR_KEY = "GRID_SELECTOR_KEY";
    private static final int SMOOTH_SCROLL_MAX = 3;
    private static final String THEME_RES_ID_KEY = "THEME_RES_ID_KEY";
    private AccessibilityManager accessibilityManager;

    @Nullable
    private CalendarConstraints calendarConstraints;
    private CalendarSelector calendarSelector;
    private CalendarStyle calendarStyle;

    @Nullable
    private Month current;

    @Nullable
    private DateSelector<S> dateSelector;
    private View dayFrame;

    @Nullable
    private DayViewDecorator dayViewDecorator;
    private boolean isFullscreen;
    private MaterialButton monthDropSelect;
    private View monthNext;
    private View monthPrev;

    @Nullable
    private PagerSnapHelper pagerSnapHelper;
    private RecyclerView recyclerView;

    @StyleRes
    private int themeResId;
    private View yearFrame;
    private RecyclerView yearSelector;

    @VisibleForTesting
    static final Object MONTHS_VIEW_GROUP_TAG = "MONTHS_VIEW_GROUP_TAG";

    @VisibleForTesting
    static final Object NAVIGATION_PREV_TAG = "NAVIGATION_PREV_TAG";

    @VisibleForTesting
    static final Object NAVIGATION_NEXT_TAG = "NAVIGATION_NEXT_TAG";

    @VisibleForTesting
    static final Object SELECTOR_TOGGLE_TAG = "SELECTOR_TOGGLE_TAG";

    public enum CalendarSelector {
        DAY,
        YEAR
    }

    public interface OnDayClickListener {
        void onDayClick(long j2);
    }

    public interface OnMonthNavigationListener {
        boolean onMonthNavigationNext();

        boolean onMonthNavigationPrevious();
    }

    private void addActionsToMonthNavigation(@NonNull View view, @NonNull final MonthsPagerAdapter monthsPagerAdapter) {
        MaterialButton materialButton = (MaterialButton) view.findViewById(C5183R.id.month_navigation_fragment_toggle);
        this.monthDropSelect = materialButton;
        materialButton.setTag(SELECTOR_TOGGLE_TAG);
        ViewCompat.setAccessibilityDelegate(this.monthDropSelect, new AccessibilityDelegateCompat() { // from class: com.google.android.material.datepicker.MaterialCalendar.7
            @Override // androidx.core.view.AccessibilityDelegateCompat
            public void onInitializeAccessibilityNodeInfo(View view2, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                super.onInitializeAccessibilityNodeInfo(view2, accessibilityNodeInfoCompat);
                accessibilityNodeInfoCompat.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(16, MaterialCalendar.this.dayFrame.getVisibility() == 0 ? MaterialCalendar.this.getString(C5183R.string.mtrl_picker_toggle_to_year_selection) : MaterialCalendar.this.getString(C5183R.string.mtrl_picker_toggle_to_day_selection)));
            }
        });
        View viewFindViewById = view.findViewById(C5183R.id.month_navigation_previous);
        this.monthPrev = viewFindViewById;
        viewFindViewById.setTag(NAVIGATION_PREV_TAG);
        TooltipCompat.setTooltipText(this.monthPrev, getString(C5183R.string.mtrl_picker_prev_month_tooltip));
        View viewFindViewById2 = view.findViewById(C5183R.id.month_navigation_next);
        this.monthNext = viewFindViewById2;
        viewFindViewById2.setTag(NAVIGATION_NEXT_TAG);
        TooltipCompat.setTooltipText(this.monthNext, getString(C5183R.string.mtrl_picker_next_month_tooltip));
        this.yearFrame = view.findViewById(C5183R.id.mtrl_calendar_year_selector_frame);
        this.dayFrame = view.findViewById(C5183R.id.mtrl_calendar_day_selector_frame);
        setSelector(CalendarSelector.DAY);
        this.monthDropSelect.setText(this.current.getLongName());
        this.recyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() { // from class: com.google.android.material.datepicker.MaterialCalendar.8
            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int i2) {
                int childAdapterPosition;
                if (i2 != 0 || MaterialCalendar.this.pagerSnapHelper == null) {
                    return;
                }
                View viewFindSnapView = MaterialCalendar.this.pagerSnapHelper.findSnapView(MaterialCalendar.this.getLayoutManager());
                if (viewFindSnapView != null && (childAdapterPosition = recyclerView.getChildAdapterPosition(viewFindSnapView)) != -1) {
                    MaterialCalendar.this.current = monthsPagerAdapter.getPageMonth(childAdapterPosition);
                    MaterialCalendar.this.monthDropSelect.setText(monthsPagerAdapter.getPageTitle(childAdapterPosition));
                    MaterialCalendar.this.updateNavigationButtonsEnabled(childAdapterPosition);
                }
                MaterialCalendar.this.updateCurrentVisibleMonth();
            }

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrolled(@NonNull RecyclerView recyclerView, int i2, int i3) {
                int iFindFirstVisibleItemPosition = i2 < 0 ? MaterialCalendar.this.getLayoutManager().findFirstVisibleItemPosition() : MaterialCalendar.this.getLayoutManager().findLastVisibleItemPosition();
                if (MaterialCalendar.this.pagerSnapHelper == null) {
                    MaterialCalendar.this.current = monthsPagerAdapter.getPageMonth(iFindFirstVisibleItemPosition);
                }
                MaterialCalendar.this.monthDropSelect.setText(monthsPagerAdapter.getPageTitle(iFindFirstVisibleItemPosition));
                MaterialCalendar.this.updateNavigationButtonsEnabled(iFindFirstVisibleItemPosition);
            }
        });
        this.monthDropSelect.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.material.datepicker.MaterialCalendar.9
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                MaterialCalendar.this.toggleVisibleSelector();
            }
        });
        this.monthNext.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.material.datepicker.MaterialCalendar.10
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                int iFindFirstVisibleItemPosition = MaterialCalendar.this.getLayoutManager().findFirstVisibleItemPosition();
                monthsPagerAdapter.setKeyboardFocusDirection(2);
                MaterialCalendar.this.setCurrentMonth(monthsPagerAdapter.getPageMonth(iFindFirstVisibleItemPosition + 1));
            }
        });
        this.monthPrev.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.material.datepicker.MaterialCalendar.11
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                int iFindLastVisibleItemPosition = MaterialCalendar.this.getLayoutManager().findLastVisibleItemPosition();
                monthsPagerAdapter.setKeyboardFocusDirection(1);
                MaterialCalendar.this.setCurrentMonth(monthsPagerAdapter.getPageMonth(iFindLastVisibleItemPosition - 1));
            }
        });
        updateNavigationButtonsEnabled(monthsPagerAdapter.getPosition(this.current));
    }

    @NonNull
    private RecyclerView.ItemDecoration createItemDecoration() {
        return new RecyclerView.ItemDecoration() { // from class: com.google.android.material.datepicker.MaterialCalendar.6
            private final Calendar startItem = UtcDates.getUtcCalendar();
            private final Calendar endItem = UtcDates.getUtcCalendar();

            @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
            public void onDraw(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.State state) {
                if ((recyclerView.getAdapter() instanceof YearGridAdapter) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
                    YearGridAdapter yearGridAdapter = (YearGridAdapter) recyclerView.getAdapter();
                    GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
                    for (Pair<Long, Long> pair : MaterialCalendar.this.dateSelector.getSelectedRanges()) {
                        Long l2 = pair.first;
                        if (l2 != null && pair.second != null) {
                            this.startItem.setTimeInMillis(l2.longValue());
                            this.endItem.setTimeInMillis(pair.second.longValue());
                            int positionForYear = yearGridAdapter.getPositionForYear(this.startItem.get(1));
                            int positionForYear2 = yearGridAdapter.getPositionForYear(this.endItem.get(1));
                            View viewFindViewByPosition = gridLayoutManager.findViewByPosition(positionForYear);
                            View viewFindViewByPosition2 = gridLayoutManager.findViewByPosition(positionForYear2);
                            int spanCount = positionForYear / gridLayoutManager.getSpanCount();
                            int spanCount2 = positionForYear2 / gridLayoutManager.getSpanCount();
                            for (int i2 = spanCount; i2 <= spanCount2; i2++) {
                                View viewFindViewByPosition3 = gridLayoutManager.findViewByPosition(gridLayoutManager.getSpanCount() * i2);
                                if (viewFindViewByPosition3 != null) {
                                    int top = viewFindViewByPosition3.getTop() + MaterialCalendar.this.calendarStyle.year.getTopInset();
                                    int bottom = viewFindViewByPosition3.getBottom() - MaterialCalendar.this.calendarStyle.year.getBottomInset();
                                    canvas.drawRect((i2 != spanCount || viewFindViewByPosition == null) ? 0 : (viewFindViewByPosition.getWidth() / 2) + viewFindViewByPosition.getLeft(), top, (i2 != spanCount2 || viewFindViewByPosition2 == null) ? recyclerView.getWidth() : (viewFindViewByPosition2.getWidth() / 2) + viewFindViewByPosition2.getLeft(), bottom, MaterialCalendar.this.calendarStyle.rangeFill);
                                }
                            }
                        }
                    }
                }
            }
        };
    }

    @Px
    public static int getDayHeight(@NonNull Context context) {
        return context.getResources().getDimensionPixelSize(C5183R.dimen.mtrl_calendar_day_height);
    }

    private static int getDialogPickerHeight(@NonNull Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(C5183R.dimen.mtrl_calendar_navigation_bottom_padding) + resources.getDimensionPixelOffset(C5183R.dimen.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelSize(C5183R.dimen.mtrl_calendar_navigation_height);
        int dimensionPixelSize = resources.getDimensionPixelSize(C5183R.dimen.mtrl_calendar_days_of_week_height);
        int i2 = MonthAdapter.MAXIMUM_WEEKS;
        return AbstractC0271e0.m395c(dimensionPixelOffset, dimensionPixelSize, (resources.getDimensionPixelOffset(C5183R.dimen.mtrl_calendar_month_vertical_padding) * (i2 - 1)) + (resources.getDimensionPixelSize(C5183R.dimen.mtrl_calendar_day_height) * i2), resources.getDimensionPixelOffset(C5183R.dimen.mtrl_calendar_bottom_padding));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean handleNavigateToMonthForKeyboard(boolean z) {
        Month month;
        if (this.isFullscreen) {
            return false;
        }
        if (this.recyclerView.getScrollState() != 0) {
            return true;
        }
        MonthsPagerAdapter monthsPagerAdapter = (MonthsPagerAdapter) this.recyclerView.getAdapter();
        if (monthsPagerAdapter != null && (month = this.current) != null) {
            int position = monthsPagerAdapter.getPosition(month) + (z ? 1 : -1);
            if (position >= 0 && position < monthsPagerAdapter.getItemCount()) {
                monthsPagerAdapter.setKeyboardFocusDirection(z ? 2 : 1);
                setCurrentMonth(monthsPagerAdapter.getPageMonth(position));
                return true;
            }
        }
        return false;
    }

    @NonNull
    public static <T> MaterialCalendar<T> newInstance(@NonNull DateSelector<T> dateSelector, @StyleRes int i2, @NonNull CalendarConstraints calendarConstraints) {
        return newInstance(dateSelector, i2, calendarConstraints, null);
    }

    private void postSmoothRecyclerViewScroll(final int i2) {
        this.recyclerView.post(new Runnable() { // from class: com.google.android.material.datepicker.MaterialCalendar.12
            @Override // java.lang.Runnable
            public void run() {
                MaterialCalendar.this.recyclerView.smoothScrollToPosition(i2);
            }
        });
    }

    private void setUpForAccessibility() {
        ViewCompat.setAccessibilityDelegate(this.recyclerView, new AccessibilityDelegateCompat() { // from class: com.google.android.material.datepicker.MaterialCalendar.5
            @Override // androidx.core.view.AccessibilityDelegateCompat
            public void onInitializeAccessibilityNodeInfo(View view, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
                accessibilityNodeInfoCompat.setScrollable(false);
            }
        });
    }

    private void updateAccessibilityPaneTitle(@Nullable View view) {
        if (view == null) {
            return;
        }
        CalendarSelector calendarSelector = this.calendarSelector;
        if (calendarSelector == CalendarSelector.YEAR) {
            ViewCompat.setAccessibilityPaneTitle(view, getString(C5183R.string.mtrl_picker_pane_title_year_view));
        } else if (calendarSelector == CalendarSelector.DAY) {
            ViewCompat.setAccessibilityPaneTitle(view, getString(C5183R.string.mtrl_picker_pane_title_calendar_view));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateCurrentVisibleMonth() {
        MonthsPagerAdapter monthsPagerAdapter = (MonthsPagerAdapter) this.recyclerView.getAdapter();
        if (monthsPagerAdapter == null || this.isFullscreen) {
            return;
        }
        monthsPagerAdapter.setVisibleMonth(this.current);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateNavigationButtonsEnabled(int i2) {
        View view = this.monthNext;
        if (view != null) {
            view.setEnabled(i2 + 1 < this.recyclerView.getAdapter().getItemCount());
        }
        View view2 = this.monthPrev;
        if (view2 != null) {
            view2.setEnabled(i2 - 1 >= 0);
        }
    }

    @Override // com.google.android.material.datepicker.PickerFragment
    public boolean addOnSelectionChangedListener(@NonNull OnSelectionChangedListener<S> onSelectionChangedListener) {
        return super.addOnSelectionChangedListener(onSelectionChangedListener);
    }

    @Nullable
    public CalendarConstraints getCalendarConstraints() {
        return this.calendarConstraints;
    }

    public CalendarStyle getCalendarStyle() {
        return this.calendarStyle;
    }

    @Nullable
    public Month getCurrentMonth() {
        return this.current;
    }

    @Override // com.google.android.material.datepicker.PickerFragment
    @Nullable
    public DateSelector<S> getDateSelector() {
        return this.dateSelector;
    }

    @NonNull
    public LinearLayoutManager getLayoutManager() {
        return (LinearLayoutManager) this.recyclerView.getLayoutManager();
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.themeResId = bundle.getInt(THEME_RES_ID_KEY);
        this.dateSelector = (DateSelector) bundle.getParcelable(GRID_SELECTOR_KEY);
        this.calendarConstraints = (CalendarConstraints) bundle.getParcelable(CALENDAR_CONSTRAINTS_KEY);
        this.dayViewDecorator = (DayViewDecorator) bundle.getParcelable(DAY_VIEW_DECORATOR_KEY);
        this.current = (Month) bundle.getParcelable(CURRENT_MONTH_KEY);
    }

    @Override // androidx.fragment.app.Fragment
    @NonNull
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        int i2;
        final int i3;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getContext(), this.themeResId);
        this.calendarStyle = new CalendarStyle(contextThemeWrapper);
        LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        this.accessibilityManager = (AccessibilityManager) requireContext().getSystemService("accessibility");
        Month start = this.calendarConstraints.getStart();
        boolean zIsFullscreen = MaterialDatePicker.isFullscreen(contextThemeWrapper);
        this.isFullscreen = zIsFullscreen;
        if (zIsFullscreen) {
            i2 = C5183R.layout.mtrl_calendar_vertical;
            i3 = 1;
        } else {
            i2 = C5183R.layout.mtrl_calendar_horizontal;
            i3 = 0;
        }
        View viewInflate = layoutInflaterCloneInContext.inflate(i2, viewGroup, false);
        viewInflate.setMinimumHeight(getDialogPickerHeight(requireContext()));
        GridView gridView = (GridView) viewInflate.findViewById(C5183R.id.mtrl_calendar_days_of_week);
        ViewCompat.setAccessibilityDelegate(gridView, new AccessibilityDelegateCompat() { // from class: com.google.android.material.datepicker.MaterialCalendar.1
            @Override // androidx.core.view.AccessibilityDelegateCompat
            public void onInitializeAccessibilityNodeInfo(View view, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
                accessibilityNodeInfoCompat.setCollectionInfo(null);
            }
        });
        int firstDayOfWeek = this.calendarConstraints.getFirstDayOfWeek();
        gridView.setAdapter((ListAdapter) (firstDayOfWeek > 0 ? new DaysOfWeekAdapter(firstDayOfWeek) : new DaysOfWeekAdapter()));
        gridView.setNumColumns(start.daysInWeek);
        gridView.setEnabled(false);
        this.recyclerView = (RecyclerView) viewInflate.findViewById(C5183R.id.mtrl_calendar_months);
        this.recyclerView.setLayoutManager(new SmoothCalendarLayoutManager(getContext(), i3, false) { // from class: com.google.android.material.datepicker.MaterialCalendar.2
            @Override // androidx.recyclerview.widget.LinearLayoutManager
            public void calculateExtraLayoutSpace(@NonNull RecyclerView.State state, @NonNull int[] iArr) {
                if (i3 == 0) {
                    iArr[0] = MaterialCalendar.this.recyclerView.getWidth();
                    iArr[1] = MaterialCalendar.this.recyclerView.getWidth();
                } else {
                    iArr[0] = MaterialCalendar.this.recyclerView.getHeight();
                    iArr[1] = MaterialCalendar.this.recyclerView.getHeight();
                }
            }
        });
        this.recyclerView.setTag(MONTHS_VIEW_GROUP_TAG);
        MonthsPagerAdapter monthsPagerAdapter = new MonthsPagerAdapter(contextThemeWrapper, this.dateSelector, this.calendarConstraints, this.dayViewDecorator, new OnDayClickListener() { // from class: com.google.android.material.datepicker.MaterialCalendar.3
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.material.datepicker.MaterialCalendar.OnDayClickListener
            public void onDayClick(long j2) {
                if (MaterialCalendar.this.calendarConstraints.getDateValidator().isValid(j2)) {
                    MaterialCalendar.this.dateSelector.select(j2);
                    Iterator<OnSelectionChangedListener<S>> it = MaterialCalendar.this.onSelectionChangedListeners.iterator();
                    while (it.hasNext()) {
                        it.next().onSelectionChanged(MaterialCalendar.this.dateSelector.getSelection());
                    }
                    MaterialCalendar.this.recyclerView.getAdapter().notifyDataSetChanged();
                    if (MaterialCalendar.this.yearSelector != null) {
                        MaterialCalendar.this.yearSelector.getAdapter().notifyDataSetChanged();
                    }
                }
            }
        }, new OnMonthNavigationListener() { // from class: com.google.android.material.datepicker.MaterialCalendar.4
            @Override // com.google.android.material.datepicker.MaterialCalendar.OnMonthNavigationListener
            public boolean onMonthNavigationNext() {
                return MaterialCalendar.this.handleNavigateToMonthForKeyboard(true);
            }

            @Override // com.google.android.material.datepicker.MaterialCalendar.OnMonthNavigationListener
            public boolean onMonthNavigationPrevious() {
                return MaterialCalendar.this.handleNavigateToMonthForKeyboard(false);
            }
        });
        this.recyclerView.setAdapter(monthsPagerAdapter);
        int integer = contextThemeWrapper.getResources().getInteger(C5183R.integer.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(C5183R.id.mtrl_calendar_year_selector_frame);
        this.yearSelector = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.yearSelector.setLayoutManager(new GridLayoutManager((Context) contextThemeWrapper, integer, 1, false));
            this.yearSelector.setAdapter(new YearGridAdapter(this));
            this.yearSelector.addItemDecoration(createItemDecoration());
        }
        if (!this.isFullscreen) {
            PagerSnapHelper pagerSnapHelper = new PagerSnapHelper();
            this.pagerSnapHelper = pagerSnapHelper;
            pagerSnapHelper.attachToRecyclerView(this.recyclerView);
        }
        if (viewInflate.findViewById(C5183R.id.month_navigation_fragment_toggle) != null) {
            addActionsToMonthNavigation(viewInflate, monthsPagerAdapter);
        }
        this.recyclerView.scrollToPosition(monthsPagerAdapter.getPosition(this.current));
        setUpForAccessibility();
        updateAccessibilityPaneTitle(viewInflate);
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt(THEME_RES_ID_KEY, this.themeResId);
        bundle.putParcelable(GRID_SELECTOR_KEY, this.dateSelector);
        bundle.putParcelable(CALENDAR_CONSTRAINTS_KEY, this.calendarConstraints);
        bundle.putParcelable(DAY_VIEW_DECORATOR_KEY, this.dayViewDecorator);
        bundle.putParcelable(CURRENT_MONTH_KEY, this.current);
    }

    public void sendAccessibilityFocusEventToMonthDropdown() {
        MaterialButton materialButton = this.monthDropSelect;
        if (materialButton != null) {
            materialButton.sendAccessibilityEvent(8);
        }
    }

    public void setCurrentMonth(Month month) {
        MonthsPagerAdapter monthsPagerAdapter = (MonthsPagerAdapter) this.recyclerView.getAdapter();
        int position = monthsPagerAdapter.getPosition(month);
        AccessibilityManager accessibilityManager = this.accessibilityManager;
        if (accessibilityManager == null || !accessibilityManager.isEnabled()) {
            int position2 = position - monthsPagerAdapter.getPosition(this.current);
            boolean z = Math.abs(position2) > 3;
            boolean z2 = position2 > 0;
            this.current = month;
            if (z && z2) {
                this.recyclerView.scrollToPosition(position - 3);
                postSmoothRecyclerViewScroll(position);
            } else if (z) {
                this.recyclerView.scrollToPosition(position + 3);
                postSmoothRecyclerViewScroll(position);
            } else {
                postSmoothRecyclerViewScroll(position);
            }
        } else {
            this.current = month;
            this.recyclerView.scrollToPosition(position);
        }
        updateCurrentVisibleMonth();
        updateNavigationButtonsEnabled(position);
    }

    public void setSelector(CalendarSelector calendarSelector) {
        this.calendarSelector = calendarSelector;
        if (calendarSelector == CalendarSelector.YEAR) {
            this.yearSelector.getLayoutManager().scrollToPosition(((YearGridAdapter) this.yearSelector.getAdapter()).getPositionForYear(this.current.year));
            this.yearFrame.setVisibility(0);
            this.dayFrame.setVisibility(8);
            this.monthPrev.setVisibility(8);
            this.monthNext.setVisibility(8);
            return;
        }
        if (calendarSelector == CalendarSelector.DAY) {
            this.yearFrame.setVisibility(8);
            this.dayFrame.setVisibility(0);
            this.monthPrev.setVisibility(0);
            this.monthNext.setVisibility(0);
            setCurrentMonth(this.current);
        }
    }

    public void toggleVisibleSelector() {
        CalendarSelector calendarSelector = this.calendarSelector;
        CalendarSelector calendarSelector2 = CalendarSelector.YEAR;
        if (calendarSelector == calendarSelector2) {
            setSelector(CalendarSelector.DAY);
        } else if (calendarSelector == CalendarSelector.DAY) {
            setSelector(calendarSelector2);
        }
        updateAccessibilityPaneTitle(getView());
    }

    @NonNull
    public static <T> MaterialCalendar<T> newInstance(@NonNull DateSelector<T> dateSelector, @StyleRes int i2, @NonNull CalendarConstraints calendarConstraints, @Nullable DayViewDecorator dayViewDecorator) {
        MaterialCalendar<T> materialCalendar = new MaterialCalendar<>();
        Bundle bundle = new Bundle();
        bundle.putInt(THEME_RES_ID_KEY, i2);
        bundle.putParcelable(GRID_SELECTOR_KEY, dateSelector);
        bundle.putParcelable(CALENDAR_CONSTRAINTS_KEY, calendarConstraints);
        bundle.putParcelable(DAY_VIEW_DECORATOR_KEY, dayViewDecorator);
        bundle.putParcelable(CURRENT_MONTH_KEY, calendarConstraints.getOpenAt());
        materialCalendar.setArguments(bundle);
        return materialCalendar;
    }
}
