package com.instagram.common.viewpoint.core;

import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import androidx.vectordrawable.graphics.drawable.PathInterpolatorCompat;
import com.facebook.ads.AdError;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.facebook.ads.internal.util.activity.AdActivityIntent;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.OL */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class HandlerC3367OL extends Handler {
    public static byte[] A0A;
    public static String[] A0B = {"XpTFDRYls00C", "vck7ifrHAA2V1iiiFUM31a68qMrbz65A", "7kp6PJRyhpiDK2W7qsF8Tl5UxrhGPWlx", "kdOcXot4hr7W5LaxQbiu9WGktsRnBt7r", "NVDD45FTbKQ7iY36httqcibFke2pUkbB", "Eok23iuk6Oafvplk2kJb6Rczje1W7ylG", "EhR8LI8Shp7o1jykQx", "UYPguptf9M8vyKCeT3Zah9qOVZaP16c1"};
    public Messenger A00;
    public boolean A01;
    public boolean A02;
    public final ServiceConnection A03;
    public final Handler A04;
    public final Messenger A05;
    public final AbstractC4616ik A06;
    public final C4494gi A07;
    public final C4490ge A08;
    public final AbstractRunnableC3871Wc A09;

    public static String A04(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0A, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 86);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A07() {
        A0A = new byte[]{-30, -17, -25, -37, -63, -64, -59, -53, -42, -55, -51, -42, -72, -57, -57, -42, -58, -55, -64, -68, -59, -53, -72, -53, -64, -58, -59, -42, -62, -68, -48, -54, -35, -27, -25, -20, -35, -104, -21, -35, -22, -18, -31, -37, -35, -104, -35, -22, -22, -25, -22, -90, -84, -83, -85, -72, -102, -99, -72, -94, -99, -72, -92, -98, -78, 71, 58, 54, 72, 37, 74, 65, 54};
    }

    static {
        A07();
    }

    public HandlerC3367OL(C4494gi c4494gi, AbstractC4616ik abstractC4616ik) {
        super(Looper.getMainLooper());
        this.A04 = new Handler(Looper.getMainLooper());
        this.A03 = new ServiceConnectionC3366OK(this);
        this.A07 = c4494gi;
        this.A08 = c4494gi.A02();
        this.A05 = new Messenger(this);
        this.A06 = abstractC4616ik;
        this.A09 = new C4596iQ(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A05() {
        if (this.A01) {
            A0C();
            this.A00 = null;
        }
        this.A06.A09();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A06() {
        this.A00 = null;
        A0C();
        if (this.A06.A03().A6p() == EnumC3359OD.A06) {
            this.A07.A0F().AHx();
            this.A06.A0B(10, AdErrorType.INTERNAL_ERROR, null);
            return;
        }
        if (this.A06.A03().A6q() == EnumC3359OD.A07) {
            if (AbstractC3766Us.A08(this.A07)) {
                this.A07.A0F().AHn();
                if (this.A06 instanceof C23497Y) {
                    this.A06.AEs(1022, this.A06.A04(), null);
                    return;
                } else {
                    if (this.A06 instanceof C23487X) {
                        this.A06.AEs(PathInterpolatorCompat.MAX_NUM_POINTS, this.A06.A04(), null);
                        if (((C23487X) this.A06).A0E().A03 != null) {
                            this.A06.AEs(3002, this.A06.A04(), null);
                        }
                        this.A06.AEs(2110, this.A06.A04(), null);
                        return;
                    }
                    return;
                }
            }
            C4494gi c4494gi = this.A07;
            String[] strArr = A0B;
            if (strArr[1].charAt(8) == strArr[2].charAt(8)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0B;
            strArr2[3] = "cr4Q9HMWLwUnqKkNe0JHYa6bJM3GW5OO";
            strArr2[4] = "PiN7IKeRutrD0cCtifS7cTLBqsuq3alq";
            c4494gi.A0F().AHx();
            this.A06.A0B(10, AdErrorType.INTERNAL_ERROR, null);
            return;
        }
        if (this.A06.A03().A6p() != EnumC3359OD.A05) {
            return;
        }
        if (AbstractC3766Us.A0C(this.A07)) {
            this.A07.A0F().AI4();
            this.A06.A03().AAw();
            this.A06.A0D(true);
            this.A06.A09();
            return;
        }
        this.A07.A0F().AI3();
        this.A06.A03().AJR(new AdError(AdError.REMOTE_ADS_SERVICE_ERROR, A04(31, 21, 34)));
    }

    private void A08(Messenger messenger, int i2, Bundle bundle) throws RemoteException {
        Message messageObtain = Message.obtain((Handler) null, i2);
        messageObtain.replyTo = this.A05;
        if (bundle != null) {
            messageObtain.setData(bundle);
        }
        messageObtain.getData().putString(A04(52, 13, 3), this.A06.A04());
        messenger.send(messageObtain);
    }

    public static void A0B(C4494gi c4494gi, String str) {
        c4494gi.A0F().AHr(str);
        InterfaceC3656T5 interfaceC3656T5A0G = c4494gi.A0G();
        if (interfaceC3656T5A0G != null && interfaceC3656T5A0G.A6o() != null && interfaceC3656T5A0G.A6k() != null) {
            interfaceC3656T5A0G.A6o().onError(interfaceC3656T5A0G.A6k(), AdError.AD_PRESENTATION_ERROR);
        }
    }

    public final void A0C() {
        if (this.A01) {
            this.A07.A0F().AIG();
            this.A01 = false;
            this.A08.unbindService(this.A03);
        }
    }

    public final void A0D(C4494gi c4494gi, int i2) {
        this.A07.A0F().AIE();
        AdActivityIntent adActivityIntentA05 = C3889Wu.A05(c4494gi);
        adActivityIntentA05.putExtra(A04(65, 8, 123), EnumC3854WK.A0F);
        adActivityIntentA05.putExtra(A04(52, 13, 3), this.A06.A04());
        adActivityIntentA05.putExtra(A04(5, 26, 33), i2);
        try {
            int usedContext = C3889Wu.A00(c4494gi, adActivityIntentA05);
            this.A07.A0F().AIF(usedContext);
        } catch (C3887Ws e) {
            String strA04 = A04(0, 5, 75);
            Throwable cause = e.getCause();
            if (cause != null) {
                strA04 = strA04 + cause.toString();
            }
            A0B(c4494gi, strA04);
        }
    }

    public final void A0E(boolean z) {
        this.A01 = C3368OM.A04(this.A08, z, this.A03);
        if (this.A01) {
            this.A07.A0F().AHt();
            if (this.A00 == null) {
                this.A04.postDelayed(this.A09, AbstractC3766Us.A00(this.A08));
                return;
            }
            return;
        }
        this.A07.A0F().AI1();
        this.A02 = false;
        this.A06.A09();
    }

    public final boolean A0F(int i2, Bundle bundle) {
        try {
            Messenger service = this.A00;
            if (service != null) {
                A08(service, i2, bundle);
                return true;
            }
            return false;
        } catch (RemoteException e) {
            A0C();
            this.A07.A0F().AHw(e);
            return false;
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) throws Throwable {
        if (AbstractC3863WU.A02(this)) {
            return;
        }
        try {
            if (message.what == 3) {
                return;
            }
            if (message.what == 20 || message.what == 30 || message.what == 40) {
                if (message.what == 20) {
                    this.A07.A0F().AIB();
                    AbstractC3766Us.A07(this.A08);
                } else {
                    this.A07.A0F().AIA();
                }
                A05();
                return;
            }
            String adId = message.getData().getString(A04(52, 13, 3));
            if (!this.A06.A04().equals(adId)) {
                this.A07.A0F().AIH();
            } else if (message.what == 2001 || message.what == 1011) {
                C3368OM.A02(this.A08, message);
            } else {
                this.A07.A0F().AI2(message.what);
                this.A06.A0C(message);
            }
        } catch (Throwable th) {
            AbstractC3863WU.A00(th, this);
        }
    }
}
