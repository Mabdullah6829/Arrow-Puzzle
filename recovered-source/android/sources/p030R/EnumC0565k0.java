package p030R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: R.k0 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0565k0 {

    /* JADX INFO: renamed from: s */
    public static final EnumC0565k0 f1196s;

    /* JADX INFO: renamed from: t */
    public static final EnumC0565k0 f1197t;

    /* JADX INFO: renamed from: u */
    public static final EnumC0565k0 f1198u;

    /* JADX INFO: renamed from: v */
    public static final /* synthetic */ EnumC0565k0[] f1199v;

    static {
        EnumC0565k0 enumC0565k0 = new EnumC0565k0("UNARY", 0);
        f1196s = enumC0565k0;
        EnumC0565k0 enumC0565k1 = new EnumC0565k0("CLIENT_STREAMING", 1);
        EnumC0565k0 enumC0565k2 = new EnumC0565k0("SERVER_STREAMING", 2);
        f1197t = enumC0565k2;
        EnumC0565k0 enumC0565k3 = new EnumC0565k0("BIDI_STREAMING", 3);
        f1198u = enumC0565k3;
        f1199v = new EnumC0565k0[]{enumC0565k0, enumC0565k1, enumC0565k2, enumC0565k3, new EnumC0565k0("UNKNOWN", 4)};
    }

    public static EnumC0565k0 valueOf(String str) {
        return (EnumC0565k0) Enum.valueOf(EnumC0565k0.class, str);
    }

    public static EnumC0565k0[] values() {
        return (EnumC0565k0[]) f1199v.clone();
    }
}
