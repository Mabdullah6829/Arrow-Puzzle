package androidx.datastore.core;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C6459r;
import kotlin.jvm.internal.C6462u;
import p011H.AbstractC0243G;
import p014I0.C0315d;
import p014I0.InterfaceC0312a;
import p057d0.C6289k;
import p062g0.InterfaceC6348c;
import p064h0.EnumC6363a;
import p066i0.AbstractC6379i;
import p066i0.InterfaceC6375e;
import p078p0.InterfaceC6498l;
import p078p0.InterfaceC6502p;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC6375e(m12158c = "androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$initData$1", m12159f = "DataStoreImpl.kt", m12160l = {437, 458, 546, 468}, m12161m = "invokeSuspend")
public final class DataStoreImpl$InitDataStore$doRun$initData$1 extends AbstractC6379i implements InterfaceC6498l {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ DataStoreImpl<T> this$0;
    final /* synthetic */ DataStoreImpl<T>.InitDataStore this$1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataStoreImpl$InitDataStore$doRun$initData$1(DataStoreImpl<T> dataStoreImpl, DataStoreImpl<T>.InitDataStore initDataStore, InterfaceC6348c interfaceC6348c) {
        super(1, interfaceC6348c);
        this.this$0 = dataStoreImpl;
        this.this$1 = initDataStore;
    }

    @Override // p066i0.AbstractC6371a
    public final InterfaceC6348c create(InterfaceC6348c interfaceC6348c) {
        return new DataStoreImpl$InitDataStore$doRun$initData$1(this.this$0, this.this$1, interfaceC6348c);
    }

