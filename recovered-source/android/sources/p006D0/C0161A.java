package p006D0;

import p000A0.InterfaceC0022X;
import p062g0.InterfaceC6348c;
import p064h0.EnumC6363a;
import p066i0.AbstractC6373c;

/* JADX INFO: renamed from: D0.A */
/* JADX INFO: loaded from: classes.dex */
public final class C0161A extends AbstractC6373c {

    /* JADX INFO: renamed from: s */
    public C0162B f281s;

    /* JADX INFO: renamed from: t */
    public InterfaceC0171f f282t;

    /* JADX INFO: renamed from: u */
    public C0164D f283u;

    /* JADX INFO: renamed from: v */
    public InterfaceC0022X f284v;

    /* JADX INFO: renamed from: w */
    public Object f285w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ Object f286x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C0162B f287y;

    /* JADX INFO: renamed from: z */
    public int f288z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0161A(C0162B c0162b, InterfaceC6348c interfaceC6348c) {
        super(interfaceC6348c);
        this.f287y = c0162b;
    }

    @Override // p066i0.AbstractC6371a
    public final Object invokeSuspend(Object obj) throws Throwable {
        this.f286x = obj;
        this.f288z |= Integer.MIN_VALUE;
        this.f287y.collect(null, this);
        return EnumC6363a.f24419s;
    }
}
