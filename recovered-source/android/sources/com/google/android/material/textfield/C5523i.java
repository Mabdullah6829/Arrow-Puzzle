package com.google.android.material.textfield;

import android.text.StaticLayout;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.StaticLayoutBuilderConfigurer;

/* JADX INFO: renamed from: com.google.android.material.textfield.i */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5523i implements CheckableImageButton.OnFocusableChangedListener, StaticLayoutBuilderConfigurer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ LinearLayout f23516a;

    public /* synthetic */ C5523i(LinearLayout linearLayout) {
        this.f23516a = linearLayout;
    }

    @Override // com.google.android.material.internal.StaticLayoutBuilderConfigurer
    public void configure(StaticLayout.Builder builder) {
        ((TextInputLayout) this.f23516a).lambda$updateEditTextHeight$2(builder);
    }

    @Override // com.google.android.material.internal.CheckableImageButton.OnFocusableChangedListener
    public void onFocusableChanged(View view, boolean z) {
        ((StartCompoundLayout) this.f23516a).lambda$new$0(view, z);
    }
}
