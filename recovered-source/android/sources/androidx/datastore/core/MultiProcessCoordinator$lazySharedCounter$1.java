package androidx.datastore.core;

import java.io.File;
import java.io.IOException;
import kotlin.jvm.internal.AbstractC6453l;
import p078p0.InterfaceC6487a;

/* JADX INFO: loaded from: classes.dex */
public final class MultiProcessCoordinator$lazySharedCounter$1 extends AbstractC6453l implements InterfaceC6487a {
    final /* synthetic */ MultiProcessCoordinator this$0;

    /* JADX INFO: renamed from: androidx.datastore.core.MultiProcessCoordinator$lazySharedCounter$1$1 */
    public static final class C13271 extends AbstractC6453l implements InterfaceC6487a {
        final /* synthetic */ MultiProcessCoordinator this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13271(MultiProcessCoordinator multiProcessCoordinator) {
            super(0);
            this.this$0 = multiProcessCoordinator;
        }

        @Override // p078p0.InterfaceC6487a
        public final File invoke() throws IOException {
            MultiProcessCoordinator multiProcessCoordinator = this.this$0;
            File fileFileWithSuffix = multiProcessCoordinator.fileWithSuffix(multiProcessCoordinator.VERSION_SUFFIX);
            this.this$0.createIfNotExists(fileFileWithSuffix);
            return fileFileWithSuffix;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiProcessCoordinator$lazySharedCounter$1(MultiProcessCoordinator multiProcessCoordinator) {
        super(0);
        this.this$0 = multiProcessCoordinator;
    }

    @Override // p078p0.InterfaceC6487a
    public final SharedCounter invoke() {
        SharedCounter.Factory factory = SharedCounter.Factory;
        factory.loadLib();
        return factory.create$datastore_core_release(new C13271(this.this$0));
    }
}
