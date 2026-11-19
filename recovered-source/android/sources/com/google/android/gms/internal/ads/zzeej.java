package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.PatternSyntaxException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeej {

    /* JADX INFO: renamed from: a */
    public final Context f13745a;

    /* JADX INFO: renamed from: b */
    public final VersionInfoParcel f13746b;

    /* JADX INFO: renamed from: c */
    public final Executor f13747c;

    /* JADX INFO: renamed from: d */
    public final AtomicReference f13748d = new AtomicReference("");

    public zzeej(Context context, VersionInfoParcel versionInfoParcel, Executor executor) {
        this.f13745a = context;
        this.f13746b = versionInfoParcel;
        this.f13747c = executor;
    }

    /* JADX INFO: renamed from: c */
    public static final String m6188c(String str) {
        String str2 = new String(Base64.decode((String) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8256Of), 10), StandardCharsets.UTF_8);
        String str3 = new String(Base64.decode(str, 0));
        com.google.android.gms.ads.internal.util.zzf zzfVar = com.google.android.gms.ads.internal.util.zzs.f3626l;
        char[] charArray = str3.toCharArray();
        for (int i2 = 0; i2 < charArray.length; i2++) {
            charArray[i2] = (char) (charArray[i2] ^ str2.charAt(i2 % str2.length()));
        }
        return new String(charArray);
    }

    /* JADX INFO: renamed from: a */
    public final String m6189a() {
        zzbio zzbioVar = zzbix.f8188Kf;
        com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
        zzbiv zzbivVar = zzbaVar.f3098c;
        zzbiv zzbivVar2 = zzbaVar.f3098c;
        if (!((Boolean) zzbivVar.m5030a(zzbioVar)).booleanValue() || ((String) zzbivVar2.m5030a(zzbix.f8222Mf)).isEmpty() || ((String) zzbivVar2.m5030a(zzbix.f8239Nf)).isEmpty() || ((String) zzbivVar2.m5030a(zzbix.f8256Of)).isEmpty()) {
            return null;
        }
        String str = (String) this.f13748d.get();
        if (!str.isEmpty()) {
            return str;
        }
        this.f13747c.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeei
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzeej zzeejVar = this.f13744s;
                AtomicReference atomicReference = zzeejVar.f13748d;
                synchronized (atomicReference) {
                    try {
                        if (((String) atomicReference.get()).isEmpty()) {
                            atomicReference.set(zzeejVar.m6190b());
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        });
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final String m6190b() {
        String name;
        VersionInfoParcel versionInfoParcel = this.f13746b;
        String strM6188c = null;
        if (versionInfoParcel.f3399v) {
            name = zzclm.class.getName();
        } else {
            try {
                name = (String) new JSONObject(m6188c((String) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8222Mf))).get(Integer.toString(versionInfoParcel.f3398u));
            } catch (ClassCastException | IllegalArgumentException | NullPointerException | JSONException e) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8205Lf)).booleanValue()) {
                    com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5384d("SdkIE", e);
                }
                name = null;
            }
        }
        if (TextUtils.isEmpty(name)) {
            return "2";
        }
        try {
            strM6188c = m6188c((String) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8239Nf));
        } catch (IllegalArgumentException e2) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8205Lf)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5384d("SdkIE", e2);
            }
        }
        if (TextUtils.isEmpty(strM6188c)) {
            return "3";
        }
        try {
            for (Method method : this.f13745a.getClassLoader().loadClass(name).getDeclaredMethods()) {
                if (method.getName().matches(strM6188c)) {
                    return "1";
                }
            }
            return "0";
        } catch (ClassNotFoundException unused) {
            return "4";
        } catch (NoClassDefFoundError unused2) {
            return "6";
        } catch (SecurityException unused3) {
            return "7";
        } catch (PatternSyntaxException unused4) {
            return "5";
        }
    }
}
