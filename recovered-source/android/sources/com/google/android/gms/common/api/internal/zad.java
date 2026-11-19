package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes.dex */
abstract class zad extends zac {

    /* JADX INFO: renamed from: b */
    public final TaskCompletionSource f4351b;

    public zad(int i2, TaskCompletionSource taskCompletionSource) {
        super(i2);
        this.f4351b = taskCompletionSource;
    }

    @Override // com.google.android.gms.common.api.internal.zai
    /* JADX INFO: renamed from: a */
    public final void mo3517a(Status status) {
        this.f4351b.m10769c(new ApiException(status));
    }

    @Override // com.google.android.gms.common.api.internal.zai
    /* JADX INFO: renamed from: b */
    public final void mo3518b(Exception exc) {
        this.f4351b.m10769c(exc);
    }

    @Override // com.google.android.gms.common.api.internal.zai
    /* JADX INFO: renamed from: c */
    public void mo3519c(zaaa zaaaVar, boolean z) {
    }

    @Override // com.google.android.gms.common.api.internal.zai
    /* JADX INFO: renamed from: d */
    public final void mo3520d(zabk zabkVar) throws DeadObjectException {
        try {
            mo3521i(zabkVar);
        } catch (DeadObjectException e) {
            mo3517a(zai.m3522e(e));
            throw e;
        } catch (RemoteException e2) {
            mo3517a(zai.m3522e(e2));
        } catch (RuntimeException e3) {
            this.f4351b.m10769c(e3);
        }
    }

    /* JADX INFO: renamed from: i */
    public abstract void mo3521i(zabk zabkVar);
}
