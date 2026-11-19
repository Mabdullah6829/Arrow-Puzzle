package kotlin.jvm.internal;

/* JADX INFO: renamed from: kotlin.jvm.internal.v */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6463v {

    /* JADX INFO: renamed from: a */
    public static final C6464w f24637a;

    static {
        C6464w c6464w = null;
        try {
            c6464w = (C6464w) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (c6464w == null) {
            c6464w = new C6464w();
        }
        f24637a = c6464w;
    }

    /* JADX INFO: renamed from: a */
    public static C6446e m12189a(Class cls) {
        f24637a.getClass();
        return new C6446e(cls);
    }
}
