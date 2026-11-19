package com.google.android.gms.internal.ads;

import java.security.cert.X509Certificate;

/* JADX INFO: loaded from: classes2.dex */
final class zzasp extends zzasq {

    /* JADX INFO: renamed from: t */
    public final byte[] f6844t;

    public zzasp(X509Certificate x509Certificate, byte[] bArr) {
        super(x509Certificate);
        this.f6844t = bArr;
    }

    @Override // com.google.android.gms.internal.ads.zzasq, java.security.cert.Certificate
    public final byte[] getEncoded() {
        return this.f6844t;
    }
}
