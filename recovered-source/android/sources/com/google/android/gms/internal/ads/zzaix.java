package com.google.android.gms.internal.ads;

import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes2.dex */
final class zzaix {

    /* JADX INFO: renamed from: a */
    public static final String[] f5493a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};

    /* JADX INFO: renamed from: b */
    public static final String[] f5494b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};

    /* JADX INFO: renamed from: c */
    public static final String[] f5495c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    /* JADX INFO: renamed from: a */
    public static zzgwt m4147a(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        zzgzi zzgziVar = zzgwt.f18303t;
        zzgwq zzgwqVar = new zzgwq();
        do {
            String strConcat = str.concat(":Item");
            xmlPullParser.next();
            if (zzfv.m6727b(xmlPullParser, strConcat)) {
                String strConcat2 = str2.concat(":Mime");
                String strConcat3 = str2.concat(":Semantic");
                String strConcat4 = str2.concat(":Length");
                String strConcat5 = str2.concat(":Padding");
                String strM6728c = zzfv.m6728c(xmlPullParser, strConcat2);
                String strM6728c2 = zzfv.m6728c(xmlPullParser, strConcat3);
                String strM6728c3 = zzfv.m6728c(xmlPullParser, strConcat4);
                String strM6728c4 = zzfv.m6728c(xmlPullParser, strConcat5);
                if (strM6728c == null || strM6728c2 == null) {
                    return zzgyo.f18355w;
                }
                zzgwqVar.m7203c(new zzaiv(strM6728c, strM6728c3 != null ? Long.parseLong(strM6728c3) : 0L, strM6728c4 != null ? Long.parseLong(strM6728c4) : 0L));
            }
        } while (!zzfv.m6726a(xmlPullParser, str.concat(":Directory")));
        return zzgwqVar.m7214f();
    }
}
