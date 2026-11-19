package com.google.firebase.firestore.remote;

import p030R.C0559h0;
import p030R.C0589w0;

/* JADX INFO: renamed from: com.google.firebase.firestore.remote.c */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC5960c implements Runnable {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ int f23933s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ Object f23934t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ Object f23935u;

    public /* synthetic */ RunnableC5960c(int i2, Object obj, Object obj2) {
        this.f23933s = i2;
        this.f23934t = obj;
        this.f23935u = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f23933s) {
            case 0:
                ((AbstractStream.StreamObserver) this.f23934t).lambda$onHeaders$0((C0559h0) this.f23935u);
                break;
            case 1:
                ((AbstractStream.StreamObserver) this.f23934t).lambda$onClose$3((C0589w0) this.f23935u);
                break;
            case 2:
                ((AndroidConnectivityMonitor) this.f23934t).lambda$configureNetworkMonitoring$0((AndroidConnectivityMonitor.DefaultNetworkCallback) this.f23935u);
                break;
            case 3:
                ((AndroidConnectivityMonitor) this.f23934t).lambda$configureNetworkMonitoring$1((AndroidConnectivityMonitor.NetworkReceiver) this.f23935u);
                break;
            default:
                ((RemoteStore) this.f23934t).lambda$new$0((ConnectivityMonitor.NetworkStatus) this.f23935u);
                break;
        }
    }
}
