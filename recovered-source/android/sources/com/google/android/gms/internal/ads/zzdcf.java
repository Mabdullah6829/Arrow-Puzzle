package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdcf implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzini f12010a;

    /* JADX INFO: renamed from: b */
    public final zzini f12011b;

    /* JADX INFO: renamed from: c */
    public final zzini f12012c;

    /* JADX INFO: renamed from: d */
    public final zzefg f12013d;

    /* JADX INFO: renamed from: e */
    public final zzini f12014e;

    /* JADX INFO: renamed from: f */
    public final zzini f12015f;

    /* JADX INFO: renamed from: g */
    public final zzini f12016g;

    /* JADX INFO: renamed from: h */
    public final zzini f12017h;

    /* JADX INFO: renamed from: i */
    public final zzfcw f12018i;

    /* JADX INFO: renamed from: j */
    public final zzdcq f12019j;

    /* JADX INFO: renamed from: k */
    public final zzini f12020k;

    public zzdcf(zzini zziniVar, zzini zziniVar2, zzini zziniVar3, zzefg zzefgVar, zzini zziniVar4, zzini zziniVar5, zzini zziniVar6, zzini zziniVar7, zzfcw zzfcwVar, zzdcq zzdcqVar, zzini zziniVar8) {
        this.f12010a = zziniVar;
        this.f12011b = zziniVar2;
        this.f12012c = zziniVar3;
        this.f12013d = zzefgVar;
        this.f12014e = zziniVar4;
        this.f12015f = zziniVar5;
        this.f12016g = zziniVar6;
        this.f12017h = zziniVar7;
        this.f12018i = zzfcwVar;
        this.f12019j = zzdcqVar;
        this.f12020k = zziniVar8;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final zzdce zzb() {
        zzfps zzfpsVar = (zzfps) this.f12010a.zzb();
        VersionInfoParcel versionInfoParcelM5711a = ((zzcop) this.f12011b).m5711a();
        ApplicationInfo applicationInfo = (ApplicationInfo) this.f12012c.zzb();
        String packageName = ((zzcnz) this.f12013d.f13789a).m5709a().getPackageName();
        zzinh.m8554a(packageName);
        zzbio zzbioVar = zzbix.f8436a;
        return new zzdce(zzfpsVar, versionInfoParcelM5711a, applicationInfo, packageName, com.google.android.gms.ads.internal.client.zzba.f3095e.f3096a.m5023a(), (PackageInfo) this.f12014e.zzb(), zzimy.m8548b(this.f12015f), ((zzcnt) this.f12016g).zzb(), (String) this.f12017h.zzb(), this.f12018i.zzb(), this.f12019j.m5898a(), (zzdis) this.f12020k.zzb());
    }
}
