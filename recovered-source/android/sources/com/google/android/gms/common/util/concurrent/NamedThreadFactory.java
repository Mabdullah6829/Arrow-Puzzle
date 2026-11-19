package com.google.android.gms.common.util.concurrent;

import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes.dex */
public class NamedThreadFactory implements ThreadFactory {

    /* JADX INFO: renamed from: s */
    public final String f4653s;

    /* JADX INFO: renamed from: t */
    public final ThreadFactory f4654t = Executors.defaultThreadFactory();

    public NamedThreadFactory(String str) {
        Preconditions.m3545i(str, "Name must not be null");
        this.f4653s = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = this.f4654t.newThread(new zza(runnable));
        threadNewThread.setName(this.f4653s);
        return threadNewThread;
    }
}
