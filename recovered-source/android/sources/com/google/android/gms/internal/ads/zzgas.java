package com.google.android.gms.internal.ads;

import androidx.webkit.ProxyConfig;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgas extends zzgag {

    /* JADX INFO: renamed from: s */
    public zzguj f16883s;

    /* JADX INFO: renamed from: t */
    public zzguj f16884t;

    /* JADX INFO: renamed from: u */
    public zzgai f16885u;

    /* JADX INFO: renamed from: v */
    public HttpURLConnection f16886v;

    public zzgas() {
        zzgar zzgarVar = new zzguj() { // from class: com.google.android.gms.internal.ads.zzgar
            @Override // com.google.android.gms.internal.ads.zzguj
            public final /* synthetic */ Object zza() {
                return -1;
            }
        };
        zzgaj zzgajVar = new zzguj() { // from class: com.google.android.gms.internal.ads.zzgaj
            @Override // com.google.android.gms.internal.ads.zzguj
            public final /* synthetic */ Object zza() {
                return -1;
            }
        };
        this.f16883s = zzgarVar;
        this.f16884t = zzgajVar;
        this.f16885u = null;
    }

    /* JADX INFO: renamed from: c */
    public final HttpURLConnection m6834c(zzgai zzgaiVar) throws IOException {
        this.f16883s = new zzgap();
        this.f16884t = new zzgaq();
        this.f16885u = zzgaiVar;
        ((Integer) this.f16884t.zza()).getClass();
        zzgad zzgadVar = zzgah.f16880a;
        zzgai zzgaiVar2 = this.f16885u;
        zzgaiVar2.getClass();
        Set set = zzcjk.f10228x;
        zzcge zzcgeVar = com.google.android.gms.ads.internal.zzt.f3698C.f3717q;
        int iIntValue = ((Integer) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8589j0)).intValue();
        URL url = new URL(((zzcjj) zzgaiVar2).f10227a);
        int i2 = 0;
        while (true) {
            i2++;
            if (i2 > 20) {
                throw new IOException("Too many redirects (20)");
            }
            URLConnection uRLConnectionOpenConnection = url.openConnection();
            uRLConnectionOpenConnection.setConnectTimeout(iIntValue);
            uRLConnectionOpenConnection.setReadTimeout(iIntValue);
            if (!(uRLConnectionOpenConnection instanceof HttpURLConnection)) {
                throw new IOException("Invalid protocol.");
            }
            HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
            com.google.android.gms.ads.internal.util.client.zzl zzlVar = new com.google.android.gms.ads.internal.util.client.zzl(0);
            zzlVar.m3054a(httpURLConnection, null);
            httpURLConnection.setInstanceFollowRedirects(false);
            int responseCode = httpURLConnection.getResponseCode();
            zzlVar.m3056c(httpURLConnection, responseCode);
            if (responseCode / 100 != 3) {
                this.f16886v = httpURLConnection;
                return httpURLConnection;
            }
            String headerField = httpURLConnection.getHeaderField("Location");
            if (headerField == null) {
                throw new IOException("Missing Location header in redirect");
            }
            URL url2 = new URL(url, headerField);
            String protocol = url2.getProtocol();
            if (protocol == null) {
                throw new IOException("Protocol is null");
            }
            if (!protocol.equals(ProxyConfig.MATCH_HTTP) && !protocol.equals(ProxyConfig.MATCH_HTTPS)) {
                throw new IOException("Unsupported scheme: ".concat(protocol));
            }
            String strConcat = "Redirecting to ".concat(headerField);
            int i3 = com.google.android.gms.ads.internal.util.zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3068a(strConcat);
            httpURLConnection.disconnect();
            url = url2;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        HttpURLConnection httpURLConnection = this.f16886v;
        zzgad zzgadVar = zzgah.f16880a;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }
}
