package p089x0;

import com.google.firebase.firestore.pipeline.C5822a;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC6452k;
import p078p0.InterfaceC6498l;
import p080q0.InterfaceC6520a;

/* JADX INFO: renamed from: x0.e */
/* JADX INFO: loaded from: classes.dex */
public final class C6562e implements Iterator, InterfaceC6520a {

    /* JADX INFO: renamed from: s */
    public Object f24785s;

    /* JADX INFO: renamed from: t */
    public int f24786t = -2;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ C6561d f24787u;

    public C6562e(C6561d c6561d) {
        this.f24787u = c6561d;
    }

    /* JADX INFO: renamed from: a */
    public final void m12214a() {
        Object objInvoke;
        int i2 = this.f24786t;
        C6561d c6561d = this.f24787u;
        if (i2 == -2) {
            objInvoke = ((C5822a) c6561d.f24783b).f23845t;
        } else {
            InterfaceC6498l interfaceC6498l = c6561d.f24784c;
            Object obj = this.f24785s;
            AbstractC6452k.m12178b(obj);
            objInvoke = interfaceC6498l.invoke(obj);
        }
        this.f24785s = objInvoke;
        this.f24786t = objInvoke == null ? 0 : 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f24786t < 0) {
            m12214a();
        }
        return this.f24786t == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f24786t < 0) {
            m12214a();
        }
        if (this.f24786t == 0) {
            throw new NoSuchElementException();
        }
        Object obj = this.f24785s;
        AbstractC6452k.m12179c(obj, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
        this.f24786t = -1;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
