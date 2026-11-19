package com.instagram.common.viewpoint.core;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import androidx.constraintlayout.widget.C1137R;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Sx */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C3648Sx {
    public static InterfaceC3188LR A0A;
    public static List<String> A0B;
    public static byte[] A0C;
    public static String[] A0D = {"9sbbD15", "Lu4K49mlxrSXSmjNh7fbv8QTyeXNNeG", "dxmg93Ac1Ci0DpKcQcYnCSB5QhHSt8Hl", "k6rgF4fsXLHTj2vl", "7FEQyJVT", "NWpMXisSbHx8hQWP", "4pbn9SiXGJE3zFdxdKEeQNSdsbhvbmq3", "cv"};
    public static final String A0E;
    public static final Map<String, C3194LX> A0F;
    public static final Map<String, C3650Sz> A0G;
    public long A00;
    public C3792VI A01;
    public final C3649Sy A03;
    public final C3659T8 A04;
    public final boolean A08;
    public final boolean A09;
    public final Map<String, Bitmap> A07 = Collections.synchronizedMap(new HashMap());
    public final Handler A02 = new Handler(Looper.getMainLooper());
    public final List<Callable<Boolean>> A05 = new ArrayList();
    public final List<Callable<Boolean>> A06 = new ArrayList();

    public static String A08(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0C, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 92);
        }
        return new String(bArrCopyOfRange);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 8 out of bounds for length 7
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static AtomicBoolean A0D(ArrayList<Callable<Boolean>> arrayList) {
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator<Callable<Boolean>> it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(ExecutorC3971YG.A02().submit(it.next()));
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        try {
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                Boolean bool = (Boolean) ((Future) it2.next()).get();
                atomicBoolean.set(atomicBoolean.get() && bool != null && bool.booleanValue());
            }
        } catch (InterruptedException | ExecutionException e) {
            Log.e(A0E, A08(85, 42, 126), e);
            atomicBoolean.set(false);
        }
        return atomicBoolean;
    }

    public static void A0F() {
        A0C = new byte[]{121, 42, 122, 120, 124, 44, 42, 121, 95, 11, 92, 93, 15, 86, 90, 10, 34, 114, 47, 35, 34, 36, 118, 11, 41, 43, 32, 45, 104, 59, 60, 41, 58, 60, 45, 44, 102, 100, 70, 68, 79, 78, 73, 64, 7, 68, 72, 74, 87, 75, 66, 83, 66, 63, 29, 31, 20, 21, 18, 27, 92, 26, 29, 21, 16, 25, 24, 69, 103, 101, 110, 111, 104, 97, 38, 117, 114, 103, 116, 114, 99, 98, 40, 40, 40, 103, 90, 65, 71, 82, 86, 75, 77, 76, 2, 85, 74, 75, 78, 71, 2, 71, 90, 71, 65, 87, 86, 75, 76, 69, 2, 65, 67, 65, 74, 71, 2, 70, 77, 85, 76, 78, 77, 67, 70, 81, 12, 66, 64, 66, 73, 68, 98, 78, 76, 81, 77, 68, 85, 72, 78, 79, 105, 78, 78, 74, 111, 109, 111, 100, 105, 74, 109, 101, 96, 121, 126, 105, 68, 99, 99, 103, 104, 117, 104, 110, 120, 121, 104, 101, 102, 104, 109, 119, 116, 122, 127, 68, 111, 114, 118, 126, 68, 118, 104, 89, 66, 69, 93};
    }

    static {
        A0F();
        A0E = C3648Sx.class.getSimpleName();
        A0F = Collections.synchronizedMap(new HashMap());
        A0G = Collections.synchronizedMap(new HashMap());
    }

    public C3648Sx(C3659T8 c3659t8) {
        this.A04 = c3659t8;
        this.A03 = C3649Sy.A06(c3659t8.A02());
        this.A08 = C3763Up.A2q(c3659t8);
        this.A09 = C3763Up.A2z(c3659t8, C4421fX.A03());
    }

    public static synchronized InterfaceC3188LR A03(C4490ge c4490ge) {
        if (A0A == null) {
            A0A = AbstractC3189LS.A00(c4490ge, new C3195LY().A00(C3763Up.A06(c4490ge)).A02(c4490ge.A05().AAO()).A01(-1).A03(C3763Up.A0p(c4490ge)).A04(C3763Up.A2y(c4490ge)).A05(), A05(c4490ge));
        }
        return A0A;
    }

    public static C3194LX A04(C3659T8 c3659t8, String str) {
        C3194LX c3194lx = A0F.get(str);
        if (C3651T0.A06(c3659t8) && c3194lx != null) {
            C3194LX storedCacheData = new C3194LX(c3194lx);
            return storedCacheData;
        }
        C3194LX storedCacheData2 = new C3194LX(str);
        return storedCacheData2;
    }

    public static C4498gm A05(C4490ge c4490ge) {
        return new C4498gm(c4490ge);
    }

    public static synchronized List<String> A09(C3659T8 c3659t8) {
        if (A0B == null) {
            A0B = new ArrayList();
            A0J(A0B, c3659t8);
        }
        return A0B;
    }

    public static /* synthetic */ Map A0A() {
        Map<String, C3650Sz> map = A0G;
        if (A0D[7].length() == 16) {
            throw new RuntimeException();
        }
        A0D[6] = "WjQPXn0MHZbTNsTxKlY7B5aUAaJR9kiv";
        return map;
    }

    public static void A0H(C3659T8 c3659t8, String str) {
        if (C3651T0.A06(c3659t8) && !TextUtils.isEmpty(str)) {
            C3650Sz c3650Sz = A0G.get(str);
            if (A0D[7].length() == 16) {
                throw new RuntimeException();
            }
            A0D[6] = "a10tGuQmEwUEP0sxRmqxEmZkNnUikCvX";
            if (c3650Sz != null) {
                c3650Sz.A00 = A08(ModuleDescriptor.MODULE_VERSION, 4, C1137R.styleable.ConstraintSet_polarRelativeTo);
                C4490ge c4490geA02 = c3659t8.A02();
                C4425fb c4425fbA06 = C4425fb.A06(c4490geA02);
                String strA09 = C4425fb.A09(c4490geA02, AbstractC3904XB.A00(str));
                if (strA09 == null) {
                    strA09 = str;
                }
                C3651T0.A04(c3659t8, c3650Sz, c4425fbA06.A0J(strA09));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0I(EnumC3791VH enumC3791VH) {
        if (this.A01 == null) {
            return;
        }
        HashMap map = new HashMap();
        map.put(A08(173, 12, 71), C3956Y1.A05(this.A00));
        this.A01.A04(enumC3791VH, map);
    }

    public static void A0J(List<String> cacheDirs, C3659T8 c3659t8) {
        A0K(cacheDirs, C4744ks.A01(c3659t8));
        A0K(cacheDirs, C3649Sy.A07(c3659t8));
    }

    public static void A0K(List<String> list, File file) {
        String path;
        if (file == null || (path = file.getPath()) == null) {
            return;
        }
        String path2 = A08(0, 0, 103);
        if (path != path2) {
            Locale locale = Locale.getDefault();
            String path3 = A0D[4];
            if (path3.length() == 2) {
                throw new RuntimeException();
            }
            A0D[4] = "BAOa9xP";
            String path4 = path.toLowerCase(locale);
            list.add(path4);
        }
    }

    public final float A0M(String str) {
        return this.A03.A0E(str);
    }

    public final Bitmap A0N(String str) {
        return this.A07.get(str);
    }

    public final Bitmap A0O(String str, int i2, int i3) {
        if (this.A08) {
            C3194LX c3194lxA04 = A04(this.A04, str);
            c3194lxA04.A03 = A08(ModuleDescriptor.MODULE_VERSION, 4, C1137R.styleable.ConstraintSet_polarRelativeTo);
            c3194lxA04.A01 = i3;
            c3194lxA04.A00 = i2;
            return A03(this.A04.A02()).AIe(c3194lxA04, true).A00();
        }
        return this.A03.A0G(this.A04, str, i2, i3, A08(169, 4, 85));
    }

    public final File A0P(String str) {
        C3194LX c3194lxA04 = A04(this.A04, str);
        c3194lxA04.A03 = A08(ModuleDescriptor.MODULE_VERSION, 4, C1137R.styleable.ConstraintSet_polarRelativeTo);
        return A03(this.A04.A02()).AIf(c3194lxA04);
    }

    public final File A0Q(String str) {
        if (this.A08) {
            return A0P(str);
        }
        return this.A03.A0H(str);
    }

    public final String A0R(String str) {
        if (this.A08) {
            return A0S(str);
        }
        return this.A03.A0I(str);
    }

    public final String A0S(String str) {
        C3194LX c3194lxA04 = A04(this.A04, str);
        c3194lxA04.A03 = A08(ModuleDescriptor.MODULE_VERSION, 4, C1137R.styleable.ConstraintSet_polarRelativeTo);
        String strAIh = A03(this.A04.A02()).AIh(c3194lxA04);
        return strAIh != null ? strAIh : str;
    }

    public final String A0T(String str) {
        if (this.A09) {
            A0H(this.A04, str);
            return str;
        }
        return A0S(str);
    }

    public final void A0U() {
        AbstractC3832Vy.A05(A08(127, 19, 125), A08(37, 16, 123), A08(16, 7, 75));
    }

    public final void A0V() {
        AbstractC3832Vy.A05(A08(146, 16, 80), A08(53, 14, 32), A08(8, 8, 50));
    }

    public final void A0W() {
        this.A07.clear();
    }

    public final void A0X(InterfaceC3640Sp interfaceC3640Sp, C3641Sq c3641Sq) {
        AbstractC3832Vy.A05(A08(162, 7, 81), A08(67, 18, 90), A08(0, 8, 20));
        this.A00 = System.currentTimeMillis();
        C3651T0.A02(this.A04, c3641Sq, C3651T0.A07, A08(23, 14, 20), -1L);
        ExecutorC3971YG.A03().execute(new C4499gn(this, new ArrayList(this.A05), c3641Sq, interfaceC3640Sp, new ArrayList(this.A06)));
        this.A05.clear();
        this.A06.clear();
    }

    public final void A0Y(C3644St c3644St) {
        this.A05.add(new CallableC3645Su(this, c3644St));
    }

    public final void A0Z(C3644St c3644St) {
        c3644St.A05 = true;
        this.A06.add(new CallableC3645Su(this, c3644St));
    }

    public final void A0a(C3644St c3644St) {
        c3644St.A05 = true;
        if (this.A09) {
            this.A06.add(new CallableC3643Ss(this, c3644St));
        } else {
            this.A06.add(new CallableC3645Su(this, c3644St));
        }
    }

    public final void A0b(C3644St c3644St) {
        if (this.A09) {
            this.A05.add(new CallableC3643Ss(this, c3644St));
        } else {
            this.A05.add(new CallableC3645Su(this, c3644St));
        }
    }

    public final void A0c(C3646Sv c3646Sv) {
        CallableC3647Sw callableC3647Sw = new CallableC3647Sw(this, c3646Sv);
        if (!c3646Sv.A03) {
            this.A05.add(callableC3647Sw);
        } else {
            this.A06.add(callableC3647Sw);
        }
    }

    public final void A0d(C3646Sv c3646Sv) {
        c3646Sv.A03 = true;
        A0c(c3646Sv);
    }

    public final void A0e(C3792VI c3792vi) {
        this.A01 = c3792vi;
    }
}
