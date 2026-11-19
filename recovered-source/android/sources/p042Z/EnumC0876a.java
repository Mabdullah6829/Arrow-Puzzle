package p042Z;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: Z.a */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0876a {

    /* JADX INFO: renamed from: s */
    public static final EnumC0876a f2457s;

    /* JADX INFO: renamed from: t */
    public static final /* synthetic */ EnumC0876a[] f2458t;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC0876a EF0;

    static {
        EnumC0876a enumC0876a = new EnumC0876a("BLOCKING", 0);
        EnumC0876a enumC0876a2 = new EnumC0876a("FUTURE", 1);
        EnumC0876a enumC0876a3 = new EnumC0876a("ASYNC", 2);
        f2457s = enumC0876a3;
        f2458t = new EnumC0876a[]{enumC0876a, enumC0876a2, enumC0876a3};
    }

    public static EnumC0876a valueOf(String str) {
        return (EnumC0876a) Enum.valueOf(EnumC0876a.class, str);
    }

    public static EnumC0876a[] values() {
        return (EnumC0876a[]) f2458t.clone();
    }
}
