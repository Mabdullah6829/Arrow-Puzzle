package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;

/* JADX INFO: loaded from: classes2.dex */
final class zzgty extends zzgue {

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ zzgtg f18185z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgty(zzgug zzgugVar, CharSequence charSequence, zzgtg zzgtgVar) {
        super(zzgugVar, charSequence);
        this.f18185z = zzgtgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgue
    /* JADX INFO: renamed from: b */
    public final int mo7140b(int i2) {
        Matcher matcher = ((zzgtj) this.f18185z).f18173a;
        if (matcher.find(i2)) {
            return matcher.start();
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzgue
    /* JADX INFO: renamed from: c */
    public final int mo7141c(int i2) {
        return ((zzgtj) this.f18185z).f18173a.end();
    }
}
