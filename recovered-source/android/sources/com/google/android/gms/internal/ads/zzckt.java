package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsResult;

/* JADX INFO: loaded from: classes2.dex */
final class zzckt implements DialogInterface.OnCancelListener {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ JsResult f10378s;

    public zzckt(JsResult jsResult) {
        this.f10378s = jsResult;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.f10378s.cancel();
    }
}
