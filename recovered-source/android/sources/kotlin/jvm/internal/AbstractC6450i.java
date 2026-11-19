package kotlin.jvm.internal;

import p000A0.C0068x;
import p088w0.InterfaceC6547b;
import p088w0.InterfaceC6550e;

/* JADX INFO: renamed from: kotlin.jvm.internal.i */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6450i extends AbstractC6444c implements InterfaceC6449h, InterfaceC6550e {
    private final int arity;
    private final int flags;

    public AbstractC6450i(int i2, Object obj, Class cls, String str, String str2, int i3) {
        super(obj, cls, str, str2, (i3 & 1) == 1);
        this.arity = i2;
        this.flags = 0;
    }

    @Override // kotlin.jvm.internal.AbstractC6444c
    public InterfaceC6547b computeReflected() {
        AbstractC6463v.f24637a.getClass();
        return this;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC6450i) {
            AbstractC6450i abstractC6450i = (AbstractC6450i) obj;
            return getName().equals(abstractC6450i.getName()) && getSignature().equals(abstractC6450i.getSignature()) && this.flags == abstractC6450i.flags && this.arity == abstractC6450i.arity && AbstractC6452k.m12177a(getBoundReceiver(), abstractC6450i.getBoundReceiver()) && AbstractC6452k.m12177a(getOwner(), abstractC6450i.getOwner());
        }
        if (obj instanceof InterfaceC6550e) {
            return obj.equals(compute());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.InterfaceC6449h
    public int getArity() {
        return this.arity;
    }

    public int hashCode() {
        return getSignature().hashCode() + ((getName().hashCode() + (getOwner() == null ? 0 : getOwner().hashCode() * 31)) * 31);
    }

    @Override // p088w0.InterfaceC6550e
    public boolean isExternal() {
        return getReflected().isExternal();
    }

    @Override // p088w0.InterfaceC6550e
    public boolean isInfix() {
        return getReflected().isInfix();
    }

    @Override // p088w0.InterfaceC6550e
    public boolean isInline() {
        return getReflected().isInline();
    }

    @Override // p088w0.InterfaceC6550e
    public boolean isOperator() {
        return getReflected().isOperator();
    }

    @Override // kotlin.jvm.internal.AbstractC6444c, p088w0.InterfaceC6547b
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public String toString() {
        InterfaceC6547b interfaceC6547bCompute = compute();
        if (interfaceC6547bCompute != this) {
            return interfaceC6547bCompute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }

    @Override // kotlin.jvm.internal.AbstractC6444c
    public InterfaceC6550e getReflected() {
        InterfaceC6547b interfaceC6547bCompute = compute();
        if (interfaceC6547bCompute != this) {
            return (InterfaceC6550e) interfaceC6547bCompute;
        }
        throw new C0068x("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
    }
}
