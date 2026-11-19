package androidx.datastore.core;

import kotlin.jvm.internal.AbstractC6447f;
import kotlin.jvm.internal.AbstractC6452k;
import p000A0.C0057q;
import p037U0.AbstractC0846b;
import p062g0.C6354i;
import p062g0.InterfaceC6351f;
import p062g0.InterfaceC6352g;
import p062g0.InterfaceC6353h;
import p078p0.InterfaceC6502p;

/* JADX INFO: loaded from: classes.dex */
public final class UpdatingDataContextElement implements InterfaceC6351f {
    public static final Companion Companion = new Companion(null);
    private static final String NESTED_UPDATE_ERROR_MESSAGE = "Calling updateData inside updateData on the same DataStore instance is not supported\nsince updates made in the parent updateData call will not be visible to the nested\nupdateData call. See https://issuetracker.google.com/issues/241760537 for details.";
    private final DataStoreImpl<?> instance;
    private final UpdatingDataContextElement parent;

    public static final class Companion {

        public static final class Key implements InterfaceC6352g {
            public static final Key INSTANCE = new Key();

            private Key() {
            }
        }

        public /* synthetic */ Companion(AbstractC6447f abstractC6447f) {
            this();
        }

        public final String getNESTED_UPDATE_ERROR_MESSAGE$datastore_core_release() {
            return UpdatingDataContextElement.NESTED_UPDATE_ERROR_MESSAGE;
        }

        private Companion() {
        }
    }

    public UpdatingDataContextElement(UpdatingDataContextElement updatingDataContextElement, DataStoreImpl<?> instance) {
        AbstractC6452k.m12181e(instance, "instance");
        this.parent = updatingDataContextElement;
        this.instance = instance;
    }

    public final void checkNotUpdating(DataStore<?> candidate) {
        AbstractC6452k.m12181e(candidate, "candidate");
        if (this.instance == candidate) {
            throw new IllegalStateException(NESTED_UPDATE_ERROR_MESSAGE.toString());
        }
        UpdatingDataContextElement updatingDataContextElement = this.parent;
        if (updatingDataContextElement != null) {
            updatingDataContextElement.checkNotUpdating(candidate);
        }
    }

    @Override // p062g0.InterfaceC6353h
    public <R> R fold(R r2, InterfaceC6502p operation) {
        AbstractC6452k.m12181e(operation, "operation");
        return (R) operation.invoke(r2, this);
    }

    @Override // p062g0.InterfaceC6353h
    public <E extends InterfaceC6351f> E get(InterfaceC6352g interfaceC6352g) {
        return (E) AbstractC0846b.m1749h(this, interfaceC6352g);
    }

    @Override // p062g0.InterfaceC6351f
    public InterfaceC6352g getKey() {
        return Companion.Key.INSTANCE;
    }

    @Override // p062g0.InterfaceC6353h
    public InterfaceC6353h minusKey(InterfaceC6352g interfaceC6352g) {
        return AbstractC0846b.m1753l(this, interfaceC6352g);
    }

    @Override // p062g0.InterfaceC6353h
    public InterfaceC6353h plus(InterfaceC6353h context) {
        AbstractC6452k.m12181e(context, "context");
        return context == C6354i.f24409s ? this : (InterfaceC6353h) context.fold(this, new C0057q(10));
    }
}
