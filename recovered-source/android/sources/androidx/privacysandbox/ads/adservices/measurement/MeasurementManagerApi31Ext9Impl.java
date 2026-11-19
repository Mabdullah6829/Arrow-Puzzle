package androidx.privacysandbox.ads.adservices.measurement;

import android.content.Context;
import kotlin.jvm.internal.AbstractC6452k;

/* JADX INFO: loaded from: classes.dex */
public final class MeasurementManagerApi31Ext9Impl extends MeasurementManagerImplCommon {
    /* JADX WARN: Illegal instructions before constructor call */
    public MeasurementManagerApi31Ext9Impl(Context context) {
        AbstractC6452k.m12181e(context, "context");
        android.adservices.measurement.MeasurementManager measurementManager = android.adservices.measurement.MeasurementManager.get(context);
        AbstractC6452k.m12180d(measurementManager, "get(context)");
        super(measurementManager);
    }
}
