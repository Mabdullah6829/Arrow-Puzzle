package p067j;

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: j.B */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC6381B {

    /* JADX INFO: renamed from: s */
    public static final EnumC6381B f24450s;

    /* JADX INFO: renamed from: t */
    public static final /* synthetic */ EnumC6381B[] f24451t;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC6381B EF0;

    static {
        EnumC6381B enumC6381B = new EnumC6381B("NOT_SET", 0);
        EnumC6381B enumC6381B2 = new EnumC6381B("EVENT_OVERRIDE", 1);
        f24450s = enumC6381B2;
        f24451t = new EnumC6381B[]{enumC6381B, enumC6381B2};
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(0, enumC6381B);
        sparseArray.put(5, enumC6381B2);
    }

    public static EnumC6381B valueOf(String str) {
        return (EnumC6381B) Enum.valueOf(EnumC6381B.class, str);
    }

    public static EnumC6381B[] values() {
        return (EnumC6381B[]) f24451t.clone();
    }
}
