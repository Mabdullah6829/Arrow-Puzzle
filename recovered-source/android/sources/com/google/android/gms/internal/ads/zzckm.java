package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import androidx.browser.trusted.sharing.ShareTarget;
import androidx.datastore.preferences.protobuf.AbstractC1456a;
import com.facebook.ads.AdError;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
final class zzckm extends zzhj implements zzik {

    /* JADX INFO: renamed from: v */
    public static final Pattern f10351v = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");

    /* JADX INFO: renamed from: e */
    public final int f10352e;

    /* JADX INFO: renamed from: f */
    public final int f10353f;

    /* JADX INFO: renamed from: g */
    public final String f10354g;

    /* JADX INFO: renamed from: h */
    public final zzij f10355h;

    /* JADX INFO: renamed from: i */
    public zzhv f10356i;

    /* JADX INFO: renamed from: j */
    public HttpURLConnection f10357j;

    /* JADX INFO: renamed from: k */
    public final ArrayDeque f10358k;

    /* JADX INFO: renamed from: l */
    public InputStream f10359l;

    /* JADX INFO: renamed from: m */
    public boolean f10360m;

    /* JADX INFO: renamed from: n */
    public int f10361n;

    /* JADX INFO: renamed from: o */
    public long f10362o;

    /* JADX INFO: renamed from: p */
    public long f10363p;

    /* JADX INFO: renamed from: q */
    public long f10364q;

    /* JADX INFO: renamed from: r */
    public long f10365r;

    /* JADX INFO: renamed from: s */
    public long f10366s;

    /* JADX INFO: renamed from: t */
    public final long f10367t;

    /* JADX INFO: renamed from: u */
    public final long f10368u;

