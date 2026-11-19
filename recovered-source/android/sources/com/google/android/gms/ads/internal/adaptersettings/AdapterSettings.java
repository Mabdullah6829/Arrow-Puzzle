package com.google.android.gms.ads.internal.adaptersettings;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzbig;

/* JADX INFO: loaded from: classes.dex */
class AdapterSettings {
    private static volatile AdapterSettings instance;
    private final zzbig adapterSettingsInternal = zzba.f3095e.f3099d;

    private boolean getBoolean(String str, boolean z) {
        zzbig zzbigVar = this.adapterSettingsInternal;
        zzbigVar.getClass();
        return !str.startsWith("adapter:") ? z : zzbigVar.f7978c.optBoolean(str, z);
    }

    private float getFloat(String str, float f2) {
        zzbig zzbigVar = this.adapterSettingsInternal;
        zzbigVar.getClass();
        return !str.startsWith("adapter:") ? f2 : (float) zzbigVar.f7978c.optDouble(str, f2);
    }

    public static AdapterSettings getInstance() {
        if (instance == null) {
            synchronized (AdapterSettings.class) {
                try {
                    if (instance == null) {
                        instance = new AdapterSettings();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return instance;
    }

    private int getInt(String str, int i2) {
        zzbig zzbigVar = this.adapterSettingsInternal;
        zzbigVar.getClass();
        return !str.startsWith("adapter:") ? i2 : zzbigVar.f7978c.optInt(str, i2);
    }

    private long getLong(String str, long j2) {
        zzbig zzbigVar = this.adapterSettingsInternal;
        zzbigVar.getClass();
        return !str.startsWith("adapter:") ? j2 : zzbigVar.f7978c.optLong(str, j2);
    }

    private String getString(String str, String str2) {
        zzbig zzbigVar = this.adapterSettingsInternal;
        zzbigVar.getClass();
        return !str.startsWith("adapter:") ? str2 : zzbigVar.f7978c.optString(str, str2);
    }
}
