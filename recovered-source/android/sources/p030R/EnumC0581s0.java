package p030R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: R.s0 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0581s0 {

    /* JADX INFO: renamed from: s */
    public static final EnumC0581s0 f1240s;

    /* JADX INFO: renamed from: t */
    public static final EnumC0581s0 f1241t;

    /* JADX INFO: renamed from: u */
    public static final /* synthetic */ EnumC0581s0[] f1242u;

    static {
        EnumC0581s0 enumC0581s0 = new EnumC0581s0("NONE", 0);
        f1240s = enumC0581s0;
        EnumC0581s0 enumC0581s1 = new EnumC0581s0("INTEGRITY", 1);
        EnumC0581s0 enumC0581s2 = new EnumC0581s0("PRIVACY_AND_INTEGRITY", 2);
        f1241t = enumC0581s2;
        f1242u = new EnumC0581s0[]{enumC0581s0, enumC0581s1, enumC0581s2};
    }

    public static EnumC0581s0 valueOf(String str) {
        return (EnumC0581s0) Enum.valueOf(EnumC0581s0.class, str);
    }

    public static EnumC0581s0[] values() {
        return (EnumC0581s0[]) f1242u.clone();
    }
}
