package androidx.datastore.core;

import java.io.File;
import kotlin.jvm.internal.AbstractC6452k;

/* JADX INFO: loaded from: classes.dex */
public final class InterProcessCoordinator_jvmKt {
    public static final InterProcessCoordinator createSingleProcessCoordinator(File file) {
        AbstractC6452k.m12181e(file, "file");
        String absolutePath = file.getCanonicalFile().getAbsolutePath();
        AbstractC6452k.m12180d(absolutePath, "file.canonicalFile.absolutePath");
        return InterProcessCoordinatorKt.createSingleProcessCoordinator(absolutePath);
    }
}
