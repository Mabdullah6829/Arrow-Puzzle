package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.util.Clock;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfsj implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzini f16403a;

    /* JADX INFO: renamed from: b */
    public final zzini f16404b;

    /* JADX INFO: renamed from: c */
    public final zzdco f16405c;

    /* JADX INFO: renamed from: d */
    public final zzini f16406d;

    /* JADX INFO: renamed from: e */
    public final zzini f16407e;

    /* JADX INFO: renamed from: f */
    public final zzdcp f16408f;

    /* JADX INFO: renamed from: g */
    public final zzini f16409g;

    /* JADX INFO: renamed from: h */
    public final zzini f16410h;

    /* JADX INFO: renamed from: i */
    public final zzini f16411i;

    public zzfsj(zzini zziniVar, zzini zziniVar2, zzdco zzdcoVar, zzini zziniVar3, zzini zziniVar4, zzdcp zzdcpVar, zzini zziniVar5, zzini zziniVar6, zzini zziniVar7) {
        this.f16403a = zziniVar;
        this.f16404b = zziniVar2;
        this.f16405c = zzdcoVar;
        this.f16406d = zziniVar3;
        this.f16407e = zziniVar4;
        this.f16408f = zzdcpVar;
        this.f16409g = zziniVar5;
        this.f16410h = zziniVar6;
        this.f16411i = zziniVar7;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final Object zzb() {
        zzepl zzeplVar = (zzepl) this.f16403a.zzb();
        VersionInfoParcel versionInfoParcelM5711a = ((zzcop) this.f16404b).m5711a();
        String str = ((zzczq) this.f16405c.f12039a.zzb()).f11843t.f9866e;
        zzinh.m8554a(str);
        return new zzfsi(zzeplVar, versionInfoParcelM5711a, str, (String) this.f16406d.zzb(), ((zzcnz) this.f16407e).m5709a(), this.f16408f.f12040a.f12030d, (zzfla) this.f16409g.zzb(), (Clock) this.f16410h.zzb(), (zzbaw) this.f16411i.zzb());
    }
}
