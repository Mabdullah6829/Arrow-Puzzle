package androidx.privacysandbox.ads.adservices.measurement;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import android.view.InputEvent;
import androidx.privacysandbox.ads.adservices.common.ExperimentalFeatures;
import androidx.privacysandbox.ads.adservices.internal.AdServicesInfo;
import androidx.privacysandbox.ads.adservices.internal.BackCompatManager;
import kotlin.jvm.internal.AbstractC6447f;
import kotlin.jvm.internal.AbstractC6452k;
import p062g0.InterfaceC6348c;

/* JADX INFO: loaded from: classes.dex */
public abstract class MeasurementManager {
    public static final Companion Companion = new Companion(null);
    public static final int MEASUREMENT_API_STATE_DISABLED = 0;
    public static final int MEASUREMENT_API_STATE_ENABLED = 1;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC6447f abstractC6447f) {
            this();
        }

        public final MeasurementManager obtain(Context context) {
            AbstractC6452k.m12181e(context, "context");
            StringBuilder sb = new StringBuilder("AdServicesInfo.version=");
            AdServicesInfo adServicesInfo = AdServicesInfo.INSTANCE;
            sb.append(adServicesInfo.adServicesVersion());
            Log.d("MeasurementManager", sb.toString());
            if (adServicesInfo.adServicesVersion() >= 5) {
                return new MeasurementManagerApi33Ext5Impl(context);
            }
            if (adServicesInfo.extServicesVersionS() >= 9) {
                return (MeasurementManager) BackCompatManager.INSTANCE.getManager(context, "MeasurementManager", new MeasurementManager$Companion$obtain$1(context));
            }
            return null;
        }

        private Companion() {
        }
    }

    public static final MeasurementManager obtain(Context context) {
        return Companion.obtain(context);
    }

    public abstract Object deleteRegistrations(DeletionRequest deletionRequest, InterfaceC6348c interfaceC6348c);

    public abstract Object getMeasurementApiStatus(InterfaceC6348c interfaceC6348c);

    public abstract Object registerSource(Uri uri, InputEvent inputEvent, InterfaceC6348c interfaceC6348c);

    @ExperimentalFeatures.RegisterSourceOptIn
    public abstract Object registerSource(SourceRegistrationRequest sourceRegistrationRequest, InterfaceC6348c interfaceC6348c);

    public abstract Object registerTrigger(Uri uri, InterfaceC6348c interfaceC6348c);

    public abstract Object registerWebSource(WebSourceRegistrationRequest webSourceRegistrationRequest, InterfaceC6348c interfaceC6348c);

    public abstract Object registerWebTrigger(WebTriggerRegistrationRequest webTriggerRegistrationRequest, InterfaceC6348c interfaceC6348c);
}
