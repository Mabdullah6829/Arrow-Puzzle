package p000A0;

import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.AbstractC6452k;
import p078p0.InterfaceC6503q;

/* JADX INFO: renamed from: A0.o */
/* JADX INFO: loaded from: classes.dex */
public final class C0053o {

    /* JADX INFO: renamed from: a */
    public final Object f61a;

    /* JADX INFO: renamed from: b */
    public final C0033e f62b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC6503q f63c;

    /* JADX INFO: renamed from: d */
    public final Object f64d;

    /* JADX INFO: renamed from: e */
    public final Throwable f65e;

    public C0053o(Object obj, C0033e c0033e, InterfaceC6503q interfaceC6503q, Object obj2, Throwable th) {
        this.f61a = obj;
        this.f62b = c0033e;
        this.f63c = interfaceC6503q;
        this.f64d = obj2;
        this.f65e = th;
    }

    /* JADX INFO: renamed from: a */
    public static C0053o m96a(C0053o c0053o, C0033e c0033e, CancellationException cancellationException, int i2) {
        Object obj = c0053o.f61a;
        if ((i2 & 2) != 0) {
            c0033e = c0053o.f62b;
        }
        C0033e c0033e2 = c0033e;
        InterfaceC6503q interfaceC6503q = c0053o.f63c;
        Object obj2 = c0053o.f64d;
        Throwable th = cancellationException;
        if ((i2 & 16) != 0) {
            th = c0053o.f65e;
        }
        c0053o.getClass();
        return new C0053o(obj, c0033e2, interfaceC6503q, obj2, th);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0053o)) {
            return false;
        }
        C0053o c0053o = (C0053o) obj;
        return AbstractC6452k.m12177a(this.f61a, c0053o.f61a) && AbstractC6452k.m12177a(this.f62b, c0053o.f62b) && AbstractC6452k.m12177a(this.f63c, c0053o.f63c) && AbstractC6452k.m12177a(this.f64d, c0053o.f64d) && AbstractC6452k.m12177a(this.f65e, c0053o.f65e);
    }

    public final int hashCode() {
        Object obj = this.f61a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        C0033e c0033e = this.f62b;
        int iHashCode2 = (iHashCode + (c0033e == null ? 0 : c0033e.hashCode())) * 31;
        InterfaceC6503q interfaceC6503q = this.f63c;
        int iHashCode3 = (iHashCode2 + (interfaceC6503q == null ? 0 : interfaceC6503q.hashCode())) * 31;
        Object obj2 = this.f64d;
        int iHashCode4 = (iHashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.f65e;
        return iHashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.f61a + ", cancelHandler=" + this.f62b + ", onCancellation=" + this.f63c + ", idempotentResume=" + this.f64d + ", cancelCause=" + this.f65e + ')';
    }

    public /* synthetic */ C0053o(Object obj, C0033e c0033e, InterfaceC6503q interfaceC6503q, CancellationException cancellationException, int i2) {
        this(obj, (i2 & 2) != 0 ? null : c0033e, (i2 & 4) != 0 ? null : interfaceC6503q, (Object) null, (i2 & 16) != 0 ? null : cancellationException);
    }
}
