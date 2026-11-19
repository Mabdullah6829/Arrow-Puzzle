package com.google.android.gms.internal.ads;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class zzfl implements ThreadFactory {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ String f16009s;

    public /* synthetic */ zzfl(String str) {
        this.f16009s = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final /* synthetic */ Thread newThread(Runnable runnable) {
        String str = zzfm.f16091a;
        return new Thread(runnable, this.f16009s);
    }
}
