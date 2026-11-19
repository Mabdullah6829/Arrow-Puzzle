package com.google.android.gms.internal.ads;

import java.util.Objects;
import p011H.AbstractC0271e0;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhhj extends zzhfh {

    /* JADX INFO: renamed from: a */
    public final String f18731a;

    /* JADX INFO: renamed from: b */
    public final zzhhi f18732b;

    public zzhhj(String str, zzhhi zzhhiVar) {
        this.f18731a = str;
        this.f18732b = zzhhiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzheq
    /* JADX INFO: renamed from: a */
    public final boolean mo7421a() {
        return this.f18732b != zzhhi.f18729c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhhj)) {
            return false;
        }
        zzhhj zzhhjVar = (zzhhj) obj;
        return zzhhjVar.f18731a.equals(this.f18731a) && zzhhjVar.f18732b.equals(this.f18732b);
    }

    public final int hashCode() {
        return Objects.hash(zzhhj.class, this.f18731a, this.f18732b);
    }

    public final String toString() {
        String string = this.f18732b.toString();
        String str = this.f18731a;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 45 + string.length() + 1);
        AbstractC0271e0.m413u(sb, "LegacyKmsAead Parameters (keyUri: ", str, ", variant: ", string);
        sb.append(")");
        return sb.toString();
    }
}
