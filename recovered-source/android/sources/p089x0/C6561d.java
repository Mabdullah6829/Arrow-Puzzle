package p089x0;

import com.google.firebase.firestore.pipeline.C5822a;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC6452k;
import p000A0.C0059r;
import p078p0.InterfaceC6498l;

/* JADX INFO: renamed from: x0.d */
/* JADX INFO: loaded from: classes.dex */
public final class C6561d implements InterfaceC6563f {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f24782a = 1;

    /* JADX INFO: renamed from: b */
    public final Object f24783b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC6498l f24784c;

    public C6561d(C6561d c6561d, C0059r c0059r) {
        this.f24783b = c6561d;
        this.f24784c = c0059r;
    }

    @Override // p089x0.InterfaceC6563f
    public final Iterator iterator() {
        switch (this.f24782a) {
            case 0:
                return new C6560c(this);
            case 1:
                return new C6562e(this);
            default:
                return new C6568k(this);
        }
    }

    public C6561d(InterfaceC6563f interfaceC6563f, InterfaceC6498l transformer) {
        AbstractC6452k.m12181e(transformer, "transformer");
        this.f24783b = interfaceC6563f;
        this.f24784c = transformer;
    }

    public C6561d(C5822a c5822a, InterfaceC6498l getNextValue) {
        AbstractC6452k.m12181e(getNextValue, "getNextValue");
        this.f24783b = c5822a;
        this.f24784c = getNextValue;
    }
}
