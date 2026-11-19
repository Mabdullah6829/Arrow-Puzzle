package com.google.android.gms.internal.ads;

import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhab implements FilenameFilter {

    /* JADX INFO: renamed from: a */
    public final Pattern f18420a;

    public zzhab(Pattern pattern) {
        pattern.getClass();
        this.f18420a = pattern;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        return this.f18420a.matcher(str).matches();
    }
}
