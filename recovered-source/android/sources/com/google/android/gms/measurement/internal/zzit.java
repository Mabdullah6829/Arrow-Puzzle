package com.google.android.gms.measurement.internal;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.internal.Preconditions;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
final class zzit implements Callable {
    final /* synthetic */ zzbh zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzjd zzc;

    public zzit(zzjd zzjdVar, zzbh zzbhVar, String str) {
        this.zza = zzbhVar;
        this.zzb = str;
        Objects.requireNonNull(zzjdVar);
        this.zzc = zzjdVar;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x03fe A[Catch: all -> 0x007b, TryCatch #3 {all -> 0x007b, blocks: (B:9:0x0057, B:11:0x0062, B:16:0x007e, B:18:0x0084, B:19:0x0096, B:21:0x00b8, B:22:0x00c6, B:24:0x00d0, B:25:0x00e1, B:27:0x00eb, B:28:0x00fc, B:30:0x0107, B:31:0x0116, B:33:0x013c, B:34:0x0146, B:36:0x016e, B:38:0x017e, B:40:0x0186, B:43:0x018d, B:44:0x0197, B:45:0x0198, B:47:0x01ae, B:49:0x01b4, B:51:0x01be, B:54:0x01c5, B:56:0x01d7, B:58:0x01dd, B:60:0x01e7, B:61:0x01ff, B:63:0x0203, B:65:0x0215, B:55:0x01ce, B:68:0x0235, B:69:0x0282, B:71:0x028a, B:73:0x0290, B:77:0x02af, B:79:0x02b9, B:80:0x02ca, B:81:0x02dc, B:83:0x02e2, B:90:0x02fa, B:93:0x031f, B:94:0x0326, B:96:0x032c, B:97:0x036f, B:99:0x03dd, B:100:0x03f1, B:102:0x03fe, B:105:0x044b, B:106:0x0497, B:108:0x049d, B:110:0x04ae, B:111:0x04b9, B:113:0x0548, B:114:0x0564, B:116:0x056c, B:117:0x0576, B:119:0x057e, B:122:0x0595, B:125:0x05af, B:126:0x05b9, B:121:0x058b, B:104:0x0432, B:92:0x02fe, B:132:0x0668), top: B:143:0x0057, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:104:0x0432 A[Catch: all -> 0x007b, TryCatch #3 {all -> 0x007b, blocks: (B:9:0x0057, B:11:0x0062, B:16:0x007e, B:18:0x0084, B:19:0x0096, B:21:0x00b8, B:22:0x00c6, B:24:0x00d0, B:25:0x00e1, B:27:0x00eb, B:28:0x00fc, B:30:0x0107, B:31:0x0116, B:33:0x013c, B:34:0x0146, B:36:0x016e, B:38:0x017e, B:40:0x0186, B:43:0x018d, B:44:0x0197, B:45:0x0198, B:47:0x01ae, B:49:0x01b4, B:51:0x01be, B:54:0x01c5, B:56:0x01d7, B:58:0x01dd, B:60:0x01e7, B:61:0x01ff, B:63:0x0203, B:65:0x0215, B:55:0x01ce, B:68:0x0235, B:69:0x0282, B:71:0x028a, B:73:0x0290, B:77:0x02af, B:79:0x02b9, B:80:0x02ca, B:81:0x02dc, B:83:0x02e2, B:90:0x02fa, B:93:0x031f, B:94:0x0326, B:96:0x032c, B:97:0x036f, B:99:0x03dd, B:100:0x03f1, B:102:0x03fe, B:105:0x044b, B:106:0x0497, B:108:0x049d, B:110:0x04ae, B:111:0x04b9, B:113:0x0548, B:114:0x0564, B:116:0x056c, B:117:0x0576, B:119:0x057e, B:122:0x0595, B:125:0x05af, B:126:0x05b9, B:121:0x058b, B:104:0x0432, B:92:0x02fe, B:132:0x0668), top: B:143:0x0057, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:108:0x049d A[Catch: all -> 0x007b, TryCatch #3 {all -> 0x007b, blocks: (B:9:0x0057, B:11:0x0062, B:16:0x007e, B:18:0x0084, B:19:0x0096, B:21:0x00b8, B:22:0x00c6, B:24:0x00d0, B:25:0x00e1, B:27:0x00eb, B:28:0x00fc, B:30:0x0107, B:31:0x0116, B:33:0x013c, B:34:0x0146, B:36:0x016e, B:38:0x017e, B:40:0x0186, B:43:0x018d, B:44:0x0197, B:45:0x0198, B:47:0x01ae, B:49:0x01b4, B:51:0x01be, B:54:0x01c5, B:56:0x01d7, B:58:0x01dd, B:60:0x01e7, B:61:0x01ff, B:63:0x0203, B:65:0x0215, B:55:0x01ce, B:68:0x0235, B:69:0x0282, B:71:0x028a, B:73:0x0290, B:77:0x02af, B:79:0x02b9, B:80:0x02ca, B:81:0x02dc, B:83:0x02e2, B:90:0x02fa, B:93:0x031f, B:94:0x0326, B:96:0x032c, B:97:0x036f, B:99:0x03dd, B:100:0x03f1, B:102:0x03fe, B:105:0x044b, B:106:0x0497, B:108:0x049d, B:110:0x04ae, B:111:0x04b9, B:113:0x0548, B:114:0x0564, B:116:0x056c, B:117:0x0576, B:119:0x057e, B:122:0x0595, B:125:0x05af, B:126:0x05b9, B:121:0x058b, B:104:0x0432, B:92:0x02fe, B:132:0x0668), top: B:143:0x0057, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:113:0x0548 A[Catch: all -> 0x007b, TryCatch #3 {all -> 0x007b, blocks: (B:9:0x0057, B:11:0x0062, B:16:0x007e, B:18:0x0084, B:19:0x0096, B:21:0x00b8, B:22:0x00c6, B:24:0x00d0, B:25:0x00e1, B:27:0x00eb, B:28:0x00fc, B:30:0x0107, B:31:0x0116, B:33:0x013c, B:34:0x0146, B:36:0x016e, B:38:0x017e, B:40:0x0186, B:43:0x018d, B:44:0x0197, B:45:0x0198, B:47:0x01ae, B:49:0x01b4, B:51:0x01be, B:54:0x01c5, B:56:0x01d7, B:58:0x01dd, B:60:0x01e7, B:61:0x01ff, B:63:0x0203, B:65:0x0215, B:55:0x01ce, B:68:0x0235, B:69:0x0282, B:71:0x028a, B:73:0x0290, B:77:0x02af, B:79:0x02b9, B:80:0x02ca, B:81:0x02dc, B:83:0x02e2, B:90:0x02fa, B:93:0x031f, B:94:0x0326, B:96:0x032c, B:97:0x036f, B:99:0x03dd, B:100:0x03f1, B:102:0x03fe, B:105:0x044b, B:106:0x0497, B:108:0x049d, B:110:0x04ae, B:111:0x04b9, B:113:0x0548, B:114:0x0564, B:116:0x056c, B:117:0x0576, B:119:0x057e, B:122:0x0595, B:125:0x05af, B:126:0x05b9, B:121:0x058b, B:104:0x0432, B:92:0x02fe, B:132:0x0668), top: B:143:0x0057, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:116:0x056c A[Catch: all -> 0x007b, TryCatch #3 {all -> 0x007b, blocks: (B:9:0x0057, B:11:0x0062, B:16:0x007e, B:18:0x0084, B:19:0x0096, B:21:0x00b8, B:22:0x00c6, B:24:0x00d0, B:25:0x00e1, B:27:0x00eb, B:28:0x00fc, B:30:0x0107, B:31:0x0116, B:33:0x013c, B:34:0x0146, B:36:0x016e, B:38:0x017e, B:40:0x0186, B:43:0x018d, B:44:0x0197, B:45:0x0198, B:47:0x01ae, B:49:0x01b4, B:51:0x01be, B:54:0x01c5, B:56:0x01d7, B:58:0x01dd, B:60:0x01e7, B:61:0x01ff, B:63:0x0203, B:65:0x0215, B:55:0x01ce, B:68:0x0235, B:69:0x0282, B:71:0x028a, B:73:0x0290, B:77:0x02af, B:79:0x02b9, B:80:0x02ca, B:81:0x02dc, B:83:0x02e2, B:90:0x02fa, B:93:0x031f, B:94:0x0326, B:96:0x032c, B:97:0x036f, B:99:0x03dd, B:100:0x03f1, B:102:0x03fe, B:105:0x044b, B:106:0x0497, B:108:0x049d, B:110:0x04ae, B:111:0x04b9, B:113:0x0548, B:114:0x0564, B:116:0x056c, B:117:0x0576, B:119:0x057e, B:122:0x0595, B:125:0x05af, B:126:0x05b9, B:121:0x058b, B:104:0x0432, B:92:0x02fe, B:132:0x0668), top: B:143:0x0057, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:119:0x057e A[Catch: all -> 0x007b, TryCatch #3 {all -> 0x007b, blocks: (B:9:0x0057, B:11:0x0062, B:16:0x007e, B:18:0x0084, B:19:0x0096, B:21:0x00b8, B:22:0x00c6, B:24:0x00d0, B:25:0x00e1, B:27:0x00eb, B:28:0x00fc, B:30:0x0107, B:31:0x0116, B:33:0x013c, B:34:0x0146, B:36:0x016e, B:38:0x017e, B:40:0x0186, B:43:0x018d, B:44:0x0197, B:45:0x0198, B:47:0x01ae, B:49:0x01b4, B:51:0x01be, B:54:0x01c5, B:56:0x01d7, B:58:0x01dd, B:60:0x01e7, B:61:0x01ff, B:63:0x0203, B:65:0x0215, B:55:0x01ce, B:68:0x0235, B:69:0x0282, B:71:0x028a, B:73:0x0290, B:77:0x02af, B:79:0x02b9, B:80:0x02ca, B:81:0x02dc, B:83:0x02e2, B:90:0x02fa, B:93:0x031f, B:94:0x0326, B:96:0x032c, B:97:0x036f, B:99:0x03dd, B:100:0x03f1, B:102:0x03fe, B:105:0x044b, B:106:0x0497, B:108:0x049d, B:110:0x04ae, B:111:0x04b9, B:113:0x0548, B:114:0x0564, B:116:0x056c, B:117:0x0576, B:119:0x057e, B:122:0x0595, B:125:0x05af, B:126:0x05b9, B:121:0x058b, B:104:0x0432, B:92:0x02fe, B:132:0x0668), top: B:143:0x0057, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:120:0x0589 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:121:0x058b A[Catch: all -> 0x007b, TryCatch #3 {all -> 0x007b, blocks: (B:9:0x0057, B:11:0x0062, B:16:0x007e, B:18:0x0084, B:19:0x0096, B:21:0x00b8, B:22:0x00c6, B:24:0x00d0, B:25:0x00e1, B:27:0x00eb, B:28:0x00fc, B:30:0x0107, B:31:0x0116, B:33:0x013c, B:34:0x0146, B:36:0x016e, B:38:0x017e, B:40:0x0186, B:43:0x018d, B:44:0x0197, B:45:0x0198, B:47:0x01ae, B:49:0x01b4, B:51:0x01be, B:54:0x01c5, B:56:0x01d7, B:58:0x01dd, B:60:0x01e7, B:61:0x01ff, B:63:0x0203, B:65:0x0215, B:55:0x01ce, B:68:0x0235, B:69:0x0282, B:71:0x028a, B:73:0x0290, B:77:0x02af, B:79:0x02b9, B:80:0x02ca, B:81:0x02dc, B:83:0x02e2, B:90:0x02fa, B:93:0x031f, B:94:0x0326, B:96:0x032c, B:97:0x036f, B:99:0x03dd, B:100:0x03f1, B:102:0x03fe, B:105:0x044b, B:106:0x0497, B:108:0x049d, B:110:0x04ae, B:111:0x04b9, B:113:0x0548, B:114:0x0564, B:116:0x056c, B:117:0x0576, B:119:0x057e, B:122:0x0595, B:125:0x05af, B:126:0x05b9, B:121:0x058b, B:104:0x0432, B:92:0x02fe, B:132:0x0668), top: B:143:0x0057, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:124:0x05ad A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:144:0x02f5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:148:0x04ae A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:150:0x0497 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x0235 A[Catch: all -> 0x007b, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x007b, blocks: (B:9:0x0057, B:11:0x0062, B:16:0x007e, B:18:0x0084, B:19:0x0096, B:21:0x00b8, B:22:0x00c6, B:24:0x00d0, B:25:0x00e1, B:27:0x00eb, B:28:0x00fc, B:30:0x0107, B:31:0x0116, B:33:0x013c, B:34:0x0146, B:36:0x016e, B:38:0x017e, B:40:0x0186, B:43:0x018d, B:44:0x0197, B:45:0x0198, B:47:0x01ae, B:49:0x01b4, B:51:0x01be, B:54:0x01c5, B:56:0x01d7, B:58:0x01dd, B:60:0x01e7, B:61:0x01ff, B:63:0x0203, B:65:0x0215, B:55:0x01ce, B:68:0x0235, B:69:0x0282, B:71:0x028a, B:73:0x0290, B:77:0x02af, B:79:0x02b9, B:80:0x02ca, B:81:0x02dc, B:83:0x02e2, B:90:0x02fa, B:93:0x031f, B:94:0x0326, B:96:0x032c, B:97:0x036f, B:99:0x03dd, B:100:0x03f1, B:102:0x03fe, B:105:0x044b, B:106:0x0497, B:108:0x049d, B:110:0x04ae, B:111:0x04b9, B:113:0x0548, B:114:0x0564, B:116:0x056c, B:117:0x0576, B:119:0x057e, B:122:0x0595, B:125:0x05af, B:126:0x05b9, B:121:0x058b, B:104:0x0432, B:92:0x02fe, B:132:0x0668), top: B:143:0x0057, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x028a A[Catch: all -> 0x007b, SecurityException -> 0x02ac, TryCatch #2 {SecurityException -> 0x02ac, blocks: (B:69:0x0282, B:71:0x028a, B:73:0x0290), top: B:141:0x0282, outer: #3 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x02b9 A[Catch: all -> 0x007b, TryCatch #3 {all -> 0x007b, blocks: (B:9:0x0057, B:11:0x0062, B:16:0x007e, B:18:0x0084, B:19:0x0096, B:21:0x00b8, B:22:0x00c6, B:24:0x00d0, B:25:0x00e1, B:27:0x00eb, B:28:0x00fc, B:30:0x0107, B:31:0x0116, B:33:0x013c, B:34:0x0146, B:36:0x016e, B:38:0x017e, B:40:0x0186, B:43:0x018d, B:44:0x0197, B:45:0x0198, B:47:0x01ae, B:49:0x01b4, B:51:0x01be, B:54:0x01c5, B:56:0x01d7, B:58:0x01dd, B:60:0x01e7, B:61:0x01ff, B:63:0x0203, B:65:0x0215, B:55:0x01ce, B:68:0x0235, B:69:0x0282, B:71:0x028a, B:73:0x0290, B:77:0x02af, B:79:0x02b9, B:80:0x02ca, B:81:0x02dc, B:83:0x02e2, B:90:0x02fa, B:93:0x031f, B:94:0x0326, B:96:0x032c, B:97:0x036f, B:99:0x03dd, B:100:0x03f1, B:102:0x03fe, B:105:0x044b, B:106:0x0497, B:108:0x049d, B:110:0x04ae, B:111:0x04b9, B:113:0x0548, B:114:0x0564, B:116:0x056c, B:117:0x0576, B:119:0x057e, B:122:0x0595, B:125:0x05af, B:126:0x05b9, B:121:0x058b, B:104:0x0432, B:92:0x02fe, B:132:0x0668), top: B:143:0x0057, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:83:0x02e2 A[Catch: all -> 0x007b, TryCatch #3 {all -> 0x007b, blocks: (B:9:0x0057, B:11:0x0062, B:16:0x007e, B:18:0x0084, B:19:0x0096, B:21:0x00b8, B:22:0x00c6, B:24:0x00d0, B:25:0x00e1, B:27:0x00eb, B:28:0x00fc, B:30:0x0107, B:31:0x0116, B:33:0x013c, B:34:0x0146, B:36:0x016e, B:38:0x017e, B:40:0x0186, B:43:0x018d, B:44:0x0197, B:45:0x0198, B:47:0x01ae, B:49:0x01b4, B:51:0x01be, B:54:0x01c5, B:56:0x01d7, B:58:0x01dd, B:60:0x01e7, B:61:0x01ff, B:63:0x0203, B:65:0x0215, B:55:0x01ce, B:68:0x0235, B:69:0x0282, B:71:0x028a, B:73:0x0290, B:77:0x02af, B:79:0x02b9, B:80:0x02ca, B:81:0x02dc, B:83:0x02e2, B:90:0x02fa, B:93:0x031f, B:94:0x0326, B:96:0x032c, B:97:0x036f, B:99:0x03dd, B:100:0x03f1, B:102:0x03fe, B:105:0x044b, B:106:0x0497, B:108:0x049d, B:110:0x04ae, B:111:0x04b9, B:113:0x0548, B:114:0x0564, B:116:0x056c, B:117:0x0576, B:119:0x057e, B:122:0x0595, B:125:0x05af, B:126:0x05b9, B:121:0x058b, B:104:0x0432, B:92:0x02fe, B:132:0x0668), top: B:143:0x0057, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:90:0x02fa A[Catch: all -> 0x007b, TryCatch #3 {all -> 0x007b, blocks: (B:9:0x0057, B:11:0x0062, B:16:0x007e, B:18:0x0084, B:19:0x0096, B:21:0x00b8, B:22:0x00c6, B:24:0x00d0, B:25:0x00e1, B:27:0x00eb, B:28:0x00fc, B:30:0x0107, B:31:0x0116, B:33:0x013c, B:34:0x0146, B:36:0x016e, B:38:0x017e, B:40:0x0186, B:43:0x018d, B:44:0x0197, B:45:0x0198, B:47:0x01ae, B:49:0x01b4, B:51:0x01be, B:54:0x01c5, B:56:0x01d7, B:58:0x01dd, B:60:0x01e7, B:61:0x01ff, B:63:0x0203, B:65:0x0215, B:55:0x01ce, B:68:0x0235, B:69:0x0282, B:71:0x028a, B:73:0x0290, B:77:0x02af, B:79:0x02b9, B:80:0x02ca, B:81:0x02dc, B:83:0x02e2, B:90:0x02fa, B:93:0x031f, B:94:0x0326, B:96:0x032c, B:97:0x036f, B:99:0x03dd, B:100:0x03f1, B:102:0x03fe, B:105:0x044b, B:106:0x0497, B:108:0x049d, B:110:0x04ae, B:111:0x04b9, B:113:0x0548, B:114:0x0564, B:116:0x056c, B:117:0x0576, B:119:0x057e, B:122:0x0595, B:125:0x05af, B:126:0x05b9, B:121:0x058b, B:104:0x0432, B:92:0x02fe, B:132:0x0668), top: B:143:0x0057, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:92:0x02fe A[Catch: all -> 0x007b, TryCatch #3 {all -> 0x007b, blocks: (B:9:0x0057, B:11:0x0062, B:16:0x007e, B:18:0x0084, B:19:0x0096, B:21:0x00b8, B:22:0x00c6, B:24:0x00d0, B:25:0x00e1, B:27:0x00eb, B:28:0x00fc, B:30:0x0107, B:31:0x0116, B:33:0x013c, B:34:0x0146, B:36:0x016e, B:38:0x017e, B:40:0x0186, B:43:0x018d, B:44:0x0197, B:45:0x0198, B:47:0x01ae, B:49:0x01b4, B:51:0x01be, B:54:0x01c5, B:56:0x01d7, B:58:0x01dd, B:60:0x01e7, B:61:0x01ff, B:63:0x0203, B:65:0x0215, B:55:0x01ce, B:68:0x0235, B:69:0x0282, B:71:0x028a, B:73:0x0290, B:77:0x02af, B:79:0x02b9, B:80:0x02ca, B:81:0x02dc, B:83:0x02e2, B:90:0x02fa, B:93:0x031f, B:94:0x0326, B:96:0x032c, B:97:0x036f, B:99:0x03dd, B:100:0x03f1, B:102:0x03fe, B:105:0x044b, B:106:0x0497, B:108:0x049d, B:110:0x04ae, B:111:0x04b9, B:113:0x0548, B:114:0x0564, B:116:0x056c, B:117:0x0576, B:119:0x057e, B:122:0x0595, B:125:0x05af, B:126:0x05b9, B:121:0x058b, B:104:0x0432, B:92:0x02fe, B:132:0x0668), top: B:143:0x0057, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:96:0x032c A[Catch: all -> 0x007b, LOOP:1: B:94:0x0326->B:96:0x032c, LOOP_END, TryCatch #3 {all -> 0x007b, blocks: (B:9:0x0057, B:11:0x0062, B:16:0x007e, B:18:0x0084, B:19:0x0096, B:21:0x00b8, B:22:0x00c6, B:24:0x00d0, B:25:0x00e1, B:27:0x00eb, B:28:0x00fc, B:30:0x0107, B:31:0x0116, B:33:0x013c, B:34:0x0146, B:36:0x016e, B:38:0x017e, B:40:0x0186, B:43:0x018d, B:44:0x0197, B:45:0x0198, B:47:0x01ae, B:49:0x01b4, B:51:0x01be, B:54:0x01c5, B:56:0x01d7, B:58:0x01dd, B:60:0x01e7, B:61:0x01ff, B:63:0x0203, B:65:0x0215, B:55:0x01ce, B:68:0x0235, B:69:0x0282, B:71:0x028a, B:73:0x0290, B:77:0x02af, B:79:0x02b9, B:80:0x02ca, B:81:0x02dc, B:83:0x02e2, B:90:0x02fa, B:93:0x031f, B:94:0x0326, B:96:0x032c, B:97:0x036f, B:99:0x03dd, B:100:0x03f1, B:102:0x03fe, B:105:0x044b, B:106:0x0497, B:108:0x049d, B:110:0x04ae, B:111:0x04b9, B:113:0x0548, B:114:0x0564, B:116:0x056c, B:117:0x0576, B:119:0x057e, B:122:0x0595, B:125:0x05af, B:126:0x05b9, B:121:0x058b, B:104:0x0432, B:92:0x02fe, B:132:0x0668), top: B:143:0x0057, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:99:0x03dd A[Catch: all -> 0x007b, TryCatch #3 {all -> 0x007b, blocks: (B:9:0x0057, B:11:0x0062, B:16:0x007e, B:18:0x0084, B:19:0x0096, B:21:0x00b8, B:22:0x00c6, B:24:0x00d0, B:25:0x00e1, B:27:0x00eb, B:28:0x00fc, B:30:0x0107, B:31:0x0116, B:33:0x013c, B:34:0x0146, B:36:0x016e, B:38:0x017e, B:40:0x0186, B:43:0x018d, B:44:0x0197, B:45:0x0198, B:47:0x01ae, B:49:0x01b4, B:51:0x01be, B:54:0x01c5, B:56:0x01d7, B:58:0x01dd, B:60:0x01e7, B:61:0x01ff, B:63:0x0203, B:65:0x0215, B:55:0x01ce, B:68:0x0235, B:69:0x0282, B:71:0x028a, B:73:0x0290, B:77:0x02af, B:79:0x02b9, B:80:0x02ca, B:81:0x02dc, B:83:0x02e2, B:90:0x02fa, B:93:0x031f, B:94:0x0326, B:96:0x032c, B:97:0x036f, B:99:0x03dd, B:100:0x03f1, B:102:0x03fe, B:105:0x044b, B:106:0x0497, B:108:0x049d, B:110:0x04ae, B:111:0x04b9, B:113:0x0548, B:114:0x0564, B:116:0x056c, B:117:0x0576, B:119:0x057e, B:122:0x0595, B:125:0x05af, B:126:0x05b9, B:121:0x058b, B:104:0x0432, B:92:0x02fe, B:132:0x0668), top: B:143:0x0057, inners: #0, #2 }] */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        byte[] bArr;
        zzpg zzpgVar;
        String strZzc;
        zzpg zzpgVar2;
        List listZzn;
        Iterator it;
        zzpn zzpnVar;
        com.google.android.gms.internal.measurement.zziu[] zziuVarArr;
        int i2;
        zzpg zzpgVar3;
        zzic zzicVar;
        Bundle bundle;
        String str;
        zzbd zzbdVarZzf;
        zzpg zzpgVar4;
        com.google.android.gms.internal.measurement.zzhz zzhzVar;
        zzh zzhVar;
        Object obj;
        long j2;
        zzbd zzbdVarZza;
        com.google.android.gms.internal.measurement.zzhr zzhrVarM10121Q;
        zzbf zzbfVar;
        zzbe zzbeVar;
        long jZzp;
        long jZzn;
        String strZzh;
        com.google.android.gms.internal.measurement.zzhv zzhvVarM10154M;
        Object objZza;
        byte[] bArr2;
        zzjd zzjdVar = this.zzc;
        zzjdVar.zzL().zzaa();
        zzlp zzlpVarZzn = zzjdVar.zzL().zzn();
        zzlpVarZzn.zzg();
        zzic zzicVar2 = zzlpVarZzn.zzu;
        zzic.zzL();
        zzbh zzbhVar = this.zza;
        Preconditions.m3544h(zzbhVar);
        String str2 = this.zzb;
        Preconditions.m3541e(str2);
        String str3 = zzbhVar.zza;
        if (!"_iap".equals(str3) && !"_iapx".equals(str3)) {
            zzlpVarZzn.zzu.zzaW().zzj().zzc("Generating a payload for this event is not available. package_name, event_name", str2, str3);
            return null;
        }
        zzpg zzpgVar5 = zzlpVarZzn.zzg;
        com.google.android.gms.internal.measurement.zzhz zzhzVarM10181H = com.google.android.gms.internal.measurement.zzib.m10181H();
        zzpgVar5.zzj().zzb();
        try {
            zzh zzhVarZzu = zzpgVar5.zzj().zzu(str2);
            if (zzhVarZzu == null) {
                zzlpVarZzn.zzu.zzaW().zzj().zzb("Log and bundle not available. package_name", str2);
                bArr2 = new byte[0];
            } else {
                if (zzhVarZzu.zzD()) {
                    com.google.android.gms.internal.measurement.zzic zzicVarM10218f0 = com.google.android.gms.internal.measurement.zzid.m10218f0();
                    zzicVarM10218f0.m9552o();
                    ((com.google.android.gms.internal.measurement.zzid) zzicVarM10218f0.f22030t).m10319h0();
                    zzicVarM10218f0.m9552o();
                    ((com.google.android.gms.internal.measurement.zzid) zzicVarM10218f0.f22030t).m10373z0();
                    if (!TextUtils.isEmpty(zzhVarZzu.zzc())) {
                        String strZzc2 = zzhVarZzu.zzc();
                        zzicVarM10218f0.m9552o();
                        ((com.google.android.gms.internal.measurement.zzid) zzicVarM10218f0.f22030t).m10245H1(strZzc2);
                    }
                    if (!TextUtils.isEmpty(zzhVarZzu.zzv())) {
                        String strZzv = zzhVarZzu.zzv();
                        Preconditions.m3544h(strZzv);
                        zzicVarM10218f0.m9552o();
                        ((com.google.android.gms.internal.measurement.zzid) zzicVarM10218f0.f22030t).m10242G1(strZzv);
                    }
                    if (!TextUtils.isEmpty(zzhVarZzu.zzr())) {
                        String strZzr = zzhVarZzu.zzr();
                        Preconditions.m3544h(strZzr);
                        zzicVarM10218f0.m9552o();
                        ((com.google.android.gms.internal.measurement.zzid) zzicVarM10218f0.f22030t).m10248I1(strZzr);
                    }
                    if (zzhVarZzu.zzt() != -2147483648L) {
                        int iZzt = (int) zzhVarZzu.zzt();
                        zzicVarM10218f0.m9552o();
                        ((com.google.android.gms.internal.measurement.zzid) zzicVarM10218f0.f22030t).m10302a2(iZzt);
                    }
                    long jZzx = zzhVarZzu.zzx();
                    zzicVarM10218f0.m9552o();
                    ((com.google.android.gms.internal.measurement.zzid) zzicVarM10218f0.f22030t).m10251J1(jZzx);
                    long jZzB = zzhVarZzu.zzB();
                    zzicVarM10218f0.m9552o();
                    ((com.google.android.gms.internal.measurement.zzid) zzicVarM10218f0.f22030t).m10323i1(jZzB);
                    String strZzf = zzhVarZzu.zzf();
                    if (!TextUtils.isEmpty(strZzf)) {
                        zzicVarM10218f0.m9552o();
                        ((com.google.android.gms.internal.measurement.zzid) zzicVarM10218f0.f22030t).m10287V1(strZzf);
                    }
                    long jZzak = zzhVarZzu.zzak();
                    zzicVarM10218f0.m9552o();
                    ((com.google.android.gms.internal.measurement.zzid) zzicVarM10218f0.f22030t).m10344p1(jZzak);
                    zzjl zzjlVarZzB = zzlpVarZzn.zzg.zzB(str2);
                    long jZzz = zzhVarZzu.zzz();
                    zzicVarM10218f0.m9552o();
                    ((com.google.android.gms.internal.measurement.zzid) zzicVarM10218f0.f22030t).m10275R1(jZzz);
                    if (zzicVar2.zzB() && zzlpVarZzn.zzu.zzc().zzC(zzicVarM10218f0.m10214v()) && zzjlVarZzB.zzo(zzjk.AD_STORAGE) && !TextUtils.isEmpty(null)) {
                        zzicVarM10218f0.m9552o();
                        ((com.google.android.gms.internal.measurement.zzid) zzicVarM10218f0.f22030t).m10310d1(null);
                        throw null;
                    }
                    String strZzk = zzjlVarZzB.zzk();
                    zzicVarM10218f0.m9552o();
                    ((com.google.android.gms.internal.measurement.zzid) zzicVarM10218f0.f22030t).m10329k1(strZzk);
                    zzjk zzjkVar = zzjk.AD_STORAGE;
                    if (zzjlVarZzB.zzo(zzjkVar) && zzhVarZzu.zzac()) {
                        Pair pairZzd = (zzjlVarZzB.zzo(zzjkVar) && zzhVarZzu.zzac()) ? zzpgVar5.zzq().zzd(zzhVarZzu.zzc()) : new Pair("", Boolean.FALSE);
                        if (!zzhVarZzu.zzac() || TextUtils.isEmpty((CharSequence) pairZzd.first)) {
                            zzic zzicVar3 = zzlpVarZzn.zzu;
                            zzicVar3.zzu().zzw();
                            String str4 = Build.MODEL;
                            zzicVarM10218f0.m9552o();
                            ((com.google.android.gms.internal.measurement.zzid) zzicVarM10218f0.f22030t).m10230C1();
                            zzicVar3.zzu().zzw();
                            String str5 = Build.VERSION.RELEASE;
                            zzicVarM10218f0.m9552o();
                            ((com.google.android.gms.internal.measurement.zzid) zzicVarM10218f0.f22030t).m10221A0(str5);
                            int iZzb = (int) zzicVar3.zzu().zzb();
                            zzicVarM10218f0.m9552o();
                            ((com.google.android.gms.internal.measurement.zzid) zzicVarM10218f0.f22030t).m10239F1(iZzb);
                            String strZzc3 = zzicVar3.zzu().zzc();
                            zzicVarM10218f0.m9552o();
                            ((com.google.android.gms.internal.measurement.zzid) zzicVarM10218f0.f22030t).m10236E1(strZzc3);
                            if (zzjlVarZzB.zzo(zzjk.ANALYTICS_STORAGE)) {
                                String strZzd = zzhVarZzu.zzd();
                                Preconditions.m3544h(strZzd);
                                String strZzc4 = zzlp.zzc(strZzd, Long.toString(zzbhVar.zzd));
                                zzicVarM10218f0.m9552o();
                                ((com.google.android.gms.internal.measurement.zzid) zzicVarM10218f0.f22030t).m10269P1(strZzc4);
                            }
                            if (!TextUtils.isEmpty(zzhVarZzu.zzl())) {
                                String strZzl = zzhVarZzu.zzl();
                                Preconditions.m3544h(strZzl);
                                zzicVarM10218f0.m9552o();
                                ((com.google.android.gms.internal.measurement.zzid) zzicVarM10218f0.f22030t).m10299Z1(strZzl);
                            }
                            strZzc = zzhVarZzu.zzc();
                            zzpgVar2 = zzlpVarZzn.zzg;
                            listZzn = zzpgVar2.zzj().zzn(strZzc);
                            it = listZzn.iterator();
                            do {
                                if (!it.hasNext()) {
                                    zzpnVar = null;
                                    break;
                                }
                                zzpnVar = (zzpn) it.next();
                            } while (!"_lte".equals(zzpnVar.zzc));
                            if (zzpnVar != null) {
                                zzpn zzpnVar2 = new zzpn(strZzc, "auto", "_lte", zzlpVarZzn.zzu.zzba().currentTimeMillis(), 0L);
                                listZzn.add(zzpnVar2);
                                zzpgVar2.zzj().zzl(zzpnVar2);
                            } else {
                                zzpn zzpnVar3 = new zzpn(strZzc, "auto", "_lte", zzlpVarZzn.zzu.zzba().currentTimeMillis(), 0L);
                                listZzn.add(zzpnVar3);
                                zzpgVar2.zzj().zzl(zzpnVar3);
                            }
                            zziuVarArr = new com.google.android.gms.internal.measurement.zziu[listZzn.size()];
                            for (i2 = 0; i2 < listZzn.size(); i2++) {
                                com.google.android.gms.internal.measurement.zzit zzitVarM10418L = com.google.android.gms.internal.measurement.zziu.m10418L();
                                String str6 = ((zzpn) listZzn.get(i2)).zzc;
                                zzitVarM10418L.m9552o();
                                ((com.google.android.gms.internal.measurement.zziu) zzitVarM10418L.f22030t).m10431N(str6);
                                long j3 = ((zzpn) listZzn.get(i2)).zzd;
                                zzitVarM10418L.m9552o();
                                ((com.google.android.gms.internal.measurement.zziu) zzitVarM10418L.f22030t).m10430M(j3);
                                zzpgVar2.zzp().zzc(zzitVarM10418L, ((zzpn) listZzn.get(i2)).zze);
                                zziuVarArr[i2] = (com.google.android.gms.internal.measurement.zziu) zzitVarM10418L.m9555r();
                            }
                            List listAsList = Arrays.asList(zziuVarArr);
                            zzicVarM10218f0.m9552o();
                            ((com.google.android.gms.internal.measurement.zzid) zzicVarM10218f0.f22030t).m10343p0(listAsList);
                            zzpgVar3 = zzlpVarZzn.zzg;
                            zzpgVar3.zzI(zzhVarZzu, zzicVarM10218f0);
                            zzpgVar3.zzJ(zzhVarZzu, zzicVarM10218f0);
                            zzgv zzgvVarZza = zzgv.zza(zzbhVar);
                            zzicVar = zzlpVarZzn.zzu;
                            zzpp zzppVarZzk = zzicVar.zzk();
                            bundle = zzgvVarZza.zze;
                            zzppVarZzk.zzK(bundle, zzpgVar2.zzj().zzV(str2));
                            zzicVar.zzk().zzI(zzgvVarZza, zzicVar.zzc().zzd(str2));
                            bundle.putLong("_c", 1L);
                            zzicVar.zzaW().zzj().zza("Marking in-app purchase as real-time");
                            bundle.putLong("_r", 1L);
                            String str7 = zzbhVar.zzc;
                            bundle.putString("_o", str7);
                            if (zzicVar.zzk().zzad(zzicVarM10218f0.m10214v(), zzhVarZzu.zzay())) {
                                zzicVar.zzk().zzO(bundle, "_dbg", 1L);
                                zzicVar.zzk().zzO(bundle, "_r", 1L);
                            }
                            zzaw zzawVarZzj = zzpgVar2.zzj();
                            str = zzbhVar.zza;
                            zzbdVarZzf = zzawVarZzj.zzf(str2, str);
                            if (zzbdVarZzf == null) {
                                zzhzVar = zzhzVarM10181H;
                                zzhVar = zzhVarZzu;
                                obj = null;
                                zzbdVarZza = new zzbd(str2, str, 0L, 0L, 0L, zzbhVar.zzd, 0L, null, null, null, null);
                                zzpgVar4 = zzpgVar3;
                                j2 = 0;
                            } else {
                                zzpgVar4 = zzpgVar3;
                                zzhzVar = zzhzVarM10181H;
                                zzhVar = zzhVarZzu;
                                obj = null;
                                j2 = zzbdVarZzf.zzf;
                                zzbdVarZza = zzbdVarZzf.zza(zzbhVar.zzd);
                            }
                            zzbd zzbdVar = zzbdVarZza;
                            zzpgVar2.zzj().zzh(zzbdVar);
                            zzpg zzpgVar6 = zzpgVar4;
                            zzic zzicVar4 = zzlpVarZzn.zzu;
                            long j4 = zzbhVar.zzd;
                            com.google.android.gms.internal.measurement.zzhz zzhzVar2 = zzhzVar;
                            zzh zzhVar2 = zzhVar;
                            zzbc zzbcVar = new zzbc(zzicVar4, str7, str2, str, j4, 0L, j2, bundle);
                            zzhrVarM10121Q = com.google.android.gms.internal.measurement.zzhs.m10121Q();
                            long j5 = zzbcVar.zzd;
                            zzhrVarM10121Q.m9552o();
                            ((com.google.android.gms.internal.measurement.zzhs) zzhrVarM10121Q.f22030t).m10144X(j5);
                            zzhrVarM10121Q.m10108C(zzbcVar.zzb);
                            long j6 = zzbcVar.zzf;
                            zzhrVarM10121Q.m9552o();
                            ((com.google.android.gms.internal.measurement.zzhs) zzhrVarM10121Q.f22030t).m10145Y(j6);
                            zzbfVar = zzbcVar.zzg;
                            zzbeVar = new zzbe(zzbfVar);
                            while (zzbeVar.hasNext()) {
                                String next = zzbeVar.next();
                                zzhvVarM10154M = com.google.android.gms.internal.measurement.zzhw.m10154M();
                                zzhvVarM10154M.m10151u(next);
                                objZza = zzbfVar.zza(next);
                                if (objZza != null) {
                                    zzpgVar2.zzp().zzd(zzhvVarM10154M, objZza);
                                    zzhrVarM10121Q.m10120z(zzhvVarM10154M);
                                }
                            }
                            zzicVarM10218f0.m9552o();
                            ((com.google.android.gms.internal.measurement.zzid) zzicVarM10218f0.f22030t).m10325j0((com.google.android.gms.internal.measurement.zzhs) zzhrVarM10121Q.m9555r());
                            com.google.android.gms.internal.measurement.zzie zzieVarM10376A = com.google.android.gms.internal.measurement.zzig.m10376A();
                            com.google.android.gms.internal.measurement.zzht zzhtVarM10148A = com.google.android.gms.internal.measurement.zzhu.m10148A();
                            long j7 = zzbdVar.zzc;
                            zzhtVarM10148A.m9552o();
                            ((com.google.android.gms.internal.measurement.zzhu) zzhtVarM10148A.f22030t).m10150C(j7);
                            zzhtVarM10148A.m9552o();
                            ((com.google.android.gms.internal.measurement.zzhu) zzhtVarM10148A.f22030t).m10149B(str);
                            zzieVarM10376A.m9552o();
                            ((com.google.android.gms.internal.measurement.zzig) zzieVarM10376A.f22030t).m10377B((com.google.android.gms.internal.measurement.zzhu) zzhtVarM10148A.m9555r());
                            zzicVarM10218f0.m9552o();
                            ((com.google.android.gms.internal.measurement.zzid) zzicVarM10218f0.f22030t).m10317g1((com.google.android.gms.internal.measurement.zzig) zzieVarM10376A.m9555r());
                            List listZzb = zzpgVar2.zzm().zzb(zzhVar2.zzc(), Collections.EMPTY_LIST, Collections.unmodifiableList(((com.google.android.gms.internal.measurement.zzid) zzicVarM10218f0.f22030t).m10324i2()), Long.valueOf(zzhrVarM10121Q.m10109D()), Long.valueOf(zzhrVarM10121Q.m10109D()), false);
                            zzicVarM10218f0.m9552o();
                            ((com.google.android.gms.internal.measurement.zzid) zzicVarM10218f0.f22030t).m10293X1(listZzb);
                            if (((com.google.android.gms.internal.measurement.zzhs) zzhrVarM10121Q.f22030t).m10128G()) {
                                long jM10109D = zzhrVarM10121Q.m10109D();
                                zzicVarM10218f0.m9552o();
                                ((com.google.android.gms.internal.measurement.zzid) zzicVarM10218f0.f22030t).m10355t0(jM10109D);
                                long jM10109D2 = zzhrVarM10121Q.m10109D();
                                zzicVarM10218f0.m9552o();
                                ((com.google.android.gms.internal.measurement.zzid) zzicVarM10218f0.f22030t).m10358u0(jM10109D2);
                            }
                            jZzp = zzhVar2.zzp();
                            if (jZzp != 0) {
                                zzicVarM10218f0.m9552o();
                                ((com.google.android.gms.internal.measurement.zzid) zzicVarM10218f0.f22030t).m10367x0(jZzp);
                            }
                            jZzn = zzhVar2.zzn();
                            if (jZzn != 0) {
                                zzicVarM10218f0.m9552o();
                                ((com.google.android.gms.internal.measurement.zzid) zzicVarM10218f0.f22030t).m10361v0(jZzn);
                            } else if (jZzp != 0) {
                                zzicVarM10218f0.m9552o();
                                ((com.google.android.gms.internal.measurement.zzid) zzicVarM10218f0.f22030t).m10361v0(jZzp);
                            }
                            strZzh = zzhVar2.zzh();
                            if (zzicVar.zzc().zzp(str2, zzfy.zzaM)) {
                                zzicVarM10218f0.m9552o();
                                ((com.google.android.gms.internal.measurement.zzid) zzicVarM10218f0.f22030t).m10332l1(strZzh);
                            }
                            zzhVar2.zzL();
                            int iZzG = (int) zzhVar2.zzG();
                            zzicVarM10218f0.m9552o();
                            ((com.google.android.gms.internal.measurement.zzid) zzicVarM10218f0.f22030t).m10278S1(iZzG);
                            zzicVar.zzc().zzi();
                            zzicVarM10218f0.m9552o();
                            ((com.google.android.gms.internal.measurement.zzid) zzicVarM10218f0.f22030t).m10254K1();
                            long jCurrentTimeMillis = zzicVar.zzba().currentTimeMillis();
                            zzicVarM10218f0.m9552o();
                            ((com.google.android.gms.internal.measurement.zzid) zzicVarM10218f0.f22030t).m10349r0(jCurrentTimeMillis);
                            zzicVarM10218f0.m9552o();
                            ((com.google.android.gms.internal.measurement.zzid) zzicVarM10218f0.f22030t).m10290W1(true);
                            zzpgVar6.zzS(zzicVarM10218f0.m10214v(), zzicVarM10218f0);
                            zzhzVar2.m9552o();
                            ((com.google.android.gms.internal.measurement.zzib) zzhzVar2.f22030t).m10191K((com.google.android.gms.internal.measurement.zzid) zzicVarM10218f0.m9555r());
                            zzhVar2.zzo(((com.google.android.gms.internal.measurement.zzid) zzicVarM10218f0.f22030t).m10342o2());
                            zzhVar2.zzq(((com.google.android.gms.internal.measurement.zzid) zzicVarM10218f0.f22030t).m10348q2());
                            zzpgVar2.zzj().zzv(zzhVar2, false, false);
                            zzpgVar2.zzj().zzc();
                            zzpgVar2.zzj().zzd();
                            return zzpgVar2.zzp().zzv(((com.google.android.gms.internal.measurement.zzib) zzhzVar2.m9555r()).m9346i());
                        }
                        try {
                            String strZzc5 = zzlp.zzc((String) pairZzd.first, Long.toString(zzbhVar.zzd));
                            zzicVarM10218f0.m9552o();
                            ((com.google.android.gms.internal.measurement.zzid) zzicVarM10218f0.f22030t).m10257L1(strZzc5);
                            Object obj2 = pairZzd.second;
                            if (obj2 != null) {
                                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                                zzicVarM10218f0.m9552o();
                                ((com.google.android.gms.internal.measurement.zzid) zzicVarM10218f0.f22030t).m10263N1(zBooleanValue);
                            }
                            zzic zzicVar5 = zzlpVarZzn.zzu;
                            zzicVar5.zzu().zzw();
                            String str8 = Build.MODEL;
                            zzicVarM10218f0.m9552o();
                            ((com.google.android.gms.internal.measurement.zzid) zzicVarM10218f0.f22030t).m10230C1();
                            zzicVar5.zzu().zzw();
                            String str9 = Build.VERSION.RELEASE;
                            zzicVarM10218f0.m9552o();
                            ((com.google.android.gms.internal.measurement.zzid) zzicVarM10218f0.f22030t).m10221A0(str9);
                            int iZzb2 = (int) zzicVar5.zzu().zzb();
                            zzicVarM10218f0.m9552o();
                            ((com.google.android.gms.internal.measurement.zzid) zzicVarM10218f0.f22030t).m10239F1(iZzb2);
                            String strZzc6 = zzicVar5.zzu().zzc();
                            zzicVarM10218f0.m9552o();
                            ((com.google.android.gms.internal.measurement.zzid) zzicVarM10218f0.f22030t).m10236E1(strZzc6);
                            if (zzjlVarZzB.zzo(zzjk.ANALYTICS_STORAGE)) {
                                String strZzd2 = zzhVarZzu.zzd();
                                Preconditions.m3544h(strZzd2);
                                String strZzc7 = zzlp.zzc(strZzd2, Long.toString(zzbhVar.zzd));
                                zzicVarM10218f0.m9552o();
                                ((com.google.android.gms.internal.measurement.zzid) zzicVarM10218f0.f22030t).m10269P1(strZzc7);
                            }
                            if (!TextUtils.isEmpty(zzhVarZzu.zzl())) {
                                String strZzl2 = zzhVarZzu.zzl();
                                Preconditions.m3544h(strZzl2);
                                zzicVarM10218f0.m9552o();
                                ((com.google.android.gms.internal.measurement.zzid) zzicVarM10218f0.f22030t).m10299Z1(strZzl2);
                            }
                            strZzc = zzhVarZzu.zzc();
                            zzpgVar2 = zzlpVarZzn.zzg;
                            listZzn = zzpgVar2.zzj().zzn(strZzc);
                            it = listZzn.iterator();
                            do {
                                if (!it.hasNext()) {
                                    zzpnVar = null;
                                    break;
                                }
                                zzpnVar = (zzpn) it.next();
                            } while (!"_lte".equals(zzpnVar.zzc));
                            if (zzpnVar != null) {
                                zzpn zzpnVar4 = new zzpn(strZzc, "auto", "_lte", zzlpVarZzn.zzu.zzba().currentTimeMillis(), 0L);
                                listZzn.add(zzpnVar4);
                                zzpgVar2.zzj().zzl(zzpnVar4);
                            } else {
                                zzpn zzpnVar5 = new zzpn(strZzc, "auto", "_lte", zzlpVarZzn.zzu.zzba().currentTimeMillis(), 0L);
                                listZzn.add(zzpnVar5);
                                zzpgVar2.zzj().zzl(zzpnVar5);
                            }
                            zziuVarArr = new com.google.android.gms.internal.measurement.zziu[listZzn.size()];
                            while (i2 < listZzn.size()) {
                                com.google.android.gms.internal.measurement.zzit zzitVarM10418L2 = com.google.android.gms.internal.measurement.zziu.m10418L();
                                String str10 = ((zzpn) listZzn.get(i2)).zzc;
                                zzitVarM10418L2.m9552o();
                                ((com.google.android.gms.internal.measurement.zziu) zzitVarM10418L2.f22030t).m10431N(str10);
                                long j8 = ((zzpn) listZzn.get(i2)).zzd;
                                zzitVarM10418L2.m9552o();
                                ((com.google.android.gms.internal.measurement.zziu) zzitVarM10418L2.f22030t).m10430M(j8);
                                zzpgVar2.zzp().zzc(zzitVarM10418L2, ((zzpn) listZzn.get(i2)).zze);
                                zziuVarArr[i2] = (com.google.android.gms.internal.measurement.zziu) zzitVarM10418L2.m9555r();
                            }
                            List listAsList2 = Arrays.asList(zziuVarArr);
                            zzicVarM10218f0.m9552o();
                            ((com.google.android.gms.internal.measurement.zzid) zzicVarM10218f0.f22030t).m10343p0(listAsList2);
                            zzpgVar3 = zzlpVarZzn.zzg;
                            zzpgVar3.zzI(zzhVarZzu, zzicVarM10218f0);
                            zzpgVar3.zzJ(zzhVarZzu, zzicVarM10218f0);
                            zzgv zzgvVarZza2 = zzgv.zza(zzbhVar);
                            zzicVar = zzlpVarZzn.zzu;
                            zzpp zzppVarZzk2 = zzicVar.zzk();
                            bundle = zzgvVarZza2.zze;
                            zzppVarZzk2.zzK(bundle, zzpgVar2.zzj().zzV(str2));
                            zzicVar.zzk().zzI(zzgvVarZza2, zzicVar.zzc().zzd(str2));
                            bundle.putLong("_c", 1L);
                            zzicVar.zzaW().zzj().zza("Marking in-app purchase as real-time");
                            bundle.putLong("_r", 1L);
                            String str11 = zzbhVar.zzc;
                            bundle.putString("_o", str11);
                            if (zzicVar.zzk().zzad(zzicVarM10218f0.m10214v(), zzhVarZzu.zzay())) {
                                zzicVar.zzk().zzO(bundle, "_dbg", 1L);
                                zzicVar.zzk().zzO(bundle, "_r", 1L);
                            }
                            zzaw zzawVarZzj2 = zzpgVar2.zzj();
                            str = zzbhVar.zza;
                            zzbdVarZzf = zzawVarZzj2.zzf(str2, str);
                            if (zzbdVarZzf == null) {
                                zzhzVar = zzhzVarM10181H;
                                zzhVar = zzhVarZzu;
                                obj = null;
                                zzbdVarZza = new zzbd(str2, str, 0L, 0L, 0L, zzbhVar.zzd, 0L, null, null, null, null);
                                zzpgVar4 = zzpgVar3;
                                j2 = 0;
                            } else {
                                zzpgVar4 = zzpgVar3;
                                zzhzVar = zzhzVarM10181H;
                                zzhVar = zzhVarZzu;
                                obj = null;
                                j2 = zzbdVarZzf.zzf;
                                zzbdVarZza = zzbdVarZzf.zza(zzbhVar.zzd);
                            }
                            zzbd zzbdVar2 = zzbdVarZza;
                            zzpgVar2.zzj().zzh(zzbdVar2);
                            zzpg zzpgVar7 = zzpgVar4;
                            zzic zzicVar6 = zzlpVarZzn.zzu;
                            long j9 = zzbhVar.zzd;
                            com.google.android.gms.internal.measurement.zzhz zzhzVar3 = zzhzVar;
                            zzh zzhVar3 = zzhVar;
                            zzbc zzbcVar2 = new zzbc(zzicVar6, str11, str2, str, j9, 0L, j2, bundle);
                            zzhrVarM10121Q = com.google.android.gms.internal.measurement.zzhs.m10121Q();
                            long j10 = zzbcVar2.zzd;
                            zzhrVarM10121Q.m9552o();
                            ((com.google.android.gms.internal.measurement.zzhs) zzhrVarM10121Q.f22030t).m10144X(j10);
                            zzhrVarM10121Q.m10108C(zzbcVar2.zzb);
                            long j11 = zzbcVar2.zzf;
                            zzhrVarM10121Q.m9552o();
                            ((com.google.android.gms.internal.measurement.zzhs) zzhrVarM10121Q.f22030t).m10145Y(j11);
                            zzbfVar = zzbcVar2.zzg;
                            zzbeVar = new zzbe(zzbfVar);
                            while (zzbeVar.hasNext()) {
                                String next2 = zzbeVar.next();
                                zzhvVarM10154M = com.google.android.gms.internal.measurement.zzhw.m10154M();
                                zzhvVarM10154M.m10151u(next2);
                                objZza = zzbfVar.zza(next2);
                                if (objZza != null) {
                                    zzpgVar2.zzp().zzd(zzhvVarM10154M, objZza);
                                    zzhrVarM10121Q.m10120z(zzhvVarM10154M);
                                }
                            }
                            zzicVarM10218f0.m9552o();
                            ((com.google.android.gms.internal.measurement.zzid) zzicVarM10218f0.f22030t).m10325j0((com.google.android.gms.internal.measurement.zzhs) zzhrVarM10121Q.m9555r());
                            com.google.android.gms.internal.measurement.zzie zzieVarM10376A2 = com.google.android.gms.internal.measurement.zzig.m10376A();
                            com.google.android.gms.internal.measurement.zzht zzhtVarM10148A2 = com.google.android.gms.internal.measurement.zzhu.m10148A();
                            long j12 = zzbdVar2.zzc;
                            zzhtVarM10148A2.m9552o();
                            ((com.google.android.gms.internal.measurement.zzhu) zzhtVarM10148A2.f22030t).m10150C(j12);
                            zzhtVarM10148A2.m9552o();
                            ((com.google.android.gms.internal.measurement.zzhu) zzhtVarM10148A2.f22030t).m10149B(str);
                            zzieVarM10376A2.m9552o();
                            ((com.google.android.gms.internal.measurement.zzig) zzieVarM10376A2.f22030t).m10377B((com.google.android.gms.internal.measurement.zzhu) zzhtVarM10148A2.m9555r());
                            zzicVarM10218f0.m9552o();
                            ((com.google.android.gms.internal.measurement.zzid) zzicVarM10218f0.f22030t).m10317g1((com.google.android.gms.internal.measurement.zzig) zzieVarM10376A2.m9555r());
                            List listZzb2 = zzpgVar2.zzm().zzb(zzhVar3.zzc(), Collections.EMPTY_LIST, Collections.unmodifiableList(((com.google.android.gms.internal.measurement.zzid) zzicVarM10218f0.f22030t).m10324i2()), Long.valueOf(zzhrVarM10121Q.m10109D()), Long.valueOf(zzhrVarM10121Q.m10109D()), false);
                            zzicVarM10218f0.m9552o();
                            ((com.google.android.gms.internal.measurement.zzid) zzicVarM10218f0.f22030t).m10293X1(listZzb2);
                            if (((com.google.android.gms.internal.measurement.zzhs) zzhrVarM10121Q.f22030t).m10128G()) {
                                long jM10109D3 = zzhrVarM10121Q.m10109D();
                                zzicVarM10218f0.m9552o();
                                ((com.google.android.gms.internal.measurement.zzid) zzicVarM10218f0.f22030t).m10355t0(jM10109D3);
                                long jM10109D4 = zzhrVarM10121Q.m10109D();
                                zzicVarM10218f0.m9552o();
                                ((com.google.android.gms.internal.measurement.zzid) zzicVarM10218f0.f22030t).m10358u0(jM10109D4);
                            }
                            jZzp = zzhVar3.zzp();
                            if (jZzp != 0) {
                                zzicVarM10218f0.m9552o();
                                ((com.google.android.gms.internal.measurement.zzid) zzicVarM10218f0.f22030t).m10367x0(jZzp);
                            }
                            jZzn = zzhVar3.zzn();
                            if (jZzn != 0) {
                                zzicVarM10218f0.m9552o();
                                ((com.google.android.gms.internal.measurement.zzid) zzicVarM10218f0.f22030t).m10361v0(jZzn);
                            } else if (jZzp != 0) {
                                zzicVarM10218f0.m9552o();
                                ((com.google.android.gms.internal.measurement.zzid) zzicVarM10218f0.f22030t).m10361v0(jZzp);
                            }
                            strZzh = zzhVar3.zzh();
                            if (zzicVar.zzc().zzp(str2, zzfy.zzaM)) {
                                zzicVarM10218f0.m9552o();
                                ((com.google.android.gms.internal.measurement.zzid) zzicVarM10218f0.f22030t).m10332l1(strZzh);
                            }
                            zzhVar3.zzL();
                            int iZzG2 = (int) zzhVar3.zzG();
                            zzicVarM10218f0.m9552o();
                            ((com.google.android.gms.internal.measurement.zzid) zzicVarM10218f0.f22030t).m10278S1(iZzG2);
                            zzicVar.zzc().zzi();
                            zzicVarM10218f0.m9552o();
                            ((com.google.android.gms.internal.measurement.zzid) zzicVarM10218f0.f22030t).m10254K1();
                            long jCurrentTimeMillis2 = zzicVar.zzba().currentTimeMillis();
                            zzicVarM10218f0.m9552o();
                            ((com.google.android.gms.internal.measurement.zzid) zzicVarM10218f0.f22030t).m10349r0(jCurrentTimeMillis2);
                            zzicVarM10218f0.m9552o();
                            ((com.google.android.gms.internal.measurement.zzid) zzicVarM10218f0.f22030t).m10290W1(true);
                            zzpgVar7.zzS(zzicVarM10218f0.m10214v(), zzicVarM10218f0);
                            zzhzVar3.m9552o();
                            ((com.google.android.gms.internal.measurement.zzib) zzhzVar3.f22030t).m10191K((com.google.android.gms.internal.measurement.zzid) zzicVarM10218f0.m9555r());
                            zzhVar3.zzo(((com.google.android.gms.internal.measurement.zzid) zzicVarM10218f0.f22030t).m10342o2());
                            zzhVar3.zzq(((com.google.android.gms.internal.measurement.zzid) zzicVarM10218f0.f22030t).m10348q2());
                            zzpgVar2.zzj().zzv(zzhVar3, false, false);
                            zzpgVar2.zzj().zzc();
                            zzpgVar2.zzj().zzd();
                            return zzpgVar2.zzp().zzv(((com.google.android.gms.internal.measurement.zzib) zzhzVar3.m9555r()).m9346i());
                        } catch (SecurityException e) {
                            zzlpVarZzn.zzu.zzaW().zzj().zzb("Resettable device id encryption failed", e.getMessage());
                            bArr = new byte[0];
                            zzpgVar = zzlpVarZzn.zzg;
                        }
                    } else {
                        zzic zzicVar7 = zzlpVarZzn.zzu;
                        zzicVar7.zzu().zzw();
                        String str12 = Build.MODEL;
                        zzicVarM10218f0.m9552o();
                        ((com.google.android.gms.internal.measurement.zzid) zzicVarM10218f0.f22030t).m10230C1();
                        zzicVar7.zzu().zzw();
                        String str13 = Build.VERSION.RELEASE;
                        zzicVarM10218f0.m9552o();
                        ((com.google.android.gms.internal.measurement.zzid) zzicVarM10218f0.f22030t).m10221A0(str13);
                        int iZzb3 = (int) zzicVar7.zzu().zzb();
                        zzicVarM10218f0.m9552o();
                        ((com.google.android.gms.internal.measurement.zzid) zzicVarM10218f0.f22030t).m10239F1(iZzb3);
                        String strZzc8 = zzicVar7.zzu().zzc();
                        zzicVarM10218f0.m9552o();
                        ((com.google.android.gms.internal.measurement.zzid) zzicVarM10218f0.f22030t).m10236E1(strZzc8);
                        try {
                            if (zzjlVarZzB.zzo(zzjk.ANALYTICS_STORAGE) && zzhVarZzu.zzd() != null) {
                                String strZzd3 = zzhVarZzu.zzd();
                                Preconditions.m3544h(strZzd3);
                                String strZzc9 = zzlp.zzc(strZzd3, Long.toString(zzbhVar.zzd));
                                zzicVarM10218f0.m9552o();
                                ((com.google.android.gms.internal.measurement.zzid) zzicVarM10218f0.f22030t).m10269P1(strZzc9);
                            }
                            if (!TextUtils.isEmpty(zzhVarZzu.zzl())) {
                                String strZzl3 = zzhVarZzu.zzl();
                                Preconditions.m3544h(strZzl3);
                                zzicVarM10218f0.m9552o();
                                ((com.google.android.gms.internal.measurement.zzid) zzicVarM10218f0.f22030t).m10299Z1(strZzl3);
                            }
                            strZzc = zzhVarZzu.zzc();
                            zzpgVar2 = zzlpVarZzn.zzg;
                            listZzn = zzpgVar2.zzj().zzn(strZzc);
                            it = listZzn.iterator();
                            do {
                                if (!it.hasNext()) {
                                    zzpnVar = null;
                                    break;
                                }
                                zzpnVar = (zzpn) it.next();
                            } while (!"_lte".equals(zzpnVar.zzc));
                            if (zzpnVar != null || zzpnVar.zze == null) {
                                zzpn zzpnVar6 = new zzpn(strZzc, "auto", "_lte", zzlpVarZzn.zzu.zzba().currentTimeMillis(), 0L);
                                listZzn.add(zzpnVar6);
                                zzpgVar2.zzj().zzl(zzpnVar6);
                            }
                            zziuVarArr = new com.google.android.gms.internal.measurement.zziu[listZzn.size()];
                            while (i2 < listZzn.size()) {
                                com.google.android.gms.internal.measurement.zzit zzitVarM10418L3 = com.google.android.gms.internal.measurement.zziu.m10418L();
                                String str14 = ((zzpn) listZzn.get(i2)).zzc;
                                zzitVarM10418L3.m9552o();
                                ((com.google.android.gms.internal.measurement.zziu) zzitVarM10418L3.f22030t).m10431N(str14);
                                long j13 = ((zzpn) listZzn.get(i2)).zzd;
                                zzitVarM10418L3.m9552o();
                                ((com.google.android.gms.internal.measurement.zziu) zzitVarM10418L3.f22030t).m10430M(j13);
                                zzpgVar2.zzp().zzc(zzitVarM10418L3, ((zzpn) listZzn.get(i2)).zze);
                                zziuVarArr[i2] = (com.google.android.gms.internal.measurement.zziu) zzitVarM10418L3.m9555r();
                            }
                            List listAsList3 = Arrays.asList(zziuVarArr);
                            zzicVarM10218f0.m9552o();
                            ((com.google.android.gms.internal.measurement.zzid) zzicVarM10218f0.f22030t).m10343p0(listAsList3);
                            zzpgVar3 = zzlpVarZzn.zzg;
                            zzpgVar3.zzI(zzhVarZzu, zzicVarM10218f0);
                            zzpgVar3.zzJ(zzhVarZzu, zzicVarM10218f0);
                            zzgv zzgvVarZza3 = zzgv.zza(zzbhVar);
                            zzicVar = zzlpVarZzn.zzu;
                            zzpp zzppVarZzk3 = zzicVar.zzk();
                            bundle = zzgvVarZza3.zze;
                            zzppVarZzk3.zzK(bundle, zzpgVar2.zzj().zzV(str2));
                            zzicVar.zzk().zzI(zzgvVarZza3, zzicVar.zzc().zzd(str2));
                            bundle.putLong("_c", 1L);
                            zzicVar.zzaW().zzj().zza("Marking in-app purchase as real-time");
                            bundle.putLong("_r", 1L);
                            String str15 = zzbhVar.zzc;
                            bundle.putString("_o", str15);
                            if (zzicVar.zzk().zzad(zzicVarM10218f0.m10214v(), zzhVarZzu.zzay())) {
                                zzicVar.zzk().zzO(bundle, "_dbg", 1L);
                                zzicVar.zzk().zzO(bundle, "_r", 1L);
                            }
                            zzaw zzawVarZzj3 = zzpgVar2.zzj();
                            str = zzbhVar.zza;
                            zzbdVarZzf = zzawVarZzj3.zzf(str2, str);
                            if (zzbdVarZzf == null) {
                                zzhzVar = zzhzVarM10181H;
                                zzhVar = zzhVarZzu;
                                obj = null;
                                zzbdVarZza = new zzbd(str2, str, 0L, 0L, 0L, zzbhVar.zzd, 0L, null, null, null, null);
                                zzpgVar4 = zzpgVar3;
                                j2 = 0;
                            } else {
                                zzpgVar4 = zzpgVar3;
                                zzhzVar = zzhzVarM10181H;
                                zzhVar = zzhVarZzu;
                                obj = null;
                                j2 = zzbdVarZzf.zzf;
                                zzbdVarZza = zzbdVarZzf.zza(zzbhVar.zzd);
                            }
                            zzbd zzbdVar3 = zzbdVarZza;
                            zzpgVar2.zzj().zzh(zzbdVar3);
                            zzpg zzpgVar8 = zzpgVar4;
                            zzic zzicVar8 = zzlpVarZzn.zzu;
                            long j14 = zzbhVar.zzd;
                            com.google.android.gms.internal.measurement.zzhz zzhzVar4 = zzhzVar;
                            zzh zzhVar4 = zzhVar;
                            zzbc zzbcVar3 = new zzbc(zzicVar8, str15, str2, str, j14, 0L, j2, bundle);
                            zzhrVarM10121Q = com.google.android.gms.internal.measurement.zzhs.m10121Q();
                            long j15 = zzbcVar3.zzd;
                            zzhrVarM10121Q.m9552o();
                            ((com.google.android.gms.internal.measurement.zzhs) zzhrVarM10121Q.f22030t).m10144X(j15);
                            zzhrVarM10121Q.m10108C(zzbcVar3.zzb);
                            long j16 = zzbcVar3.zzf;
                            zzhrVarM10121Q.m9552o();
                            ((com.google.android.gms.internal.measurement.zzhs) zzhrVarM10121Q.f22030t).m10145Y(j16);
                            zzbfVar = zzbcVar3.zzg;
                            zzbeVar = new zzbe(zzbfVar);
                            while (zzbeVar.hasNext()) {
                                String next3 = zzbeVar.next();
                                zzhvVarM10154M = com.google.android.gms.internal.measurement.zzhw.m10154M();
                                zzhvVarM10154M.m10151u(next3);
                                objZza = zzbfVar.zza(next3);
                                if (objZza != null) {
                                    zzpgVar2.zzp().zzd(zzhvVarM10154M, objZza);
                                    zzhrVarM10121Q.m10120z(zzhvVarM10154M);
                                }
                            }
                            zzicVarM10218f0.m9552o();
                            ((com.google.android.gms.internal.measurement.zzid) zzicVarM10218f0.f22030t).m10325j0((com.google.android.gms.internal.measurement.zzhs) zzhrVarM10121Q.m9555r());
                            com.google.android.gms.internal.measurement.zzie zzieVarM10376A3 = com.google.android.gms.internal.measurement.zzig.m10376A();
                            com.google.android.gms.internal.measurement.zzht zzhtVarM10148A3 = com.google.android.gms.internal.measurement.zzhu.m10148A();
                            long j17 = zzbdVar3.zzc;
                            zzhtVarM10148A3.m9552o();
                            ((com.google.android.gms.internal.measurement.zzhu) zzhtVarM10148A3.f22030t).m10150C(j17);
                            zzhtVarM10148A3.m9552o();
                            ((com.google.android.gms.internal.measurement.zzhu) zzhtVarM10148A3.f22030t).m10149B(str);
                            zzieVarM10376A3.m9552o();
                            ((com.google.android.gms.internal.measurement.zzig) zzieVarM10376A3.f22030t).m10377B((com.google.android.gms.internal.measurement.zzhu) zzhtVarM10148A3.m9555r());
                            zzicVarM10218f0.m9552o();
                            ((com.google.android.gms.internal.measurement.zzid) zzicVarM10218f0.f22030t).m10317g1((com.google.android.gms.internal.measurement.zzig) zzieVarM10376A3.m9555r());
                            List listZzb3 = zzpgVar2.zzm().zzb(zzhVar4.zzc(), Collections.EMPTY_LIST, Collections.unmodifiableList(((com.google.android.gms.internal.measurement.zzid) zzicVarM10218f0.f22030t).m10324i2()), Long.valueOf(zzhrVarM10121Q.m10109D()), Long.valueOf(zzhrVarM10121Q.m10109D()), false);
                            zzicVarM10218f0.m9552o();
                            ((com.google.android.gms.internal.measurement.zzid) zzicVarM10218f0.f22030t).m10293X1(listZzb3);
                            if (((com.google.android.gms.internal.measurement.zzhs) zzhrVarM10121Q.f22030t).m10128G()) {
                                long jM10109D5 = zzhrVarM10121Q.m10109D();
                                zzicVarM10218f0.m9552o();
                                ((com.google.android.gms.internal.measurement.zzid) zzicVarM10218f0.f22030t).m10355t0(jM10109D5);
                                long jM10109D6 = zzhrVarM10121Q.m10109D();
                                zzicVarM10218f0.m9552o();
                                ((com.google.android.gms.internal.measurement.zzid) zzicVarM10218f0.f22030t).m10358u0(jM10109D6);
                            }
                            jZzp = zzhVar4.zzp();
                            if (jZzp != 0) {
                                zzicVarM10218f0.m9552o();
                                ((com.google.android.gms.internal.measurement.zzid) zzicVarM10218f0.f22030t).m10367x0(jZzp);
                            }
                            jZzn = zzhVar4.zzn();
                            if (jZzn != 0) {
                                zzicVarM10218f0.m9552o();
                                ((com.google.android.gms.internal.measurement.zzid) zzicVarM10218f0.f22030t).m10361v0(jZzn);
                            } else if (jZzp != 0) {
                                zzicVarM10218f0.m9552o();
                                ((com.google.android.gms.internal.measurement.zzid) zzicVarM10218f0.f22030t).m10361v0(jZzp);
                            }
                            strZzh = zzhVar4.zzh();
                            if (zzicVar.zzc().zzp(str2, zzfy.zzaM) && strZzh != null) {
                                zzicVarM10218f0.m9552o();
                                ((com.google.android.gms.internal.measurement.zzid) zzicVarM10218f0.f22030t).m10332l1(strZzh);
                            }
                            zzhVar4.zzL();
                            int iZzG3 = (int) zzhVar4.zzG();
                            zzicVarM10218f0.m9552o();
                            ((com.google.android.gms.internal.measurement.zzid) zzicVarM10218f0.f22030t).m10278S1(iZzG3);
                            zzicVar.zzc().zzi();
                            zzicVarM10218f0.m9552o();
                            ((com.google.android.gms.internal.measurement.zzid) zzicVarM10218f0.f22030t).m10254K1();
                            long jCurrentTimeMillis3 = zzicVar.zzba().currentTimeMillis();
                            zzicVarM10218f0.m9552o();
                            ((com.google.android.gms.internal.measurement.zzid) zzicVarM10218f0.f22030t).m10349r0(jCurrentTimeMillis3);
                            zzicVarM10218f0.m9552o();
                            ((com.google.android.gms.internal.measurement.zzid) zzicVarM10218f0.f22030t).m10290W1(true);
                            zzpgVar8.zzS(zzicVarM10218f0.m10214v(), zzicVarM10218f0);
                            zzhzVar4.m9552o();
                            ((com.google.android.gms.internal.measurement.zzib) zzhzVar4.f22030t).m10191K((com.google.android.gms.internal.measurement.zzid) zzicVarM10218f0.m9555r());
                            zzhVar4.zzo(((com.google.android.gms.internal.measurement.zzid) zzicVarM10218f0.f22030t).m10342o2());
                            zzhVar4.zzq(((com.google.android.gms.internal.measurement.zzid) zzicVarM10218f0.f22030t).m10348q2());
                            zzpgVar2.zzj().zzv(zzhVar4, false, false);
                            zzpgVar2.zzj().zzc();
                            zzpgVar2.zzj().zzd();
                            try {
                                return zzpgVar2.zzp().zzv(((com.google.android.gms.internal.measurement.zzib) zzhzVar4.m9555r()).m9346i());
                            } catch (IOException e2) {
                                zzlpVarZzn.zzu.zzaW().zzb().zzc("Data loss. Failed to bundle and serialize. appId", zzgu.zzl(str2), e2);
                                return obj;
                            }
                        } catch (SecurityException e3) {
                            zzlpVarZzn.zzu.zzaW().zzj().zzb("app instance id encryption failed", e3.getMessage());
                            bArr = new byte[0];
                            zzpgVar = zzlpVarZzn.zzg;
                        }
                    }
                    zzpgVar.zzj().zzd();
                    return bArr;
                }
                zzlpVarZzn.zzu.zzaW().zzj().zzb("Log and bundle disabled. package_name", str2);
                bArr2 = new byte[0];
            }
            zzpgVar5.zzj().zzd();
            return bArr2;
        } catch (Throwable th) {
            zzlpVarZzn.zzg.zzj().zzd();
            throw th;
        }
    }
}
