package com.google.android.material.textfield;

import android.view.View;

/* JADX INFO: renamed from: com.google.android.material.textfield.a */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC5515a implements View.OnClickListener {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ int f23503s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ EndIconDelegate f23504t;

    public /* synthetic */ ViewOnClickListenerC5515a(EndIconDelegate endIconDelegate, int i2) {
        this.f23503s = i2;
        this.f23504t = endIconDelegate;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f23503s) {
            case 0:
                ((ClearTextEndIconDelegate) this.f23504t).lambda$new$0(view);
                break;
            case 1:
                ((DropdownMenuEndIconDelegate) this.f23504t).lambda$new$0(view);
                break;
            default:
                ((PasswordToggleEndIconDelegate) this.f23504t).lambda$new$0(view);
                break;
        }
    }
}
