package android.support.customtabs;

import android.os.Bundle;
import android.os.IInterface;

/* JADX INFO: renamed from: android.support.customtabs.i */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC0912i extends IInterface {

    /* JADX INFO: renamed from: d */
    public static final String f2549d = "android$support$customtabs$IEngagementSignalsCallback".replace('$', '.');

    void onGreatestScrollPercentageIncreased(int i2, Bundle bundle);

    void onSessionEnded(boolean z, Bundle bundle);

    void onVerticalScrollEvent(boolean z, Bundle bundle);
}
