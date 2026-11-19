package androidx.privacysandbox.ads.adservices.adid;

import androidx.arch.core.executor.ExecutorC1058a;
import androidx.core.app.AbstractC1156c;
import androidx.core.os.OutcomeReceiverKt;
import kotlin.jvm.internal.AbstractC6452k;
import p000A0.C0039h;
import p011H.AbstractC0243G;
import p043a.AbstractC0878a;
import p062g0.InterfaceC6348c;
import p064h0.EnumC6363a;
import p066i0.AbstractC6373c;
import p066i0.InterfaceC6375e;

/* JADX INFO: loaded from: classes.dex */
public class AdIdManagerImplCommon extends AdIdManager {
    private final android.adservices.adid.AdIdManager mAdIdManager;

    /* JADX INFO: renamed from: androidx.privacysandbox.ads.adservices.adid.AdIdManagerImplCommon$getAdId$1 */
    @InterfaceC6375e(m12158c = "androidx.privacysandbox.ads.adservices.adid.AdIdManagerImplCommon", m12159f = "AdIdManagerImplCommon.kt", m12160l = {40}, m12161m = "getAdId$suspendImpl")
    public static final class C16061 extends AbstractC6373c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C16061(InterfaceC6348c interfaceC6348c) {
            super(interfaceC6348c);
        }

        @Override // p066i0.AbstractC6371a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AdIdManagerImplCommon.getAdId$suspendImpl(AdIdManagerImplCommon.this, this);
        }
    }

    public AdIdManagerImplCommon(android.adservices.adid.AdIdManager mAdIdManager) {
        AbstractC6452k.m12181e(mAdIdManager, "mAdIdManager");
        this.mAdIdManager = mAdIdManager;
    }

    private final AdId convertResponse(android.adservices.adid.AdId adId) {
        String adId2 = adId.getAdId();
        AbstractC6452k.m12180d(adId2, "response.adId");
        return new AdId(adId2, adId.isLimitAdTrackingEnabled());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Object getAdId$suspendImpl(AdIdManagerImplCommon adIdManagerImplCommon, InterfaceC6348c interfaceC6348c) throws Throwable {
        C16061 c16061;
        if (interfaceC6348c instanceof C16061) {
            c16061 = (C16061) interfaceC6348c;
            int i2 = c16061.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c16061.label = i2 - Integer.MIN_VALUE;
            } else {
                c16061 = adIdManagerImplCommon.new C16061(interfaceC6348c);
            }
        } else {
            c16061 = adIdManagerImplCommon.new C16061(interfaceC6348c);
        }
        Object adIdAsyncInternal = c16061.result;
        EnumC6363a enumC6363a = EnumC6363a.f24419s;
        int i3 = c16061.label;
        if (i3 == 0) {
            AbstractC0243G.m377o(adIdAsyncInternal);
            c16061.L$0 = adIdManagerImplCommon;
            c16061.label = 1;
            adIdAsyncInternal = adIdManagerImplCommon.getAdIdAsyncInternal(c16061);
            if (adIdAsyncInternal == enumC6363a) {
                return enumC6363a;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            adIdManagerImplCommon = (AdIdManagerImplCommon) c16061.L$0;
            AbstractC0243G.m377o(adIdAsyncInternal);
        }
        return adIdManagerImplCommon.convertResponse(AbstractC1156c.m1995c(adIdAsyncInternal));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object getAdIdAsyncInternal(InterfaceC6348c interfaceC6348c) {
        C0039h c0039h = new C0039h(1, AbstractC0878a.m1802m(interfaceC6348c));
        c0039h.m86r();
        this.mAdIdManager.getAdId(new ExecutorC1058a(2), OutcomeReceiverKt.asOutcomeReceiver(c0039h));
        Object objM85q = c0039h.m85q();
        EnumC6363a enumC6363a = EnumC6363a.f24419s;
        return objM85q;
    }

    @Override // androidx.privacysandbox.ads.adservices.adid.AdIdManager
    public Object getAdId(InterfaceC6348c interfaceC6348c) {
        return getAdId$suspendImpl(this, interfaceC6348c);
    }
}
