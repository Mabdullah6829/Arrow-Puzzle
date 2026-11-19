package p063h;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: h.d */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC6358d {

    /* JADX INFO: renamed from: s */
    public static final EnumC6358d f24415s;

    /* JADX INFO: renamed from: t */
    public static final EnumC6358d f24416t;

    /* JADX INFO: renamed from: u */
    public static final EnumC6358d f24417u;

    /* JADX INFO: renamed from: v */
    public static final /* synthetic */ EnumC6358d[] f24418v;

    static {
        EnumC6358d enumC6358d = new EnumC6358d("DEFAULT", 0);
        f24415s = enumC6358d;
        EnumC6358d enumC6358d2 = new EnumC6358d("VERY_LOW", 1);
        f24416t = enumC6358d2;
        EnumC6358d enumC6358d3 = new EnumC6358d("HIGHEST", 2);
        f24417u = enumC6358d3;
        f24418v = new EnumC6358d[]{enumC6358d, enumC6358d2, enumC6358d3};
    }

    public static EnumC6358d valueOf(String str) {
        return (EnumC6358d) Enum.valueOf(EnumC6358d.class, str);
    }

    public static EnumC6358d[] values() {
        return (EnumC6358d[]) f24418v.clone();
    }
}
