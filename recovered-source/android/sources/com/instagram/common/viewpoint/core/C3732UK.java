package com.instagram.common.viewpoint.core;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.C1137R;
import com.facebook.ads.AdClosedListener;
import com.facebook.ads.AdError;
import com.facebook.ads.AdSettings;
import com.facebook.ads.ExtraHints;
import com.facebook.ads.InterfaceC1889Ad;
import com.facebook.ads.MediaView;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdBase;
import com.facebook.ads.NativeAdLayout;
import com.facebook.ads.NativeAdListener;
import com.facebook.ads.NativeBannerAd;
import com.facebook.ads.internal.api.AdNativeComponentView;
import com.facebook.ads.internal.api.NativeAdBaseApi;
import com.facebook.ads.internal.api.NativeAdImageApi;
import com.facebook.ads.internal.context.Repairable;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.facebook.ads.internal.protocol.AdPlacementType;
import com.facebook.ads.internal.settings.AdInternalSettings;
import java.lang.ref.WeakReference;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.UK */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C3732UK implements InterfaceC1889Ad, NativeAdBaseApi, Repairable, InterfaceC3818Vi {
    public static C3648Sx A0o;
    public static byte[] A0p;
    public static String[] A0q = {"0QrYY16WpsBKaBkyPEA33iBIoR05UhVT", "YnnsFrkLVth43aFbA8XanJ7Af1ELV", "Oxqa2FUUnPLQ7GUfsty3Y0efzjvyqNtk", "SIKP4BEcnF1kam64buW5uj4ZKlEjFxDR", "vEVPI6RQ4lovzpZyrpWOxFDddvUHwWNp", "NGWOmnzpb", "djSS0JJWnZq1rlBsvyeXY9GnDKzed", "NhvbMWoFDj5W6o0bWnGe4dztWB8buZER"};
    public static final String A0r;
    public static final WeakHashMap<View, WeakReference<C3732UK>> A0s;
    public long A00;
    public Drawable A01;
    public View.OnTouchListener A02;
    public View A03;
    public View A04;
    public View A05;
    public View A06;
    public AdClosedListener A07;
    public NativeAdLayout A08;
    public EnumC3298NE A09;
    public C4675jj A0A;
    public C23577g A0B;
    public C4626iu A0C;
    public C3654T3 A0D;
    public C3710Tx A0E;
    public C3792VI A0F;
    public EnumC3806VW A0G;
    public ViewOnClickListenerC3751Ud A0H;
    public InterfaceC3708Tv A0I;
    public C3813Vd A0J;
    public EnumC3814Ve A0K;
    public EnumC3824Vq A0L;
    public C4046ZT A0M;
    public InterfaceC4055Zc A0N;
    public C4147b6 A0O;
    public C4277dC A0P;
    public C4342eF A0Q;
    public AbstractC4438fo A0R;
    public AbstractC4438fo A0S;
    public C4439fp A0T;
    public C4439fp A0U;
    public String A0V;
    public String A0W;
    public WeakReference<C4541hT> A0X;
    public WeakReference<AbstractC4438fo> A0Y;
    public boolean A0Z;
    public boolean A0a;
    public boolean A0b;
    public boolean A0c;
    public boolean A0d;
    public C4686ju A0e;
    public final C3648Sx A0f;
    public final C4494gi A0g;
    public final InterfaceC3810Va A0h;
    public final C3820Vk A0i;
    public final C3957Y2 A0j;
    public final String A0k;
    public final String A0l;
    public final List<View> A0m;
    public volatile boolean A0n;

    public static String A0W(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0p, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 112);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0e() {
        A0p = new byte[]{-32, 26, 38, 31, 30, -19, -14, -13, -16, 30, -18, -15, -16, -24, -27, 22, -24, -26, -19, 23, -27, -74, -74, -71, -76, -70, -72, -29, -29, 38, 73, 5, 83, 84, 89, 5, 81, 84, 70, 73, 74, 73, -25, 10, -6, 11, 19, 22, 18, 7, 26, 11, -58, -51, -53, 25, -51, -58, 15, 25, -58, 20, 21, 26, -58, 7, -58, 20, 7, 26, 15, 28, 11, -58, 7, 10, -33, -37, -38, 14, -3, 2, -2, 7, -4, -2, -25, -2, 13, 16, 8, 11, 4, -27, 0, 8, 11, 4, 3, -65, 19, 14, -65, 11, 14, 0, 3, -65, -20, 4, 3, 8, 0, -51, -16, 11, 19, 22, 15, 14, -54, 30, 25, -54, 25, 12, 30, 11, 19, 24, -54, 30, 15, 23, 26, 22, 11, 30, 15, -54, -13, -18, -54, 16, 28, 25, 23, -54, 12, 19, 14, -54, 26, 11, 35, 22, 25, 11, 14, -54, -47, -49, 29, -47, -23, 14, 20, 5, 18, 14, 1, 12, -64, 5, 18, 18, 15, 18, -50, -86, 30, 67, 75, 54, 65, 62, 57, -11, 72, 58, 73, -11, 68, 59, -11, 56, 65, 62, 56, 64, 54, 55, 65, 58, -11, 75, 62, 58, 76, 72, 0, 24, 23, 28, 20, 9, 28, 24, 42, -45, 25, 34, 37, -45, 28, 22, 34, 33, -45, 28, 38, -45, 28, 38, -45, 32, 28, 38, 38, 28, 33, 26, -31, 29, 53, 52, 57, 49, 38, 57, 53, 71, -16, 57, 67, -16, 61, 57, 67, 67, 57, 62, 55, -2, 51, 91, 89, 90, 6, 86, 88, 85, 92, 79, 74, 75, 6, 71, 6, 60, 79, 75, 93, 35, 54, 73, 62, 75, 58, -11, 22, 57, -11, 76, 54, 72, -11, 54, 65, 71, 58, 54, 57, 78, -11, 71, 58, 60, 62, 72, 73, 58, 71, 58, 57, -11, 76, 62, 73, 61, -11, 54, -11, 43, 62, 58, 76, 3, -11, 22, 74, 73, 68, -11, 74, 67, 71, 58, 60, 62, 72, 73, 58, 71, 62, 67, 60, -11, 54, 67, 57, -11, 69, 71, 68, 56, 58, 58, 57, 62, 67, 60, 3, -55, -36, -17, -28, -15, -32, -101, -36, -33, -101, -33, -32, -18, -17, -19, -22, -12, -32, -33, -39, -20, -1, -12, 1, -16, -85, -20, -17, -85, -9, -6, -20, -17, -85, -3, -16, -4, 0, -16, -2, -1, -16, -17, -22, -3, -7, 11, -76, -11, 0, 6, -7, -11, -8, 13, -76, 6, -7, -5, -3, 7, 8, -7, 6, -7, -8, -76, 11, -3, 8, -4, -76, -11, -76, -30, -11, 8, -3, 10, -7, -43, -8, -62, -76, -43, 9, 8, 3, -76, 9, 2, 6, -7, -5, -3, 7, 8, -7, 6, -3, 2, -5, -76, -11, 2, -8, -76, 4, 6, 3, -9, -7, -7, -8, -3, 2, -5, -62, -1, 18, 14, 32, -55, 23, 24, 29, -55, 27, 14, 16, 18, 28, 29, 14, 27, 14, 13, -55, 32, 18, 29, 17, -55, 29, 17, 18, 28, -55, -9, 10, 29, 18, 31, 14, -22, 13, 46, 49, -19, 58, 50, 49, 54, 46, -19, 65, 70, 61, 50, -19, 54, 64, -19, 59, 60, 65, -19, 64, 66, 61, 61, 60, 63, 65, 50, 49, -5, 54, 69, 62, 51, 52, 66, 67, 65, 62, 72, 81, 84, 70, 73, 38, 73, 69, 72, 58, 61, 26, 61, 1, 2, -7, 60, 58, 69, 69, 62, 61, -7, 70, 72, 75, 62, -7, 77, 65, 58, 71, -7, 72, 71, 60, 62, -27, -40, -21, -32, -19, -36};
        String[] strArr = A0q;
        if (strArr[6].length() != strArr[1].length()) {
            throw new RuntimeException();
        }
        A0q[3] = "WbNUBB1XQVUYjPuN5kyqwH0pcEyoS9gz";
    }

    /* JADX WARN: Code duplicated, block: B:111:0x0335 A[LOOP:0: B:109:0x032f->B:111:0x0335, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:120:0x0362  */
    /* JADX WARN: Code duplicated, block: B:123:0x0372  */
    /* JADX WARN: Code duplicated, block: B:125:0x0382  */
    /* JADX WARN: Code duplicated, block: B:129:0x03cc  */
    /* JADX WARN: Code duplicated, block: B:131:0x03e4  */
    /* JADX WARN: Code duplicated, block: B:134:0x041a  */
    /* JADX WARN: Code duplicated, block: B:141:0x046d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:142:0x046f  */
    /* JADX WARN: Code duplicated, block: B:145:0x0486  */
    /* JADX WARN: Code duplicated, block: B:148:0x0495  */
    /* JADX WARN: Code duplicated, block: B:150:0x0499  */
    /* JADX WARN: Code duplicated, block: B:153:0x04b1  */
    /* JADX WARN: Code duplicated, block: B:164:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x0227  */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 24 out of bounds for length 17
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    private void A0g(View view, View view2, List<View> list, boolean z) {
        Iterator it;
        C3710Tx c3710Tx;
        C4137aw c4137aw;
        String[] strArr;
        String strA1H;
        if (!A0r()) {
            this.A0g.A0F().AHa();
        }
        if (view == null) {
            String strA0W = A0W(264, 19, C1137R.styleable.ConstraintSet_polarRelativeTo);
            if (!A0r()) {
                this.A0g.A0F().AHZ(strA0W);
            }
            throw new IllegalArgumentException(strA0W);
        }
        if (list == null || list.size() == 0) {
            String strA0W2 = A0W(180, 30, 101);
            if (!A0r()) {
                this.A0g.A0F().AHZ(strA0W2);
            }
            throw new IllegalArgumentException(strA0W2);
        }
        C4686ju c4686juA0C = A0C();
        if (c4686juA0C == null) {
            String strA0W3 = A0W(29, 13, C1137R.styleable.ConstraintSet_pivotAnchor);
            if (!A0r()) {
                this.A0g.A0F().AHZ(strA0W3);
            }
            Log.e(A0r, strA0W3);
            C3821Vm c3821Vm = new C3821Vm(AdErrorType.NATIVE_AD_IS_NOT_LOADED, strA0W3);
            A16().A0F().A3N(C3956Y1.A01(this.A00), c3821Vm.A03().getErrorCode(), c3821Vm.A04());
            if (!C3763Up.A2n(this.A0g) || this.A0I == null) {
                return;
            }
            this.A0I.ADp(c3821Vm);
            return;
        }
        String str = this.A0W;
        if ((view instanceof FrameLayout) && str != null) {
            A0h((FrameLayout) view, str);
        }
        if (this.A08 != null) {
            C4523hB c4523hB = (C4523hB) this.A08.getNativeAdLayoutApi();
            c4523hB.A03();
            c4523hB.A02();
        }
        C4541hT c4541hT = this.A0X.get();
        if (c4541hT != null && c4686juA0C.A08() == 1) {
            c4541hT.A0E(EnumC3977YM.AN_INFO_ICON);
        }
        if (view2 != null) {
            boolean z2 = (view2 instanceof AdNativeComponentView) && ((AdNativeComponentView) view2).getAdContentsView() != null;
            boolean z3 = z && (view2 instanceof ImageView);
            if (!z2 && !z3) {
                if (this.A0I != null) {
                    C3821Vm c3821Vm2 = new C3821Vm(AdErrorType.UNSUPPORTED_AD_ASSET_NATIVEAD, A0W(519, 31, 93));
                    A16().A0F().A3N(C3956Y1.A01(this.A00), c3821Vm2.A03().getErrorCode(), c3821Vm2.A04());
                    this.A0I.ADp(c3821Vm2);
                    return;
                }
                return;
            }
            View view3 = this.A04;
            if (A0q[3].charAt(5) != 'B') {
                String[] strArr2 = A0q;
                strArr2[6] = "BCYbWK19bS9ET6nCyqUucyCTxntwC";
                strArr2[1] = "hUEQWKvNS0BeeCCeuSbrKV1BB6cqb";
                if (view3 != null) {
                    Log.w(A0r, A0W(283, 80, 101));
                    unregisterView();
                }
            } else {
                A0q[3] = "VFOGhBJepBYKNQ0g15YaI4y2lFqguygQ";
                if (view3 != null) {
                    Log.w(A0r, A0W(283, 80, 101));
                    unregisterView();
                }
            }
            boolean zContainsKey = A0s.containsKey(view);
            String[] strArr3 = A0q;
            if (strArr3[6].length() != strArr3[1].length()) {
                throw new RuntimeException();
            }
            String[] strArr4 = A0q;
            strArr4[0] = "r1dCEV0W05obqeylsxysUOCLLtyqbDkO";
            strArr4[4] = "jsU6g8E1kSPqSuKqGJQzSRDrUMjHNr5E";
            if (zContainsKey && A0s.get(view).get() != null) {
                Log.w(A0r, A0W(406, 75, 36));
                A0s.get(view).get().unregisterView();
            }
            this.A0H = new ViewOnClickListenerC3751Ud(this, this.A0g, null);
            this.A04 = view;
            this.A06 = view2;
            if (view instanceof ViewGroup) {
                this.A0M = new C4046ZT(this.A0g, new C3790VG(this));
                ((ViewGroup) view).addView(this.A0M);
            }
            if (c4686juA0C.A0S()) {
                this.A0R = new C3788VE(this);
                this.A0T = new C4439fp(view, 1, new WeakReference(this.A0R), this.A0g);
                this.A0T.A0Y(false);
                this.A0T.A0X(c4686juA0C.A09());
                this.A0T.A0U();
                this.A0g.A0F().ACY();
            }
            ArrayList arrayList = new ArrayList(list);
            if (this.A05 == null) {
                it = arrayList.iterator();
                while (it.hasNext()) {
                    A1Q((View) it.next());
                }
                AbstractC4669jd abstractC4669jdA13 = A13();
                if (z) {
                    A1Q(view);
                    arrayList.add(view);
                }
                int iA00 = A00();
                this.A0S = new C3769Uv(this, view2, z3, c4686juA0C);
                if (view2 instanceof AdNativeComponentView) {
                    this.A03 = ((AdNativeComponentView) view2).getAdContentsView();
                } else {
                    this.A03 = view2;
                }
                if (C3763Up.A1z(this.A0g)) {
                    strA1H = A1H();
                    InterfaceC3796VM interfaceC3796VMA0B = A16().A0B();
                    View view4 = this.A03;
                    if (strA1H == null) {
                        strA1H = A0W(0, 0, C1137R.styleable.ConstraintSet_transitionEasing);
                    }
                    interfaceC3796VMA0B.AKo(view4, strA1H, this.A03 instanceof C4378eq, true);
                }
                this.A0U = new C4439fp(this.A03, iA00, A03(), true, new WeakReference(this.A0S), this.A0g);
                this.A0U.A0Y(!A0r());
                this.A0U.A0W(A01());
                this.A0U.A0X(A02());
                if (this.A03 instanceof C4137aw) {
                    c4137aw = (C4137aw) this.A03;
                    strArr = A0q;
                    if (strArr[0].charAt(21) != strArr[4].charAt(21)) {
                        A0q[3] = "9jWMkBrIWAaQq3BshIoiK9kOFApm7Mnb";
                        c4137aw.A06(this.A0U);
                    }
                }
                this.A0A = new C4675jj(this.A0g, new C3746UY(this, null), this.A0U, this.A0e);
                this.A0A.A0H(arrayList);
                A0s.put(view, new WeakReference<>(this));
                if (C3763Up.A1C(this.A0g)) {
                    this.A0O = new C4147b6();
                    this.A0O.A0C(this.A0k);
                    this.A0O.A0B(this.A0g.getPackageName());
                    this.A0O.A0A(this.A0U);
                    if (this.A0e != null) {
                        C4674ji c4674jiA0E = this.A0e.A0E();
                        this.A0O.A08(c4674jiA0E.A03(), c4674jiA0E.A04());
                    }
                    c3710Tx = this.A0E;
                    if (A0q[3].charAt(5) != 'B') {
                        String[] strArr5 = A0q;
                        strArr5[6] = "iJInlaPqSCsodlo1snRpIwz9DPt1A";
                        strArr5[1] = "DYzZZFtfMBLderHMiZZFXfgJZWHC0";
                        if (c3710Tx != null) {
                            this.A0O.A09(this.A0E.A0C());
                        } else if (this.A0B != null) {
                            this.A0O.A09(this.A0B.A0J().A0C());
                        }
                    } else if (c3710Tx != null) {
                        this.A0O.A09(this.A0E.A0C());
                    } else if (this.A0B != null) {
                        this.A0O.A09(this.A0B.A0J().A0C());
                    }
                    this.A04.getOverlay().add(this.A0O);
                    return;
                }
                return;
            }
            View view5 = this.A05;
            String[] strArr6 = A0q;
            if (strArr6[2].charAt(3) != strArr6[7].charAt(3)) {
                String[] strArr7 = A0q;
                strArr7[0] = "7BxfhPTBtrovnc2SNqJYjum2f5qDPcpL";
                strArr7[4] = "Q5pxYg7VFdMmLRDnYTITcnTwa1eIsVWj";
                arrayList.add(view5);
                it = arrayList.iterator();
                while (it.hasNext()) {
                    A1Q((View) it.next());
                }
                AbstractC4669jd abstractC4669jdA14 = A13();
                if (z && abstractC4669jdA14 != null && abstractC4669jdA14.A1f()) {
                    A1Q(view);
                    arrayList.add(view);
                }
                int iA01 = A00();
                this.A0S = new C3769Uv(this, view2, z3, c4686juA0C);
                if (view2 instanceof AdNativeComponentView) {
                    this.A03 = ((AdNativeComponentView) view2).getAdContentsView();
                } else {
                    this.A03 = view2;
                }
                if (C3763Up.A1z(this.A0g)) {
                    strA1H = A1H();
                    InterfaceC3796VM interfaceC3796VMA0B2 = A16().A0B();
                    View view6 = this.A03;
                    if (strA1H == null) {
                        strA1H = A0W(0, 0, C1137R.styleable.ConstraintSet_transitionEasing);
                    }
                    interfaceC3796VMA0B2.AKo(view6, strA1H, this.A03 instanceof C4378eq, true);
                }
                this.A0U = new C4439fp(this.A03, iA01, A03(), true, new WeakReference(this.A0S), this.A0g);
                this.A0U.A0Y(!A0r());
                this.A0U.A0W(A01());
                this.A0U.A0X(A02());
                if (this.A03 instanceof C4137aw) {
                    c4137aw = (C4137aw) this.A03;
                    strArr = A0q;
                    if (strArr[0].charAt(21) != strArr[4].charAt(21)) {
                        A0q[3] = "9jWMkBrIWAaQq3BshIoiK9kOFApm7Mnb";
                        c4137aw.A06(this.A0U);
                    }
                }
                this.A0A = new C4675jj(this.A0g, new C3746UY(this, null), this.A0U, this.A0e);
                this.A0A.A0H(arrayList);
                A0s.put(view, new WeakReference<>(this));
                if (C3763Up.A1C(this.A0g)) {
                    this.A0O = new C4147b6();
                    this.A0O.A0C(this.A0k);
                    this.A0O.A0B(this.A0g.getPackageName());
                    this.A0O.A0A(this.A0U);
                    if (this.A0e != null && this.A0e.A0E().A03() > 0) {
                        C4674ji c4674jiA0E2 = this.A0e.A0E();
                        this.A0O.A08(c4674jiA0E2.A03(), c4674jiA0E2.A04());
                    }
                    c3710Tx = this.A0E;
                    if (A0q[3].charAt(5) != 'B') {
                        String[] strArr8 = A0q;
                        strArr8[6] = "iJInlaPqSCsodlo1snRpIwz9DPt1A";
                        strArr8[1] = "DYzZZFtfMBLderHMiZZFXfgJZWHC0";
                        if (c3710Tx != null) {
                            this.A0O.A09(this.A0E.A0C());
                        } else if (this.A0B != null) {
                            this.A0O.A09(this.A0B.A0J().A0C());
                        }
                    } else if (c3710Tx != null) {
                        this.A0O.A09(this.A0E.A0C());
                    } else if (this.A0B != null && this.A0B.A0J() != null) {
                        this.A0O.A09(this.A0B.A0J().A0C());
                    }
                    this.A04.getOverlay().add(this.A0O);
                    return;
                }
                return;
            }
        } else {
            if (this.A0L != EnumC3824Vq.A06) {
                AdErrorType adErrorType = AdErrorType.NO_MEDIAVIEW_IN_NATIVEBANNERAD;
                String strA0W4 = A0W(210, 33, 67);
                C3821Vm c3821Vm3 = new C3821Vm(adErrorType, strA0W4);
                A16().A0F().A3N(C3956Y1.A01(this.A00), c3821Vm3.A03().getErrorCode(), c3821Vm3.A04());
                if (this.A0I != null) {
                    this.A0I.ADp(c3821Vm3);
                }
                if (AdInternalSettings.isDebugBuild()) {
                    String str2 = A0r;
                    if (A0q[3].charAt(5) == 'B') {
                        A0q[3] = "KISMvB3VNIc1t4pH9OUWIwxPU7abTBQu";
                        Log.e(str2, strA0W4);
                        return;
                    } else {
                        String[] strArr9 = A0q;
                        strArr9[2] = "I0o2CociGt9PfWtihtc1uzdPzn26Oc3b";
                        strArr9[7] = "DL9r7FwT46CQ5uSYOng5HfHjynm8xWWf";
                        Log.e(str2, strA0W4);
                        return;
                    }
                }
                return;
            }
            AdErrorType adErrorType2 = AdErrorType.NO_MEDIAVIEW_IN_NATIVEAD;
            String strA0W5 = A0W(243, 21, 96);
            C3821Vm c3821Vm4 = new C3821Vm(adErrorType2, strA0W5);
            A16().A0F().A3N(C3956Y1.A01(this.A00), c3821Vm4.A03().getErrorCode(), c3821Vm4.A04());
            if (this.A0I != null) {
                this.A0I.ADp(c3821Vm4);
            }
            if (!AdInternalSettings.isDebugBuild()) {
                return;
            }
            String str3 = A0r;
            if (A0q[5].length() != 3) {
                String[] strArr10 = A0q;
                strArr10[0] = "ymh7ZtbYw7oyMwS2HukMuI2t1Xj3fY7y";
                strArr10[4] = "GGURsKjIWyfUU1Vu9BOr0pf9u6pcVKo4";
                Log.e(str3, strA0W5);
                return;
            }
        }
        throw new RuntimeException();
    }

    static {
        A0e();
        A0r = C3732UK.class.getSimpleName();
        A0s = new WeakHashMap<>();
    }

    public C3732UK(Context context, String str, InterfaceC3810Va interfaceC3810Va, boolean z) {
        this.A0l = UUID.randomUUID().toString();
        this.A0L = EnumC3824Vq.A06;
        this.A0G = EnumC3806VW.A04;
        this.A09 = EnumC3298NE.A03;
        this.A0X = new WeakReference<>(null);
        this.A0m = new ArrayList();
        this.A0j = new C3957Y2();
        this.A0d = false;
        this.A0c = false;
        this.A00 = -1L;
        this.A0Z = false;
        if (context instanceof C4494gi) {
            this.A0g = (C4494gi) context;
        } else if (!z) {
            this.A0g = C3579Rp.A04(context);
        } else {
            this.A0g = C3579Rp.A03(context);
        }
        this.A0g.A0O(this);
        this.A0k = str;
        this.A0h = interfaceC3810Va;
        if (A0o != null) {
            this.A0f = A0o;
        } else {
            this.A0f = new C3648Sx(this.A0g);
        }
        this.A05 = new View(context);
        this.A0i = new C3820Vk(this.A0g, this);
    }

    public C3732UK(C3732UK c3732uk) {
        this((Context) c3732uk.A0g, (String) null, c3732uk.A0h, true);
        this.A0E = c3732uk.A0E;
        this.A0e = c3732uk.A0e;
        this.A0C = c3732uk.A0C;
        this.A0n = true;
        this.A05 = new View(this.A0g);
    }

    public C3732UK(C4494gi c4494gi, C4686ju c4686ju, C3710Tx c3710Tx, InterfaceC3810Va interfaceC3810Va) {
        this((Context) c4494gi, (String) null, interfaceC3810Va, true);
        this.A0e = c4686ju;
        this.A0E = c3710Tx;
        this.A0n = true;
        this.A05 = new View(c4494gi);
    }

    public C3732UK(C4494gi c4494gi, C4686ju c4686ju, C3710Tx c3710Tx, InterfaceC3810Va interfaceC3810Va, C4626iu c4626iu) {
        this(c4494gi, c4686ju, c3710Tx, interfaceC3810Va);
        this.A0C = c4626iu;
    }

    private int A00() {
        if (this.A0E != null) {
            return this.A0E.A04();
        }
        if (this.A0B == null || this.A0B.A0J() == null) {
            return 1;
        }
        C3710Tx c3710TxA0J = this.A0B.A0J();
        String[] strArr = A0q;
        String str = strArr[6];
        String str2 = strArr[1];
        int length = str.length();
        int viewabilityThreshold = str2.length();
        if (length != viewabilityThreshold) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0q;
        strArr2[2] = "P5kYLn6xwAUrjDfDuw88TuaVt88D3vtD";
        strArr2[7] = "ZJzVQNISDO4cH7XUZ38T2d7bCdM1k8uN";
        return c3710TxA0J.A04();
    }

    private int A01() {
        if (this.A0E != null) {
            return this.A0E.A07();
        }
        if (this.A0e != null) {
            return this.A0e.A0C();
        }
        if (this.A0B != null && this.A0B.A0J() != null) {
            return this.A0B.A0J().A07();
        }
        return 0;
    }

    private int A02() {
        if (this.A0E != null) {
            return this.A0E.A08();
        }
        if (this.A0e != null) {
            return this.A0e.A0D();
        }
        if (this.A0B != null && this.A0B.A0J() != null) {
            return this.A0B.A0J().A08();
        }
        return 1000;
    }

    private int A03() {
        if (this.A0E != null) {
            return this.A0E.A09();
        }
        C23577g c23577g = this.A0B;
        if (A0q[3].charAt(5) != 'B') {
            throw new RuntimeException();
        }
        A0q[5] = "Xt";
        if (c23577g == null || this.A0B.A0J() == null) {
            return 0;
        }
        return this.A0B.A0J().A09();
    }

    public static Drawable A05(C4494gi c4494gi, Bitmap bitmap, boolean z, String str) {
        BitmapDrawable bitmapDrawableA00;
        BitmapDrawable bitmapDrawable = new BitmapDrawable(c4494gi.getResources(), bitmap);
        if (z && (bitmapDrawableA00 = AbstractC4341eE.A00(c4494gi, str)) != null) {
            Drawable iconViewDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawableA00});
            return iconViewDrawable;
        }
        return bitmapDrawable;
    }

    public static NativeAdBase A0A(Context context, String str, String str2) throws C3822Vn {
        EnumC3824Vq enumC3824VqA00 = C3828Vu.A00(str2);
        if (enumC3824VqA00 != null) {
            EnumC3824Vq template = EnumC3824Vq.A05;
            if (enumC3824VqA00 == template) {
                return new NativeBannerAd(context, str);
            }
            EnumC3824Vq template2 = EnumC3824Vq.A06;
            if (enumC3824VqA00 == template2) {
                return new NativeAd(context, str);
            }
            throw new C3822Vn(AdErrorType.BID_PAYLOAD_ERROR, String.format(Locale.US, A0W(42, 34, 54), enumC3824VqA00));
        }
        throw new C3822Vn(AdErrorType.BID_PAYLOAD_ERROR, String.format(Locale.US, A0W(114, 50, 58), str2));
    }

    private final C4686ju A0C() {
        C4686ju c4686ju = this.A0e;
        if (c4686ju != null && c4686ju.A0R()) {
            return c4686ju;
        }
        return null;
    }

    private C4674ji A0F() {
        return A0G(false);
    }

    private C4674ji A0G(boolean z) {
        if (this.A0e != null) {
            C4686ju c4686ju = this.A0e;
            if (A0q[3].charAt(5) == 'B') {
                String[] strArr = A0q;
                strArr[0] = "rkQiEYXoMEhriwkmxTS9YqbekXjRctvV";
                strArr[4] = "aQIgqL6bCxVEsMgFZvYj1f08oAvgjHgO";
                if (c4686ju.A0R()) {
                    if (z) {
                        C4686ju c4686ju2 = this.A0e;
                        if (A0q[3].charAt(5) == 'B') {
                            A0q[3] = "EWl26Bqfon8mX0lHHC6z05409Pwx5AXq";
                            c4686ju2.A0I();
                        }
                    }
                    return this.A0e.A0E();
                }
            }
            throw new RuntimeException();
        }
        return new C4674ji();
    }

    public static C3758Uk A0K() {
        return new C3758Uk();
    }

    public static C3732UK A0L(NativeAdBaseApi nativeAdBaseApi) {
        if (nativeAdBaseApi instanceof Proxy) {
            return (C3732UK) ((C3563RZ) Proxy.getInvocationHandler(nativeAdBaseApi)).A04();
        }
        return (C3732UK) nativeAdBaseApi;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    /* JADX INFO: renamed from: A0M, reason: merged with bridge method [inline-methods] */
    public final C3811Vb getAdChoicesIcon() {
        return A0F().A0G();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    /* JADX INFO: renamed from: A0O, reason: merged with bridge method [inline-methods] */
    public final C3812Vc getAdStarRating() {
        return A0F().A0J();
    }

    private AdPlacementType A0R() {
        if (this.A0L == EnumC3824Vq.A06) {
            return AdPlacementType.NATIVE;
        }
        return AdPlacementType.NATIVE_BANNER;
    }

    private void A0a() {
        for (View view : this.A0m) {
            view.setOnClickListener(null);
            if (A0q[3].charAt(5) != 'B') {
                throw new RuntimeException();
            }
            A0q[3] = "reBfvBMaH6BqwlxZ2WqAQZq3knZpIvyz";
            view.setOnTouchListener(null);
            view.setOnLongClickListener(null);
        }
        this.A0m.clear();
    }

    private void A0b() {
        if (!TextUtils.isEmpty(getAdChoicesLinkUrl())) {
            C3899X6.A0O(new C3899X6(), this.A0g, AbstractC3904XB.A00(getAdChoicesLinkUrl()), A1H());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0c() {
        this.A0j.A05();
        this.A0i.A05();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0d() {
        if (this.A0T != null) {
            this.A0T.A0V();
            this.A0g.A0F().ACZ();
            this.A0T = null;
        }
    }

    public static void A0f(Drawable drawable, ImageView imageView) {
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        if (drawable != null) {
            imageView.setImageDrawable(drawable);
        }
        if (A0q[3].charAt(5) != 'B') {
            throw new RuntimeException();
        }
        String[] strArr = A0q;
        strArr[6] = "LXDT52DRzEPuIKBbeK5QN38hLQjcy";
        strArr[1] = "Z1aNossC2MxjaxQyIIrn4vHalGw3J";
        imageView.setBackground(null);
    }

    private void A0h(FrameLayout frameLayout, String str) {
        if (this.A0Q != null) {
            frameLayout.removeView(this.A0Q);
        }
        this.A0Q = AbstractC4341eE.A01(C3579Rp.A03(this.A0g), str);
        if (this.A0Q != null) {
            frameLayout.addView(this.A0Q, new FrameLayout.LayoutParams(-1, -1));
            frameLayout.bringChildToFront(this.A0Q);
        }
    }

    private void A0i(C4686ju c4686ju, boolean z) {
        Iterator<C3732UK> it;
        if (c4686ju == null) {
            return;
        }
        boolean zEquals = this.A0G.equals(EnumC3806VW.A04);
        String strA0W = A0W(596, 6, 7);
        if (zEquals) {
            C4674ji c4674jiA0E = c4686ju.A0E();
            AbstractC4669jd abstractC4669jdA0F = c4674jiA0E.A0F();
            if (abstractC4669jdA0F != null) {
                AbstractC3346O0.A00(abstractC4669jdA0F, this.A0f, strA0W);
            }
            String strA7O = c4686ju.A7O();
            if (A0q[3].charAt(5) != 'B') {
                throw new RuntimeException();
            }
            String[] strArr = A0q;
            strArr[6] = "lK6BgrMvSH2F6L4J2jXYHYWLLMocG";
            strArr[1] = "r7RKa3WPMM0ePgLxUrWU6ktCTFHYt";
            if (!TextUtils.isEmpty(strA7O)) {
                this.A0F = new C3792VI(strA7O, this.A0g.A0A());
                this.A0f.A0e(this.A0F);
            }
            if (c4674jiA0E.A0I() != null) {
                C3646Sv c3646Sv = new C3646Sv(c4674jiA0E.A0I().getUrl(), c4674jiA0E.A0I().getHeight(), c4674jiA0E.A0I().getWidth(), c4686ju.A0G(), A0W(596, 6, 7));
                c3646Sv.A01 = this.A0D;
                this.A0f.A0W();
                this.A0f.A0c(c3646Sv);
            }
            if (!this.A0L.equals(EnumC3824Vq.A05)) {
                if (c4674jiA0E.A0H() != null) {
                    this.A0f.A0c(new C3646Sv(c4674jiA0E.A0H().getUrl(), c4674jiA0E.A0H().getHeight(), c4674jiA0E.A0H().getWidth(), c4686ju.A0G(), A0W(596, 6, 7)));
                }
                if (c4686ju.A0H() != null) {
                    List<C3732UK> listA0H = c4686ju.A0H();
                    String[] strArr2 = A0q;
                    String clientToken = strArr2[2];
                    if (clientToken.charAt(3) != strArr2[7].charAt(3)) {
                        String[] strArr3 = A0q;
                        strArr3[6] = "77gx94UEEewpboaJzdp5NkxYfy9yz";
                        strArr3[1] = "VW3IQGZLEm7XJQdY3dbeWOHCgy17v";
                        it = listA0H.iterator();
                    } else {
                        String[] strArr4 = A0q;
                        strArr4[0] = "SnanODICAbTvQWDZLrONkEMoieoDOxdU";
                        strArr4[4] = "rm0yXzoJreTTXaU8PcTY1VhnZxiHPX84";
                        it = listA0H.iterator();
                    }
                    while (it.hasNext()) {
                        C3732UK next = it.next();
                        if (next.getAdCoverImage() != null) {
                            this.A0f.A0c(new C3646Sv(next.getAdCoverImage().getUrl(), next.getAdCoverImage().getHeight(), next.getAdCoverImage().getWidth(), c4686ju.A0G(), A0W(596, 6, 7)));
                        }
                    }
                }
                String strA0e = c4674jiA0E.A0e();
                if (!TextUtils.isEmpty(strA0e)) {
                    this.A0f.A0b(new C3644St(strA0e, c4686ju.A0G(), A0W(596, 6, 7), c4674jiA0E.A0D()));
                }
            }
            if (abstractC4669jdA0F != null && abstractC4669jdA0F.A1g()) {
                C3644St cacheFileData = new C3644St(abstractC4669jdA0F.A0x(), abstractC4669jdA0F.A1D(), strA0W);
                cacheFileData.A04 = true;
                cacheFileData.A03 = A0W(0, 5, 66);
                this.A0f.A0Y(cacheFileData);
            }
        }
        this.A0f.A0X(new C3809VZ(this, c4686ju, z), new C3641Sq(c4686ju.A0G(), strA0W));
    }

    private void A0j(InterfaceC3300NG interfaceC3300NG) {
        if (this.A0e == null) {
            return;
        }
        this.A0e.A0K(interfaceC3300NG);
    }

    public static void A0k(NativeAdImageApi nativeAdImageApi, ImageView imageView, C4494gi c4494gi) {
        if (nativeAdImageApi != null && imageView != null) {
            new AsyncTaskC3183LM(imageView, c4494gi).A05(nativeAdImageApi.getHeight(), nativeAdImageApi.getWidth()).A07(nativeAdImageApi.getUrl());
        }
    }

    private final void A0n(InterfaceC3708Tv interfaceC3708Tv) {
        this.A0I = interfaceC3708Tv;
    }

    private final void A0o(String str) {
        this.A0V = str;
    }

    private void A0p(List<View> list, View view) {
        if (this.A0h != null && this.A0h.AJx(view)) {
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                A0p(list, viewGroup.getChildAt(i2));
            }
            return;
        }
        list.add(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A0q() {
        return A1D() == EnumC3815Vf.A05 || A1D() == EnumC3815Vf.A03;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A0r() {
        return A0F().A0j();
    }

    public final int A0y() {
        return A0F().A06();
    }

    public final int A0z() {
        return A0F().A07();
    }

    public final int A10() {
        if (this.A0e != null && !TextUtils.isEmpty(this.A0e.A0E().A0e())) {
            return this.A0e.A0E().A0A();
        }
        return -1;
    }

    public final long A11() {
        return this.A00;
    }

    public final C4686ju A12() {
        return this.A0e;
    }

    public final AbstractC4669jd A13() {
        return A0F().A0F();
    }

    public final C3648Sx A14() {
        return this.A0f;
    }

    public final C4494gi A15() {
        return this.A0g;
    }

    public final C4494gi A16() {
        return this.A0g;
    }

    public final ViewOnClickListenerC3751Ud A17() {
        return this.A0H;
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    /* JADX INFO: renamed from: A18, reason: merged with bridge method [inline-methods] */
    public final C3811Vb getAdCoverImage() {
        return A0F().A0H();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    /* JADX INFO: renamed from: A19, reason: merged with bridge method [inline-methods] */
    public final C3811Vb getAdIcon() {
        return A0F().A0I();
    }

    public final InterfaceC3708Tv A1A() {
        return this.A0I;
    }

    public final C3813Vd A1B() {
        return this.A0J;
    }

    public final EnumC3814Ve A1C() {
        return this.A0K;
    }

    public final EnumC3815Vf A1D() {
        return A0F().A0K();
    }

    public final C3957Y2 A1E() {
        return this.A0j;
    }

    public final C4084a5 A1F() {
        if (A13() == null || !A13().A2U()) {
            return null;
        }
        C4084a5 c4084a5 = new C4084a5(this.A0g, EnumC4101aM.A05);
        c4084a5.setOnClickListener(new View.OnClickListener() { // from class: com.facebook.ads.redexgen.X.VY
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.A00.A1R(view);
            }
        });
        return c4084a5;
    }

    public final C4439fp A1G() {
        return this.A0U;
    }

    public final String A1H() {
        if (this.A0e == null || !isAdLoaded()) {
            return null;
        }
        return this.A0e.A7O();
    }

    public final String A1I() {
        return this.A0W;
    }

    public final String A1J() {
        return A0G(true).A0Q();
    }

    public final String A1K() {
        return A0G(true).A0R();
    }

    public final String A1L() {
        return A0F().A0d();
    }

    public final String A1M() {
        if (this.A0e == null || TextUtils.isEmpty(this.A0e.A0E().A0e())) {
            return null;
        }
        return this.A0f.A0T(this.A0e.A0E().A0e());
    }

    public final List<C3732UK> A1N() {
        if (this.A0e == null || !isAdLoaded()) {
            return null;
        }
        return this.A0e.A0H();
    }

    public final void A1O() {
        if (!AbstractC3389Oh.A00(this.A0g.A02()).A0O(this.A0g, false)) {
            A0b();
            if (A0q[5].length() == 3) {
                throw new RuntimeException();
            }
            A0q[3] = "yREZ0BSYt8CSunaR9f1myx0zIAs3a5bO";
            return;
        }
        AbstractC4056Zd abstractC4056ZdA01 = AbstractC4057Ze.A01(this.A0g, this.A0g.A0A(), A1H(), this.A08);
        if (abstractC4056ZdA01 == null) {
            A0b();
            return;
        }
        ((C4523hB) this.A08.getNativeAdLayoutApi()).A05(abstractC4056ZdA01);
        if (!C3763Up.A22(this.A0g)) {
            C4494gi c4494giA15 = A15();
            String[] strArr = A0q;
            if (strArr[6].length() != strArr[1].length()) {
                c4494giA15.A0F().ABW();
                abstractC4056ZdA01.setOnAdClosedListener(this.A07);
            } else {
                A0q[5] = "wIzlh5hd";
                c4494giA15.A0F().ABW();
                abstractC4056ZdA01.setOnAdClosedListener(this.A07);
            }
        }
        abstractC4056ZdA01.setAdReportingCallbackListener(this.A0N);
        abstractC4056ZdA01.A0N();
    }

    public final void A1P(Drawable drawable) {
        this.A01 = drawable;
        A1o(drawable != null, true);
    }

    public final void A1Q(View view) {
        this.A0m.add(view);
        view.setOnClickListener(this.A0H);
        view.setOnTouchListener(this.A0H);
        if (C3763Up.A1C(view.getContext())) {
            view.setOnLongClickListener(this.A0H);
        }
    }

    public final /* synthetic */ void A1R(View view) {
        this.A0g.A0F().AAy(EnumC4101aM.A05.name().toLowerCase(Locale.US));
        A1O();
    }

    public final void A1S(View view, ImageView imageView) {
        ArrayList arrayList = new ArrayList();
        A0p(arrayList, view);
        A0g(view, imageView, arrayList, true);
    }

    public final void A1T(View view, ImageView imageView, List<View> clickableViews) {
        A0g(view, imageView, clickableViews, true);
    }

    public final void A1U(View view, AdNativeComponentView adNativeComponentView) {
        ArrayList arrayList = new ArrayList();
        A0p(arrayList, view);
        A0g(view, adNativeComponentView, arrayList, false);
    }

    public final void A1V(View view, AdNativeComponentView adNativeComponentView, List<View> clickableViews) {
        A0g(view, adNativeComponentView, clickableViews, false);
    }

    public final void A1W(View view, AdNativeComponentView adNativeComponentView, List<View> clickableViews, boolean z) {
        A0g(view, adNativeComponentView, clickableViews, z);
    }

    public final void A1X(View view, AdNativeComponentView adNativeComponentView, boolean z) {
        List<View> clickableViews = new ArrayList<>();
        A0p(clickableViews, view);
        A0g(view, adNativeComponentView, clickableViews, z);
    }

    public final void A1Y(AdClosedListener adClosedListener) {
        A15().A0F().ABX();
        this.A07 = adClosedListener;
    }

    public final void A1Z(MediaView mediaView) {
        if (mediaView != null) {
            this.A0c = true;
        }
    }

    public final void A1a(MediaView mediaView) {
        if (mediaView != null) {
            this.A0d = true;
        }
    }

    public final void A1b(NativeAdBase nativeAdBase, NativeAdListener nativeAdListener) {
        if (nativeAdListener == null) {
            return;
        }
        A0n(new C23136y(nativeAdListener, nativeAdBase));
    }

    public final void A1c(NativeAdLayout nativeAdLayout) {
        this.A08 = nativeAdLayout;
    }

    public final void A1d(C4686ju c4686ju) {
        A0i(c4686ju, true);
        if (this.A0I != null && c4686ju.A0H() != null) {
            C3829Vv c3829Vv = new C3829Vv(this);
            for (C3732UK c3732uk : c4686ju.A0H()) {
                if (A0q[3].charAt(5) != 'B') {
                    throw new RuntimeException();
                }
                String[] strArr = A0q;
                strArr[0] = "7JUEXy8BV6wMe69mvRG8Hisl1h58kfsH";
                strArr[4] = "Ag7M0cktqfZPxcWhbEyn8XCMGlxm5ALn";
                c3732uk.A0j(c3829Vv);
            }
        }
    }

    public final void A1e(C4541hT c4541hT) {
        this.A0X = new WeakReference<>(c4541hT);
    }

    public final void A1f(EnumC3806VW enumC3806VW, String str, C3654T3 c3654t3) {
        if (str == null) {
            this.A0g.A0F().A3Q();
        } else {
            this.A0g.A0F().A3P();
        }
        this.A00 = System.currentTimeMillis();
        boolean z = this.A0n;
        String[] strArr = A0q;
        if (strArr[0].charAt(21) != strArr[4].charAt(21)) {
            String[] strArr2 = A0q;
            strArr2[0] = "knecuAJjZigTf7VsFCGhTGCW7dxKplKn";
            strArr2[4] = "uRrNlLGUJL1gxvEKewtOLFu1Ztix0dl1";
            if (z) {
                AdSettings.IntegrationErrorMode integrationErrorModeA00 = AbstractC3356OA.A00(this.A0g);
                String strA0W = A0W(566, 30, 105);
                AdSettings.IntegrationErrorMode integrationErrorMode = AdSettings.IntegrationErrorMode.INTEGRATION_ERROR_CRASH_DEBUG_MODE;
                if (!integrationErrorMode.equals(integrationErrorModeA00)) {
                    C3821Vm c3821Vm = new C3821Vm(AdErrorType.LOAD_AD_CALLED_MORE_THAN_ONCE, A0W(566, 30, 105));
                    A16().A0F().A3N(C3956Y1.A01(this.A00), c3821Vm.A03().getErrorCode(), c3821Vm.A04());
                    if (this.A0I != null) {
                        this.A0I.ADp(c3821Vm);
                    } else {
                        Log.e(A0W(76, 17, 41), strA0W);
                    }
                    C3691Te c3691Te = new C3691Te(strA0W);
                    A16().A08().ABC(A0W(550, 3, 101), AbstractC3690Td.A0c, c3691Te);
                } else {
                    throw new C3361OF(strA0W);
                }
            }
            this.A0n = true;
            this.A0G = enumC3806VW;
            if (enumC3806VW.equals(EnumC3806VW.A05)) {
                EnumC3298NE enumC3298NE = EnumC3298NE.A05;
                if (A0q[3].charAt(5) == 'B') {
                    A0q[3] = "N11XMBa1eBkGGouoRChlRsXEwEtHvHDZ";
                    this.A09 = enumC3298NE;
                }
            }
            this.A0D = c3654t3;
            C3353O7 c3353o7 = new C3353O7(this.A0k, this.A0L, A0R(), null, 1, new C4615ij());
            c3353o7.A05(enumC3806VW);
            c3353o7.A06(this.A0V);
            c3353o7.A07(this.A0W);
            this.A0B = new C23577g(this.A0g, c3353o7);
            this.A0B.A0S(new C3830Vw(this));
            this.A0B.A0W(str);
            return;
        }
        throw new RuntimeException();
    }

    public final void A1g(C3813Vd c3813Vd) {
        this.A0J = c3813Vd;
    }

    public final void A1h(EnumC3814Ve enumC3814Ve) {
        this.A0K = enumC3814Ve;
    }

    public final void A1i(EnumC3824Vq enumC3824Vq) {
        if (!A0r()) {
            if (EnumC3824Vq.A05.equals(enumC3824Vq)) {
                this.A0g.A0F().A3T(AdPlacementType.NATIVE_BANNER.toString(), this.A0k);
            } else {
                this.A0g.A0F().A3T(AdPlacementType.NATIVE.toString(), this.A0k);
            }
        }
        this.A0L = enumC3824Vq;
    }

    public final void A1j(InterfaceC4055Zc interfaceC4055Zc) {
        this.A0N = interfaceC4055Zc;
    }

    public final void A1k(AbstractC4438fo abstractC4438fo) {
        this.A0Y = new WeakReference<>(abstractC4438fo);
    }

    public final void A1l(boolean z) {
        this.A0a = z;
    }

    public final void A1m(boolean z) {
        this.A0Z = z;
    }

    public final void A1n(boolean z) {
        this.A0b = z;
    }

    public final void A1o(boolean z, boolean z2) {
        String strA0W;
        if (z) {
            if (this.A0G.equals(EnumC3806VW.A05)) {
                boolean zA0r = A0r();
                if (A0q[3].charAt(5) != 'B') {
                    throw new RuntimeException();
                }
                String[] strArr = A0q;
                strArr[6] = "maLBxQjysuwmJ75m3YPaJDHU5JlBu";
                strArr[1] = "hXXEi4DazsshJWFEyRiAh7tUxgC1d";
                if (!zA0r && this.A0I != null) {
                    this.A0I.AEq();
                }
            }
            if (this.A0U != null) {
                this.A0U.A0U();
                this.A0i.A09();
                return;
            }
            return;
        }
        if (this.A0U != null) {
            C4686ju adapter = A12();
            if (adapter != null) {
                strA0W = adapter.A0G();
            } else if (A0q[5].length() != 3) {
                String[] strArr2 = A0q;
                strArr2[2] = "2ETmOz1YodPf8MKRGGB9YcIoy7FDTpAq";
                strArr2[7] = "k5VZ8yDbY0Zqj8FxkeEerY08JJe7M6tR";
                strA0W = A0W(0, 0, C1137R.styleable.ConstraintSet_transitionEasing);
            } else {
                String[] strArr3 = A0q;
                strArr3[0] = "JjUCnZOckAfeDcKZajvIf0dyi7sruRRg";
                strArr3[4] = "GlO3j5qd4HFQ8L5mPWBpkp3onxgG8Q98";
                strA0W = A0W(0, 0, C1137R.styleable.ConstraintSet_transitionEasing);
            }
            this.A0i.A0C(this.A0g, strA0W);
            this.A0U.A0V();
        }
        if (this.A0I != null && z2) {
            C3821Vm c3821VmA01 = C3821Vm.A01(AdErrorType.BROKEN_MEDIA_ERROR, A0W(93, 21, 47));
            A16().A0F().A3N(C3956Y1.A01(this.A00), c3821VmA01.A03().getErrorCode(), c3821VmA01.A04());
            this.A0I.ADp(c3821VmA01);
        }
    }

    public final boolean A1p() {
        return this.A0Z;
    }

    public final boolean A1q() {
        return A0F().A0h();
    }

    public final boolean A1r() {
        return A0F().A0g();
    }

    public final boolean A1s() {
        return this.A0L == EnumC3824Vq.A05;
    }

    public final boolean A1t() {
        return this.A08 == null;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3818Vi
    public final int A7d() {
        View view = this.A06;
        if (view instanceof AdNativeComponentView) {
            View videoView = ((AdNativeComponentView) view).getAdContentsView();
            if (videoView instanceof C4378eq) {
                return ((C4378eq) videoView).getCurrentPosition();
            }
            return -1;
        }
        return -1;
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final NativeAdBase.NativeAdLoadConfigBuilder buildLoadAdConfig(NativeAdBase nativeAdBase) {
        return new C3816Vg(this, nativeAdBase);
    }

    @Override // com.facebook.ads.InterfaceC1889Ad
    public final void destroy() {
        AbstractC3832Vy.A05(A0W(553, 7, 95), A0W(363, 19, 11), A0W(21, 8, 17));
        if (C3763Up.A1z(this.A0g)) {
            A16().A0B().AKU(this.A03);
        }
        if (!A0r()) {
            this.A0g.A0F().A3U();
        }
        if (this.A0B != null) {
            this.A0B.A0Y(true);
            this.A0B.A0K();
            this.A0B = null;
        }
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final void downloadMedia() {
        if (this.A0G.equals(EnumC3806VW.A05)) {
            this.A09 = EnumC3298NE.A04;
        }
        this.A0G = EnumC3806VW.A04;
        A0i(this.A0e, false);
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final String getAdBodyText() {
        return A0G(true).A0L();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final String getAdCallToAction() {
        return A0G(true).A0Z();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final String getAdChoicesImageUrl() {
        if (getAdChoicesIcon() == null) {
            return null;
        }
        return getAdChoicesIcon().getUrl();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final String getAdChoicesLinkUrl() {
        return A0F().A0M();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final String getAdChoicesText() {
        return A0F().A0N();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final String getAdHeadline() {
        return A0G(true).A0O();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final String getAdLinkDescription() {
        return A0G(true).A0P();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final String getAdSocialContext() {
        return A0G(true).A0T();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final String getAdTranslation() {
        return A0G(true).A0W();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final String getAdUntrimmedBodyText() {
        return A0G(true).A0X();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final String getAdvertiserName() {
        return A0G(true).A0Y();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final float getAspectRatio() {
        C3811Vb nativeAdImage;
        if (this.A0e == null || (nativeAdImage = this.A0e.A0E().A0H()) == null) {
            return 0.0f;
        }
        int width = nativeAdImage.getWidth();
        int height = nativeAdImage.getHeight();
        if (height <= 0) {
            return 0.0f;
        }
        float f2 = width;
        float f3 = height;
        String[] strArr = A0q;
        if (strArr[0].charAt(21) == strArr[4].charAt(21)) {
            throw new RuntimeException();
        }
        A0q[3] = "OUTl4BjdLTzCi4kmpI6eA9pKBM08eKMp";
        return f2 / f3;
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final String getId() {
        if (!isAdLoaded()) {
            return null;
        }
        return this.A0l;
    }

    @Override // com.facebook.ads.InterfaceC1889Ad
    public final String getPlacementId() {
        return this.A0k;
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final Drawable getPreloadedIconViewDrawable() {
        C3811Vb c3811VbA0I;
        Bitmap bitmapA0N;
        C4686ju adapter = this.A0e;
        if (adapter != null && (c3811VbA0I = A0F().A0I()) != null && (bitmapA0N = this.A0f.A0N(c3811VbA0I.getUrl())) != null) {
            return A05(A16(), bitmapA0N, A1t(), A1I());
        }
        return null;
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final String getPromotedTranslation() {
        return A0G(true).A0S();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final String getSponsoredTranslation() {
        return A0G(true).A0U();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final boolean hasCallToAction() {
        return this.A0e != null && this.A0e.A0Q();
    }

    @Override // com.facebook.ads.InterfaceC1889Ad
    public final boolean isAdInvalidated() {
        boolean zA0A = true;
        if (this.A0B != null) {
            C23577g c23577g = this.A0B;
            String[] strArr = A0q;
            if (strArr[6].length() != strArr[1].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0q;
            strArr2[2] = "gqyuy6F7WThaJUOfAsIyr4sziGGBhw0f";
            strArr2[7] = "L6lbko7Rv34huPFym8TvMBezY1vQkdWf";
            zA0A = c23577g.A0Z();
        } else if (this.A0C != null) {
            zA0A = this.A0C.A0A();
        }
        this.A0g.A0F().A5f(zA0A);
        return zA0A;
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final boolean isAdLoaded() {
        return this.A0e != null && this.A0e.A0R();
    }

    @Override // com.facebook.ads.InterfaceC1889Ad
    public final void loadAd() {
        AbstractC3832Vy.A05(A0W(560, 6, C1137R.styleable.ConstraintSet_pivotAnchor), A0W(382, 24, 27), A0W(13, 8, 68));
        A1f(EnumC3806VW.A00(NativeAdBase.MediaCacheFlag.ALL), null, new C3654T3(false, -1, -1));
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final void loadAd(NativeAdBase.NativeLoadAdConfig nativeLoadAdConfig) {
        AbstractC3832Vy.A05(A0W(560, 6, C1137R.styleable.ConstraintSet_pivotAnchor), A0W(382, 24, 27), A0W(5, 8, 76));
        ((C3816Vg) nativeLoadAdConfig).A00();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final void onCtaBroadcast() {
        if (this.A05 != null) {
            this.A05.performClick();
        }
    }

    @Override // com.facebook.ads.internal.context.Repairable
    public final void repair(Throwable th) {
        if (this.A04 != null) {
            this.A04.post(new C3831Vx(this));
        }
        String str = A0W(164, 16, 48) + AbstractC3948Xt.A03(this.A0g, th);
        A16().A0F().A3N(C3956Y1.A01(this.A00), AdError.INTERNAL_ERROR_CODE, str);
        if (this.A0I != null) {
            this.A0I.ADp(new C3821Vm(AdError.INTERNAL_ERROR_CODE, str));
        }
    }

    @Override // com.facebook.ads.InterfaceC1889Ad
    public final void setExtraHints(ExtraHints extraHints) {
        if (extraHints == null) {
            return;
        }
        A0o(extraHints.getHints());
        this.A0W = extraHints.getMediationData();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.A02 = onTouchListener;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x004f  */
    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final void unregisterView() {
        C4342eF c4342eF = this.A0Q;
        if (c4342eF != null) {
            ViewParent parent = c4342eF.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(c4342eF);
            }
            this.A0Q = null;
        }
        if (this.A04 == null || this.A06 == null) {
            return;
        }
        if (!A0r()) {
            InterfaceC3216Lt interfaceC3216LtA0F = this.A0g.A0F();
            String[] strArr = A0q;
            if (strArr[0].charAt(21) != strArr[4].charAt(21)) {
                A0q[3] = "w9n8TBisrss8zAM8EiwpgeUnlq2PaQ6F";
                interfaceC3216LtA0F.unregisterView();
                if (C3763Up.A1z(this.A0g)) {
                    A16().A0B().AKU(this.A03);
                }
                if (!A0s.containsKey(this.A04) && A0s.get(this.A04).get() == this) {
                    View view = this.A04;
                    String[] strArr2 = A0q;
                    if (strArr2[2].charAt(3) != strArr2[7].charAt(3)) {
                        String[] strArr3 = A0q;
                        strArr3[6] = "1kkuB6xtwDeF3EtU3aavEsH64nQcK";
                        strArr3[1] = "rb6NM7K87kMKFcLdVL5rugEXgDuZd";
                        if ((view instanceof ViewGroup) && this.A0M != null) {
                            ((ViewGroup) this.A04).removeView(this.A0M);
                            this.A0M = null;
                        }
                        if (this.A0e != null) {
                            this.A0e.A0J();
                        }
                        if (this.A0O != null && C3763Up.A1C(this.A0g)) {
                            this.A0O.A07();
                            View view2 = this.A04;
                            String[] strArr4 = A0q;
                            if (strArr4[2].charAt(3) == strArr4[7].charAt(3)) {
                                throw new RuntimeException();
                            }
                            String[] strArr5 = A0q;
                            strArr5[0] = "4gE9LeNlQroHqEeWf1EzJsbNX9PRfDme";
                            strArr5[4] = "TBDkrxJbHtSaZ13hkNs0RNY8SzE0jpKy";
                            view2.getOverlay().remove(this.A0O);
                        }
                        A0s.remove(this.A04);
                        A0a();
                        this.A04 = null;
                        this.A06 = null;
                        if (this.A0U != null) {
                            this.A0U.A0V();
                            this.A0U = null;
                        }
                        A0d();
                        this.A0A = null;
                        this.A0Z = false;
                        return;
                    }
                } else {
                    throw new IllegalStateException(A0W(481, 38, 57));
                }
            }
        } else {
            if (C3763Up.A1z(this.A0g)) {
                A16().A0B().AKU(this.A03);
            }
            if (!A0s.containsKey(this.A04)) {
            }
            throw new IllegalStateException(A0W(481, 38, 57));
        }
        throw new RuntimeException();
    }
}
