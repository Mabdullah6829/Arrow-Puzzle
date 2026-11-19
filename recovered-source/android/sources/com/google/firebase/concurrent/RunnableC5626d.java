package com.google.firebase.concurrent;

/* JADX INFO: renamed from: com.google.firebase.concurrent.d */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC5626d implements Runnable {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ int f23563s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ DelegatingScheduledExecutorService f23564t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ Runnable f23565u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ DelegatingScheduledFuture.Completer f23566v;

    public /* synthetic */ RunnableC5626d(DelegatingScheduledExecutorService delegatingScheduledExecutorService, Runnable runnable, DelegatingScheduledFuture.Completer completer, int i2) {
        this.f23563s = i2;
        this.f23564t = delegatingScheduledExecutorService;
        this.f23565u = runnable;
        this.f23566v = completer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f23563s) {
            case 0:
                this.f23564t.lambda$scheduleWithFixedDelay$10(this.f23565u, this.f23566v);
                break;
            case 1:
                this.f23564t.lambda$scheduleAtFixedRate$7(this.f23565u, this.f23566v);
                break;
            default:
                this.f23564t.lambda$schedule$1(this.f23565u, this.f23566v);
                break;
        }
    }
}
