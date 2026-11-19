package com.google.android.gms.internal.measurement;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
final class zzabd {

    /* JADX INFO: renamed from: s */
    public static final zzabd f21901s;

    /* JADX INFO: renamed from: t */
    public static final zzabd f21902t;

    /* JADX INFO: renamed from: u */
    public static final zzabd f21903u;

    /* JADX INFO: renamed from: v */
    public static final zzabd f21904v;

    /* JADX INFO: renamed from: w */
    public static final /* synthetic */ zzabd[] f21905w;

    static {
        zzabd zzabdVar = new zzabd("BOOLEAN", 0);
        f21901s = zzabdVar;
        zzabd zzabdVar2 = new zzabd("STRING", 1);
        f21902t = zzabdVar2;
        zzabd zzabdVar3 = new zzabd("LONG", 2);
        f21903u = zzabdVar3;
        zzabd zzabdVar4 = new zzabd("DOUBLE", 3);
        f21904v = zzabdVar4;
        f21905w = new zzabd[]{zzabdVar, zzabdVar2, zzabdVar3, zzabdVar4};
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ zzabd m9325b(Object obj) {
        if (obj instanceof String) {
            return f21902t;
        }
        if (obj instanceof Boolean) {
            return f21901s;
        }
        if (obj instanceof Long) {
            return f21903u;
        }
        if (obj instanceof Double) {
            return f21904v;
        }
        throw new AssertionError("invalid tag type: ".concat(String.valueOf(obj.getClass())));
    }

    public static zzabd[] values() {
        return (zzabd[]) f21905w.clone();
    }
}
