package com.google.android.gms.ads.internal;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.RemoteException;
import android.text.TextUtils;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzbh;
import com.google.android.gms.internal.ads.zzfmi;

/* JADX INFO: loaded from: classes.dex */
final class zzo extends WebViewClient {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzs f3683a;

    public zzo(zzs zzsVar) {
        this.f3683a = zzsVar;
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        zzs zzsVar = this.f3683a;
        zzbh zzbhVar = zzsVar.f3696x;
        if (zzbhVar != null) {
            try {
                zzbhVar.mo2822d0(zzfmi.m6535d(1, null, null));
            } catch (RemoteException e) {
                int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
                com.google.android.gms.ads.internal.util.client.zzo.m3076i("#007 Could not call remote method.", e);
            }
        }
        zzbh zzbhVar2 = zzsVar.f3696x;
        if (zzbhVar2 != null) {
            try {
                zzbhVar2.mo2818A(0);
            } catch (RemoteException e2) {
                int i3 = com.google.android.gms.ads.internal.util.zze.f3574b;
                com.google.android.gms.ads.internal.util.client.zzo.m3076i("#007 Could not call remote method.", e2);
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        zzs zzsVar = this.f3683a;
        String strM3272l4 = zzsVar.m3272l4();
        Context context = zzsVar.f3693u;
        int iM3033b = 0;
        if (str.startsWith(strM3272l4)) {
            return false;
        }
        if (str.startsWith("gmsg://noAdLoaded")) {
            zzbh zzbhVar = zzsVar.f3696x;
            if (zzbhVar != null) {
                try {
                    zzbhVar.mo2822d0(zzfmi.m6535d(3, null, null));
                } catch (RemoteException e) {
                    int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
                    com.google.android.gms.ads.internal.util.client.zzo.m3076i("#007 Could not call remote method.", e);
                }
            }
            zzbh zzbhVar2 = zzsVar.f3696x;
            if (zzbhVar2 != null) {
                try {
                    zzbhVar2.mo2818A(3);
                } catch (RemoteException e2) {
                    int i3 = com.google.android.gms.ads.internal.util.zze.f3574b;
                    com.google.android.gms.ads.internal.util.client.zzo.m3076i("#007 Could not call remote method.", e2);
                }
            }
            zzsVar.m3271k4(0);
            return true;
        }
        if (str.startsWith("gmsg://scriptLoadFailed")) {
            zzbh zzbhVar3 = zzsVar.f3696x;
            if (zzbhVar3 != null) {
                try {
                    zzbhVar3.mo2822d0(zzfmi.m6535d(1, null, null));
                } catch (RemoteException e3) {
                    int i4 = com.google.android.gms.ads.internal.util.zze.f3574b;
                    com.google.android.gms.ads.internal.util.client.zzo.m3076i("#007 Could not call remote method.", e3);
                }
            }
            zzbh zzbhVar4 = zzsVar.f3696x;
            if (zzbhVar4 != null) {
                try {
                    zzbhVar4.mo2818A(0);
                } catch (RemoteException e4) {
                    int i5 = com.google.android.gms.ads.internal.util.zze.f3574b;
                    com.google.android.gms.ads.internal.util.client.zzo.m3076i("#007 Could not call remote method.", e4);
                }
            }
            zzsVar.m3271k4(0);
            return true;
        }
        if (str.startsWith("gmsg://adResized")) {
            zzbh zzbhVar5 = zzsVar.f3696x;
            if (zzbhVar5 != null) {
                try {
                    zzbhVar5.mo2820b();
                } catch (RemoteException e5) {
                    int i6 = com.google.android.gms.ads.internal.util.zze.f3574b;
                    com.google.android.gms.ads.internal.util.client.zzo.m3076i("#007 Could not call remote method.", e5);
                }
            }
            String queryParameter = Uri.parse(str).getQueryParameter("height");
            if (!TextUtils.isEmpty(queryParameter)) {
                try {
                    com.google.android.gms.ads.internal.util.client.zzf zzfVar = zzay.f3085g.f3086a;
                    iM3033b = com.google.android.gms.ads.internal.util.client.zzf.m3033b(context, Integer.parseInt(queryParameter));
                } catch (NumberFormatException unused) {
                }
            }
            zzsVar.m3271k4(iM3033b);
            return true;
        }
        if (str.startsWith("gmsg://")) {
            return true;
        }
        zzbh zzbhVar6 = zzsVar.f3696x;
        if (zzbhVar6 != null) {
            try {
                zzbhVar6.zzh();
                zzsVar.f3696x.mo2819a();
            } catch (RemoteException e6) {
                int i7 = com.google.android.gms.ads.internal.util.zze.f3574b;
                com.google.android.gms.ads.internal.util.client.zzo.m3076i("#007 Could not call remote method.", e6);
            }
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        context.startActivity(intent);
        return true;
    }
}
