package androidx.privacysandbox.ads.adservices.measurement;

import android.net.Uri;
import android.view.InputEvent;
import androidx.arch.core.executor.ExecutorC1058a;
import androidx.core.os.OutcomeReceiverKt;
import androidx.privacysandbox.ads.adservices.common.ExperimentalFeatures;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC6452k;
import p000A0.AbstractC0069y;
import p000A0.C0039h;
import p000A0.InterfaceC0066v;
import p010F0.C0231q;
import p011H.AbstractC0243G;
import p037U0.AbstractC0846b;
import p043a.AbstractC0878a;
import p057d0.C6289k;
import p062g0.InterfaceC6348c;
import p064h0.EnumC6363a;
import p066i0.AbstractC6379i;
import p066i0.InterfaceC6375e;
import p078p0.InterfaceC6502p;

/* JADX INFO: loaded from: classes.dex */
public class MeasurementManagerImplCommon extends MeasurementManager {
    private final android.adservices.measurement.MeasurementManager mMeasurementManager;

    /* JADX INFO: renamed from: androidx.privacysandbox.ads.adservices.measurement.MeasurementManagerImplCommon$registerSource$4 */
    @InterfaceC6375e(m12158c = "androidx.privacysandbox.ads.adservices.measurement.MeasurementManagerImplCommon$registerSource$4", m12159f = "MeasurementManagerImplCommon.kt", m12160l = {}, m12161m = "invokeSuspend")
    public static final class C16304 extends AbstractC6379i implements InterfaceC6502p {
        final /* synthetic */ SourceRegistrationRequest $request;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ MeasurementManagerImplCommon this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16304(SourceRegistrationRequest sourceRegistrationRequest, MeasurementManagerImplCommon measurementManagerImplCommon, InterfaceC6348c interfaceC6348c) {
            super(2, interfaceC6348c);
            this.$request = sourceRegistrationRequest;
            this.this$0 = measurementManagerImplCommon;
        }

        @Override // p066i0.AbstractC6371a
        public final InterfaceC6348c create(Object obj, InterfaceC6348c interfaceC6348c) {
            C16304 c16304 = new C16304(this.$request, this.this$0, interfaceC6348c);
            c16304.L$0 = obj;
            return c16304;
        }

        @Override // p078p0.InterfaceC6502p
        public final Object invoke(InterfaceC0066v interfaceC0066v, InterfaceC6348c interfaceC6348c) {
            return ((C16304) create(interfaceC0066v, interfaceC6348c)).invokeSuspend(C6289k.f24318a);
        }

        @Override // p066i0.AbstractC6371a
        public final Object invokeSuspend(Object obj) throws Throwable {
            EnumC6363a enumC6363a = EnumC6363a.f24419s;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0243G.m377o(obj);
            InterfaceC0066v interfaceC0066v = (InterfaceC0066v) this.L$0;
            List<Uri> registrationUris = this.$request.getRegistrationUris();
            MeasurementManagerImplCommon measurementManagerImplCommon = this.this$0;
            SourceRegistrationRequest sourceRegistrationRequest = this.$request;
            Iterator<T> it = registrationUris.iterator();
            while (it.hasNext()) {
                AbstractC0069y.m111j(interfaceC0066v, null, new MeasurementManagerImplCommon$registerSource$4$1$1(measurementManagerImplCommon, (Uri) it.next(), sourceRegistrationRequest, null), 3);
            }
            return C6289k.f24318a;
        }
    }

    public MeasurementManagerImplCommon(android.adservices.measurement.MeasurementManager mMeasurementManager) {
        AbstractC6452k.m12181e(mMeasurementManager, "mMeasurementManager");
        this.mMeasurementManager = mMeasurementManager;
    }

    public static Object deleteRegistrations$suspendImpl(MeasurementManagerImplCommon measurementManagerImplCommon, DeletionRequest deletionRequest, InterfaceC6348c interfaceC6348c) {
        C0039h c0039h = new C0039h(1, AbstractC0878a.m1802m(interfaceC6348c));
        c0039h.m86r();
        measurementManagerImplCommon.getMMeasurementManager().deleteRegistrations(deletionRequest.convertToAdServices$ads_adservices_release(), new ExecutorC1058a(2), OutcomeReceiverKt.asOutcomeReceiver(c0039h));
        Object objM85q = c0039h.m85q();
        return objM85q == EnumC6363a.f24419s ? objM85q : C6289k.f24318a;
    }

    public static Object getMeasurementApiStatus$suspendImpl(MeasurementManagerImplCommon measurementManagerImplCommon, InterfaceC6348c interfaceC6348c) {
        C0039h c0039h = new C0039h(1, AbstractC0878a.m1802m(interfaceC6348c));
        c0039h.m86r();
        measurementManagerImplCommon.getMMeasurementManager().getMeasurementApiStatus(new ExecutorC1058a(2), OutcomeReceiverKt.asOutcomeReceiver(c0039h));
        Object objM85q = c0039h.m85q();
        EnumC6363a enumC6363a = EnumC6363a.f24419s;
        return objM85q;
    }

    @ExperimentalFeatures.RegisterSourceOptIn
    public static Object registerSource$suspendImpl(MeasurementManagerImplCommon measurementManagerImplCommon, SourceRegistrationRequest sourceRegistrationRequest, InterfaceC6348c interfaceC6348c) {
        C16304 c16304 = new C16304(sourceRegistrationRequest, measurementManagerImplCommon, null);
        C0231q c0231q = new C0231q(interfaceC6348c, interfaceC6348c.getContext());
        Object objM1756o = AbstractC0846b.m1756o(c0231q, c0231q, c16304);
        return objM1756o == EnumC6363a.f24419s ? objM1756o : C6289k.f24318a;
    }

