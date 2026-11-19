package p006D0;

import p004C0.InterfaceC0152q;
import p066i0.AbstractC6373c;

/* JADX INFO: renamed from: D0.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0167b extends AbstractC6373c {

    /* JADX INFO: renamed from: s */
    public InterfaceC0152q f299s;

    /* JADX INFO: renamed from: t */
    public /* synthetic */ Object f300t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ C0168c f301u;

    /* JADX INFO: renamed from: v */
    public int f302v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0167b(C0168c c0168c, AbstractC6373c abstractC6373c) {
        super(abstractC6373c);
        this.f301u = c0168c;
    }

    @Override // p066i0.AbstractC6371a
    public final Object invokeSuspend(Object obj) {
        this.f300t = obj;
        this.f302v |= Integer.MIN_VALUE;
        return this.f301u.mo265c(null, this);
    }
}
