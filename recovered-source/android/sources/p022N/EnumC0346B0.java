package p022N;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: N.B0 */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC0346B0 {

    /* JADX INFO: renamed from: s */
    public static final EnumC0346B0 f684s;

    /* JADX INFO: renamed from: t */
    public static final EnumC0346B0 f685t;

    /* JADX INFO: renamed from: u */
    public static final EnumC0346B0 f686u;

    /* JADX INFO: renamed from: v */
    public static final EnumC0346B0 f687v;

    /* JADX INFO: renamed from: w */
    public static final /* synthetic */ EnumC0346B0[] f688w;

    static {
        EnumC0346B0 enumC0346B0 = new EnumC0346B0("COMPOSITE_FILTER", 0);
        f684s = enumC0346B0;
        EnumC0346B0 enumC0346B1 = new EnumC0346B0("FIELD_FILTER", 1);
        f685t = enumC0346B1;
        EnumC0346B0 enumC0346B2 = new EnumC0346B0("UNARY_FILTER", 2);
        f686u = enumC0346B2;
        EnumC0346B0 enumC0346B3 = new EnumC0346B0("FILTERTYPE_NOT_SET", 3);
        f687v = enumC0346B3;
        f688w = new EnumC0346B0[]{enumC0346B0, enumC0346B1, enumC0346B2, enumC0346B3};
    }

    public static EnumC0346B0 valueOf(String str) {
        return (EnumC0346B0) Enum.valueOf(EnumC0346B0.class, str);
    }

    public static EnumC0346B0[] values() {
        return (EnumC0346B0[]) f688w.clone();
    }
}
