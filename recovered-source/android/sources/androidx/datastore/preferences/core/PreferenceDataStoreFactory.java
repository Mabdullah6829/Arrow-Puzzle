package androidx.datastore.preferences.core;

import androidx.datastore.core.DataMigration;
import androidx.datastore.core.DataStore;
import androidx.datastore.core.DataStoreFactory;
import androidx.datastore.core.FileStorage;
import androidx.datastore.core.Storage;
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
import p033S0.C0627u;
import p058e0.C6313u;
import p078p0.InterfaceC6487a;

/* JADX INFO: loaded from: classes.dex */
public final class PreferenceDataStoreFactory {
    public static final PreferenceDataStoreFactory INSTANCE = new PreferenceDataStoreFactory();

    /* JADX INFO: renamed from: androidx.datastore.preferences.core.PreferenceDataStoreFactory$createWithPath$1 */
    public static final class C13621 extends AbstractC6453l implements InterfaceC6487a {
        final /* synthetic */ InterfaceC6487a $produceFile;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13621(InterfaceC6487a interfaceC6487a) {
            super(0);
            this.$produceFile = interfaceC6487a;
        }

        @Override // p078p0.InterfaceC6487a
        public final File invoke() {
            return ((C0627u) this.$produceFile.invoke()).toFile();
        }
    }

