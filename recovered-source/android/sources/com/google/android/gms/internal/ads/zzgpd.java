package com.google.android.gms.internal.ads;

import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgpd implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzini f17965a;

    /* JADX INFO: renamed from: b */
    public final zzini f17966b;

    /* JADX INFO: renamed from: c */
    public final zzini f17967c;

    public zzgpd(zzimy zzimyVar, zzimy zzimyVar2, zzimy zzimyVar3) {
        this.f17965a = zzimyVar;
        this.f17966b = zzimyVar2;
        this.f17967c = zzimyVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final /* bridge */ /* synthetic */ Object zzb() {
        File file = (File) this.f17965a.zzb();
        zzgfn zzgfnVar = (zzgfn) this.f17966b.zzb();
        final zzgqo zzgqoVar = (zzgqo) this.f17967c.zzb();
        return zzgfnVar.m6972a(file, new byte[0], new zzgti() { // from class: com.google.android.gms.internal.ads.zzgow
            @Override // com.google.android.gms.internal.ads.zzgti
            public final /* synthetic */ Object apply(Object obj) {
                zzgqoVar.m7063d((Throwable) obj, 20309);
                return new byte[0];
            }
        });
    }
}
