package com.google.android.gms.internal.ads;

import java.util.concurrent.locks.AbstractOwnableSynchronizer;

/* JADX INFO: loaded from: classes2.dex */
final class zzhck extends AbstractOwnableSynchronizer implements Runnable {

    /* JADX INFO: renamed from: s */
    public final zzhcm f18521s;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ void m7380a(Thread thread) {
        setExclusiveOwnerThread(thread);
    }

    @Override // java.lang.Runnable
    public final void run() {
    }

    public final String toString() {
        return this.f18521s.toString();
    }
}
