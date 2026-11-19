package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
final class zzcjg implements Runnable {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ String f10219s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ String f10220t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ String f10221u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ String f10222v;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ zzcjh f10223w;

    public zzcjg(zzcjh zzcjhVar, String str, String str2, String str3, String str4) {
        this.f10219s = str;
        this.f10220t = str2;
        this.f10221u = str3;
        this.f10222v = str4;
        this.f10223w = zzcjhVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:44:0x00a9  */
    @Override // java.lang.Runnable
    public final void run() {
        String str;
        HashMap map = new HashMap();
        map.put(NotificationCompat.CATEGORY_EVENT, "precacheCanceled");
        map.put("src", this.f10219s);
        String str2 = this.f10220t;
        if (!TextUtils.isEmpty(str2)) {
            map.put("cachedSrc", str2);
        }
        String str3 = this.f10221u;
        switch (str3) {
            case "expireFailed":
            case "noCacheDir":
                str = "io";
                break;
            case "badUrl":
            case "downloadTimeout":
                str = "network";
                break;
            case "externalAbort":
            case "sizeExceeded":
                str = "policy";
                break;
            case "contentLengthMissing":
            case "error":
            case "inProgress":
            case "interrupted":
            case "noop":
            case "playerFailed":
            default:
                str = "internal";
                break;
        }
        map.put("type", str);
        map.put("reason", str3);
        String str4 = this.f10222v;
        if (!TextUtils.isEmpty(str4)) {
            map.put("message", str4);
        }
        this.f10223w.m5514q(map);
    }
}
