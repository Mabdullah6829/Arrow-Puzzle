package com.instagram.common.viewpoint.core;

import com.facebook.ads.androidx.media3.common.Timeline;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.8A */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C23878A {
    public static String[] A06 = {"jkVScMAnmSDw5NjtFKaMDw93YHVTZfVV", "X8vR6FaiUrrVUV4OyPqbjTz4nTbdT", "DJqg7VUdCo9q2ysxPrWS1RTdTLsj", "4FrbkvGGO58oIWN02YSUZA4iQkwc41Il", "lEgbsVLzgPUjgc1", "ISDPu1y88m9uUW9z", "L6djBwtYOA2bka2PQ69EdZLSIG4ne", "x8MPEelqUvAzBLNZGFUUNdgpeh0HUacA"};
    public C4912no A00;
    public C4912no A01;
    public C4912no A02;
    public AbstractC2570BP<C4912no> A03 = AbstractC2570BP.A03();
    public AbstractC4956oX<C4912no, Timeline> A04 = AbstractC4956oX.A04();
    public final C5031pl A05;

    /* JADX WARN: Code duplicated, block: B:14:0x0042  */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static C4912no A00(InterfaceC21053b interfaceC21053b, AbstractC2570BP<C4912no> abstractC2570BP, C4912no c4912no, C5031pl c5031pl) {
        int iA07;
        Object obj;
        int i2;
        Timeline timelineA7g = interfaceC21053b.A7g();
        int iA7c = interfaceC21053b.A7c();
        Object objA0M = timelineA7g.A0N() ? null : timelineA7g.A0M(iA7c);
        if (interfaceC21053b.AAd()) {
            iA07 = -1;
        } else {
            boolean zA0N = timelineA7g.A0N();
            String[] strArr = A06;
            if (strArr[7].charAt(14) != strArr[3].charAt(14)) {
                throw new RuntimeException();
            }
            A06[6] = "fPIpfte6042F2VeKOBsTFTkNJVxhR";
            if (zA0N) {
                iA07 = -1;
            } else {
                iA07 = timelineA7g.A0H(iA7c, c5031pl).A07(AbstractC22035C.A0O(interfaceC21053b.A7e()) - c5031pl.A0C());
            }
        }
        for (int i3 = 0; i3 < abstractC2570BP.size(); i3++) {
            C4912no c4912no2 = abstractC2570BP.get(i3);
            if (A04(c4912no2, objA0M, interfaceC21053b.AAd(), interfaceC21053b.A7Y(), interfaceC21053b.A7Z(), iA07)) {
                return c4912no2;
            }
        }
        if (abstractC2570BP.isEmpty() && c4912no != null && A04(c4912no, obj, interfaceC21053b.AAd(), interfaceC21053b.A7Y(), interfaceC21053b.A7Z(), i2)) {
            obj = objA0M;
            i2 = iA07;
            return c4912no;
        }
        obj = objA0M;
        i2 = iA07;
        return null;
    }

    public C23878A(C5031pl c5031pl) {
        this.A05 = c5031pl;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.oV != com.google.common.collect.ImmutableMap$Builder<com.facebook.ads.androidx.media3.exoplayer.source.MediaSource$MediaPeriodId, com.facebook.ads.androidx.media3.common.Timeline> */
    @MetaExoPlayerCustomization(type = {"FEATURE_LOGIC"}, value = "builder of ImmutableMap should be a buildOrThrow")
    private void A02(Timeline timeline) {
        C4954oV<C4912no, Timeline> c4954oVA03 = AbstractC4956oX.A03();
        if (this.A03.isEmpty()) {
            A03(c4954oVA03, this.A01, timeline);
            C4912no c4912no = this.A02;
            C4912no c4912no2 = this.A01;
            if (A06[4].length() == 25) {
                throw new RuntimeException();
            }
            String[] strArr = A06;
            strArr[2] = "UxUdIKnoAyUMpq9t4QIr4fpxRPT3";
            strArr[1] = "6BCX8szW2uTmGViuSf00Yq1AObOIr";
            if (!AbstractC2617CB.A01(c4912no, c4912no2)) {
                A03(c4954oVA03, this.A02, timeline);
            }
            if (!AbstractC2617CB.A01(this.A00, this.A01) && !AbstractC2617CB.A01(this.A00, this.A02)) {
                A03(c4954oVA03, this.A00, timeline);
            }
        } else {
            for (int i2 = 0; i2 < this.A03.size(); i2++) {
                A03(c4954oVA03, this.A03.get(i2), timeline);
            }
            if (!this.A03.contains(this.A00)) {
                A03(c4954oVA03, this.A00, timeline);
            }
        }
        this.A04 = c4954oVA03.A07();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.oV != com.google.common.collect.ImmutableMap$Builder<com.facebook.ads.androidx.media3.exoplayer.source.MediaSource$MediaPeriodId, com.facebook.ads.androidx.media3.common.Timeline> */
    private void A03(C4954oV<C4912no, Timeline> c4954oV, C4912no c4912no, Timeline timeline) {
        if (c4912no == null) {
            return;
        }
        if (timeline.A0A(c4912no.A04) != -1) {
            c4954oV.A05(c4912no, timeline);
            return;
        }
        Timeline existingTimeline = this.A04.get(c4912no);
        if (existingTimeline == null) {
            return;
        }
        c4954oV.A05(c4912no, existingTimeline);
    }

    public static boolean A04(C4912no c4912no, Object obj, boolean z, int i2, int i3, int i4) {
        if (c4912no.A04.equals(obj)) {
            return (z && c4912no.A00 == i2 && c4912no.A01 == i3) || (!z && c4912no.A00 == -1 && c4912no.A02 == i4);
        }
        return false;
    }

    public final Timeline A05(C4912no c4912no) {
        return this.A04.get(c4912no);
    }

    public final C4912no A06() {
        return this.A00;
    }

    public final void A07(InterfaceC21053b interfaceC21053b) {
        this.A00 = A00(interfaceC21053b, this.A03, this.A01, this.A05);
        A02(interfaceC21053b.A7g());
    }
}
