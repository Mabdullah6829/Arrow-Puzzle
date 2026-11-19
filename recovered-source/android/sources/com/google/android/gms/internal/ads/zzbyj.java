package com.google.android.gms.internal.ads;

import android.content.DialogInterface;

/* JADX INFO: loaded from: classes2.dex */
final class zzbyj implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ zzbyk f9534s;

    public zzbyj(zzbyk zzbykVar) {
        this.f9534s = zzbykVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i2) {
        this.f9534s.m5262b("User canceled the download.");
    }
}
