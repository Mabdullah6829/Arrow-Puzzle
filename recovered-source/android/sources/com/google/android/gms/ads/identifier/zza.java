package com.google.android.gms.ads.identifier;

import android.net.Uri;
import android.util.Log;
import com.google.android.gms.internal.ads_identifier.zzh;
import com.google.android.gms.internal.ads_identifier.zzi;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
final class zza extends Thread {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ HashMap f3023s;

    public zza(HashMap map) {
        this.f3023s = map;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        HashMap map = this.f3023s;
        Uri.Builder builderBuildUpon = Uri.parse("https://pagead2.googlesyndication.com/pagead/gen_204?id=gmob-apps").buildUpon();
        for (String str : map.keySet()) {
            builderBuildUpon.appendQueryParameter(str, (String) map.get(str));
        }
        String string = builderBuildUpon.build().toString();
        try {
            try {
                zzh zzhVar = zzi.f21528a;
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(string).openConnection();
                try {
                    int responseCode = httpURLConnection.getResponseCode();
                    if (responseCode < 200 || responseCode >= 300) {
                        StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 65);
                        sb.append("Received non-success response code ");
                        sb.append(responseCode);
                        sb.append(" from pinging URL: ");
                        sb.append(string);
                        Log.w("HttpUrlPinger", sb.toString());
                    }
                } finally {
                    httpURLConnection.disconnect();
                }
            } catch (IOException e) {
                e = e;
                String message = e.getMessage();
                StringBuilder sb2 = new StringBuilder(String.valueOf(string).length() + 27 + String.valueOf(message).length());
                sb2.append("Error while pinging URL: ");
                sb2.append(string);
                sb2.append(". ");
                sb2.append(message);
                Log.w("HttpUrlPinger", sb2.toString(), e);
                zzh zzhVar2 = zzi.f21528a;
            } catch (IndexOutOfBoundsException e2) {
                String message2 = e2.getMessage();
                StringBuilder sb3 = new StringBuilder(String.valueOf(string).length() + 32 + String.valueOf(message2).length());
                sb3.append("Error while parsing ping URL: ");
                sb3.append(string);
                sb3.append(". ");
                sb3.append(message2);
                Log.w("HttpUrlPinger", sb3.toString(), e2);
                zzh zzhVar3 = zzi.f21528a;
            } catch (RuntimeException e3) {
                e = e3;
                String message3 = e.getMessage();
                StringBuilder sb4 = new StringBuilder(String.valueOf(string).length() + 27 + String.valueOf(message3).length());
                sb4.append("Error while pinging URL: ");
                sb4.append(string);
                sb4.append(". ");
                sb4.append(message3);
                Log.w("HttpUrlPinger", sb4.toString(), e);
                zzh zzhVar4 = zzi.f21528a;
            }
        } catch (Throwable th) {
            zzh zzhVar5 = zzi.f21528a;
            throw th;
        }
    }
}
