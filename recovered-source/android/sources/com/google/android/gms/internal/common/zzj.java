package com.google.android.gms.internal.common;

/* JADX INFO: loaded from: classes2.dex */
public final class zzj {
    /* JADX INFO: renamed from: a */
    public static Object m9106a(Class cls, String str, zzi... zziVarArr) {
        int length = zziVarArr.length;
        Class<?>[] clsArr = new Class[length];
        Object[] objArr = new Object[length];
        for (int i2 = 0; i2 < zziVarArr.length; i2++) {
            zzi zziVar = zziVarArr[i2];
            zziVar.getClass();
            clsArr[i2] = zziVar.f21585a;
            objArr[i2] = zziVarArr[i2].f21586b;
        }
        return cls.getDeclaredMethod(str, clsArr).invoke(null, objArr);
    }
}
