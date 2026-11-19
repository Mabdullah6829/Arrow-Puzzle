package com.google.android.gms.cloudmessaging;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import androidx.collection.SimpleArrayMap;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.IOException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public class Rpc {

    /* JADX INFO: renamed from: h */
    public static int f4077h;

    /* JADX INFO: renamed from: i */
    public static PendingIntent f4078i;

    /* JADX INFO: renamed from: j */
    public static final zzy f4079j = zzy.f4135s;

    /* JADX INFO: renamed from: k */
    public static final Pattern f4080k = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");

    /* JADX INFO: renamed from: b */
    public final Context f4082b;

    /* JADX INFO: renamed from: c */
    public final zzw f4083c;

    /* JADX INFO: renamed from: d */
    public final ScheduledThreadPoolExecutor f4084d;

    /* JADX INFO: renamed from: f */
    public Messenger f4086f;

    /* JADX INFO: renamed from: g */
    public zzd f4087g;

    /* JADX INFO: renamed from: a */
    public final SimpleArrayMap f4081a = new SimpleArrayMap();

    /* JADX INFO: renamed from: e */
    public final Messenger f4085e = new Messenger(new zzae(this, Looper.getMainLooper()));

    public Rpc(Context context) {
        this.f4082b = context;
        this.f4083c = new zzw(context);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(60L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f4084d = scheduledThreadPoolExecutor;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:42:0x00de  */
    /* JADX INFO: renamed from: a */
    public final Task m3375a(Bundle bundle) {
        final String string;
        synchronized (Rpc.class) {
            int i2 = f4077h;
            f4077h = i2 + 1;
            string = Integer.toString(i2);
        }
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        synchronized (this.f4081a) {
            this.f4081a.put(string, taskCompletionSource);
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        if (this.f4083c.m3390b() == 2) {
            intent.setAction("com.google.iid.TOKEN_REQUEST");
        } else {
            intent.setAction("com.google.android.c2dm.intent.REGISTER");
        }
        intent.putExtras(bundle);
        Context context = this.f4082b;
        synchronized (Rpc.class) {
            try {
                if (f4078i == null) {
                    Intent intent2 = new Intent();
                    intent2.setPackage("com.google.example.invalidpackage");
                    f4078i = PendingIntent.getBroadcast(context, 0, intent2, com.google.android.gms.internal.cloudmessaging.zza.f21564a);
                }
                intent.putExtra("app", f4078i);
            } catch (Throwable th) {
                throw th;
            }
        }
        intent.putExtra("kid", "|ID|" + string + "|");
        if (Log.isLoggable("Rpc", 3)) {
            Log.d("Rpc", "Sending ".concat(String.valueOf(intent.getExtras())));
        }
        intent.putExtra("google.messenger", this.f4085e);
        if (this.f4086f != null || this.f4087g != null) {
            Message messageObtain = Message.obtain();
            messageObtain.obj = intent;
            try {
                Messenger messenger = this.f4086f;
                if (messenger != null) {
                    messenger.send(messageObtain);
                } else {
                    Messenger messenger2 = this.f4087g.f4095s;
                    messenger2.getClass();
                    messenger2.send(messageObtain);
                }
            } catch (RemoteException unused) {
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Messenger failed, fallback to startService");
                }
                if (this.f4083c.m3390b() == 2) {
                    this.f4082b.sendBroadcast(intent);
                } else {
                    this.f4082b.startService(intent);
                }
            }
        } else if (this.f4083c.m3390b() == 2) {
            this.f4082b.sendBroadcast(intent);
        } else {
            this.f4082b.startService(intent);
        }
        final ScheduledFuture<?> scheduledFutureSchedule = this.f4084d.schedule(new Runnable() { // from class: com.google.android.gms.cloudmessaging.zzac
            @Override // java.lang.Runnable
            public final void run() {
                if (taskCompletionSource.m10769c(new IOException("TIMEOUT"))) {
                    Log.w("Rpc", "No response");
                }
            }
        }, 30L, TimeUnit.SECONDS);
        taskCompletionSource.f23216a.addOnCompleteListener(f4079j, new OnCompleteListener() { // from class: com.google.android.gms.cloudmessaging.zzad
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                Rpc rpc = this.f4091s;
                String str = string;
                ScheduledFuture scheduledFuture = scheduledFutureSchedule;
                synchronized (rpc.f4081a) {
                    rpc.f4081a.remove(str);
                }
                scheduledFuture.cancel(false);
            }
        });
        return taskCompletionSource.f23216a;
    }

    /* JADX INFO: renamed from: b */
    public final void m3376b(Bundle bundle, String str) {
        synchronized (this.f4081a) {
            try {
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f4081a.remove(str);
                if (taskCompletionSource != null) {
                    taskCompletionSource.m10768b(bundle);
                    return;
                }
                Log.w("Rpc", "Missing callback for " + str);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
