package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzqt {

    /* JADX INFO: renamed from: a */
    public boolean f20658a;

    /* JADX INFO: renamed from: b */
    public boolean f20659b;

    /* JADX INFO: renamed from: c */
    public boolean f20660c;

    /* JADX INFO: renamed from: a */
    public final zzqu m8841a() {
        if (this.f20658a || !(this.f20659b || this.f20660c)) {
            return new zzqu(this);
        }
        throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupported is false");
    }
}
