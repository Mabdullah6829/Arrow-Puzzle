package androidx.datastore.core;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.datastore.core.handlers.NoOpCorruptionHandler;
import com.google.android.material.card.MaterialCardViewHelper;
import java.util.List;
import kotlin.jvm.internal.AbstractC6447f;
import kotlin.jvm.internal.AbstractC6452k;
import kotlin.jvm.internal.C6460s;
import kotlin.jvm.internal.C6462u;
import p000A0.AbstractC0069y;
import p000A0.C0050m0;
import p000A0.C0051n;
import p000A0.InterfaceC0022X;
import p000A0.InterfaceC0066v;
import p001B.C0092r;
import p006D0.InterfaceC0170e;
import p011H.AbstractC0242F;
import p011H.AbstractC0243G;
import p014I0.C0315d;
import p014I0.InterfaceC0312a;
import p043a.AbstractC0878a;
import p057d0.C6283e;
import p057d0.C6289k;
import p057d0.InterfaceC6281c;
import p058e0.AbstractC6305m;
import p058e0.C6313u;
import p062g0.InterfaceC6348c;
import p062g0.InterfaceC6353h;
import p064h0.EnumC6363a;
import p066i0.AbstractC6373c;
import p066i0.AbstractC6379i;
import p066i0.InterfaceC6375e;
import p078p0.InterfaceC6498l;
import p078p0.InterfaceC6502p;

