package com.google.android.material.datepicker;

import android.view.View;
import com.google.android.material.internal.ViewUtils;

/* JADX INFO: renamed from: com.google.android.material.datepicker.d */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC5313d implements Runnable {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ int f23419s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ View f23420t;

    public /* synthetic */ RunnableC5313d(View view, int i2) {
        this.f23419s = i2;
        this.f23420t = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f23419s) {
            case 0:
                ((MaterialCalendarGridView) this.f23420t).lambda$onAttachedToWindow$0();
                break;
            default:
                ViewUtils.requestFocusAndShowKeyboard(this.f23420t, false);
                break;
        }
    }
}
