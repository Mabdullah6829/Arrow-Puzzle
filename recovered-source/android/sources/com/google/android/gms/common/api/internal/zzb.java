package com.google.android.gms.common.api.internal;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
final class zzb implements Runnable {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ LifecycleCallback f4372s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ String f4373t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ zzc f4374u;

    public zzb(zzc zzcVar, LifecycleCallback lifecycleCallback, String str) {
        this.f4372s = lifecycleCallback;
        this.f4373t = str;
        this.f4374u = zzcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzc zzcVar = this.f4374u;
        int i2 = zzcVar.f4376b;
        LifecycleCallback lifecycleCallback = this.f4372s;
        if (i2 > 0) {
            Bundle bundle = zzcVar.f4377c;
            lifecycleCallback.mo3470e(bundle != null ? bundle.getBundle(this.f4373t) : null);
        }
        if (zzcVar.f4376b >= 2) {
            lifecycleCallback.mo3474i();
        }
        if (zzcVar.f4376b >= 3) {
            lifecycleCallback.mo3472g();
        }
        if (zzcVar.f4376b >= 4) {
            lifecycleCallback.mo3475j();
        }
        if (zzcVar.f4376b >= 5) {
            lifecycleCallback.mo3471f();
        }
    }
}
