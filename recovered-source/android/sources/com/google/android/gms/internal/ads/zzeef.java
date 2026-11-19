package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Base64;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzeef implements zzash {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzeeg f13733a;

    public zzeef(zzeeg zzeegVar) {
        Objects.requireNonNull(zzeegVar);
        this.f13733a = zzeegVar;
    }

    /* JADX INFO: renamed from: a */
    public final void m6187a(int i2) {
        int i3;
        zzasi zzasiVarMo4363b;
        zzeeg zzeegVar = this.f13733a;
        try {
            zzfrd zzfrdVarM6622D = zzfre.m6622D();
            if (i2 == 0) {
                i3 = 3;
            } else if (i2 == 1) {
                i3 = 4;
            } else if (i2 != 2) {
                i3 = i2 != 3 ? 7 : 6;
            } else {
                i3 = 5;
            }
            zzfrdVarM6622D.m8326l();
            ((zzfre) zzfrdVarM6622D.f19780t).m6630L(i3);
            if (i2 == 0) {
                zzeed zzeedVar = zzeegVar.f13735b;
                zzeedVar.getClass();
                try {
                    zzase zzaseVar = zzeedVar.f13731b;
                    zzasiVarMo4363b = (zzaseVar == null || !zzaseVar.mo4362a()) ? null : zzaseVar.mo4363b();
                } catch (RemoteException unused) {
                }
                if (zzasiVarMo4363b != null) {
                    long j2 = zzasiVarMo4363b.f6834a.getLong("referrer_click_timestamp_seconds");
                    zzfrdVarM6622D.m8326l();
                    ((zzfre) zzfrdVarM6622D.f19780t).m6624F(j2);
                    long j3 = zzasiVarMo4363b.f6834a.getLong("install_begin_timestamp_seconds");
                    zzfrdVarM6622D.m8326l();
                    ((zzfre) zzfrdVarM6622D.f19780t).m6625G(j3);
                    boolean z = zzasiVarMo4363b.f6834a.getBoolean("google_play_instant");
                    zzfrdVarM6622D.m8326l();
                    ((zzfre) zzfrdVarM6622D.f19780t).m6626H(z);
                    long j4 = zzasiVarMo4363b.f6834a.getLong("referrer_click_timestamp_server_seconds");
                    zzfrdVarM6622D.m8326l();
                    ((zzfre) zzfrdVarM6622D.f19780t).m6627I(j4);
                    long j5 = zzasiVarMo4363b.f6834a.getLong("install_begin_timestamp_server_seconds");
                    zzfrdVarM6622D.m8326l();
                    ((zzfre) zzfrdVarM6622D.f19780t).m6628J(j5);
                    if (!TextUtils.isEmpty(zzasiVarMo4363b.f6834a.getString("install_referrer"))) {
                        String string = zzasiVarMo4363b.f6834a.getString("install_referrer");
                        zzfrdVarM6622D.m8326l();
                        ((zzfre) zzfrdVarM6622D.f19780t).m6623E(string);
                    }
                    if (!TextUtils.isEmpty(zzasiVarMo4363b.f6834a.getString("install_version"))) {
                        String string2 = zzasiVarMo4363b.f6834a.getString("install_version");
                        zzfrdVarM6622D.m8326l();
                        ((zzfre) zzfrdVarM6622D.f19780t).m6629K(string2);
                    }
                }
            }
            zzasg zzasgVar = (zzasg) zzeegVar.f13735b.f13731b;
            zzasgVar.f6829a = 3;
            if (zzasgVar.f6833e != null) {
                zzasj.m4364a("Unbinding from service.");
                zzasgVar.f6830b.unbindService(zzasgVar.f6833e);
                zzasgVar.f6833e = null;
            }
            zzasgVar.f6832d = null;
            zzdzt zzdztVar = zzeegVar.f13736c;
            String strEncodeToString = Base64.encodeToString(((zzfre) zzfrdVarM6622D.m8328o()).m8099h(), 1);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8263P5)).booleanValue()) {
                zzdzs zzdzsVarM6111a = zzdztVar.m6111a();
                zzdzsVarM6111a.m6107b("action", "irda");
                zzdzsVarM6111a.m6107b("irdd", strEncodeToString);
                zzdzsVarM6111a.m6110e();
            }
            zzeegVar.f13737d.mo3159X();
        } catch (Exception e) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8280Q5)).booleanValue()) {
                if (zzeegVar.f13739f == null) {
                    zzeegVar.f13739f = zzcaf.m5288e(zzeegVar.f13734a);
                }
                zzeegVar.f13739f.mo5291a("InstallReferrerUnsampled.onInstallReferrerSetupFinished", e);
            } else {
                if (zzeegVar.f13738e == null) {
                    zzeegVar.f13738e = zzcaf.m5286c(zzeegVar.f13734a);
                }
                zzeegVar.f13738e.mo5291a("InstallReferrer.onInstallReferrerSetupFinished", e);
            }
        }
    }
}
