package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfxf {

    /* JADX INFO: renamed from: b */
    public final ArrayDeque f16752b = new ArrayDeque();

    /* JADX INFO: renamed from: c */
    public zzfxe f16753c = null;

    /* JADX INFO: renamed from: a */
    public final ThreadPoolExecutor f16751a = new ThreadPoolExecutor(1, 1, 1, TimeUnit.SECONDS, new LinkedBlockingQueue());
}
