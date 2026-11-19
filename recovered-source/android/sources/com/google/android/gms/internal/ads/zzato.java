package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class zzato {

    /* JADX INFO: renamed from: a */
    public final AtomicInteger f6899a;

    /* JADX INFO: renamed from: b */
    public final HashSet f6900b;

    /* JADX INFO: renamed from: c */
    public final PriorityBlockingQueue f6901c;

    /* JADX INFO: renamed from: d */
    public final PriorityBlockingQueue f6902d;

    /* JADX INFO: renamed from: e */
    public final zzauh f6903e;

    /* JADX INFO: renamed from: f */
    public final zzaua f6904f;

    /* JADX INFO: renamed from: g */
    public final zzatf[] f6905g;

    /* JADX INFO: renamed from: h */
    public zzasx f6906h;

    /* JADX INFO: renamed from: i */
    public final ArrayList f6907i;

    /* JADX INFO: renamed from: j */
    public final ArrayList f6908j;

    /* JADX INFO: renamed from: k */
    public final zzatc f6909k;

    public zzato(zzauh zzauhVar, zzaua zzauaVar) {
        zzatc zzatcVar = new zzatc(new Handler(Looper.getMainLooper()));
        this.f6899a = new AtomicInteger();
        this.f6900b = new HashSet();
        this.f6901c = new PriorityBlockingQueue();
        this.f6902d = new PriorityBlockingQueue();
        this.f6907i = new ArrayList();
        this.f6908j = new ArrayList();
        this.f6903e = zzauhVar;
        this.f6904f = zzauaVar;
        this.f6905g = new zzatf[4];
        this.f6909k = zzatcVar;
    }

    /* JADX INFO: renamed from: a */
    public final void m4397a() {
        zzasx zzasxVar = this.f6906h;
        if (zzasxVar != null) {
            zzasxVar.f6860v = true;
            zzasxVar.interrupt();
        }
        zzatf[] zzatfVarArr = this.f6905g;
        for (int i2 = 0; i2 < 4; i2++) {
            zzatf zzatfVar = zzatfVarArr[i2];
            if (zzatfVar != null) {
                zzatfVar.f6877v = true;
                zzatfVar.interrupt();
            }
        }
        PriorityBlockingQueue priorityBlockingQueue = this.f6901c;
        PriorityBlockingQueue priorityBlockingQueue2 = this.f6902d;
        zzauh zzauhVar = this.f6903e;
        zzatc zzatcVar = this.f6909k;
        zzasx zzasxVar2 = new zzasx(priorityBlockingQueue, priorityBlockingQueue2, zzauhVar, zzatcVar);
        this.f6906h = zzasxVar2;
        zzasxVar2.start();
        for (int i3 = 0; i3 < 4; i3++) {
            zzatf zzatfVar2 = new zzatf(priorityBlockingQueue2, this.f6904f, zzauhVar, zzatcVar);
            zzatfVarArr[i3] = zzatfVar2;
            zzatfVar2.start();
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m4398b(zzatl zzatlVar) {
        zzatlVar.f6898z = this;
        HashSet hashSet = this.f6900b;
        synchronized (hashSet) {
            hashSet.add(zzatlVar);
        }
        zzatlVar.f6897y = Integer.valueOf(this.f6899a.incrementAndGet());
        zzatlVar.m4390b("add-to-queue");
        m4399c();
        this.f6901c.add(zzatlVar);
    }

    /* JADX INFO: renamed from: c */
    public final void m4399c() {
        ArrayList arrayList = this.f6908j;
        synchronized (arrayList) {
            try {
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    ((zzatm) obj).zza();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
