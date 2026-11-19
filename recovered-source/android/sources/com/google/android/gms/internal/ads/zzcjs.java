package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import androidx.datastore.preferences.protobuf.AbstractC1456a;
import androidx.webkit.ProxyConfig;
import com.facebook.ads.AdError;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.HttpURLConnection;
import java.net.NoRouteToHostException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes2.dex */
final class zzcjs extends zzhj implements zzik {

    /* JADX INFO: renamed from: t */
    public static final Pattern f10259t = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");

    /* JADX INFO: renamed from: u */
    public static final AtomicReference f10260u = new AtomicReference();

    /* JADX INFO: renamed from: e */
    public final SSLSocketFactory f10261e;

    /* JADX INFO: renamed from: f */
    public final int f10262f;

    /* JADX INFO: renamed from: g */
    public final int f10263g;

    /* JADX INFO: renamed from: h */
    public final String f10264h;

    /* JADX INFO: renamed from: i */
    public final zzij f10265i;

    /* JADX INFO: renamed from: j */
    public HttpURLConnection f10266j;

    /* JADX INFO: renamed from: k */
    public InputStream f10267k;

    /* JADX INFO: renamed from: l */
    public boolean f10268l;

    /* JADX INFO: renamed from: m */
    public int f10269m;

    /* JADX INFO: renamed from: n */
    public long f10270n;

    /* JADX INFO: renamed from: o */
    public long f10271o;

    /* JADX INFO: renamed from: p */
    public long f10272p;

    /* JADX INFO: renamed from: q */
    public long f10273q;

    /* JADX INFO: renamed from: r */
    public int f10274r;

    /* JADX INFO: renamed from: s */
    public final HashSet f10275s;

