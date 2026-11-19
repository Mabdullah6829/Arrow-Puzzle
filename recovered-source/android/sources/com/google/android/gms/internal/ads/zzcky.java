package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;
import android.widget.EditText;

/* JADX INFO: loaded from: classes2.dex */
final class zzcky implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ JsPromptResult f10383s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ EditText f10384t;

    public zzcky(JsPromptResult jsPromptResult, EditText editText) {
        this.f10383s = jsPromptResult;
        this.f10384t = editText;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i2) {
        this.f10383s.confirm(this.f10384t.getText().toString());
    }
}
