package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeov {

    /* JADX INFO: renamed from: a */
    public final Context f14425a;

    /* JADX INFO: renamed from: b */
    public final zzfqq f14426b;

    /* JADX INFO: renamed from: c */
    public final Executor f14427c;

    /* JADX INFO: renamed from: d */
    public final ScheduledExecutorService f14428d;

    /* JADX INFO: renamed from: e */
    public final zzcyd f14429e;

    /* JADX INFO: renamed from: f */
    public final zzepl f14430f;

    /* JADX INFO: renamed from: g */
    public final zzfsi f14431g;

    /* JADX INFO: renamed from: h */
    public final zzhcy f14432h = zzhcy.m7389q();

    /* JADX INFO: renamed from: i */
    public final AtomicBoolean f14433i = new AtomicBoolean();

    /* JADX INFO: renamed from: j */
    public zzeow f14434j;

    /* JADX INFO: renamed from: k */
    public zzfky f14435k;

    public zzeov(Context context, zzfqq zzfqqVar, Executor executor, ScheduledExecutorService scheduledExecutorService, zzcyd zzcydVar, zzepl zzeplVar, zzfsi zzfsiVar) {
        this.f14425a = context;
        this.f14426b = zzfqqVar;
        this.f14427c = executor;
        this.f14428d = scheduledExecutorService;
        this.f14429e = zzcydVar;
        this.f14430f = zzeplVar;
        this.f14431g = zzfsiVar;
    }

    /* JADX INFO: renamed from: a */
    public final void m6297a(zzfkn zzfknVar) {
        ListenableFuture listenableFutureM7368b;
        synchronized (this) {
            Iterator it = zzfknVar.f15916a.iterator();
            while (it.hasNext()) {
                zzema zzemaVarMo5870a = this.f14429e.mo5870a(zzfknVar.f15918b, (String) it.next());
                if (zzemaVarMo5870a != null && zzemaVarMo5870a.mo6285b(this.f14435k, zzfknVar)) {
                    listenableFutureM7368b = zzhcf.m7373g(zzemaVarMo5870a.mo6284a(this.f14435k, zzfknVar), zzfknVar.f15907R, TimeUnit.MILLISECONDS, this.f14428d);
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8549ga)).booleanValue()) {
                        zzfqg zzfqgVarM6562l = zzfqg.m6562l(this.f14425a, 12);
                        zzfqgVarM6562l.mo6571p0(zzfknVar.f15889E);
                        zzfqgVarM6562l.zza();
                        zzfqp.m6577c(listenableFutureM7368b, this.f14426b, zzfqgVarM6562l, false);
                    }
                }
            }
            listenableFutureM7368b = zzhcf.m7368b(new zzeel(3));
        }
        this.f14430f.m6308b(this.f14435k, zzfknVar, listenableFutureM7368b, this.f14431g);
        listenableFutureM7368b.addListener(new zzhcd(listenableFutureM7368b, new zzeou(this, zzfknVar)), this.f14427c);
    }
}
