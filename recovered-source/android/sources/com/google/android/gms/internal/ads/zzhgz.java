package com.google.android.gms.internal.ads;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhgz extends zzhfh {

    /* JADX INFO: renamed from: a */
    public final zzhgy f18710a;

    public zzhgz(zzhgy zzhgyVar) {
        this.f18710a = zzhgyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzheq
    /* JADX INFO: renamed from: a */
    public final boolean mo7421a() {
        return this.f18710a != zzhgy.f18708d;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zzhgz) && ((zzhgz) obj).f18710a == this.f18710a;
    }

    public final int hashCode() {
        return Objects.hash(zzhgz.class, this.f18710a);
    }

    public final String toString() {
        String string = this.f18710a.toString();
        return AbstractC1456a.m2450q(new StringBuilder(string.length() + 39), "ChaCha20Poly1305 Parameters (variant: ", string, ")");
    }
}
