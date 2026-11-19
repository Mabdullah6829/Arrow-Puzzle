package androidx.datastore.core.okio;

import androidx.datastore.core.InterProcessCoordinator;
import androidx.datastore.core.InterProcessCoordinatorKt;
import kotlin.jvm.internal.AbstractC6452k;
import p033S0.C0627u;
import p049b0.C1887c;

/* JADX INFO: loaded from: classes.dex */
public final class OkioStorageKt {
    public static final InterProcessCoordinator createSingleProcessCoordinator(C0627u path) {
        AbstractC6452k.m12181e(path, "path");
        return InterProcessCoordinatorKt.createSingleProcessCoordinator(C1887c.m2718e(path.f1372s.m1415t(), true).f1372s.m1415t());
    }
}
