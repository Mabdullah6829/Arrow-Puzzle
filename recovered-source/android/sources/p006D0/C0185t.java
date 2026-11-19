package p006D0;

import p062g0.InterfaceC6348c;
import p066i0.AbstractC6373c;

/* JADX INFO: renamed from: D0.t */
/* JADX INFO: loaded from: classes.dex */
public final class C0185t extends AbstractC6373c {

    /* JADX INFO: renamed from: s */
    public C0181p f362s;

    /* JADX INFO: renamed from: t */
    public /* synthetic */ Object f363t;

    /* JADX INFO: renamed from: u */
    public int f364u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ C0181p f365v;

    /* JADX INFO: renamed from: w */
    public Object f366w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0185t(C0181p c0181p, InterfaceC6348c interfaceC6348c) {
        super(interfaceC6348c);
        this.f365v = c0181p;
    }

    @Override // p066i0.AbstractC6371a
    public final Object invokeSuspend(Object obj) {
        this.f363t = obj;
        this.f364u |= Integer.MIN_VALUE;
        return this.f365v.emit(null, this);
    }
}
