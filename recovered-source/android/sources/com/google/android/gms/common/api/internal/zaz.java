package com.google.android.gms.common.api.internal;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
final class zaz implements OnCompleteListener {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ TaskCompletionSource f4368s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ zaaa f4369t;

    public zaz(zaaa zaaaVar, TaskCompletionSource taskCompletionSource) {
        this.f4368s = taskCompletionSource;
        Objects.requireNonNull(zaaaVar);
        this.f4369t = zaaaVar;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        this.f4369t.f4282b.remove(this.f4368s);
    }
}
