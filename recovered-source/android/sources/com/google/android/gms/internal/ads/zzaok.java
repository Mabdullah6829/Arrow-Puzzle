package com.google.android.gms.internal.ads;

import java.util.Locale;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
final class zzaok {

    /* JADX INFO: renamed from: a */
    public static final Pattern f6242a = Pattern.compile("\\{([^}]*)\\}");

    /* JADX INFO: renamed from: b */
    public static final Pattern f6243b;

    /* JADX INFO: renamed from: c */
    public static final Pattern f6244c;

    /* JADX INFO: renamed from: d */
    public static final Pattern f6245d;

    static {
        String str = zzfm.f16091a;
        Locale locale = Locale.US;
        f6243b = Pattern.compile(String.format(locale, "\\\\pos\\((%1$s),(%1$s)\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
        f6244c = Pattern.compile(String.format(locale, "\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
        f6245d = Pattern.compile("\\\\an(\\d+)");
    }
}
