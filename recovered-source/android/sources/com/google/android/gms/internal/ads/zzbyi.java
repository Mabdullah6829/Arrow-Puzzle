package com.google.android.gms.internal.ads;

import android.app.DownloadManager;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Environment;

/* JADX INFO: loaded from: classes2.dex */
final class zzbyi implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ String f9531s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ String f9532t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ zzbyk f9533u;

    public zzbyi(zzbyk zzbykVar, String str, String str2) {
        this.f9531s = str;
        this.f9532t = str2;
        this.f9533u = zzbykVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i2) {
        zzbyk zzbykVar = this.f9533u;
        DownloadManager downloadManager = (DownloadManager) zzbykVar.f9535c.getSystemService("download");
        try {
            String str = this.f9531s;
            String str2 = this.f9532t;
            DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
            request.setDestinationInExternalPublicDir(Environment.DIRECTORY_PICTURES, str2);
            com.google.android.gms.ads.internal.util.zzs zzsVar = com.google.android.gms.ads.internal.zzt.f3698C.f3703c;
            request.allowScanningByMediaScanner();
            request.setNotificationVisibility(1);
            downloadManager.enqueue(request);
        } catch (IllegalStateException unused) {
            zzbykVar.m5262b("Could not store picture.");
        }
    }
}
