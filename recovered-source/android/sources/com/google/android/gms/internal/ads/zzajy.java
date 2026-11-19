package com.google.android.gms.internal.ads;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzajy extends zzajs {

    /* JADX INFO: renamed from: b */
    public final String f5568b;

    /* JADX INFO: renamed from: c */
    public final String f5569c;

    public zzajy(String str, String str2, String str3) {
        super(str);
        this.f5568b = str2;
        this.f5569c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzajy.class == obj.getClass()) {
            zzajy zzajyVar = (zzajy) obj;
            if (this.f5554a.equals(zzajyVar.f5554a) && Objects.equals(this.f5568b, zzajyVar.f5568b) && Objects.equals(this.f5569c, zzajyVar.f5569c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f5554a.hashCode() + 527;
        String str = this.f5568b;
        return this.f5569c.hashCode() + (((iHashCode * 31) + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // com.google.android.gms.internal.ads.zzajs
    public final String toString() {
        String str = this.f5554a;
        int length = String.valueOf(str).length() + 6;
        String str2 = this.f5569c;
        return AbstractC1456a.m2450q(new StringBuilder(str2.length() + length), str, ": url=", str2);
    }
}
