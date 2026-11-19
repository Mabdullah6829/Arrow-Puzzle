package androidx.privacysandbox.ads.adservices.appsetid;

import android.content.Context;
import kotlin.jvm.internal.AbstractC6452k;

/* JADX INFO: loaded from: classes.dex */
public final class AppSetIdManagerApi31Ext9Impl extends AppSetIdManagerImplCommon {
    /* JADX WARN: Illegal instructions before constructor call */
    public AppSetIdManagerApi31Ext9Impl(Context context) {
        AbstractC6452k.m12181e(context, "context");
        android.adservices.appsetid.AppSetIdManager appSetIdManager = android.adservices.appsetid.AppSetIdManager.get(context);
        AbstractC6452k.m12180d(appSetIdManager, "get(context)");
        super(appSetIdManager);
    }
}
