package com.google.android.gms.internal.ads;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import java.util.Objects;
import p011H.AbstractC0271e0;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhpg extends zzhpj {

    /* JADX INFO: renamed from: a */
    public final int f19120a;

    /* JADX INFO: renamed from: b */
    public final int f19121b;

    /* JADX INFO: renamed from: c */
    public final zzhpf f19122c;

    /* JADX INFO: renamed from: d */
    public final zzhpe f19123d;

    public /* synthetic */ zzhpg(int i2, int i3, zzhpf zzhpfVar, zzhpe zzhpeVar) {
        this.f19120a = i2;
        this.f19121b = i3;
        this.f19122c = zzhpfVar;
        this.f19123d = zzhpeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzheq
    /* JADX INFO: renamed from: a */
    public final boolean mo7421a() {
        return this.f19122c != zzhpf.f19118e;
    }

    /* JADX INFO: renamed from: b */
    public final int m7609b() {
        zzhpf zzhpfVar = zzhpf.f19118e;
        int i2 = this.f19121b;
        zzhpf zzhpfVar2 = this.f19122c;
        if (zzhpfVar2 == zzhpfVar) {
            return i2;
        }
        if (zzhpfVar2 == zzhpf.f19115b || zzhpfVar2 == zzhpf.f19116c || zzhpfVar2 == zzhpf.f19117d) {
            return i2 + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhpg)) {
            return false;
        }
        zzhpg zzhpgVar = (zzhpg) obj;
        return zzhpgVar.f19120a == this.f19120a && zzhpgVar.m7609b() == m7609b() && zzhpgVar.f19122c == this.f19122c && zzhpgVar.f19123d == this.f19123d;
    }

    public final int hashCode() {
        return Objects.hash(zzhpg.class, Integer.valueOf(this.f19120a), Integer.valueOf(this.f19121b), this.f19122c, this.f19123d);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f19122c);
        String strValueOf2 = String.valueOf(this.f19123d);
        int length = strValueOf.length();
        int length2 = strValueOf2.length();
        int i2 = this.f19121b;
        int length3 = String.valueOf(i2).length();
        int i3 = this.f19120a;
        StringBuilder sb = new StringBuilder(length + 38 + length2 + 2 + length3 + 16 + String.valueOf(i3).length() + 10);
        AbstractC0271e0.m413u(sb, "HMAC Parameters (variant: ", strValueOf, ", hashType: ", strValueOf2);
        AbstractC1456a.m2455v(sb, ", ", i2, "-byte tags, and ", i3);
        sb.append("-byte key)");
        return sb.toString();
    }
}
