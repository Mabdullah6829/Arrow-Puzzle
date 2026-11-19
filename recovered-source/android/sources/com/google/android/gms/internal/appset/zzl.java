package com.google.android.gms.internal.appset;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.google.android.gms.appset.AppSetIdClient;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class zzl implements AppSetIdClient {

    /* JADX INFO: renamed from: d */
    public static zzl f21534d;

    /* JADX INFO: renamed from: a */
    public final Context f21535a;

    /* JADX INFO: renamed from: b */
    public final ScheduledExecutorService f21536b;

    /* JADX INFO: renamed from: c */
    public final ExecutorService f21537c;

    public zzl(Context context) {
        ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        this.f21536b = scheduledExecutorServiceNewSingleThreadScheduledExecutor;
        this.f21537c = Executors.newSingleThreadExecutor();
        this.f21535a = context;
        scheduledExecutorServiceNewSingleThreadScheduledExecutor.scheduleAtFixedRate(new zzj(this), 0L, 86400L, TimeUnit.SECONDS);
    }

    /* JADX INFO: renamed from: b */
    public static final SharedPreferences m9073b(Context context) {
        return context.getSharedPreferences("app_set_id_storage", 0);
    }

    /* JADX INFO: renamed from: c */
    public static final void m9074c(Context context) throws zzk {
        SharedPreferences sharedPreferencesM9073b = m9073b(context);
        DefaultClock.f4636a.getClass();
        if (sharedPreferencesM9073b.edit().putLong("app_set_id_last_used_time", System.currentTimeMillis()).commit()) {
            return;
        }
        String strValueOf = String.valueOf(context.getPackageName());
        Log.e("AppSet", strValueOf.length() != 0 ? "Failed to store app set ID last used time for App ".concat(strValueOf) : new String("Failed to store app set ID last used time for App "));
        throw new zzk("Failed to store the app set ID last used time.");
    }

    @Override // com.google.android.gms.appset.AppSetIdClient
    /* JADX INFO: renamed from: a */
    public final Task mo3367a() {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f21537c.execute(new Runnable() { // from class: com.google.android.gms.internal.appset.zzh
            /* JADX WARN: Code duplicated, block: B:14:0x0045  */
            /* JADX WARN: Code duplicated, block: B:18:0x0062 A[Catch: zzk -> 0x0077, TRY_ENTER, TryCatch #1 {zzk -> 0x0077, blocks: (B:15:0x004e, B:18:0x0062, B:20:0x0072, B:24:0x007f, B:25:0x0089, B:23:0x0079, B:26:0x008a, B:28:0x00aa, B:30:0x00ba, B:32:0x00c5, B:33:0x00cf, B:31:0x00bf), top: B:40:0x004e }] */
            /* JADX WARN: Code duplicated, block: B:20:0x0072 A[Catch: zzk -> 0x0077, TryCatch #1 {zzk -> 0x0077, blocks: (B:15:0x004e, B:18:0x0062, B:20:0x0072, B:24:0x007f, B:25:0x0089, B:23:0x0079, B:26:0x008a, B:28:0x00aa, B:30:0x00ba, B:32:0x00c5, B:33:0x00cf, B:31:0x00bf), top: B:40:0x004e }] */
            /* JADX WARN: Code duplicated, block: B:23:0x0079 A[Catch: zzk -> 0x0077, TryCatch #1 {zzk -> 0x0077, blocks: (B:15:0x004e, B:18:0x0062, B:20:0x0072, B:24:0x007f, B:25:0x0089, B:23:0x0079, B:26:0x008a, B:28:0x00aa, B:30:0x00ba, B:32:0x00c5, B:33:0x00cf, B:31:0x00bf), top: B:40:0x004e }] */
            /* JADX WARN: Code duplicated, block: B:26:0x008a A[Catch: zzk -> 0x0077, TryCatch #1 {zzk -> 0x0077, blocks: (B:15:0x004e, B:18:0x0062, B:20:0x0072, B:24:0x007f, B:25:0x0089, B:23:0x0079, B:26:0x008a, B:28:0x00aa, B:30:0x00ba, B:32:0x00c5, B:33:0x00cf, B:31:0x00bf), top: B:40:0x004e }] */
            /* JADX WARN: Code duplicated, block: B:28:0x00aa A[Catch: zzk -> 0x0077, TryCatch #1 {zzk -> 0x0077, blocks: (B:15:0x004e, B:18:0x0062, B:20:0x0072, B:24:0x007f, B:25:0x0089, B:23:0x0079, B:26:0x008a, B:28:0x00aa, B:30:0x00ba, B:32:0x00c5, B:33:0x00cf, B:31:0x00bf), top: B:40:0x004e }] */
            /* JADX WARN: Code duplicated, block: B:30:0x00ba A[Catch: zzk -> 0x0077, TryCatch #1 {zzk -> 0x0077, blocks: (B:15:0x004e, B:18:0x0062, B:20:0x0072, B:24:0x007f, B:25:0x0089, B:23:0x0079, B:26:0x008a, B:28:0x00aa, B:30:0x00ba, B:32:0x00c5, B:33:0x00cf, B:31:0x00bf), top: B:40:0x004e }] */
            /* JADX WARN: Code duplicated, block: B:31:0x00bf A[Catch: zzk -> 0x0077, TryCatch #1 {zzk -> 0x0077, blocks: (B:15:0x004e, B:18:0x0062, B:20:0x0072, B:24:0x007f, B:25:0x0089, B:23:0x0079, B:26:0x008a, B:28:0x00aa, B:30:0x00ba, B:32:0x00c5, B:33:0x00cf, B:31:0x00bf), top: B:40:0x004e }] */
            @Override // java.lang.Runnable
            public final void run() {
                SharedPreferences sharedPreferences;
                String strValueOf;
                String str;
                String strValueOf2;
                String str2;
                Context context = this.f21531s.f21535a;
                String string = zzl.m9073b(context).getString("app_set_id", null);
                long j2 = zzl.m9073b(context).getLong("app_set_id_last_used_time", -1L);
                long j3 = j2 != -1 ? j2 + 33696000000L : -1L;
                TaskCompletionSource taskCompletionSource2 = taskCompletionSource;
                if (string != null) {
                    DefaultClock.f4636a.getClass();
                    if (System.currentTimeMillis() > j3) {
                        string = UUID.randomUUID().toString();
                        try {
                            if (!context.getSharedPreferences("app_set_id_storage", 0).edit().putString("app_set_id", string).commit()) {
                                strValueOf2 = String.valueOf(context.getPackageName());
                                if (strValueOf2.length() != 0) {
                                    str2 = "Failed to store app set ID generated for App ".concat(strValueOf2);
                                } else {
                                    str2 = new String("Failed to store app set ID generated for App ");
                                }
                                Log.e("AppSet", str2);
                                throw new zzk("Failed to store the app set ID.");
                            }
                            zzl.m9074c(context);
                            sharedPreferences = context.getSharedPreferences("app_set_id_storage", 0);
                            DefaultClock.f4636a.getClass();
                            if (!sharedPreferences.edit().putLong("app_set_id_creation_time", System.currentTimeMillis()).commit()) {
                                strValueOf = String.valueOf(context.getPackageName());
                                if (strValueOf.length() != 0) {
                                    str = "Failed to store app set ID creation time for App ".concat(strValueOf);
                                } else {
                                    str = new String("Failed to store app set ID creation time for App ");
                                }
                                Log.e("AppSet", str);
                                throw new zzk("Failed to store the app set ID creation time.");
                            }
                        } catch (zzk e) {
                            taskCompletionSource2.m10767a(e);
                            return;
                        }
                    } else {
                        try {
                            zzl.m9074c(context);
                        } catch (zzk e2) {
                            taskCompletionSource2.m10767a(e2);
                            return;
                        }
                    }
                } else {
                    string = UUID.randomUUID().toString();
                    if (!context.getSharedPreferences("app_set_id_storage", 0).edit().putString("app_set_id", string).commit()) {
                        strValueOf2 = String.valueOf(context.getPackageName());
                        if (strValueOf2.length() != 0) {
                            str2 = "Failed to store app set ID generated for App ".concat(strValueOf2);
                        } else {
                            str2 = new String("Failed to store app set ID generated for App ");
                        }
                        Log.e("AppSet", str2);
                        throw new zzk("Failed to store the app set ID.");
                    }
                    zzl.m9074c(context);
                    sharedPreferences = context.getSharedPreferences("app_set_id_storage", 0);
                    DefaultClock.f4636a.getClass();
                    if (!sharedPreferences.edit().putLong("app_set_id_creation_time", System.currentTimeMillis()).commit()) {
                        strValueOf = String.valueOf(context.getPackageName());
                        if (strValueOf.length() != 0) {
                            str = "Failed to store app set ID creation time for App ".concat(strValueOf);
                        } else {
                            str = new String("Failed to store app set ID creation time for App ");
                        }
                        Log.e("AppSet", str);
                        throw new zzk("Failed to store the app set ID creation time.");
                    }
                }
                taskCompletionSource2.m10768b(new AppSetIdInfo(string, 1));
            }
        });
        return taskCompletionSource.f23216a;
    }
}
