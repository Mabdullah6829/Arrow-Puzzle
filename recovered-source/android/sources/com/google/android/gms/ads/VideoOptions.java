package com.google.android.gms.ads;

import com.google.android.gms.ads.internal.client.zzfw;

/* JADX INFO: loaded from: classes.dex */
public final class VideoOptions {

    /* JADX INFO: renamed from: a */
    public final boolean f2985a;

    /* JADX INFO: renamed from: b */
    public final boolean f2986b;

    /* JADX INFO: renamed from: c */
    public final boolean f2987c;

    public static final class Builder {

        /* JADX INFO: renamed from: a */
        public boolean f2988a = true;

        /* JADX INFO: renamed from: b */
        public boolean f2989b = false;

        /* JADX INFO: renamed from: c */
        public boolean f2990c = false;
    }

    public /* synthetic */ VideoOptions(Builder builder) {
        this.f2985a = builder.f2988a;
        this.f2986b = builder.f2989b;
        this.f2987c = builder.f2990c;
    }

    public VideoOptions(zzfw zzfwVar) {
        this.f2985a = zzfwVar.f3198s;
        this.f2986b = zzfwVar.f3199t;
        this.f2987c = zzfwVar.f3200u;
    }
}
