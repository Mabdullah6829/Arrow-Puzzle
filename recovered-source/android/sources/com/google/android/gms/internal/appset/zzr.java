package com.google.android.gms.internal.appset;

import android.content.Context;
import com.google.android.gms.appset.AppSetIdClient;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;

/* JADX INFO: loaded from: classes2.dex */
public final class zzr implements AppSetIdClient {

    /* JADX INFO: renamed from: a */
    public final zzp f21543a;

    /* JADX INFO: renamed from: b */
    public final zzl f21544b;

    public zzr(Context context) {
        zzl zzlVar;
        this.f21543a = new zzp(context, GoogleApiAvailabilityLight.f4157b);
        synchronized (zzl.class) {
            try {
                if (zzl.f21534d == null) {
                    zzl.f21534d = new zzl(context.getApplicationContext());
                }
                zzlVar = zzl.f21534d;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f21544b = zzlVar;
    }

    @Override // com.google.android.gms.appset.AppSetIdClient
    /* JADX INFO: renamed from: a */
    public final Task mo3367a() {
        return this.f21543a.mo3367a().continueWithTask(new Continuation() { // from class: com.google.android.gms.internal.appset.zzq
            @Override // com.google.android.gms.tasks.Continuation
            /* JADX INFO: renamed from: a */
            public final Object mo170a(Task task) {
                if (task.isSuccessful() || task.isCanceled()) {
                    return task;
                }
                Exception exception = task.getException();
                if (!(exception instanceof ApiException)) {
                    return task;
                }
                int statusCode = ((ApiException) exception).getStatusCode();
                if (statusCode == 43001 || statusCode == 43002 || statusCode == 43003 || statusCode == 17) {
                    return this.f21542s.f21544b.mo3367a();
                }
                if (statusCode == 43000) {
                    return Tasks.m10775e(new Exception("Failed to get app set ID due to an internal error. Please try again later."));
                }
                return statusCode != 15 ? task : Tasks.m10775e(new Exception("The operation to get app set ID timed out. Please try again later."));
            }
        });
    }
}
