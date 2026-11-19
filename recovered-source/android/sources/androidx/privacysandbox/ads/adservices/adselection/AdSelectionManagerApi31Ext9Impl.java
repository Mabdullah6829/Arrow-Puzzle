package androidx.privacysandbox.ads.adservices.adselection;

import android.content.Context;
import kotlin.jvm.internal.AbstractC6452k;

/* JADX INFO: loaded from: classes.dex */
public final class AdSelectionManagerApi31Ext9Impl extends AdSelectionManagerImplCommon {
    /* JADX WARN: Illegal instructions before constructor call */
    public AdSelectionManagerApi31Ext9Impl(Context context) {
        AbstractC6452k.m12181e(context, "context");
        android.adservices.adselection.AdSelectionManager adSelectionManager = android.adservices.adselection.AdSelectionManager.get(context);
        AbstractC6452k.m12180d(adSelectionManager, "get(context)");
        super(adSelectionManager);
    }
}
