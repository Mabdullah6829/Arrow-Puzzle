package com.google.firebase.messaging;

import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;

/* JADX INFO: renamed from: com.google.firebase.messaging.e */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C6013e implements SuccessContinuation {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f24007a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f24008b;

    public /* synthetic */ C6013e(String str, int i2) {
        this.f24007a = i2;
        this.f24008b = str;
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public final Task then(Object obj) {
        switch (this.f24007a) {
            case 0:
                return FirebaseMessaging.lambda$subscribeToTopic$10(this.f24008b, (TopicsSubscriber) obj);
            default:
                return FirebaseMessaging.lambda$unsubscribeFromTopic$11(this.f24008b, (TopicsSubscriber) obj);
        }
    }
}
