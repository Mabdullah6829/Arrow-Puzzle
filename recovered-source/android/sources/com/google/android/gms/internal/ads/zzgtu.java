package com.google.android.gms.internal.ads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
final class zzgtu implements zzgts {

    /* JADX INFO: renamed from: s */
    public static final zzgtu f18181s;

    /* JADX INFO: renamed from: t */
    public static final /* synthetic */ zzgtu[] f18182t;

    static {
        zzgtu zzgtuVar = new zzgtu("ALWAYS_TRUE", 0);
        f18181s = zzgtuVar;
        f18182t = new zzgtu[]{zzgtuVar, new zzgtu("ALWAYS_FALSE", 1), new zzgtu("IS_NULL", 2), new zzgtu("NOT_NULL", 3)};
    }

    public static zzgtu[] values() {
        return (zzgtu[]) f18182t.clone();
    }

    @Override // com.google.android.gms.internal.ads.zzgts
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean mo3897b(Object obj) {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return true;
        }
        if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return obj != null;
                }
                throw null;
            }
            if (obj == null) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.Enum
    public final /* synthetic */ String toString() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return "Predicates.alwaysTrue()";
        }
        if (iOrdinal == 1) {
            return "Predicates.alwaysFalse()";
        }
        if (iOrdinal != 2) {
            return iOrdinal != 3 ? super.toString() : "Predicates.notNull()";
        }
        return "Predicates.isNull()";
    }
}
