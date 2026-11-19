package com.google.android.gms.internal.measurement;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public final class zzrm {

    /* JADX INFO: renamed from: a */
    public static final Method f22821a;

    static {
        Method method = null;
        try {
            try {
                Class<?> cls = Class.forName("android.os.SystemProperties");
                method = cls.getMethod("get", String.class, String.class);
                cls.getMethod("getInt", String.class, Integer.TYPE);
                cls.getMethod("getLong", String.class, Long.TYPE);
                cls.getMethod("getBoolean", String.class, Boolean.TYPE);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } finally {
            f22821a = method;
        }
    }
}
