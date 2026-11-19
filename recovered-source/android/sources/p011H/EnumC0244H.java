package p011H;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: H.H */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC0244H implements Executor {

    /* JADX INFO: renamed from: s */
    public static final EnumC0244H f483s;

    /* JADX INFO: renamed from: t */
    public static final /* synthetic */ EnumC0244H[] f484t;

    static {
        EnumC0244H enumC0244H = new EnumC0244H("INSTANCE", 0);
        f483s = enumC0244H;
        f484t = new EnumC0244H[]{enumC0244H};
    }

    public static EnumC0244H valueOf(String str) {
        return (EnumC0244H) Enum.valueOf(EnumC0244H.class, str);
    }

    public static EnumC0244H[] values() {
        return (EnumC0244H[]) f484t.clone();
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
