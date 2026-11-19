package androidx.privacysandbox.ads.adservices.adselection;

import androidx.arch.core.executor.ExecutorC1058a;
import androidx.core.app.AbstractC1156c;
import androidx.core.os.AbstractC1196a;
import androidx.core.os.OutcomeReceiverKt;
import androidx.privacysandbox.ads.adservices.internal.AdServicesInfo;
import kotlin.jvm.internal.AbstractC6447f;
import kotlin.jvm.internal.AbstractC6452k;
import p000A0.C0039h;
import p011H.AbstractC0243G;
import p043a.AbstractC0878a;
import p057d0.C6289k;
import p062g0.InterfaceC6348c;
import p064h0.EnumC6363a;
import p066i0.AbstractC6373c;
import p066i0.InterfaceC6375e;

/* JADX INFO: loaded from: classes.dex */
public class AdSelectionManagerImplCommon extends AdSelectionManager {
    private final android.adservices.adselection.AdSelectionManager mAdSelectionManager;

    public static final class Ext10Impl {
        public static final Companion Companion = new Companion(null);

        public static final class Companion {
            public /* synthetic */ Companion(AbstractC6447f abstractC6447f) {
                this();
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            public final Object getAdSelectionData(android.adservices.adselection.AdSelectionManager adSelectionManager, GetAdSelectionDataRequest getAdSelectionDataRequest, InterfaceC6348c interfaceC6348c) throws Throwable {
                C1607xa603879b c1607xa603879b;
                if (interfaceC6348c instanceof C1607xa603879b) {
                    c1607xa603879b = (C1607xa603879b) interfaceC6348c;
                    int i2 = c1607xa603879b.label;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        c1607xa603879b.label = i2 - Integer.MIN_VALUE;
                    } else {
                        c1607xa603879b = new C1607xa603879b(this, interfaceC6348c);
                    }
                } else {
                    c1607xa603879b = new C1607xa603879b(this, interfaceC6348c);
                }
                Object objM85q = c1607xa603879b.result;
                EnumC6363a enumC6363a = EnumC6363a.f24419s;
                int i3 = c1607xa603879b.label;
                if (i3 == 0) {
                    AbstractC0243G.m377o(objM85q);
                    c1607xa603879b.L$0 = adSelectionManager;
                    c1607xa603879b.L$1 = getAdSelectionDataRequest;
                    c1607xa603879b.label = 1;
                    C0039h c0039h = new C0039h(1, AbstractC0878a.m1802m(c1607xa603879b));
                    c0039h.m86r();
                    adSelectionManager.getAdSelectionData(getAdSelectionDataRequest.convertToAdServices$ads_adservices_release(), new ExecutorC1058a(2), OutcomeReceiverKt.asOutcomeReceiver(c0039h));
                    objM85q = c0039h.m85q();
                    if (objM85q == enumC6363a) {
                        return enumC6363a;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC1156c.m2018z(c1607xa603879b.L$0);
                    AbstractC0243G.m377o(objM85q);
                }
                return new GetAdSelectionDataOutcome(AbstractC1196a.m2249h(objM85q));
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            public final Object persistAdSelectionResult(android.adservices.adselection.AdSelectionManager adSelectionManager, PersistAdSelectionResultRequest persistAdSelectionResultRequest, InterfaceC6348c interfaceC6348c) throws Throwable {
                C1608x1c76ae90 c1608x1c76ae90;
                if (interfaceC6348c instanceof C1608x1c76ae90) {
                    c1608x1c76ae90 = (C1608x1c76ae90) interfaceC6348c;
                    int i2 = c1608x1c76ae90.label;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        c1608x1c76ae90.label = i2 - Integer.MIN_VALUE;
                    } else {
                        c1608x1c76ae90 = new C1608x1c76ae90(this, interfaceC6348c);
                    }
                } else {
                    c1608x1c76ae90 = new C1608x1c76ae90(this, interfaceC6348c);
                }
                Object objM85q = c1608x1c76ae90.result;
                EnumC6363a enumC6363a = EnumC6363a.f24419s;
                int i3 = c1608x1c76ae90.label;
                if (i3 == 0) {
                    AbstractC0243G.m377o(objM85q);
                    c1608x1c76ae90.L$0 = adSelectionManager;
                    c1608x1c76ae90.L$1 = persistAdSelectionResultRequest;
                    c1608x1c76ae90.label = 1;
                    C0039h c0039h = new C0039h(1, AbstractC0878a.m1802m(c1608x1c76ae90));
                    c0039h.m86r();
                    adSelectionManager.persistAdSelectionResult(persistAdSelectionResultRequest.convertToAdServices$ads_adservices_release(), new ExecutorC1058a(2), OutcomeReceiverKt.asOutcomeReceiver(c0039h));
                    objM85q = c0039h.m85q();
                    if (objM85q == enumC6363a) {
                        return enumC6363a;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC1156c.m2018z(c1608x1c76ae90.L$0);
                    AbstractC0243G.m377o(objM85q);
                }
                return new AdSelectionOutcome(AbstractC1156c.m2007o(objM85q));
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            public final Object selectAds(android.adservices.adselection.AdSelectionManager adSelectionManager, AdSelectionFromOutcomesConfig adSelectionFromOutcomesConfig, InterfaceC6348c interfaceC6348c) throws Throwable {
                AdSelectionManagerImplCommon$Ext10Impl$Companion$selectAds$1 adSelectionManagerImplCommon$Ext10Impl$Companion$selectAds$1;
                if (interfaceC6348c instanceof AdSelectionManagerImplCommon$Ext10Impl$Companion$selectAds$1) {
                    adSelectionManagerImplCommon$Ext10Impl$Companion$selectAds$1 = (AdSelectionManagerImplCommon$Ext10Impl$Companion$selectAds$1) interfaceC6348c;
                    int i2 = adSelectionManagerImplCommon$Ext10Impl$Companion$selectAds$1.label;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        adSelectionManagerImplCommon$Ext10Impl$Companion$selectAds$1.label = i2 - Integer.MIN_VALUE;
                    } else {
                        adSelectionManagerImplCommon$Ext10Impl$Companion$selectAds$1 = new AdSelectionManagerImplCommon$Ext10Impl$Companion$selectAds$1(this, interfaceC6348c);
                    }
                } else {
                    adSelectionManagerImplCommon$Ext10Impl$Companion$selectAds$1 = new AdSelectionManagerImplCommon$Ext10Impl$Companion$selectAds$1(this, interfaceC6348c);
                }
                Object objM85q = adSelectionManagerImplCommon$Ext10Impl$Companion$selectAds$1.result;
                EnumC6363a enumC6363a = EnumC6363a.f24419s;
                int i3 = adSelectionManagerImplCommon$Ext10Impl$Companion$selectAds$1.label;
                if (i3 == 0) {
                    AbstractC0243G.m377o(objM85q);
                    adSelectionManagerImplCommon$Ext10Impl$Companion$selectAds$1.L$0 = adSelectionManager;
                    adSelectionManagerImplCommon$Ext10Impl$Companion$selectAds$1.L$1 = adSelectionFromOutcomesConfig;
                    adSelectionManagerImplCommon$Ext10Impl$Companion$selectAds$1.label = 1;
                    C0039h c0039h = new C0039h(1, AbstractC0878a.m1802m(adSelectionManagerImplCommon$Ext10Impl$Companion$selectAds$1));
                    c0039h.m86r();
                    adSelectionManager.selectAds(adSelectionFromOutcomesConfig.convertToAdServices$ads_adservices_release(), new ExecutorC1058a(2), OutcomeReceiverKt.asOutcomeReceiver(c0039h));
                    objM85q = c0039h.m85q();
                    if (objM85q == enumC6363a) {
                        return enumC6363a;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC1156c.m2018z(adSelectionManagerImplCommon$Ext10Impl$Companion$selectAds$1.L$0);
                    AbstractC0243G.m377o(objM85q);
                }
                return new AdSelectionOutcome(AbstractC1156c.m2007o(objM85q));
            }

            private Companion() {
            }
        }

        private Ext10Impl() {
        }
    }

    public static final class Ext8Impl {
        public static final Companion Companion = new Companion(null);

        public static final class Companion {
            public /* synthetic */ Companion(AbstractC6447f abstractC6447f) {
                this();
            }

            public final Object reportEvent(android.adservices.adselection.AdSelectionManager adSelectionManager, ReportEventRequest reportEventRequest, InterfaceC6348c interfaceC6348c) {
                C0039h c0039h = new C0039h(1, AbstractC0878a.m1802m(interfaceC6348c));
                c0039h.m86r();
                adSelectionManager.reportEvent(reportEventRequest.convertToAdServices$ads_adservices_release(), new ExecutorC1058a(2), OutcomeReceiverKt.asOutcomeReceiver(c0039h));
                Object objM85q = c0039h.m85q();
                return objM85q == EnumC6363a.f24419s ? objM85q : C6289k.f24318a;
            }

            public final Object updateAdCounterHistogram(android.adservices.adselection.AdSelectionManager adSelectionManager, UpdateAdCounterHistogramRequest updateAdCounterHistogramRequest, InterfaceC6348c interfaceC6348c) {
                C0039h c0039h = new C0039h(1, AbstractC0878a.m1802m(interfaceC6348c));
                c0039h.m86r();
                adSelectionManager.updateAdCounterHistogram(updateAdCounterHistogramRequest.convertToAdServices$ads_adservices_release(), new ExecutorC1058a(2), OutcomeReceiverKt.asOutcomeReceiver(c0039h));
                Object objM85q = c0039h.m85q();
                return objM85q == EnumC6363a.f24419s ? objM85q : C6289k.f24318a;
            }

            private Companion() {
            }
        }

        private Ext8Impl() {
        }
    }

    /* JADX INFO: renamed from: androidx.privacysandbox.ads.adservices.adselection.AdSelectionManagerImplCommon$selectAds$1 */
    @InterfaceC6375e(m12158c = "androidx.privacysandbox.ads.adservices.adselection.AdSelectionManagerImplCommon", m12159f = "AdSelectionManagerImplCommon.kt", m12160l = {44}, m12161m = "selectAds$suspendImpl")
    public static final class C16091 extends AbstractC6373c {
        int label;
        /* synthetic */ Object result;

        public C16091(InterfaceC6348c interfaceC6348c) {
            super(interfaceC6348c);
        }

        @Override // p066i0.AbstractC6371a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AdSelectionManagerImplCommon.selectAds$suspendImpl(AdSelectionManagerImplCommon.this, (AdSelectionConfig) null, this);
        }
    }

