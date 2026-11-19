package androidx.datastore.core;

import java.io.File;
import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.AbstractC6447f;
import kotlin.jvm.internal.AbstractC6452k;
import kotlin.jvm.internal.AbstractC6453l;
import p057d0.C6289k;
import p078p0.InterfaceC6487a;
import p078p0.InterfaceC6498l;

/* JADX INFO: loaded from: classes.dex */
public final class FileStorage<T> implements Storage<T> {
    public static final Companion Companion = new Companion(null);
    private static final Set<String> activeFiles = new LinkedHashSet();
    private static final Object activeFilesLock = new Object();
    private final InterfaceC6498l coordinatorProducer;
    private final InterfaceC6487a produceFile;
    private final Serializer<T> serializer;

    /* JADX INFO: renamed from: androidx.datastore.core.FileStorage$1 */
    public static final class C13201 extends AbstractC6453l implements InterfaceC6498l {
        public static final C13201 INSTANCE = new C13201();

        public C13201() {
            super(1);
        }

        @Override // p078p0.InterfaceC6498l
        public final InterProcessCoordinator invoke(File it) {
            AbstractC6452k.m12181e(it, "it");
            return InterProcessCoordinator_jvmKt.createSingleProcessCoordinator(it);
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC6447f abstractC6447f) {
            this();
        }

        public final Set<String> getActiveFiles$datastore_core_release() {
            return FileStorage.activeFiles;
        }

        public final Object getActiveFilesLock$datastore_core_release() {
            return FileStorage.activeFilesLock;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.core.FileStorage$createConnection$2 */
    public static final class C13212 extends AbstractC6453l implements InterfaceC6487a {
        final /* synthetic */ File $file;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13212(File file) {
            super(0);
            this.$file = file;
        }

        @Override // p078p0.InterfaceC6487a
        public /* bridge */ /* synthetic */ Object invoke() {
            m12281invoke();
            return C6289k.f24318a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m12281invoke() {
            Companion companion = FileStorage.Companion;
            Object activeFilesLock$datastore_core_release = companion.getActiveFilesLock$datastore_core_release();
            File file = this.$file;
            synchronized (activeFilesLock$datastore_core_release) {
                companion.getActiveFiles$datastore_core_release().remove(file.getAbsolutePath());
            }
        }
    }

    public FileStorage(Serializer<T> serializer, InterfaceC6498l coordinatorProducer, InterfaceC6487a produceFile) {
        AbstractC6452k.m12181e(serializer, "serializer");
        AbstractC6452k.m12181e(coordinatorProducer, "coordinatorProducer");
        AbstractC6452k.m12181e(produceFile, "produceFile");
        this.serializer = serializer;
        this.coordinatorProducer = coordinatorProducer;
        this.produceFile = produceFile;
    }

    @Override // androidx.datastore.core.Storage
    public StorageConnection<T> createConnection() throws IOException {
        File canonicalFile = ((File) this.produceFile.invoke()).getCanonicalFile();
        synchronized (activeFilesLock) {
            String path = canonicalFile.getAbsolutePath();
            Set<String> set = activeFiles;
            if (set.contains(path)) {
                throw new IllegalStateException(("There are multiple DataStores active for the same file: " + path + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
            }
            AbstractC6452k.m12180d(path, "path");
            set.add(path);
        }
        return new FileStorageConnection(canonicalFile, this.serializer, (InterProcessCoordinator) this.coordinatorProducer.invoke(canonicalFile), new C13212(canonicalFile));
    }

    public /* synthetic */ FileStorage(Serializer serializer, InterfaceC6498l interfaceC6498l, InterfaceC6487a interfaceC6487a, int i2, AbstractC6447f abstractC6447f) {
        this(serializer, (i2 & 2) != 0 ? C13201.INSTANCE : interfaceC6498l, interfaceC6487a);
    }
}
