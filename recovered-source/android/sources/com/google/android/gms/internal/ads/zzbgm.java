package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.appopen.AppOpenAd;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p061g.C6343h;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbgm extends AppOpenAd {

    /* JADX INFO: renamed from: a */
    public final zzbgq f7828a;

    /* JADX INFO: renamed from: b */
    public final zzbgn f7829b = new zzbgn();

    public zzbgm(zzbgq zzbgqVar, String str) {
        new AtomicLong();
        this.f7828a = zzbgqVar;
        new AtomicReference(str);
    }

    @Override // com.google.android.gms.ads.appopen.AppOpenAd
    /* JADX INFO: renamed from: a */
    public final ResponseInfo mo2766a() {
        com.google.android.gms.ads.internal.client.zzdx zzdxVarMo4878c;
        try {
            zzdxVarMo4878c = this.f7828a.mo4878c();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.m3076i("#007 Could not call remote method.", e);
            zzdxVarMo4878c = null;
        }
        return new ResponseInfo(zzdxVarMo4878c);
    }

    @Override // com.google.android.gms.ads.appopen.AppOpenAd
    /* JADX INFO: renamed from: c */
    public final void mo2767c(C6343h c6343h) {
        this.f7829b.f7830s = c6343h;
    }

    @Override // com.google.android.gms.ads.appopen.AppOpenAd
    /* JADX INFO: renamed from: d */
    public final void mo2768d(Activity activity) {
        try {
            this.f7828a.mo4879i4(new ObjectWrapper(activity), this.f7829b);
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.m3076i("#007 Could not call remote method.", e);
        }
    }
}
