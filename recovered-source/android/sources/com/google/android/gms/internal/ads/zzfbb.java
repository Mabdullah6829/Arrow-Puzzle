package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.util.Base64;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfbb implements zzfcq {

    /* JADX INFO: renamed from: a */
    public final HashMap f15306a;

    public zzfbb(HashMap map) {
        this.f15306a = map;
    }

    @Override // com.google.android.gms.internal.ads.zzfcq
    /* JADX INFO: renamed from: b */
    public final void mo6399b(Object obj) {
        Bundle bundle = (Bundle) obj;
        HashMap map = this.f15306a;
        if (map.isEmpty()) {
            return;
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8181K8)).booleanValue()) {
            JSONArray jSONArray = new JSONArray();
            for (Map.Entry entry : map.entrySet()) {
                ArrayDeque arrayDeque = (ArrayDeque) entry.getValue();
                if (!arrayDeque.isEmpty()) {
                    zzeaz zzeazVar = (zzeaz) entry.getKey();
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("id", zzeazVar.mo6137a());
                        jSONObject.put("event_type", zzeazVar.mo6138b());
                        JSONArray jSONArray2 = new JSONArray();
                        Iterator it = arrayDeque.iterator();
                        while (it.hasNext()) {
                            jSONArray2.put((Long) it.next());
                        }
                        jSONObject.put("timestamps", jSONArray2);
                        jSONArray.put(jSONObject);
                    } catch (JSONException e) {
                        com.google.android.gms.ads.internal.util.zze.m3151l("Failed putting the on-device storage record.", e);
                    }
                }
            }
            if (jSONArray.length() > 0) {
                bundle.putString("on_device_storage_records", jSONArray.toString());
                return;
            }
            return;
        }
        zzhdn zzhdnVarM7397E = zzhdq.m7397E();
        for (Map.Entry entry2 : map.entrySet()) {
            ArrayDeque arrayDeque2 = (ArrayDeque) entry2.getValue();
            if (!arrayDeque2.isEmpty()) {
                zzeaz zzeazVar2 = (zzeaz) entry2.getKey();
                int iMo6138b = zzeazVar2.mo6138b();
                int i2 = 1;
                if (iMo6138b != 0) {
                    if (iMo6138b != 1) {
                        i2 = 3;
                        if (iMo6138b != 2) {
                            i2 = iMo6138b != 3 ? 0 : 4;
                        }
                    } else {
                        i2 = 2;
                    }
                }
                if (i2 != 0) {
                    zzhdl zzhdlVarM7391D = zzhdm.m7391D();
                    long jMo6137a = zzeazVar2.mo6137a();
                    zzhdlVarM7391D.m8326l();
                    ((zzhdm) zzhdlVarM7391D.f19780t).m7392E(jMo6137a);
                    zzhdlVarM7391D.m8326l();
                    ((zzhdm) zzhdlVarM7391D.f19780t).m7393F(i2);
                    zzhdm zzhdmVar = (zzhdm) zzhdlVarM7391D.m8328o();
                    zzhdo zzhdoVarM7394D = zzhdp.m7394D();
                    zzhdoVarM7394D.m8326l();
                    ((zzhdp) zzhdoVarM7394D.f19780t).m7395E(zzhdmVar);
                    zzhdoVarM7394D.m8326l();
                    ((zzhdp) zzhdoVarM7394D.f19780t).m7396F(arrayDeque2);
                    zzhdnVarM7397E.m8326l();
                    ((zzhdq) zzhdnVarM7397E.f19780t).m7399F((zzhdp) zzhdoVarM7394D.m8328o());
                }
            }
        }
        zzhdq zzhdqVar = (zzhdq) zzhdnVarM7397E.m8328o();
        if (zzhdqVar.m7398D() > 0) {
            bundle.putString("ods", Base64.encodeToString(zzhdqVar.m8099h(), 11));
        }
    }
}
