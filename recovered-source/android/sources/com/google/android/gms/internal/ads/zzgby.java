package com.google.android.gms.internal.ads;

import kotlin.jvm.internal.AbstractC6452k;
import p011H.AbstractC0243G;
import p057d0.C6289k;
import p062g0.InterfaceC6348c;
import p064h0.EnumC6363a;
import p066i0.AbstractC6379i;
import p078p0.InterfaceC6502p;

/* JADX INFO: loaded from: classes2.dex */
final class zzgby extends AbstractC6379i implements InterfaceC6502p {
    @Override // p066i0.AbstractC6371a
    public final InterfaceC6348c create(Object obj, InterfaceC6348c interfaceC6348c) {
        return new zzgby(2, interfaceC6348c);
    }

    @Override // p078p0.InterfaceC6502p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzgby) create((zzgbi) obj, (InterfaceC6348c) obj2)).invokeSuspend(C6289k.f24318a);
    }

    @Override // p066i0.AbstractC6371a
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC6363a enumC6363a = EnumC6363a.f24419s;
        AbstractC0243G.m377o(obj);
        zzgbi zzgbiVarM6865G = zzgbi.m6865G();
        AbstractC6452k.m12180d(zzgbiVarM6865G, "getDefaultInstance(...)");
        return zzgbiVarM6865G;
    }
}
