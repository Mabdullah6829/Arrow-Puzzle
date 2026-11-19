package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.auth.api.signin.internal.HashAccumulator;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class GoogleSignInOptions extends AbstractSafeParcelable implements Api.ApiOptions.Optional, ReflectedParcelable {

    /* JADX INFO: renamed from: C */
    public static final Scope f4054C;
    public static final Parcelable.Creator<GoogleSignInOptions> CREATOR;

    /* JADX INFO: renamed from: D */
    public static final Scope f4055D;

    /* JADX INFO: renamed from: A */
    public final ArrayList f4056A;

    /* JADX INFO: renamed from: B */
    public final String f4057B;

    /* JADX INFO: renamed from: s */
    public final int f4058s;

    /* JADX INFO: renamed from: t */
    public final ArrayList f4059t;

    /* JADX INFO: renamed from: u */
    public final Account f4060u;

    /* JADX INFO: renamed from: v */
    public final boolean f4061v;

    /* JADX INFO: renamed from: w */
    public final boolean f4062w;

    /* JADX INFO: renamed from: x */
    public final boolean f4063x;

    /* JADX INFO: renamed from: y */
    public final String f4064y;

    /* JADX INFO: renamed from: z */
    public final String f4065z;

    @Deprecated
    public static final class Builder {

        /* JADX INFO: renamed from: a */
        public final HashSet f4066a = new HashSet();

        /* JADX INFO: renamed from: b */
        public final HashMap f4067b = new HashMap();

        /* JADX INFO: renamed from: a */
        public final void m3370a() {
            Scope scope = GoogleSignInOptions.f4055D;
            HashSet hashSet = this.f4066a;
            if (hashSet.contains(scope)) {
                Scope scope2 = GoogleSignInOptions.f4054C;
                if (hashSet.contains(scope2)) {
                    hashSet.remove(scope2);
                }
            }
            new GoogleSignInOptions(3, new ArrayList(hashSet), null, false, false, false, null, null, this.f4067b, null);
        }
    }

    static {
        Scope scope = new Scope(1, "profile");
        new Scope(1, NotificationCompat.CATEGORY_EMAIL);
        Scope scope2 = new Scope(1, "openid");
        Scope scope3 = new Scope(1, "https://www.googleapis.com/auth/games_lite");
        f4054C = scope3;
        f4055D = new Scope(1, "https://www.googleapis.com/auth/games");
        Builder builder = new Builder();
        builder.f4066a.add(scope2);
        builder.f4066a.add(scope);
        builder.m3370a();
        Builder builder2 = new Builder();
        HashSet hashSet = builder2.f4066a;
        hashSet.add(scope3);
        hashSet.addAll(Arrays.asList(new Scope[0]));
        builder2.m3370a();
        CREATOR = new zad();
        new zac();
    }

    public GoogleSignInOptions(int i2, ArrayList arrayList, Account account, boolean z, boolean z2, boolean z3, String str, String str2, HashMap map, String str3) {
        this.f4058s = i2;
        this.f4059t = arrayList;
        this.f4060u = account;
        this.f4061v = z;
        this.f4062w = z2;
        this.f4063x = z3;
        this.f4064y = str;
        this.f4065z = str2;
        this.f4056A = new ArrayList(map.values());
        this.f4057B = str3;
    }

    public final boolean equals(Object obj) {
        String str = this.f4064y;
        if (obj == null) {
            return false;
        }
        try {
            GoogleSignInOptions googleSignInOptions = (GoogleSignInOptions) obj;
            ArrayList arrayList = googleSignInOptions.f4059t;
            String str2 = googleSignInOptions.f4064y;
            Account account = googleSignInOptions.f4060u;
            if (this.f4056A.isEmpty() && googleSignInOptions.f4056A.isEmpty()) {
                ArrayList arrayList2 = this.f4059t;
                if (arrayList2.size() == new ArrayList(arrayList).size() && arrayList2.containsAll(new ArrayList(arrayList))) {
                    Account account2 = this.f4060u;
                    if (account2 == null) {
                        if (account != null) {
                            return false;
                        }
                    } else if (!account2.equals(account)) {
                        return false;
                    }
                    if (TextUtils.isEmpty(str)) {
                        if (!TextUtils.isEmpty(str2)) {
                            return false;
                        }
                    } else if (!str.equals(str2)) {
                        return false;
                    }
                    return this.f4063x == googleSignInOptions.f4063x && this.f4061v == googleSignInOptions.f4061v && this.f4062w == googleSignInOptions.f4062w && TextUtils.equals(this.f4057B, googleSignInOptions.f4057B);
                }
                return false;
            }
            return false;
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public final int hashCode() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f4059t;
        int size = arrayList2.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(((Scope) arrayList2.get(i2)).f4206t);
        }
        Collections.sort(arrayList);
        HashAccumulator hashAccumulator = new HashAccumulator();
        hashAccumulator.m3371a(arrayList);
        hashAccumulator.m3371a(this.f4060u);
        hashAccumulator.m3371a(this.f4064y);
        hashAccumulator.f4071a = (((((hashAccumulator.f4071a * 31) + (this.f4063x ? 1 : 0)) * 31) + (this.f4061v ? 1 : 0)) * 31) + (this.f4062w ? 1 : 0);
        hashAccumulator.m3371a(this.f4057B);
        return hashAccumulator.f4071a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iM3589o = SafeParcelWriter.m3589o(20293, parcel);
        SafeParcelWriter.m3588n(parcel, 1, 4);
        parcel.writeInt(this.f4058s);
        SafeParcelWriter.m3587m(parcel, 2, new ArrayList(this.f4059t));
        SafeParcelWriter.m3582h(parcel, 3, this.f4060u, i2);
        SafeParcelWriter.m3588n(parcel, 4, 4);
        parcel.writeInt(this.f4061v ? 1 : 0);
        SafeParcelWriter.m3588n(parcel, 5, 4);
        parcel.writeInt(this.f4062w ? 1 : 0);
        SafeParcelWriter.m3588n(parcel, 6, 4);
        parcel.writeInt(this.f4063x ? 1 : 0);
        SafeParcelWriter.m3583i(parcel, 7, this.f4064y);
        SafeParcelWriter.m3583i(parcel, 8, this.f4065z);
        SafeParcelWriter.m3587m(parcel, 9, this.f4056A);
        SafeParcelWriter.m3583i(parcel, 10, this.f4057B);
        SafeParcelWriter.m3590p(iM3589o, parcel);
    }
}
