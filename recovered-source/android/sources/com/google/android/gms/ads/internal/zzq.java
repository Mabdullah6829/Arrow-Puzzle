package com.google.android.gms.ads.internal;

import android.net.Uri;
import android.os.AsyncTask;
import android.webkit.WebView;
import androidx.datastore.preferences.protobuf.AbstractC1456a;
import com.google.android.gms.internal.ads.zzbkj;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
final class zzq extends AsyncTask {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzs f3684a;

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        zzs zzsVar = this.f3684a;
        zzsVar.getClass();
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("https://").appendEncodedPath((String) zzbkj.f8979d.m5057c());
        zzr zzrVar = zzsVar.f3694v;
        String str = zzrVar.f3688d;
        if (str != null) {
            builder.appendQueryParameter("query", str);
        }
        builder.appendQueryParameter("pubId", zzrVar.f3686b);
        builder.appendQueryParameter("mappver", zzrVar.f3690f);
        TreeMap treeMap = zzrVar.f3687c;
        for (String str2 : treeMap.keySet()) {
            builder.appendQueryParameter(str2, (String) treeMap.get(str2));
        }
        Uri uriBuild = builder.build();
        String strM3272l4 = zzsVar.m3272l4();
        String encodedQuery = uriBuild.getEncodedQuery();
        return AbstractC1456a.m2450q(new StringBuilder(strM3272l4.length() + 1 + String.valueOf(encodedQuery).length()), strM3272l4, "#", encodedQuery);
    }

    @Override // android.os.AsyncTask
    public final /* synthetic */ void onPostExecute(Object obj) {
        WebView webView = this.f3684a.f3695w;
        String str = (String) obj;
        if (webView == null || str == null) {
            return;
        }
        webView.loadUrl(str);
    }
}
