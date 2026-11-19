package androidx.privacysandbox.ads.adservices.adselection;

import p062g0.InterfaceC6348c;
import p066i0.AbstractC6373c;
import p066i0.InterfaceC6375e;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC6375e(m12158c = "androidx.privacysandbox.ads.adservices.adselection.AdSelectionManagerImplCommon$Ext10Impl$Companion", m12159f = "AdSelectionManagerImplCommon.kt", m12160l = {231}, m12161m = "selectAds")
public final class AdSelectionManagerImplCommon$Ext10Impl$Companion$selectAds$1 extends AbstractC6373c {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AdSelectionManagerImplCommon.Ext10Impl.Companion this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdSelectionManagerImplCommon$Ext10Impl$Companion$selectAds$1(AdSelectionManagerImplCommon.Ext10Impl.Companion companion, InterfaceC6348c interfaceC6348c) {
        super(interfaceC6348c);
        this.this$0 = companion;
    }

    @Override // p066i0.AbstractC6371a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.selectAds(null, null, this);
    }
}
