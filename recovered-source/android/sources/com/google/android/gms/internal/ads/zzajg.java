package com.google.android.gms.internal.ads;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class zzajg implements zzao {

    /* JADX INFO: renamed from: a */
    public final int f5512a;

    /* JADX INFO: renamed from: b */
    public final String f5513b;

    /* JADX INFO: renamed from: c */
    public final String f5514c;

    /* JADX INFO: renamed from: d */
    public final int f5515d;

    /* JADX INFO: renamed from: e */
    public final int f5516e;

    /* JADX INFO: renamed from: f */
    public final int f5517f;

    /* JADX INFO: renamed from: g */
    public final int f5518g;

    /* JADX INFO: renamed from: h */
    public final byte[] f5519h;

    public zzajg(int i2, String str, String str2, int i3, int i4, int i5, int i6, byte[] bArr) {
        this.f5512a = i2;
        this.f5513b = str;
        this.f5514c = str2;
        this.f5515d = i3;
        this.f5516e = i4;
        this.f5517f = i5;
        this.f5518g = i6;
        this.f5519h = bArr;
    }

    /* JADX INFO: renamed from: b */
    public static zzajg m4148b(zzeu zzeuVar) {
        int iM6376b = zzeuVar.m6376b();
        String strM4356h = zzas.m4356h(zzeuVar.m6385k(zzeuVar.m6376b(), StandardCharsets.US_ASCII));
        String strM6385k = zzeuVar.m6385k(zzeuVar.m6376b(), StandardCharsets.UTF_8);
        int iM6376b2 = zzeuVar.m6376b();
        int iM6376b3 = zzeuVar.m6376b();
        int iM6376b4 = zzeuVar.m6376b();
        int iM6376b5 = zzeuVar.m6376b();
        int iM6376b6 = zzeuVar.m6376b();
        byte[] bArr = new byte[iM6376b6];
        zzeuVar.m6366H(bArr, 0, iM6376b6);
        return new zzajg(iM6376b, strM4356h, strM6385k, iM6376b2, iM6376b3, iM6376b4, iM6376b5, bArr);
    }

    @Override // com.google.android.gms.internal.ads.zzao
    /* JADX INFO: renamed from: a */
    public final void mo4149a(zzam zzamVar) {
        zzamVar.m4222a(this.f5512a, this.f5519h);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzajg.class == obj.getClass()) {
            zzajg zzajgVar = (zzajg) obj;
            if (this.f5512a == zzajgVar.f5512a && this.f5513b.equals(zzajgVar.f5513b) && this.f5514c.equals(zzajgVar.f5514c) && this.f5515d == zzajgVar.f5515d && this.f5516e == zzajgVar.f5516e && this.f5517f == zzajgVar.f5517f && this.f5518g == zzajgVar.f5518g && Arrays.equals(this.f5519h, zzajgVar.f5519h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f5519h) + ((((((((((this.f5514c.hashCode() + ((this.f5513b.hashCode() + ((this.f5512a + 527) * 31)) * 31)) * 31) + this.f5515d) * 31) + this.f5516e) * 31) + this.f5517f) * 31) + this.f5518g) * 31);
    }

    public final String toString() {
        String str = this.f5513b;
        int length = String.valueOf(str).length() + 32;
        String str2 = this.f5514c;
        return AbstractC1456a.m2451r(new StringBuilder(str2.length() + length), "Picture: mimeType=", str, ", description=", str2);
    }
}
