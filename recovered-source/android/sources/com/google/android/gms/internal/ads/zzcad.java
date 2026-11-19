package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzcad implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Thread.UncaughtExceptionHandler f9581a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zzcaf f9582b;

    public zzcad(zzcaf zzcafVar, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f9581a = uncaughtExceptionHandler;
        this.f9582b = zzcafVar;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f9581a;
        try {
            try {
                this.f9582b.m5293g(th);
            } finally {
                if (uncaughtExceptionHandler != null) {
                    uncaughtExceptionHandler.uncaughtException(thread, th);
                }
            }
        } catch (Throwable unused) {
            com.google.android.gms.ads.internal.util.client.zzo.m3070c("AdMob exception reporter failed reporting the exception.");
        }
        if (uncaughtExceptionHandler != null) {
        }
    }
}
