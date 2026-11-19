package com.google.android.gms.measurement.internal;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class zzou extends zzol {
    public zzou(zzpg zzpgVar) {
        super(zzpgVar);
    }

    private final String zzd(String str) throws Throwable {
        String strZzc = this.zzg.zzh().zzc(str);
        if (TextUtils.isEmpty(strZzc)) {
            return (String) zzfy.zzq.zzb(null);
        }
        Uri uri = Uri.parse((String) zzfy.zzq.zzb(null));
        Uri.Builder builderBuildUpon = uri.buildUpon();
        String authority = uri.getAuthority();
        StringBuilder sb = new StringBuilder(String.valueOf(strZzc).length() + 1 + String.valueOf(authority).length());
        sb.append(strZzc);
        sb.append(".");
        sb.append(authority);
        builderBuildUpon.authority(sb.toString());
        return builderBuildUpon.build().toString();
    }

    private static final boolean zzf(String str) {
        String str2 = (String) zzfy.zzs.zzb(null);
        if (TextUtils.isEmpty(str2)) {
            return false;
        }
        for (String str3 : str2.split(",")) {
            if (str.equalsIgnoreCase(str3.trim())) {
                return true;
            }
        }
        return false;
    }

    public final zzot zza(String str) {
        zzh zzhVarZzu;
        zzpg zzpgVar = this.zzg;
        zzh zzhVarZzu2 = zzpgVar.zzj().zzu(str);
        zzot zzotVar = null;
        if (zzhVarZzu2 == null || !zzhVarZzu2.zzai()) {
            return new zzot(zzd(str), Collections.EMPTY_MAP, zzls.GOOGLE_ANALYTICS, null);
        }
        com.google.android.gms.internal.measurement.zzil zzilVarM10410B = com.google.android.gms.internal.measurement.zzis.m10410B();
        zzilVarM10410B.m9552o();
        ((com.google.android.gms.internal.measurement.zzis) zzilVarM10410B.f22030t).m10416G(2);
        com.google.android.gms.internal.measurement.zzin zzinVarM10409b = com.google.android.gms.internal.measurement.zzin.m10409b(zzhVarZzu2.zzaL());
        Preconditions.m3544h(zzinVarM10409b);
        zzilVarM10410B.m10408u(zzinVarM10409b);
        String strZzd = zzhVarZzu2.zzd();
        com.google.android.gms.internal.measurement.zzgl zzglVarZzb = zzpgVar.zzh().zzb(str);
        if (zzglVarZzb == null || (zzhVarZzu = zzpgVar.zzj().zzu(str)) == null || ((!zzglVarZzb.m9992O() || zzglVarZzb.m9993P().m10001A() != 100) && !this.zzu.zzk().zzad(str, zzhVarZzu.zzay()) && (TextUtils.isEmpty(strZzd) || Math.abs(strZzd.hashCode() % 100) >= zzglVarZzb.m9993P().m10001A()))) {
            zzilVarM10410B.m9552o();
            ((com.google.android.gms.internal.measurement.zzis) zzilVarM10410B.f22030t).m10417H(3);
            return new zzot(zzd(str), Collections.EMPTY_MAP, zzls.GOOGLE_ANALYTICS, (com.google.android.gms.internal.measurement.zzis) zzilVarM10410B.m9555r());
        }
        String strZzc = zzhVarZzu2.zzc();
        zzilVarM10410B.m9552o();
        ((com.google.android.gms.internal.measurement.zzis) zzilVarM10410B.f22030t).m10416G(2);
        com.google.android.gms.internal.measurement.zzgl zzglVarZzb2 = zzpgVar.zzh().zzb(zzhVarZzu2.zzc());
        if (zzglVarZzb2 == null || !zzglVarZzb2.m9992O()) {
            this.zzu.zzaW().zzk().zzb("[sgtm] Missing sgtm_setting in remote config. appId", strZzc);
            zzilVarM10410B.m9552o();
            ((com.google.android.gms.internal.measurement.zzis) zzilVarM10410B.f22030t).m10417H(4);
        } else {
            HashMap map = new HashMap();
            if (!TextUtils.isEmpty(zzhVarZzu2.zzay())) {
                map.put("x-gtm-server-preview", zzhVarZzu2.zzay());
            }
            String strM10002B = zzglVarZzb2.m9993P().m10002B();
            com.google.android.gms.internal.measurement.zzin zzinVarM10409b2 = com.google.android.gms.internal.measurement.zzin.m10409b(zzhVarZzu2.zzaL());
            com.google.android.gms.internal.measurement.zzin zzinVar = com.google.android.gms.internal.measurement.zzin.CLIENT_UPLOAD_ELIGIBLE;
            if (zzinVarM10409b2 != null && zzinVarM10409b2 != zzinVar) {
                zzilVarM10410B.m10408u(zzinVarM10409b2);
            } else if (zzf(zzhVarZzu2.zzc())) {
                zzilVarM10410B.m10408u(com.google.android.gms.internal.measurement.zzin.PINNED_TO_SERVICE_UPLOAD);
            } else if (TextUtils.isEmpty(strM10002B)) {
                zzilVarM10410B.m10408u(com.google.android.gms.internal.measurement.zzin.MISSING_SGTM_SERVER_URL);
            } else {
                this.zzu.zzaW().zzk().zzb("[sgtm] Eligible for client side upload. appId", strZzc);
                zzilVarM10410B.m9552o();
                ((com.google.android.gms.internal.measurement.zzis) zzilVarM10410B.f22030t).m10416G(3);
                zzilVarM10410B.m10408u(zzinVar);
                zzotVar = new zzot(strM10002B, map, zzls.SGTM_CLIENT, (com.google.android.gms.internal.measurement.zzis) zzilVarM10410B.m9555r());
            }
            zzglVarZzb2.m9993P().getClass();
            zzglVarZzb2.m9993P().getClass();
            zzic zzicVar = this.zzu;
            zzicVar.zzaV();
            if (TextUtils.isEmpty(strM10002B)) {
                zzilVarM10410B.m9552o();
                ((com.google.android.gms.internal.measurement.zzis) zzilVarM10410B.f22030t).m10417H(6);
                zzicVar.zzaW().zzk().zzb("[sgtm] Local service, missing sgtm_server_url", zzhVarZzu2.zzc());
            } else {
                zzicVar.zzaW().zzk().zzb("[sgtm] Eligible for local service direct upload. appId", strZzc);
                zzilVarM10410B.m9552o();
                ((com.google.android.gms.internal.measurement.zzis) zzilVarM10410B.f22030t).m10416G(5);
                zzilVarM10410B.m9552o();
                ((com.google.android.gms.internal.measurement.zzis) zzilVarM10410B.f22030t).m10417H(2);
                zzotVar = new zzot(strM10002B, map, zzls.SGTM, (com.google.android.gms.internal.measurement.zzis) zzilVarM10410B.m9555r());
            }
        }
        return zzotVar != null ? zzotVar : new zzot(zzd(str), Collections.EMPTY_MAP, zzls.GOOGLE_ANALYTICS, (com.google.android.gms.internal.measurement.zzis) zzilVarM10410B.m9555r());
    }

    @WorkerThread
    public final boolean zzc(String str, com.google.android.gms.internal.measurement.zzin zzinVar) {
        com.google.android.gms.internal.measurement.zzgl zzglVarZzb;
        zzg();
        return (zzinVar != com.google.android.gms.internal.measurement.zzin.CLIENT_UPLOAD_ELIGIBLE || zzf(str) || (zzglVarZzb = this.zzg.zzh().zzb(str)) == null || !zzglVarZzb.m9992O() || zzglVarZzb.m9993P().m10002B().isEmpty()) ? false : true;
    }
}
