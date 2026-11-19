package com.google.android.gms.internal.ads;

import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgoa implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzini f17906a;

    /* JADX INFO: renamed from: b */
    public final zzini f17907b;

    /* JADX INFO: renamed from: c */
    public final zzini f17908c;

    public zzgoa(zzimy zzimyVar, zzimy zzimyVar2, zzimy zzimyVar3) {
        this.f17906a = zzimyVar;
        this.f17907b = zzimyVar2;
        this.f17908c = zzimyVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final /* bridge */ /* synthetic */ Object zzb() {
        File file = (File) this.f17906a.zzb();
        zzgfn zzgfnVar = (zzgfn) this.f17907b.zzb();
        final zzgqo zzgqoVar = (zzgqo) this.f17908c.zzb();
        return zzgfnVar.m6972a(file, new byte[0], new zzgti() { // from class: com.google.android.gms.internal.ads.zzgns
            @Override // com.google.android.gms.internal.ads.zzgti
            public final /* synthetic */ Object apply(Object obj) {
                zzgqoVar.m7063d((Throwable) obj, 15309);
                return new byte[0];
            }
        });
    }
}
