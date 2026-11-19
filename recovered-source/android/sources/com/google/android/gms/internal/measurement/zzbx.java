package com.google.android.gms.internal.measurement;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import p011H.AbstractC0271e0;

/* JADX INFO: loaded from: classes2.dex */
final class zzbx extends zzcd {

    /* JADX INFO: renamed from: b */
    public final String f22337b;

    /* JADX INFO: renamed from: c */
    public final int f22338c;

    /* JADX INFO: renamed from: d */
    public final int f22339d;

    public /* synthetic */ zzbx(String str, int i2, int i3) {
        this.f22337b = str;
        this.f22338c = i2;
        this.f22339d = i3;
    }

    @Override // com.google.android.gms.internal.measurement.zzcd
    /* JADX INFO: renamed from: a */
    public final String mo9825a() {
        return this.f22337b;
    }

    @Override // com.google.android.gms.internal.measurement.zzcd
    /* JADX INFO: renamed from: b */
    public final int mo9826b() {
        return this.f22338c;
    }

    @Override // com.google.android.gms.internal.measurement.zzcd
    /* JADX INFO: renamed from: c */
    public final int mo9827c() {
        return this.f22339d;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof zzcd)) {
                return false;
            }
            zzcd zzcdVar = (zzcd) obj;
            if (!this.f22337b.equals(zzcdVar.mo9825a())) {
                return false;
            }
            int iMo9826b = zzcdVar.mo9826b();
            int i2 = this.f22338c;
            if (i2 == 0) {
                throw null;
            }
            if (i2 != iMo9826b) {
                return false;
            }
            int iMo9827c = zzcdVar.mo9827c();
            if (this.f22339d == 0) {
                throw null;
            }
            if (iMo9827c != 1) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int iHashCode = this.f22337b.hashCode() ^ 1000003;
        int i2 = this.f22338c;
        if (i2 == 0) {
            throw null;
        }
        int i3 = (((iHashCode * 1000003) ^ 1237) * 1000003) ^ i2;
        if (this.f22339d != 0) {
            return (i3 * (-721379959)) ^ 1;
        }
        throw null;
    }

    public final String toString() {
        String str;
        int i2 = this.f22338c;
        if (i2 == 1) {
            str = "ALL_CHECKS";
        } else if (i2 == 2) {
            str = "SKIP_COMPLIANCE_CHECK";
        } else if (i2 != 3) {
            str = i2 != 4 ? "null" : "NO_CHECKS";
        } else {
            str = "SKIP_SECURITY_CHECK";
        }
        String str2 = this.f22339d == 1 ? "READ_AND_WRITE" : "null";
        String str3 = this.f22337b;
        StringBuilder sb = new StringBuilder(str2.length() + AbstractC1456a.m2438e(String.valueOf(str3).length() + 73, 52, str) + 1);
        AbstractC0271e0.m413u(sb, "FileComplianceOptions{fileOwner=", str3, ", hasDifferentDmaOwner=false, fileChecks=", str);
        return AbstractC1456a.m2450q(sb, ", multipleProductIdGroupsResolver=null, filePurpose=", str2, "}");
    }
}
