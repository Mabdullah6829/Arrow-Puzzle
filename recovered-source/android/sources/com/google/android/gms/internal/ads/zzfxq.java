package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public class zzfxq {

    /* JADX INFO: renamed from: e */
    public static volatile int f16764e = 1;

    /* JADX INFO: renamed from: a */
    public final Context f16765a;

    /* JADX INFO: renamed from: b */
    public final Executor f16766b;

    /* JADX INFO: renamed from: c */
    public final Task f16767c;

    /* JADX INFO: renamed from: d */
    public final boolean f16768d;

    public zzfxq(Context context, Executor executor, Task task, boolean z) {
        this.f16765a = context;
        this.f16766b = executor;
        this.f16767c = task;
        this.f16768d = z;
    }

    /* JADX INFO: renamed from: a */
    public static zzfxq m6760a(final Context context, Executor executor, boolean z) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        if (z) {
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfxm
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    taskCompletionSource.m10768b(zzfzm.m6822a(context, "GLAS"));
                }
            });
        } else {
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfxo
                @Override // java.lang.Runnable
                public final void run() {
                    zzfzq zzfzqVar = new zzfzq();
                    Log.d("GASS", "Clearcut logging disabled");
                    taskCompletionSource.m10768b(new zzfzm(zzfzqVar));
                }
            });
        }
        return new zzfxq(context, executor, taskCompletionSource.f23216a, z);
    }

    /* JADX INFO: renamed from: b */
    public void mo6761b(int i2, long j2) {
        m6764e(i2, j2, null, null, null);
    }

    /* JADX INFO: renamed from: c */
    public void mo6762c(int i2, long j2, Exception exc) {
        m6764e(i2, j2, exc, null, null);
    }

    /* JADX INFO: renamed from: d */
    public void mo6763d(int i2, String str) {
        m6764e(i2, 0L, null, null, str);
    }

    /* JADX INFO: renamed from: e */
    public final Task m6764e(final int i2, long j2, Exception exc, String str, String str2) {
        if (!this.f16768d) {
            return this.f16767c.continueWith(this.f16766b, new Continuation() { // from class: com.google.android.gms.internal.ads.zzfxp
                @Override // com.google.android.gms.tasks.Continuation
                /* JADX INFO: renamed from: a */
                public final /* synthetic */ Object mo170a(Task task) {
                    return new Boolean(task.isSuccessful());
                }
            });
        }
        Context context = this.f16765a;
        final zzawz zzawzVarM4510D = zzaxd.m4510D();
        String packageName = context.getPackageName();
        zzawzVarM4510D.m8326l();
        ((zzaxd) zzawzVarM4510D.f19780t).m4511E(packageName);
        zzawzVarM4510D.m8326l();
        ((zzaxd) zzawzVarM4510D.f19780t).m4512F(j2);
        int i3 = f16764e;
        zzawzVarM4510D.m8326l();
        ((zzaxd) zzawzVarM4510D.f19780t).m4517K(i3);
        if (exc != null) {
            Object obj = zzgun.f18209a;
            StringWriter stringWriter = new StringWriter();
            exc.printStackTrace(new PrintWriter(stringWriter));
            String string = stringWriter.toString();
            zzawzVarM4510D.m8326l();
            ((zzaxd) zzawzVarM4510D.f19780t).m4513G(string);
            String name = exc.getClass().getName();
            zzawzVarM4510D.m8326l();
            ((zzaxd) zzawzVarM4510D.f19780t).m4514H(name);
        }
        if (str2 != null) {
            zzawzVarM4510D.m8326l();
            ((zzaxd) zzawzVarM4510D.f19780t).m4515I(str2);
        }
        if (str != null) {
            zzawzVarM4510D.m8326l();
            ((zzaxd) zzawzVarM4510D.f19780t).m4516J(str);
        }
        return this.f16767c.continueWith(this.f16766b, new Continuation() { // from class: com.google.android.gms.internal.ads.zzfxn
            @Override // com.google.android.gms.tasks.Continuation
            /* JADX INFO: renamed from: a */
            public final Object mo170a(Task task) {
                if (!task.isSuccessful()) {
                    return Boolean.FALSE;
                }
                zzfzm zzfzmVar = (zzfzm) task.getResult();
                byte[] bArrM8099h = ((zzaxd) zzawzVarM4510D.m8328o()).m8099h();
                zzfzmVar.getClass();
                zzfzl zzfzlVar = new zzfzl(zzfzmVar, bArrM8099h);
                zzfzlVar.f16861c = i2;
                zzfzlVar.m6821a();
                return Boolean.TRUE;
            }
        });
    }
}
