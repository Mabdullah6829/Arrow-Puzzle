package p033S0;

import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.job.JobWorkItem;
import android.content.Intent;

/* JADX INFO: renamed from: S0.r */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0624r {
    /* JADX INFO: renamed from: i */
    public static /* bridge */ /* synthetic */ NotificationChannel m1432i(Object obj) {
        return (NotificationChannel) obj;
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ NotificationChannel m1433j(String str, String str2) {
        return new NotificationChannel(str, str2, 3);
    }

    /* JADX INFO: renamed from: k */
    public static /* bridge */ /* synthetic */ NotificationChannelGroup m1434k(Object obj) {
        return (NotificationChannelGroup) obj;
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ JobWorkItem m1436m(Intent intent) {
        return new JobWorkItem(intent);
    }
}
