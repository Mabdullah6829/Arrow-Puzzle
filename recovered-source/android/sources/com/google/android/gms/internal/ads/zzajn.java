package com.google.android.gms.internal.ads;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import java.util.Arrays;
import java.util.Objects;
import p011H.AbstractC0271e0;

/* JADX INFO: loaded from: classes2.dex */
public final class zzajn extends zzajs {

    /* JADX INFO: renamed from: b */
    public final String f5545b;

    /* JADX INFO: renamed from: c */
    public final String f5546c;

    /* JADX INFO: renamed from: d */
    public final String f5547d;

    /* JADX INFO: renamed from: e */
    public final byte[] f5548e;

    public zzajn(String str, byte[] bArr, String str2, String str3) {
        super("GEOB");
        this.f5545b = str;
        this.f5546c = str2;
        this.f5547d = str3;
        this.f5548e = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzajn.class == obj.getClass()) {
            zzajn zzajnVar = (zzajn) obj;
            if (Objects.equals(this.f5545b, zzajnVar.f5545b) && Objects.equals(this.f5546c, zzajnVar.f5546c) && Objects.equals(this.f5547d, zzajnVar.f5547d) && Arrays.equals(this.f5548e, zzajnVar.f5548e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f5545b;
        return Arrays.hashCode(this.f5548e) + ((this.f5547d.hashCode() + ((this.f5546c.hashCode() + (((str != null ? str.hashCode() : 0) + 527) * 31)) * 31)) * 31);
    }

    @Override // com.google.android.gms.internal.ads.zzajs
    public final String toString() {
        String str = this.f5554a;
        int length = String.valueOf(str).length();
        String str2 = this.f5545b;
        int iM395c = AbstractC0271e0.m395c(length, 11, String.valueOf(str2).length(), 11);
        String str3 = this.f5546c;
        int length2 = str3.length() + iM395c + 14;
        String str4 = this.f5547d;
        StringBuilder sb = new StringBuilder(str4.length() + length2);
        AbstractC0271e0.m413u(sb, str, ": mimeType=", str2, ", filename=");
        return AbstractC1456a.m2450q(sb, str3, ", description=", str4);
    }
}
