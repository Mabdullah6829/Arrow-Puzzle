package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* JADX INFO: loaded from: classes2.dex */
public final class zzawp implements Comparator {

    /* JADX INFO: renamed from: s */
    public final boolean f7182s;

    public zzawp(boolean z) {
        this.f7182s = z;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:29:0x009f A[RETURN] */
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int[] iArr = {446703183, 1862618146, 1081639777, -1087935358, -803036955, 1104011716, 5522510, 2017461929, 496612959};
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        int i6 = iArr[4];
        int i7 = iArr[5];
        int i8 = iArr[6];
        int i9 = iArr[7];
        int iM3770b = AbstractC5152f.m3770b((i3 & (~i2)) | i4, (i2 & i5) | i6, i7, i8);
        int i10 = i9 % 496612959;
        zzawt zzawtVar = (zzawt) obj;
        zzawt zzawtVar2 = (zzawt) obj2;
        int i11 = zzawtVar.f7190g;
        if (i11 != zzawtVar2.f7190g) {
            throw new IllegalArgumentException();
        }
        int i12 = i10 ^ iM3770b;
        try {
            if (i11 == 0) {
                throw null;
            }
            int i13 = i11 + i12;
            boolean z = this.f7182s;
            switch (i13) {
                case 1:
                    if (!z) {
                        throw new IllegalArgumentException();
                    }
                    if (zzawtVar.m4477l() != zzawtVar2.m4477l()) {
                        return 1;
                    }
                    return 0;
                case 2:
                    return Long.compare(zzawtVar.m4478m(), zzawtVar2.m4478m());
                case 3:
                    return ((zzavw) zzavx.f7095c).compare(zzawtVar.m4479n(), zzawtVar2.m4479n());
                case 4:
                    return new zzgxn(this).compare(zzawtVar.m4480o(), zzawtVar2.m4480o());
                case 5:
                    if (!z) {
                        throw new IllegalArgumentException();
                    }
                    if (zzawtVar.m4481p() != zzawtVar2.m4481p()) {
                        return 1;
                    }
                    return 0;
                case 6:
                    return Double.compare(zzawtVar.m4482q(), zzawtVar2.m4482q());
                default:
                    return 0;
            }
        } catch (zzawq e) {
            throw new AssertionError(zzavv.m4444a("CEiv6BFfPnitUE+D"), e);
        }
    }
}
