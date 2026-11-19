package com.google.android.gms.internal.ads;

import p000A0.InterfaceC0066v;
import p011H.AbstractC0243G;
import p057d0.C6289k;
import p062g0.InterfaceC6348c;
import p064h0.EnumC6363a;
import p066i0.AbstractC6379i;
import p078p0.InterfaceC6502p;

/* JADX INFO: loaded from: classes2.dex */
final class zzgcd extends AbstractC6379i implements InterfaceC6502p {

    /* JADX INFO: renamed from: s */
    public int f16932s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ zzgcp f16933t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ String f16934u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgcd(zzgcp zzgcpVar, String str, InterfaceC6348c interfaceC6348c) {
        super(2, interfaceC6348c);
        this.f16933t = zzgcpVar;
        this.f16934u = str;
    }

    @Override // p066i0.AbstractC6371a
    public final InterfaceC6348c create(Object obj, InterfaceC6348c interfaceC6348c) {
        return new zzgcd(this.f16933t, this.f16934u, interfaceC6348c);
    }

    @Override // p078p0.InterfaceC6502p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzgcd) create((InterfaceC0066v) obj, (InterfaceC6348c) obj2)).invokeSuspend(C6289k.f24318a);
    }

    @Override // p066i0.AbstractC6371a
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC6363a enumC6363a = EnumC6363a.f24419s;
        int i2 = this.f16932s;
        AbstractC0243G.m377o(obj);
        if (i2 == 0) {
            this.f16932s = 1;
            if (zzgcp.m6871e(this.f16933t, this.f16934u, this) == enumC6363a) {
                return enumC6363a;
            }
        }
        return C6289k.f24318a;
    }
}
