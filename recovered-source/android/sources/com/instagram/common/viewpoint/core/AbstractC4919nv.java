package com.instagram.common.viewpoint.core;

import android.os.Handler;
import android.os.Looper;
import com.facebook.ads.androidx.media3.common.Timeline;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.nv */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC4919nv implements InterfaceC2664Cx {
    public static String[] A07 = {"KBisateWM8YQ4arKDgRYpdTDxezzMkCv", "VJ2uSooodcJBZOLyoDYKaqw5tYDrMz4W", "bemaZsDF2tY6J54Bg3tOUH55klLpC", "LnVxhCvG0lD6F7ZPu", "7ofy39p1yDzqV7NnIWFVVnn8VzEJdml2", "3pklWVRHTZe0TjeZrFE3TnxhkITdP", "TfKHOeXRiNIOMg3PDS", "WMeybOD3P6lu5fyh7Idh"};
    public Looper A00;
    public Timeline A01;
    public C24018O A02;
    public final ArrayList<InterfaceC2663Cw> A05 = new ArrayList<>(1);
    public final HashSet<InterfaceC2663Cw> A06 = new HashSet<>(1);
    public final C2675D8 A04 = new C2675D8();
    public final C2484A1 A03 = new C2484A1();

    public abstract void A09();

    public abstract void A0A(InterfaceC22465t interfaceC22465t);

    public final C24018O A00() {
        return (C24018O) AbstractC21273y.A02(this.A02);
    }

    public final C2484A1 A01(C4912no c4912no) {
        return this.A03.A00(0, c4912no);
    }

    public final C2675D8 A02(C4912no c4912no) {
        return this.A04.A02(0, c4912no, 0L);
    }

    public void A03() {
    }

    public void A04() {
    }

    public final void A05(Timeline timeline) {
        this.A01 = timeline;
        Iterator<InterfaceC2663Cw> it = this.A05.iterator();
        while (it.hasNext()) {
            it.next().AG1(this, timeline);
        }
    }

    public final void A06(InterfaceC2663Cw interfaceC2663Cw) {
        boolean z = !this.A06.isEmpty();
        this.A06.remove(interfaceC2663Cw);
        if (z) {
            boolean wasEnabled = this.A06.isEmpty();
            if (wasEnabled) {
                A03();
            }
        }
    }

    public final void A07(InterfaceC2663Cw interfaceC2663Cw) {
        AbstractC21273y.A01(this.A00);
        boolean zIsEmpty = this.A06.isEmpty();
        this.A06.add(interfaceC2663Cw);
        if (zIsEmpty) {
            A04();
        }
    }

    /* JADX WARN: Code duplicated, block: B:6:0x000c  */
    public final void A08(InterfaceC2663Cw interfaceC2663Cw, InterfaceC22465t interfaceC22465t, C24018O c24018o) {
        boolean z;
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.A00;
        if (looper != null) {
            Looper looper2 = this.A00;
            if (looper2 == looperMyLooper) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = true;
        }
        AbstractC21273y.A07(z);
        this.A02 = c24018o;
        Timeline timeline = this.A01;
        this.A05.add(interfaceC2663Cw);
        Looper looper3 = this.A00;
        if (looper3 == null) {
            this.A00 = looperMyLooper;
            this.A06.add(interfaceC2663Cw);
            A0A(interfaceC22465t);
        } else {
            if (timeline == null) {
                return;
            }
            A07(interfaceC2663Cw);
            interfaceC2663Cw.AG1(this, timeline);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2664Cx
    public final void A3z(Handler handler, InterfaceC2676D9 interfaceC2676D9) {
        AbstractC21273y.A01(handler);
        AbstractC21273y.A01(interfaceC2676D9);
        this.A04.A04(handler, interfaceC2676D9);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2664Cx
    public final void AH7(InterfaceC2663Cw interfaceC2663Cw, InterfaceC22465t interfaceC22465t) {
        A08(interfaceC2663Cw, interfaceC22465t, C24018O.A03);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2664Cx
    public final void AHl(InterfaceC2663Cw interfaceC2663Cw) {
        this.A05.remove(interfaceC2663Cw);
        if (this.A05.isEmpty()) {
            this.A00 = null;
            this.A01 = null;
            this.A02 = null;
            this.A06.clear();
            String[] strArr = A07;
            if (strArr[2].length() != strArr[5].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A07;
            strArr2[3] = "pnZ7WVnnf2PAl7J7h";
            strArr2[6] = "ddcJoNElLz9Uvwup8w";
            A09();
            return;
        }
        A06(interfaceC2663Cw);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2664Cx
    public final void AIS(InterfaceC2676D9 interfaceC2676D9) {
        this.A04.A0D(interfaceC2676D9);
    }
}
