package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbgj {

    /* JADX INFO: renamed from: a */
    public final zzbgh f7823a;

    /* JADX INFO: renamed from: b */
    public final int f7824b;

    /* JADX INFO: renamed from: c */
    public final int f7825c;

    public zzbgj(int i2, int i3, int i4) {
        this.f7824b = i2;
        i3 = (i3 > 64 || i3 < 0) ? 64 : i3;
        if (i4 <= 0) {
            this.f7825c = 1;
        } else {
            this.f7825c = i4;
        }
        this.f7823a = new zzbgh(i3);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0092  */
    /* JADX INFO: renamed from: a */
    public final String m4869a(ArrayList arrayList, ArrayList arrayList2) {
        int i2;
        Collections.sort(arrayList2, new zzbgi());
        HashSet hashSet = new HashSet();
        loop0: for (int i3 = 0; i3 < arrayList2.size(); i3++) {
            String[] strArrSplit = Normalizer.normalize((CharSequence) arrayList.get(((zzbfy) arrayList2.get(i3)).f7804e), Normalizer.Form.NFKC).toLowerCase(Locale.US).split("\n");
            if (strArrSplit.length != 0) {
                for (String str : strArrSplit) {
                    if (str.contains("'")) {
                        StringBuilder sb = new StringBuilder(str);
                        int i4 = 1;
                        boolean z = false;
                        while (true) {
                            int i5 = i4 + 2;
                            if (i5 > sb.length()) {
                                break;
                            }
                            if (sb.charAt(i4) == '\'') {
                                if (sb.charAt(i4 - 1) != ' ') {
                                    int i6 = i4 + 1;
                                    if ((sb.charAt(i6) == 's' || sb.charAt(i6) == 'S') && (i5 == sb.length() || sb.charAt(i5) == ' ')) {
                                        sb.insert(i4, ' ');
                                        i4 = i5;
                                    } else {
                                        sb.setCharAt(i4, ' ');
                                    }
                                } else {
                                    sb.setCharAt(i4, ' ');
                                }
                                z = true;
                            }
                            i4++;
                        }
                        String string = z ? sb.toString() : null;
                        if (string != null) {
                            str = string;
                        }
                    }
                    String[] strArrM4862b = zzbgd.m4862b(str, true);
                    int length = strArrM4862b.length;
                    int i7 = this.f7825c;
                    if (length >= i7) {
                        int i8 = 0;
                        while (true) {
                            int length2 = strArrM4862b.length;
                            i2 = this.f7824b;
                            if (i8 >= length2) {
                                break;
                            }
                            String strConcat = "";
                            for (int i9 = 0; i9 < i7; i9++) {
                                int i10 = i8 + i9;
                                if (i10 >= strArrM4862b.length) {
                                    break;
                                }
                                if (i9 > 0) {
                                    strConcat = strConcat.concat(" ");
                                }
                                strConcat = strConcat.concat(String.valueOf(strArrM4862b[i10]));
                            }
                            hashSet.add(strConcat);
                            if (hashSet.size() >= i2) {
                                break loop0;
                            }
                            i8++;
                        }
                        if (hashSet.size() >= i2) {
                            break loop0;
                        }
                    }
                }
            }
        }
        zzbgb zzbgbVar = new zzbgb();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            try {
                zzbgbVar.f7813b.write(this.f7823a.m4868b((String) it.next()));
            } catch (IOException e) {
                int i11 = com.google.android.gms.ads.internal.util.zze.f3574b;
                com.google.android.gms.ads.internal.util.client.zzo.m3071d("Error while writing hash to byteStream", e);
            }
        }
        return zzbgbVar.toString();
    }
}
