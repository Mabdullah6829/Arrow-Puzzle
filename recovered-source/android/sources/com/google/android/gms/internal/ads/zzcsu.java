package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nonagon.devicetier.DeviceTierManager;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcsu implements zzcsb {

    /* JADX INFO: renamed from: a */
    public final DeviceTierManager f11339a;

    public zzcsu(DeviceTierManager deviceTierManager) {
        this.f11339a = deviceTierManager;
    }

    @Override // com.google.android.gms.internal.ads.zzcsb
    /* JADX INFO: renamed from: n */
    public final void mo5815n(JSONObject jSONObject) {
        DeviceTierManager.AvailableProcessorTier availableProcessorTier;
        DeviceTierManager.AvailableMemoryTier availableMemoryTier;
        DeviceTierManager.AdvertisedMemoryTier advertisedMemoryTier = null;
        if (jSONObject.has("AvailableMemoryTier")) {
            int iOptInt = jSONObject.optInt("AvailableMemoryTier", -1);
            DeviceTierManager.AvailableMemoryTier[] availableMemoryTierArrValues = DeviceTierManager.AvailableMemoryTier.values();
            int length = availableMemoryTierArrValues.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    availableMemoryTier = null;
                    break;
                }
                availableMemoryTier = availableMemoryTierArrValues[i2];
                if (availableMemoryTier.f3790s == iOptInt) {
                    break;
                } else {
                    i2++;
                }
            }
            if (availableMemoryTier != null) {
                this.f11339a.f3783d.set(availableMemoryTier);
            }
        }
        if (jSONObject.has("AvailableProcessorTier")) {
            int iOptInt2 = jSONObject.optInt("AvailableProcessorTier", -1);
            DeviceTierManager.AvailableProcessorTier[] availableProcessorTierArrValues = DeviceTierManager.AvailableProcessorTier.values();
            int length2 = availableProcessorTierArrValues.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length2) {
                    availableProcessorTier = null;
                    break;
                }
                availableProcessorTier = availableProcessorTierArrValues[i3];
                if (availableProcessorTier.f3793s == iOptInt2) {
                    break;
                } else {
                    i3++;
                }
            }
            if (availableProcessorTier != null) {
                this.f11339a.f3784e.set(availableProcessorTier);
            }
        }
        if (jSONObject.has("AdvertisedMemoryTier")) {
            int iOptInt3 = jSONObject.optInt("AdvertisedMemoryTier", -1);
            for (DeviceTierManager.AdvertisedMemoryTier advertisedMemoryTier2 : DeviceTierManager.AdvertisedMemoryTier.values()) {
                if (advertisedMemoryTier2.f3787s == iOptInt3) {
                    advertisedMemoryTier = advertisedMemoryTier2;
                    break;
                }
            }
            if (advertisedMemoryTier != null) {
                DeviceTierManager deviceTierManager = this.f11339a;
                synchronized (deviceTierManager) {
                    deviceTierManager.f3782c.set(advertisedMemoryTier);
                    deviceTierManager.f3780a.getSharedPreferences("admob", 0).edit().putInt("advertised_memory_tier", advertisedMemoryTier.f3787s).apply();
                }
            }
        }
    }
}
