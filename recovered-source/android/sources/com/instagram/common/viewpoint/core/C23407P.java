package com.instagram.common.viewpoint.core;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.7P */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C23407P extends AbstractC4548ha {
    public static TimeInterpolator A0B;
    public static String[] A0C = {"5", "w4FteHoxEZNBcBknXysU1QdwgOlgu", "XTfmSewcFvVIPqcU8HiF2JwhBroc2", "gTOT0dcLAsFp3JXaujmr6eSvv", "MioH3rC6822UBFONR3LUPujrkCbYq", "9Rk7JcSITmrZ17kamSQ7i6v9RKdnt", "plmSW6Ql", "PR6dCqey"};
    public ArrayList<AbstractC3548RK> A0A = new ArrayList<>();
    public ArrayList<AbstractC3548RK> A07 = new ArrayList<>();
    public ArrayList<C3503Qa> A09 = new ArrayList<>();
    public ArrayList<C3502QZ> A08 = new ArrayList<>();
    public ArrayList<ArrayList<AbstractC3548RK>> A01 = new ArrayList<>();
    public ArrayList<ArrayList<C3503Qa>> A05 = new ArrayList<>();
    public ArrayList<ArrayList<C3502QZ>> A03 = new ArrayList<>();
    public ArrayList<AbstractC3548RK> A00 = new ArrayList<>();
    public ArrayList<AbstractC3548RK> A04 = new ArrayList<>();
    public ArrayList<AbstractC3548RK> A06 = new ArrayList<>();
    public ArrayList<AbstractC3548RK> A02 = new ArrayList<>();

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 9 out of bounds for length 9
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    @Override // com.instagram.common.viewpoint.core.AbstractC3526Qy
    public final void A0H() {
        int size;
        for (int size2 = this.A09.size() - 1; size2 >= 0; size2--) {
            C3503Qa c3503Qa = this.A09.get(size2);
            View view = c3503Qa.A04.A0H;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            A0U(c3503Qa.A04);
            this.A09.remove(size2);
        }
        for (int size3 = this.A0A.size() - 1; size3 >= 0; size3--) {
            A0V(this.A0A.get(size3));
            this.A0A.remove(size3);
        }
        for (int size4 = this.A07.size() - 1; size4 >= 0; size4--) {
            AbstractC3548RK abstractC3548RK = this.A07.get(size4);
            abstractC3548RK.A0H.setAlpha(1.0f);
            A0T(abstractC3548RK);
            this.A07.remove(size4);
        }
        for (int size5 = this.A08.size() - 1; size5 >= 0; size5--) {
            ArrayList<C3502QZ> arrayList = this.A08;
            String[] strArr = A0C;
            if (strArr[0].length() == strArr[3].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0C;
            strArr2[4] = "IUveBZzBDFrSzC13ImzzVKkvQDdr2";
            strArr2[5] = "sCoWws78k8eiD0jPt8s7ggXNZv987";
            A00(arrayList.get(size5));
        }
        this.A08.clear();
        if (A0M()) {
            for (int size6 = this.A05.size() - 1; size6 >= 0; size6--) {
                ArrayList<C3503Qa> arrayList2 = this.A05.get(size6);
                for (int size7 = arrayList2.size() - 1; size7 >= 0; size7--) {
                    C3503Qa c3503Qa2 = arrayList2.get(size7);
                    View view2 = c3503Qa2.A04.A0H;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    A0U(c3503Qa2.A04);
                    arrayList2.remove(size7);
                    if (arrayList2.isEmpty()) {
                        this.A05.remove(arrayList2);
                    }
                }
            }
            for (int size8 = this.A01.size() - 1; size8 >= 0; size8--) {
                ArrayList<AbstractC3548RK> arrayList3 = this.A01.get(size8);
                for (int size9 = arrayList3.size() - 1; size9 >= 0; size9--) {
                    AbstractC3548RK abstractC3548RK2 = arrayList3.get(size9);
                    abstractC3548RK2.A0H.setAlpha(1.0f);
                    A0T(abstractC3548RK2);
                    arrayList3.remove(size9);
                    if (arrayList3.isEmpty()) {
                        ArrayList<ArrayList<AbstractC3548RK>> arrayList4 = this.A01;
                        String[] strArr3 = A0C;
                        if (strArr3[0].length() != strArr3[3].length()) {
                            String[] strArr4 = A0C;
                            strArr4[7] = "VBPMrKBD";
                            strArr4[6] = "WZFlfD4M";
                            arrayList4.remove(arrayList3);
                        } else {
                            arrayList4.remove(arrayList3);
                        }
                    }
                }
            }
            ArrayList<ArrayList<C3502QZ>> arrayList5 = this.A03;
            String[] strArr5 = A0C;
            if (strArr5[7].length() != strArr5[6].length()) {
                size = arrayList5.size() - 1;
            } else {
                String[] strArr6 = A0C;
                strArr6[2] = "1rfkrkAxI3SWkdgenr27gUX73o6p1";
                strArr6[1] = "SSeA7srmTqf1oxxrlzMYS1BTDHSjo";
                size = arrayList5.size() - 1;
            }
            while (size >= 0) {
                ArrayList<C3502QZ> arrayList6 = this.A03.get(size);
                for (int size10 = arrayList6.size() - 1; size10 >= 0; size10--) {
                    A00(arrayList6.get(size10));
                    if (arrayList6.isEmpty()) {
                        this.A03.remove(arrayList6);
                    }
                }
                size--;
            }
            A03(this.A06);
            A03(this.A04);
            A03(this.A00);
            A03(this.A02);
            A0G();
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.instagram.common.viewpoint.core.AbstractC4548ha
    public final boolean A0Z(AbstractC3548RK abstractC3548RK, int i2, int i3, int i4, int i5) {
        View view = abstractC3548RK.A0H;
        int translationX = i2 + ((int) abstractC3548RK.A0H.getTranslationX());
        int translationY = i3 + ((int) abstractC3548RK.A0H.getTranslationY());
        A02(abstractC3548RK);
        int i6 = i4 - translationX;
        int i7 = i5 - translationY;
        if (i6 == 0 && i7 == 0) {
            A0U(abstractC3548RK);
            return false;
        }
        if (i6 != 0) {
            view.setTranslationX(-i6);
        }
        if (i7 != 0) {
            view.setTranslationY(-i7);
        }
        this.A09.add(new C3503Qa(abstractC3548RK, translationX, translationY, i4, i5));
        return true;
    }

    private void A00(C3502QZ c3502qz) {
        if (c3502qz.A05 != null) {
            A05(c3502qz, c3502qz.A05);
        }
        if (c3502qz.A04 != null) {
            A05(c3502qz, c3502qz.A04);
        }
    }

    private void A01(AbstractC3548RK abstractC3548RK) {
        View view = abstractC3548RK.A0H;
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.A06.add(abstractC3548RK);
        ViewPropertyAnimator animation = viewPropertyAnimatorAnimate.setDuration(A0D());
        animation.alpha(0.0f).setListener(new C3497QU(this, abstractC3548RK, viewPropertyAnimatorAnimate, view)).start();
    }

    private void A02(AbstractC3548RK abstractC3548RK) {
        if (A0B == null) {
            A0B = new ValueAnimator().getInterpolator();
        }
        abstractC3548RK.A0H.animate().setInterpolator(A0B);
        A0L(abstractC3548RK);
    }

    private final void A03(List<AbstractC3548RK> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            list.get(size).A0H.animate().cancel();
        }
    }

    private void A04(List<C3502QZ> list, AbstractC3548RK abstractC3548RK) {
        for (int size = list.size() - 1; size >= 0; size--) {
            C3502QZ changeInfo = list.get(size);
            if (A05(changeInfo, abstractC3548RK) && changeInfo.A05 == null && changeInfo.A04 == null) {
                list.remove(changeInfo);
            }
        }
    }

    private boolean A05(C3502QZ c3502qz, AbstractC3548RK abstractC3548RK) {
        boolean z = false;
        if (c3502qz.A04 == abstractC3548RK) {
            c3502qz.A04 = null;
        } else {
            AbstractC3548RK abstractC3548RK2 = c3502qz.A05;
            String[] strArr = A0C;
            if (strArr[2].length() != strArr[1].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0C;
            strArr2[0] = "F";
            strArr2[3] = "q2hYYatvKRTsdUwOPBYP5pb4s";
            if (abstractC3548RK2 == abstractC3548RK) {
                c3502qz.A05 = null;
                z = true;
            } else {
                return false;
            }
        }
        abstractC3548RK.A0H.setAlpha(1.0f);
        abstractC3548RK.A0H.setTranslationX(0.0f);
        abstractC3548RK.A0H.setTranslationY(0.0f);
        A0W(abstractC3548RK, z);
        return true;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3526Qy
    public final void A0I() {
        boolean z = !this.A0A.isEmpty();
        boolean removalsPending = this.A09.isEmpty();
        boolean z2 = !removalsPending;
        boolean removalsPending2 = this.A08.isEmpty();
        boolean z3 = !removalsPending2;
        boolean removalsPending3 = this.A07.isEmpty();
        boolean z4 = !removalsPending3;
        if (!z && !z2 && !z4 && !z3) {
            return;
        }
        Iterator<AbstractC3548RK> it = this.A0A.iterator();
        while (removalsPending) {
            A01(it.next());
        }
        this.A0A.clear();
        if (z2) {
            ArrayList<C3503Qa> arrayList = new ArrayList<>();
            arrayList.addAll(this.A09);
            this.A05.add(arrayList);
            this.A09.clear();
            RunnableC3494QR runnableC3494QR = new RunnableC3494QR(this, arrayList);
            if (z) {
                AbstractC3449Ph.A0E(arrayList.get(0).A04.A0H, runnableC3494QR, A0D());
            } else {
                runnableC3494QR.run();
            }
        }
        if (z3) {
            ArrayList<C3502QZ> arrayList2 = new ArrayList<>();
            arrayList2.addAll(this.A08);
            this.A03.add(arrayList2);
            this.A08.clear();
            RunnableC3495QS runnableC3495QS = new RunnableC3495QS(this, arrayList2);
            if (z) {
                AbstractC3449Ph.A0E(arrayList2.get(0).A05.A0H, runnableC3495QS, A0D());
            } else {
                runnableC3495QS.run();
            }
        }
        if (z4) {
            ArrayList<AbstractC3548RK> arrayList3 = new ArrayList<>();
            arrayList3.addAll(this.A07);
            this.A01.add(arrayList3);
            this.A07.clear();
            RunnableC3496QT runnableC3496QT = new RunnableC3496QT(this, arrayList3);
            if (z || z2 || z3) {
                AbstractC3449Ph.A0E(arrayList3.get(0).A0H, runnableC3496QT, Math.max(z2 ? A0C() : 0L, z3 ? A0B() : 0L) + (z ? A0D() : 0L));
            } else {
                runnableC3496QT.run();
            }
        }
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3526Qy
    public final void A0L(AbstractC3548RK abstractC3548RK) {
        View view = abstractC3548RK.A0H;
        view.animate().cancel();
        for (int i2 = this.A09.size() - 1; i2 >= 0; i2--) {
            if (this.A09.get(i2).A04 == abstractC3548RK) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                A0U(abstractC3548RK);
                this.A09.remove(i2);
            }
        }
        A04(this.A08, abstractC3548RK);
        if (this.A0A.remove(abstractC3548RK)) {
            view.setAlpha(1.0f);
            A0V(abstractC3548RK);
        }
        if (this.A07.remove(abstractC3548RK)) {
            view.setAlpha(1.0f);
            String[] strArr = A0C;
            if (strArr[2].length() != strArr[1].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0C;
            strArr2[4] = "yxRUaByjpu2evyevZXzo5CX3I8dRP";
            strArr2[5] = "IuT2zeZcrCaCkdpAEhiSgQgKuQzMH";
            A0T(abstractC3548RK);
        }
        for (int i3 = this.A03.size() - 1; i3 >= 0; i3--) {
            ArrayList<C3502QZ> arrayList = this.A03.get(i3);
            A04(arrayList, abstractC3548RK);
            if (arrayList.isEmpty()) {
                this.A03.remove(i3);
            }
        }
        for (int size = this.A05.size() - 1; size >= 0; size--) {
            ArrayList<C3503Qa> arrayList2 = this.A05.get(size);
            for (int i4 = arrayList2.size() - 1; i4 >= 0; i4--) {
                if (arrayList2.get(i4).A04 == abstractC3548RK) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    A0U(abstractC3548RK);
                    arrayList2.remove(i4);
                    if (!arrayList2.isEmpty()) {
                        break;
                    }
                    this.A05.remove(size);
                    break;
                }
            }
        }
        for (int size2 = this.A01.size() - 1; size2 >= 0; size2--) {
            ArrayList<AbstractC3548RK> arrayList3 = this.A01.get(size2);
            if (arrayList3.remove(abstractC3548RK)) {
                view.setAlpha(1.0f);
                A0T(abstractC3548RK);
                if (arrayList3.isEmpty()) {
                    this.A01.remove(size2);
                }
            }
        }
        this.A06.remove(abstractC3548RK);
        this.A00.remove(abstractC3548RK);
        this.A02.remove(abstractC3548RK);
        this.A04.remove(abstractC3548RK);
        A0b();
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3526Qy
    public final boolean A0M() {
        return (this.A07.isEmpty() && this.A08.isEmpty() && this.A09.isEmpty() && this.A0A.isEmpty() && this.A04.isEmpty() && this.A06.isEmpty() && this.A00.isEmpty() && this.A02.isEmpty() && this.A05.isEmpty() && this.A01.isEmpty() && this.A03.isEmpty()) ? false : true;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3526Qy
    public final boolean A0S(AbstractC3548RK abstractC3548RK, List<Object> payloads) {
        return !payloads.isEmpty() || super.A0S(abstractC3548RK, payloads);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC4548ha
    public final boolean A0X(AbstractC3548RK abstractC3548RK) {
        A02(abstractC3548RK);
        abstractC3548RK.A0H.setAlpha(0.0f);
        this.A07.add(abstractC3548RK);
        return true;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC4548ha
    public final boolean A0Y(AbstractC3548RK abstractC3548RK) {
        A02(abstractC3548RK);
        this.A0A.add(abstractC3548RK);
        return true;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC4548ha
    public final boolean A0a(AbstractC3548RK abstractC3548RK, AbstractC3548RK abstractC3548RK2, int i2, int i3, int i4, int i5) {
        if (abstractC3548RK == abstractC3548RK2) {
            return A0Z(abstractC3548RK, i2, i3, i4, i5);
        }
        float translationX = abstractC3548RK.A0H.getTranslationX();
        float translationY = abstractC3548RK.A0H.getTranslationY();
        float prevTranslationY = abstractC3548RK.A0H.getAlpha();
        A02(abstractC3548RK);
        float prevTranslationX = i4 - i2;
        int deltaY = (int) (prevTranslationX - translationX);
        float prevTranslationX2 = i5 - i3;
        int deltaX = (int) (prevTranslationX2 - translationY);
        abstractC3548RK.A0H.setTranslationX(translationX);
        abstractC3548RK.A0H.setTranslationY(translationY);
        abstractC3548RK.A0H.setAlpha(prevTranslationY);
        if (abstractC3548RK2 != null) {
            A02(abstractC3548RK2);
            float prevTranslationX3 = -deltaY;
            abstractC3548RK2.A0H.setTranslationX(prevTranslationX3);
            float prevTranslationX4 = -deltaX;
            abstractC3548RK2.A0H.setTranslationY(prevTranslationX4);
            abstractC3548RK2.A0H.setAlpha(0.0f);
        }
        this.A08.add(new C3502QZ(abstractC3548RK, abstractC3548RK2, i2, i3, i4, i5));
        return true;
    }

    public final void A0b() {
        if (!A0M()) {
            A0G();
        }
    }

    public final void A0c(C3502QZ c3502qz) {
        View view;
        AbstractC3548RK holder = c3502qz.A05;
        if (holder == null) {
            view = null;
        } else {
            view = holder.A0H;
        }
        AbstractC3548RK holder2 = c3502qz.A04;
        View view2 = holder2 != null ? holder2.A0H : null;
        if (view != null) {
            ViewPropertyAnimator oldViewAnim = view.animate().setDuration(A0B());
            this.A02.add(c3502qz.A05);
            oldViewAnim.translationX(c3502qz.A02 - c3502qz.A00);
            oldViewAnim.translationY(c3502qz.A03 - c3502qz.A01);
            oldViewAnim.alpha(0.0f).setListener(new C3500QX(this, c3502qz, oldViewAnim, view)).start();
        }
        if (view2 != null) {
            ViewPropertyAnimator viewPropertyAnimatorAnimate = view2.animate();
            this.A02.add(c3502qz.A04);
            viewPropertyAnimatorAnimate.translationX(0.0f).translationY(0.0f).setDuration(A0B()).alpha(1.0f).setListener(new C3501QY(this, c3502qz, viewPropertyAnimatorAnimate, view2)).start();
        }
    }

    public final void A0d(AbstractC3548RK abstractC3548RK) {
        View view = abstractC3548RK.A0H;
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.A00.add(abstractC3548RK);
        ViewPropertyAnimator animation = viewPropertyAnimatorAnimate.alpha(1.0f).setDuration(A0A());
        animation.setListener(new C3498QV(this, abstractC3548RK, view, viewPropertyAnimatorAnimate)).start();
    }

    public final void A0e(AbstractC3548RK abstractC3548RK, int i2, int i3, int i4, int i5) {
        View view = abstractC3548RK.A0H;
        int i6 = i4 - i2;
        int i7 = i5 - i3;
        if (i6 != 0) {
            view.animate().translationX(0.0f);
        }
        if (i7 != 0) {
            view.animate().translationY(0.0f);
        }
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.A04.add(abstractC3548RK);
        viewPropertyAnimatorAnimate.setDuration(A0C()).setListener(new C3499QW(this, abstractC3548RK, i6, view, i7, viewPropertyAnimatorAnimate)).start();
    }
}
