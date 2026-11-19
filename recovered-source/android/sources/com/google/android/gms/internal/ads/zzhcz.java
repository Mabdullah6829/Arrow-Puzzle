package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
final class zzhcz implements Runnable {

    /* JADX INFO: renamed from: s */
    public zzhdb f18533s;

    @Override // java.lang.Runnable
    public final void run() {
        ListenableFuture listenableFuture;
        zzhdb zzhdbVar = this.f18533s;
        if (zzhdbVar == null || (listenableFuture = zzhdbVar.f18536z) == null) {
            return;
        }
        this.f18533s = null;
        if (listenableFuture.isDone()) {
            zzhdbVar.m7324l(listenableFuture);
            return;
        }
        try {
            ScheduledFuture scheduledFuture = zzhdbVar.f18535A;
            zzhdbVar.f18535A = null;
            String string = "Timed out";
            if (scheduledFuture != null) {
                try {
                    long jAbs = Math.abs(scheduledFuture.getDelay(TimeUnit.MILLISECONDS));
                    if (jAbs > 10) {
                        StringBuilder sb = new StringBuilder(String.valueOf(jAbs).length() + 55);
                        sb.append("Timed out (timeout delayed by ");
                        sb.append(jAbs);
                        sb.append(" ms after scheduled time)");
                        string = sb.toString();
                    }
                } catch (Throwable th) {
                    zzhdbVar.m7321d(new zzhda(string));
                    throw th;
                }
            }
            String string2 = listenableFuture.toString();
            StringBuilder sb2 = new StringBuilder(string.length() + 2 + string2.length());
            sb2.append(string);
            sb2.append(": ");
            sb2.append(string2);
            zzhdbVar.m7321d(new zzhda(sb2.toString()));
            listenableFuture.cancel(true);
        } catch (Throwable th2) {
            listenableFuture.cancel(true);
            throw th2;
        }
    }
}
