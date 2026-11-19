package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import androidx.datastore.preferences.protobuf.AbstractC1456a;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public abstract class BasePendingResult<R extends Result> extends PendingResult<R> {

    /* JADX INFO: renamed from: k */
    public static final ThreadLocal f4224k = new zaq();

    /* JADX INFO: renamed from: e */
    public ResultCallback f4229e;

    /* JADX INFO: renamed from: g */
    public Result f4231g;

    /* JADX INFO: renamed from: h */
    public Status f4232h;

    /* JADX INFO: renamed from: i */
    public volatile boolean f4233i;

    /* JADX INFO: renamed from: j */
    public boolean f4234j;
    private zar resultGuardian;

    /* JADX INFO: renamed from: a */
    public final Object f4225a = new Object();

    /* JADX INFO: renamed from: c */
    public final CountDownLatch f4227c = new CountDownLatch(1);

    /* JADX INFO: renamed from: d */
    public final ArrayList f4228d = new ArrayList();

    /* JADX INFO: renamed from: f */
    public final AtomicReference f4230f = new AtomicReference();

    /* JADX INFO: renamed from: b */
    public final CallbackHandler f4226b = new CallbackHandler(Looper.getMainLooper());

    public static class CallbackHandler<R extends Result> extends com.google.android.gms.internal.base.zao {
        public CallbackHandler() {
            super(Looper.getMainLooper());
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            int i2 = message.what;
            if (i2 != 1) {
                if (i2 != 2) {
                    Log.wtf("BasePendingResult", AbstractC1456a.m2447n(new StringBuilder(String.valueOf(i2).length() + 34), "Don't know how to handle message: ", i2), new Exception());
                    return;
                } else {
                    ((BasePendingResult) message.obj).m3451b(Status.f4208x);
                    return;
                }
            }
            Pair pair = (Pair) message.obj;
            ResultCallback resultCallback = (ResultCallback) pair.first;
            Result result = (Result) pair.second;
            try {
                resultCallback.mo3431a(result);
            } catch (RuntimeException e) {
                BasePendingResult.m3450f(result);
                throw e;
            }
        }
    }

    @Deprecated
    public BasePendingResult() {
        new WeakReference(null);
    }

    /* JADX INFO: renamed from: f */
    public static void m3450f(Result result) {
        if (result instanceof Releasable) {
            try {
                ((Releasable) result).release();
            } catch (RuntimeException e) {
                Log.w("BasePendingResult", "Unable to release ".concat(String.valueOf(result)), e);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract Result mo3423a(Status status);

    /* JADX INFO: renamed from: b */
    public final void m3451b(Status status) {
        synchronized (this.f4225a) {
            try {
                if (!m3452c()) {
                    m3453d(mo3423a(status));
                    this.f4234j = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m3452c() {
        return this.f4227c.getCount() == 0;
    }

    /* JADX INFO: renamed from: d */
    public final void m3453d(Result result) {
        synchronized (this.f4225a) {
            try {
                if (this.f4234j) {
                    m3450f(result);
                    return;
                }
                m3452c();
                Preconditions.m3547k(!m3452c(), "Results have already been set");
                Preconditions.m3547k(!this.f4233i, "Result has already been consumed");
                m3454e(result);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m3454e(Result result) {
        Result result2;
        this.f4231g = result;
        this.f4232h = result.mo3424n();
        this.f4227c.countDown();
        ResultCallback resultCallback = this.f4229e;
        if (resultCallback != null) {
            CallbackHandler callbackHandler = this.f4226b;
            callbackHandler.removeMessages(2);
            synchronized (this.f4225a) {
                Preconditions.m3547k(!this.f4233i, "Result has already been consumed.");
                Preconditions.m3547k(m3452c(), "Result is not ready.");
                result2 = this.f4231g;
                this.f4231g = null;
                this.f4229e = null;
                this.f4233i = true;
            }
            if (((zact) this.f4230f.getAndSet(null)) != null) {
                throw null;
            }
            Preconditions.m3544h(result2);
            callbackHandler.sendMessage(callbackHandler.obtainMessage(1, new Pair(resultCallback, result2)));
        } else if (this.f4231g instanceof Releasable) {
            this.resultGuardian = new zar(this);
        }
        ArrayList arrayList = this.f4228d;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((PendingResult.StatusListener) arrayList.get(i2)).mo3428a(this.f4232h);
        }
        arrayList.clear();
    }
}
