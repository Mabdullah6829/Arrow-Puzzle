package p006D0;

import p008E0.C0206i;
import p062g0.InterfaceC6348c;
import p066i0.AbstractC6373c;

/* JADX INFO: renamed from: D0.k */
/* JADX INFO: loaded from: classes.dex */
public final class C0176k extends AbstractC6373c {

    /* JADX INFO: renamed from: s */
    public /* synthetic */ Object f325s;

    /* JADX INFO: renamed from: t */
    public int f326t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ C0177l f327u;

    /* JADX INFO: renamed from: v */
    public C0177l f328v;

    /* JADX INFO: renamed from: w */
    public InterfaceC0171f f329w;

    /* JADX INFO: renamed from: x */
    public C0206i f330x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0176k(C0177l c0177l, InterfaceC6348c interfaceC6348c) {
        super(interfaceC6348c);
        this.f327u = c0177l;
    }

    @Override // p066i0.AbstractC6371a
    public final Object invokeSuspend(Object obj) {
        this.f325s = obj;
        this.f326t |= Integer.MIN_VALUE;
        return this.f327u.collect(null, this);
    }
}
