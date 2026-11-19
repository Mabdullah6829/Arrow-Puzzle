package androidx.datastore.core;

import java.io.File;
import java.io.IOException;
import kotlin.jvm.internal.AbstractC6453l;
import p078p0.InterfaceC6487a;

/* JADX INFO: loaded from: classes.dex */
public final class MultiProcessCoordinator$lockFile$2 extends AbstractC6453l implements InterfaceC6487a {
    final /* synthetic */ MultiProcessCoordinator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiProcessCoordinator$lockFile$2(MultiProcessCoordinator multiProcessCoordinator) {
        super(0);
        this.this$0 = multiProcessCoordinator;
    }

    @Override // p078p0.InterfaceC6487a
    public final File invoke() throws IOException {
        MultiProcessCoordinator multiProcessCoordinator = this.this$0;
        File fileFileWithSuffix = multiProcessCoordinator.fileWithSuffix(multiProcessCoordinator.LOCK_SUFFIX);
        this.this$0.createIfNotExists(fileFileWithSuffix);
        return fileFileWithSuffix;
    }
}
