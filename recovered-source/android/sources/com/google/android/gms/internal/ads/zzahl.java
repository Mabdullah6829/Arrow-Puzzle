package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class zzahl {

    /* JADX INFO: renamed from: a */
    public final int f5323a;

    /* JADX INFO: renamed from: b */
    public final byte[] f5324b;

    /* JADX INFO: renamed from: c */
    public final int f5325c;

    /* JADX INFO: renamed from: d */
    public final int f5326d;

    public zzahl(int i2, byte[] bArr, int i3, int i4) {
        this.f5323a = i2;
        this.f5324b = bArr;
        this.f5325c = i3;
        this.f5326d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzahl.class == obj.getClass()) {
            zzahl zzahlVar = (zzahl) obj;
            if (this.f5323a == zzahlVar.f5323a && this.f5325c == zzahlVar.f5325c && this.f5326d == zzahlVar.f5326d && Arrays.equals(this.f5324b, zzahlVar.f5324b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f5324b) + (this.f5323a * 31)) * 31) + this.f5325c) * 31) + this.f5326d;
    }
}
