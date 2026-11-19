package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class zag extends zac {

    /* JADX INFO: renamed from: b */
    public final TaskApiCall f4353b;

    /* JADX INFO: renamed from: c */
    public final TaskCompletionSource f4354c;

    /* JADX INFO: renamed from: d */
    public final StatusExceptionMapper f4355d;

    public zag(int i2, TaskApiCall taskApiCall, TaskCompletionSource taskCompletionSource, StatusExceptionMapper statusExceptionMapper) {
        super(i2);
        this.f4354c = taskCompletionSource;
        this.f4353b = taskApiCall;
        this.f4355d = statusExceptionMapper;
        if (i2 == 2 && taskApiCall.f4273b) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    @Override // com.google.android.gms.common.api.internal.zai
    /* JADX INFO: renamed from: a */
    public final void mo3517a(Status status) {
        this.f4354c.m10769c(this.f4355d.getException(status));
    }

    @Override // com.google.android.gms.common.api.internal.zai
    /* JADX INFO: renamed from: b */
    public final void mo3518b(Exception exc) {
        this.f4354c.m10769c(exc);
    }

    @Override // com.google.android.gms.common.api.internal.zai
    /* JADX INFO: renamed from: c */
    public final void mo3519c(zaaa zaaaVar, boolean z) {
        Boolean boolValueOf = Boolean.valueOf(z);
        Map map = zaaaVar.f4282b;
        TaskCompletionSource taskCompletionSource = this.f4354c;
        map.put(taskCompletionSource, boolValueOf);
        taskCompletionSource.f23216a.addOnCompleteListener(new zaz(zaaaVar, taskCompletionSource));
    }

    @Override // com.google.android.gms.common.api.internal.zai
    /* JADX INFO: renamed from: d */
    public final void mo3520d(zabk zabkVar) throws DeadObjectException {
        TaskCompletionSource taskCompletionSource = this.f4354c;
        try {
            TaskApiCall taskApiCall = this.f4353b;
            ((zacn) taskApiCall).f4349d.f4275a.mo3483a(zabkVar.f4297t, taskCompletionSource);
        } catch (DeadObjectException e) {
            throw e;
        } catch (RemoteException e2) {
            mo3517a(zai.m3522e(e2));
        } catch (RuntimeException e3) {
            taskCompletionSource.m10769c(e3);
        }
    }

    @Override // com.google.android.gms.common.api.internal.zac
    /* JADX INFO: renamed from: f */
    public final Feature[] mo3514f(zabk zabkVar) {
        return this.f4353b.f4272a;
    }

    @Override // com.google.android.gms.common.api.internal.zac
    /* JADX INFO: renamed from: g */
    public final boolean mo3515g(zabk zabkVar) {
        return this.f4353b.f4273b;
    }

    @Override // com.google.android.gms.common.api.internal.zac
    /* JADX INFO: renamed from: h */
    public final int mo3516h(zabk zabkVar) {
        return this.f4353b.f4274c;
    }
}
