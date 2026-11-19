package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;

/* JADX INFO: loaded from: classes2.dex */
final class zzckw implements DialogInterface.OnCancelListener {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ JsPromptResult f10381s;

    public zzckw(JsPromptResult jsPromptResult) {
        this.f10381s = jsPromptResult;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.f10381s.cancel();
    }
}
