package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcbt extends zzcbv {

    /* JADX INFO: renamed from: s */
    public final String f9736s;

    /* JADX INFO: renamed from: t */
    public final int f9737t;

    public zzcbt(String str, int i2) {
        this.f9736s = str;
        this.f9737t = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzcbt)) {
            return false;
        }
        zzcbt zzcbtVar = (zzcbt) obj;
        if (Objects.m3535a(this.f9736s, zzcbtVar.f9736s)) {
            if (Objects.m3535a(Integer.valueOf(this.f9737t), Integer.valueOf(zzcbtVar.f9737t))) {
                return true;
            }
        }
        return false;
    }
}
