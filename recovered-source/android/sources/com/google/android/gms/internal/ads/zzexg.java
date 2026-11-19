package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class zzexg implements zzfcs {

    /* JADX INFO: renamed from: a */
    public final AtomicReference f15083a = new AtomicReference();

    /* JADX INFO: renamed from: b */
    public final AtomicReference f15084b = new AtomicReference(Boolean.FALSE);

    /* JADX INFO: renamed from: c */
    public final Clock f15085c;

    /* JADX INFO: renamed from: d */
    public final Executor f15086d;

    /* JADX INFO: renamed from: e */
    public final zzfcs f15087e;

    /* JADX INFO: renamed from: f */
    public final long f15088f;

    /* JADX INFO: renamed from: g */
    public final zzdzt f15089g;

    public zzexg(zzfcs zzfcsVar, long j2, Clock clock, Executor executor, zzdzt zzdztVar) {
        this.f15085c = clock;
        this.f15087e = zzfcsVar;
        this.f15088f = j2;
        this.f15086d = executor;
        this.f15089g = zzdztVar;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0102  */
    /* JADX WARN: Code duplicated, block: B:8:0x0028  */
    @Override // com.google.android.gms.internal.ads.zzfcs
    public final ListenableFuture zza() {
        zzexd zzexdVar;
        zzbio zzbioVar = zzbix.f8619kd;
        com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
        if (((Boolean) zzbaVar.f3098c.m5030a(zzbioVar)).booleanValue()) {
            if (((Boolean) zzbaVar.f3098c.m5030a(zzbix.f8602jd)).booleanValue() && !((Boolean) this.f15084b.getAndSet(Boolean.TRUE)).booleanValue()) {
                ScheduledExecutorService scheduledExecutorService = zzcfy.f9949d;
                Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzexf
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        final zzexg zzexgVar = this.f15082s;
                        zzexgVar.f15086d.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzexe
                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() {
                                zzexg zzexgVar2 = zzexgVar;
                                zzexgVar2.f15083a.set(new zzexd(zzexgVar2.f15087e.zza(), zzexgVar2.f15088f, zzexgVar2.f15085c));
                            }
                        });
                    }
                };
                long j2 = this.f15088f;
                ((ScheduledThreadPoolExecutor) scheduledExecutorService).scheduleWithFixedDelay(runnable, j2, j2, TimeUnit.MILLISECONDS);
            }
            synchronized (this) {
                try {
                    AtomicReference atomicReference = this.f15083a;
                    zzexd zzexdVar2 = (zzexd) atomicReference.get();
                    if (zzexdVar2 == null) {
                        ListenableFuture listenableFutureZza = this.f15087e.zza();
                        atomicReference.set(new zzexd(listenableFutureZza, this.f15088f, this.f15085c));
                        return listenableFutureZza;
                    }
                    if (((Boolean) this.f15084b.get()).booleanValue()) {
                        zzexdVar = zzexdVar2;
                    } else {
                        if (zzexdVar2.f15079b < zzexdVar2.f15080c.mo3639a()) {
                            ListenableFuture listenableFuture = zzexdVar2.f15078a;
                            zzfcs zzfcsVar = this.f15087e;
                            zzexd zzexdVar3 = new zzexd(zzfcsVar.zza(), this.f15088f, this.f15085c);
                            this.f15083a.set(zzexdVar3);
                            if (((Boolean) zzbaVar.f3098c.m5030a(zzbix.f8636ld)).booleanValue()) {
                                if (((Boolean) zzbaVar.f3098c.m5030a(zzbix.f8653md)).booleanValue()) {
                                    zzdzs zzdzsVarM6111a = this.f15089g.m6111a();
                                    zzdzsVarM6111a.m6107b("action", "scs");
                                    zzdzsVarM6111a.m6107b("sid", String.valueOf(zzfcsVar.zzb()));
                                    zzdzsVarM6111a.m6108c();
                                }
                                return listenableFuture;
                            }
                            zzexdVar = zzexdVar3;
                        } else {
                            zzexdVar = zzexdVar2;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else {
            AtomicReference atomicReference2 = this.f15083a;
            zzexdVar = (zzexd) atomicReference2.get();
            if (zzexdVar != null) {
                if (zzexdVar.f15079b < zzexdVar.f15080c.mo3639a()) {
                    zzfcs zzfcsVar2 = this.f15087e;
                    zzexd zzexdVar4 = new zzexd(zzfcsVar2.zza(), this.f15088f, this.f15085c);
                    atomicReference2.set(zzexdVar4);
                    zzexdVar = zzexdVar4;
                }
            } else {
                zzfcs zzfcsVar3 = this.f15087e;
                zzexd zzexdVar5 = new zzexd(zzfcsVar3.zza(), this.f15088f, this.f15085c);
                atomicReference2.set(zzexdVar5);
                zzexdVar = zzexdVar5;
            }
        }
        return zzexdVar.f15078a;
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final int zzb() {
        return this.f15087e.zzb();
    }
}
