package p058e0;

import java.util.Iterator;
import kotlin.jvm.internal.AbstractC6452k;
import p043a.AbstractC0878a;
import p078p0.InterfaceC6502p;
import p089x0.InterfaceC6563f;

/* JADX INFO: renamed from: e0.k */
/* JADX INFO: loaded from: classes.dex */
public final class C6303k implements InterfaceC6563f {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f24335a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f24336b;

    public /* synthetic */ C6303k(Object obj, int i2) {
        this.f24335a = i2;
        this.f24336b = obj;
    }

    @Override // p089x0.InterfaceC6563f
    public final Iterator iterator() {
        switch (this.f24335a) {
            case 0:
                Object[] array = (Object[]) this.f24336b;
                AbstractC6452k.m12181e(array, "array");
                return new C6295c(array);
            case 1:
                return ((Iterable) this.f24336b).iterator();
            case 2:
                return AbstractC0878a.m1803n((InterfaceC6502p) this.f24336b);
            default:
                return (Iterator) this.f24336b;
        }
    }
}
