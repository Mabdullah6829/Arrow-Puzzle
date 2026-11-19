package androidx.browser.customtabs;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import android.support.customtabs.AbstractBinderC0908e;
import android.support.customtabs.AbstractBinderC0911h;
import android.support.customtabs.InterfaceC0906c;
import android.support.customtabs.InterfaceC0909f;
import android.widget.RemoteViews;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class CustomTabsSession {
    private static final String TAG = "CustomTabsSession";
    static final String TARGET_ORIGIN_KEY = "target_origin";
    private final InterfaceC0906c mCallback;
    private final ComponentName mComponentName;
    private final PendingIntent mId;
    private final Object mLock = new Object();
    private final InterfaceC0909f mService;

    /* JADX INFO: renamed from: androidx.browser.customtabs.CustomTabsSession$1 */
    public class BinderC10711 extends AbstractBinderC0911h {
        private final Handler mHandler = new Handler(Looper.getMainLooper());
        final /* synthetic */ EngagementSignalsCallback val$callback;

        public BinderC10711(EngagementSignalsCallback engagementSignalsCallback) {
            this.val$callback = engagementSignalsCallback;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$onGreatestScrollPercentageIncreased$1(EngagementSignalsCallback engagementSignalsCallback, int i2, Bundle bundle) {
            engagementSignalsCallback.onGreatestScrollPercentageIncreased(i2, bundle);
        }

        @Override // android.support.customtabs.InterfaceC0912i
        public void onGreatestScrollPercentageIncreased(int i2, Bundle bundle) {
            this.mHandler.post(new RunnableC1077c(this.val$callback, i2, bundle, 0));
        }

        @Override // android.support.customtabs.InterfaceC0912i
        public void onSessionEnded(boolean z, Bundle bundle) {
            this.mHandler.post(new RunnableC1076b(this.val$callback, z, bundle, 0));
        }

        @Override // android.support.customtabs.InterfaceC0912i
        public void onVerticalScrollEvent(boolean z, Bundle bundle) {
            this.mHandler.post(new RunnableC1076b(this.val$callback, z, bundle, 1));
        }
    }

    /* JADX INFO: renamed from: androidx.browser.customtabs.CustomTabsSession$2 */
    public class BinderC10722 extends AbstractBinderC0911h {
        private final Executor mExecutor;
        final /* synthetic */ EngagementSignalsCallback val$callback;
        final /* synthetic */ Executor val$executor;

        public BinderC10722(Executor executor, EngagementSignalsCallback engagementSignalsCallback) {
            this.val$executor = executor;
            this.val$callback = engagementSignalsCallback;
            this.mExecutor = executor;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$onGreatestScrollPercentageIncreased$1(EngagementSignalsCallback engagementSignalsCallback, int i2, Bundle bundle) {
            engagementSignalsCallback.onGreatestScrollPercentageIncreased(i2, bundle);
        }

        @Override // android.support.customtabs.InterfaceC0912i
        public void onGreatestScrollPercentageIncreased(int i2, Bundle bundle) {
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            try {
                this.mExecutor.execute(new RunnableC1077c(this.val$callback, i2, bundle, 1));
            } finally {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
            }
        }

        @Override // android.support.customtabs.InterfaceC0912i
        public void onSessionEnded(boolean z, Bundle bundle) {
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            try {
                this.mExecutor.execute(new RunnableC1076b(this.val$callback, z, bundle, 3));
            } finally {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
            }
        }

        @Override // android.support.customtabs.InterfaceC0912i
        public void onVerticalScrollEvent(boolean z, Bundle bundle) {
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            try {
                this.mExecutor.execute(new RunnableC1076b(this.val$callback, z, bundle, 2));
            } finally {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
            }
        }
    }

    public static class MockSession extends AbstractBinderC0908e {
        @Override // android.support.customtabs.InterfaceC0909f
        public Bundle extraCommand(String str, Bundle bundle) {
            return null;
        }

        @Override // android.support.customtabs.InterfaceC0909f
        public boolean isEngagementSignalsApiAvailable(InterfaceC0906c interfaceC0906c, Bundle bundle) {
            return false;
        }

        @Override // android.support.customtabs.InterfaceC0909f
        public boolean mayLaunchUrl(InterfaceC0906c interfaceC0906c, Uri uri, Bundle bundle, List<Bundle> list) {
            return false;
        }

        @Override // android.support.customtabs.InterfaceC0909f
        public boolean newSession(InterfaceC0906c interfaceC0906c) {
            return false;
        }

        @Override // android.support.customtabs.InterfaceC0909f
        public boolean newSessionWithExtras(InterfaceC0906c interfaceC0906c, Bundle bundle) {
            return false;
        }

        @Override // android.support.customtabs.InterfaceC0909f
        public int postMessage(InterfaceC0906c interfaceC0906c, String str, Bundle bundle) {
            return 0;
        }

        @Override // android.support.customtabs.InterfaceC0909f
        public boolean receiveFile(InterfaceC0906c interfaceC0906c, Uri uri, int i2, Bundle bundle) {
            return false;
        }

        @Override // android.support.customtabs.InterfaceC0909f
        public boolean requestPostMessageChannel(InterfaceC0906c interfaceC0906c, Uri uri) {
            return false;
        }

        @Override // android.support.customtabs.InterfaceC0909f
        public boolean requestPostMessageChannelWithExtras(InterfaceC0906c interfaceC0906c, Uri uri, Bundle bundle) {
            return false;
        }

        @Override // android.support.customtabs.InterfaceC0909f
        public boolean setEngagementSignalsCallback(InterfaceC0906c interfaceC0906c, IBinder iBinder, Bundle bundle) {
            return false;
        }

        @Override // android.support.customtabs.InterfaceC0909f
        public boolean updateVisuals(InterfaceC0906c interfaceC0906c, Bundle bundle) {
            return false;
        }

        @Override // android.support.customtabs.InterfaceC0909f
        public boolean validateRelationship(InterfaceC0906c interfaceC0906c, int i2, Uri uri, Bundle bundle) {
            return false;
        }

        @Override // android.support.customtabs.InterfaceC0909f
        public boolean warmup(long j2) {
            return false;
        }
    }

    public static class PendingSession {
        private final CustomTabsCallback mCallback;
        private final PendingIntent mId;

        public PendingSession(CustomTabsCallback customTabsCallback, PendingIntent pendingIntent) {
            this.mCallback = customTabsCallback;
            this.mId = pendingIntent;
        }

        public CustomTabsCallback getCallback() {
            return this.mCallback;
        }

        public PendingIntent getId() {
            return this.mId;
        }
    }

    public CustomTabsSession(InterfaceC0909f interfaceC0909f, InterfaceC0906c interfaceC0906c, ComponentName componentName, PendingIntent pendingIntent) {
        this.mService = interfaceC0909f;
        this.mCallback = interfaceC0906c;
        this.mComponentName = componentName;
        this.mId = pendingIntent;
    }

    private void addIdToBundle(Bundle bundle) {
        PendingIntent pendingIntent = this.mId;
        if (pendingIntent != null) {
            bundle.putParcelable(CustomTabsIntent.EXTRA_SESSION_ID, pendingIntent);
        }
    }

    private Bundle createBundleWithId(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            bundle2.putAll(bundle);
        }
        addIdToBundle(bundle2);
        return bundle2;
    }

    private AbstractBinderC0911h createEngagementSignalsCallbackWrapper(EngagementSignalsCallback engagementSignalsCallback) {
        return new BinderC10711(engagementSignalsCallback);
    }

    public static CustomTabsSession createMockSessionForTesting(ComponentName componentName) {
        return new CustomTabsSession(new MockSession(), new CustomTabsSessionToken.MockCallback(), componentName, null);
    }

    private Bundle createPostMessageExtraBundle(Uri uri) {
        Bundle bundle = new Bundle();
        if (uri != null) {
            bundle.putParcelable(TARGET_ORIGIN_KEY, uri);
        }
        if (this.mId != null) {
            addIdToBundle(bundle);
        }
        if (bundle.isEmpty()) {
            return null;
        }
        return bundle;
    }

    public IBinder getBinder() {
        return this.mCallback.asBinder();
    }

    public ComponentName getComponentName() {
        return this.mComponentName;
    }

    public PendingIntent getId() {
        return this.mId;
    }

    public boolean isEngagementSignalsApiAvailable(Bundle bundle) {
        try {
            return this.mService.isEngagementSignalsApiAvailable(this.mCallback, createBundleWithId(bundle));
        } catch (SecurityException e) {
            throw new UnsupportedOperationException("This method isn't supported by the Custom Tabs implementation.", e);
        }
    }

    public boolean mayLaunchUrl(Uri uri, Bundle bundle, List<Bundle> list) {
        try {
            return this.mService.mayLaunchUrl(this.mCallback, uri, createBundleWithId(bundle), list);
        } catch (RemoteException unused) {
            return false;
        }
    }

    public int postMessage(String str, Bundle bundle) {
        int iPostMessage;
        Bundle bundleCreateBundleWithId = createBundleWithId(bundle);
        synchronized (this.mLock) {
            try {
                try {
                    iPostMessage = this.mService.postMessage(this.mCallback, str, bundleCreateBundleWithId);
                } catch (RemoteException unused) {
                    return -2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return iPostMessage;
    }

    public boolean receiveFile(Uri uri, int i2, Bundle bundle) {
        try {
            return this.mService.receiveFile(this.mCallback, uri, i2, createBundleWithId(bundle));
        } catch (RemoteException unused) {
            return false;
        }
    }

    public boolean requestPostMessageChannel(Uri uri) {
        return requestPostMessageChannel(uri, null, new Bundle());
    }

    public boolean setActionButton(Bitmap bitmap, String str) {
        Bundle bundle = new Bundle();
        bundle.putParcelable(CustomTabsIntent.KEY_ICON, bitmap);
        bundle.putString(CustomTabsIntent.KEY_DESCRIPTION, str);
        Bundle bundle2 = new Bundle();
        bundle2.putBundle(CustomTabsIntent.EXTRA_ACTION_BUTTON_BUNDLE, bundle);
        addIdToBundle(bundle);
        try {
            return this.mService.updateVisuals(this.mCallback, bundle2);
        } catch (RemoteException unused) {
            return false;
        }
    }

    public boolean setEngagementSignalsCallback(EngagementSignalsCallback engagementSignalsCallback, Bundle bundle) {
        try {
            return this.mService.setEngagementSignalsCallback(this.mCallback, createEngagementSignalsCallbackWrapper(engagementSignalsCallback).asBinder(), createBundleWithId(bundle));
        } catch (SecurityException e) {
            throw new UnsupportedOperationException("This method isn't supported by the Custom Tabs implementation.", e);
        }
    }

    public boolean setSecondaryToolbarSwipeUpGesture(PendingIntent pendingIntent) {
        Bundle bundle = new Bundle();
        bundle.putParcelable(CustomTabsIntent.EXTRA_SECONDARY_TOOLBAR_SWIPE_UP_GESTURE, pendingIntent);
        addIdToBundle(bundle);
        try {
            return this.mService.updateVisuals(this.mCallback, bundle);
        } catch (RemoteException unused) {
            return false;
        }
    }

    public boolean setSecondaryToolbarViews(RemoteViews remoteViews, int[] iArr, PendingIntent pendingIntent) {
        Bundle bundle = new Bundle();
        bundle.putParcelable(CustomTabsIntent.EXTRA_REMOTEVIEWS, remoteViews);
        bundle.putIntArray(CustomTabsIntent.EXTRA_REMOTEVIEWS_VIEW_IDS, iArr);
        bundle.putParcelable(CustomTabsIntent.EXTRA_REMOTEVIEWS_PENDINGINTENT, pendingIntent);
        addIdToBundle(bundle);
        try {
            return this.mService.updateVisuals(this.mCallback, bundle);
        } catch (RemoteException unused) {
            return false;
        }
    }

    @Deprecated
    public boolean setToolbarItem(int i2, Bitmap bitmap, String str) {
        Bundle bundle = new Bundle();
        bundle.putInt(CustomTabsIntent.KEY_ID, i2);
        bundle.putParcelable(CustomTabsIntent.KEY_ICON, bitmap);
        bundle.putString(CustomTabsIntent.KEY_DESCRIPTION, str);
        Bundle bundle2 = new Bundle();
        bundle2.putBundle(CustomTabsIntent.EXTRA_ACTION_BUTTON_BUNDLE, bundle);
        addIdToBundle(bundle2);
        try {
            return this.mService.updateVisuals(this.mCallback, bundle2);
        } catch (RemoteException unused) {
            return false;
        }
    }

    public boolean validateRelationship(int i2, Uri uri, Bundle bundle) {
        if (i2 >= 1 && i2 <= 2) {
            try {
                return this.mService.validateRelationship(this.mCallback, i2, uri, createBundleWithId(bundle));
            } catch (RemoteException unused) {
            }
        }
        return false;
    }

    private AbstractBinderC0911h createEngagementSignalsCallbackWrapper(EngagementSignalsCallback engagementSignalsCallback, Executor executor) {
        return new BinderC10722(executor, engagementSignalsCallback);
    }

    public boolean requestPostMessageChannel(Uri uri, Uri uri2, Bundle bundle) {
        try {
            Bundle bundleCreatePostMessageExtraBundle = createPostMessageExtraBundle(uri2);
            if (bundleCreatePostMessageExtraBundle == null) {
                return this.mService.requestPostMessageChannel(this.mCallback, uri);
            }
            bundle.putAll(bundleCreatePostMessageExtraBundle);
            return this.mService.requestPostMessageChannelWithExtras(this.mCallback, uri, bundle);
        } catch (RemoteException unused) {
            return false;
        }
    }

    public boolean setEngagementSignalsCallback(Executor executor, EngagementSignalsCallback engagementSignalsCallback, Bundle bundle) {
        try {
            return this.mService.setEngagementSignalsCallback(this.mCallback, createEngagementSignalsCallbackWrapper(engagementSignalsCallback, executor).asBinder(), createBundleWithId(bundle));
        } catch (SecurityException e) {
            throw new UnsupportedOperationException("This method isn't supported by the Custom Tabs implementation.", e);
        }
    }
}
