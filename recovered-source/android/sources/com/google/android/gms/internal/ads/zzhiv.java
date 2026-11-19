package com.google.android.gms.internal.ads;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhiv extends zzhfh {

    /* JADX INFO: renamed from: a */
    public final zzhiu f18822a;

    public zzhiv(zzhiu zzhiuVar) {
        this.f18822a = zzhiuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzheq
    /* JADX INFO: renamed from: a */
    public final boolean mo7421a() {
        return this.f18822a != zzhiu.f18820d;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zzhiv) && ((zzhiv) obj).f18822a == this.f18822a;
    }

    public final int hashCode() {
        return Objects.hash(zzhiv.class, this.f18822a);
    }

    public final String toString() {
        String string = this.f18822a.toString();
        return AbstractC1456a.m2450q(new StringBuilder(string.length() + 40), "XChaCha20Poly1305 Parameters (variant: ", string, ")");
    }
}
