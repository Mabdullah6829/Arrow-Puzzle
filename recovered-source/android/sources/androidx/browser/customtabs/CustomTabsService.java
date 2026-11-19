package androidx.browser.customtabs;

import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.customtabs.AbstractBinderC0908e;
import android.support.customtabs.InterfaceC0906c;
import androidx.collection.SimpleArrayMap;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public abstract class CustomTabsService extends Service {
    public static final String ACTION_CUSTOM_TABS_CONNECTION = "android.support.customtabs.action.CustomTabsService";
    public static final String CATEGORY_COLOR_SCHEME_CUSTOMIZATION = "androidx.browser.customtabs.category.ColorSchemeCustomization";
    public static final String CATEGORY_NAVBAR_COLOR_CUSTOMIZATION = "androidx.browser.customtabs.category.NavBarColorCustomization";
    public static final String CATEGORY_TRUSTED_WEB_ACTIVITY_IMMERSIVE_MODE = "androidx.browser.trusted.category.ImmersiveMode";
    public static final String CATEGORY_WEB_SHARE_TARGET_V2 = "androidx.browser.trusted.category.WebShareTargetV2";
    public static final int FILE_PURPOSE_TRUSTED_WEB_ACTIVITY_SPLASH_IMAGE = 1;
    public static final String KEY_SUCCESS = "androidx.browser.customtabs.SUCCESS";
    public static final String KEY_URL = "android.support.customtabs.otherurls.URL";
    public static final int RELATION_HANDLE_ALL_URLS = 2;
    public static final int RELATION_USE_AS_ORIGIN = 1;
    public static final int RESULT_FAILURE_DISALLOWED = -1;
    public static final int RESULT_FAILURE_MESSAGING_ERROR = -3;
    public static final int RESULT_FAILURE_REMOTE_ERROR = -2;
    public static final int RESULT_SUCCESS = 0;
    private static final String TAG = "CustomTabsService";
    public static final String TRUSTED_WEB_ACTIVITY_CATEGORY = "androidx.browser.trusted.category.TrustedWebActivities";
    final SimpleArrayMap<IBinder, IBinder.DeathRecipient> mDeathRecipientMap = new SimpleArrayMap<>();
    private AbstractBinderC0908e mBinder = new BinderC10691();

    /* JADX INFO: renamed from: androidx.browser.customtabs.CustomTabsService$1 */
    public class BinderC10691 extends AbstractBinderC0908e {
        public BinderC10691() {
        }

        private PendingIntent getSessionIdFromBundle(Bundle bundle) {
            if (bundle == null) {
                return null;
            }
            PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable(CustomTabsIntent.EXTRA_SESSION_ID);
            bundle.remove(CustomTabsIntent.EXTRA_SESSION_ID);
            return pendingIntent;
        }

        private Uri getTargetOriginFromBundle(Bundle bundle) {
            if (bundle == null) {
                return null;
            }
            return Build.VERSION.SDK_INT >= 33 ? (Uri) Api33Impl.getParcelable(bundle, "target_origin", Uri.class) : (Uri) bundle.getParcelable("target_origin");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$newSessionInternal$0(CustomTabsSessionToken customTabsSessionToken) {
            CustomTabsService.this.cleanUpSession(customTabsSessionToken);
        }

        private boolean newSessionInternal(InterfaceC0906c interfaceC0906c, PendingIntent pendingIntent) {
            final CustomTabsSessionToken customTabsSessionToken = new CustomTabsSessionToken(interfaceC0906c, pendingIntent);
            try {
                IBinder.DeathRecipient deathRecipient = new IBinder.DeathRecipient() { // from class: androidx.browser.customtabs.a
                    @Override // android.os.IBinder.DeathRecipient
                    public final void binderDied() {
                        this.f2592a.lambda$newSessionInternal$0(customTabsSessionToken);
                    }
                };
                synchronized (CustomTabsService.this.mDeathRecipientMap) {
                    interfaceC0906c.asBinder().linkToDeath(deathRecipient, 0);
                    CustomTabsService.this.mDeathRecipientMap.put(interfaceC0906c.asBinder(), deathRecipient);
                }
                return CustomTabsService.this.newSession(customTabsSessionToken);
            } catch (RemoteException unused) {
                return false;
            }
        }

        @Override // android.support.customtabs.InterfaceC0909f
        public Bundle extraCommand(String str, Bundle bundle) {
            return CustomTabsService.this.extraCommand(str, bundle);
        }

        @Override // android.support.customtabs.InterfaceC0909f
        public boolean isEngagementSignalsApiAvailable(InterfaceC0906c interfaceC0906c, Bundle bundle) {
            return CustomTabsService.this.isEngagementSignalsApiAvailable(new CustomTabsSessionToken(interfaceC0906c, getSessionIdFromBundle(bundle)), bundle);
        }

        @Override // android.support.customtabs.InterfaceC0909f
        public boolean mayLaunchUrl(InterfaceC0906c interfaceC0906c, Uri uri, Bundle bundle, List<Bundle> list) {
            return CustomTabsService.this.mayLaunchUrl(new CustomTabsSessionToken(interfaceC0906c, getSessionIdFromBundle(bundle)), uri, bundle, list);
        }

        @Override // android.support.customtabs.InterfaceC0909f
        public boolean newSession(InterfaceC0906c interfaceC0906c) {
            return newSessionInternal(interfaceC0906c, null);
        }

        @Override // android.support.customtabs.InterfaceC0909f
        public boolean newSessionWithExtras(InterfaceC0906c interfaceC0906c, Bundle bundle) {
            return newSessionInternal(interfaceC0906c, getSessionIdFromBundle(bundle));
        }

        @Override // android.support.customtabs.InterfaceC0909f
        public int postMessage(InterfaceC0906c interfaceC0906c, String str, Bundle bundle) {
            return CustomTabsService.this.postMessage(new CustomTabsSessionToken(interfaceC0906c, getSessionIdFromBundle(bundle)), str, bundle);
        }

        @Override // android.support.customtabs.InterfaceC0909f
        public boolean receiveFile(InterfaceC0906c interfaceC0906c, Uri uri, int i2, Bundle bundle) {
            return CustomTabsService.this.receiveFile(new CustomTabsSessionToken(interfaceC0906c, getSessionIdFromBundle(bundle)), uri, i2, bundle);
        }

        @Override // android.support.customtabs.InterfaceC0909f
        public boolean requestPostMessageChannel(InterfaceC0906c interfaceC0906c, Uri uri) {
            return CustomTabsService.this.requestPostMessageChannel(new CustomTabsSessionToken(interfaceC0906c, null), uri, null, new Bundle());
        }

        @Override // android.support.customtabs.InterfaceC0909f
        public boolean requestPostMessageChannelWithExtras(InterfaceC0906c interfaceC0906c, Uri uri, Bundle bundle) {
            return CustomTabsService.this.requestPostMessageChannel(new CustomTabsSessionToken(interfaceC0906c, getSessionIdFromBundle(bundle)), uri, getTargetOriginFromBundle(bundle), bundle);
        }

        @Override // android.support.customtabs.InterfaceC0909f
        public boolean setEngagementSignalsCallback(InterfaceC0906c interfaceC0906c, IBinder iBinder, Bundle bundle) {
            return CustomTabsService.this.setEngagementSignalsCallback(new CustomTabsSessionToken(interfaceC0906c, getSessionIdFromBundle(bundle)), EngagementSignalsCallbackRemote.fromBinder(iBinder), bundle);
        }

        @Override // android.support.customtabs.InterfaceC0909f
        public boolean updateVisuals(InterfaceC0906c interfaceC0906c, Bundle bundle) {
            return CustomTabsService.this.updateVisuals(new CustomTabsSessionToken(interfaceC0906c, getSessionIdFromBundle(bundle)), bundle);
        }

        @Override // android.support.customtabs.InterfaceC0909f
        public boolean validateRelationship(InterfaceC0906c interfaceC0906c, int i2, Uri uri, Bundle bundle) {
            return CustomTabsService.this.validateRelationship(new CustomTabsSessionToken(interfaceC0906c, getSessionIdFromBundle(bundle)), i2, uri, bundle);
        }

        @Override // android.support.customtabs.InterfaceC0909f
        public boolean warmup(long j2) {
            return CustomTabsService.this.warmup(j2);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface FilePurpose {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface Relation {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface Result {
    }

    public boolean cleanUpSession(CustomTabsSessionToken customTabsSessionToken) {
        try {
            synchronized (this.mDeathRecipientMap) {
                try {
                    IBinder callbackBinder = customTabsSessionToken.getCallbackBinder();
                    if (callbackBinder == null) {
                        return false;
                    }
                    callbackBinder.unlinkToDeath(this.mDeathRecipientMap.get(callbackBinder), 0);
                    this.mDeathRecipientMap.remove(callbackBinder);
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (NoSuchElementException unused) {
            return false;
        }
    }

    public abstract Bundle extraCommand(String str, Bundle bundle);

    public boolean isEngagementSignalsApiAvailable(CustomTabsSessionToken customTabsSessionToken, Bundle bundle) {
        return false;
    }

    public abstract boolean mayLaunchUrl(CustomTabsSessionToken customTabsSessionToken, Uri uri, Bundle bundle, List<Bundle> list);

    public abstract boolean newSession(CustomTabsSessionToken customTabsSessionToken);

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.mBinder;
    }

    public abstract int postMessage(CustomTabsSessionToken customTabsSessionToken, String str, Bundle bundle);

    public abstract boolean receiveFile(CustomTabsSessionToken customTabsSessionToken, Uri uri, int i2, Bundle bundle);

    public abstract boolean requestPostMessageChannel(CustomTabsSessionToken customTabsSessionToken, Uri uri);

    public boolean requestPostMessageChannel(CustomTabsSessionToken customTabsSessionToken, Uri uri, Uri uri2, Bundle bundle) {
        return requestPostMessageChannel(customTabsSessionToken, uri);
    }

    public boolean setEngagementSignalsCallback(CustomTabsSessionToken customTabsSessionToken, EngagementSignalsCallback engagementSignalsCallback, Bundle bundle) {
        return false;
    }

    public abstract boolean updateVisuals(CustomTabsSessionToken customTabsSessionToken, Bundle bundle);

    public abstract boolean validateRelationship(CustomTabsSessionToken customTabsSessionToken, int i2, Uri uri, Bundle bundle);

    public abstract boolean warmup(long j2);
}
