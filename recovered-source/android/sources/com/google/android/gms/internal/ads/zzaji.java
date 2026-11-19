package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;
import p011H.AbstractC0271e0;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaji extends zzajs {

    /* JADX INFO: renamed from: b */
    public final String f5526b;

    /* JADX INFO: renamed from: c */
    public final String f5527c;

    /* JADX INFO: renamed from: d */
    public final int f5528d;

    /* JADX INFO: renamed from: e */
    public final byte[] f5529e;

    public zzaji(String str, String str2, int i2, byte[] bArr) {
        super("APIC");
        this.f5526b = str;
        this.f5527c = str2;
        this.f5528d = i2;
        this.f5529e = bArr;
    }

    @Override // com.google.android.gms.internal.ads.zzao
    /* JADX INFO: renamed from: a */
    public final void mo4149a(zzam zzamVar) {
        zzamVar.m4222a(this.f5528d, this.f5529e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaji.class == obj.getClass()) {
            zzaji zzajiVar = (zzaji) obj;
            if (this.f5528d == zzajiVar.f5528d && Objects.equals(this.f5526b, zzajiVar.f5526b) && Objects.equals(this.f5527c, zzajiVar.f5527c) && Arrays.equals(this.f5529e, zzajiVar.f5529e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f5526b;
        int iHashCode = str != null ? str.hashCode() : 0;
        String str2 = this.f5527c;
        return Arrays.hashCode(this.f5529e) + ((((((this.f5528d + 527) * 31) + iHashCode) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // com.google.android.gms.internal.ads.zzajs
    public final String toString() {
        String str = this.f5554a;
        int length = String.valueOf(str).length();
        String str2 = this.f5526b;
        int length2 = String.valueOf(str2).length();
        String str3 = this.f5527c;
        StringBuilder sb = new StringBuilder(length + 11 + length2 + 14 + String.valueOf(str3).length());
        AbstractC0271e0.m413u(sb, str, ": mimeType=", str2, ", description=");
        sb.append(str3);
        return sb.toString();
    }
}
