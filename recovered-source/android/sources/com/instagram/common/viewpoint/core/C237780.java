package com.instagram.common.viewpoint.core;

import android.text.TextUtils;
import androidx.constraintlayout.widget.C1137R;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.80 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C237780 implements InterfaceC4700k8 {
    public static byte[] A09;
    public static String[] A0A = {"0TFgGHCmbDEnT", "P3BoNX3HbYs3p91Xznd9cH02Ego1LEzw", "OWrFl7C0gkEmqIZvATANnxtRvMpHSetZ", "XjLJU23F7IQ7TgYJbWjoa78", "8eUGin29aZrVydG4hLQZ04ng176drDiv", "tE42BGb8ExLW22Y3fw0IicKZ4ID1w2IZ", "N0c3cK9W7W98ikBdYu66t8J", "EarR2SOYmotvRVJvY11PbnGgxllwGrNq"};
    public InterfaceC3293N9 A01;
    public C3294NA A02;
    public C4676jk A03;
    public C4674ji A04;
    public C232176 A05;
    public InterfaceC4018Z1 A06;
    public C4019Z2 A07;
    public final String A08 = UUID.randomUUID().toString();
    public long A00 = -1;

    public static String A03(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A09, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 16);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A09 = new byte[]{-81, -64, -11, -19, -20, -15, -3, -11, -25, -6, -19, -21, -4, -23, -10, -17, -12, -19};
    }

    static {
        A04();
    }

    private void A05(C232176 c232176, C4674ji c4674ji, C3648Sx c3648Sx, InterfaceC3293N9 interfaceC3293N9, C4019Z2 c4019z2) {
        String strA7O = c4674ji.A7O();
        if (!TextUtils.isEmpty(strA7O)) {
            c3648Sx.A0e(new C3792VI(strA7O, c232176.A0A()));
        }
        C3811Vb c3811VbA0I = c4674ji.A0I();
        String[] strArr = A0A;
        String clientToken = strArr[3];
        if (clientToken.length() != strArr[6].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0A;
        strArr2[3] = "l0iKT0z7S0YTo68xxrsf1qJ";
        strArr2[6] = "FTb7Q8n5ne47CtPUjUxYv1n";
        if (c3811VbA0I != null) {
            C3646Sv c3646Sv = new C3646Sv(c4674ji.A0I().getUrl(), c4674ji.A0I().getHeight(), c4674ji.A0I().getWidth(), c4674ji.A0b(), A03(2, 16, C1137R.styleable.ConstraintSet_stateLabels));
            c3646Sv.A01 = new C3654T3(false, -1, -1);
            c3648Sx.A0W();
            c3648Sx.A0c(c3646Sv);
        }
        if (c4674ji.A0H() != null) {
            c3648Sx.A0c(new C3646Sv(c4674ji.A0H().getUrl(), c4674ji.A0H().getHeight(), c4674ji.A0H().getWidth(), c4674ji.A0b(), A03(2, 16, C1137R.styleable.ConstraintSet_stateLabels)));
        }
        String strA0e = c4674ji.A0e();
        if (strA0e != null && !TextUtils.isEmpty(strA0e)) {
            c3648Sx.A0b(new C3644St(strA0e, c4674ji.A0b(), A03(2, 16, C1137R.styleable.ConstraintSet_stateLabels), c4674ji.A0D()));
        }
        AbstractC4669jd abstractC4669jdA0F = c4674ji.A0F();
        String strA03 = A03(2, 16, C1137R.styleable.ConstraintSet_stateLabels);
        if (abstractC4669jdA0F != null) {
            AbstractC3346O0.A00(c4674ji.A0F(), c3648Sx, strA03);
        }
        C4688jw c4688jw = new C4688jw(this, c4019z2, interfaceC3293N9, c232176);
        String clientToken2 = c4674ji.A0b();
        c3648Sx.A0X(c4688jw, new C3641Sq(clientToken2, strA03));
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3285N1
    public final String A7O() {
        if (this.A04 == null) {
            return null;
        }
        return this.A04.A7O();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3285N1
    public final AdPlacementType A8k() {
        return AdPlacementType.MEDIUM_RECTANGLE;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC4700k8
    public final void AAt(C232176 c232176, InterfaceC3784VA interfaceC3784VA, EnumC3823Vp enumC3823Vp, InterfaceC3293N9 interfaceC3293N9, JSONObject jSONObject, C3710Tx c3710Tx) {
        c232176.A0F().A4N();
        this.A05 = c232176;
        this.A01 = interfaceC3293N9;
        C3648Sx c3648Sx = new C3648Sx(c232176);
        this.A00 = System.currentTimeMillis();
        C4674ji c4674jiA00 = AbstractC3302NI.A00(c232176, jSONObject, AbstractC3932Xd.A02(jSONObject, A03(0, 2, 60)));
        this.A04 = c4674jiA00;
        if (!AbstractC3282Mx.A06(c232176, c4674jiA00, interfaceC3784VA)) {
            InterfaceC4018Z1 adViewListener = new C4690jy(this, c232176);
            this.A06 = adViewListener;
            C4019Z2 c4019z2 = new C4019Z2(c232176, interfaceC3784VA, c3648Sx, new WeakReference(adViewListener), c3710Tx.A04(), c3710Tx.A07(), c3710Tx.A08(), c3710Tx.A09(), c4674jiA00, this.A08);
            this.A07 = c4019z2;
            this.A03 = new C4676jk(c232176, new C4689jx(this, c232176, interfaceC3293N9), c4019z2.getViewabilityChecker(), interfaceC3784VA, c4674jiA00);
            A05(c232176, c4674jiA00, c3648Sx, interfaceC3293N9, c4019z2);
            this.A02 = new C3294NA(c232176, this.A08, this, interfaceC3293N9);
            this.A02.A02();
            return;
        }
        c232176.A0F().A52();
        interfaceC3293N9.AEN(this, C3821Vm.A00(AdErrorType.NO_FILL));
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3285N1
    public final boolean AKL() {
        return false;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3285N1
    public final void onDestroy() {
        if (this.A05 != null) {
            InterfaceC4731kf interfaceC4731kfA0F = this.A05.A0F();
            String[] strArr = A0A;
            if (strArr[1].charAt(24) == strArr[4].charAt(24)) {
                throw new RuntimeException();
            }
            A0A[7] = "tMGyCfr9ucO4oWdztKDfdPlDfRrhkMp8";
            interfaceC4731kfA0F.A4L(this.A07 != null);
        }
        if (this.A07 != null) {
            this.A07.A0I();
            this.A07 = null;
            this.A06 = null;
        }
        C3294NA c3294na = this.A02;
        if (A0A[0].length() == 16) {
            throw new RuntimeException();
        }
        A0A[7] = "5ZoCIskAsYlLTmabnaeKVzywNB4LbbVC";
        if (c3294na != null) {
            this.A02.A03();
        }
    }
}
