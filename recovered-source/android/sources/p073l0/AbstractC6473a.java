package p073l0;

/* JADX INFO: renamed from: l0.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6473a {

    /* JADX INFO: renamed from: a */
    public static final Integer f24655a;

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
        f24655a = num2;
    }
}
