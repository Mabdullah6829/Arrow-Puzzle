package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfbn implements zzfcq {

    /* JADX INFO: renamed from: a */
    public final zzgcr f15332a;

    /* JADX INFO: renamed from: b */
    public final zzgcr f15333b;

    /* JADX INFO: renamed from: c */
    public final boolean f15334c;

    /* JADX INFO: renamed from: d */
    public final boolean f15335d;

    /* JADX INFO: renamed from: e */
    public final boolean f15336e = false;

    /* JADX INFO: renamed from: f */
    public final boolean f15337f;

    public zzfbn(zzgcr zzgcrVar, zzgcr zzgcrVar2, boolean z, boolean z2, boolean z3) {
        this.f15332a = zzgcrVar;
        this.f15333b = zzgcrVar2;
        this.f15334c = z;
        this.f15335d = z2;
        this.f15337f = z3;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:12:0x003a  */
    /* JADX WARN: Code duplicated, block: B:14:0x0042  */
    /* JADX WARN: Code duplicated, block: B:20:0x0064 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x0066  */
    /* JADX WARN: Code duplicated, block: B:23:0x0078  */
    /* JADX WARN: Code duplicated, block: B:25:0x0080  */
    /* JADX WARN: Code duplicated, block: B:9:0x0026 A[DONT_INVERT] */
    @Override // com.google.android.gms.internal.ads.zzfcq
    /* JADX INFO: renamed from: b */
    public final void mo6399b(Object obj) {
        String str;
        long j2;
        String str2;
        long j3;
        Bundle bundle = (Bundle) obj;
        if (this.f15336e) {
            return;
        }
        Bundle bundleM6493a = zzflv.m6493a(bundle, "pii");
        boolean z = this.f15337f;
        if (!z) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8344U3)).booleanValue()) {
                zzgcr zzgcrVar = this.f15332a;
                str2 = zzgcrVar.f16987a;
                j3 = zzgcrVar.f16988b;
                if (str2 != null) {
                    bundleM6493a.putString("paidv1_id_android", str2);
                    bundleM6493a.putLong("paidv1_creation_time_android", j3);
                }
            } else if (z) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8376W3)).booleanValue()) {
                    zzgcr zzgcrVar2 = this.f15332a;
                    str2 = zzgcrVar2.f16987a;
                    j3 = zzgcrVar2.f16988b;
                    if (str2 != null && j3 > 0) {
                        bundleM6493a.putString("paidv1_id_android", str2);
                        bundleM6493a.putLong("paidv1_creation_time_android", j3);
                    }
                }
            }
        } else if (z) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8376W3)).booleanValue()) {
                zzgcr zzgcrVar3 = this.f15332a;
                str2 = zzgcrVar3.f16987a;
                j3 = zzgcrVar3.f16988b;
                if (str2 != null) {
                    bundleM6493a.putString("paidv1_id_android", str2);
                    bundleM6493a.putLong("paidv1_creation_time_android", j3);
                }
            }
        }
        if (!z) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8360V3)).booleanValue()) {
                zzgcr zzgcrVar4 = this.f15333b;
                str = zzgcrVar4.f16987a;
                j2 = zzgcrVar4.f16988b;
                if (str != null) {
                    bundleM6493a.putString("paidv2_id_android", str);
                    bundleM6493a.putLong("paidv2_creation_time_android", j2);
                }
                bundleM6493a.putBoolean("paidv2_pub_option_android", this.f15334c);
                bundleM6493a.putBoolean("paidv2_user_option_android", this.f15335d);
            } else if (z) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8392X3)).booleanValue()) {
                    zzgcr zzgcrVar5 = this.f15333b;
                    str = zzgcrVar5.f16987a;
                    j2 = zzgcrVar5.f16988b;
                    if (str != null && j2 > 0) {
                        bundleM6493a.putString("paidv2_id_android", str);
                        bundleM6493a.putLong("paidv2_creation_time_android", j2);
                    }
                    bundleM6493a.putBoolean("paidv2_pub_option_android", this.f15334c);
                    bundleM6493a.putBoolean("paidv2_user_option_android", this.f15335d);
                }
            }
        } else if (z) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8392X3)).booleanValue()) {
                zzgcr zzgcrVar6 = this.f15333b;
                str = zzgcrVar6.f16987a;
                j2 = zzgcrVar6.f16988b;
                if (str != null) {
                    bundleM6493a.putString("paidv2_id_android", str);
                    bundleM6493a.putLong("paidv2_creation_time_android", j2);
                }
                bundleM6493a.putBoolean("paidv2_pub_option_android", this.f15334c);
                bundleM6493a.putBoolean("paidv2_user_option_android", this.f15335d);
            }
        }
        if (bundleM6493a.isEmpty()) {
            return;
        }
        bundle.putBundle("pii", bundleM6493a);
    }

    public zzfbn(boolean z) {
        this.f15337f = z;
    }
}
