package com.google.android.gms.internal.ads;

import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgny implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzini f17898a;

    /* JADX INFO: renamed from: b */
    public final zzini f17899b;

    /* JADX INFO: renamed from: c */
    public final zzini f17900c;

    public zzgny(zzimy zzimyVar, zzimy zzimyVar2, zzimy zzimyVar3) {
        this.f17898a = zzimyVar;
        this.f17899b = zzimyVar2;
        this.f17900c = zzimyVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final /* bridge */ /* synthetic */ Object zzb() {
        File file = (File) this.f17898a.zzb();
        zzgfn zzgfnVar = (zzgfn) this.f17899b.zzb();
        final zzgqo zzgqoVar = (zzgqo) this.f17900c.zzb();
        return zzgfnVar.m6972a(file, new byte[0], new zzgti() { // from class: com.google.android.gms.internal.ads.zzgnq
            @Override // com.google.android.gms.internal.ads.zzgti
            public final /* synthetic */ Object apply(Object obj) {
                zzgqoVar.m7063d((Throwable) obj, 15310);
                return new byte[0];
            }
        });
    }
}
