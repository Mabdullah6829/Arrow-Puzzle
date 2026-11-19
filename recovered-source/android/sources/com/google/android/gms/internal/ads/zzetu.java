package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzetu implements zzetz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzetv f14874a;

    public zzetu(zzetv zzetvVar) {
        Objects.requireNonNull(zzetvVar);
        this.f14874a = zzetvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzetz
    /* JADX INFO: renamed from: a */
    public final void mo6334a(zzcya zzcyaVar) {
        zzetv zzetvVar = this.f14874a;
        synchronized (zzetvVar) {
            zzetvVar.f14877c = zzcyaVar.f11764f;
            zzcyaVar.mo5855a();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzetz
    public final void zza() {
        synchronized (this.f14874a) {
        }
    }
}
