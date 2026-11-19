package com.google.firebase.messaging;

import android.content.Intent;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: renamed from: com.google.firebase.messaging.d */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC6012d implements Runnable {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ int f24004s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ Object f24005t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ Object f24006u;

    public /* synthetic */ RunnableC6012d(int i2, Object obj, Object obj2) {
        this.f24004s = i2;
        this.f24005t = obj;
        this.f24006u = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f24004s) {
            case 0:
                ((FcmLifecycleCallbacks) this.f24005t).lambda$onActivityCreated$0((Intent) this.f24006u);
                break;
            default:
                ((ImageDownload) this.f24005t).lambda$start$0((TaskCompletionSource) this.f24006u);
                break;
        }
    }
}
