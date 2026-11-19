package com.google.android.gms.tasks;

import android.app.Activity;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes2.dex */
public final class zzw<TResult> extends Task<TResult> {

    /* JADX INFO: renamed from: a */
    public final Object f23270a = new Object();

    /* JADX INFO: renamed from: b */
    public final zzr f23271b = new zzr();

    /* JADX INFO: renamed from: c */
    public boolean f23272c;

    /* JADX INFO: renamed from: d */
    public volatile boolean f23273d;

    /* JADX INFO: renamed from: e */
    public Object f23274e;

    /* JADX INFO: renamed from: f */
    public Exception f23275f;

    /* JADX INFO: renamed from: a */
    public final void m10785a(Object obj) {
        synchronized (this.f23270a) {
            m10789e();
            this.f23272c = true;
            this.f23274e = obj;
        }
        this.f23271b.m10782b(this);
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task addOnCanceledListener(Activity activity, OnCanceledListener onCanceledListener) {
        zzh zzhVar = new zzh(TaskExecutors.f23217a, onCanceledListener);
        this.f23271b.m10781a(zzhVar);
        zzv.m10783k(activity).m10784l(zzhVar);
        m10790f();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task addOnCompleteListener(Activity activity, OnCompleteListener onCompleteListener) {
        zzj zzjVar = new zzj(TaskExecutors.f23217a, onCompleteListener);
        this.f23271b.m10781a(zzjVar);
        zzv.m10783k(activity).m10784l(zzjVar);
        m10790f();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task addOnFailureListener(Activity activity, OnFailureListener onFailureListener) {
        zzl zzlVar = new zzl(TaskExecutors.f23217a, onFailureListener);
        this.f23271b.m10781a(zzlVar);
        zzv.m10783k(activity).m10784l(zzlVar);
        m10790f();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task addOnSuccessListener(Activity activity, OnSuccessListener onSuccessListener) {
        zzn zznVar = new zzn(TaskExecutors.f23217a, onSuccessListener);
        this.f23271b.m10781a(zznVar);
        zzv.m10783k(activity).m10784l(zznVar);
        m10790f();
        return this;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m10786b(Object obj) {
        synchronized (this.f23270a) {
            try {
                if (this.f23272c) {
                    return false;
                }
                this.f23272c = true;
                this.f23274e = obj;
                this.f23271b.m10782b(this);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m10787c(Exception exc) {
        Preconditions.m3545i(exc, "Exception must not be null");
        synchronized (this.f23270a) {
            m10789e();
            this.f23272c = true;
            this.f23275f = exc;
        }
        this.f23271b.m10782b(this);
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task continueWith(Continuation continuation) {
        return continueWith(TaskExecutors.f23217a, continuation);
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task continueWithTask(Continuation continuation) {
        return continueWithTask(TaskExecutors.f23217a, continuation);
    }

    /* JADX INFO: renamed from: d */
    public final void m10788d() {
        synchronized (this.f23270a) {
            try {
                if (this.f23272c) {
                    return;
                }
                this.f23272c = true;
                this.f23273d = true;
                this.f23271b.m10782b(this);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m10789e() {
        String strConcat;
        if (this.f23272c) {
            int i2 = DuplicateTaskCompletionException.f23215s;
            if (!isComplete()) {
                throw new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
            }
            Exception exception = getException();
            if (exception != null) {
                strConcat = "failure";
            } else if (isSuccessful()) {
                strConcat = "result ".concat(String.valueOf(getResult()));
            } else {
                strConcat = this.f23273d ? "cancellation" : "unknown issue";
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m10790f() {
        synchronized (this.f23270a) {
            try {
                if (this.f23272c) {
                    this.f23271b.m10782b(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.tasks.Task
    public final Exception getException() {
        Exception exc;
        synchronized (this.f23270a) {
            exc = this.f23275f;
        }
        return exc;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Object getResult() {
        Object obj;
        synchronized (this.f23270a) {
            try {
                Preconditions.m3547k(this.f23272c, "Task is not yet complete");
                if (this.f23273d) {
                    throw new CancellationException("Task is already canceled.");
                }
                Exception exc = this.f23275f;
                if (exc != null) {
                    throw new RuntimeExecutionException(exc);
                }
                obj = this.f23274e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    @Override // com.google.android.gms.tasks.Task
    public final boolean isCanceled() {
        return this.f23273d;
    }

    @Override // com.google.android.gms.tasks.Task
    public final boolean isComplete() {
        boolean z;
        synchronized (this.f23270a) {
            z = this.f23272c;
        }
        return z;
    }

    @Override // com.google.android.gms.tasks.Task
    public final boolean isSuccessful() {
        boolean z;
        synchronized (this.f23270a) {
            try {
                z = false;
                if (this.f23272c && !this.f23273d && this.f23275f == null) {
                    z = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task onSuccessTask(SuccessContinuation successContinuation) {
        Executor executor = TaskExecutors.f23217a;
        zzw zzwVar = new zzw();
        this.f23271b.m10781a(new zzp(executor, successContinuation, zzwVar));
        m10790f();
        return zzwVar;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task continueWith(Executor executor, Continuation continuation) {
        zzw zzwVar = new zzw();
        this.f23271b.m10781a(new zzd(executor, continuation, zzwVar));
        m10790f();
        return zzwVar;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task continueWithTask(Executor executor, Continuation continuation) {
        zzw zzwVar = new zzw();
        this.f23271b.m10781a(new zzf(executor, continuation, zzwVar));
        m10790f();
        return zzwVar;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task addOnCanceledListener(OnCanceledListener onCanceledListener) {
        addOnCanceledListener(TaskExecutors.f23217a, onCanceledListener);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task addOnCompleteListener(OnCompleteListener onCompleteListener) {
        this.f23271b.m10781a(new zzj(TaskExecutors.f23217a, onCompleteListener));
        m10790f();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task addOnFailureListener(OnFailureListener onFailureListener) {
        addOnFailureListener(TaskExecutors.f23217a, onFailureListener);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task addOnSuccessListener(OnSuccessListener onSuccessListener) {
        addOnSuccessListener(TaskExecutors.f23217a, onSuccessListener);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task onSuccessTask(Executor executor, SuccessContinuation successContinuation) {
        zzw zzwVar = new zzw();
        this.f23271b.m10781a(new zzp(executor, successContinuation, zzwVar));
        m10790f();
        return zzwVar;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task addOnCanceledListener(Executor executor, OnCanceledListener onCanceledListener) {
        this.f23271b.m10781a(new zzh(executor, onCanceledListener));
        m10790f();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task addOnFailureListener(Executor executor, OnFailureListener onFailureListener) {
        this.f23271b.m10781a(new zzl(executor, onFailureListener));
        m10790f();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task addOnSuccessListener(Executor executor, OnSuccessListener onSuccessListener) {
        this.f23271b.m10781a(new zzn(executor, onSuccessListener));
        m10790f();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task addOnCompleteListener(Executor executor, OnCompleteListener onCompleteListener) {
        this.f23271b.m10781a(new zzj(executor, onCompleteListener));
        m10790f();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Object getResult(Class cls) {
        Object obj;
        synchronized (this.f23270a) {
            try {
                Preconditions.m3547k(this.f23272c, "Task is not yet complete");
                if (!this.f23273d) {
                    if (!cls.isInstance(this.f23275f)) {
                        Exception exc = this.f23275f;
                        if (exc == null) {
                            obj = this.f23274e;
                        } else {
                            throw new RuntimeExecutionException(exc);
                        }
                    } else {
                        throw ((Throwable) cls.cast(this.f23275f));
                    }
                } else {
                    throw new CancellationException("Task is already canceled.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }
}
