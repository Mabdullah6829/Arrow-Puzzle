package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class zzbjc {

    /* JADX INFO: renamed from: d */
    public String f8886d;

    /* JADX INFO: renamed from: e */
    public Context f8887e;

    /* JADX INFO: renamed from: f */
    public String f8888f;

    /* JADX INFO: renamed from: h */
    public AtomicBoolean f8890h;

    /* JADX INFO: renamed from: i */
    public File f8891i;

    /* JADX INFO: renamed from: a */
    public final ArrayBlockingQueue f8883a = new ArrayBlockingQueue(100);

    /* JADX INFO: renamed from: b */
    public final LinkedHashMap f8884b = new LinkedHashMap();

    /* JADX INFO: renamed from: c */
    public final HashMap f8885c = new HashMap();

    /* JADX INFO: renamed from: g */
    public final HashSet f8889g = new HashSet(Arrays.asList("noop", "activeViewPingSent", "viewabilityChanged", "visibilityChanged"));

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap m5035a(LinkedHashMap linkedHashMap, Map map) {
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap);
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            String str3 = (String) linkedHashMap2.get(str);
            zzbji zzbjiVar = (zzbji) this.f8885c.get(str);
            if (zzbjiVar == null) {
                zzbjiVar = zzbji.f8892a;
            }
            linkedHashMap2.put(str, zzbjiVar.mo5039a(str3, str2));
        }
        return linkedHashMap2;
    }

    /* JADX INFO: renamed from: b */
    public final void m5036b(LinkedHashMap linkedHashMap, zzbjl zzbjlVar) throws Throwable {
        Uri.Builder builderBuildUpon = Uri.parse(this.f8886d).buildUpon();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            builderBuildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        String string = builderBuildUpon.build().toString();
        if (zzbjlVar != null) {
            String str = zzbjlVar.f8901b;
            String str2 = zzbjlVar.f8900a;
            StringBuilder sb = new StringBuilder(string);
            if (!TextUtils.isEmpty(str2)) {
                sb.append("&it=");
                sb.append(str2);
            }
            if (!TextUtils.isEmpty(str)) {
                sb.append("&blat=");
                sb.append(str);
            }
            string = sb.toString();
        }
        FileOutputStream fileOutputStream = null;
        if (!this.f8890h.get()) {
            com.google.android.gms.ads.internal.util.zzs zzsVar = com.google.android.gms.ads.internal.zzt.f3698C.f3703c;
            Context context = this.f8887e;
            String str3 = this.f8888f;
            com.google.android.gms.ads.internal.util.zzf zzfVar = com.google.android.gms.ads.internal.util.zzs.f3626l;
            new com.google.android.gms.ads.internal.util.zzbt(context, str3, string, null).mo3108b();
            return;
        }
        File file = this.f8891i;
        if (file == null) {
            int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3073f("CsiReporter: File doesn't exist. Cannot write CSI data to file.");
            return;
        }
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file, true);
                try {
                    fileOutputStream2.write(string.getBytes());
                    fileOutputStream2.write(10);
                    try {
                        fileOutputStream2.close();
                    } catch (IOException e) {
                        int i3 = com.google.android.gms.ads.internal.util.zze.f3574b;
                        com.google.android.gms.ads.internal.util.client.zzo.m3074g("CsiReporter: Cannot close file: sdk_csi_data.txt.", e);
                    }
                } catch (IOException e2) {
                    e = e2;
                    fileOutputStream = fileOutputStream2;
                    int i4 = com.google.android.gms.ads.internal.util.zze.f3574b;
                    com.google.android.gms.ads.internal.util.client.zzo.m3074g("CsiReporter: Cannot write to file: sdk_csi_data.txt.", e);
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e3) {
                            com.google.android.gms.ads.internal.util.client.zzo.m3074g("CsiReporter: Cannot close file: sdk_csi_data.txt.", e3);
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e4) {
                            int i5 = com.google.android.gms.ads.internal.util.zze.f3574b;
                            com.google.android.gms.ads.internal.util.client.zzo.m3074g("CsiReporter: Cannot close file: sdk_csi_data.txt.", e4);
                        }
                    }
                    throw th;
                }
            } catch (IOException e5) {
                e = e5;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
