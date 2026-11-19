package androidx.privacysandbox.ads.adservices.customaudience;

import android.content.Context;
import androidx.privacysandbox.ads.adservices.appsetid.AbstractC1612a;
import kotlin.jvm.internal.AbstractC6452k;

/* JADX INFO: loaded from: classes.dex */
public final class CustomAudienceManagerApi33Ext4Impl extends CustomAudienceManagerImplCommon {
    /* JADX WARN: Illegal instructions before constructor call */
    public CustomAudienceManagerApi33Ext4Impl(Context context) {
        AbstractC6452k.m12181e(context, "context");
        Object systemService = context.getSystemService((Class<Object>) AbstractC1612a.m2525D());
        AbstractC6452k.m12180d(systemService, "context.getSystemService…ger::class.java\n        )");
        super(AbstractC1612a.m2545t(systemService));
    }
}
