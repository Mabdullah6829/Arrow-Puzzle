package androidx.privacysandbox.ads.adservices.topics;

import androidx.arch.core.executor.ExecutorC1058a;
import androidx.core.os.OutcomeReceiverKt;
import androidx.privacysandbox.ads.adservices.measurement.AbstractC1632b;
import kotlin.jvm.internal.AbstractC6452k;
import p000A0.C0039h;
import p011H.AbstractC0243G;
import p043a.AbstractC0878a;
import p062g0.InterfaceC6348c;
import p064h0.EnumC6363a;
import p066i0.AbstractC6373c;
import p066i0.InterfaceC6375e;

/* JADX INFO: loaded from: classes.dex */
public class TopicsManagerImplCommon extends TopicsManager {
    private final android.adservices.topics.TopicsManager mTopicsManager;

    /* JADX INFO: renamed from: androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon$getTopics$1 */
    @InterfaceC6375e(m12158c = "androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon", m12159f = "TopicsManagerImplCommon.kt", m12160l = {40}, m12161m = "getTopics$suspendImpl")
    public static final class C16331 extends AbstractC6373c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C16331(InterfaceC6348c interfaceC6348c) {
            super(interfaceC6348c);
        }

        @Override // p066i0.AbstractC6371a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TopicsManagerImplCommon.getTopics$suspendImpl(TopicsManagerImplCommon.this, null, this);
        }
    }

    public TopicsManagerImplCommon(android.adservices.topics.TopicsManager mTopicsManager) {
        AbstractC6452k.m12181e(mTopicsManager, "mTopicsManager");
        this.mTopicsManager = mTopicsManager;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Object getTopics$suspendImpl(TopicsManagerImplCommon topicsManagerImplCommon, GetTopicsRequest getTopicsRequest, InterfaceC6348c interfaceC6348c) throws Throwable {
        C16331 c16331;
        if (interfaceC6348c instanceof C16331) {
            c16331 = (C16331) interfaceC6348c;
            int i2 = c16331.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c16331.label = i2 - Integer.MIN_VALUE;
            } else {
                c16331 = topicsManagerImplCommon.new C16331(interfaceC6348c);
            }
        } else {
            c16331 = topicsManagerImplCommon.new C16331(interfaceC6348c);
        }
        Object topicsAsyncInternal = c16331.result;
        EnumC6363a enumC6363a = EnumC6363a.f24419s;
        int i3 = c16331.label;
        if (i3 == 0) {
            AbstractC0243G.m377o(topicsAsyncInternal);
            android.adservices.topics.GetTopicsRequest getTopicsRequestConvertRequest$ads_adservices_release = topicsManagerImplCommon.convertRequest$ads_adservices_release(getTopicsRequest);
            c16331.L$0 = topicsManagerImplCommon;
            c16331.label = 1;
            topicsAsyncInternal = topicsManagerImplCommon.getTopicsAsyncInternal(getTopicsRequestConvertRequest$ads_adservices_release, c16331);
            if (topicsAsyncInternal == enumC6363a) {
                return enumC6363a;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            topicsManagerImplCommon = (TopicsManagerImplCommon) c16331.L$0;
            AbstractC0243G.m377o(topicsAsyncInternal);
        }
        return topicsManagerImplCommon.convertResponse$ads_adservices_release(AbstractC1632b.m2633q(topicsAsyncInternal));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object getTopicsAsyncInternal(android.adservices.topics.GetTopicsRequest getTopicsRequest, InterfaceC6348c interfaceC6348c) {
        C0039h c0039h = new C0039h(1, AbstractC0878a.m1802m(interfaceC6348c));
        c0039h.m86r();
        this.mTopicsManager.getTopics(getTopicsRequest, new ExecutorC1058a(2), OutcomeReceiverKt.asOutcomeReceiver(c0039h));
        Object objM85q = c0039h.m85q();
        EnumC6363a enumC6363a = EnumC6363a.f24419s;
        return objM85q;
    }

    public android.adservices.topics.GetTopicsRequest convertRequest$ads_adservices_release(GetTopicsRequest request) {
        AbstractC6452k.m12181e(request, "request");
        return GetTopicsRequestHelper.INSTANCE.convertRequestWithoutRecordObservation$ads_adservices_release(request);
    }

    public GetTopicsResponse convertResponse$ads_adservices_release(android.adservices.topics.GetTopicsResponse response) {
        AbstractC6452k.m12181e(response, "response");
        return GetTopicsResponseHelper.INSTANCE.convertResponse$ads_adservices_release(response);
    }

    @Override // androidx.privacysandbox.ads.adservices.topics.TopicsManager
    public Object getTopics(GetTopicsRequest getTopicsRequest, InterfaceC6348c interfaceC6348c) {
        return getTopics$suspendImpl(this, getTopicsRequest, interfaceC6348c);
    }
}
