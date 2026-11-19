package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzfzs extends zzfzy {

    /* JADX INFO: renamed from: a */
    public String f16865a;

    /* JADX INFO: renamed from: b */
    public byte f16866b;

    /* JADX INFO: renamed from: c */
    public int f16867c;

    /* JADX INFO: renamed from: d */
    public int f16868d;

    /* JADX INFO: renamed from: a */
    public final zzfzz m6829a() {
        if (this.f16866b == 1 && this.f16865a != null && this.f16867c != 0 && this.f16868d != 0) {
            return new zzfzt(this.f16865a, this.f16867c, this.f16868d);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f16865a == null) {
            sb.append(" fileOwner");
        }
        if (this.f16866b == 0) {
            sb.append(" hasDifferentDmaOwner");
        }
        if (this.f16867c == 0) {
            sb.append(" fileChecks");
        }
        if (this.f16868d == 0) {
            sb.append(" filePurpose");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
