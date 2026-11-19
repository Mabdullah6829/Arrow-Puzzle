package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsResult;

/* JADX INFO: loaded from: classes2.dex */
final class zzcku implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ JsResult f10379s;

    public zzcku(JsResult jsResult) {
        this.f10379s = jsResult;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i2) {
        this.f10379s.cancel();
    }
}
