package com.google.android.gms.internal.ads;

import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
final class zzclc implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ zzcdu f10392s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ zzclm f10393t;

    public zzclc(zzclm zzclmVar, zzcdu zzcduVar) {
        this.f10392s = zzcduVar;
        this.f10393t = zzclmVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f10393t.m5641m(view, this.f10392s, 10);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
