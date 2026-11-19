package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcgl {
    /* JADX INFO: renamed from: a */
    public static final void m5402a(View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        ViewTreeObserver viewTreeObserver;
        zzcgm zzcgmVar = new zzcgm(view, onGlobalLayoutListener);
        View view2 = (View) zzcgmVar.f9967s.get();
        ViewTreeObserver viewTreeObserver2 = null;
        if (view2 != null && (viewTreeObserver = view2.getViewTreeObserver()) != null && viewTreeObserver.isAlive()) {
            viewTreeObserver2 = viewTreeObserver;
        }
        if (viewTreeObserver2 != null) {
            viewTreeObserver2.addOnGlobalLayoutListener(zzcgmVar);
        }
    }
}
