package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.zzbix;
import com.google.android.gms.internal.ads.zzcfy;
import com.google.android.gms.internal.ads.zzdce;
import com.google.android.gms.internal.ads.zzdcf;
import com.google.android.gms.internal.ads.zzdlv;
import com.google.android.gms.internal.ads.zzfoz;
import com.google.android.gms.internal.ads.zzfpj;
import com.google.android.gms.internal.ads.zzfpm;
import com.google.android.gms.internal.ads.zzfps;
import com.google.android.gms.internal.ads.zzhcf;
import com.google.android.gms.internal.ads.zzhcp;
import com.google.android.gms.internal.ads.zzimy;
import com.google.android.gms.internal.ads.zzimz;
import com.google.android.gms.internal.ads.zzinh;
import com.google.android.gms.internal.ads.zzini;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class zzay implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzini f3895a;

    /* JADX INFO: renamed from: b */
    public final zzbb f3896b;

    /* JADX INFO: renamed from: c */
    public final zzdcf f3897c;

    /* JADX INFO: renamed from: d */
    public final zzini f3898d;

    public zzay(zzimy zzimyVar, zzbb zzbbVar, zzdcf zzdcfVar, zzimy zzimyVar2) {
        this.f3895a = zzimyVar;
        this.f3896b = zzbbVar;
        this.f3897c = zzdcfVar;
        this.f3898d = zzimyVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final Object zzb() {
        zzfps zzfpsVar = (zzfps) this.f3895a.zzb();
        zzhcp zzhcpVar = zzcfy.f9946a;
        zzinh.m8554a(zzhcpVar);
        zzba zzbaVar = new zzba(zzhcpVar, this.f3896b.f3904a.zzb());
        zzdce zzdceVarZzb = this.f3897c.zzb();
        zzdlv zzdlvVar = (zzdlv) this.f3898d.zzb();
        zzfpj zzfpjVarM6553b = zzfpsVar.m6556a(zzdceVarZzb.m5895b(), zzfpm.GENERATE_SIGNALS).m6553b(zzbaVar);
        long jIntValue = ((Integer) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8009A6)).intValue();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        zzfoz zzfozVarM6555d = zzfpjVarM6553b.m6554c(jIntValue).m6555d();
        zzhcf.m7377k(zzfozVarM6555d, new zzar(zzdlvVar), zzhcpVar);
        return zzfozVarM6555d;
    }
}
