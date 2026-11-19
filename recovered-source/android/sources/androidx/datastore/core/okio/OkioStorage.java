package androidx.datastore.core.okio;

import androidx.datastore.core.InterProcessCoordinator;
import androidx.datastore.core.Storage;
import androidx.datastore.core.StorageConnection;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.AbstractC6447f;
import kotlin.jvm.internal.AbstractC6452k;
import kotlin.jvm.internal.AbstractC6453l;
import p011H.AbstractC0242F;
import p033S0.AbstractC0620n;
import p033S0.C0627u;
import p057d0.C6289k;
import p057d0.InterfaceC6281c;
import p078p0.InterfaceC6487a;
import p078p0.InterfaceC6502p;

/* JADX INFO: loaded from: classes.dex */
public final class OkioStorage<T> implements Storage<T> {
    public static final Companion Companion = new Companion(null);
    private static final Set<String> activeFiles = new LinkedHashSet();
    private static final Synchronizer activeFilesLock = new Synchronizer();
    private final InterfaceC6281c canonicalPath$delegate;
    private final InterfaceC6502p coordinatorProducer;
    private final AbstractC0620n fileSystem;
    private final InterfaceC6487a producePath;
    private final OkioSerializer<T> serializer;

    /* JADX INFO: renamed from: androidx.datastore.core.okio.OkioStorage$1 */
    public static final class C13431 extends AbstractC6453l implements InterfaceC6502p {
        public static final C13431 INSTANCE = new C13431();

        public C13431() {
            super(2);
        }

        @Override // p078p0.InterfaceC6502p
        public final InterProcessCoordinator invoke(C0627u path, AbstractC0620n abstractC0620n) {
            AbstractC6452k.m12181e(path, "path");
            AbstractC6452k.m12181e(abstractC0620n, "<anonymous parameter 1>");
            return OkioStorageKt.createSingleProcessCoordinator(path);
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC6447f abstractC6447f) {
            this();
        }

        public final Set<String> getActiveFiles$datastore_core_okio() {
            return OkioStorage.activeFiles;
        }

        public final Synchronizer getActiveFilesLock() {
            return OkioStorage.activeFilesLock;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.core.okio.OkioStorage$createConnection$2 */
    public static final class C13442 extends AbstractC6453l implements InterfaceC6487a {
        final /* synthetic */ OkioStorage<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13442(OkioStorage<T> okioStorage) {
            super(0);
            this.this$0 = okioStorage;
        }

        @Override // p078p0.InterfaceC6487a
        public /* bridge */ /* synthetic */ Object invoke() {
            m12283invoke();
            return C6289k.f24318a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m12283invoke() {
            Companion companion = OkioStorage.Companion;
            Synchronizer activeFilesLock = companion.getActiveFilesLock();
            OkioStorage<T> okioStorage = this.this$0;
            synchronized (activeFilesLock) {
                companion.getActiveFiles$datastore_core_okio().remove(okioStorage.getCanonicalPath().f1372s.m1415t());
            }
        }
    }

    public OkioStorage(AbstractC0620n fileSystem, OkioSerializer<T> serializer, InterfaceC6502p coordinatorProducer, InterfaceC6487a producePath) {
        AbstractC6452k.m12181e(fileSystem, "fileSystem");
        AbstractC6452k.m12181e(serializer, "serializer");
        AbstractC6452k.m12181e(coordinatorProducer, "coordinatorProducer");
        AbstractC6452k.m12181e(producePath, "producePath");
        this.fileSystem = fileSystem;
        this.serializer = serializer;
        this.coordinatorProducer = coordinatorProducer;
        this.producePath = producePath;
        this.canonicalPath$delegate = AbstractC0242F.m357n(new OkioStorage$canonicalPath$2(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C0627u getCanonicalPath() {
        return (C0627u) this.canonicalPath$delegate.getValue();
    }

    @Override // androidx.datastore.core.Storage
    public StorageConnection<T> createConnection() {
        String strM1415t = getCanonicalPath().f1372s.m1415t();
        synchronized (activeFilesLock) {
            Set<String> set = activeFiles;
            if (set.contains(strM1415t)) {
                throw new IllegalStateException(("There are multiple DataStores active for the same file: " + strM1415t + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
            }
            set.add(strM1415t);
        }
        return new OkioStorageConnection(this.fileSystem, getCanonicalPath(), this.serializer, (InterProcessCoordinator) this.coordinatorProducer.invoke(getCanonicalPath(), this.fileSystem), new C13442(this));
    }

    public /* synthetic */ OkioStorage(AbstractC0620n abstractC0620n, OkioSerializer okioSerializer, InterfaceC6502p interfaceC6502p, InterfaceC6487a interfaceC6487a, int i2, AbstractC6447f abstractC6447f) {
        this(abstractC0620n, okioSerializer, (i2 & 4) != 0 ? C13431.INSTANCE : interfaceC6502p, interfaceC6487a);
    }
}
