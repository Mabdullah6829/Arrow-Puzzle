package com.instagram.common.viewpoint.core;

import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.U9 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class CallableC3721U9 implements Callable<Boolean> {
    public final /* synthetic */ C3882Wn A00;
    public final /* synthetic */ String A01;

    public CallableC3721U9(C3882Wn c3882Wn, String str) {
        this.A00 = c3882Wn;
        this.A01 = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.concurrent.Callable
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final Boolean call() throws Exception {
        this.A00.A05();
        synchronized (C3723UB.A04) {
            C3723UB.A04.put(this.A01, 2);
        }
        return true;
    }
}
