package com.google.android.gms.ads;

import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzdx;
import com.google.android.gms.ads.internal.client.zzv;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.internal.ads.zzbix;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class ResponseInfo {

    /* JADX INFO: renamed from: a */
    public final zzdx f2979a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f2980b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public final AdapterResponseInfo f2981c;

    public ResponseInfo(zzdx zzdxVar) {
        this.f2979a = zzdxVar;
        if (zzdxVar != null) {
            try {
                List<zzv> listMo2919c = zzdxVar.mo2919c();
                if (listMo2919c != null) {
                    for (zzv zzvVar : listMo2919c) {
                        AdapterResponseInfo adapterResponseInfo = zzvVar != null ? new AdapterResponseInfo(zzvVar) : null;
                        if (adapterResponseInfo != null) {
                            this.f2980b.add(adapterResponseInfo);
                        }
                    }
                }
            } catch (RemoteException e) {
                zzo.m3071d("Could not forward getAdapterResponseInfo to ResponseInfo.", e);
            }
        }
        zzdx zzdxVar2 = this.f2979a;
        if (zzdxVar2 == null) {
            return;
        }
        try {
            zzv zzvVarZzh = zzdxVar2.zzh();
            if (zzvVarZzh != null) {
                this.f2981c = new AdapterResponseInfo(zzvVarZzh);
            }
        } catch (RemoteException e2) {
            zzo.m3071d("Could not forward getLoadedAdapterResponse to ResponseInfo.", e2);
        }
    }

    /* JADX INFO: renamed from: a */
    public final JSONObject m2759a() throws JSONException {
        String strMo2918b;
        Bundle bundleZzi;
        JSONObject jSONObject = new JSONObject();
        String strMo2917a = null;
        zzdx zzdxVar = this.f2979a;
        if (zzdxVar != null) {
            try {
                strMo2918b = zzdxVar.mo2918b();
            } catch (RemoteException e) {
                zzo.m3071d("Could not forward getResponseId to ResponseInfo.", e);
                strMo2918b = null;
            }
        } else {
            strMo2918b = null;
        }
        if (strMo2918b == null) {
            jSONObject.put("Response ID", "null");
        } else {
            jSONObject.put("Response ID", strMo2918b);
        }
        if (zzdxVar != null) {
            try {
                strMo2917a = zzdxVar.mo2917a();
            } catch (RemoteException e2) {
                zzo.m3071d("Could not forward getMediationAdapterClassName to ResponseInfo.", e2);
            }
        }
        if (strMo2917a == null) {
            jSONObject.put("Mediation Adapter Class Name", "null");
        } else {
            jSONObject.put("Mediation Adapter Class Name", strMo2917a);
        }
        JSONArray jSONArray = new JSONArray();
        ArrayList arrayList = this.f2980b;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            jSONArray.put(((AdapterResponseInfo) obj).m2752a());
        }
        jSONObject.put("Adapter Responses", jSONArray);
        AdapterResponseInfo adapterResponseInfo = this.f2981c;
        if (adapterResponseInfo != null) {
            jSONObject.put("Loaded Adapter Response", adapterResponseInfo.m2752a());
        }
        if (zzdxVar != null) {
            try {
                bundleZzi = zzdxVar.zzi();
                if (bundleZzi != null) {
                    if (((Boolean) zzba.f3095e.f3098c.m5030a(zzbix.f8792v)).booleanValue()) {
                        bundleZzi.keySet();
                    }
                }
            } catch (BadParcelableException | RemoteException | IllegalArgumentException e3) {
                zzo.m3071d("Could not forward getResponseExtras to ResponseInfo.", e3);
                bundleZzi = new Bundle();
            }
        } else {
            bundleZzi = new Bundle();
        }
        if (bundleZzi != null) {
            jSONObject.put("Response Extras", zzay.f3085g.f3086a.m3049n(bundleZzi));
        }
        return jSONObject;
    }

    public final String toString() {
        try {
            return m2759a().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }
}