    public zzckm(String str, zzckj zzckjVar, int i2, int i3, long j2, long j3) {
        super(true);
        zzgtr.m7128a(true ^ TextUtils.isEmpty(str));
        this.f10354g = str;
        this.f10355h = new zzij();
        this.f10352e = i2;
        this.f10353f = i3;
        this.f10358k = new ArrayDeque();
        this.f10367t = j2;
        this.f10368u = j3;
        if (zzckjVar != null) {
            mo5493a(zzckjVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzj
    /* JADX INFO: renamed from: b */
    public final int mo4082b(byte[] bArr, int i2, int i3) throws zzig {
        if (i3 == 0) {
            return 0;
        }
        try {
            long j2 = this.f10362o;
            long j3 = this.f10363p;
            if (j2 - j3 == 0) {
                return -1;
            }
            long j4 = this.f10364q + j3;
            long j5 = i3;
            long j6 = this.f10368u;
            long j7 = j4 + j5 + j6;
            long j8 = this.f10366s;
            long j9 = j8 + 1;
            if (j7 > j9) {
                long j10 = this.f10365r;
                if (j8 < j10) {
                    long jMin = Math.min(j10, Math.max(((this.f10367t + j9) - j6) - 1, (j9 + j5) - 1));
                    m5561l(2, j9, jMin);
                    this.f10366s = jMin;
                    j8 = jMin;
                }
            }
            int i4 = this.f10359l.read(bArr, i2, (int) Math.min(j5, ((j8 + 1) - this.f10364q) - this.f10363p));
            if (i4 == -1) {
                throw new EOFException();
            }
            this.f10363p += (long) i4;
            m7470i(i4);
            return i4;
        } catch (IOException e) {
            throw new zzig(e, AdError.SERVER_ERROR_CODE, 2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhr
    /* JADX INFO: renamed from: c */
    public final long mo5494c(zzhv zzhvVar) throws zzig {
        this.f10356i = zzhvVar;
        this.f10363p = 0L;
        long j2 = zzhvVar.f19197c;
        long j3 = zzhvVar.f19198d;
        long jMin = this.f10367t;
        if (j3 != -1) {
            jMin = Math.min(jMin, j3);
        }
        this.f10364q = j2;
        HttpURLConnection httpURLConnectionM5561l = m5561l(1, j2, (jMin + j2) - 1);
        this.f10357j = httpURLConnectionM5561l;
        String headerField = httpURLConnectionM5561l.getHeaderField("Content-Range");
        if (!TextUtils.isEmpty(headerField)) {
            Matcher matcher = f10351v.matcher(headerField);
            if (matcher.find()) {
                try {
                    Long.parseLong(matcher.group(1));
                    long j4 = Long.parseLong(matcher.group(2));
                    long j5 = Long.parseLong(matcher.group(3));
                    if (j3 != -1) {
                        this.f10362o = j3;
                        this.f10365r = Math.max(j4, (this.f10364q + j3) - 1);
                    } else {
                        this.f10362o = j5 - this.f10364q;
                        this.f10365r = j5 - 1;
                    }
                    this.f10366s = j4;
                    this.f10360m = true;
                    m7469h(zzhvVar);
                    return this.f10362o;
                } catch (NumberFormatException unused) {
                    String strM2450q = AbstractC1456a.m2450q(new StringBuilder(String.valueOf(headerField).length() + 27), "Unexpected Content-Range [", headerField, "]");
                    int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
                    com.google.android.gms.ads.internal.util.client.zzo.m3070c(strM2450q);
                }
            }
        }
        throw new zzckk("Invalid content range: ".concat(String.valueOf(headerField)), AdError.SERVER_ERROR_CODE, 1);
    }

    @Override // com.google.android.gms.internal.ads.zzhr
    /* JADX INFO: renamed from: d */
    public final void mo5495d() {
        try {
            InputStream inputStream = this.f10359l;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    throw new zzig(e, AdError.SERVER_ERROR_CODE, 3);
                }
            }
            this.f10359l = null;
            m5562m();
            if (this.f10360m) {
                this.f10360m = false;
                m7471k();
            }
        } catch (Throwable th) {
            this.f10359l = null;
            m5562m();
            if (this.f10360m) {
                this.f10360m = false;
                m7471k();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: l */
    public final HttpURLConnection m5561l(int i2, long j2, long j3) throws zzig {
        String string = this.f10356i.f19195a.toString();
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(string).openConnection();
            httpURLConnection.setConnectTimeout(this.f10352e);
            httpURLConnection.setReadTimeout(this.f10353f);
            for (Map.Entry entry : this.f10355h.m8501a().entrySet()) {
                httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            StringBuilder sb = new StringBuilder(String.valueOf(j2).length() + 7 + String.valueOf(j3).length());
            sb.append("bytes=");
            sb.append(j2);
            sb.append("-");
            sb.append(j3);
            httpURLConnection.setRequestProperty("Range", sb.toString());
            httpURLConnection.setRequestProperty("User-Agent", this.f10354g);
            httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
            httpURLConnection.setRequestMethod(ShareTarget.METHOD_GET);
            httpURLConnection.connect();
            this.f10358k.add(httpURLConnection);
            String string2 = this.f10356i.f19195a.toString();
            try {
                int responseCode = httpURLConnection.getResponseCode();
                this.f10361n = responseCode;
                if (responseCode < 200 || responseCode > 299) {
                    httpURLConnection.getHeaderFields();
                    m5562m();
                    int i3 = this.f10361n;
                    throw new zzckl(AbstractC1456a.m2447n(new StringBuilder(String.valueOf(i3).length() + 15), "Response code: ", i3), AdError.SERVER_ERROR_CODE, i2);
                }
                try {
                    InputStream inputStream = httpURLConnection.getInputStream();
                    if (this.f10359l != null) {
                        inputStream = new SequenceInputStream(this.f10359l, inputStream);
                    }
                    this.f10359l = inputStream;
                    return httpURLConnection;
                } catch (IOException e) {
                    m5562m();
                    throw new zzig(e, AdError.SERVER_ERROR_CODE, i2);
                }
            } catch (IOException e2) {
                m5562m();
                throw new zzig("Unable to connect to ".concat(String.valueOf(string2)), e2, AdError.SERVER_ERROR_CODE, i2);
            }
        } catch (IOException e3) {
            throw new zzig("Unable to connect to ".concat(String.valueOf(string)), e3, AdError.SERVER_ERROR_CODE, i2);
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m5562m() {
        while (true) {
            ArrayDeque arrayDeque = this.f10358k;
            if (arrayDeque.isEmpty()) {
                this.f10357j = null;
                return;
            }
            try {
                ((HttpURLConnection) arrayDeque.remove()).disconnect();
            } catch (Exception e) {
                int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
                com.google.android.gms.ads.internal.util.client.zzo.m3071d("Unexpected error while disconnecting", e);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhr
    public final Uri zzc() {
        HttpURLConnection httpURLConnection = this.f10357j;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // com.google.android.gms.internal.ads.zzhr, com.google.android.gms.internal.ads.zzik
    public final Map zzj() {
        HttpURLConnection httpURLConnection = this.f10357j;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }
}
