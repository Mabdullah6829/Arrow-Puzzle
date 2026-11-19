package androidx.privacysandbox.ads.adservices.java.customaudience;

import androidx.privacysandbox.ads.adservices.customaudience.CustomAudienceManager;
import androidx.privacysandbox.ads.adservices.customaudience.FetchAndJoinCustomAudienceRequest;
import kotlin.jvm.internal.AbstractC6452k;
import p000A0.InterfaceC0066v;
import p011H.AbstractC0243G;
import p057d0.C6289k;
import p062g0.InterfaceC6348c;
import p064h0.EnumC6363a;
import p066i0.AbstractC6379i;
import p066i0.InterfaceC6375e;
import p078p0.InterfaceC6502p;

/* JADX INFO: renamed from: androidx.privacysandbox.ads.adservices.java.customaudience.CustomAudienceManagerFutures$Api33Ext4JavaImpl$fetchAndJoinCustomAudienceAsync$1 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6375e(m12158c = "androidx.privacysandbox.ads.adservices.java.customaudience.CustomAudienceManagerFutures$Api33Ext4JavaImpl$fetchAndJoinCustomAudienceAsync$1", m12159f = "CustomAudienceManagerFutures.kt", m12160l = {156}, m12161m = "invokeSuspend")
public final class C1619x423c6ecc extends AbstractC6379i implements InterfaceC6502p {
    final /* synthetic */ FetchAndJoinCustomAudienceRequest $request;
    int label;
    final /* synthetic */ CustomAudienceManagerFutures.Api33Ext4JavaImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1619x423c6ecc(CustomAudienceManagerFutures.Api33Ext4JavaImpl api33Ext4JavaImpl, FetchAndJoinCustomAudienceRequest fetchAndJoinCustomAudienceRequest, InterfaceC6348c interfaceC6348c) {
        super(2, interfaceC6348c);
        this.this$0 = api33Ext4JavaImpl;
        this.$request = fetchAndJoinCustomAudienceRequest;
    }

    @Override // p066i0.AbstractC6371a
    public final InterfaceC6348c create(Object obj, InterfaceC6348c interfaceC6348c) {
        return new C1619x423c6ecc(this.this$0, this.$request, interfaceC6348c);
    }

    @Override // p078p0.InterfaceC6502p
    public final Object invoke(InterfaceC0066v interfaceC0066v, InterfaceC6348c interfaceC6348c) {
        return ((C1619x423c6ecc) create(interfaceC0066v, interfaceC6348c)).invokeSuspend(C6289k.f24318a);
    }

    @Override // p066i0.AbstractC6371a
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC6363a enumC6363a = EnumC6363a.f24419s;
        int i2 = this.label;
        if (i2 == 0) {
            AbstractC0243G.m377o(obj);
            CustomAudienceManager customAudienceManager = this.this$0.mCustomAudienceManager;
            AbstractC6452k.m12178b(customAudienceManager);
            FetchAndJoinCustomAudienceRequest fetchAndJoinCustomAudienceRequest = this.$request;
            this.label = 1;
            if (customAudienceManager.fetchAndJoinCustomAudience(fetchAndJoinCustomAudienceRequest, this) == enumC6363a) {
                return enumC6363a;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0243G.m377o(obj);
        }
        return C6289k.f24318a;
    }
}
