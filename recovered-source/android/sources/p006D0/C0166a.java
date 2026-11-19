package p006D0;

import p001B.C0092r;
import p008E0.C0206i;
import p062g0.InterfaceC6348c;
import p066i0.AbstractC6373c;

/* JADX INFO: renamed from: D0.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0166a extends AbstractC6373c {

    /* JADX INFO: renamed from: s */
    public C0206i f295s;

    /* JADX INFO: renamed from: t */
    public /* synthetic */ Object f296t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ C0092r f297u;

    /* JADX INFO: renamed from: v */
    public int f298v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0166a(C0092r c0092r, InterfaceC6348c interfaceC6348c) {
        super(interfaceC6348c);
        this.f297u = c0092r;
    }

    @Override // p066i0.AbstractC6371a
    public final Object invokeSuspend(Object obj) {
        this.f296t = obj;
        this.f298v |= Integer.MIN_VALUE;
        return this.f297u.collect(null, this);
    }
}
