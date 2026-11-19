package com.google.android.gms.common.util.concurrent;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public class NumberedThreadFactory implements ThreadFactory {

    /* JADX INFO: renamed from: s */
    public final String f4655s;

    /* JADX INFO: renamed from: t */
    public final AtomicInteger f4656t = new AtomicInteger();

    /* JADX INFO: renamed from: u */
    public final ThreadFactory f4657u = Executors.defaultThreadFactory();

    public NumberedThreadFactory(String str) {
        this.f4655s = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = this.f4657u.newThread(new zza(runnable));
        int andIncrement = this.f4656t.getAndIncrement();
        int length = String.valueOf(andIncrement).length();
        String str = this.f4655s;
        StringBuilder sb = new StringBuilder(str.length() + 1 + length + 1);
        sb.append(str);
        sb.append("[");
        sb.append(andIncrement);
        sb.append("]");
        threadNewThread.setName(sb.toString());
        return threadNewThread;
    }
}
