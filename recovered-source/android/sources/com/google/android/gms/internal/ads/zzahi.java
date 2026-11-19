package com.google.android.gms.internal.ads;

import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class zzahi extends zzago {

    /* JADX INFO: renamed from: b */
    public final long f5318b;

    public zzahi(zzagb zzagbVar, long j2) {
        super(zzagbVar);
        zzgtr.m7128a(zzagbVar.mo4086g() >= j2);
        this.f5318b = j2;
    }

    @Override // com.google.android.gms.internal.ads.zzago, com.google.android.gms.internal.ads.zzagb
    /* JADX INFO: renamed from: e */
    public final long mo4084e() {
        return super.mo4084e() - this.f5318b;
    }

    @Override // com.google.android.gms.internal.ads.zzago, com.google.android.gms.internal.ads.zzagb
    /* JADX INFO: renamed from: g */
    public final long mo4086g() {
        return super.mo4086g() - this.f5318b;
    }

    @Override // com.google.android.gms.internal.ads.zzago, com.google.android.gms.internal.ads.zzagb
    /* JADX INFO: renamed from: j */
    public final long mo4089j() {
        return super.mo4089j() - this.f5318b;
    }
}
