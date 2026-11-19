package com.instagram.common.viewpoint.core;

import android.util.SparseArray;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.l4 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C4755l4 implements InterfaceC3169L8 {
    public static String[] A05 = {"ueDbV1wfakHSWIQF7BEzGoLlZXsjLXAz", "DUk", "o0l", "JXBQRCbHgV51hCMTPiBs95yrGLtJ9vRB", "UUCtZFjpq77XJSMaCIYouODFHgisrwF4", "OUp13aafPcRzH6W84Z44X0AbLYnCU3jN", "RRsP4MaHzu2rfmisltpPpgYoVzHnYDNm", "WbSPhlBTq3Mh8neaDCFEdYJRI0JZWypJ"};
    public final int A00;
    public final /* synthetic */ C4754l3 A04;
    public final C21854u A03 = new C21854u(new byte[5]);
    public final SparseArray<InterfaceC3178LH> A01 = new SparseArray<>();
    public final SparseIntArray A02 = new SparseIntArray();

    /* JADX WARN: Code duplicated, block: B:45:0x0176  */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.instagram.common.viewpoint.core.InterfaceC3169L8
    public final void A5A(C21864v c21864v) {
        C219453 c219453;
        if (c21864v.A0I() != 2) {
            return;
        }
        if (this.A04.A09 == 1 || this.A04.A09 == 2 || this.A04.A02 == 1) {
            c219453 = (C219453) this.A04.A0I.get(0);
        } else {
            c219453 = new C219453(((C219453) this.A04.A0I.get(0)).A02());
            this.A04.A0I.add(c219453);
        }
        if ((c21864v.A0I() & 128) == 0) {
            return;
        }
        c21864v.A0g(1);
        int iA0M = c21864v.A0M();
        int i2 = 3;
        c21864v.A0g(3);
        c21864v.A0h(this.A03, 2);
        this.A03.A09(3);
        int i3 = 13;
        this.A04.A01 = this.A03.A04(13);
        c21864v.A0h(this.A03, 2);
        int i4 = 4;
        this.A03.A09(4);
        c21864v.A0g(this.A03.A04(12));
        int i5 = 21;
        if (this.A04.A09 == 2 && this.A04.A05 == null) {
            this.A04.A05 = this.A04.A0H.A5V(21, new C3174LD(21, null, null, AbstractC22035C.A07));
            if (this.A04.A05 != null) {
                this.A04.A05.AAA(c219453, this.A04.A03, new C3177LG(iA0M, 21, 8192));
            }
        }
        this.A01.clear();
        this.A02.clear();
        int iA07 = c21864v.A07();
        while (iA07 > 0) {
            c21864v.A0h(this.A03, 5);
            int iA04 = this.A03.A04(8);
            this.A03.A09(i2);
            int iA05 = this.A03.A04(i3);
            this.A03.A09(i4);
            int iA06 = this.A03.A04(12);
            C3174LD c3174ldA00 = A00(c21864v, iA06);
            if (iA04 == 6 || iA04 == 5) {
                iA04 = c3174ldA00.A00;
            }
            iA07 -= iA06 + 5;
            int i6 = this.A04.A09 == 2 ? iA04 : iA05;
            if (!this.A04.A0C.get(i6)) {
                InterfaceC3178LH interfaceC3178LHA5V = (this.A04.A09 == 2 && iA04 == i5) ? this.A04.A05 : this.A04.A0H.A5V(iA04, c3174ldA00);
                if (this.A04.A09 == 2) {
                    SparseIntArray sparseIntArray = this.A02;
                    String[] strArr = A05;
                    if (strArr[0].charAt(21) == strArr[3].charAt(21)) {
                        throw new RuntimeException();
                    }
                    A05[7] = "JJxGvbQzsWrYD5XHKTSp80Ux1McJryio";
                    if (iA05 < sparseIntArray.get(i6, 8192)) {
                        this.A02.put(i6, iA05);
                        this.A01.put(i6, interfaceC3178LHA5V);
                    }
                } else {
                    this.A02.put(i6, iA05);
                    this.A01.put(i6, interfaceC3178LHA5V);
                }
            }
            i5 = 21;
            i2 = 3;
            i4 = 4;
            i3 = 13;
        }
        int size = this.A02.size();
        for (int i7 = 0; i7 < size; i7++) {
            int iKeyAt = this.A02.keyAt(i7);
            int iValueAt = this.A02.valueAt(i7);
            this.A04.A0C.put(iKeyAt, true);
            this.A04.A0D.put(iValueAt, true);
            InterfaceC3178LH interfaceC3178LHValueAt = this.A01.valueAt(i7);
            if (interfaceC3178LHValueAt != null) {
                if (interfaceC3178LHValueAt != this.A04.A05) {
                    interfaceC3178LHValueAt.AAA(c219453, this.A04.A03, new C3177LG(iA0M, iKeyAt, 8192));
                }
                this.A04.A0B.put(iValueAt, interfaceC3178LHValueAt);
            }
        }
        if (this.A04.A09 != 2) {
            this.A04.A0B.remove(this.A00);
            this.A04.A02 = this.A04.A09 != 1 ? this.A04.A02 - 1 : 0;
            if (this.A04.A02 == 0) {
                this.A04.A03.A6O();
                this.A04.A08 = true;
                return;
            }
            return;
        }
        if (this.A04.A08) {
            return;
        }
        InterfaceC2924HA interfaceC2924HA = this.A04.A03;
        String[] strArr2 = A05;
        if (strArr2[1].length() != strArr2[2].length()) {
            throw new RuntimeException();
        }
        String[] strArr3 = A05;
        strArr3[0] = "hBvWu7G0FYrLQDeafFD7KKlceKy2jgRX";
        strArr3[3] = "VoSHbxg0JUdlXnrGoiizfFeUaWFRK7d9";
        interfaceC2924HA.A6O();
        this.A04.A02 = 0;
        this.A04.A08 = true;
    }

    public C4755l4(C4754l3 c4754l3, int i2) {
        this.A04 = c4754l3;
        this.A00 = i2;
    }

    private C3174LD A00(C21864v c21864v, int i2) {
        int descriptorTag = c21864v.A09();
        int descriptorLength = descriptorTag + i2;
        int i3 = -1;
        String strTrim = null;
        ArrayList arrayList = null;
        while (c21864v.A09() < descriptorLength) {
            int positionOfNextDescriptor = c21864v.A0I();
            int iA09 = c21864v.A09() + c21864v.A0I();
            if (iA09 > descriptorLength) {
                break;
            }
            if (positionOfNextDescriptor == 5) {
                long jA0Q = c21864v.A0Q();
                if (jA0Q == 1094921523) {
                    i3 = 129;
                } else if (jA0Q == 1161904947) {
                    i3 = 135;
                } else if (jA0Q == 1094921524) {
                    i3 = 172;
                } else if (jA0Q == 1212503619) {
                    i3 = 36;
                }
            } else if (positionOfNextDescriptor == 106) {
                i3 = 129;
            } else if (positionOfNextDescriptor == 122) {
                i3 = 135;
            } else {
                String[] strArr = A05;
                String str = strArr[1];
                String str2 = strArr[2];
                int descriptorsStartPosition = str.length();
                if (descriptorsStartPosition != str2.length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A05;
                strArr2[0] = "GzIOqzBb8TAh93bRV2CN08O62ZCaAqRX";
                strArr2[3] = "fp9XAk3ifz38aVsym619EhTf04al4HEa";
                if (positionOfNextDescriptor == 127) {
                    int descriptorsStartPosition2 = c21864v.A0I();
                    if (descriptorsStartPosition2 == 21) {
                        i3 = 172;
                    }
                } else if (positionOfNextDescriptor == 123) {
                    i3 = 138;
                } else {
                    String[] strArr3 = A05;
                    String str3 = strArr3[1];
                    String str4 = strArr3[2];
                    int descriptorsStartPosition3 = str3.length();
                    if (descriptorsStartPosition3 != str4.length()) {
                        throw new RuntimeException();
                    }
                    String[] strArr4 = A05;
                    strArr4[5] = "wqYpRyaK4cDMDpt9hZQKwXCqV01Ydwf6";
                    strArr4[4] = "1qKbohas3rI7JmruTyrxsTuTEMq9fdbm";
                    if (positionOfNextDescriptor == 10) {
                        String strA0W = c21864v.A0W(3);
                        String[] strArr5 = A05;
                        String str5 = strArr5[1];
                        String str6 = strArr5[2];
                        int descriptorsStartPosition4 = str5.length();
                        if (descriptorsStartPosition4 != str6.length()) {
                            strTrim = strA0W.trim();
                        } else {
                            A05[6] = "aW10g0SpfKclE3j5mqsPv8AasgcB3Ji3";
                            strTrim = strA0W.trim();
                        }
                    } else if (positionOfNextDescriptor == 89) {
                        i3 = 89;
                        arrayList = new ArrayList();
                        while (c21864v.A09() < iA09) {
                            String strTrim2 = c21864v.A0W(3).trim();
                            int iA0I = c21864v.A0I();
                            byte[] bArr = new byte[4];
                            c21864v.A0k(bArr, 0, 4);
                            arrayList.add(new C3173LC(strTrim2, iA0I, bArr));
                        }
                    } else if (positionOfNextDescriptor == 111) {
                        i3 = 257;
                    }
                }
            }
            c21864v.A0g(iA09 - c21864v.A09());
        }
        c21864v.A0f(descriptorLength);
        return new C3174LD(i3, strTrim, arrayList, Arrays.copyOfRange(c21864v.A0l(), descriptorTag, descriptorLength));
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3169L8
    public final void AAA(C219453 c219453, InterfaceC2924HA interfaceC2924HA, C3177LG c3177lg) {
    }
}
