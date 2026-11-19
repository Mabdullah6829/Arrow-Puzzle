package com.google.firebase.concurrent;

/* JADX INFO: renamed from: com.google.firebase.concurrent.c */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC5625c implements Runnable {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ int f23560s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ Runnable f23561t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ DelegatingScheduledFuture.Completer f23562u;

    public /* synthetic */ RunnableC5625c(Runnable runnable, DelegatingScheduledFuture.Completer completer, int i2) {
        this.f23560s = i2;
        this.f23561t = runnable;
        this.f23562u = completer;
    }

    @Override // java.lang.Runnable
    public final void run() throws Exception {
        switch (this.f23560s) {
            case 0:
                DelegatingScheduledExecutorService.lambda$scheduleWithFixedDelay$9(this.f23561t, this.f23562u);
                break;
            case 1:
                DelegatingScheduledExecutorService.lambda$schedule$0(this.f23561t, this.f23562u);
                break;
            default:
                DelegatingScheduledExecutorService.lambda$scheduleAtFixedRate$6(this.f23561t, this.f23562u);
                break;
        }
    }
}
