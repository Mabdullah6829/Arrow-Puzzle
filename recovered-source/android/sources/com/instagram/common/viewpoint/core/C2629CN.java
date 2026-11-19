package com.instagram.common.viewpoint.core;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.CN */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C2629CN implements InterfaceC4446fw {
    public final /* synthetic */ C20402U A00;
    public final /* synthetic */ CountDownLatch A01;
    public final /* synthetic */ AtomicReference A02;
    public final /* synthetic */ AtomicReference A03;

    public C2629CN(C20402U c20402u, AtomicReference atomicReference, AtomicReference atomicReference2, CountDownLatch countDownLatch) {
        this.A00 = c20402u;
        this.A03 = atomicReference;
        this.A02 = atomicReference2;
        this.A01 = countDownLatch;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC4446fw
    public final void ADR(InterfaceC4444fu interfaceC4444fu) {
        C20402U.A06(interfaceC4444fu.A73(), this.A03, this.A02);
        this.A01.countDown();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC4446fw
    public final void ADq(Exception exc) {
        this.A02.set(exc);
        this.A01.countDown();
    }
}
