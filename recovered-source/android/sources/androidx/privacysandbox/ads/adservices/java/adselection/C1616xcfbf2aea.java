package androidx.privacysandbox.ads.adservices.java.adselection;

import androidx.privacysandbox.ads.adservices.adselection.AdSelectionManager;
import androidx.privacysandbox.ads.adservices.adselection.PersistAdSelectionResultRequest;
import kotlin.jvm.internal.AbstractC6452k;
import p000A0.InterfaceC0066v;
import p011H.AbstractC0243G;
import p057d0.C6289k;
import p062g0.InterfaceC6348c;
import p064h0.EnumC6363a;
import p066i0.AbstractC6379i;
import p066i0.InterfaceC6375e;
import p078p0.InterfaceC6502p;

/* JADX INFO: renamed from: androidx.privacysandbox.ads.adservices.java.adselection.AdSelectionManagerFutures$Api33Ext4JavaImpl$persistAdSelectionResultAsync$1 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6375e(m12158c = "androidx.privacysandbox.ads.adservices.java.adselection.AdSelectionManagerFutures$Api33Ext4JavaImpl$persistAdSelectionResultAsync$1", m12159f = "AdSelectionManagerFutures.kt", m12160l = {373}, m12161m = "invokeSuspend")
public final class C1616xcfbf2aea extends AbstractC6379i implements InterfaceC6502p {
    final /* synthetic */ PersistAdSelectionResultRequest $persistAdSelectionResultRequest;
    int label;
    final /* synthetic */ AdSelectionManagerFutures.Api33Ext4JavaImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1616xcfbf2aea(AdSelectionManagerFutures.Api33Ext4JavaImpl api33Ext4JavaImpl, PersistAdSelectionResultRequest persistAdSelectionResultRequest, InterfaceC6348c interfaceC6348c) {
        super(2, interfaceC6348c);
        this.this$0 = api33Ext4JavaImpl;
        this.$persistAdSelectionResultRequest = persistAdSelectionResultRequest;
    }

    @Override // p066i0.AbstractC6371a
    public final InterfaceC6348c create(Object obj, InterfaceC6348c interfaceC6348c) {
        return new C1616xcfbf2aea(this.this$0, this.$persistAdSelectionResultRequest, interfaceC6348c);
    }

    @Override // p078p0.InterfaceC6502p
    public final Object invoke(InterfaceC0066v interfaceC0066v, InterfaceC6348c interfaceC6348c) {
        return ((C1616xcfbf2aea) create(interfaceC0066v, interfaceC6348c)).invokeSuspend(C6289k.f24318a);
    }

    @Override // p066i0.AbstractC6371a
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC6363a enumC6363a = EnumC6363a.f24419s;
        int i2 = this.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0243G.m377o(obj);
            return obj;
        }
        AbstractC0243G.m377o(obj);
        AdSelectionManager adSelectionManager = this.this$0.mAdSelectionManager;
        AbstractC6452k.m12178b(adSelectionManager);
        PersistAdSelectionResultRequest persistAdSelectionResultRequest = this.$persistAdSelectionResultRequest;
        this.label = 1;
        Object objPersistAdSelectionResult = adSelectionManager.persistAdSelectionResult(persistAdSelectionResultRequest, this);
        return objPersistAdSelectionResult == enumC6363a ? enumC6363a : objPersistAdSelectionResult;
    }
}
