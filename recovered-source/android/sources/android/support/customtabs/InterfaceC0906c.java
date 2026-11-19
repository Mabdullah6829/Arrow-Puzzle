package android.support.customtabs;

import android.net.Uri;
import android.os.Bundle;
import android.os.IInterface;

/* JADX INFO: renamed from: android.support.customtabs.c */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC0906c extends IInterface {

    /* JADX INFO: renamed from: b */
    public static final String f2545b = "android$support$customtabs$ICustomTabsCallback".replace('$', '.');

    void extraCallback(String str, Bundle bundle);

    Bundle extraCallbackWithResult(String str, Bundle bundle);

    void onActivityLayout(int i2, int i3, int i4, int i5, int i6, Bundle bundle);

    void onActivityResized(int i2, int i3, Bundle bundle);

    void onMessageChannelReady(Bundle bundle);

    void onMinimized(Bundle bundle);

    void onNavigationEvent(int i2, Bundle bundle);

    void onPostMessage(String str, Bundle bundle);

    void onRelationshipValidationResult(int i2, Uri uri, boolean z, Bundle bundle);

    void onUnminimized(Bundle bundle);

    void onWarmupCompleted(Bundle bundle);
}
