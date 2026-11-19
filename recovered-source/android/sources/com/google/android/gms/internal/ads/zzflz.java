package com.google.android.gms.internal.ads;

import androidx.annotation.VisibleForTesting;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzflz {

    /* JADX INFO: renamed from: a */
    public final Pattern f16090a;

    @VisibleForTesting
    public zzflz() {
        Pattern patternCompile;
        try {
            patternCompile = Pattern.compile((String) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8197L7));
        } catch (PatternSyntaxException unused) {
            patternCompile = null;
        }
        this.f16090a = patternCompile;
    }
}
