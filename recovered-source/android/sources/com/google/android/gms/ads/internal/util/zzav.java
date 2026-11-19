package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
final class zzav implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ Context f3495s;

    public zzav(zzaw zzawVar, Context context) {
        this.f3495s = context;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i2) {
        zzs zzsVar = com.google.android.gms.ads.internal.zzt.f3698C.f3703c;
        zzs.m3221t(this.f3495s, Uri.parse("https://support.google.com/dfp_premium/answer/7160685#push"));
    }
}
