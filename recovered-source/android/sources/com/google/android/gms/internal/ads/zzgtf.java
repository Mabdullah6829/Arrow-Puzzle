package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzgtf implements zzgts {
    /* JADX INFO: renamed from: c */
    public static zzgtf m7124c(char c) {
        return new zzgtb(c);
    }

    /* JADX INFO: renamed from: a */
    public abstract boolean mo7123a(char c);

    @Override // com.google.android.gms.internal.ads.zzgts
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean mo3897b(Object obj) {
        return mo7123a(((Character) obj).charValue());
    }
}
