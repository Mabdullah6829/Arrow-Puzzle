package com.google.android.gms.internal.ads;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhvp extends zzhxt {

    /* JADX INFO: renamed from: a */
    public final zzhvo f19250a;

    public zzhvp(zzhvo zzhvoVar) {
        this.f19250a = zzhvoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzheq
    /* JADX INFO: renamed from: a */
    public final boolean mo7421a() {
        return this.f19250a != zzhvo.f19248e;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zzhvp) && ((zzhvp) obj).f19250a == this.f19250a;
    }

    public final int hashCode() {
        return Objects.hash(zzhvp.class, this.f19250a);
    }

    public final String toString() {
        String string = this.f19250a.toString();
        return AbstractC1456a.m2450q(new StringBuilder(string.length() + 30), "Ed25519 Parameters (variant: ", string, ")");
    }
}
