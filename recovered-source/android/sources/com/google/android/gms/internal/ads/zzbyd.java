package com.google.android.gms.internal.ads;

import android.content.DialogInterface;

/* JADX INFO: loaded from: classes2.dex */
final class zzbyd implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ zzbye f9502s;

    public zzbyd(zzbye zzbyeVar) {
        this.f9502s = zzbyeVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i2) {
        this.f9502s.m5262b("Operation denied by user.");
    }
}
