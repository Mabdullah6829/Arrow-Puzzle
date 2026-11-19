package com.google.android.gms.internal.ads;

import java.util.Objects;
import p011H.AbstractC0271e0;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhht extends zzhfh {

    /* JADX INFO: renamed from: a */
    public final zzhhs f18758a;

    /* JADX INFO: renamed from: b */
    public final String f18759b;

    /* JADX INFO: renamed from: c */
    public final zzhhr f18760c;

    /* JADX INFO: renamed from: d */
    public final zzhfh f18761d;

    public /* synthetic */ zzhht(zzhhs zzhhsVar, String str, zzhhr zzhhrVar, zzhfh zzhfhVar) {
        this.f18758a = zzhhsVar;
        this.f18759b = str;
        this.f18760c = zzhhrVar;
        this.f18761d = zzhfhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzheq
    /* JADX INFO: renamed from: a */
    public final boolean mo7421a() {
        return this.f18758a != zzhhs.f18756c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhht)) {
            return false;
        }
        zzhht zzhhtVar = (zzhht) obj;
        return zzhhtVar.f18760c.equals(this.f18760c) && zzhhtVar.f18761d.equals(this.f18761d) && zzhhtVar.f18759b.equals(this.f18759b) && zzhhtVar.f18758a.equals(this.f18758a);
    }

    public final int hashCode() {
        return Objects.hash(zzhht.class, this.f18759b, this.f18760c, this.f18761d, this.f18758a);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f18760c);
        String strValueOf2 = String.valueOf(this.f18761d);
        String strValueOf3 = String.valueOf(this.f18758a);
        String str = this.f18759b;
        int length = String.valueOf(str).length();
        int length2 = strValueOf.length();
        StringBuilder sb = new StringBuilder(length + 64 + length2 + 27 + strValueOf2.length() + 11 + strValueOf3.length() + 1);
        AbstractC0271e0.m413u(sb, "LegacyKmsEnvelopeAead Parameters (kekUri: ", str, ", dekParsingStrategy: ", strValueOf);
        AbstractC0271e0.m413u(sb, ", dekParametersForNewKeys: ", strValueOf2, ", variant: ", strValueOf3);
        sb.append(")");
        return sb.toString();
    }
}
