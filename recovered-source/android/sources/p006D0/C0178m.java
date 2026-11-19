package p006D0;

import p062g0.InterfaceC6348c;
import p066i0.AbstractC6373c;

/* JADX INFO: renamed from: D0.m */
/* JADX INFO: loaded from: classes.dex */
public final class C0178m extends AbstractC6373c {

    /* JADX INFO: renamed from: s */
    public /* synthetic */ Object f334s;

    /* JADX INFO: renamed from: t */
    public int f335t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ C0177l f336u;

    /* JADX INFO: renamed from: v */
    public C0177l f337v;

    /* JADX INFO: renamed from: w */
    public InterfaceC0171f f338w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0178m(C0177l c0177l, InterfaceC6348c interfaceC6348c) {
        super(interfaceC6348c);
        this.f336u = c0177l;
    }

    @Override // p066i0.AbstractC6371a
    public final Object invokeSuspend(Object obj) {
        this.f334s = obj;
        this.f335t |= Integer.MIN_VALUE;
        return this.f336u.collect(null, this);
    }
}
