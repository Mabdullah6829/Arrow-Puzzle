package com.google.android.gms.internal.measurement;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;
import p001B.C0083i;
import p011H.AbstractC0253Q;
import p011H.C0292u;
import p011H.EnumC0244H;
import p011H.InterfaceC0238B;

/* JADX INFO: loaded from: classes2.dex */
final class zzus implements zzth {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzut f22957a;

    public /* synthetic */ zzus(zztp zztpVar) {
        Objects.requireNonNull(zztpVar);
        this.f22957a = zztpVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzth
    /* JADX INFO: renamed from: a */
    public final C0292u mo10659a(final zzwy zzwyVar) {
        ListenableFuture listenableFutureM382e = AbstractC0253Q.m382e(this.f22957a.f22962e.m10671a());
        InterfaceC0238B interfaceC0238B = new InterfaceC0238B() { // from class: com.google.android.gms.internal.measurement.zzur
            @Override // p011H.InterfaceC0238B
            public final /* synthetic */ ListenableFuture apply(Object obj) {
                return this.f22955a.f22957a.f22960c.mo10662a(zzwyVar, EnumC0244H.f483s);
            }
        };
        int i2 = zzxa.f23060a;
        zzwy zzwyVar2 = new zzwy(zzvy.m10684a(), interfaceC0238B);
        EnumC0244H enumC0244H = EnumC0244H.f483s;
        return AbstractC0253Q.m383f(AbstractC0253Q.m384g(listenableFutureM382e, zzwyVar2, enumC0244H), new C0083i(), enumC0244H);
    }
}
