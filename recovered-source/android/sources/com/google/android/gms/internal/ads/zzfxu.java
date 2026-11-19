package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzfxu extends zzfxr {

    /* JADX INFO: renamed from: a */
    public String f16769a;

    /* JADX INFO: renamed from: b */
    public boolean f16770b;

    /* JADX INFO: renamed from: c */
    public boolean f16771c;

    /* JADX INFO: renamed from: d */
    public long f16772d;

    /* JADX INFO: renamed from: e */
    public long f16773e;

    /* JADX INFO: renamed from: f */
    public byte f16774f;

    /* JADX INFO: renamed from: a */
    public final zzfxs m6770a() {
        String str;
        if (this.f16774f == 63 && (str = this.f16769a) != null) {
            return new zzfxv(str, this.f16770b, this.f16771c, this.f16772d, this.f16773e);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f16769a == null) {
            sb.append(" clientVersion");
        }
        if ((this.f16774f & 1) == 0) {
            sb.append(" shouldGetAdvertisingId");
        }
        if ((this.f16774f & 2) == 0) {
            sb.append(" isGooglePlayServicesAvailable");
        }
        if ((this.f16774f & 4) == 0) {
            sb.append(" enableQuerySignalsTimeout");
        }
        if ((this.f16774f & 8) == 0) {
            sb.append(" querySignalsTimeoutMs");
        }
        if ((this.f16774f & 16) == 0) {
            sb.append(" enableQuerySignalsCache");
        }
        if ((this.f16774f & 32) == 0) {
            sb.append(" querySignalsCacheTtlSeconds");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
