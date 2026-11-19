package com.google.android.gms.ads.internal.util.client;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class zzb {

    /* JADX INFO: renamed from: a */
    public static final ThreadPoolExecutor f3403a = new ThreadPoolExecutor(2, Integer.MAX_VALUE, 10, TimeUnit.SECONDS, new SynchronousQueue(), new zza("ClientDefault"));

    /* JADX INFO: renamed from: b */
    public static final ExecutorService f3404b = Executors.newSingleThreadExecutor(new zza("ClientSingle"));
}
