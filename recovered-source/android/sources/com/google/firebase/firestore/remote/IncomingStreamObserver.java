package com.google.firebase.firestore.remote;

import p030R.C0559h0;
import p030R.C0589w0;

/* JADX INFO: loaded from: classes2.dex */
interface IncomingStreamObserver<RespT> {
    void onClose(C0589w0 c0589w0);

    void onHeaders(C0559h0 c0559h0);

    void onNext(RespT respt);

    void onOpen();
}