    public AdSelectionManagerImplCommon(android.adservices.adselection.AdSelectionManager mAdSelectionManager) {
        AbstractC6452k.m12181e(mAdSelectionManager, "mAdSelectionManager");
        this.mAdSelectionManager = mAdSelectionManager;
    }

    public static /* synthetic */ Object getAdSelectionData$suspendImpl(AdSelectionManagerImplCommon adSelectionManagerImplCommon, GetAdSelectionDataRequest getAdSelectionDataRequest, InterfaceC6348c interfaceC6348c) {
        AdServicesInfo adServicesInfo = AdServicesInfo.INSTANCE;
        if (adServicesInfo.adServicesVersion() >= 10 || adServicesInfo.extServicesVersionS() >= 10) {
            return Ext10Impl.Companion.getAdSelectionData(adSelectionManagerImplCommon.mAdSelectionManager, getAdSelectionDataRequest, interfaceC6348c);
        }
        throw new UnsupportedOperationException("API is not available. Min version is API 31 ext 10");
    }

    public static /* synthetic */ Object persistAdSelectionResult$suspendImpl(AdSelectionManagerImplCommon adSelectionManagerImplCommon, PersistAdSelectionResultRequest persistAdSelectionResultRequest, InterfaceC6348c interfaceC6348c) {
        AdServicesInfo adServicesInfo = AdServicesInfo.INSTANCE;
        if (adServicesInfo.adServicesVersion() >= 10 || adServicesInfo.extServicesVersionS() >= 10) {
            return Ext10Impl.Companion.persistAdSelectionResult(adSelectionManagerImplCommon.mAdSelectionManager, persistAdSelectionResultRequest, interfaceC6348c);
        }
        throw new UnsupportedOperationException("API is not available. Min version is API 31 ext 10");
    }

