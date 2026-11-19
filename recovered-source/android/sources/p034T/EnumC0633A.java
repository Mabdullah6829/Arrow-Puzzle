package p034T;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: T.A */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0633A {

    /* JADX INFO: renamed from: s */
    public static final EnumC0633A f1391s;

    /* JADX INFO: renamed from: t */
    public static final EnumC0633A f1392t;

    /* JADX INFO: renamed from: u */
    public static final EnumC0633A f1393u;

    /* JADX INFO: renamed from: v */
    public static final EnumC0633A f1394v;

    /* JADX INFO: renamed from: w */
    public static final /* synthetic */ EnumC0633A[] f1395w;

    static {
        EnumC0633A enumC0633A = new EnumC0633A("PROCESSED", 0);
        f1391s = enumC0633A;
        EnumC0633A enumC0633A2 = new EnumC0633A("REFUSED", 1);
        f1392t = enumC0633A2;
        EnumC0633A enumC0633A3 = new EnumC0633A("DROPPED", 2);
        f1393u = enumC0633A3;
        EnumC0633A enumC0633A4 = new EnumC0633A("MISCARRIED", 3);
        f1394v = enumC0633A4;
        f1395w = new EnumC0633A[]{enumC0633A, enumC0633A2, enumC0633A3, enumC0633A4};
    }

    public static EnumC0633A valueOf(String str) {
        return (EnumC0633A) Enum.valueOf(EnumC0633A.class, str);
    }

    public static EnumC0633A[] values() {
        return (EnumC0633A[]) f1395w.clone();
    }
}
