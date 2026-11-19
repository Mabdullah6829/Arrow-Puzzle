package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.webkit.URLUtil;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import androidx.collection.ArrayMap;
import com.arrow.puzzle.escape.maze.free.game.R;
import java.util.Collections;
import java.util.Map;
import p011H.AbstractC0271e0;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbqe implements zzbpx {

    /* JADX INFO: renamed from: d */
    public static final Map f9256d;

    /* JADX INFO: renamed from: a */
    public final com.google.android.gms.ads.internal.zzb f9257a;

    /* JADX INFO: renamed from: b */
    public final zzbyh f9258b;

    /* JADX INFO: renamed from: c */
    public final zzbyo f9259c;

    static {
        String[] strArr = {"resize", "playVideo", "storePicture", "createCalendarEvent", "setOrientationProperties", "closeResizedAd", "unload"};
        Integer[] numArr = {1, 2, 3, 4, 5, 6, 7};
        ArrayMap arrayMap = new ArrayMap(7);
        for (int i2 = 0; i2 < 7; i2++) {
            arrayMap.put(strArr[i2], numArr[i2]);
        }
        f9256d = Collections.unmodifiableMap(arrayMap);
    }

    public zzbqe(com.google.android.gms.ads.internal.zzb zzbVar, zzbyh zzbyhVar, zzbyo zzbyoVar) {
        this.f9257a = zzbVar;
        this.f9258b = zzbyhVar;
        this.f9259c = zzbyoVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:175:0x0345  */
    /* JADX WARN: Code duplicated, block: B:225:0x044f A[Catch: all -> 0x01b1, TryCatch #0 {all -> 0x01b1, blocks: (B:91:0x01a6, B:93:0x01aa, B:94:0x01af, B:98:0x01b4, B:100:0x01bc, B:101:0x01c1, B:103:0x01c3, B:105:0x01cd, B:106:0x01d2, B:108:0x01d4, B:110:0x01da, B:111:0x01df, B:113:0x01e1, B:115:0x01ef, B:116:0x0201, B:118:0x020f, B:119:0x0221, B:121:0x022f, B:122:0x0241, B:124:0x024f, B:125:0x0261, B:127:0x026f, B:128:0x027d, B:130:0x028b, B:131:0x028d, B:133:0x0291, B:135:0x0295, B:137:0x029b, B:140:0x02a3, B:144:0x02da, B:150:0x02ea, B:225:0x044f, B:226:0x0454, B:228:0x0456, B:230:0x047f, B:232:0x048b, B:234:0x04c3, B:267:0x057f, B:274:0x05b2, B:275:0x05ca, B:276:0x05f3, B:278:0x05fd, B:279:0x0600, B:280:0x0625, B:283:0x0628, B:285:0x0656, B:286:0x0668, B:268:0x0586, B:269:0x058d, B:270:0x0596, B:271:0x059d, B:272:0x05a3, B:273:0x05ac, B:233:0x04c0, B:288:0x066a, B:289:0x066f, B:152:0x02f8, B:154:0x02fc, B:186:0x035a, B:187:0x0364, B:198:0x03cb, B:200:0x03cf, B:202:0x03d3, B:207:0x03e1, B:208:0x03f0, B:215:0x0426, B:221:0x0436, B:218:0x042c, B:220:0x0434, B:211:0x041d, B:213:0x0423, B:188:0x0368, B:190:0x0379, B:191:0x0387, B:193:0x0390, B:194:0x0398, B:195:0x03ae, B:196:0x03bf, B:222:0x043b, B:223:0x0444, B:291:0x0671, B:292:0x0676, B:294:0x0678, B:295:0x067d), top: B:319:0x01a6, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:228:0x0456 A[Catch: all -> 0x01b1, TryCatch #0 {all -> 0x01b1, blocks: (B:91:0x01a6, B:93:0x01aa, B:94:0x01af, B:98:0x01b4, B:100:0x01bc, B:101:0x01c1, B:103:0x01c3, B:105:0x01cd, B:106:0x01d2, B:108:0x01d4, B:110:0x01da, B:111:0x01df, B:113:0x01e1, B:115:0x01ef, B:116:0x0201, B:118:0x020f, B:119:0x0221, B:121:0x022f, B:122:0x0241, B:124:0x024f, B:125:0x0261, B:127:0x026f, B:128:0x027d, B:130:0x028b, B:131:0x028d, B:133:0x0291, B:135:0x0295, B:137:0x029b, B:140:0x02a3, B:144:0x02da, B:150:0x02ea, B:225:0x044f, B:226:0x0454, B:228:0x0456, B:230:0x047f, B:232:0x048b, B:234:0x04c3, B:267:0x057f, B:274:0x05b2, B:275:0x05ca, B:276:0x05f3, B:278:0x05fd, B:279:0x0600, B:280:0x0625, B:283:0x0628, B:285:0x0656, B:286:0x0668, B:268:0x0586, B:269:0x058d, B:270:0x0596, B:271:0x059d, B:272:0x05a3, B:273:0x05ac, B:233:0x04c0, B:288:0x066a, B:289:0x066f, B:152:0x02f8, B:154:0x02fc, B:186:0x035a, B:187:0x0364, B:198:0x03cb, B:200:0x03cf, B:202:0x03d3, B:207:0x03e1, B:208:0x03f0, B:215:0x0426, B:221:0x0436, B:218:0x042c, B:220:0x0434, B:211:0x041d, B:213:0x0423, B:188:0x0368, B:190:0x0379, B:191:0x0387, B:193:0x0390, B:194:0x0398, B:195:0x03ae, B:196:0x03bf, B:222:0x043b, B:223:0x0444, B:291:0x0671, B:292:0x0676, B:294:0x0678, B:295:0x067d), top: B:319:0x01a6, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:230:0x047f A[Catch: all -> 0x01b1, TryCatch #0 {all -> 0x01b1, blocks: (B:91:0x01a6, B:93:0x01aa, B:94:0x01af, B:98:0x01b4, B:100:0x01bc, B:101:0x01c1, B:103:0x01c3, B:105:0x01cd, B:106:0x01d2, B:108:0x01d4, B:110:0x01da, B:111:0x01df, B:113:0x01e1, B:115:0x01ef, B:116:0x0201, B:118:0x020f, B:119:0x0221, B:121:0x022f, B:122:0x0241, B:124:0x024f, B:125:0x0261, B:127:0x026f, B:128:0x027d, B:130:0x028b, B:131:0x028d, B:133:0x0291, B:135:0x0295, B:137:0x029b, B:140:0x02a3, B:144:0x02da, B:150:0x02ea, B:225:0x044f, B:226:0x0454, B:228:0x0456, B:230:0x047f, B:232:0x048b, B:234:0x04c3, B:267:0x057f, B:274:0x05b2, B:275:0x05ca, B:276:0x05f3, B:278:0x05fd, B:279:0x0600, B:280:0x0625, B:283:0x0628, B:285:0x0656, B:286:0x0668, B:268:0x0586, B:269:0x058d, B:270:0x0596, B:271:0x059d, B:272:0x05a3, B:273:0x05ac, B:233:0x04c0, B:288:0x066a, B:289:0x066f, B:152:0x02f8, B:154:0x02fc, B:186:0x035a, B:187:0x0364, B:198:0x03cb, B:200:0x03cf, B:202:0x03d3, B:207:0x03e1, B:208:0x03f0, B:215:0x0426, B:221:0x0436, B:218:0x042c, B:220:0x0434, B:211:0x041d, B:213:0x0423, B:188:0x0368, B:190:0x0379, B:191:0x0387, B:193:0x0390, B:194:0x0398, B:195:0x03ae, B:196:0x03bf, B:222:0x043b, B:223:0x0444, B:291:0x0671, B:292:0x0676, B:294:0x0678, B:295:0x067d), top: B:319:0x01a6, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:232:0x048b A[Catch: all -> 0x01b1, TryCatch #0 {all -> 0x01b1, blocks: (B:91:0x01a6, B:93:0x01aa, B:94:0x01af, B:98:0x01b4, B:100:0x01bc, B:101:0x01c1, B:103:0x01c3, B:105:0x01cd, B:106:0x01d2, B:108:0x01d4, B:110:0x01da, B:111:0x01df, B:113:0x01e1, B:115:0x01ef, B:116:0x0201, B:118:0x020f, B:119:0x0221, B:121:0x022f, B:122:0x0241, B:124:0x024f, B:125:0x0261, B:127:0x026f, B:128:0x027d, B:130:0x028b, B:131:0x028d, B:133:0x0291, B:135:0x0295, B:137:0x029b, B:140:0x02a3, B:144:0x02da, B:150:0x02ea, B:225:0x044f, B:226:0x0454, B:228:0x0456, B:230:0x047f, B:232:0x048b, B:234:0x04c3, B:267:0x057f, B:274:0x05b2, B:275:0x05ca, B:276:0x05f3, B:278:0x05fd, B:279:0x0600, B:280:0x0625, B:283:0x0628, B:285:0x0656, B:286:0x0668, B:268:0x0586, B:269:0x058d, B:270:0x0596, B:271:0x059d, B:272:0x05a3, B:273:0x05ac, B:233:0x04c0, B:288:0x066a, B:289:0x066f, B:152:0x02f8, B:154:0x02fc, B:186:0x035a, B:187:0x0364, B:198:0x03cb, B:200:0x03cf, B:202:0x03d3, B:207:0x03e1, B:208:0x03f0, B:215:0x0426, B:221:0x0436, B:218:0x042c, B:220:0x0434, B:211:0x041d, B:213:0x0423, B:188:0x0368, B:190:0x0379, B:191:0x0387, B:193:0x0390, B:194:0x0398, B:195:0x03ae, B:196:0x03bf, B:222:0x043b, B:223:0x0444, B:291:0x0671, B:292:0x0676, B:294:0x0678, B:295:0x067d), top: B:319:0x01a6, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:233:0x04c0 A[Catch: all -> 0x01b1, TryCatch #0 {all -> 0x01b1, blocks: (B:91:0x01a6, B:93:0x01aa, B:94:0x01af, B:98:0x01b4, B:100:0x01bc, B:101:0x01c1, B:103:0x01c3, B:105:0x01cd, B:106:0x01d2, B:108:0x01d4, B:110:0x01da, B:111:0x01df, B:113:0x01e1, B:115:0x01ef, B:116:0x0201, B:118:0x020f, B:119:0x0221, B:121:0x022f, B:122:0x0241, B:124:0x024f, B:125:0x0261, B:127:0x026f, B:128:0x027d, B:130:0x028b, B:131:0x028d, B:133:0x0291, B:135:0x0295, B:137:0x029b, B:140:0x02a3, B:144:0x02da, B:150:0x02ea, B:225:0x044f, B:226:0x0454, B:228:0x0456, B:230:0x047f, B:232:0x048b, B:234:0x04c3, B:267:0x057f, B:274:0x05b2, B:275:0x05ca, B:276:0x05f3, B:278:0x05fd, B:279:0x0600, B:280:0x0625, B:283:0x0628, B:285:0x0656, B:286:0x0668, B:268:0x0586, B:269:0x058d, B:270:0x0596, B:271:0x059d, B:272:0x05a3, B:273:0x05ac, B:233:0x04c0, B:288:0x066a, B:289:0x066f, B:152:0x02f8, B:154:0x02fc, B:186:0x035a, B:187:0x0364, B:198:0x03cb, B:200:0x03cf, B:202:0x03d3, B:207:0x03e1, B:208:0x03f0, B:215:0x0426, B:221:0x0436, B:218:0x042c, B:220:0x0434, B:211:0x041d, B:213:0x0423, B:188:0x0368, B:190:0x0379, B:191:0x0387, B:193:0x0390, B:194:0x0398, B:195:0x03ae, B:196:0x03bf, B:222:0x043b, B:223:0x0444, B:291:0x0671, B:292:0x0676, B:294:0x0678, B:295:0x067d), top: B:319:0x01a6, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:237:0x052b  */
    /* JADX WARN: Code duplicated, block: B:239:0x0533  */
    /* JADX WARN: Code duplicated, block: B:240:0x0535  */
    /* JADX WARN: Code duplicated, block: B:242:0x053d  */
    /* JADX WARN: Code duplicated, block: B:243:0x053f  */
    /* JADX WARN: Code duplicated, block: B:245:0x0547  */
    /* JADX WARN: Code duplicated, block: B:246:0x0549  */
    /* JADX WARN: Code duplicated, block: B:248:0x0551  */
    /* JADX WARN: Code duplicated, block: B:249:0x0553  */
    /* JADX WARN: Code duplicated, block: B:251:0x055b  */
    /* JADX WARN: Code duplicated, block: B:252:0x055d  */
    /* JADX WARN: Code duplicated, block: B:254:0x0565  */
    /* JADX WARN: Code duplicated, block: B:257:0x056c  */
    /* JADX WARN: Code duplicated, block: B:259:0x056f  */
    /* JADX WARN: Code duplicated, block: B:261:0x0572  */
    /* JADX WARN: Code duplicated, block: B:263:0x0577  */
    /* JADX WARN: Code duplicated, block: B:265:0x057a  */
    /* JADX WARN: Code duplicated, block: B:267:0x057f A[Catch: all -> 0x01b1, TRY_ENTER, TryCatch #0 {all -> 0x01b1, blocks: (B:91:0x01a6, B:93:0x01aa, B:94:0x01af, B:98:0x01b4, B:100:0x01bc, B:101:0x01c1, B:103:0x01c3, B:105:0x01cd, B:106:0x01d2, B:108:0x01d4, B:110:0x01da, B:111:0x01df, B:113:0x01e1, B:115:0x01ef, B:116:0x0201, B:118:0x020f, B:119:0x0221, B:121:0x022f, B:122:0x0241, B:124:0x024f, B:125:0x0261, B:127:0x026f, B:128:0x027d, B:130:0x028b, B:131:0x028d, B:133:0x0291, B:135:0x0295, B:137:0x029b, B:140:0x02a3, B:144:0x02da, B:150:0x02ea, B:225:0x044f, B:226:0x0454, B:228:0x0456, B:230:0x047f, B:232:0x048b, B:234:0x04c3, B:267:0x057f, B:274:0x05b2, B:275:0x05ca, B:276:0x05f3, B:278:0x05fd, B:279:0x0600, B:280:0x0625, B:283:0x0628, B:285:0x0656, B:286:0x0668, B:268:0x0586, B:269:0x058d, B:270:0x0596, B:271:0x059d, B:272:0x05a3, B:273:0x05ac, B:233:0x04c0, B:288:0x066a, B:289:0x066f, B:152:0x02f8, B:154:0x02fc, B:186:0x035a, B:187:0x0364, B:198:0x03cb, B:200:0x03cf, B:202:0x03d3, B:207:0x03e1, B:208:0x03f0, B:215:0x0426, B:221:0x0436, B:218:0x042c, B:220:0x0434, B:211:0x041d, B:213:0x0423, B:188:0x0368, B:190:0x0379, B:191:0x0387, B:193:0x0390, B:194:0x0398, B:195:0x03ae, B:196:0x03bf, B:222:0x043b, B:223:0x0444, B:291:0x0671, B:292:0x0676, B:294:0x0678, B:295:0x067d), top: B:319:0x01a6, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:268:0x0586 A[Catch: all -> 0x01b1, TryCatch #0 {all -> 0x01b1, blocks: (B:91:0x01a6, B:93:0x01aa, B:94:0x01af, B:98:0x01b4, B:100:0x01bc, B:101:0x01c1, B:103:0x01c3, B:105:0x01cd, B:106:0x01d2, B:108:0x01d4, B:110:0x01da, B:111:0x01df, B:113:0x01e1, B:115:0x01ef, B:116:0x0201, B:118:0x020f, B:119:0x0221, B:121:0x022f, B:122:0x0241, B:124:0x024f, B:125:0x0261, B:127:0x026f, B:128:0x027d, B:130:0x028b, B:131:0x028d, B:133:0x0291, B:135:0x0295, B:137:0x029b, B:140:0x02a3, B:144:0x02da, B:150:0x02ea, B:225:0x044f, B:226:0x0454, B:228:0x0456, B:230:0x047f, B:232:0x048b, B:234:0x04c3, B:267:0x057f, B:274:0x05b2, B:275:0x05ca, B:276:0x05f3, B:278:0x05fd, B:279:0x0600, B:280:0x0625, B:283:0x0628, B:285:0x0656, B:286:0x0668, B:268:0x0586, B:269:0x058d, B:270:0x0596, B:271:0x059d, B:272:0x05a3, B:273:0x05ac, B:233:0x04c0, B:288:0x066a, B:289:0x066f, B:152:0x02f8, B:154:0x02fc, B:186:0x035a, B:187:0x0364, B:198:0x03cb, B:200:0x03cf, B:202:0x03d3, B:207:0x03e1, B:208:0x03f0, B:215:0x0426, B:221:0x0436, B:218:0x042c, B:220:0x0434, B:211:0x041d, B:213:0x0423, B:188:0x0368, B:190:0x0379, B:191:0x0387, B:193:0x0390, B:194:0x0398, B:195:0x03ae, B:196:0x03bf, B:222:0x043b, B:223:0x0444, B:291:0x0671, B:292:0x0676, B:294:0x0678, B:295:0x067d), top: B:319:0x01a6, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:269:0x058d A[Catch: all -> 0x01b1, TryCatch #0 {all -> 0x01b1, blocks: (B:91:0x01a6, B:93:0x01aa, B:94:0x01af, B:98:0x01b4, B:100:0x01bc, B:101:0x01c1, B:103:0x01c3, B:105:0x01cd, B:106:0x01d2, B:108:0x01d4, B:110:0x01da, B:111:0x01df, B:113:0x01e1, B:115:0x01ef, B:116:0x0201, B:118:0x020f, B:119:0x0221, B:121:0x022f, B:122:0x0241, B:124:0x024f, B:125:0x0261, B:127:0x026f, B:128:0x027d, B:130:0x028b, B:131:0x028d, B:133:0x0291, B:135:0x0295, B:137:0x029b, B:140:0x02a3, B:144:0x02da, B:150:0x02ea, B:225:0x044f, B:226:0x0454, B:228:0x0456, B:230:0x047f, B:232:0x048b, B:234:0x04c3, B:267:0x057f, B:274:0x05b2, B:275:0x05ca, B:276:0x05f3, B:278:0x05fd, B:279:0x0600, B:280:0x0625, B:283:0x0628, B:285:0x0656, B:286:0x0668, B:268:0x0586, B:269:0x058d, B:270:0x0596, B:271:0x059d, B:272:0x05a3, B:273:0x05ac, B:233:0x04c0, B:288:0x066a, B:289:0x066f, B:152:0x02f8, B:154:0x02fc, B:186:0x035a, B:187:0x0364, B:198:0x03cb, B:200:0x03cf, B:202:0x03d3, B:207:0x03e1, B:208:0x03f0, B:215:0x0426, B:221:0x0436, B:218:0x042c, B:220:0x0434, B:211:0x041d, B:213:0x0423, B:188:0x0368, B:190:0x0379, B:191:0x0387, B:193:0x0390, B:194:0x0398, B:195:0x03ae, B:196:0x03bf, B:222:0x043b, B:223:0x0444, B:291:0x0671, B:292:0x0676, B:294:0x0678, B:295:0x067d), top: B:319:0x01a6, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:270:0x0596 A[Catch: all -> 0x01b1, TryCatch #0 {all -> 0x01b1, blocks: (B:91:0x01a6, B:93:0x01aa, B:94:0x01af, B:98:0x01b4, B:100:0x01bc, B:101:0x01c1, B:103:0x01c3, B:105:0x01cd, B:106:0x01d2, B:108:0x01d4, B:110:0x01da, B:111:0x01df, B:113:0x01e1, B:115:0x01ef, B:116:0x0201, B:118:0x020f, B:119:0x0221, B:121:0x022f, B:122:0x0241, B:124:0x024f, B:125:0x0261, B:127:0x026f, B:128:0x027d, B:130:0x028b, B:131:0x028d, B:133:0x0291, B:135:0x0295, B:137:0x029b, B:140:0x02a3, B:144:0x02da, B:150:0x02ea, B:225:0x044f, B:226:0x0454, B:228:0x0456, B:230:0x047f, B:232:0x048b, B:234:0x04c3, B:267:0x057f, B:274:0x05b2, B:275:0x05ca, B:276:0x05f3, B:278:0x05fd, B:279:0x0600, B:280:0x0625, B:283:0x0628, B:285:0x0656, B:286:0x0668, B:268:0x0586, B:269:0x058d, B:270:0x0596, B:271:0x059d, B:272:0x05a3, B:273:0x05ac, B:233:0x04c0, B:288:0x066a, B:289:0x066f, B:152:0x02f8, B:154:0x02fc, B:186:0x035a, B:187:0x0364, B:198:0x03cb, B:200:0x03cf, B:202:0x03d3, B:207:0x03e1, B:208:0x03f0, B:215:0x0426, B:221:0x0436, B:218:0x042c, B:220:0x0434, B:211:0x041d, B:213:0x0423, B:188:0x0368, B:190:0x0379, B:191:0x0387, B:193:0x0390, B:194:0x0398, B:195:0x03ae, B:196:0x03bf, B:222:0x043b, B:223:0x0444, B:291:0x0671, B:292:0x0676, B:294:0x0678, B:295:0x067d), top: B:319:0x01a6, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:271:0x059d A[Catch: all -> 0x01b1, TryCatch #0 {all -> 0x01b1, blocks: (B:91:0x01a6, B:93:0x01aa, B:94:0x01af, B:98:0x01b4, B:100:0x01bc, B:101:0x01c1, B:103:0x01c3, B:105:0x01cd, B:106:0x01d2, B:108:0x01d4, B:110:0x01da, B:111:0x01df, B:113:0x01e1, B:115:0x01ef, B:116:0x0201, B:118:0x020f, B:119:0x0221, B:121:0x022f, B:122:0x0241, B:124:0x024f, B:125:0x0261, B:127:0x026f, B:128:0x027d, B:130:0x028b, B:131:0x028d, B:133:0x0291, B:135:0x0295, B:137:0x029b, B:140:0x02a3, B:144:0x02da, B:150:0x02ea, B:225:0x044f, B:226:0x0454, B:228:0x0456, B:230:0x047f, B:232:0x048b, B:234:0x04c3, B:267:0x057f, B:274:0x05b2, B:275:0x05ca, B:276:0x05f3, B:278:0x05fd, B:279:0x0600, B:280:0x0625, B:283:0x0628, B:285:0x0656, B:286:0x0668, B:268:0x0586, B:269:0x058d, B:270:0x0596, B:271:0x059d, B:272:0x05a3, B:273:0x05ac, B:233:0x04c0, B:288:0x066a, B:289:0x066f, B:152:0x02f8, B:154:0x02fc, B:186:0x035a, B:187:0x0364, B:198:0x03cb, B:200:0x03cf, B:202:0x03d3, B:207:0x03e1, B:208:0x03f0, B:215:0x0426, B:221:0x0436, B:218:0x042c, B:220:0x0434, B:211:0x041d, B:213:0x0423, B:188:0x0368, B:190:0x0379, B:191:0x0387, B:193:0x0390, B:194:0x0398, B:195:0x03ae, B:196:0x03bf, B:222:0x043b, B:223:0x0444, B:291:0x0671, B:292:0x0676, B:294:0x0678, B:295:0x067d), top: B:319:0x01a6, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:272:0x05a3 A[Catch: all -> 0x01b1, TryCatch #0 {all -> 0x01b1, blocks: (B:91:0x01a6, B:93:0x01aa, B:94:0x01af, B:98:0x01b4, B:100:0x01bc, B:101:0x01c1, B:103:0x01c3, B:105:0x01cd, B:106:0x01d2, B:108:0x01d4, B:110:0x01da, B:111:0x01df, B:113:0x01e1, B:115:0x01ef, B:116:0x0201, B:118:0x020f, B:119:0x0221, B:121:0x022f, B:122:0x0241, B:124:0x024f, B:125:0x0261, B:127:0x026f, B:128:0x027d, B:130:0x028b, B:131:0x028d, B:133:0x0291, B:135:0x0295, B:137:0x029b, B:140:0x02a3, B:144:0x02da, B:150:0x02ea, B:225:0x044f, B:226:0x0454, B:228:0x0456, B:230:0x047f, B:232:0x048b, B:234:0x04c3, B:267:0x057f, B:274:0x05b2, B:275:0x05ca, B:276:0x05f3, B:278:0x05fd, B:279:0x0600, B:280:0x0625, B:283:0x0628, B:285:0x0656, B:286:0x0668, B:268:0x0586, B:269:0x058d, B:270:0x0596, B:271:0x059d, B:272:0x05a3, B:273:0x05ac, B:233:0x04c0, B:288:0x066a, B:289:0x066f, B:152:0x02f8, B:154:0x02fc, B:186:0x035a, B:187:0x0364, B:198:0x03cb, B:200:0x03cf, B:202:0x03d3, B:207:0x03e1, B:208:0x03f0, B:215:0x0426, B:221:0x0436, B:218:0x042c, B:220:0x0434, B:211:0x041d, B:213:0x0423, B:188:0x0368, B:190:0x0379, B:191:0x0387, B:193:0x0390, B:194:0x0398, B:195:0x03ae, B:196:0x03bf, B:222:0x043b, B:223:0x0444, B:291:0x0671, B:292:0x0676, B:294:0x0678, B:295:0x067d), top: B:319:0x01a6, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:273:0x05ac A[Catch: all -> 0x01b1, TryCatch #0 {all -> 0x01b1, blocks: (B:91:0x01a6, B:93:0x01aa, B:94:0x01af, B:98:0x01b4, B:100:0x01bc, B:101:0x01c1, B:103:0x01c3, B:105:0x01cd, B:106:0x01d2, B:108:0x01d4, B:110:0x01da, B:111:0x01df, B:113:0x01e1, B:115:0x01ef, B:116:0x0201, B:118:0x020f, B:119:0x0221, B:121:0x022f, B:122:0x0241, B:124:0x024f, B:125:0x0261, B:127:0x026f, B:128:0x027d, B:130:0x028b, B:131:0x028d, B:133:0x0291, B:135:0x0295, B:137:0x029b, B:140:0x02a3, B:144:0x02da, B:150:0x02ea, B:225:0x044f, B:226:0x0454, B:228:0x0456, B:230:0x047f, B:232:0x048b, B:234:0x04c3, B:267:0x057f, B:274:0x05b2, B:275:0x05ca, B:276:0x05f3, B:278:0x05fd, B:279:0x0600, B:280:0x0625, B:283:0x0628, B:285:0x0656, B:286:0x0668, B:268:0x0586, B:269:0x058d, B:270:0x0596, B:271:0x059d, B:272:0x05a3, B:273:0x05ac, B:233:0x04c0, B:288:0x066a, B:289:0x066f, B:152:0x02f8, B:154:0x02fc, B:186:0x035a, B:187:0x0364, B:198:0x03cb, B:200:0x03cf, B:202:0x03d3, B:207:0x03e1, B:208:0x03f0, B:215:0x0426, B:221:0x0436, B:218:0x042c, B:220:0x0434, B:211:0x041d, B:213:0x0423, B:188:0x0368, B:190:0x0379, B:191:0x0387, B:193:0x0390, B:194:0x0398, B:195:0x03ae, B:196:0x03bf, B:222:0x043b, B:223:0x0444, B:291:0x0671, B:292:0x0676, B:294:0x0678, B:295:0x067d), top: B:319:0x01a6, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:278:0x05fd A[Catch: all -> 0x01b1, TryCatch #0 {all -> 0x01b1, blocks: (B:91:0x01a6, B:93:0x01aa, B:94:0x01af, B:98:0x01b4, B:100:0x01bc, B:101:0x01c1, B:103:0x01c3, B:105:0x01cd, B:106:0x01d2, B:108:0x01d4, B:110:0x01da, B:111:0x01df, B:113:0x01e1, B:115:0x01ef, B:116:0x0201, B:118:0x020f, B:119:0x0221, B:121:0x022f, B:122:0x0241, B:124:0x024f, B:125:0x0261, B:127:0x026f, B:128:0x027d, B:130:0x028b, B:131:0x028d, B:133:0x0291, B:135:0x0295, B:137:0x029b, B:140:0x02a3, B:144:0x02da, B:150:0x02ea, B:225:0x044f, B:226:0x0454, B:228:0x0456, B:230:0x047f, B:232:0x048b, B:234:0x04c3, B:267:0x057f, B:274:0x05b2, B:275:0x05ca, B:276:0x05f3, B:278:0x05fd, B:279:0x0600, B:280:0x0625, B:283:0x0628, B:285:0x0656, B:286:0x0668, B:268:0x0586, B:269:0x058d, B:270:0x0596, B:271:0x059d, B:272:0x05a3, B:273:0x05ac, B:233:0x04c0, B:288:0x066a, B:289:0x066f, B:152:0x02f8, B:154:0x02fc, B:186:0x035a, B:187:0x0364, B:198:0x03cb, B:200:0x03cf, B:202:0x03d3, B:207:0x03e1, B:208:0x03f0, B:215:0x0426, B:221:0x0436, B:218:0x042c, B:220:0x0434, B:211:0x041d, B:213:0x0423, B:188:0x0368, B:190:0x0379, B:191:0x0387, B:193:0x0390, B:194:0x0398, B:195:0x03ae, B:196:0x03bf, B:222:0x043b, B:223:0x0444, B:291:0x0671, B:292:0x0676, B:294:0x0678, B:295:0x067d), top: B:319:0x01a6, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:288:0x066a A[Catch: all -> 0x01b1, TryCatch #0 {all -> 0x01b1, blocks: (B:91:0x01a6, B:93:0x01aa, B:94:0x01af, B:98:0x01b4, B:100:0x01bc, B:101:0x01c1, B:103:0x01c3, B:105:0x01cd, B:106:0x01d2, B:108:0x01d4, B:110:0x01da, B:111:0x01df, B:113:0x01e1, B:115:0x01ef, B:116:0x0201, B:118:0x020f, B:119:0x0221, B:121:0x022f, B:122:0x0241, B:124:0x024f, B:125:0x0261, B:127:0x026f, B:128:0x027d, B:130:0x028b, B:131:0x028d, B:133:0x0291, B:135:0x0295, B:137:0x029b, B:140:0x02a3, B:144:0x02da, B:150:0x02ea, B:225:0x044f, B:226:0x0454, B:228:0x0456, B:230:0x047f, B:232:0x048b, B:234:0x04c3, B:267:0x057f, B:274:0x05b2, B:275:0x05ca, B:276:0x05f3, B:278:0x05fd, B:279:0x0600, B:280:0x0625, B:283:0x0628, B:285:0x0656, B:286:0x0668, B:268:0x0586, B:269:0x058d, B:270:0x0596, B:271:0x059d, B:272:0x05a3, B:273:0x05ac, B:233:0x04c0, B:288:0x066a, B:289:0x066f, B:152:0x02f8, B:154:0x02fc, B:186:0x035a, B:187:0x0364, B:198:0x03cb, B:200:0x03cf, B:202:0x03d3, B:207:0x03e1, B:208:0x03f0, B:215:0x0426, B:221:0x0436, B:218:0x042c, B:220:0x0434, B:211:0x041d, B:213:0x0423, B:188:0x0368, B:190:0x0379, B:191:0x0387, B:193:0x0390, B:194:0x0398, B:195:0x03ae, B:196:0x03bf, B:222:0x043b, B:223:0x0444, B:291:0x0671, B:292:0x0676, B:294:0x0678, B:295:0x067d), top: B:319:0x01a6, inners: #1 }] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzbpx
    /* JADX INFO: renamed from: a */
    public final void mo5095a(Object obj, Map map) {
        int i2;
        char c;
        int i3;
        int[] iArr;
        int iM3041r;
        int iM3041r2;
        ViewParent parent;
        ViewGroup viewGroup;
        PopupWindow popupWindow;
        byte b;
        RelativeLayout.LayoutParams layoutParams;
        String str;
        zzbyo zzbyoVar;
        int i4;
        byte b2;
        int iM395c;
        int i5;
        int iM395c2;
        int i6;
        zzclb zzclbVar = (zzclb) obj;
        int iIntValue = ((Integer) f9256d.get((String) map.get("a"))).intValue();
        if (iIntValue != 5) {
            if (iIntValue != 7) {
                com.google.android.gms.ads.internal.zzb zzbVar = this.f9257a;
                if (!zzbVar.m3246a()) {
                    zzbVar.m3247b(null);
                    return;
                }
                if (iIntValue == 1) {
                    zzbyh zzbyhVar = this.f9258b;
                    synchronized (zzbyhVar.f9521k) {
                        try {
                            Activity activity = zzbyhVar.f9523m;
                            if (activity == null) {
                                zzbyhVar.m5262b("Not an activity context. Cannot resize.");
                                return;
                            }
                            zzclb zzclbVar2 = zzbyhVar.f9522l;
                            if (zzclbVar2.mo5609p() == null) {
                                zzbyhVar.m5262b("Webview is not yet available, size is not set.");
                                return;
                            }
                            if (zzclbVar2.mo5609p().m5677b()) {
                                zzbyhVar.m5262b("Is interstitial. Cannot resize an interstitial.");
                                return;
                            }
                            if (zzclbVar2.mo5614s0()) {
                                zzbyhVar.m5262b("Cannot resize an expanded banner.");
                                return;
                            }
                            if (!TextUtils.isEmpty((CharSequence) map.get("width"))) {
                                com.google.android.gms.ads.internal.util.zzs zzsVar = com.google.android.gms.ads.internal.zzt.f3698C.f3703c;
                                zzbyhVar.f9520j = com.google.android.gms.ads.internal.util.zzs.m3215n((String) map.get("width"));
                            }
                            if (!TextUtils.isEmpty((CharSequence) map.get("height"))) {
                                com.google.android.gms.ads.internal.util.zzs zzsVar2 = com.google.android.gms.ads.internal.zzt.f3698C.f3703c;
                                zzbyhVar.f9517g = com.google.android.gms.ads.internal.util.zzs.m3215n((String) map.get("height"));
                            }
                            if (!TextUtils.isEmpty((CharSequence) map.get("offsetX"))) {
                                com.google.android.gms.ads.internal.util.zzs zzsVar3 = com.google.android.gms.ads.internal.zzt.f3698C.f3703c;
                                zzbyhVar.f9518h = com.google.android.gms.ads.internal.util.zzs.m3215n((String) map.get("offsetX"));
                            }
                            if (!TextUtils.isEmpty((CharSequence) map.get("offsetY"))) {
                                com.google.android.gms.ads.internal.util.zzs zzsVar4 = com.google.android.gms.ads.internal.zzt.f3698C.f3703c;
                                zzbyhVar.f9519i = com.google.android.gms.ads.internal.util.zzs.m3215n((String) map.get("offsetY"));
                            }
                            if (!TextUtils.isEmpty((CharSequence) map.get("allowOffscreen"))) {
                                zzbyhVar.f9514d = Boolean.parseBoolean((String) map.get("allowOffscreen"));
                            }
                            String str2 = (String) map.get("customClosePosition");
                            if (!TextUtils.isEmpty(str2)) {
                                zzbyhVar.f9513c = str2;
                            }
                            if (zzbyhVar.f9520j < 0 || zzbyhVar.f9517g < 0) {
                                zzbyhVar.m5262b("Invalid width and height options. Cannot resize.");
                                return;
                            }
                            Window window = activity.getWindow();
                            if (window != null && window.getDecorView() != null) {
                                com.google.android.gms.ads.internal.util.zzs zzsVar5 = com.google.android.gms.ads.internal.zzt.f3698C.f3703c;
                                int[] iArrM3217p = com.google.android.gms.ads.internal.util.zzs.m3217p(activity);
                                com.google.android.gms.ads.internal.client.zzay zzayVar = com.google.android.gms.ads.internal.client.zzay.f3085g;
                                int[] iArr2 = {zzayVar.f3086a.m3046i(activity, iArrM3217p[0]), zzayVar.f3086a.m3046i(activity, iArrM3217p[1])};
                                int[] iArrM3218q = com.google.android.gms.ads.internal.util.zzs.m3218q(activity);
                                int i7 = iArr2[0];
                                int i8 = iArr2[1];
                                int i9 = zzbyhVar.f9520j;
                                if (i9 < 50 || i9 > i7) {
                                    c = 1;
                                    i3 = 50;
                                    int i10 = com.google.android.gms.ads.internal.util.zze.f3574b;
                                    com.google.android.gms.ads.internal.util.client.zzo.m3073f("Width is too small or too large.");
                                } else {
                                    int i11 = zzbyhVar.f9517g;
                                    if (i11 < 50 || i11 > i8) {
                                        c = 1;
                                        i3 = 50;
                                        int i12 = com.google.android.gms.ads.internal.util.zze.f3574b;
                                        com.google.android.gms.ads.internal.util.client.zzo.m3073f("Height is too small or too large.");
                                    } else {
                                        if (i11 != i8 || i9 != i7) {
                                            boolean z = zzbyhVar.f9514d;
                                            if (z) {
                                                i3 = 50;
                                                switch (zzbyhVar.f9513c) {
                                                    case "center":
                                                        b2 = 2;
                                                        break;
                                                    case "top-left":
                                                        b2 = 0;
                                                        break;
                                                    case "bottom-left":
                                                        b2 = 3;
                                                        break;
                                                    case "bottom-right":
                                                        b2 = 5;
                                                        break;
                                                    case "bottom-center":
                                                        b2 = 4;
                                                        break;
                                                    case "top-center":
                                                        b2 = 1;
                                                        break;
                                                    default:
                                                        b2 = -1;
                                                        break;
                                                }
                                                if (b2 == 0) {
                                                    c = 1;
                                                    iM395c = zzbyhVar.f9515e + zzbyhVar.f9518h;
                                                    i5 = zzbyhVar.f9516f;
                                                } else {
                                                    if (b2 != 1) {
                                                        c = 1;
                                                        if (b2 != 2) {
                                                            if (b2 == 3) {
                                                                iM395c = zzbyhVar.f9515e + zzbyhVar.f9518h;
                                                                i6 = zzbyhVar.f9516f;
                                                            } else if (b2 == 4) {
                                                                iM395c = AbstractC0271e0.m395c(zzbyhVar.f9515e, zzbyhVar.f9518h, i9 >> 1, -25);
                                                                i6 = zzbyhVar.f9516f;
                                                            } else if (b2 != 5) {
                                                                iM395c = AbstractC0271e0.m395c(zzbyhVar.f9515e, zzbyhVar.f9518h, i9, -50);
                                                                i5 = zzbyhVar.f9516f;
                                                            } else {
                                                                iM395c = AbstractC0271e0.m395c(zzbyhVar.f9515e, zzbyhVar.f9518h, i9, -50);
                                                                iM395c2 = AbstractC0271e0.m395c(zzbyhVar.f9516f, zzbyhVar.f9519i, i11, -50);
                                                            }
                                                            iM395c2 = AbstractC0271e0.m395c(i6, zzbyhVar.f9519i, i11, -50);
                                                        } else {
                                                            iM395c = AbstractC0271e0.m395c(zzbyhVar.f9515e, zzbyhVar.f9518h, i9 >> 1, -25);
                                                            iM395c2 = ((zzbyhVar.f9516f + zzbyhVar.f9519i) + (i11 >> 1)) - 25;
                                                        }
                                                        if (iM395c >= 0 || iM395c + 50 > i7 || iM395c2 < iArrM3218q[0] || iM395c2 + 50 > iArrM3218q[c]) {
                                                        }
                                                        if (iArr == null) {
                                                            zzbyhVar.m5262b("Resize location out of screen or close button is not visible.");
                                                            return;
                                                        }
                                                        com.google.android.gms.ads.internal.util.client.zzf zzfVar = zzayVar.f3086a;
                                                        iM3041r = com.google.android.gms.ads.internal.util.client.zzf.m3041r(activity.getResources().getDisplayMetrics(), zzbyhVar.f9520j);
                                                        iM3041r2 = com.google.android.gms.ads.internal.util.client.zzf.m3041r(activity.getResources().getDisplayMetrics(), zzbyhVar.f9517g);
                                                        parent = ((View) zzclbVar2).getParent();
                                                        if (!(parent instanceof ViewGroup)) {
                                                            zzbyhVar.m5262b("Webview is detached, probably in the middle of a resize or expand.");
                                                            return;
                                                        }
                                                        viewGroup = (ViewGroup) parent;
                                                        viewGroup.removeView((View) zzclbVar2);
                                                        popupWindow = zzbyhVar.f9528r;
                                                        if (popupWindow == null) {
                                                            zzbyhVar.f9530t = viewGroup;
                                                            ((View) zzclbVar2).setDrawingCacheEnabled(c);
                                                            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(((View) zzclbVar2).getDrawingCache());
                                                            ((View) zzclbVar2).setDrawingCacheEnabled(false);
                                                            ImageView imageView = new ImageView(activity);
                                                            zzbyhVar.f9525o = imageView;
                                                            imageView.setImageBitmap(bitmapCreateBitmap);
                                                            zzbyhVar.f9524n = zzclbVar2.mo5609p();
                                                            zzbyhVar.f9530t.addView(zzbyhVar.f9525o);
                                                        } else {
                                                            popupWindow.dismiss();
                                                        }
                                                        RelativeLayout relativeLayout = new RelativeLayout(activity);
                                                        zzbyhVar.f9529s = relativeLayout;
                                                        relativeLayout.setBackgroundColor(0);
                                                        zzbyhVar.f9529s.setLayoutParams(new ViewGroup.LayoutParams(iM3041r, iM3041r2));
                                                        PopupWindow popupWindow2 = new PopupWindow((View) zzbyhVar.f9529s, iM3041r, iM3041r2, false);
                                                        zzbyhVar.f9528r = popupWindow2;
                                                        popupWindow2.setOutsideTouchable(false);
                                                        zzbyhVar.f9528r.setTouchable(true);
                                                        zzbyhVar.f9528r.setClippingEnabled(!zzbyhVar.f9514d);
                                                        b = -1;
                                                        zzbyhVar.f9529s.addView((View) zzclbVar2, -1, -1);
                                                        zzbyhVar.f9526p = new LinearLayout(activity);
                                                        int i13 = i3;
                                                        layoutParams = new RelativeLayout.LayoutParams(com.google.android.gms.ads.internal.util.client.zzf.m3041r(activity.getResources().getDisplayMetrics(), i13), com.google.android.gms.ads.internal.util.client.zzf.m3041r(activity.getResources().getDisplayMetrics(), i13));
                                                        str = zzbyhVar.f9513c;
                                                        switch (str.hashCode()) {
                                                            case -1364013995:
                                                                if (str.equals("center")) {
                                                                    b = 2;
                                                                }
                                                                break;
                                                            case -1012429441:
                                                                if (str.equals("top-left")) {
                                                                    b = 0;
                                                                }
                                                                break;
                                                            case -655373719:
                                                                if (str.equals("bottom-left")) {
                                                                    b = 3;
                                                                }
                                                                break;
                                                            case 1163912186:
                                                                if (str.equals("bottom-right")) {
                                                                    b = 5;
                                                                }
                                                                break;
                                                            case 1288627767:
                                                                if (str.equals("bottom-center")) {
                                                                    b = 4;
                                                                }
                                                                break;
                                                            case 1755462605:
                                                                if (str.equals("top-center")) {
                                                                    b = 1;
                                                                }
                                                                break;
                                                        }
                                                        if (b == 0) {
                                                            layoutParams.addRule(10);
                                                            layoutParams.addRule(9);
                                                        } else if (b == 1) {
                                                            layoutParams.addRule(10);
                                                            layoutParams.addRule(14);
                                                        } else if (b == 2) {
                                                            layoutParams.addRule(13);
                                                        } else if (b == 3) {
                                                            layoutParams.addRule(12);
                                                            layoutParams.addRule(9);
                                                        } else if (b == 4) {
                                                            layoutParams.addRule(12);
                                                            layoutParams.addRule(14);
                                                        } else if (b != 5) {
                                                            layoutParams.addRule(10);
                                                            layoutParams.addRule(11);
                                                        } else {
                                                            layoutParams.addRule(12);
                                                            layoutParams.addRule(11);
                                                        }
                                                        zzbyhVar.f9526p.setOnClickListener(new zzbyf(zzbyhVar));
                                                        zzbyhVar.f9526p.setContentDescription("Close button");
                                                        zzbyhVar.f9529s.addView(zzbyhVar.f9526p, layoutParams);
                                                        try {
                                                            zzbyhVar.f9528r.showAtLocation(window.getDecorView(), 0, com.google.android.gms.ads.internal.util.client.zzf.m3041r(activity.getResources().getDisplayMetrics(), iArr[0]), com.google.android.gms.ads.internal.util.client.zzf.m3041r(activity.getResources().getDisplayMetrics(), iArr[1]));
                                                            int i14 = iArr[0];
                                                            int i15 = iArr[1];
                                                            zzbyoVar = zzbyhVar.f9527q;
                                                            if (zzbyoVar != null) {
                                                                zzbyoVar.zza();
                                                            }
                                                            zzbyhVar.f9522l.mo5602h0(new zzcnl(1, iM3041r, iM3041r2));
                                                            zzbyhVar.m5263c(iArr[0], iArr[1] - com.google.android.gms.ads.internal.util.zzs.m3218q(zzbyhVar.f9523m)[0], zzbyhVar.f9520j, zzbyhVar.f9517g);
                                                            zzbyhVar.m5264d("resized");
                                                            return;
                                                        } catch (RuntimeException e) {
                                                            String message = e.getMessage();
                                                            StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 26);
                                                            sb.append("Cannot show popup window: ");
                                                            sb.append(message);
                                                            zzbyhVar.m5262b(sb.toString());
                                                            RelativeLayout relativeLayout2 = zzbyhVar.f9529s;
                                                            zzclb zzclbVar3 = zzbyhVar.f9522l;
                                                            relativeLayout2.removeView((View) zzclbVar3);
                                                            ViewGroup viewGroup2 = zzbyhVar.f9530t;
                                                            if (viewGroup2 != null) {
                                                                viewGroup2.removeView(zzbyhVar.f9525o);
                                                                zzbyhVar.f9530t.addView((View) zzclbVar3);
                                                                zzclbVar3.mo5602h0(zzbyhVar.f9524n);
                                                            }
                                                            return;
                                                        }
                                                    }
                                                    c = 1;
                                                    iM395c = AbstractC0271e0.m395c(zzbyhVar.f9515e, zzbyhVar.f9518h, i9 >> 1, -25);
                                                    i5 = zzbyhVar.f9516f;
                                                }
                                                iM395c2 = i5 + zzbyhVar.f9519i;
                                                if (iM395c >= 0) {
                                                }
                                            } else {
                                                c = 1;
                                                i3 = 50;
                                            }
                                            if (z) {
                                                iArr = new int[]{zzbyhVar.f9515e + zzbyhVar.f9518h, zzbyhVar.f9516f + zzbyhVar.f9519i};
                                            } else {
                                                int[] iArrM3217p2 = com.google.android.gms.ads.internal.util.zzs.m3217p(activity);
                                                int[] iArr3 = {zzayVar.f3086a.m3046i(activity, iArrM3217p2[0]), zzayVar.f3086a.m3046i(activity, iArrM3217p2[c])};
                                                int[] iArrM3218q2 = com.google.android.gms.ads.internal.util.zzs.m3218q(activity);
                                                int i16 = iArr3[0];
                                                int i17 = zzbyhVar.f9515e + zzbyhVar.f9518h;
                                                int i18 = zzbyhVar.f9516f + zzbyhVar.f9519i;
                                                if (i17 < 0) {
                                                    i4 = 0;
                                                } else {
                                                    int i19 = zzbyhVar.f9520j;
                                                    i4 = i17 + i19 > i16 ? i16 - i19 : i17;
                                                }
                                                int i20 = iArrM3218q2[0];
                                                if (i18 < i20) {
                                                    i18 = i20;
                                                } else {
                                                    int i21 = zzbyhVar.f9517g;
                                                    int i22 = i18 + i21;
                                                    int i23 = iArrM3218q2[c];
                                                    if (i22 > i23) {
                                                        i18 = i23 - i21;
                                                    }
                                                }
                                                iArr = new int[]{i4, i18};
                                            }
                                            if (iArr == null) {
                                                zzbyhVar.m5262b("Resize location out of screen or close button is not visible.");
                                                return;
                                            }
                                            com.google.android.gms.ads.internal.util.client.zzf zzfVar2 = zzayVar.f3086a;
                                            iM3041r = com.google.android.gms.ads.internal.util.client.zzf.m3041r(activity.getResources().getDisplayMetrics(), zzbyhVar.f9520j);
                                            iM3041r2 = com.google.android.gms.ads.internal.util.client.zzf.m3041r(activity.getResources().getDisplayMetrics(), zzbyhVar.f9517g);
                                            parent = ((View) zzclbVar2).getParent();
                                            if (!(parent instanceof ViewGroup)) {
                                                zzbyhVar.m5262b("Webview is detached, probably in the middle of a resize or expand.");
                                                return;
                                            }
                                            viewGroup = (ViewGroup) parent;
                                            viewGroup.removeView((View) zzclbVar2);
                                            popupWindow = zzbyhVar.f9528r;
                                            if (popupWindow == null) {
                                                zzbyhVar.f9530t = viewGroup;
                                                ((View) zzclbVar2).setDrawingCacheEnabled(c);
                                                Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(((View) zzclbVar2).getDrawingCache());
                                                ((View) zzclbVar2).setDrawingCacheEnabled(false);
                                                ImageView imageView2 = new ImageView(activity);
                                                zzbyhVar.f9525o = imageView2;
                                                imageView2.setImageBitmap(bitmapCreateBitmap2);
                                                zzbyhVar.f9524n = zzclbVar2.mo5609p();
                                                zzbyhVar.f9530t.addView(zzbyhVar.f9525o);
                                            } else {
                                                popupWindow.dismiss();
                                            }
                                            RelativeLayout relativeLayout3 = new RelativeLayout(activity);
                                            zzbyhVar.f9529s = relativeLayout3;
                                            relativeLayout3.setBackgroundColor(0);
                                            zzbyhVar.f9529s.setLayoutParams(new ViewGroup.LayoutParams(iM3041r, iM3041r2));
                                            PopupWindow popupWindow3 = new PopupWindow((View) zzbyhVar.f9529s, iM3041r, iM3041r2, false);
                                            zzbyhVar.f9528r = popupWindow3;
                                            popupWindow3.setOutsideTouchable(false);
                                            zzbyhVar.f9528r.setTouchable(true);
                                            zzbyhVar.f9528r.setClippingEnabled(!zzbyhVar.f9514d);
                                            b = -1;
                                            zzbyhVar.f9529s.addView((View) zzclbVar2, -1, -1);
                                            zzbyhVar.f9526p = new LinearLayout(activity);
                                            int i110 = i3;
                                            layoutParams = new RelativeLayout.LayoutParams(com.google.android.gms.ads.internal.util.client.zzf.m3041r(activity.getResources().getDisplayMetrics(), i110), com.google.android.gms.ads.internal.util.client.zzf.m3041r(activity.getResources().getDisplayMetrics(), i110));
                                            str = zzbyhVar.f9513c;
                                            switch (str.hashCode()) {
                                                case -1364013995:
                                                    if (str.equals("center")) {
                                                        b = 2;
                                                    }
                                                    break;
                                                case -1012429441:
                                                    if (str.equals("top-left")) {
                                                        b = 0;
                                                    }
                                                    break;
                                                case -655373719:
                                                    if (str.equals("bottom-left")) {
                                                        b = 3;
                                                    }
                                                    break;
                                                case 1163912186:
                                                    if (str.equals("bottom-right")) {
                                                        b = 5;
                                                    }
                                                    break;
                                                case 1288627767:
                                                    if (str.equals("bottom-center")) {
                                                        b = 4;
                                                    }
                                                    break;
                                                case 1755462605:
                                                    if (str.equals("top-center")) {
                                                        b = 1;
                                                    }
                                                    break;
                                            }
                                            if (b == 0) {
                                                layoutParams.addRule(10);
                                                layoutParams.addRule(9);
                                            } else if (b == 1) {
                                                layoutParams.addRule(10);
                                                layoutParams.addRule(14);
                                            } else if (b == 2) {
                                                layoutParams.addRule(13);
                                            } else if (b == 3) {
                                                layoutParams.addRule(12);
                                                layoutParams.addRule(9);
                                            } else if (b == 4) {
                                                layoutParams.addRule(12);
                                                layoutParams.addRule(14);
                                            } else if (b != 5) {
                                                layoutParams.addRule(10);
                                                layoutParams.addRule(11);
                                            } else {
                                                layoutParams.addRule(12);
                                                layoutParams.addRule(11);
                                            }
                                            zzbyhVar.f9526p.setOnClickListener(new zzbyf(zzbyhVar));
                                            zzbyhVar.f9526p.setContentDescription("Close button");
                                            zzbyhVar.f9529s.addView(zzbyhVar.f9526p, layoutParams);
                                            zzbyhVar.f9528r.showAtLocation(window.getDecorView(), 0, com.google.android.gms.ads.internal.util.client.zzf.m3041r(activity.getResources().getDisplayMetrics(), iArr[0]), com.google.android.gms.ads.internal.util.client.zzf.m3041r(activity.getResources().getDisplayMetrics(), iArr[1]));
                                            int i111 = iArr[0];
                                            int i112 = iArr[1];
                                            zzbyoVar = zzbyhVar.f9527q;
                                            if (zzbyoVar != null) {
                                                zzbyoVar.zza();
                                            }
                                            zzbyhVar.f9522l.mo5602h0(new zzcnl(1, iM3041r, iM3041r2));
                                            zzbyhVar.m5263c(iArr[0], iArr[1] - com.google.android.gms.ads.internal.util.zzs.m3218q(zzbyhVar.f9523m)[0], zzbyhVar.f9520j, zzbyhVar.f9517g);
                                            zzbyhVar.m5264d("resized");
                                            return;
                                        }
                                        int i24 = com.google.android.gms.ads.internal.util.zze.f3574b;
                                        com.google.android.gms.ads.internal.util.client.zzo.m3073f("Cannot resize to a full-screen ad.");
                                        c = 1;
                                        i3 = 50;
                                    }
                                }
                                iArr = null;
                                if (iArr == null) {
                                    zzbyhVar.m5262b("Resize location out of screen or close button is not visible.");
                                    return;
                                }
                                com.google.android.gms.ads.internal.util.client.zzf zzfVar3 = zzayVar.f3086a;
                                iM3041r = com.google.android.gms.ads.internal.util.client.zzf.m3041r(activity.getResources().getDisplayMetrics(), zzbyhVar.f9520j);
                                iM3041r2 = com.google.android.gms.ads.internal.util.client.zzf.m3041r(activity.getResources().getDisplayMetrics(), zzbyhVar.f9517g);
                                parent = ((View) zzclbVar2).getParent();
                                if (!(parent instanceof ViewGroup)) {
                                    zzbyhVar.m5262b("Webview is detached, probably in the middle of a resize or expand.");
                                    return;
                                }
                                viewGroup = (ViewGroup) parent;
                                viewGroup.removeView((View) zzclbVar2);
                                popupWindow = zzbyhVar.f9528r;
                                if (popupWindow == null) {
                                    zzbyhVar.f9530t = viewGroup;
                                    ((View) zzclbVar2).setDrawingCacheEnabled(c);
                                    Bitmap bitmapCreateBitmap3 = Bitmap.createBitmap(((View) zzclbVar2).getDrawingCache());
                                    ((View) zzclbVar2).setDrawingCacheEnabled(false);
                                    ImageView imageView3 = new ImageView(activity);
                                    zzbyhVar.f9525o = imageView3;
                                    imageView3.setImageBitmap(bitmapCreateBitmap3);
                                    zzbyhVar.f9524n = zzclbVar2.mo5609p();
                                    zzbyhVar.f9530t.addView(zzbyhVar.f9525o);
                                } else {
                                    popupWindow.dismiss();
                                }
                                RelativeLayout relativeLayout4 = new RelativeLayout(activity);
                                zzbyhVar.f9529s = relativeLayout4;
                                relativeLayout4.setBackgroundColor(0);
                                zzbyhVar.f9529s.setLayoutParams(new ViewGroup.LayoutParams(iM3041r, iM3041r2));
                                PopupWindow popupWindow4 = new PopupWindow((View) zzbyhVar.f9529s, iM3041r, iM3041r2, false);
                                zzbyhVar.f9528r = popupWindow4;
                                popupWindow4.setOutsideTouchable(false);
                                zzbyhVar.f9528r.setTouchable(true);
                                zzbyhVar.f9528r.setClippingEnabled(!zzbyhVar.f9514d);
                                b = -1;
                                zzbyhVar.f9529s.addView((View) zzclbVar2, -1, -1);
                                zzbyhVar.f9526p = new LinearLayout(activity);
                                int i113 = i3;
                                layoutParams = new RelativeLayout.LayoutParams(com.google.android.gms.ads.internal.util.client.zzf.m3041r(activity.getResources().getDisplayMetrics(), i113), com.google.android.gms.ads.internal.util.client.zzf.m3041r(activity.getResources().getDisplayMetrics(), i113));
                                str = zzbyhVar.f9513c;
                                switch (str.hashCode()) {
                                    case -1364013995:
                                        if (str.equals("center")) {
                                            b = 2;
                                        }
                                        break;
                                    case -1012429441:
                                        if (str.equals("top-left")) {
                                            b = 0;
                                        }
                                        break;
                                    case -655373719:
                                        if (str.equals("bottom-left")) {
                                            b = 3;
                                        }
                                        break;
                                    case 1163912186:
                                        if (str.equals("bottom-right")) {
                                            b = 5;
                                        }
                                        break;
                                    case 1288627767:
                                        if (str.equals("bottom-center")) {
                                            b = 4;
                                        }
                                        break;
                                    case 1755462605:
                                        if (str.equals("top-center")) {
                                            b = 1;
                                        }
                                        break;
                                }
                                if (b == 0) {
                                    layoutParams.addRule(10);
                                    layoutParams.addRule(9);
                                } else if (b == 1) {
                                    layoutParams.addRule(10);
                                    layoutParams.addRule(14);
                                } else if (b == 2) {
                                    layoutParams.addRule(13);
                                } else if (b == 3) {
                                    layoutParams.addRule(12);
                                    layoutParams.addRule(9);
                                } else if (b == 4) {
                                    layoutParams.addRule(12);
                                    layoutParams.addRule(14);
                                } else if (b != 5) {
                                    layoutParams.addRule(10);
                                    layoutParams.addRule(11);
                                } else {
                                    layoutParams.addRule(12);
                                    layoutParams.addRule(11);
                                }
                                zzbyhVar.f9526p.setOnClickListener(new zzbyf(zzbyhVar));
                                zzbyhVar.f9526p.setContentDescription("Close button");
                                zzbyhVar.f9529s.addView(zzbyhVar.f9526p, layoutParams);
                                zzbyhVar.f9528r.showAtLocation(window.getDecorView(), 0, com.google.android.gms.ads.internal.util.client.zzf.m3041r(activity.getResources().getDisplayMetrics(), iArr[0]), com.google.android.gms.ads.internal.util.client.zzf.m3041r(activity.getResources().getDisplayMetrics(), iArr[1]));
                                int i114 = iArr[0];
                                int i115 = iArr[1];
                                zzbyoVar = zzbyhVar.f9527q;
                                if (zzbyoVar != null) {
                                    zzbyoVar.zza();
                                }
                                zzbyhVar.f9522l.mo5602h0(new zzcnl(1, iM3041r, iM3041r2));
                                zzbyhVar.m5263c(iArr[0], iArr[1] - com.google.android.gms.ads.internal.util.zzs.m3218q(zzbyhVar.f9523m)[0], zzbyhVar.f9520j, zzbyhVar.f9517g);
                                zzbyhVar.m5264d("resized");
                                return;
                            }
                            zzbyhVar.m5262b("Activity context is not ready, cannot get window or decor view.");
                            return;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                if (iIntValue == 3) {
                    zzbyk zzbykVar = new zzbyk(zzclbVar, map);
                    Activity activity2 = zzbykVar.f9535c;
                    if (activity2 == null) {
                        zzbykVar.m5262b("Activity context is not available");
                        return;
                    }
                    com.google.android.gms.ads.internal.zzt zztVar = com.google.android.gms.ads.internal.zzt.f3698C;
                    com.google.android.gms.ads.internal.util.zzs zzsVar6 = zztVar.f3703c;
                    if (!new zzbie(activity2).m5007a()) {
                        zzbykVar.m5262b("Feature is not supported by the device.");
                        return;
                    }
                    String str3 = (String) map.get("iurl");
                    if (TextUtils.isEmpty(str3)) {
                        zzbykVar.m5262b("Image url cannot be empty.");
                        return;
                    }
                    if (!URLUtil.isValidUrl(str3)) {
                        zzbykVar.m5262b("Invalid image url: ".concat(String.valueOf(str3)));
                        return;
                    }
                    String lastPathSegment = Uri.parse(str3).getLastPathSegment();
                    if (TextUtils.isEmpty(lastPathSegment) || !lastPathSegment.matches("([^\\s]+(\\.(?i)(jpg|png|gif|bmp|webp))$)")) {
                        zzbykVar.m5262b("Image type not recognized: ".concat(String.valueOf(lastPathSegment)));
                        return;
                    }
                    Resources resourcesM5383c = zztVar.f3708h.m5383c();
                    AlertDialog.Builder builderM3212k = com.google.android.gms.ads.internal.util.zzs.m3212k(activity2);
                    builderM3212k.setTitle(resourcesM5383c != null ? resourcesM5383c.getString(R.string.s1) : "Save image");
                    builderM3212k.setMessage(resourcesM5383c != null ? resourcesM5383c.getString(R.string.s2) : "Allow Ad to store image in Picture gallery?");
                    builderM3212k.setPositiveButton(resourcesM5383c != null ? resourcesM5383c.getString(R.string.s3) : "Accept", new zzbyi(zzbykVar, str3, lastPathSegment));
                    builderM3212k.setNegativeButton(resourcesM5383c != null ? resourcesM5383c.getString(R.string.s4) : "Decline", new zzbyj(zzbykVar));
                    builderM3212k.create().show();
                    return;
                }
                if (iIntValue == 4) {
                    zzbye zzbyeVar = new zzbye(zzclbVar, map);
                    Activity activity3 = zzbyeVar.f9504d;
                    if (activity3 == null) {
                        zzbyeVar.m5262b("Activity context is not available.");
                        return;
                    }
                    com.google.android.gms.ads.internal.zzt zztVar2 = com.google.android.gms.ads.internal.zzt.f3698C;
                    com.google.android.gms.ads.internal.util.zzs zzsVar7 = zztVar2.f3703c;
                    if (!new zzbie(activity3).m5008b(new Intent("android.intent.action.INSERT").setType("vnd.android.cursor.dir/event"))) {
                        zzbyeVar.m5262b("This feature is not available on the device.");
                        return;
                    }
                    AlertDialog.Builder builderM3212k2 = com.google.android.gms.ads.internal.util.zzs.m3212k(activity3);
                    Resources resourcesM5383c2 = zztVar2.f3708h.m5383c();
                    builderM3212k2.setTitle(resourcesM5383c2 != null ? resourcesM5383c2.getString(R.string.s5) : "Create calendar event");
                    builderM3212k2.setMessage(resourcesM5383c2 != null ? resourcesM5383c2.getString(R.string.s6) : "Allow Ad to create a calendar event?");
                    builderM3212k2.setPositiveButton(resourcesM5383c2 != null ? resourcesM5383c2.getString(R.string.s3) : "Accept", new zzbyc(zzbyeVar));
                    builderM3212k2.setNegativeButton(resourcesM5383c2 != null ? resourcesM5383c2.getString(R.string.s4) : "Decline", new zzbyd(zzbyeVar));
                    builderM3212k2.create().show();
                    return;
                }
                if (iIntValue != 5) {
                    if (iIntValue == 6) {
                        this.f9258b.m5259f(true);
                        return;
                    } else if (iIntValue != 7) {
                        int i25 = com.google.android.gms.ads.internal.util.zze.f3574b;
                        com.google.android.gms.ads.internal.util.client.zzo.m3072e("Unknown MRAID command called.");
                        return;
                    }
                }
            }
            this.f9259c.zzc();
            return;
        }
        String str4 = (String) map.get("forceOrientation");
        boolean z2 = map.containsKey("allowOrientationChange") ? Boolean.parseBoolean((String) map.get("allowOrientationChange")) : true;
        if (zzclbVar == null) {
            int i26 = com.google.android.gms.ads.internal.util.zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3073f("AdWebView is null");
            return;
        }
        if ("portrait".equalsIgnoreCase(str4)) {
            i2 = 7;
        } else if ("landscape".equalsIgnoreCase(str4)) {
            i2 = 6;
        } else {
            i2 = z2 ? -1 : 14;
        }
        zzclbVar.mo5596c0(i2);
    }
}
