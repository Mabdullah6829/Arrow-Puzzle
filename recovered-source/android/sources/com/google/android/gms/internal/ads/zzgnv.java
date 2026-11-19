package com.google.android.gms.internal.ads;

import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgnv implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzini f17893a;

    /* JADX INFO: renamed from: b */
    public final zzini f17894b;

    /* JADX INFO: renamed from: c */
    public final zzini f17895c;

    public zzgnv(zzimy zzimyVar, zzimy zzimyVar2, zzimy zzimyVar3) {
        this.f17893a = zzimyVar;
        this.f17894b = zzimyVar2;
        this.f17895c = zzimyVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final Object zzb() {
        File file = (File) this.f17893a.zzb();
        zzgfn zzgfnVar = (zzgfn) this.f17894b.zzb();
        final zzgqo zzgqoVar = (zzgqo) this.f17895c.zzb();
        zzggb zzggbVarM6988J = zzggb.m6988J();
        zzgti zzgtiVar = new zzgti() { // from class: com.google.android.gms.internal.ads.zzgno
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
