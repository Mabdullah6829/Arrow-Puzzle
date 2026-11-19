package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import p011H.AbstractC0271e0;

/* JADX INFO: loaded from: classes2.dex */
public final class zzatd {

    /* JADX INFO: renamed from: a */
    public final String f6872a;

    /* JADX INFO: renamed from: b */
    public final String f6873b;

    public zzatd(String str, String str2) {
        this.f6872a = str;
        this.f6873b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzatd.class == obj.getClass()) {
            zzatd zzatdVar = (zzatd) obj;
            if (TextUtils.equals(this.f6872a, zzatdVar.f6872a) && TextUtils.equals(this.f6873b, zzatdVar.f6873b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f6873b.hashCode() + (this.f6872a.hashCode() * 31);
    }

    public final String toString() {
        String str = this.f6872a;
        int length = String.valueOf(str).length();
        String str2 = this.f6873b;
        StringBuilder sb = new StringBuilder(length + 19 + String.valueOf(str2).length() + 1);
        AbstractC0271e0.m413u(sb, "Header[name=", str, ",value=", str2);
        sb.append("]");
        return sb.toString();
    }
}
