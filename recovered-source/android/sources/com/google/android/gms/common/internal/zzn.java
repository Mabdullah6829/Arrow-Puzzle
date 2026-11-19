package com.google.android.gms.common.internal;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class zzn {

    /* JADX INFO: renamed from: a */
    public final String f4534a;

    /* JADX INFO: renamed from: b */
    public final String f4535b;

    /* JADX INFO: renamed from: c */
    public final boolean f4536c;

    public zzn(String str, String str2, boolean z) {
        Preconditions.m3541e(str);
        this.f4534a = str;
        Preconditions.m3541e(str2);
        this.f4535b = str2;
        this.f4536c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzn)) {
            return false;
        }
        zzn zznVar = (zzn) obj;
        return Objects.m3535a(this.f4534a, zznVar.f4534a) && Objects.m3535a(this.f4535b, zznVar.f4535b) && Objects.m3535a(null, null) && this.f4536c == zznVar.f4536c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4534a, this.f4535b, null, 4225, Boolean.valueOf(this.f4536c)});
    }

    public final String toString() {
        String str = this.f4534a;
        if (str != null) {
            return str;
        }
        Preconditions.m3544h(null);
        throw null;
    }
}
