package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* JADX INFO: loaded from: classes2.dex */
public final class zzepv implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzepu f14580a;

    /* JADX INFO: renamed from: b */
    public final zzini f14581b;

    /* JADX INFO: renamed from: c */
    public final zzepo f14582c;

    /* JADX INFO: renamed from: d */
    public final zzini f14583d;

    /* JADX INFO: renamed from: e */
    public final zzini f14584e;

    public zzepv(zzepu zzepuVar, zzini zziniVar, zzepo zzepoVar, zzini zziniVar2, zzini zziniVar3) {
        this.f14580a = zzepuVar;
        this.f14581b = zziniVar;
        this.f14582c = zzepoVar;
        this.f14583d = zziniVar2;
        this.f14584e = zziniVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final Object zzb() {
        Clock clock = (Clock) this.f14581b.zzb();
        zzepo zzepoVar = this.f14582c;
        zzepn zzepnVar = new zzepn((zzflz) zzepoVar.f14546a.zzb(), (zzdxh) zzepoVar.f14547b.zzb(), (zzdzt) zzepoVar.f14548c.zzb());
        zzemf zzemfVar = (zzemf) this.f14583d.zzb();
        zzfsm zzfsmVar = (zzfsm) this.f14584e.zzb();
        zzepl zzeplVar = this.f14580a.f14579a;
        return zzeplVar != null ? zzeplVar : new zzepl(clock, zzepnVar, zzemfVar, zzfsmVar);
    }
}
