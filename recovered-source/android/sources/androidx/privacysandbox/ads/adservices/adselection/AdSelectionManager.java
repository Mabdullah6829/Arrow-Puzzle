package androidx.privacysandbox.ads.adservices.adselection;

import android.content.Context;
import androidx.privacysandbox.ads.adservices.common.ExperimentalFeatures;
import androidx.privacysandbox.ads.adservices.internal.AdServicesInfo;
import androidx.privacysandbox.ads.adservices.internal.BackCompatManager;
import kotlin.jvm.internal.AbstractC6447f;
import kotlin.jvm.internal.AbstractC6452k;
import p062g0.InterfaceC6348c;

/* JADX INFO: loaded from: classes.dex */
public abstract class AdSelectionManager {
    public static final Companion Companion = new Companion(null);

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC6447f abstractC6447f) {
            this();
        }

        public final AdSelectionManager obtain(Context context) {
            AbstractC6452k.m12181e(context, "context");
            AdServicesInfo adServicesInfo = AdServicesInfo.INSTANCE;
            if (adServicesInfo.adServicesVersion() >= 4) {
                return new AdSelectionManagerApi33Ext4Impl(context);
            }
            if (adServicesInfo.extServicesVersionS() >= 9) {
                return (AdSelectionManager) BackCompatManager.INSTANCE.getManager(context, "AdSelectionManager", new AdSelectionManager$Companion$obtain$1(context));
            }
            return null;
        }

        private Companion() {
        }
    }

    public static final AdSelectionManager obtain(Context context) {
        return Companion.obtain(context);
    }

    @ExperimentalFeatures.Ext10OptIn
    public abstract Object getAdSelectionData(GetAdSelectionDataRequest getAdSelectionDataRequest, InterfaceC6348c interfaceC6348c);

    @ExperimentalFeatures.Ext10OptIn
    public abstract Object persistAdSelectionResult(PersistAdSelectionResultRequest persistAdSelectionResultRequest, InterfaceC6348c interfaceC6348c);

    @ExperimentalFeatures.Ext8OptIn
    public abstract Object reportEvent(ReportEventRequest reportEventRequest, InterfaceC6348c interfaceC6348c);

    public abstract Object reportImpression(ReportImpressionRequest reportImpressionRequest, InterfaceC6348c interfaceC6348c);

    public abstract Object selectAds(AdSelectionConfig adSelectionConfig, InterfaceC6348c interfaceC6348c);

    @ExperimentalFeatures.Ext10OptIn
    public abstract Object selectAds(AdSelectionFromOutcomesConfig adSelectionFromOutcomesConfig, InterfaceC6348c interfaceC6348c);

    @ExperimentalFeatures.Ext8OptIn
    public abstract Object updateAdCounterHistogram(UpdateAdCounterHistogramRequest updateAdCounterHistogramRequest, InterfaceC6348c interfaceC6348c);
}
