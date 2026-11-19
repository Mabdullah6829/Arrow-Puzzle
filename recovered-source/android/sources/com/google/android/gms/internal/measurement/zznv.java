package com.google.android.gms.internal.measurement;

import p011H.AbstractC0271e0;

/* JADX INFO: loaded from: classes2.dex */
final class zznv extends zzqo {

    /* JADX INFO: renamed from: a */
    public final zznd f22679a;

    /* JADX INFO: renamed from: b */
    public final zzqr f22680b;

    public zznv(zznd zzndVar, zzqr zzqrVar) {
        this.f22679a = zzndVar;
        this.f22680b = zzqrVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzqo
    /* JADX INFO: renamed from: a */
    public final zznd mo10571a() {
        return this.f22679a;
    }

    @Override // com.google.android.gms.internal.measurement.zzqo
    /* JADX INFO: renamed from: b */
    public final zzqr mo10572b() {
        return this.f22680b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzqo)) {
            return false;
        }
        zzqo zzqoVar = (zzqo) obj;
        zznd zzndVar = this.f22679a;
        if (zzndVar == null) {
            if (zzqoVar.mo10571a() != null) {
                return false;
            }
        } else if (!zzndVar.equals(zzqoVar.mo10571a())) {
            return false;
        }
        return this.f22680b.equals(zzqoVar.mo10572b());
    }

    public final int hashCode() {
        zznd zzndVar = this.f22679a;
        return (((zzndVar == null ? 0 : zzndVar.hashCode()) ^ 1000003) * 1000003) ^ this.f22680b.hashCode();
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f22679a);
        String string = this.f22680b.toString();
        StringBuilder sb = new StringBuilder(strValueOf.length() + 52 + string.length() + 1);
        AbstractC0271e0.m413u(sb, "SnapshotBlobAndResult{snapshotBlob=", strValueOf, ", snapshotResult=", string);
        sb.append("}");
        return sb.toString();
    }
}
