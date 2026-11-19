package com.google.android.gms.common.util;

import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public class Strings {
    static {
        Pattern.compile("\\$\\{(.*?)\\}");
    }

    private Strings() {
    }

    /* JADX INFO: renamed from: a */
    public static boolean m3656a(String str) {
        return str == null || str.trim().isEmpty();
    }
}
