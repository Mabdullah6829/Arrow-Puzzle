package androidx.privacysandbox.ads.adservices.java.adid;

import android.content.Context;
import androidx.privacysandbox.ads.adservices.adid.AdIdManager;
import androidx.privacysandbox.ads.adservices.java.internal.CoroutineAdapterKt;
import com.google.common.util.concurrent.ListenableFuture;
import kotlin.jvm.internal.AbstractC6447f;
import kotlin.jvm.internal.AbstractC6452k;
import p000A0.AbstractC0007H;
import p000A0.AbstractC0069y;

/* JADX INFO: loaded from: classes.dex */
public abstract class AdIdManagerFutures {
    public static final Companion Companion = new Companion(null);

    public static final class Api33Ext4JavaImpl extends AdIdManagerFutures {
        private final AdIdManager mAdIdManager;

        public Api33Ext4JavaImpl(AdIdManager mAdIdManager) {
            AbstractC6452k.m12181e(mAdIdManager, "mAdIdManager");
            this.mAdIdManager = mAdIdManager;
        }

        @Override // androidx.privacysandbox.ads.adservices.java.adid.AdIdManagerFutures
        public ListenableFuture getAdIdAsync() {
            return CoroutineAdapterKt.asListenableFuture$default(AbstractC0069y.m103b(AbstractC0069y.m102a(AbstractC0007H.f4a), new AdIdManagerFutures$Api33Ext4JavaImpl$getAdIdAsync$1(this, null), 3), null, 1, null);
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC6447f abstractC6447f) {
            this();
        }

        public final AdIdManagerFutures from(Context context) {
            AbstractC6452k.m12181e(context, "context");
            AdIdManager adIdManagerObtain = AdIdManager.Companion.obtain(context);
            if (adIdManagerObtain != null) {
                return new Api33Ext4JavaImpl(adIdManagerObtain);
            }
            return null;
        }

        private Companion() {
        }
    }

    public static final AdIdManagerFutures from(Context context) {
        return Companion.from(context);
    }

    public abstract ListenableFuture getAdIdAsync();
}
