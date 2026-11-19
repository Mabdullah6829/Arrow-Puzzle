package com.instagram.common.viewpoint.core;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.core.view.ViewCompat;
import com.facebook.ads.RewardData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bi */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C4185bi extends FrameLayout {
    public static String[] A08 = {"Q8PK8a4jCXFMgXydViX", "2t", "0mtDJDWqZSrfiocTEOLDLA", "JwyFxt7bdt7eCUIm0ln", "fPboxvDBMmOISakSS", "MBnzPw5d2FxZEvBrnzM1TlMBrMh4WSuO", "jLpHRmCuYtO7UfmYbZzhe3ed5a74x24O", "3APcS373YHqcuLzV9G"};
    public AbstractC3992Yb A00;
    public C4020Z3 A01;
    public final AbstractC4669jd A02;
    public final C4494gi A03;
    public final InterfaceC3998Yh A04;
    public final InterfaceC4184bh A05;
    public final C2775Ek A06;
    public final List<View> A07;

    public C4185bi(C4210c7 c4210c7, AbstractC4669jd abstractC4669jd, C2775Ek c2775Ek, C2702DZ c2702dz, AbstractC4156bF abstractC4156bF, InterfaceC3998Yh interfaceC3998Yh, InterfaceC4184bh interfaceC4184bh) {
        this(c4210c7, abstractC4669jd, c2775Ek, interfaceC3998Yh, interfaceC4184bh, c2702dz, abstractC4156bF);
    }

    public C4185bi(C4210c7 c4210c7, AbstractC4669jd abstractC4669jd, C2775Ek c2775Ek, InterfaceC3998Yh interfaceC3998Yh, InterfaceC4184bh interfaceC4184bh, View... viewArr) {
        this(c4210c7.A06(), c4210c7.A0B(), abstractC4669jd, c2775Ek, interfaceC3998Yh, interfaceC4184bh, viewArr);
    }

    public C4185bi(C4494gi c4494gi, AbstractC3992Yb abstractC3992Yb, AbstractC4669jd abstractC4669jd, C2775Ek c2775Ek, InterfaceC3998Yh interfaceC3998Yh, InterfaceC4184bh interfaceC4184bh, View... viewArr) {
        super(c4494gi);
        this.A07 = new ArrayList();
        this.A03 = c4494gi;
        this.A00 = abstractC3992Yb;
        this.A02 = abstractC4669jd;
        for (View view : viewArr) {
            if (view != null) {
                this.A07.add(view);
            }
        }
        this.A04 = interfaceC3998Yh;
        this.A06 = c2775Ek;
        this.A05 = interfaceC4184bh;
        A04();
    }

    private void A04() {
        String strA06;
        RewardData rewardDataA0s = this.A02.A0s();
        if (rewardDataA0s == null) {
            strA06 = this.A02.A2B().A05();
        } else {
            strA06 = this.A02.A2B().A06(rewardDataA0s.getCurrency(), rewardDataA0s.getQuantity());
        }
        this.A01 = new C4020Z3(this.A03, -1, ViewCompat.MEASURED_STATE_MASK, strA06, null, this.A02.A2B().A04(), this.A02.A2B().A03(), AbstractC3978YN.A01(EnumC3977YM.REWARD_ICON));
        this.A01.A02.setOnClickListener(new ViewOnClickListenerC4182bf(this));
        this.A01.A01.setOnClickListener(new ViewOnClickListenerC4183bg(this));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        addView(this.A01, layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A05() {
        if (this.A06 != null) {
            this.A06.A0d(EnumC4373el.A07);
        }
        this.A05.ACt();
        if (!this.A02.A29().A0V()) {
            this.A02.A2H(this.A04);
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0042  */
    /* JADX WARN: Code duplicated, block: B:18:0x0066  */
    /* JADX WARN: Code duplicated, block: B:20:0x0074 A[LOOP:0: B:15:0x004d->B:20:0x0074, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:23:0x0024 A[EDGE_INSN: B:23:0x0024->B:8:0x0024 BREAK  A[LOOP:0: B:15:0x004d->B:20:0x0074], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:24:0x0081 A[SYNTHETIC] */
    public final void A07(ViewGroup viewGroup) {
        Iterator<View> it;
        boolean zHasNext;
        String[] strArr;
        if (this.A06 != null && !this.A06.A0o()) {
            C2775Ek c2775Ek = this.A06;
            String[] strArr2 = A08;
            if (strArr2[0].length() == strArr2[3].length()) {
                String[] strArr3 = A08;
                strArr3[4] = "1Ran1dt8ESvXQPCOL";
                strArr3[1] = "wn";
                c2775Ek.A0j(false, false, 11);
                AbstractC3966YB.A0O(this.A06, 4);
                if (this.A00 != null) {
                    AbstractC3966YB.A0H(this.A00);
                }
                it = this.A07.iterator();
                while (true) {
                    zHasNext = it.hasNext();
                    strArr = A08;
                    if (strArr[5].charAt(31) != strArr[6].charAt(31)) {
                        break;
                        break;
                    }
                    String[] strArr4 = A08;
                    strArr4[0] = "6LHnkwVNW3v3BurcJpp";
                    strArr4[3] = "pBsoAnuzgJgS4JAM4BB";
                    if (zHasNext) {
                        View next = it.next();
                        next.clearAnimation();
                        AbstractC3966YB.A0O(next, 4);
                    } else {
                        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                        viewGroup.addView(this, layoutParams);
                        this.A05.AEn();
                        return;
                    }
                }
            }
        } else {
            if (this.A00 != null) {
                AbstractC3966YB.A0H(this.A00);
            }
            it = this.A07.iterator();
            while (true) {
                zHasNext = it.hasNext();
                strArr = A08;
                if (strArr[5].charAt(31) != strArr[6].charAt(31)) {
                    break;
                }
                String[] strArr5 = A08;
                strArr5[0] = "6LHnkwVNW3v3BurcJpp";
                strArr5[3] = "pBsoAnuzgJgS4JAM4BB";
                if (zHasNext) {
                    View next2 = it.next();
                    next2.clearAnimation();
                    AbstractC3966YB.A0O(next2, 4);
                } else {
                    RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
                    viewGroup.addView(this, layoutParams2);
                    this.A05.AEn();
                    return;
                }
            }
        }
        throw new RuntimeException();
    }
}
