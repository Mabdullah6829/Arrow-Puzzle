package androidx.privacysandbox.ads.adservices.measurement;

import android.app.NotificationChannel;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;

/* JADX INFO: renamed from: androidx.privacysandbox.ads.adservices.measurement.a */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1631a {
    /* JADX INFO: renamed from: C */
    public static /* synthetic */ void m2585C() {
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ NotificationChannel m2589c(int i2) {
        return new NotificationChannel("offline_notification_channel", "AdMob Offline Notifications", i2);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ NotificationChannel m2591e(String str) {
        return new NotificationChannel("com.google.android.gms.availability", str, 4);
    }

    /* JADX INFO: renamed from: g */
    public static /* bridge */ /* synthetic */ AutofillId m2593g(Object obj) {
        return (AutofillId) obj;
    }

    /* JADX INFO: renamed from: h */
    public static /* bridge */ /* synthetic */ AutofillManager m2594h(Object obj) {
        return (AutofillManager) obj;
    }

    /* JADX INFO: renamed from: m */
    public static /* bridge */ /* synthetic */ Class m2599m() {
        return AutofillManager.class;
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m2601o() {
    }
}
