package p057d0;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p078p0.InterfaceC6487a;

/* JADX INFO: renamed from: d0.h */
/* JADX INFO: loaded from: classes.dex */
public final class C6286h implements InterfaceC6281c, Serializable {

    /* JADX INFO: renamed from: u */
    public static final AtomicReferenceFieldUpdater f24311u = AtomicReferenceFieldUpdater.newUpdater(C6286h.class, Object.class, "t");

    /* JADX INFO: renamed from: s */
    public volatile InterfaceC6487a f24312s;

    /* JADX INFO: renamed from: t */
    public volatile Object f24313t;

    @Override // p057d0.InterfaceC6281c
    public final Object getValue() {
        Object obj = this.f24313t;
        C6288j c6288j = C6288j.f24317a;
        if (obj != c6288j) {
            return obj;
        }
        InterfaceC6487a interfaceC6487a = this.f24312s;
        if (interfaceC6487a != null) {
            Object objInvoke = interfaceC6487a.invoke();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f24311u;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, c6288j, objInvoke)) {
                if (atomicReferenceFieldUpdater.get(this) != c6288j) {
                }
            }
            this.f24312s = null;
            return objInvoke;
        }
        return this.f24313t;
    }

    @Override // p057d0.InterfaceC6281c
    public final boolean isInitialized() {
        return this.f24313t != C6288j.f24317a;
    }

    public final String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
