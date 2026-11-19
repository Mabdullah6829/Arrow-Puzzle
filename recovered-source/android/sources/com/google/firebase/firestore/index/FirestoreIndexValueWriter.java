package com.google.firebase.firestore.index;

import com.google.firebase.firestore.model.ResourcePath;
import com.google.firebase.firestore.model.Values;
import com.google.protobuf.C6197S0;
import java.util.Iterator;
import java.util.Map;
import p022N.C0375Q;
import p022N.C0393Z0;
import p022N.C0406e;
import p022N.EnumC0391Y0;
import p028Q.C0500b;

/* JADX INFO: loaded from: classes2.dex */
public class FirestoreIndexValueWriter {
    public static final int DOCUMENT_NAME_OFFSET = 5;
    public static final int INDEX_TYPE_ARRAY = 50;
    public static final int INDEX_TYPE_BLOB = 30;
    public static final int INDEX_TYPE_BOOLEAN = 10;
    public static final int INDEX_TYPE_GEOPOINT = 45;
    public static final int INDEX_TYPE_MAP = 55;
    public static final int INDEX_TYPE_NAN = 13;
    public static final int INDEX_TYPE_NULL = 5;
    public static final int INDEX_TYPE_NUMBER = 15;
    public static final int INDEX_TYPE_REFERENCE = 37;
    public static final int INDEX_TYPE_REFERENCE_SEGMENT = 60;
    public static final int INDEX_TYPE_STRING = 25;
    public static final int INDEX_TYPE_TIMESTAMP = 20;
    public static final int INDEX_TYPE_VECTOR = 53;
    public static final FirestoreIndexValueWriter INSTANCE = new FirestoreIndexValueWriter();
    public static final int NOT_TRUNCATED = 2;

