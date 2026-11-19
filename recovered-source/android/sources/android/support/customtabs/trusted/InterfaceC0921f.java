package android.support.customtabs.trusted;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: renamed from: android.support.customtabs.trusted.f */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC0921f extends IInterface {

    /* JADX INFO: renamed from: g */
    public static final String f2555g = "android$support$customtabs$trusted$ITrustedWebActivityService".replace('$', '.');

    Bundle areNotificationsEnabled(Bundle bundle);

    void cancelNotification(Bundle bundle);

    Bundle extraCommand(String str, Bundle bundle, IBinder iBinder);

    Bundle getActiveNotifications();

    Bundle getSmallIconBitmap();

    int getSmallIconId();

    Bundle notifyNotificationWithChannel(Bundle bundle);
}
