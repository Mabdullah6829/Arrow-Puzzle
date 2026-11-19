package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.Resources;
import android.media.AudioManager;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.C5183R;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.internal.TextWatcherAdapter;
import com.google.android.material.internal.ViewUtils;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
class TimePickerTextInputPresenter implements TimePickerView.OnSelectionChange, TimePickerPresenter {
    private static final int HOURS_MAX_LENGTH = 2;
    private static final int HOURS_MAX_VALUE_12H = 12;
    private static final int HOURS_MAX_VALUE_24H = 23;
    private static final int MINUTES_MAX_LENGTH = 2;
    private static final int MINUTES_MAX_VALUE = 59;
    private final TimePickerTextInputKeyController controller;
    private final EditText hourEditText;
    private final String hourError24hText;
    private final String hourErrorText;
    private final TextView hourLabel;
    private final String hourText;
    private final ChipTextInputComboView hourTextInput;
    private final EditText minuteEditText;
    private final String minuteErrorText;
    private final TextView minuteLabel;
    private final String minuteText;
    private final ChipTextInputComboView minuteTextInput;
    private final TimeModel time;
    private final LinearLayout timePickerView;
    private MaterialButtonToggleGroup toggle;
    private final TextWatcher minuteTextWatcher = new TextWatcherAdapter() { // from class: com.google.android.material.timepicker.TimePickerTextInputPresenter.1
        @Override // com.google.android.material.internal.TextWatcherAdapter, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            try {
                if (TextUtils.isEmpty(editable)) {
                    TimePickerTextInputPresenter.this.time.setMinute(0);
                    TimePickerTextInputPresenter.this.clearMinuteError();
                } else if (editable.length() > 2) {
                    editable.delete(2, editable.length());
                    TimePickerTextInputPresenter timePickerTextInputPresenter = TimePickerTextInputPresenter.this;
                    timePickerTextInputPresenter.vibrateAndMaybeBeep(timePickerTextInputPresenter.minuteEditText);
                } else {
                    int i2 = Integer.parseInt(editable.toString());
                    if (i2 > 59) {
                        TimePickerTextInputPresenter.this.setMinuteError();
                    } else {
                        TimePickerTextInputPresenter.this.clearMinuteError();
                    }
                    TimePickerTextInputPresenter.this.time.setMinute(i2);
                }
            } catch (NumberFormatException unused) {
                TimePickerTextInputPresenter.this.setMinuteError();
            }
        }
    };
    private final TextWatcher hourTextWatcher = new TextWatcherAdapter() { // from class: com.google.android.material.timepicker.TimePickerTextInputPresenter.2
        @Override // com.google.android.material.internal.TextWatcherAdapter, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            try {
                if (TextUtils.isEmpty(editable)) {
                    TimePickerTextInputPresenter.this.time.setHour(0);
                    TimePickerTextInputPresenter.this.clearHourError();
                    return;
                }
                if (editable.length() > 2) {
                    editable.delete(2, editable.length());
                    TimePickerTextInputPresenter timePickerTextInputPresenter = TimePickerTextInputPresenter.this;
                    timePickerTextInputPresenter.vibrateAndMaybeBeep(timePickerTextInputPresenter.hourEditText);
                    return;
                }
                int i2 = Integer.parseInt(editable.toString());
                if ((TimePickerTextInputPresenter.this.time.format != 0 || i2 <= 12) && (TimePickerTextInputPresenter.this.time.format != 1 || i2 <= 23)) {
                    TimePickerTextInputPresenter.this.clearHourError();
                } else {
                    TimePickerTextInputPresenter.this.setHourError();
                }
                TimePickerTextInputPresenter.this.time.setHour(i2);
            } catch (NumberFormatException unused) {
                TimePickerTextInputPresenter.this.setHourError();
            }
        }
    };

    public TimePickerTextInputPresenter(LinearLayout linearLayout, final TimeModel timeModel) {
        this.timePickerView = linearLayout;
        this.time = timeModel;
        final Resources resources = linearLayout.getResources();
        ChipTextInputComboView chipTextInputComboView = (ChipTextInputComboView) linearLayout.findViewById(C5183R.id.material_minute_text_input);
        this.minuteTextInput = chipTextInputComboView;
        ChipTextInputComboView chipTextInputComboView2 = (ChipTextInputComboView) linearLayout.findViewById(C5183R.id.material_hour_text_input);
        this.hourTextInput = chipTextInputComboView2;
        int i2 = C5183R.id.material_label;
        TextView textView = (TextView) chipTextInputComboView.findViewById(i2);
        this.minuteLabel = textView;
        TextView textView2 = (TextView) chipTextInputComboView2.findViewById(i2);
        this.hourLabel = textView2;
        int i3 = C5183R.string.material_timepicker_minute;
        textView.setText(resources.getString(i3));
        textView.setImportantForAccessibility(2);
        int i4 = C5183R.string.material_timepicker_hour;
        textView2.setText(resources.getString(i4));
        textView2.setImportantForAccessibility(2);
        this.minuteText = resources.getString(i3);
        this.hourText = resources.getString(i4);
        this.minuteErrorText = resources.getString(C5183R.string.material_timepicker_minute_error);
        this.hourErrorText = resources.getString(C5183R.string.material_timepicker_hour_error);
        this.hourError24hText = resources.getString(C5183R.string.material_timepicker_hour_error_24h);
        int i5 = C5183R.id.selection_type;
        chipTextInputComboView.setTag(i5, 12);
        chipTextInputComboView2.setTag(i5, 10);
        if (timeModel.format == 0) {
            setupPeriodToggle();
        }
        ViewOnClickListenerC5540b viewOnClickListenerC5540b = new ViewOnClickListenerC5540b(this, 2);
        chipTextInputComboView2.setOnClickListener(viewOnClickListenerC5540b);
        chipTextInputComboView.setOnClickListener(viewOnClickListenerC5540b);
        EditText editText = chipTextInputComboView2.getTextInput().getEditText();
        this.hourEditText = editText;
        editText.setAccessibilityDelegate(setTimeUnitAccessibilityLabel(linearLayout.getResources(), i4));
        EditText editText2 = chipTextInputComboView.getTextInput().getEditText();
        this.minuteEditText = editText2;
        editText2.setAccessibilityDelegate(setTimeUnitAccessibilityLabel(linearLayout.getResources(), i3));
        this.controller = new TimePickerTextInputKeyController(chipTextInputComboView2, chipTextInputComboView, timeModel);
        chipTextInputComboView2.setChipDelegate(new ClickActionDelegate(linearLayout.getContext(), C5183R.string.material_hour_selection) { // from class: com.google.android.material.timepicker.TimePickerTextInputPresenter.3
            @Override // com.google.android.material.timepicker.ClickActionDelegate, androidx.core.view.AccessibilityDelegateCompat
            public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
                accessibilityNodeInfoCompat.setContentDescription(resources.getString(C5183R.string.material_timepicker_hour) + " " + view.getResources().getString(timeModel.getHourContentDescriptionResId(), String.valueOf(timeModel.getHourForDisplay())));
            }
        });
        chipTextInputComboView.setChipDelegate(new ClickActionDelegate(linearLayout.getContext(), C5183R.string.material_minute_selection) { // from class: com.google.android.material.timepicker.TimePickerTextInputPresenter.4
            @Override // com.google.android.material.timepicker.ClickActionDelegate, androidx.core.view.AccessibilityDelegateCompat
            public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
                accessibilityNodeInfoCompat.setContentDescription(resources.getString(C5183R.string.material_timepicker_minute) + " " + view.getResources().getString(C5183R.string.material_minute_suffix, String.valueOf(timeModel.minute)));
            }
        });
        initialize();
    }

    private void addTextWatchers() {
        this.hourEditText.addTextChangedListener(this.hourTextWatcher);
        this.minuteEditText.addTextChangedListener(this.minuteTextWatcher);
    }

    private void beep(@NonNull Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager != null) {
            audioManager.playSoundEffect(9);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHourError() {
        this.hourTextInput.setError(false);
        this.hourLabel.setText(this.hourText);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMinuteError() {
        this.minuteTextInput.setError(false);
        this.minuteLabel.setText(this.minuteText);
    }

    private static boolean isTouchExplorationEnabled(@NonNull Context context) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility");
        return accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(View view) {
        onSelectionChanged(((Integer) view.getTag(C5183R.id.selection_type)).intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setupPeriodToggle$1(MaterialButtonToggleGroup materialButtonToggleGroup, int i2, boolean z) {
        if (z) {
            this.time.setPeriod(i2 == C5183R.id.material_clock_period_pm_button ? 1 : 0);
        }
    }

    private void removeTextWatchers() {
        this.hourEditText.removeTextChangedListener(this.hourTextWatcher);
        this.minuteEditText.removeTextChangedListener(this.minuteTextWatcher);
    }

    private void requestAccessibilityFocusAndAnnounce(@NonNull ChipTextInputComboView chipTextInputComboView, @NonNull TextView textView) {
        chipTextInputComboView.requestAccessibilityFocus();
        textView.announceForAccessibility(textView.getText());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHourError() {
        this.hourTextInput.setError(true);
        this.hourLabel.setText(this.time.format == 1 ? this.hourError24hText : this.hourErrorText);
        TextView textView = this.hourLabel;
        textView.announceForAccessibility(textView.getText());
        vibrateAndMaybeBeep(this.hourLabel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMinuteError() {
        this.minuteTextInput.setError(true);
        this.minuteLabel.setText(this.minuteErrorText);
        TextView textView = this.minuteLabel;
        textView.announceForAccessibility(textView.getText());
        vibrateAndMaybeBeep(this.minuteLabel);
    }

    private void setTime(TimeModel timeModel) {
        removeTextWatchers();
        Locale locale = this.timePickerView.getResources().getConfiguration().locale;
        String str = String.format(locale, TimeModel.ZERO_LEADING_NUMBER_FORMAT, Integer.valueOf(timeModel.minute));
        String str2 = String.format(locale, TimeModel.ZERO_LEADING_NUMBER_FORMAT, Integer.valueOf(timeModel.getHourForDisplay()));
        this.minuteTextInput.setText(str);
        this.hourTextInput.setText(str2);
        addTextWatchers();
        onSelectionChanged(timeModel.selection);
    }

    private View.AccessibilityDelegate setTimeUnitAccessibilityLabel(final Resources resources, final int i2) {
        return new View.AccessibilityDelegate() { // from class: com.google.android.material.timepicker.TimePickerTextInputPresenter.5
            @Override // android.view.View.AccessibilityDelegate
            public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                accessibilityNodeInfo.setText(resources.getString(i2));
            }
        };
    }

    private void setupPeriodToggle() {
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) this.timePickerView.findViewById(C5183R.id.material_clock_period_toggle);
        this.toggle = materialButtonToggleGroup;
        materialButtonToggleGroup.addOnButtonCheckedListener(new C5542d(this, 0));
        this.toggle.setVisibility(0);
        updateSelection();
    }

    private void updateSelection() {
        MaterialButtonToggleGroup materialButtonToggleGroup = this.toggle;
        if (materialButtonToggleGroup == null) {
            return;
        }
        materialButtonToggleGroup.check(this.time.period == 0 ? C5183R.id.material_clock_period_am_button : C5183R.id.material_clock_period_pm_button);
    }

    private void vibrate(@NonNull View view) {
        ViewCompat.performHapticFeedback(view, 17);
    }

    public void accessibilityFocusOnError() {
        if (this.hourTextInput.hasError()) {
            requestAccessibilityFocusAndAnnounce(this.hourTextInput, this.hourLabel);
        } else if (this.minuteTextInput.hasError()) {
            requestAccessibilityFocusAndAnnounce(this.minuteTextInput, this.minuteLabel);
        }
    }

    public void clearCheck() {
        this.minuteTextInput.setChecked(false);
        this.hourTextInput.setChecked(false);
    }

    public void clearError() {
        clearMinuteError();
        clearHourError();
    }

    public boolean hasError() {
        return this.minuteTextInput.hasError() || this.hourTextInput.hasError();
    }

    @Override // com.google.android.material.timepicker.TimePickerPresenter
    public void hide() {
        View focusedChild = this.timePickerView.getFocusedChild();
        if (focusedChild != null) {
            ViewUtils.hideKeyboard(focusedChild, false);
        }
        this.timePickerView.setVisibility(8);
    }

    @Override // com.google.android.material.timepicker.TimePickerPresenter
    public void initialize() {
        addTextWatchers();
        setTime(this.time);
        this.controller.bind();
    }

    @Override // com.google.android.material.timepicker.TimePickerPresenter
    public void invalidate() {
        setTime(this.time);
    }

    @Override // com.google.android.material.timepicker.TimePickerView.OnSelectionChange
    public void onSelectionChanged(int i2) {
        this.time.selection = i2;
        this.minuteTextInput.setChecked(i2 == 12);
        this.hourTextInput.setChecked(i2 == 10);
        updateSelection();
    }

    public void resetChecked() {
        this.minuteTextInput.setChecked(this.time.selection == 12);
        this.hourTextInput.setChecked(this.time.selection == 10);
    }

    @Override // com.google.android.material.timepicker.TimePickerPresenter
    public void show() {
        this.timePickerView.setVisibility(0);
        onSelectionChanged(this.time.selection);
    }

    public void vibrateAndMaybeBeep(@NonNull View view) {
        vibrate(view);
        if (isTouchExplorationEnabled(view.getContext())) {
            return;
        }
        beep(view.getContext());
    }
}
