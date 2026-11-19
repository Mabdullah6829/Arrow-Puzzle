package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.gms.internal.ads.zzclb;

/* JADX INFO: loaded from: classes.dex */
public final class zzj {

    /* JADX INFO: renamed from: a */
    public final int f3337a;

    /* JADX INFO: renamed from: b */
    public final ViewGroup.LayoutParams f3338b;

    /* JADX INFO: renamed from: c */
    public final ViewGroup f3339c;

    /* JADX INFO: renamed from: d */
    public final Context f3340d;

    public zzj(zzclb zzclbVar) throws zzh {
        this.f3338b = zzclbVar.getLayoutParams();
        ViewParent parent = zzclbVar.getParent();
        this.f3340d = zzclbVar.mo5581J();
        if (!(parent instanceof ViewGroup)) {
            throw new zzh("Could not get the parent of the WebView for an overlay.");
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        this.f3339c = viewGroup;
        this.f3337a = viewGroup.indexOfChild(zzclbVar.mo5577H());
        viewGroup.removeView(zzclbVar.mo5577H());
        zzclbVar.mo5575E0(true);
    }
}
