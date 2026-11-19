package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes2.dex */
final class zzbw extends zzcc {

    /* JADX INFO: renamed from: a */
    public String f22333a;

    /* JADX INFO: renamed from: b */
    public byte f22334b;

    /* JADX INFO: renamed from: c */
    public int f22335c;

    /* JADX INFO: renamed from: d */
    public int f22336d;

    /* JADX INFO: renamed from: a */
    public final zzcd m9824a() {
        if (this.f22334b == 1 && this.f22333a != null && this.f22335c != 0 && this.f22336d != 0) {
            return new zzbx(this.f22333a, this.f22335c, this.f22336d);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f22333a == null) {
            sb.append(" fileOwner");
        }
        if (this.f22334b == 0) {
            sb.append(" hasDifferentDmaOwner");
        }
        if (this.f22335c == 0) {
            sb.append(" fileChecks");
        }
        if (this.f22336d == 0) {
            sb.append(" filePurpose");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
