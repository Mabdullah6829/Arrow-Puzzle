package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzerd implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzini f14696a;

    /* JADX INFO: renamed from: b */
    public final zzini f14697b;

    /* JADX INFO: renamed from: c */
    public final zzini f14698c;

    /* JADX INFO: renamed from: d */
    public final zzimz f14699d;

    public zzerd(zzini zziniVar, zzini zziniVar2, zzini zziniVar3, zzimz zzimzVar) {
        this.f14696a = zziniVar;
        this.f14697b = zziniVar2;
        this.f14698c = zziniVar3;
        this.f14699d = zzimzVar;
    }

    /* JADX INFO: renamed from: b */
    public static zzerd m6318b(zzimy zzimyVar, zzimy zzimyVar2, zzini zziniVar, zzimz zzimzVar) {
        return new zzerd(zzimyVar, zzimyVar2, zziniVar, zzimzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzino
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final zzerc zzb() {
        return new zzerc((zzfps) this.f14696a.zzb(), (zzhcp) this.f14697b.zzb(), (zzemc) this.f14698c.zzb(), (zzemg) this.f14699d.zzb());
    }
}
