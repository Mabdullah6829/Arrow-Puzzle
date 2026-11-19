package com.instagram.common.viewpoint.core;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import androidx.constraintlayout.widget.C1137R;
import com.facebook.ads.internal.api.BuildConfigApi;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.dJ */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C4284dJ {
    public static byte[] A08;
    public static String[] A09 = {"wHWy6mJnObE4TdegwzR1XIqaiMp2qzo2", "2kKTv183xGQoCJ4bH8MOQBKEcrYPubr8", "yAnU2m0QEWVpmJNiipOenY", "2CWVvRtjqdC7", "Y1Dj6sRIbzGHXk3FXnyOisKccxY5ExT7", "AAUb4pYdx4XqEM8CotKihUFr9wNvuug2", "KLTFv3N2v474XPM9CBPbC4npqkPjZQN", "uonDorlDhYGoL6YzDZYQroxkAXvFfbHU"};
    public WeakReference<C4277dC> A00;
    public WeakReference<InterfaceC3029Is> A01 = new WeakReference<>(null);
    public boolean A02 = false;
    public final C4494gi A03;
    public final C4264cz A04;
    public final String A05;
    public final String A06;
    public final WeakReference<InterfaceC3784VA> A07;

    public static String A01(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A08, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 12);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A09() {
        byte[] bArr = {-121, -109, -111, -111, -123, -110, -120, -110, -109, -108, -113, -93, -102, -94, 112, 127, 120, 107, -93, -78, -85, -85, -94, -87, -100, -96, -84, -95, -94, -86, -71, -78, -78, -87, -80, -93, -79, -87, -73, -73, -91, -85, -87, -15, 0, -7, -7, -16, -9, -22, -1, 4, -5, -16, -18, -24, -4, -56, -55, -72, -62, -67, -127, 114, -122, -124, 118, 117, 83, -118, 102, -124, 118, -125, -31, -30, -49, -32, -30, -45, -46, -80, -25, -61, -31, -45, -32, -14, -13, -32, -13, -28, -39, -42, -48, -81, -55, -35, -84, -105, -94, -85, -101};
        if (A09[5].charAt(6) == '8') {
            throw new RuntimeException();
        }
        A09[3] = "q8I1zS5uUBp9u7UYsB3eM38aYjAC";
        A08 = bArr;
    }

    static {
        A09();
    }

    public C4284dJ(C4494gi c4494gi, C4277dC c4277dC, InterfaceC3784VA interfaceC3784VA, C4264cz c4264cz, String str, String str2) {
        this.A03 = c4494gi;
        this.A00 = new WeakReference<>(c4277dC);
        this.A07 = new WeakReference<>(interfaceC3784VA);
        this.A04 = c4264cz;
        this.A05 = str;
        this.A06 = str2;
    }

    public static Map<String, String> A03(JSONObject jSONObject) {
        Iterator<String> itKeys = jSONObject.keys();
        HashMap map = new HashMap();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            map.put(next, jSONObject.optString(next));
        }
        return map;
    }

    private void A04() {
        InterfaceC3029Is uxListener = this.A01.get();
        if (uxListener == null) {
            return;
        }
        uxListener.close();
        if (A09[3].length() == 20) {
            throw new RuntimeException();
        }
        String[] strArr = A09;
        strArr[2] = "rLuDNCDiUJCt8jrcDw8nHa";
        strArr[6] = "w5dFeIXZRXYPRcNf7kYaeIakMq27def";
    }

    private void A05() {
        InterfaceC3029Is uxListener = this.A01.get();
        if (uxListener == null) {
            return;
        }
        uxListener.A9k();
    }

    private void A06() {
        InterfaceC3029Is uxListener = this.A01.get();
        if (uxListener == null) {
            return;
        }
        uxListener.AAm();
    }

    private void A07() {
        this.A03.A0F().A64();
        this.A02 = true;
        InterfaceC3029Is uxListener = this.A01.get();
        if (uxListener == null) {
            return;
        }
        uxListener.AKD();
        if (C3763Up.A1z(this.A03)) {
            this.A03.A0B().ADb();
        }
    }

    private void A08() {
        InterfaceC3029Is uxActionsJavascriptListener = this.A01.get();
        if (uxActionsJavascriptListener == null) {
            return;
        }
        uxActionsJavascriptListener.AE0();
    }

    private void A0A(C4277dC c4277dC, String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        SharedPreferences sharedPreferencesA00 = AbstractC3856WN.A00(this.A03);
        String strA01 = A01(57, 5, 77);
        String strA02 = A01(0, 0, 53);
        String storageValue = jSONObject.optString(strA01, strA02);
        String key = jSONObject.optString(A01(54, 3, C1137R.styleable.ConstraintSet_quantizeMotionSteps), A01(7, 7, 34));
        String string = sharedPreferencesA00.getString(A01(14, 4, 0) + key, strA02);
        if (string != null) {
            strA02 = string;
        }
        c4277dC.A0g(storageValue, strA02);
    }

    private void A0B(C4277dC c4277dC, String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        String strA01 = A01(98, 5, 42);
        String strA02 = A01(0, 0, 53);
        String strOptString = jSONObject.optString(strA01, strA02);
        String strOptString2 = jSONObject.optString(A01(57, 5, 77), strA02);
        AbstractC3856WN.A00(this.A03).edit().putString(A01(14, 4, 0) + jSONObject.optString(A01(54, 3, C1137R.styleable.ConstraintSet_quantizeMotionSteps), A01(7, 7, 34)), strOptString).apply();
        c4277dC.A0f(strOptString2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0C(EnumC4282dH enumC4282dH, String str) throws JSONException {
        switch (enumC4282dH.ordinal()) {
            case 0:
                A0I(new JSONObject(str));
                break;
            case 1:
                A06();
                break;
            case 2:
                A04();
                break;
            case 5:
                A07();
                break;
            case 7:
                if (BuildConfigApi.isDebug()) {
                }
                break;
            case 8:
                A0K(new JSONObject(str));
                break;
            case 9:
                A0L(new JSONObject(str));
                break;
            case 10:
                A05();
            case 11:
                this.A03.A0F().A6G(str);
                break;
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
                A0D(enumC4282dH, str);
                break;
            case 19:
                A0J(new JSONObject(str));
                break;
            case 20:
                A08();
                break;
            case 21:
                A0M(new JSONObject(str));
                break;
        }
        C4277dC c4277dC = this.A00.get();
        if (c4277dC == null) {
        }
        switch (enumC4282dH.ordinal()) {
            case 3:
                c4277dC.A0S();
                break;
            case 4:
                c4277dC.A0R();
                break;
            case 6:
                c4277dC.A0i(A03(new JSONObject(str)));
                break;
            case 17:
                A0B(c4277dC, str);
                break;
            case 18:
                A0A(c4277dC, str);
                break;
        }
    }

    private void A0D(EnumC4282dH enumC4282dH, String str) throws JSONException {
        InterfaceC3029Is interfaceC3029Is = this.A01.get();
        if (interfaceC3029Is == null) {
        }
        switch (enumC4282dH.ordinal()) {
            case 12:
                A0E(interfaceC3029Is, str);
                break;
            case 13:
                interfaceC3029Is.AE4();
                break;
            case 14:
                interfaceC3029Is.AFz();
                break;
            case 15:
                A0G(interfaceC3029Is, str);
                break;
            case 16:
                A0F(interfaceC3029Is, str);
                break;
        }
    }

    private void A0E(InterfaceC3029Is interfaceC3029Is, String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        String STATE_KEY = A01(87, 5, 115);
        interfaceC3029Is.AEu(jSONObject.optBoolean(STATE_KEY, false));
    }

    private void A0F(InterfaceC3029Is interfaceC3029Is, String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        String PAUSED_BY_USER_KEY = A01(62, 12, 5);
        interfaceC3029Is.AGX(jSONObject.optBoolean(PAUSED_BY_USER_KEY, false));
    }

    private void A0G(InterfaceC3029Is interfaceC3029Is, String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        String STARTED_BY_USER_KEY = A01(74, 13, 98);
        interfaceC3029Is.AGZ(jSONObject.optBoolean(STARTED_BY_USER_KEY, false));
    }

    private void A0I(JSONObject jSONObject) {
        InterfaceC3029Is interfaceC3029Is = this.A01.get();
        if (interfaceC3029Is == null) {
            return;
        }
        String productUrl = jSONObject.optString(A01(0, 7, 24));
        if (TextUtils.isEmpty(productUrl)) {
            interfaceC3029Is.A9f();
        } else {
            interfaceC3029Is.A9g(productUrl);
        }
    }

    private void A0J(JSONObject jSONObject) {
        InterfaceC3029Is uxListener = this.A01.get();
        if (uxListener == null) {
            return;
        }
        jSONObject.optString(A01(0, 7, 24));
    }

    private void A0K(JSONObject jSONObject) {
        InterfaceC3784VA interfaceC3784VA = this.A07.get();
        if (interfaceC3784VA == null) {
            return;
        }
        if (A09[3].length() == 20) {
            throw new RuntimeException();
        }
        A09[3] = "hDImTkFK3KoL7AYoPxXIP";
        String key = jSONObject.optString(A01(43, 11, 127));
        if (TextUtils.isEmpty(key)) {
            return;
        }
        C3792VI handler = new C3792VI(this.A06, interfaceC3784VA);
        handler.A05(key, A03(jSONObject));
    }

    private void A0L(JSONObject jSONObject) {
        int iOptInt = jSONObject.optInt(A01(18, 11, 49), -1);
        if (iOptInt == -1) {
            return;
        }
        String message = jSONObject.optString(A01(29, 14, 56));
        if (TextUtils.isEmpty(message)) {
            return;
        }
        this.A03.A0F().ABA(iOptInt, message);
        String[] strArr = A09;
        String message2 = strArr[2];
        String str = strArr[6];
        int length = message2.length();
        int code = str.length();
        if (length == code) {
            throw new RuntimeException();
        }
        String[] strArr2 = A09;
        strArr2[7] = "NCNoRnun1G3dlwmqoYaN2uZPLfccAkgr";
        strArr2[0] = "12RLbgldZ9TmNXvaOMkOvzOeimlYTJg9";
    }

    private void A0M(JSONObject jSONObject) {
        InterfaceC3029Is interfaceC3029Is = this.A01.get();
        if (interfaceC3029Is == null) {
            return;
        }
        String strA01 = A01(92, 6, 88);
        String[] strArr = A09;
        if (strArr[2].length() == strArr[6].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A09;
        strArr2[7] = "rydiERFHLfFXOcJD9tadKbqyFej0NUPk";
        strArr2[0] = "tiiagSBkZ4Sc0Tn3kexlzzs5G1JfuHdZ";
        String strOptString = jSONObject.optString(strA01);
        if (strOptString == null) {
            return;
        }
        interfaceC3029Is.AGo(strOptString);
    }

    public final void A0N(InterfaceC3029Is interfaceC3029Is) {
        this.A01 = new WeakReference<>(interfaceC3029Is);
    }

    public final boolean A0O() {
        return this.A02;
    }

    @JavascriptInterface
    public void postMessage(String str) {
        ExecutorC3959Y4.A00(new RunnableC4281dG(this, str));
    }
}
