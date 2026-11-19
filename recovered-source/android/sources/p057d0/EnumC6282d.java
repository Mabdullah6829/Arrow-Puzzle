package p057d0;

import p011H.AbstractC0243G;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: d0.d */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC6282d {

    /* JADX INFO: renamed from: s */
    public static final /* synthetic */ EnumC6282d[] f24307s;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC6282d EF5;

    static {
        EnumC6282d[] enumC6282dArr = {new EnumC6282d("SYNCHRONIZED", 0), new EnumC6282d("PUBLICATION", 1), new EnumC6282d("NONE", 2)};
        f24307s = enumC6282dArr;
        AbstractC0243G.m373k(enumC6282dArr);
    }

    public static EnumC6282d valueOf(String str) {
        return (EnumC6282d) Enum.valueOf(EnumC6282d.class, str);
    }

    public static EnumC6282d[] values() {
        return (EnumC6282d[]) f24307s.clone();
    }
}
