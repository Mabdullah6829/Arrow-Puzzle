package com.google.android.gms.tasks;

import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes2.dex */
final class zzaa<T> implements zzab<T> {

    /* JADX INFO: renamed from: s */
    public final CountDownLatch f23220s = new CountDownLatch(1);

    private zzaa() {
    }

    @Override // com.google.android.gms.tasks.OnCanceledListener
    /* JADX INFO: renamed from: b */
    public final void mo10766b() {
        this.f23220s.countDown();
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        this.f23220s.countDown();
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(Object obj) {
        this.f23220s.countDown();
    }

    public /* synthetic */ zzaa(int i2) {
    }
}
