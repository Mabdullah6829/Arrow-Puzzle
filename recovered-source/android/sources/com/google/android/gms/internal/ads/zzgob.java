package com.google.android.gms.internal.ads;

import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgob implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzini f17909a;

    /* JADX INFO: renamed from: b */
    public final zzini f17910b;

    /* JADX INFO: renamed from: c */
    public final zzini f17911c;

    public zzgob(zzimy zzimyVar, zzimy zzimyVar2, zzimy zzimyVar3) {
        this.f17909a = zzimyVar;
        this.f17910b = zzimyVar2;
        this.f17911c = zzimyVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final Object zzb() {
        File file = (File) this.f17909a.zzb();
        zzgfn zzgfnVar = (zzgfn) this.f17910b.zzb();
        final zzgqo zzgqoVar = (zzgqo) this.f17911c.zzb();
        zzggb zzggbVarM6988J = zzggb.m6988J();
        zzgti zzgtiVar = new zzgti() { // from class: com.google.android.gms.internal.ads.zzgnt
            @Override // com.google.android.gms.internal.ads.zzgti
            public final /* synthetic */ Object apply(Object obj) {
                zzgqoVar.m7063d((Throwable) obj, 15308);
                return zzggb.m6988J();
            }
        };
        zzgfnVar.getClass();
        return new zzgfm(file, zzgfnVar.f17140a, new zzgfk(zzggbVarM6988J), zzgtiVar);
    }
}
