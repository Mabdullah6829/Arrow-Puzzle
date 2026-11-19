package com.google.android.gms.ads.nativead;

import com.google.android.gms.ads.VideoOptions;

/* JADX INFO: loaded from: classes.dex */
public final class NativeAdOptions {

    /* JADX INFO: renamed from: a */
    public final boolean f3758a;

    /* JADX INFO: renamed from: b */
    public final int f3759b;

    /* JADX INFO: renamed from: c */
    public final boolean f3760c;

    /* JADX INFO: renamed from: d */
    public final int f3761d;

    /* JADX INFO: renamed from: e */
    public final VideoOptions f3762e;

    /* JADX INFO: renamed from: f */
    public final boolean f3763f;

    /* JADX INFO: renamed from: g */
    public final boolean f3764g;

    /* JADX INFO: renamed from: h */
    public final int f3765h;

    /* JADX INFO: renamed from: i */
    public final int f3766i;

    public @interface AdChoicesPlacement {
    }

    public static final class Builder {

        /* JADX INFO: renamed from: d */
        public VideoOptions f3770d;

        /* JADX INFO: renamed from: a */
        public boolean f3767a = false;

        /* JADX INFO: renamed from: b */
        public int f3768b = 0;

        /* JADX INFO: renamed from: c */
        public boolean f3769c = false;

        /* JADX INFO: renamed from: e */
        public int f3771e = 1;

        /* JADX INFO: renamed from: f */
        public boolean f3772f = false;

        /* JADX INFO: renamed from: g */
        public boolean f3773g = false;

        /* JADX INFO: renamed from: h */
        public int f3774h = 0;

        /* JADX INFO: renamed from: i */
        public int f3775i = 1;
    }

    public @interface NativeMediaAspectRatio {
    }

    public @interface SwipeGestureDirection {
    }

    public /* synthetic */ NativeAdOptions(Builder builder) {
        this.f3758a = builder.f3767a;
        this.f3759b = builder.f3768b;
        this.f3760c = builder.f3769c;
        this.f3761d = builder.f3771e;
        this.f3762e = builder.f3770d;
        this.f3763f = builder.f3772f;
        this.f3764g = builder.f3773g;
        this.f3765h = builder.f3774h;
        this.f3766i = builder.f3775i;
    }
}
