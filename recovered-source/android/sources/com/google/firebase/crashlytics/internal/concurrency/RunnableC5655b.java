package com.google.firebase.crashlytics.internal.concurrency;

import com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver;

/* JADX INFO: renamed from: com.google.firebase.crashlytics.internal.concurrency.b */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC5655b implements Runnable {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ int f23617s;

    public /* synthetic */ RunnableC5655b(int i2) {
        this.f23617s = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f23617s) {
            case 0:
                CrashlyticsWorker.lambda$await$6();
                break;
            default:
                int i2 = AlarmManagerSchedulerBroadcastReceiver.f2924a;
                break;
        }
    }
}
