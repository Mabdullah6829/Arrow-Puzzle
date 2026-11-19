package android.support.v4.app;

import android.app.Notification;
import android.os.IInterface;

/* JADX INFO: renamed from: android.support.v4.app.c */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC0924c extends IInterface {

    /* JADX INFO: renamed from: h */
    public static final String f2557h = "android$support$v4$app$INotificationSideChannel".replace('$', '.');

    void cancel(String str, int i2, String str2);

    void cancelAll(String str);

    void notify(String str, int i2, String str2, Notification notification);
}
