package com.google.firebase.firestore.core;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Map;

/* JADX INFO: renamed from: com.google.firebase.firestore.core.f */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5758f implements OnSuccessListener, OnFailureListener {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ TaskCompletionSource f23681s;

    public /* synthetic */ C5758f(TaskCompletionSource taskCompletionSource) {
        this.f23681s = taskCompletionSource;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        this.f23681s.m10767a(exc);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        this.f23681s.m10768b((Map) obj);
    }
}
