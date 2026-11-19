package com.google.android.gms.internal.ads;

import androidx.browser.trusted.sharing.ShareTarget;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaum extends zzatz {
    public zzaum() {
        throw null;
    }

    /* JADX INFO: renamed from: b */
    public static ArrayList m4424b(Map map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getKey() != null) {
                Iterator it = ((List) entry.getValue()).iterator();
                while (it.hasNext()) {
                    arrayList.add(new zzatd((String) entry.getKey(), (String) it.next()));
                }
            }
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.zzatz
    /* JADX INFO: renamed from: a */
    public final zzauj mo4407a(zzatl zzatlVar, Map map) throws Throwable {
        String str = zzatlVar.f6893u;
        HashMap map2 = new HashMap();
        map2.putAll(map);
        map2.putAll(zzatlVar.mo3111g());
        URL url = new URL(str);
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setInstanceFollowRedirects(HttpURLConnection.getFollowRedirects());
        int i2 = zzatlVar.f6890D.f6863a;
        httpURLConnection.setConnectTimeout(i2);
        httpURLConnection.setReadTimeout(i2);
        boolean z = false;
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setDoInput(true);
        url.getProtocol();
        try {
            for (String str2 : map2.keySet()) {
                httpURLConnection.setRequestProperty(str2, (String) map2.get(str2));
            }
            if (zzatlVar.f6892t != 0) {
                httpURLConnection.setRequestMethod(ShareTarget.METHOD_POST);
                byte[] bArrMo3112h = zzatlVar.mo3112h();
                if (bArrMo3112h != null) {
                    httpURLConnection.setDoOutput(true);
                    if (!httpURLConnection.getRequestProperties().containsKey("Content-Type")) {
                        httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
                    }
                    DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
                    dataOutputStream.write(bArrMo3112h);
                    dataOutputStream.close();
                }
            } else {
                httpURLConnection.setRequestMethod(ShareTarget.METHOD_GET);
            }
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == -1) {
                throw new IOException("Could not retrieve response code from HttpUrlConnection.");
            }
            if ((responseCode >= 100 && responseCode < 200) || responseCode == 204 || responseCode == 304) {
                zzauj zzaujVar = new zzauj(responseCode, m4424b(httpURLConnection.getHeaderFields()), -1, null);
                httpURLConnection.disconnect();
                return zzaujVar;
            }
            try {
                return new zzauj(responseCode, m4424b(httpURLConnection.getHeaderFields()), httpURLConnection.getContentLength(), new zzauk(httpURLConnection));
            } catch (Throwable th) {
                th = th;
                z = true;
                if (!z) {
                    httpURLConnection.disconnect();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
