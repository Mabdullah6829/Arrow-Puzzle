package com.google.android.gms.ads.nonagon.signalgeneration;

import android.util.Pair;
import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import com.google.android.gms.internal.ads.zzblc;
import com.google.android.gms.internal.ads.zzdzy;
import com.google.firebase.analytics.FirebaseAnalytics;

/* JADX INFO: loaded from: classes.dex */
public final class zzk extends QueryInfoGenerationCallback {

    /* JADX INFO: renamed from: a */
    public final zzj f3949a;

    /* JADX INFO: renamed from: b */
    public final zzdzy f3950b;

    /* JADX INFO: renamed from: c */
    public final boolean f3951c;

    /* JADX INFO: renamed from: d */
    public final int f3952d;

    /* JADX INFO: renamed from: e */
    public final long f3953e;

    /* JADX INFO: renamed from: f */
    public final Boolean f3954f;

    public zzk(zzj zzjVar, boolean z, int i2, Boolean bool, zzdzy zzdzyVar) {
        this.f3949a = zzjVar;
        this.f3951c = z;
        this.f3952d = i2;
        this.f3954f = bool;
        this.f3950b = zzdzyVar;
        com.google.android.gms.ads.internal.zzt.f3698C.f3711k.getClass();
        this.f3953e = System.currentTimeMillis();
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    /* JADX INFO: renamed from: a */
    public final void mo3330a(String str) {
        Pair pair = new Pair("sgf_reason", str);
        Pair pair2 = new Pair("se", "query_g");
        Pair pair3 = new Pair(FirebaseAnalytics.Param.AD_FORMAT, "BANNER");
        Pair pair4 = new Pair("rtype", Integer.toString(6));
        Pair pair5 = new Pair("scar", "true");
        com.google.android.gms.ads.internal.zzt zztVar = com.google.android.gms.ads.internal.zzt.f3698C;
        zztVar.f3711k.getClass();
        Pair pair6 = new Pair("lat_ms", Long.toString(System.currentTimeMillis() - this.f3953e));
        int i2 = this.f3952d;
        Pair pair7 = new Pair("sgpc_rn", Integer.toString(i2));
        Pair pair8 = new Pair("sgpc_lsu", String.valueOf(this.f3954f));
        boolean z = this.f3951c;
        zzv.m3348d(this.f3950b, "sgpcf", pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, new Pair("tpc", true != z ? "0" : "1"));
        zztVar.f3711k.getClass();
        this.f3949a.m3335b(z, new zzl(null, str, ((Long) zzblc.f9111h.m5057c()).longValue() + System.currentTimeMillis(), i2));
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    /* JADX INFO: renamed from: b */
    public final void mo3331b(QueryInfo queryInfo) {
        Pair pair = new Pair("se", "query_g");
        Pair pair2 = new Pair(FirebaseAnalytics.Param.AD_FORMAT, "BANNER");
        Pair pair3 = new Pair("rtype", Integer.toString(6));
        Pair pair4 = new Pair("scar", "true");
        com.google.android.gms.ads.internal.zzt zztVar = com.google.android.gms.ads.internal.zzt.f3698C;
        zztVar.f3711k.getClass();
        Pair pair5 = new Pair("lat_ms", Long.toString(System.currentTimeMillis() - this.f3953e));
        int i2 = this.f3952d;
        Pair pair6 = new Pair("sgpc_rn", Integer.toString(i2));
        Pair pair7 = new Pair("sgpc_lsu", String.valueOf(this.f3954f));
        boolean z = this.f3951c;
        zzv.m3348d(this.f3950b, "sgpcs", pair, pair2, pair3, pair4, pair5, pair6, pair7, new Pair("tpc", true != z ? "0" : "1"));
        zztVar.f3711k.getClass();
        this.f3949a.m3335b(z, new zzl(queryInfo, "", ((Long) zzblc.f9111h.m5057c()).longValue() + System.currentTimeMillis(), i2));
    }
}
