package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzfxv extends zzfxs {

    /* JADX INFO: renamed from: a */
    public final String f16775a;

    /* JADX INFO: renamed from: b */
    public final boolean f16776b;

    /* JADX INFO: renamed from: c */
    public final boolean f16777c;

    /* JADX INFO: renamed from: d */
    public final long f16778d;

    /* JADX INFO: renamed from: e */
    public final long f16779e;

    public /* synthetic */ zzfxv(String str, boolean z, boolean z2, long j2, long j3) {
        this.f16775a = str;
        this.f16776b = z;
        this.f16777c = z2;
        this.f16778d = j2;
        this.f16779e = j3;
    }

    @Override // com.google.android.gms.internal.ads.zzfxs
    /* JADX INFO: renamed from: a */
    public final String mo6765a() {
        return this.f16775a;
    }

    @Override // com.google.android.gms.internal.ads.zzfxs
    /* JADX INFO: renamed from: b */
    public final boolean mo6766b() {
        return this.f16776b;
    }

    @Override // com.google.android.gms.internal.ads.zzfxs
    /* JADX INFO: renamed from: c */
    public final boolean mo6767c() {
        return this.f16777c;
    }

    @Override // com.google.android.gms.internal.ads.zzfxs
    /* JADX INFO: renamed from: d */
    public final long mo6768d() {
        return this.f16778d;
    }

    @Override // com.google.android.gms.internal.ads.zzfxs
    /* JADX INFO: renamed from: e */
    public final long mo6769e() {
        return this.f16779e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzfxs)) {
            return false;
        }
        zzfxs zzfxsVar = (zzfxs) obj;
        return this.f16775a.equals(zzfxsVar.mo6765a()) && this.f16776b == zzfxsVar.mo6766b() && this.f16777c == zzfxsVar.mo6767c() && this.f16778d == zzfxsVar.mo6768d() && this.f16779e == zzfxsVar.mo6769e();
    }

    public final int hashCode() {
        return ((((((((((((this.f16775a.hashCode() ^ 1000003) * 1000003) ^ (true != this.f16776b ? 1237 : 1231)) * 1000003) ^ (true != this.f16777c ? 1237 : 1231)) * 1000003) ^ 1237) * 1000003) ^ ((int) this.f16778d)) * 1000003) ^ 1237) * 1000003) ^ ((int) this.f16779e);
    }

    public final String toString() {
        boolean z = this.f16776b;
        int length = String.valueOf(z).length();
        boolean z2 = this.f16777c;
        int length2 = String.valueOf(z2).length();
        long j2 = this.f16778d;
        int length3 = String.valueOf(j2).length();
        long j3 = this.f16779e;
        int length4 = String.valueOf(j3).length();
        String str = this.f16775a;
        StringBuilder sb = new StringBuilder(str.length() + 56 + length + 32 + length2 + 57 + length3 + 61 + length4 + 1);
        sb.append("AdShield2Options{clientVersion=");
        sb.append(str);
        sb.append(", shouldGetAdvertisingId=");
        sb.append(z);
        sb.append(", isGooglePlayServicesAvailable=");
        sb.append(z2);
        sb.append(", enableQuerySignalsTimeout=false, querySignalsTimeoutMs=");
        sb.append(j2);
        sb.append(", enableQuerySignalsCache=false, querySignalsCacheTtlSeconds=");
        sb.append(j3);
        sb.append("}");
        return sb.toString();
    }
}
