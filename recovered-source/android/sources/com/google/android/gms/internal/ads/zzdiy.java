package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.admanager.AppEventListener;
import java.util.HashSet;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdiy {

    /* JADX INFO: renamed from: a */
    public final HashSet f12223a = new HashSet();

    /* JADX INFO: renamed from: b */
    public final HashSet f12224b = new HashSet();

    /* JADX INFO: renamed from: c */
    public final HashSet f12225c = new HashSet();

    /* JADX INFO: renamed from: d */
    public final HashSet f12226d = new HashSet();

    /* JADX INFO: renamed from: e */
    public final HashSet f12227e = new HashSet();

    /* JADX INFO: renamed from: f */
    public final HashSet f12228f = new HashSet();

    /* JADX INFO: renamed from: g */
    public final HashSet f12229g = new HashSet();

    /* JADX INFO: renamed from: h */
    public final HashSet f12230h = new HashSet();

    /* JADX INFO: renamed from: i */
    public final HashSet f12231i = new HashSet();

    /* JADX INFO: renamed from: j */
    public final HashSet f12232j = new HashSet();

    /* JADX INFO: renamed from: k */
    public final HashSet f12233k = new HashSet();

    /* JADX INFO: renamed from: l */
    public final HashSet f12234l = new HashSet();

    /* JADX INFO: renamed from: m */
    public final HashSet f12235m = new HashSet();

    /* JADX INFO: renamed from: n */
    public final HashSet f12236n = new HashSet();

    /* JADX INFO: renamed from: o */
    public zzfgm f12237o;

    /* JADX INFO: renamed from: a */
    public final void m5925a(zzddc zzddcVar, Executor executor) {
        this.f12231i.add(new zzdky(zzddcVar, executor));
    }

    /* JADX INFO: renamed from: b */
    public final void m5926b(AppEventListener appEventListener, Executor executor) {
        this.f12233k.add(new zzdky(appEventListener, executor));
    }

    /* JADX INFO: renamed from: c */
    public final void m5927c(zzdlg zzdlgVar, Executor executor) {
        this.f12226d.add(new zzdky(zzdlgVar, executor));
    }

    /* JADX INFO: renamed from: d */
    public final void m5928d(zzdgf zzdgfVar, Executor executor) {
        this.f12224b.add(new zzdky(zzdgfVar, executor));
    }
}
