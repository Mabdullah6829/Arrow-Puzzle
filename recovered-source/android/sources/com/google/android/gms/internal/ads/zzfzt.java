package com.google.android.gms.internal.ads;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import p011H.AbstractC0271e0;

/* JADX INFO: loaded from: classes2.dex */
final class zzfzt extends zzfzz {

    /* JADX INFO: renamed from: b */
    public final String f16869b;

    /* JADX INFO: renamed from: c */
    public final int f16870c;

    /* JADX INFO: renamed from: d */
    public final int f16871d;

    public /* synthetic */ zzfzt(String str, int i2, int i3) {
        this.f16869b = str;
        this.f16870c = i2;
        this.f16871d = i3;
    }

    @Override // com.google.android.gms.internal.ads.zzfzz
    /* JADX INFO: renamed from: a */
    public final String mo6830a() {
        return this.f16869b;
    }

    @Override // com.google.android.gms.internal.ads.zzfzz
    /* JADX INFO: renamed from: b */
    public final int mo6831b() {
        return this.f16870c;
    }

    @Override // com.google.android.gms.internal.ads.zzfzz
    /* JADX INFO: renamed from: c */
    public final int mo6832c() {
        return this.f16871d;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof zzfzz)) {
                return false;
            }
            zzfzz zzfzzVar = (zzfzz) obj;
            if (!this.f16869b.equals(zzfzzVar.mo6830a())) {
                return false;
            }
            int iMo6831b = zzfzzVar.mo6831b();
            int i2 = this.f16870c;
            if (i2 == 0) {
                throw null;
            }
            if (i2 != iMo6831b) {
                return false;
            }
            int iMo6832c = zzfzzVar.mo6832c();
            if (this.f16871d == 0) {
                throw null;
            }
            if (iMo6832c != 1) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int iHashCode = this.f16869b.hashCode() ^ 1000003;
        int i2 = this.f16870c;
        if (i2 == 0) {
            throw null;
        }
        int i3 = (((iHashCode * 1000003) ^ 1237) * 1000003) ^ i2;
        if (this.f16871d != 0) {
            return (i3 * (-721379959)) ^ 1;
        }
        throw null;
    }

    public final String toString() {
        String str;
        int i2 = this.f16870c;
        if (i2 == 1) {
            str = "ALL_CHECKS";
        } else if (i2 == 2) {
            str = "SKIP_COMPLIANCE_CHECK";
        } else if (i2 != 3) {
            str = i2 != 4 ? "null" : "NO_CHECKS";
        } else {
            str = "SKIP_SECURITY_CHECK";
        }
        String str2 = this.f16871d == 1 ? "READ_AND_WRITE" : "null";
        String str3 = this.f16869b;
        StringBuilder sb = new StringBuilder(str2.length() + AbstractC1456a.m2438e(String.valueOf(str3).length() + 73, 52, str) + 1);
        AbstractC0271e0.m413u(sb, "FileComplianceOptions{fileOwner=", str3, ", hasDifferentDmaOwner=false, fileChecks=", str);
        return AbstractC1456a.m2450q(sb, ", multipleProductIdGroupsResolver=null, filePurpose=", str2, "}");
    }
}
