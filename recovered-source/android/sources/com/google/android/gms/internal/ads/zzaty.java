package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.BlockingQueue;

/* JADX INFO: loaded from: classes2.dex */
final class zzaty implements zzatk {

    /* JADX INFO: renamed from: a */
    public final HashMap f6922a = new HashMap();

    /* JADX INFO: renamed from: b */
    public final zzasx f6923b;

    /* JADX INFO: renamed from: c */
    public final BlockingQueue f6924c;

    /* JADX INFO: renamed from: d */
    public final zzatc f6925d;

    public zzaty(zzasx zzasxVar, BlockingQueue blockingQueue, zzatc zzatcVar) {
        this.f6925d = zzatcVar;
        this.f6923b = zzasxVar;
        this.f6924c = blockingQueue;
    }

    @Override // com.google.android.gms.internal.ads.zzatk
    /* JADX INFO: renamed from: a */
    public final synchronized void mo4388a(zzatl zzatlVar) {
        try {
            HashMap map = this.f6922a;
            String strM4393f = zzatlVar.m4393f();
            List list = (List) map.remove(strM4393f);
            if (list == null || list.isEmpty()) {
                return;
            }
            if (zzatx.f6920a) {
                zzatx.m4402a("%d waiting requests for cacheKey=%s; resend to network", Integer.valueOf(list.size()), strM4393f);
            }
            zzatl zzatlVar2 = (zzatl) list.remove(0);
            map.put(strM4393f, list);
            synchronized (zzatlVar2.f6895w) {
                zzatlVar2.f6889C = this;
            }
            try {
                this.f6924c.put(zzatlVar2);
            } catch (InterruptedException e) {
                zzatx.m4404c("Couldn't add request to queue. %s", e.toString());
                Thread.currentThread().interrupt();
                zzasx zzasxVar = this.f6923b;
                zzasxVar.f6860v = true;
                zzasxVar.interrupt();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzatk
    /* JADX INFO: renamed from: b */
    public final void mo4389b(zzatl zzatlVar, zzatr zzatrVar) {
        List list;
        zzasu zzasuVar = zzatrVar.f6911b;
        if (zzasuVar != null) {
            if (zzasuVar.f6850e >= System.currentTimeMillis()) {
                String strM4393f = zzatlVar.m4393f();
                synchronized (this) {
                    list = (List) this.f6922a.remove(strM4393f);
                }
                if (list != null) {
                    if (zzatx.f6920a) {
                        zzatx.m4402a("Releasing %d waiting requests for cacheKey=%s.", Integer.valueOf(list.size()), strM4393f);
                    }
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        this.f6925d.m4385a((zzatl) it.next(), zzatrVar, null);
                    }
                    return;
                }
                return;
            }
        }
        mo4388a(zzatlVar);
    }

    /* JADX INFO: renamed from: c */
    public final synchronized boolean m4406c(zzatl zzatlVar) {
        try {
            HashMap map = this.f6922a;
            String strM4393f = zzatlVar.m4393f();
            if (!map.containsKey(strM4393f)) {
                map.put(strM4393f, null);
                synchronized (zzatlVar.f6895w) {
                    zzatlVar.f6889C = this;
                }
                if (zzatx.f6920a) {
                    zzatx.m4403b("new request, sending to network %s", strM4393f);
                }
                return false;
            }
            List arrayList = (List) map.get(strM4393f);
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            zzatlVar.m4390b("waiting-for-response");
            arrayList.add(zzatlVar);
            map.put(strM4393f, arrayList);
            if (zzatx.f6920a) {
                zzatx.m4403b("Request for cacheKey=%s is in flight, putting on hold.", strM4393f);
            }
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }
}
