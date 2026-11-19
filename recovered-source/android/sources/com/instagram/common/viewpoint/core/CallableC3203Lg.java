package com.instagram.common.viewpoint.core;

import java.io.File;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Lg */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class CallableC3203Lg implements Callable<Void> {
    public final File A00;
    public final /* synthetic */ AbstractC4743kr A01;

    public CallableC3203Lg(AbstractC4743kr abstractC4743kr, File file) {
        this.A01 = abstractC4743kr;
        this.A00 = file;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.concurrent.Callable
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final Void call() throws Exception {
        this.A01.A06(this.A00);
        return null;
    }
}
