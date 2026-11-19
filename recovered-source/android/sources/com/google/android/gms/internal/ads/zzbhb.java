package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzbhb implements zzbfr {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ zzbhe f7839s;

    public zzbhb(zzbhe zzbheVar) {
        Objects.requireNonNull(zzbheVar);
        this.f7839s = zzbheVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbfr
    /* JADX INFO: renamed from: k0 */
    public final void mo2997k0(boolean z) {
        zzbhe zzbheVar = this.f7839s;
        if (z) {
            zzbheVar.m4884d();
        } else {
            zzbheVar.m4883c();
        }
    }
}
