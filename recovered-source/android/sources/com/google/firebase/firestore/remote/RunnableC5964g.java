package com.google.firebase.firestore.remote;

import p030R.AbstractC0541X;

/* JADX INFO: renamed from: com.google.firebase.firestore.remote.g */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC5964g implements Runnable {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ int f23945s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ GrpcCallProvider f23946t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ AbstractC0541X f23947u;

    public /* synthetic */ RunnableC5964g(GrpcCallProvider grpcCallProvider, AbstractC0541X abstractC0541X, int i2) {
        this.f23945s = i2;
        this.f23946t = grpcCallProvider;
        this.f23947u = abstractC0541X;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f23945s) {
            case 0:
                this.f23946t.lambda$onConnectivityStateChange$1(this.f23947u);
                break;
            case 1:
                this.f23946t.lambda$onConnectivityStateChange$3(this.f23947u);
                break;
            case 2:
                this.f23946t.lambda$onConnectivityStateChange$2(this.f23947u);
                break;
            case 3:
                this.f23946t.lambda$resetChannel$4(this.f23947u);
                break;
            default:
                this.f23946t.lambda$initChannelTask$5(this.f23947u);
                break;
        }
    }
}
