package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.common.util.IOUtils;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeiu implements zzfos {

    /* JADX INFO: renamed from: a */
    public final Context f13993a;

    /* JADX INFO: renamed from: b */
    public final String f13994b;

    /* JADX INFO: renamed from: c */
    public final String f13995c;

    public zzeiu(Context context, String str, String str2) {
        this.f13993a = context;
        this.f13994b = str;
        this.f13995c = str2;
    }

    @Override // com.google.android.gms.internal.ads.zzfos
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final zzeit mo5874b(zzeis zzeisVar) {
        HttpURLConnection httpURLConnection;
        InputStreamReader inputStreamReader;
        BufferedOutputStream bufferedOutputStream;
        zzeiu zzeiuVar = this;
        String str = zzeisVar.f13984a;
        int i2 = zzeisVar.f13985b;
        HashMap map = zzeisVar.f13986c;
        byte[] bArr = zzeisVar.f13987d;
        String str2 = zzeisVar.f13988e;
        com.google.android.gms.ads.internal.zzt.f3698C.f3711k.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        try {
            zzeit zzeitVar = new zzeit();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8508e3)).booleanValue() && com.google.android.gms.ads.internal.client.zzay.f3085g.f3088c) {
                zzeitVar.f13989a = 410;
                return zzeitVar;
            }
            String str3 = zzeiuVar.f13994b;
            StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 13);
            sb.append("SDK version: ");
            sb.append(str3);
            String string = sb.toString();
            int i3 = com.google.android.gms.ads.internal.util.zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3072e(string);
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 39);
            sb2.append("AdRequestServiceImpl: Sending request: ");
            sb2.append(str);
            com.google.android.gms.ads.internal.util.client.zzo.m3068a(sb2.toString());
            URL url = new URL(str);
            HashMap map2 = new HashMap();
            int i4 = 0;
            while (true) {
                httpURLConnection = (HttpURLConnection) url.openConnection();
                String str4 = zzeiuVar.f13995c;
                if (str4 != null) {
                    httpURLConnection.setRequestMethod(str4);
                }
                try {
                    try {
                        com.google.android.gms.ads.internal.zzt.f3698C.f3703c.m3228B(zzeiuVar.f13993a, str3, httpURLConnection, i2);
                        for (Map.Entry entry : map.entrySet()) {
                            httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                        }
                        if (!TextUtils.isEmpty(str2)) {
                            httpURLConnection.setRequestProperty("Content-Type", str2);
                        }
                        com.google.android.gms.ads.internal.util.client.zzl zzlVar = new com.google.android.gms.ads.internal.util.client.zzl(0);
                        try {
                            zzlVar.m3054a(httpURLConnection, bArr);
                        } catch (Throwable th) {
                            com.google.android.gms.ads.internal.util.client.zzo.m3071d("Network request logging failed.", th);
                            com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5385e("HttpRequestFunction.logAdRequest", th);
                        }
                        int length = bArr.length;
                        int i5 = 1;
                        if (length > 0) {
                            httpURLConnection.setDoOutput(true);
                            httpURLConnection.setFixedLengthStreamingMode(length);
                            try {
                                bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
                                try {
                                    bufferedOutputStream.write(bArr);
                                    IOUtils.m3649a(bufferedOutputStream);
                                } catch (Throwable th2) {
                                    th = th2;
                                    IOUtils.m3649a(bufferedOutputStream);
                                    throw th;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                bufferedOutputStream = null;
                            }
                        }
                        int responseCode = httpURLConnection.getResponseCode();
                        Iterator<Map.Entry<String, List<String>>> it = httpURLConnection.getHeaderFields().entrySet().iterator();
                        while (it.hasNext()) {
                            Map.Entry<String, List<String>> next = it.next();
                            int i6 = i5;
                            String key = next.getKey();
                            Iterator<Map.Entry<String, List<String>>> it2 = it;
                            List<String> value = next.getValue();
                            if (map2.containsKey(key)) {
                                ((List) map2.get(key)).addAll(value);
                            } else {
                                map2.put(key, new ArrayList(value));
                                i2 = i2;
                            }
                            it = it2;
                            i5 = i6;
                        }
                        int i7 = i2;
                        int i8 = i5;
                        zzlVar.m3056c(httpURLConnection, responseCode);
                        zzeitVar.f13989a = responseCode;
                        zzeitVar.f13990b = map2;
                        zzeitVar.f13991c = "";
                        if (responseCode >= 200 && responseCode < 300) {
                            try {
                                inputStreamReader = new InputStreamReader(httpURLConnection.getInputStream());
                                try {
                                    com.google.android.gms.ads.internal.util.zzs zzsVar = com.google.android.gms.ads.internal.zzt.f3698C.f3703c;
                                    StringBuilder sb3 = new StringBuilder(8192);
                                    char[] cArr = new char[2048];
                                    while (true) {
                                        int i9 = inputStreamReader.read(cArr);
                                        if (i9 == -1) {
                                            break;
                                        }
                                        sb3.append(cArr, 0, i9);
                                    }
                                    String string2 = sb3.toString();
                                    IOUtils.m3649a(inputStreamReader);
                                    if (com.google.android.gms.ads.internal.util.client.zzl.m3052e() && string2 != null) {
                                        zzlVar.m3057d(string2.getBytes());
                                    }
                                    zzeitVar.f13991c = string2;
                                    if (TextUtils.isEmpty(string2)) {
                                        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8833x6)).booleanValue()) {
                                            throw new zzeel(3);
                                        }
                                    }
                                    com.google.android.gms.ads.internal.zzt.f3698C.f3711k.getClass();
                                    zzeitVar.f13992d = SystemClock.elapsedRealtime() - jElapsedRealtime;
                                    break;
                                } catch (Throwable th4) {
                                    th = th4;
                                    IOUtils.m3649a(inputStreamReader);
                                    throw th;
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                inputStreamReader = null;
                            }
                        } else {
                            if (responseCode < 300 || responseCode >= 400) {
                                StringBuilder sb4 = new StringBuilder(String.valueOf(responseCode).length() + 35);
                                sb4.append("Received error HTTP response code: ");
                                sb4.append(responseCode);
                                com.google.android.gms.ads.internal.util.client.zzo.m3073f(sb4.toString());
                                StringBuilder sb5 = new StringBuilder(String.valueOf(responseCode).length() + 35);
                                sb5.append("Received error HTTP response code: ");
                                sb5.append(responseCode);
                                throw new zzeel(1, sb5.toString());
                            }
                            String headerField = httpURLConnection.getHeaderField("Location");
                            if (TextUtils.isEmpty(headerField)) {
                                com.google.android.gms.ads.internal.util.client.zzo.m3073f("No location header to follow redirect.");
                                throw new zzeel(1, "No location header to follow redirect");
                            }
                            zzbio zzbioVar = zzbix.f8333T8;
                            com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
                            if (((Boolean) zzbaVar.f3098c.m5030a(zzbioVar)).booleanValue()) {
                                try {
                                    url = new URI(headerField).toURL();
                                } catch (URISyntaxException e) {
                                    throw new zzeel(e.getMessage(), e);
                                }
                            } else {
                                url = new URL(headerField);
                            }
                            i4++;
                            if (i4 > ((Integer) zzbaVar.f3098c.m5030a(zzbix.f8545g6)).intValue()) {
                                com.google.android.gms.ads.internal.util.client.zzo.m3073f("Too many redirects.");
                                throw new zzeel(i8, "Too many redirects");
                            }
                            httpURLConnection.disconnect();
                            zzeiuVar = this;
                            i2 = i7;
                        }
                    } catch (Throwable th6) {
                        httpURLConnection.disconnect();
                        throw th6;
                    }
                } catch (zzeel e2) {
                    if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8836x9)).booleanValue()) {
                        throw e2;
                    }
                    com.google.android.gms.ads.internal.zzt.f3698C.f3711k.getClass();
                    zzeitVar.f13992d = SystemClock.elapsedRealtime() - jElapsedRealtime;
                }
            }
            httpURLConnection.disconnect();
            return zzeitVar;
        } catch (IOException e3) {
            String strValueOf = String.valueOf(e3.getMessage());
            int i10 = com.google.android.gms.ads.internal.util.zze.f3574b;
            String strConcat = "Error while connecting to ad server: ".concat(strValueOf);
            com.google.android.gms.ads.internal.util.client.zzo.m3073f(strConcat);
            throw new zzeel(strConcat, e3);
        }
    }
}
