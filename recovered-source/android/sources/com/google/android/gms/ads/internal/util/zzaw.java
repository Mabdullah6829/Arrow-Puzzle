package com.google.android.gms.ads.internal.util;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;

/* JADX INFO: loaded from: classes.dex */
final class zzaw implements Runnable {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ Context f3496s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ String f3497t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ boolean f3498u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ boolean f3499v;

    public zzaw(zzax zzaxVar, Context context, String str, boolean z, boolean z2) {
        this.f3496s = context;
        this.f3497t = str;
        this.f3498u = z;
        this.f3499v = z2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzs zzsVar = com.google.android.gms.ads.internal.zzt.f3698C.f3703c;
        Context context = this.f3496s;
        AlertDialog.Builder builderM3212k = zzs.m3212k(context);
        builderM3212k.setMessage(this.f3497t);
        if (this.f3498u) {
            builderM3212k.setTitle("Error");
        } else {
            builderM3212k.setTitle("Info");
        }
        if (this.f3499v) {
            builderM3212k.setNeutralButton("Dismiss", (DialogInterface.OnClickListener) null);
        } else {
            builderM3212k.setPositiveButton("Learn More", new zzav(this, context));
            builderM3212k.setNegativeButton("Dismiss", (DialogInterface.OnClickListener) null);
        }
        builderM3212k.create().show();
    }
}
