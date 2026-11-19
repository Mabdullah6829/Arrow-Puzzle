package com.google.android.gms.tasks;

import android.os.Looper;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes2.dex */
public final class Tasks {
    private Tasks() {
    }

    /* JADX INFO: renamed from: a */
    public static Object m10771a(Task task) {
        Preconditions.m3543g("Must not be called on the main application thread");
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != null && Objects.equals(looperMyLooper.getThread().getName(), "GoogleApiHandler")) {
            throw new IllegalStateException("Must not be called on GoogleApiHandler thread.");
        }
        Preconditions.m3545i(task, "Task must not be null");
        if (task.isComplete()) {
            return m10778h(task);
        }
        zzaa zzaaVar = new zzaa(0);
        Executor executor = TaskExecutors.f23218b;
        task.addOnSuccessListener(executor, zzaaVar);
        task.addOnFailureListener(executor, zzaaVar);
        task.addOnCanceledListener(executor, zzaaVar);
        zzaaVar.f23220s.await();
        return m10778h(task);
    }

    /* JADX INFO: renamed from: b */
    public static Object m10772b(Task task, long j2, TimeUnit timeUnit) {
        Preconditions.m3543g("Must not be called on the main application thread");
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != null && Objects.equals(looperMyLooper.getThread().getName(), "GoogleApiHandler")) {
            throw new IllegalStateException("Must not be called on GoogleApiHandler thread.");
        }
        Preconditions.m3545i(task, "Task must not be null");
        Preconditions.m3545i(timeUnit, "TimeUnit must not be null");
        if (task.isComplete()) {
            return m10778h(task);
        }
        zzaa zzaaVar = new zzaa(0);
        Executor executor = TaskExecutors.f23218b;
        task.addOnSuccessListener(executor, zzaaVar);
        task.addOnFailureListener(executor, zzaaVar);
        task.addOnCanceledListener(executor, zzaaVar);
        if (zzaaVar.f23220s.await(j2, timeUnit)) {
            return m10778h(task);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    /* JADX INFO: renamed from: c */
    public static Task m10773c(Executor executor, Callable callable) {
        Preconditions.m3545i(executor, "Executor must not be null");
        zzw zzwVar = new zzw();
        executor.execute(new zzx(zzwVar, callable));
        return zzwVar;
    }

    /* JADX INFO: renamed from: d */
    public static Task m10774d() {
        zzw zzwVar = new zzw();
        zzwVar.m10788d();
        return zzwVar;
    }

    /* JADX INFO: renamed from: e */
    public static Task m10775e(Exception exc) {
        zzw zzwVar = new zzw();
        zzwVar.m10787c(exc);
        return zzwVar;
    }

    /* JADX INFO: renamed from: f */
    public static Task m10776f(Object obj) {
        zzw zzwVar = new zzw();
        zzwVar.m10785a(obj);
        return zzwVar;
    }

    /* JADX INFO: renamed from: g */
    public static Task m10777g(List list) {
        if (list == null || list.isEmpty()) {
            return m10776f(null);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((Task) it.next()) == null) {
                throw new NullPointerException("null tasks are not accepted");
            }
        }
        zzw zzwVar = new zzw();
        zzae zzaeVar = new zzae(list.size(), zzwVar);
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            Task task = (Task) it2.next();
            Executor executor = TaskExecutors.f23218b;
            task.addOnSuccessListener(executor, zzaeVar);
            task.addOnFailureListener(executor, zzaeVar);
            task.addOnCanceledListener(executor, zzaeVar);
        }
        return zzwVar;
    }

    /* JADX INFO: renamed from: h */
    public static Object m10778h(Task task) throws ExecutionException {
        if (task.isSuccessful()) {
            return task.getResult();
        }
        if (task.isCanceled()) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(task.getException());
    }
}
