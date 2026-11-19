package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcxf implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzini f11669a;

    /* JADX INFO: renamed from: b */
    public final zzini f11670b;

    /* JADX INFO: renamed from: c */
    public final zzenk f11671c;

    /* JADX INFO: renamed from: d */
    public final zzeqw f11672d;

    public zzcxf(zzini zziniVar, zzini zziniVar2, zzenk zzenkVar, zzeqw zzeqwVar) {
        this.f11669a = zziniVar;
        this.f11670b = zziniVar2;
        this.f11671c = zzenkVar;
        this.f11672d = zzeqwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final Object zzb() {
        zzfps zzfpsVar = (zzfps) this.f11669a.zzb();
        zzhcp zzhcpVar = (zzhcp) this.f11670b.zzb();
        zzenk zzenkVar = this.f11671c;
        return new zzerc(zzfpsVar, zzhcpVar, this.f11672d.zzb(), new zzenj((Context) zzenkVar.f14292a.zzb(), (zzcwx) zzenkVar.f14293b.f20011a));
    }
}
