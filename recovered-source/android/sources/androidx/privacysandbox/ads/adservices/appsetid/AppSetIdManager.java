package androidx.privacysandbox.ads.adservices.appsetid;

import android.content.Context;
import androidx.privacysandbox.ads.adservices.internal.AdServicesInfo;
import androidx.privacysandbox.ads.adservices.internal.BackCompatManager;
import kotlin.jvm.internal.AbstractC6447f;
import kotlin.jvm.internal.AbstractC6452k;
import p062g0.InterfaceC6348c;

/* JADX INFO: loaded from: classes.dex */
public abstract class AppSetIdManager {
    public static final Companion Companion = new Companion(null);

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC6447f abstractC6447f) {
            this();
        }

        public final AppSetIdManager obtain(Context context) {
            AbstractC6452k.m12181e(context, "context");
            AdServicesInfo adServicesInfo = AdServicesInfo.INSTANCE;
            if (adServicesInfo.adServicesVersion() >= 4) {
                return new AppSetIdManagerApi33Ext4Impl(context);
            }
            if (adServicesInfo.extServicesVersionS() >= 9) {
                return (AppSetIdManager) BackCompatManager.INSTANCE.getManager(context, "AppSetIdManager", new AppSetIdManager$Companion$obtain$1(context));
            }
            return null;
        }

        private Companion() {
        }
    }

    public static final AppSetIdManager obtain(Context context) {
        return Companion.obtain(context);
    }

    public abstract Object getAppSetId(InterfaceC6348c interfaceC6348c);
}
