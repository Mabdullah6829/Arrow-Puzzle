package com.google.android.gms.internal.base;

import com.google.android.gms.common.util.concurrent.NumberedThreadFactory;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
final class zam implements zal {
    private zam() {
        throw null;
    }

    @Override // com.google.android.gms.internal.base.zal
    /* JADX INFO: renamed from: a */
    public final ExecutorService mo9082a(NumberedThreadFactory numberedThreadFactory) {
        return mo9083b(1, numberedThreadFactory);
    }

    @Override // com.google.android.gms.internal.base.zal
    /* JADX INFO: renamed from: b */
    public final ExecutorService mo9083b(int i2, NumberedThreadFactory numberedThreadFactory) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i2, i2, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), numberedThreadFactory);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return Executors.unconfigurableExecutorService(threadPoolExecutor);
    }
}
