package com.google.android.gms.ads.internal.util;

import com.google.android.gms.internal.ads.zzath;
import com.google.android.gms.internal.ads.zzatl;
import com.google.android.gms.internal.ads.zzatr;
import com.google.android.gms.internal.ads.zzaui;
import com.google.android.gms.internal.ads.zzcgd;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class zzbk extends zzatl {

    /* JADX INFO: renamed from: E */
    public final zzcgd f3531E;

    /* JADX INFO: renamed from: F */
    public final com.google.android.gms.ads.internal.util.client.zzl f3532F;

    public zzbk(String str, zzcgd zzcgdVar) {
        super(0, str, new zzbj(zzcgdVar));
        this.f3531E = zzcgdVar;
        com.google.android.gms.ads.internal.util.client.zzl zzlVar = new com.google.android.gms.ads.internal.util.client.zzl(0);
        this.f3532F = zzlVar;
        zzlVar.m3055b(str, null, null);
    }

    @Override // com.google.android.gms.internal.ads.zzatl
    /* JADX INFO: renamed from: j */
    public final zzatr mo3115j(zzath zzathVar) {
        return new zzatr(zzathVar, zzaui.m4422a(zzathVar));
    }

    @Override // com.google.android.gms.internal.ads.zzatl
    /* JADX INFO: renamed from: k */
    public final void mo3113k(Object obj) {
        zzath zzathVar = (zzath) obj;
        Map map = zzathVar.f6881c;
        int i2 = zzathVar.f6879a;
        com.google.android.gms.ads.internal.util.client.zzl zzlVar = this.f3532F;
        zzlVar.getClass();
        if (com.google.android.gms.ads.internal.util.client.zzl.m3052e()) {
            zzlVar.m3058f(i2, map);
            if (i2 < 200 || i2 >= 300) {
                zzlVar.m3059g(null);
            }
        }
        byte[] bArr = zzathVar.f6880b;
        if (com.google.android.gms.ads.internal.util.client.zzl.m3052e() && bArr != null) {
            zzlVar.m3057d(bArr);
        }
        this.f3531E.m5397a(zzathVar);
    }
}
