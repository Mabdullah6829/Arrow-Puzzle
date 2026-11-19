package p002B0;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.AbstractC6452k;
import p000A0.AbstractC0007H;
import p000A0.AbstractC0063t;
import p000A0.C0039h;
import p000A0.C0065u;
import p000A0.InterfaceC0003D;
import p000A0.InterfaceC0022X;
import p000A0.RunnableC0046k0;
import p010F0.AbstractC0215a;
import p010F0.AbstractC0227m;
import p010F0.C0228n;
import p011H.AbstractC0271e0;
import p012H0.C0302e;
import p012H0.ExecutorC0301d;
import p062g0.InterfaceC6353h;

/* JADX INFO: renamed from: B0.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0104d extends AbstractC0063t implements InterfaceC0003D {

    /* JADX INFO: renamed from: s */
    public final Handler f151s;

    /* JADX INFO: renamed from: t */
    public final boolean f152t;

    /* JADX INFO: renamed from: u */
    public final C0104d f153u;

    public C0104d(Handler handler, boolean z) {
        this.f151s = handler;
        this.f152t = z;
        this.f153u = z ? this : new C0104d(handler, true);
    }

    @Override // p000A0.AbstractC0063t
    public final void dispatch(InterfaceC6353h interfaceC6353h, Runnable runnable) {
        if (this.f151s.post(runnable)) {
            return;
        }
        m172j(interfaceC6353h, runnable);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0104d)) {
            return false;
        }
        C0104d c0104d = (C0104d) obj;
        return c0104d.f151s == this.f151s && c0104d.f152t == this.f152t;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f151s) ^ (this.f152t ? 1231 : 1237);
    }

    @Override // p000A0.InterfaceC0003D
    /* JADX INFO: renamed from: i */
    public final void mo1i(long j2, C0039h c0039h) {
        RunnableC0046k0 runnableC0046k0 = new RunnableC0046k0(c0039h, this, 1, false);
        if (j2 > 4611686018427387903L) {
            j2 = 4611686018427387903L;
        }
        if (this.f151s.postDelayed(runnableC0046k0, j2)) {
            c0039h.m88t(new C0103c(0, this, runnableC0046k0));
        } else {
            m172j(c0039h.f52w, runnableC0046k0);
        }
    }

    @Override // p000A0.AbstractC0063t
    public final boolean isDispatchNeeded(InterfaceC6353h interfaceC6353h) {
        return (this.f152t && AbstractC6452k.m12177a(Looper.myLooper(), this.f151s.getLooper())) ? false : true;
    }

    /* JADX INFO: renamed from: j */
    public final void m172j(InterfaceC6353h interfaceC6353h, Runnable runnable) {
        CancellationException cancellationException = new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed");
        InterfaceC0022X interfaceC0022X = (InterfaceC0022X) interfaceC6353h.get(C0065u.f80t);
        if (interfaceC0022X != null) {
            interfaceC0022X.mo29e(cancellationException);
        }
        C0302e c0302e = AbstractC0007H.f4a;
        ExecutorC0301d.f608s.dispatch(interfaceC6353h, runnable);
    }

    @Override // p000A0.AbstractC0063t
    public AbstractC0063t limitedParallelism(int i2, String str) {
        AbstractC0215a.m295a(i2);
        return str != null ? new C0228n(this, str) : this;
    }

    @Override // p000A0.AbstractC0063t
    public final String toString() {
        C0104d c0104d;
        String str;
        C0302e c0302e = AbstractC0007H.f4a;
        C0104d c0104d2 = AbstractC0227m.f459a;
        if (this == c0104d2) {
            str = "Dispatchers.Main";
        } else {
            try {
                c0104d = c0104d2.f153u;
            } catch (UnsupportedOperationException unused) {
                c0104d = null;
            }
            str = this == c0104d ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String string = this.f151s.toString();
        return this.f152t ? AbstractC0271e0.m414v(string, ".immediate") : string;
    }
}
