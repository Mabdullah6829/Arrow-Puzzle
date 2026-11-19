package com.google.firebase.firestore.model;

import com.google.firebase.Timestamp;
import com.google.firebase.firestore.Blob;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.GeoPoint;
import com.google.firebase.firestore.VectorValue;
import com.google.firebase.firestore.util.Assert;
import com.google.firebase.firestore.util.Util;
import com.google.protobuf.AbstractC6185M;
import com.google.protobuf.AbstractC6251n;
import com.google.protobuf.C6195R0;
import com.google.protobuf.C6197S0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.AbstractC6452k;
import p011H.AbstractC0242F;
import p011H.AbstractC0243G;
import p011H.AbstractC0271e0;
import p022N.C0371O;
import p022N.C0375Q;
import p022N.C0389X0;
import p022N.C0393Z0;
import p022N.C0403d;
import p022N.C0406e;
import p022N.EnumC0391Y0;
import p022N.InterfaceC0409f;
import p028Q.C0499a;
import p028Q.C0500b;
import p037U0.AbstractC0846b;
import p058e0.AbstractC6307o;
import p068j0.InterfaceC6418a;
import p088w0.InterfaceC6550e;

/* JADX INFO: loaded from: classes2.dex */
public final class Values {
    public static final C0393Z0 FALSE_VALUE;
    public static final Values INSTANCE = new Values();
    public static final C0393Z0 MAX_VALUE;
    public static final C0393Z0 MAX_VALUE_TYPE;
    private static final C0393Z0 MIN_ARRAY;
    private static final C0393Z0 MIN_BOOLEAN;
    private static final C0393Z0 MIN_BYTES;
    private static final C0393Z0 MIN_GEO_POINT;
    private static final C0393Z0 MIN_MAP;
    private static final C0393Z0 MIN_NUMBER;
    private static final C0393Z0 MIN_REFERENCE;
    private static final C0393Z0 MIN_STRING;
    private static final C0393Z0 MIN_TIMESTAMP;
    public static final C0393Z0 MIN_VALUE;
    private static final C0393Z0 MIN_VECTOR_VALUE;
    public static final C0393Z0 NAN_VALUE;
    public static final C0393Z0 NULL_VALUE;
    public static final C0393Z0 TRUE_VALUE;
    public static final String TYPE_KEY = "__type__";
    public static final int TYPE_ORDER_ARRAY = 15;
    public static final int TYPE_ORDER_BLOB = 8;
    public static final int TYPE_ORDER_BOOLEAN = 2;
    public static final int TYPE_ORDER_GEOPOINT = 13;
    public static final int TYPE_ORDER_MAP = 17;
    public static final int TYPE_ORDER_MAX_VALUE = Integer.MAX_VALUE;
    public static final int TYPE_ORDER_NULL = 0;
    public static final int TYPE_ORDER_NUMBER = 4;
    public static final int TYPE_ORDER_NUMBER_NAN = 3;
    public static final int TYPE_ORDER_REFERENCE = 10;
    public static final int TYPE_ORDER_SERVER_TIMESTAMP = 6;
    public static final int TYPE_ORDER_STRING = 7;
    public static final int TYPE_ORDER_TIMESTAMP = 5;
    public static final int TYPE_ORDER_UNSET = 0;
    public static final int TYPE_ORDER_VECTOR = 16;
    public static final String VECTOR_MAP_VECTORS_KEY = "value";
    public static final C0393Z0 VECTOR_VALUE_TYPE;

    public static final class Enterprise {
        public static final Enterprise INSTANCE = new Enterprise();
        private static final InterfaceC6550e compare = new Values$Enterprise$compare$1(Values.INSTANCE);

        public enum CompareResult {
            LESS_THAN,
            EQUAL,
            GREATER_THAN,
            TYPE_MISMATCH;

            private static final /* synthetic */ InterfaceC6418a $ENTRIES = AbstractC0243G.m373k(values());

            public static InterfaceC6418a getEntries() {
                return $ENTRIES;
            }
        }

        private Enterprise() {
        }

        public final boolean equals$com_google_firebase_firebase_firestore(C0393Z0 c0393z0, C0393Z0 c0393z1) {
            return Values.equals(c0393z0, c0393z1);
        }

        public final InterfaceC6550e getCompare$com_google_firebase_firebase_firestore() {
            return compare;
        }

