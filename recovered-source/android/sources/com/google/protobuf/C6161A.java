package com.google.protobuf;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: com.google.protobuf.A */
/* JADX INFO: loaded from: classes.dex */
public final class C6161A {

    /* JADX INFO: renamed from: a */
    public static volatile C6161A f24051a;

    /* JADX INFO: renamed from: b */
    public static final C6161A f24052b;

    static {
        C6161A c6161a = new C6161A();
        Map map = Collections.EMPTY_MAP;
        f24052b = c6161a;
    }

    /* JADX INFO: renamed from: a */
    public static C6161A m11704a() {
        C6161A c6161a;
        C6161A c6161a2 = f24051a;
        if (c6161a2 != null) {
            return c6161a2;
        }
        synchronized (C6161A.class) {
            try {
                c6161a = f24051a;
                if (c6161a == null) {
                    Class cls = AbstractC6275z.f24300a;
                    C6161A c6161a3 = null;
                    if (cls != null) {
                        try {
                            c6161a3 = (C6161A) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                        } catch (Exception unused) {
                        }
                    }
                    c6161a = c6161a3 != null ? c6161a3 : f24052b;
                    f24051a = c6161a;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c6161a;
    }
}
