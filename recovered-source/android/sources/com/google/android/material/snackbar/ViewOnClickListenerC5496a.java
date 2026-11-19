package com.google.android.material.snackbar;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.timepicker.MaterialTimePicker;

/* JADX INFO: renamed from: com.google.android.material.snackbar.a */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC5496a implements View.OnClickListener {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ int f23499s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ Object f23500t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ Object f23501u;

    public /* synthetic */ ViewOnClickListenerC5496a(int i2, Object obj, Object obj2) {
        this.f23499s = i2;
        this.f23500t = obj;
        this.f23501u = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f23499s) {
            case 0:
                ((Snackbar) this.f23500t).lambda$setAction$0((View.OnClickListener) this.f23501u, view);
                break;
            default:
                ((MaterialTimePicker) this.f23500t).lambda$onCreateView$0((ViewGroup) this.f23501u, view);
                break;
        }
    }
}
