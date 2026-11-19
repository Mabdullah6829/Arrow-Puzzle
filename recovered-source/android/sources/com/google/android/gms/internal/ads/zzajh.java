package com.google.android.gms.internal.ads;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import java.util.Objects;
import p011H.AbstractC0271e0;

/* JADX INFO: loaded from: classes2.dex */
public final class zzajh implements zzao {

    /* JADX INFO: renamed from: a */
    public final int f5520a;

    /* JADX INFO: renamed from: b */
    public final String f5521b;

    /* JADX INFO: renamed from: c */
    public final String f5522c;

    /* JADX INFO: renamed from: d */
    public final String f5523d;

    /* JADX INFO: renamed from: e */
    public final boolean f5524e;

    /* JADX INFO: renamed from: f */
    public final int f5525f;

    public zzajh(String str, String str2, boolean z, int i2, String str3, int i3) {
        boolean z2 = true;
        if (i3 != -1 && i3 <= 0) {
            z2 = false;
        }
        zzgtr.m7128a(z2);
        this.f5520a = i2;
        this.f5521b = str;
        this.f5522c = str2;
        this.f5523d = str3;
        this.f5524e = z;
        this.f5525f = i3;
    }

    @Override // com.google.android.gms.internal.ads.zzao
    /* JADX INFO: renamed from: a */
    public final void mo4149a(zzam zzamVar) {
        String str = this.f5522c;
        if (str != null) {
            zzamVar.f5922x = str;
        }
        String str2 = this.f5521b;
        if (str2 != null) {
            zzamVar.f5921w = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzajh.class == obj.getClass()) {
            zzajh zzajhVar = (zzajh) obj;
            if (this.f5520a == zzajhVar.f5520a && Objects.equals(this.f5521b, zzajhVar.f5521b) && Objects.equals(this.f5522c, zzajhVar.f5522c) && Objects.equals(this.f5523d, zzajhVar.f5523d) && this.f5524e == zzajhVar.f5524e && this.f5525f == zzajhVar.f5525f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f5521b;
        int iHashCode = str != null ? str.hashCode() : 0;
        String str2 = this.f5522c;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        int i2 = ((this.f5520a + 527) * 31) + iHashCode;
        String str3 = this.f5523d;
        return (((((((i2 * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.f5524e ? 1 : 0)) * 31) + this.f5525f;
    }

    public final String toString() {
        String str = this.f5522c;
        int length = String.valueOf(str).length();
        String str2 = this.f5521b;
        int length2 = String.valueOf(str2).length();
        int i2 = this.f5520a;
        int length3 = String.valueOf(i2).length();
        int i3 = this.f5525f;
        StringBuilder sb = new StringBuilder(AbstractC1456a.m2437d(length, 28, length2, 11, length3) + 19 + String.valueOf(i3).length());
        AbstractC0271e0.m413u(sb, "IcyHeaders: name=\"", str, "\", genre=\"", str2);
        return AbstractC1456a.m2449p(sb, "\", bitrate=", i2, ", metadataInterval=", i3);
    }
}
