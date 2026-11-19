package com.google.android.gms.internal.ads;

import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgpb implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzini f17961a;

    /* JADX INFO: renamed from: b */
    public final zzini f17962b;

    /* JADX INFO: renamed from: c */
    public final zzini f17963c;

    public zzgpb(zzimy zzimyVar, zzimy zzimyVar2, zzimy zzimyVar3) {
        this.f17961a = zzimyVar;
        this.f17962b = zzimyVar2;
        this.f17963c = zzimyVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final /* bridge */ /* synthetic */ Object zzb() {
        File file = (File) this.f17961a.zzb();
        zzgfn zzgfnVar = (zzgfn) this.f17962b.zzb();
        final zzgqo zzgqoVar = (zzgqo) this.f17963c.zzb();
        return zzgfnVar.m6972a(file, new byte[0], new zzgti() { // from class: com.google.android.gms.internal.ads.zzgov
            @Override // com.google.android.gms.internal.ads.zzgti
            public final /* synthetic */ Object apply(Object obj) {
                zzgqoVar.m7063d((Throwable) obj, 20310);
                return new byte[0];
            }
        });
    }
}
