package android.support.customtabs;

import android.os.Bundle;
import android.os.IInterface;

/* JADX INFO: renamed from: android.support.customtabs.l */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC0915l extends IInterface {

    /* JADX INFO: renamed from: e */
    public static final String f2551e = "android$support$customtabs$IPostMessageService".replace('$', '.');

    void onMessageChannelReady(InterfaceC0906c interfaceC0906c, Bundle bundle);

    void onPostMessage(InterfaceC0906c interfaceC0906c, String str, Bundle bundle);
}
