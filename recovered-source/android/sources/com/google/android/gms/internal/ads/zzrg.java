package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzrg {

    /* JADX INFO: renamed from: a */
    public final int f20696a;

    /* JADX INFO: renamed from: b */
    public final int f20697b;

    /* JADX INFO: renamed from: c */
    public final int f20698c;

    /* JADX INFO: renamed from: d */
    public final int f20699d;

    /* JADX INFO: renamed from: e */
    public final zzd f20700e;

    /* JADX INFO: renamed from: f */
    public final int f20701f;

    /* JADX INFO: renamed from: g */
    public final int f20702g;

    public /* synthetic */ zzrg(zzrf zzrfVar) {
        this.f20696a = zzrfVar.f20689a;
        this.f20697b = zzrfVar.f20690b;
        this.f20698c = zzrfVar.f20691c;
        this.f20699d = zzrfVar.f20692d;
        this.f20700e = zzrfVar.f20693e;
        this.f20701f = zzrfVar.f20694f;
        this.f20702g = zzrfVar.f20695g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzrg.class == obj.getClass()) {
            zzrg zzrgVar = (zzrg) obj;
            if (this.f20696a == zzrgVar.f20696a && this.f20697b == zzrgVar.f20697b && this.f20698c == zzrgVar.f20698c && this.f20699d == zzrgVar.f20699d && this.f20701f == zzrgVar.f20701f && this.f20702g == zzrgVar.f20702g && this.f20700e.equals(zzrgVar.f20700e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Integer numValueOf = Integer.valueOf(this.f20696a);
        Integer numValueOf2 = Integer.valueOf(this.f20697b);
        Integer numValueOf3 = Integer.valueOf(this.f20698c);
        Boolean bool = Boolean.FALSE;
        return Objects.hash(numValueOf, numValueOf2, numValueOf3, bool, bool, Integer.valueOf(this.f20699d), this.f20700e, Integer.valueOf(this.f20701f), Integer.valueOf(this.f20702g), bool, bool);
    }
}
