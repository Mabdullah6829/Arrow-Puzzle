package com.google.android.material.textfield;

import android.view.View;

/* JADX INFO: renamed from: com.google.android.material.textfield.b */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ViewOnFocusChangeListenerC5516b implements View.OnFocusChangeListener {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ int f23505s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ EndIconDelegate f23506t;

    public /* synthetic */ ViewOnFocusChangeListenerC5516b(EndIconDelegate endIconDelegate, int i2) {
        this.f23505s = i2;
        this.f23506t = endIconDelegate;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        switch (this.f23505s) {
            case 0:
                ((ClearTextEndIconDelegate) this.f23506t).lambda$new$1(view, z);
                break;
            default:
                ((DropdownMenuEndIconDelegate) this.f23506t).lambda$new$1(view, z);
                break;
        }
    }
}
