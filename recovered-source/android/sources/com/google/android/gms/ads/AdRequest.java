package com.google.android.gms.ads;

import com.google.android.gms.ads.internal.client.zzeh;

/* JADX INFO: loaded from: classes.dex */
public class AdRequest {

    /* JADX INFO: renamed from: a */
    public final zzeh f2945a;

    public static class Builder extends AbstractAdRequestBuilder<Builder> {
        @Override // com.google.android.gms.ads.AbstractAdRequestBuilder
        /* JADX INFO: renamed from: c */
        public final AbstractAdRequestBuilder mo2742c() {
            return this;
        }
    }

    public AdRequest(AbstractAdRequestBuilder abstractAdRequestBuilder) {
        this.f2945a = new zzeh(abstractAdRequestBuilder.f2926a);
    }
}
