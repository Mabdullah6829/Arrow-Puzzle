package p004C0;

import kotlin.jvm.internal.AbstractC6451j;
import kotlin.jvm.internal.AbstractC6452k;
import p078p0.InterfaceC6502p;

/* JADX INFO: renamed from: C0.d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0139d extends AbstractC6451j implements InterfaceC6502p {

    /* JADX INFO: renamed from: s */
    public static final C0139d f232s = new C0139d(2, AbstractC0140e.class, "createSegment", "createSegment(JLkotlinx/coroutines/channels/ChannelSegment;)Lkotlinx/coroutines/channels/ChannelSegment;", 1);

    @Override // p078p0.InterfaceC6502p
    public final Object invoke(Object obj, Object obj2) {
        long jLongValue = ((Number) obj).longValue();
        C0146k c0146k = (C0146k) obj2;
        C0146k c0146k2 = AbstractC0140e.f233a;
        C0138c c0138c = c0146k.f258e;
        AbstractC6452k.m12178b(c0138c);
        return new C0146k(jLongValue, c0146k, c0138c, 0);
    }
}
