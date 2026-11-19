package com.google.android.gms.internal.ads;

import p011H.AbstractC0271e0;

/* JADX INFO: loaded from: classes2.dex */
final class zzgqx extends zzgrf {

    /* JADX INFO: renamed from: a */
    public final String f18076a;

    /* JADX INFO: renamed from: b */
    public final String f18077b;

    public /* synthetic */ zzgqx(String str, String str2) {
        this.f18076a = str;
        this.f18077b = str2;
    }

    @Override // com.google.android.gms.internal.ads.zzgrf
    /* JADX INFO: renamed from: a */
    public final String mo7071a() {
        return this.f18076a;
    }

    @Override // com.google.android.gms.internal.ads.zzgrf
    /* JADX INFO: renamed from: b */
    public final String mo7072b() {
        return this.f18077b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzgrf)) {
            return false;
        }
        zzgrf zzgrfVar = (zzgrf) obj;
        String str = this.f18076a;
        if (str == null) {
            if (zzgrfVar.mo7071a() != null) {
                return false;
            }
        } else if (!str.equals(zzgrfVar.mo7071a())) {
            return false;
        }
        String str2 = this.f18077b;
        if (str2 == null) {
            return zzgrfVar.mo7072b() == null;
        }
        return str2.equals(zzgrfVar.mo7072b());
    }

    public final int hashCode() {
        String str = this.f18076a;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.f18077b;
        return (str2 != null ? str2.hashCode() : 0) ^ ((iHashCode ^ 1000003) * 1000003);
    }

    public final String toString() {
        String str = this.f18076a;
        int length = String.valueOf(str).length();
        String str2 = this.f18077b;
        StringBuilder sb = new StringBuilder(length + 50 + String.valueOf(str2).length() + 1);
        AbstractC0271e0.m413u(sb, "OverlayDisplayDismissRequest{sessionToken=", str, ", appId=", str2);
        sb.append("}");
        return sb.toString();
    }
}
