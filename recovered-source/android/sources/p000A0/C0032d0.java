package p000A0;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: A0.d0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0032d0 implements InterfaceC0018T {

    /* JADX INFO: renamed from: t */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f37t = AtomicIntegerFieldUpdater.newUpdater(C0032d0.class, "_isCompleting$volatile");

    /* JADX INFO: renamed from: u */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f38u = AtomicReferenceFieldUpdater.newUpdater(C0032d0.class, Object.class, "_rootCause$volatile");

    /* JADX INFO: renamed from: v */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f39v = AtomicReferenceFieldUpdater.newUpdater(C0032d0.class, Object.class, "_exceptionsHolder$volatile");
    private volatile /* synthetic */ Object _exceptionsHolder$volatile;
    private volatile /* synthetic */ int _isCompleting$volatile = 0;
    private volatile /* synthetic */ Object _rootCause$volatile;

    /* JADX INFO: renamed from: s */
    public final C0038g0 f40s;

    public C0032d0(C0038g0 c0038g0, Throwable th) {
        this.f40s = c0038g0;
        this._rootCause$volatile = th;
    }

    /* JADX INFO: renamed from: a */
    public final void m41a(Throwable th) {
        Throwable thM42b = m42b();
        if (thM42b == null) {
            f38u.set(this, th);
            return;
        }
        if (th == thM42b) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f39v;
        Object obj = atomicReferenceFieldUpdater.get(this);
        if (obj == null) {
            atomicReferenceFieldUpdater.set(this, th);
            return;
        }
        if (!(obj instanceof Throwable)) {
            if (obj instanceof ArrayList) {
                ((ArrayList) obj).add(th);
                return;
            } else {
                throw new IllegalStateException(("State is " + obj).toString());
            }
        }
        if (th == obj) {
            return;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(th);
        atomicReferenceFieldUpdater.set(this, arrayList);
    }

    /* JADX INFO: renamed from: b */
    public final Throwable m42b() {
        return (Throwable) f38u.get(this);
    }

    @Override // p000A0.InterfaceC0018T
    /* JADX INFO: renamed from: c */
    public final boolean mo10c() {
        return m42b() == null;
    }

    @Override // p000A0.InterfaceC0018T
    /* JADX INFO: renamed from: d */
    public final C0038g0 mo11d() {
        return this.f40s;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m43e() {
        return m42b() != null;
    }

    /* JADX INFO: renamed from: f */
    public final ArrayList m44f(Throwable th) {
        ArrayList arrayList;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f39v;
        Object obj = atomicReferenceFieldUpdater.get(this);
        if (obj == null) {
            arrayList = new ArrayList(4);
        } else if (obj instanceof Throwable) {
            ArrayList arrayList2 = new ArrayList(4);
            arrayList2.add(obj);
            arrayList = arrayList2;
        } else {
            if (!(obj instanceof ArrayList)) {
                throw new IllegalStateException(("State is " + obj).toString());
            }
            arrayList = (ArrayList) obj;
        }
        Throwable thM42b = m42b();
        if (thM42b != null) {
            arrayList.add(0, thM42b);
        }
        if (th != null && !th.equals(thM42b)) {
            arrayList.add(th);
        }
        atomicReferenceFieldUpdater.set(this, AbstractC0069y.f93h);
        return arrayList;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Finishing[cancelling=");
        sb.append(m43e());
        sb.append(", completing=");
        sb.append(f37t.get(this) != 0);
        sb.append(", rootCause=");
        sb.append(m42b());
        sb.append(", exceptions=");
        sb.append(f39v.get(this));
        sb.append(", list=");
        sb.append(this.f40s);
        sb.append(']');
        return sb.toString();
    }
}
