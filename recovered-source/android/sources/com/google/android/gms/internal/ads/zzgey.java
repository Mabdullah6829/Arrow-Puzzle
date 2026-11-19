package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgey implements zzgew {

    /* JADX INFO: renamed from: a */
    public final Executor f17119a;

    /* JADX INFO: renamed from: b */
    public final PriorityQueue f17120b = new PriorityQueue();

    public zzgey(Executor executor) {
        this.f17119a = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzgew
    /* JADX INFO: renamed from: a */
    public final void mo6967a(Runnable runnable, long j2) {
        if (j2 <= 0) {
            this.f17119a.execute(runnable);
            return;
        }
        zzgfa zzgfaVar = new zzgfa(runnable, System.currentTimeMillis() + j2);
        PriorityQueue priorityQueue = this.f17120b;
        synchronized (priorityQueue) {
            priorityQueue.add(zzgfaVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgew
    public final void zzb() {
        PriorityQueue priorityQueue = this.f17120b;
        synchronized (priorityQueue) {
            try {
                if (priorityQueue.isEmpty()) {
                    return;
                }
                PriorityQueue priorityQueue2 = new PriorityQueue();
                long jCurrentTimeMillis = System.currentTimeMillis();
                for (zzgfa zzgfaVar = (zzgfa) priorityQueue.peek(); zzgfaVar != null && zzgfaVar.f17127t <= jCurrentTimeMillis; zzgfaVar = (zzgfa) priorityQueue.peek()) {
                    priorityQueue2.add(zzgfaVar);
                }
                Iterator it = priorityQueue2.iterator();
                while (it.hasNext()) {
                    try {
                        this.f17119a.execute(((zzgfa) it.next()).f17126s);
                    } catch (RuntimeException unused) {
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
