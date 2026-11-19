package kotlin.jvm.internal;

import java.io.Serializable;
import p088w0.InterfaceC6549d;

/* JADX INFO: renamed from: kotlin.jvm.internal.a */
/* JADX INFO: loaded from: classes.dex */
public class C6442a implements InterfaceC6449h, Serializable {
    private final int flags;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private final String signature;
    private final boolean isTopLevel = false;
    private final int arity = 2;

    public C6442a(Object obj, Class cls, String str, String str2, int i2) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.flags = i2 >> 1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6442a)) {
            return false;
        }
        C6442a c6442a = (C6442a) obj;
        return this.isTopLevel == c6442a.isTopLevel && this.arity == c6442a.arity && this.flags == c6442a.flags && AbstractC6452k.m12177a(this.receiver, c6442a.receiver) && AbstractC6452k.m12177a(this.owner, c6442a.owner) && this.name.equals(c6442a.name) && this.signature.equals(c6442a.signature);
    }

    @Override // kotlin.jvm.internal.InterfaceC6449h
    public int getArity() {
        return this.arity;
    }

    public InterfaceC6549d getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        if (!this.isTopLevel) {
            return AbstractC6463v.m12189a(cls);
        }
        AbstractC6463v.f24637a.getClass();
        return new C6454m(cls);
    }

    public int hashCode() {
        Object obj = this.receiver;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Class cls = this.owner;
        return ((((((this.signature.hashCode() + ((this.name.hashCode() + ((iHashCode + (cls != null ? cls.hashCode() : 0)) * 31)) * 31)) * 31) + (this.isTopLevel ? 1231 : 1237)) * 31) + this.arity) * 31) + this.flags;
    }

    public String toString() {
        AbstractC6463v.f24637a.getClass();
        return C6464w.m12190a(this);
    }
}
