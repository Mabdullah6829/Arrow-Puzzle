package com.google.android.gms.ads.formats;

import com.google.android.gms.ads.VideoOptions;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class NativeAdOptions {

    /* JADX INFO: renamed from: a */
    public final boolean f2996a;

    /* JADX INFO: renamed from: b */
    public final int f2997b;

    /* JADX INFO: renamed from: c */
    public final int f2998c;

    /* JADX INFO: renamed from: d */
    public final boolean f2999d;

    /* JADX INFO: renamed from: e */
    public final int f3000e;

    /* JADX INFO: renamed from: f */
    public final VideoOptions f3001f;

    /* JADX INFO: renamed from: g */
    public final boolean f3002g;

    public @interface AdChoicesPlacement {
    }

    public static final class Builder {

        /* JADX INFO: renamed from: e */
        public VideoOptions f3007e;

        /* JADX INFO: renamed from: a */
        public boolean f3003a = false;

        /* JADX INFO: renamed from: b */
        public int f3004b = -1;

        /* JADX INFO: renamed from: c */
        public int f3005c = 0;

        /* JADX INFO: renamed from: d */
        public boolean f3006d = false;

        /* JADX INFO: renamed from: f */
        public int f3008f = 1;

        /* JADX INFO: renamed from: g */
        public boolean f3009g = false;
    }

    public @interface NativeMediaAspectRatio {
    }

    public /* synthetic */ NativeAdOptions(Builder builder) {
        this.f2996a = builder.f3003a;
        this.f2997b = builder.f3004b;
        this.f2998c = builder.f3005c;
        this.f2999d = builder.f3006d;
        this.f3000e = builder.f3008f;
        this.f3001f = builder.f3007e;
        this.f3002g = builder.f3009g;
    }
}
