package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdra {

    /* JADX INFO: renamed from: k */
    public static final ImageView.ScaleType f12698k = ImageView.ScaleType.CENTER_INSIDE;

    /* JADX INFO: renamed from: a */
    public final com.google.android.gms.ads.internal.util.zzg f12699a;

    /* JADX INFO: renamed from: b */
    public final zzflg f12700b;

    /* JADX INFO: renamed from: c */
    public final zzdqg f12701c;

    /* JADX INFO: renamed from: d */
    public final zzdqb f12702d;

    /* JADX INFO: renamed from: e */
    public final zzdro f12703e;

    /* JADX INFO: renamed from: f */
    public final zzdrw f12704f;

    /* JADX INFO: renamed from: g */
    public final Executor f12705g;

    /* JADX INFO: renamed from: h */
    public final Executor f12706h;

    /* JADX INFO: renamed from: i */
    public final zzbma f12707i;

    /* JADX INFO: renamed from: j */
    public final zzdpy f12708j;

    public zzdra(com.google.android.gms.ads.internal.util.zzj zzjVar, zzflg zzflgVar, zzdqg zzdqgVar, zzdqb zzdqbVar, zzdro zzdroVar, zzdrw zzdrwVar, Executor executor, Executor executor2, zzdpy zzdpyVar) {
        this.f12699a = zzjVar;
        this.f12700b = zzflgVar;
        this.f12707i = zzflgVar.f16046j;
        this.f12701c = zzdqgVar;
        this.f12702d = zzdqbVar;
        this.f12703e = zzdroVar;
        this.f12704f = zzdrwVar;
        this.f12705g = executor;
        this.f12706h = executor2;
        this.f12708j = zzdpyVar;
    }

    /* JADX INFO: renamed from: b */
    public static void m6036b(RelativeLayout.LayoutParams layoutParams, int i2) {
        if (i2 == 0) {
            layoutParams.addRule(10);
            layoutParams.addRule(9);
        } else if (i2 == 2) {
            layoutParams.addRule(12);
            layoutParams.addRule(11);
        } else if (i2 != 3) {
            layoutParams.addRule(10);
            layoutParams.addRule(11);
        } else {
            layoutParams.addRule(12);
            layoutParams.addRule(9);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m6037a(zzdry zzdryVar) {
        if (zzdryVar == null) {
            return;
        }
        Context context = zzdryVar.mo6021D0().getContext();
        if (com.google.android.gms.ads.internal.util.zzbs.m3135g(context, this.f12701c.f12642a)) {
            if (!(context instanceof Activity)) {
                int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
                com.google.android.gms.ads.internal.util.client.zzo.m3068a("Activity context is needed for policy validator.");
                return;
            }
            zzdrw zzdrwVar = this.f12704f;
            if (zzdrwVar == null || zzdryVar.mo6023N3() == null) {
                return;
            }
            try {
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                windowManager.addView(zzdrwVar.m6042a(zzdryVar.mo6023N3(), windowManager), com.google.android.gms.ads.internal.util.zzbs.m3137i());
            } catch (zzclq e) {
                com.google.android.gms.ads.internal.util.zze.m3151l("web view can not be obtained", e);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m6038c(ViewGroup viewGroup, boolean z) {
        View view;
        if (z) {
            zzdqb zzdqbVar = this.f12702d;
            synchronized (zzdqbVar) {
                view = zzdqbVar.f12624o;
            }
        } else {
            zzdqb zzdqbVar2 = this.f12702d;
            synchronized (zzdqbVar2) {
                view = zzdqbVar2.f12625p;
            }
        }
        if (view == null) {
            return false;
        }
        viewGroup.removeAllViews();
        if (view.getParent() instanceof ViewGroup) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        viewGroup.addView(view, ((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8160J4)).booleanValue() ? new FrameLayout.LayoutParams(-1, -1, 17) : new FrameLayout.LayoutParams(-2, -2, 17));
        return true;
    }
}
