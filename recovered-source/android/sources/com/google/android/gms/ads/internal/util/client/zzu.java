package com.google.android.gms.ads.internal.util.client;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzbio;
import com.google.android.gms.internal.ads.zzbix;
import com.google.android.gms.internal.ads.zzcaf;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class zzu implements zze {

    /* JADX INFO: renamed from: a */
    public final Context f3443a;

    /* JADX INFO: renamed from: b */
    public final String f3444b;

    /* JADX INFO: renamed from: c */
    public String f3445c;

    public zzu(Context context, String str) {
        this.f3443a = context;
        this.f3444b = str;
    }

    /* JADX INFO: renamed from: a */
    public final zzt m3081a(HashMap map, String str) {
        zzt zztVar = zzt.f3440u;
        zzt zztVar2 = zzt.f3439t;
        if (str != null) {
            zzbio zzbioVar = zzbix.f8538g;
            zzba zzbaVar = zzba.f3095e;
            if (!((Boolean) zzbaVar.f3098c.m5030a(zzbioVar)).booleanValue() || !str.isEmpty()) {
                if (!((Boolean) zzbaVar.f3098c.m5030a(zzbix.f8508e3)).booleanValue() || !zzay.f3085g.f3088c) {
                    try {
                        StringBuilder sb = new StringBuilder(str.length() + 13);
                        sb.append("Pinging URL: ");
                        sb.append(str);
                        zzo.m3068a(sb.toString());
                        HttpURLConnection httpURLConnection = (HttpURLConnection) m3082b(str).openConnection();
                        try {
                            zzf zzfVar = zzay.f3085g.f3086a;
                            String str2 = this.f3444b;
                            httpURLConnection.setConnectTimeout(60000);
                            httpURLConnection.setInstanceFollowRedirects(true);
                            httpURLConnection.setReadTimeout(60000);
                            if (str2 != null) {
                                httpURLConnection.setRequestProperty("User-Agent", str2);
                            }
                            httpURLConnection.setUseCaches(false);
                            if (map != null) {
                                for (Map.Entry entry : map.entrySet()) {
                                    httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                                }
                            }
                            zzl zzlVar = new zzl(0);
                            zzlVar.m3054a(httpURLConnection, null);
                            int responseCode = httpURLConnection.getResponseCode();
                            zzlVar.m3056c(httpURLConnection, responseCode);
                            if (responseCode < 200 || responseCode >= 300) {
                                StringBuilder sb2 = new StringBuilder(String.valueOf(responseCode).length() + 54 + str.length());
                                sb2.append("Received non-success response code ");
                                sb2.append(responseCode);
                                sb2.append(" from pinging URL: ");
                                sb2.append(str);
                                zzo.m3073f(sb2.toString());
                                if (responseCode == 502) {
                                    zztVar2 = zztVar;
                                }
                            } else {
                                if (((Boolean) zzba.f3095e.f3098c.m5030a(zzbix.f8365V8)).booleanValue()) {
                                    this.f3445c = httpURLConnection.getHeaderField("X-Afma-Ad-Event-Value");
                                }
                                zztVar2 = zzt.f3438s;
                            }
                            return zztVar2;
                        } finally {
                            httpURLConnection.disconnect();
                        }
                    } catch (MalformedURLException e) {
                        e = e;
                        zztVar = zztVar2;
                        m3083c(str, e);
                        return zztVar;
                    } catch (IOException e2) {
                        e = e2;
                        String message = e.getMessage();
                        StringBuilder sb3 = new StringBuilder(String.valueOf(message).length() + str.length() + 27);
                        sb3.append("Error while pinging URL: ");
                        sb3.append(str);
                        sb3.append(". ");
                        sb3.append(message);
                        zzo.m3073f(sb3.toString());
                        return zztVar;
                    } catch (IndexOutOfBoundsException e3) {
                        e = e3;
                        zztVar = zztVar2;
                        m3083c(str, e);
                        return zztVar;
                    } catch (RuntimeException e4) {
                        e = e4;
                        String message2 = e.getMessage();
                        StringBuilder sb4 = new StringBuilder(String.valueOf(message2).length() + str.length() + 27);
                        sb4.append("Error while pinging URL: ");
                        sb4.append(str);
                        sb4.append(". ");
                        sb4.append(message2);
                        zzo.m3073f(sb4.toString());
                        return zztVar;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
        return zztVar2;
    }

    /* JADX INFO: renamed from: b */
    public final URL m3082b(String str) {
        URL url = null;
        try {
            url = new URI(str).toURL();
        } catch (IllegalArgumentException e) {
            e = e;
            m3083c(str, e);
        } catch (MalformedURLException e2) {
            e = e2;
            m3083c(str, e);
        } catch (URISyntaxException e3) {
            m3083c(str, e3);
            if (((Boolean) zzba.f3095e.f3098c.m5030a(zzbix.f8521f)).booleanValue()) {
                try {
                    zzo.m3068a("Attempting to parse components, encode, and reconstruct URI.");
                    URL url2 = new URL(str);
                    URI uri = new URI(url2.getProtocol(), url2.getUserInfo(), url2.getHost(), url2.getPort(), url2.getPath(), url2.getQuery(), url2.getRef());
                    url = uri.toURL();
                    String string = uri.toString();
                    StringBuilder sb = new StringBuilder(str.length() + 114 + string.length());
                    sb.append("Successfully constructed URL after component encoding via new URI(parts).toURL() for original: \"");
                    sb.append(str);
                    sb.append("\" -> encoded URI: ");
                    sb.append(string);
                    zzo.m3068a(sb.toString());
                } catch (IllegalArgumentException | MalformedURLException | URISyntaxException e4) {
                    m3083c(str, e4);
                }
            }
        }
        if (url != null) {
            return url;
        }
        StringBuilder sb2 = new StringBuilder(str.length() + 47);
        sb2.append("Falling back to direct new URL(\"");
        sb2.append(str);
        sb2.append("\") constructor.");
        zzo.m3068a(sb2.toString());
        return new URL(str);
    }

    /* JADX INFO: renamed from: c */
    public final void m3083c(String str, Exception exc) {
        String message = exc.getMessage();
        StringBuilder sb = new StringBuilder(str.length() + 32 + String.valueOf(message).length());
        sb.append("Error while parsing ping URL: ");
        sb.append(str);
        sb.append(". ");
        sb.append(message);
        zzo.m3073f(sb.toString());
        zzcaf.m5286c(this.f3443a).mo5292b(exc, "HttpUrlPinger.pingUrl", ((Integer) zzba.f3095e.f3098c.m5030a(zzbix.f8587ie)).intValue() / 100.0f);
    }

    @Override // com.google.android.gms.ads.internal.util.client.zze
    public final zzt zza(String str) {
        return m3081a(null, str);
    }
}
