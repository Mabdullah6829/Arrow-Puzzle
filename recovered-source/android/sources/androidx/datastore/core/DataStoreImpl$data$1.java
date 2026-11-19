package androidx.datastore.core;

import androidx.constraintlayout.widget.C1137R;
import kotlin.NoWhenBranchMatchedException;
import p006D0.C0165E;
import p006D0.C0175j;
import p006D0.C0177l;
import p006D0.InterfaceC0170e;
import p006D0.InterfaceC0171f;
import p011H.AbstractC0243G;
import p057d0.C6289k;
import p062g0.InterfaceC6348c;
import p064h0.EnumC6363a;
import p066i0.AbstractC6373c;
import p066i0.AbstractC6379i;
import p066i0.InterfaceC6375e;
import p078p0.InterfaceC6502p;
import p078p0.InterfaceC6503q;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC6375e(m12158c = "androidx.datastore.core.DataStoreImpl$data$1", m12159f = "DataStoreImpl.kt", m12160l = {72, 74, 100}, m12161m = "invokeSuspend")
public final class DataStoreImpl$data$1 extends AbstractC6379i implements InterfaceC6502p {
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ DataStoreImpl<T> this$0;

    /* JADX INFO: renamed from: androidx.datastore.core.DataStoreImpl$data$1$1 */
    @InterfaceC6375e(m12158c = "androidx.datastore.core.DataStoreImpl$data$1$1", m12159f = "DataStoreImpl.kt", m12160l = {102}, m12161m = "invokeSuspend")
    public static final class C12991 extends AbstractC6379i implements InterfaceC6502p {
        int label;
        final /* synthetic */ DataStoreImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12991(DataStoreImpl<T> dataStoreImpl, InterfaceC6348c interfaceC6348c) {
            super(2, interfaceC6348c);
            this.this$0 = dataStoreImpl;
        }

        @Override // p066i0.AbstractC6371a
        public final InterfaceC6348c create(Object obj, InterfaceC6348c interfaceC6348c) {
            return new C12991(this.this$0, interfaceC6348c);
        }

        @Override // p078p0.InterfaceC6502p
        public final Object invoke(InterfaceC0171f interfaceC0171f, InterfaceC6348c interfaceC6348c) {
            return ((C12991) create(interfaceC0171f, interfaceC6348c)).invokeSuspend(C6289k.f24318a);
        }

