package p011H;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: H.J */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC0246J {

    /* JADX INFO: renamed from: s */
    public static final EnumC0246J f491s;

    /* JADX INFO: renamed from: t */
    public static final EnumC0246J f492t;

    /* JADX INFO: renamed from: u */
    public static final EnumC0246J f493u;

    /* JADX INFO: renamed from: v */
    public static final /* synthetic */ EnumC0246J[] f494v;

    static {
        EnumC0246J enumC0246J = new EnumC0246J("NOT_RUN", 0);
        f491s = enumC0246J;
        EnumC0246J enumC0246J2 = new EnumC0246J("CANCELLED", 1);
        f492t = enumC0246J2;
        EnumC0246J enumC0246J3 = new EnumC0246J("STARTED", 2);
        f493u = enumC0246J3;
        f494v = new EnumC0246J[]{enumC0246J, enumC0246J2, enumC0246J3};
    }

    public static EnumC0246J valueOf(String str) {
        return (EnumC0246J) Enum.valueOf(EnumC0246J.class, str);
    }

    public static EnumC0246J[] values() {
        return (EnumC0246J[]) f494v.clone();
    }
}
