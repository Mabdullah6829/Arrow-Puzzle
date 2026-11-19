package p006D0;

import p062g0.InterfaceC6348c;
import p066i0.AbstractC6373c;

/* JADX INFO: renamed from: D0.i */
/* JADX INFO: loaded from: classes.dex */
public final class C0174i extends AbstractC6373c {

    /* JADX INFO: renamed from: s */
    public /* synthetic */ Object f318s;

    /* JADX INFO: renamed from: t */
    public int f319t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ C0175j f320u;

    /* JADX INFO: renamed from: v */
    public Object f321v;

    /* JADX INFO: renamed from: w */
    public InterfaceC0171f f322w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0174i(C0175j c0175j, InterfaceC6348c interfaceC6348c) {
        super(interfaceC6348c);
        this.f320u = c0175j;
    }

    @Override // p066i0.AbstractC6371a
    public final Object invokeSuspend(Object obj) {
        this.f318s = obj;
        this.f319t |= Integer.MIN_VALUE;
        return this.f320u.collect(null, this);
    }
}
