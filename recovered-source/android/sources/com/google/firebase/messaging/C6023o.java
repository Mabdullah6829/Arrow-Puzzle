package com.google.firebase.messaging;

import android.content.Intent;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* JADX INFO: renamed from: com.google.firebase.messaging.o */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C6023o implements Continuation, OnCompleteListener {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ Object f24028s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ Object f24029t;

    public /* synthetic */ C6023o(Object obj, Object obj2) {
        this.f24028s = obj;
        this.f24029t = obj2;
    }

    @Override // com.google.android.gms.tasks.Continuation
    /* JADX INFO: renamed from: a */
    public Object mo170a(Task task) {
        return ((RequestDeduplicator) this.f24028s).lambda$getOrStartGetTokenRequest$0((String) this.f24029t, task);
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        ((EnhancedIntentService) this.f24028s).lambda$onStartCommand$1((Intent) this.f24029t, task);
    }
}
