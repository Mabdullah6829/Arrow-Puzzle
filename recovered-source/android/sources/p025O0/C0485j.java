package p025O0;

import kotlin.jvm.internal.AbstractC6452k;
import p018K0.InterfaceC0325a;
import p021M0.InterfaceC0339d;
import p023N0.InterfaceC0456b;
import p023N0.InterfaceC0457c;

/* JADX INFO: renamed from: O0.j */
/* JADX INFO: loaded from: classes.dex */
public final class C0485j implements InterfaceC0325a {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0325a f1018a;

    /* JADX INFO: renamed from: b */
    public final C0490o f1019b;

    public C0485j(InterfaceC0325a serializer) {
        AbstractC6452k.m12181e(serializer, "serializer");
        this.f1018a = serializer;
        this.f1019b = new C0490o(serializer.getDescriptor());
    }

    @Override // p018K0.InterfaceC0325a
    public final Object deserialize(InterfaceC0456b decoder) {
        AbstractC6452k.m12181e(decoder, "decoder");
        if (decoder.mo956g()) {
            return decoder.mo951b(this.f1018a);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C0485j.class == obj.getClass() && AbstractC6452k.m12177a(this.f1018a, ((C0485j) obj).f1018a);
    }

    @Override // p018K0.InterfaceC0325a
    public final InterfaceC0339d getDescriptor() {
        return this.f1019b;
    }

    public final int hashCode() {
        return this.f1018a.hashCode();
    }

    @Override // p018K0.InterfaceC0325a
    public final void serialize(InterfaceC0457c interfaceC0457c, Object obj) {
        if (obj != null) {
            interfaceC0457c.mo962g(this.f1018a, obj);
        } else {
            interfaceC0457c.mo959c();
        }
    }
}
