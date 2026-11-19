package kotlin.jvm.internal;

import p000A0.C0068x;
import p088w0.InterfaceC6547b;
import p088w0.InterfaceC6555j;

/* JADX INFO: renamed from: kotlin.jvm.internal.q */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6458q extends AbstractC6444c implements InterfaceC6555j {
    private final boolean syntheticJavaProperty;

    public AbstractC6458q(Object obj, Class cls, String str, String str2, int i2) {
        super(obj, cls, str, str2, (i2 & 1) == 1);
        this.syntheticJavaProperty = false;
    }

    @Override // kotlin.jvm.internal.AbstractC6444c
    public InterfaceC6547b compute() {
        return this.syntheticJavaProperty ? this : super.compute();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC6458q) {
            AbstractC6458q abstractC6458q = (AbstractC6458q) obj;
            return getOwner().equals(abstractC6458q.getOwner()) && getName().equals(abstractC6458q.getName()) && getSignature().equals(abstractC6458q.getSignature()) && AbstractC6452k.m12177a(getBoundReceiver(), abstractC6458q.getBoundReceiver());
        }
        if (obj instanceof InterfaceC6555j) {
            return obj.equals(compute());
        }
        return false;
    }

    public int hashCode() {
        return getSignature().hashCode() + ((getName().hashCode() + (getOwner().hashCode() * 31)) * 31);
    }

    @Override // p088w0.InterfaceC6555j
    public boolean isConst() {
        return getReflected().isConst();
    }

    @Override // p088w0.InterfaceC6555j
    public boolean isLateinit() {
        return getReflected().isLateinit();
    }

    public String toString() {
        InterfaceC6547b interfaceC6547bCompute = compute();
        if (interfaceC6547bCompute != this) {
            return interfaceC6547bCompute.toString();
        }
        return "property " + getName() + " (Kotlin reflection is not available)";
    }

    @Override // kotlin.jvm.internal.AbstractC6444c
    public InterfaceC6555j getReflected() {
        if (this.syntheticJavaProperty) {
            throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
        }
        InterfaceC6547b interfaceC6547bCompute = compute();
        if (interfaceC6547bCompute != this) {
            return (InterfaceC6555j) interfaceC6547bCompute;
        }
        throw new C0068x("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
    }
}
