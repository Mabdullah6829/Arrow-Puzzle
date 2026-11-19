package androidx.privacysandbox.ads.adservices.signals;

import android.content.Context;
import android.util.Log;
import androidx.privacysandbox.ads.adservices.common.ExperimentalFeatures;
import androidx.privacysandbox.ads.adservices.internal.AdServicesInfo;
import kotlin.jvm.internal.AbstractC6447f;
import kotlin.jvm.internal.AbstractC6452k;
import p062g0.InterfaceC6348c;

/* JADX INFO: loaded from: classes.dex */
public abstract class ProtectedSignalsManager {
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "ProtectedSignalsManager";

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC6447f abstractC6447f) {
            this();
        }

        @ExperimentalFeatures.Ext12OptIn
        public final ProtectedSignalsManager obtain(Context context) {
            AbstractC6452k.m12181e(context, "context");
            if (AdServicesInfo.INSTANCE.adServicesVersion() < 12) {
                Log.d(ProtectedSignalsManager.TAG, "Adservices less than 12, returning null for ProtectedSignalsManager.obtain.");
                return null;
            }
            Log.d(ProtectedSignalsManager.TAG, "Adservices version 12 detected, obtaining ProtectedSignalsManagerImpl.");
            android.adservices.signals.ProtectedSignalsManager protectedSignalsManager = android.adservices.signals.ProtectedSignalsManager.get(context);
            AbstractC6452k.m12180d(protectedSignalsManager, "get(context)");
            return new ProtectedSignalsManagerImpl(protectedSignalsManager);
        }

        private Companion() {
        }
    }

    @ExperimentalFeatures.Ext12OptIn
    public static final ProtectedSignalsManager obtain(Context context) {
        return Companion.obtain(context);
    }

    @ExperimentalFeatures.Ext12OptIn
    public abstract Object updateSignals(UpdateSignalsRequest updateSignalsRequest, InterfaceC6348c interfaceC6348c);
}
