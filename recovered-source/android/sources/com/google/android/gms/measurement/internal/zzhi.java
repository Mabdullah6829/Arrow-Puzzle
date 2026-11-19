package com.google.android.gms.measurement.internal;

import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
import androidx.datastore.preferences.protobuf.AbstractC1456a;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.firebase.messaging.Constants;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzhi implements Runnable {
    final /* synthetic */ com.google.android.gms.internal.measurement.zzbs zza;
    final /* synthetic */ ServiceConnection zzb;
    final /* synthetic */ zzhj zzc;

    public zzhi(zzhj zzhjVar, com.google.android.gms.internal.measurement.zzbs zzbsVar, ServiceConnection serviceConnection) {
        this.zza = zzbsVar;
        this.zzb = serviceConnection;
        Objects.requireNonNull(zzhjVar);
        this.zzc = zzhjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bundle bundleMo9822O;
        zzhj zzhjVar = this.zzc;
        zzhk zzhkVar = zzhjVar.zza;
        zzic zzicVar = zzhkVar.zza;
        zzicVar.zzaX().zzg();
        Bundle bundle = new Bundle();
        String strZza = zzhjVar.zza();
        bundle.putString("package_name", strZza);
        try {
            bundleMo9822O = this.zza.mo9822O(bundle);
            if (bundleMo9822O == null) {
                zzicVar.zzaW().zzb().zza("Install Referrer Service returned a null response");
                bundleMo9822O = null;
            }
        } catch (Exception e) {
            zzhkVar.zza.zzaW().zzb().zzb("Exception occurred while retrieving the Install Referrer", e.getMessage());
        }
        zzic zzicVar2 = zzhkVar.zza;
        zzicVar2.zzaX().zzg();
        zzic.zzL();
        if (bundleMo9822O != null) {
            long j2 = bundleMo9822O.getLong("install_begin_timestamp_seconds", 0L) * 1000;
            if (j2 == 0) {
                AbstractC1456a.m2459z(zzicVar2, "Service response is missing Install Referrer install timestamp");
            } else {
                String string = bundleMo9822O.getString("install_referrer");
                if (string == null || string.isEmpty()) {
                    AbstractC1456a.m2452s(zzicVar2, "No referrer defined in Install Referrer response");
                } else {
                    zzicVar2.zzaW().zzk().zzb("InstallReferrer API result", string);
                    Bundle bundleZzi = zzicVar2.zzk().zzi(Uri.parse("?".concat(string)));
                    if (bundleZzi == null) {
                        AbstractC1456a.m2452s(zzicVar2, "No campaign params defined in Install Referrer result");
                    } else {
                        List listAsList = Arrays.asList(((String) zzfy.zzbb.zzb(null)).split(","));
                        Iterator<String> it = bundleZzi.keySet().iterator();
                        while (it.hasNext()) {
                            if (listAsList.contains(it.next())) {
                                long j3 = bundleMo9822O.getLong("referrer_click_timestamp_server_seconds", 0L) * 1000;
                                if (j3 <= 0) {
                                    break;
                                }
                                bundleZzi.putLong("click_timestamp", j3);
                                break;
                            }
                        }
                        if (j2 == zzicVar2.zzd().zzd.zza()) {
                            zzicVar2.zzaW().zzk().zza("Logging Install Referrer campaign from module while it may have already been logged.");
                        }
                        if (zzicVar2.zzB()) {
                            zzicVar2.zzd().zzd.zzb(j2);
                            zzicVar2.zzaW().zzk().zzb("Logging Install Referrer campaign from gmscore with ", "referrer API v2");
                            bundleZzi.putString("_cis", "referrer API v2");
                            zzicVar2.zzj().zzH("auto", Constants.ScionAnalytics.EVENT_FIREBASE_CAMPAIGN, bundleZzi, strZza);
                        }
                    }
                }
            }
        }
        ConnectionTracker.m3632b().m3634c(zzicVar2.zzaZ(), this.zzb);
    }
}
