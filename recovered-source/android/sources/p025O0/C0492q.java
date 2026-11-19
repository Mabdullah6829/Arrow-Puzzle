package p025O0;

import kotlin.jvm.internal.AbstractC6452k;
import p018K0.InterfaceC0325a;
import p021M0.C0337b;
import p021M0.InterfaceC0339d;
import p023N0.InterfaceC0456b;
import p023N0.InterfaceC0457c;

/* JADX INFO: renamed from: O0.q */
/* JADX INFO: loaded from: classes.dex */
public final class C0492q implements InterfaceC0325a {

    /* JADX INFO: renamed from: a */
    public static final C0492q f1040a = new C0492q();

    /* JADX INFO: renamed from: b */
    public static final C0489n f1041b = new C0489n("kotlin.String", C0337b.f677f);

    @Override // p018K0.InterfaceC0325a
    public final Object deserialize(InterfaceC0456b decoder) {
        AbstractC6452k.m12181e(decoder, "decoder");
        return decoder.mo954e();
    }

    @Override // p018K0.InterfaceC0325a
    public final InterfaceC0339d getDescriptor() {
        return f1041b;
    }

    @Override // p018K0.InterfaceC0325a
    public final void serialize(InterfaceC0457c interfaceC0457c, Object obj) {
        String value = (String) obj;
        AbstractC6452k.m12181e(value, "value");
        interfaceC0457c.mo965k(value);
    }
}
