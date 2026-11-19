package p030R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: R.C0 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0521C0 {

    /* JADX INFO: renamed from: s */
    public static final EnumC0521C0 f1101s;

    /* JADX INFO: renamed from: t */
    public static final EnumC0521C0 f1102t;

    /* JADX INFO: renamed from: u */
    public static final /* synthetic */ EnumC0521C0[] f1103u;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC0521C0 EF0;

    static {
        EnumC0521C0 enumC0521C0 = new EnumC0521C0("FAKE", 0);
        EnumC0521C0 enumC0521C1 = new EnumC0521C0("MTLS", 1);
        f1101s = enumC0521C1;
        EnumC0521C0 enumC0521C2 = new EnumC0521C0("CUSTOM_MANAGERS", 2);
        f1102t = enumC0521C2;
        f1103u = new EnumC0521C0[]{enumC0521C0, enumC0521C1, enumC0521C2};
    }

    public static EnumC0521C0 valueOf(String str) {
        return (EnumC0521C0) Enum.valueOf(EnumC0521C0.class, str);
    }

    public static EnumC0521C0[] values() {
        return (EnumC0521C0[]) f1103u.clone();
    }
}
