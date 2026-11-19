package p029Q0;

import kotlin.jvm.internal.AbstractC6451j;
import kotlin.jvm.internal.AbstractC6452k;
import p021M0.InterfaceC0339d;
import p078p0.InterfaceC6502p;

/* JADX INFO: renamed from: Q0.f */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0506f extends AbstractC6451j implements InterfaceC6502p {
    @Override // p078p0.InterfaceC6502p
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC0339d p1 = (InterfaceC0339d) obj;
        int iIntValue = ((Number) obj2).intValue();
        AbstractC6452k.m12181e(p1, "p0");
        C0507g c0507g = (C0507g) this.receiver;
        c0507g.getClass();
        boolean z = !p1.mo503i(iIntValue) && p1.mo502h(iIntValue).mo497c();
        c0507g.f1062b = z;
        return Boolean.valueOf(z);
    }
}
