package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class zzegb implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzini f13857a;

    /* JADX INFO: renamed from: b */
    public final zzini f13858b;

    /* JADX INFO: renamed from: c */
    public final zzini f13859c;

    /* JADX INFO: renamed from: d */
    public final zzdcq f13860d;

    /* JADX INFO: renamed from: e */
    public final zzini f13861e;

    /* JADX INFO: renamed from: f */
    public final zzini f13862f;

    /* JADX INFO: renamed from: g */
    public final zzini f13863g;

    /* JADX INFO: renamed from: h */
    public final zzini f13864h;

    /* JADX INFO: renamed from: i */
    public final zzini f13865i;

    /* JADX INFO: renamed from: j */
    public final zzdge f13866j;

    public zzegb(zzini zziniVar, zzini zziniVar2, zzini zziniVar3, zzdcq zzdcqVar, zzini zziniVar4, zzini zziniVar5, zzini zziniVar6, zzini zziniVar7, zzini zziniVar8, zzdge zzdgeVar) {
        this.f13857a = zziniVar;
        this.f13858b = zziniVar2;
        this.f13859c = zziniVar3;
        this.f13860d = zzdcqVar;
        this.f13861e = zziniVar4;
        this.f13862f = zziniVar5;
        this.f13863g = zziniVar6;
        this.f13864h = zziniVar7;
        this.f13865i = zziniVar8;
        this.f13866j = zzdgeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final zzega zzb() {
        zzcnq zzcnqVar = (zzcnq) this.f13857a.zzb();
        Context contextM5709a = ((zzcnz) this.f13858b).m5709a();
        VersionInfoParcel versionInfoParcelM5711a = ((zzcop) this.f13859c).m5711a();
        zzflg zzflgVarM5898a = this.f13860d.m5898a();
        zzhcp zzhcpVar = zzcfy.f9946a;
        zzinh.m8554a(zzhcpVar);
        String str = (String) this.f13861e.zzb();
        zzfqq zzfqqVar = (zzfqq) this.f13862f.zzb();
        zzdzo zzdzoVar = (zzdzo) this.f13863g.zzb();
        zzcbs zzcbsVar = new zzcbs();
        new zzeiv();
        return new zzega(zzcnqVar, contextM5709a, versionInfoParcelM5711a, zzflgVarM5898a, zzhcpVar, str, zzfqqVar, zzdzoVar, zzcbsVar, (ScheduledExecutorService) this.f13864h.zzb(), (zzfsm) this.f13865i.zzb(), new zzdgd(this.f13866j.f12155a.zzb()));
    }
}
