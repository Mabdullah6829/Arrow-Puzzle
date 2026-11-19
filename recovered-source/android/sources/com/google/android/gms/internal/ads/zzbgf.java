package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbgf {

    /* JADX INFO: renamed from: a */
    public final long f7817a;

    /* JADX INFO: renamed from: b */
    public final String f7818b;

    /* JADX INFO: renamed from: c */
    public final int f7819c;

    public zzbgf(String str, int i2, long j2) {
        this.f7817a = j2;
        this.f7818b = str;
        this.f7819c = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzbgf)) {
            return false;
        }
        zzbgf zzbgfVar = (zzbgf) obj;
        return zzbgfVar.f7817a == this.f7817a && zzbgfVar.f7819c == this.f7819c;
    }

    public final int hashCode() {
        return (int) this.f7817a;
    }
}