    public static Object reportEvent$suspendImpl(AdSelectionManagerImplCommon adSelectionManagerImplCommon, ReportEventRequest reportEventRequest, InterfaceC6348c interfaceC6348c) {
        AdServicesInfo adServicesInfo = AdServicesInfo.INSTANCE;
        if (adServicesInfo.adServicesVersion() < 8 && adServicesInfo.extServicesVersionS() < 9) {
            throw new UnsupportedOperationException("API is unsupported. Min version is API 33 ext 8 or API 31/32 ext 9");
        }
        Object objReportEvent = Ext8Impl.Companion.reportEvent(adSelectionManagerImplCommon.mAdSelectionManager, reportEventRequest, interfaceC6348c);
        return objReportEvent == EnumC6363a.f24419s ? objReportEvent : C6289k.f24318a;
    }

    public static Object reportImpression$suspendImpl(AdSelectionManagerImplCommon adSelectionManagerImplCommon, ReportImpressionRequest reportImpressionRequest, InterfaceC6348c interfaceC6348c) {
        C0039h c0039h = new C0039h(1, AbstractC0878a.m1802m(interfaceC6348c));
        c0039h.m86r();
        adSelectionManagerImplCommon.getMAdSelectionManager().reportImpression(reportImpressionRequest.convertToAdServices$ads_adservices_release(), new ExecutorC1058a(2), OutcomeReceiverKt.asOutcomeReceiver(c0039h));
        Object objM85q = c0039h.m85q();
        return objM85q == EnumC6363a.f24419s ? objM85q : C6289k.f24318a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Object selectAds$suspendImpl(AdSelectionManagerImplCommon adSelectionManagerImplCommon, AdSelectionConfig adSelectionConfig, InterfaceC6348c interfaceC6348c) throws Throwable {
        C16091 c16091;
        if (interfaceC6348c instanceof C16091) {
            c16091 = (C16091) interfaceC6348c;
            int i2 = c16091.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c16091.label = i2 - Integer.MIN_VALUE;
            } else {
                c16091 = adSelectionManagerImplCommon.new C16091(interfaceC6348c);
            }
        } else {
            c16091 = adSelectionManagerImplCommon.new C16091(interfaceC6348c);
        }
        Object objSelectAdsInternal = c16091.result;
        Object obj = EnumC6363a.f24419s;
        int i3 = c16091.label;
        if (i3 == 0) {
            AbstractC0243G.m377o(objSelectAdsInternal);
            android.adservices.adselection.AdSelectionConfig adSelectionConfigConvertToAdServices$ads_adservices_release = adSelectionConfig.convertToAdServices$ads_adservices_release();
            c16091.label = 1;
            objSelectAdsInternal = adSelectionManagerImplCommon.selectAdsInternal(adSelectionConfigConvertToAdServices$ads_adservices_release, c16091);
            if (objSelectAdsInternal == obj) {
                return obj;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0243G.m377o(objSelectAdsInternal);
        }
        return new AdSelectionOutcome(AbstractC1156c.m2007o(objSelectAdsInternal));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object selectAdsInternal(android.adservices.adselection.AdSelectionConfig adSelectionConfig, InterfaceC6348c interfaceC6348c) {
        C0039h c0039h = new C0039h(1, AbstractC0878a.m1802m(interfaceC6348c));
        c0039h.m86r();
        getMAdSelectionManager().selectAds(adSelectionConfig, new ExecutorC1058a(2), OutcomeReceiverKt.asOutcomeReceiver(c0039h));
        Object objM85q = c0039h.m85q();
        EnumC6363a enumC6363a = EnumC6363a.f24419s;
        return objM85q;
    }

    public static Object updateAdCounterHistogram$suspendImpl(AdSelectionManagerImplCommon adSelectionManagerImplCommon, UpdateAdCounterHistogramRequest updateAdCounterHistogramRequest, InterfaceC6348c interfaceC6348c) {
        AdServicesInfo adServicesInfo = AdServicesInfo.INSTANCE;
        if (adServicesInfo.adServicesVersion() < 8 && adServicesInfo.extServicesVersionS() < 9) {
            throw new UnsupportedOperationException("API is unsupported. Min version is API 33 ext 8 or API 31/32 ext 9");
        }
        Object objUpdateAdCounterHistogram = Ext8Impl.Companion.updateAdCounterHistogram(adSelectionManagerImplCommon.mAdSelectionManager, updateAdCounterHistogramRequest, interfaceC6348c);
        return objUpdateAdCounterHistogram == EnumC6363a.f24419s ? objUpdateAdCounterHistogram : C6289k.f24318a;
    }

    @Override // androidx.privacysandbox.ads.adservices.adselection.AdSelectionManager
    public Object getAdSelectionData(GetAdSelectionDataRequest getAdSelectionDataRequest, InterfaceC6348c interfaceC6348c) {
        return getAdSelectionData$suspendImpl(this, getAdSelectionDataRequest, interfaceC6348c);
    }

    public final android.adservices.adselection.AdSelectionManager getMAdSelectionManager() {
        return this.mAdSelectionManager;
    }

    @Override // androidx.privacysandbox.ads.adservices.adselection.AdSelectionManager
    public Object persistAdSelectionResult(PersistAdSelectionResultRequest persistAdSelectionResultRequest, InterfaceC6348c interfaceC6348c) {
        return persistAdSelectionResult$suspendImpl(this, persistAdSelectionResultRequest, interfaceC6348c);
    }

    @Override // androidx.privacysandbox.ads.adservices.adselection.AdSelectionManager
    public Object reportEvent(ReportEventRequest reportEventRequest, InterfaceC6348c interfaceC6348c) {
        return reportEvent$suspendImpl(this, reportEventRequest, interfaceC6348c);
    }

    @Override // androidx.privacysandbox.ads.adservices.adselection.AdSelectionManager
    public Object reportImpression(ReportImpressionRequest reportImpressionRequest, InterfaceC6348c interfaceC6348c) {
        return reportImpression$suspendImpl(this, reportImpressionRequest, interfaceC6348c);
    }

    @Override // androidx.privacysandbox.ads.adservices.adselection.AdSelectionManager
    public Object selectAds(AdSelectionConfig adSelectionConfig, InterfaceC6348c interfaceC6348c) {
        return selectAds$suspendImpl(this, adSelectionConfig, interfaceC6348c);
    }

    @Override // androidx.privacysandbox.ads.adservices.adselection.AdSelectionManager
    public Object updateAdCounterHistogram(UpdateAdCounterHistogramRequest updateAdCounterHistogramRequest, InterfaceC6348c interfaceC6348c) {
        return updateAdCounterHistogram$suspendImpl(this, updateAdCounterHistogramRequest, interfaceC6348c);
    }

    @Override // androidx.privacysandbox.ads.adservices.adselection.AdSelectionManager
    public Object selectAds(AdSelectionFromOutcomesConfig adSelectionFromOutcomesConfig, InterfaceC6348c interfaceC6348c) {
        return selectAds$suspendImpl(this, adSelectionFromOutcomesConfig, interfaceC6348c);
    }

    public static /* synthetic */ Object selectAds$suspendImpl(AdSelectionManagerImplCommon adSelectionManagerImplCommon, AdSelectionFromOutcomesConfig adSelectionFromOutcomesConfig, InterfaceC6348c interfaceC6348c) {
        AdServicesInfo adServicesInfo = AdServicesInfo.INSTANCE;
        if (adServicesInfo.adServicesVersion() < 10 && adServicesInfo.extServicesVersionS() < 10) {
            throw new UnsupportedOperationException("API is not available. Min version is API 31 ext 10");
        }
        return Ext10Impl.Companion.selectAds(adSelectionManagerImplCommon.mAdSelectionManager, adSelectionFromOutcomesConfig, interfaceC6348c);
    }
}
