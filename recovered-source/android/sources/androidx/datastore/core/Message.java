package androidx.datastore.core;

import kotlin.jvm.internal.AbstractC6447f;
import kotlin.jvm.internal.AbstractC6452k;
import p000A0.InterfaceC0049m;
import p062g0.InterfaceC6353h;
import p078p0.InterfaceC6502p;

/* JADX INFO: loaded from: classes.dex */
public abstract class Message<T> {

    public static final class Read<T> extends Message<T> {
        private final State<T> lastState;

        public Read(State<T> state) {
            super(null);
            this.lastState = state;
        }

        @Override // androidx.datastore.core.Message
        public State<T> getLastState() {
            return this.lastState;
        }
    }

    public static final class Update<T> extends Message<T> {
        private final InterfaceC0049m ack;
        private final InterfaceC6353h callerContext;
        private final State<T> lastState;
        private final InterfaceC6502p transform;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Update(InterfaceC6502p transform, InterfaceC0049m ack, State<T> state, InterfaceC6353h callerContext) {
            super(null);
            AbstractC6452k.m12181e(transform, "transform");
            AbstractC6452k.m12181e(ack, "ack");
            AbstractC6452k.m12181e(callerContext, "callerContext");
            this.transform = transform;
            this.ack = ack;
            this.lastState = state;
            this.callerContext = callerContext;
        }

        public final InterfaceC0049m getAck() {
            return this.ack;
        }

        public final InterfaceC6353h getCallerContext() {
            return this.callerContext;
        }

        @Override // androidx.datastore.core.Message
        public State<T> getLastState() {
            return this.lastState;
        }

        public final InterfaceC6502p getTransform() {
            return this.transform;
        }
    }

    public /* synthetic */ Message(AbstractC6447f abstractC6447f) {
        this();
    }

    public abstract State<T> getLastState();

    private Message() {
    }
}
