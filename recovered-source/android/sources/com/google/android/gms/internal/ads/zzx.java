package com.google.android.gms.internal.ads;

import java.util.Objects;
import p011H.AbstractC0271e0;

/* JADX INFO: loaded from: classes2.dex */
public final class zzx {

    /* JADX INFO: renamed from: a */
    public final String f21247a;

    /* JADX INFO: renamed from: b */
    public final String f21248b;

    static {
        String str = zzfm.f16091a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
    }

    public zzx(String str, String str2) {
        this.f21247a = zzfm.m6515q(str);
        this.f21248b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzx.class == obj.getClass()) {
            zzx zzxVar = (zzx) obj;
            if (Objects.equals(this.f21247a, zzxVar.f21247a) && Objects.equals(this.f21248b, zzxVar.f21248b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f21248b.hashCode() * 31;
        String str = this.f21247a;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        String str = this.f21247a;
        int length = String.valueOf(str).length();
        String str2 = this.f21248b;
        StringBuilder sb = new StringBuilder(length + 10 + String.valueOf(str2).length() + 3);
        AbstractC0271e0.m413u(sb, "{ lang=", str, ", '", str2);
        sb.append("' }");
        return sb.toString();
    }
}
