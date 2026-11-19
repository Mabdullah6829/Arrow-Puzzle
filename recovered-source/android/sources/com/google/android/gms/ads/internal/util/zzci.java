package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import com.google.android.gms.internal.ads.zzcgl;

/* JADX INFO: loaded from: classes.dex */
public final class zzci {

    /* JADX INFO: renamed from: a */
    public final View f3568a;

    /* JADX INFO: renamed from: b */
    public Activity f3569b;

    /* JADX INFO: renamed from: c */
    public boolean f3570c;

    /* JADX INFO: renamed from: d */
    public boolean f3571d;

    /* JADX INFO: renamed from: e */
    public boolean f3572e;

    /* JADX INFO: renamed from: f */
    public final ViewTreeObserver.OnGlobalLayoutListener f3573f;

    public zzci(Activity activity, View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        this.f3569b = activity;
        this.f3568a = view;
        this.f3573f = onGlobalLayoutListener;
    }

    /* JADX INFO: renamed from: a */
    public final void m3148a() {
        View decorView;
        if (this.f3570c) {
            return;
        }
        Activity activity = this.f3569b;
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.f3573f;
        if (activity != null) {
            Window window = activity.getWindow();
            ViewTreeObserver viewTreeObserver = (window == null || (decorView = window.getDecorView()) == null) ? null : decorView.getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.addOnGlobalLayoutListener(onGlobalLayoutListener);
            }
        }
        zzcgl zzcglVar = com.google.android.gms.ads.internal.zzt.f3698C.f3700B;
        zzcgl.m5402a(this.f3568a, onGlobalLayoutListener);
        this.f3570c = true;
    }
}
