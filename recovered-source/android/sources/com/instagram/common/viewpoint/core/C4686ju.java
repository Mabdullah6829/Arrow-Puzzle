package com.instagram.common.viewpoint.core;

import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import androidx.constraintlayout.widget.C1137R;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ju */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C4686ju implements InterfaceC3281Mw, InterfaceC3285N1 {
    public static byte[] A0C;
    public static String[] A0D = {"axrzCdv0FVVdCRJ2G5bzsKW6gzdnjkd", "bTiRlDodVRVUvI5asAv5OrmPjdR2kQoL", "0F0kzsbgf", "9OhtkIX5JTQzZAf31yyS0L6RFdCICf7G", "a5UohLNEI7iVSyxaj4LiJgBVL6R7sy1L", "7foeJoxu0TAivWs2uWCvQbVxkZa0ERHH", "EHJaWrfXkxbvFmDXjSXoaOL8kiGJisUm", "EwwWMCMqNj"};
    public static final String A0E;
    public int A00;
    public C4674ji A01;
    public InterfaceC3300NG A02;
    public C3301NH A03;
    public InterfaceC3810Va A04;
    public List<C3732UK> A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public final C4494gi A0A;
    public final String A0B;

    public static String A02(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0C, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 27);
            if (A0D[0].length() != 31) {
                throw new RuntimeException();
            }
            String[] strArr = A0D;
            strArr[4] = "ypXQoKhxcHRWJrqojmqi5sMtZ7xfThaX";
            strArr[6] = "2LOy6kLjroQDrfbojOuFHdbjLd88ORkx";
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A0C = new byte[]{55, 18, 23, 6, 2, 19, 4, 86, 23, 26, 4, 19, 23, 18, 15, 86, 26, 25, 23, 18, 19, 18, 86, 18, 23, 2, 23, 2, 45, 40, 34, 42, 97, 41, 32, 49, 49, 36, 47, 36, 37, 97, 46, 47, 97, 45, 46, 34, 42, 50, 34, 51, 36, 36, 47, 97, 32, 37, 87, 120, 125, 119, 127, 52, 120, 123, 115, 115, 113, 112, 119, 117, 120, 120, 113, 102, 64, 109, 100, 113, 46, 44, 63, 41, 46, 35, 57, 85, 87, 68, 82, 95, 88, 82, 114, 101, 58, 53, 32, 61, 34, 49, 12, 17, 30, 15, 12, 23, 16, 11, 100, 127, 120, 96, 100, 116, 88, 117, 33, 62, 50, 32};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 7 out of bounds for length 7
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    private void A06(Map<String, String> map, Map<String, String> map2) {
        try {
            new Handler().postDelayed(new C4687jv(this, map2, A03(map)), this.A01.A09() * 1000);
        } catch (Exception unused) {
        }
    }

    static {
        A04();
        A0E = C4686ju.class.getSimpleName();
    }

    public C4686ju(C4494gi c4494gi) {
        this(c4494gi, new C4674ji());
    }

    public C4686ju(C4494gi c4494gi, C4674ji c4674ji) {
        this.A0B = UUID.randomUUID().toString();
        this.A00 = 200;
        this.A01 = c4674ji;
        this.A0A = c4494gi;
    }

    private Map<String, String> A03(Map<String, String> map) {
        HashMap map2 = new HashMap();
        String strA02 = A02(C1137R.styleable.ConstraintSet_polarRelativeTo, 4, 76);
        if (map.containsKey(strA02)) {
            map2.put(strA02, map.get(strA02));
        }
        String strA03 = A02(102, 8, 100);
        if (map.containsKey(strA03)) {
            map2.put(strA03, map.get(strA03));
        }
        return map2;
    }

    private void A05(C4674ji c4674ji) {
        if (!this.A06) {
            this.A01 = c4674ji;
            List<C4674ji> listA0f = this.A01.A0f();
            if (listA0f != null && listA0f.size() > 0) {
                int size = listA0f.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i2 = 0; i2 < size; i2++) {
                    C4686ju adapter = new C4686ju(this.A0A);
                    adapter.A05(listA0f.get(i2));
                    arrayList.add(new C3732UK(this.A0A, adapter, (C3710Tx) null, this.A04));
                }
                this.A05 = arrayList;
            }
            this.A06 = true;
            this.A07 = A07();
            return;
        }
        throw new IllegalStateException(A02(0, 27, 109));
    }

    private boolean A07() {
        return (!(this.A01.A0j() || TextUtils.isEmpty(this.A01.A0Y())) || (!TextUtils.isEmpty(this.A01.A0V()) && this.A01.A0j())) && (this.A01.A0I() != null || this.A01.A0j()) && (this.A01.A0H() != null || A8k() == AdPlacementType.NATIVE_BANNER);
    }

    public final int A08() {
        return this.A01.A02();
    }

    public final int A09() {
        return this.A01.A05();
    }

    public final int A0A() {
        int iA08 = this.A01.A08();
        if (iA08 < 0 || iA08 > 100) {
            return 0;
        }
        return iA08;
    }

    public final int A0B() {
        return this.A00;
    }

    public final int A0C() {
        return this.A01.A0B();
    }

    public final int A0D() {
        return this.A01.A0C();
    }

    public final C4674ji A0E() {
        return this.A01;
    }

    public final InterfaceC3300NG A0F() {
        return this.A02;
    }

    public final String A0G() {
        return this.A01.A0b();
    }

    public final List<C3732UK> A0H() {
        if (!A0R()) {
            return null;
        }
        return this.A05;
    }

    public final void A0I() {
        if (!this.A09) {
            String strA0c = A0E().A0c();
            if (strA0c != null) {
                InterfaceC3784VA interfaceC3784VAA0A = this.A0A.A0A();
                String[] strArr = A0D;
                if (strArr[1].charAt(25) != strArr[3].charAt(25)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0D;
                strArr2[4] = "MHNGbcOaMZIG61BxjY7eI95TuiNlx0Gr";
                strArr2[6] = "kvjKrlZQ6RBIZv1Jj5ESJw4vFB55PB3z";
                interfaceC3784VAA0A.AGz(strA0c);
            }
            this.A09 = true;
        }
    }

    public final void A0J() {
        if (this.A05 != null && !this.A05.isEmpty()) {
            Iterator<C3732UK> it = this.A05.iterator();
            while (it.hasNext()) {
                it.next().unregisterView();
            }
        }
    }

    public final void A0K(InterfaceC3300NG interfaceC3300NG) {
        this.A02 = interfaceC3300NG;
    }

    public final void A0L(C4494gi c4494gi, InterfaceC3300NG interfaceC3300NG, InterfaceC3784VA interfaceC3784VA, C3354O8 c3354o8, InterfaceC3810Va interfaceC3810Va) {
        int iA06;
        this.A02 = interfaceC3300NG;
        this.A04 = interfaceC3810Va;
        JSONObject jSONObjectA03 = c3354o8.A03();
        C3710Tx c3710TxA01 = c3354o8.A01();
        if (c3710TxA01 != null) {
            iA06 = c3710TxA01.A06();
        } else {
            iA06 = 200;
        }
        this.A00 = iA06;
        A05(AbstractC3302NI.A00(c4494gi, jSONObjectA03, AbstractC3932Xd.A02(jSONObjectA03, A02(94, 2, 10))));
        if (AbstractC3282Mx.A06(c4494gi, this, interfaceC3784VA)) {
            c4494gi.A0F().A52();
            interfaceC3300NG.AEz(this, C3821Vm.A00(AdErrorType.NO_FILL));
        } else {
            if (interfaceC3300NG != null) {
                interfaceC3300NG.AEw(this);
            }
            this.A03 = new C3301NH(c4494gi, this.A0B, this, interfaceC3300NG);
            this.A03.A02();
        }
    }

    public final void A0M(Map<String, String> extraData) {
        C3326Ng c3326NgA2A;
        if (!A0R()) {
            return;
        }
        boolean shouldBlockLockscreenClicks = C3763Up.A26(this.A0A);
        if (shouldBlockLockscreenClicks) {
            boolean shouldBlockLockscreenClicks2 = C3967YC.A03(extraData);
            if (shouldBlockLockscreenClicks2) {
                Log.e(A0E, A02(27, 31, 90));
                return;
            }
        }
        HashMap map = new HashMap();
        if (extraData != null) {
            map.putAll(extraData);
        }
        boolean shouldBlockLockscreenClicks3 = this.A01.A0j();
        if (shouldBlockLockscreenClicks3) {
            map.put(A02(87, 7, 45), String.valueOf(A0E().A04()));
            map.put(A02(80, 7, 86), String.valueOf(A0E().A03()));
        }
        map.put(A02(70, 10, 15), AdPlacementType.NATIVE.name());
        map.put(A02(110, 8, 10), this.A0B);
        C4494gi c4494gi = this.A0A;
        InterfaceC3784VA interfaceC3784VAA0A = this.A0A.A0A();
        String strA7O = this.A01.A7O();
        Uri uriA0E = this.A01.A0E();
        if (this.A01.A0F() != null) {
            c3326NgA2A = this.A01.A0F().A2A();
        } else {
            c3326NgA2A = null;
        }
        AbstractC3278Mt abstractC3278MtA00 = C3279Mu.A00(c4494gi, interfaceC3784VAA0A, strA7O, uriA0E, map, c3326NgA2A);
        EnumC3275Mq enumC3275MqA0G = EnumC3275Mq.A09;
        if (abstractC3278MtA00 != null) {
            enumC3275MqA0G = abstractC3278MtA00.A0G(null);
        }
        if (enumC3275MqA0G != EnumC3275Mq.A06) {
            AbstractC3911XI.A04(this.A0A, A02(58, 12, 15));
            if (this.A02 != null) {
                this.A02.AEv(this);
            }
        }
    }

    public final void A0N(Map<String, String> extraData) {
        this.A0A.A0A().AB6(this.A01.A7O(), extraData);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0035  */
    /* JADX WARN: Code duplicated, block: B:19:0x0040  */
    /* JADX WARN: Code duplicated, block: B:22:0x007a  */
    /* JADX WARN: Code duplicated, block: B:24:0x0082  */
    /* JADX WARN: Code duplicated, block: B:27:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:29:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:31:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:34:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:36:0x0105  */
    public final void A0O(Map<String, String> map) {
        HashMap map2;
        boolean zA0U;
        String strA0a;
        String[] strArr;
        if (A0R() && !this.A08) {
            if (this.A02 != null) {
                InterfaceC3300NG interfaceC3300NG = this.A02;
                if (A0D[7].length() == 10) {
                    A0D[2] = "N1HzTzVNk";
                    interfaceC3300NG.AEx(this);
                    map2 = new HashMap();
                    if (map != null) {
                        map2.putAll(map);
                    }
                    if (this.A01.A0j()) {
                        map2.put(A02(87, 7, 45), String.valueOf(A0E().A04()));
                        map2.put(A02(80, 7, 86), String.valueOf(A0E().A03()));
                    }
                    if (TextUtils.isEmpty(A7O())) {
                        if (!this.A01.A0j()) {
                            this.A0A.A0F().A3L();
                            strA0a = this.A01.A0a();
                            strArr = A0D;
                            if (strArr[1].charAt(25) == strArr[3].charAt(25)) {
                                String[] strArr2 = A0D;
                                strArr2[1] = "Q8Us8dZOubCsANiQB8YQBmsKLdjgWIPJ";
                                strArr2[3] = "Pg8pQUM49Vm5a0t7ebabBeivyd2Kgjff";
                                AbstractC3382Oa.A02(strA0a, AbstractC3941Xm.A00(A02(96, 6, 79)));
                            }
                        }
                        this.A0A.A0A().ABJ(A7O(), map2);
                        C3880Wl.A00(this.A0A).A0E(AdPlacementType.NATIVE.toString(), A7O());
                        if (A0T()) {
                            A06(map, map2);
                        } else {
                            zA0U = A0U();
                            if (A0D[2].length() == 9) {
                                A0D[2] = "BGAjHSzJz";
                                if (zA0U) {
                                    A06(map, map2);
                                }
                            }
                        }
                        this.A08 = true;
                        return;
                    }
                    if (A0T()) {
                        zA0U = A0U();
                        if (A0D[2].length() == 9) {
                            A0D[2] = "BGAjHSzJz";
                            if (zA0U) {
                                A06(map, map2);
                            }
                        }
                    } else {
                        A06(map, map2);
                    }
                    this.A08 = true;
                    return;
                }
            } else {
                map2 = new HashMap();
                if (map != null) {
                    map2.putAll(map);
                }
                if (this.A01.A0j()) {
                    map2.put(A02(87, 7, 45), String.valueOf(A0E().A04()));
                    map2.put(A02(80, 7, 86), String.valueOf(A0E().A03()));
                }
                if (TextUtils.isEmpty(A7O())) {
                    if (!this.A01.A0j()) {
                        this.A0A.A0F().A3L();
                        strA0a = this.A01.A0a();
                        strArr = A0D;
                        if (strArr[1].charAt(25) == strArr[3].charAt(25)) {
                            String[] strArr3 = A0D;
                            strArr3[1] = "Q8Us8dZOubCsANiQB8YQBmsKLdjgWIPJ";
                            strArr3[3] = "Pg8pQUM49Vm5a0t7ebabBeivyd2Kgjff";
                            AbstractC3382Oa.A02(strA0a, AbstractC3941Xm.A00(A02(96, 6, 79)));
                        }
                    }
                    this.A0A.A0A().ABJ(A7O(), map2);
                    C3880Wl.A00(this.A0A).A0E(AdPlacementType.NATIVE.toString(), A7O());
                    if (A0T()) {
                        zA0U = A0U();
                        if (A0D[2].length() == 9) {
                            A0D[2] = "BGAjHSzJz";
                            if (zA0U) {
                                A06(map, map2);
                            }
                        }
                    } else {
                        A06(map, map2);
                    }
                    this.A08 = true;
                    return;
                }
                if (A0T()) {
                    zA0U = A0U();
                    if (A0D[2].length() == 9) {
                        A0D[2] = "BGAjHSzJz";
                        if (zA0U) {
                            A06(map, map2);
                        }
                    }
                } else {
                    A06(map, map2);
                }
                this.A08 = true;
                return;
            }
            throw new RuntimeException();
        }
    }

    public final boolean A0P() {
        return true;
    }

    public final boolean A0Q() {
        return A0R() && this.A01.A0E() != null;
    }

    public final boolean A0R() {
        return this.A06 && this.A07;
    }

    public final boolean A0S() {
        return this.A01.A0i();
    }

    public final boolean A0T() {
        return C3763Up.A1b(this.A0A) && A0R() && this.A01.A0k();
    }

    public final boolean A0U() {
        return C3763Up.A1b(this.A0A) && A0R() && this.A01.A0l();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3281Mw
    public final String A7O() {
        return this.A01.A7O();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3281Mw
    public final Collection<String> A7p() {
        return A0E().A7p();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3281Mw
    public final EnumC3280Mv A8K() {
        return A0E().A8K();
    }

    public AdPlacementType A8k() {
        return AdPlacementType.NATIVE;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3285N1
    public final boolean AKL() {
        return false;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3285N1
    public final void onDestroy() {
        if (this.A03 != null) {
            C3301NH c3301nh = this.A03;
            String[] strArr = A0D;
            if (strArr[4].charAt(16) != strArr[6].charAt(16)) {
                throw new RuntimeException();
            }
            A0D[7] = "xLZjaQWgus";
            c3301nh.A03();
        }
    }
}
