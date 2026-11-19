package com.google.android.gms.internal.ads;

import p011H.AbstractC0271e0;

/* JADX INFO: loaded from: classes2.dex */
final class zzgrd extends zzgsf {

    /* JADX INFO: renamed from: a */
    public final String f18106a;

    /* JADX INFO: renamed from: b */
    public final String f18107b;

    public /* synthetic */ zzgrd(String str, String str2) {
        this.f18106a = str;
        this.f18107b = str2;
    }

    @Override // com.google.android.gms.internal.ads.zzgsf
    /* JADX INFO: renamed from: a */
    public final String mo7100a() {
        return this.f18106a;
    }

    @Override // com.google.android.gms.internal.ads.zzgsf
    /* JADX INFO: renamed from: b */
    public final String mo7101b() {
        return this.f18107b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzgsf)) {
            return false;
        }
        zzgsf zzgsfVar = (zzgsf) obj;
        String str = this.f18106a;
        if (str == null) {
            if (zzgsfVar.mo7100a() != null) {
                return false;
            }
        } else if (!str.equals(zzgsfVar.mo7100a())) {
            return false;
        }
        String str2 = this.f18107b;
        if (str2 == null) {
            return zzgsfVar.mo7101b() == null;
        }
        return str2.equals(zzgsfVar.mo7101b());
    }

    public final int hashCode() {
        String str = this.f18106a;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.f18107b;
        return (str2 != null ? str2.hashCode() : 0) ^ ((iHashCode ^ 1000003) * 1000003);
    }

    public final String toString() {
        String str = this.f18106a;
        int length = String.valueOf(str).length();
        String str2 = this.f18107b;
        StringBuilder sb = new StringBuilder(length + 49 + String.valueOf(str2).length() + 1);
        AbstractC0271e0.m413u(sb, "OverlayDisplayUpdateRequest{sessionToken=", str, ", appId=", str2);
        sb.append("}");
        return sb.toString();
    }
}
