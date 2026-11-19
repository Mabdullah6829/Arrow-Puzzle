package com.google.android.material.timepicker;

import com.google.android.material.button.MaterialButtonToggleGroup;

/* JADX INFO: renamed from: com.google.android.material.timepicker.d */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5542d implements MaterialButtonToggleGroup.OnButtonCheckedListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f23522a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f23523b;

    public /* synthetic */ C5542d(Object obj, int i2) {
        this.f23522a = i2;
        this.f23523b = obj;
    }

    @Override // com.google.android.material.button.MaterialButtonToggleGroup.OnButtonCheckedListener
    public final void onButtonChecked(MaterialButtonToggleGroup materialButtonToggleGroup, int i2, boolean z) {
        switch (this.f23522a) {
            case 0:
                ((TimePickerTextInputPresenter) this.f23523b).lambda$setupPeriodToggle$1(materialButtonToggleGroup, i2, z);
                break;
            default:
                ((TimePickerView) this.f23523b).lambda$new$0(materialButtonToggleGroup, i2, z);
                break;
        }
    }
}
