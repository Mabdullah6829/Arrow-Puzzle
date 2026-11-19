package p064h0;

import kotlin.jvm.internal.AbstractC6452k;
import kotlin.jvm.internal.AbstractC6465x;
import p011H.AbstractC0243G;
import p062g0.InterfaceC6348c;
import p066i0.AbstractC6377g;
import p078p0.InterfaceC6502p;

/* JADX INFO: renamed from: h0.b */
/* JADX INFO: loaded from: classes.dex */
public final class C6364b extends AbstractC6377g {

    /* JADX INFO: renamed from: s */
    public int f24421s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ InterfaceC6502p f24422t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ InterfaceC6348c f24423u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6364b(InterfaceC6348c interfaceC6348c, InterfaceC6348c interfaceC6348c2, InterfaceC6502p interfaceC6502p) {
        super(interfaceC6348c);
        this.f24422t = interfaceC6502p;
        this.f24423u = interfaceC6348c2;
    }

    @Override // p066i0.AbstractC6371a
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i2 = this.f24421s;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.f24421s = 2;
            AbstractC0243G.m377o(obj);
            return obj;
        }
        this.f24421s = 1;
        AbstractC0243G.m377o(obj);
        InterfaceC6502p interfaceC6502p = this.f24422t;
        AbstractC6452k.m12179c(interfaceC6502p, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
        AbstractC6465x.m12191a(2, interfaceC6502p);
        return interfaceC6502p.invoke(this.f24423u, this);
    }
}
