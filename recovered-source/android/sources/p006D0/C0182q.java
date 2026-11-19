package p006D0;

import p062g0.InterfaceC6348c;
import p066i0.AbstractC6373c;

/* JADX INFO: renamed from: D0.q */
/* JADX INFO: loaded from: classes.dex */
public final class C0182q extends AbstractC6373c {

    /* JADX INFO: renamed from: s */
    public C0183r f349s;

    /* JADX INFO: renamed from: t */
    public Object f350t;

    /* JADX INFO: renamed from: u */
    public /* synthetic */ Object f351u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ C0183r f352v;

    /* JADX INFO: renamed from: w */
    public int f353w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0182q(C0183r c0183r, InterfaceC6348c interfaceC6348c) {
        super(interfaceC6348c);
        this.f352v = c0183r;
    }

    @Override // p066i0.AbstractC6371a
    public final Object invokeSuspend(Object obj) {
        this.f351u = obj;
        this.f353w |= Integer.MIN_VALUE;
        return this.f352v.emit(null, this);
    }
}
