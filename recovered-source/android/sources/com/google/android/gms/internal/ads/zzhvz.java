package com.google.android.gms.internal.ads;

import java.util.Objects;
import p011H.AbstractC0271e0;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhvz extends zzhxt {

    /* JADX INFO: renamed from: a */
    public final zzhvx f19271a = zzhvx.f19267a;

    /* JADX INFO: renamed from: b */
    public final zzhvy f19272b = zzhvy.f19268b;

    @Override // com.google.android.gms.internal.ads.zzheq
    /* JADX INFO: renamed from: a */
    public final boolean mo7421a() {
        return this.f19272b != zzhvy.f19269c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhvz)) {
            return false;
        }
        zzhvz zzhvzVar = (zzhvz) obj;
        return zzhvzVar.f19271a == this.f19271a && zzhvzVar.f19272b == this.f19272b;
    }

    public final int hashCode() {
        return Objects.hash(zzhvz.class, this.f19271a, this.f19272b);
    }

    public final String toString() {
        this.f19271a.getClass();
        int length = "ML_DSA_65".length();
        String string = this.f19272b.toString();
        StringBuilder sb = new StringBuilder(length + 47 + string.length() + 1);
        AbstractC0271e0.m413u(sb, "ML-DSA Parameters (ML-DSA instance: ", "ML_DSA_65", ", variant: ", string);
        sb.append(")");
        return sb.toString();
    }
}
