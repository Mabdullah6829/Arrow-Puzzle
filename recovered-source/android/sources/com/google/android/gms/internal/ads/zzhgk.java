package com.google.android.gms.internal.ads;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import java.util.Objects;
import p011H.AbstractC0271e0;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhgk extends zzhfh {

    /* JADX INFO: renamed from: a */
    public final int f18673a;

    /* JADX INFO: renamed from: b */
    public final zzhgj f18674b;

    public /* synthetic */ zzhgk(int i2, zzhgj zzhgjVar) {
        this.f18673a = i2;
        this.f18674b = zzhgjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzheq
    /* JADX INFO: renamed from: a */
    public final boolean mo7421a() {
        return this.f18674b != zzhgj.f18671d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhgk)) {
            return false;
        }
        zzhgk zzhgkVar = (zzhgk) obj;
        return zzhgkVar.f18673a == this.f18673a && zzhgkVar.f18674b == this.f18674b;
    }

    public final int hashCode() {
        return Objects.hash(zzhgk.class, Integer.valueOf(this.f18673a), 12, 16, this.f18674b);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f18674b);
        int length = strValueOf.length();
        int length2 = String.valueOf(12).length();
        int length3 = String.valueOf(16).length();
        int i2 = this.f18673a;
        StringBuilder sb = new StringBuilder(AbstractC0271e0.m395c(AbstractC1456a.m2437d(length, 30, length2, 10, length3), 15, String.valueOf(i2).length(), 10));
        sb.append("AesGcm Parameters (variant: ");
        sb.append(strValueOf);
        sb.append(", 12-byte IV, 16-byte tag, and ");
        sb.append(i2);
        sb.append("-byte key)");
        return sb.toString();
    }
}
