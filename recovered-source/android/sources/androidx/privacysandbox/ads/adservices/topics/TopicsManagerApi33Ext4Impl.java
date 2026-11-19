package androidx.privacysandbox.ads.adservices.topics;

import android.content.Context;
import androidx.privacysandbox.ads.adservices.measurement.AbstractC1632b;
import kotlin.jvm.internal.AbstractC6452k;

/* JADX INFO: loaded from: classes.dex */
public final class TopicsManagerApi33Ext4Impl extends TopicsManagerImplCommon {
    /* JADX WARN: Illegal instructions before constructor call */
    public TopicsManagerApi33Ext4Impl(Context context) {
        AbstractC6452k.m12181e(context, "context");
        Object systemService = context.getSystemService((Class<Object>) AbstractC1632b.m2637u());
        AbstractC6452k.m12180d(systemService, "context.getSystemService…opicsManager::class.java)");
        super(AbstractC1632b.m2636t(systemService));
    }
}
