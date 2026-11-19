package androidx.datastore.core;

import kotlin.jvm.internal.AbstractC6452k;

/* JADX INFO: loaded from: classes.dex */
public final class InterProcessCoordinatorKt {
    public static final InterProcessCoordinator createSingleProcessCoordinator(String filePath) {
        AbstractC6452k.m12181e(filePath, "filePath");
        return new SingleProcessCoordinator(filePath);
    }
}
