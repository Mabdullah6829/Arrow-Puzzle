package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.Base64;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfsm {

    /* JADX INFO: renamed from: a */
    public final Context f16418a;

    /* JADX INFO: renamed from: b */
    public final Executor f16419b;

    /* JADX INFO: renamed from: c */
    public final zzhcq f16420c;

    /* JADX INFO: renamed from: d */
    public final com.google.android.gms.ads.internal.util.client.zzu f16421d;

    /* JADX INFO: renamed from: e */
    public final zzfse f16422e;

    /* JADX INFO: renamed from: f */
    public final zzfqt f16423f;

    /* JADX INFO: renamed from: g */
    public final zzcnn f16424g;

    public zzfsm(Context context, Executor executor, zzhcq zzhcqVar, com.google.android.gms.ads.internal.util.client.zzu zzuVar, zzfse zzfseVar, zzfqt zzfqtVar, zzcnn zzcnnVar) {
        this.f16418a = context;
        this.f16419b = executor;
        this.f16420c = zzhcqVar;
        this.f16421d = zzuVar;
        this.f16422e = zzfseVar;
        this.f16423f = zzfqtVar;
        this.f16424g = zzcnnVar;
    }

    /* JADX INFO: renamed from: a */
    public final void m6642a(List list, com.google.android.gms.ads.internal.util.client.zzv zzvVar) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            m6643b((String) it.next(), zzvVar, null, null);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m6643b(final String str, com.google.android.gms.ads.internal.util.client.zzv zzvVar, zzfqq zzfqqVar, zzdfo zzdfoVar) {
        ListenableFuture listenableFutureSubmit;
        zzfqg zzfqgVarM6562l = null;
        if (zzfqt.m6587a() && ((Boolean) zzbkq.f9010d.m5057c()).booleanValue()) {
            zzfqgVarM6562l = zzfqg.m6562l(this.f16418a, 14);
            zzfqgVarM6562l.zza();
        }
        if (zzvVar != null) {
            listenableFutureSubmit = new zzfsd(zzvVar.f3446a, this.f16421d, this.f16420c, this.f16422e, this.f16424g).m6636a(str);
        } else {
            listenableFutureSubmit = this.f16420c.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzfsl
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    zzfsm zzfsmVar = this.f16416a;
                    com.google.android.gms.ads.internal.util.client.zzu zzuVar = zzfsmVar.f16421d;
                    zzbio zzbioVar = zzbix.f8498da;
                    com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
                    boolean zBooleanValue = ((Boolean) zzbaVar.f3098c.m5030a(zzbioVar)).booleanValue();
                    String str2 = str;
                    if (zBooleanValue) {
                        com.google.android.gms.ads.internal.zzt zztVar = com.google.android.gms.ads.internal.zzt.f3698C;
                        if (zztVar.f3703c.m3234H(str2) || zztVar.f3703c.m3235I(str2)) {
                            zzilv zzilvVar = zzfsmVar.f16424g.f10607c;
                            String strEncodeToString = zzilvVar != null ? Base64.encodeToString(zzilvVar.m8099h(), 10) : null;
                            HashMap map = new HashMap();
                            if (strEncodeToString != null) {
                                map.put((String) zzbaVar.f3098c.m5030a(zzbix.f8515ea), strEncodeToString);
                            }
                            return zzuVar.m3081a(map, str2);
                        }
                    }
                    return zzuVar.m3081a(null, str2);
                }
            });
        }
        listenableFutureSubmit.addListener(new zzhcd(listenableFutureSubmit, new zzfsk(this, zzfqgVarM6562l, zzfqqVar, zzdfoVar)), this.f16419b);
    }
}
