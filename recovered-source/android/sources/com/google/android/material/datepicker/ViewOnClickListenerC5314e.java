package com.google.android.material.datepicker;

import android.view.View;

/* JADX INFO: renamed from: com.google.android.material.datepicker.e */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC5314e implements View.OnClickListener {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ int f23421s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ MaterialDatePicker f23422t;

    public /* synthetic */ ViewOnClickListenerC5314e(MaterialDatePicker materialDatePicker, int i2) {
        this.f23421s = i2;
        this.f23422t = materialDatePicker;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f23421s) {
            case 0:
                this.f23422t.lambda$initHeaderToggle$0(view);
                break;
            case 1:
                this.f23422t.onPositiveButtonClick(view);
                break;
            default:
                this.f23422t.onNegativeButtonClick(view);
                break;
        }
    }
}
