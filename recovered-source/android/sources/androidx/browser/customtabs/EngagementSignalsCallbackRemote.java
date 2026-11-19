package androidx.browser.customtabs;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.customtabs.AbstractBinderC0911h;
import android.support.customtabs.InterfaceC0912i;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
final class EngagementSignalsCallbackRemote implements EngagementSignalsCallback {
    private static final String TAG = "EngagementSigsCallbkRmt";
    private final InterfaceC0912i mCallbackBinder;

    private EngagementSignalsCallbackRemote(InterfaceC0912i interfaceC0912i) {
        this.mCallbackBinder = interfaceC0912i;
    }

    public static EngagementSignalsCallbackRemote fromBinder(IBinder iBinder) {
        return new EngagementSignalsCallbackRemote(AbstractBinderC0911h.asInterface(iBinder));
    }

    @Override // androidx.browser.customtabs.EngagementSignalsCallback
    public void onGreatestScrollPercentageIncreased(int i2, Bundle bundle) {
        try {
            this.mCallbackBinder.onGreatestScrollPercentageIncreased(i2, bundle);
        } catch (RemoteException unused) {
            Log.e(TAG, "RemoteException during IEngagementSignalsCallback transaction");
        }
    }

    @Override // androidx.browser.customtabs.EngagementSignalsCallback
    public void onSessionEnded(boolean z, Bundle bundle) {
        try {
            this.mCallbackBinder.onSessionEnded(z, bundle);
        } catch (RemoteException unused) {
            Log.e(TAG, "RemoteException during IEngagementSignalsCallback transaction");
        }
    }

    @Override // androidx.browser.customtabs.EngagementSignalsCallback
    public void onVerticalScrollEvent(boolean z, Bundle bundle) {
        try {
            this.mCallbackBinder.onVerticalScrollEvent(z, bundle);
        } catch (RemoteException unused) {
            Log.e(TAG, "RemoteException during IEngagementSignalsCallback transaction");
        }
    }
}
