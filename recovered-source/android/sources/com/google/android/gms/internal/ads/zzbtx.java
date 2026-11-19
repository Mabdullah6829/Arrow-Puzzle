package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzbtx implements zzcgf {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzbtv f9376a;

    public zzbtx(zzbua zzbuaVar, zzbtv zzbtvVar) {
        this.f9376a = zzbtvVar;
        Objects.requireNonNull(zzbuaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcgf
    public final void zza() {
        com.google.android.gms.ads.internal.util.zze.m3150k("Rejecting reference for JS Engine.");
        boolean zBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8045C8)).booleanValue();
        zzbtv zzbtvVar = this.f9376a;
        if (zBooleanValue) {
            zzbtvVar.m5401c("SdkJavascriptFactory.createNewReference.FailureCallback", new IllegalStateException("Unable to create JS engine reference."));
        } else {
            zzbtvVar.m5400b();
        }
    }
}
