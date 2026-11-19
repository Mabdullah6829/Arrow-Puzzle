package com.google.android.gms.internal.ads;

import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgof implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzini f17915a;

    /* JADX INFO: renamed from: b */
    public final zzini f17916b;

    /* JADX INFO: renamed from: c */
    public final zzini f17917c;

    public zzgof(zzimy zzimyVar, zzimy zzimyVar2, zzimy zzimyVar3) {
        this.f17915a = zzimyVar;
        this.f17916b = zzimyVar2;
        this.f17917c = zzimyVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final /* bridge */ /* synthetic */ Object zzb() {
        File file = (File) this.f17915a.zzb();
        zzgfn zzgfnVar = (zzgfn) this.f17916b.zzb();
        final zzgqo zzgqoVar = (zzgqo) this.f17917c.zzb();
        return zzgfnVar.m6972a(file, new byte[0], new zzgti() { // from class: com.google.android.gms.internal.ads.zzgnp
            @Override // com.google.android.gms.internal.ads.zzgti
            public final /* synthetic */ Object apply(Object obj) {
                zzgqoVar.m7063d((Throwable) obj, 15310);
                return new byte[0];
            }
        });
    }
}
