package com.instagram.common.viewpoint.core;

import android.view.View;
import androidx.work.WorkRequest;
import com.facebook.ads.internal.protocol.AdErrorType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.7k */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C23617k extends AbstractC4632j0 {
    public static byte[] A03;
    public long A00;
    public View A01;
    public C232176 A02;

    static {
        A05();
    }

    public static String A03(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 81);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        A03 = new byte[]{20, 23, 38, -15, -16, -3, -3, -12, 1, -18, 1, -12, -11, 1, -12, 2, -9, -18, 3, -8, -4, -12, -5, 0, -7, 1, 6, -9, 8, -7, 10, -7, 5, 11, 38, 55, 27, 40, 40, 37, 40, -42, 45, 30, 31, 34, 27, -42, 38, 23, 40, 41, 31, 36, 29, -42, 25, 30, 23, 31, 36, 27, 26, -42, 23, 26, 41, -42, -8, 23, 36, 36, 27, 40};
    }

    public C23617k(C232176 c232176, C3353O7 c3353o7) {
        super(c232176, c3353o7);
        this.A00 = WorkRequest.MIN_BACKOFF_MILLIS;
        this.A02 = c232176;
    }

    private C4635j3 A01(Runnable runnable) {
        return new C4635j3(this, runnable);
    }

    private List<JSONObject> A04(C3354O8 c3354o8) {
        ArrayList arrayList = new ArrayList();
        JSONObject jSONObjectA03 = c3354o8.A03();
        String strA03 = A03(22, 12, 71);
        if (jSONObjectA03.has(strA03)) {
            try {
                this.A00 = jSONObjectA03.getJSONObject(strA03).optInt(A03(3, 19, 62), 10000);
                JSONArray adsArray = jSONObjectA03.getJSONArray(A03(0, 3, 98));
                if (adsArray.length() > 0) {
                    for (int i2 = 0; i2 < adsArray.length(); i2++) {
                        arrayList.add((JSONObject) adsArray.get(i2));
                    }
                }
            } catch (JSONException unused) {
                String strA04 = A03(36, 38, 101);
                this.A02.A0F().A5g(C3821Vm.A01(AdErrorType.UNKNOWN_ERROR, strA04).A03().getErrorCode(), strA04);
                return arrayList;
            }
        } else {
            arrayList.add(jSONObjectA03);
        }
        return arrayList;
    }

    private void A06(InterfaceC4700k8 interfaceC4700k8, JSONObject jSONObject, C3710Tx c3710Tx) {
        this.A0C = false;
        C4634j2 c4634j2 = new C4634j2(this, interfaceC4700k8, AbstractC3932Xd.A02(jSONObject, A03(34, 2, 114)));
        A0H().postDelayed(c4634j2, c3710Tx.A05());
        interfaceC4700k8.AAt(this.A02, this.A09, this.A08.A08, A01(c4634j2), jSONObject, c3710Tx);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC4632j0
    public final void A0P() {
        if (this.A01 != null) {
            this.A02.A0F().A4e();
            this.A07.A0E(this.A01);
        } else {
            this.A02.A0F().A4f();
        }
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC4632j0
    public final void A0R(InterfaceC3285N1 interfaceC3285N1, C3709Tw c3709Tw, C3707Tu c3707Tu, final C3354O8 c3354o8) {
        this.A02.A0F().A4Y();
        final InterfaceC4700k8 interfaceC4700k8 = (InterfaceC4700k8) interfaceC3285N1;
        if (interfaceC4700k8.AKL()) {
            final List<JSONObject> listA04 = A04(c3354o8);
            A06(interfaceC4700k8, listA04.get(0), c3354o8.A01());
            if (listA04.size() > 1) {
                A0H().postDelayed(new Runnable() { // from class: com.facebook.ads.redexgen.X.O9
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.A02.A0a(interfaceC4700k8, listA04, c3354o8);
                    }
                }, this.A00);
                return;
            }
            return;
        }
        A06(interfaceC4700k8, c3354o8.A03(), c3354o8.A01());
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC4632j0
    public final void A0U(String str) {
        this.A02.A0F().A4d(str != null);
        super.A0U(str);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC4632j0
    public final void A0Y(boolean z) {
        super.A0Y(z);
        this.A01 = null;
    }

    public final /* synthetic */ void A0a(InterfaceC4700k8 interfaceC4700k8, List list, C3354O8 c3354o8) {
        A06(interfaceC4700k8, (JSONObject) list.get(1), c3354o8.A01());
    }
}
