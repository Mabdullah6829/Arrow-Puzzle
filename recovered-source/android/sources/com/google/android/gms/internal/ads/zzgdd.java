package com.google.android.gms.internal.ads;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgdd {
    /* JADX INFO: renamed from: a */
    public static ListenableFuture m6899a(Task task) {
        final zzgdb zzgdbVar = new zzgdb();
        zzgdbVar.f17010z = task;
        task.addOnCompleteListener(zzhbu.f18506s, new OnCompleteListener() { // from class: com.google.android.gms.internal.ads.zzgdc
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final /* synthetic */ void onComplete(Task task2) {
                boolean zIsCanceled = task2.isCanceled();
                zzgdb zzgdbVar2 = zzgdbVar;
                if (zIsCanceled) {
                    zzgdbVar2.cancel(false);
                    return;
                }
                if (task2.isSuccessful()) {
                    zzgdbVar2.m7320c(task2.getResult());
                    return;
                }
                Exception exception = task2.getException();
                if (exception == null) {
                    throw new IllegalStateException();
                }
                zzgdbVar2.m7321d(exception);
            }
        });
        return zzgdbVar;
    }
}
