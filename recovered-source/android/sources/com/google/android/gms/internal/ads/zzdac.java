package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdac implements zzdiu, zzden {

    /* JADX INFO: renamed from: s */
    public final Clock f11861s;

    /* JADX INFO: renamed from: t */
    public final zzdae f11862t;

    /* JADX INFO: renamed from: u */
    public final zzflg f11863u;

    /* JADX INFO: renamed from: v */
    public final String f11864v;

    public zzdac(Clock clock, zzdae zzdaeVar, zzflg zzflgVar, String str) {
        this.f11861s = clock;
        this.f11862t = zzdaeVar;
        this.f11863u = zzflgVar;
        this.f11864v = str;
    }

    @Override // com.google.android.gms.internal.ads.zzden
    /* JADX INFO: renamed from: c */
    public final void mo5833c() {
        long jMo3639a = this.f11861s.mo3639a();
        String str = this.f11863u.f16043g;
        zzdae zzdaeVar = this.f11862t;
        ConcurrentHashMap concurrentHashMap = zzdaeVar.f11871c;
        String str2 = this.f11864v;
        Long l2 = (Long) concurrentHashMap.get(str2);
        if (l2 == null) {
            return;
        }
        concurrentHashMap.remove(str2);
        zzdaeVar.f11872d.put(str, Long.valueOf(jMo3639a - l2.longValue()));
    }

    @Override // com.google.android.gms.internal.ads.zzdiu
    /* JADX INFO: renamed from: u */
    public final void mo5885u() {
        this.f11862t.f11871c.put(this.f11864v, Long.valueOf(this.f11861s.mo3639a()));
    }
}
