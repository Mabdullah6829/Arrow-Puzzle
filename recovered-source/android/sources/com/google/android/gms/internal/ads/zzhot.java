package com.google.android.gms.internal.ads;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhot extends zzhpj {

    /* JADX INFO: renamed from: a */
    public final int f19080a;

    /* JADX INFO: renamed from: b */
    public final int f19081b;

    /* JADX INFO: renamed from: c */
    public final zzhos f19082c;

    public /* synthetic */ zzhot(int i2, int i3, zzhos zzhosVar) {
        this.f19080a = i2;
        this.f19081b = i3;
        this.f19082c = zzhosVar;
    }

    @Override // com.google.android.gms.internal.ads.zzheq
    /* JADX INFO: renamed from: a */
    public final boolean mo7421a() {
        return this.f19082c != zzhos.f19078e;
    }

    /* JADX INFO: renamed from: b */
    public final int m7604b() {
        zzhos zzhosVar = zzhos.f19078e;
        int i2 = this.f19081b;
        zzhos zzhosVar2 = this.f19082c;
        if (zzhosVar2 == zzhosVar) {
            return i2;
        }
        if (zzhosVar2 == zzhos.f19075b || zzhosVar2 == zzhos.f19076c || zzhosVar2 == zzhos.f19077d) {
            return i2 + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhot)) {
            return false;
        }
        zzhot zzhotVar = (zzhot) obj;
        return zzhotVar.f19080a == this.f19080a && zzhotVar.m7604b() == m7604b() && zzhotVar.f19082c == this.f19082c;
    }

    public final int hashCode() {
        return Objects.hash(zzhot.class, Integer.valueOf(this.f19080a), Integer.valueOf(this.f19081b), this.f19082c);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f19082c);
        int length = strValueOf.length();
        int i2 = this.f19081b;
        int length2 = String.valueOf(i2).length();
        int i3 = this.f19080a;
        StringBuilder sb = new StringBuilder(AbstractC1456a.m2437d(length, 32, length2, 16, String.valueOf(i3).length()) + 10);
        sb.append("AES-CMAC Parameters (variant: ");
        sb.append(strValueOf);
        sb.append(", ");
        sb.append(i2);
        return AbstractC1456a.m2448o(sb, "-byte tags, and ", i3, "-byte key)");
    }
}
