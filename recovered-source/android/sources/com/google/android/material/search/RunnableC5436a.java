package com.google.android.material.search;

import android.view.View;
import android.widget.EditText;

/* JADX INFO: renamed from: com.google.android.material.search.a */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC5436a implements Runnable {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ int f23451s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ View f23452t;

    public /* synthetic */ RunnableC5436a(View view, int i2) {
        this.f23451s = i2;
        this.f23452t = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f23451s) {
            case 0:
                ((SearchBar) this.f23452t).lambda$startOnLoadAnimation$0();
                break;
            default:
                ((EditText) this.f23452t).requestFocus();
                break;
        }
    }
}
