package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zziaw implements zzhqo {

    /* JADX INFO: renamed from: a */
    public final zzhqs f19583a;

    /* JADX INFO: renamed from: b */
    public final zzhqt f19584b;

    public /* synthetic */ zziaw(zzhqs zzhqsVar, zzhqt zzhqtVar) {
        this.f19583a = zzhqsVar;
        this.f19584b = zzhqtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhqo
    /* JADX INFO: renamed from: a */
    public final byte[] mo7617a(int i2, byte[] bArr) {
        return bArr.length <= 64 ? this.f19583a.mo7617a(i2, bArr) : this.f19584b.mo7617a(i2, bArr);
    }
}
