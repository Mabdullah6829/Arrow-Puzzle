package p006D0;

import p062g0.InterfaceC6348c;
import p066i0.AbstractC6373c;

/* JADX INFO: renamed from: D0.s */
/* JADX INFO: loaded from: classes.dex */
public final class C0184s extends AbstractC6373c {

    /* JADX INFO: renamed from: s */
    public /* synthetic */ Object f358s;

    /* JADX INFO: renamed from: t */
    public int f359t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ C0177l f360u;

    /* JADX INFO: renamed from: v */
    public C0181p f361v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0184s(C0177l c0177l, InterfaceC6348c interfaceC6348c) {
        super(interfaceC6348c);
        this.f360u = c0177l;
    }

    @Override // p066i0.AbstractC6371a
    public final Object invokeSuspend(Object obj) {
        this.f358s = obj;
        this.f359t |= Integer.MIN_VALUE;
        return this.f360u.collect(null, this);
    }
}
