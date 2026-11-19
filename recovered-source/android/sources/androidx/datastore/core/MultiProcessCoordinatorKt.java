package androidx.datastore.core;

import java.io.File;
import kotlin.jvm.internal.AbstractC6452k;
import p062g0.InterfaceC6353h;

/* JADX INFO: loaded from: classes.dex */
public final class MultiProcessCoordinatorKt {
    public static final InterProcessCoordinator createMultiProcessCoordinator(InterfaceC6353h context, File file) {
        AbstractC6452k.m12181e(context, "context");
        AbstractC6452k.m12181e(file, "file");
        return new MultiProcessCoordinator(context, file);
    }
}
