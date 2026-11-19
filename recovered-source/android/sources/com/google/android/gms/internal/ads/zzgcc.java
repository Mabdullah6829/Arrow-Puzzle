package com.google.android.gms.internal.ads;

import java.util.Collections;
import kotlin.jvm.internal.AbstractC6452k;
import p011H.AbstractC0243G;
import p057d0.C6289k;
import p062g0.InterfaceC6348c;
import p064h0.EnumC6363a;
import p066i0.AbstractC6379i;
import p078p0.InterfaceC6502p;

/* JADX INFO: loaded from: classes2.dex */
final class zzgcc extends AbstractC6379i implements InterfaceC6502p {

    /* JADX INFO: renamed from: s */
    public /* synthetic */ Object f16930s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ zzgbe f16931t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgcc(zzgbe zzgbeVar, InterfaceC6348c interfaceC6348c) {
        super(2, interfaceC6348c);
        this.f16931t = zzgbeVar;
    }

    @Override // p066i0.AbstractC6371a
    public final InterfaceC6348c create(Object obj, InterfaceC6348c interfaceC6348c) {
        zzgcc zzgccVar = new zzgcc(this.f16931t, interfaceC6348c);
        zzgccVar.f16930s = obj;
        return zzgccVar;
    }

    @Override // p078p0.InterfaceC6502p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzgcc) create((zzgbi) obj, (InterfaceC6348c) obj2)).invokeSuspend(C6289k.f24318a);
    }

    @Override // p066i0.AbstractC6371a
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC6363a enumC6363a = EnumC6363a.f24419s;
        AbstractC0243G.m377o(obj);
        zzgbg zzgbgVar = (zzgbg) ((zzgbi) this.f16930s).m8347w();
        AbstractC6452k.m12180d(Collections.unmodifiableMap(((zzgbi) zzgbgVar.f19780t).m6867E()), "getQueryIdToAdQualityDataMapMap(...)");
        zzgbe zzgbeVar = this.f16931t;
        String strM6840G = zzgbeVar.m6840G();
        AbstractC6452k.m12180d(strM6840G, "getGwsQueryId(...)");
        zzgbgVar.m8326l();
        ((zzgbi) zzgbgVar.f19780t).m6868H().put(strM6840G, zzgbeVar);
        return (zzgbi) zzgbgVar.m8328o();
    }
}
