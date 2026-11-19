package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzeau extends zzeay {

    /* JADX INFO: renamed from: a */
    public long f13480a;

    /* JADX INFO: renamed from: b */
    public int f13481b;

    /* JADX INFO: renamed from: c */
    public byte f13482c;

    /* JADX INFO: renamed from: a */
    public final zzeaz m6136a() {
        if (this.f13482c == 3) {
            return new zzeav(this.f13480a, this.f13481b);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f13482c & 1) == 0) {
            sb.append(" id");
        }
        if ((this.f13482c & 2) == 0) {
            sb.append(" eventType");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
