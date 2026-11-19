package p025O0;

import kotlin.jvm.internal.AbstractC6452k;
import p018K0.InterfaceC0325a;
import p021M0.C0337b;
import p021M0.InterfaceC0339d;
import p023N0.InterfaceC0456b;
import p023N0.InterfaceC0457c;

/* JADX INFO: renamed from: O0.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0476a implements InterfaceC0325a {

    /* JADX INFO: renamed from: a */
    public static final C0476a f1001a = new C0476a();

    /* JADX INFO: renamed from: b */
    public static final C0489n f1002b = new C0489n("kotlin.Boolean", C0337b.f673b);

    @Override // p018K0.InterfaceC0325a
    public final Object deserialize(InterfaceC0456b decoder) {
        AbstractC6452k.m12181e(decoder, "decoder");
        return Boolean.valueOf(decoder.mo952c());
    }

    @Override // p018K0.InterfaceC0325a
    public final InterfaceC0339d getDescriptor() {
        return f1002b;
    }

    @Override // p018K0.InterfaceC0325a
    public final void serialize(InterfaceC0457c interfaceC0457c, Object obj) {
        interfaceC0457c.mo961e(((Boolean) obj).booleanValue());
    }
}
