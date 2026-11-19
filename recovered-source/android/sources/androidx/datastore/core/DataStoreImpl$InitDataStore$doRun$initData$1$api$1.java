package androidx.datastore.core;

import kotlin.jvm.internal.AbstractC6452k;
import kotlin.jvm.internal.C6459r;
import kotlin.jvm.internal.C6462u;
import p011H.AbstractC0243G;
import p014I0.C0315d;
import p014I0.InterfaceC0312a;
import p062g0.InterfaceC6348c;
import p064h0.EnumC6363a;
import p078p0.InterfaceC6502p;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: classes.dex */
public final class DataStoreImpl$InitDataStore$doRun$initData$1$api$1<T> implements InitializerApi<T> {
    final /* synthetic */ C6462u $currentData;
    final /* synthetic */ C6459r $initializationComplete;
    final /* synthetic */ InterfaceC0312a $updateLock;
    final /* synthetic */ DataStoreImpl<T> this$0;

    public DataStoreImpl$InitDataStore$doRun$initData$1$api$1(InterfaceC0312a interfaceC0312a, C6459r c6459r, C6462u c6462u, DataStoreImpl<T> dataStoreImpl) {
        this.$updateLock = interfaceC0312a;
        this.$initializationComplete = c6459r;
        this.$currentData = c6462u;
        this.this$0 = dataStoreImpl;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00ba A[Catch: all -> 0x0054, TRY_LEAVE, TryCatch #0 {all -> 0x0054, blocks: (B:21:0x0050, B:36:0x00b2, B:38:0x00ba), top: B:53:0x0050 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:43:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.datastore.core.InitializerApi
    public Object updateData(InterfaceC6502p interfaceC6502p, InterfaceC6348c interfaceC6348c) throws Throwable {
        DataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1 dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1;
        DataStoreImpl dataStoreImpl;
        C6459r c6459r;
        C6462u c6462u;
        InterfaceC0312a interfaceC0312a;
        InterfaceC0312a interfaceC0312a2;
        InterfaceC0312a interfaceC0312a3;
        DataStoreImpl dataStoreImpl2;
        Object obj;
        C6462u c6462u2;
        InterfaceC0312a interfaceC0312a4;
        if (interfaceC6348c instanceof DataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1) {
            dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1 = (DataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1) interfaceC6348c;
            int i2 = dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.label = i2 - Integer.MIN_VALUE;
            } else {
                dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1 = new DataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1(this, interfaceC6348c);
            }
        } else {
            dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1 = new DataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1(this, interfaceC6348c);
        }
        Object obj2 = dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.result;
        Object obj3 = EnumC6363a.f24419s;
        int i3 = dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.label;
        try {
            if (i3 == 0) {
                AbstractC0243G.m377o(obj2);
                InterfaceC0312a interfaceC0312a5 = this.$updateLock;
                C6459r c6459r2 = this.$initializationComplete;
                C6462u c6462u3 = this.$currentData;
                dataStoreImpl = this.this$0;
                dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$0 = interfaceC6502p;
                dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$1 = interfaceC0312a5;
                dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$2 = c6459r2;
                dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$3 = c6462u3;
                dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$4 = dataStoreImpl;
                dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.label = 1;
                C0315d c0315d = (C0315d) interfaceC0312a5;
                if (c0315d.m462d(dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1) != obj3) {
                    c6459r = c6459r2;
                    c6462u = c6462u3;
                    interfaceC0312a = c0315d;
                }
                return obj3;
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj = dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$2;
                    c6462u2 = (C6462u) dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$1;
                    interfaceC0312a2 = (InterfaceC0312a) dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$0;
                    try {
                        AbstractC0243G.m377o(obj2);
                        interfaceC0312a4 = interfaceC0312a2;
                        c6462u2.f24636s = obj;
                        c6462u = c6462u2;
                        interfaceC0312a2 = interfaceC0312a4;
                        Object obj4 = c6462u.f24636s;
                        ((C0315d) interfaceC0312a2).m464f(null);
                        return obj4;
                    } catch (Throwable th) {
                        th = th;
                        ((C0315d) interfaceC0312a2).m464f(null);
                        throw th;
                    }
                }
                DataStoreImpl dataStoreImpl3 = (DataStoreImpl) dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$2;
                c6462u = (C6462u) dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$1;
                interfaceC0312a3 = (InterfaceC0312a) dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$0;
                try {
                    AbstractC0243G.m377o(obj2);
                    interfaceC0312a3 = interfaceC0312a3;
                    dataStoreImpl2 = dataStoreImpl3;
                    if (!AbstractC6452k.m12177a(obj2, c6462u.f24636s)) {
                        dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$0 = interfaceC0312a3;
                        dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$1 = c6462u;
                        dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$2 = obj2;
                        dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.label = 3;
                        if (dataStoreImpl2.writeData$datastore_core_release(obj2, false, dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1) != obj3) {
                            obj = obj2;
                            c6462u2 = c6462u;
                            interfaceC0312a4 = interfaceC0312a3;
                            c6462u2.f24636s = obj;
                            c6462u = c6462u2;
                            interfaceC0312a2 = interfaceC0312a4;
                        }
                        return obj3;
                    }
                    interfaceC0312a2 = interfaceC0312a3;
                    Object obj5 = c6462u.f24636s;
                    ((C0315d) interfaceC0312a2).m464f(null);
                    return obj5;
                } catch (Throwable th2) {
                    th = th2;
                    interfaceC0312a2 = interfaceC0312a3;
                    ((C0315d) interfaceC0312a2).m464f(null);
                    throw th;
                }
            }
            DataStoreImpl dataStoreImpl4 = (DataStoreImpl) dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$4;
            c6462u = (C6462u) dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$3;
            c6459r = (C6459r) dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$2;
            InterfaceC0312a interfaceC0312a6 = (InterfaceC0312a) dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$1;
            InterfaceC6502p interfaceC6502p2 = (InterfaceC6502p) dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$0;
            AbstractC0243G.m377o(obj2);
            dataStoreImpl = dataStoreImpl4;
            interfaceC6502p = interfaceC6502p2;
            interfaceC0312a = interfaceC0312a6;
            if (c6459r.f24633s) {
                throw new IllegalStateException("InitializerApi.updateData should not be called after initialization is complete.");
            }
            Object obj6 = c6462u.f24636s;
            dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$0 = interfaceC0312a;
            dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$1 = c6462u;
            dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$2 = dataStoreImpl;
            dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$3 = null;
            dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$4 = null;
            dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.label = 2;
            Object objInvoke = interfaceC6502p.invoke(obj6, dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1);
            if (objInvoke != obj3) {
                interfaceC0312a3 = interfaceC0312a;
                obj2 = objInvoke;
                dataStoreImpl2 = dataStoreImpl;
                if (!AbstractC6452k.m12177a(obj2, c6462u.f24636s)) {
                    dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$0 = interfaceC0312a3;
                    dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$1 = c6462u;
                    dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$2 = obj2;
                    dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.label = 3;
                    if (dataStoreImpl2.writeData$datastore_core_release(obj2, false, dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1) != obj3) {
                        obj = obj2;
                        c6462u2 = c6462u;
                        interfaceC0312a4 = interfaceC0312a3;
                        c6462u2.f24636s = obj;
                        c6462u = c6462u2;
                        interfaceC0312a2 = interfaceC0312a4;
                    }
                } else {
                    interfaceC0312a2 = interfaceC0312a3;
                }
                Object obj7 = c6462u.f24636s;
                ((C0315d) interfaceC0312a2).m464f(null);
                return obj7;
            }
            return obj3;
        } catch (Throwable th3) {
            th = th3;
            interfaceC0312a2 = interfaceC0312a;
            ((C0315d) interfaceC0312a2).m464f(null);
            throw th;
        }
    }
}
