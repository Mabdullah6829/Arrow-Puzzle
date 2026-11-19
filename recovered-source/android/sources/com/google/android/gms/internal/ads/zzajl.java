package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzajl extends zzajs {

    /* JADX INFO: renamed from: b */
    public final String f5537b;

    /* JADX INFO: renamed from: c */
    public final boolean f5538c;

    /* JADX INFO: renamed from: d */
    public final boolean f5539d;

    /* JADX INFO: renamed from: e */
    public final String[] f5540e;

    /* JADX INFO: renamed from: f */
    public final zzajs[] f5541f;

    public zzajl(String str, boolean z, boolean z2, String[] strArr, zzajs[] zzajsVarArr) {
        super("CTOC");
        this.f5537b = str;
        this.f5538c = z;
        this.f5539d = z2;
        this.f5540e = strArr;
        this.f5541f = zzajsVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzajl.class == obj.getClass()) {
            zzajl zzajlVar = (zzajl) obj;
            if (this.f5538c == zzajlVar.f5538c && this.f5539d == zzajlVar.f5539d && Objects.equals(this.f5537b, zzajlVar.f5537b) && Arrays.equals(this.f5540e, zzajlVar.f5540e) && Arrays.equals(this.f5541f, zzajlVar.f5541f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f5537b.hashCode() + (((((this.f5538c ? 1 : 0) + 527) * 31) + (this.f5539d ? 1 : 0)) * 31);
    }
}
