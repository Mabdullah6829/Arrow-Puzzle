package com.google.protobuf;

/* JADX INFO: renamed from: com.google.protobuf.y0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6274y0 {

    /* JADX INFO: renamed from: a */
    public static final C6272x0 f24298a;

    /* JADX INFO: renamed from: b */
    public static final C6272x0 f24299b;

    static {
        C6272x0 c6272x0 = null;
        try {
            c6272x0 = (C6272x0) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f24298a = c6272x0;
        f24299b = new C6272x0();
    }
}
