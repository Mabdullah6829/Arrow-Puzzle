package androidx.privacysandbox.ads.adservices.java.appsetid;

import android.content.Context;
import androidx.privacysandbox.ads.adservices.appsetid.AppSetIdManager;
import androidx.privacysandbox.ads.adservices.java.internal.CoroutineAdapterKt;
import com.google.common.util.concurrent.ListenableFuture;
import kotlin.jvm.internal.AbstractC6447f;
import kotlin.jvm.internal.AbstractC6452k;
import p000A0.AbstractC0007H;
import p000A0.AbstractC0069y;

/* JADX INFO: loaded from: classes.dex */
public abstract class AppSetIdManagerFutures {
    public static final Companion Companion = new Companion(null);

    public static final class Api33Ext4JavaImpl extends AppSetIdManagerFutures {
        private final AppSetIdManager mAppSetIdManager;

        public Api33Ext4JavaImpl(AppSetIdManager mAppSetIdManager) {
            AbstractC6452k.m12181e(mAppSetIdManager, "mAppSetIdManager");
            this.mAppSetIdManager = mAppSetIdManager;
        }

        @Override // androidx.privacysandbox.ads.adservices.java.appsetid.AppSetIdManagerFutures
        public ListenableFuture getAppSetIdAsync() {
            return CoroutineAdapterKt.asListenableFuture$default(AbstractC0069y.m103b(AbstractC0069y.m102a(AbstractC0007H.f4a), new AppSetIdManagerFutures$Api33Ext4JavaImpl$getAppSetIdAsync$1(this, null), 3), null, 1, null);
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC6447f abstractC6447f) {
            this();
        }

        public final AppSetIdManagerFutures from(Context context) {
            AbstractC6452k.m12181e(context, "context");
            AppSetIdManager appSetIdManagerObtain = AppSetIdManager.Companion.obtain(context);
            if (appSetIdManagerObtain != null) {
                return new Api33Ext4JavaImpl(appSetIdManagerObtain);
            }
            return null;
        }

        private Companion() {
        }
    }

    public static final AppSetIdManagerFutures from(Context context) {
        return Companion.from(context);
    }

    public abstract ListenableFuture getAppSetIdAsync();
}
