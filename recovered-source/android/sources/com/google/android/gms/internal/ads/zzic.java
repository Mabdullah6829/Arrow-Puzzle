package com.google.android.gms.internal.ads;

import android.net.TrafficStats;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import androidx.browser.trusted.sharing.ShareTarget;
import androidx.datastore.preferences.protobuf.AbstractC1456a;
import androidx.webkit.ProxyConfig;
import com.facebook.ads.AdError;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPInputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class zzic extends zzhj implements zzik {

    /* JADX INFO: renamed from: e */
    public final boolean f19629e;

    /* JADX INFO: renamed from: f */
    public final int f19630f;

    /* JADX INFO: renamed from: g */
    public final int f19631g;

    /* JADX INFO: renamed from: h */
    public final String f19632h;

    /* JADX INFO: renamed from: i */
    public final zzij f19633i;

    /* JADX INFO: renamed from: j */
    public final zzij f19634j;

    /* JADX INFO: renamed from: k */
    public zzhv f19635k;

    /* JADX INFO: renamed from: l */
    public HttpURLConnection f19636l;

    /* JADX INFO: renamed from: m */
    public InputStream f19637m;

    /* JADX INFO: renamed from: n */
    public boolean f19638n;

    /* JADX INFO: renamed from: o */
    public int f19639o;

    /* JADX INFO: renamed from: p */
    public long f19640p;

    /* JADX INFO: renamed from: q */
    public long f19641q;

    public /* synthetic */ zzic(String str, int i2, int i3, boolean z, zzij zzijVar) {
        super(true);
        this.f19632h = str;
        this.f19630f = i2;
        this.f19631g = i3;
        this.f19629e = z;
        this.f19633i = zzijVar;
        this.f19634j = new zzij();
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002b A[Catch: IOException -> 0x001e, TRY_LEAVE, TryCatch #0 {IOException -> 0x001e, blocks: (B:5:0x0004, B:7:0x000d, B:10:0x0017, B:13:0x0020, B:16:0x002b), top: B:20:0x0004 }] */
    @Override // com.google.android.gms.internal.ads.zzj
    /* JADX INFO: renamed from: b */
    public final int mo4082b(byte[] bArr, int i2, int i3) throws zzig {
        int i4;
        if (i3 == 0) {
            return 0;
        }
        try {
            long j2 = this.f19640p;
            if (j2 != -1) {
                long j3 = j2 - this.f19641q;
                if (j3 != 0) {
                    i3 = (int) Math.min(i3, j3);
                    InputStream inputStream = this.f19637m;
                    String str = zzfm.f16091a;
                    i4 = inputStream.read(bArr, i2, i3);
                    if (i4 != -1) {
                        this.f19641q += (long) i4;
                        m7470i(i4);
                        return i4;
                    }
                }
            } else {
                InputStream inputStream2 = this.f19637m;
                String str2 = zzfm.f16091a;
                i4 = inputStream2.read(bArr, i2, i3);
                if (i4 != -1) {
                    this.f19641q += (long) i4;
                    m7470i(i4);
                    return i4;
                }
            }
            return -1;
        } catch (IOException e) {
            String str3 = zzfm.f16091a;
            throw zzig.m8369a(e, 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:125:0x0269  */
    /* JADX WARN: Code duplicated, block: B:59:0x012d  */
    /* JADX WARN: Code duplicated, block: B:61:0x0139  */
    /* JADX WARN: Code duplicated, block: B:64:0x0140 A[Catch: NumberFormatException -> 0x019a, TryCatch #5 {NumberFormatException -> 0x019a, blocks: (B:62:0x013a, B:64:0x0140, B:66:0x014b), top: B:163:0x013a }] */
    /* JADX WARN: Code duplicated, block: B:66:0x014b A[Catch: NumberFormatException -> 0x019a, TRY_LEAVE, TryCatch #5 {NumberFormatException -> 0x019a, blocks: (B:62:0x013a, B:64:0x0140, B:66:0x014b), top: B:163:0x013a }] */
    /* JADX WARN: Code duplicated, block: B:69:0x015c  */
    /* JADX WARN: Code duplicated, block: B:70:0x015e  */
    /* JADX WARN: Code duplicated, block: B:72:0x0162 A[Catch: NumberFormatException -> 0x01a3, TRY_ENTER, TryCatch #1 {NumberFormatException -> 0x01a3, blocks: (B:72:0x0162, B:75:0x019f, B:77:0x01a2), top: B:156:0x013e }] */
    /* JADX WARN: Code duplicated, block: B:74:0x019d  */
    /* JADX WARN: Code duplicated, block: B:76:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:79:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:82:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:83:0x01cd  */
    @Override // com.google.android.gms.internal.ads.zzhr
    /* JADX INFO: renamed from: c */
    public final long mo5494c(zzhv zzhvVar) throws Throwable {
        zzic zzicVar;
        HttpURLConnection httpURLConnectionM8060l;
        boolean z;
        long j2;
        boolean z2;
        Throwable th;
        long j3;
        Matcher matcher;
        String strGroup;
        long j4;
        String strGroup2;
        long j5;
        zzic zzicVar2 = this;
        zzhv zzhvVar2 = zzhvVar;
        zzicVar2.f19635k = zzhvVar2;
        zzicVar2.f19641q = 0L;
        zzicVar2.f19640p = 0L;
        m7468f(zzhvVar);
        try {
            Thread threadCurrentThread = Thread.currentThread();
            TrafficStats.setThreadStatsTag((int) (Build.VERSION.SDK_INT < 36 ? threadCurrentThread.getId() : threadCurrentThread.threadId()));
            Uri uri = zzhvVar2.f19195a;
            long j6 = zzhvVar2.f19197c;
            long j7 = zzhvVar2.f19198d;
            URL url = new URL(uri.toString());
            long j8 = zzhvVar2.f19197c;
            long j9 = zzhvVar2.f19198d;
            boolean z3 = false;
            try {
                if (zzicVar2.f19629e) {
                    int i2 = 0;
                    while (true) {
                        int i3 = i2 + 1;
                        if (i2 > 20) {
                            StringBuilder sb = new StringBuilder(String.valueOf(i3).length() + 20);
                            sb.append("Too many redirects: ");
                            sb.append(i3);
                            throw new zzig(new NoRouteToHostException(sb.toString()), AdError.INTERNAL_ERROR_CODE, 1);
                        }
                        zzicVar = this;
                        HttpURLConnection httpURLConnectionM8060l2 = zzicVar.m8060l(url, j8, j9, z3, false, zzhvVar2.f19196b);
                        int responseCode = httpURLConnectionM8060l2.getResponseCode();
                        String headerField = httpURLConnectionM8060l2.getHeaderField("Location");
                        if (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303 && responseCode != 307 && responseCode != 308) {
                            httpURLConnectionM8060l = httpURLConnectionM8060l2;
                            break;
                        }
                        httpURLConnectionM8060l2.disconnect();
                        url = zzicVar.m8061m(url, headerField);
                        zzhvVar2 = zzhvVar;
                        i2 = i3;
                        z3 = false;
                    }
                } else {
                    httpURLConnectionM8060l = zzicVar2.m8060l(url, j8, j9, false, true, zzhvVar2.f19196b);
                    zzicVar = this;
                }
                zzicVar.f19636l = httpURLConnectionM8060l;
                zzicVar.f19639o = httpURLConnectionM8060l.getResponseCode();
                httpURLConnectionM8060l.getResponseMessage();
                int i4 = zzicVar.f19639o;
                long jMax = -1;
                if (i4 < 200 || i4 > 299) {
                    httpURLConnectionM8060l.getHeaderFields();
                    if (zzicVar.f19639o == 416) {
                        String headerField2 = httpURLConnectionM8060l.getHeaderField("Content-Range");
                        Pattern pattern = zzil.f19954a;
                        if (TextUtils.isEmpty(headerField2)) {
                            z = true;
                            j2 = -1;
                        } else {
                            Matcher matcher2 = zzil.f19955b.matcher(headerField2);
                            if (matcher2.matches()) {
                                z = true;
                                String strGroup3 = matcher2.group(1);
                                strGroup3.getClass();
                                j2 = Long.parseLong(strGroup3);
                            } else {
                                z = true;
                                j2 = -1;
                            }
                        }
                        if (j6 == j2) {
                            zzicVar.f19638n = z;
                            m7469h(zzhvVar);
                            if (r18 != -1) {
                                return r18;
                            }
                            return 0L;
                        }
                    }
                    InputStream errorStream = httpURLConnectionM8060l.getErrorStream();
                    try {
                        if (errorStream != null) {
                            zzgzt.m7284a(errorStream);
                        } else {
                            String str = zzfm.f16091a;
                        }
                    } catch (IOException unused) {
                        String str2 = zzfm.f16091a;
                    }
                    zzicVar.m8062n();
                    throw new zzii(zzicVar.f19639o, zzicVar.f19639o == 416 ? new zzhs() : null);
                }
                httpURLConnectionM8060l.getContentType();
                if (zzicVar.f19639o != 200 || j6 == 0) {
                    j6 = 0;
                }
                boolean zEqualsIgnoreCase = "gzip".equalsIgnoreCase(httpURLConnectionM8060l.getHeaderField("Content-Encoding"));
                if (zEqualsIgnoreCase) {
                    z2 = zEqualsIgnoreCase;
                    zzicVar.f19640p = r18;
                } else if (r18 != -1) {
                    zzicVar.f19640p = j7;
                    z2 = zEqualsIgnoreCase;
                } else {
                    String headerField3 = httpURLConnectionM8060l.getHeaderField("Content-Length");
                    String headerField4 = httpURLConnectionM8060l.getHeaderField("Content-Range");
                    Pattern pattern2 = zzil.f19954a;
                    if (TextUtils.isEmpty(headerField3)) {
                        th = null;
                    } else {
                        try {
                            jMax = Long.parseLong(headerField3);
                            th = null;
                        } catch (NumberFormatException unused2) {
                            th = null;
                            StringBuilder sb2 = new StringBuilder(String.valueOf(headerField3).length() + 28);
                            sb2.append("Unexpected Content-Length [");
                            sb2.append(headerField3);
                            sb2.append("]");
                            zzeh.m6213e("HttpUtil", sb2.toString());
                        }
                        if (TextUtils.isEmpty(headerField4)) {
                            z2 = zEqualsIgnoreCase;
                        } else {
                            matcher = zzil.f19954a.matcher(headerField4);
                            if (matcher.matches()) {
                                try {
                                    strGroup = matcher.group(2);
                                    try {
                                        if (strGroup != null) {
                                            throw th;
                                        }
                                        j4 = Long.parseLong(strGroup);
                                        strGroup2 = matcher.group(1);
                                        if (strGroup2 != null) {
                                            throw th;
                                        }
                                        z2 = zEqualsIgnoreCase;
                                        j5 = (j4 - Long.parseLong(strGroup2)) + 1;
                                        if (jMax < 0) {
                                            jMax = j5;
                                        } else if (jMax != j5) {
                                            StringBuilder sb3 = new StringBuilder(String.valueOf(headerField3).length() + 25 + String.valueOf(headerField4).length() + 1);
                                            sb3.append("Inconsistent headers [");
                                            sb3.append(headerField3);
                                            sb3.append("] [");
                                            sb3.append(headerField4);
                                            sb3.append("]");
                                            zzeh.m6211c("HttpUtil", sb3.toString());
                                            jMax = Math.max(jMax, j5);
                                        }
                                    } catch (NumberFormatException unused3) {
                                        StringBuilder sb4 = new StringBuilder(String.valueOf(headerField4).length() + 27);
                                        sb4.append("Unexpected Content-Range [");
                                        sb4.append(headerField4);
                                        sb4.append("]");
                                        zzeh.m6213e("HttpUtil", sb4.toString());
                                    }
                                } catch (NumberFormatException unused4) {
                                    z2 = zEqualsIgnoreCase;
                                }
                            } else {
                                z2 = zEqualsIgnoreCase;
                            }
                        }
                        if (jMax != jMax) {
                            j3 = jMax - j6;
                        } else {
                            j3 = -1;
                        }
                        zzicVar.f19640p = j3;
                    }
                    if (TextUtils.isEmpty(headerField4)) {
                        matcher = zzil.f19954a.matcher(headerField4);
                        if (matcher.matches()) {
                            strGroup = matcher.group(2);
                            if (strGroup != null) {
                                throw th;
                            }
                            j4 = Long.parseLong(strGroup);
                            strGroup2 = matcher.group(1);
                            if (strGroup2 != null) {
                                throw th;
                            }
                            z2 = zEqualsIgnoreCase;
                            j5 = (j4 - Long.parseLong(strGroup2)) + 1;
                            if (jMax < 0) {
                                jMax = j5;
                            } else if (jMax != j5) {
                                StringBuilder sb5 = new StringBuilder(String.valueOf(headerField3).length() + 25 + String.valueOf(headerField4).length() + 1);
                                sb5.append("Inconsistent headers [");
                                sb5.append(headerField3);
                                sb5.append("] [");
                                sb5.append(headerField4);
                                sb5.append("]");
                                zzeh.m6211c("HttpUtil", sb5.toString());
                                jMax = Math.max(jMax, j5);
                            }
                            StringBuilder sb6 = new StringBuilder(String.valueOf(headerField4).length() + 27);
                            sb6.append("Unexpected Content-Range [");
                            sb6.append(headerField4);
                            sb6.append("]");
                            zzeh.m6213e("HttpUtil", sb6.toString());
                        } else {
                            z2 = zEqualsIgnoreCase;
                        }
                    } else {
                        z2 = zEqualsIgnoreCase;
                    }
                    if (jMax != jMax) {
                        j3 = jMax - j6;
                    } else {
                        j3 = -1;
                    }
                    zzicVar.f19640p = j3;
                }
                try {
                    zzicVar.f19637m = httpURLConnectionM8060l.getInputStream();
                    if (z2) {
                        zzicVar.f19637m = new GZIPInputStream(zzicVar.f19637m);
                    }
                    zzicVar.f19638n = true;
                    m7469h(zzhvVar);
                    if (j6 != 0) {
                        try {
                            byte[] bArr = new byte[4096];
                            while (j6 > 0) {
                                int iMin = (int) Math.min(j6, 4096L);
                                InputStream inputStream = zzicVar.f19637m;
                                String str3 = zzfm.f16091a;
                                int i5 = inputStream.read(bArr, 0, iMin);
                                if (Thread.currentThread().isInterrupted()) {
                                    throw new zzig(new InterruptedIOException(), AdError.SERVER_ERROR_CODE, 1);
                                }
                                if (i5 == -1) {
                                    throw new zzig();
                                }
                                j6 -= (long) i5;
                                zzicVar.m7470i(i5);
                            }
                        } catch (IOException e) {
                            zzicVar.m8062n();
                            if (e instanceof zzig) {
                                throw ((zzig) e);
                            }
                            throw new zzig(e, AdError.SERVER_ERROR_CODE, 1);
                        }
                    }
                    return zzicVar.f19640p;
                } catch (IOException e2) {
                    zzicVar.m8062n();
                    throw new zzig(e2, AdError.SERVER_ERROR_CODE, 1);
                }
            } catch (IOException e3) {
                e = e3;
                zzicVar2 = this;
                zzicVar2.m8062n();
                throw zzig.m8369a(e, 1);
            }
        } catch (IOException e4) {
            e = e4;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhr
    /* JADX INFO: renamed from: d */
    public final void mo5495d() {
        try {
            InputStream inputStream = this.f19637m;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    String str = zzfm.f16091a;
                    throw new zzig(e, AdError.SERVER_ERROR_CODE, 3);
                }
            }
            this.f19637m = null;
            m8062n();
            if (this.f19638n) {
                this.f19638n = false;
                m7471k();
            }
            this.f19636l = null;
            this.f19635k = null;
            TrafficStats.clearThreadStatsTag();
        } catch (Throwable th) {
            this.f19637m = null;
            m8062n();
            if (this.f19638n) {
                this.f19638n = false;
                m7471k();
            }
            this.f19636l = null;
            this.f19635k = null;
            TrafficStats.clearThreadStatsTag();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0070  */
    /* JADX INFO: renamed from: l */
    public final HttpURLConnection m8060l(URL url, long j2, long j3, boolean z, boolean z2, Map map) throws IOException {
        StringBuilder sb;
        String string;
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.f19630f);
        httpURLConnection.setReadTimeout(this.f19631g);
        HashMap map2 = new HashMap();
        map2.putAll(this.f19633i.m8501a());
        map2.putAll(this.f19634j.m8501a());
        map2.putAll(map);
        for (Map.Entry entry : map2.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        if (j2 != 0) {
            sb = new StringBuilder("bytes=");
            sb.append(j2);
            sb.append("-");
            if (j3 != -1) {
                sb.append((j2 + j3) - 1);
            }
            string = sb.toString();
        } else if (j3 == -1) {
            string = null;
        } else {
            j2 = 0;
            sb = new StringBuilder("bytes=");
            sb.append(j2);
            sb.append("-");
            if (j3 != -1) {
                sb.append((j2 + j3) - 1);
            }
            string = sb.toString();
        }
        if (string != null) {
            httpURLConnection.setRequestProperty("Range", string);
        }
        String str = this.f19632h;
        if (str != null) {
            httpURLConnection.setRequestProperty("User-Agent", str);
        }
        httpURLConnection.setRequestProperty("Accept-Encoding", true != z ? "identity" : "gzip");
        httpURLConnection.setInstanceFollowRedirects(z2);
        httpURLConnection.setDoOutput(false);
        int i2 = zzhv.f19194f;
        httpURLConnection.setRequestMethod(ShareTarget.METHOD_GET);
        httpURLConnection.connect();
        return httpURLConnection;
    }

    /* JADX INFO: renamed from: m */
    public final URL m8061m(URL url, String str) throws zzig {
        if (str == null) {
            throw new zzig("Null location redirect", AdError.INTERNAL_ERROR_CODE, 1);
        }
        try {
            URL url2 = new URL(url, str);
            String protocol = url2.getProtocol();
            if (!ProxyConfig.MATCH_HTTPS.equals(protocol) && !ProxyConfig.MATCH_HTTP.equals(protocol)) {
                throw new zzig("Unsupported protocol redirect: ".concat(String.valueOf(protocol)), AdError.INTERNAL_ERROR_CODE, 1);
            }
            if (this.f19629e || protocol.equals(url.getProtocol())) {
                return url2;
            }
            String protocol2 = url.getProtocol();
            StringBuilder sb = new StringBuilder(AbstractC1456a.m2438e(String.valueOf(protocol2).length() + 40, 1, protocol));
            sb.append("Disallowed cross-protocol redirect (");
            sb.append(protocol2);
            sb.append(" to ");
            sb.append(protocol);
            sb.append(")");
            throw new zzig(sb.toString(), AdError.INTERNAL_ERROR_CODE, 1);
        } catch (MalformedURLException e) {
            throw new zzig(e, AdError.INTERNAL_ERROR_CODE, 1);
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m8062n() {
        HttpURLConnection httpURLConnection = this.f19636l;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                zzeh.m6214f("DefaultHttpDataSource", "Unexpected error while disconnecting", e);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhr
    public final Uri zzc() {
        HttpURLConnection httpURLConnection = this.f19636l;
        if (httpURLConnection != null) {
            return Uri.parse(httpURLConnection.getURL().toString());
        }
        zzhv zzhvVar = this.f19635k;
        if (zzhvVar != null) {
            return zzhvVar.f19195a;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzhr, com.google.android.gms.internal.ads.zzik
    public final Map zzj() {
        HttpURLConnection httpURLConnection = this.f19636l;
        return httpURLConnection == null ? zzgyt.f18367y : new zzib(httpURLConnection.getHeaderFields());
    }
}
