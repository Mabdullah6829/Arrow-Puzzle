package androidx.privacysandbox.ads.adservices.java.customaudience;

import android.content.Context;
import androidx.privacysandbox.ads.adservices.common.ExperimentalFeatures;
import androidx.privacysandbox.ads.adservices.customaudience.CustomAudienceManager;
import androidx.privacysandbox.ads.adservices.customaudience.FetchAndJoinCustomAudienceRequest;
import androidx.privacysandbox.ads.adservices.customaudience.JoinCustomAudienceRequest;
import androidx.privacysandbox.ads.adservices.customaudience.LeaveCustomAudienceRequest;
import androidx.privacysandbox.ads.adservices.java.internal.CoroutineAdapterKt;
import com.google.common.util.concurrent.ListenableFuture;
import kotlin.jvm.internal.AbstractC6447f;
import kotlin.jvm.internal.AbstractC6452k;
import p000A0.AbstractC0007H;
import p000A0.AbstractC0069y;

/* JADX INFO: loaded from: classes.dex */
public abstract class CustomAudienceManagerFutures {
    public static final Companion Companion = new Companion(null);

    public static final class Api33Ext4JavaImpl extends CustomAudienceManagerFutures {
        private final CustomAudienceManager mCustomAudienceManager;

        public Api33Ext4JavaImpl(CustomAudienceManager customAudienceManager) {
            this.mCustomAudienceManager = customAudienceManager;
        }

        @Override // androidx.privacysandbox.ads.adservices.java.customaudience.CustomAudienceManagerFutures
        public ListenableFuture fetchAndJoinCustomAudienceAsync(FetchAndJoinCustomAudienceRequest request) {
            AbstractC6452k.m12181e(request, "request");
            return CoroutineAdapterKt.asListenableFuture$default(AbstractC0069y.m103b(AbstractC0069y.m102a(AbstractC0007H.f4a), new C1619x423c6ecc(this, request, null), 3), null, 1, null);
        }

        @Override // androidx.privacysandbox.ads.adservices.java.customaudience.CustomAudienceManagerFutures
        public ListenableFuture joinCustomAudienceAsync(JoinCustomAudienceRequest request) {
            AbstractC6452k.m12181e(request, "request");
            return CoroutineAdapterKt.asListenableFuture$default(AbstractC0069y.m103b(AbstractC0069y.m102a(AbstractC0007H.f4a), new C1620x15d14809(this, request, null), 3), null, 1, null);
        }

        @Override // androidx.privacysandbox.ads.adservices.java.customaudience.CustomAudienceManagerFutures
        public ListenableFuture leaveCustomAudienceAsync(LeaveCustomAudienceRequest request) {
            AbstractC6452k.m12181e(request, "request");
            return CoroutineAdapterKt.asListenableFuture$default(AbstractC0069y.m103b(AbstractC0069y.m102a(AbstractC0007H.f4a), new C1621x236ea9be(this, request, null), 3), null, 1, null);
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC6447f abstractC6447f) {
            this();
        }

        public final CustomAudienceManagerFutures from(Context context) {
            AbstractC6452k.m12181e(context, "context");
            CustomAudienceManager customAudienceManagerObtain = CustomAudienceManager.Companion.obtain(context);
            if (customAudienceManagerObtain != null) {
                return new Api33Ext4JavaImpl(customAudienceManagerObtain);
            }
            return null;
        }

        private Companion() {
        }
    }

    public static final CustomAudienceManagerFutures from(Context context) {
        return Companion.from(context);
    }

    @ExperimentalFeatures.Ext10OptIn
    public abstract ListenableFuture fetchAndJoinCustomAudienceAsync(FetchAndJoinCustomAudienceRequest fetchAndJoinCustomAudienceRequest);

    public abstract ListenableFuture joinCustomAudienceAsync(JoinCustomAudienceRequest joinCustomAudienceRequest);

    public abstract ListenableFuture leaveCustomAudienceAsync(LeaveCustomAudienceRequest leaveCustomAudienceRequest);
}
