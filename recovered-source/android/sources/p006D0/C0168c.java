package p006D0;

import p004C0.C0151p;
import p004C0.EnumC0136a;
import p004C0.InterfaceC0152q;
import p011H.AbstractC0243G;
import p057d0.C6289k;
import p062g0.InterfaceC6348c;
import p062g0.InterfaceC6353h;
import p064h0.EnumC6363a;
import p066i0.AbstractC6373c;
import p066i0.AbstractC6379i;
import p078p0.InterfaceC6502p;

/* JADX INFO: renamed from: D0.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0168c extends C0169d {

    /* JADX INFO: renamed from: x */
    public final AbstractC6379i f303x;

    /* JADX WARN: Multi-variable type inference failed */
    public C0168c(InterfaceC6502p interfaceC6502p, InterfaceC6353h interfaceC6353h, int i2, EnumC0136a enumC0136a) {
        super(interfaceC6502p, interfaceC6353h, i2, enumC0136a);
        this.f303x = (AbstractC6379i) interfaceC6502p;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p006D0.C0169d
    /* JADX INFO: renamed from: c */
    public final Object mo265c(InterfaceC0152q interfaceC0152q, InterfaceC6348c interfaceC6348c) throws Throwable {
        C0167b c0167b;
        if (interfaceC6348c instanceof C0167b) {
            c0167b = (C0167b) interfaceC6348c;
            int i2 = c0167b.f302v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c0167b.f302v = i2 - Integer.MIN_VALUE;
            } else {
                c0167b = new C0167b(this, (AbstractC6373c) interfaceC6348c);
            }
        } else {
            c0167b = new C0167b(this, (AbstractC6373c) interfaceC6348c);
        }
        Object obj = c0167b.f300t;
        Object obj2 = EnumC6363a.f24419s;
        int i3 = c0167b.f302v;
        if (i3 == 0) {
            AbstractC0243G.m377o(obj);
            c0167b.f299s = interfaceC0152q;
            c0167b.f302v = 1;
            if (super.mo265c(interfaceC0152q, c0167b) == obj2) {
                return obj2;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC0152q = c0167b.f299s;
            AbstractC0243G.m377o(obj);
        }
        if (((C0151p) interfaceC0152q).f269v.m240v()) {
            return C6289k.f24318a;
        }
        throw new IllegalStateException("'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details.");
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [i0.i, p0.p] */
    @Override // p006D0.C0169d
    /* JADX INFO: renamed from: d */
    public final C0169d mo266d(InterfaceC6353h interfaceC6353h, int i2, EnumC0136a enumC0136a) {
        return new C0168c(this.f303x, interfaceC6353h, i2, enumC0136a);
    }
}
