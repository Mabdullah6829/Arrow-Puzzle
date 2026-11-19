package com.google.android.gms.common.internal;

import android.content.Intent;
import com.google.android.gms.common.api.internal.LifecycleFragment;

/* JADX INFO: loaded from: classes.dex */
final class zai extends zaj {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ Intent f4492s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ Object f4493t;

    public zai(Intent intent, LifecycleFragment lifecycleFragment) {
        this.f4492s = intent;
        this.f4493t = lifecycleFragment;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.google.android.gms.common.api.internal.LifecycleFragment, java.lang.Object] */
    @Override // com.google.android.gms.common.internal.zaj
    /* JADX INFO: renamed from: a */
    public final void mo3600a() {
        Intent intent = this.f4492s;
        if (intent != null) {
            this.f4493t.startActivityForResult(intent, 2);
        }
    }
}
