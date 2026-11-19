package com.google.android.gms.internal.ads;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import java.util.Objects;
import p011H.AbstractC0271e0;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhgb extends zzhfh {

    /* JADX INFO: renamed from: a */
    public final int f18647a;

    /* JADX INFO: renamed from: b */
    public final int f18648b;

    /* JADX INFO: renamed from: c */
    public final zzhga f18649c;

    public /* synthetic */ zzhgb(int i2, int i3, zzhga zzhgaVar) {
        this.f18647a = i2;
        this.f18648b = i3;
        this.f18649c = zzhgaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzheq
    /* JADX INFO: renamed from: a */
    public final boolean mo7421a() {
        return this.f18649c != zzhga.f18645d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhgb)) {
            return false;
        }
        zzhgb zzhgbVar = (zzhgb) obj;
        return zzhgbVar.f18647a == this.f18647a && zzhgbVar.f18648b == this.f18648b && zzhgbVar.f18649c == this.f18649c;
    }

    public final int hashCode() {
        return Objects.hash(zzhgb.class, Integer.valueOf(this.f18647a), Integer.valueOf(this.f18648b), 16, this.f18649c);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f18649c);
        int length = strValueOf.length();
        int i2 = this.f18648b;
        int length2 = String.valueOf(i2).length();
        int length3 = String.valueOf(16).length();
        int i3 = this.f18647a;
        StringBuilder sb = new StringBuilder(AbstractC0271e0.m395c(AbstractC1456a.m2437d(length, 30, length2, 10, length3), 15, String.valueOf(i3).length(), 10));
        sb.append("AesEax Parameters (variant: ");
        sb.append(strValueOf);
        sb.append(", ");
        sb.append(i2);
        return AbstractC1456a.m2448o(sb, "-byte IV, 16-byte tag, and ", i3, "-byte key)");
    }
}
