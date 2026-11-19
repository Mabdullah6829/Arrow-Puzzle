package com.google.android.gms.internal.ads;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzajw extends zzajs {

    /* JADX INFO: renamed from: b */
    public final String f5564b;

    /* JADX INFO: renamed from: c */
    public final byte[] f5565c;

    public zzajw(String str, byte[] bArr) {
        super("PRIV");
        this.f5564b = str;
        this.f5565c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzajw.class == obj.getClass()) {
            zzajw zzajwVar = (zzajw) obj;
            if (Objects.equals(this.f5564b, zzajwVar.f5564b) && Arrays.equals(this.f5565c, zzajwVar.f5565c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f5565c) + ((this.f5564b.hashCode() + 527) * 31);
    }

    @Override // com.google.android.gms.internal.ads.zzajs
    public final String toString() {
        String str = this.f5554a;
        int length = String.valueOf(str).length() + 8;
        String str2 = this.f5564b;
        return AbstractC1456a.m2450q(new StringBuilder(str2.length() + length), str, ": owner=", str2);
    }
}
