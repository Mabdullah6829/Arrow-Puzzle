package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class zzejs implements zzhcc {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ boolean f14045a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zzejt f14046b;

    public zzejs(zzejt zzejtVar, boolean z) {
        this.f14045a = z;
        this.f14046b = zzejtVar;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005d  */
    /* JADX WARN: Code duplicated, block: B:24:0x006d  */
    /* JADX WARN: Code duplicated, block: B:26:0x0075  */
    /* JADX WARN: Code duplicated, block: B:27:0x0077  */
    /* JADX WARN: Code duplicated, block: B:29:0x007f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0081  */
    /* JADX WARN: Code duplicated, block: B:32:0x0089  */
    /* JADX WARN: Code duplicated, block: B:33:0x008b  */
    /* JADX WARN: Code duplicated, block: B:36:0x0094  */
    /* JADX WARN: Code duplicated, block: B:38:0x0097 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x0099 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x009b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x009d  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:45:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:49:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:50:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:52:0x00ec A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:53:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:54:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:55:0x0108  */
    /* JADX WARN: Code duplicated, block: B:57:0x0117  */
    /* JADX WARN: Code duplicated, block: B:58:0x011a  */
    /* JADX WARN: Code duplicated, block: B:59:0x011d  */
    /* JADX WARN: Code duplicated, block: B:60:0x0120  */
    /* JADX WARN: Code duplicated, block: B:69:0x00af A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:? A[SYNTHETIC] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.android.gms.internal.ads.zzhcc
    /* JADX INFO: renamed from: a */
    public final void mo3316a(Object obj) {
        List listUnmodifiableList;
        List listAsList;
        final ArrayList arrayList;
        Iterator it;
        byte b;
        zzbic.zzab.zza zzaVarM4904D;
        int i2;
        int i3;
        zzbic.zzab.zzb zzbVar;
        String str;
        zzbic.zzd.zza zzaVar;
        Bundle bundle = (Bundle) obj;
        zzejt zzejtVar = this.f14046b;
        if (zzejtVar.f14053a.mo3172s()) {
            return;
        }
        Object obj2 = bundle.get("ad_types");
        if (obj2 instanceof List) {
            listAsList = (List) obj2;
        } else {
            if (obj2 instanceof String[]) {
                listAsList = Arrays.asList((String[]) obj2);
            } else {
                listUnmodifiableList = Collections.EMPTY_LIST;
            }
            arrayList = new ArrayList();
            it = listUnmodifiableList.iterator();
            while (true) {
                b = 0;
                if (it.hasNext()) {
                    SparseArray sparseArray = zzejt.f14047h;
                    final zzbic.zzaf.zzd zzdVar = (zzbic.zzaf.zzd) zzejt.f14047h.get(zzflv.m6493a(zzflv.m6493a(bundle, "device"), "network").getInt("active_network_state", -1), zzbic.zzaf.zzd.UNSPECIFIED);
                    zzaVarM4904D = zzbic.zzab.m4904D();
                    i2 = bundle.getInt("cnt", -2);
                    i3 = bundle.getInt("gnt", 0);
                    if (i2 == -1) {
                        zzejtVar.f14052g = zzbic.zzq.ENUM_TRUE;
                    } else {
                        zzejtVar.f14052g = zzbic.zzq.ENUM_FALSE;
                        if (i2 != 0) {
                            zzbic.zzab.zzc zzcVar = zzbic.zzab.zzc.CELL;
                            zzaVarM4904D.m8326l();
                            ((zzbic.zzab) zzaVarM4904D.f19780t).m4906E(zzcVar);
                        } else if (i2 != 1) {
                            zzbic.zzab.zzc zzcVar2 = zzbic.zzab.zzc.NETWORKTYPE_UNSPECIFIED;
                            zzaVarM4904D.m8326l();
                            ((zzbic.zzab) zzaVarM4904D.f19780t).m4906E(zzcVar2);
                        } else {
                            zzbic.zzab.zzc zzcVar3 = zzbic.zzab.zzc.WIFI;
                            zzaVarM4904D.m8326l();
                            ((zzbic.zzab) zzaVarM4904D.f19780t).m4906E(zzcVar3);
                        }
                        switch (i3) {
                            case 1:
                            case 2:
                            case 4:
                            case 7:
                            case 11:
                            case 16:
                                zzbVar = zzbic.zzab.zzb.TWO_G;
                                break;
                            case 3:
                            case 5:
                            case 6:
                            case 8:
                            case 9:
                            case 10:
                            case 12:
                            case 14:
                            case 15:
                            case 17:
                                zzbVar = zzbic.zzab.zzb.THREE_G;
                                break;
                            case 13:
                                zzbVar = zzbic.zzab.zzb.LTE;
                                break;
                            default:
                                zzbVar = zzbic.zzab.zzb.CELLULAR_NETWORK_TYPE_UNSPECIFIED;
                                break;
                        }
                        zzaVarM4904D.m8326l();
                        ((zzbic.zzab) zzaVarM4904D.f19780t).m4907F(zzbVar);
                    }
                    final zzbic.zzab zzabVar = (zzbic.zzab) zzaVarM4904D.m8328o();
                    final boolean z = this.f14045a;
                    zzejtVar.f14054b.m6232a(new zzfos() { // from class: com.google.android.gms.internal.ads.zzejr
                        /* JADX WARN: Bottom block not found for handler: all -> 0x011d */
                        @Override // com.google.android.gms.internal.ads.zzfos
                        /* JADX INFO: renamed from: b */
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final java.lang.Object mo5874b(java.lang.Object r13) {
                            /*
                                Method dump skipped, instruction units count: 293
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzejr.mo5874b(java.lang.Object):java.lang.Object");
                        }
                    });
                    return;
                }
                str = (String) it.next();
                switch (str.hashCode()) {
                    case -1396342996:
                        if (!str.equals("banner")) {
                            b = -1;
                        }
                        break;
                    case -1052618729:
                        if (str.equals("native")) {
                            b = 2;
                        } else {
                            b = -1;
                        }
                        break;
                    case -239580146:
                        if (str.equals("rewarded")) {
                            b = 3;
                        } else {
                            b = -1;
                        }
                        break;
                    case 604727084:
                        if (str.equals("interstitial")) {
                            b = 1;
                        } else {
                            b = -1;
                        }
                        break;
                    default:
                        b = -1;
                        break;
                }
                if (b != 0) {
                    zzaVar = zzbic.zzd.zza.BANNER;
                } else if (b != 1) {
                    zzaVar = zzbic.zzd.zza.INTERSTITIAL;
                } else if (b != 2) {
                    zzaVar = zzbic.zzd.zza.NATIVE_APP_INSTALL;
                } else if (b != 3) {
                    zzaVar = zzbic.zzd.zza.AD_FORMAT_TYPE_UNSPECIFIED;
                } else {
                    zzaVar = zzbic.zzd.zza.REWARD_BASED_VIDEO_AD;
                }
                arrayList.add(zzaVar);
            }
        }
        ArrayList arrayList2 = new ArrayList(listAsList.size());
        for (Object obj3 : listAsList) {
            if (obj3 instanceof String) {
                arrayList2.add((String) obj3);
            }
        }
        listUnmodifiableList = Collections.unmodifiableList(arrayList2);
        arrayList = new ArrayList();
        it = listUnmodifiableList.iterator();
        while (true) {
            b = 0;
            if (it.hasNext()) {
                SparseArray sparseArray2 = zzejt.f14047h;
                final zzbic.zzaf.zzd zzdVar2 = (zzbic.zzaf.zzd) zzejt.f14047h.get(zzflv.m6493a(zzflv.m6493a(bundle, "device"), "network").getInt("active_network_state", -1), zzbic.zzaf.zzd.UNSPECIFIED);
                zzaVarM4904D = zzbic.zzab.m4904D();
                i2 = bundle.getInt("cnt", -2);
                i3 = bundle.getInt("gnt", 0);
                if (i2 == -1) {
                    zzejtVar.f14052g = zzbic.zzq.ENUM_TRUE;
                } else {
                    zzejtVar.f14052g = zzbic.zzq.ENUM_FALSE;
                    if (i2 != 0) {
                        zzbic.zzab.zzc zzcVar4 = zzbic.zzab.zzc.CELL;
                        zzaVarM4904D.m8326l();
                        ((zzbic.zzab) zzaVarM4904D.f19780t).m4906E(zzcVar4);
                    } else if (i2 != 1) {
                        zzbic.zzab.zzc zzcVar5 = zzbic.zzab.zzc.NETWORKTYPE_UNSPECIFIED;
                        zzaVarM4904D.m8326l();
                        ((zzbic.zzab) zzaVarM4904D.f19780t).m4906E(zzcVar5);
                    } else {
                        zzbic.zzab.zzc zzcVar6 = zzbic.zzab.zzc.WIFI;
                        zzaVarM4904D.m8326l();
                        ((zzbic.zzab) zzaVarM4904D.f19780t).m4906E(zzcVar6);
                    }
                    switch (i3) {
                        case 1:
                        case 2:
                        case 4:
                        case 7:
                        case 11:
                        case 16:
                            zzbVar = zzbic.zzab.zzb.TWO_G;
                            break;
                        case 3:
                        case 5:
                        case 6:
                        case 8:
                        case 9:
                        case 10:
                        case 12:
                        case 14:
                        case 15:
                        case 17:
                            zzbVar = zzbic.zzab.zzb.THREE_G;
                            break;
                        case 13:
                            zzbVar = zzbic.zzab.zzb.LTE;
                            break;
                        default:
                            zzbVar = zzbic.zzab.zzb.CELLULAR_NETWORK_TYPE_UNSPECIFIED;
                            break;
                    }
                    zzaVarM4904D.m8326l();
                    ((zzbic.zzab) zzaVarM4904D.f19780t).m4907F(zzbVar);
                }
                final zzbic.zzab zzabVar2 = (zzbic.zzab) zzaVarM4904D.m8328o();
                final boolean z2 = this.f14045a;
                zzejtVar.f14054b.m6232a(new zzfos() { // from class: com.google.android.gms.internal.ads.zzejr
                    /* JADX WARN: Bottom block not found for handler: all -> 0x011d */
                    @Override // com.google.android.gms.internal.ads.zzfos
                    /* JADX INFO: renamed from: b */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object mo5874b(java.lang.Object r13) {
                        /*
                            Method dump skipped, instruction units count: 293
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzejr.mo5874b(java.lang.Object):java.lang.Object");
                    }
                });
                return;
            }
            str = (String) it.next();
            switch (str.hashCode()) {
                case -1396342996:
                    if (!str.equals("banner")) {
                        b = -1;
                    }
                    break;
                case -1052618729:
                    if (str.equals("native")) {
                        b = 2;
                    } else {
                        b = -1;
                    }
                    break;
                case -239580146:
                    if (str.equals("rewarded")) {
                        b = 3;
                    } else {
                        b = -1;
                    }
                    break;
                case 604727084:
                    if (str.equals("interstitial")) {
                        b = 1;
                    } else {
                        b = -1;
                    }
                    break;
                default:
                    b = -1;
                    break;
            }
            if (b != 0) {
                zzaVar = zzbic.zzd.zza.BANNER;
            } else if (b != 1) {
                zzaVar = zzbic.zzd.zza.INTERSTITIAL;
            } else if (b != 2) {
                zzaVar = zzbic.zzd.zza.NATIVE_APP_INSTALL;
            } else if (b != 3) {
                zzaVar = zzbic.zzd.zza.AD_FORMAT_TYPE_UNSPECIFIED;
            } else {
                zzaVar = zzbic.zzd.zza.REWARD_BASED_VIDEO_AD;
            }
            arrayList.add(zzaVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    /* JADX INFO: renamed from: b */
    public final void mo3317b(Throwable th) {
        int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
        com.google.android.gms.ads.internal.util.client.zzo.m3070c("Failed to get signals bundle");
    }
}
