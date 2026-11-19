package p006D0;

import p062g0.InterfaceC6348c;
import p066i0.AbstractC6373c;

/* JADX INFO: renamed from: D0.o */
/* JADX INFO: loaded from: classes.dex */
public final class C0180o extends AbstractC6373c {

    /* JADX INFO: renamed from: s */
    public C0181p f342s;

    /* JADX INFO: renamed from: t */
    public /* synthetic */ Object f343t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ C0181p f344u;

    /* JADX INFO: renamed from: v */
    public int f345v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0180o(C0181p c0181p, InterfaceC6348c interfaceC6348c) {
        super(interfaceC6348c);
        this.f344u = c0181p;
    }

    @Override // p066i0.AbstractC6371a
    public final Object invokeSuspend(Object obj) {
        this.f343t = obj;
        this.f345v |= Integer.MIN_VALUE;
        return this.f344u.emit(null, this);
    }
}
