package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzigl implements zzifw {

    /* JADX INFO: renamed from: a */
    public final zzifz f19867a;

    /* JADX INFO: renamed from: b */
    public final String f19868b;

    /* JADX INFO: renamed from: c */
    public final Object[] f19869c;

    /* JADX INFO: renamed from: d */
    public final int f19870d;

    public zzigl(zzifz zzifzVar, String str, Object[] objArr) {
        this.f19867a = zzifzVar;
        this.f19868b = str;
        this.f19869c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f19870d = cCharAt;
            return;
        }
        int i2 = cCharAt & 8191;
        int i3 = 1;
        int i4 = 13;
        while (true) {
            int i5 = i3 + 1;
            char cCharAt2 = str.charAt(i3);
            if (cCharAt2 < 55296) {
                this.f19870d = i2 | (cCharAt2 << i4);
                return;
            } else {
                i2 |= (cCharAt2 & 8191) << i4;
                i4 += 13;
                i3 = i5;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzifw
    public final boolean zza() {
        return (this.f19870d & 2) == 2;
    }

    @Override // com.google.android.gms.internal.ads.zzifw
    public final zzifz zzb() {
        return this.f19867a;
    }

    @Override // com.google.android.gms.internal.ads.zzifw
    public final int zzc() {
        int i2 = this.f19870d;
        if ((i2 & 1) != 0) {
            return 1;
        }
        return (i2 & 4) == 4 ? 3 : 2;
    }
}
