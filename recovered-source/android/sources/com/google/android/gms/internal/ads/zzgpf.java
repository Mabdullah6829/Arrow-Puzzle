package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzgpf implements zzgpe {

    /* JADX INFO: renamed from: a */
    public final zzimt f17968a;

    /* JADX INFO: renamed from: b */
    public final zzgqo f17969b;

    /* JADX INFO: renamed from: c */
    public final long f17970c;

    public zzgpf(zzimt zzimtVar, zzgqo zzgqoVar, long j2) {
        this.f17968a = zzimtVar;
        this.f17969b = zzgqoVar;
        this.f17970c = j2;
    }

    @Override // com.google.android.gms.internal.ads.zzgpe
    /* JADX INFO: renamed from: a */
    public final boolean mo7044a(zzggb zzggbVar) {
        zzgqo zzgqoVar = this.f17969b;
        if (zzggbVar == null || zzggbVar.equals(zzggb.m6988J())) {
            zzgqoVar.m7061b(15102);
            return false;
        }
        if (zzggbVar.m6991F() == this.f17968a.zzb()) {
            return true;
        }
        zzgqoVar.m7061b(15103);
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzgpe
    /* JADX INFO: renamed from: b */
    public final boolean mo7045b(zzggb zzggbVar) {
        zzgqo zzgqoVar = this.f17969b;
        if (zzggbVar == null || zzggbVar.equals(zzggb.m6988J())) {
            zzgqoVar.m7061b(15104);
            return true;
        }
        if (zzggbVar.m6991F() != this.f17968a.zzb()) {
            zzgqoVar.m7061b(15105);
            return true;
        }
        boolean z = (zzggbVar.m6989D().m4798F() * 1000) - System.currentTimeMillis() <= this.f17970c;
        if (z) {
            zzgqoVar.m7061b(15106);
        }
        return z;
    }
}
