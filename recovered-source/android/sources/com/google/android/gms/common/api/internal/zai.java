package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes.dex */
public abstract class zai {

    /* JADX INFO: renamed from: a */
    public final int f4357a;

    public zai(int i2) {
        this.f4357a = i2;
    }

    /* JADX INFO: renamed from: e */
    public static Status m3522e(RemoteException remoteException) {
        return new Status(19, remoteException.getClass().getSimpleName() + ": " + remoteException.getLocalizedMessage(), null, null);
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo3517a(Status status);

    /* JADX INFO: renamed from: b */
    public abstract void mo3518b(Exception exc);

    /* JADX INFO: renamed from: c */
    public abstract void mo3519c(zaaa zaaaVar, boolean z);

    /* JADX INFO: renamed from: d */
    public abstract void mo3520d(zabk zabkVar);
}
