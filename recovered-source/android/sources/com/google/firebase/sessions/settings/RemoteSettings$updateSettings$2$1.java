package com.google.firebase.sessions.settings;

import android.util.Log;
import com.google.firebase.sessions.FirebaseSessions;
import kotlin.jvm.internal.AbstractC6452k;
import org.json.JSONException;
import org.json.JSONObject;
import p011H.AbstractC0243G;
import p057d0.C6289k;
import p062g0.InterfaceC6348c;
import p064h0.EnumC6363a;
import p066i0.AbstractC6379i;
import p066i0.InterfaceC6375e;
import p078p0.InterfaceC6502p;

/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6375e(m12158c = "com.google.firebase.sessions.settings.RemoteSettings$updateSettings$2$1", m12159f = "RemoteSettings.kt", m12160l = {126}, m12161m = "invokeSuspend")
public final class RemoteSettings$updateSettings$2$1 extends AbstractC6379i implements InterfaceC6502p {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ RemoteSettings this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoteSettings$updateSettings$2$1(RemoteSettings remoteSettings, InterfaceC6348c interfaceC6348c) {
        super(2, interfaceC6348c);
        this.this$0 = remoteSettings;
    }

    @Override // p066i0.AbstractC6371a
    public final InterfaceC6348c create(Object obj, InterfaceC6348c interfaceC6348c) {
        RemoteSettings$updateSettings$2$1 remoteSettings$updateSettings$2$1 = new RemoteSettings$updateSettings$2$1(this.this$0, interfaceC6348c);
        remoteSettings$updateSettings$2$1.L$0 = obj;
        return remoteSettings$updateSettings$2$1;
    }

    @Override // p066i0.AbstractC6371a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Boolean bool;
        Double d;
        Integer num;
        Integer num2;
        Double d2;
        Boolean bool2;
        EnumC6363a enumC6363a = EnumC6363a.f24419s;
        int i2 = this.label;
        if (i2 == 0) {
            AbstractC0243G.m377o(obj);
            JSONObject jSONObject = (JSONObject) this.L$0;
            Log.d(FirebaseSessions.TAG, "Fetched settings: " + jSONObject);
            Integer num3 = null;
            if (jSONObject.has("app_quality")) {
                Object obj2 = jSONObject.get("app_quality");
                AbstractC6452k.m12179c(obj2, "null cannot be cast to non-null type org.json.JSONObject");
                JSONObject jSONObject2 = (JSONObject) obj2;
                try {
                    bool2 = jSONObject2.has("sessions_enabled") ? (Boolean) jSONObject2.get("sessions_enabled") : null;
                    try {
                        d2 = jSONObject2.has("sampling_rate") ? (Double) jSONObject2.get("sampling_rate") : null;
                        try {
                            num2 = jSONObject2.has("session_timeout_seconds") ? (Integer) jSONObject2.get("session_timeout_seconds") : null;
                            try {
                                if (jSONObject2.has("cache_duration")) {
                                    num3 = (Integer) jSONObject2.get("cache_duration");
                                }
                            } catch (JSONException e) {
                                e = e;
                                new Integer(Log.e(FirebaseSessions.TAG, "Error parsing the configs remotely fetched: ", e));
                            }
                        } catch (JSONException e2) {
                            e = e2;
                            num2 = null;
                        }
                    } catch (JSONException e3) {
                        e = e3;
                        num2 = null;
                        d2 = null;
                    }
                } catch (JSONException e4) {
                    e = e4;
                    num2 = null;
                    d2 = null;
                    bool2 = null;
                }
                num = num2;
                d = d2;
                bool = bool2;
            } else {
                bool = null;
                d = null;
                num = null;
            }
            SettingsCache settingsCache = this.this$0.settingsCache;
            SessionConfigs sessionConfigs = new SessionConfigs(bool, d, num, new Integer(num3 != null ? num3.intValue() : RemoteSettings.Companion.getDefaultCacheDuration()), new Long(this.this$0.timeProvider.currentTime().getSeconds()));
            this.label = 1;
            if (settingsCache.updateConfigs(sessionConfigs, this) == enumC6363a) {
                return enumC6363a;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0243G.m377o(obj);
        }
        return C6289k.f24318a;
    }

    @Override // p078p0.InterfaceC6502p
    public final Object invoke(JSONObject jSONObject, InterfaceC6348c interfaceC6348c) {
        return ((RemoteSettings$updateSettings$2$1) create(jSONObject, interfaceC6348c)).invokeSuspend(C6289k.f24318a);
    }
}
