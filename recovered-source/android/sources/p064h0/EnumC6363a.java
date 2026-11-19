package p064h0;

import p011H.AbstractC0243G;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: h0.a */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC6363a {

    /* JADX INFO: renamed from: s */
    public static final EnumC6363a f24419s;

    /* JADX INFO: renamed from: t */
    public static final /* synthetic */ EnumC6363a[] f24420t;

    static {
        EnumC6363a enumC6363a = new EnumC6363a("COROUTINE_SUSPENDED", 0);
        f24419s = enumC6363a;
        EnumC6363a[] enumC6363aArr = {enumC6363a, new EnumC6363a("UNDECIDED", 1), new EnumC6363a("RESUMED", 2)};
        f24420t = enumC6363aArr;
        AbstractC0243G.m373k(enumC6363aArr);
    }

    public static EnumC6363a valueOf(String str) {
        return (EnumC6363a) Enum.valueOf(EnumC6363a.class, str);
    }

    public static EnumC6363a[] values() {
        return (EnumC6363a[]) f24420t.clone();
    }
}
