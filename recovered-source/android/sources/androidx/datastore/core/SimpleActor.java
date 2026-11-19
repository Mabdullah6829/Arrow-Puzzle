package androidx.datastore.core;

import androidx.constraintlayout.widget.C1137R;
import kotlin.jvm.internal.AbstractC6452k;
import kotlin.jvm.internal.AbstractC6453l;
import kotlinx.coroutines.channels.ClosedSendChannelException;
import p000A0.AbstractC0069y;
import p000A0.C0034e0;
import p000A0.C0043j;
import p000A0.C0065u;
import p000A0.InterfaceC0022X;
import p000A0.InterfaceC0066v;
import p004C0.C0143h;
import p004C0.C0144i;
import p004C0.InterfaceC0142g;
import p043a.AbstractC0878a;
import p057d0.C6289k;
import p062g0.InterfaceC6348c;
import p066i0.AbstractC6379i;
import p066i0.InterfaceC6375e;
import p078p0.InterfaceC6498l;
import p078p0.InterfaceC6502p;

/* JADX INFO: loaded from: classes.dex */
public final class SimpleActor<T> {
    private final InterfaceC6502p consumeMessage;
    private final InterfaceC0142g messageQueue;
    private final AtomicInt remainingMessages;
    private final InterfaceC0066v scope;

    /* JADX INFO: renamed from: androidx.datastore.core.SimpleActor$1 */
    public static final class C13351 extends AbstractC6453l implements InterfaceC6498l {
        final /* synthetic */ InterfaceC6498l $onComplete;
        final /* synthetic */ InterfaceC6502p $onUndeliveredElement;
        final /* synthetic */ SimpleActor<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13351(InterfaceC6498l interfaceC6498l, SimpleActor<T> simpleActor, InterfaceC6502p interfaceC6502p) {
            super(1);
            this.$onComplete = interfaceC6498l;
            this.this$0 = simpleActor;
            this.$onUndeliveredElement = interfaceC6502p;
        }

        @Override // p078p0.InterfaceC6498l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C6289k.f24318a;
        }

