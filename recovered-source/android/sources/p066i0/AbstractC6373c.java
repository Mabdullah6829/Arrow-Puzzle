package p066i0;

import kotlin.jvm.internal.AbstractC6452k;
import p062g0.C6349d;
import p062g0.InterfaceC6348c;
import p062g0.InterfaceC6350e;
import p062g0.InterfaceC6351f;
import p062g0.InterfaceC6353h;

/* JADX INFO: renamed from: i0.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6373c extends AbstractC6371a {
    private final InterfaceC6353h _context;
    private transient InterfaceC6348c intercepted;

    public AbstractC6373c(InterfaceC6348c interfaceC6348c, InterfaceC6353h interfaceC6353h) {
        super(interfaceC6348c);
        this._context = interfaceC6353h;
    }

    @Override // p062g0.InterfaceC6348c
    public InterfaceC6353h getContext() {
        InterfaceC6353h interfaceC6353h = this._context;
        AbstractC6452k.m12178b(interfaceC6353h);
        return interfaceC6353h;
    }

    public final InterfaceC6348c intercepted() {
        InterfaceC6348c interfaceC6348cInterceptContinuation = this.intercepted;
        if (interfaceC6348cInterceptContinuation == null) {
            InterfaceC6350e interfaceC6350e = (InterfaceC6350e) getContext().get(C6349d.f24408s);
            if (interfaceC6350e == null || (interfaceC6348cInterceptContinuation = interfaceC6350e.interceptContinuation(this)) == null) {
                interfaceC6348cInterceptContinuation = this;
            }
            this.intercepted = interfaceC6348cInterceptContinuation;
        }
        return interfaceC6348cInterceptContinuation;
    }

    @Override // p066i0.AbstractC6371a
    public void releaseIntercepted() {
        InterfaceC6348c interfaceC6348c = this.intercepted;
        if (interfaceC6348c != null && interfaceC6348c != this) {
            InterfaceC6351f interfaceC6351f = getContext().get(C6349d.f24408s);
            AbstractC6452k.m12178b(interfaceC6351f);
            ((InterfaceC6350e) interfaceC6351f).releaseInterceptedContinuation(interfaceC6348c);
        }
        this.intercepted = C6372b.f24443s;
    }

    public AbstractC6373c(InterfaceC6348c interfaceC6348c) {
        this(interfaceC6348c, interfaceC6348c != null ? interfaceC6348c.getContext() : null);
    }
}
