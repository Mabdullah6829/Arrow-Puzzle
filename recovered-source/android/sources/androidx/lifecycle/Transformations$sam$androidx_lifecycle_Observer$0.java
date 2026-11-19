package androidx.lifecycle;

import kotlin.jvm.internal.AbstractC6452k;
import kotlin.jvm.internal.InterfaceC6448g;
import p057d0.InterfaceC6279a;
import p078p0.InterfaceC6498l;

/* JADX INFO: loaded from: classes.dex */
public final class Transformations$sam$androidx_lifecycle_Observer$0 implements Observer, InterfaceC6448g {
    private final /* synthetic */ InterfaceC6498l function;

    public Transformations$sam$androidx_lifecycle_Observer$0(InterfaceC6498l function) {
        AbstractC6452k.m12181e(function, "function");
        this.function = function;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof Observer) && (obj instanceof InterfaceC6448g)) {
            return AbstractC6452k.m12177a(getFunctionDelegate(), ((InterfaceC6448g) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.InterfaceC6448g
    public final InterfaceC6279a getFunctionDelegate() {
        return this.function;
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // androidx.lifecycle.Observer
    public final /* synthetic */ void onChanged(Object obj) {
        this.function.invoke(obj);
    }
}
