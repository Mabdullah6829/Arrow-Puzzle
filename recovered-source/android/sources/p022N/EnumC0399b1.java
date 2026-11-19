package p022N;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: N.b1 */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC0399b1 {

    /* JADX INFO: renamed from: s */
    public static final EnumC0399b1 f742s;

    /* JADX INFO: renamed from: t */
    public static final EnumC0399b1 f743t;

    /* JADX INFO: renamed from: u */
    public static final EnumC0399b1 f744u;

    /* JADX INFO: renamed from: v */
    public static final EnumC0399b1 f745v;

    /* JADX INFO: renamed from: w */
    public static final EnumC0399b1 f746w;

    /* JADX INFO: renamed from: x */
    public static final /* synthetic */ EnumC0399b1[] f747x;

    static {
        EnumC0399b1 enumC0399b1 = new EnumC0399b1("UPDATE", 0);
        f742s = enumC0399b1;
        EnumC0399b1 enumC0399b2 = new EnumC0399b1("DELETE", 1);
        f743t = enumC0399b2;
        EnumC0399b1 enumC0399b3 = new EnumC0399b1("VERIFY", 2);
        f744u = enumC0399b3;
        EnumC0399b1 enumC0399b4 = new EnumC0399b1("TRANSFORM", 3);
        f745v = enumC0399b4;
        EnumC0399b1 enumC0399b5 = new EnumC0399b1("OPERATION_NOT_SET", 4);
        f746w = enumC0399b5;
        f747x = new EnumC0399b1[]{enumC0399b1, enumC0399b2, enumC0399b3, enumC0399b4, enumC0399b5};
    }

    public static EnumC0399b1 valueOf(String str) {
        return (EnumC0399b1) Enum.valueOf(EnumC0399b1.class, str);
    }

    public static EnumC0399b1[] values() {
        return (EnumC0399b1[]) f747x.clone();
    }
}
