package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class zzajj extends zzajs {

    /* JADX INFO: renamed from: b */
    public final byte[] f5530b;

    public zzajj(String str, byte[] bArr) {
        super(str);
        this.f5530b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzajj.class == obj.getClass()) {
            zzajj zzajjVar = (zzajj) obj;
            if (this.f5554a.equals(zzajjVar.f5554a) && Arrays.equals(this.f5530b, zzajjVar.f5530b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f5530b) + ((this.f5554a.hashCode() + 527) * 31);
    }
}
