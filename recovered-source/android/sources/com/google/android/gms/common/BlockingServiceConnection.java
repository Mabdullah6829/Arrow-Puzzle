package com.google.android.gms.common;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import androidx.work.WorkRequest;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
public class BlockingServiceConnection implements ServiceConnection {

    /* JADX INFO: renamed from: s */
    public boolean f4138s = false;

    /* JADX INFO: renamed from: t */
    public final LinkedBlockingQueue f4139t = new LinkedBlockingQueue();

    /* JADX INFO: renamed from: a */
    public final IBinder m3391a() throws TimeoutException {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        Preconditions.m3543g("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (this.f4138s) {
            throw new IllegalStateException("Cannot call get on this connection more than once");
        }
        this.f4138s = true;
        IBinder iBinder = (IBinder) this.f4139t.poll(WorkRequest.MIN_BACKOFF_MILLIS, timeUnit);
        if (iBinder != null) {
            return iBinder;
        }
        throw new TimeoutException("Timed out waiting for the service connection");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f4139t.add(iBinder);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