/* JADX INFO: loaded from: classes.dex */
public final class DataStoreImpl<T> implements DataStore<T> {
    private static final String BUG_MESSAGE = "This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542";
    public static final Companion Companion = new Companion(null);
    private int collectorCounter;
    private InterfaceC0022X collectorJob;
    private final InterfaceC0312a collectorMutex;
    private final InterfaceC6281c coordinator$delegate;
    private final CorruptionHandler<T> corruptionHandler;
    private final InterfaceC0170e data;
    private final DataStoreInMemoryCache<T> inMemoryCache;
    private final DataStoreImpl<T>.InitDataStore readAndInit;
    private final InterfaceC0066v scope;
    private final Storage<T> storage;
    private final InterfaceC6281c storageConnectionDelegate;
    private final SimpleActor<Message.Update<T>> writeActor;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC6447f abstractC6447f) {
            this();
        }

        private Companion() {
        }
    }

    public final class InitDataStore extends RunOnce {
        private List<? extends InterfaceC6502p> initTasks;
        final /* synthetic */ DataStoreImpl<T> this$0;

        public InitDataStore(DataStoreImpl dataStoreImpl, List<? extends InterfaceC6502p> initTasksList) {
            AbstractC6452k.m12181e(initTasksList, "initTasksList");
            this.this$0 = dataStoreImpl;
            this.initTasks = AbstractC6305m.m12112H(initTasksList);
        }

        /* JADX WARN: Code duplicated, block: B:26:0x006c  */
        /* JADX WARN: Code duplicated, block: B:29:0x007a  */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // androidx.datastore.core.RunOnce
        public Object doRun(InterfaceC6348c interfaceC6348c) throws Throwable {
            DataStoreImpl$InitDataStore$doRun$1 dataStoreImpl$InitDataStore$doRun$1;
            InitDataStore initDataStore;
            Data data;
            if (interfaceC6348c instanceof DataStoreImpl$InitDataStore$doRun$1) {
                dataStoreImpl$InitDataStore$doRun$1 = (DataStoreImpl$InitDataStore$doRun$1) interfaceC6348c;
                int i2 = dataStoreImpl$InitDataStore$doRun$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    dataStoreImpl$InitDataStore$doRun$1.label = i2 - Integer.MIN_VALUE;
                } else {
                    dataStoreImpl$InitDataStore$doRun$1 = new DataStoreImpl$InitDataStore$doRun$1(this, interfaceC6348c);
                }
            } else {
                dataStoreImpl$InitDataStore$doRun$1 = new DataStoreImpl$InitDataStore$doRun$1(this, interfaceC6348c);
            }
            Object dataOrHandleCorruption = dataStoreImpl$InitDataStore$doRun$1.result;
            EnumC6363a enumC6363a = EnumC6363a.f24419s;
            int i3 = dataStoreImpl$InitDataStore$doRun$1.label;
            if (i3 == 0) {
                AbstractC0243G.m377o(dataOrHandleCorruption);
                List<? extends InterfaceC6502p> list = this.initTasks;
                if (list != null) {
                    AbstractC6452k.m12178b(list);
                    if (list.isEmpty()) {
                        DataStoreImpl<T> dataStoreImpl = this.this$0;
                        dataStoreImpl$InitDataStore$doRun$1.L$0 = this;
                        dataStoreImpl$InitDataStore$doRun$1.label = 1;
                        dataOrHandleCorruption = dataStoreImpl.readDataOrHandleCorruption(false, dataStoreImpl$InitDataStore$doRun$1);
                        if (dataOrHandleCorruption != enumC6363a) {
                            initDataStore = this;
                            data = (Data) dataOrHandleCorruption;
                        }
                    } else {
                        InterProcessCoordinator coordinator = this.this$0.getCoordinator();
                        DataStoreImpl$InitDataStore$doRun$initData$1 dataStoreImpl$InitDataStore$doRun$initData$1 = new DataStoreImpl$InitDataStore$doRun$initData$1(this.this$0, this, null);
                        dataStoreImpl$InitDataStore$doRun$1.L$0 = this;
                        dataStoreImpl$InitDataStore$doRun$1.label = 2;
                        dataOrHandleCorruption = coordinator.lock(dataStoreImpl$InitDataStore$doRun$initData$1, dataStoreImpl$InitDataStore$doRun$1);
                        if (dataOrHandleCorruption != enumC6363a) {
                            initDataStore = this;
                            data = (Data) dataOrHandleCorruption;
                        }
                    }
                } else {
                    DataStoreImpl<T> dataStoreImpl2 = this.this$0;
                    dataStoreImpl$InitDataStore$doRun$1.L$0 = this;
                    dataStoreImpl$InitDataStore$doRun$1.label = 1;
                    dataOrHandleCorruption = dataStoreImpl2.readDataOrHandleCorruption(false, dataStoreImpl$InitDataStore$doRun$1);
                    if (dataOrHandleCorruption != enumC6363a) {
                        initDataStore = this;
                        data = (Data) dataOrHandleCorruption;
                    }
                }
                return enumC6363a;
            }
            if (i3 == 1) {
                initDataStore = (InitDataStore) dataStoreImpl$InitDataStore$doRun$1.L$0;
                AbstractC0243G.m377o(dataOrHandleCorruption);
                data = (Data) dataOrHandleCorruption;
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                initDataStore = (InitDataStore) dataStoreImpl$InitDataStore$doRun$1.L$0;
                AbstractC0243G.m377o(dataOrHandleCorruption);
                data = (Data) dataOrHandleCorruption;
            }
            ((DataStoreImpl) initDataStore.this$0).inMemoryCache.tryUpdate(data);
            return C6289k.f24318a;
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.core.DataStoreImpl$decrementCollector$1 */
    @InterfaceC6375e(m12158c = "androidx.datastore.core.DataStoreImpl", m12159f = "DataStoreImpl.kt", m12160l = {544}, m12161m = "decrementCollector")
    public static final class C13041 extends AbstractC6373c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ DataStoreImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13041(DataStoreImpl<T> dataStoreImpl, InterfaceC6348c interfaceC6348c) {
            super(interfaceC6348c);
            this.this$0 = dataStoreImpl;
        }

        @Override // p066i0.AbstractC6371a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.decrementCollector(this);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.core.DataStoreImpl$doWithWriteFileLock$3 */
    @InterfaceC6375e(m12158c = "androidx.datastore.core.DataStoreImpl$doWithWriteFileLock$3", m12159f = "DataStoreImpl.kt", m12160l = {TypedValues.CycleType.TYPE_PATH_ROTATE}, m12161m = "invokeSuspend")
    public static final class C13053 extends AbstractC6379i implements InterfaceC6498l {
        final /* synthetic */ InterfaceC6498l $block;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13053(InterfaceC6498l interfaceC6498l, InterfaceC6348c interfaceC6348c) {
            super(1, interfaceC6348c);
            this.$block = interfaceC6498l;
        }

        @Override // p066i0.AbstractC6371a
        public final InterfaceC6348c create(InterfaceC6348c interfaceC6348c) {
            return new C13053(this.$block, interfaceC6348c);
        }

        @Override // p078p0.InterfaceC6498l
        public final Object invoke(InterfaceC6348c interfaceC6348c) {
            return ((C13053) create(interfaceC6348c)).invokeSuspend(C6289k.f24318a);
        }

        @Override // p066i0.AbstractC6371a
        public final Object invokeSuspend(Object obj) throws Throwable {
            EnumC6363a enumC6363a = EnumC6363a.f24419s;
            int i2 = this.label;
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC0243G.m377o(obj);
                return obj;
            }
            AbstractC0243G.m377o(obj);
            InterfaceC6498l interfaceC6498l = this.$block;
            this.label = 1;
            Object objInvoke = interfaceC6498l.invoke(this);
            return objInvoke == enumC6363a ? enumC6363a : objInvoke;
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.core.DataStoreImpl$handleUpdate$1 */
    @InterfaceC6375e(m12158c = "androidx.datastore.core.DataStoreImpl", m12159f = "DataStoreImpl.kt", m12160l = {237, 243, 246}, m12161m = "handleUpdate")
    public static final class C13061 extends AbstractC6373c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ DataStoreImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13061(DataStoreImpl<T> dataStoreImpl, InterfaceC6348c interfaceC6348c) {
            super(interfaceC6348c);
            this.this$0 = dataStoreImpl;
        }

        @Override // p066i0.AbstractC6371a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.handleUpdate(null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.core.DataStoreImpl$incrementCollector$1 */
    @InterfaceC6375e(m12158c = "androidx.datastore.core.DataStoreImpl", m12159f = "DataStoreImpl.kt", m12160l = {544}, m12161m = "incrementCollector")
    public static final class C13071 extends AbstractC6373c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ DataStoreImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13071(DataStoreImpl<T> dataStoreImpl, InterfaceC6348c interfaceC6348c) {
            super(interfaceC6348c);
            this.this$0 = dataStoreImpl;
        }

        @Override // p066i0.AbstractC6371a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.incrementCollector(this);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.core.DataStoreImpl$readAndInitOrPropagateAndThrowFailure$1 */
    @InterfaceC6375e(m12158c = "androidx.datastore.core.DataStoreImpl", m12159f = "DataStoreImpl.kt", m12160l = {264, 266}, m12161m = "readAndInitOrPropagateAndThrowFailure")
    public static final class C13091 extends AbstractC6373c {
        int I$0;
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ DataStoreImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13091(DataStoreImpl<T> dataStoreImpl, InterfaceC6348c interfaceC6348c) {
            super(interfaceC6348c);
            this.this$0 = dataStoreImpl;
        }

        @Override // p066i0.AbstractC6371a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.readAndInitOrPropagateAndThrowFailure(this);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.core.DataStoreImpl$readDataAndUpdateCache$1 */
    @InterfaceC6375e(m12158c = "androidx.datastore.core.DataStoreImpl", m12159f = "DataStoreImpl.kt", m12160l = {287, 296, 304}, m12161m = "readDataAndUpdateCache")
    public static final class C13101 extends AbstractC6373c {
        Object L$0;
        Object L$1;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ DataStoreImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13101(DataStoreImpl<T> dataStoreImpl, InterfaceC6348c interfaceC6348c) {
            super(interfaceC6348c);
            this.this$0 = dataStoreImpl;
        }

        @Override // p066i0.AbstractC6371a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.readDataAndUpdateCache(false, this);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.core.DataStoreImpl$readDataAndUpdateCache$3 */
    @InterfaceC6375e(m12158c = "androidx.datastore.core.DataStoreImpl$readDataAndUpdateCache$3", m12159f = "DataStoreImpl.kt", m12160l = {298, MaterialCardViewHelper.DEFAULT_FADE_ANIM_DURATION}, m12161m = "invokeSuspend")
    public static final class C13113 extends AbstractC6379i implements InterfaceC6498l {
        Object L$0;
        int label;
        final /* synthetic */ DataStoreImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13113(DataStoreImpl<T> dataStoreImpl, InterfaceC6348c interfaceC6348c) {
            super(1, interfaceC6348c);
            this.this$0 = dataStoreImpl;
        }

        @Override // p066i0.AbstractC6371a
        public final InterfaceC6348c create(InterfaceC6348c interfaceC6348c) {
            return new C13113(this.this$0, interfaceC6348c);
        }

        @Override // p078p0.InterfaceC6498l
        public final Object invoke(InterfaceC6348c interfaceC6348c) {
            return ((C13113) create(interfaceC6348c)).invokeSuspend(C6289k.f24318a);
        }

        @Override // p066i0.AbstractC6371a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Throwable th;
            State readException;
            EnumC6363a enumC6363a = EnumC6363a.f24419s;
            int i2 = this.label;
            try {
                if (i2 == 0) {
                    AbstractC0243G.m377o(obj);
                    DataStoreImpl<T> dataStoreImpl = this.this$0;
                    this.label = 1;
                    obj = dataStoreImpl.readDataOrHandleCorruption(true, this);
                    if (obj == enumC6363a) {
                        return enumC6363a;
                    }
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        th = (Throwable) this.L$0;
                        AbstractC0243G.m377o(obj);
                        readException = new ReadException(th, ((Number) obj).intValue());
                        return new C6283e(readException, Boolean.TRUE);
                    }
                    AbstractC0243G.m377o(obj);
                }
                readException = (State) obj;
            } catch (Throwable th2) {
                InterProcessCoordinator coordinator = this.this$0.getCoordinator();
                this.L$0 = th2;
                this.label = 2;
                Object version = coordinator.getVersion(this);
                if (version != enumC6363a) {
                    th = th2;
                    obj = version;
                }
                return enumC6363a;
            }
            return new C6283e(readException, Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.core.DataStoreImpl$readDataAndUpdateCache$4 */
    @InterfaceC6375e(m12158c = "androidx.datastore.core.DataStoreImpl$readDataAndUpdateCache$4", m12159f = "DataStoreImpl.kt", m12160l = {306, 309}, m12161m = "invokeSuspend")
    public static final class C13124 extends AbstractC6379i implements InterfaceC6502p {
        final /* synthetic */ int $cachedVersion;
        Object L$0;
        /* synthetic */ boolean Z$0;
        int label;
        final /* synthetic */ DataStoreImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13124(DataStoreImpl<T> dataStoreImpl, int i2, InterfaceC6348c interfaceC6348c) {
            super(2, interfaceC6348c);
            this.this$0 = dataStoreImpl;
            this.$cachedVersion = i2;
        }

        @Override // p066i0.AbstractC6371a
        public final InterfaceC6348c create(Object obj, InterfaceC6348c interfaceC6348c) {
            C13124 c13124 = new C13124(this.this$0, this.$cachedVersion, interfaceC6348c);
            c13124.Z$0 = ((Boolean) obj).booleanValue();
            return c13124;
        }

        @Override // p078p0.InterfaceC6502p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke(((Boolean) obj).booleanValue(), (InterfaceC6348c) obj2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v10 */
        /* JADX WARN: Type inference failed for: r0v2 */
        /* JADX WARN: Type inference failed for: r0v3 */
        /* JADX WARN: Type inference failed for: r0v5 */
        /* JADX WARN: Type inference failed for: r0v6 */
        /* JADX WARN: Type inference failed for: r0v9 */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1, types: [boolean] */
        /* JADX WARN: Type inference failed for: r1v10 */
        /* JADX WARN: Type inference failed for: r1v14 */
        /* JADX WARN: Type inference failed for: r1v15 */
        /* JADX WARN: Type inference failed for: r1v16 */
        /* JADX WARN: Type inference failed for: r1v4, types: [boolean] */
        /* JADX WARN: Type inference failed for: r1v7 */
        /* JADX WARN: Type inference failed for: r4v0 */
        @Override // p066i0.AbstractC6371a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Throwable th;
            int iIntValue;
            ?? r0;
            ?? r1;
            State state;
            ?? r2;
            EnumC6363a enumC6363a = EnumC6363a.f24419s;
            ?? r3 = this.label;
            try {
                if (r3 == 0) {
                    AbstractC0243G.m377o(obj);
                    boolean z = this.Z$0;
                    DataStoreImpl<T> dataStoreImpl = this.this$0;
                    this.Z$0 = z;
                    this.label = 1;
                    obj = dataStoreImpl.readDataOrHandleCorruption(z, this);
                    r3 = z;
                    if (obj == enumC6363a) {
                        return enumC6363a;
                    }
                } else {
                    if (r3 != 1) {
                        if (r3 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        boolean z2 = this.Z$0;
                        th = (Throwable) this.L$0;
                        AbstractC0243G.m377o(obj);
                        r1 = z2;
                        iIntValue = ((Number) obj).intValue();
                        r0 = r1;
                        ReadException readException = new ReadException(th, iIntValue);
                        r2 = r0;
                        state = readException;
                        return new C6283e(state, Boolean.valueOf((boolean) r2));
                    }
                    boolean z3 = this.Z$0;
                    AbstractC0243G.m377o(obj);
                    r3 = z3;
                }
                state = (State) obj;
                r2 = r3;
            } catch (Throwable th2) {
                if (r3 != 0) {
                    InterProcessCoordinator coordinator = this.this$0.getCoordinator();
                    this.L$0 = th2;
                    this.Z$0 = r3;
                    this.label = 2;
                    Object version = coordinator.getVersion(this);
                    if (version != enumC6363a) {
                        r1 = r3;
                        th = th2;
                        obj = version;
                    }
                    return enumC6363a;
                }
                ?? r4 = r3;
                th = th2;
                iIntValue = this.$cachedVersion;
                r0 = r4 == true ? 1 : 0;
            }
            return new C6283e(state, Boolean.valueOf((boolean) r2));
        }

        public final Object invoke(boolean z, InterfaceC6348c interfaceC6348c) {
            return ((C13124) create(Boolean.valueOf(z), interfaceC6348c)).invokeSuspend(C6289k.f24318a);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.core.DataStoreImpl$readDataOrHandleCorruption$1 */
    @InterfaceC6375e(m12158c = "androidx.datastore.core.DataStoreImpl", m12159f = "DataStoreImpl.kt", m12160l = {365, 366, 368, 369, 380, 384}, m12161m = "readDataOrHandleCorruption")
    public static final class C13131 extends AbstractC6373c {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ DataStoreImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13131(DataStoreImpl<T> dataStoreImpl, InterfaceC6348c interfaceC6348c) {
            super(interfaceC6348c);
            this.this$0 = dataStoreImpl;
        }

        @Override // p066i0.AbstractC6371a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.readDataOrHandleCorruption(false, this);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.core.DataStoreImpl$readDataOrHandleCorruption$2 */
    @InterfaceC6375e(m12158c = "androidx.datastore.core.DataStoreImpl$readDataOrHandleCorruption$2", m12159f = "DataStoreImpl.kt", m12160l = {370, 371}, m12161m = "invokeSuspend")
    public static final class C13142 extends AbstractC6379i implements InterfaceC6502p {
        final /* synthetic */ int $preLockVersion;
        Object L$0;
        /* synthetic */ boolean Z$0;
        int label;
        final /* synthetic */ DataStoreImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13142(DataStoreImpl<T> dataStoreImpl, int i2, InterfaceC6348c interfaceC6348c) {
            super(2, interfaceC6348c);
            this.this$0 = dataStoreImpl;
            this.$preLockVersion = i2;
        }

        @Override // p066i0.AbstractC6371a
        public final InterfaceC6348c create(Object obj, InterfaceC6348c interfaceC6348c) {
            C13142 c13142 = new C13142(this.this$0, this.$preLockVersion, interfaceC6348c);
            c13142.Z$0 = ((Boolean) obj).booleanValue();
            return c13142;
        }

        @Override // p078p0.InterfaceC6502p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke(((Boolean) obj).booleanValue(), (InterfaceC6348c) obj2);
        }

        /* JADX WARN: Code duplicated, block: B:22:0x0057  */
        /* JADX WARN: Code duplicated, block: B:23:0x005c  */
        @Override // p066i0.AbstractC6371a
        public final Object invokeSuspend(Object obj) throws Throwable {
            boolean z;
            Object obj2;
            int iIntValue;
            int iHashCode;
            EnumC6363a enumC6363a = EnumC6363a.f24419s;
            int i2 = this.label;
            if (i2 == 0) {
                AbstractC0243G.m377o(obj);
                z = this.Z$0;
                DataStoreImpl<T> dataStoreImpl = this.this$0;
                this.Z$0 = z;
                this.label = 1;
                obj = dataStoreImpl.readDataFromFileOrDefault(this);
                if (obj != enumC6363a) {
                }
                return enumC6363a;
            }
            if (i2 == 1) {
                z = this.Z$0;
                AbstractC0243G.m377o(obj);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj2 = this.L$0;
                AbstractC0243G.m377o(obj);
            }
            iIntValue = ((Number) obj).intValue();
            if (obj2 != null) {
                iHashCode = obj2.hashCode();
            } else {
                iHashCode = 0;
            }
            return new Data(obj2, iHashCode, iIntValue);
            if (z) {
                InterProcessCoordinator coordinator = this.this$0.getCoordinator();
                this.L$0 = obj;
                this.label = 2;
                Object version = coordinator.getVersion(this);
                if (version != enumC6363a) {
                    obj2 = obj;
                    obj = version;
                    iIntValue = ((Number) obj).intValue();
                }
                return enumC6363a;
            }
            obj2 = obj;
            iIntValue = this.$preLockVersion;
            if (obj2 != null) {
                iHashCode = obj2.hashCode();
            } else {
                iHashCode = 0;
            }
            return new Data(obj2, iHashCode, iIntValue);
        }

        public final Object invoke(boolean z, InterfaceC6348c interfaceC6348c) {
            return ((C13142) create(Boolean.valueOf(z), interfaceC6348c)).invokeSuspend(C6289k.f24318a);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.core.DataStoreImpl$readDataOrHandleCorruption$3 */
    @InterfaceC6375e(m12158c = "androidx.datastore.core.DataStoreImpl$readDataOrHandleCorruption$3", m12159f = "DataStoreImpl.kt", m12160l = {387, 388, 390}, m12161m = "invokeSuspend")
    public static final class C13153 extends AbstractC6379i implements InterfaceC6498l {
        final /* synthetic */ C6462u $newData;
        final /* synthetic */ C6460s $version;
        Object L$0;
        int label;
        final /* synthetic */ DataStoreImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13153(C6462u c6462u, DataStoreImpl<T> dataStoreImpl, C6460s c6460s, InterfaceC6348c interfaceC6348c) {
            super(1, interfaceC6348c);
            this.$newData = c6462u;
            this.this$0 = dataStoreImpl;
            this.$version = c6460s;
        }

        @Override // p066i0.AbstractC6371a
        public final InterfaceC6348c create(InterfaceC6348c interfaceC6348c) {
            return new C13153(this.$newData, this.this$0, this.$version, interfaceC6348c);
        }

        @Override // p078p0.InterfaceC6498l
        public final Object invoke(InterfaceC6348c interfaceC6348c) {
            return ((C13153) create(interfaceC6348c)).invokeSuspend(C6289k.f24318a);
        }

        @Override // p066i0.AbstractC6371a
        public final Object invokeSuspend(Object obj) throws Throwable {
            C6460s c6460s;
            C6462u c6462u;
            C6460s c6460s2;
            EnumC6363a enumC6363a = EnumC6363a.f24419s;
            int i2 = this.label;
            try {
                if (i2 == 0) {
                    AbstractC0243G.m377o(obj);
                    c6462u = this.$newData;
                    DataStoreImpl<T> dataStoreImpl = this.this$0;
                    this.L$0 = c6462u;
                    this.label = 1;
                    obj = dataStoreImpl.readDataFromFileOrDefault(this);
                    if (obj == enumC6363a) {
                    }
                    return enumC6363a;
                }
                if (i2 == 1) {
                    c6462u = (C6462u) this.L$0;
                    AbstractC0243G.m377o(obj);
                } else {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        c6460s = (C6460s) this.L$0;
                        AbstractC0243G.m377o(obj);
                        c6460s.f24634s = ((Number) obj).intValue();
                        return C6289k.f24318a;
                    }
                    c6460s2 = (C6460s) this.L$0;
                    AbstractC0243G.m377o(obj);
                }
                c6460s2.f24634s = ((Number) obj).intValue();
                return C6289k.f24318a;
                c6462u.f24636s = obj;
                c6460s2 = this.$version;
                InterProcessCoordinator coordinator = this.this$0.getCoordinator();
                this.L$0 = c6460s2;
                this.label = 2;
                obj = coordinator.getVersion(this);
                if (obj == enumC6363a) {
                    return enumC6363a;
                }
                c6460s2.f24634s = ((Number) obj).intValue();
            } catch (CorruptionException unused) {
                C6460s c6460s3 = this.$version;
                DataStoreImpl<T> dataStoreImpl2 = this.this$0;
                Object obj2 = this.$newData.f24636s;
                this.L$0 = c6460s3;
                this.label = 3;
                Object objWriteData$datastore_core_release = dataStoreImpl2.writeData$datastore_core_release((T) obj2, true, this);
                if (objWriteData$datastore_core_release != enumC6363a) {
                    c6460s = c6460s3;
                    obj = objWriteData$datastore_core_release;
                }
                return enumC6363a;
            }
            return C6289k.f24318a;
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.core.DataStoreImpl$readState$2 */
    @InterfaceC6375e(m12158c = "androidx.datastore.core.DataStoreImpl$readState$2", m12159f = "DataStoreImpl.kt", m12160l = {218, 226}, m12161m = "invokeSuspend")
    public static final class C13162 extends AbstractC6379i implements InterfaceC6502p {
        final /* synthetic */ boolean $requireLock;
        int label;
        final /* synthetic */ DataStoreImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13162(DataStoreImpl<T> dataStoreImpl, boolean z, InterfaceC6348c interfaceC6348c) {
            super(2, interfaceC6348c);
            this.this$0 = dataStoreImpl;
            this.$requireLock = z;
        }

        @Override // p066i0.AbstractC6371a
        public final InterfaceC6348c create(Object obj, InterfaceC6348c interfaceC6348c) {
            return new C13162(this.this$0, this.$requireLock, interfaceC6348c);
        }

        @Override // p078p0.InterfaceC6502p
        public final Object invoke(InterfaceC0066v interfaceC0066v, InterfaceC6348c interfaceC6348c) {
            return ((C13162) create(interfaceC0066v, interfaceC6348c)).invokeSuspend(C6289k.f24318a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x004f, code lost:
        
            if (r5 == r0) goto L22;
         */
        @Override // p066i0.AbstractC6371a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) throws java.lang.Throwable {
            /*
                r4 = this;
                h0.a r0 = p064h0.EnumC6363a.f24419s
                int r1 = r4.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L18
                if (r1 != r2) goto L10
                p011H.AbstractC0243G.m377o(r5)
                goto L52
            L10:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L18:
                p011H.AbstractC0243G.m377o(r5)     // Catch: java.lang.Throwable -> L1c
                goto L45
            L1c:
                r5 = move-exception
                goto L55
            L1e:
                p011H.AbstractC0243G.m377o(r5)
                androidx.datastore.core.DataStoreImpl<T> r5 = r4.this$0
                androidx.datastore.core.DataStoreInMemoryCache r5 = androidx.datastore.core.DataStoreImpl.access$getInMemoryCache$p(r5)
                androidx.datastore.core.State r5 = r5.getCurrentState()
                boolean r5 = r5 instanceof androidx.datastore.core.Final
                if (r5 == 0) goto L3a
                androidx.datastore.core.DataStoreImpl<T> r5 = r4.this$0
                androidx.datastore.core.DataStoreInMemoryCache r5 = androidx.datastore.core.DataStoreImpl.access$getInMemoryCache$p(r5)
                androidx.datastore.core.State r5 = r5.getCurrentState()
                return r5
            L3a:
                androidx.datastore.core.DataStoreImpl<T> r5 = r4.this$0     // Catch: java.lang.Throwable -> L1c
                r4.label = r3     // Catch: java.lang.Throwable -> L1c
                java.lang.Object r5 = androidx.datastore.core.DataStoreImpl.access$readAndInitOrPropagateAndThrowFailure(r5, r4)     // Catch: java.lang.Throwable -> L1c
                if (r5 != r0) goto L45
                goto L51
            L45:
                androidx.datastore.core.DataStoreImpl<T> r5 = r4.this$0
                boolean r1 = r4.$requireLock
                r4.label = r2
                java.lang.Object r5 = androidx.datastore.core.DataStoreImpl.access$readDataAndUpdateCache(r5, r1, r4)
                if (r5 != r0) goto L52
            L51:
                return r0
            L52:
                androidx.datastore.core.State r5 = (androidx.datastore.core.State) r5
                return r5
            L55:
                androidx.datastore.core.ReadException r0 = new androidx.datastore.core.ReadException
                r1 = -1
                r0.<init>(r5, r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataStoreImpl.C13162.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.core.DataStoreImpl$transformAndWrite$2 */
    @InterfaceC6375e(m12158c = "androidx.datastore.core.DataStoreImpl$transformAndWrite$2", m12159f = "DataStoreImpl.kt", m12160l = {330, 331, 337}, m12161m = "invokeSuspend")
    public static final class C13172 extends AbstractC6379i implements InterfaceC6498l {
        final /* synthetic */ InterfaceC6353h $callerContext;
        final /* synthetic */ InterfaceC6502p $transform;
        Object L$0;
        int label;
        final /* synthetic */ DataStoreImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13172(DataStoreImpl<T> dataStoreImpl, InterfaceC6353h interfaceC6353h, InterfaceC6502p interfaceC6502p, InterfaceC6348c interfaceC6348c) {
            super(1, interfaceC6348c);
            this.this$0 = dataStoreImpl;
            this.$callerContext = interfaceC6353h;
            this.$transform = interfaceC6502p;
        }

        @Override // p066i0.AbstractC6371a
        public final InterfaceC6348c create(InterfaceC6348c interfaceC6348c) {
            return new C13172(this.this$0, this.$callerContext, this.$transform, interfaceC6348c);
        }

        @Override // p078p0.InterfaceC6498l
        public final Object invoke(InterfaceC6348c interfaceC6348c) {
            return ((C13172) create(interfaceC6348c)).invokeSuspend(C6289k.f24318a);
        }

        /* JADX WARN: Code duplicated, block: B:21:0x005c  */
        @Override // p066i0.AbstractC6371a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Data data;
            DataStoreImpl<T> dataStoreImpl;
            EnumC6363a enumC6363a = EnumC6363a.f24419s;
            int i2 = this.label;
            if (i2 == 0) {
                AbstractC0243G.m377o(obj);
                DataStoreImpl<T> dataStoreImpl2 = this.this$0;
                this.label = 1;
                obj = dataStoreImpl2.readDataOrHandleCorruption(true, this);
                if (obj != enumC6363a) {
                }
                return enumC6363a;
            }
            if (i2 == 1) {
                AbstractC0243G.m377o(obj);
            } else {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Object obj2 = this.L$0;
                    AbstractC0243G.m377o(obj);
                    return obj2;
                }
                data = (Data) this.L$0;
                AbstractC0243G.m377o(obj);
            }
            data.checkHashCode();
            if (!AbstractC6452k.m12177a(data.getValue(), obj)) {
                dataStoreImpl = this.this$0;
                this.L$0 = obj;
                this.label = 3;
                if (dataStoreImpl.writeData$datastore_core_release((T) obj, true, this) == enumC6363a) {
                    return enumC6363a;
                }
            }
            return obj;
            data = (Data) obj;
            InterfaceC6353h interfaceC6353h = this.$callerContext;
            DataStoreImpl$transformAndWrite$2$newData$1 dataStoreImpl$transformAndWrite$2$newData$1 = new DataStoreImpl$transformAndWrite$2$newData$1(this.$transform, data, null);
            this.L$0 = data;
            this.label = 2;
            obj = AbstractC0069y.m119r(dataStoreImpl$transformAndWrite$2$newData$1, interfaceC6353h, this);
            if (obj != enumC6363a) {
                data.checkHashCode();
                if (!AbstractC6452k.m12177a(data.getValue(), obj)) {
                    dataStoreImpl = this.this$0;
                    this.L$0 = obj;
                    this.label = 3;
                    if (dataStoreImpl.writeData$datastore_core_release((T) obj, true, this) == enumC6363a) {
                    }
                }
                return obj;
            }
            return enumC6363a;
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.core.DataStoreImpl$updateData$2 */
    @InterfaceC6375e(m12158c = "androidx.datastore.core.DataStoreImpl$updateData$2", m12159f = "DataStoreImpl.kt", m12160l = {169}, m12161m = "invokeSuspend")
    public static final class C13182 extends AbstractC6379i implements InterfaceC6502p {
        final /* synthetic */ InterfaceC6502p $transform;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ DataStoreImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13182(DataStoreImpl<T> dataStoreImpl, InterfaceC6502p interfaceC6502p, InterfaceC6348c interfaceC6348c) {
            super(2, interfaceC6348c);
            this.this$0 = dataStoreImpl;
            this.$transform = interfaceC6502p;
        }

        @Override // p066i0.AbstractC6371a
        public final InterfaceC6348c create(Object obj, InterfaceC6348c interfaceC6348c) {
            C13182 c13182 = new C13182(this.this$0, this.$transform, interfaceC6348c);
            c13182.L$0 = obj;
            return c13182;
        }

        @Override // p078p0.InterfaceC6502p
        public final Object invoke(InterfaceC0066v interfaceC0066v, InterfaceC6348c interfaceC6348c) {
            return ((C13182) create(interfaceC0066v, interfaceC6348c)).invokeSuspend(C6289k.f24318a);
        }

        @Override // p066i0.AbstractC6371a
        public final Object invokeSuspend(Object obj) throws Throwable {
            EnumC6363a enumC6363a = EnumC6363a.f24419s;
            int i2 = this.label;
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC0243G.m377o(obj);
                return obj;
            }
            AbstractC0243G.m377o(obj);
            InterfaceC0066v interfaceC0066v = (InterfaceC0066v) this.L$0;
            C0051n c0051n = new C0051n(true);
            c0051n.m47B(null);
            ((DataStoreImpl) this.this$0).writeActor.offer(new Message.Update(this.$transform, c0051n, ((DataStoreImpl) this.this$0).inMemoryCache.getCurrentState(), interfaceC0066v.getCoroutineContext()));
            this.label = 1;
            Object objM95Q = c0051n.m95Q(this);
            return objM95Q == enumC6363a ? enumC6363a : objM95Q;
        }
    }

    public DataStoreImpl(Storage<T> storage, List<? extends InterfaceC6502p> initTasksList, CorruptionHandler<T> corruptionHandler, InterfaceC0066v scope) {
        AbstractC6452k.m12181e(storage, "storage");
        AbstractC6452k.m12181e(initTasksList, "initTasksList");
        AbstractC6452k.m12181e(corruptionHandler, "corruptionHandler");
        AbstractC6452k.m12181e(scope, "scope");
        this.storage = storage;
        this.corruptionHandler = corruptionHandler;
        this.scope = scope;
        this.data = new C0092r(new DataStoreImpl$data$1(this, null));
        this.collectorMutex = new C0315d();
        this.inMemoryCache = new DataStoreInMemoryCache<>();
        this.readAndInit = new InitDataStore(this, initTasksList);
        this.storageConnectionDelegate = AbstractC0242F.m357n(new DataStoreImpl$storageConnectionDelegate$1(this));
        this.coordinator$delegate = AbstractC0242F.m357n(new DataStoreImpl$coordinator$2(this));
        this.writeActor = new SimpleActor<>(scope, new DataStoreImpl$writeActor$1(this), DataStoreImpl$writeActor$2.INSTANCE, new DataStoreImpl$writeActor$3(this, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object decrementCollector(InterfaceC6348c interfaceC6348c) throws Throwable {
        C13041 c13041;
        DataStoreImpl<T> dataStoreImpl;
        InterfaceC0312a interfaceC0312a;
        if (interfaceC6348c instanceof C13041) {
            c13041 = (C13041) interfaceC6348c;
            int i2 = c13041.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c13041.label = i2 - Integer.MIN_VALUE;
            } else {
                c13041 = new C13041(this, interfaceC6348c);
            }
        } else {
            c13041 = new C13041(this, interfaceC6348c);
        }
        Object obj = c13041.result;
        EnumC6363a enumC6363a = EnumC6363a.f24419s;
        int i3 = c13041.label;
        if (i3 == 0) {
            AbstractC0243G.m377o(obj);
            InterfaceC0312a interfaceC0312a2 = this.collectorMutex;
            c13041.L$0 = this;
            c13041.L$1 = interfaceC0312a2;
            c13041.label = 1;
            C0315d c0315d = (C0315d) interfaceC0312a2;
            if (c0315d.m462d(c13041) == enumC6363a) {
                return enumC6363a;
            }
            dataStoreImpl = this;
            interfaceC0312a = c0315d;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC0312a = (InterfaceC0312a) c13041.L$1;
            dataStoreImpl = (DataStoreImpl) c13041.L$0;
            AbstractC0243G.m377o(obj);
        }
        try {
            int i4 = dataStoreImpl.collectorCounter - 1;
            dataStoreImpl.collectorCounter = i4;
            if (i4 == 0) {
                InterfaceC0022X interfaceC0022X = dataStoreImpl.collectorJob;
                if (interfaceC0022X != null) {
                    interfaceC0022X.mo29e(null);
                }
                dataStoreImpl.collectorJob = null;
            }
            return C6289k.f24318a;
        } finally {
            ((C0315d) interfaceC0312a).m464f(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <R> Object doWithWriteFileLock(boolean z, InterfaceC6498l interfaceC6498l, InterfaceC6348c interfaceC6348c) {
        return z ? interfaceC6498l.invoke(interfaceC6348c) : getCoordinator().lock(new C13053(interfaceC6498l, null), interfaceC6348c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterProcessCoordinator getCoordinator() {
        return (InterProcessCoordinator) this.coordinator$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b5, code lost:
    
        if (r9 == r1) goto L46;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object handleUpdate(androidx.datastore.core.Message.Update<T> r9, p062g0.InterfaceC6348c r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataStoreImpl.handleUpdate(androidx.datastore.core.Message$Update, g0.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object incrementCollector(InterfaceC6348c interfaceC6348c) throws Throwable {
        C13071 c13071;
        DataStoreImpl<T> dataStoreImpl;
        InterfaceC0312a interfaceC0312a;
        if (interfaceC6348c instanceof C13071) {
            c13071 = (C13071) interfaceC6348c;
            int i2 = c13071.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c13071.label = i2 - Integer.MIN_VALUE;
            } else {
                c13071 = new C13071(this, interfaceC6348c);
            }
        } else {
            c13071 = new C13071(this, interfaceC6348c);
        }
        Object obj = c13071.result;
        EnumC6363a enumC6363a = EnumC6363a.f24419s;
        int i3 = c13071.label;
        if (i3 == 0) {
            AbstractC0243G.m377o(obj);
            InterfaceC0312a interfaceC0312a2 = this.collectorMutex;
            c13071.L$0 = this;
            c13071.L$1 = interfaceC0312a2;
            c13071.label = 1;
            C0315d c0315d = (C0315d) interfaceC0312a2;
            if (c0315d.m462d(c13071) == enumC6363a) {
                return enumC6363a;
            }
            dataStoreImpl = this;
            interfaceC0312a = c0315d;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC0312a = (InterfaceC0312a) c13071.L$1;
            dataStoreImpl = (DataStoreImpl) c13071.L$0;
            AbstractC0243G.m377o(obj);
        }
        try {
            int i4 = dataStoreImpl.collectorCounter + 1;
            dataStoreImpl.collectorCounter = i4;
            if (i4 == 1) {
                dataStoreImpl.collectorJob = AbstractC0069y.m111j(dataStoreImpl.scope, null, new DataStoreImpl$incrementCollector$2$1(dataStoreImpl, null), 3);
            }
            return C6289k.f24318a;
        } finally {
            ((C0315d) interfaceC0312a).m464f(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0067, code lost:
    
        if (r4.runIfNeeded(r0) == r1) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object readAndInitOrPropagateAndThrowFailure(p062g0.InterfaceC6348c r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof androidx.datastore.core.DataStoreImpl.C13091
            if (r0 == 0) goto L13
            r0 = r6
            androidx.datastore.core.DataStoreImpl$readAndInitOrPropagateAndThrowFailure$1 r0 = (androidx.datastore.core.DataStoreImpl.C13091) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.datastore.core.DataStoreImpl$readAndInitOrPropagateAndThrowFailure$1 r0 = new androidx.datastore.core.DataStoreImpl$readAndInitOrPropagateAndThrowFailure$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.result
            h0.a r1 = p064h0.EnumC6363a.f24419s
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L42
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L32
            int r1 = r0.I$0
            java.lang.Object r0 = r0.L$0
            androidx.datastore.core.DataStoreImpl r0 = (androidx.datastore.core.DataStoreImpl) r0
            p011H.AbstractC0243G.m377o(r6)     // Catch: java.lang.Throwable -> L30
            goto L6a
        L30:
            r6 = move-exception
            goto L71
        L32:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L3a:
            java.lang.Object r2 = r0.L$0
            androidx.datastore.core.DataStoreImpl r2 = (androidx.datastore.core.DataStoreImpl) r2
            p011H.AbstractC0243G.m377o(r6)
            goto L55
        L42:
            p011H.AbstractC0243G.m377o(r6)
            androidx.datastore.core.InterProcessCoordinator r6 = r5.getCoordinator()
            r0.L$0 = r5
            r0.label = r4
            java.lang.Object r6 = r6.getVersion(r0)
            if (r6 != r1) goto L54
            goto L69
        L54:
            r2 = r5
        L55:
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            androidx.datastore.core.DataStoreImpl<T>$InitDataStore r4 = r2.readAndInit     // Catch: java.lang.Throwable -> L6d
            r0.L$0 = r2     // Catch: java.lang.Throwable -> L6d
            r0.I$0 = r6     // Catch: java.lang.Throwable -> L6d
            r0.label = r3     // Catch: java.lang.Throwable -> L6d
            java.lang.Object r6 = r4.runIfNeeded(r0)     // Catch: java.lang.Throwable -> L6d
            if (r6 != r1) goto L6a
        L69:
            return r1
        L6a:
            d0.k r6 = p057d0.C6289k.f24318a
            return r6
        L6d:
            r0 = move-exception
            r1 = r6
            r6 = r0
            r0 = r2
        L71:
            androidx.datastore.core.DataStoreInMemoryCache<T> r0 = r0.inMemoryCache
            androidx.datastore.core.ReadException r2 = new androidx.datastore.core.ReadException
            r2.<init>(r6, r1)
            r0.tryUpdate(r2)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataStoreImpl.readAndInitOrPropagateAndThrowFailure(g0.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:43:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a5, code lost:
    
        if (r11 == r1) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00be, code lost:
    
        if (r11 == r1) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object readDataAndUpdateCache(boolean r10, p062g0.InterfaceC6348c r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataStoreImpl.readDataAndUpdateCache(boolean, g0.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object readDataFromFileOrDefault(InterfaceC6348c interfaceC6348c) {
        return StorageConnectionKt.readData(getStorageConnection$datastore_core_release(), interfaceC6348c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:45:0x00af  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:60:0x010b  */
    /* JADX WARN: Code duplicated, block: B:66:0x012a  */
    /* JADX WARN: Code duplicated, block: B:71:0x014b  */
    /* JADX WARN: Code duplicated, block: B:74:0x0153  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:81:0x00a8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    public final Object readDataOrHandleCorruption(boolean z, InterfaceC6348c interfaceC6348c) throws Throwable {
        C13131 c13131;
        DataStoreImpl dataStoreImpl;
        C6462u c6462u;
        Object objHandleCorruption;
        CorruptionException corruptionException;
        C6462u c6462u2;
        DataStoreImpl dataStoreImpl2;
        C6460s c6460s;
        CorruptionException corruptionException2;
        InterfaceC6498l c13153;
        C6460s c6460s2;
        C6462u c6462u3;
        DataStoreImpl<T> dataStoreImpl3;
        DataStoreImpl<T> dataStoreImpl4;
        int iHashCode;
        Object version;
        boolean z2;
        int i2;
        Object obj;
        if (interfaceC6348c instanceof C13131) {
            c13131 = (C13131) interfaceC6348c;
            int i3 = c13131.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c13131.label = i3 - Integer.MIN_VALUE;
            } else {
                c13131 = new C13131(this, interfaceC6348c);
            }
        } else {
            c13131 = new C13131(this, interfaceC6348c);
        }
        Object version2 = c13131.result;
        Object obj2 = EnumC6363a.f24419s;
        ?? r2 = c13131.label;
        try {
            switch (r2) {
                case 0:
                    AbstractC0243G.m377o(version2);
                    try {
                        if (z) {
                            c13131.L$0 = this;
                            c13131.Z$0 = z;
                            c13131.label = 1;
                            version2 = readDataFromFileOrDefault(c13131);
                            if (version2 != obj2) {
                                dataStoreImpl4 = this;
                                if (version2 != null) {
                                    try {
                                        iHashCode = version2.hashCode();
                                    } catch (CorruptionException e) {
                                        e = e;
                                        dataStoreImpl = dataStoreImpl4;
                                        c6462u = new C6462u();
                                        CorruptionHandler<T> corruptionHandler = dataStoreImpl.corruptionHandler;
                                        c13131.L$0 = dataStoreImpl;
                                        c13131.L$1 = e;
                                        c13131.L$2 = c6462u;
                                        c13131.L$3 = c6462u;
                                        c13131.Z$0 = z;
                                        c13131.label = 5;
                                        objHandleCorruption = corruptionHandler.handleCorruption(e, c13131);
                                        if (objHandleCorruption != obj2) {
                                            corruptionException = e;
                                            version2 = objHandleCorruption;
                                            c6462u2 = c6462u;
                                            dataStoreImpl2 = dataStoreImpl;
                                            c6462u2.f24636s = version2;
                                            c6460s = new C6460s();
                                            try {
                                                c13153 = new C13153(c6462u, dataStoreImpl2, c6460s, null);
                                                c13131.L$0 = corruptionException;
                                                c13131.L$1 = c6462u;
                                                c13131.L$2 = c6460s;
                                                c13131.L$3 = null;
                                                c13131.label = 6;
                                                if (dataStoreImpl2.doWithWriteFileLock(z, c13153, c13131) != obj2) {
                                                    c6460s2 = c6460s;
                                                    c6462u3 = c6462u;
                                                    Object obj3 = c6462u3.f24636s;
                                                    return new Data(obj3, obj3 != null ? obj3.hashCode() : 0, c6460s2.f24634s);
                                                }
                                            } catch (Throwable th) {
                                                th = th;
                                                corruptionException2 = corruptionException;
                                                AbstractC0878a.m1796b(corruptionException2, th);
                                                throw corruptionException2;
                                            }
                                        }
                                    }
                                } else {
                                    iHashCode = 0;
                                }
                                InterProcessCoordinator coordinator = dataStoreImpl4.getCoordinator();
                                c13131.L$0 = dataStoreImpl4;
                                c13131.L$1 = version2;
                                c13131.Z$0 = z;
                                c13131.I$0 = iHashCode;
                                c13131.label = 2;
                                version = coordinator.getVersion(c13131);
                                if (version != obj2) {
                                    int i4 = iHashCode;
                                    z2 = z;
                                    i2 = i4;
                                    obj = version2;
                                    version2 = version;
                                    return new Data(obj, i2, ((Number) version2).intValue());
                                }
                            }
                        } else {
                            InterProcessCoordinator coordinator2 = getCoordinator();
                            c13131.L$0 = this;
                            c13131.Z$0 = z;
                            c13131.label = 3;
                            version2 = coordinator2.getVersion(c13131);
                            if (version2 != obj2) {
                                dataStoreImpl3 = this;
                                int iIntValue = ((Number) version2).intValue();
                                InterProcessCoordinator coordinator3 = dataStoreImpl3.getCoordinator();
                                C13142 c13142 = new C13142(dataStoreImpl3, iIntValue, null);
                                c13131.L$0 = dataStoreImpl3;
                                c13131.Z$0 = z;
                                c13131.label = 4;
                                version2 = coordinator3.tryLock(c13142, c13131);
                                if (version2 == obj2) {
                                }
                                return (Data) version2;
                            }
                        }
                    } catch (CorruptionException e2) {
                        e = e2;
                        dataStoreImpl = this;
                        c6462u = new C6462u();
                        CorruptionHandler<T> corruptionHandler2 = dataStoreImpl.corruptionHandler;
                        c13131.L$0 = dataStoreImpl;
                        c13131.L$1 = e;
                        c13131.L$2 = c6462u;
                        c13131.L$3 = c6462u;
                        c13131.Z$0 = z;
                        c13131.label = 5;
                        objHandleCorruption = corruptionHandler2.handleCorruption(e, c13131);
                        if (objHandleCorruption != obj2) {
                            corruptionException = e;
                            version2 = objHandleCorruption;
                            c6462u2 = c6462u;
                            dataStoreImpl2 = dataStoreImpl;
                            c6462u2.f24636s = version2;
                            c6460s = new C6460s();
                            c13153 = new C13153(c6462u, dataStoreImpl2, c6460s, null);
                            c13131.L$0 = corruptionException;
                            c13131.L$1 = c6462u;
                            c13131.L$2 = c6460s;
                            c13131.L$3 = null;
                            c13131.label = 6;
                            if (dataStoreImpl2.doWithWriteFileLock(z, c13153, c13131) != obj2) {
                                c6460s2 = c6460s;
                                c6462u3 = c6462u;
                                Object obj4 = c6462u3.f24636s;
                                return new Data(obj4, obj4 != null ? obj4.hashCode() : 0, c6460s2.f24634s);
                            }
                        }
                    }
                    return obj2;
                case 1:
                    z = c13131.Z$0;
                    DataStoreImpl<T> dataStoreImpl5 = (DataStoreImpl) c13131.L$0;
                    AbstractC0243G.m377o(version2);
                    dataStoreImpl4 = dataStoreImpl5;
                    if (version2 != null) {
                        iHashCode = version2.hashCode();
                    } else {
                        iHashCode = 0;
                    }
                    InterProcessCoordinator coordinator4 = dataStoreImpl4.getCoordinator();
                    c13131.L$0 = dataStoreImpl4;
                    c13131.L$1 = version2;
                    c13131.Z$0 = z;
                    c13131.I$0 = iHashCode;
                    c13131.label = 2;
                    version = coordinator4.getVersion(c13131);
                    if (version != obj2) {
                        int i5 = iHashCode;
                        z2 = z;
                        i2 = i5;
                        obj = version2;
                        version2 = version;
                        return new Data(obj, i2, ((Number) version2).intValue());
                    }
                    return obj2;
                case 2:
                    i2 = c13131.I$0;
                    z2 = c13131.Z$0;
                    obj = c13131.L$1;
                    dataStoreImpl4 = (DataStoreImpl) c13131.L$0;
                    try {
                        AbstractC0243G.m377o(version2);
                        return new Data(obj, i2, ((Number) version2).intValue());
                    } catch (CorruptionException e3) {
                        e = e3;
                        z = z2;
                        dataStoreImpl = dataStoreImpl4;
                        c6462u = new C6462u();
                        CorruptionHandler<T> corruptionHandler3 = dataStoreImpl.corruptionHandler;
                        c13131.L$0 = dataStoreImpl;
                        c13131.L$1 = e;
                        c13131.L$2 = c6462u;
                        c13131.L$3 = c6462u;
                        c13131.Z$0 = z;
                        c13131.label = 5;
                        objHandleCorruption = corruptionHandler3.handleCorruption(e, c13131);
                        if (objHandleCorruption != obj2) {
                            corruptionException = e;
                            version2 = objHandleCorruption;
                            c6462u2 = c6462u;
                            dataStoreImpl2 = dataStoreImpl;
                            c6462u2.f24636s = version2;
                            c6460s = new C6460s();
                            c13153 = new C13153(c6462u, dataStoreImpl2, c6460s, null);
                            c13131.L$0 = corruptionException;
                            c13131.L$1 = c6462u;
                            c13131.L$2 = c6460s;
                            c13131.L$3 = null;
                            c13131.label = 6;
                            if (dataStoreImpl2.doWithWriteFileLock(z, c13153, c13131) != obj2) {
                                c6460s2 = c6460s;
                                c6462u3 = c6462u;
                                Object obj5 = c6462u3.f24636s;
                                return new Data(obj5, obj5 != null ? obj5.hashCode() : 0, c6460s2.f24634s);
                            }
                        }
                        return obj2;
                    }
                case 3:
                    z = c13131.Z$0;
                    dataStoreImpl3 = (DataStoreImpl) c13131.L$0;
                    AbstractC0243G.m377o(version2);
                    int iIntValue2 = ((Number) version2).intValue();
                    InterProcessCoordinator coordinator5 = dataStoreImpl3.getCoordinator();
                    C13142 c13143 = new C13142(dataStoreImpl3, iIntValue2, null);
                    c13131.L$0 = dataStoreImpl3;
                    c13131.Z$0 = z;
                    c13131.label = 4;
                    version2 = coordinator5.tryLock(c13143, c13131);
                    if (version2 == obj2) {
                        return obj2;
                    }
                    return (Data) version2;
                case 4:
                    boolean z3 = c13131.Z$0;
                    AbstractC0243G.m377o(version2);
                    return (Data) version2;
                case 5:
                    z = c13131.Z$0;
                    C6462u c6462u4 = (C6462u) c13131.L$3;
                    C6462u c6462u5 = (C6462u) c13131.L$2;
                    corruptionException = (CorruptionException) c13131.L$1;
                    DataStoreImpl dataStoreImpl6 = (DataStoreImpl) c13131.L$0;
                    AbstractC0243G.m377o(version2);
                    c6462u2 = c6462u4;
                    c6462u = c6462u5;
                    dataStoreImpl2 = dataStoreImpl6;
                    c6462u2.f24636s = version2;
                    c6460s = new C6460s();
                    c13153 = new C13153(c6462u, dataStoreImpl2, c6460s, null);
                    c13131.L$0 = corruptionException;
                    c13131.L$1 = c6462u;
                    c13131.L$2 = c6460s;
                    c13131.L$3 = null;
                    c13131.label = 6;
                    if (dataStoreImpl2.doWithWriteFileLock(z, c13153, c13131) != obj2) {
                        c6460s2 = c6460s;
                        c6462u3 = c6462u;
                        Object obj6 = c6462u3.f24636s;
                        return new Data(obj6, obj6 != null ? obj6.hashCode() : 0, c6460s2.f24634s);
                    }
                    return obj2;
                case 6:
                    c6460s2 = (C6460s) c13131.L$2;
                    c6462u3 = (C6462u) c13131.L$1;
                    corruptionException2 = (CorruptionException) c13131.L$0;
                    try {
                        AbstractC0243G.m377o(version2);
                        Object obj7 = c6462u3.f24636s;
                        return new Data(obj7, obj7 != null ? obj7.hashCode() : 0, c6460s2.f24634s);
                    } catch (Throwable th2) {
                        th = th2;
                        AbstractC0878a.m1796b(corruptionException2, th);
                        throw corruptionException2;
                    }
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } catch (CorruptionException e4) {
            e = e4;
            dataStoreImpl = r2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object readState(boolean z, InterfaceC6348c interfaceC6348c) {
        return AbstractC0069y.m119r(new C13162(this, z, null), this.scope.getCoroutineContext(), interfaceC6348c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object transformAndWrite(InterfaceC6502p interfaceC6502p, InterfaceC6353h interfaceC6353h, InterfaceC6348c interfaceC6348c) {
        return getCoordinator().lock(new C13172(this, interfaceC6353h, interfaceC6502p, null), interfaceC6348c);
    }

    @Override // androidx.datastore.core.DataStore
    public InterfaceC0170e getData() {
        return this.data;
    }

    public final StorageConnection<T> getStorageConnection$datastore_core_release() {
        return (StorageConnection) this.storageConnectionDelegate.getValue();
    }

    @Override // androidx.datastore.core.DataStore
    public Object updateData(InterfaceC6502p interfaceC6502p, InterfaceC6348c interfaceC6348c) {
        UpdatingDataContextElement updatingDataContextElement = (UpdatingDataContextElement) interfaceC6348c.getContext().get(UpdatingDataContextElement.Companion.Key.INSTANCE);
        if (updatingDataContextElement != null) {
            updatingDataContextElement.checkNotUpdating(this);
        }
        return AbstractC0069y.m119r(new C13182(this, interfaceC6502p, null), new UpdatingDataContextElement(updatingDataContextElement, this), interfaceC6348c);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object writeData$datastore_core_release(T t, boolean z, InterfaceC6348c interfaceC6348c) throws Throwable {
        DataStoreImpl$writeData$1 dataStoreImpl$writeData$1;
        C6460s c6460s;
        if (interfaceC6348c instanceof DataStoreImpl$writeData$1) {
            dataStoreImpl$writeData$1 = (DataStoreImpl$writeData$1) interfaceC6348c;
            int i2 = dataStoreImpl$writeData$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dataStoreImpl$writeData$1.label = i2 - Integer.MIN_VALUE;
            } else {
                dataStoreImpl$writeData$1 = new DataStoreImpl$writeData$1(this, interfaceC6348c);
            }
        } else {
            dataStoreImpl$writeData$1 = new DataStoreImpl$writeData$1(this, interfaceC6348c);
        }
        Object obj = dataStoreImpl$writeData$1.result;
        EnumC6363a enumC6363a = EnumC6363a.f24419s;
        int i3 = dataStoreImpl$writeData$1.label;
        if (i3 == 0) {
            AbstractC0243G.m377o(obj);
            C6460s c6460s2 = new C6460s();
            StorageConnection<T> storageConnection$datastore_core_release = getStorageConnection$datastore_core_release();
            DataStoreImpl$writeData$2 dataStoreImpl$writeData$2 = new DataStoreImpl$writeData$2(c6460s2, this, t, z, null);
            dataStoreImpl$writeData$1.L$0 = c6460s2;
            dataStoreImpl$writeData$1.label = 1;
            if (storageConnection$datastore_core_release.writeScope(dataStoreImpl$writeData$2, dataStoreImpl$writeData$1) == enumC6363a) {
                return enumC6363a;
            }
            c6460s = c6460s2;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c6460s = (C6460s) dataStoreImpl$writeData$1.L$0;
            AbstractC0243G.m377o(obj);
        }
        return new Integer(c6460s.f24634s);
    }

    public DataStoreImpl(Storage storage, List list, CorruptionHandler corruptionHandler, InterfaceC0066v interfaceC0066v, int i2, AbstractC6447f abstractC6447f) {
        this(storage, (i2 & 2) != 0 ? C6313u.f24338s : list, (i2 & 4) != 0 ? new NoOpCorruptionHandler() : corruptionHandler, (i2 & 8) != 0 ? AbstractC0069y.m102a(Actual_jvmKt.ioDispatcher().plus(new C0050m0())) : interfaceC0066v);
    }
}
