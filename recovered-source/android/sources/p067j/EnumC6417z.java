package p067j;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: j.z */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC6417z {

    /* JADX INFO: renamed from: s */
    public static final EnumC6417z f24554s;

    /* JADX INFO: renamed from: t */
    public static final /* synthetic */ EnumC6417z[] f24555t;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC6417z EF0;

    static {
        EnumC6417z enumC6417z = new EnumC6417z("UNKNOWN", 0);
        EnumC6417z enumC6417z2 = new EnumC6417z("ANDROID_FIREBASE", 1);
        f24554s = enumC6417z2;
        f24555t = new EnumC6417z[]{enumC6417z, enumC6417z2};
    }

    public static EnumC6417z valueOf(String str) {
        return (EnumC6417z) Enum.valueOf(EnumC6417z.class, str);
    }

    public static EnumC6417z[] values() {
        return (EnumC6417z[]) f24555t.clone();
    }
}
