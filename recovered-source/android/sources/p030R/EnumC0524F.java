package p030R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: R.F */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0524F {

    /* JADX INFO: renamed from: s */
    public static final EnumC0524F f1109s;

    /* JADX INFO: renamed from: t */
    public static final EnumC0524F f1110t;

    /* JADX INFO: renamed from: u */
    public static final EnumC0524F f1111u;

    /* JADX INFO: renamed from: v */
    public static final /* synthetic */ EnumC0524F[] f1112v;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC0524F EF0;

    static {
        EnumC0524F enumC0524F = new EnumC0524F("CT_UNKNOWN", 0);
        EnumC0524F enumC0524F2 = new EnumC0524F("CT_INFO", 1);
        f1109s = enumC0524F2;
        EnumC0524F enumC0524F3 = new EnumC0524F("CT_WARNING", 2);
        f1110t = enumC0524F3;
        EnumC0524F enumC0524F4 = new EnumC0524F("CT_ERROR", 3);
        f1111u = enumC0524F4;
        f1112v = new EnumC0524F[]{enumC0524F, enumC0524F2, enumC0524F3, enumC0524F4};
    }

    public static EnumC0524F valueOf(String str) {
        return (EnumC0524F) Enum.valueOf(EnumC0524F.class, str);
    }

    public static EnumC0524F[] values() {
        return (EnumC0524F[]) f1112v.clone();
    }
}
