package com.google.android.gms.internal.ads;

import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgoi implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzini f17920a;

    /* JADX INFO: renamed from: b */
    public final zzini f17921b;

    /* JADX INFO: renamed from: c */
    public final zzini f17922c;

    public zzgoi(zzimy zzimyVar, zzimy zzimyVar2, zzimy zzimyVar3) {
        this.f17920a = zzimyVar;
        this.f17921b = zzimyVar2;
        this.f17922c = zzimyVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final /* bridge */ /* synthetic */ Object zzb() {
        File file = (File) this.f17920a.zzb();
        zzgfn zzgfnVar = (zzgfn) this.f17921b.zzb();
        final zzgqo zzgqoVar = (zzgqo) this.f17922c.zzb();
        return zzgfnVar.m6972a(file, new byte[0], new zzgti() { // from class: com.google.android.gms.internal.ads.zzgnr
            @Override // com.google.android.gms.internal.ads.zzgti
            public final /* synthetic */ Object apply(Object obj) {
                zzgqoVar.m7063d((Throwable) obj, 15309);
                return new byte[0];
            }
        });
    }
}
