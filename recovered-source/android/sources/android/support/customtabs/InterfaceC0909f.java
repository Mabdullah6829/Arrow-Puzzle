package android.support.customtabs;

import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import java.util.List;

/* JADX INFO: renamed from: android.support.customtabs.f */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC0909f extends IInterface {

    /* JADX INFO: renamed from: c */
    public static final String f2547c = "android$support$customtabs$ICustomTabsService".replace('$', '.');

    Bundle extraCommand(String str, Bundle bundle);

    boolean isEngagementSignalsApiAvailable(InterfaceC0906c interfaceC0906c, Bundle bundle);

    boolean mayLaunchUrl(InterfaceC0906c interfaceC0906c, Uri uri, Bundle bundle, List list);

    boolean newSession(InterfaceC0906c interfaceC0906c);

    boolean newSessionWithExtras(InterfaceC0906c interfaceC0906c, Bundle bundle);

    int postMessage(InterfaceC0906c interfaceC0906c, String str, Bundle bundle);

    boolean receiveFile(InterfaceC0906c interfaceC0906c, Uri uri, int i2, Bundle bundle);

    boolean requestPostMessageChannel(InterfaceC0906c interfaceC0906c, Uri uri);

    boolean requestPostMessageChannelWithExtras(InterfaceC0906c interfaceC0906c, Uri uri, Bundle bundle);

    boolean setEngagementSignalsCallback(InterfaceC0906c interfaceC0906c, IBinder iBinder, Bundle bundle);

    boolean updateVisuals(InterfaceC0906c interfaceC0906c, Bundle bundle);

    boolean validateRelationship(InterfaceC0906c interfaceC0906c, int i2, Uri uri, Bundle bundle);

    boolean warmup(long j2);
}
