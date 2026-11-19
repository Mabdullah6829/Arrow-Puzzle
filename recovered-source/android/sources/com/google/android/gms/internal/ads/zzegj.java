package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final class zzegj extends zzcba {

    /* JADX INFO: renamed from: s */
    public final zzcgd f13875s;

    /* JADX INFO: renamed from: t */
    public final zzcbk f13876t;

    public zzegj(zzcgd zzcgdVar, zzcbk zzcbkVar) {
        this.f13875s = zzcgdVar;
        this.f13876t = zzcbkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcbb
    /* JADX INFO: renamed from: H3 */
    public final void mo5300H3(ParcelFileDescriptor parcelFileDescriptor, zzcbk zzcbkVar) {
        this.f13875s.m5397a(new zzeha(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor), zzcbkVar));
    }

    @Override // com.google.android.gms.internal.ads.zzcbb
    /* JADX INFO: renamed from: Q2 */
    public final void mo5301Q2(ParcelFileDescriptor parcelFileDescriptor) {
        this.f13875s.m5397a(new zzeha(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor), this.f13876t));
    }

    @Override // com.google.android.gms.internal.ads.zzcbb
    /* JADX INFO: renamed from: m1 */
    public final void mo5302m1(com.google.android.gms.ads.internal.util.zzba zzbaVar) {
        zzbaVar.getClass();
        this.f13875s.m5398b(new com.google.android.gms.ads.internal.util.zzaz(zzbaVar.f3510s, zzbaVar.f3511t));
    }
}