    /* JADX INFO: renamed from: com.google.firebase.firestore.index.FirestoreIndexValueWriter$1 */
    public static /* synthetic */ class C57671 {
        static final /* synthetic */ int[] $SwitchMap$com$google$firestore$v1$Value$ValueTypeCase;

        static {
            int[] iArr = new int[EnumC0391Y0.values().length];
            $SwitchMap$com$google$firestore$v1$Value$ValueTypeCase = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$firestore$v1$Value$ValueTypeCase[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$firestore$v1$Value$ValueTypeCase[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$firestore$v1$Value$ValueTypeCase[2] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$firestore$v1$Value$ValueTypeCase[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$firestore$v1$Value$ValueTypeCase[5] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$firestore$v1$Value$ValueTypeCase[6] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$google$firestore$v1$Value$ValueTypeCase[7] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$google$firestore$v1$Value$ValueTypeCase[8] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$google$firestore$v1$Value$ValueTypeCase[10] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$google$firestore$v1$Value$ValueTypeCase[9] = 11;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    private FirestoreIndexValueWriter() {
    }

    private void writeIndexArray(C0406e c0406e, DirectionalIndexByteEncoder directionalIndexByteEncoder) {
        writeValueTypeLabel(directionalIndexByteEncoder, 50);
        Iterator it = c0406e.getValuesList().iterator();
        while (it.hasNext()) {
            writeIndexValueAux((C0393Z0) it.next(), directionalIndexByteEncoder);
        }
    }

    private void writeIndexEntityRef(String str, DirectionalIndexByteEncoder directionalIndexByteEncoder) {
        writeValueTypeLabel(directionalIndexByteEncoder, 37);
        ResourcePath resourcePathFromString = ResourcePath.fromString(str);
        int length = resourcePathFromString.length();
        for (int i2 = 5; i2 < length; i2++) {
            String segment = resourcePathFromString.getSegment(i2);
            writeValueTypeLabel(directionalIndexByteEncoder, 60);
            writeUnlabeledIndexString(segment, directionalIndexByteEncoder);
        }
    }

    private void writeIndexMap(C0375Q c0375q, DirectionalIndexByteEncoder directionalIndexByteEncoder) {
        writeValueTypeLabel(directionalIndexByteEncoder, 55);
        for (Map.Entry entry : c0375q.m648h().entrySet()) {
            String str = (String) entry.getKey();
            C0393Z0 c0393z0 = (C0393Z0) entry.getValue();
            writeIndexString(str, directionalIndexByteEncoder);
            writeIndexValueAux(c0393z0, directionalIndexByteEncoder);
        }
    }

    private void writeIndexString(String str, DirectionalIndexByteEncoder directionalIndexByteEncoder) {
        writeValueTypeLabel(directionalIndexByteEncoder, 25);
        writeUnlabeledIndexString(str, directionalIndexByteEncoder);
    }

    private void writeIndexValueAux(C0393Z0 c0393z0, DirectionalIndexByteEncoder directionalIndexByteEncoder) {
        switch (c0393z0.m737G().ordinal()) {
            case 0:
                writeValueTypeLabel(directionalIndexByteEncoder, 5);
                return;
            case 1:
                writeValueTypeLabel(directionalIndexByteEncoder, 10);
                directionalIndexByteEncoder.writeLong(c0393z0.m746u() ? 1L : 0L);
                return;
            case 2:
                writeValueTypeLabel(directionalIndexByteEncoder, 15);
                directionalIndexByteEncoder.writeDouble(c0393z0.m732B());
                return;
            case 3:
                double dM748x = c0393z0.m748x();
                if (Double.isNaN(dM748x)) {
                    writeValueTypeLabel(directionalIndexByteEncoder, 13);
                    return;
                }
                writeValueTypeLabel(directionalIndexByteEncoder, 15);
                if (dM748x == -0.0d) {
                    directionalIndexByteEncoder.writeDouble(0.0d);
                    return;
                } else {
                    directionalIndexByteEncoder.writeDouble(dM748x);
                    return;
                }
            case 4:
                C6197S0 c6197s0M736F = c0393z0.m736F();
                writeValueTypeLabel(directionalIndexByteEncoder, 20);
                directionalIndexByteEncoder.writeLong(c6197s0M736F.m11820i());
                directionalIndexByteEncoder.writeLong(c6197s0M736F.m11819h());
                return;
            case 5:
                writeIndexString(c0393z0.m735E(), directionalIndexByteEncoder);
                writeTruncationMarker(directionalIndexByteEncoder);
                return;
            case 6:
                writeValueTypeLabel(directionalIndexByteEncoder, 30);
                directionalIndexByteEncoder.writeBytes(c0393z0.m747v());
                writeTruncationMarker(directionalIndexByteEncoder);
                return;
            case 7:
                writeIndexEntityRef(c0393z0.m734D(), directionalIndexByteEncoder);
                return;
            case 8:
                C0500b c0500bM731A = c0393z0.m731A();
                writeValueTypeLabel(directionalIndexByteEncoder, 45);
                directionalIndexByteEncoder.writeDouble(c0500bM731A.m1190h());
                directionalIndexByteEncoder.writeDouble(c0500bM731A.m1191i());
                return;
            case 9:
                writeIndexArray(c0393z0.m745t(), directionalIndexByteEncoder);
                writeTruncationMarker(directionalIndexByteEncoder);
                return;
            case 10:
                if (Values.isMaxValue(c0393z0)) {
                    writeValueTypeLabel(directionalIndexByteEncoder, Integer.MAX_VALUE);
                    return;
                } else if (Values.isVectorValue(c0393z0)) {
                    writeIndexVector(c0393z0.m733C(), directionalIndexByteEncoder);
                    return;
                } else {
                    writeIndexMap(c0393z0.m733C(), directionalIndexByteEncoder);
                    writeTruncationMarker(directionalIndexByteEncoder);
                    return;
                }
            default:
                throw new IllegalArgumentException("unknown index value type " + c0393z0.m737G());
        }
    }

    private void writeIndexVector(C0375Q c0375q, DirectionalIndexByteEncoder directionalIndexByteEncoder) {
        Map mapM648h = c0375q.m648h();
        writeValueTypeLabel(directionalIndexByteEncoder, 53);
        int iM800j = ((C0393Z0) mapM648h.get("value")).m745t().m800j();
        writeValueTypeLabel(directionalIndexByteEncoder, 15);
        directionalIndexByteEncoder.writeLong(iM800j);
        writeIndexString("value", directionalIndexByteEncoder);
        writeIndexValueAux((C0393Z0) mapM648h.get("value"), directionalIndexByteEncoder);
    }

    private void writeTruncationMarker(DirectionalIndexByteEncoder directionalIndexByteEncoder) {
        directionalIndexByteEncoder.writeLong(2L);
    }

    private void writeUnlabeledIndexString(String str, DirectionalIndexByteEncoder directionalIndexByteEncoder) {
        directionalIndexByteEncoder.writeString(str);
    }

    private void writeValueTypeLabel(DirectionalIndexByteEncoder directionalIndexByteEncoder, int i2) {
        directionalIndexByteEncoder.writeLong(i2);
    }

    public void writeIndexValue(C0393Z0 c0393z0, DirectionalIndexByteEncoder directionalIndexByteEncoder) {
        writeIndexValueAux(c0393z0, directionalIndexByteEncoder);
        directionalIndexByteEncoder.writeInfinity();
    }
}
