package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzgqn implements zzhcc {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzgqm f18068a;

    public zzgqn(zzgqo zzgqoVar, zzgqm zzgqmVar) {
        this.f18068a = zzgqmVar;
        Objects.requireNonNull(zzgqoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    /* JADX INFO: renamed from: a */
    public final void mo3316a(Object obj) {
        this.f18068a.m7059c();
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    /* JADX INFO: renamed from: b */
    public final void mo3317b(Throwable th) {
        zzgqm zzgqmVar = this.f18068a;
        zzgqmVar.m7058b(th);
        zzgqmVar.m7059c();
    }
}
