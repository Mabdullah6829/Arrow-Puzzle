package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes2.dex */
final class zzhbj extends zzhbi {

    /* JADX INFO: renamed from: a */
    public static final AtomicReferenceFieldUpdater f18493a = AtomicReferenceFieldUpdater.newUpdater(zzhbl.class, Set.class, "z");

    /* JADX INFO: renamed from: b */
    public static final AtomicIntegerFieldUpdater f18494b = AtomicIntegerFieldUpdater.newUpdater(zzhbl.class, "A");

    private zzhbj() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzhbi
    /* JADX INFO: renamed from: a */
    public final void mo7351a(zzhbh zzhbhVar, Set set) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = f18493a;
            if (atomicReferenceFieldUpdater.compareAndSet(zzhbhVar, null, set)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(zzhbhVar) == null);
    }

    @Override // com.google.android.gms.internal.ads.zzhbi
    /* JADX INFO: renamed from: b */
    public final int mo7352b(zzhbh zzhbhVar) {
        return f18494b.decrementAndGet(zzhbhVar);
    }
}