    public zzcjs(String str, zzckj zzckjVar, int i2, int i3, int i4) {
        super(true);
        this.f10261e = new zzcjr(this);
        this.f10275s = new HashSet();
        zzgtr.m7128a(true ^ TextUtils.isEmpty(str));
        this.f10264h = str;
        this.f10265i = new zzij();
        this.f10262f = i2;
        this.f10263g = i3;
        this.f10274r = i4;
        if (zzckjVar != null) {
            mo5493a(zzckjVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0078 A[Catch: IOException -> 0x001b, TryCatch #0 {IOException -> 0x001b, blocks: (B:2:0x0000, B:23:0x0058, B:25:0x0060, B:28:0x006a, B:29:0x0070, B:31:0x0078, B:34:0x007f, B:35:0x0084, B:36:0x0085, B:5:0x000b, B:7:0x0016, B:10:0x001e, B:12:0x0026, B:15:0x003c, B:16:0x0046, B:17:0x004b, B:18:0x004c, B:19:0x0051, B:20:0x0052), top: B:40:0x0000 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x007f A[Catch: IOException -> 0x001b, TryCatch #0 {IOException -> 0x001b, blocks: (B:2:0x0000, B:23:0x0058, B:25:0x0060, B:28:0x006a, B:29:0x0070, B:31:0x0078, B:34:0x007f, B:35:0x0084, B:36:0x0085, B:5:0x000b, B:7:0x0016, B:10:0x001e, B:12:0x0026, B:15:0x003c, B:16:0x0046, B:17:0x004b, B:18:0x004c, B:19:0x0051, B:20:0x0052), top: B:40:0x0000 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x0085 A[Catch: IOException -> 0x001b, TRY_LEAVE, TryCatch #0 {IOException -> 0x001b, blocks: (B:2:0x0000, B:23:0x0058, B:25:0x0060, B:28:0x006a, B:29:0x0070, B:31:0x0078, B:34:0x007f, B:35:0x0084, B:36:0x0085, B:5:0x000b, B:7:0x0016, B:10:0x001e, B:12:0x0026, B:15:0x003c, B:16:0x0046, B:17:0x004b, B:18:0x004c, B:19:0x0051, B:20:0x0052), top: B:40:0x0000 }] */
    @Override // com.google.android.gms.internal.ads.zzj
    /* JADX INFO: renamed from: b */
    public final int mo4082b(byte[] bArr, int i2, int i3) throws zzig {
        int i4;
        try {
            if (this.f10272p != this.f10270n) {
                AtomicReference atomicReference = f10260u;
                byte[] bArr2 = (byte[]) atomicReference.getAndSet(null);
                if (bArr2 == null) {
                    bArr2 = new byte[4096];
                }
                while (true) {
                    long j2 = this.f10272p;
                    long j3 = this.f10270n;
                    if (j2 == j3) {
                        atomicReference.set(bArr2);
                        break;
                    }
                    int i5 = this.f10267k.read(bArr2, 0, (int) Math.min(j3 - j2, bArr2.length));
                    if (Thread.interrupted()) {
                        throw new InterruptedIOException();
                    }
                    if (i5 == -1) {
                        throw new EOFException();
                    }
                    this.f10272p += (long) i5;
                    m7470i(i5);
                }
            }
            if (i3 == 0) {
                return 0;
            }
            long j4 = this.f10271o;
            if (j4 != -1) {
                long j5 = j4 - this.f10273q;
                if (j5 != 0) {
                    i3 = (int) Math.min(i3, j5);
                    i4 = this.f10267k.read(bArr, i2, i3);
                    if (i4 == -1) {
                        this.f10273q += (long) i4;
                        m7470i(i4);
                        return i4;
                    }
                    if (this.f10271o != -1) {
                        throw new EOFException();
                    }
                }
            } else {
                i4 = this.f10267k.read(bArr, i2, i3);
                if (i4 == -1) {
                    this.f10273q += (long) i4;
                    m7470i(i4);
                    return i4;
                }
                if (this.f10271o != -1) {
                    throw new EOFException();
                }
            }
            return -1;
        } catch (IOException e) {
            throw new zzig(e, AdError.SERVER_ERROR_CODE, 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:115:0x028f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:121:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x0230  */
    /* JADX WARN: Code duplicated, block: B:91:0x0261 A[Catch: IOException -> 0x003d, TryCatch #3 {IOException -> 0x003d, blocks: (B:3:0x000c, B:4:0x001e, B:6:0x0026, B:8:0x0034, B:11:0x0040, B:12:0x0058, B:14:0x005e, B:22:0x0088, B:24:0x00ab, B:26:0x00d1, B:27:0x00d6, B:40:0x010c, B:89:0x0254, B:91:0x0261, B:93:0x0272, B:96:0x027b, B:97:0x0288, B:99:0x028f, B:100:0x0296, B:101:0x0297, B:102:0x02b4), top: B:111:0x000c }] */
    @Override // com.google.android.gms.internal.ads.zzhr
    /* JADX INFO: renamed from: c */
    public final long mo5494c(zzhv zzhvVar) throws zzig {
        long j2;
        int responseCode;
        String headerField;
        String protocol;
        int responseCode2;
        zzii zziiVar;
        long jMax;
        long j3 = 0;
        this.f10273q = 0L;
        this.f10272p = 0L;
        try {
            Uri uri = zzhvVar.f19195a;
            long j4 = zzhvVar.f19197c;
            long j5 = zzhvVar.f19198d;
            URL url = new URL(uri.toString());
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                long j6 = j3;
                if (i2 > 20) {
                    StringBuilder sb = new StringBuilder(String.valueOf(i3).length() + 20);
                    sb.append("Too many redirects: ");
                    sb.append(i3);
                    throw new NoRouteToHostException(sb.toString());
                }
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                if (httpURLConnection instanceof HttpsURLConnection) {
                    ((HttpsURLConnection) httpURLConnection).setSSLSocketFactory(this.f10261e);
                }
                httpURLConnection.setConnectTimeout(this.f10262f);
                httpURLConnection.setReadTimeout(this.f10263g);
                for (Map.Entry entry : this.f10265i.m8501a().entrySet()) {
                    httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
                if (j4 == j6) {
                    if (j5 != -1) {
                        j2 = j6;
                    }
                    httpURLConnection.setRequestProperty("User-Agent", this.f10264h);
                    httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
                    httpURLConnection.setInstanceFollowRedirects(false);
                    httpURLConnection.setDoOutput(false);
                    httpURLConnection.connect();
                    responseCode = httpURLConnection.getResponseCode();
                    if (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303 && responseCode != 307 && responseCode != 308) {
                        this.f10266j = httpURLConnection;
                        try {
                            responseCode2 = httpURLConnection.getResponseCode();
                            this.f10269m = responseCode2;
                            if (responseCode2 >= 200 || responseCode2 > 299) {
                                this.f10266j.getHeaderFields();
                                m5520l();
                                int i4 = this.f10269m;
                                String str = zzfm.f16091a;
                                zziiVar = new zzii(i4, null);
                                if (this.f10269m == 416) {
                                    throw zziiVar;
                                }
                                zziiVar.initCause(new zzhs());
                                throw zziiVar;
                            }
                            if (responseCode2 != 200 || j4 == j6) {
                                j4 = j6;
                            }
                            this.f10270n = j4;
                            if (j5 != -1) {
                                this.f10271o = j5;
                            } else {
                                HttpURLConnection httpURLConnection2 = this.f10266j;
                                String headerField2 = httpURLConnection2.getHeaderField("Content-Length");
                                if (TextUtils.isEmpty(headerField2)) {
                                    jMax = -1;
                                } else {
                                    try {
                                        jMax = Long.parseLong(headerField2);
                                    } catch (NumberFormatException unused) {
                                        String strM2450q = AbstractC1456a.m2450q(new StringBuilder(String.valueOf(headerField2).length() + 28), "Unexpected Content-Length [", headerField2, "]");
                                        int i5 = com.google.android.gms.ads.internal.util.zze.f3574b;
                                        com.google.android.gms.ads.internal.util.client.zzo.m3070c(strM2450q);
                                        jMax = -1;
                                    }
                                }
                                String headerField3 = httpURLConnection2.getHeaderField("Content-Range");
                                if (!TextUtils.isEmpty(headerField3)) {
                                    Matcher matcher = f10259t.matcher(headerField3);
                                    if (matcher.find()) {
                                        try {
                                            long j7 = (Long.parseLong(matcher.group(2)) - Long.parseLong(matcher.group(1))) + 1;
                                            if (jMax < j6) {
                                                jMax = j7;
                                            } else if (jMax != j7) {
                                                StringBuilder sb2 = new StringBuilder(String.valueOf(headerField2).length() + 25 + String.valueOf(headerField3).length() + 1);
                                                sb2.append("Inconsistent headers [");
                                                sb2.append(headerField2);
                                                sb2.append("] [");
                                                sb2.append(headerField3);
                                                sb2.append("]");
                                                String string = sb2.toString();
                                                int i6 = com.google.android.gms.ads.internal.util.zze.f3574b;
                                                com.google.android.gms.ads.internal.util.client.zzo.m3073f(string);
                                                jMax = Math.max(jMax, j7);
                                            }
                                        } catch (NumberFormatException unused2) {
                                            String strM2450q2 = AbstractC1456a.m2450q(new StringBuilder(String.valueOf(headerField3).length() + 27), "Unexpected Content-Range [", headerField3, "]");
                                            int i7 = com.google.android.gms.ads.internal.util.zze.f3574b;
                                            com.google.android.gms.ads.internal.util.client.zzo.m3070c(strM2450q2);
                                        }
                                    }
                                }
                                this.f10271o = jMax != -1 ? jMax - this.f10270n : -1L;
                            }
                            try {
                                this.f10267k = this.f10266j.getInputStream();
                                this.f10268l = true;
                                m7469h(zzhvVar);
                                return this.f10271o;
                            } catch (IOException e) {
                                m5520l();
                                throw new zzig(e, AdError.SERVER_ERROR_CODE, 1);
                            }
                        } catch (IOException e2) {
                            m5520l();
                            throw new zzig("Unable to connect to ".concat(String.valueOf(zzhvVar.f19195a.toString())), e2, AdError.SERVER_ERROR_CODE, 1);
                        }
                    }
                    headerField = httpURLConnection.getHeaderField("Location");
                    httpURLConnection.disconnect();
                    if (headerField != null) {
                        throw new ProtocolException("Null location redirect");
                    }
                    URL url2 = new URL(url, headerField);
                    protocol = url2.getProtocol();
                    if (!ProxyConfig.MATCH_HTTPS.equals(protocol) && !ProxyConfig.MATCH_HTTP.equals(protocol)) {
                        throw new ProtocolException("Unsupported protocol redirect: ".concat(String.valueOf(protocol)));
                    }
                    url = url2;
                    i2 = i3;
                    j3 = j6;
                } else {
                    j2 = j4;
                }
                StringBuilder sb3 = new StringBuilder(String.valueOf(j2).length() + 7);
                sb3.append("bytes=");
                long j8 = j2;
                sb3.append(j8);
                sb3.append("-");
                String string2 = sb3.toString();
                if (j5 != -1) {
                    long j9 = (j8 + j5) - 1;
                    StringBuilder sb4 = new StringBuilder(string2.length() + String.valueOf(j9).length());
                    sb4.append(string2);
                    sb4.append(j9);
                    string2 = sb4.toString();
                }
                httpURLConnection.setRequestProperty("Range", string2);
                httpURLConnection.setRequestProperty("User-Agent", this.f10264h);
                httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
                httpURLConnection.setInstanceFollowRedirects(false);
                httpURLConnection.setDoOutput(false);
                httpURLConnection.connect();
                responseCode = httpURLConnection.getResponseCode();
                if (responseCode != 300) {
                    this.f10266j = httpURLConnection;
                    responseCode2 = httpURLConnection.getResponseCode();
                    this.f10269m = responseCode2;
                    if (responseCode2 >= 200) {
                    }
                    this.f10266j.getHeaderFields();
                    m5520l();
                    int i8 = this.f10269m;
                    String str2 = zzfm.f16091a;
                    zziiVar = new zzii(i8, null);
                    if (this.f10269m == 416) {
                        throw zziiVar;
                    }
                    zziiVar.initCause(new zzhs());
                    throw zziiVar;
                }
                headerField = httpURLConnection.getHeaderField("Location");
                httpURLConnection.disconnect();
                if (headerField != null) {
                    throw new ProtocolException("Null location redirect");
                }
                URL url3 = new URL(url, headerField);
                protocol = url3.getProtocol();
                if (!ProxyConfig.MATCH_HTTPS.equals(protocol)) {
                    throw new ProtocolException("Unsupported protocol redirect: ".concat(String.valueOf(protocol)));
                }
                url = url3;
                i2 = i3;
                j3 = j6;
            }
        } catch (IOException e3) {
            throw new zzig("Unable to connect to ".concat(String.valueOf(zzhvVar.f19195a.toString())), e3, AdError.SERVER_ERROR_CODE, 1);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhr
    /* JADX INFO: renamed from: d */
    public final void mo5495d() {
        HashSet hashSet = this.f10275s;
        try {
            InputStream inputStream = this.f10267k;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    throw new zzig(e, AdError.SERVER_ERROR_CODE, 3);
                }
            }
            this.f10267k = null;
            m5520l();
            if (this.f10268l) {
                this.f10268l = false;
                m7471k();
            }
            hashSet.clear();
        } catch (Throwable th) {
            this.f10267k = null;
            m5520l();
            if (this.f10268l) {
                this.f10268l = false;
                m7471k();
            }
            hashSet.clear();
            throw th;
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m5520l() {
        HttpURLConnection httpURLConnection = this.f10266j;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
                com.google.android.gms.ads.internal.util.client.zzo.m3071d("Unexpected error while disconnecting", e);
            }
            this.f10266j = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhr
    public final Uri zzc() {
        HttpURLConnection httpURLConnection = this.f10266j;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // com.google.android.gms.internal.ads.zzhr, com.google.android.gms.internal.ads.zzik
    public final Map zzj() {
        HttpURLConnection httpURLConnection = this.f10266j;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }
}
