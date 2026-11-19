package androidx.datastore.core;

import java.io.File;
import kotlin.jvm.internal.AbstractC6452k;
import kotlin.jvm.internal.AbstractC6453l;
import p000A0.InterfaceC0008I;
import p004C0.C0151p;
import p004C0.InterfaceC0152q;
import p011H.AbstractC0243G;
import p057d0.C6289k;
import p062g0.InterfaceC6348c;
import p064h0.EnumC6363a;
import p066i0.AbstractC6379i;
import p066i0.InterfaceC6375e;
import p078p0.InterfaceC6487a;
import p078p0.InterfaceC6502p;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC6375e(m12158c = "androidx.datastore.core.MulticastFileObserver$Companion$observe$1", m12159f = "MulticastFileObserver.android.kt", m12160l = {84, 85}, m12161m = "invokeSuspend")
public final class MulticastFileObserver$Companion$observe$1 extends AbstractC6379i implements InterfaceC6502p {
    final /* synthetic */ File $file;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX INFO: renamed from: androidx.datastore.core.MulticastFileObserver$Companion$observe$1$1 */
    public static final class C13321 extends AbstractC6453l implements InterfaceC6487a {
        final /* synthetic */ InterfaceC0008I $disposeListener;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13321(InterfaceC0008I interfaceC0008I) {
            super(0);
            this.$disposeListener = interfaceC0008I;
        }

        @Override // p078p0.InterfaceC6487a
        public /* bridge */ /* synthetic */ Object invoke() {
            m12282invoke();
            return C6289k.f24318a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m12282invoke() {
            this.$disposeListener.dispose();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MulticastFileObserver$Companion$observe$1(File file, InterfaceC6348c interfaceC6348c) {
        super(2, interfaceC6348c);
        this.$file = file;
    }

    @Override // p066i0.AbstractC6371a
    public final InterfaceC6348c create(Object obj, InterfaceC6348c interfaceC6348c) {
        MulticastFileObserver$Companion$observe$1 multicastFileObserver$Companion$observe$1 = new MulticastFileObserver$Companion$observe$1(this.$file, interfaceC6348c);
        multicastFileObserver$Companion$observe$1.L$0 = obj;
        return multicastFileObserver$Companion$observe$1;
    }

    @Override // p078p0.InterfaceC6502p
    public final Object invoke(InterfaceC0152q interfaceC0152q, InterfaceC6348c interfaceC6348c) {
        return ((MulticastFileObserver$Companion$observe$1) create(interfaceC0152q, interfaceC6348c)).invokeSuspend(C6289k.f24318a);
    }

    @Override // p066i0.AbstractC6371a
    public final Object invokeSuspend(Object obj) throws Throwable {
        InterfaceC0008I interfaceC0008IObserve;
        InterfaceC0152q interfaceC0152q;
        EnumC6363a enumC6363a = EnumC6363a.f24419s;
        int i2 = this.label;
        C6289k c6289k = C6289k.f24318a;
        if (i2 == 0) {
            AbstractC0243G.m377o(obj);
            InterfaceC0152q interfaceC0152q2 = (InterfaceC0152q) this.L$0;
            MulticastFileObserver$Companion$observe$1$flowObserver$1 multicastFileObserver$Companion$observe$1$flowObserver$1 = new MulticastFileObserver$Companion$observe$1$flowObserver$1(this.$file, interfaceC0152q2);
            MulticastFileObserver.Companion companion = MulticastFileObserver.Companion;
            File parentFile = this.$file.getParentFile();
            AbstractC6452k.m12178b(parentFile);
            interfaceC0008IObserve = companion.observe(parentFile, multicastFileObserver$Companion$observe$1$flowObserver$1);
            this.L$0 = interfaceC0152q2;
            this.L$1 = interfaceC0008IObserve;
            this.label = 1;
            if (((C0151p) interfaceC0152q2).f269v.mo228i(this, c6289k) != enumC6363a) {
                interfaceC0152q = interfaceC0152q2;
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0243G.m377o(obj);
            return c6289k;
        }
        interfaceC0008IObserve = (InterfaceC0008I) this.L$1;
        interfaceC0152q = (InterfaceC0152q) this.L$0;
        AbstractC0243G.m377o(obj);
        C13321 c13321 = new C13321(interfaceC0008IObserve);
        this.L$0 = null;
        this.L$1 = null;
        this.label = 2;
        return AbstractC0243G.m367e(interfaceC0152q, c13321, this) == enumC6363a ? enumC6363a : c6289k;
    }
}
