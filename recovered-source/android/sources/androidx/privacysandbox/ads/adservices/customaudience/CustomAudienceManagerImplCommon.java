package androidx.privacysandbox.ads.adservices.customaudience;

import android.adservices.common.AdData;
import androidx.arch.core.executor.ExecutorC1058a;
import androidx.core.os.OutcomeReceiverKt;
import androidx.privacysandbox.ads.adservices.appsetid.AbstractC1612a;
import androidx.privacysandbox.ads.adservices.common.AdSelectionSignals;
import androidx.privacysandbox.ads.adservices.internal.AdServicesInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC6447f;
import kotlin.jvm.internal.AbstractC6452k;
import p000A0.C0039h;
import p043a.AbstractC0878a;
import p057d0.C6289k;
import p062g0.InterfaceC6348c;
import p064h0.EnumC6363a;

/* JADX INFO: loaded from: classes.dex */
public class CustomAudienceManagerImplCommon extends CustomAudienceManager {
    private final android.adservices.customaudience.CustomAudienceManager customAudienceManager;

    public static final class Ext10Impl {
        public static final Companion Companion = new Companion(null);

        public static final class Companion {
            public /* synthetic */ Companion(AbstractC6447f abstractC6447f) {
                this();
            }

            public final Object fetchAndJoinCustomAudience(android.adservices.customaudience.CustomAudienceManager customAudienceManager, FetchAndJoinCustomAudienceRequest fetchAndJoinCustomAudienceRequest, InterfaceC6348c interfaceC6348c) {
                C0039h c0039h = new C0039h(1, AbstractC0878a.m1802m(interfaceC6348c));
                c0039h.m86r();
                customAudienceManager.fetchAndJoinCustomAudience(fetchAndJoinCustomAudienceRequest.convertToAdServices$ads_adservices_release(), new ExecutorC1058a(2), OutcomeReceiverKt.asOutcomeReceiver(c0039h));
                Object objM85q = c0039h.m85q();
                return objM85q == EnumC6363a.f24419s ? objM85q : C6289k.f24318a;
            }

            private Companion() {
            }
        }

        private Ext10Impl() {
        }
    }

    public CustomAudienceManagerImplCommon(android.adservices.customaudience.CustomAudienceManager customAudienceManager) {
        AbstractC6452k.m12181e(customAudienceManager, "customAudienceManager");
        this.customAudienceManager = customAudienceManager;
    }

