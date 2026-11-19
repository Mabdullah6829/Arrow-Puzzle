package p004C0;

import kotlin.jvm.internal.AbstractC6452k;

/* JADX INFO: renamed from: C0.j */
/* JADX INFO: loaded from: classes.dex */
public final class C0145j {

    /* JADX INFO: renamed from: b */
    public static final C0144i f256b = new C0144i();

    /* JADX INFO: renamed from: a */
    public final Object f257a;

    public final boolean equals(Object obj) {
        if (obj instanceof C0145j) {
            return AbstractC6452k.m12177a(this.f257a, ((C0145j) obj).f257a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f257a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.f257a;
        if (obj instanceof C0143h) {
            return ((C0143h) obj).toString();
        }
        return "Value(" + obj + ')';
    }
}
