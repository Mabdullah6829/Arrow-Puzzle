package androidx.privacysandbox.ads.adservices.measurement;

import android.content.Context;
import androidx.privacysandbox.ads.adservices.customaudience.AbstractC1613a;
import kotlin.jvm.internal.AbstractC6452k;

/* JADX INFO: loaded from: classes.dex */
public final class MeasurementManagerApi33Ext5Impl extends MeasurementManagerImplCommon {
    /* JADX WARN: Illegal instructions before constructor call */
    public MeasurementManagerApi33Ext5Impl(Context context) {
        AbstractC6452k.m12181e(context, "context");
        Object systemService = context.getSystemService((Class<Object>) AbstractC1613a.m2574s());
        AbstractC6452k.m12180d(systemService, "context.getSystemService…ementManager::class.java)");
        super(AbstractC1613a.m2571p(systemService));
    }
}
