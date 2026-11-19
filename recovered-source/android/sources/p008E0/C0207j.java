package p008E0;

import kotlin.jvm.internal.AbstractC6451j;
import p006D0.InterfaceC0171f;
import p062g0.InterfaceC6348c;
import p078p0.InterfaceC6503q;

/* JADX INFO: renamed from: E0.j */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0207j extends AbstractC6451j implements InterfaceC6503q {

    /* JADX INFO: renamed from: s */
    public static final C0207j f413s = new C0207j(3, InterfaceC0171f.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);

    @Override // p078p0.InterfaceC6503q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        return ((InterfaceC0171f) obj).emit(obj2, (InterfaceC6348c) obj3);
    }
}
