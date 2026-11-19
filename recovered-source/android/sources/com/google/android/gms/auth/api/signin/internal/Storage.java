package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes.dex */
public class Storage {

    /* JADX INFO: renamed from: c */
    public static final ReentrantLock f4072c = new ReentrantLock();

    /* JADX INFO: renamed from: d */
    public static Storage f4073d;

    /* JADX INFO: renamed from: a */
    public final ReentrantLock f4074a = new ReentrantLock();

    /* JADX INFO: renamed from: b */
    public final SharedPreferences f4075b;

    public Storage(Context context) {
        this.f4075b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    /* JADX INFO: renamed from: a */
    public static Storage m3372a(Context context) {
        Preconditions.m3544h(context);
        ReentrantLock reentrantLock = f4072c;
        reentrantLock.lock();
        try {
            if (f4073d == null) {
                f4073d = new Storage(context.getApplicationContext());
            }
            return f4073d;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: b */
    public final String m3373b(String str) {
        ReentrantLock reentrantLock = this.f4074a;
        reentrantLock.lock();
        try {
            return this.f4075b.getString(str, null);
        } finally {
            reentrantLock.unlock();
        }
    }
}
