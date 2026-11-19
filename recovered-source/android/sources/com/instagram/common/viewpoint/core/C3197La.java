package com.instagram.common.viewpoint.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.La */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C3197La<T> {
    public boolean A00;
    public boolean A01 = true;
    public final InterfaceC3191LU<T> A02;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.LU != com.facebook.ads.cache.api.ResponseAdapter<T> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.La != com.facebook.ads.cache.config.CacheRequestConfig<T> */
    public C3197La(InterfaceC3191LU<T> interfaceC3191LU) {
        this.A02 = interfaceC3191LU;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.La != com.facebook.ads.cache.config.CacheRequestConfig<T> */
    public final InterfaceC3191LU<T> A00() {
        return this.A02;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.La != com.facebook.ads.cache.config.CacheRequestConfig<T> */
    public final void A01(boolean z) {
        this.A00 = z;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.La != com.facebook.ads.cache.config.CacheRequestConfig<T> */
    public final void A02(boolean z) {
        this.A01 = z;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.La != com.facebook.ads.cache.config.CacheRequestConfig<T> */
    public final boolean A03() {
        return this.A00;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.La != com.facebook.ads.cache.config.CacheRequestConfig<T> */
    public final boolean A04() {
        return this.A01;
    }
}
