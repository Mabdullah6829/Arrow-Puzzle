package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzibt extends zzibr {

    /* JADX INFO: renamed from: s */
    public final zzich f19623s = new zzich(zzich.f19657A, false);

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof zzibt) && ((zzibt) obj).f19623s.equals(this.f19623s);
        }
        return true;
    }

    /* JADX INFO: renamed from: g */
    public final zzibr m8056g(String str) {
        return (zzibr) this.f19623s.get(str);
    }

    public final int hashCode() {
        return this.f19623s.hashCode();
    }
}
