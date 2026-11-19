package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.privacysandbox.ads.adservices.java.topics.TopicsManagerFutures;
import androidx.privacysandbox.ads.adservices.topics.GetTopicsRequest;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes2.dex */
public final class zzely {

    /* JADX INFO: renamed from: a */
    public final Context f14187a;

    public zzely(Context context) {
        this.f14187a = context;
    }

    /* JADX INFO: renamed from: a */
    public final ListenableFuture m6283a(boolean z) {
        try {
            GetTopicsRequest getTopicsRequestBuild = new GetTopicsRequest.Builder().setAdsSdkName("com.google.android.gms.ads").setShouldRecordObservation(z).build();
            TopicsManagerFutures topicsManagerFuturesFrom = TopicsManagerFutures.from(this.f14187a);
            return topicsManagerFuturesFrom != null ? topicsManagerFuturesFrom.getTopicsAsync(getTopicsRequestBuild) : zzhcf.m7368b(new IllegalStateException());
        } catch (Exception e) {
            return zzhcf.m7368b(e);
        }
    }
}
