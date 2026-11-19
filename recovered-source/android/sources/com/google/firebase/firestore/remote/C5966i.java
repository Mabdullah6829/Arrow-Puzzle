package com.google.firebase.firestore.remote;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.core.OnlineState;

/* JADX INFO: renamed from: com.google.firebase.firestore.remote.i */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5966i implements OnlineStateTracker.OnlineStateCallback, Continuation {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ Object f23949s;

    public /* synthetic */ C5966i(Object obj) {
        this.f23949s = obj;
    }

    @Override // com.google.android.gms.tasks.Continuation
    /* JADX INFO: renamed from: a */
    public Object mo170a(Task task) {
        return ((Datastore) this.f23949s).lambda$commit$0(task);
    }

    @Override // com.google.firebase.firestore.remote.OnlineStateTracker.OnlineStateCallback
    public void handleOnlineStateChange(OnlineState onlineState) {
        ((RemoteStore.RemoteStoreCallback) this.f23949s).handleOnlineStateChange(onlineState);
    }
}
