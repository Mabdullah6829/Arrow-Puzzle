package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.util.DefaultClock;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class GoogleSignInAccount extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new zab();

    /* JADX INFO: renamed from: A */
    public final List f4042A;

    /* JADX INFO: renamed from: B */
    public final String f4043B;

    /* JADX INFO: renamed from: C */
    public final String f4044C;

    /* JADX INFO: renamed from: D */
    public final HashSet f4045D = new HashSet();

    /* JADX INFO: renamed from: s */
    public final String f4046s;

    /* JADX INFO: renamed from: t */
    public final String f4047t;

    /* JADX INFO: renamed from: u */
    public final String f4048u;

    /* JADX INFO: renamed from: v */
    public final String f4049v;

    /* JADX INFO: renamed from: w */
    public final Uri f4050w;

    /* JADX INFO: renamed from: x */
    public String f4051x;

    /* JADX INFO: renamed from: y */
    public final long f4052y;

    /* JADX INFO: renamed from: z */
    public final String f4053z;

    static {
        DefaultClock defaultClock = DefaultClock.f4636a;
    }

    public GoogleSignInAccount(String str, String str2, String str3, String str4, Uri uri, String str5, long j2, String str6, ArrayList arrayList, String str7, String str8) {
        this.f4046s = str;
        this.f4047t = str2;
        this.f4048u = str3;
        this.f4049v = str4;
        this.f4050w = uri;
        this.f4051x = str5;
        this.f4052y = j2;
        this.f4053z = str6;
        this.f4042A = arrayList;
        this.f4043B = str7;
        this.f4044C = str8;
    }

    /* JADX INFO: renamed from: H */
    public static GoogleSignInAccount m3368H(String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String strOptString = jSONObject.optString("photoUrl");
        Uri uri = !TextUtils.isEmpty(strOptString) ? Uri.parse(strOptString) : null;
        long j2 = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i2 = 0; i2 < length; i2++) {
            hashSet.add(new Scope(1, jSONArray.getString(i2)));
        }
        String strOptString2 = jSONObject.optString("id");
        String strOptString3 = jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null;
        String strOptString4 = jSONObject.has(NotificationCompat.CATEGORY_EMAIL) ? jSONObject.optString(NotificationCompat.CATEGORY_EMAIL) : null;
        String strOptString5 = jSONObject.has("displayName") ? jSONObject.optString("displayName") : null;
        String strOptString6 = jSONObject.has("givenName") ? jSONObject.optString("givenName") : null;
        String strOptString7 = jSONObject.has("familyName") ? jSONObject.optString("familyName") : null;
        String string = jSONObject.getString("obfuscatedIdentifier");
        Preconditions.m3541e(string);
        GoogleSignInAccount googleSignInAccount = new GoogleSignInAccount(strOptString2, strOptString3, strOptString4, strOptString5, uri, null, j2, string, new ArrayList(hashSet), strOptString6, strOptString7);
        googleSignInAccount.f4051x = jSONObject.has("serverAuthCode") ? jSONObject.optString("serverAuthCode") : null;
        return googleSignInAccount;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        return googleSignInAccount.f4053z.equals(this.f4053z) && googleSignInAccount.m3369w().equals(m3369w());
    }

    public final int hashCode() {
        return ((this.f4053z.hashCode() + 527) * 31) + m3369w().hashCode();
    }

    /* JADX INFO: renamed from: w */
    public final HashSet m3369w() {
        HashSet hashSet = new HashSet(this.f4042A);
        hashSet.addAll(this.f4045D);
        return hashSet;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iM3589o = SafeParcelWriter.m3589o(20293, parcel);
        SafeParcelWriter.m3583i(parcel, 2, this.f4046s);
        SafeParcelWriter.m3583i(parcel, 3, this.f4047t);
        SafeParcelWriter.m3583i(parcel, 4, this.f4048u);
        SafeParcelWriter.m3583i(parcel, 5, this.f4049v);
        SafeParcelWriter.m3582h(parcel, 6, this.f4050w, i2);
        SafeParcelWriter.m3583i(parcel, 7, this.f4051x);
        SafeParcelWriter.m3588n(parcel, 8, 8);
        parcel.writeLong(this.f4052y);
        SafeParcelWriter.m3583i(parcel, 9, this.f4053z);
        SafeParcelWriter.m3587m(parcel, 10, this.f4042A);
        SafeParcelWriter.m3583i(parcel, 11, this.f4043B);
        SafeParcelWriter.m3583i(parcel, 12, this.f4044C);
        SafeParcelWriter.m3590p(iM3589o, parcel);
    }
}
