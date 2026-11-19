package p075m0;

/* JADX INFO: renamed from: m0.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6476a {

    /* JADX INFO: renamed from: a */
    public static final Integer f24659a;

    static {
        Integer num;
        Integer num2 = null;
        try {
            Object obj = Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
            num = obj instanceof Integer ? (Integer) obj : null;
        } catch (Throwable unused) {
        }
        if (num != null && num.intValue() > 0) {
            num2 = num;
        }
        f24659a = num2;
    }
}
