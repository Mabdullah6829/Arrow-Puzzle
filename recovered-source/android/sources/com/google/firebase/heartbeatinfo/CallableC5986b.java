package com.google.firebase.heartbeatinfo;

import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.google.firebase.heartbeatinfo.b */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class CallableC5986b implements Callable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f23976a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ DefaultHeartBeatController f23977b;

    public /* synthetic */ CallableC5986b(DefaultHeartBeatController defaultHeartBeatController, int i2) {
        this.f23976a = i2;
        this.f23977b = defaultHeartBeatController;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f23976a) {
            case 0:
                return this.f23977b.lambda$getHeartBeatsHeader$1();
            default:
                return this.f23977b.lambda$registerHeartBeat$0();
        }
    }
}