        @Override // p066i0.AbstractC6371a
        public final Object invokeSuspend(Object obj) throws Throwable {
            EnumC6363a enumC6363a = EnumC6363a.f24419s;
            int i2 = this.label;
            if (i2 == 0) {
                AbstractC0243G.m377o(obj);
                DataStoreImpl<T> dataStoreImpl = this.this$0;
                this.label = 1;
                if (dataStoreImpl.incrementCollector(this) == enumC6363a) {
                    return enumC6363a;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC0243G.m377o(obj);
            }
            return C6289k.f24318a;
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.core.DataStoreImpl$data$1$2 */
    @InterfaceC6375e(m12158c = "androidx.datastore.core.DataStoreImpl$data$1$2", m12159f = "DataStoreImpl.kt", m12160l = {}, m12161m = "invokeSuspend")
    public static final class C13002 extends AbstractC6379i implements InterfaceC6502p {
        /* synthetic */ Object L$0;
        int label;

        public C13002(InterfaceC6348c interfaceC6348c) {
            super(2, interfaceC6348c);
        }

        @Override // p066i0.AbstractC6371a
        public final InterfaceC6348c create(Object obj, InterfaceC6348c interfaceC6348c) {
            C13002 c13002 = new C13002(interfaceC6348c);
            c13002.L$0 = obj;
            return c13002;
        }

        @Override // p078p0.InterfaceC6502p
        public final Object invoke(State<T> state, InterfaceC6348c interfaceC6348c) {
            return ((C13002) create(state, interfaceC6348c)).invokeSuspend(C6289k.f24318a);
        }

        @Override // p066i0.AbstractC6371a
        public final Object invokeSuspend(Object obj) throws Throwable {
            EnumC6363a enumC6363a = EnumC6363a.f24419s;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0243G.m377o(obj);
            return Boolean.valueOf(!(((State) this.L$0) instanceof Final));
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.core.DataStoreImpl$data$1$3 */
    @InterfaceC6375e(m12158c = "androidx.datastore.core.DataStoreImpl$data$1$3", m12159f = "DataStoreImpl.kt", m12160l = {}, m12161m = "invokeSuspend")
    public static final class C13013 extends AbstractC6379i implements InterfaceC6502p {
        final /* synthetic */ State<T> $startState;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13013(State<T> state, InterfaceC6348c interfaceC6348c) {
            super(2, interfaceC6348c);
            this.$startState = state;
        }

        @Override // p066i0.AbstractC6371a
        public final InterfaceC6348c create(Object obj, InterfaceC6348c interfaceC6348c) {
            C13013 c13013 = new C13013(this.$startState, interfaceC6348c);
            c13013.L$0 = obj;
            return c13013;
        }

        @Override // p078p0.InterfaceC6502p
        public final Object invoke(State<T> state, InterfaceC6348c interfaceC6348c) {
            return ((C13013) create(state, interfaceC6348c)).invokeSuspend(C6289k.f24318a);
        }

        @Override // p066i0.AbstractC6371a
        public final Object invokeSuspend(Object obj) throws Throwable {
            EnumC6363a enumC6363a = EnumC6363a.f24419s;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0243G.m377o(obj);
            State state = (State) this.L$0;
            return Boolean.valueOf((state instanceof Data) && state.getVersion() <= this.$startState.getVersion());
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.core.DataStoreImpl$data$1$5 */
    @InterfaceC6375e(m12158c = "androidx.datastore.core.DataStoreImpl$data$1$5", m12159f = "DataStoreImpl.kt", m12160l = {C1137R.styleable.ConstraintSet_pathMotionArc}, m12161m = "invokeSuspend")
    public static final class C13025 extends AbstractC6379i implements InterfaceC6503q {
        int label;
        final /* synthetic */ DataStoreImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13025(DataStoreImpl<T> dataStoreImpl, InterfaceC6348c interfaceC6348c) {
            super(3, interfaceC6348c);
            this.this$0 = dataStoreImpl;
        }

        @Override // p078p0.InterfaceC6503q
        public final Object invoke(InterfaceC0171f interfaceC0171f, Throwable th, InterfaceC6348c interfaceC6348c) {
            return new C13025(this.this$0, interfaceC6348c).invokeSuspend(C6289k.f24318a);
        }

        @Override // p066i0.AbstractC6371a
        public final Object invokeSuspend(Object obj) throws Throwable {
            EnumC6363a enumC6363a = EnumC6363a.f24419s;
            int i2 = this.label;
            if (i2 == 0) {
                AbstractC0243G.m377o(obj);
                DataStoreImpl<T> dataStoreImpl = this.this$0;
                this.label = 1;
                if (dataStoreImpl.decrementCollector(this) == enumC6363a) {
                    return enumC6363a;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC0243G.m377o(obj);
            }
            return C6289k.f24318a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataStoreImpl$data$1(DataStoreImpl<T> dataStoreImpl, InterfaceC6348c interfaceC6348c) {
        super(2, interfaceC6348c);
        this.this$0 = dataStoreImpl;
    }

    @Override // p066i0.AbstractC6371a
    public final InterfaceC6348c create(Object obj, InterfaceC6348c interfaceC6348c) {
        DataStoreImpl$data$1 dataStoreImpl$data$1 = new DataStoreImpl$data$1(this.this$0, interfaceC6348c);
        dataStoreImpl$data$1.L$0 = obj;
        return dataStoreImpl$data$1;
    }

    @Override // p078p0.InterfaceC6502p
    public final Object invoke(InterfaceC0171f interfaceC0171f, InterfaceC6348c interfaceC6348c) {
        return ((DataStoreImpl$data$1) create(interfaceC0171f, interfaceC6348c)).invokeSuspend(C6289k.f24318a);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:36:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c9 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:39:0x00ca A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:40:0x00cb  */
    /* JADX WARN: Type inference failed for: r3v11, types: [androidx.datastore.core.DataStoreImpl$data$1$invokeSuspend$$inlined$map$1] */
    @Override // p066i0.AbstractC6371a
    public final Object invokeSuspend(Object obj) throws Throwable {
        InterfaceC0171f interfaceC0171f;
        State state;
        InterfaceC0171f interfaceC0171f2;
        State state2;
        C0175j c0175j;
        Object objCollect;
        EnumC6363a enumC6363a = EnumC6363a.f24419s;
        int i2 = this.label;
        C6289k c6289k = C6289k.f24318a;
        if (i2 == 0) {
            AbstractC0243G.m377o(obj);
            InterfaceC0171f interfaceC0171f3 = (InterfaceC0171f) this.L$0;
            DataStoreImpl<T> dataStoreImpl = this.this$0;
            this.L$0 = interfaceC0171f3;
            this.label = 1;
            Object state3 = dataStoreImpl.readState(false, this);
            if (state3 != enumC6363a) {
                interfaceC0171f = interfaceC0171f3;
                obj = state3;
            }
            return enumC6363a;
        }
        if (i2 == 1) {
            interfaceC0171f = (InterfaceC0171f) this.L$0;
            AbstractC0243G.m377o(obj);
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC0243G.m377o(obj);
                return c6289k;
            }
            state2 = (State) this.L$1;
            interfaceC0171f2 = (InterfaceC0171f) this.L$0;
            AbstractC0243G.m377o(obj);
        }
        state = state2;
        interfaceC0171f = interfaceC0171f2;
        final C0177l c0177l = new C0177l(new C0177l(new C0177l(0, new C12991(this.this$0, null), ((DataStoreImpl) this.this$0).inMemoryCache.getFlow()), new C13002(null), 3), new C13013(state, null), 2);
        c0175j = new C0175j(new InterfaceC0170e() { // from class: androidx.datastore.core.DataStoreImpl$data$1$invokeSuspend$$inlined$map$1

            /* JADX INFO: renamed from: androidx.datastore.core.DataStoreImpl$data$1$invokeSuspend$$inlined$map$1$2 */
            public static final class C13032<T> implements InterfaceC0171f {
                final /* synthetic */ InterfaceC0171f $this_unsafeFlow;

                /* JADX INFO: renamed from: androidx.datastore.core.DataStoreImpl$data$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                @InterfaceC6375e(m12158c = "androidx.datastore.core.DataStoreImpl$data$1$invokeSuspend$$inlined$map$1$2", m12159f = "DataStoreImpl.kt", m12160l = {223}, m12161m = "emit")
                public static final class AnonymousClass1 extends AbstractC6373c {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(InterfaceC6348c interfaceC6348c) {
                        super(interfaceC6348c);
                    }

                    @Override // p066i0.AbstractC6371a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C13032.this.emit(null, this);
                    }
                }

                public C13032(InterfaceC0171f interfaceC0171f) {
                    this.$this_unsafeFlow = interfaceC0171f;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // p006D0.InterfaceC0171f
                public final Object emit(Object obj, InterfaceC6348c interfaceC6348c) throws Throwable {
                    AnonymousClass1 anonymousClass1;
                    if (interfaceC6348c instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) interfaceC6348c;
                        int i2 = anonymousClass1.label;
                        if ((i2 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i2 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(interfaceC6348c);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(interfaceC6348c);
                    }
                    Object obj2 = anonymousClass1.result;
                    EnumC6363a enumC6363a = EnumC6363a.f24419s;
                    int i3 = anonymousClass1.label;
                    if (i3 == 0) {
                        AbstractC0243G.m377o(obj2);
                        InterfaceC0171f interfaceC0171f = this.$this_unsafeFlow;
                        State state = (State) obj;
                        if (state instanceof ReadException) {
                            throw ((ReadException) state).getReadException();
                        }
                        if (!(state instanceof Data)) {
                            if (state instanceof Final ? true : state instanceof UnInitialized) {
                                throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                            }
                            throw new NoWhenBranchMatchedException();
                        }
                        Object value = ((Data) state).getValue();
                        anonymousClass1.label = 1;
                        if (interfaceC0171f.emit(value, anonymousClass1) == enumC6363a) {
                            return enumC6363a;
                        }
                    } else {
                        if (i3 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC0243G.m377o(obj2);
                    }
                    return C6289k.f24318a;
                }
            }

            @Override // p006D0.InterfaceC0170e
            public Object collect(InterfaceC0171f interfaceC0171f4, InterfaceC6348c interfaceC6348c) {
                Object objCollect2 = c0177l.collect(new C13032(interfaceC0171f4), interfaceC6348c);
                return objCollect2 == EnumC6363a.f24419s ? objCollect2 : C6289k.f24318a;
            }
        }, new C13025(this.this$0, null));
        this.L$0 = null;
        this.L$1 = null;
        this.label = 3;
        if (interfaceC0171f instanceof C0165E) {
            throw ((C0165E) interfaceC0171f).f294s;
        }
        objCollect = c0175j.collect(interfaceC0171f, this);
        if (objCollect != enumC6363a) {
            objCollect = c6289k;
        }
        if (objCollect != enumC6363a) {
            return enumC6363a;
        }
        return c6289k;
        state = (State) obj;
        if (!(state instanceof Data)) {
            if (state instanceof UnInitialized) {
                throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
            }
            if (state instanceof ReadException) {
                throw ((ReadException) state).getReadException();
            }
            if (!(state instanceof Final)) {
                final InterfaceC0170e c0177l2 = new C0177l(new C0177l(new C0177l(0, new C12991(this.this$0, null), ((DataStoreImpl) this.this$0).inMemoryCache.getFlow()), new C13002(null), 3), new C13013(state, null), 2);
                c0175j = new C0175j(new InterfaceC0170e() { // from class: androidx.datastore.core.DataStoreImpl$data$1$invokeSuspend$$inlined$map$1

                    /* JADX INFO: renamed from: androidx.datastore.core.DataStoreImpl$data$1$invokeSuspend$$inlined$map$1$2 */
                    public static final class C13032<T> implements InterfaceC0171f {
                        final /* synthetic */ InterfaceC0171f $this_unsafeFlow;

                        /* JADX INFO: renamed from: androidx.datastore.core.DataStoreImpl$data$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                        @InterfaceC6375e(m12158c = "androidx.datastore.core.DataStoreImpl$data$1$invokeSuspend$$inlined$map$1$2", m12159f = "DataStoreImpl.kt", m12160l = {223}, m12161m = "emit")
                        public static final class AnonymousClass1 extends AbstractC6373c {
                            Object L$0;
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(InterfaceC6348c interfaceC6348c) {
                                super(interfaceC6348c);
                            }

                            @Override // p066i0.AbstractC6371a
                            public final Object invokeSuspend(Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return C13032.this.emit(null, this);
                            }
                        }

                        public C13032(InterfaceC0171f interfaceC0171f) {
                            this.$this_unsafeFlow = interfaceC0171f;
                        }

                        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                        @Override // p006D0.InterfaceC0171f
                        public final Object emit(Object obj, InterfaceC6348c interfaceC6348c) throws Throwable {
                            AnonymousClass1 anonymousClass1;
                            if (interfaceC6348c instanceof AnonymousClass1) {
                                anonymousClass1 = (AnonymousClass1) interfaceC6348c;
                                int i2 = anonymousClass1.label;
                                if ((i2 & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.label = i2 - Integer.MIN_VALUE;
                                } else {
                                    anonymousClass1 = new AnonymousClass1(interfaceC6348c);
                                }
                            } else {
                                anonymousClass1 = new AnonymousClass1(interfaceC6348c);
                            }
                            Object obj2 = anonymousClass1.result;
                            EnumC6363a enumC6363a = EnumC6363a.f24419s;
                            int i3 = anonymousClass1.label;
                            if (i3 == 0) {
                                AbstractC0243G.m377o(obj2);
                                InterfaceC0171f interfaceC0171f = this.$this_unsafeFlow;
                                State state = (State) obj;
                                if (state instanceof ReadException) {
                                    throw ((ReadException) state).getReadException();
                                }
                                if (!(state instanceof Data)) {
                                    if (state instanceof Final ? true : state instanceof UnInitialized) {
                                        throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                                    }
                                    throw new NoWhenBranchMatchedException();
                                }
                                Object value = ((Data) state).getValue();
                                anonymousClass1.label = 1;
                                if (interfaceC0171f.emit(value, anonymousClass1) == enumC6363a) {
                                    return enumC6363a;
                                }
                            } else {
                                if (i3 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                AbstractC0243G.m377o(obj2);
                            }
                            return C6289k.f24318a;
                        }
                    }

                    @Override // p006D0.InterfaceC0170e
                    public Object collect(InterfaceC0171f interfaceC0171f4, InterfaceC6348c interfaceC6348c) {
                        Object objCollect2 = c0177l2.collect(new C13032(interfaceC0171f4), interfaceC6348c);
                        return objCollect2 == EnumC6363a.f24419s ? objCollect2 : C6289k.f24318a;
                    }
                }, new C13025(this.this$0, null));
                this.L$0 = null;
                this.L$1 = null;
                this.label = 3;
                if (interfaceC0171f instanceof C0165E) {
                    throw ((C0165E) interfaceC0171f).f294s;
                }
                objCollect = c0175j.collect(interfaceC0171f, this);
                if (objCollect != enumC6363a) {
                    objCollect = c6289k;
                }
                if (objCollect != enumC6363a) {
                    return enumC6363a;
                }
            }
            return c6289k;
        }
        Object value = ((Data) state).getValue();
        this.L$0 = interfaceC0171f;
        this.L$1 = state;
        this.label = 2;
        if (interfaceC0171f.emit(value, this) != enumC6363a) {
            interfaceC0171f2 = interfaceC0171f;
            state2 = state;
            state = state2;
            interfaceC0171f = interfaceC0171f2;
            final InterfaceC0170e c0177l3 = new C0177l(new C0177l(new C0177l(0, new C12991(this.this$0, null), ((DataStoreImpl) this.this$0).inMemoryCache.getFlow()), new C13002(null), 3), new C13013(state, null), 2);
            c0175j = new C0175j(new InterfaceC0170e() { // from class: androidx.datastore.core.DataStoreImpl$data$1$invokeSuspend$$inlined$map$1

                /* JADX INFO: renamed from: androidx.datastore.core.DataStoreImpl$data$1$invokeSuspend$$inlined$map$1$2 */
                public static final class C13032<T> implements InterfaceC0171f {
                    final /* synthetic */ InterfaceC0171f $this_unsafeFlow;

                    /* JADX INFO: renamed from: androidx.datastore.core.DataStoreImpl$data$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                    @InterfaceC6375e(m12158c = "androidx.datastore.core.DataStoreImpl$data$1$invokeSuspend$$inlined$map$1$2", m12159f = "DataStoreImpl.kt", m12160l = {223}, m12161m = "emit")
                    public static final class AnonymousClass1 extends AbstractC6373c {
                        Object L$0;
                        int label;
                        /* synthetic */ Object result;

                        public AnonymousClass1(InterfaceC6348c interfaceC6348c) {
                            super(interfaceC6348c);
                        }

                        @Override // p066i0.AbstractC6371a
                        public final Object invokeSuspend(Object obj) {
                            this.result = obj;
                            this.label |= Integer.MIN_VALUE;
                            return C13032.this.emit(null, this);
                        }
                    }

                    public C13032(InterfaceC0171f interfaceC0171f) {
                        this.$this_unsafeFlow = interfaceC0171f;
                    }

                    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                    @Override // p006D0.InterfaceC0171f
                    public final Object emit(Object obj, InterfaceC6348c interfaceC6348c) throws Throwable {
                        AnonymousClass1 anonymousClass1;
                        if (interfaceC6348c instanceof AnonymousClass1) {
                            anonymousClass1 = (AnonymousClass1) interfaceC6348c;
                            int i2 = anonymousClass1.label;
                            if ((i2 & Integer.MIN_VALUE) != 0) {
                                anonymousClass1.label = i2 - Integer.MIN_VALUE;
                            } else {
                                anonymousClass1 = new AnonymousClass1(interfaceC6348c);
                            }
                        } else {
                            anonymousClass1 = new AnonymousClass1(interfaceC6348c);
                        }
                        Object obj2 = anonymousClass1.result;
                        EnumC6363a enumC6363a = EnumC6363a.f24419s;
                        int i3 = anonymousClass1.label;
                        if (i3 == 0) {
                            AbstractC0243G.m377o(obj2);
                            InterfaceC0171f interfaceC0171f = this.$this_unsafeFlow;
                            State state = (State) obj;
                            if (state instanceof ReadException) {
                                throw ((ReadException) state).getReadException();
                            }
                            if (!(state instanceof Data)) {
                                if (state instanceof Final ? true : state instanceof UnInitialized) {
                                    throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                                }
                                throw new NoWhenBranchMatchedException();
                            }
                            Object value = ((Data) state).getValue();
                            anonymousClass1.label = 1;
                            if (interfaceC0171f.emit(value, anonymousClass1) == enumC6363a) {
                                return enumC6363a;
                            }
                        } else {
                            if (i3 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            AbstractC0243G.m377o(obj2);
                        }
                        return C6289k.f24318a;
                    }
                }

                @Override // p006D0.InterfaceC0170e
                public Object collect(InterfaceC0171f interfaceC0171f4, InterfaceC6348c interfaceC6348c) {
                    Object objCollect2 = c0177l3.collect(new C13032(interfaceC0171f4), interfaceC6348c);
                    return objCollect2 == EnumC6363a.f24419s ? objCollect2 : C6289k.f24318a;
                }
            }, new C13025(this.this$0, null));
            this.L$0 = null;
            this.L$1 = null;
            this.label = 3;
            if (interfaceC0171f instanceof C0165E) {
                throw ((C0165E) interfaceC0171f).f294s;
            }
            objCollect = c0175j.collect(interfaceC0171f, this);
            if (objCollect != enumC6363a) {
                objCollect = c6289k;
            }
            if (objCollect != enumC6363a) {
                return c6289k;
            }
        }
        return enumC6363a;
    }
}
