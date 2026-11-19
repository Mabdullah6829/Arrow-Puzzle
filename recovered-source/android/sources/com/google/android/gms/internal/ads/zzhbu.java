package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
final class zzhbu implements Executor {

    /* JADX INFO: renamed from: s */
    public static final zzhbu f18506s;

    /* JADX INFO: renamed from: t */
    public static final /* synthetic */ zzhbu[] f18507t;

    static {
        zzhbu zzhbuVar = new zzhbu("INSTANCE", 0);
        f18506s = zzhbuVar;
        f18507t = new zzhbu[]{zzhbuVar};
    }

    public static zzhbu[] values() {
        return (zzhbu[]) f18507t.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "MoreExecutors.directExecutor()";
    }
}
