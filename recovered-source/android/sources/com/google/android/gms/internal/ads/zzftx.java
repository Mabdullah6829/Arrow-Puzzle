package com.google.android.gms.internal.ads;

import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
final class zzftx implements zzhcc {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzful f16529a;

    public zzftx(zzful zzfulVar) {
        this.f16529a = zzfulVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    /* JADX INFO: renamed from: a */
    public final void mo3316a(Object obj) {
        Object obj2;
        final zzful zzfulVar = this.f16529a;
        if (obj != null) {
            zzfulVar.f16565k.m6664a();
            com.google.android.gms.ads.internal.client.zzdx zzdxVarMo6663j = zzfulVar.mo6663j(obj);
            double d = !(zzdxVarMo6663j instanceof zzdcs) ? 0.0d : ((zzdcs) zzdxVarMo6663j).f12044B;
            com.google.android.gms.ads.internal.client.zzdx zzdxVarMo6663j2 = zzfulVar.mo6663j(obj);
            obj2 = obj;
            zzftw zzftwVar = new zzftw(obj2, zzfulVar.f16572r, d, zzdxVarMo6663j2 instanceof zzdcs ? ((zzdcs) zzdxVarMo6663j2).f12045C : 2);
            Queue queue = zzfulVar.f16564j;
            synchronized (queue) {
                queue.add(zzftwVar);
            }
            com.google.android.gms.ads.internal.client.zzdx zzdxVarMo6663j3 = zzfulVar.mo6663j(obj2);
            long jCurrentTimeMillis = zzfulVar.f16572r.currentTimeMillis();
            if (zzfulVar.f16570p.get()) {
                com.google.android.gms.ads.internal.util.zzs.f3626l.post(new zzfua(zzfulVar, zzdxVarMo6663j3));
            }
            ScheduledExecutorService scheduledExecutorService = zzfulVar.f16568n;
            scheduledExecutorService.execute(new zzfub(zzfulVar, jCurrentTimeMillis, zzdxVarMo6663j3));
            if (zzfulVar.f16560f != null) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8138I)).booleanValue()) {
                    zzfow zzfowVar = zzfulVar.f16569o;
                    Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzfuj
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            zzfulVar.m6700e();
                        }
                    };
                    long jM6695a = zzftwVar.m6695a();
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    zzfowVar.m6550a(runnable, jM6695a);
                } else {
                    scheduledExecutorService.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfui
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            zzfulVar.m6700e();
                        }
                    }, zzftwVar.m6695a(), TimeUnit.MILLISECONDS);
                }
            } else {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8138I)).booleanValue()) {
                    zzfow zzfowVar2 = zzfulVar.f16569o;
                    zzftz zzftzVar = new zzftz(zzfulVar);
                    long jM6695a2 = zzftwVar.m6695a();
                    TimeUnit timeUnit2 = TimeUnit.MILLISECONDS;
                    zzfowVar2.m6550a(zzftzVar, jM6695a2);
                } else {
                    scheduledExecutorService.schedule(new zzftz(zzfulVar), zzftwVar.m6695a(), TimeUnit.MILLISECONDS);
                }
            }
        } else {
            obj2 = obj;
        }
        zzfulVar.f16567m.set(false);
        if (obj2 == null || zzfulVar.f16560f == null) {
            zzfulVar.m6699d(obj2 == null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    /* JADX INFO: renamed from: b */
    public final void mo3317b(Throwable th) {
        zzful zzfulVar = this.f16529a;
        zzfulVar.f16567m.set(false);
        if ((th instanceof zzfsy) && ((zzfsy) th).f16454s == 0) {
            throw null;
        }
        zzfulVar.m6699d(true);
    }
}
