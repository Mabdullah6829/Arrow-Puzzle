package com.google.android.gms.internal.ads;

import android.app.UiModeManager;
import android.view.View;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfwg implements zzfwe {

    /* JADX INFO: renamed from: a */
    public final zzfwh f16700a;

    public zzfwg(zzfwh zzfwhVar) {
        this.f16700a = zzfwhVar;
    }

    /* JADX INFO: renamed from: a */
    public final JSONObject m6739a(View view) {
        JSONObject jSONObjectM6747a = zzfwo.m6747a(0, 0, 0, 0);
        UiModeManager uiModeManager = zzfwn.f16711a;
        zzfva zzfvaVar = zzfva.CTV;
        zzfva zzfvaVar2 = zzfva.OTHER;
        if (uiModeManager != null) {
            int currentModeType = uiModeManager.getCurrentModeType();
            if (currentModeType == 1) {
                zzfvaVar2 = zzfva.MOBILE;
            } else if (currentModeType == 4) {
                zzfvaVar2 = zzfvaVar;
            }
        }
        int i2 = zzfvaVar2 != zzfvaVar ? 2 : zzfwr.f16715a;
        int i3 = i2 - 1;
        if (i2 == 0) {
            throw null;
        }
        try {
            jSONObjectM6747a.put("noOutputDevice", i3 == 0);
            return jSONObjectM6747a;
        } catch (JSONException e) {
            zzfwp.m6752a("Error with setting output device status", e);
            return jSONObjectM6747a;
        }
    }
}