    private PreferenceDataStoreFactory() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static DataStore create$default(PreferenceDataStoreFactory preferenceDataStoreFactory, Storage storage, ReplaceFileCorruptionHandler replaceFileCorruptionHandler, List list, InterfaceC0066v interfaceC0066v, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            replaceFileCorruptionHandler = null;
        }
        if ((i2 & 4) != 0) {
            list = C6313u.f24338s;
        }
        if ((i2 & 8) != 0) {
            interfaceC0066v = AbstractC0069y.m102a(Actual_jvmAndroidKt.ioDispatcher().plus(new C0050m0()));
        }
        return preferenceDataStoreFactory.create((Storage<Preferences>) storage, (ReplaceFileCorruptionHandler<Preferences>) replaceFileCorruptionHandler, (List<? extends DataMigration<Preferences>>) list, interfaceC0066v);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static DataStore createWithPath$default(PreferenceDataStoreFactory preferenceDataStoreFactory, ReplaceFileCorruptionHandler replaceFileCorruptionHandler, List list, InterfaceC0066v interfaceC0066v, InterfaceC6487a interfaceC6487a, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            replaceFileCorruptionHandler = null;
        }
        if ((i2 & 2) != 0) {
            list = C6313u.f24338s;
        }
        if ((i2 & 4) != 0) {
            interfaceC0066v = AbstractC0069y.m102a(Actual_jvmAndroidKt.ioDispatcher().plus(new C0050m0()));
        }
        return preferenceDataStoreFactory.createWithPath(replaceFileCorruptionHandler, list, interfaceC0066v, interfaceC6487a);
    }

    public final DataStore<Preferences> create(Storage<Preferences> storage) {
        AbstractC6452k.m12181e(storage, "storage");
        return create$default(this, storage, (ReplaceFileCorruptionHandler) null, (List) null, (InterfaceC0066v) null, 14, (Object) null);
    }

    public final DataStore<Preferences> createWithPath(ReplaceFileCorruptionHandler<Preferences> replaceFileCorruptionHandler, List<? extends DataMigration<Preferences>> migrations, InterfaceC6487a produceFile) {
        AbstractC6452k.m12181e(migrations, "migrations");
        AbstractC6452k.m12181e(produceFile, "produceFile");
        return createWithPath$default(this, replaceFileCorruptionHandler, migrations, null, produceFile, 4, null);
    }

    public final DataStore<Preferences> create(Storage<Preferences> storage, ReplaceFileCorruptionHandler<Preferences> replaceFileCorruptionHandler) {
        AbstractC6452k.m12181e(storage, "storage");
        return create$default(this, storage, replaceFileCorruptionHandler, (List) null, (InterfaceC0066v) null, 12, (Object) null);
    }

    public final DataStore<Preferences> createWithPath(ReplaceFileCorruptionHandler<Preferences> replaceFileCorruptionHandler, InterfaceC6487a produceFile) {
        AbstractC6452k.m12181e(produceFile, "produceFile");
        return createWithPath$default(this, replaceFileCorruptionHandler, null, null, produceFile, 6, null);
    }

    public final DataStore<Preferences> create(Storage<Preferences> storage, ReplaceFileCorruptionHandler<Preferences> replaceFileCorruptionHandler, List<? extends DataMigration<Preferences>> migrations) {
        AbstractC6452k.m12181e(storage, "storage");
        AbstractC6452k.m12181e(migrations, "migrations");
        return create$default(this, storage, replaceFileCorruptionHandler, migrations, (InterfaceC0066v) null, 8, (Object) null);
    }

    public final DataStore<Preferences> createWithPath(InterfaceC6487a produceFile) {
        AbstractC6452k.m12181e(produceFile, "produceFile");
        return createWithPath$default(this, null, null, null, produceFile, 7, null);
    }

    public final DataStore<Preferences> create(ReplaceFileCorruptionHandler<Preferences> replaceFileCorruptionHandler, List<? extends DataMigration<Preferences>> migrations, InterfaceC6487a produceFile) {
        AbstractC6452k.m12181e(migrations, "migrations");
        AbstractC6452k.m12181e(produceFile, "produceFile");
        return create$default(this, replaceFileCorruptionHandler, migrations, (InterfaceC0066v) null, produceFile, 4, (Object) null);
    }

    public final DataStore<Preferences> createWithPath(ReplaceFileCorruptionHandler<Preferences> replaceFileCorruptionHandler, List<? extends DataMigration<Preferences>> migrations, InterfaceC0066v scope, InterfaceC6487a produceFile) {
        AbstractC6452k.m12181e(migrations, "migrations");
        AbstractC6452k.m12181e(scope, "scope");
        AbstractC6452k.m12181e(produceFile, "produceFile");
        return create(replaceFileCorruptionHandler, migrations, scope, new C13621(produceFile));
    }

    public final DataStore<Preferences> create(ReplaceFileCorruptionHandler<Preferences> replaceFileCorruptionHandler, InterfaceC6487a produceFile) {
        AbstractC6452k.m12181e(produceFile, "produceFile");
        return create$default(this, replaceFileCorruptionHandler, (List) null, (InterfaceC0066v) null, produceFile, 6, (Object) null);
    }

    public final DataStore<Preferences> create(InterfaceC6487a produceFile) {
        AbstractC6452k.m12181e(produceFile, "produceFile");
        return create$default(this, (ReplaceFileCorruptionHandler) null, (List) null, (InterfaceC0066v) null, produceFile, 7, (Object) null);
    }

    public final DataStore<Preferences> create(ReplaceFileCorruptionHandler<Preferences> replaceFileCorruptionHandler, List<? extends DataMigration<Preferences>> migrations, InterfaceC0066v scope, InterfaceC6487a produceFile) {
        AbstractC6452k.m12181e(migrations, "migrations");
        AbstractC6452k.m12181e(scope, "scope");
        AbstractC6452k.m12181e(produceFile, "produceFile");
        return new PreferenceDataStore(create(new FileStorage(PreferencesFileSerializer.INSTANCE, null, new PreferenceDataStoreFactory$create$delegate$1(produceFile), 2, null), replaceFileCorruptionHandler, migrations, scope));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static DataStore create$default(PreferenceDataStoreFactory preferenceDataStoreFactory, ReplaceFileCorruptionHandler replaceFileCorruptionHandler, List list, InterfaceC0066v interfaceC0066v, InterfaceC6487a interfaceC6487a, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            replaceFileCorruptionHandler = null;
        }
        if ((i2 & 2) != 0) {
            list = C6313u.f24338s;
        }
        if ((i2 & 4) != 0) {
            C0302e c0302e = AbstractC0007H.f4a;
            interfaceC0066v = AbstractC0069y.m102a(ExecutorC0301d.f608s.plus(new C0050m0()));
        }
        return preferenceDataStoreFactory.create((ReplaceFileCorruptionHandler<Preferences>) replaceFileCorruptionHandler, (List<? extends DataMigration<Preferences>>) list, interfaceC0066v, interfaceC6487a);
    }

    public final DataStore<Preferences> create(Storage<Preferences> storage, ReplaceFileCorruptionHandler<Preferences> replaceFileCorruptionHandler, List<? extends DataMigration<Preferences>> migrations, InterfaceC0066v scope) {
        AbstractC6452k.m12181e(storage, "storage");
        AbstractC6452k.m12181e(migrations, "migrations");
        AbstractC6452k.m12181e(scope, "scope");
        return new PreferenceDataStore(DataStoreFactory.INSTANCE.create(storage, replaceFileCorruptionHandler, migrations, scope));
    }
}
