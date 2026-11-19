package com.google.firebase.messaging;

import android.content.Intent;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.ScheduledFuture;

/* JADX INFO: renamed from: com.google.firebase.messaging.l */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C6020l implements Continuation, OnCompleteListener {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ int f24021s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ Object f24022t;

    public /* synthetic */ C6020l(Object obj, int i2) {
        this.f24021s = i2;
        this.f24022t = obj;
    }

    @Override // com.google.android.gms.tasks.Continuation
    /* JADX INFO: renamed from: a */
    public Object mo170a(Task task) {
        return ((GmsRpc) this.f24022t).lambda$extractResponseWhenComplete$0(task);
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        switch (this.f24021s) {
            case 1:
                WakeLockHolder.completeWakefulIntent((Intent) this.f24022t);
                break;
            case 2:
                ((WithinAppServiceConnection.BindRequest) this.f24022t).finish();
                break;
            default:
                ((ScheduledFuture) this.f24022t).cancel(false);
                break;
        }
    }
}
