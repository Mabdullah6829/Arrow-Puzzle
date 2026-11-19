package com.instagram.common.viewpoint.core;

import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeSet;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.89 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
@MetaExoPlayerCustomization("Exo version is final but in Meta code HeroLeastRecentlyUsedCacheEvictor extends this")
public final class C238689 implements InterfaceC4719kS {
    public static byte[] A03;
    public static String[] A04 = {"jtWHdC1JS00IQCACyTEvOJEMPrvoo3Ob", "eCCt1HwS4IToKXyi1WzLFL1R4PlgsDM4", "yXgy4dLxj37Ni2Ba12KifyhgeRBIXCXp", "5p7nRT0g4n3u8StY", "28aCkGMBHBRgMUJ0i4knnGO", "XAmyqmpuCXa4X38XkweYk7F1knbiAlXr", "krkFdswQPRExlipS29WIEjh8hbH7SBjj", "jb"};

    @MetaExoPlayerCustomization("Exo version is private but in Meta code HeroLeastRecentlyUsedCacheEvictor extends this")
    public long A00;

    @MetaExoPlayerCustomization("Exo version is private but in Meta code HeroLeastRecentlyUsedCacheEvictor extends this")
    public final long A01;

    @MetaExoPlayerCustomization("Exo version is private but in Meta code HeroLeastRecentlyUsedCacheEvictor extends this")
    public final TreeSet<C3258MZ> A02 = new TreeSet<>(new Comparator() { // from class: com.facebook.ads.redexgen.X.Mn
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return C238689.A00((C3258MZ) obj, (C3258MZ) obj2);
        }
    });

    public static String A01(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 28);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A03 = new byte[]{46, 61, 34, 40, 63, 8, 42, 40, 35, 46};
    }

    static {
        A02();
    }

    public C238689(long j2) {
        this.A01 = j2;
    }

    @MetaExoPlayerCustomization("Exo version is private but in Meta code HeroLeastRecentlyUsedCacheEvictor extends this")
    public static int A00(C3258MZ c3258mz, C3258MZ c3258mz2) {
        if (c3258mz.A00 - c3258mz2.A00 == 0) {
            return c3258mz.compareTo(c3258mz2);
        }
        return c3258mz.A00 < c3258mz2.A00 ? -1 : 1;
    }

    private void A03(InterfaceC3248MP interfaceC3248MP, long j2) {
        AbstractC219554.A02(A01(0, 10, 87));
        while (this.A00 + j2 > this.A01 && !this.A02.isEmpty()) {
            C3258MZ c3258mzFirst = this.A02.first();
            if (A04[1].charAt(10) != 'T') {
                throw new RuntimeException();
            }
            A04[4] = "DjrmhsDHxGC2SVigK1e7Rl2";
            interfaceC3248MP.AIV(c3258mzFirst);
        }
        AbstractC219554.A00();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3247MO
    public final void AG2(InterfaceC3248MP interfaceC3248MP, C3258MZ c3258mz) {
        this.A02.add(c3258mz);
        this.A00 += c3258mz.A01;
        A03(interfaceC3248MP, 0L);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3247MO
    public final void AG3(InterfaceC3248MP interfaceC3248MP, C3258MZ c3258mz) {
        this.A02.remove(c3258mz);
        this.A00 -= c3258mz.A01;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3247MO
    public final void AG4(InterfaceC3248MP interfaceC3248MP, C3258MZ c3258mz, C3258MZ c3258mz2) {
        AG3(interfaceC3248MP, c3258mz);
        AG2(interfaceC3248MP, c3258mz2);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC4719kS
    public final void AG5(InterfaceC3248MP interfaceC3248MP, String str, long j2, long j3) {
        if (j3 != -1) {
            A03(interfaceC3248MP, j3);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC4719kS
    public final boolean AIj() {
        return true;
    }
}
