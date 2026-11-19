package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfcv {

    /* JADX INFO: renamed from: a */
    public final Context f15431a;

    /* JADX INFO: renamed from: b */
    public final Set f15432b;

    /* JADX INFO: renamed from: c */
    public final Executor f15433c;

    /* JADX INFO: renamed from: d */
    public final zzfqq f15434d;

    public zzfcv(Context context, Executor executor, Set set, zzfqq zzfqqVar) {
        this.f15431a = context;
        this.f15433c = executor;
        this.f15432b = set;
        this.f15434d = zzfqqVar;
    }

    /* JADX INFO: renamed from: a */
    public final ListenableFuture m6423a(final Bundle bundle, final Object obj) {
        zzfqg zzfqgVarM6562l = zzfqg.m6562l(this.f15431a, 8);
        zzfqgVarM6562l.zza();
        Set<zzfcs> set = this.f15432b;
        final ArrayList arrayList = new ArrayList(set.size());
        List arrayList2 = new ArrayList();
        zzbio zzbioVar = zzbix.f8569hd;
        com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
        zzbiv zzbivVar = zzbaVar.f3098c;
        zzbiv zzbivVar2 = zzbaVar.f3098c;
        if (!((String) zzbivVar.m5030a(zzbioVar)).isEmpty()) {
            arrayList2 = Arrays.asList(((String) zzbivVar2.m5030a(zzbioVar)).split(","));
        }
        final Bundle bundle2 = new Bundle();
        if (((Boolean) zzbivVar2.m5030a(zzbix.f8158J2)).booleanValue() && bundle != null) {
            com.google.android.gms.ads.internal.zzt.f3698C.f3711k.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (obj instanceof Bundle) {
                bundle.putLong("client-signals-start", jCurrentTimeMillis);
            } else {
                bundle.putLong("gms-signals-start", jCurrentTimeMillis);
            }
        }
        for (final zzfcs zzfcsVar : set) {
            if (!arrayList2.contains(String.valueOf(zzfcsVar.zzb()))) {
                com.google.android.gms.ads.internal.zzt.f3698C.f3711k.getClass();
                final long jElapsedRealtime = SystemClock.elapsedRealtime();
                ListenableFuture listenableFutureZza = zzfcsVar.zza();
                listenableFutureZza.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfct
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.google.android.gms.ads.internal.zzt.f3698C.f3711k.getClass();
                        long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                        boolean zBooleanValue = ((Boolean) zzbkz.f9078a.m5057c()).booleanValue();
                        Bundle bundle3 = bundle2;
                        zzfcs zzfcsVar2 = zzfcsVar;
                        if (zBooleanValue) {
                            String canonicalName = zzfcsVar2.getClass().getCanonicalName();
                            if (canonicalName == null) {
                                canonicalName = "";
                            }
                            StringBuilder sb = new StringBuilder(canonicalName.length() + 25 + String.valueOf(jElapsedRealtime2).length());
                            sb.append("Signal runtime (ms) : ");
                            sb.append(canonicalName);
                            sb.append(" = ");
                            sb.append(jElapsedRealtime2);
                            com.google.android.gms.ads.internal.util.zze.m3150k(sb.toString());
                        }
                        zzbio zzbioVar2 = zzbix.f8158J2;
                        com.google.android.gms.ads.internal.client.zzba zzbaVar2 = com.google.android.gms.ads.internal.client.zzba.f3095e;
                        if (((Boolean) zzbaVar2.f3098c.m5030a(zzbioVar2)).booleanValue()) {
                            if (((Boolean) zzbaVar2.f3098c.m5030a(zzbix.f8260P2)).booleanValue()) {
                                synchronized (this.f15423s) {
                                    int iZzb = zzfcsVar2.zzb();
                                    StringBuilder sb2 = new StringBuilder(String.valueOf(iZzb).length() + 3);
                                    sb2.append("sig");
                                    sb2.append(iZzb);
                                    bundle3.putLong(sb2.toString(), jElapsedRealtime2);
                                }
                            }
                        }
                    }
                }, zzcfy.f9953h);
                arrayList.add(listenableFutureZza);
            }
        }
        ListenableFuture listenableFutureM7366a = new zzhce(zzgwt.m7220t(arrayList), true).m7366a(this.f15433c, new Callable() { // from class: com.google.android.gms.internal.ads.zzfcu
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Object obj2;
                Bundle bundle3;
                Iterator it = arrayList.iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    obj2 = obj;
                    if (!zHasNext) {
                        break;
                    }
                    zzfcq zzfcqVar = (zzfcq) ((ListenableFuture) it.next()).get();
                    if (zzfcqVar != null) {
                        zzfcqVar.mo6399b(obj2);
                    }
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8158J2)).booleanValue() && (bundle3 = bundle) != null) {
                    com.google.android.gms.ads.internal.zzt.f3698C.f3711k.getClass();
                    long jCurrentTimeMillis2 = System.currentTimeMillis();
                    boolean z = obj2 instanceof Bundle;
                    Bundle bundle4 = bundle2;
                    if (z) {
                        bundle3.putLong("client-signals-end", jCurrentTimeMillis2);
                        bundle3.putBundle("client_sig_latency_key", bundle4);
                        return obj2;
                    }
                    bundle3.putLong("gms-signals-end", jCurrentTimeMillis2);
                    bundle3.putBundle("gms_sig_latency_key", bundle4);
                }
                return obj2;
            }
        });
        if (zzfqt.m6587a()) {
            zzfqp.m6577c(listenableFutureM7366a, this.f15434d, zzfqgVarM6562l, false);
        }
        return listenableFutureM7366a;
    }
}
