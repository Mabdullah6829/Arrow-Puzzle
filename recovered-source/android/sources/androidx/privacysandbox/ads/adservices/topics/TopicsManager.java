package androidx.privacysandbox.ads.adservices.topics;

import android.content.Context;
import androidx.privacysandbox.ads.adservices.internal.AdServicesInfo;
import androidx.privacysandbox.ads.adservices.internal.BackCompatManager;
import kotlin.jvm.internal.AbstractC6447f;
import kotlin.jvm.internal.AbstractC6452k;
import p062g0.InterfaceC6348c;

/* JADX INFO: loaded from: classes.dex */
public abstract class TopicsManager {
    public static final Companion Companion = new Companion(null);

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC6447f abstractC6447f) {
            this();
        }

        public final TopicsManager obtain(Context context) {
            AbstractC6452k.m12181e(context, "context");
            AdServicesInfo adServicesInfo = AdServicesInfo.INSTANCE;
            if (adServicesInfo.adServicesVersion() >= 11) {
                return new TopicsManagerApi33Ext11Impl(context);
            }
            if (adServicesInfo.adServicesVersion() >= 5) {
                return new TopicsManagerApi33Ext5Impl(context);
            }
            if (adServicesInfo.adServicesVersion() == 4) {
                return new TopicsManagerApi33Ext4Impl(context);
            }
            if (adServicesInfo.extServicesVersionS() >= 11) {
                return (TopicsManager) BackCompatManager.INSTANCE.getManager(context, "TopicsManager", new TopicsManager$Companion$obtain$1(context));
            }
            if (adServicesInfo.extServicesVersionS() >= 9) {
                return (TopicsManager) BackCompatManager.INSTANCE.getManager(context, "TopicsManager", new TopicsManager$Companion$obtain$2(context));
            }
            return null;
        }

        private Companion() {
        }
    }

    public static final TopicsManager obtain(Context context) {
        return Companion.obtain(context);
    }

    public abstract Object getTopics(GetTopicsRequest getTopicsRequest, InterfaceC6348c interfaceC6348c);
}
