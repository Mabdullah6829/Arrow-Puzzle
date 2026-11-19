package com.instagram.common.viewpoint.core;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ss */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class CallableC3643Ss implements Callable<Boolean> {
    public final BlockingQueue<Boolean> A00 = new LinkedBlockingQueue();
    public final /* synthetic */ C3648Sx A01;

    public CallableC3643Ss(C3648Sx c3648Sx, C3644St c3644St) {
        this.A01 = c3648Sx;
        new Handler(Looper.getMainLooper()).post(new C4497gl(this, c3648Sx, c3644St));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.concurrent.Callable
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final Boolean call() throws Exception {
        return this.A00.take();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A03(C3644St c3644St) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        C4425fb c4425fbA06 = C4425fb.A06(this.A01.A04.A02());
        Uri uriA00 = AbstractC3904XB.A00(c3644St.A08);
        long jA0S = c3644St.A00;
        if (jA0S == -1) {
            jA0S = C3763Up.A0S(this.A01.A04);
        }
        c4425fbA06.A0I(uriA00, new C4496gk(this, c3644St, jA0S, jCurrentTimeMillis), jA0S);
    }
}
