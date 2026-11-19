package com.google.android.gms.internal.measurement;

import android.accounts.Account;
import android.content.Context;
import android.net.Uri;
import androidx.datastore.preferences.protobuf.AbstractC1456a;
import java.util.Iterator;
import java.util.regex.Pattern;
import p001B.C0084j;
import p003C.AbstractC0116g;
import p003C.C0112c;
import p003C.C0129t;
import p011H.AbstractC0271e0;

/* JADX INFO: loaded from: classes2.dex */
public final class zzrz {

    /* JADX INFO: renamed from: a */
    public final String f22847a;

    /* JADX INFO: renamed from: b */
    public String f22848b = "files";

    /* JADX INFO: renamed from: c */
    public String f22849c = "common";

    /* JADX INFO: renamed from: d */
    public final Account f22850d = zzsa.f22857b;

    /* JADX INFO: renamed from: e */
    public String f22851e = "";

    /* JADX INFO: renamed from: f */
    public final C0112c f22852f = AbstractC0116g.m192n();

    public /* synthetic */ zzrz(Context context) {
        zzsq.m10645a(context != null, "Context cannot be null", new Object[0]);
        this.f22847a = context.getPackageName();
    }

    /* JADX INFO: renamed from: a */
    public final void m10638a(String str) {
        zzsq.m10645a(zzsa.f22856a.matcher(str).matches(), "Module must match [a-z]+(_[a-z]+)*: %s", str);
        zzsq.m10645a(!zzsa.f22858c.contains(str), "Module name is reserved and cannot be used: %s", str);
        this.f22849c = str;
    }

    /* JADX INFO: renamed from: b */
    public final void m10639b(String str) {
        if (str.startsWith("/")) {
            str = str.substring(1);
        }
        Pattern pattern = zzsa.f22856a;
        this.f22851e = str;
    }

    /* JADX INFO: renamed from: c */
    public final Uri m10640c() {
        String strM2450q;
        String strConcat;
        String str = this.f22848b;
        String str2 = this.f22849c;
        Account account = zzrv.f22841a;
        Account account2 = this.f22850d;
        zzsq.m10645a(account2.type.indexOf(58) == -1, "Account type contains ':'.", new Object[0]);
        zzsq.m10645a(account2.type.indexOf(47) == -1, "Account type contains '/'.", new Object[0]);
        zzsq.m10645a(account2.name.indexOf(47) == -1, "Account name contains '/'.", new Object[0]);
        if (zzrv.f22841a.equals(account2)) {
            strM2450q = "shared";
        } else {
            String str3 = account2.type;
            String str4 = account2.name;
            strM2450q = AbstractC1456a.m2450q(new StringBuilder(String.valueOf(str3).length() + 1 + String.valueOf(str4).length()), str3, ":", str4);
        }
        String str5 = this.f22851e;
        StringBuilder sb = new StringBuilder(AbstractC1456a.m2438e(AbstractC1456a.m2438e(str.length() + 2, 1, str2), 1, strM2450q) + String.valueOf(str5).length());
        AbstractC0271e0.m413u(sb, "/", str, "/", str2);
        String strM2451r = AbstractC1456a.m2451r(sb, "/", strM2450q, "/", str5);
        C0129t c0129tM187d = this.f22852f.m187d();
        Pattern pattern = zzsp.f22868a;
        if (c0129tM187d.isEmpty()) {
            strConcat = null;
        } else {
            C0084j c0084j = new C0084j("+");
            Iterator it = c0129tM187d.iterator();
            StringBuilder sb2 = new StringBuilder();
            c0084j.m146a(sb2, it);
            strConcat = "transform=".concat(String.valueOf(sb2.toString()));
        }
        return new Uri.Builder().scheme("android").authority(this.f22847a).path(strM2451r).encodedFragment(strConcat).build();
    }
}
