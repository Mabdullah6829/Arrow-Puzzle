package androidx.privacysandbox.ads.adservices.customaudience;

import android.content.Context;
import kotlin.jvm.internal.AbstractC6452k;
import kotlin.jvm.internal.AbstractC6453l;
import p078p0.InterfaceC6498l;

/* JADX INFO: loaded from: classes.dex */
public final class CustomAudienceManager$Companion$obtain$1 extends AbstractC6453l implements InterfaceC6498l {
    final /* synthetic */ Context $context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomAudienceManager$Companion$obtain$1(Context context) {
        super(1);
        this.$context = context;
    }

    @Override // p078p0.InterfaceC6498l
    public final CustomAudienceManagerApi31Ext9Impl invoke(Context it) {
        AbstractC6452k.m12181e(it, "it");
        return new CustomAudienceManagerApi31Ext9Impl(this.$context);
    }
}
