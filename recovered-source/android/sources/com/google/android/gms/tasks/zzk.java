package com.google.android.gms.tasks;

import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes2.dex */
final class zzk implements Runnable {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ Task f23249s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ zzl f23250t;

    public zzk(zzl zzlVar, Task task) {
        this.f23249s = task;
        this.f23250t = zzlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzl zzlVar = this.f23250t;
        synchronized (zzlVar.f23252t) {
            try {
                OnFailureListener onFailureListener = zzlVar.f23253u;
                if (onFailureListener != null) {
                    Exception exception = this.f23249s.getException();
                    Preconditions.m3544h(exception);
                    onFailureListener.onFailure(exception);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
