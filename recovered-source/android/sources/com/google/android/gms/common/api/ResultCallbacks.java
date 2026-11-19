package com.google.android.gms.common.api;

import android.util.Log;
import com.google.android.gms.common.api.Result;

/* JADX INFO: loaded from: classes.dex */
public abstract class ResultCallbacks<R extends Result> implements ResultCallback<R> {
    @Override // com.google.android.gms.common.api.ResultCallback
    /* JADX INFO: renamed from: a */
    public final void mo3431a(Result result) {
        Status statusMo3424n = result.mo3424n();
        if (statusMo3424n.m3433w()) {
            m3432c();
            return;
        }
        mo3429b(statusMo3424n);
        if (result instanceof Releasable) {
            try {
                ((Releasable) result).release();
            } catch (RuntimeException e) {
                Log.w("ResultCallbacks", "Unable to release ".concat(String.valueOf(result)), e);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public abstract void mo3429b(Status status);

    /* JADX INFO: renamed from: c */
    public abstract void m3432c();
}
