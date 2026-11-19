package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zznj {

    /* JADX INFO: renamed from: b */
    public static final zznj f20502b = new zznj(new zzni());

    /* JADX INFO: renamed from: a */
    public final zzgxd f20503a;

    public zznj(zzni zzniVar) {
        this.f20503a = zzniVar.f20501a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zznj) && this.f20503a.equals(((zznj) obj).f20503a);
    }

    public final int hashCode() {
        Boolean bool = Boolean.TRUE;
        return Objects.hash(this.f20503a, null, null, bool, bool, bool, bool, bool);
    }
}