    @Override // p078p0.InterfaceC6498l
    public final Object invoke(InterfaceC6348c interfaceC6348c) {
        return ((DataStoreImpl$InitDataStore$doRun$initData$1) create(interfaceC6348c)).invokeSuspend(C6289k.f24318a);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:31:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:35:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:36:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:40:0x010f  */
    /* JADX WARN: Code duplicated, block: B:49:0x010e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:? A[LOOP:0: B:21:0x00a7->B:51:?, LOOP_END, SYNTHETIC] */
    @Override // p066i0.AbstractC6371a
    public final Object invokeSuspend(Object obj) throws Throwable {
        InterfaceC0312a c0315d;
        C6459r c6459r;
        C6462u c6462u;
        C6462u c6462u2;
        C6459r c6459r2;
        Iterator it;
        InterfaceC0312a interfaceC0312a;
        C6459r c6459r3;
        C6462u c6462u3;
        DataStoreImpl$InitDataStore$doRun$initData$1$api$1 dataStoreImpl$InitDataStore$doRun$initData$1$api$1;
        C0315d c0315d2;
        C6462u c6462u4;
        InterfaceC6502p interfaceC6502p;
        InterfaceC0312a interfaceC0312a2;
        Object obj2;
        int iHashCode;
        Object version;
        int i2;
        EnumC6363a enumC6363a = EnumC6363a.f24419s;
        int i3 = this.label;
        if (i3 == 0) {
            AbstractC0243G.m377o(obj);
            c0315d = new C0315d();
            c6459r = new C6459r();
            c6462u = new C6462u();
            DataStoreImpl<T> dataStoreImpl = this.this$0;
            this.L$0 = c0315d;
            this.L$1 = c6459r;
            this.L$2 = c6462u;
            this.L$3 = c6462u;
            this.label = 1;
            obj = dataStoreImpl.readDataOrHandleCorruption(true, this);
            if (obj != enumC6363a) {
                c6462u2 = c6462u;
            }
            return enumC6363a;
        }
        if (i3 == 1) {
            c6462u = (C6462u) this.L$3;
            c6462u2 = (C6462u) this.L$2;
            c6459r = (C6459r) this.L$1;
            c0315d = (InterfaceC0312a) this.L$0;
            AbstractC0243G.m377o(obj);
        } else {
            if (i3 == 2) {
                it = (Iterator) this.L$4;
                dataStoreImpl$InitDataStore$doRun$initData$1$api$1 = (DataStoreImpl$InitDataStore$doRun$initData$1$api$1) this.L$3;
                c6462u3 = (C6462u) this.L$2;
                c6459r3 = (C6459r) this.L$1;
                interfaceC0312a = (InterfaceC0312a) this.L$0;
                AbstractC0243G.m377o(obj);
                while (it.hasNext()) {
                    interfaceC6502p = (InterfaceC6502p) it.next();
                    this.L$0 = interfaceC0312a;
                    this.L$1 = c6459r3;
                    this.L$2 = c6462u3;
                    this.L$3 = dataStoreImpl$InitDataStore$doRun$initData$1$api$1;
                    this.L$4 = it;
                    this.label = 2;
                    if (interfaceC6502p.invoke(dataStoreImpl$InitDataStore$doRun$initData$1$api$1, this) == enumC6363a) {
                        return enumC6363a;
                    }
                }
                c6462u2 = c6462u3;
                c6459r2 = c6459r3;
                c0315d = interfaceC0312a;
                ((DataStoreImpl.InitDataStore) this.this$1).initTasks = null;
                this.L$0 = c6459r2;
                this.L$1 = c6462u2;
                this.L$2 = c0315d;
                this.L$3 = null;
                this.L$4 = null;
                this.label = 3;
                c0315d2 = (C0315d) c0315d;
                if (c0315d2.m462d(this) != enumC6363a) {
                    c6462u4 = c6462u2;
                    interfaceC0312a2 = c0315d2;
                    c6459r2.f24633s = true;
                    ((C0315d) interfaceC0312a2).m464f(null);
                    obj2 = c6462u4.f24636s;
                    if (obj2 != null) {
                        iHashCode = obj2.hashCode();
                    } else {
                        iHashCode = 0;
                    }
                    InterProcessCoordinator coordinator = this.this$0.getCoordinator();
                    this.L$0 = obj2;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.I$0 = iHashCode;
                    this.label = 4;
                    version = coordinator.getVersion(this);
                    if (version != enumC6363a) {
                        i2 = iHashCode;
                        obj = version;
                    }
                }
                return enumC6363a;
            }
            if (i3 == 3) {
                InterfaceC0312a interfaceC0312a3 = (InterfaceC0312a) this.L$2;
                c6462u4 = (C6462u) this.L$1;
                c6459r2 = (C6459r) this.L$0;
                AbstractC0243G.m377o(obj);
                interfaceC0312a2 = interfaceC0312a3;
                try {
                    c6459r2.f24633s = true;
                    ((C0315d) interfaceC0312a2).m464f(null);
                    obj2 = c6462u4.f24636s;
                    if (obj2 != null) {
                        iHashCode = obj2.hashCode();
                    } else {
                        iHashCode = 0;
                    }
                    InterProcessCoordinator coordinator2 = this.this$0.getCoordinator();
                    this.L$0 = obj2;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.I$0 = iHashCode;
                    this.label = 4;
                    version = coordinator2.getVersion(this);
                    if (version != enumC6363a) {
                        i2 = iHashCode;
                        obj = version;
                    }
                    return enumC6363a;
                } catch (Throwable th) {
                    ((C0315d) interfaceC0312a2).m464f(null);
                    throw th;
                }
            }
            if (i3 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i2 = this.I$0;
            obj2 = this.L$0;
            AbstractC0243G.m377o(obj);
        }
        return new Data(obj2, i2, ((Number) obj).intValue());
        c6462u.f24636s = ((Data) obj).getValue();
        DataStoreImpl$InitDataStore$doRun$initData$1$api$1 dataStoreImpl$InitDataStore$doRun$initData$1$api$2 = new DataStoreImpl$InitDataStore$doRun$initData$1$api$1(c0315d, c6459r, c6462u2, this.this$0);
        List list = ((DataStoreImpl.InitDataStore) this.this$1).initTasks;
        if (list != null) {
            it = list.iterator();
            interfaceC0312a = c0315d;
            c6459r3 = c6459r;
            c6462u3 = c6462u2;
            dataStoreImpl$InitDataStore$doRun$initData$1$api$1 = dataStoreImpl$InitDataStore$doRun$initData$1$api$2;
            while (it.hasNext()) {
                interfaceC6502p = (InterfaceC6502p) it.next();
                this.L$0 = interfaceC0312a;
                this.L$1 = c6459r3;
                this.L$2 = c6462u3;
                this.L$3 = dataStoreImpl$InitDataStore$doRun$initData$1$api$1;
                this.L$4 = it;
                this.label = 2;
                if (interfaceC6502p.invoke(dataStoreImpl$InitDataStore$doRun$initData$1$api$1, this) == enumC6363a) {
                    return enumC6363a;
                }
            }
            c6462u2 = c6462u3;
            c6459r2 = c6459r3;
            c0315d = interfaceC0312a;
        } else {
            c6459r2 = c6459r;
        }
        ((DataStoreImpl.InitDataStore) this.this$1).initTasks = null;
        this.L$0 = c6459r2;
        this.L$1 = c6462u2;
        this.L$2 = c0315d;
        this.L$3 = null;
        this.L$4 = null;
        this.label = 3;
        c0315d2 = (C0315d) c0315d;
        if (c0315d2.m462d(this) != enumC6363a) {
            c6462u4 = c6462u2;
            interfaceC0312a2 = c0315d2;
            c6459r2.f24633s = true;
            ((C0315d) interfaceC0312a2).m464f(null);
            obj2 = c6462u4.f24636s;
            if (obj2 != null) {
                iHashCode = obj2.hashCode();
            } else {
                iHashCode = 0;
            }
            InterProcessCoordinator coordinator3 = this.this$0.getCoordinator();
            this.L$0 = obj2;
            this.L$1 = null;
            this.L$2 = null;
            this.I$0 = iHashCode;
            this.label = 4;
            version = coordinator3.getVersion(this);
            if (version != enumC6363a) {
                i2 = iHashCode;
                obj = version;
                return new Data(obj2, i2, ((Number) obj).intValue());
            }
        }
        return enumC6363a;
    }
}
