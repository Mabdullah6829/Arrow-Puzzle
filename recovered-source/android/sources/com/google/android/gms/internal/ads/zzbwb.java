package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.mediation.MediationAdRequest;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbwb implements MediationAdRequest {

    /* JADX INFO: renamed from: a */
    public final Set f9438a;

    /* JADX INFO: renamed from: b */
    public final boolean f9439b;

    /* JADX INFO: renamed from: c */
    public final int f9440c;

    /* JADX INFO: renamed from: d */
    public final boolean f9441d;

    public zzbwb(HashSet hashSet, boolean z, int i2, boolean z2) {
        this.f9438a = hashSet;
        this.f9439b = z;
        this.f9440c = i2;
        this.f9441d = z2;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    /* JADX INFO: renamed from: b */
    public final int mo3279b() {
        return this.f9440c;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    /* JADX INFO: renamed from: d */
    public final boolean mo3280d() {
        return this.f9441d;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    /* JADX INFO: renamed from: e */
    public final boolean mo3281e() {
        return this.f9439b;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    /* JADX INFO: renamed from: f */
    public final Set mo3282f() {
        return this.f9438a;
    }
}
