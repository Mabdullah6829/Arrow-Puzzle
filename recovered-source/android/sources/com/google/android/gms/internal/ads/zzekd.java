package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import androidx.datastore.preferences.protobuf.AbstractC1456a;
import p011H.AbstractC0271e0;

/* JADX INFO: loaded from: classes2.dex */
final class zzekd extends zzekg {

    /* JADX INFO: renamed from: a */
    public final String f14071a;

    /* JADX INFO: renamed from: b */
    public final String f14072b;

    /* JADX INFO: renamed from: c */
    public final Drawable f14073c;

    public zzekd(String str, String str2, Drawable drawable) {
        this.f14071a = str;
        if (str2 == null) {
            throw new NullPointerException("Null imageUrl");
        }
        this.f14072b = str2;
        this.f14073c = drawable;
    }

    @Override // com.google.android.gms.internal.ads.zzekg
    /* JADX INFO: renamed from: a */
    public final String mo6245a() {
        return this.f14071a;
    }

    @Override // com.google.android.gms.internal.ads.zzekg
    /* JADX INFO: renamed from: b */
    public final String mo6246b() {
        return this.f14072b;
    }

    @Override // com.google.android.gms.internal.ads.zzekg
    /* JADX INFO: renamed from: c */
    public final Drawable mo6247c() {
        return this.f14073c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzekg)) {
            return false;
        }
        zzekg zzekgVar = (zzekg) obj;
        String str = this.f14071a;
        if (str == null) {
            if (zzekgVar.mo6245a() != null) {
                return false;
            }
        } else if (!str.equals(zzekgVar.mo6245a())) {
            return false;
        }
        if (!this.f14072b.equals(zzekgVar.mo6246b())) {
            return false;
        }
        Drawable drawable = this.f14073c;
        if (drawable == null) {
            return zzekgVar.mo6247c() == null;
        }
        return drawable.equals(zzekgVar.mo6247c());
    }

    public final int hashCode() {
        String str = this.f14071a;
        int iHashCode = (((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.f14072b.hashCode();
        Drawable drawable = this.f14073c;
        return (drawable != null ? drawable.hashCode() : 0) ^ (iHashCode * 1000003);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f14073c);
        String str = this.f14071a;
        int length = String.valueOf(str).length();
        int length2 = strValueOf.length();
        String str2 = this.f14072b;
        StringBuilder sb = new StringBuilder(str2.length() + length + 42 + 7 + length2 + 1);
        AbstractC0271e0.m413u(sb, "OfflineAdAssets{advertiserName=", str, ", imageUrl=", str2);
        return AbstractC1456a.m2450q(sb, ", icon=", strValueOf, "}");
    }
}
