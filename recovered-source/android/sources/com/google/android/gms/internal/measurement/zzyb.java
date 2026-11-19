package com.google.android.gms.internal.measurement;

import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
final class zzyb extends zzyc {

    /* JADX INFO: renamed from: e */
    public int f23092e = 0;

    /* JADX INFO: renamed from: b */
    public final String f23089b = "com/google/android/libraries/phenotype/client/Phlogger";

    /* JADX INFO: renamed from: c */
    public final String f23090c = "logInternal";

    /* JADX INFO: renamed from: d */
    public final String f23091d = "Phlogger.java";

    @Override // com.google.android.gms.internal.measurement.zzyc
    /* JADX INFO: renamed from: a */
    public final String mo10727a() {
        return this.f23089b.replace('/', '.');
    }

    @Override // com.google.android.gms.internal.measurement.zzyc
    /* JADX INFO: renamed from: b */
    public final String mo10728b() {
        return this.f23090c;
    }

    @Override // com.google.android.gms.internal.measurement.zzyc
    /* JADX INFO: renamed from: c */
    public final int mo10729c() {
        return 44;
    }

    @Override // com.google.android.gms.internal.measurement.zzyc
    /* JADX INFO: renamed from: d */
    public final String mo10730d() {
        char c = File.separatorChar;
        String str = this.f23091d;
        return str.substring(str.lastIndexOf(c) + 1);
    }

    @Override // com.google.android.gms.internal.measurement.zzyc
    /* JADX INFO: renamed from: e */
    public final String mo10731e() {
        return this.f23091d;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzyb) {
            zzyb zzybVar = (zzyb) obj;
            if (this.f23090c.equals(zzybVar.f23090c)) {
                String str = zzybVar.f23089b;
                String str2 = this.f23089b;
                if (str2 != str) {
                    if (str2.length() == str.length()) {
                        for (int i2 = 0; i2 < str2.length(); i2++) {
                            char cCharAt = str2.charAt(i2);
                            char cCharAt2 = str.charAt(i2);
                            if (cCharAt == cCharAt2 || ((cCharAt & (-2)) == 46 && (cCharAt ^ cCharAt2) == 1)) {
                            }
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i2 = this.f23092e;
        if (i2 != 0) {
            return i2;
        }
        int iHashCode = ((this.f23090c.hashCode() + 4867) * 31) + 44;
        this.f23092e = iHashCode;
        return iHashCode;
    }
}
