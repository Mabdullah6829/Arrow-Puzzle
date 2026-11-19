package androidx.privacysandbox.ads.adservices.java.topics;

import android.content.Context;
import androidx.privacysandbox.ads.adservices.java.internal.CoroutineAdapterKt;
import androidx.privacysandbox.ads.adservices.topics.GetTopicsRequest;
import androidx.privacysandbox.ads.adservices.topics.TopicsManager;
import com.google.common.util.concurrent.ListenableFuture;
import kotlin.jvm.internal.AbstractC6447f;
import kotlin.jvm.internal.AbstractC6452k;
import p000A0.AbstractC0007H;
import p000A0.AbstractC0069y;
import p010F0.AbstractC0227m;
import p012H0.C0302e;

/* JADX INFO: loaded from: classes.dex */
public abstract class TopicsManagerFutures {
    public static final Companion Companion = new Companion(null);

    public static final class CommonApiJavaImpl extends TopicsManagerFutures {
        private final TopicsManager mTopicsManager;

        public CommonApiJavaImpl(TopicsManager mTopicsManager) {
            AbstractC6452k.m12181e(mTopicsManager, "mTopicsManager");
            this.mTopicsManager = mTopicsManager;
        }

        @Override // androidx.privacysandbox.ads.adservices.java.topics.TopicsManagerFutures
        public ListenableFuture getTopicsAsync(GetTopicsRequest request) {
            AbstractC6452k.m12181e(request, "request");
            C0302e c0302e = AbstractC0007H.f4a;
            return CoroutineAdapterKt.asListenableFuture$default(AbstractC0069y.m103b(AbstractC0069y.m102a(AbstractC0227m.f459a), new TopicsManagerFutures$CommonApiJavaImpl$getTopicsAsync$1(this, request, null), 3), null, 1, null);
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC6447f abstractC6447f) {
            this();
        }

        public final TopicsManagerFutures from(Context context) {
            AbstractC6452k.m12181e(context, "context");
            TopicsManager topicsManagerObtain = TopicsManager.Companion.obtain(context);
            if (topicsManagerObtain != null) {
                return new CommonApiJavaImpl(topicsManagerObtain);
            }
            return null;
        }

        private Companion() {
        }
    }

    public static final TopicsManagerFutures from(Context context) {
        return Companion.from(context);
    }

    public abstract ListenableFuture getTopicsAsync(GetTopicsRequest getTopicsRequest);
}
