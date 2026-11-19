package androidx.privacysandbox.ads.adservices.customaudience;

import android.content.Context;
import kotlin.jvm.internal.AbstractC6452k;

/* JADX INFO: loaded from: classes.dex */
public final class CustomAudienceManagerApi31Ext9Impl extends CustomAudienceManagerImplCommon {
    /* JADX WARN: Illegal instructions before constructor call */
    public CustomAudienceManagerApi31Ext9Impl(Context context) {
        AbstractC6452k.m12181e(context, "context");
        android.adservices.customaudience.CustomAudienceManager customAudienceManager = android.adservices.customaudience.CustomAudienceManager.get(context);
        AbstractC6452k.m12180d(customAudienceManager, "get(context)");
        super(customAudienceManager);
    }
}
