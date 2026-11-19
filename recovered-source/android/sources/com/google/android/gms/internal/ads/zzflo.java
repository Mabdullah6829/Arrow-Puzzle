package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
final class zzflo implements zzhcc {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzclb f16065a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zzctq f16066b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ zzfsm f16067c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ zzeko f16068d;

    public zzflo(zzclb zzclbVar, zzctq zzctqVar, zzfsm zzfsmVar, zzeko zzekoVar) {
        this.f16065a = zzclbVar;
        this.f16066b = zzctqVar;
        this.f16067c = zzfsmVar;
        this.f16068d = zzekoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    /* JADX INFO: renamed from: a */
    public final void mo3316a(Object obj) {
        zzctq zzctqVar;
        String str = (String) obj;
        zzclb zzclbVar = this.f16065a;
        zzfkn zzfknVarMo5565B = zzclbVar.mo5565B();
        if (zzfknVarMo5565B != null && !zzfknVarMo5565B.f15933i0) {
            com.google.android.gms.ads.internal.util.client.zzv zzvVar = zzfknVarMo5565B.f15963x0;
            zzbio zzbioVar = zzbix.f8804vb;
            com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
            if (!((Boolean) zzbaVar.f3098c.m5030a(zzbioVar)).booleanValue() || (zzctqVar = this.f16066b) == null || !zzctq.m5821b(str)) {
                this.f16067c.m6643b(str, zzvVar, null, null);
                return;
            }
            zzfsm zzfsmVar = this.f16067c;
            Random random = com.google.android.gms.ads.internal.client.zzay.f3085g.f3090e;
            if (TextUtils.isEmpty(str)) {
                return;
            }
            ListenableFuture listenableFutureM7373g = zzhcf.m7373g(zzctqVar.m5823c(str, zzctqVar.f11388d.f13232a, random), ((Integer) zzbaVar.f3098c.m5030a(zzbix.f8150Ib)).intValue(), TimeUnit.MILLISECONDS, zzctqVar.f11391g);
            listenableFutureM7373g.addListener(new zzhcd(listenableFutureM7373g, new zzctj(zzctqVar, zzfsmVar, str, zzvVar)), zzctqVar.f11389e);
            return;
        }
        zzfkq zzfkqVarMo5587Q = zzclbVar.mo5587Q();
        if (zzfkqVarMo5587Q == null) {
            com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5384d("BufferingGmsgHandlers.getBufferingClickGmsgHandler", new IllegalArgumentException("Common configuration cannot be null"));
            return;
        }
        com.google.android.gms.ads.internal.zzt zztVar = com.google.android.gms.ads.internal.zzt.f3698C;
        zztVar.f3711k.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean zM5389i = zztVar.f3708h.m5389i(zzclbVar.getContext());
        boolean z = false;
        boolean z2 = ((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8546g7)).booleanValue() && zzfknVarMo5565B != null && zzfknVarMo5565B.f15908S;
        if (zzfknVarMo5565B != null && zzfknVarMo5565B.f15923d0 != null) {
            z = true;
        }
        int i2 = 2;
        if (!zM5389i && !z2 && !z) {
            i2 = 1;
        }
        zzekq zzekqVar = new zzekq(jCurrentTimeMillis, zzfkqVarMo5587Q.f15973b, str, i2);
        zzeko zzekoVar = this.f16068d;
        zzekoVar.getClass();
        zzekoVar.m6258c(new zzekl(zzekoVar, zzekqVar));
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    /* JADX INFO: renamed from: b */
    public final void mo3317b(Throwable th) {
    }
}
