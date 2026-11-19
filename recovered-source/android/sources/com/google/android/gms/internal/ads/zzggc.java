package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.InputEvent;
import android.view.View;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes2.dex */
public interface zzggc {
    /* JADX INFO: renamed from: a */
    ListenableFuture mo6997a(Context context, View view, Activity activity);

    /* JADX INFO: renamed from: b */
    void mo6998b(InputEvent inputEvent);

    /* JADX INFO: renamed from: c */
    int mo6999c();

    /* JADX INFO: renamed from: d */
    ListenableFuture mo7000d(Context context);

    /* JADX INFO: renamed from: e */
    ListenableFuture mo7001e(Context context, String str, View view);

    String zza();

    ListenableFuture zzb();
}
