package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes2.dex */
final class zzafn implements zzaez {

    /* JADX INFO: renamed from: a */
    public final zzafc f22100a;

    /* JADX INFO: renamed from: b */
    public final String f22101b;

    /* JADX INFO: renamed from: c */
    public final Object[] f22102c;

    /* JADX INFO: renamed from: d */
    public final int f22103d;

    public zzafn(zzafc zzafcVar, String str, Object[] objArr) {
        this.f22100a = zzafcVar;
        this.f22101b = str;
        this.f22102c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f22103d = cCharAt;
            return;
        }
        int i2 = cCharAt & 8191;
        int i3 = 1;
        int i4 = 13;
        while (true) {
            int i5 = i3 + 1;
            char cCharAt2 = str.charAt(i3);
            if (cCharAt2 < 55296) {
                this.f22103d = i2 | (cCharAt2 << i4);
                return;
            } else {
                i2 |= (cCharAt2 & 8191) << i4;
                i4 += 13;
                i3 = i5;
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzaez
    public final boolean zza() {
        return (this.f22103d & 2) == 2;
    }

    @Override // com.google.android.gms.internal.measurement.zzaez
    public final zzafc zzb() {
        return this.f22100a;
    }

    @Override // com.google.android.gms.internal.measurement.zzaez
    public final int zzc() {
        int i2 = this.f22103d;
        if ((i2 & 1) != 0) {
            return 1;
        }
        return (i2 & 4) == 4 ? 3 : 2;
    }
}
