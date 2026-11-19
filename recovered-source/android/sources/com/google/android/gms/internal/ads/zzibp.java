package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzibp {

    /* JADX INFO: renamed from: d */
    public static final zzibp f19617d = new zzibp("", "", false);

    /* JADX INFO: renamed from: a */
    public final String f19618a;

    /* JADX INFO: renamed from: b */
    public final String f19619b;

    /* JADX INFO: renamed from: c */
    public final boolean f19620c;

    static {
        new zzibp("\n", "  ", true);
    }

    public zzibp(String str, String str2, boolean z) {
        if (!str.matches("[\r\n]*")) {
            throw new IllegalArgumentException("Only combinations of \\n and \\r are allowed in newline.");
        }
        if (!str2.matches("[ \t]*")) {
            throw new IllegalArgumentException("Only combinations of spaces and tabs are allowed in indent.");
        }
        this.f19618a = str;
        this.f19619b = str2;
        this.f19620c = z;
    }
}
