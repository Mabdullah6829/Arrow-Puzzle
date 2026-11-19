package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzgra extends zzgsb {

    /* JADX INFO: renamed from: a */
    public int f18095a;

    /* JADX INFO: renamed from: b */
    public String f18096b;

    /* JADX INFO: renamed from: c */
    public int f18097c;

    /* JADX INFO: renamed from: d */
    public Boolean f18098d;

    /* JADX INFO: renamed from: e */
    public byte f18099e;

    /* JADX INFO: renamed from: a */
    public final zzgsc m7092a() {
        if (this.f18099e == 3) {
            return new zzgrb(this.f18095a, this.f18096b, this.f18097c, this.f18098d);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f18099e & 1) == 0) {
            sb.append(" statusCode");
        }
        if ((this.f18099e & 2) == 0) {
            sb.append(" uiMode");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
