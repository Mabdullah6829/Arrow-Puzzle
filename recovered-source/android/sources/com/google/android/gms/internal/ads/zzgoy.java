package com.google.android.gms.internal.ads;

import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgoy implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzini f17956a;

    /* JADX INFO: renamed from: b */
    public final zzini f17957b;

    /* JADX INFO: renamed from: c */
    public final zzini f17958c;

    public zzgoy(zzimy zzimyVar, zzimy zzimyVar2, zzimy zzimyVar3) {
        this.f17956a = zzimyVar;
        this.f17957b = zzimyVar2;
        this.f17958c = zzimyVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final Object zzb() {
        File file = (File) this.f17956a.zzb();
        zzgfn zzgfnVar = (zzgfn) this.f17957b.zzb();
        final zzgqo zzgqoVar = (zzgqo) this.f17958c.zzb();
        zzggb zzggbVarM6988J = zzggb.m6988J();
        zzgti zzgtiVar = new zzgti() { // from class: com.google.android.gms.internal.ads.zzgox
            @Override // com.google.android.gms.internal.ads.zzgti
            public final /* synthetic */ Object apply(Object obj) {
                zzgqoVar.m7063d((Throwable) obj, 20308);
                return zzggb.m6988J();
            }
        };
        zzgfnVar.getClass();
        return new zzgfm(file, zzgfnVar.f17140a, new zzgfk(zzggbVarM6988J), zzgtiVar);
    }
}
