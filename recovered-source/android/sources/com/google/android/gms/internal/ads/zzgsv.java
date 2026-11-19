package com.google.android.gms.internal.ads;

import p000A0.C0034e0;
import p000A0.C0065u;
import p000A0.InterfaceC0022X;
import p000A0.InterfaceC0066v;
import p010F0.C0231q;
import p011H.AbstractC0243G;
import p014I0.C0315d;
import p014I0.InterfaceC0312a;
import p037U0.AbstractC0846b;
import p043a.AbstractC0878a;
import p057d0.C6289k;
import p062g0.InterfaceC6348c;
import p064h0.EnumC6363a;
import p066i0.AbstractC6379i;
import p078p0.InterfaceC6502p;

/* JADX INFO: loaded from: classes2.dex */
final class zzgsv extends AbstractC6379i implements InterfaceC6502p {

    /* JADX INFO: renamed from: s */
    public AbstractC6379i f18160s;

    /* JADX INFO: renamed from: t */
    public int f18161t;

    /* JADX INFO: renamed from: u */
    public /* synthetic */ Object f18162u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ zzgst f18163v;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ AbstractC6379i f18164w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public zzgsv(zzgst zzgstVar, InterfaceC6502p interfaceC6502p, InterfaceC6348c interfaceC6348c) {
        super(2, interfaceC6348c);
        this.f18163v = zzgstVar;
        this.f18164w = (AbstractC6379i) interfaceC6502p;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [i0.i, p0.p] */
    @Override // p066i0.AbstractC6371a
    public final InterfaceC6348c create(Object obj, InterfaceC6348c interfaceC6348c) {
        zzgsv zzgsvVar = new zzgsv(this.f18163v, this.f18164w, interfaceC6348c);
        zzgsvVar.f18162u = obj;
        return zzgsvVar;
    }

    @Override // p078p0.InterfaceC6502p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzgsv) create((InterfaceC0066v) obj, (InterfaceC6348c) obj2)).invokeSuspend(C6289k.f24318a);
    }

    @Override // p066i0.AbstractC6371a
    public final Object invokeSuspend(Object obj) throws Throwable {
        InterfaceC0312a interfaceC0312a;
        EnumC6363a enumC6363a = EnumC6363a.f24419s;
        int i2 = this.f18161t;
        if (i2 == 0) {
            AbstractC0243G.m377o(obj);
            InterfaceC0022X interfaceC0022X = (InterfaceC0022X) ((InterfaceC0066v) this.f18162u).getCoroutineContext().get(C0065u.f80t);
            if (interfaceC0022X != null && !interfaceC0022X.mo28c()) {
                throw ((C0034e0) interfaceC0022X).m67u();
            }
            C0315d c0315d = this.f18163v.f18158a;
            this.f18162u = c0315d;
            this.f18160s = this.f18164w;
            this.f18161t = 1;
            if (AbstractC0878a.m1805r(zzgsu.f18159s, c0315d, this) != enumC6363a) {
                AbstractC0878a.m1802m(this).resumeWith(C6289k.f24318a);
            }
            return enumC6363a;
        }
        if (i2 != 1) {
            interfaceC0312a = (InterfaceC0312a) this.f18162u;
            try {
                AbstractC0243G.m377o(obj);
                ((C0315d) interfaceC0312a).m464f(null);
                return obj;
            } catch (Throwable th) {
                th = th;
                ((C0315d) interfaceC0312a).m464f(null);
                throw th;
            }
        }
        InterfaceC6502p interfaceC6502p = (InterfaceC6502p) this.f18160s;
        InterfaceC0312a interfaceC0312a2 = (InterfaceC0312a) this.f18162u;
        AbstractC0243G.m377o(obj);
        try {
            this.f18162u = interfaceC0312a2;
            this.f18160s = null;
            this.f18161t = 2;
            C0231q c0231q = new C0231q(this, getContext());
            obj = AbstractC0846b.m1756o(c0231q, c0231q, interfaceC6502p);
            if (obj == enumC6363a) {
                return enumC6363a;
            }
            interfaceC0312a = interfaceC0312a2;
            ((C0315d) interfaceC0312a).m464f(null);
            return obj;
        } catch (Throwable th2) {
            th = th2;
            interfaceC0312a = interfaceC0312a2;
            ((C0315d) interfaceC0312a).m464f(null);
            throw th;
        }
    }
}
