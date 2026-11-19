package p058e0;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.AbstractC6452k;
import p011H.AbstractC0271e0;
import p087v0.C6545d;

/* JADX INFO: renamed from: e0.B */
/* JADX INFO: loaded from: classes.dex */
public final class C6291B extends AbstractC6298f {

    /* JADX INFO: renamed from: s */
    public final List f24321s;

    public C6291B(List delegate) {
        AbstractC6452k.m12181e(delegate, "delegate");
        this.f24321s = delegate;
    }

    @Override // java.util.List
    public final Object get(int i2) {
        if (i2 >= 0 && i2 <= AbstractC6306n.m12119q(this)) {
            return this.f24321s.get(AbstractC6306n.m12119q(this) - i2);
        }
        StringBuilder sbM404l = AbstractC0271e0.m404l(i2, "Element index ", " must be in range [");
        sbM404l.append(new C6545d(0, AbstractC6306n.m12119q(this), 1));
        sbM404l.append("].");
        throw new IndexOutOfBoundsException(sbM404l.toString());
    }

    @Override // p058e0.AbstractC6293a
    public final int getSize() {
        return this.f24321s.size();
    }

    @Override // p058e0.AbstractC6298f, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new C6290A(this, 0);
    }

    @Override // p058e0.AbstractC6298f, java.util.List
    public final ListIterator listIterator() {
        return new C6290A(this, 0);
    }

    @Override // p058e0.AbstractC6298f, java.util.List
    public final ListIterator listIterator(int i2) {
        return new C6290A(this, i2);
    }
}
