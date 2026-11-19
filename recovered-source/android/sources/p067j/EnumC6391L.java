package p067j;

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: j.L */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC6391L {

    /* JADX INFO: renamed from: s */
    public static final EnumC6391L f24456s;

    /* JADX INFO: renamed from: t */
    public static final /* synthetic */ EnumC6391L[] f24457t;

    static {
        EnumC6391L enumC6391L = new EnumC6391L("DEFAULT", 0);
        f24456s = enumC6391L;
        EnumC6391L enumC6391L2 = new EnumC6391L("UNMETERED_ONLY", 1);
        EnumC6391L enumC6391L3 = new EnumC6391L("UNMETERED_OR_DAILY", 2);
        EnumC6391L enumC6391L4 = new EnumC6391L("FAST_IF_RADIO_AWAKE", 3);
        EnumC6391L enumC6391L5 = new EnumC6391L("NEVER", 4);
        EnumC6391L enumC6391L6 = new EnumC6391L("UNRECOGNIZED", 5);
        f24457t = new EnumC6391L[]{enumC6391L, enumC6391L2, enumC6391L3, enumC6391L4, enumC6391L5, enumC6391L6};
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(0, enumC6391L);
        sparseArray.put(1, enumC6391L2);
        sparseArray.put(2, enumC6391L3);
        sparseArray.put(3, enumC6391L4);
        sparseArray.put(4, enumC6391L5);
        sparseArray.put(-1, enumC6391L6);
    }

    public static EnumC6391L valueOf(String str) {
        return (EnumC6391L) Enum.valueOf(EnumC6391L.class, str);
    }

    public static EnumC6391L[] values() {
        return (EnumC6391L[]) f24457t.clone();
    }
}
