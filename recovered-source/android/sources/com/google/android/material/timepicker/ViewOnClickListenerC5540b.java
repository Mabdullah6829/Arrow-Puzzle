package com.google.android.material.timepicker;

import android.view.View;

/* JADX INFO: renamed from: com.google.android.material.timepicker.b */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC5540b implements View.OnClickListener {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ int f23518s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ Object f23519t;

    public /* synthetic */ ViewOnClickListenerC5540b(Object obj, int i2) {
        this.f23518s = i2;
        this.f23519t = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f23518s) {
            case 0:
                ((MaterialTimePicker) this.f23519t).lambda$onCreateView$1(view);
                break;
            case 1:
                ((MaterialTimePicker) this.f23519t).lambda$onCreateView$2(view);
                break;
            default:
                ((TimePickerTextInputPresenter) this.f23519t).lambda$new$0(view);
                break;
        }
    }
}
