package androidx.privacysandbox.ads.adservices.java.measurement;

import android.content.Context;
import android.net.Uri;
import android.view.InputEvent;
import androidx.privacysandbox.ads.adservices.common.ExperimentalFeatures;
import androidx.privacysandbox.ads.adservices.java.internal.CoroutineAdapterKt;
import androidx.privacysandbox.ads.adservices.measurement.DeletionRequest;
import androidx.privacysandbox.ads.adservices.measurement.MeasurementManager;
import androidx.privacysandbox.ads.adservices.measurement.SourceRegistrationRequest;
import androidx.privacysandbox.ads.adservices.measurement.WebSourceRegistrationRequest;
import androidx.privacysandbox.ads.adservices.measurement.WebTriggerRegistrationRequest;
import com.google.common.util.concurrent.ListenableFuture;
import kotlin.jvm.internal.AbstractC6447f;
import kotlin.jvm.internal.AbstractC6452k;
import p000A0.AbstractC0007H;
import p000A0.AbstractC0069y;

/* JADX INFO: loaded from: classes.dex */
public abstract class MeasurementManagerFutures {
    public static final Companion Companion = new Companion(null);

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC6447f abstractC6447f) {
            this();
        }

        public final MeasurementManagerFutures from(Context context) {
            AbstractC6452k.m12181e(context, "context");
            MeasurementManager measurementManagerObtain = MeasurementManager.Companion.obtain(context);
            if (measurementManagerObtain != null) {
                return new Api33Ext5JavaImpl(measurementManagerObtain);
            }
            return null;
        }

        private Companion() {
        }
    }

    public static final MeasurementManagerFutures from(Context context) {
        return Companion.from(context);
    }

    public abstract ListenableFuture deleteRegistrationsAsync(DeletionRequest deletionRequest);

    public abstract ListenableFuture getMeasurementApiStatusAsync();

    public abstract ListenableFuture registerSourceAsync(Uri uri, InputEvent inputEvent);

    @ExperimentalFeatures.RegisterSourceOptIn
    public abstract ListenableFuture registerSourceAsync(SourceRegistrationRequest sourceRegistrationRequest);

    public abstract ListenableFuture registerTriggerAsync(Uri uri);

    public abstract ListenableFuture registerWebSourceAsync(WebSourceRegistrationRequest webSourceRegistrationRequest);

    public abstract ListenableFuture registerWebTriggerAsync(WebTriggerRegistrationRequest webTriggerRegistrationRequest);

    public static final class Api33Ext5JavaImpl extends MeasurementManagerFutures {
        private final MeasurementManager mMeasurementManager;

        public Api33Ext5JavaImpl(MeasurementManager mMeasurementManager) {
            AbstractC6452k.m12181e(mMeasurementManager, "mMeasurementManager");
            this.mMeasurementManager = mMeasurementManager;
        }

        @Override // androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures
        public ListenableFuture deleteRegistrationsAsync(DeletionRequest deletionRequest) {
            AbstractC6452k.m12181e(deletionRequest, "deletionRequest");
            return CoroutineAdapterKt.asListenableFuture$default(AbstractC0069y.m103b(AbstractC0069y.m102a(AbstractC0007H.f4a), new C1623x759ed5b3(this, deletionRequest, null), 3), null, 1, null);
        }

        @Override // androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures
        public ListenableFuture getMeasurementApiStatusAsync() {
            return CoroutineAdapterKt.asListenableFuture$default(AbstractC0069y.m103b(AbstractC0069y.m102a(AbstractC0007H.f4a), new C1624x3feaa97c(this, null), 3), null, 1, null);
        }

        @Override // androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures
        public ListenableFuture registerSourceAsync(Uri attributionSource, InputEvent inputEvent) {
            AbstractC6452k.m12181e(attributionSource, "attributionSource");
            return CoroutineAdapterKt.asListenableFuture$default(AbstractC0069y.m103b(AbstractC0069y.m102a(AbstractC0007H.f4a), new C1625x2c3ae252(this, attributionSource, inputEvent, null), 3), null, 1, null);
        }

        @Override // androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures
        public ListenableFuture registerTriggerAsync(Uri trigger) {
            AbstractC6452k.m12181e(trigger, "trigger");
            return CoroutineAdapterKt.asListenableFuture$default(AbstractC0069y.m103b(AbstractC0069y.m102a(AbstractC0007H.f4a), new C1627x9b0c78cd(this, trigger, null), 3), null, 1, null);
        }

        @Override // androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures
        public ListenableFuture registerWebSourceAsync(WebSourceRegistrationRequest request) {
            AbstractC6452k.m12181e(request, "request");
            return CoroutineAdapterKt.asListenableFuture$default(AbstractC0069y.m103b(AbstractC0069y.m102a(AbstractC0007H.f4a), new C1628x5537f716(this, request, null), 3), null, 1, null);
        }

        @Override // androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures
        public ListenableFuture registerWebTriggerAsync(WebTriggerRegistrationRequest request) {
            AbstractC6452k.m12181e(request, "request");
            return CoroutineAdapterKt.asListenableFuture$default(AbstractC0069y.m103b(AbstractC0069y.m102a(AbstractC0007H.f4a), new C1629x91b1fc89(this, request, null), 3), null, 1, null);
        }

        @Override // androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures
        @ExperimentalFeatures.RegisterSourceOptIn
        public ListenableFuture registerSourceAsync(SourceRegistrationRequest request) {
            AbstractC6452k.m12181e(request, "request");
            return CoroutineAdapterKt.asListenableFuture$default(AbstractC0069y.m103b(AbstractC0069y.m102a(AbstractC0007H.f4a), new C1626x2c3ae253(this, request, null), 3), null, 1, null);
        }
    }
}
