package com.google.android.material.button;

import android.view.View;
import com.google.android.material.snackbar.Snackbar;

/* JADX INFO: renamed from: com.google.android.material.button.b */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC5240b implements View.OnClickListener {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ int f23370s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ Object f23371t;

    public /* synthetic */ ViewOnClickListenerC5240b(Object obj, int i2) {
        this.f23370s = i2;
        this.f23371t = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f23370s) {
            case 0:
                ((MaterialButtonGroup) this.f23371t).lambda$initializeButtonOverflow$1(view);
                break;
            default:
                ((Snackbar) this.f23371t).lambda$setCloseIconVisible$1(view);
                break;
        }
    }
}
