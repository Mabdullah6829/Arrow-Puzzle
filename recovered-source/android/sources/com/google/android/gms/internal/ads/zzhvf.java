package com.google.android.gms.internal.ads;

import java.util.Objects;
import p011H.AbstractC0271e0;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhvf extends zzhxt {

    /* JADX INFO: renamed from: a */
    public final zzhvd f19221a;

    /* JADX INFO: renamed from: b */
    public final zzhvb f19222b;

    /* JADX INFO: renamed from: c */
    public final zzhvc f19223c;

    /* JADX INFO: renamed from: d */
    public final zzhve f19224d;

    public /* synthetic */ zzhvf(zzhvd zzhvdVar, zzhvb zzhvbVar, zzhvc zzhvcVar, zzhve zzhveVar) {
        this.f19221a = zzhvdVar;
        this.f19222b = zzhvbVar;
        this.f19223c = zzhvcVar;
        this.f19224d = zzhveVar;
    }

    @Override // com.google.android.gms.internal.ads.zzheq
    /* JADX INFO: renamed from: a */
    public final boolean mo7421a() {
        return this.f19224d != zzhve.f19219e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhvf)) {
            return false;
        }
        zzhvf zzhvfVar = (zzhvf) obj;
        return zzhvfVar.f19221a == this.f19221a && zzhvfVar.f19222b == this.f19222b && zzhvfVar.f19223c == this.f19223c && zzhvfVar.f19224d == this.f19224d;
    }

    public final int hashCode() {
        return Objects.hash(zzhvf.class, this.f19221a, this.f19222b, this.f19223c, this.f19224d);
    }

    public final String toString() {
        String string = this.f19224d.toString();
        int length = string.length();
        String string2 = this.f19223c.toString();
        int length2 = string2.length();
        String string3 = this.f19221a.toString();
        int length3 = string3.length();
        String string4 = this.f19222b.toString();
        StringBuilder sb = new StringBuilder(length + 39 + length2 + 12 + length3 + 9 + string4.length() + 1);
        AbstractC0271e0.m413u(sb, "ECDSA Parameters (variant: ", string, ", hashType: ", string2);
        AbstractC0271e0.m413u(sb, ", encoding: ", string3, ", curve: ", string4);
        sb.append(")");
        return sb.toString();
    }
}