        public final CompareResult strictCompare$com_google_firebase_firebase_firestore(C0393Z0 c0393z0, C0393Z0 c0393z1) {
            if (c0393z0 == null && c0393z1 == null) {
                return CompareResult.EQUAL;
            }
            if (c0393z0 == null || c0393z1 == null) {
                return CompareResult.TYPE_MISMATCH;
            }
            int iTypeOrder = Values.typeOrder(c0393z0);
            if (iTypeOrder != Values.typeOrder(c0393z1)) {
                return CompareResult.TYPE_MISMATCH;
            }
            int iCompareInternal = Values.INSTANCE.compareInternal(iTypeOrder, c0393z0, c0393z1);
            if (iCompareInternal < 0) {
                return CompareResult.LESS_THAN;
            }
            return iCompareInternal > 0 ? CompareResult.GREATER_THAN : CompareResult.EQUAL;
        }
    }

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC0391Y0.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[5] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[6] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[7] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[8] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[9] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[10] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        C0389X0 c0389x0M714O = C0393Z0.m714O();
        c0389x0M714O.m691g(Double.NaN);
        AbstractC6185M abstractC6185MM12341build = c0389x0M714O.m12341build();
        AbstractC6452k.m12180d(abstractC6185MM12341build, "build(...)");
        NAN_VALUE = (C0393Z0) abstractC6185MM12341build;
        C0389X0 c0389x0M714O2 = C0393Z0.m714O();
        c0389x0M714O2.m698q();
        AbstractC6185M abstractC6185MM12341build2 = c0389x0M714O2.m12341build();
        AbstractC6452k.m12180d(abstractC6185MM12341build2, "build(...)");
        C0393Z0 c0393z0 = (C0393Z0) abstractC6185MM12341build2;
        NULL_VALUE = c0393z0;
        MIN_VALUE = c0393z0;
        C0389X0 c0389x0M714O3 = C0393Z0.m714O();
        c0389x0M714O3.m701t("__max__");
        AbstractC6185M abstractC6185MM12341build3 = c0389x0M714O3.m12341build();
        AbstractC6452k.m12180d(abstractC6185MM12341build3, "build(...)");
        C0393Z0 c0393z1 = (C0393Z0) abstractC6185MM12341build3;
        MAX_VALUE_TYPE = c0393z1;
        C0389X0 c0389x0M714O4 = C0393Z0.m714O();
        C0371O c0371oM646k = C0375Q.m646k();
        c0371oM646k.m634d(TYPE_KEY, c0393z1);
        c0389x0M714O4.m696o(c0371oM646k);
        AbstractC6185M abstractC6185MM12341build4 = c0389x0M714O4.m12341build();
        AbstractC6452k.m12180d(abstractC6185MM12341build4, "build(...)");
        MAX_VALUE = (C0393Z0) abstractC6185MM12341build4;
        C0389X0 c0389x0M714O5 = C0393Z0.m714O();
        c0389x0M714O5.m701t("__vector__");
        AbstractC6185M abstractC6185MM12341build5 = c0389x0M714O5.m12341build();
        AbstractC6452k.m12180d(abstractC6185MM12341build5, "build(...)");
        C0393Z0 c0393z2 = (C0393Z0) abstractC6185MM12341build5;
        VECTOR_VALUE_TYPE = c0393z2;
        C0389X0 c0389x0M714O6 = C0393Z0.m714O();
        C0371O c0371oM646k2 = C0375Q.m646k();
        c0371oM646k2.m634d(TYPE_KEY, c0393z2);
        C0389X0 c0389x0M714O7 = C0393Z0.m714O();
        c0389x0M714O7.m687c(C0406e.m798k());
        c0371oM646k2.m634d("value", (C0393Z0) c0389x0M714O7.m12341build());
        c0389x0M714O6.m696o(c0371oM646k2);
        AbstractC6185M abstractC6185MM12341build6 = c0389x0M714O6.m12341build();
        AbstractC6452k.m12180d(abstractC6185MM12341build6, "build(...)");
        MIN_VECTOR_VALUE = (C0393Z0) abstractC6185MM12341build6;
        C0389X0 c0389x0M714O8 = C0393Z0.m714O();
        c0389x0M714O8.m689e(false);
        AbstractC6185M abstractC6185MM12341build7 = c0389x0M714O8.m12341build();
        AbstractC6452k.m12180d(abstractC6185MM12341build7, "build(...)");
        MIN_BOOLEAN = (C0393Z0) abstractC6185MM12341build7;
        C0389X0 c0389x0M714O9 = C0393Z0.m714O();
        c0389x0M714O9.m691g(Double.NaN);
        AbstractC6185M abstractC6185MM12341build8 = c0389x0M714O9.m12341build();
        AbstractC6452k.m12180d(abstractC6185MM12341build8, "build(...)");
        MIN_NUMBER = (C0393Z0) abstractC6185MM12341build8;
        C0389X0 c0389x0M714O10 = C0393Z0.m714O();
        C6195R0 c6195r0M11817j = C6197S0.m11817j();
        c6195r0M11817j.m11813c(Long.MIN_VALUE);
        c0389x0M714O10.m702u(c6195r0M11817j);
        AbstractC6185M abstractC6185MM12341build9 = c0389x0M714O10.m12341build();
        AbstractC6452k.m12180d(abstractC6185MM12341build9, "build(...)");
        MIN_TIMESTAMP = (C0393Z0) abstractC6185MM12341build9;
        C0389X0 c0389x0M714O11 = C0393Z0.m714O();
        c0389x0M714O11.m701t("");
        AbstractC6185M abstractC6185MM12341build10 = c0389x0M714O11.m12341build();
        AbstractC6452k.m12180d(abstractC6185MM12341build10, "build(...)");
        MIN_STRING = (C0393Z0) abstractC6185MM12341build10;
        C0389X0 c0389x0M714O12 = C0393Z0.m714O();
        c0389x0M714O12.m690f(AbstractC6251n.f24219t);
        AbstractC6185M abstractC6185MM12341build11 = c0389x0M714O12.m12341build();
        AbstractC6452k.m12180d(abstractC6185MM12341build11, "build(...)");
        MIN_BYTES = (C0393Z0) abstractC6185MM12341build11;
        DatabaseId EMPTY = DatabaseId.EMPTY;
        AbstractC6452k.m12180d(EMPTY, "EMPTY");
        DocumentKey documentKeyEmpty = DocumentKey.empty();
        AbstractC6452k.m12180d(documentKeyEmpty, "empty(...)");
        MIN_REFERENCE = refValue(EMPTY, documentKeyEmpty);
        C0389X0 c0389x0M714O13 = C0393Z0.m714O();
        C0499a c0499aM1189j = C0500b.m1189j();
        c0499aM1189j.m1184b(-90.0d);
        c0499aM1189j.m1185c(-180.0d);
        c0389x0M714O13.m694l(c0499aM1189j);
        AbstractC6185M abstractC6185MM12341build12 = c0389x0M714O13.m12341build();
        AbstractC6452k.m12180d(abstractC6185MM12341build12, "build(...)");
        MIN_GEO_POINT = (C0393Z0) abstractC6185MM12341build12;
        C0389X0 c0389x0M714O14 = C0393Z0.m714O();
        c0389x0M714O14.m688d(C0406e.m797h());
        AbstractC6185M abstractC6185MM12341build13 = c0389x0M714O14.m12341build();
        AbstractC6452k.m12180d(abstractC6185MM12341build13, "build(...)");
        MIN_ARRAY = (C0393Z0) abstractC6185MM12341build13;
        C0389X0 c0389x0M714O15 = C0393Z0.m714O();
        c0389x0M714O15.m697p(C0375Q.m645f());
        AbstractC6185M abstractC6185MM12341build14 = c0389x0M714O15.m12341build();
        AbstractC6452k.m12180d(abstractC6185MM12341build14, "build(...)");
        MIN_MAP = (C0393Z0) abstractC6185MM12341build14;
        C0389X0 c0389x0M714O16 = C0393Z0.m714O();
        c0389x0M714O16.m689e(true);
        AbstractC6185M abstractC6185MM12341build15 = c0389x0M714O16.m12341build();
        AbstractC6452k.m12180d(abstractC6185MM12341build15, "build(...)");
        TRUE_VALUE = (C0393Z0) abstractC6185MM12341build15;
        C0389X0 c0389x0M714O17 = C0393Z0.m714O();
        c0389x0M714O17.m689e(false);
        AbstractC6185M abstractC6185MM12341build16 = c0389x0M714O17.m12341build();
        AbstractC6452k.m12180d(abstractC6185MM12341build16, "build(...)");
        FALSE_VALUE = (C0393Z0) abstractC6185MM12341build16;
    }

    private Values() {
    }

    private final boolean arrayEquals(C0393Z0 c0393z0, C0393Z0 c0393z1) {
        C0406e c0406eM745t = c0393z0.m745t();
        C0406e c0406eM745t2 = c0393z1.m745t();
        if (c0406eM745t.m800j() != c0406eM745t2.m800j()) {
            return false;
        }
        int iM800j = c0406eM745t.m800j();
        for (int i2 = 0; i2 < iM800j; i2++) {
            if (!equals(c0406eM745t.m799i(i2), c0406eM745t2.m799i(i2))) {
                return false;
            }
        }
        return true;
    }

    public static final String canonicalId(C0393Z0 value) {
        AbstractC6452k.m12181e(value, "value");
        StringBuilder sb = new StringBuilder();
        INSTANCE.canonifyValue(sb, value);
        String string = sb.toString();
        AbstractC6452k.m12180d(string, "toString(...)");
        return string;
    }

    private final void canonifyArray(StringBuilder sb, C0406e c0406e) {
        sb.append("[");
        if (c0406e.m800j() > 0) {
            C0393Z0 c0393z0M799i = c0406e.m799i(0);
            AbstractC6452k.m12180d(c0393z0M799i, "getValues(...)");
            canonifyValue(sb, c0393z0M799i);
            int iM800j = c0406e.m800j();
            for (int i2 = 1; i2 < iM800j; i2++) {
                sb.append(",");
                C0393Z0 c0393z0M799i2 = c0406e.m799i(i2);
                AbstractC6452k.m12180d(c0393z0M799i2, "getValues(...)");
                canonifyValue(sb, c0393z0M799i2);
            }
        }
        sb.append("]");
    }

    private final void canonifyGeoPoint(StringBuilder sb, C0500b c0500b) {
        sb.append(String.format("geo(%s,%s)", Arrays.copyOf(new Object[]{Double.valueOf(c0500b.m1190h()), Double.valueOf(c0500b.m1191i())}, 2)));
    }

    private final void canonifyObject(StringBuilder sb, C0375Q c0375q) {
        ArrayList arrayList = new ArrayList(c0375q.m648h().keySet());
        if (arrayList.size() > 1) {
            Collections.sort(arrayList);
        }
        sb.append("{");
        Iterator it = arrayList.iterator();
        AbstractC6452k.m12180d(it, "iterator(...)");
        while (it.hasNext()) {
            String str = (String) it.next();
            sb.append(str);
            sb.append(":");
            C0393Z0 c0393z0M650j = c0375q.m650j(str);
            AbstractC6452k.m12180d(c0393z0M650j, "getFieldsOrThrow(...)");
            canonifyValue(sb, c0393z0M650j);
            if (it.hasNext()) {
                sb.append(",");
            }
        }
        sb.append("}");
    }

    private final void canonifyReference(StringBuilder sb, C0393Z0 c0393z0) {
        Assert.hardAssert(isReferenceValue(c0393z0), "Value should be a ReferenceValue", new Object[0]);
        sb.append(DocumentKey.fromName(c0393z0.m734D()));
    }

    private final void canonifyTimestamp(StringBuilder sb, C6197S0 c6197s0) {
        sb.append(String.format("time(%s,%s)", Arrays.copyOf(new Object[]{Long.valueOf(c6197s0.m11820i()), Integer.valueOf(c6197s0.m11819h())}, 2)));
    }

    private final void canonifyValue(StringBuilder sb, C0393Z0 c0393z0) {
        EnumC0391Y0 enumC0391Y0M737G = c0393z0.m737G();
        switch (enumC0391Y0M737G == null ? -1 : WhenMappings.$EnumSwitchMapping$0[enumC0391Y0M737G.ordinal()]) {
            case 1:
                sb.append("null");
                return;
            case 2:
                sb.append(c0393z0.m746u());
                return;
            case 3:
                sb.append(c0393z0.m732B());
                return;
            case 4:
                sb.append(c0393z0.m748x());
                return;
            case 5:
                C6197S0 c6197s0M736F = c0393z0.m736F();
                AbstractC6452k.m12180d(c6197s0M736F, "getTimestampValue(...)");
                canonifyTimestamp(sb, c6197s0M736F);
                return;
            case 6:
                sb.append(c0393z0.m735E());
                return;
            case 7:
                sb.append(Util.toDebugString(c0393z0.m747v()));
                return;
            case 8:
                canonifyReference(sb, c0393z0);
                return;
            case 9:
                C0500b c0500bM731A = c0393z0.m731A();
                AbstractC6452k.m12180d(c0500bM731A, "getGeoPointValue(...)");
                canonifyGeoPoint(sb, c0500bM731A);
                return;
            case 10:
                C0406e c0406eM745t = c0393z0.m745t();
                AbstractC6452k.m12180d(c0406eM745t, "getArrayValue(...)");
                canonifyArray(sb, c0406eM745t);
                return;
            case 11:
                C0375Q c0375qM733C = c0393z0.m733C();
                AbstractC6452k.m12180d(c0375qM733C, "getMapValue(...)");
                canonifyObject(sb, c0375qM733C);
                return;
            default:
                throw Assert.fail("Invalid value type: " + c0393z0.m737G(), new Object[0]);
        }
    }

    public static final int compare(C0393Z0 c0393z0, C0393Z0 c0393z1) {
        int iTypeOrder = typeOrder(c0393z0);
        int iTypeOrder2 = typeOrder(c0393z1);
        if (iTypeOrder != iTypeOrder2) {
            return AbstractC6452k.m12182f(iTypeOrder, iTypeOrder2);
        }
        Values values = INSTANCE;
        if (c0393z0 == null) {
            c0393z0 = NULL_VALUE;
        }
        if (c0393z1 == null) {
            c0393z1 = NULL_VALUE;
        }
        return values.compareInternal(iTypeOrder, c0393z0, c0393z1);
    }

    private final int compareArrays(C0406e c0406e, C0406e c0406e2) {
        int iMin = (int) Math.min(c0406e.m800j(), c0406e2.m800j());
        for (int i2 = 0; i2 < iMin; i2++) {
            int iCompare = compare(c0406e.m799i(i2), c0406e2.m799i(i2));
            if (iCompare != 0) {
                return iCompare;
            }
        }
        return AbstractC6452k.m12182f(c0406e.m800j(), c0406e2.m800j());
    }

    private final int compareGeoPoints(C0500b c0500b, C0500b c0500b2) {
        int iM354k = AbstractC0242F.m354k(c0500b.m1190h(), c0500b2.m1190h());
        return iM354k == 0 ? AbstractC0242F.m354k(c0500b.m1191i(), c0500b2.m1191i()) : iM354k;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int compareInternal(int i2, C0393Z0 c0393z0, C0393Z0 c0393z1) {
        if (i2 != 0) {
            if (i2 == 10) {
                String strM734D = c0393z0.m734D();
                AbstractC6452k.m12180d(strM734D, "getReferenceValue(...)");
                String strM734D2 = c0393z1.m734D();
                AbstractC6452k.m12180d(strM734D2, "getReferenceValue(...)");
                return compareReferences(strM734D, strM734D2);
            }
            if (i2 == 13) {
                C0500b c0500bM731A = c0393z0.m731A();
                AbstractC6452k.m12180d(c0500bM731A, "getGeoPointValue(...)");
                C0500b c0500bM731A2 = c0393z1.m731A();
                AbstractC6452k.m12180d(c0500bM731A2, "getGeoPointValue(...)");
                return compareGeoPoints(c0500bM731A, c0500bM731A2);
            }
            if (i2 != Integer.MAX_VALUE) {
                switch (i2) {
                    case 2:
                        return Boolean.compare(c0393z0.m746u(), c0393z1.m746u());
                    case 3:
                        break;
                    case 4:
                        return compareNumbers(c0393z0, c0393z1);
                    case 5:
                        C6197S0 c6197s0M736F = c0393z0.m736F();
                        AbstractC6452k.m12180d(c6197s0M736F, "getTimestampValue(...)");
                        C6197S0 c6197s0M736F2 = c0393z1.m736F();
                        AbstractC6452k.m12180d(c6197s0M736F2, "getTimestampValue(...)");
                        return compareTimestamps(c6197s0M736F, c6197s0M736F2);
                    case 6:
                        C6197S0 localWriteTime = ServerTimestamps.getLocalWriteTime(c0393z0);
                        AbstractC6452k.m12180d(localWriteTime, "getLocalWriteTime(...)");
                        C6197S0 localWriteTime2 = ServerTimestamps.getLocalWriteTime(c0393z1);
                        AbstractC6452k.m12180d(localWriteTime2, "getLocalWriteTime(...)");
                        return compareTimestamps(localWriteTime, localWriteTime2);
                    case 7:
                        return Util.compareUtf8Strings(c0393z0.m735E(), c0393z1.m735E());
                    case 8:
                        return Util.compareByteStrings(c0393z0.m747v(), c0393z1.m747v());
                    default:
                        switch (i2) {
                            case 15:
                                C0406e c0406eM745t = c0393z0.m745t();
                                AbstractC6452k.m12180d(c0406eM745t, "getArrayValue(...)");
                                C0406e c0406eM745t2 = c0393z1.m745t();
                                AbstractC6452k.m12180d(c0406eM745t2, "getArrayValue(...)");
                                return compareArrays(c0406eM745t, c0406eM745t2);
                            case 16:
                                C0375Q c0375qM733C = c0393z0.m733C();
                                AbstractC6452k.m12180d(c0375qM733C, "getMapValue(...)");
                                C0375Q c0375qM733C2 = c0393z1.m733C();
                                AbstractC6452k.m12180d(c0375qM733C2, "getMapValue(...)");
                                return compareVectors(c0375qM733C, c0375qM733C2);
                            case 17:
                                C0375Q c0375qM733C3 = c0393z0.m733C();
                                AbstractC6452k.m12180d(c0375qM733C3, "getMapValue(...)");
                                C0375Q c0375qM733C4 = c0393z1.m733C();
                                AbstractC6452k.m12180d(c0375qM733C4, "getMapValue(...)");
                                return compareMaps(c0375qM733C3, c0375qM733C4);
                            default:
                                throw Assert.fail(AbstractC0271e0.m396d(i2, "Invalid value type: "), new Object[0]);
                        }
                }
            }
        }
        return 0;
    }

    private final int compareMaps(C0375Q c0375q, C0375Q c0375q2) {
        Iterator it = new TreeMap(c0375q.m648h()).entrySet().iterator();
        Iterator it2 = new TreeMap(c0375q2.m648h()).entrySet().iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Map.Entry entry2 = (Map.Entry) it2.next();
            int iCompareUtf8Strings = Util.compareUtf8Strings((String) entry.getKey(), (String) entry2.getKey());
            if (iCompareUtf8Strings != 0) {
                return iCompareUtf8Strings;
            }
            int iCompare = compare((C0393Z0) entry.getValue(), (C0393Z0) entry2.getValue());
            if (iCompare != 0) {
                return iCompare;
            }
        }
        return Boolean.compare(it.hasNext(), it2.hasNext());
    }

    private final int compareNumbers(C0393Z0 c0393z0, C0393Z0 c0393z1) {
        if (c0393z0.m739I()) {
            if (c0393z1.m739I()) {
                return AbstractC0242F.m354k(c0393z0.m748x(), c0393z1.m748x());
            }
            if (c0393z1.m740J()) {
                return AbstractC0242F.m353j(c0393z0.m748x(), c0393z1.m732B());
            }
        } else if (c0393z0.m740J()) {
            if (c0393z1.m740J()) {
                return Long.compare(c0393z0.m732B(), c0393z1.m732B());
            }
            if (c0393z1.m739I()) {
                return AbstractC0242F.m353j(c0393z1.m748x(), c0393z0.m732B()) * (-1);
            }
        }
        throw Assert.fail("Unexpected values: %s vs %s", c0393z0, c0393z1);
    }

    private final int compareReferences(String input, String input2) {
        List listM1752k;
        List listM1752k2;
        Pattern patternCompile = Pattern.compile("/");
        AbstractC6452k.m12180d(patternCompile, "compile(...)");
        AbstractC6452k.m12181e(input, "input");
        Matcher matcher = patternCompile.matcher(input);
        if (matcher.find()) {
            ArrayList arrayList = new ArrayList(10);
            int iEnd = 0;
            do {
                arrayList.add(input.subSequence(iEnd, matcher.start()).toString());
                iEnd = matcher.end();
            } while (matcher.find());
            arrayList.add(input.subSequence(iEnd, input.length()).toString());
            listM1752k = arrayList;
        } else {
            listM1752k = AbstractC0846b.m1752k(input.toString());
        }
        String[] strArr = (String[]) listM1752k.toArray(new String[0]);
        Pattern patternCompile2 = Pattern.compile("/");
        AbstractC6452k.m12180d(patternCompile2, "compile(...)");
        AbstractC6452k.m12181e(input2, "input");
        Matcher matcher2 = patternCompile2.matcher(input2);
        if (matcher2.find()) {
            ArrayList arrayList2 = new ArrayList(10);
            int iEnd2 = 0;
            do {
                arrayList2.add(input2.subSequence(iEnd2, matcher2.start()).toString());
                iEnd2 = matcher2.end();
            } while (matcher2.find());
            arrayList2.add(input2.subSequence(iEnd2, input2.length()).toString());
            listM1752k2 = arrayList2;
        } else {
            listM1752k2 = AbstractC0846b.m1752k(input2.toString());
        }
        String[] strArr2 = (String[]) listM1752k2.toArray(new String[0]);
        int iMin = (int) Math.min(strArr.length, strArr2.length);
        for (int i2 = 0; i2 < iMin; i2++) {
            int iCompareTo = strArr[i2].compareTo(strArr2[i2]);
            if (iCompareTo != 0) {
                return iCompareTo;
            }
        }
        return AbstractC6452k.m12182f(strArr.length, strArr2.length);
    }

    private final int compareTimestamps(C6197S0 c6197s0, C6197S0 c6197s1) {
        int i2;
        long jM11820i = c6197s0.m11820i();
        long jM11820i2 = c6197s1.m11820i();
        if (jM11820i < jM11820i2) {
            i2 = -1;
        } else {
            i2 = jM11820i == jM11820i2 ? 0 : 1;
        }
        return i2 != 0 ? i2 : AbstractC6452k.m12182f(c6197s0.m11819h(), c6197s1.m11819h());
    }

    private final int compareVectors(C0375Q c0375q, C0375Q c0375q2) {
        Map mapM648h = c0375q.m648h();
        Map mapM648h2 = c0375q2.m648h();
        Object obj = mapM648h.get("value");
        AbstractC6452k.m12178b(obj);
        C0406e c0406eM745t = ((C0393Z0) obj).m745t();
        Object obj2 = mapM648h2.get("value");
        AbstractC6452k.m12178b(obj2);
        C0406e c0406eM745t2 = ((C0393Z0) obj2).m745t();
        int iM12182f = AbstractC6452k.m12182f(c0406eM745t.m800j(), c0406eM745t2.m800j());
        return iM12182f != 0 ? iM12182f : compareArrays(c0406eM745t, c0406eM745t2);
    }

    public static final boolean contains(InterfaceC0409f haystack, C0393Z0 c0393z0) {
        AbstractC6452k.m12181e(haystack, "haystack");
        Iterator it = haystack.getValuesList().iterator();
        while (it.hasNext()) {
            if (equals((C0393Z0) it.next(), c0393z0)) {
                return true;
            }
        }
        return false;
    }

    public static final C0393Z0 encodeAnyValue(Object obj) {
        if (obj == null) {
            return NULL_VALUE;
        }
        if (obj instanceof String) {
            return encodeValue((String) obj);
        }
        if (obj instanceof Number) {
            return encodeValue((Number) obj);
        }
        if (obj instanceof Date) {
            return encodeValue((Date) obj);
        }
        if (obj instanceof Timestamp) {
            return encodeValue((Timestamp) obj);
        }
        if (obj instanceof Boolean) {
            return encodeValue(((Boolean) obj).booleanValue());
        }
        if (obj instanceof GeoPoint) {
            return encodeValue((GeoPoint) obj);
        }
        if (obj instanceof Blob) {
            return encodeValue((Blob) obj);
        }
        if (obj instanceof VectorValue) {
            return encodeValue((VectorValue) obj);
        }
        throw new IllegalArgumentException("Unexpected type: " + obj);
    }

    public static final C0393Z0 encodeValue(long j2) {
        C0389X0 c0389x0M714O = C0393Z0.m714O();
        c0389x0M714O.m695m(j2);
        AbstractC6185M abstractC6185MM12341build = c0389x0M714O.m12341build();
        AbstractC6452k.m12180d(abstractC6185MM12341build, "build(...)");
        return (C0393Z0) abstractC6185MM12341build;
    }

    public static final C0393Z0 encodeVectorValue(double[] vector) {
        AbstractC6452k.m12181e(vector, "vector");
        C0403d c0403dM798k = C0406e.m798k();
        for (double d : vector) {
            c0403dM798k.m788c(encodeValue(d));
        }
        C0389X0 c0389x0M714O = C0393Z0.m714O();
        C0371O c0371oM646k = C0375Q.m646k();
        c0371oM646k.m634d(TYPE_KEY, VECTOR_VALUE_TYPE);
        C0389X0 c0389x0M714O2 = C0393Z0.m714O();
        c0389x0M714O2.m687c(c0403dM798k);
        c0371oM646k.m634d("value", (C0393Z0) c0389x0M714O2.m12341build());
        c0389x0M714O.m696o(c0371oM646k);
        AbstractC6185M abstractC6185MM12341build = c0389x0M714O.m12341build();
        AbstractC6452k.m12180d(abstractC6185MM12341build, "build(...)");
        return (C0393Z0) abstractC6185MM12341build;
    }

    public static final boolean equals(C0393Z0 c0393z0, C0393Z0 c0393z1) {
        int iTypeOrder;
        if (c0393z0 == c0393z1) {
            return true;
        }
        if (c0393z0 == null || c0393z1 == null || (iTypeOrder = typeOrder(c0393z0)) != typeOrder(c0393z1)) {
            return false;
        }
        if (iTypeOrder == 3 || iTypeOrder == 4) {
            return INSTANCE.numberEquals(c0393z0, c0393z1);
        }
        if (iTypeOrder == 6) {
            return AbstractC6452k.m12177a(ServerTimestamps.getLocalWriteTime(c0393z0), ServerTimestamps.getLocalWriteTime(c0393z1));
        }
        if (iTypeOrder == Integer.MAX_VALUE) {
            return true;
        }
        switch (iTypeOrder) {
            case 15:
                return INSTANCE.arrayEquals(c0393z0, c0393z1);
            case 16:
            case 17:
                return INSTANCE.objectEquals(c0393z0, c0393z1);
            default:
                return c0393z0.equals(c0393z1);
        }
    }

    public static final C0393Z0 getLowerBound(C0393Z0 value) {
        AbstractC6452k.m12181e(value, "value");
        EnumC0391Y0 enumC0391Y0M737G = value.m737G();
        switch (enumC0391Y0M737G == null ? -1 : WhenMappings.$EnumSwitchMapping$0[enumC0391Y0M737G.ordinal()]) {
            case 1:
                return NULL_VALUE;
            case 2:
                return MIN_BOOLEAN;
            case 3:
            case 4:
                return MIN_NUMBER;
            case 5:
                return MIN_TIMESTAMP;
            case 6:
                return MIN_STRING;
            case 7:
                return MIN_BYTES;
            case 8:
                return MIN_REFERENCE;
            case 9:
                return MIN_GEO_POINT;
            case 10:
                return MIN_ARRAY;
            case 11:
                return isVectorValue(value) ? MIN_VECTOR_VALUE : MIN_MAP;
            default:
                throw new IllegalArgumentException("Unknown value type: " + value.m737G());
        }
    }

    public static final C0393Z0 getUpperBound(C0393Z0 value) {
        AbstractC6452k.m12181e(value, "value");
        EnumC0391Y0 enumC0391Y0M737G = value.m737G();
        switch (enumC0391Y0M737G == null ? -1 : WhenMappings.$EnumSwitchMapping$0[enumC0391Y0M737G.ordinal()]) {
            case 1:
                return MIN_BOOLEAN;
            case 2:
                return MIN_NUMBER;
            case 3:
            case 4:
                return MIN_TIMESTAMP;
            case 5:
                return MIN_STRING;
            case 6:
                return MIN_BYTES;
            case 7:
                return MIN_REFERENCE;
            case 8:
                return MIN_GEO_POINT;
            case 9:
                return MIN_ARRAY;
            case 10:
                return MIN_VECTOR_VALUE;
            case 11:
                return isVectorValue(value) ? MIN_MAP : MAX_VALUE;
            default:
                throw new IllegalArgumentException("Unknown value type: " + value.m737G());
        }
    }

    public static final double[] getVectorValue(C0393Z0 c0393z0) {
        C0393Z0 c0393z1;
        C0406e c0406eM745t;
        List valuesList;
        if ((c0393z0 != null ? c0393z0.m737G() : null) != EnumC0391Y0.f726C || !isVectorValue(c0393z0) || (c0393z1 = (C0393Z0) c0393z0.m733C().m648h().get("value")) == null || (c0406eM745t = c0393z1.m745t()) == null || (valuesList = c0406eM745t.getValuesList()) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(AbstractC6307o.m12123u(valuesList, 10));
        Iterator it = valuesList.iterator();
        while (it.hasNext()) {
            arrayList.add(Double.valueOf(((C0393Z0) it.next()).m748x()));
        }
        double[] dArr = new double[arrayList.size()];
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            dArr[i2] = ((Number) obj).doubleValue();
            i2++;
        }
        return dArr;
    }

    public static final boolean isArray(C0393Z0 c0393z0) {
        return c0393z0 != null && c0393z0.m738H();
    }

    public static final boolean isDouble(C0393Z0 c0393z0) {
        return c0393z0 != null && c0393z0.m739I();
    }

    public static final boolean isInteger(C0393Z0 c0393z0) {
        return c0393z0 != null && c0393z0.m740J();
    }

    public static final boolean isMapValue(C0393Z0 c0393z0) {
        return c0393z0 != null && c0393z0.m741K();
    }

    public static final boolean isMaxValue(C0393Z0 value) {
        AbstractC6452k.m12181e(value, "value");
        return AbstractC6452k.m12177a(MAX_VALUE_TYPE, value.m733C().m648h().get(TYPE_KEY));
    }

    public static final boolean isNanValue(C0393Z0 c0393z0) {
        return c0393z0 != null && Double.isNaN(c0393z0.m748x());
    }

    public static final boolean isNullValue(C0393Z0 c0393z0) {
        return c0393z0 != null && c0393z0.m742L();
    }

    public static final boolean isNumber(C0393Z0 c0393z0) {
        return isInteger(c0393z0) || isDouble(c0393z0);
    }

    public static final boolean isReferenceValue(C0393Z0 c0393z0) {
        return c0393z0 != null && c0393z0.m743M();
    }

    public static final boolean isVectorValue(C0393Z0 value) {
        AbstractC6452k.m12181e(value, "value");
        return AbstractC6452k.m12177a(VECTOR_VALUE_TYPE, value.m733C().m648h().get(TYPE_KEY));
    }

    public static final int lowerBoundCompare(C0393Z0 left, boolean z, C0393Z0 right, boolean z2) {
        AbstractC6452k.m12181e(left, "left");
        AbstractC6452k.m12181e(right, "right");
        int iCompare = compare(left, right);
        if (iCompare != 0) {
            return iCompare;
        }
        if (!z || z2) {
            return (z || !z2) ? 0 : 1;
        }
        return -1;
    }

    private final boolean numberEquals(C0393Z0 c0393z0, C0393Z0 c0393z1) {
        int i2;
        EnumC0391Y0 enumC0391Y0M737G = c0393z0.m737G();
        int i3 = enumC0391Y0M737G == null ? -1 : WhenMappings.$EnumSwitchMapping$0[enumC0391Y0M737G.ordinal()];
        if (i3 == 3) {
            EnumC0391Y0 enumC0391Y0M737G2 = c0393z1.m737G();
            i2 = enumC0391Y0M737G2 != null ? WhenMappings.$EnumSwitchMapping$0[enumC0391Y0M737G2.ordinal()] : -1;
            if (i2 != 3) {
                return i2 == 4 && AbstractC0242F.m353j(c0393z1.m748x(), c0393z0.m732B()) == 0;
            }
            return c0393z0.m732B() == c0393z1.m732B();
        }
        if (i3 != 4) {
            return false;
        }
        EnumC0391Y0 enumC0391Y0M737G3 = c0393z1.m737G();
        i2 = enumC0391Y0M737G3 != null ? WhenMappings.$EnumSwitchMapping$0[enumC0391Y0M737G3.ordinal()] : -1;
        if (i2 != 3) {
            return i2 == 4 && AbstractC0242F.m354k(c0393z0.m748x(), c0393z1.m748x()) == 0;
        }
        return AbstractC0242F.m353j(c0393z0.m748x(), c0393z1.m732B()) == 0;
    }

    private final boolean objectEquals(C0393Z0 c0393z0, C0393Z0 c0393z1) {
        C0375Q c0375qM733C = c0393z0.m733C();
        C0375Q c0375qM733C2 = c0393z1.m733C();
        if (c0375qM733C.m647g() != c0375qM733C2.m647g()) {
            return false;
        }
        Map mapM648h = c0375qM733C.m648h();
        AbstractC6452k.m12180d(mapM648h, "getFieldsMap(...)");
        for (Map.Entry entry : mapM648h.entrySet()) {
            String str = (String) entry.getKey();
            C0393Z0 c0393z2 = (C0393Z0) entry.getValue();
            C0393Z0 c0393z3 = (C0393Z0) c0375qM733C2.m648h().get(str);
            if (c0393z3 == null || !equals(c0393z2, c0393z3)) {
                return false;
            }
        }
        return true;
    }

    public static final C0393Z0 refValue(DatabaseId databaseId, DocumentKey key) {
        AbstractC6452k.m12181e(databaseId, "databaseId");
        AbstractC6452k.m12181e(key, "key");
        C0389X0 c0389x0M714O = C0393Z0.m714O();
        c0389x0M714O.m700s(String.format("projects/%s/databases/%s/documents/%s", Arrays.copyOf(new Object[]{databaseId.getProjectId(), databaseId.getDatabaseId(), key.toString()}, 3)));
        C0393Z0 c0393z0 = (C0393Z0) c0389x0M714O.m12341build();
        AbstractC6452k.m12178b(c0393z0);
        return c0393z0;
    }

    public static final C6197S0 timestamp(long j2, int i2) {
        INSTANCE.validateRange(j2, i2);
        C6195R0 c6195r0M11817j = C6197S0.m11817j();
        c6195r0M11817j.m11813c(j2);
        c6195r0M11817j.m11812b((i2 / 1000) * 1000);
        AbstractC6185M abstractC6185MM12341build = c6195r0M11817j.m12341build();
        AbstractC6452k.m12180d(abstractC6185MM12341build, "build(...)");
        return (C6197S0) abstractC6185MM12341build;
    }

    public static final int typeOrder(C0393Z0 c0393z0) {
        EnumC0391Y0 enumC0391Y0M737G = c0393z0 != null ? c0393z0.m737G() : null;
        switch (enumC0391Y0M737G == null ? -1 : WhenMappings.$EnumSwitchMapping$0[enumC0391Y0M737G.ordinal()]) {
            case -1:
            case 1:
                return 0;
            case 0:
            default:
                throw Assert.fail("Invalid value type: " + c0393z0.m737G(), new Object[0]);
            case 2:
                return 2;
            case 4:
                if (Double.isNaN(c0393z0.m748x())) {
                    return 3;
                }
            case 3:
                return 4;
            case 5:
                return 5;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 10;
            case 9:
                return 13;
            case 10:
                return 15;
            case 11:
                if (ServerTimestamps.isServerTimestamp(c0393z0)) {
                    return 6;
                }
                if (isMaxValue(c0393z0)) {
                    return Integer.MAX_VALUE;
                }
                return isVectorValue(c0393z0) ? 16 : 17;
        }
    }

    public static final int upperBoundCompare(C0393Z0 left, boolean z, C0393Z0 right, boolean z2) {
        AbstractC6452k.m12181e(left, "left");
        AbstractC6452k.m12181e(right, "right");
        int iCompare = compare(left, right);
        if (iCompare != 0) {
            return iCompare;
        }
        if (!z || z2) {
            return (z || !z2) ? 0 : -1;
        }
        return 1;
    }

    private final void validateRange(long j2, int i2) {
        if (i2 < 0 || i2 >= 1000000000) {
            throw new IllegalArgumentException(AbstractC0271e0.m396d(i2, "Timestamp nanoseconds out of range: ").toString());
        }
        if (-62135596800L > j2 || j2 >= 253402300800L) {
            throw new IllegalArgumentException(("Timestamp seconds out of range: " + j2).toString());
        }
    }

    public static final C0393Z0 encodeValue(int i2) {
        C0389X0 c0389x0M714O = C0393Z0.m714O();
        c0389x0M714O.m695m(i2);
        AbstractC6185M abstractC6185MM12341build = c0389x0M714O.m12341build();
        AbstractC6452k.m12180d(abstractC6185MM12341build, "build(...)");
        return (C0393Z0) abstractC6185MM12341build;
    }

    public static final C0393Z0 encodeValue(double d) {
        C0389X0 c0389x0M714O = C0393Z0.m714O();
        c0389x0M714O.m691g(d);
        AbstractC6185M abstractC6185MM12341build = c0389x0M714O.m12341build();
        AbstractC6452k.m12180d(abstractC6185MM12341build, "build(...)");
        return (C0393Z0) abstractC6185MM12341build;
    }

    public static final C0393Z0 encodeValue(float f2) {
        C0389X0 c0389x0M714O = C0393Z0.m714O();
        c0389x0M714O.m691g(f2);
        AbstractC6185M abstractC6185MM12341build = c0389x0M714O.m12341build();
        AbstractC6452k.m12180d(abstractC6185MM12341build, "build(...)");
        return (C0393Z0) abstractC6185MM12341build;
    }

    public static final C0393Z0 encodeValue(Number value) {
        AbstractC6452k.m12181e(value, "value");
        if (value instanceof Long) {
            return encodeValue(value.longValue());
        }
        if (value instanceof Integer) {
            return encodeValue(value.intValue());
        }
        if (value instanceof Double) {
            return encodeValue(value.doubleValue());
        }
        if (value instanceof Float) {
            return encodeValue(value.floatValue());
        }
        throw new IllegalArgumentException("Unexpected number type: " + value);
    }

    public static final C0393Z0 encodeValue(String value) {
        AbstractC6452k.m12181e(value, "value");
        C0389X0 c0389x0M714O = C0393Z0.m714O();
        c0389x0M714O.m701t(value);
        AbstractC6185M abstractC6185MM12341build = c0389x0M714O.m12341build();
        AbstractC6452k.m12180d(abstractC6185MM12341build, "build(...)");
        return (C0393Z0) abstractC6185MM12341build;
    }

    public static final C0393Z0 encodeValue(ResourcePath value) {
        AbstractC6452k.m12181e(value, "value");
        C0389X0 c0389x0M714O = C0393Z0.m714O();
        c0389x0M714O.m700s("/" + value.canonicalString());
        AbstractC6185M abstractC6185MM12341build = c0389x0M714O.m12341build();
        AbstractC6452k.m12180d(abstractC6185MM12341build, "build(...)");
        return (C0393Z0) abstractC6185MM12341build;
    }

    public static final C0393Z0 encodeValue(Date date) {
        AbstractC6452k.m12181e(date, "date");
        return encodeValue(new Timestamp(date));
    }

    public static final C0393Z0 encodeValue(Timestamp timestamp) {
        AbstractC6452k.m12181e(timestamp, "timestamp");
        return encodeValue(timestamp(timestamp.getSeconds(), timestamp.getNanoseconds()));
    }

    public static final C0393Z0 encodeValue(C6197S0 value) {
        AbstractC6452k.m12181e(value, "value");
        C0389X0 c0389x0M714O = C0393Z0.m714O();
        c0389x0M714O.m703v(value);
        AbstractC6185M abstractC6185MM12341build = c0389x0M714O.m12341build();
        AbstractC6452k.m12180d(abstractC6185MM12341build, "build(...)");
        return (C0393Z0) abstractC6185MM12341build;
    }

    public static final C0393Z0 encodeValue(boolean z) {
        return z ? TRUE_VALUE : FALSE_VALUE;
    }

    public static final C0393Z0 encodeValue(GeoPoint geoPoint) {
        AbstractC6452k.m12181e(geoPoint, "geoPoint");
        C0389X0 c0389x0M714O = C0393Z0.m714O();
        C0499a c0499aM1189j = C0500b.m1189j();
        c0499aM1189j.m1184b(geoPoint.getLatitude());
        c0499aM1189j.m1185c(geoPoint.getLongitude());
        c0389x0M714O.m694l(c0499aM1189j);
        AbstractC6185M abstractC6185MM12341build = c0389x0M714O.m12341build();
        AbstractC6452k.m12180d(abstractC6185MM12341build, "build(...)");
        return (C0393Z0) abstractC6185MM12341build;
    }

    public static final C0393Z0 encodeValue(byte[] value) {
        AbstractC6452k.m12181e(value, "value");
        C0389X0 c0389x0M714O = C0393Z0.m714O();
        c0389x0M714O.m690f(AbstractC6251n.m11896j(value, 0, value.length));
        AbstractC6185M abstractC6185MM12341build = c0389x0M714O.m12341build();
        AbstractC6452k.m12180d(abstractC6185MM12341build, "build(...)");
        return (C0393Z0) abstractC6185MM12341build;
    }

    public static final C0393Z0 encodeValue(Blob value) {
        AbstractC6452k.m12181e(value, "value");
        C0389X0 c0389x0M714O = C0393Z0.m714O();
        c0389x0M714O.m690f(value.toByteString());
        AbstractC6185M abstractC6185MM12341build = c0389x0M714O.m12341build();
        AbstractC6452k.m12180d(abstractC6185MM12341build, "build(...)");
        return (C0393Z0) abstractC6185MM12341build;
    }

    public static final C0393Z0 encodeValue(DocumentReference docRef) {
        AbstractC6452k.m12181e(docRef, "docRef");
        C0389X0 c0389x0M714O = C0393Z0.m714O();
        c0389x0M714O.m700s(docRef.getFullPath());
        AbstractC6185M abstractC6185MM12341build = c0389x0M714O.m12341build();
        AbstractC6452k.m12180d(abstractC6185MM12341build, "build(...)");
        return (C0393Z0) abstractC6185MM12341build;
    }

    public static final C0393Z0 encodeValue(VectorValue vector) {
        AbstractC6452k.m12181e(vector, "vector");
        double[] array = vector.toArray();
        AbstractC6452k.m12180d(array, "toArray(...)");
        return encodeVectorValue(array);
    }

    public static final C0393Z0 encodeValue(Map<String, C0393Z0> map) {
        AbstractC6452k.m12181e(map, "map");
        C0389X0 c0389x0M714O = C0393Z0.m714O();
        C0371O c0371oM646k = C0375Q.m646k();
        c0371oM646k.m633c(map);
        c0389x0M714O.m696o(c0371oM646k);
        AbstractC6185M abstractC6185MM12341build = c0389x0M714O.m12341build();
        AbstractC6452k.m12180d(abstractC6185MM12341build, "build(...)");
        return (C0393Z0) abstractC6185MM12341build;
    }

    public static final C0393Z0 encodeValue(Iterable<C0393Z0> values) {
        AbstractC6452k.m12181e(values, "values");
        C0389X0 c0389x0M714O = C0393Z0.m714O();
        C0403d c0403dM798k = C0406e.m798k();
        c0403dM798k.m787b(values);
        c0389x0M714O.m687c(c0403dM798k);
        AbstractC6185M abstractC6185MM12341build = c0389x0M714O.m12341build();
        AbstractC6452k.m12180d(abstractC6185MM12341build, "build(...)");
        return (C0393Z0) abstractC6185MM12341build;
    }
}
