package p027P0;

import p011H.AbstractC0243G;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: P0.a */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0494a {

    /* JADX INFO: renamed from: s */
    public static final EnumC0494a f1042s;

    /* JADX INFO: renamed from: t */
    public static final /* synthetic */ EnumC0494a[] f1043t;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC0494a EF0;

    static {
        EnumC0494a enumC0494a = new EnumC0494a("NONE", 0);
        EnumC0494a enumC0494a2 = new EnumC0494a("ALL_JSON_OBJECTS", 1);
        EnumC0494a enumC0494a3 = new EnumC0494a("POLYMORPHIC", 2);
        f1042s = enumC0494a3;
        EnumC0494a[] enumC0494aArr = {enumC0494a, enumC0494a2, enumC0494a3};
        f1043t = enumC0494aArr;
        AbstractC0243G.m373k(enumC0494aArr);
    }

    public static EnumC0494a valueOf(String str) {
        return (EnumC0494a) Enum.valueOf(EnumC0494a.class, str);
    }

    public static EnumC0494a[] values() {
        return (EnumC0494a[]) f1043t.clone();
    }
}
