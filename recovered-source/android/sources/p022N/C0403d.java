package p022N;

import com.google.protobuf.AbstractC6175H;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: N.d */
/* JADX INFO: loaded from: classes2.dex */
public final class C0403d extends AbstractC6175H implements InterfaceC0409f {
    /* JADX INFO: renamed from: b */
    public final void m787b(Iterable iterable) {
        copyOnWrite();
        C0406e.m795f((C0406e) this.instance, iterable);
    }

    /* JADX INFO: renamed from: c */
    public final void m788c(C0393Z0 c0393z0) {
        copyOnWrite();
        C0406e.m794e((C0406e) this.instance, c0393z0);
    }

    /* JADX INFO: renamed from: d */
    public final C0393Z0 m789d(int i2) {
        return ((C0406e) this.instance).m799i(i2);
    }

    /* JADX INFO: renamed from: e */
    public final int m790e() {
        return ((C0406e) this.instance).m800j();
    }

    /* JADX INFO: renamed from: f */
    public final void m791f(int i2) {
        copyOnWrite();
        C0406e.m796g((C0406e) this.instance, i2);
    }

    @Override // p022N.InterfaceC0409f
    public final List getValuesList() {
        return Collections.unmodifiableList(((C0406e) this.instance).getValuesList());
    }
}
