package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final class zzegi extends zzcba {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ zzegk f13874s;

    public zzegi(zzegk zzegkVar) {
        this.f13874s = zzegkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcbb
    /* JADX INFO: renamed from: H3 */
    public final void mo5300H3(ParcelFileDescriptor parcelFileDescriptor, zzcbk zzcbkVar) {
        this.f13874s.f13877s.m5397a(new zzeha(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor), zzcbkVar));
    }

    @Override // com.google.android.gms.internal.ads.zzcbb
    /* JADX INFO: renamed from: Q2 */
    public final void mo5301Q2(ParcelFileDescriptor parcelFileDescriptor) {
        ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor);
        zzegk zzegkVar = this.f13874s;
        zzegkVar.f13877s.m5397a(new zzeha(autoCloseInputStream, zzegkVar.f13881w));
    }

    @Override // com.google.android.gms.internal.ads.zzcbb
    /* JADX INFO: renamed from: m1 */
    public final void mo5302m1(com.google.android.gms.ads.internal.util.zzba zzbaVar) {
        zzcgd zzcgdVar = this.f13874s.f13877s;
        zzbaVar.getClass();
        zzcgdVar.m5398b(new com.google.android.gms.ads.internal.util.zzaz(zzbaVar.f3510s, zzbaVar.f3511t));
    }
}
