package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Pair;
import android.util.SparseArray;
import android.view.Surface;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.constraintlayout.widget.C1137R;
import androidx.core.app.NotificationManagerCompat;
import androidx.core.location.LocationRequestCompat;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.datastore.preferences.protobuf.AbstractC1456a;
import com.facebook.ads.AdError;
import com.google.android.material.internal.ViewUtils;
import com.google.firebase.messaging.ServiceStarter;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;

/* JADX INFO: loaded from: classes2.dex */
public final class zzadg extends zzvw implements zzadv {

    /* JADX INFO: renamed from: M1 */
    public static final int[] f4967M1 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};

    /* JADX INFO: renamed from: N1 */
    public static boolean f4968N1;

    /* JADX INFO: renamed from: O1 */
    public static boolean f4969O1;

    /* JADX INFO: renamed from: A1 */
    public boolean f4970A1;

    /* JADX INFO: renamed from: B1 */
    public long f4971B1;

    /* JADX INFO: renamed from: C1 */
    public int f4972C1;

    /* JADX INFO: renamed from: D1 */
    public long f4973D1;

    /* JADX INFO: renamed from: E1 */
    public zzbv f4974E1;

    /* JADX INFO: renamed from: F1 */
    public zzbv f4975F1;

    /* JADX INFO: renamed from: G1 */
    public int f4976G1;

    /* JADX INFO: renamed from: H1 */
    public int f4977H1;

    /* JADX INFO: renamed from: I1 */
    public zzadt f4978I1;

    /* JADX INFO: renamed from: J1 */
    public long f4979J1;

    /* JADX INFO: renamed from: K1 */
    public boolean f4980K1;

    /* JADX INFO: renamed from: L1 */
    public int f4981L1;

    /* JADX INFO: renamed from: X0 */
    public final Context f4982X0;

    /* JADX INFO: renamed from: Y0 */
    public final boolean f4983Y0;

    /* JADX INFO: renamed from: Z0 */
    public final zzaeq f4984Z0;

    /* JADX INFO: renamed from: a1 */
    public final boolean f4985a1;

    /* JADX INFO: renamed from: b1 */
    public final zzadw f4986b1;

    /* JADX INFO: renamed from: c1 */
    public final zzadu f4987c1;

    /* JADX INFO: renamed from: d1 */
    public final zzacp f4988d1;

    /* JADX INFO: renamed from: e1 */
    public final long f4989e1;

    /* JADX INFO: renamed from: f1 */
    public final zzadx f4990f1;

    /* JADX INFO: renamed from: g1 */
    public final PriorityQueue f4991g1;

    /* JADX INFO: renamed from: h1 */
    public zzadf f4992h1;

    /* JADX INFO: renamed from: i1 */
    public boolean f4993i1;

    /* JADX INFO: renamed from: j1 */
    public boolean f4994j1;

    /* JADX INFO: renamed from: k1 */
    public zzaew f4995k1;

    /* JADX INFO: renamed from: l1 */
    public boolean f4996l1;

    /* JADX INFO: renamed from: m1 */
    public int f4997m1;

    /* JADX INFO: renamed from: n1 */
    public List f4998n1;

    /* JADX INFO: renamed from: o1 */
    public Surface f4999o1;

    /* JADX INFO: renamed from: p1 */
    public zzadi f5000p1;

    /* JADX INFO: renamed from: q1 */
    public zzev f5001q1;

    /* JADX INFO: renamed from: r1 */
    public boolean f5002r1;

    /* JADX INFO: renamed from: s1 */
    public int f5003s1;

    /* JADX INFO: renamed from: t1 */
    public int f5004t1;

    /* JADX INFO: renamed from: u1 */
    public long f5005u1;

    /* JADX INFO: renamed from: v1 */
    public int f5006v1;

    /* JADX INFO: renamed from: w1 */
    public int f5007w1;

    /* JADX INFO: renamed from: x1 */
    public int f5008x1;

    /* JADX INFO: renamed from: y1 */
    public zznj f5009y1;

    /* JADX INFO: renamed from: z1 */
    public long f5010z1;

    /* JADX WARN: Illegal instructions before constructor call */
    public zzadg(zzade zzadeVar) {
        zzve zzveVar = zzadeVar.f4961d;
        zzvy zzvyVar = zzadeVar.f4960c;
        Context context = zzadeVar.f4958a;
        super(context.getApplicationContext(), 2, zzveVar, zzvyVar, 30.0f);
        Context applicationContext = context.getApplicationContext();
        this.f4982X0 = applicationContext;
        this.f4995k1 = null;
        this.f4984Z0 = new zzaeq(zzadeVar.f4962e, zzadeVar.f4963f);
        this.f4983Y0 = this.f4995k1 == null;
        this.f4986b1 = new zzadw(applicationContext, this);
        this.f4987c1 = new zzadu();
        this.f4985a1 = "NVIDIA".equals(Build.MANUFACTURER);
        this.f5001q1 = zzev.f14942c;
        this.f5003s1 = 1;
        this.f5004t1 = 0;
        this.f4974E1 = zzbv.f9425d;
        this.f4977H1 = 0;
        this.f4975F1 = null;
        this.f4976G1 = NotificationManagerCompat.IMPORTANCE_UNSPECIFIED;
        this.f4979J1 = -9223372036854775807L;
        this.f4988d1 = new zzacp();
        this.f4991g1 = new PriorityQueue();
        this.f4989e1 = -15000L;
        this.f4990f1 = new zzadx();
        this.f5009y1 = null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:19:0x003f  */
    /* JADX INFO: renamed from: N0 */
    public static int m3974N0(zzvp zzvpVar, zzv zzvVar) {
        int i2 = zzvVar.f21068v;
        int i3 = zzvVar.f21069w;
        if (i2 != -1 && i3 != -1) {
            String str = zzvVar.f21061o;
            str.getClass();
            if ("video/dolby-vision".equals(str)) {
                Pair pairM6033b = zzdr.m6033b(zzvVar);
                if (pairM6033b == null) {
                    str = "video/hevc";
                } else {
                    int iIntValue = ((Integer) pairM6033b.first).intValue();
                    if (iIntValue == 512 || iIntValue == 1 || iIntValue == 2) {
                        str = "video/avc";
                    } else if (iIntValue == 1024) {
                        str = "video/av01";
                    } else {
                        str = "video/hevc";
                    }
                }
            }
            int i4 = 4;
            switch (str) {
                case "video/3gpp":
                case "video/mp4v-es":
                case "video/av01":
                case "video/x-vnd.on2.vp8":
                    return ((i2 * i3) * 3) / i4;
                case "video/hevc":
                    return Math.max(2097152, ((i2 * i3) * 3) / 4);
                case "video/avc":
                    String str2 = Build.MODEL;
                    if (!"BRAVIA 4K 2015".equals(str2) && (!"Amazon".equals(Build.MANUFACTURER) || (!"KFSOWI".equals(str2) && (!"AFTS".equals(str2) || !zzvpVar.f21116f)))) {
                        String str3 = zzfm.f16091a;
                        return ((((i3 + 15) / 16) * ((i2 + 15) / 16)) * ViewUtils.EDGE_TO_EDGE_FLAGS) / 4;
                    }
                    break;
                case "video/x-vnd.on2.vp9":
                    i4 = 8;
                    return ((i2 * i3) * 3) / i4;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: Q0 */
    public static int m3975Q0(zzvp zzvpVar, zzv zzvVar) {
        int i2 = zzvVar.f21062p;
        if (i2 == -1) {
            return m3974N0(zzvpVar, zzvVar);
        }
        List list = zzvVar.f21064r;
        int size = list.size();
        int length = 0;
        for (int i3 = 0; i3 < size; i3++) {
            length += ((byte[]) list.get(i3)).length;
        }
        return i2 + length;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0141  */
    /* JADX WARN: Code duplicated, block: B:102:0x0149  */
    /* JADX WARN: Code duplicated, block: B:103:0x014d  */
    /* JADX WARN: Code duplicated, block: B:105:0x0155  */
    /* JADX WARN: Code duplicated, block: B:106:0x0159  */
    /* JADX WARN: Code duplicated, block: B:108:0x0161  */
    /* JADX WARN: Code duplicated, block: B:109:0x0165  */
    /* JADX WARN: Code duplicated, block: B:111:0x016d  */
    /* JADX WARN: Code duplicated, block: B:112:0x0171  */
    /* JADX WARN: Code duplicated, block: B:114:0x0179  */
    /* JADX WARN: Code duplicated, block: B:115:0x017d  */
    /* JADX WARN: Code duplicated, block: B:117:0x0185  */
    /* JADX WARN: Code duplicated, block: B:118:0x0189  */
    /* JADX WARN: Code duplicated, block: B:120:0x0191  */
    /* JADX WARN: Code duplicated, block: B:121:0x0195  */
    /* JADX WARN: Code duplicated, block: B:123:0x019d  */
    /* JADX WARN: Code duplicated, block: B:124:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:126:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:127:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:129:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:130:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:132:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:133:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:135:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:136:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:138:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:139:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:141:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:142:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:144:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:145:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:147:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:148:0x0201  */
    /* JADX WARN: Code duplicated, block: B:150:0x0209  */
    /* JADX WARN: Code duplicated, block: B:151:0x020d  */
    /* JADX WARN: Code duplicated, block: B:153:0x0215  */
    /* JADX WARN: Code duplicated, block: B:154:0x0219  */
    /* JADX WARN: Code duplicated, block: B:156:0x0221  */
    /* JADX WARN: Code duplicated, block: B:157:0x0225  */
    /* JADX WARN: Code duplicated, block: B:159:0x022d  */
    /* JADX WARN: Code duplicated, block: B:160:0x0231  */
    /* JADX WARN: Code duplicated, block: B:162:0x0239  */
    /* JADX WARN: Code duplicated, block: B:163:0x023d  */
    /* JADX WARN: Code duplicated, block: B:165:0x0245  */
    /* JADX WARN: Code duplicated, block: B:166:0x0249  */
    /* JADX WARN: Code duplicated, block: B:168:0x0251  */
    /* JADX WARN: Code duplicated, block: B:169:0x0255  */
    /* JADX WARN: Code duplicated, block: B:171:0x025d  */
    /* JADX WARN: Code duplicated, block: B:172:0x0261  */
    /* JADX WARN: Code duplicated, block: B:174:0x0269  */
    /* JADX WARN: Code duplicated, block: B:175:0x026d  */
    /* JADX WARN: Code duplicated, block: B:177:0x0275  */
    /* JADX WARN: Code duplicated, block: B:178:0x0279  */
    /* JADX WARN: Code duplicated, block: B:180:0x0281  */
    /* JADX WARN: Code duplicated, block: B:181:0x0285  */
    /* JADX WARN: Code duplicated, block: B:183:0x028d  */
    /* JADX WARN: Code duplicated, block: B:184:0x0291  */
    /* JADX WARN: Code duplicated, block: B:186:0x0299  */
    /* JADX WARN: Code duplicated, block: B:187:0x029d  */
    /* JADX WARN: Code duplicated, block: B:189:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:190:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:192:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:193:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:195:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:196:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:198:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:199:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:201:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:202:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:204:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:205:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:207:0x02ed  */
    /* JADX WARN: Code duplicated, block: B:208:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:210:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:211:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:213:0x0304  */
    /* JADX WARN: Code duplicated, block: B:214:0x0308  */
    /* JADX WARN: Code duplicated, block: B:216:0x0310  */
    /* JADX WARN: Code duplicated, block: B:217:0x0314  */
    /* JADX WARN: Code duplicated, block: B:219:0x031c  */
    /* JADX WARN: Code duplicated, block: B:220:0x0320  */
    /* JADX WARN: Code duplicated, block: B:222:0x0328  */
    /* JADX WARN: Code duplicated, block: B:223:0x032c  */
    /* JADX WARN: Code duplicated, block: B:225:0x0334  */
    /* JADX WARN: Code duplicated, block: B:226:0x0338  */
    /* JADX WARN: Code duplicated, block: B:228:0x0340  */
    /* JADX WARN: Code duplicated, block: B:229:0x0344  */
    /* JADX WARN: Code duplicated, block: B:231:0x034c  */
    /* JADX WARN: Code duplicated, block: B:232:0x0350  */
    /* JADX WARN: Code duplicated, block: B:234:0x0358  */
    /* JADX WARN: Code duplicated, block: B:235:0x035c  */
    /* JADX WARN: Code duplicated, block: B:237:0x0364  */
    /* JADX WARN: Code duplicated, block: B:238:0x0368  */
    /* JADX WARN: Code duplicated, block: B:240:0x0370  */
    /* JADX WARN: Code duplicated, block: B:241:0x0374  */
    /* JADX WARN: Code duplicated, block: B:243:0x037c  */
    /* JADX WARN: Code duplicated, block: B:244:0x0380  */
    /* JADX WARN: Code duplicated, block: B:246:0x0388  */
    /* JADX WARN: Code duplicated, block: B:247:0x038c  */
    /* JADX WARN: Code duplicated, block: B:249:0x0394  */
    /* JADX WARN: Code duplicated, block: B:250:0x0398  */
    /* JADX WARN: Code duplicated, block: B:252:0x03a0  */
    /* JADX WARN: Code duplicated, block: B:253:0x03a4  */
    /* JADX WARN: Code duplicated, block: B:255:0x03ac  */
    /* JADX WARN: Code duplicated, block: B:256:0x03b0  */
    /* JADX WARN: Code duplicated, block: B:258:0x03b8  */
    /* JADX WARN: Code duplicated, block: B:259:0x03bb  */
    /* JADX WARN: Code duplicated, block: B:261:0x03c3  */
    /* JADX WARN: Code duplicated, block: B:262:0x03c7  */
    /* JADX WARN: Code duplicated, block: B:264:0x03cf  */
    /* JADX WARN: Code duplicated, block: B:265:0x03d2  */
    /* JADX WARN: Code duplicated, block: B:267:0x03da  */
    /* JADX WARN: Code duplicated, block: B:268:0x03dd  */
    /* JADX WARN: Code duplicated, block: B:270:0x03e5  */
    /* JADX WARN: Code duplicated, block: B:271:0x03e9  */
    /* JADX WARN: Code duplicated, block: B:273:0x03f1  */
    /* JADX WARN: Code duplicated, block: B:274:0x03f5  */
    /* JADX WARN: Code duplicated, block: B:276:0x03fd  */
    /* JADX WARN: Code duplicated, block: B:277:0x0401  */
    /* JADX WARN: Code duplicated, block: B:279:0x0409  */
    /* JADX WARN: Code duplicated, block: B:280:0x040d  */
    /* JADX WARN: Code duplicated, block: B:282:0x0415  */
    /* JADX WARN: Code duplicated, block: B:283:0x0419  */
    /* JADX WARN: Code duplicated, block: B:285:0x0421  */
    /* JADX WARN: Code duplicated, block: B:286:0x0425  */
    /* JADX WARN: Code duplicated, block: B:288:0x042d  */
    /* JADX WARN: Code duplicated, block: B:289:0x0431  */
    /* JADX WARN: Code duplicated, block: B:291:0x0439  */
    /* JADX WARN: Code duplicated, block: B:292:0x043d  */
    /* JADX WARN: Code duplicated, block: B:294:0x0445  */
    /* JADX WARN: Code duplicated, block: B:295:0x0449  */
    /* JADX WARN: Code duplicated, block: B:297:0x0451  */
    /* JADX WARN: Code duplicated, block: B:298:0x0455  */
    /* JADX WARN: Code duplicated, block: B:300:0x045d  */
    /* JADX WARN: Code duplicated, block: B:301:0x0461  */
    /* JADX WARN: Code duplicated, block: B:303:0x0469  */
    /* JADX WARN: Code duplicated, block: B:304:0x046d  */
    /* JADX WARN: Code duplicated, block: B:306:0x0475  */
    /* JADX WARN: Code duplicated, block: B:307:0x0479  */
    /* JADX WARN: Code duplicated, block: B:309:0x0481  */
    /* JADX WARN: Code duplicated, block: B:310:0x0485  */
    /* JADX WARN: Code duplicated, block: B:312:0x048d  */
    /* JADX WARN: Code duplicated, block: B:313:0x0491  */
    /* JADX WARN: Code duplicated, block: B:315:0x0499  */
    /* JADX WARN: Code duplicated, block: B:316:0x049c  */
    /* JADX WARN: Code duplicated, block: B:318:0x04a4  */
    /* JADX WARN: Code duplicated, block: B:319:0x04a7  */
    /* JADX WARN: Code duplicated, block: B:321:0x04af  */
    /* JADX WARN: Code duplicated, block: B:322:0x04b2  */
    /* JADX WARN: Code duplicated, block: B:324:0x04ba  */
    /* JADX WARN: Code duplicated, block: B:325:0x04be  */
    /* JADX WARN: Code duplicated, block: B:328:0x04c8  */
    /* JADX WARN: Code duplicated, block: B:330:0x04d0  */
    /* JADX WARN: Code duplicated, block: B:331:0x04d3  */
    /* JADX WARN: Code duplicated, block: B:333:0x04db  */
    /* JADX WARN: Code duplicated, block: B:334:0x04de  */
    /* JADX WARN: Code duplicated, block: B:336:0x04e6  */
    /* JADX WARN: Code duplicated, block: B:337:0x04ea  */
    /* JADX WARN: Code duplicated, block: B:339:0x04f2  */
    /* JADX WARN: Code duplicated, block: B:340:0x04f6  */
    /* JADX WARN: Code duplicated, block: B:342:0x04fe  */
    /* JADX WARN: Code duplicated, block: B:343:0x0502  */
    /* JADX WARN: Code duplicated, block: B:345:0x050a  */
    /* JADX WARN: Code duplicated, block: B:346:0x050e  */
    /* JADX WARN: Code duplicated, block: B:348:0x0516  */
    /* JADX WARN: Code duplicated, block: B:349:0x051a  */
    /* JADX WARN: Code duplicated, block: B:351:0x0522  */
    /* JADX WARN: Code duplicated, block: B:352:0x0526  */
    /* JADX WARN: Code duplicated, block: B:354:0x052e  */
    /* JADX WARN: Code duplicated, block: B:355:0x0532  */
    /* JADX WARN: Code duplicated, block: B:357:0x053a  */
    /* JADX WARN: Code duplicated, block: B:358:0x053e  */
    /* JADX WARN: Code duplicated, block: B:360:0x0546  */
    /* JADX WARN: Code duplicated, block: B:361:0x054a  */
    /* JADX WARN: Code duplicated, block: B:363:0x0552  */
    /* JADX WARN: Code duplicated, block: B:364:0x0556  */
    /* JADX WARN: Code duplicated, block: B:366:0x055e  */
    /* JADX WARN: Code duplicated, block: B:367:0x0562  */
    /* JADX WARN: Code duplicated, block: B:369:0x056a  */
    /* JADX WARN: Code duplicated, block: B:370:0x056e  */
    /* JADX WARN: Code duplicated, block: B:372:0x0576  */
    /* JADX WARN: Code duplicated, block: B:373:0x057a  */
    /* JADX WARN: Code duplicated, block: B:375:0x0582  */
    /* JADX WARN: Code duplicated, block: B:376:0x0586  */
    /* JADX WARN: Code duplicated, block: B:378:0x058e  */
    /* JADX WARN: Code duplicated, block: B:379:0x0592  */
    /* JADX WARN: Code duplicated, block: B:381:0x059a  */
    /* JADX WARN: Code duplicated, block: B:382:0x059e  */
    /* JADX WARN: Code duplicated, block: B:384:0x05a6  */
    /* JADX WARN: Code duplicated, block: B:385:0x05aa  */
    /* JADX WARN: Code duplicated, block: B:387:0x05b2  */
    /* JADX WARN: Code duplicated, block: B:388:0x05b6  */
    /* JADX WARN: Code duplicated, block: B:390:0x05be  */
    /* JADX WARN: Code duplicated, block: B:391:0x05c2  */
    /* JADX WARN: Code duplicated, block: B:393:0x05ca  */
    /* JADX WARN: Code duplicated, block: B:394:0x05ce  */
    /* JADX WARN: Code duplicated, block: B:396:0x05d6  */
    /* JADX WARN: Code duplicated, block: B:397:0x05da  */
    /* JADX WARN: Code duplicated, block: B:399:0x05e2  */
    /* JADX WARN: Code duplicated, block: B:400:0x05e6  */
    /* JADX WARN: Code duplicated, block: B:402:0x05ee  */
    /* JADX WARN: Code duplicated, block: B:403:0x05f2  */
    /* JADX WARN: Code duplicated, block: B:405:0x05fa  */
    /* JADX WARN: Code duplicated, block: B:406:0x05fe  */
    /* JADX WARN: Code duplicated, block: B:408:0x0606  */
    /* JADX WARN: Code duplicated, block: B:409:0x060a  */
    /* JADX WARN: Code duplicated, block: B:411:0x0612  */
    /* JADX WARN: Code duplicated, block: B:412:0x0616  */
    /* JADX WARN: Code duplicated, block: B:414:0x061e  */
    /* JADX WARN: Code duplicated, block: B:415:0x0622  */
    /* JADX WARN: Code duplicated, block: B:417:0x062a  */
    /* JADX WARN: Code duplicated, block: B:418:0x062e  */
    /* JADX WARN: Code duplicated, block: B:420:0x0636  */
    /* JADX WARN: Code duplicated, block: B:421:0x063a  */
    /* JADX WARN: Code duplicated, block: B:423:0x0642  */
    /* JADX WARN: Code duplicated, block: B:424:0x0646  */
    /* JADX WARN: Code duplicated, block: B:426:0x064e  */
    /* JADX WARN: Code duplicated, block: B:427:0x0652  */
    /* JADX WARN: Code duplicated, block: B:429:0x065a  */
    /* JADX WARN: Code duplicated, block: B:42:0x0082 A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:430:0x065d  */
    /* JADX WARN: Code duplicated, block: B:432:0x0665  */
    /* JADX WARN: Code duplicated, block: B:433:0x0668  */
    /* JADX WARN: Code duplicated, block: B:435:0x0670  */
    /* JADX WARN: Code duplicated, block: B:436:0x0674  */
    /* JADX WARN: Code duplicated, block: B:438:0x067c  */
    /* JADX WARN: Code duplicated, block: B:439:0x0680  */
    /* JADX WARN: Code duplicated, block: B:441:0x0688  */
    /* JADX WARN: Code duplicated, block: B:442:0x068c  */
    /* JADX WARN: Code duplicated, block: B:444:0x0694  */
    /* JADX WARN: Code duplicated, block: B:445:0x0698  */
    /* JADX WARN: Code duplicated, block: B:447:0x06a0  */
    /* JADX WARN: Code duplicated, block: B:448:0x06a4  */
    /* JADX WARN: Code duplicated, block: B:450:0x06ac  */
    /* JADX WARN: Code duplicated, block: B:451:0x06b0  */
    /* JADX WARN: Code duplicated, block: B:453:0x06b8  */
    /* JADX WARN: Code duplicated, block: B:454:0x06bc  */
    /* JADX WARN: Code duplicated, block: B:456:0x06c4  */
    /* JADX WARN: Code duplicated, block: B:457:0x06c8  */
    /* JADX WARN: Code duplicated, block: B:459:0x06d0  */
    /* JADX WARN: Code duplicated, block: B:45:0x0088  */
    /* JADX WARN: Code duplicated, block: B:460:0x06d4  */
    /* JADX WARN: Code duplicated, block: B:462:0x06dc  */
    /* JADX WARN: Code duplicated, block: B:463:0x06e0  */
    /* JADX WARN: Code duplicated, block: B:465:0x06e8  */
    /* JADX WARN: Code duplicated, block: B:466:0x06ec  */
    /* JADX WARN: Code duplicated, block: B:468:0x06f4  */
    /* JADX WARN: Code duplicated, block: B:469:0x06f8  */
    /* JADX WARN: Code duplicated, block: B:471:0x0700  */
    /* JADX WARN: Code duplicated, block: B:472:0x0704  */
    /* JADX WARN: Code duplicated, block: B:474:0x070c  */
    /* JADX WARN: Code duplicated, block: B:475:0x0710  */
    /* JADX WARN: Code duplicated, block: B:477:0x0718  */
    /* JADX WARN: Code duplicated, block: B:478:0x071c  */
    /* JADX WARN: Code duplicated, block: B:480:0x0724  */
    /* JADX WARN: Code duplicated, block: B:481:0x0728  */
    /* JADX WARN: Code duplicated, block: B:483:0x0730  */
    /* JADX WARN: Code duplicated, block: B:484:0x0733  */
    /* JADX WARN: Code duplicated, block: B:486:0x073b  */
    /* JADX WARN: Code duplicated, block: B:487:0x073e  */
    /* JADX WARN: Code duplicated, block: B:489:0x0746  */
    /* JADX WARN: Code duplicated, block: B:490:0x0749  */
    /* JADX WARN: Code duplicated, block: B:492:0x0751  */
    /* JADX WARN: Code duplicated, block: B:493:0x0754  */
    /* JADX WARN: Code duplicated, block: B:495:0x075c  */
    /* JADX WARN: Code duplicated, block: B:496:0x075f  */
    /* JADX WARN: Code duplicated, block: B:498:0x0767  */
    /* JADX WARN: Code duplicated, block: B:499:0x076a  */
    /* JADX WARN: Code duplicated, block: B:501:0x0772  */
    /* JADX WARN: Code duplicated, block: B:502:0x0775  */
    /* JADX WARN: Code duplicated, block: B:504:0x077d  */
    /* JADX WARN: Code duplicated, block: B:505:0x0780  */
    /* JADX WARN: Code duplicated, block: B:507:0x0788  */
    /* JADX WARN: Code duplicated, block: B:508:0x078b  */
    /* JADX WARN: Code duplicated, block: B:50:0x0097 A[Catch: all -> 0x0085, TRY_LEAVE, TryCatch #0 {, blocks: (B:7:0x000f, B:518:0x07a7, B:10:0x0015, B:12:0x0023, B:517:0x07a3, B:47:0x008c, B:50:0x0097, B:85:0x0106, B:510:0x078f), top: B:523:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:510:0x078f A[Catch: all -> 0x0085, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:7:0x000f, B:518:0x07a7, B:10:0x0015, B:12:0x0023, B:517:0x07a3, B:47:0x008c, B:50:0x0097, B:85:0x0106, B:510:0x078f), top: B:523:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:514:0x0799  */
    /* JADX WARN: Code duplicated, block: B:533:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:534:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:535:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:536:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:537:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:538:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:539:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:540:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:541:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:542:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:543:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:544:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:545:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:546:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:547:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:548:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:549:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:550:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:551:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:552:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:553:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:554:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:555:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:556:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:557:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:558:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:559:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:560:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:561:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:562:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:563:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:564:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:565:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:566:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:567:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:568:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:569:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:570:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:571:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:572:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:573:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:574:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:575:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:576:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:577:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:578:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:579:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:580:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:581:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:582:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:583:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:584:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:585:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:586:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:587:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:588:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:589:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:590:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:591:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:592:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:593:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:594:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:595:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:596:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:597:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:598:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:599:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:600:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:601:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:602:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:603:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:604:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:605:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:606:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:607:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:608:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:609:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:610:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:611:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:612:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:613:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:614:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:615:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:616:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:617:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:618:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:619:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:620:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:621:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:622:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:623:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:624:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:625:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:626:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:627:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:628:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:629:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:630:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:631:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:632:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:633:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:634:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:635:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:636:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:637:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:638:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:639:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:640:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:641:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:642:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:643:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:644:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:645:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:646:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:647:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:648:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:649:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:650:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:651:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:652:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:653:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:654:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:655:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:656:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:657:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:658:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:659:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:660:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:661:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:662:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:663:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:664:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:665:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:666:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:667:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:668:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:669:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:670:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:671:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:672:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:673:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:674:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:675:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:676:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:677:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:678:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:679:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:680:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:681:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:69:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:71:0x00de  */
    /* JADX WARN: Code duplicated, block: B:72:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:74:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:75:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:77:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:78:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:80:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:81:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:83:0x0102  */
    /* JADX WARN: Code duplicated, block: B:85:0x0106 A[Catch: all -> 0x0085, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:7:0x000f, B:518:0x07a7, B:10:0x0015, B:12:0x0023, B:517:0x07a3, B:47:0x008c, B:50:0x0097, B:85:0x0106, B:510:0x078f), top: B:523:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:88:0x0111  */
    /* JADX WARN: Code duplicated, block: B:90:0x0119  */
    /* JADX WARN: Code duplicated, block: B:91:0x011d  */
    /* JADX WARN: Code duplicated, block: B:93:0x0125  */
    /* JADX WARN: Code duplicated, block: B:94:0x0129  */
    /* JADX WARN: Code duplicated, block: B:96:0x0131  */
    /* JADX WARN: Code duplicated, block: B:97:0x0135  */
    /* JADX WARN: Code duplicated, block: B:99:0x013d  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: R0 */
    public static final boolean m3976R0(String str) {
        String str2;
        byte b;
        String str3;
        byte b2;
        boolean z = false;
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (zzadg.class) {
            if (!f4968N1) {
                int i2 = Build.VERSION.SDK_INT;
                byte b3 = 28;
                if (i2 <= 28) {
                    String str4 = Build.DEVICE;
                    switch (str4.hashCode()) {
                        case -1339091551:
                            b2 = !str4.equals("dangal") ? (byte) -1 : (byte) 1;
                            break;
                        case -1220081023:
                            b2 = !str4.equals("dangalFHD") ? (byte) -1 : (byte) 3;
                            break;
                        case -1220066608:
                            b2 = !str4.equals("dangalUHD") ? (byte) -1 : (byte) 2;
                            break;
                        case -1012436106:
                            b2 = !str4.equals("oneday") ? (byte) -1 : (byte) 7;
                            break;
                        case -760312546:
                            b2 = !str4.equals("aquaman") ? (byte) -1 : (byte) 0;
                            break;
                        case -64886864:
                            b2 = !str4.equals("magnolia") ? (byte) -1 : (byte) 4;
                            break;
                        case 3415681:
                            b2 = !str4.equals("once") ? (byte) -1 : (byte) 6;
                            break;
                        case 825323514:
                            b2 = !str4.equals("machuca") ? (byte) -1 : (byte) 5;
                            break;
                        default:
                            b2 = -1;
                            break;
                    }
                    switch (b2) {
                        default:
                            if (i2 <= 27 || !"HWEML".equals(Build.DEVICE)) {
                                str2 = Build.MODEL;
                                switch (str2.hashCode()) {
                                    case -349662828:
                                        if (!str2.equals("AFTJMST12")) {
                                            b = -1;
                                        } else {
                                            b = 6;
                                        }
                                        break;
                                    case -321033677:
                                        if (!str2.equals("AFTKMST12")) {
                                            b = -1;
                                        } else {
                                            b = 7;
                                        }
                                        break;
                                    case 2006354:
                                        if (!str2.equals("AFTA")) {
                                            b = -1;
                                        } else {
                                            b = 0;
                                        }
                                        break;
                                    case 2006367:
                                        if (!str2.equals("AFTN")) {
                                            b = -1;
                                        } else {
                                            b = 1;
                                        }
                                        break;
                                    case 2006371:
                                        if (!str2.equals("AFTR")) {
                                            b = -1;
                                        } else {
                                            b = 2;
                                        }
                                        break;
                                    case 1785421873:
                                        if (!str2.equals("AFTEU011")) {
                                            b = -1;
                                        } else {
                                            b = 3;
                                        }
                                        break;
                                    case 1785421876:
                                        if (!str2.equals("AFTEU014")) {
                                            b = -1;
                                        } else {
                                            b = 4;
                                        }
                                        break;
                                    case 1798172390:
                                        if (!str2.equals("AFTSO001")) {
                                            b = -1;
                                        } else {
                                            b = 8;
                                        }
                                        break;
                                    case 2119412532:
                                        if (!str2.equals("AFTEUFF014")) {
                                            b = -1;
                                        } else {
                                            b = 5;
                                        }
                                        break;
                                    default:
                                        b = -1;
                                        break;
                                }
                                switch (b) {
                                    default:
                                        if (i2 <= 26) {
                                            str3 = Build.DEVICE;
                                            switch (str3.hashCode()) {
                                                case -2144781245:
                                                    if (!str3.equals("GIONEE_SWW1609")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 54;
                                                    }
                                                    break;
                                                case -2144781185:
                                                    if (!str3.equals("GIONEE_SWW1627")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 55;
                                                    }
                                                    break;
                                                case -2144781160:
                                                    if (!str3.equals("GIONEE_SWW1631")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 56;
                                                    }
                                                    break;
                                                case -2097309513:
                                                    if (!str3.equals("K50a40")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 74;
                                                    }
                                                    break;
                                                case -2022874474:
                                                    if (!str3.equals("CP8676_I02")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 22;
                                                    }
                                                    break;
                                                case -1978993182:
                                                    if (!str3.equals("NX541J")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 89;
                                                    }
                                                    break;
                                                case -1978990237:
                                                    if (!str3.equals("NX573J")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 90;
                                                    }
                                                    break;
                                                case -1936688988:
                                                    if (!str3.equals("PGN528")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 101;
                                                    }
                                                    break;
                                                case -1936688066:
                                                    if (!str3.equals("PGN610")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 102;
                                                    }
                                                    break;
                                                case -1936688065:
                                                    if (!str3.equals("PGN611")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 103;
                                                    }
                                                    break;
                                                case -1931988508:
                                                    if (!str3.equals("AquaPowerM")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 13;
                                                    }
                                                    break;
                                                case -1885099851:
                                                    if (!str3.equals("RAIJIN")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 116;
                                                    }
                                                    break;
                                                case -1696512866:
                                                    if (!str3.equals("XT1663")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 137;
                                                    }
                                                    break;
                                                case -1680025915:
                                                    if (!str3.equals("ComioS1")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 21;
                                                    }
                                                    break;
                                                case -1615810839:
                                                    if (!str3.equals("Phantom6")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 104;
                                                    }
                                                    break;
                                                case -1600724499:
                                                    if (!str3.equals("pacificrim")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 95;
                                                    }
                                                    break;
                                                case -1554255044:
                                                    if (!str3.equals("vernee_M5")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 130;
                                                    }
                                                    break;
                                                case -1481772737:
                                                    if (!str3.equals("panell_dl")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 97;
                                                    }
                                                    break;
                                                case -1481772730:
                                                    if (!str3.equals("panell_ds")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 98;
                                                    }
                                                    break;
                                                case -1481772729:
                                                    if (!str3.equals("panell_dt")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 99;
                                                    }
                                                    break;
                                                case -1320080169:
                                                    if (!str3.equals("GiONEE_GBL7319")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 52;
                                                    }
                                                    break;
                                                case -1217592143:
                                                    if (!str3.equals("BRAVIA_ATV2")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 18;
                                                    }
                                                    break;
                                                case -1180384755:
                                                    if (!str3.equals("iris60")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 70;
                                                    }
                                                    break;
                                                case -1139198265:
                                                    if (!str3.equals("Slate_Pro")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 118;
                                                    }
                                                    break;
                                                case -1052835013:
                                                    if (!str3.equals("namath")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 87;
                                                    }
                                                    break;
                                                case -993250464:
                                                    if (!str3.equals("A10-70F")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 5;
                                                    }
                                                    break;
                                                case -993250458:
                                                    if (!str3.equals("A10-70L")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 6;
                                                    }
                                                    break;
                                                case -965403638:
                                                    if (!str3.equals("s905x018")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 120;
                                                    }
                                                    break;
                                                case -958336948:
                                                    if (!str3.equals("ELUGA_Ray_X")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 34;
                                                    }
                                                    break;
                                                case -879245230:
                                                    if (!str3.equals("tcl_eu")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 126;
                                                    }
                                                    break;
                                                case -842500323:
                                                    if (!str3.equals("nicklaus_f")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 88;
                                                    }
                                                    break;
                                                case -821392978:
                                                    if (!str3.equals("A7000-a")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 9;
                                                    }
                                                    break;
                                                case -797483286:
                                                    if (!str3.equals("SVP-DTV15")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 119;
                                                    }
                                                    break;
                                                case -794946968:
                                                    if (!str3.equals("watson")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 131;
                                                    }
                                                    break;
                                                case -788334647:
                                                    if (!str3.equals("whyred")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 132;
                                                    }
                                                    break;
                                                case -782144577:
                                                    if (!str3.equals("OnePlus5T")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 91;
                                                    }
                                                    break;
                                                case -575125681:
                                                    if (!str3.equals("GiONEE_CBL7513")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 51;
                                                    }
                                                    break;
                                                case -521118391:
                                                    if (!str3.equals("GIONEE_GBL7360")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 53;
                                                    }
                                                    break;
                                                case -430914369:
                                                    if (!str3.equals("Pixi4-7_3G")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 105;
                                                    }
                                                    break;
                                                case -290434366:
                                                    if (!str3.equals("taido_row")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 121;
                                                    }
                                                    break;
                                                case -282781963:
                                                    if (!str3.equals("BLACK-1X")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 17;
                                                    }
                                                    break;
                                                case -277133239:
                                                    if (!str3.equals("Z12_PRO")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 138;
                                                    }
                                                    break;
                                                case -173639913:
                                                    if (!str3.equals("ELUGA_A3_Pro")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 31;
                                                    }
                                                    break;
                                                case -56598463:
                                                    if (!str3.equals("woods_fn")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 134;
                                                    }
                                                    break;
                                                case 2126:
                                                    if (!str3.equals("C1")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 20;
                                                    }
                                                    break;
                                                case 2564:
                                                    if (!str3.equals("Q5")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 113;
                                                    }
                                                    break;
                                                case 2715:
                                                    if (!str3.equals("V1")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 127;
                                                    }
                                                    break;
                                                case 2719:
                                                    if (!str3.equals("V5")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 129;
                                                    }
                                                    break;
                                                case 3091:
                                                    if (!str3.equals("b5")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 16;
                                                    }
                                                    break;
                                                case 3483:
                                                    if (!str3.equals("mh")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 84;
                                                    }
                                                    break;
                                                case 73405:
                                                    if (!str3.equals("JGZ")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 73;
                                                    }
                                                    break;
                                                case 75537:
                                                    if (!str3.equals("M04")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 79;
                                                    }
                                                    break;
                                                case 75739:
                                                    if (!str3.equals("M5c")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 80;
                                                    }
                                                    break;
                                                case 76779:
                                                    if (!str3.equals("MX6")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 86;
                                                    }
                                                    break;
                                                case 78669:
                                                    if (!str3.equals("P85")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 94;
                                                    }
                                                    break;
                                                case 79305:
                                                    if (!str3.equals("PLE")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 107;
                                                    }
                                                    break;
                                                case 80618:
                                                    if (!str3.equals("QX1")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 115;
                                                    }
                                                    break;
                                                case 88274:
                                                    if (!str3.equals("Z80")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 139;
                                                    }
                                                    break;
                                                case 98846:
                                                    if (!str3.equals("cv1")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 26;
                                                    }
                                                    break;
                                                case 98848:
                                                    if (!str3.equals("cv3")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 27;
                                                    }
                                                    break;
                                                case 99329:
                                                    if (!str3.equals("deb")) {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 101481:
                                                    if (!str3.equals("flo")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 49;
                                                    }
                                                    break;
                                                case 1513190:
                                                    if (!str3.equals("1601")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 0;
                                                    }
                                                    break;
                                                case 1514184:
                                                    if (!str3.equals("1713")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 1;
                                                    }
                                                    break;
                                                case 1514185:
                                                    if (!str3.equals("1714")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 2;
                                                    }
                                                    break;
                                                case 2133089:
                                                    if (!str3.equals("F01H")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 36;
                                                    }
                                                    break;
                                                case 2133091:
                                                    if (!str3.equals("F01J")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 37;
                                                    }
                                                    break;
                                                case 2133120:
                                                    if (!str3.equals("F02H")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 38;
                                                    }
                                                    break;
                                                case 2133151:
                                                    if (!str3.equals("F03H")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 39;
                                                    }
                                                    break;
                                                case 2133182:
                                                    if (!str3.equals("F04H")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 40;
                                                    }
                                                    break;
                                                case 2133184:
                                                    if (!str3.equals("F04J")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 41;
                                                    }
                                                    break;
                                                case 2436959:
                                                    if (!str3.equals("P681")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 93;
                                                    }
                                                    break;
                                                case 2463773:
                                                    if (!str3.equals("Q350")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 109;
                                                    }
                                                    break;
                                                case 2464648:
                                                    if (!str3.equals("Q427")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 111;
                                                    }
                                                    break;
                                                case 2689555:
                                                    if (!str3.equals("XE2X")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 136;
                                                    }
                                                    break;
                                                case 3154429:
                                                    if (!str3.equals("fugu")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 50;
                                                    }
                                                    break;
                                                case 3284551:
                                                    if (!str3.equals("kate")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 75;
                                                    }
                                                    break;
                                                case 3351335:
                                                    if (!str3.equals("mido")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 85;
                                                    }
                                                    break;
                                                case 3386211:
                                                    if (!str3.equals("p212")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 92;
                                                    }
                                                    break;
                                                case 41325051:
                                                    if (!str3.equals("MEIZU_M5")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 83;
                                                    }
                                                    break;
                                                case 51349633:
                                                    if (!str3.equals("601LV")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 3;
                                                    }
                                                    break;
                                                case 51350594:
                                                    if (!str3.equals("602LV")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 4;
                                                    }
                                                    break;
                                                case 55178625:
                                                    if (!str3.equals("Aura_Note_2")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 15;
                                                    }
                                                    break;
                                                case 61542055:
                                                    if (!str3.equals("A1601")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 7;
                                                    }
                                                    break;
                                                case 65355429:
                                                    if (!str3.equals("E5643")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 30;
                                                    }
                                                    break;
                                                case 66214468:
                                                    if (!str3.equals("F3111")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 42;
                                                    }
                                                    break;
                                                case 66214470:
                                                    if (!str3.equals("F3113")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 43;
                                                    }
                                                    break;
                                                case 66214473:
                                                    if (!str3.equals("F3116")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 44;
                                                    }
                                                    break;
                                                case 66215429:
                                                    if (!str3.equals("F3211")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 45;
                                                    }
                                                    break;
                                                case 66215431:
                                                    if (!str3.equals("F3213")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 46;
                                                    }
                                                    break;
                                                case 66215433:
                                                    if (!str3.equals("F3215")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 47;
                                                    }
                                                    break;
                                                case 66216390:
                                                    if (!str3.equals("F3311")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 48;
                                                    }
                                                    break;
                                                case 76402249:
                                                    if (!str3.equals("PRO7S")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 108;
                                                    }
                                                    break;
                                                case 76404105:
                                                    if (!str3.equals("Q4260")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 110;
                                                    }
                                                    break;
                                                case 76404911:
                                                    if (!str3.equals("Q4310")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 112;
                                                    }
                                                    break;
                                                case 80963634:
                                                    if (!str3.equals("V23GB")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 128;
                                                    }
                                                    break;
                                                case 82882791:
                                                    if (!str3.equals("X3_HK")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 135;
                                                    }
                                                    break;
                                                case 98715550:
                                                    if (!str3.equals("i9031")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 67;
                                                    }
                                                    break;
                                                case 101370885:
                                                    if (!str3.equals("l5460")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 76;
                                                    }
                                                    break;
                                                case 102844228:
                                                    if (!str3.equals("le_x6")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 77;
                                                    }
                                                    break;
                                                case 165221241:
                                                    if (!str3.equals("A2016a40")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 8;
                                                    }
                                                    break;
                                                case 182191441:
                                                    if (!str3.equals("CPY83_I00")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 25;
                                                    }
                                                    break;
                                                case 245388979:
                                                    if (!str3.equals("marino_f")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 82;
                                                    }
                                                    break;
                                                case 287431619:
                                                    if (!str3.equals("griffin")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 60;
                                                    }
                                                    break;
                                                case 307593612:
                                                    if (!str3.equals("A7010a48")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 11;
                                                    }
                                                    break;
                                                case 308517133:
                                                    if (!str3.equals("A7020a48")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 12;
                                                    }
                                                    break;
                                                case 316215098:
                                                    if (!str3.equals("TB3-730F")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 122;
                                                    }
                                                    break;
                                                case 316215116:
                                                    if (!str3.equals("TB3-730X")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 123;
                                                    }
                                                    break;
                                                case 316246811:
                                                    if (!str3.equals("TB3-850F")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 124;
                                                    }
                                                    break;
                                                case 316246818:
                                                    if (!str3.equals("TB3-850M")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 125;
                                                    }
                                                    break;
                                                case 407160593:
                                                    if (!str3.equals("Pixi5-10_4G")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 106;
                                                    }
                                                    break;
                                                case 507412548:
                                                    if (!str3.equals("QM16XE_U")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 114;
                                                    }
                                                    break;
                                                case 793982701:
                                                    if (!str3.equals("GIONEE_WBL5708")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 57;
                                                    }
                                                    break;
                                                case 794038622:
                                                    if (!str3.equals("GIONEE_WBL7365")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 58;
                                                    }
                                                    break;
                                                case 794040393:
                                                    if (!str3.equals("GIONEE_WBL7519")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 59;
                                                    }
                                                    break;
                                                case 835649806:
                                                    if (!str3.equals("manning")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 81;
                                                    }
                                                    break;
                                                case 917340916:
                                                    if (!str3.equals("A7000plus")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 10;
                                                    }
                                                    break;
                                                case 958008161:
                                                    if (!str3.equals("j2xlteins")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 72;
                                                    }
                                                    break;
                                                case 1060579533:
                                                    if (!str3.equals("panell_d")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 96;
                                                    }
                                                    break;
                                                case 1150207623:
                                                    if (!str3.equals("LS-5017")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 78;
                                                    }
                                                    break;
                                                case 1176899427:
                                                    if (!str3.equals("itel_S41")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 71;
                                                    }
                                                    break;
                                                case 1280332038:
                                                    if (!str3.equals("hwALE-H")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 62;
                                                    }
                                                    break;
                                                case 1306947716:
                                                    if (!str3.equals("EverStar_S")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 35;
                                                    }
                                                    break;
                                                case 1349174697:
                                                    if (!str3.equals("htc_e56ml_dtul")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 61;
                                                    }
                                                    break;
                                                case 1522194893:
                                                    if (!str3.equals("woods_f")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 133;
                                                    }
                                                    break;
                                                case 1691543273:
                                                    if (!str3.equals("CPH1609")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 23;
                                                    }
                                                    break;
                                                case 1691544261:
                                                    if (!str3.equals("CPH1715")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 24;
                                                    }
                                                    break;
                                                case 1709443163:
                                                    if (!str3.equals("iball8735_9806")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 68;
                                                    }
                                                    break;
                                                case 1865889110:
                                                    if (!str3.equals("santoni")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 117;
                                                    }
                                                    break;
                                                case 1906253259:
                                                    if (!str3.equals("PB2-670M")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 100;
                                                    }
                                                    break;
                                                case 1977196784:
                                                    if (!str3.equals("Infinix-X572")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 69;
                                                    }
                                                    break;
                                                case 2006372676:
                                                    if (!str3.equals("BRAVIA_ATV3_4K")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 19;
                                                    }
                                                    break;
                                                case 2019281702:
                                                    if (!str3.equals("DM-01K")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 29;
                                                    }
                                                    break;
                                                case 2029784656:
                                                    if (!str3.equals("HWBLN-H")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 63;
                                                    }
                                                    break;
                                                case 2030379515:
                                                    if (!str3.equals("HWCAM-H")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 64;
                                                    }
                                                    break;
                                                case 2033393791:
                                                    if (!str3.equals("ASUS_X00AD_2")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 14;
                                                    }
                                                    break;
                                                case 2047190025:
                                                    if (!str3.equals("ELUGA_Note")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 32;
                                                    }
                                                    break;
                                                case 2047252157:
                                                    if (!str3.equals("ELUGA_Prim")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 33;
                                                    }
                                                    break;
                                                case 2048319463:
                                                    if (!str3.equals("HWVNS-H")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 65;
                                                    }
                                                    break;
                                                case 2048855701:
                                                    if (!str3.equals("HWWAS-H")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 66;
                                                    }
                                                    break;
                                                default:
                                                    b3 = -1;
                                                    break;
                                            }
                                            switch (b3) {
                                                default:
                                                    if (str2.hashCode() == -594534941 && str2.equals("JSN-L21")) {
                                                    }
                                                case 0:
                                                case 1:
                                                case 2:
                                                case 3:
                                                case 4:
                                                case 5:
                                                case 6:
                                                case 7:
                                                case 8:
                                                case 9:
                                                case 10:
                                                case 11:
                                                case 12:
                                                case 13:
                                                case 14:
                                                case 15:
                                                case 16:
                                                case 17:
                                                case 18:
                                                case 19:
                                                case 20:
                                                case 21:
                                                case 22:
                                                case 23:
                                                case 24:
                                                case 25:
                                                case 26:
                                                case 27:
                                                case 28:
                                                case 29:
                                                case 30:
                                                case 31:
                                                case 32:
                                                case 33:
                                                case 34:
                                                case 35:
                                                case 36:
                                                case 37:
                                                case 38:
                                                case 39:
                                                case 40:
                                                case 41:
                                                case 42:
                                                case 43:
                                                case 44:
                                                case 45:
                                                case 46:
                                                case 47:
                                                case 48:
                                                case 49:
                                                case 50:
                                                case 51:
                                                case 52:
                                                case 53:
                                                case 54:
                                                case 55:
                                                case 56:
                                                case 57:
                                                case 58:
                                                case 59:
                                                case 60:
                                                case 61:
                                                case 62:
                                                case 63:
                                                case 64:
                                                case 65:
                                                case 66:
                                                case 67:
                                                case 68:
                                                case 69:
                                                case 70:
                                                case 71:
                                                case 72:
                                                case 73:
                                                case 74:
                                                case 75:
                                                case 76:
                                                case 77:
                                                case 78:
                                                case 79:
                                                case 80:
                                                case 81:
                                                case 82:
                                                case 83:
                                                case 84:
                                                case 85:
                                                case 86:
                                                case 87:
                                                case 88:
                                                case 89:
                                                case 90:
                                                case 91:
                                                case 92:
                                                case 93:
                                                case 94:
                                                case 95:
                                                case 96:
                                                case 97:
                                                case 98:
                                                case 99:
                                                case 100:
                                                case 101:
                                                case 102:
                                                case 103:
                                                case 104:
                                                case 105:
                                                case 106:
                                                case 107:
                                                case 108:
                                                case 109:
                                                case 110:
                                                case 111:
                                                case 112:
                                                case 113:
                                                case 114:
                                                case 115:
                                                case C1137R.styleable.ConstraintSet_pathMotionArc /* 116 */:
                                                case C1137R.styleable.ConstraintSet_pivotAnchor /* 117 */:
                                                case C1137R.styleable.ConstraintSet_polarRelativeTo /* 118 */:
                                                case C1137R.styleable.ConstraintSet_quantizeMotionSteps /* 119 */:
                                                case C1137R.styleable.ConstraintSet_stateLabels /* 120 */:
                                                case C1137R.styleable.ConstraintSet_transitionEasing /* 121 */:
                                                case C1137R.styleable.ConstraintSet_transitionPathRotate /* 122 */:
                                                case 123:
                                                case 124:
                                                case 125:
                                                case 126:
                                                case 127:
                                                case 128:
                                                case 129:
                                                case 130:
                                                case 131:
                                                case 132:
                                                case 133:
                                                case 134:
                                                case 135:
                                                case 136:
                                                case 137:
                                                case 138:
                                                case 139:
                                                    z = true;
                                                    break;
                                            }
                                        }
                                    case 0:
                                    case 1:
                                    case 2:
                                    case 3:
                                    case 4:
                                    case 5:
                                    case 6:
                                    case 7:
                                    case 8:
                                        z = true;
                                        break;
                                }
                            }
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                            z = true;
                            break;
                    }
                } else if (i2 <= 27) {
                    str2 = Build.MODEL;
                    switch (str2.hashCode()) {
                        case -349662828:
                            if (!str2.equals("AFTJMST12")) {
                                b = -1;
                            } else {
                                b = 6;
                            }
                            break;
                        case -321033677:
                            if (!str2.equals("AFTKMST12")) {
                                b = -1;
                            } else {
                                b = 7;
                            }
                            break;
                        case 2006354:
                            if (!str2.equals("AFTA")) {
                                b = -1;
                            } else {
                                b = 0;
                            }
                            break;
                        case 2006367:
                            if (!str2.equals("AFTN")) {
                                b = -1;
                            } else {
                                b = 1;
                            }
                            break;
                        case 2006371:
                            if (!str2.equals("AFTR")) {
                                b = -1;
                            } else {
                                b = 2;
                            }
                            break;
                        case 1785421873:
                            if (!str2.equals("AFTEU011")) {
                                b = -1;
                            } else {
                                b = 3;
                            }
                            break;
                        case 1785421876:
                            if (!str2.equals("AFTEU014")) {
                                b = -1;
                            } else {
                                b = 4;
                            }
                            break;
                        case 1798172390:
                            if (!str2.equals("AFTSO001")) {
                                b = -1;
                            } else {
                                b = 8;
                            }
                            break;
                        case 2119412532:
                            if (!str2.equals("AFTEUFF014")) {
                                b = -1;
                            } else {
                                b = 5;
                            }
                            break;
                        default:
                            b = -1;
                            break;
                    }
                    switch (b) {
                        default:
                            if (i2 <= 26) {
                                str3 = Build.DEVICE;
                                switch (str3.hashCode()) {
                                    case -2144781245:
                                        if (!str3.equals("GIONEE_SWW1609")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 54;
                                        }
                                        break;
                                    case -2144781185:
                                        if (!str3.equals("GIONEE_SWW1627")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 55;
                                        }
                                        break;
                                    case -2144781160:
                                        if (!str3.equals("GIONEE_SWW1631")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 56;
                                        }
                                        break;
                                    case -2097309513:
                                        if (!str3.equals("K50a40")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 74;
                                        }
                                        break;
                                    case -2022874474:
                                        if (!str3.equals("CP8676_I02")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 22;
                                        }
                                        break;
                                    case -1978993182:
                                        if (!str3.equals("NX541J")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 89;
                                        }
                                        break;
                                    case -1978990237:
                                        if (!str3.equals("NX573J")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 90;
                                        }
                                        break;
                                    case -1936688988:
                                        if (!str3.equals("PGN528")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 101;
                                        }
                                        break;
                                    case -1936688066:
                                        if (!str3.equals("PGN610")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 102;
                                        }
                                        break;
                                    case -1936688065:
                                        if (!str3.equals("PGN611")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 103;
                                        }
                                        break;
                                    case -1931988508:
                                        if (!str3.equals("AquaPowerM")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 13;
                                        }
                                        break;
                                    case -1885099851:
                                        if (!str3.equals("RAIJIN")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 116;
                                        }
                                        break;
                                    case -1696512866:
                                        if (!str3.equals("XT1663")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 137;
                                        }
                                        break;
                                    case -1680025915:
                                        if (!str3.equals("ComioS1")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 21;
                                        }
                                        break;
                                    case -1615810839:
                                        if (!str3.equals("Phantom6")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 104;
                                        }
                                        break;
                                    case -1600724499:
                                        if (!str3.equals("pacificrim")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 95;
                                        }
                                        break;
                                    case -1554255044:
                                        if (!str3.equals("vernee_M5")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 130;
                                        }
                                        break;
                                    case -1481772737:
                                        if (!str3.equals("panell_dl")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 97;
                                        }
                                        break;
                                    case -1481772730:
                                        if (!str3.equals("panell_ds")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 98;
                                        }
                                        break;
                                    case -1481772729:
                                        if (!str3.equals("panell_dt")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 99;
                                        }
                                        break;
                                    case -1320080169:
                                        if (!str3.equals("GiONEE_GBL7319")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 52;
                                        }
                                        break;
                                    case -1217592143:
                                        if (!str3.equals("BRAVIA_ATV2")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 18;
                                        }
                                        break;
                                    case -1180384755:
                                        if (!str3.equals("iris60")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 70;
                                        }
                                        break;
                                    case -1139198265:
                                        if (!str3.equals("Slate_Pro")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 118;
                                        }
                                        break;
                                    case -1052835013:
                                        if (!str3.equals("namath")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 87;
                                        }
                                        break;
                                    case -993250464:
                                        if (!str3.equals("A10-70F")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 5;
                                        }
                                        break;
                                    case -993250458:
                                        if (!str3.equals("A10-70L")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 6;
                                        }
                                        break;
                                    case -965403638:
                                        if (!str3.equals("s905x018")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 120;
                                        }
                                        break;
                                    case -958336948:
                                        if (!str3.equals("ELUGA_Ray_X")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 34;
                                        }
                                        break;
                                    case -879245230:
                                        if (!str3.equals("tcl_eu")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 126;
                                        }
                                        break;
                                    case -842500323:
                                        if (!str3.equals("nicklaus_f")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 88;
                                        }
                                        break;
                                    case -821392978:
                                        if (!str3.equals("A7000-a")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 9;
                                        }
                                        break;
                                    case -797483286:
                                        if (!str3.equals("SVP-DTV15")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 119;
                                        }
                                        break;
                                    case -794946968:
                                        if (!str3.equals("watson")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 131;
                                        }
                                        break;
                                    case -788334647:
                                        if (!str3.equals("whyred")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 132;
                                        }
                                        break;
                                    case -782144577:
                                        if (!str3.equals("OnePlus5T")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 91;
                                        }
                                        break;
                                    case -575125681:
                                        if (!str3.equals("GiONEE_CBL7513")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 51;
                                        }
                                        break;
                                    case -521118391:
                                        if (!str3.equals("GIONEE_GBL7360")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 53;
                                        }
                                        break;
                                    case -430914369:
                                        if (!str3.equals("Pixi4-7_3G")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 105;
                                        }
                                        break;
                                    case -290434366:
                                        if (!str3.equals("taido_row")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 121;
                                        }
                                        break;
                                    case -282781963:
                                        if (!str3.equals("BLACK-1X")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 17;
                                        }
                                        break;
                                    case -277133239:
                                        if (!str3.equals("Z12_PRO")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 138;
                                        }
                                        break;
                                    case -173639913:
                                        if (!str3.equals("ELUGA_A3_Pro")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 31;
                                        }
                                        break;
                                    case -56598463:
                                        if (!str3.equals("woods_fn")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 134;
                                        }
                                        break;
                                    case 2126:
                                        if (!str3.equals("C1")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 20;
                                        }
                                        break;
                                    case 2564:
                                        if (!str3.equals("Q5")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 113;
                                        }
                                        break;
                                    case 2715:
                                        if (!str3.equals("V1")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 127;
                                        }
                                        break;
                                    case 2719:
                                        if (!str3.equals("V5")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 129;
                                        }
                                        break;
                                    case 3091:
                                        if (!str3.equals("b5")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 16;
                                        }
                                        break;
                                    case 3483:
                                        if (!str3.equals("mh")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 84;
                                        }
                                        break;
                                    case 73405:
                                        if (!str3.equals("JGZ")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 73;
                                        }
                                        break;
                                    case 75537:
                                        if (!str3.equals("M04")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 79;
                                        }
                                        break;
                                    case 75739:
                                        if (!str3.equals("M5c")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 80;
                                        }
                                        break;
                                    case 76779:
                                        if (!str3.equals("MX6")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 86;
                                        }
                                        break;
                                    case 78669:
                                        if (!str3.equals("P85")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 94;
                                        }
                                        break;
                                    case 79305:
                                        if (!str3.equals("PLE")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 107;
                                        }
                                        break;
                                    case 80618:
                                        if (!str3.equals("QX1")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 115;
                                        }
                                        break;
                                    case 88274:
                                        if (!str3.equals("Z80")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 139;
                                        }
                                        break;
                                    case 98846:
                                        if (!str3.equals("cv1")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 26;
                                        }
                                        break;
                                    case 98848:
                                        if (!str3.equals("cv3")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 27;
                                        }
                                        break;
                                    case 99329:
                                        if (!str3.equals("deb")) {
                                            b3 = -1;
                                        }
                                        break;
                                    case 101481:
                                        if (!str3.equals("flo")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 49;
                                        }
                                        break;
                                    case 1513190:
                                        if (!str3.equals("1601")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 0;
                                        }
                                        break;
                                    case 1514184:
                                        if (!str3.equals("1713")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 1;
                                        }
                                        break;
                                    case 1514185:
                                        if (!str3.equals("1714")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 2;
                                        }
                                        break;
                                    case 2133089:
                                        if (!str3.equals("F01H")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 36;
                                        }
                                        break;
                                    case 2133091:
                                        if (!str3.equals("F01J")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 37;
                                        }
                                        break;
                                    case 2133120:
                                        if (!str3.equals("F02H")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 38;
                                        }
                                        break;
                                    case 2133151:
                                        if (!str3.equals("F03H")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 39;
                                        }
                                        break;
                                    case 2133182:
                                        if (!str3.equals("F04H")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 40;
                                        }
                                        break;
                                    case 2133184:
                                        if (!str3.equals("F04J")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 41;
                                        }
                                        break;
                                    case 2436959:
                                        if (!str3.equals("P681")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 93;
                                        }
                                        break;
                                    case 2463773:
                                        if (!str3.equals("Q350")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 109;
                                        }
                                        break;
                                    case 2464648:
                                        if (!str3.equals("Q427")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 111;
                                        }
                                        break;
                                    case 2689555:
                                        if (!str3.equals("XE2X")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 136;
                                        }
                                        break;
                                    case 3154429:
                                        if (!str3.equals("fugu")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 50;
                                        }
                                        break;
                                    case 3284551:
                                        if (!str3.equals("kate")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 75;
                                        }
                                        break;
                                    case 3351335:
                                        if (!str3.equals("mido")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 85;
                                        }
                                        break;
                                    case 3386211:
                                        if (!str3.equals("p212")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 92;
                                        }
                                        break;
                                    case 41325051:
                                        if (!str3.equals("MEIZU_M5")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 83;
                                        }
                                        break;
                                    case 51349633:
                                        if (!str3.equals("601LV")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 3;
                                        }
                                        break;
                                    case 51350594:
                                        if (!str3.equals("602LV")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 4;
                                        }
                                        break;
                                    case 55178625:
                                        if (!str3.equals("Aura_Note_2")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 15;
                                        }
                                        break;
                                    case 61542055:
                                        if (!str3.equals("A1601")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 7;
                                        }
                                        break;
                                    case 65355429:
                                        if (!str3.equals("E5643")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 30;
                                        }
                                        break;
                                    case 66214468:
                                        if (!str3.equals("F3111")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 42;
                                        }
                                        break;
                                    case 66214470:
                                        if (!str3.equals("F3113")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 43;
                                        }
                                        break;
                                    case 66214473:
                                        if (!str3.equals("F3116")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 44;
                                        }
                                        break;
                                    case 66215429:
                                        if (!str3.equals("F3211")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 45;
                                        }
                                        break;
                                    case 66215431:
                                        if (!str3.equals("F3213")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 46;
                                        }
                                        break;
                                    case 66215433:
                                        if (!str3.equals("F3215")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 47;
                                        }
                                        break;
                                    case 66216390:
                                        if (!str3.equals("F3311")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 48;
                                        }
                                        break;
                                    case 76402249:
                                        if (!str3.equals("PRO7S")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 108;
                                        }
                                        break;
                                    case 76404105:
                                        if (!str3.equals("Q4260")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 110;
                                        }
                                        break;
                                    case 76404911:
                                        if (!str3.equals("Q4310")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 112;
                                        }
                                        break;
                                    case 80963634:
                                        if (!str3.equals("V23GB")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 128;
                                        }
                                        break;
                                    case 82882791:
                                        if (!str3.equals("X3_HK")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 135;
                                        }
                                        break;
                                    case 98715550:
                                        if (!str3.equals("i9031")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 67;
                                        }
                                        break;
                                    case 101370885:
                                        if (!str3.equals("l5460")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 76;
                                        }
                                        break;
                                    case 102844228:
                                        if (!str3.equals("le_x6")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 77;
                                        }
                                        break;
                                    case 165221241:
                                        if (!str3.equals("A2016a40")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 8;
                                        }
                                        break;
                                    case 182191441:
                                        if (!str3.equals("CPY83_I00")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 25;
                                        }
                                        break;
                                    case 245388979:
                                        if (!str3.equals("marino_f")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 82;
                                        }
                                        break;
                                    case 287431619:
                                        if (!str3.equals("griffin")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 60;
                                        }
                                        break;
                                    case 307593612:
                                        if (!str3.equals("A7010a48")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 11;
                                        }
                                        break;
                                    case 308517133:
                                        if (!str3.equals("A7020a48")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 12;
                                        }
                                        break;
                                    case 316215098:
                                        if (!str3.equals("TB3-730F")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 122;
                                        }
                                        break;
                                    case 316215116:
                                        if (!str3.equals("TB3-730X")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 123;
                                        }
                                        break;
                                    case 316246811:
                                        if (!str3.equals("TB3-850F")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 124;
                                        }
                                        break;
                                    case 316246818:
                                        if (!str3.equals("TB3-850M")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 125;
                                        }
                                        break;
                                    case 407160593:
                                        if (!str3.equals("Pixi5-10_4G")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 106;
                                        }
                                        break;
                                    case 507412548:
                                        if (!str3.equals("QM16XE_U")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 114;
                                        }
                                        break;
                                    case 793982701:
                                        if (!str3.equals("GIONEE_WBL5708")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 57;
                                        }
                                        break;
                                    case 794038622:
                                        if (!str3.equals("GIONEE_WBL7365")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 58;
                                        }
                                        break;
                                    case 794040393:
                                        if (!str3.equals("GIONEE_WBL7519")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 59;
                                        }
                                        break;
                                    case 835649806:
                                        if (!str3.equals("manning")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 81;
                                        }
                                        break;
                                    case 917340916:
                                        if (!str3.equals("A7000plus")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 10;
                                        }
                                        break;
                                    case 958008161:
                                        if (!str3.equals("j2xlteins")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 72;
                                        }
                                        break;
                                    case 1060579533:
                                        if (!str3.equals("panell_d")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 96;
                                        }
                                        break;
                                    case 1150207623:
                                        if (!str3.equals("LS-5017")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 78;
                                        }
                                        break;
                                    case 1176899427:
                                        if (!str3.equals("itel_S41")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 71;
                                        }
                                        break;
                                    case 1280332038:
                                        if (!str3.equals("hwALE-H")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 62;
                                        }
                                        break;
                                    case 1306947716:
                                        if (!str3.equals("EverStar_S")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 35;
                                        }
                                        break;
                                    case 1349174697:
                                        if (!str3.equals("htc_e56ml_dtul")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 61;
                                        }
                                        break;
                                    case 1522194893:
                                        if (!str3.equals("woods_f")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 133;
                                        }
                                        break;
                                    case 1691543273:
                                        if (!str3.equals("CPH1609")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 23;
                                        }
                                        break;
                                    case 1691544261:
                                        if (!str3.equals("CPH1715")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 24;
                                        }
                                        break;
                                    case 1709443163:
                                        if (!str3.equals("iball8735_9806")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 68;
                                        }
                                        break;
                                    case 1865889110:
                                        if (!str3.equals("santoni")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 117;
                                        }
                                        break;
                                    case 1906253259:
                                        if (!str3.equals("PB2-670M")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 100;
                                        }
                                        break;
                                    case 1977196784:
                                        if (!str3.equals("Infinix-X572")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 69;
                                        }
                                        break;
                                    case 2006372676:
                                        if (!str3.equals("BRAVIA_ATV3_4K")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 19;
                                        }
                                        break;
                                    case 2019281702:
                                        if (!str3.equals("DM-01K")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 29;
                                        }
                                        break;
                                    case 2029784656:
                                        if (!str3.equals("HWBLN-H")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 63;
                                        }
                                        break;
                                    case 2030379515:
                                        if (!str3.equals("HWCAM-H")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 64;
                                        }
                                        break;
                                    case 2033393791:
                                        if (!str3.equals("ASUS_X00AD_2")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 14;
                                        }
                                        break;
                                    case 2047190025:
                                        if (!str3.equals("ELUGA_Note")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 32;
                                        }
                                        break;
                                    case 2047252157:
                                        if (!str3.equals("ELUGA_Prim")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 33;
                                        }
                                        break;
                                    case 2048319463:
                                        if (!str3.equals("HWVNS-H")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 65;
                                        }
                                        break;
                                    case 2048855701:
                                        if (!str3.equals("HWWAS-H")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 66;
                                        }
                                        break;
                                    default:
                                        b3 = -1;
                                        break;
                                }
                                switch (b3) {
                                    default:
                                        if (str2.hashCode() == -594534941) {
                                            break;
                                        }
                                    case 0:
                                    case 1:
                                    case 2:
                                    case 3:
                                    case 4:
                                    case 5:
                                    case 6:
                                    case 7:
                                    case 8:
                                    case 9:
                                    case 10:
                                    case 11:
                                    case 12:
                                    case 13:
                                    case 14:
                                    case 15:
                                    case 16:
                                    case 17:
                                    case 18:
                                    case 19:
                                    case 20:
                                    case 21:
                                    case 22:
                                    case 23:
                                    case 24:
                                    case 25:
                                    case 26:
                                    case 27:
                                    case 28:
                                    case 29:
                                    case 30:
                                    case 31:
                                    case 32:
                                    case 33:
                                    case 34:
                                    case 35:
                                    case 36:
                                    case 37:
                                    case 38:
                                    case 39:
                                    case 40:
                                    case 41:
                                    case 42:
                                    case 43:
                                    case 44:
                                    case 45:
                                    case 46:
                                    case 47:
                                    case 48:
                                    case 49:
                                    case 50:
                                    case 51:
                                    case 52:
                                    case 53:
                                    case 54:
                                    case 55:
                                    case 56:
                                    case 57:
                                    case 58:
                                    case 59:
                                    case 60:
                                    case 61:
                                    case 62:
                                    case 63:
                                    case 64:
                                    case 65:
                                    case 66:
                                    case 67:
                                    case 68:
                                    case 69:
                                    case 70:
                                    case 71:
                                    case 72:
                                    case 73:
                                    case 74:
                                    case 75:
                                    case 76:
                                    case 77:
                                    case 78:
                                    case 79:
                                    case 80:
                                    case 81:
                                    case 82:
                                    case 83:
                                    case 84:
                                    case 85:
                                    case 86:
                                    case 87:
                                    case 88:
                                    case 89:
                                    case 90:
                                    case 91:
                                    case 92:
                                    case 93:
                                    case 94:
                                    case 95:
                                    case 96:
                                    case 97:
                                    case 98:
                                    case 99:
                                    case 100:
                                    case 101:
                                    case 102:
                                    case 103:
                                    case 104:
                                    case 105:
                                    case 106:
                                    case 107:
                                    case 108:
                                    case 109:
                                    case 110:
                                    case 111:
                                    case 112:
                                    case 113:
                                    case 114:
                                    case 115:
                                    case C1137R.styleable.ConstraintSet_pathMotionArc /* 116 */:
                                    case C1137R.styleable.ConstraintSet_pivotAnchor /* 117 */:
                                    case C1137R.styleable.ConstraintSet_polarRelativeTo /* 118 */:
                                    case C1137R.styleable.ConstraintSet_quantizeMotionSteps /* 119 */:
                                    case C1137R.styleable.ConstraintSet_stateLabels /* 120 */:
                                    case C1137R.styleable.ConstraintSet_transitionEasing /* 121 */:
                                    case C1137R.styleable.ConstraintSet_transitionPathRotate /* 122 */:
                                    case 123:
                                    case 124:
                                    case 125:
                                    case 126:
                                    case 127:
                                    case 128:
                                    case 129:
                                    case 130:
                                    case 131:
                                    case 132:
                                    case 133:
                                    case 134:
                                    case 135:
                                    case 136:
                                    case 137:
                                    case 138:
                                    case 139:
                                        z = true;
                                        break;
                                }
                            }
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                            z = true;
                            break;
                    }
                } else {
                    str2 = Build.MODEL;
                    switch (str2.hashCode()) {
                        case -349662828:
                            if (!str2.equals("AFTJMST12")) {
                                b = -1;
                            } else {
                                b = 6;
                            }
                            break;
                        case -321033677:
                            if (!str2.equals("AFTKMST12")) {
                                b = -1;
                            } else {
                                b = 7;
                            }
                            break;
                        case 2006354:
                            if (!str2.equals("AFTA")) {
                                b = -1;
                            } else {
                                b = 0;
                            }
                            break;
                        case 2006367:
                            if (!str2.equals("AFTN")) {
                                b = -1;
                            } else {
                                b = 1;
                            }
                            break;
                        case 2006371:
                            if (!str2.equals("AFTR")) {
                                b = -1;
                            } else {
                                b = 2;
                            }
                            break;
                        case 1785421873:
                            if (!str2.equals("AFTEU011")) {
                                b = -1;
                            } else {
                                b = 3;
                            }
                            break;
                        case 1785421876:
                            if (!str2.equals("AFTEU014")) {
                                b = -1;
                            } else {
                                b = 4;
                            }
                            break;
                        case 1798172390:
                            if (!str2.equals("AFTSO001")) {
                                b = -1;
                            } else {
                                b = 8;
                            }
                            break;
                        case 2119412532:
                            if (!str2.equals("AFTEUFF014")) {
                                b = -1;
                            } else {
                                b = 5;
                            }
                            break;
                        default:
                            b = -1;
                            break;
                    }
                    switch (b) {
                        default:
                            if (i2 <= 26) {
                                str3 = Build.DEVICE;
                                switch (str3.hashCode()) {
                                    case -2144781245:
                                        if (!str3.equals("GIONEE_SWW1609")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 54;
                                        }
                                        break;
                                    case -2144781185:
                                        if (!str3.equals("GIONEE_SWW1627")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 55;
                                        }
                                        break;
                                    case -2144781160:
                                        if (!str3.equals("GIONEE_SWW1631")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 56;
                                        }
                                        break;
                                    case -2097309513:
                                        if (!str3.equals("K50a40")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 74;
                                        }
                                        break;
                                    case -2022874474:
                                        if (!str3.equals("CP8676_I02")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 22;
                                        }
                                        break;
                                    case -1978993182:
                                        if (!str3.equals("NX541J")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 89;
                                        }
                                        break;
                                    case -1978990237:
                                        if (!str3.equals("NX573J")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 90;
                                        }
                                        break;
                                    case -1936688988:
                                        if (!str3.equals("PGN528")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 101;
                                        }
                                        break;
                                    case -1936688066:
                                        if (!str3.equals("PGN610")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 102;
                                        }
                                        break;
                                    case -1936688065:
                                        if (!str3.equals("PGN611")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 103;
                                        }
                                        break;
                                    case -1931988508:
                                        if (!str3.equals("AquaPowerM")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 13;
                                        }
                                        break;
                                    case -1885099851:
                                        if (!str3.equals("RAIJIN")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 116;
                                        }
                                        break;
                                    case -1696512866:
                                        if (!str3.equals("XT1663")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 137;
                                        }
                                        break;
                                    case -1680025915:
                                        if (!str3.equals("ComioS1")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 21;
                                        }
                                        break;
                                    case -1615810839:
                                        if (!str3.equals("Phantom6")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 104;
                                        }
                                        break;
                                    case -1600724499:
                                        if (!str3.equals("pacificrim")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 95;
                                        }
                                        break;
                                    case -1554255044:
                                        if (!str3.equals("vernee_M5")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 130;
                                        }
                                        break;
                                    case -1481772737:
                                        if (!str3.equals("panell_dl")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 97;
                                        }
                                        break;
                                    case -1481772730:
                                        if (!str3.equals("panell_ds")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 98;
                                        }
                                        break;
                                    case -1481772729:
                                        if (!str3.equals("panell_dt")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 99;
                                        }
                                        break;
                                    case -1320080169:
                                        if (!str3.equals("GiONEE_GBL7319")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 52;
                                        }
                                        break;
                                    case -1217592143:
                                        if (!str3.equals("BRAVIA_ATV2")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 18;
                                        }
                                        break;
                                    case -1180384755:
                                        if (!str3.equals("iris60")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 70;
                                        }
                                        break;
                                    case -1139198265:
                                        if (!str3.equals("Slate_Pro")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 118;
                                        }
                                        break;
                                    case -1052835013:
                                        if (!str3.equals("namath")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 87;
                                        }
                                        break;
                                    case -993250464:
                                        if (!str3.equals("A10-70F")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 5;
                                        }
                                        break;
                                    case -993250458:
                                        if (!str3.equals("A10-70L")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 6;
                                        }
                                        break;
                                    case -965403638:
                                        if (!str3.equals("s905x018")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 120;
                                        }
                                        break;
                                    case -958336948:
                                        if (!str3.equals("ELUGA_Ray_X")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 34;
                                        }
                                        break;
                                    case -879245230:
                                        if (!str3.equals("tcl_eu")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 126;
                                        }
                                        break;
                                    case -842500323:
                                        if (!str3.equals("nicklaus_f")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 88;
                                        }
                                        break;
                                    case -821392978:
                                        if (!str3.equals("A7000-a")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 9;
                                        }
                                        break;
                                    case -797483286:
                                        if (!str3.equals("SVP-DTV15")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 119;
                                        }
                                        break;
                                    case -794946968:
                                        if (!str3.equals("watson")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 131;
                                        }
                                        break;
                                    case -788334647:
                                        if (!str3.equals("whyred")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 132;
                                        }
                                        break;
                                    case -782144577:
                                        if (!str3.equals("OnePlus5T")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 91;
                                        }
                                        break;
                                    case -575125681:
                                        if (!str3.equals("GiONEE_CBL7513")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 51;
                                        }
                                        break;
                                    case -521118391:
                                        if (!str3.equals("GIONEE_GBL7360")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 53;
                                        }
                                        break;
                                    case -430914369:
                                        if (!str3.equals("Pixi4-7_3G")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 105;
                                        }
                                        break;
                                    case -290434366:
                                        if (!str3.equals("taido_row")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 121;
                                        }
                                        break;
                                    case -282781963:
                                        if (!str3.equals("BLACK-1X")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 17;
                                        }
                                        break;
                                    case -277133239:
                                        if (!str3.equals("Z12_PRO")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 138;
                                        }
                                        break;
                                    case -173639913:
                                        if (!str3.equals("ELUGA_A3_Pro")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 31;
                                        }
                                        break;
                                    case -56598463:
                                        if (!str3.equals("woods_fn")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 134;
                                        }
                                        break;
                                    case 2126:
                                        if (!str3.equals("C1")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 20;
                                        }
                                        break;
                                    case 2564:
                                        if (!str3.equals("Q5")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 113;
                                        }
                                        break;
                                    case 2715:
                                        if (!str3.equals("V1")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 127;
                                        }
                                        break;
                                    case 2719:
                                        if (!str3.equals("V5")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 129;
                                        }
                                        break;
                                    case 3091:
                                        if (!str3.equals("b5")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 16;
                                        }
                                        break;
                                    case 3483:
                                        if (!str3.equals("mh")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 84;
                                        }
                                        break;
                                    case 73405:
                                        if (!str3.equals("JGZ")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 73;
                                        }
                                        break;
                                    case 75537:
                                        if (!str3.equals("M04")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 79;
                                        }
                                        break;
                                    case 75739:
                                        if (!str3.equals("M5c")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 80;
                                        }
                                        break;
                                    case 76779:
                                        if (!str3.equals("MX6")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 86;
                                        }
                                        break;
                                    case 78669:
                                        if (!str3.equals("P85")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 94;
                                        }
                                        break;
                                    case 79305:
                                        if (!str3.equals("PLE")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 107;
                                        }
                                        break;
                                    case 80618:
                                        if (!str3.equals("QX1")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 115;
                                        }
                                        break;
                                    case 88274:
                                        if (!str3.equals("Z80")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 139;
                                        }
                                        break;
                                    case 98846:
                                        if (!str3.equals("cv1")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 26;
                                        }
                                        break;
                                    case 98848:
                                        if (!str3.equals("cv3")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 27;
                                        }
                                        break;
                                    case 99329:
                                        if (!str3.equals("deb")) {
                                            b3 = -1;
                                        }
                                        break;
                                    case 101481:
                                        if (!str3.equals("flo")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 49;
                                        }
                                        break;
                                    case 1513190:
                                        if (!str3.equals("1601")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 0;
                                        }
                                        break;
                                    case 1514184:
                                        if (!str3.equals("1713")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 1;
                                        }
                                        break;
                                    case 1514185:
                                        if (!str3.equals("1714")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 2;
                                        }
                                        break;
                                    case 2133089:
                                        if (!str3.equals("F01H")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 36;
                                        }
                                        break;
                                    case 2133091:
                                        if (!str3.equals("F01J")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 37;
                                        }
                                        break;
                                    case 2133120:
                                        if (!str3.equals("F02H")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 38;
                                        }
                                        break;
                                    case 2133151:
                                        if (!str3.equals("F03H")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 39;
                                        }
                                        break;
                                    case 2133182:
                                        if (!str3.equals("F04H")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 40;
                                        }
                                        break;
                                    case 2133184:
                                        if (!str3.equals("F04J")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 41;
                                        }
                                        break;
                                    case 2436959:
                                        if (!str3.equals("P681")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 93;
                                        }
                                        break;
                                    case 2463773:
                                        if (!str3.equals("Q350")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 109;
                                        }
                                        break;
                                    case 2464648:
                                        if (!str3.equals("Q427")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 111;
                                        }
                                        break;
                                    case 2689555:
                                        if (!str3.equals("XE2X")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 136;
                                        }
                                        break;
                                    case 3154429:
                                        if (!str3.equals("fugu")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 50;
                                        }
                                        break;
                                    case 3284551:
                                        if (!str3.equals("kate")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 75;
                                        }
                                        break;
                                    case 3351335:
                                        if (!str3.equals("mido")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 85;
                                        }
                                        break;
                                    case 3386211:
                                        if (!str3.equals("p212")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 92;
                                        }
                                        break;
                                    case 41325051:
                                        if (!str3.equals("MEIZU_M5")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 83;
                                        }
                                        break;
                                    case 51349633:
                                        if (!str3.equals("601LV")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 3;
                                        }
                                        break;
                                    case 51350594:
                                        if (!str3.equals("602LV")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 4;
                                        }
                                        break;
                                    case 55178625:
                                        if (!str3.equals("Aura_Note_2")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 15;
                                        }
                                        break;
                                    case 61542055:
                                        if (!str3.equals("A1601")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 7;
                                        }
                                        break;
                                    case 65355429:
                                        if (!str3.equals("E5643")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 30;
                                        }
                                        break;
                                    case 66214468:
                                        if (!str3.equals("F3111")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 42;
                                        }
                                        break;
                                    case 66214470:
                                        if (!str3.equals("F3113")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 43;
                                        }
                                        break;
                                    case 66214473:
                                        if (!str3.equals("F3116")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 44;
                                        }
                                        break;
                                    case 66215429:
                                        if (!str3.equals("F3211")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 45;
                                        }
                                        break;
                                    case 66215431:
                                        if (!str3.equals("F3213")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 46;
                                        }
                                        break;
                                    case 66215433:
                                        if (!str3.equals("F3215")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 47;
                                        }
                                        break;
                                    case 66216390:
                                        if (!str3.equals("F3311")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 48;
                                        }
                                        break;
                                    case 76402249:
                                        if (!str3.equals("PRO7S")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 108;
                                        }
                                        break;
                                    case 76404105:
                                        if (!str3.equals("Q4260")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 110;
                                        }
                                        break;
                                    case 76404911:
                                        if (!str3.equals("Q4310")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 112;
                                        }
                                        break;
                                    case 80963634:
                                        if (!str3.equals("V23GB")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 128;
                                        }
                                        break;
                                    case 82882791:
                                        if (!str3.equals("X3_HK")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 135;
                                        }
                                        break;
                                    case 98715550:
                                        if (!str3.equals("i9031")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 67;
                                        }
                                        break;
                                    case 101370885:
                                        if (!str3.equals("l5460")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 76;
                                        }
                                        break;
                                    case 102844228:
                                        if (!str3.equals("le_x6")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 77;
                                        }
                                        break;
                                    case 165221241:
                                        if (!str3.equals("A2016a40")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 8;
                                        }
                                        break;
                                    case 182191441:
                                        if (!str3.equals("CPY83_I00")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 25;
                                        }
                                        break;
                                    case 245388979:
                                        if (!str3.equals("marino_f")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 82;
                                        }
                                        break;
                                    case 287431619:
                                        if (!str3.equals("griffin")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 60;
                                        }
                                        break;
                                    case 307593612:
                                        if (!str3.equals("A7010a48")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 11;
                                        }
                                        break;
                                    case 308517133:
                                        if (!str3.equals("A7020a48")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 12;
                                        }
                                        break;
                                    case 316215098:
                                        if (!str3.equals("TB3-730F")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 122;
                                        }
                                        break;
                                    case 316215116:
                                        if (!str3.equals("TB3-730X")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 123;
                                        }
                                        break;
                                    case 316246811:
                                        if (!str3.equals("TB3-850F")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 124;
                                        }
                                        break;
                                    case 316246818:
                                        if (!str3.equals("TB3-850M")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 125;
                                        }
                                        break;
                                    case 407160593:
                                        if (!str3.equals("Pixi5-10_4G")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 106;
                                        }
                                        break;
                                    case 507412548:
                                        if (!str3.equals("QM16XE_U")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 114;
                                        }
                                        break;
                                    case 793982701:
                                        if (!str3.equals("GIONEE_WBL5708")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 57;
                                        }
                                        break;
                                    case 794038622:
                                        if (!str3.equals("GIONEE_WBL7365")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 58;
                                        }
                                        break;
                                    case 794040393:
                                        if (!str3.equals("GIONEE_WBL7519")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 59;
                                        }
                                        break;
                                    case 835649806:
                                        if (!str3.equals("manning")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 81;
                                        }
                                        break;
                                    case 917340916:
                                        if (!str3.equals("A7000plus")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 10;
                                        }
                                        break;
                                    case 958008161:
                                        if (!str3.equals("j2xlteins")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 72;
                                        }
                                        break;
                                    case 1060579533:
                                        if (!str3.equals("panell_d")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 96;
                                        }
                                        break;
                                    case 1150207623:
                                        if (!str3.equals("LS-5017")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 78;
                                        }
                                        break;
                                    case 1176899427:
                                        if (!str3.equals("itel_S41")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 71;
                                        }
                                        break;
                                    case 1280332038:
                                        if (!str3.equals("hwALE-H")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 62;
                                        }
                                        break;
                                    case 1306947716:
                                        if (!str3.equals("EverStar_S")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 35;
                                        }
                                        break;
                                    case 1349174697:
                                        if (!str3.equals("htc_e56ml_dtul")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 61;
                                        }
                                        break;
                                    case 1522194893:
                                        if (!str3.equals("woods_f")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 133;
                                        }
                                        break;
                                    case 1691543273:
                                        if (!str3.equals("CPH1609")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 23;
                                        }
                                        break;
                                    case 1691544261:
                                        if (!str3.equals("CPH1715")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 24;
                                        }
                                        break;
                                    case 1709443163:
                                        if (!str3.equals("iball8735_9806")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 68;
                                        }
                                        break;
                                    case 1865889110:
                                        if (!str3.equals("santoni")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 117;
                                        }
                                        break;
                                    case 1906253259:
                                        if (!str3.equals("PB2-670M")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 100;
                                        }
                                        break;
                                    case 1977196784:
                                        if (!str3.equals("Infinix-X572")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 69;
                                        }
                                        break;
                                    case 2006372676:
                                        if (!str3.equals("BRAVIA_ATV3_4K")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 19;
                                        }
                                        break;
                                    case 2019281702:
                                        if (!str3.equals("DM-01K")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 29;
                                        }
                                        break;
                                    case 2029784656:
                                        if (!str3.equals("HWBLN-H")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 63;
                                        }
                                        break;
                                    case 2030379515:
                                        if (!str3.equals("HWCAM-H")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 64;
                                        }
                                        break;
                                    case 2033393791:
                                        if (!str3.equals("ASUS_X00AD_2")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 14;
                                        }
                                        break;
                                    case 2047190025:
                                        if (!str3.equals("ELUGA_Note")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 32;
                                        }
                                        break;
                                    case 2047252157:
                                        if (!str3.equals("ELUGA_Prim")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 33;
                                        }
                                        break;
                                    case 2048319463:
                                        if (!str3.equals("HWVNS-H")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 65;
                                        }
                                        break;
                                    case 2048855701:
                                        if (!str3.equals("HWWAS-H")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 66;
                                        }
                                        break;
                                    default:
                                        b3 = -1;
                                        break;
                                }
                                switch (b3) {
                                    default:
                                        if (str2.hashCode() == -594534941) {
                                            break;
                                        }
                                    case 0:
                                    case 1:
                                    case 2:
                                    case 3:
                                    case 4:
                                    case 5:
                                    case 6:
                                    case 7:
                                    case 8:
                                    case 9:
                                    case 10:
                                    case 11:
                                    case 12:
                                    case 13:
                                    case 14:
                                    case 15:
                                    case 16:
                                    case 17:
                                    case 18:
                                    case 19:
                                    case 20:
                                    case 21:
                                    case 22:
                                    case 23:
                                    case 24:
                                    case 25:
                                    case 26:
                                    case 27:
                                    case 28:
                                    case 29:
                                    case 30:
                                    case 31:
                                    case 32:
                                    case 33:
                                    case 34:
                                    case 35:
                                    case 36:
                                    case 37:
                                    case 38:
                                    case 39:
                                    case 40:
                                    case 41:
                                    case 42:
                                    case 43:
                                    case 44:
                                    case 45:
                                    case 46:
                                    case 47:
                                    case 48:
                                    case 49:
                                    case 50:
                                    case 51:
                                    case 52:
                                    case 53:
                                    case 54:
                                    case 55:
                                    case 56:
                                    case 57:
                                    case 58:
                                    case 59:
                                    case 60:
                                    case 61:
                                    case 62:
                                    case 63:
                                    case 64:
                                    case 65:
                                    case 66:
                                    case 67:
                                    case 68:
                                    case 69:
                                    case 70:
                                    case 71:
                                    case 72:
                                    case 73:
                                    case 74:
                                    case 75:
                                    case 76:
                                    case 77:
                                    case 78:
                                    case 79:
                                    case 80:
                                    case 81:
                                    case 82:
                                    case 83:
                                    case 84:
                                    case 85:
                                    case 86:
                                    case 87:
                                    case 88:
                                    case 89:
                                    case 90:
                                    case 91:
                                    case 92:
                                    case 93:
                                    case 94:
                                    case 95:
                                    case 96:
                                    case 97:
                                    case 98:
                                    case 99:
                                    case 100:
                                    case 101:
                                    case 102:
                                    case 103:
                                    case 104:
                                    case 105:
                                    case 106:
                                    case 107:
                                    case 108:
                                    case 109:
                                    case 110:
                                    case 111:
                                    case 112:
                                    case 113:
                                    case 114:
                                    case 115:
                                    case C1137R.styleable.ConstraintSet_pathMotionArc /* 116 */:
                                    case C1137R.styleable.ConstraintSet_pivotAnchor /* 117 */:
                                    case C1137R.styleable.ConstraintSet_polarRelativeTo /* 118 */:
                                    case C1137R.styleable.ConstraintSet_quantizeMotionSteps /* 119 */:
                                    case C1137R.styleable.ConstraintSet_stateLabels /* 120 */:
                                    case C1137R.styleable.ConstraintSet_transitionEasing /* 121 */:
                                    case C1137R.styleable.ConstraintSet_transitionPathRotate /* 122 */:
                                    case 123:
                                    case 124:
                                    case 125:
                                    case 126:
                                    case 127:
                                    case 128:
                                    case 129:
                                    case 130:
                                    case 131:
                                    case 132:
                                    case 133:
                                    case 134:
                                    case 135:
                                    case 136:
                                    case 137:
                                    case 138:
                                    case 139:
                                        z = true;
                                        break;
                                }
                            }
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                            z = true;
                            break;
                    }
                }
                f4969O1 = z;
                f4968N1 = true;
            }
        }
        return f4969O1;
    }

    /* JADX INFO: renamed from: S0 */
    public static List m3977S0(Context context, zzvy zzvyVar, zzv zzvVar, boolean z, boolean z2) {
        List listMo8971a;
        String str = zzvVar.f21061o;
        if (str == null) {
            zzgzi zzgziVar = zzgwt.f18303t;
            return zzgyo.f18355w;
        }
        if (Build.VERSION.SDK_INT >= 26 && "video/dolby-vision".equals(str) && !zzadd.m3973a(context)) {
            String strM8976d = zzwi.m8976d(zzvVar);
            if (strM8976d == null) {
                zzgzi zzgziVar2 = zzgwt.f18303t;
                listMo8971a = zzgyo.f18355w;
            } else {
                listMo8971a = zzvyVar.mo8971a(strM8976d, z, z2);
            }
            if (!listMo8971a.isEmpty()) {
                return listMo8971a;
            }
        }
        return zzwi.m8974b(zzvyVar, zzvVar, z, z2);
    }

    @Override // com.google.android.gms.internal.ads.zznc
    /* JADX INFO: renamed from: A */
    public final void mo3978A() {
        zzaew zzaewVar = this.f4995k1;
        if (zzaewVar == null) {
            zzadw zzadwVar = this.f4986b1;
            if (zzadwVar.f5061d == 0) {
                zzadwVar.f5061d = 1;
                return;
            }
            return;
        }
        int i2 = this.f4997m1;
        if (i2 == 0 || i2 == 1) {
            this.f4997m1 = 0;
        } else {
            zzaewVar.mo3967r();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvw
    /* JADX INFO: renamed from: A0 */
    public final void mo3979A0(long j2) {
        super.mo3979A0(j2);
        this.f5008x1--;
    }

    @Override // com.google.android.gms.internal.ads.zzvw, com.google.android.gms.internal.ads.zziz
    /* JADX INFO: renamed from: D */
    public final void mo3980D(boolean z, boolean z2) {
        zzaew zzaewVar;
        super.mo3980D(z, z2);
        m8601x();
        final zzjd zzjdVar = this.f21152M0;
        final zzaeq zzaeqVar = this.f4984Z0;
        Handler handler = zzaeqVar.f5132a;
        if (handler != null) {
            handler.post(new Runnable(zzjdVar) { // from class: com.google.android.gms.internal.ads.zzaep
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzaeq zzaeqVar2 = this.f5131s;
                    zzaeqVar2.getClass();
                    String str = zzfm.f16091a;
                    zzaeqVar2.f5133b.zzb();
                }
            });
        }
        boolean z3 = this.f4996l1;
        zzadw zzadwVar = this.f4986b1;
        if (!z3) {
            if (this.f4998n1 != null && this.f4995k1 == null) {
                zzadk zzadkVar = new zzadk(this.f4982X0, zzadwVar);
                zzadkVar.f5024d = true;
                zzadkVar.f5027g = -this.f4989e1;
                zzdp zzdpVar = this.f20071y;
                zzdpVar.getClass();
                zzadkVar.f5025e = zzdpVar;
                zzgtr.m7133f(!zzadkVar.f5026f);
                if (zzadkVar.f5023c == null) {
                    zzadkVar.f5023c = new zzadq();
                }
                zzads zzadsVar = new zzads(zzadkVar);
                zzadkVar.f5026f = true;
                zzadsVar.f5055p = 1;
                SparseArray sparseArray = zzadsVar.f5042c;
                if (sparseArray.indexOfKey(0) >= 0) {
                    zzaewVar = (zzaew) sparseArray.get(0);
                } else {
                    zzadm zzadmVar = new zzadm(zzadsVar, zzadsVar.f5040a);
                    zzadsVar.f5046g.add(zzadmVar);
                    sparseArray.put(0, zzadmVar);
                    zzaewVar = zzadmVar;
                }
                this.f4995k1 = zzaewVar;
            }
            this.f4996l1 = true;
        }
        int i2 = !z2 ? 1 : 0;
        zzaew zzaewVar2 = this.f4995k1;
        if (zzaewVar2 == null) {
            zzdp zzdpVar2 = this.f20071y;
            zzdpVar2.getClass();
            zzadwVar.f5068k = zzdpVar2;
            zzadwVar.m4030a(i2);
            return;
        }
        zzaewVar2.mo3957g(new zzadb(this));
        zzadt zzadtVar = this.f4978I1;
        if (zzadtVar != null) {
            this.f4995k1.mo3953c(zzadtVar);
        }
        if (this.f4999o1 != null && !this.f5001q1.equals(zzev.f14942c)) {
            this.f4995k1.mo3955e(this.f4999o1, this.f5001q1);
        }
        this.f4995k1.mo3959i(this.f5004t1);
        this.f4995k1.mo3954d(this.f21178d0);
        List list = this.f4998n1;
        if (list != null) {
            this.f4995k1.mo3961j(list);
        }
        this.f4997m1 = i2;
        this.f21160Q0 = true;
    }

    @Override // com.google.android.gms.internal.ads.zzvw, com.google.android.gms.internal.ads.zziz
    /* JADX INFO: renamed from: E */
    public final void mo3981E(zzv[] zzvVarArr, long j2, long j3, zzxl zzxlVar) {
        super.mo3981E(zzvVarArr, j2, j3, zzxlVar);
        zzadx zzadxVar = this.f4990f1;
        if (zzadxVar != null) {
            zzadxVar.m4039c();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvw, com.google.android.gms.internal.ads.zznc
    /* JADX INFO: renamed from: G */
    public final boolean mo3982G() {
        if (!this.f21148K0) {
            return false;
        }
        zzaew zzaewVar = this.f4995k1;
        return zzaewVar == null || zzaewVar.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzvw
    /* JADX INFO: renamed from: J */
    public final boolean mo3983J(zzvp zzvpVar) {
        return m3998V0(zzvpVar);
    }

    /* JADX INFO: renamed from: J0 */
    public final void m3984J0(int i2, int i3) {
        zzjd zzjdVar = this.f21152M0;
        zzjdVar.f20083h += i2;
        int i4 = i2 + i3;
        zzjdVar.f20082g += i4;
        this.f5006v1 += i4;
        int i5 = this.f5007w1 + i4;
        this.f5007w1 = i5;
        zzjdVar.f20084i = Math.max(i5, zzjdVar.f20084i);
    }

    /* JADX INFO: renamed from: K0 */
    public final void m3985K0(long j2) {
        zzjd zzjdVar = this.f21152M0;
        zzjdVar.f20086k += j2;
        zzjdVar.f20087l++;
        this.f4971B1 += j2;
        this.f4972C1++;
    }

    @Override // com.google.android.gms.internal.ads.zzvw
    /* JADX INFO: renamed from: L */
    public final boolean mo3986L() {
        zzvp zzvpVar = this.f21187m0;
        if (this.f4995k1 != null && zzvpVar != null) {
            String str = zzvpVar.f21111a;
            if (str.equals("c2.mtk.avc.decoder") || str.equals("c2.mtk.hevc.decoder")) {
                return true;
            }
        }
        return super.mo3986L();
    }

    /* JADX INFO: renamed from: L0 */
    public final void m3987L0(zzvm zzvmVar, int i2, long j2) {
        Surface surface;
        Trace.beginSection("releaseOutputBuffer");
        zzvmVar.mo8924n(i2, j2);
        Trace.endSection();
        this.f21152M0.f20080e++;
        this.f5007w1 = 0;
        if (this.f4995k1 == null) {
            zzbv zzbvVar = this.f4974E1;
            boolean zEquals = zzbvVar.equals(zzbv.f9425d);
            zzaeq zzaeqVar = this.f4984Z0;
            if (!zEquals && !zzbvVar.equals(this.f4975F1)) {
                this.f4975F1 = zzbvVar;
                zzaeqVar.m4047a(zzbvVar);
            }
            zzadw zzadwVar = this.f4986b1;
            int i3 = zzadwVar.f5061d;
            zzadwVar.f5061d = 3;
            zzadwVar.f5063f = zzfm.m6519u(zzadwVar.f5068k.zzb());
            if (i3 == 3 || (surface = this.f4999o1) == null) {
                return;
            }
            Handler handler = zzaeqVar.f5132a;
            if (handler != null) {
                handler.post(new zzaek(zzaeqVar, surface, SystemClock.elapsedRealtime()));
            }
            this.f5002r1 = true;
        }
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0024  */
    @Override // com.google.android.gms.internal.ads.zzvw
    /* JADX INFO: renamed from: M */
    public final boolean mo3988M() {
        boolean z;
        zzv zzvVar = this.f21181g0;
        long j2 = this.f20063J;
        if (j2 != -9223372036854775807L) {
            if (this.f21164S0 + 1 + j2 > LocationRequestCompat.PASSIVE_INTERVAL - (this.f21154N0.f21133c + j2)) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = true;
        }
        return this.f5009y1 == null || this.f4970A1 || (zzvVar != null && zzvVar.f21063q > 0) || z || this.f21154N0.f21136f != -9223372036854775807L;
    }

    /* JADX INFO: renamed from: M0 */
    public final boolean m3989M0(long j2, long j3, boolean z, boolean z2) {
        if (this.f4995k1 != null && this.f4983Y0) {
            j3 -= -this.f4979J1;
        }
        if (j2 < -500000 && !z) {
            zzzd zzzdVar = this.f20054A;
            zzzdVar.getClass();
            int iMo9034f = zzzdVar.mo9034f(j3 - this.f20056C);
            if (iMo9034f != 0) {
                this.f5010z1 = j3;
                PriorityQueue priorityQueue = this.f4991g1;
                if (z2) {
                    zzjd zzjdVar = this.f21152M0;
                    int i2 = zzjdVar.f20079d + iMo9034f;
                    zzjdVar.f20079d = i2;
                    zzjdVar.f20081f += this.f5008x1;
                    zzjdVar.f20079d = priorityQueue.size() + i2;
                } else {
                    this.f21152M0.f20085j++;
                    m3984J0(priorityQueue.size() + iMo9034f, this.f5008x1);
                }
                if (this.f21180f0 != null) {
                    if (mo3986L()) {
                        m8968K();
                        m8966I();
                    } else if (mo3988M()) {
                        m8961F();
                    } else {
                        this.f21162R0 = true;
                    }
                }
                zzaew zzaewVar = this.f4995k1;
                if (zzaewVar != null) {
                    zzaewVar.mo3966o0(false);
                }
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzvw
    /* JADX INFO: renamed from: N */
    public final void mo3990N() {
        super.mo3990N();
        this.f4991g1.clear();
        this.f5008x1 = 0;
        this.f4981L1 = 0;
        this.f4970A1 = false;
        zzacp zzacpVar = this.f4988d1;
        if (zzacpVar != null) {
            zzacpVar.f4922b = null;
            ByteBuffer byteBuffer = zzacpVar.f4921a;
            byteBuffer.position(byteBuffer.limit());
        }
    }

    /* JADX INFO: renamed from: O0 */
    public final void m3991O0(zzvm zzvmVar, int i2) {
        Trace.beginSection("skipVideoBuffer");
        zzvmVar.mo8909A(i2);
        Trace.endSection();
        this.f21152M0.f20081f++;
    }

    @Override // com.google.android.gms.internal.ads.zzvw
    /* JADX INFO: renamed from: P */
    public final zzvo mo3992P(IllegalStateException illegalStateException, zzvp zzvpVar) {
        Surface surface = this.f4999o1;
        zzada zzadaVar = new zzada(illegalStateException, zzvpVar);
        System.identityHashCode(surface);
        if (surface != null) {
            surface.isValid();
        }
        return zzadaVar;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0068  */
    /* JADX WARN: Code duplicated, block: B:40:0x006b  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:71:0x0082 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: P0 */
    public final Surface m3993P0(zzvp zzvpVar) {
        boolean z;
        zzadh zzadhVar;
        int i2;
        RuntimeException runtimeException;
        Error error;
        zzaew zzaewVar = this.f4995k1;
        if (zzaewVar != null) {
            return zzaewVar.zzk();
        }
        Surface surface = this.f4999o1;
        if (surface != null) {
            return surface;
        }
        if (Build.VERSION.SDK_INT >= 35 && zzvpVar.f21118h) {
            return null;
        }
        boolean z2 = false;
        zzgtr.m7133f(!m3976R0(zzvpVar.f21111a) && (!zzvpVar.f21116f || zzadi.m4028a(this.f4982X0)));
        zzadi zzadiVar = this.f5000p1;
        if (zzadiVar != null) {
            if (zzadiVar.f5018s != zzvpVar.f21116f && zzadiVar != null) {
                zzadiVar.release();
                this.f5000p1 = null;
            }
        }
        if (this.f5000p1 == null) {
            Context context = this.f4982X0;
            boolean z3 = zzvpVar.f21116f;
            if (z3) {
                if (!zzadi.m4028a(context)) {
                    z = false;
                }
                zzgtr.m7133f(z);
                zzadhVar = new zzadh();
                if (z3) {
                    i2 = zzadi.f5016v;
                } else {
                    i2 = 0;
                }
                zzadhVar.start();
                Handler handler = new Handler(zzadhVar.getLooper(), zzadhVar);
                zzadhVar.f5012t = handler;
                zzadhVar.f5011s = new zzdw(handler);
                synchronized (zzadhVar) {
                    zzadhVar.f5012t.obtainMessage(1, i2, 0).sendToTarget();
                    while (zzadhVar.f5015w == null && zzadhVar.f5014v == null && zzadhVar.f5013u == null) {
                        try {
                            zzadhVar.wait();
                        } catch (InterruptedException unused) {
                            z2 = true;
                        }
                    }
                }
                if (z2) {
                    Thread.currentThread().interrupt();
                }
                runtimeException = zzadhVar.f5014v;
                if (runtimeException == null) {
                    throw runtimeException;
                }
                error = zzadhVar.f5013u;
                if (error == null) {
                    throw error;
                }
                zzadi zzadiVar2 = zzadhVar.f5015w;
                zzadiVar2.getClass();
                this.f5000p1 = zzadiVar2;
            } else {
                int i3 = zzadi.f5016v;
            }
            z = true;
            zzgtr.m7133f(z);
            zzadhVar = new zzadh();
            if (z3) {
                i2 = zzadi.f5016v;
            } else {
                i2 = 0;
            }
            zzadhVar.start();
            Handler handler2 = new Handler(zzadhVar.getLooper(), zzadhVar);
            zzadhVar.f5012t = handler2;
            zzadhVar.f5011s = new zzdw(handler2);
            synchronized (zzadhVar) {
                zzadhVar.f5012t.obtainMessage(1, i2, 0).sendToTarget();
                while (zzadhVar.f5015w == null) {
                    zzadhVar.wait();
                }
                if (z2) {
                    Thread.currentThread().interrupt();
                }
                runtimeException = zzadhVar.f5014v;
                if (runtimeException == null) {
                    throw runtimeException;
                }
                error = zzadhVar.f5013u;
                if (error == null) {
                    throw error;
                }
                zzadi zzadiVar3 = zzadhVar.f5015w;
                zzadiVar3.getClass();
                this.f5000p1 = zzadiVar3;
            }
        }
        return this.f5000p1;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003e  */
    @Override // com.google.android.gms.internal.ads.zzvw, com.google.android.gms.internal.ads.zznc
    /* JADX INFO: renamed from: Q */
    public final boolean mo3994Q() {
        boolean zZza;
        boolean z = false;
        if (this.f21172X != null) {
            if (mo8590c0()) {
                zZza = this.f20059F;
            } else {
                zzzd zzzdVar = this.f20054A;
                zzzdVar.getClass();
                zZza = zzzdVar.zza();
            }
            if (zZza) {
                z = true;
            } else {
                if (this.f21196v0 >= 0) {
                    z = true;
                } else if (this.f21194t0 != -9223372036854775807L) {
                    zzdp zzdpVar = this.f20071y;
                    zzdpVar.getClass();
                    if (zzdpVar.zzb() < this.f21194t0) {
                        z = true;
                    }
                }
            }
        }
        zzaew zzaewVar = this.f4995k1;
        if (zzaewVar != null) {
            return zzaewVar.mo3960i0(z);
        }
        if (z && this.f21180f0 == null) {
            return true;
        }
        return this.f4986b1.m4034e(z);
    }

    @Override // com.google.android.gms.internal.ads.zzvw, com.google.android.gms.internal.ads.zznc
    /* JADX INFO: renamed from: S */
    public final void mo3995S(long j2, long j3) throws zzjm {
        zzaew zzaewVar = this.f4995k1;
        if (zzaewVar != null) {
            try {
                zzaewVar.mo3958h(j2, j3);
            } catch (zzaev e) {
                throw m8602y(e, e.f5135s, false, AdError.SHOW_CALLED_BEFORE_LOAD_ERROR_CODE);
            }
        }
        super.mo3995S(j2, j3);
    }

    /* JADX INFO: renamed from: T0 */
    public final void m3996T0(Object obj) {
        Handler handler;
        Surface surface = obj instanceof Surface ? (Surface) obj : null;
        Surface surface2 = this.f4999o1;
        zzaeq zzaeqVar = this.f4984Z0;
        if (surface2 == surface) {
            if (surface != null) {
                zzbv zzbvVar = this.f4975F1;
                if (zzbvVar != null) {
                    zzaeqVar.m4047a(zzbvVar);
                }
                Surface surface3 = this.f4999o1;
                if (surface3 == null || !this.f5002r1 || (handler = zzaeqVar.f5132a) == null) {
                    return;
                }
                handler.post(new zzaek(zzaeqVar, surface3, SystemClock.elapsedRealtime()));
                return;
            }
            return;
        }
        this.f4999o1 = surface;
        zzaew zzaewVar = this.f4995k1;
        zzadw zzadwVar = this.f4986b1;
        if (zzaewVar == null) {
            zzadwVar.m4032c(surface);
        }
        this.f5002r1 = false;
        int i2 = this.f20072z;
        zzvm zzvmVar = this.f21180f0;
        if (zzvmVar != null && this.f4995k1 == null) {
            zzvp zzvpVar = this.f21187m0;
            zzvpVar.getClass();
            if (!m3998V0(zzvpVar) || this.f4993i1) {
                m8968K();
                m8966I();
            } else {
                Surface surfaceM3993P0 = m3993P0(zzvpVar);
                if (surfaceM3993P0 != null) {
                    zzvmVar.mo8916f(surfaceM3993P0);
                } else {
                    if (Build.VERSION.SDK_INT < 35) {
                        throw new IllegalStateException();
                    }
                    zzvmVar.mo8920j();
                }
            }
        }
        if (surface != null) {
            zzbv zzbvVar2 = this.f4975F1;
            if (zzbvVar2 != null) {
                zzaeqVar.m4047a(zzbvVar2);
            }
        } else {
            this.f4975F1 = null;
            zzaew zzaewVar2 = this.f4995k1;
            if (zzaewVar2 != null) {
                zzaewVar2.mo3956f();
            }
        }
        if (i2 == 2) {
            zzaew zzaewVar3 = this.f4995k1;
            if (zzaewVar3 != null) {
                zzaewVar3.mo3950S(true);
            } else {
                zzadwVar.f5066i = true;
                zzadwVar.f5065h = -9223372036854775807L;
            }
        }
    }

    /* JADX INFO: renamed from: U0 */
    public final boolean m3997U0(zzix zzixVar) {
        if (mo8590c0() || zzixVar.m8564b(536870912)) {
            return true;
        }
        long j2 = this.f20063J;
        return j2 == -9223372036854775807L || j2 - (zzixVar.f20049e - this.f21154N0.f21133c) <= 100000;
    }

    /* JADX INFO: renamed from: V0 */
    public final boolean m3998V0(zzvp zzvpVar) {
        if (this.f4995k1 != null) {
            return true;
        }
        Surface surface = this.f4999o1;
        if (surface != null && surface.isValid()) {
            return true;
        }
        if (Build.VERSION.SDK_INT >= 35 && zzvpVar.f21118h) {
            return true;
        }
        if (m3976R0(zzvpVar.f21111a)) {
            return false;
        }
        return !zzvpVar.f21116f || zzadi.m4028a(this.f4982X0);
    }

    @Override // com.google.android.gms.internal.ads.zznc
    /* JADX INFO: renamed from: W */
    public final boolean mo3999W(long j2) {
        if (this.f21145H0 == -9223372036854775807L || j2 < this.f5010z1) {
            return false;
        }
        long j3 = this.f21156O0;
        return j3 == -9223372036854775807L || j2 > j3;
    }

    @Override // com.google.android.gms.internal.ads.zzvw, com.google.android.gms.internal.ads.zznc
    /* JADX INFO: renamed from: X */
    public final void mo4000X(float f2, float f3) {
        super.mo4000X(f2, f3);
        zzaew zzaewVar = this.f4995k1;
        if (zzaewVar != null) {
            zzaewVar.mo3954d(f2);
        } else {
            this.f4986b1.m4036g(f2);
        }
        zzadx zzadxVar = this.f4990f1;
        if (zzadxVar != null) {
            zzadxVar.m4038b(f2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvw
    /* JADX INFO: renamed from: d0 */
    public final void mo4001d0(zzv zzvVar) throws zzjm {
        zzaew zzaewVar = this.f4995k1;
        if (zzaewVar == null || zzaewVar.mo3951a()) {
            return;
        }
        try {
            zzaewVar.mo3965n(zzvVar);
        } catch (zzaev e) {
            throw m8602y(e, zzvVar, false, 7000);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvw
    /* JADX INFO: renamed from: e0 */
    public final void mo4002e0(zzix zzixVar) {
        ByteBuffer byteBuffer;
        zzacp zzacpVar = this.f4988d1;
        if (zzacpVar != null) {
            zzvp zzvpVar = this.f21187m0;
            zzvpVar.getClass();
            if (zzvpVar.f21112b.equals("video/av01") && zzixVar.m8564b(1) && (byteBuffer = zzixVar.f20048d) != null) {
                int iPosition = byteBuffer.position();
                int i2 = iPosition + ServiceStarter.ERROR_UNKNOWN;
                int iLimit = byteBuffer.limit();
                byteBuffer.limit(Math.min(iLimit, i2));
                ByteBuffer byteBuffer2 = zzacpVar.f4921a;
                byteBuffer2.clear();
                byteBuffer2.put(byteBuffer);
                byteBuffer2.flip();
                byteBuffer.position(iPosition);
                byteBuffer.limit(iLimit);
            }
        }
        this.f4981L1 = 0;
        int iMo4003f0 = mo4003f0(zzixVar);
        if (Build.VERSION.SDK_INT < 34 || (iMo4003f0 & 32) == 0) {
            this.f5008x1++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvw
    /* JADX INFO: renamed from: f0 */
    public final int mo4003f0(zzix zzixVar) {
        return (Build.VERSION.SDK_INT < 34 || this.f5009y1 == null || zzixVar.f20049e >= this.f20057D || m3997U0(zzixVar)) ? 0 : 32;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x00eb A[ADDED_TO_REGION, EDGE_INSN: B:101:0x00eb->B:72:0x00eb BREAK  A[LOOP:0: B:46:0x00a3->B:71:0x00e8], REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:20:0x003b  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:90:0x013b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:91:0x013d  */
    /* JADX WARN: Code duplicated, block: B:92:0x0145  */
    @Override // com.google.android.gms.internal.ads.zzvw
    /* JADX INFO: renamed from: g0 */
    public final boolean mo4004g0(zzix zzixVar) {
        boolean z;
        ByteBuffer byteBuffer;
        int iLimit;
        zzgv zzgvVar;
        zzgs zzgsVar;
        boolean z2 = false;
        if (!m3997U0(zzixVar)) {
            long j2 = zzixVar.f20049e;
            boolean z3 = j2 < this.f20057D;
            zzadx zzadxVar = this.f4990f1;
            if (zzadxVar != null) {
                long j3 = zzadxVar.f5071a;
                long j4 = j3 == -9223372036854775807L ? -9223372036854775807L : (long) (((j2 - j3) * zzadxVar.f5073c) + zzadxVar.f5072b);
                if (j4 == -9223372036854775807L || j4 >= this.f4989e1) {
                    z = false;
                } else {
                    z = true;
                }
            } else {
                z = false;
            }
            if ((z3 || z) && !zzixVar.m8564b(268435456)) {
                if (!zzixVar.m8564b(AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL)) {
                    zzacp zzacpVar = this.f4988d1;
                    if (zzacpVar != null) {
                        ByteBuffer byteBuffer2 = zzacpVar.f4921a;
                        zzvp zzvpVar = this.f21187m0;
                        zzvpVar.getClass();
                        if (zzvpVar.f21112b.equals("video/av01") && (byteBuffer = zzixVar.f20048d) != null) {
                            boolean z4 = z3 || this.f4981L1 <= 0;
                            ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                            byteBufferAsReadOnlyBuffer.flip();
                            if (byteBuffer2.hasRemaining()) {
                                zzacpVar.m3948a(zzgw.m7178a(byteBuffer2));
                                byteBuffer2.position(byteBuffer2.limit());
                            }
                            ArrayList arrayListM7178a = zzgw.m7178a(byteBufferAsReadOnlyBuffer);
                            zzacpVar.m3948a(arrayListM7178a);
                            int size = arrayListM7178a.size() - 1;
                            int i2 = 0;
                            while (size >= 0) {
                                zzgu zzguVar = (zzgu) arrayListM7178a.get(size);
                                int i3 = zzguVar.f18186a;
                                if (i3 != 2 && i3 != 15) {
                                    if (i3 == 3) {
                                        if (!z4) {
                                            break;
                                        }
                                        i3 = 3;
                                        if (i3 != 6) {
                                            zzgsVar = new zzgs(zzgvVar, zzguVar);
                                            if (zzgsVar != null) {
                                                break;
                                                break;
                                            }
                                            break;
                                            break;
                                        }
                                        zzgsVar = new zzgs(zzgvVar, zzguVar);
                                        if (zzgsVar != null) {
                                            break;
                                        }
                                        break;
                                        break;
                                    }
                                    if ((i3 != 6 && i3 != 3) || (zzgvVar = zzacpVar.f4922b) == null) {
                                        break;
                                    }
                                    try {
                                        zzgsVar = new zzgs(zzgvVar, zzguVar);
                                    } catch (zzgt unused) {
                                        zzgsVar = null;
                                    }
                                    if (zzgsVar != null || zzgsVar.f18135a) {
                                        break;
                                    }
                                }
                                if (((zzgu) arrayListM7178a.get(size)).f18186a == 6 || ((zzgu) arrayListM7178a.get(size)).f18186a == 3) {
                                    i2++;
                                }
                                size--;
                            }
                            if (i2 > 1 || size + 1 >= 8) {
                                iLimit = byteBufferAsReadOnlyBuffer.limit();
                            } else {
                                iLimit = size >= 0 ? ((zzgu) arrayListM7178a.get(size)).f18187b.limit() : byteBufferAsReadOnlyBuffer.position();
                            }
                            if (iLimit == 0) {
                                zzixVar.mo8566c();
                            } else if (iLimit != byteBufferAsReadOnlyBuffer.limit()) {
                                zzadf zzadfVar = this.f4992h1;
                                zzadfVar.getClass();
                                if (zzadfVar.f4966c + iLimit < byteBufferAsReadOnlyBuffer.capacity() && !zzixVar.m8564b(BasicMeasure.EXACTLY)) {
                                    ByteBuffer byteBuffer3 = zzixVar.f20048d;
                                    byteBuffer3.getClass();
                                    byteBuffer3.position(iLimit);
                                }
                            }
                        }
                    }
                    if (z2) {
                        if (z3) {
                            this.f21152M0.f20079d++;
                        } else {
                            this.f4991g1.add(Long.valueOf(zzixVar.f20049e));
                            this.f4981L1++;
                        }
                    }
                    return z2;
                }
                zzixVar.mo8566c();
                z2 = true;
                if (z2) {
                    if (z3) {
                        this.f21152M0.f20079d++;
                    } else {
                        this.f4991g1.add(Long.valueOf(zzixVar.f20049e));
                        this.f4981L1++;
                    }
                }
                return z2;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzvw
    /* JADX INFO: renamed from: h0 */
    public final int mo4005h0(zzvy zzvyVar, zzv zzvVar) {
        boolean z;
        String str = zzvVar.f21061o;
        if (!zzas.m4350b(str)) {
            return 128;
        }
        int i2 = 0;
        boolean z2 = zzvVar.f21065s != null;
        Context context = this.f4982X0;
        List listM3977S0 = m3977S0(context, zzvyVar, zzvVar, z2, false);
        if (z2 && listM3977S0.isEmpty()) {
            listM3977S0 = m3977S0(context, zzvyVar, zzvVar, false, false);
        }
        if (listM3977S0.isEmpty()) {
            return 129;
        }
        if (zzvVar.f21045O != 0) {
            return 130;
        }
        zzvp zzvpVar = (zzvp) listM3977S0.get(0);
        boolean zM8946b = zzvpVar.m8946b(context, zzvVar);
        if (!zM8946b) {
            int i3 = 1;
            while (true) {
                if (i3 >= listM3977S0.size()) {
                    z = true;
                    break;
                }
                zzvp zzvpVar2 = (zzvp) listM3977S0.get(i3);
                if (zzvpVar2.m8946b(context, zzvVar)) {
                    zM8946b = true;
                    z = false;
                    zzvpVar = zzvpVar2;
                    break;
                }
                i3++;
            }
        } else {
            z = true;
            break;
        }
        int i4 = true != zM8946b ? 3 : 4;
        int i5 = true != zzvpVar.m8947c(zzvVar) ? 8 : 16;
        int i6 = true != zzvpVar.f21117g ? 0 : 64;
        int i7 = true != z ? 0 : 128;
        if (Build.VERSION.SDK_INT >= 26 && "video/dolby-vision".equals(str) && !zzadd.m3973a(context)) {
            i7 = 256;
        }
        if (zM8946b) {
            List listM3977S1 = m3977S0(context, zzvyVar, zzvVar, z2, true);
            if (!listM3977S1.isEmpty()) {
                HashMap map = zzwi.f21212a;
                ArrayList arrayList = new ArrayList(listM3977S1);
                Collections.sort(arrayList, new zzwf(new zzwg(context, zzvVar)));
                zzvp zzvpVar3 = (zzvp) arrayList.get(0);
                if (zzvpVar3.m8946b(context, zzvVar) && zzvpVar3.m8947c(zzvVar)) {
                    i2 = 32;
                }
            }
        }
        return i4 | i5 | i2 | i6 | i7;
    }

    @Override // com.google.android.gms.internal.ads.zzvw
    /* JADX INFO: renamed from: i0 */
    public final ArrayList mo4006i0(zzvy zzvyVar, zzv zzvVar) {
        Context context = this.f4982X0;
        List listM3977S0 = m3977S0(context, zzvyVar, zzvVar, false, false);
        HashMap map = zzwi.f21212a;
        ArrayList arrayList = new ArrayList(listM3977S0);
        Collections.sort(arrayList, new zzwf(new zzwg(context, zzvVar)));
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.zzvw, com.google.android.gms.internal.ads.zziz, com.google.android.gms.internal.ads.zzmx
    /* JADX INFO: renamed from: j */
    public final void mo4007j(int i2, Object obj) {
        if (i2 == 1) {
            m3996T0(obj);
            return;
        }
        if (i2 == 7) {
            obj.getClass();
            zzadt zzadtVar = (zzadt) obj;
            this.f4978I1 = zzadtVar;
            zzaew zzaewVar = this.f4995k1;
            if (zzaewVar != null) {
                zzaewVar.mo3953c(zzadtVar);
                return;
            }
            return;
        }
        if (i2 == 10) {
            obj.getClass();
            int iIntValue = ((Integer) obj).intValue();
            if (this.f4977H1 != iIntValue) {
                this.f4977H1 = iIntValue;
                return;
            }
            return;
        }
        if (i2 == 4) {
            obj.getClass();
            int iIntValue2 = ((Integer) obj).intValue();
            this.f5003s1 = iIntValue2;
            zzvm zzvmVar = this.f21180f0;
            if (zzvmVar != null) {
                zzvmVar.mo8919i(iIntValue2);
                return;
            }
            return;
        }
        if (i2 == 5) {
            obj.getClass();
            int iIntValue3 = ((Integer) obj).intValue();
            this.f5004t1 = iIntValue3;
            zzaew zzaewVar2 = this.f4995k1;
            if (zzaewVar2 != null) {
                zzaewVar2.mo3959i(iIntValue3);
                return;
            }
            zzaed zzaedVar = this.f4986b1.f5059b;
            if (zzaedVar.f5090j == iIntValue3) {
                return;
            }
            zzaedVar.f5090j = iIntValue3;
            zzaedVar.m4044c(true);
            return;
        }
        if (i2 == 13) {
            obj.getClass();
            List list = (List) obj;
            if (list.equals(zzbr.f9288a)) {
                zzaew zzaewVar3 = this.f4995k1;
                if (zzaewVar3 == null || !zzaewVar3.mo3951a()) {
                    return;
                }
                zzaewVar3.mo3952b();
                return;
            }
            this.f4998n1 = list;
            zzaew zzaewVar4 = this.f4995k1;
            if (zzaewVar4 != null) {
                zzaewVar4.mo3961j(list);
                return;
            }
            return;
        }
        if (i2 == 14) {
            obj.getClass();
            zzev zzevVar = (zzev) obj;
            if (zzevVar.f14943a == 0 || zzevVar.f14944b == 0) {
                return;
            }
            this.f5001q1 = zzevVar;
            zzaew zzaewVar5 = this.f4995k1;
            if (zzaewVar5 != null) {
                Surface surface = this.f4999o1;
                surface.getClass();
                zzaewVar5.mo3955e(surface, zzevVar);
                return;
            }
            return;
        }
        switch (i2) {
            case 16:
                obj.getClass();
                this.f4976G1 = ((Integer) obj).intValue();
                zzvm zzvmVar2 = this.f21180f0;
                if (zzvmVar2 != null && Build.VERSION.SDK_INT >= 35) {
                    Bundle bundle = new Bundle();
                    bundle.putInt("importance", Math.max(0, -this.f4976G1));
                    zzvmVar2.mo8914d(bundle);
                    break;
                }
                break;
            case 17:
                Surface surface2 = this.f4999o1;
                m3996T0(null);
                obj.getClass();
                ((zzadg) obj).mo4007j(1, surface2);
                break;
            case 18:
                boolean z = this.f5009y1 != null;
                zznj zznjVar = (zznj) obj;
                this.f5009y1 = zznjVar;
                if (z != (zznjVar != null)) {
                    m8958C0(this.f21181g0);
                }
                break;
            default:
                super.mo4007j(i2, obj);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvw
    /* JADX INFO: renamed from: k0 */
    public final zzvj mo4008k0(zzvp zzvpVar, zzv zzvVar, float f2) {
        zzi zziVar;
        zzadf zzadfVar;
        Point point;
        int i2;
        int i3;
        int i4;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        byte b;
        int i5;
        Pair pairM6033b;
        int iM3974N0;
        zzv[] zzvVarArr = this.f20055B;
        zzvVarArr.getClass();
        int length = zzvVarArr.length;
        int iM3975Q0 = m3975Q0(zzvpVar, zzvVar);
        float f3 = zzvVar.f21072z;
        zzi zziVar2 = zzvVar.f21035E;
        int i6 = zzvVar.f21069w;
        int i7 = zzvVar.f21068v;
        if (length == 1) {
            if (iM3975Q0 != -1 && (iM3974N0 = m3974N0(zzvpVar, zzvVar)) != -1) {
                iM3975Q0 = Math.min((int) (iM3975Q0 * 1.5f), iM3974N0);
            }
            zzadfVar = new zzadf(i7, i6, iM3975Q0);
            zziVar = zziVar2;
        } else {
            int iMax = i6;
            int iMax2 = i7;
            int i8 = 0;
            boolean z = false;
            while (i8 < length) {
                zzv zzvVar2 = zzvVarArr[i8];
                if (zziVar2 != null && zzvVar2.f21035E == null) {
                    zzt zztVar = new zzt(zzvVar2);
                    zztVar.f20778D = zziVar2;
                    zzvVar2 = new zzv(zztVar);
                }
                zzje zzjeVarM8948d = zzvpVar.m8948d(zzvVar, zzvVar2);
                zzv[] zzvVarArr2 = zzvVarArr;
                int i9 = zzvVar2.f21069w;
                if (zzjeVarM8948d.f20091d != 0) {
                    int i10 = zzvVar2.f21068v;
                    b = -1;
                    z |= i10 == -1 || i9 == -1;
                    iMax2 = Math.max(iMax2, i10);
                    iMax = Math.max(iMax, i9);
                    iM3975Q0 = Math.max(iM3975Q0, m3975Q0(zzvpVar, zzvVar2));
                } else {
                    b = -1;
                }
                i8++;
                zzvVarArr = zzvVarArr2;
                length = length;
            }
            if (z) {
                zzeh.m6211c("MediaCodecVideoRenderer", AbstractC1456a.m2449p(new StringBuilder(String.valueOf(iMax2).length() + 44 + String.valueOf(iMax).length()), "Resolutions unknown. Codec max resolution: ", iMax2, "x", iMax));
                boolean z2 = i6 > i7;
                int i11 = z2 ? i6 : i7;
                int i12 = true != z2 ? i6 : i7;
                zziVar = zziVar2;
                int i13 = 0;
                while (true) {
                    Point pointM8945j = null;
                    if (i13 < 9) {
                        float f4 = i12;
                        int i14 = i13;
                        float f5 = i11;
                        int i15 = f4967M1[i14];
                        float f6 = i15;
                        if (i15 > i11 && (i2 = (int) (f6 * (f4 / f5))) > i12) {
                            if (true != z2) {
                                i2 = i15;
                            }
                            int i16 = true == z2 ? i15 : i2;
                            boolean z3 = z2;
                            MediaCodecInfo.CodecCapabilities codecCapabilities = zzvpVar.f21114d;
                            if (codecCapabilities != null && (videoCapabilities = codecCapabilities.getVideoCapabilities()) != null) {
                                pointM8945j = zzvp.m8945j(videoCapabilities, i2, i16);
                            }
                            point = pointM8945j;
                            if (point != null) {
                                i3 = i11;
                                i4 = i12;
                                if (zzvpVar.m8949e(point.x, point.y, f3)) {
                                    break;
                                }
                            } else {
                                i3 = i11;
                                i4 = i12;
                            }
                            i13 = i14 + 1;
                            z2 = z3;
                            i11 = i3;
                            i12 = i4;
                        }
                    }
                    point = null;
                    break;
                }
                if (point != null) {
                    iMax2 = Math.max(iMax2, point.x);
                    iMax = Math.max(iMax, point.y);
                    zzt zztVar2 = new zzt(zzvVar);
                    zztVar2.f20809u = iMax2;
                    zztVar2.f20810v = iMax;
                    iM3975Q0 = Math.max(iM3975Q0, m3974N0(zzvpVar, new zzv(zztVar2)));
                    zzeh.m6211c("MediaCodecVideoRenderer", AbstractC1456a.m2449p(new StringBuilder(AbstractC1456a.m2434a(iMax2, 35) + String.valueOf(iMax).length()), "Codec max resolution adjusted to: ", iMax2, "x", iMax));
                }
            } else {
                zziVar = zziVar2;
            }
            zzadfVar = new zzadf(iMax2, iMax, iM3975Q0);
        }
        String str = zzvpVar.f21113c;
        this.f4992h1 = zzadfVar;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", i7);
        mediaFormat.setInteger("height", i6);
        zzek.m6243a(mediaFormat, zzvVar.f21064r);
        if (f3 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f3);
        }
        zzek.m6244b(mediaFormat, "rotation-degrees", zzvVar.f21031A);
        if (zziVar != null) {
            zzi zziVar3 = zziVar;
            zzek.m6244b(mediaFormat, "color-transfer", zziVar3.f19549c);
            zzek.m6244b(mediaFormat, "color-standard", zziVar3.f19547a);
            zzek.m6244b(mediaFormat, "color-range", zziVar3.f19548b);
            byte[] bArr = zziVar3.f19550d;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        if ("video/dolby-vision".equals(zzvVar.f21061o) && (pairM6033b = zzdr.m6033b(zzvVar)) != null) {
            zzek.m6244b(mediaFormat, "profile", ((Integer) pairM6033b.first).intValue());
        }
        mediaFormat.setInteger("max-width", zzadfVar.f4964a);
        mediaFormat.setInteger("max-height", zzadfVar.f4965b);
        zzek.m6244b(mediaFormat, "max-input-size", zzadfVar.f4966c);
        mediaFormat.setInteger("priority", 0);
        if (f2 != -1.0f) {
            mediaFormat.setFloat("operating-rate", f2);
        }
        if (this.f4985a1) {
            mediaFormat.setInteger("no-post-process", 1);
            i5 = 0;
            mediaFormat.setInteger("auto-frc", 0);
        } else {
            i5 = 0;
        }
        if (Build.VERSION.SDK_INT >= 35) {
            mediaFormat.setInteger("importance", Math.max(i5, -this.f4976G1));
        }
        m8957B0(mediaFormat);
        Surface surfaceM3993P0 = m3993P0(zzvpVar);
        if (this.f4995k1 != null && !zzfm.m6510l(this.f4982X0)) {
            mediaFormat.setInteger("allow-frame-drop", 0);
        }
        return new zzvj(zzvpVar, mediaFormat, zzvVar, surfaceM3993P0, null);
    }

    @Override // com.google.android.gms.internal.ads.zzvw
    /* JADX INFO: renamed from: l0 */
    public final zzje mo4009l0(zzvp zzvpVar, zzv zzvVar, zzv zzvVar2, boolean z) {
        int i2;
        int i3;
        int i4;
        zzje zzjeVarM8948d = zzvpVar.m8948d(zzvVar, zzvVar2);
        int i5 = zzjeVarM8948d.f20092e;
        zzadf zzadfVar = this.f4992h1;
        zzadfVar.getClass();
        if (zzvVar2.f21068v > zzadfVar.f4964a || zzvVar2.f21069w > zzadfVar.f4965b) {
            i5 |= 256;
        }
        if (m3975Q0(zzvpVar, zzvVar2) > zzadfVar.f4966c) {
            i5 |= 64;
        }
        if (this.f5004t1 != Integer.MIN_VALUE && (i4 = Build.VERSION.SDK_INT) < 31 && (i4 != 30 || Build.MODEL.startsWith("MiTV"))) {
            float f2 = zzvVar.f21072z;
            if (f2 != -1.0f) {
                float f3 = zzvVar2.f21072z;
                if (f3 != -1.0f && (!zzvpVar.f21116f || !z)) {
                    float fMax = Math.max(f3, f2) / Math.min(f3, f2);
                    if (Math.abs(fMax - Math.round(fMax)) > 0.01f) {
                        i5 |= 65536;
                    }
                }
            }
        }
        String str = zzvpVar.f21111a;
        if (i5 != 0) {
            i3 = 0;
            i2 = i5;
        } else {
            i2 = 0;
            i3 = zzjeVarM8948d.f20091d;
        }
        return new zzje(str, zzvVar, zzvVar2, i3, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzvw
    /* JADX INFO: renamed from: n0 */
    public final float mo4010n0(float f2, zzv zzvVar, zzv[] zzvVarArr) {
        zzvp zzvpVar;
        float fMax = -1.0f;
        for (zzv zzvVar2 : zzvVarArr) {
            float f3 = zzvVar2.f21072z;
            if (f3 != -1.0f) {
                fMax = Math.max(fMax, f3);
            }
        }
        float f4 = fMax == -1.0f ? -1.0f : fMax * f2;
        if (this.f5009y1 == null || (zzvpVar = this.f21187m0) == null) {
            return f4;
        }
        int i2 = zzvVar.f21068v;
        int i3 = zzvVar.f21069w;
        float f5 = -3.4028235E38f;
        if (zzvpVar.f21119i) {
            float f6 = zzvpVar.f21122l;
            if (f6 != -3.4028235E38f && zzvpVar.f21120j == i2 && zzvpVar.f21121k == i3) {
                f5 = f6;
            } else {
                f5 = 1024.0f;
                if (!zzvpVar.m8949e(i2, i3, 1024.0d)) {
                    float f7 = 0.0f;
                    while (true) {
                        float f8 = f5 - f7;
                        if (Math.abs(f8) <= 5.0f) {
                            break;
                        }
                        float f9 = (f8 / 2.0f) + f7;
                        boolean zM8949e = zzvpVar.m8949e(i2, i3, f9);
                        if (true == zM8949e) {
                            f7 = f9;
                        }
                        if (true != zM8949e) {
                            f5 = f9;
                        }
                    }
                    f5 = f7;
                }
                zzvpVar.f21122l = f5;
                zzvpVar.f21120j = i2;
                zzvpVar.f21121k = i3;
            }
        }
        return f4 != -1.0f ? Math.max(f4, f5) : f5;
    }

    @Override // com.google.android.gms.internal.ads.zznc, com.google.android.gms.internal.ads.zzne
    /* JADX INFO: renamed from: o */
    public final String mo4011o() {
        return "MediaCodecVideoRenderer";
    }

    @Override // com.google.android.gms.internal.ads.zzvw
    /* JADX INFO: renamed from: o0 */
    public final void mo4012o0(String str, final long j2, final long j3) {
        final String str2;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        final zzaeq zzaeqVar = this.f4984Z0;
        Handler handler = zzaeqVar.f5132a;
        if (handler != null) {
            str2 = str;
            handler.post(new Runnable(str2, j2, j3) { // from class: com.google.android.gms.internal.ads.zzaef
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzaeq zzaeqVar2 = this.f5112s;
                    zzaeqVar2.getClass();
                    String str3 = zzfm.f16091a;
                    zzaeqVar2.f5133b.zzc();
                }
            });
        } else {
            str2 = str;
        }
        this.f4993i1 = m3976R0(str2);
        zzvp zzvpVar = this.f21187m0;
        zzvpVar.getClass();
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 29 && "video/x-vnd.on2.vp9".equals(zzvpVar.f21112b)) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = zzvpVar.f21114d;
            if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
            }
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : codecProfileLevelArr) {
                if (codecProfileLevel.profile == 16384) {
                    z = true;
                    break;
                }
            }
        }
        this.f4994j1 = z;
    }

    @Override // com.google.android.gms.internal.ads.zzvw, com.google.android.gms.internal.ads.zziz
    /* JADX INFO: renamed from: p */
    public final void mo4013p(boolean z, boolean z2, long j2) {
        zzaew zzaewVar = this.f4995k1;
        if (zzaewVar != null && !z) {
            zzaewVar.mo3966o0(true);
        }
        if (z2) {
            this.f5010z1 = j2;
        }
        super.mo4013p(z, z2, j2);
        zzaew zzaewVar2 = this.f4995k1;
        zzadw zzadwVar = this.f4986b1;
        if (zzaewVar2 == null) {
            zzadwVar.f5059b.m4042a();
            zzadwVar.f5064g = -9223372036854775807L;
            zzadwVar.f5062e = -9223372036854775807L;
            zzadwVar.f5061d = Math.min(zzadwVar.f5061d, 1);
            zzadwVar.f5065h = -9223372036854775807L;
            zzadwVar.f5070m = false;
        }
        zzadx zzadxVar = this.f4990f1;
        if (zzadxVar != null) {
            zzadxVar.m4039c();
        }
        if (z) {
            zzaew zzaewVar3 = this.f4995k1;
            if (zzaewVar3 != null) {
                zzaewVar3.mo3950S(false);
            } else {
                zzadwVar.f5066i = false;
                zzadwVar.f5065h = -9223372036854775807L;
            }
        }
        this.f5007w1 = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzvw
    /* JADX INFO: renamed from: p0 */
    public final void mo4014p0(final String str) {
        final zzaeq zzaeqVar = this.f4984Z0;
        Handler handler = zzaeqVar.f5132a;
        if (handler != null) {
            handler.post(new Runnable(str) { // from class: com.google.android.gms.internal.ads.zzael
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzaeq zzaeqVar2 = this.f5125s;
                    zzaeqVar2.getClass();
                    String str2 = zzfm.f16091a;
                    zzaeqVar2.f5133b.zzh();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zziz
    /* JADX INFO: renamed from: q */
    public final void mo4015q() {
        this.f5006v1 = 0;
        zzdp zzdpVar = this.f20071y;
        zzdpVar.getClass();
        this.f5005u1 = zzdpVar.zzb();
        this.f4971B1 = 0L;
        this.f4972C1 = 0;
        zzaew zzaewVar = this.f4995k1;
        if (zzaewVar != null) {
            zzaewVar.zza();
        } else {
            this.f4986b1.m4031b();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvw
    /* JADX INFO: renamed from: q0 */
    public final void mo4016q0(final Exception exc) {
        zzeh.m6214f("MediaCodecVideoRenderer", "Video codec error", exc);
        final zzaeq zzaeqVar = this.f4984Z0;
        Handler handler = zzaeqVar.f5132a;
        if (handler != null) {
            handler.post(new Runnable(exc) { // from class: com.google.android.gms.internal.ads.zzaen
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzaeq zzaeqVar2 = this.f5128s;
                    zzaeqVar2.getClass();
                    String str = zzfm.f16091a;
                    zzaeqVar2.f5133b.zzk();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvw
    /* JADX INFO: renamed from: r0 */
    public final zzje mo4017r0(zzly zzlyVar) {
        final zzje zzjeVarMo4017r0 = super.mo4017r0(zzlyVar);
        final zzv zzvVar = zzlyVar.f20351b;
        zzvVar.getClass();
        final zzaeq zzaeqVar = this.f4984Z0;
        Handler handler = zzaeqVar.f5132a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzaeg
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzaeq zzaeqVar2 = zzaeqVar;
                    zzaeqVar2.getClass();
                    String str = zzfm.f16091a;
                    zzaeqVar2.f5133b.mo4049b(zzvVar, zzjeVarMo4017r0);
                }
            });
        }
        zzadx zzadxVar = this.f4990f1;
        if (zzadxVar != null) {
            zzadxVar.m4039c();
        }
        return zzjeVarMo4017r0;
    }

    @Override // com.google.android.gms.internal.ads.zziz
    /* JADX INFO: renamed from: s */
    public final void mo4018s() {
        int i2 = this.f5006v1;
        final zzaeq zzaeqVar = this.f4984Z0;
        if (i2 > 0) {
            zzdp zzdpVar = this.f20071y;
            zzdpVar.getClass();
            long jZzb = zzdpVar.zzb();
            final long j2 = jZzb - this.f5005u1;
            final int i3 = this.f5006v1;
            Handler handler = zzaeqVar.f5132a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzaeh
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzaeq zzaeqVar2 = zzaeqVar;
                        zzaeqVar2.getClass();
                        String str = zzfm.f16091a;
                        zzaeqVar2.f5133b.mo4053g(i3, j2);
                    }
                });
            }
            this.f5006v1 = 0;
            this.f5005u1 = jZzb;
        }
        final int i4 = this.f4972C1;
        if (i4 != 0) {
            final long j3 = this.f4971B1;
            Handler handler2 = zzaeqVar.f5132a;
            if (handler2 != null) {
                handler2.post(new Runnable(i4, j3, zzaeqVar) { // from class: com.google.android.gms.internal.ads.zzaei

                    /* JADX INFO: renamed from: s */
                    public final /* synthetic */ zzaeq f5119s;

                    {
                        this.f5119s = zzaeqVar;
                    }

                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzaeq zzaeqVar2 = this.f5119s;
                        zzaeqVar2.getClass();
                        String str = zzfm.f16091a;
                        zzaeqVar2.f5133b.zzj();
                    }
                });
            }
            this.f4971B1 = 0L;
            this.f4972C1 = 0;
        }
        zzaew zzaewVar = this.f4995k1;
        if (zzaewVar != null) {
            zzaewVar.zzb();
        } else {
            zzadw zzadwVar = this.f4986b1;
            zzadwVar.f5060c = false;
            zzadwVar.f5065h = -9223372036854775807L;
            zzaed zzaedVar = zzadwVar.f5059b;
            zzaedVar.f5084d = false;
            zzadz zzadzVar = zzaedVar.f5083c;
            if (zzadzVar != null) {
                zzadzVar.mo4041b();
            }
            zzaedVar.m4045d();
        }
        zzadx zzadxVar = this.f4990f1;
        if (zzadxVar != null) {
            zzadxVar.m4039c();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvw
    /* JADX INFO: renamed from: s0 */
    public final void mo4019s0(zzv zzvVar, MediaFormat mediaFormat) {
        zzvm zzvmVar = this.f21180f0;
        if (zzvmVar != null) {
            zzvmVar.mo8919i(this.f5003s1);
        }
        mediaFormat.getClass();
        boolean z = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
        int integer = z ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
        int integer2 = z ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
        float f2 = zzvVar.f21032B;
        int i2 = zzvVar.f21031A;
        if (i2 == 90 || i2 == 270) {
            f2 = 1.0f / f2;
            int i3 = integer2;
            integer2 = integer;
            integer = i3;
        }
        this.f4974E1 = new zzbv(integer, integer2, f2);
        zzaew zzaewVar = this.f4995k1;
        if (zzaewVar == null || !this.f4980K1) {
            this.f4986b1.m4033d(zzvVar.f21072z);
        } else {
            zzt zztVar = new zzt(zzvVar);
            zztVar.f20809u = integer;
            zztVar.f20810v = integer2;
            zztVar.f20775A = f2;
            zzv zzvVar2 = new zzv(zztVar);
            int i4 = this.f4997m1;
            List list = this.f4998n1;
            if (list == null) {
                zzgzi zzgziVar = zzgwt.f18303t;
                list = zzgyo.f18355w;
            }
            zzaewVar.mo3964m(zzvVar2, this.f21154N0.f21132b, i4, list);
            this.f4997m1 = 2;
        }
        this.f4980K1 = false;
    }

    @Override // com.google.android.gms.internal.ads.zzvw, com.google.android.gms.internal.ads.zziz
    /* JADX INFO: renamed from: t */
    public final void mo4020t() {
        final zzjd zzjdVar;
        final zzaeq zzaeqVar = this.f4984Z0;
        this.f4975F1 = null;
        this.f5002r1 = false;
        this.f4970A1 = true;
        try {
            super.mo4020t();
            zzjdVar = this.f21152M0;
            zzaeqVar.getClass();
            synchronized (zzjdVar) {
            }
        } finally {
            zzjdVar = this.f21152M0;
            zzaeqVar.getClass();
            synchronized (zzjdVar) {
                Handler handler = zzaeqVar.f5132a;
                if (handler != null) {
                    handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzaem
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzaeq zzaeqVar2 = zzaeqVar;
                            zzjd zzjdVar2 = zzjdVar;
                            synchronized (zzjdVar2) {
                            }
                            String str = zzfm.f16091a;
                            zzaeqVar2.f5133b.mo4052f(zzjdVar2);
                        }
                    });
                }
                zzaeqVar.m4047a(zzbv.f9425d);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvw
    /* JADX INFO: renamed from: t0 */
    public final void mo4021t0() {
        zzaew zzaewVar = this.f4995k1;
        if (zzaewVar != null) {
            zzaewVar.zzi();
            long j2 = this.f4979J1;
            if (j2 == -9223372036854775807L) {
                j2 = this.f21154N0.f21132b;
                this.f4979J1 = j2;
            }
            this.f4995k1.mo3962k(-j2);
        } else {
            this.f4986b1.m4030a(2);
        }
        this.f4980K1 = true;
    }

    @Override // com.google.android.gms.internal.ads.zzvw, com.google.android.gms.internal.ads.zziz
    /* JADX INFO: renamed from: u */
    public final void mo4022u() {
        try {
            super.mo4022u();
        } finally {
            this.f4996l1 = false;
            this.f4979J1 = -9223372036854775807L;
            zzadi zzadiVar = this.f5000p1;
            if (zzadiVar != null) {
                zzadiVar.release();
                this.f5000p1 = null;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0077 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:25:0x0079  */
    /* JADX WARN: Code duplicated, block: B:27:0x007c  */
    /* JADX WARN: Code duplicated, block: B:30:0x0080  */
    /* JADX WARN: Code duplicated, block: B:32:0x0089  */
    /* JADX WARN: Code duplicated, block: B:34:0x009f  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:37:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:40:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:44:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:46:0x00d7  */
    @Override // com.google.android.gms.internal.ads.zzvw
    /* JADX INFO: renamed from: u0 */
    public final boolean mo4023u0(long j2, long j3, zzvm zzvmVar, ByteBuffer byteBuffer, int i2, int i3, int i4, long j4, boolean z, boolean z2, zzv zzvVar) {
        long jZzc;
        zzadt zzadtVar;
        long j5;
        zzadt zzadtVar2;
        int i5;
        zzvmVar.getClass();
        long j6 = j4 - this.f21154N0.f21133c;
        int i6 = 0;
        while (true) {
            PriorityQueue priorityQueue = this.f4991g1;
            Long l2 = (Long) priorityQueue.peek();
            if (l2 == null || l2.longValue() >= j4) {
                break;
            }
            priorityQueue.poll();
            i6++;
        }
        m3984J0(i6, 0);
        zzaew zzaewVar = this.f4995k1;
        if (zzaewVar != null) {
            if (!z || z2) {
                return zzaewVar.mo3963l(j4, new zzadc(this, zzvmVar, i2, j6));
            }
            m3991O0(zzvmVar, i2);
            return true;
        }
        long j7 = this.f21154N0.f21132b;
        zzadw zzadwVar = this.f4986b1;
        zzadu zzaduVar = this.f4987c1;
        int iM4035f = zzadwVar.m4035f(j4, j2, j3, j7, z, z2, zzaduVar);
        zzadx zzadxVar = this.f4990f1;
        if (zzadxVar == null) {
            if (iM4035f != 0) {
                zzdp zzdpVar = this.f20071y;
                zzdpVar.getClass();
                jZzc = zzdpVar.zzc();
                zzadtVar = this.f4978I1;
                if (zzadtVar != null) {
                    zzadtVar.mo3949b(j6, jZzc, zzvVar, this.f21182h0);
                }
                m3987L0(zzvmVar, i2, jZzc);
                m3985K0(zzaduVar.f5056a);
                return true;
            }
            if (iM4035f != 1) {
                j5 = zzaduVar.f5057b;
                long j8 = zzaduVar.f5056a;
                if (j5 == this.f4973D1) {
                    m3991O0(zzvmVar, i2);
                } else {
                    zzadtVar2 = this.f4978I1;
                    if (zzadtVar2 != null) {
                        i5 = i2;
                        zzadtVar2.mo3949b(j6, j5, zzvVar, this.f21182h0);
                    } else {
                        i5 = i2;
                    }
                    m3987L0(zzvmVar, i5, j5);
                }
                m3985K0(j8);
                this.f4973D1 = j5;
                return true;
            }
            if (iM4035f != 2) {
                Trace.beginSection("dropVideoBuffer");
                zzvmVar.mo8909A(i2);
                Trace.endSection();
                m3984J0(0, 1);
                m3985K0(zzaduVar.f5056a);
                return true;
            }
            if (iM4035f == 3) {
                m3991O0(zzvmVar, i2);
                m3985K0(zzaduVar.f5056a);
                return true;
            }
        } else if (iM4035f != 5 && iM4035f != 4) {
            zzadxVar.m4037a(j4, zzaduVar.f5056a);
            if (iM4035f != 0) {
                zzdp zzdpVar2 = this.f20071y;
                zzdpVar2.getClass();
                jZzc = zzdpVar2.zzc();
                zzadtVar = this.f4978I1;
                if (zzadtVar != null) {
                    zzadtVar.mo3949b(j6, jZzc, zzvVar, this.f21182h0);
                }
                m3987L0(zzvmVar, i2, jZzc);
                m3985K0(zzaduVar.f5056a);
                return true;
            }
            if (iM4035f != 1) {
                j5 = zzaduVar.f5057b;
                long j9 = zzaduVar.f5056a;
                if (j5 == this.f4973D1) {
                    m3991O0(zzvmVar, i2);
                } else {
                    zzadtVar2 = this.f4978I1;
                    if (zzadtVar2 != null) {
                        i5 = i2;
                        zzadtVar2.mo3949b(j6, j5, zzvVar, this.f21182h0);
                    } else {
                        i5 = i2;
                    }
                    m3987L0(zzvmVar, i5, j5);
                }
                m3985K0(j9);
                this.f4973D1 = j5;
                return true;
            }
            if (iM4035f != 2) {
                Trace.beginSection("dropVideoBuffer");
                zzvmVar.mo8909A(i2);
                Trace.endSection();
                m3984J0(0, 1);
                m3985K0(zzaduVar.f5056a);
                return true;
            }
            if (iM4035f == 3) {
                m3991O0(zzvmVar, i2);
                m3985K0(zzaduVar.f5056a);
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zziz
    /* JADX INFO: renamed from: v */
    public final void mo4024v() {
        zzaew zzaewVar = this.f4995k1;
        if (zzaewVar == null || !this.f4983Y0) {
            return;
        }
        zzaewVar.mo3968s();
    }

    @Override // com.google.android.gms.internal.ads.zzvw
    /* JADX INFO: renamed from: v0 */
    public final void mo4025v0(final zzjb zzjbVar) {
        final zzaeq zzaeqVar = this.f4984Z0;
        Handler handler = zzaeqVar.f5132a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzaeo
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzaeq zzaeqVar2 = zzaeqVar;
                    zzaeqVar2.getClass();
                    String str = zzfm.f16091a;
                    zzaeqVar2.f5133b.mo4050c(zzjbVar);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvw
    /* JADX INFO: renamed from: w0 */
    public final void mo4026w0() {
        zzaew zzaewVar = this.f4995k1;
        if (zzaewVar != null) {
            zzaewVar.zzi();
        } else {
            long j2 = this.f21154N0.f21136f;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvw
    /* JADX INFO: renamed from: y0 */
    public final void mo4027y0(zzix zzixVar) {
        if (this.f4994j1) {
            ByteBuffer byteBuffer = zzixVar.f20050f;
            byteBuffer.getClass();
            if (byteBuffer.remaining() >= 7) {
                byte b = byteBuffer.get();
                short s2 = byteBuffer.getShort();
                short s3 = byteBuffer.getShort();
                byte b2 = byteBuffer.get();
                byte b3 = byteBuffer.get();
                byteBuffer.position(0);
                if (b == -75 && s2 == 60 && s3 == 1 && b2 == 4) {
                    if (b3 == 0 || b3 == 1) {
                        byte[] bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.get(bArr);
                        byteBuffer.position(0);
                        zzvm zzvmVar = this.f21180f0;
                        zzvmVar.getClass();
                        Bundle bundle = new Bundle();
                        bundle.putByteArray("hdr10-plus-info", bArr);
                        zzvmVar.mo8914d(bundle);
                    }
                }
            }
        }
    }
}
