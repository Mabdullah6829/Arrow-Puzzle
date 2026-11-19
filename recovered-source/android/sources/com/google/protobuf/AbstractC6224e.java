package com.google.protobuf;

/* JADX INFO: renamed from: com.google.protobuf.e */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6224e {

    /* JADX INFO: renamed from: a */
    public static final Class f24170a;

    /* JADX INFO: renamed from: b */
    public static final boolean f24171b;

    static {
        Class<?> cls;
        Class<?> cls2 = null;
        try {
            cls = Class.forName("libcore.io.Memory");
        } catch (Throwable unused) {
            cls = null;
        }
        f24170a = cls;
        try {
            cls2 = Class.forName("org.robolectric.Robolectric");
        } catch (Throwable unused2) {
        }
        f24171b = cls2 != null;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m11876a() {
        return (f24170a == null || f24171b) ? false : true;
    }
}
