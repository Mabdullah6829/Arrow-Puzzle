package com.google.firebase.firestore.remote;

import com.google.firebase.firestore.remote.Stream.StreamCallback;
import p030R.C0589w0;

/* JADX INFO: loaded from: classes2.dex */
public interface Stream<CallbackType extends StreamCallback> {

    public enum State {
        Initial,
        Starting,
        Open,
        Healthy,
        Error,
        Backoff
    }

    public interface StreamCallback {
        void onClose(C0589w0 c0589w0);

        void onOpen();
    }

    void inhibitBackoff();

    boolean isOpen();

    boolean isStarted();

    void start();

    void stop();
}
