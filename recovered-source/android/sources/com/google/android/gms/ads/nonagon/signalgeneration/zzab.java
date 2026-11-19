package com.google.android.gms.ads.nonagon.signalgeneration;

import android.util.Pair;
import com.google.android.gms.internal.ads.zzbio;
import com.google.android.gms.internal.ads.zzbix;
import com.google.android.gms.internal.ads.zzhcc;
import com.google.firebase.analytics.FirebaseAnalytics;

/* JADX INFO: loaded from: classes.dex */
final class zzab implements zzhcc {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzap f3816a;

    public zzab(zzap zzapVar) {
        this.f3816a = zzapVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    /* JADX INFO: renamed from: a */
    public final void mo3316a(Object obj) {
        int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
        com.google.android.gms.ads.internal.util.client.zzo.m3068a("Initialized webview successfully for SDKCore.");
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8516eb)).booleanValue()) {
            Pair pair = new Pair("se", "query_g");
            Pair pair2 = new Pair(FirebaseAnalytics.Param.AD_FORMAT, "BANNER");
            Pair pair3 = new Pair("rtype", Integer.toString(6));
            Pair pair4 = new Pair("scar", "true");
            zzap zzapVar = this.f3816a;
            zzv.m3348d(zzapVar.f3847D, "sgs", pair, pair2, pair3, pair4, new Pair("sgi_rn", Integer.toString(zzapVar.f3865V.get())));
            zzapVar.f3864U.set(true);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    /* JADX INFO: renamed from: b */
    public final void mo3317b(Throwable th) {
        com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5384d("SignalGeneratorImpl.initializeWebViewForSignalCollection", th);
        Pair pair = new Pair("sgf_reason", th.getMessage());
        Pair pair2 = new Pair("se", "query_g");
        Pair pair3 = new Pair(FirebaseAnalytics.Param.AD_FORMAT, "BANNER");
        Pair pair4 = new Pair("rtype", Integer.toString(6));
        Pair pair5 = new Pair("scar", "true");
        zzap zzapVar = this.f3816a;
        zzv.m3348d(zzapVar.f3847D, "sgf", pair, pair2, pair3, pair4, pair5, new Pair("sgi_rn", Integer.toString(zzapVar.f3865V.get())));
        int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
        com.google.android.gms.ads.internal.util.client.zzo.m3071d("Failed to initialize webview for loading SDKCore. ", th);
        zzbio zzbioVar = zzbix.f8516eb;
        com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
        if (!((Boolean) zzbaVar.f3098c.m5030a(zzbioVar)).booleanValue() || zzapVar.f3864U.get()) {
            return;
        }
        if (zzapVar.f3865V.getAndIncrement() < ((Integer) zzbaVar.f3098c.m5030a(zzbix.f8533fb)).intValue()) {
            zzapVar.m3327n4();
        }
    }
}
