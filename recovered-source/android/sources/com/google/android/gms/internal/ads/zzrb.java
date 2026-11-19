package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzrb {

    /* JADX INFO: renamed from: a */
    public boolean f20681a;

    /* JADX INFO: renamed from: b */
    public boolean f20682b;

    /* JADX INFO: renamed from: c */
    public boolean f20683c;

    /* JADX INFO: renamed from: d */
    public int f20684d = 0;

    /* JADX INFO: renamed from: a */
    public final zzrc m8847a() {
        if (this.f20681a || !(this.f20682b || this.f20683c)) {
            return new zzrc(this);
        }
        throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupportedForOffload is false");
    }
}
