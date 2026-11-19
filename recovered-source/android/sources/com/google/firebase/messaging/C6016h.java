package com.google.firebase.messaging;

import com.google.android.gms.cloudmessaging.CloudMessage;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.iid.internal.FirebaseInstanceIdInternal;

/* JADX INFO: renamed from: com.google.firebase.messaging.h */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C6016h implements OnSuccessListener, FirebaseInstanceIdInternal.NewTokenListener {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ int f24014s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ FirebaseMessaging f24015t;

    public /* synthetic */ C6016h(FirebaseMessaging firebaseMessaging, int i2) {
        this.f24014s = i2;
        this.f24015t = firebaseMessaging;
    }

    @Override // com.google.firebase.iid.internal.FirebaseInstanceIdInternal.NewTokenListener
    public void onNewToken(String str) {
        this.f24015t.lambda$new$1(str);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        switch (this.f24014s) {
            case 0:
                this.f24015t.lambda$new$3((TopicsSubscriber) obj);
                break;
            case 1:
            default:
                this.f24015t.lambda$handleProxiedNotificationData$5((CloudMessage) obj);
                break;
            case 2:
                this.f24015t.lambda$setNotificationDelegationEnabled$6((Void) obj);
                break;
        }
    }
}
