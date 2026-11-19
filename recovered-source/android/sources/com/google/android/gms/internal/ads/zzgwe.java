package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* JADX INFO: loaded from: classes2.dex */
final class zzgwe extends zzgwg {
    /* JADX INFO: renamed from: f */
    public static final zzgwg m7193f(int i2) {
        if (i2 < 0) {
            return zzgwg.f18292b;
        }
        return i2 > 0 ? zzgwg.f18293c : zzgwg.f18291a;
    }

    @Override // com.google.android.gms.internal.ads.zzgwg
    /* JADX INFO: renamed from: a */
    public final zzgwg mo7194a(Object obj, Object obj2, Comparator comparator) {
        return m7193f(comparator.compare(obj, obj2));
    }

    @Override // com.google.android.gms.internal.ads.zzgwg
    /* JADX INFO: renamed from: b */
    public final zzgwg mo7195b(int i2, int i3) {
        return m7193f(Integer.compare(i2, i3));
    }

    @Override // com.google.android.gms.internal.ads.zzgwg
    /* JADX INFO: renamed from: c */
    public final zzgwg mo7196c(boolean z, boolean z2) {
        return m7193f(Boolean.compare(z2, z));
    }

    @Override // com.google.android.gms.internal.ads.zzgwg
    /* JADX INFO: renamed from: d */
    public final zzgwg mo7197d(boolean z, boolean z2) {
        return m7193f(Boolean.compare(z, z2));
    }

    @Override // com.google.android.gms.internal.ads.zzgwg
    /* JADX INFO: renamed from: e */
    public final int mo7198e() {
        return 0;
    }
}
