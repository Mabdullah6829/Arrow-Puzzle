package androidx.datastore.core;

import androidx.datastore.core.handlers.NoOpCorruptionHandler;
import androidx.datastore.core.handlers.ReplaceFileCorruptionHandler;
import java.io.File;
import java.util.List;
import kotlin.jvm.internal.AbstractC6452k;
import kotlin.jvm.internal.AbstractC6453l;
import p000A0.AbstractC0007H;
import p000A0.AbstractC0069y;
import p000A0.C0050m0;
import p000A0.InterfaceC0066v;
import p012H0.C0302e;
import p012H0.ExecutorC0301d;
import p037U0.AbstractC0846b;
import p058e0.C6313u;
import p078p0.InterfaceC6487a;
import p078p0.InterfaceC6498l;

/* JADX INFO: loaded from: classes.dex */
public final class MultiProcessDataStoreFactory {
    public static final MultiProcessDataStoreFactory INSTANCE = new MultiProcessDataStoreFactory();

    /* JADX INFO: renamed from: androidx.datastore.core.MultiProcessDataStoreFactory$create$1 */
    public static final class C13311 extends AbstractC6453l implements InterfaceC6498l {
        final /* synthetic */ InterfaceC0066v $scope;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13311(InterfaceC0066v interfaceC0066v) {
            super(1);
            this.$scope = interfaceC0066v;
        }

        @Override // p078p0.InterfaceC6498l
        public final InterProcessCoordinator invoke(File it) {
            AbstractC6452k.m12181e(it, "it");
            return new MultiProcessCoordinator(this.$scope.getCoroutineContext(), it);
        }
    }

    private MultiProcessDataStoreFactory() {
    }

    public static DataStore create$default(MultiProcessDataStoreFactory multiProcessDataStoreFactory, Storage storage, ReplaceFileCorruptionHandler replaceFileCorruptionHandler, List list, InterfaceC0066v interfaceC0066v, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            replaceFileCorruptionHandler = null;
        }
        if ((i2 & 4) != 0) {
            list = C6313u.f24338s;
        }
        if ((i2 & 8) != 0) {
            C0302e c0302e = AbstractC0007H.f4a;
            interfaceC0066v = AbstractC0069y.m102a(ExecutorC0301d.f608s.plus(new C0050m0()));
        }
        return multiProcessDataStoreFactory.create(storage, replaceFileCorruptionHandler, list, interfaceC0066v);
    }

    public final <T> DataStore<T> create(Serializer<T> serializer, ReplaceFileCorruptionHandler<T> replaceFileCorruptionHandler, List<? extends DataMigration<T>> migrations, InterfaceC6487a produceFile) {
        AbstractC6452k.m12181e(serializer, "serializer");
        AbstractC6452k.m12181e(migrations, "migrations");
        AbstractC6452k.m12181e(produceFile, "produceFile");
        return create$default(this, serializer, replaceFileCorruptionHandler, migrations, null, produceFile, 8, null);
    }

    public final <T> DataStore<T> create(Serializer<T> serializer, ReplaceFileCorruptionHandler<T> replaceFileCorruptionHandler, InterfaceC6487a produceFile) {
        AbstractC6452k.m12181e(serializer, "serializer");
        AbstractC6452k.m12181e(produceFile, "produceFile");
        return create$default(this, serializer, replaceFileCorruptionHandler, null, null, produceFile, 12, null);
    }

    public final <T> DataStore<T> create(Serializer<T> serializer, InterfaceC6487a produceFile) {
        AbstractC6452k.m12181e(serializer, "serializer");
        AbstractC6452k.m12181e(produceFile, "produceFile");
        return create$default(this, serializer, null, null, null, produceFile, 14, null);
    }

    public final <T> DataStore<T> create(Storage<T> storage) {
        AbstractC6452k.m12181e(storage, "storage");
        return create$default(this, storage, null, null, null, 14, null);
    }

    public final <T> DataStore<T> create(Storage<T> storage, ReplaceFileCorruptionHandler<T> replaceFileCorruptionHandler) {
        AbstractC6452k.m12181e(storage, "storage");
        return create$default(this, storage, replaceFileCorruptionHandler, null, null, 12, null);
    }

    public final <T> DataStore<T> create(Storage<T> storage, ReplaceFileCorruptionHandler<T> replaceFileCorruptionHandler, List<? extends DataMigration<T>> migrations) {
        AbstractC6452k.m12181e(storage, "storage");
        AbstractC6452k.m12181e(migrations, "migrations");
        return create$default(this, storage, replaceFileCorruptionHandler, migrations, null, 8, null);
    }

    public final <T> DataStore<T> create(Storage<T> storage, ReplaceFileCorruptionHandler<T> replaceFileCorruptionHandler, List<? extends DataMigration<T>> migrations, InterfaceC0066v scope) {
        AbstractC6452k.m12181e(storage, "storage");
        AbstractC6452k.m12181e(migrations, "migrations");
        AbstractC6452k.m12181e(scope, "scope");
        List listM1752k = AbstractC0846b.m1752k(DataMigrationInitializer.Companion.getInitializer(migrations));
        if (replaceFileCorruptionHandler == null) {
            replaceFileCorruptionHandler = (ReplaceFileCorruptionHandler<T>) new NoOpCorruptionHandler();
        }
        return new DataStoreImpl(storage, listM1752k, replaceFileCorruptionHandler, scope);
    }

    public static DataStore create$default(MultiProcessDataStoreFactory multiProcessDataStoreFactory, Serializer serializer, ReplaceFileCorruptionHandler replaceFileCorruptionHandler, List list, InterfaceC0066v interfaceC0066v, InterfaceC6487a interfaceC6487a, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            replaceFileCorruptionHandler = null;
        }
        ReplaceFileCorruptionHandler replaceFileCorruptionHandler2 = replaceFileCorruptionHandler;
        if ((i2 & 4) != 0) {
            list = C6313u.f24338s;
        }
        List list2 = list;
        if ((i2 & 8) != 0) {
            C0302e c0302e = AbstractC0007H.f4a;
            interfaceC0066v = AbstractC0069y.m102a(ExecutorC0301d.f608s.plus(new C0050m0()));
        }
        return multiProcessDataStoreFactory.create(serializer, replaceFileCorruptionHandler2, list2, interfaceC0066v, interfaceC6487a);
    }

    public final <T> DataStore<T> create(Serializer<T> serializer, ReplaceFileCorruptionHandler<T> replaceFileCorruptionHandler, List<? extends DataMigration<T>> migrations, InterfaceC0066v scope, InterfaceC6487a produceFile) {
        AbstractC6452k.m12181e(serializer, "serializer");
        AbstractC6452k.m12181e(migrations, "migrations");
        AbstractC6452k.m12181e(scope, "scope");
        AbstractC6452k.m12181e(produceFile, "produceFile");
        FileStorage fileStorage = new FileStorage(serializer, new C13311(scope), produceFile);
        List listM1752k = AbstractC0846b.m1752k(DataMigrationInitializer.Companion.getInitializer(migrations));
        if (replaceFileCorruptionHandler == null) {
            replaceFileCorruptionHandler = (ReplaceFileCorruptionHandler<T>) new NoOpCorruptionHandler();
        }
        return new DataStoreImpl(fileStorage, listM1752k, replaceFileCorruptionHandler, scope);
    }
}
