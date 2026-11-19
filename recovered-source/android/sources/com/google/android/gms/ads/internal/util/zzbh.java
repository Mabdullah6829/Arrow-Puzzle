package com.google.android.gms.ads.internal.util;

import com.google.android.gms.internal.ads.zzatp;
import com.google.android.gms.internal.ads.zzatq;
import com.google.android.gms.internal.ads.zzauo;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class zzbh extends zzauo {

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ byte[] f3527G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ Map f3528H;

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ com.google.android.gms.ads.internal.util.client.zzl f3529I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbh(zzbl zzblVar, int i2, String str, zzatq zzatqVar, zzatp zzatpVar, byte[] bArr, Map map, com.google.android.gms.ads.internal.util.client.zzl zzlVar) {
        super(i2, str, zzatqVar, zzatpVar);
        this.f3527G = bArr;
        this.f3528H = map;
        this.f3529I = zzlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzatl
    /* JADX INFO: renamed from: g */
    public final Map mo3111g() {
        Map map = this.f3528H;
        return map == null ? Collections.EMPTY_MAP : map;
    }

    @Override // com.google.android.gms.internal.ads.zzatl
    /* JADX INFO: renamed from: h */
    public final byte[] mo3112h() {
        byte[] bArr = this.f3527G;
        if (bArr == null) {
            return null;
        }
        return bArr;
    }

    @Override // com.google.android.gms.internal.ads.zzauo, com.google.android.gms.internal.ads.zzatl
    /* JADX INFO: renamed from: n */
    public final void mo3113k(String str) {
        if (com.google.android.gms.ads.internal.util.client.zzl.m3052e() && str != null) {
            this.f3529I.m3057d(str.getBytes());
        }
        super.mo3113k(str);
    }
}
