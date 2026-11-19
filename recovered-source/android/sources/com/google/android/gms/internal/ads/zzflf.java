package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes2.dex */
public final class zzflf {

    /* JADX INFO: renamed from: a */
    public com.google.android.gms.ads.internal.client.zzm f16013a;

    /* JADX INFO: renamed from: b */
    public com.google.android.gms.ads.internal.client.zzr f16014b;

    /* JADX INFO: renamed from: c */
    public String f16015c;

    /* JADX INFO: renamed from: d */
    public com.google.android.gms.ads.internal.client.zzfw f16016d;

    /* JADX INFO: renamed from: e */
    public boolean f16017e;

    /* JADX INFO: renamed from: f */
    public ArrayList f16018f;

    /* JADX INFO: renamed from: g */
    public ArrayList f16019g;

    /* JADX INFO: renamed from: h */
    public zzbma f16020h;

    /* JADX INFO: renamed from: i */
    public com.google.android.gms.ads.internal.client.zzx f16021i;

    /* JADX INFO: renamed from: j */
    public AdManagerAdViewOptions f16022j;

    /* JADX INFO: renamed from: k */
    public PublisherAdViewOptions f16023k;

    /* JADX INFO: renamed from: l */
    public com.google.android.gms.ads.internal.client.zzcl f16024l;

    /* JADX INFO: renamed from: n */
    public zzbsi f16026n;

    /* JADX INFO: renamed from: r */
    public zzetk f16030r;

    /* JADX INFO: renamed from: t */
    public Bundle f16032t;

    /* JADX INFO: renamed from: w */
    public JSONArray f16035w;

    /* JADX INFO: renamed from: x */
    public com.google.android.gms.ads.internal.client.zzcp f16036x;

    /* JADX INFO: renamed from: m */
    public int f16025m = 1;

    /* JADX INFO: renamed from: o */
    public final zzfkt f16027o = new zzfkt();

    /* JADX INFO: renamed from: p */
    public boolean f16028p = false;

    /* JADX INFO: renamed from: q */
    public boolean f16029q = false;

    /* JADX INFO: renamed from: s */
    public boolean f16031s = false;

    /* JADX INFO: renamed from: u */
    public final AtomicLong f16033u = new AtomicLong();

    /* JADX INFO: renamed from: v */
    public boolean f16034v = false;

    /* JADX INFO: renamed from: a */
    public final zzflg m6485a() {
        Preconditions.m3545i(this.f16015c, "ad unit must not be null");
        Preconditions.m3545i(this.f16014b, "ad size must not be null");
        Preconditions.m3545i(this.f16013a, "ad request must not be null");
        return new zzflg(this);
    }
}
