package com.google.android.gms.internal.ads;

import androidx.browser.trusted.sharing.ShareTarget;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URI;
import java.util.Objects;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class zzges implements CallbackToFutureAdapter.Resolver {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ zzgev f17105s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ String f17106t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ boolean f17107u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ String f17108v;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ byte[] f17109w;

    public /* synthetic */ zzges(zzgev zzgevVar, String str, boolean z, String str2, byte[] bArr) {
        this.f17105s = zzgevVar;
        this.f17106t = str;
        this.f17107u = z;
        this.f17108v = str2;
        this.f17109w = bArr;
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
    public final /* synthetic */ Object attachCompleter(final CallbackToFutureAdapter.Completer completer) {
        final zzgev zzgevVar = this.f17105s;
        final String str = this.f17106t;
        final boolean z = this.f17107u;
        final String str2 = this.f17108v;
        final byte[] bArr = this.f17109w;
        zzgevVar.f17113a.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzger
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                final HttpURLConnection httpURLConnection;
                byte[] byteArray;
                zzgev zzgevVar2 = zzgevVar;
                String str3 = str;
                CallbackToFutureAdapter.Completer completer2 = completer;
                byte[] bArr2 = bArr;
                HttpURLConnection httpURLConnection2 = null;
                try {
                    try {
                        httpURLConnection = (HttpURLConnection) URI.create(str3).toURL().openConnection();
                        try {
                            Objects.requireNonNull(httpURLConnection);
                            completer2.addCancellationListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzget
                                @Override // java.lang.Runnable
                                public final /* synthetic */ void run() {
                                    httpURLConnection.disconnect();
                                }
                            }, zzgevVar2.f17113a);
                            httpURLConnection.setRequestProperty("User-Agent", zzgevVar2.f17114b);
                            int i2 = (int) zzgevVar2.f17115c;
                            httpURLConnection.setConnectTimeout(i2);
                            httpURLConnection.setReadTimeout(i2);
                            if (z) {
                                httpURLConnection.setDoOutput(true);
                                httpURLConnection.setRequestMethod(ShareTarget.METHOD_POST);
                                String str4 = str2;
                                if (str4 != null) {
                                    httpURLConnection.setRequestProperty("Content-Type", str4);
                                }
                                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
                                try {
                                    bufferedOutputStream.write(bArr2);
                                    bufferedOutputStream.close();
                                } catch (Throwable th) {
                                    try {
                                        bufferedOutputStream.close();
                                    } catch (Throwable th2) {
                                        th.addSuppressed(th2);
                                    }
                                    throw th;
                                }
                            }
                            int responseCode = httpURLConnection.getResponseCode();
                            InputStream inputStream = responseCode < 400 ? httpURLConnection.getInputStream() : httpURLConnection.getErrorStream();
                            try {
                                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                try {
                                    if (inputStream == null) {
                                        byteArray = new byte[0];
                                        byteArrayOutputStream.close();
                                    } else {
                                        byte[] bArr3 = new byte[4096];
                                        while (true) {
                                            int i3 = inputStream.read(bArr3);
                                            if (i3 == -1) {
                                                break;
                                            } else {
                                                byteArrayOutputStream.write(bArr3, 0, i3);
                                            }
                                        }
                                        byteArray = byteArrayOutputStream.toByteArray();
                                        byteArrayOutputStream.close();
                                        inputStream.close();
                                    }
                                    completer2.set(new zzgeu(responseCode, byteArray));
                                } catch (Throwable th3) {
                                    try {
                                        byteArrayOutputStream.close();
                                    } catch (Throwable th4) {
                                        th3.addSuppressed(th4);
                                    }
                                    throw th3;
                                }
                            } catch (Throwable th5) {
                                if (inputStream != null) {
                                    try {
                                        inputStream.close();
                                    } catch (Throwable th6) {
                                        th5.addSuppressed(th6);
                                    }
                                }
                                throw th5;
                            }
                        } catch (SocketTimeoutException e) {
                            e = e;
                            httpURLConnection2 = httpURLConnection;
                            String message = e.getMessage();
                            StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 9);
                            sb.append("Timeout: ");
                            sb.append(message);
                            completer2.setException(new TimeoutException(sb.toString()));
                            httpURLConnection = httpURLConnection2;
                        } catch (Throwable th7) {
                            th = th7;
                            httpURLConnection2 = httpURLConnection;
                            completer2.setException(th);
                            httpURLConnection = httpURLConnection2;
                        }
                    } catch (Throwable th8) {
                        if (httpURLConnection2 != null) {
                            httpURLConnection2.disconnect();
                        }
                        throw th8;
                    }
                } catch (SocketTimeoutException e2) {
                    e = e2;
                } catch (Throwable th9) {
                    th = th9;
                }
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
            }
        });
        return "";
    }
}
