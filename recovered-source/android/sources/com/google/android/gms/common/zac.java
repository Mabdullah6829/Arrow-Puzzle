package com.google.android.gms.common;

import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;

/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class zac implements SuccessContinuation {
    static {
        new zac();
    }

    private /* synthetic */ zac() {
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public final /* synthetic */ Task then(Object obj) {
        Object obj2 = GoogleApiAvailability.f4153d;
        return Tasks.m10776f(null);
    }
}