        public final void invoke(Throwable th) {
            C6289k c6289k;
            this.$onComplete.invoke(th);
            ((SimpleActor) this.this$0).messageQueue.mo225d(th);
            do {
                Object objMo224b = ((SimpleActor) this.this$0).messageQueue.mo224b();
                c6289k = null;
                if (objMo224b instanceof C0144i) {
                    objMo224b = null;
                }
                if (objMo224b != null) {
                    this.$onUndeliveredElement.invoke(objMo224b, th);
                    c6289k = C6289k.f24318a;
                }
            } while (c6289k != null);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.core.SimpleActor$offer$2 */
    @InterfaceC6375e(m12158c = "androidx.datastore.core.SimpleActor$offer$2", m12159f = "SimpleActor.kt", m12160l = {C1137R.styleable.ConstraintSet_transitionEasing, C1137R.styleable.ConstraintSet_transitionEasing}, m12161m = "invokeSuspend")
    public static final class C13362 extends AbstractC6379i implements InterfaceC6502p {
        Object L$0;
        int label;
        final /* synthetic */ SimpleActor<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13362(SimpleActor<T> simpleActor, InterfaceC6348c interfaceC6348c) {
            super(2, interfaceC6348c);
            this.this$0 = simpleActor;
        }

        @Override // p066i0.AbstractC6371a
        public final InterfaceC6348c create(Object obj, InterfaceC6348c interfaceC6348c) {
            return new C13362(this.this$0, interfaceC6348c);
        }

        @Override // p078p0.InterfaceC6502p
        public final Object invoke(InterfaceC0066v interfaceC0066v, InterfaceC6348c interfaceC6348c) {
            return ((C13362) create(interfaceC0066v, interfaceC6348c)).invokeSuspend(C6289k.f24318a);
        }

        /* JADX WARN: Code duplicated, block: B:22:0x0068 A[PHI: r1 r6
  0x0068: PHI (r1v1 p0.p) = (r1v3 p0.p), (r1v6 p0.p) binds: [B:20:0x0065, B:9:0x0018] A[DONT_GENERATE, DONT_INLINE]
  0x0068: PHI (r6v5 java.lang.Object) = (r6v15 java.lang.Object), (r6v0 java.lang.Object) binds: [B:20:0x0065, B:9:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0071, code lost:
        
            if (r1.invoke(r6, r5) == r0) goto L24;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0071 -> B:25:0x0074). Please report as a decompilation issue!!! */
        @Override // p066i0.AbstractC6371a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) throws java.lang.Throwable {
            /*
                r5 = this;
                h0.a r0 = p064h0.EnumC6363a.f24419s
                int r1 = r5.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L20
                if (r1 == r3) goto L18
                if (r1 != r2) goto L10
                p011H.AbstractC0243G.m377o(r6)
                goto L74
            L10:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L18:
                java.lang.Object r1 = r5.L$0
                p0.p r1 = (p078p0.InterfaceC6502p) r1
                p011H.AbstractC0243G.m377o(r6)
                goto L68
            L20:
                p011H.AbstractC0243G.m377o(r6)
                androidx.datastore.core.SimpleActor<T> r6 = r5.this$0
                androidx.datastore.core.AtomicInt r6 = androidx.datastore.core.SimpleActor.access$getRemainingMessages$p(r6)
                int r6 = r6.get()
                if (r6 <= 0) goto L83
            L2f:
                androidx.datastore.core.SimpleActor<T> r6 = r5.this$0
                A0.v r6 = androidx.datastore.core.SimpleActor.access$getScope$p(r6)
                g0.h r6 = r6.getCoroutineContext()
                A0.u r1 = p000A0.C0065u.f80t
                g0.f r6 = r6.get(r1)
                A0.X r6 = (p000A0.InterfaceC0022X) r6
                if (r6 == 0) goto L51
                boolean r1 = r6.mo28c()
                if (r1 == 0) goto L4a
                goto L51
            L4a:
                A0.e0 r6 = (p000A0.C0034e0) r6
                java.util.concurrent.CancellationException r6 = r6.m67u()
                throw r6
            L51:
                androidx.datastore.core.SimpleActor<T> r6 = r5.this$0
                p0.p r1 = androidx.datastore.core.SimpleActor.access$getConsumeMessage$p(r6)
                androidx.datastore.core.SimpleActor<T> r6 = r5.this$0
                C0.g r6 = androidx.datastore.core.SimpleActor.access$getMessageQueue$p(r6)
                r5.L$0 = r1
                r5.label = r3
                java.lang.Object r6 = r6.mo223a(r5)
                if (r6 != r0) goto L68
                goto L73
            L68:
                r4 = 0
                r5.L$0 = r4
                r5.label = r2
                java.lang.Object r6 = r1.invoke(r6, r5)
                if (r6 != r0) goto L74
            L73:
                return r0
            L74:
                androidx.datastore.core.SimpleActor<T> r6 = r5.this$0
                androidx.datastore.core.AtomicInt r6 = androidx.datastore.core.SimpleActor.access$getRemainingMessages$p(r6)
                int r6 = r6.decrementAndGet()
                if (r6 != 0) goto L2f
                d0.k r6 = p057d0.C6289k.f24318a
                return r6
            L83:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "Check failed."
                r6.<init>(r0)
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.SimpleActor.C13362.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public SimpleActor(InterfaceC0066v scope, InterfaceC6498l onComplete, InterfaceC6502p onUndeliveredElement, InterfaceC6502p consumeMessage) {
        AbstractC6452k.m12181e(scope, "scope");
        AbstractC6452k.m12181e(onComplete, "onComplete");
        AbstractC6452k.m12181e(onUndeliveredElement, "onUndeliveredElement");
        AbstractC6452k.m12181e(consumeMessage, "consumeMessage");
        this.scope = scope;
        this.consumeMessage = consumeMessage;
        this.messageQueue = AbstractC0878a.m1795a(Integer.MAX_VALUE, null, 6);
        this.remainingMessages = new AtomicInt(0);
        InterfaceC0022X interfaceC0022X = (InterfaceC0022X) scope.getCoroutineContext().get(C0065u.f80t);
        if (interfaceC0022X != null) {
            ((C0034e0) interfaceC0022X).m48C(true, new C0043j(new C13351(onComplete, this, onUndeliveredElement), 1));
        }
    }

    public final void offer(T t) {
        Object objMo227g = this.messageQueue.mo227g(t);
        if (!(objMo227g instanceof C0143h)) {
            if (objMo227g instanceof C0144i) {
                throw new IllegalStateException("Check failed.");
            }
            if (this.remainingMessages.getAndIncrement() == 0) {
                AbstractC0069y.m111j(this.scope, null, new C13362(this, null), 3);
                return;
            }
            return;
        }
        C0143h c0143h = (C0143h) objMo227g;
        if (c0143h == null) {
            c0143h = null;
        }
        Throwable th = c0143h != null ? c0143h.f255a : null;
        if (th != null) {
            throw th;
        }
        throw new ClosedSendChannelException("Channel was closed normally");
    }
}