    public static Object registerTrigger$suspendImpl(MeasurementManagerImplCommon measurementManagerImplCommon, Uri uri, InterfaceC6348c interfaceC6348c) {
        C0039h c0039h = new C0039h(1, AbstractC0878a.m1802m(interfaceC6348c));
        c0039h.m86r();
        measurementManagerImplCommon.getMMeasurementManager().registerTrigger(uri, new ExecutorC1058a(2), OutcomeReceiverKt.asOutcomeReceiver(c0039h));
        Object objM85q = c0039h.m85q();
        return objM85q == EnumC6363a.f24419s ? objM85q : C6289k.f24318a;
    }

    public static Object registerWebSource$suspendImpl(MeasurementManagerImplCommon measurementManagerImplCommon, WebSourceRegistrationRequest webSourceRegistrationRequest, InterfaceC6348c interfaceC6348c) {
        C0039h c0039h = new C0039h(1, AbstractC0878a.m1802m(interfaceC6348c));
        c0039h.m86r();
        measurementManagerImplCommon.getMMeasurementManager().registerWebSource(webSourceRegistrationRequest.convertToAdServices$ads_adservices_release(), new ExecutorC1058a(2), OutcomeReceiverKt.asOutcomeReceiver(c0039h));
        Object objM85q = c0039h.m85q();
        return objM85q == EnumC6363a.f24419s ? objM85q : C6289k.f24318a;
    }

    public static Object registerWebTrigger$suspendImpl(MeasurementManagerImplCommon measurementManagerImplCommon, WebTriggerRegistrationRequest webTriggerRegistrationRequest, InterfaceC6348c interfaceC6348c) {
        C0039h c0039h = new C0039h(1, AbstractC0878a.m1802m(interfaceC6348c));
        c0039h.m86r();
        measurementManagerImplCommon.getMMeasurementManager().registerWebTrigger(webTriggerRegistrationRequest.convertToAdServices$ads_adservices_release(), new ExecutorC1058a(2), OutcomeReceiverKt.asOutcomeReceiver(c0039h));
        Object objM85q = c0039h.m85q();
        return objM85q == EnumC6363a.f24419s ? objM85q : C6289k.f24318a;
    }

    @Override // androidx.privacysandbox.ads.adservices.measurement.MeasurementManager
    public Object deleteRegistrations(DeletionRequest deletionRequest, InterfaceC6348c interfaceC6348c) {
        return deleteRegistrations$suspendImpl(this, deletionRequest, interfaceC6348c);
    }

    public final android.adservices.measurement.MeasurementManager getMMeasurementManager() {
        return this.mMeasurementManager;
    }

    @Override // androidx.privacysandbox.ads.adservices.measurement.MeasurementManager
    public Object getMeasurementApiStatus(InterfaceC6348c interfaceC6348c) {
        return getMeasurementApiStatus$suspendImpl(this, interfaceC6348c);
    }

    @Override // androidx.privacysandbox.ads.adservices.measurement.MeasurementManager
    public Object registerSource(Uri uri, InputEvent inputEvent, InterfaceC6348c interfaceC6348c) {
        return registerSource$suspendImpl(this, uri, inputEvent, interfaceC6348c);
    }

    @Override // androidx.privacysandbox.ads.adservices.measurement.MeasurementManager
    public Object registerTrigger(Uri uri, InterfaceC6348c interfaceC6348c) {
        return registerTrigger$suspendImpl(this, uri, interfaceC6348c);
    }

    @Override // androidx.privacysandbox.ads.adservices.measurement.MeasurementManager
    public Object registerWebSource(WebSourceRegistrationRequest webSourceRegistrationRequest, InterfaceC6348c interfaceC6348c) {
        return registerWebSource$suspendImpl(this, webSourceRegistrationRequest, interfaceC6348c);
    }

    @Override // androidx.privacysandbox.ads.adservices.measurement.MeasurementManager
    public Object registerWebTrigger(WebTriggerRegistrationRequest webTriggerRegistrationRequest, InterfaceC6348c interfaceC6348c) {
        return registerWebTrigger$suspendImpl(this, webTriggerRegistrationRequest, interfaceC6348c);
    }

    @Override // androidx.privacysandbox.ads.adservices.measurement.MeasurementManager
    @ExperimentalFeatures.RegisterSourceOptIn
    public Object registerSource(SourceRegistrationRequest sourceRegistrationRequest, InterfaceC6348c interfaceC6348c) {
        return registerSource$suspendImpl(this, sourceRegistrationRequest, interfaceC6348c);
    }

    public static Object registerSource$suspendImpl(MeasurementManagerImplCommon measurementManagerImplCommon, Uri uri, InputEvent inputEvent, InterfaceC6348c interfaceC6348c) {
        C0039h c0039h = new C0039h(1, AbstractC0878a.m1802m(interfaceC6348c));
        c0039h.m86r();
        measurementManagerImplCommon.getMMeasurementManager().registerSource(uri, inputEvent, new ExecutorC1058a(2), OutcomeReceiverKt.asOutcomeReceiver(c0039h));
        Object objM85q = c0039h.m85q();
        return objM85q == EnumC6363a.f24419s ? objM85q : C6289k.f24318a;
    }
}
