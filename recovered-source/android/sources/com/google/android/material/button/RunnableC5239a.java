package com.google.android.material.button;

import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: com.google.android.material.button.a */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC5239a implements Runnable {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ int f23367s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ MaterialButton f23368t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ Drawable f23369u;

    public /* synthetic */ RunnableC5239a(MaterialButton materialButton, Drawable drawable, int i2) {
        this.f23367s = i2;
        this.f23368t = materialButton;
        this.f23369u = drawable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f23367s) {
            case 0:
                this.f23368t.lambda$setSecondaryIcon$3(this.f23369u);
                break;
            default:
                this.f23368t.lambda$setIcon$2(this.f23369u);
                break;
        }
    }
}
