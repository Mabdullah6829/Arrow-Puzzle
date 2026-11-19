package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdxe {

    /* JADX INFO: renamed from: a */
    public final zzdzt f13241a;

    public zzdxe(zzdzt zzdztVar) {
        this.f13241a = zzdztVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m6079a(zzgbe zzgbeVar) {
        boolean zM6848O = zzgbeVar.m6848O();
        com.google.android.gms.ads.internal.util.client.zzt zztVar = com.google.android.gms.ads.internal.util.client.zzt.f3438s;
        zzdzt zzdztVar = this.f13241a;
        if (zM6848O) {
            zzdzs zzdzsVarM6111a = zzdztVar.m6111a();
            zzdzsVarM6111a.m6107b("action", "aq_ad_closed");
            zzdzsVarM6111a.m6107b("gqi", zzgbeVar.m6840G());
            zzdzsVarM6111a.m6107b("aq_ad_duration", String.valueOf(zzgbeVar.m6841H()));
            zzdzsVarM6111a.m6107b("aq_ad_bounce_cnt", String.valueOf(zzgbeVar.m6842I()));
            zzdzsVarM6111a.m6107b("aq_time_away", String.valueOf(zzgbeVar.m6845L()));
            return zzdzsVarM6111a.m6109d().equals(zztVar);
        }
        zzdzs zzdzsVarM6111a2 = zzdztVar.m6111a();
        zzdzsVarM6111a2.m6107b("action", "aq_ad_kill");
        zzdzsVarM6111a2.m6107b("gqi", zzgbeVar.m6840G());
        zzdzsVarM6111a2.m6107b("aq_ad_duration", String.valueOf(zzgbeVar.m6841H()));
        zzdzsVarM6111a2.m6107b("aq_ad_bounce_cnt", String.valueOf(zzgbeVar.m6842I()));
        zzdzsVarM6111a2.m6107b("aq_time_away", String.valueOf(zzgbeVar.m6845L()));
        zzdzsVarM6111a2.m6107b("aq_is_os_kill", String.valueOf(zzgbeVar.m6844K()));
        return zzdzsVarM6111a2.m6109d().equals(zztVar);
    }
}
