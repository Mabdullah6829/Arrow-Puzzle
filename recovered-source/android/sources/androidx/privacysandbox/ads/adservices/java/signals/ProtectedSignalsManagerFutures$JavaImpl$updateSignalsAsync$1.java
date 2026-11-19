package androidx.privacysandbox.ads.adservices.java.signals;

import androidx.privacysandbox.ads.adservices.signals.ProtectedSignalsManager;
import androidx.privacysandbox.ads.adservices.signals.UpdateSignalsRequest;
import kotlin.jvm.internal.AbstractC6452k;
import p000A0.InterfaceC0066v;
import p011H.AbstractC0243G;
import p057d0.C6289k;
import p062g0.InterfaceC6348c;
import p064h0.EnumC6363a;
import p066i0.AbstractC6379i;
import p066i0.InterfaceC6375e;
import p078p0.InterfaceC6502p;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC6375e(m12158c = "androidx.privacysandbox.ads.adservices.java.signals.ProtectedSignalsManagerFutures$JavaImpl$updateSignalsAsync$1", m12159f = "ProtectedSignalsManagerFutures.kt", m12160l = {111}, m12161m = "invokeSuspend")
public final class ProtectedSignalsManagerFutures$JavaImpl$updateSignalsAsync$1 extends AbstractC6379i implements InterfaceC6502p {
    final /* synthetic */ UpdateSignalsRequest $request;
    int label;
    final /* synthetic */ ProtectedSignalsManagerFutures.JavaImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProtectedSignalsManagerFutures$JavaImpl$updateSignalsAsync$1(ProtectedSignalsManagerFutures.JavaImpl javaImpl, UpdateSignalsRequest updateSignalsRequest, InterfaceC6348c interfaceC6348c) {
        super(2, interfaceC6348c);
        this.this$0 = javaImpl;
        this.$request = updateSignalsRequest;
    }

    @Override // p066i0.AbstractC6371a
    public final InterfaceC6348c create(Object obj, InterfaceC6348c interfaceC6348c) {
        return new ProtectedSignalsManagerFutures$JavaImpl$updateSignalsAsync$1(this.this$0, this.$request, interfaceC6348c);
    }

    @Override // p078p0.InterfaceC6502p
    public final Object invoke(InterfaceC0066v interfaceC0066v, InterfaceC6348c interfaceC6348c) {
        return ((ProtectedSignalsManagerFutures$JavaImpl$updateSignalsAsync$1) create(interfaceC0066v, interfaceC6348c)).invokeSuspend(C6289k.f24318a);
    }

    @Override // p066i0.AbstractC6371a
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC6363a enumC6363a = EnumC6363a.f24419s;
        int i2 = this.label;
        if (i2 == 0) {
            AbstractC0243G.m377o(obj);
            ProtectedSignalsManager protectedSignalsManager = this.this$0.mProtectedSignalsManager;
            AbstractC6452k.m12178b(protectedSignalsManager);
            UpdateSignalsRequest updateSignalsRequest = this.$request;
            this.label = 1;
            if (protectedSignalsManager.updateSignals(updateSignalsRequest, this) == enumC6363a) {
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
