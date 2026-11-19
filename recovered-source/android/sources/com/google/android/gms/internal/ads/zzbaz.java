package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbaz {

    /* JADX INFO: renamed from: a */
    public final ListenableFuture f7503a;

    public zzbaz(final Context context, Executor executor) {
        this.f7503a = zzhcf.m7369c(executor, new Callable() { // from class: com.google.android.gms.internal.ads.zzbay
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                Context context2 = context;
                try {
                    return zzfxx.m6773a(context2, context2.getPackageName(), Integer.toString(context2.getPackageManager().getPackageInfo(context2.getPackageName(), 0).versionCode));
                } catch (Throwable unused) {
                    return null;
                }
            }
        });
    }
}
