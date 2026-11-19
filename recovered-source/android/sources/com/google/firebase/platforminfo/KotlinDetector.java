package com.google.firebase.platforminfo;

import androidx.annotation.Nullable;
import p057d0.C6280b;

/* JADX INFO: loaded from: classes2.dex */
public final class KotlinDetector {
    private KotlinDetector() {
    }

    @Nullable
    public static String detectVersion() {
        try {
            C6280b.f24305t.getClass();
            return "2.1.0";
        } catch (NoClassDefFoundError unused) {
            return null;
        }
    }
}
