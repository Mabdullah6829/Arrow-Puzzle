package p088w0;

import p011H.AbstractC0243G;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: w0.l */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC6557l {

    /* JADX INFO: renamed from: s */
    public static final /* synthetic */ EnumC6557l[] f24775s;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC6557l EF5;

    static {
        EnumC6557l[] enumC6557lArr = {new EnumC6557l("PUBLIC", 0), new EnumC6557l("PROTECTED", 1), new EnumC6557l("INTERNAL", 2), new EnumC6557l("PRIVATE", 3)};
        f24775s = enumC6557lArr;
        AbstractC0243G.m373k(enumC6557lArr);
    }

    public static EnumC6557l valueOf(String str) {
        return (EnumC6557l) Enum.valueOf(EnumC6557l.class, str);
    }

    public static EnumC6557l[] values() {
        return (EnumC6557l[]) f24775s.clone();
    }
}
