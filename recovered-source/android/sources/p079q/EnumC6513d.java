package p079q;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: q.d */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC6513d {

    /* JADX INFO: renamed from: s */
    public static final EnumC6513d f24703s;

    /* JADX INFO: renamed from: t */
    public static final EnumC6513d f24704t;

    /* JADX INFO: renamed from: u */
    public static final EnumC6513d f24705u;

    /* JADX INFO: renamed from: v */
    public static final /* synthetic */ EnumC6513d[] f24706v;

    static {
        EnumC6513d enumC6513d = new EnumC6513d("NETWORK_UNMETERED", 0);
        f24703s = enumC6513d;
        EnumC6513d enumC6513d2 = new EnumC6513d("DEVICE_IDLE", 1);
        f24704t = enumC6513d2;
        EnumC6513d enumC6513d3 = new EnumC6513d("DEVICE_CHARGING", 2);
        f24705u = enumC6513d3;
        f24706v = new EnumC6513d[]{enumC6513d, enumC6513d2, enumC6513d3};
    }

    public static EnumC6513d valueOf(String str) {
        return (EnumC6513d) Enum.valueOf(EnumC6513d.class, str);
    }

    public static EnumC6513d[] values() {
        return (EnumC6513d[]) f24706v.clone();
    }
}