    private final List<AdData> convertAds(List<androidx.privacysandbox.ads.adservices.common.AdData> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<androidx.privacysandbox.ads.adservices.common.AdData> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().convertToAdServices$ads_adservices_release());
        }
        return arrayList;
    }

    private final android.adservices.customaudience.CustomAudience convertCustomAudience(CustomAudience customAudience) {
        android.adservices.customaudience.CustomAudience.Builder trustedBiddingData = AbstractC1613a.m2556a().setActivationTime(customAudience.getActivationTime()).setAds(convertAds(customAudience.getAds())).setBiddingLogicUri(customAudience.getBiddingLogicUri()).setBuyer(customAudience.getBuyer().convertToAdServices$ads_adservices_release()).setDailyUpdateUri(customAudience.getDailyUpdateUri()).setExpirationTime(customAudience.getExpirationTime()).setName(customAudience.getName()).setTrustedBiddingData(convertTrustedSignals(customAudience.getTrustedBiddingSignals()));
        AdSelectionSignals userBiddingSignals = customAudience.getUserBiddingSignals();
        android.adservices.customaudience.CustomAudience customAudienceBuild = trustedBiddingData.setUserBiddingSignals(userBiddingSignals != null ? userBiddingSignals.convertToAdServices$ads_adservices_release() : null).build();
        AbstractC6452k.m12180d(customAudienceBuild, "Builder()\n            .s…s())\n            .build()");
        return customAudienceBuild;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final android.adservices.customaudience.JoinCustomAudienceRequest convertJoinRequest(JoinCustomAudienceRequest joinCustomAudienceRequest) {
        android.adservices.customaudience.JoinCustomAudienceRequest joinCustomAudienceRequestBuild = AbstractC1613a.m2558c().setCustomAudience(convertCustomAudience(joinCustomAudienceRequest.getCustomAudience())).build();
        AbstractC6452k.m12180d(joinCustomAudienceRequestBuild, "Builder()\n            .s…ce))\n            .build()");
        return joinCustomAudienceRequestBuild;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final android.adservices.customaudience.LeaveCustomAudienceRequest convertLeaveRequest(LeaveCustomAudienceRequest leaveCustomAudienceRequest) {
        android.adservices.customaudience.LeaveCustomAudienceRequest leaveCustomAudienceRequestBuild = AbstractC1612a.m2546u().setBuyer(leaveCustomAudienceRequest.getBuyer().convertToAdServices$ads_adservices_release()).setName(leaveCustomAudienceRequest.getName()).build();
        AbstractC6452k.m12180d(leaveCustomAudienceRequestBuild, "Builder()\n            .s…ame)\n            .build()");
        return leaveCustomAudienceRequestBuild;
    }

    private final android.adservices.customaudience.TrustedBiddingData convertTrustedSignals(TrustedBiddingData trustedBiddingData) {
        if (trustedBiddingData == null) {
            return null;
        }
        return AbstractC1612a.m2549x().setTrustedBiddingKeys(trustedBiddingData.getTrustedBiddingKeys()).setTrustedBiddingUri(trustedBiddingData.getTrustedBiddingUri()).build();
    }

    public static Object fetchAndJoinCustomAudience$suspendImpl(CustomAudienceManagerImplCommon customAudienceManagerImplCommon, FetchAndJoinCustomAudienceRequest fetchAndJoinCustomAudienceRequest, InterfaceC6348c interfaceC6348c) {
        AdServicesInfo adServicesInfo = AdServicesInfo.INSTANCE;
        if (adServicesInfo.adServicesVersion() < 10 && adServicesInfo.extServicesVersionS() < 10) {
            throw new UnsupportedOperationException("API is not available. Min version is API 31 ext 10");
        }
        Object objFetchAndJoinCustomAudience = Ext10Impl.Companion.fetchAndJoinCustomAudience(customAudienceManagerImplCommon.customAudienceManager, fetchAndJoinCustomAudienceRequest, interfaceC6348c);
        return objFetchAndJoinCustomAudience == EnumC6363a.f24419s ? objFetchAndJoinCustomAudience : C6289k.f24318a;
    }

    public static Object joinCustomAudience$suspendImpl(CustomAudienceManagerImplCommon customAudienceManagerImplCommon, JoinCustomAudienceRequest joinCustomAudienceRequest, InterfaceC6348c interfaceC6348c) {
        C0039h c0039h = new C0039h(1, AbstractC0878a.m1802m(interfaceC6348c));
        c0039h.m86r();
        customAudienceManagerImplCommon.getCustomAudienceManager().joinCustomAudience(customAudienceManagerImplCommon.convertJoinRequest(joinCustomAudienceRequest), new ExecutorC1058a(2), OutcomeReceiverKt.asOutcomeReceiver(c0039h));
        Object objM85q = c0039h.m85q();
        return objM85q == EnumC6363a.f24419s ? objM85q : C6289k.f24318a;
    }

    public static Object leaveCustomAudience$suspendImpl(CustomAudienceManagerImplCommon customAudienceManagerImplCommon, LeaveCustomAudienceRequest leaveCustomAudienceRequest, InterfaceC6348c interfaceC6348c) {
        C0039h c0039h = new C0039h(1, AbstractC0878a.m1802m(interfaceC6348c));
        c0039h.m86r();
        customAudienceManagerImplCommon.getCustomAudienceManager().leaveCustomAudience(customAudienceManagerImplCommon.convertLeaveRequest(leaveCustomAudienceRequest), new ExecutorC1058a(2), OutcomeReceiverKt.asOutcomeReceiver(c0039h));
        Object objM85q = c0039h.m85q();
        return objM85q == EnumC6363a.f24419s ? objM85q : C6289k.f24318a;
    }

    @Override // androidx.privacysandbox.ads.adservices.customaudience.CustomAudienceManager
    public Object fetchAndJoinCustomAudience(FetchAndJoinCustomAudienceRequest fetchAndJoinCustomAudienceRequest, InterfaceC6348c interfaceC6348c) {
        return fetchAndJoinCustomAudience$suspendImpl(this, fetchAndJoinCustomAudienceRequest, interfaceC6348c);
    }

    public final android.adservices.customaudience.CustomAudienceManager getCustomAudienceManager() {
        return this.customAudienceManager;
    }

    @Override // androidx.privacysandbox.ads.adservices.customaudience.CustomAudienceManager
    public Object joinCustomAudience(JoinCustomAudienceRequest joinCustomAudienceRequest, InterfaceC6348c interfaceC6348c) {
        return joinCustomAudience$suspendImpl(this, joinCustomAudienceRequest, interfaceC6348c);
    }

    @Override // androidx.privacysandbox.ads.adservices.customaudience.CustomAudienceManager
    public Object leaveCustomAudience(LeaveCustomAudienceRequest leaveCustomAudienceRequest, InterfaceC6348c interfaceC6348c) {
        return leaveCustomAudience$suspendImpl(this, leaveCustomAudienceRequest, interfaceC6348c);
    }
}
