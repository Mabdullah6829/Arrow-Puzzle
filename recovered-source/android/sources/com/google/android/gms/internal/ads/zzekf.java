package com.google.android.gms.internal.ads;

import android.app.Activity;
import p011H.AbstractC0271e0;

/* JADX INFO: loaded from: classes2.dex */
final class zzekf extends zzelb {

    /* JADX INFO: renamed from: a */
    public final Activity f14078a;

    /* JADX INFO: renamed from: b */
    public final com.google.android.gms.ads.internal.overlay.zzm f14079b;

    /* JADX INFO: renamed from: c */
    public final String f14080c;

    /* JADX INFO: renamed from: d */
    public final String f14081d;

    public /* synthetic */ zzekf(Activity activity, com.google.android.gms.ads.internal.overlay.zzm zzmVar, String str, String str2) {
        this.f14078a = activity;
        this.f14079b = zzmVar;
        this.f14080c = str;
        this.f14081d = str2;
    }

    @Override // com.google.android.gms.internal.ads.zzelb
    /* JADX INFO: renamed from: a */
    public final Activity mo6253a() {
        return this.f14078a;
    }

    @Override // com.google.android.gms.internal.ads.zzelb
    /* JADX INFO: renamed from: b */
    public final com.google.android.gms.ads.internal.overlay.zzm mo6254b() {
        return this.f14079b;
    }

    @Override // com.google.android.gms.internal.ads.zzelb
    /* JADX INFO: renamed from: c */
    public final String mo6255c() {
        return this.f14080c;
    }

    @Override // com.google.android.gms.internal.ads.zzelb
    /* JADX INFO: renamed from: d */
    public final String mo6256d() {
        return this.f14081d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzelb)) {
            return false;
        }
        zzelb zzelbVar = (zzelb) obj;
        if (!this.f14078a.equals(zzelbVar.mo6253a())) {
            return false;
        }
        com.google.android.gms.ads.internal.overlay.zzm zzmVar = this.f14079b;
        if (zzmVar == null) {
            if (zzelbVar.mo6254b() != null) {
                return false;
            }
        } else if (!zzmVar.equals(zzelbVar.mo6254b())) {
            return false;
        }
        String str = this.f14080c;
        if (str == null) {
            if (zzelbVar.mo6255c() != null) {
                return false;
            }
        } else if (!str.equals(zzelbVar.mo6255c())) {
            return false;
        }
        String str2 = this.f14081d;
        if (str2 == null) {
            return zzelbVar.mo6256d() == null;
        }
        return str2.equals(zzelbVar.mo6256d());
    }

    public final int hashCode() {
        int iHashCode = this.f14078a.hashCode() ^ 1000003;
        com.google.android.gms.ads.internal.overlay.zzm zzmVar = this.f14079b;
        int iHashCode2 = ((iHashCode * 1000003) ^ (zzmVar == null ? 0 : zzmVar.hashCode())) * 1000003;
        String str = this.f14080c;
        int iHashCode3 = (iHashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f14081d;
        return iHashCode3 ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        String string = this.f14078a.toString();
        int length = string.length();
        String strValueOf = String.valueOf(this.f14079b);
        int length2 = strValueOf.length();
        String str = this.f14080c;
        int length3 = String.valueOf(str).length();
        String str2 = this.f14081d;
        StringBuilder sb = new StringBuilder(length + 40 + length2 + 13 + length3 + 6 + String.valueOf(str2).length() + 1);
        AbstractC0271e0.m413u(sb, "OfflineUtilsParams{activity=", string, ", adOverlay=", strValueOf);
        AbstractC0271e0.m413u(sb, ", gwsQueryId=", str, ", uri=", str2);
        sb.append("}");
        return sb.toString();
    }
}
