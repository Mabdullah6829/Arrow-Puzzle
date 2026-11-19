package com.google.android.gms.common.internal;

import android.content.Intent;
import com.google.android.gms.common.api.GoogleApiActivity;

/* JADX INFO: loaded from: classes.dex */
final class zag extends zaj {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ Intent f4490s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ GoogleApiActivity f4491t;

    public zag(Intent intent, GoogleApiActivity googleApiActivity) {
        this.f4490s = intent;
        this.f4491t = googleApiActivity;
    }

    @Override // com.google.android.gms.common.internal.zaj
    /* JADX INFO: renamed from: a */
    public final void mo3600a() {
        Intent intent = this.f4490s;
        if (intent != null) {
            this.f4491t.startActivityForResult(intent, 2);
        }
    }
}
