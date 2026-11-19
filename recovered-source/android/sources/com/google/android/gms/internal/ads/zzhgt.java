package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhgt extends zzhfh {

    /* JADX INFO: renamed from: a */
    public final int f18695a;

    /* JADX INFO: renamed from: b */
    public final zzhgs f18696b;

    public /* synthetic */ zzhgt(int i2, zzhgs zzhgsVar) {
        this.f18695a = i2;
        this.f18696b = zzhgsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzheq
    /* JADX INFO: renamed from: a */
    public final boolean mo7421a() {
        return this.f18696b != zzhgs.f18693d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhgt)) {
            return false;
        }
        zzhgt zzhgtVar = (zzhgt) obj;
        return zzhgtVar.f18695a == this.f18695a && zzhgtVar.f18696b == this.f18696b;
    }

    public final int hashCode() {
        return Objects.hash(zzhgt.class, Integer.valueOf(this.f18695a), this.f18696b);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f18696b);
        int length = strValueOf.length();
        int i2 = this.f18695a;
        StringBuilder sb = new StringBuilder(length + 33 + String.valueOf(i2).length() + 10);
        sb.append("AesGcmSiv Parameters (variant: ");
        sb.append(strValueOf);
        sb.append(", ");
        sb.append(i2);
        sb.append("-byte key)");
        return sb.toString();
    }
}
