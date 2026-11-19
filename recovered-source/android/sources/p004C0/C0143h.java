package p004C0;

import kotlin.jvm.internal.AbstractC6452k;

/* JADX INFO: renamed from: C0.h */
/* JADX INFO: loaded from: classes.dex */
public final class C0143h extends C0144i {

    /* JADX INFO: renamed from: a */
    public final Throwable f255a;

    public C0143h(Throwable th) {
        this.f255a = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0143h) {
            return AbstractC6452k.m12177a(this.f255a, ((C0143h) obj).f255a);
        }
        return false;
    }

    public final int hashCode() {
        Throwable th = this.f255a;
        if (th != null) {
            return th.hashCode();
        }
        return 0;
    }

    @Override // p004C0.C0144i
    public final String toString() {
        return "Closed(" + this.f255a + ')';
    }
}
