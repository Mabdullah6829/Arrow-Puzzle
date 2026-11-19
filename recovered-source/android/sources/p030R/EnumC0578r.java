package p030R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: R.r */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0578r {

    /* JADX INFO: renamed from: s */
    public static final EnumC0578r f1232s;

    /* JADX INFO: renamed from: t */
    public static final EnumC0578r f1233t;

    /* JADX INFO: renamed from: u */
    public static final EnumC0578r f1234u;

    /* JADX INFO: renamed from: v */
    public static final EnumC0578r f1235v;

    /* JADX INFO: renamed from: w */
    public static final EnumC0578r f1236w;

    /* JADX INFO: renamed from: x */
    public static final /* synthetic */ EnumC0578r[] f1237x;

    static {
        EnumC0578r enumC0578r = new EnumC0578r("CONNECTING", 0);
        f1232s = enumC0578r;
        EnumC0578r enumC0578r2 = new EnumC0578r("READY", 1);
        f1233t = enumC0578r2;
        EnumC0578r enumC0578r3 = new EnumC0578r("TRANSIENT_FAILURE", 2);
        f1234u = enumC0578r3;
        EnumC0578r enumC0578r4 = new EnumC0578r("IDLE", 3);
        f1235v = enumC0578r4;
        EnumC0578r enumC0578r5 = new EnumC0578r("SHUTDOWN", 4);
        f1236w = enumC0578r5;
        f1237x = new EnumC0578r[]{enumC0578r, enumC0578r2, enumC0578r3, enumC0578r4, enumC0578r5};
    }

    public static EnumC0578r valueOf(String str) {
        return (EnumC0578r) Enum.valueOf(EnumC0578r.class, str);
    }

    public static EnumC0578r[] values() {
        return (EnumC0578r[]) f1237x.clone();
    }
}
