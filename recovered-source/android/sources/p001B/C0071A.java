package p001B;

import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: renamed from: B.A */
/* JADX INFO: loaded from: classes2.dex */
public final class C0071A implements InterfaceC0097w, Serializable {

    /* JADX INFO: renamed from: s */
    public final Object f98s;

    public C0071A(Object obj) {
        this.f98s = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0071A) {
            return AbstractC0076b.m140o(this.f98s, ((C0071A) obj).f98s);
        }
        return false;
    }

    @Override // p001B.InterfaceC0097w
    public final Object get() {
        return this.f98s;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f98s});
    }

    public final String toString() {
        return "Suppliers.ofInstance(" + this.f98s + ")";
    }
}
