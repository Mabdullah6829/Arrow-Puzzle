package com.google.firebase.crashlytics.internal.concurrency;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.google.firebase.crashlytics.internal.concurrency.a */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5654a implements Continuation {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ int f23615s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ Callable f23616t;

    public /* synthetic */ C5654a(Callable callable, int i2) {
        this.f23615s = i2;
        this.f23616t = callable;
    }

    @Override // com.google.android.gms.tasks.Continuation
    /* JADX INFO: renamed from: a */
    public final Object mo170a(Task task) {
        switch (this.f23615s) {
            case 0:
                return CrashlyticsWorker.lambda$submit$0(this.f23616t, task);
            case 1:
                return CrashlyticsWorker.lambda$submitTask$2(this.f23616t, task);
            case 2:
                return CrashlyticsWorker.lambda$submitTask$3(this.f23616t, task);
            default:
                return CrashlyticsWorker.lambda$submitTaskOnSuccess$4(this.f23616t, task);
        }
    }
}
