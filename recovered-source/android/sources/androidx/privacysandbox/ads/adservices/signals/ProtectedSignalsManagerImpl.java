package androidx.privacysandbox.ads.adservices.signals;

import androidx.arch.core.executor.ExecutorC1058a;
import androidx.core.os.OutcomeReceiverKt;
import androidx.privacysandbox.ads.adservices.common.ExperimentalFeatures;
import androidx.privacysandbox.ads.adservices.topics.AbstractC1634a;
import kotlin.jvm.internal.AbstractC6452k;
import p000A0.C0039h;
import p043a.AbstractC0878a;
import p057d0.C6289k;
import p062g0.InterfaceC6348c;
import p064h0.EnumC6363a;

/* JADX INFO: loaded from: classes.dex */
@ExperimentalFeatures.Ext12OptIn
public class ProtectedSignalsManagerImpl extends ProtectedSignalsManager {
    private final android.adservices.signals.ProtectedSignalsManager protectedSignalsManager;

    public ProtectedSignalsManagerImpl(android.adservices.signals.ProtectedSignalsManager protectedSignalsManager) {
        AbstractC6452k.m12181e(protectedSignalsManager, "protectedSignalsManager");
        this.protectedSignalsManager = protectedSignalsManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final android.adservices.signals.UpdateSignalsRequest convertUpdateRequest(UpdateSignalsRequest updateSignalsRequest) {
        AbstractC1634a.m2649g();
        android.adservices.signals.UpdateSignalsRequest updateSignalsRequestBuild = AbstractC1634a.m2644b(updateSignalsRequest.getUpdateUri()).build();
        AbstractC6452k.m12180d(updateSignalsRequestBuild, "Builder(request.updateUri).build()");
        return updateSignalsRequestBuild;
    }

    public static Object updateSignals$suspendImpl(ProtectedSignalsManagerImpl protectedSignalsManagerImpl, UpdateSignalsRequest updateSignalsRequest, InterfaceC6348c interfaceC6348c) {
        C0039h c0039h = new C0039h(1, AbstractC0878a.m1802m(interfaceC6348c));
        c0039h.m86r();
        protectedSignalsManagerImpl.protectedSignalsManager.updateSignals(protectedSignalsManagerImpl.convertUpdateRequest(updateSignalsRequest), new ExecutorC1058a(2), OutcomeReceiverKt.asOutcomeReceiver(c0039h));
        Object objM85q = c0039h.m85q();
        return objM85q == EnumC6363a.f24419s ? objM85q : C6289k.f24318a;
    }

    @Override // androidx.privacysandbox.ads.adservices.signals.ProtectedSignalsManager
    public Object updateSignals(UpdateSignalsRequest updateSignalsRequest, InterfaceC6348c interfaceC6348c) {
        return updateSignals$suspendImpl(this, updateSignalsRequest, interfaceC6348c);
    }
}
