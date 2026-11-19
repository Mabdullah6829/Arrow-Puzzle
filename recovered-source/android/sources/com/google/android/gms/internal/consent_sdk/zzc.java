package com.google.android.gms.internal.consent_sdk;

import android.text.TextUtils;
import android.util.Log;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import org.json.JSONException;
import org.json.JSONObject;
import p011H.AbstractC0271e0;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class zzc implements Runnable {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ String f21607s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ String f21608t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ zzd[] f21609u;

    public /* synthetic */ zzc(String str, String str2, zzd[] zzdVarArr) {
        this.f21607s = str;
        this.f21608t = str2;
        this.f21609u = zzdVarArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final JSONObject jSONObject;
        String str = this.f21607s;
        if (TextUtils.isEmpty(str)) {
            Log.d("UserMessagingPlatform", "Error on action: empty action name");
            return;
        }
        final String lowerCase = str.toLowerCase();
        String str2 = this.f21608t;
        if (TextUtils.isEmpty(str2)) {
            jSONObject = new JSONObject();
        } else {
            try {
                jSONObject = new JSONObject(str2);
            } catch (JSONException unused) {
                Log.d("UserMessagingPlatform", "Action[" + lowerCase + "]: failed to parse args: " + str2);
                return;
            }
        }
        Log.d("UserMessagingPlatform", "Action[" + lowerCase + "]: " + jSONObject.toString());
        int i2 = 0;
        while (true) {
            zzd[] zzdVarArr = this.f21609u;
            if (i2 >= zzdVarArr.length) {
                return;
            }
            final zzd zzdVar = zzdVarArr[i2];
            FutureTask futureTask = new FutureTask(new Callable() { // from class: com.google.android.gms.internal.consent_sdk.zzb
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    String str3 = lowerCase;
                    return Boolean.valueOf(zzdVar.mo9116j(jSONObject, str3));
                }
            });
            zzdVar.zza().execute(futureTask);
            try {
                if (((Boolean) futureTask.get()).booleanValue()) {
                    return;
                } else {
                    i2++;
                }
            } catch (InterruptedException e) {
                Log.d("UserMessagingPlatform", "Thread interrupted for Action[" + lowerCase + "]: ", e);
            } catch (ExecutionException e2) {
                Log.d("UserMessagingPlatform", AbstractC0271e0.m399g("Failed to run Action[", lowerCase, "]: "), e2.getCause());
            }
        }
    }
}
