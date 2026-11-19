package androidx.privacysandbox.ads.adservices.adid;

import android.content.Context;
import kotlin.jvm.internal.AbstractC6452k;

/* JADX INFO: loaded from: classes.dex */
public final class AdIdManagerApi31Ext9Impl extends AdIdManagerImplCommon {
    /* JADX WARN: Illegal instructions before constructor call */
    public AdIdManagerApi31Ext9Impl(Context context) {
        AbstractC6452k.m12181e(context, "context");
        android.adservices.adid.AdIdManager adIdManager = android.adservices.adid.AdIdManager.get(context);
        AbstractC6452k.m12180d(adIdManager, "get(context)");
        super(adIdManager);
    }
}
