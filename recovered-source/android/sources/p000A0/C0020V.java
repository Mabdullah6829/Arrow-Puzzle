package p000A0;

import com.google.firebase.sessions.api.C6044a;
import com.google.firebase.sessions.api.FirebaseSessionsDependencies;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import p011H.AbstractC0243G;
import p057d0.C6289k;
import p062g0.InterfaceC6348c;
import p062g0.InterfaceC6353h;
import p064h0.EnumC6363a;
import p066i0.AbstractC6379i;
import p078p0.InterfaceC6502p;

/* JADX INFO: renamed from: A0.V */
/* JADX INFO: loaded from: classes.dex */
public final class C0020V extends AbstractC6379i implements InterfaceC6502p {

    /* JADX INFO: renamed from: s */
    public /* synthetic */ Object f21s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ C6044a f22t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0020V(C6044a c6044a, InterfaceC6348c interfaceC6348c) {
        super(2, interfaceC6348c);
        this.f22t = c6044a;
    }

    @Override // p066i0.AbstractC6371a
    public final InterfaceC6348c create(Object obj, InterfaceC6348c interfaceC6348c) {
        C0020V c0020v = new C0020V(this.f22t, interfaceC6348c);
        c0020v.f21s = obj;
        return c0020v;
    }

    @Override // p078p0.InterfaceC6502p
    public final Object invoke(Object obj, Object obj2) {
        return ((C0020V) create((InterfaceC0066v) obj, (InterfaceC6348c) obj2)).invokeSuspend(C6289k.f24318a);
    }

    @Override // p066i0.AbstractC6371a
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i2;
        EnumC6363a enumC6363a = EnumC6363a.f24419s;
        AbstractC0243G.m377o(obj);
        InterfaceC6353h coroutineContext = ((InterfaceC0066v) this.f21s).getCoroutineContext();
        C6044a c6044a = this.f22t;
        try {
            C0056p0 c0056p0 = new C0056p0();
            InterfaceC0022X interfaceC0022X = (InterfaceC0022X) coroutineContext.get(C0065u.f80t);
            if (interfaceC0022X == null) {
                throw new IllegalStateException(("Current context doesn't contain Job in it: " + coroutineContext).toString());
            }
            c0056p0.f71x = AbstractC0069y.m110i(interfaceC0022X, true, c0056p0);
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C0056p0.f69y;
            do {
                i2 = atomicIntegerFieldUpdater.get(c0056p0);
                if (i2 != 0) {
                    if (i2 == 2 || i2 == 3) {
                        break;
                        break;
                    }
                    C0056p0.m98m(i2);
                    throw null;
                }
            } while (!atomicIntegerFieldUpdater.compareAndSet(c0056p0, i2, 0));
            try {
                return FirebaseSessionsDependencies.getRegisteredSubscribers$lambda$2$lambda$1(c6044a.f24040s);
            } finally {
                c0056p0.m99l();
            }
        } catch (InterruptedException e) {
            throw new CancellationException("Blocking call was interrupted due to parent cancellation").initCause(e);
        }
    }
}
