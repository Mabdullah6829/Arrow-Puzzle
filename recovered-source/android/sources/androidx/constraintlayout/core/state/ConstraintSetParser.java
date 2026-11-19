package androidx.constraintlayout.core.state;

import androidx.constraintlayout.core.motion.utils.TypedBundle;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.core.parser.CLArray;
import androidx.constraintlayout.core.parser.CLElement;
import androidx.constraintlayout.core.parser.CLKey;
import androidx.constraintlayout.core.parser.CLNumber;
import androidx.constraintlayout.core.parser.CLObject;
import androidx.constraintlayout.core.parser.CLParser;
import androidx.constraintlayout.core.parser.CLParsingException;
import androidx.constraintlayout.core.parser.CLString;
import androidx.constraintlayout.core.state.helpers.BarrierReference;
import androidx.constraintlayout.core.state.helpers.ChainReference;
import androidx.constraintlayout.core.state.helpers.FlowReference;
import androidx.constraintlayout.core.state.helpers.GridReference;
import androidx.constraintlayout.core.state.helpers.GuidelineReference;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import p011H.AbstractC0271e0;

/* JADX INFO: loaded from: classes.dex */
public class ConstraintSetParser {
    private static final boolean PARSER_DEBUG = false;

    public static class DesignElement {
        String mId;
        HashMap<String, String> mParams;
        String mType;

        public DesignElement(String str, String str2, HashMap<String, String> map) {
            this.mId = str;
            this.mType = str2;
            this.mParams = map;
        }

        public String getId() {
            return this.mId;
        }

        public HashMap<String, String> getParams() {
            return this.mParams;
        }

        public String getType() {
            return this.mType;
        }
    }

    public static class FiniteGenerator implements GeneratedValue {
        float mFrom;
        float mInitial;
        float mMax;
        String mPostfix;
        String mPrefix;
        float mStep;
        float mTo;
        boolean mStop = false;
        float mCurrent = 0.0f;

        public FiniteGenerator(float f2, float f3, float f4, String str, String str2) {
            this.mFrom = f2;
            this.mTo = f3;
            this.mStep = f4;
            this.mPrefix = str == null ? "" : str;
            this.mPostfix = str2 == null ? "" : str2;
            this.mMax = f3;
            this.mInitial = f2;
        }

        public ArrayList<String> array() {
            ArrayList<String> arrayList = new ArrayList<>();
            int i2 = (int) this.mInitial;
            int i3 = (int) this.mMax;
            int i4 = i2;
            while (i2 <= i3) {
                arrayList.add(this.mPrefix + i4 + this.mPostfix);
                i4 += (int) this.mStep;
                i2++;
            }
            return arrayList;
        }

        @Override // androidx.constraintlayout.core.state.ConstraintSetParser.GeneratedValue
        public float value() {
            float f2 = this.mCurrent;
            if (f2 >= this.mMax) {
                this.mStop = true;
            }
            if (!this.mStop) {
                this.mCurrent = f2 + this.mStep;
            }
            return this.mCurrent;
        }
    }

    public interface GeneratedValue {
        float value();
    }

    public static class Generator implements GeneratedValue {
        float mCurrent;
        float mIncrementBy;
        float mStart;
        boolean mStop = false;

        public Generator(float f2, float f3) {
            this.mStart = f2;
            this.mIncrementBy = f3;
            this.mCurrent = f2;
        }

        @Override // androidx.constraintlayout.core.state.ConstraintSetParser.GeneratedValue
        public float value() {
            if (!this.mStop) {
                this.mCurrent += this.mIncrementBy;
            }
            return this.mCurrent;
        }
    }

    public static class LayoutVariables {
        HashMap<String, Integer> mMargins = new HashMap<>();
        HashMap<String, GeneratedValue> mGenerators = new HashMap<>();
        HashMap<String, ArrayList<String>> mArrayIds = new HashMap<>();

        public float get(Object obj) {
            if (!(obj instanceof CLString)) {
                if (obj instanceof CLNumber) {
                    return ((CLNumber) obj).getFloat();
                }
                return 0.0f;
            }
            String strContent = ((CLString) obj).content();
            if (this.mGenerators.containsKey(strContent)) {
                return this.mGenerators.get(strContent).value();
            }
            if (this.mMargins.containsKey(strContent)) {
                return this.mMargins.get(strContent).floatValue();
            }
            return 0.0f;
        }

        public ArrayList<String> getList(String str) {
            if (this.mArrayIds.containsKey(str)) {
                return this.mArrayIds.get(str);
            }
            return null;
        }

        public void put(String str, int i2) {
            this.mMargins.put(str, Integer.valueOf(i2));
        }

        public void putOverride(String str, float f2) {
            this.mGenerators.put(str, new OverrideValue(f2));
        }

        public void put(String str, float f2, float f3) {
            if (this.mGenerators.containsKey(str) && (this.mGenerators.get(str) instanceof OverrideValue)) {
                return;
            }
            this.mGenerators.put(str, new Generator(f2, f3));
        }

        public void put(String str, float f2, float f3, float f4, String str2, String str3) {
            if (this.mGenerators.containsKey(str) && (this.mGenerators.get(str) instanceof OverrideValue)) {
                return;
            }
            FiniteGenerator finiteGenerator = new FiniteGenerator(f2, f3, f4, str2, str3);
            this.mGenerators.put(str, finiteGenerator);
            this.mArrayIds.put(str, finiteGenerator.array());
        }

        public void put(String str, ArrayList<String> arrayList) {
            this.mArrayIds.put(str, arrayList);
        }
    }

    public enum MotionLayoutDebugFlags {
        NONE,
        SHOW_ALL,
        UNKNOWN
    }

    public static class OverrideValue implements GeneratedValue {
        float mValue;

        public OverrideValue(float f2) {
            this.mValue = f2;
        }

        @Override // androidx.constraintlayout.core.state.ConstraintSetParser.GeneratedValue
        public float value() {
            return this.mValue;
        }
    }

    public static void applyAttribute(State state, LayoutVariables layoutVariables, ConstraintReference constraintReference, CLObject cLObject, String str) throws CLParsingException {
        str.getClass();
        switch (str) {
            case "centerVertically":
                String string = cLObject.getString(str);
                boolean zEquals = string.equals("parent");
                Object obj = string;
                if (zEquals) {
                    obj = State.PARENT;
                }
                ConstraintReference constraintReferenceConstraints = state.constraints(obj);
                constraintReference.topToTop(constraintReferenceConstraints);
                constraintReference.bottomToBottom(constraintReferenceConstraints);
                break;
            case "center":
                String string2 = cLObject.getString(str);
                ConstraintReference constraintReferenceConstraints2 = string2.equals("parent") ? state.constraints(State.PARENT) : state.constraints(string2);
                constraintReference.startToStart(constraintReferenceConstraints2);
                constraintReference.endToEnd(constraintReferenceConstraints2);
                constraintReference.topToTop(constraintReferenceConstraints2);
                constraintReference.bottomToBottom(constraintReferenceConstraints2);
                break;
            case "custom":
                parseCustomProperties(cLObject, constraintReference, str);
                break;
            case "rotationX":
                constraintReference.rotationX(layoutVariables.get(cLObject.get(str)));
                break;
            case "rotationY":
                constraintReference.rotationY(layoutVariables.get(cLObject.get(str)));
                break;
            case "rotationZ":
                constraintReference.rotationZ(layoutVariables.get(cLObject.get(str)));
                break;
            case "translationX":
                constraintReference.translationX(toPix(state, layoutVariables.get(cLObject.get(str))));
                break;
            case "translationY":
                constraintReference.translationY(toPix(state, layoutVariables.get(cLObject.get(str))));
                break;
            case "translationZ":
                constraintReference.translationZ(toPix(state, layoutVariables.get(cLObject.get(str))));
                break;
            case "height":
                constraintReference.setHeight(parseDimension(cLObject, str, state, state.getDpToPixel()));
                break;
            case "motion":
                parseMotionProperties(cLObject.get(str), constraintReference);
                break;
            case "pivotX":
                constraintReference.pivotX(layoutVariables.get(cLObject.get(str)));
                break;
            case "pivotY":
                constraintReference.pivotY(layoutVariables.get(cLObject.get(str)));
                break;
            case "scaleX":
                constraintReference.scaleX(layoutVariables.get(cLObject.get(str)));
                break;
            case "scaleY":
                constraintReference.scaleY(layoutVariables.get(cLObject.get(str)));
                break;
            case "hRtlBias":
                float f2 = layoutVariables.get(cLObject.get(str));
                if (state.isRtl()) {
                    f2 = 1.0f - f2;
                }
                constraintReference.horizontalBias(f2);
                break;
            case "vWeight":
                constraintReference.setVerticalChainWeight(layoutVariables.get(cLObject.get(str)));
                break;
            case "alpha":
                constraintReference.alpha(layoutVariables.get(cLObject.get(str)));
                break;
            case "hBias":
                constraintReference.horizontalBias(layoutVariables.get(cLObject.get(str)));
                break;
            case "vBias":
                constraintReference.verticalBias(layoutVariables.get(cLObject.get(str)));
                break;
            case "width":
                constraintReference.setWidth(parseDimension(cLObject, str, state, state.getDpToPixel()));
                break;
            case "hWeight":
                constraintReference.setHorizontalChainWeight(layoutVariables.get(cLObject.get(str)));
                break;
            case "centerHorizontally":
                String string3 = cLObject.getString(str);
                boolean zEquals2 = string3.equals("parent");
                Object obj2 = string3;
                if (zEquals2) {
                    obj2 = State.PARENT;
                }
                ConstraintReference constraintReferenceConstraints3 = state.constraints(obj2);
                constraintReference.startToStart(constraintReferenceConstraints3);
                constraintReference.endToEnd(constraintReferenceConstraints3);
                break;
            case "visibility":
                String string4 = cLObject.getString(str);
                string4.getClass();
                switch (string4) {
                    case "invisible":
                        constraintReference.visibility(4);
                        constraintReference.alpha(0.0f);
                        break;
                    case "gone":
                        constraintReference.visibility(8);
                        break;
                    case "visible":
                        constraintReference.visibility(0);
                        break;
                }
                break;
            default:
                parseConstraint(state, layoutVariables, cLObject, constraintReference, str);
                break;
        }
    }

    private static int indexOf(String str, String... strArr) {
        for (int i2 = 0; i2 < strArr.length; i2++) {
            if (strArr[i2].equals(str)) {
                return i2;
            }
        }
        return -1;
    }

    public static String lookForType(CLObject cLObject) {
        ArrayList<String> arrayListNames = cLObject.names();
        int size = arrayListNames.size();
        int i2 = 0;
        while (i2 < size) {
            String str = arrayListNames.get(i2);
            i2++;
            if (str.equals("type")) {
                return cLObject.getString("type");
            }
        }
        return null;
    }

    public static void override(CLObject cLObject, String str, CLObject cLObject2) throws CLParsingException {
        if (!cLObject.has(str)) {
            cLObject.put(str, cLObject2);
            return;
        }
        CLObject object = cLObject.getObject(str);
        ArrayList<String> arrayListNames = cLObject2.names();
        int size = arrayListNames.size();
        int i2 = 0;
        while (i2 < size) {
            String str2 = arrayListNames.get(i2);
            i2++;
            String str3 = str2;
            if (str3.equals("clear")) {
                CLArray array = cLObject2.getArray("clear");
                for (int i3 = 0; i3 < array.size(); i3++) {
                    String stringOrNull = array.getStringOrNull(i3);
                    if (stringOrNull != null) {
                        switch (stringOrNull) {
                            case "transforms":
                                object.remove("visibility");
                                object.remove("alpha");
                                object.remove("pivotX");
                                object.remove("pivotY");
                                object.remove("rotationX");
                                object.remove("rotationY");
                                object.remove("rotationZ");
                                object.remove("scaleX");
                                object.remove("scaleY");
                                object.remove("translationX");
                                object.remove("translationY");
                                break;
                            case "constraints":
                                object.remove("start");
                                object.remove("end");
                                object.remove("top");
                                object.remove("bottom");
                                object.remove("baseline");
                                object.remove("center");
                                object.remove("centerHorizontally");
                                object.remove("centerVertically");
                                break;
                            case "dimensions":
                                object.remove("width");
                                object.remove("height");
                                break;
                            default:
                                object.remove(stringOrNull);
                                break;
                        }
                    }
                }
            } else {
                object.put(str3, cLObject2.get(str3));
            }
        }
    }

    public static void parseBarrier(State state, String str, CLObject cLObject) throws CLParsingException {
        boolean zIsRtl = state.isRtl();
        BarrierReference barrierReferenceBarrier = state.barrier(str, State.Direction.END);
        ArrayList<String> arrayListNames = cLObject.names();
        if (arrayListNames == null) {
            return;
        }
        int size = arrayListNames.size();
        int i2 = 0;
        while (i2 < size) {
            String str2 = arrayListNames.get(i2);
            i2++;
            String str3 = str2;
            str3.getClass();
            switch (str3) {
                case "margin":
                    float floatOrNaN = cLObject.getFloatOrNaN(str3);
                    if (Float.isNaN(floatOrNaN)) {
                        break;
                    } else {
                        barrierReferenceBarrier.margin(Float.valueOf(toPix(state, floatOrNaN)));
                        break;
                    }
                    break;
                case "direction":
                    String string = cLObject.getString(str3);
                    string.getClass();
                    switch (string) {
                        case "bottom":
                            barrierReferenceBarrier.setBarrierDirection(State.Direction.BOTTOM);
                            break;
                        case "end":
                            if (zIsRtl) {
                                barrierReferenceBarrier.setBarrierDirection(State.Direction.LEFT);
                                break;
                            } else {
                                barrierReferenceBarrier.setBarrierDirection(State.Direction.RIGHT);
                                break;
                            }
                            break;
                        case "top":
                            barrierReferenceBarrier.setBarrierDirection(State.Direction.TOP);
                            break;
                        case "left":
                            barrierReferenceBarrier.setBarrierDirection(State.Direction.LEFT);
                            break;
                        case "right":
                            barrierReferenceBarrier.setBarrierDirection(State.Direction.RIGHT);
                            break;
                        case "start":
                            if (zIsRtl) {
                                barrierReferenceBarrier.setBarrierDirection(State.Direction.RIGHT);
                                break;
                            } else {
                                barrierReferenceBarrier.setBarrierDirection(State.Direction.LEFT);
                                break;
                            }
                            break;
                    }
                    break;
                case "contains":
                    CLArray arrayOrNull = cLObject.getArrayOrNull(str3);
                    if (arrayOrNull != null) {
                        for (int i3 = 0; i3 < arrayOrNull.size(); i3++) {
                            barrierReferenceBarrier.add(state.constraints(arrayOrNull.get(i3).content()));
                        }
                        break;
                    } else {
                        break;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0085  */
    public static void parseChain(int i2, State state, LayoutVariables layoutVariables, CLArray cLArray) throws CLParsingException {
        String strContent;
        ChainReference chainReferenceHorizontalChain = i2 == 0 ? state.horizontalChain() : state.verticalChain();
        CLElement cLElement = cLArray.get(1);
        if (cLElement instanceof CLArray) {
            CLArray cLArray2 = (CLArray) cLElement;
            if (cLArray2.size() < 1) {
                return;
            }
            for (int i3 = 0; i3 < cLArray2.size(); i3++) {
                chainReferenceHorizontalChain.add(cLArray2.getString(i3));
            }
            if (cLArray.size() > 2) {
                CLElement cLElement2 = cLArray.get(2);
                if (cLElement2 instanceof CLObject) {
                    CLObject cLObject = (CLObject) cLElement2;
                    ArrayList<String> arrayListNames = cLObject.names();
                    int size = arrayListNames.size();
                    int i4 = 0;
                    while (i4 < size) {
                        String str = arrayListNames.get(i4);
                        i4++;
                        String str2 = str;
                        str2.getClass();
                        if (str2.equals("style")) {
                            CLElement cLElement3 = cLObject.get(str2);
                            if (cLElement3 instanceof CLArray) {
                                CLArray cLArray3 = (CLArray) cLElement3;
                                if (cLArray3.size() > 1) {
                                    strContent = cLArray3.getString(0);
                                    chainReferenceHorizontalChain.bias(cLArray3.getFloat(1));
                                } else {
                                    strContent = cLElement3.content();
                                }
                            } else {
                                strContent = cLElement3.content();
                            }
                            strContent.getClass();
                            if (strContent.equals("packed")) {
                                chainReferenceHorizontalChain.style(State.Chain.PACKED);
                            } else if (strContent.equals("spread_inside")) {
                                chainReferenceHorizontalChain.style(State.Chain.SPREAD_INSIDE);
                            } else {
                                chainReferenceHorizontalChain.style(State.Chain.SPREAD);
                            }
                        } else {
                            parseConstraint(state, layoutVariables, cLObject, chainReferenceHorizontalChain, str2);
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:46:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:50:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:51:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:54:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:56:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:57:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:59:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:61:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:64:0x0105  */
    /* JADX WARN: Code duplicated, block: B:67:0x010c  */
    /* JADX WARN: Code duplicated, block: B:69:0x0114  */
    /* JADX WARN: Code duplicated, block: B:71:0x011c  */
    /* JADX WARN: Code duplicated, block: B:73:0x012c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:74:0x012e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:75:0x0130 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:76:0x0132  */
    /* JADX WARN: Code duplicated, block: B:78:0x0143  */
    /* JADX WARN: Code duplicated, block: B:79:0x0179  */
    /* JADX WARN: Code duplicated, block: B:81:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:82:0x01be  */
    /* JADX WARN: Code duplicated, block: B:84:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:85:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:89:0x021e  */
    /* JADX WARN: Code duplicated, block: B:93:0x0202 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:94:0x0202 A[SYNTHETIC] */
    private static void parseChainType(String str, State state, String str2, LayoutVariables layoutVariables, CLObject cLObject) throws CLParsingException {
        int i2;
        int i3;
        boolean z;
        float f2;
        float pix;
        float pix2;
        float pix3;
        String strContent;
        int i4 = 0;
        ChainReference chainReferenceHorizontalChain = str.charAt(0) == 'h' ? state.horizontalChain() : state.verticalChain();
        chainReferenceHorizontalChain.setKey(str2);
        ArrayList<String> arrayListNames = cLObject.names();
        int size = arrayListNames.size();
        int i5 = 0;
        while (i5 < size) {
            int i6 = i5 + 1;
            String str3 = arrayListNames.get(i5);
            str3.getClass();
            int i7 = 6;
            int i8 = 4;
            int i9 = 3;
            int i10 = 2;
            int i11 = -1;
            switch (str3) {
                case "bottom":
                    i11 = i4;
                case "contains":
                    i11 = 1;
                case "end":
                    i11 = 2;
                case "top":
                    i11 = 3;
                case "left":
                    i11 = 4;
                case "right":
                    i11 = 5;
                case "start":
                    i11 = 6;
                case "style":
                    i11 = 7;
                default:
                    switch (i11) {
                        case 0:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                            parseConstraint(state, layoutVariables, cLObject, chainReferenceHorizontalChain, str3);
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            i5 = i6;
                            i4 = 0;
                            break;
                        case 1:
                            CLElement cLElement = cLObject.get(str3);
                            if (cLElement instanceof CLArray) {
                                CLArray cLArray = (CLArray) cLElement;
                                if (cLArray.size() >= 1) {
                                    int i12 = i4;
                                    while (i12 < cLArray.size()) {
                                        CLElement cLElement2 = cLArray.get(i12);
                                        if (cLElement2 instanceof CLArray) {
                                            CLArray cLArray2 = (CLArray) cLElement2;
                                            if (cLArray2.size() > 0) {
                                                String strContent2 = cLArray2.get(i4).content();
                                                int size2 = cLArray2.size();
                                                float f3 = Float.NaN;
                                                if (size2 != i10) {
                                                    if (size2 == i9) {
                                                        i3 = i10;
                                                        CLArray cLArray3 = cLArray;
                                                        f2 = cLArray2.getFloat(1);
                                                        cLArray = cLArray3;
                                                        i2 = i9;
                                                        z = true;
                                                        i8 = 4;
                                                        pix = toPix(state, cLArray2.getFloat(i3));
                                                        pix2 = pix;
                                                    } else if (size2 != i8) {
                                                        if (size2 != i7) {
                                                            i2 = i9;
                                                            i3 = i10;
                                                            strContent2 = strContent2;
                                                            f2 = Float.NaN;
                                                            pix = Float.NaN;
                                                            pix2 = Float.NaN;
                                                            f3 = Float.NaN;
                                                            pix3 = Float.NaN;
                                                        } else {
                                                            float f4 = cLArray2.getFloat(1);
                                                            float pix4 = toPix(state, cLArray2.getFloat(i10));
                                                            float pix5 = toPix(state, cLArray2.getFloat(i9));
                                                            float pix6 = toPix(state, cLArray2.getFloat(i8));
                                                            pix3 = toPix(state, cLArray2.getFloat(5));
                                                            strContent2 = strContent2;
                                                            f3 = pix6;
                                                            pix2 = pix5;
                                                            pix = pix4;
                                                            f2 = f4;
                                                            i3 = 2;
                                                            i2 = 3;
                                                        }
                                                        z = true;
                                                    } else {
                                                        float f5 = cLArray2.getFloat(1);
                                                        i3 = 2;
                                                        i2 = 3;
                                                        z = true;
                                                        i8 = 4;
                                                        pix = toPix(state, cLArray2.getFloat(2));
                                                        pix2 = toPix(state, cLArray2.getFloat(3));
                                                        cLArray = cLArray;
                                                        f2 = f5;
                                                    }
                                                    pix3 = f3;
                                                } else {
                                                    i3 = i10;
                                                    float f6 = cLArray2.getFloat(1);
                                                    CLArray cLArray4 = cLArray;
                                                    f2 = f6;
                                                    cLArray = cLArray4;
                                                    i2 = i9;
                                                    z = true;
                                                    strContent2 = strContent2;
                                                    pix = Float.NaN;
                                                    pix2 = Float.NaN;
                                                    f3 = Float.NaN;
                                                    pix3 = Float.NaN;
                                                    i8 = 4;
                                                }
                                                chainReferenceHorizontalChain.addChainElement(strContent2, f2, pix, pix2, f3, pix3);
                                            } else {
                                                cLArray = cLArray;
                                                i8 = i8;
                                                i2 = i9;
                                                i3 = i10;
                                                z = true;
                                            }
                                        } else {
                                            cLArray = cLArray;
                                            i8 = i8;
                                            i2 = i9;
                                            i3 = i10;
                                            z = true;
                                            chainReferenceHorizontalChain.add(cLElement2.content());
                                        }
                                        i12++;
                                        cLArray = cLArray;
                                        i10 = i3;
                                        i8 = i8;
                                        i9 = i2;
                                        i4 = 0;
                                        i7 = 6;
                                    }
                                    break;
                                }
                            }
                            PrintStream printStream = System.err;
                            StringBuilder sbM410r = AbstractC0271e0.m410r(str2, " contains should be an array \"");
                            sbM410r.append(cLElement.content());
                            sbM410r.append("\"");
                            printStream.println(sbM410r.toString());
                            return;
                        case 7:
                            CLElement cLElement3 = cLObject.get(str3);
                            if (cLElement3 instanceof CLArray) {
                                CLArray cLArray5 = (CLArray) cLElement3;
                                if (cLArray5.size() > 1) {
                                    strContent = cLArray5.getString(i4);
                                    chainReferenceHorizontalChain.bias(cLArray5.getFloat(1));
                                } else {
                                    strContent = cLElement3.content();
                                }
                            } else {
                                strContent = cLElement3.content();
                            }
                            strContent.getClass();
                            if (strContent.equals("packed")) {
                                chainReferenceHorizontalChain.style(State.Chain.PACKED);
                            } else if (!strContent.equals("spread_inside")) {
                                chainReferenceHorizontalChain.style(State.Chain.SPREAD);
                            } else {
                                chainReferenceHorizontalChain.style(State.Chain.SPREAD_INSIDE);
                            }
                            break;
                    }
            }
        }
    }

    public static long parseColorString(String str) {
        if (!str.startsWith("#")) {
            return -1L;
        }
        String strSubstring = str.substring(1);
        if (strSubstring.length() == 6) {
            strSubstring = "FF".concat(strSubstring);
        }
        return Long.parseLong(strSubstring, 16);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:106:0x0190  */
    /* JADX WARN: Code duplicated, block: B:128:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:167:0x0266  */
    /* JADX WARN: Code duplicated, block: B:20:0x0085  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:82:0x012d  */
    /* JADX WARN: Failed to find 'out' block for switch in B:53:0x00d0. Please report as an issue. */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r16v5 */
    public static void parseConstraint(State state, LayoutVariables layoutVariables, CLObject cLObject, ConstraintReference constraintReference, String str) throws CLParsingException {
        boolean z;
        char c;
        boolean z2;
        boolean z3;
        ?? r16;
        boolean z4;
        boolean zIsRtl = state.isRtl();
        boolean z5 = !zIsRtl;
        CLArray arrayOrNull = cLObject.getArrayOrNull(str);
        if (arrayOrNull == null || arrayOrNull.size() <= 1) {
            String stringOrNull = cLObject.getStringOrNull(str);
            if (stringOrNull != null) {
                ConstraintReference constraintReferenceConstraints = stringOrNull.equals("parent") ? state.constraints(State.PARENT) : state.constraints(stringOrNull);
                str.getClass();
                switch (str) {
                    case "baseline":
                        state.baselineNeededFor(constraintReference.getKey());
                        state.baselineNeededFor(constraintReferenceConstraints.getKey());
                        constraintReference.baselineToBaseline(constraintReferenceConstraints);
                        break;
                    case "bottom":
                        constraintReference.bottomToBottom(constraintReferenceConstraints);
                        break;
                    case "end":
                        if (zIsRtl) {
                            constraintReference.leftToLeft(constraintReferenceConstraints);
                            break;
                        } else {
                            constraintReference.rightToRight(constraintReferenceConstraints);
                            break;
                        }
                        break;
                    case "top":
                        constraintReference.topToTop(constraintReferenceConstraints);
                        break;
                    case "start":
                        if (zIsRtl) {
                            constraintReference.rightToRight(constraintReferenceConstraints);
                            break;
                        } else {
                            constraintReference.leftToLeft(constraintReferenceConstraints);
                            break;
                        }
                        break;
                }
            }
            return;
        }
        String string = arrayOrNull.getString(0);
        String stringOrNull2 = arrayOrNull.getStringOrNull(1);
        float pix = arrayOrNull.size() > 2 ? toPix(state, layoutVariables.get(arrayOrNull.getOrNull(2))) : 0.0f;
        float pix2 = arrayOrNull.size() > 3 ? toPix(state, layoutVariables.get(arrayOrNull.getOrNull(3))) : 0.0f;
        ConstraintReference constraintReferenceConstraints2 = string.equals("parent") ? state.constraints(State.PARENT) : state.constraints(string);
        str.getClass();
        float f2 = pix;
        switch (str) {
            case "baseline":
                z = true;
                c = 2;
                stringOrNull2.getClass();
                switch (stringOrNull2) {
                    case "baseline":
                        state.baselineNeededFor(constraintReference.getKey());
                        state.baselineNeededFor(constraintReferenceConstraints2.getKey());
                        constraintReference.baselineToBaseline(constraintReferenceConstraints2);
                        break;
                    case "bottom":
                        state.baselineNeededFor(constraintReference.getKey());
                        constraintReference.baselineToBottom(constraintReferenceConstraints2);
                        break;
                    case "top":
                        state.baselineNeededFor(constraintReference.getKey());
                        constraintReference.baselineToTop(constraintReferenceConstraints2);
                        break;
                }
                z2 = z;
                z3 = false;
                break;
            case "circular":
                z = true;
                c = 2;
                constraintReference.circularConstraint(constraintReferenceConstraints2, layoutVariables.get(arrayOrNull.get(1)), arrayOrNull.size() > 2 ? toPix(state, layoutVariables.get(arrayOrNull.getOrNull(2))) : 0.0f);
                z2 = z;
                z3 = false;
                break;
            case "bottom":
                stringOrNull2.getClass();
                switch (stringOrNull2) {
                    case "baseline":
                        state.baselineNeededFor(constraintReferenceConstraints2.getKey());
                        constraintReference.bottomToBaseline(constraintReferenceConstraints2);
                        break;
                    case "bottom":
                        constraintReference.bottomToBottom(constraintReferenceConstraints2);
                        break;
                    case "top":
                        constraintReference.bottomToTop(constraintReferenceConstraints2);
                        break;
                }
                z = true;
                c = 2;
                z2 = z;
                z3 = false;
                break;
            case "end":
                z2 = zIsRtl;
                z = true;
                c = 2;
                z3 = true;
                break;
            case "top":
                stringOrNull2.getClass();
                switch (stringOrNull2) {
                    case "baseline":
                        state.baselineNeededFor(constraintReferenceConstraints2.getKey());
                        constraintReference.topToBaseline(constraintReferenceConstraints2);
                        break;
                    case "bottom":
                        constraintReference.topToBottom(constraintReferenceConstraints2);
                        break;
                    case "top":
                        constraintReference.topToTop(constraintReferenceConstraints2);
                        break;
                }
                z = true;
                c = 2;
                z2 = z;
                z3 = false;
                break;
            case "left":
                z2 = true;
                z = true;
                c = 2;
                z3 = true;
                break;
            case "right":
                z2 = false;
                z = true;
                c = 2;
                z3 = true;
                break;
            case "start":
                z2 = z5;
                z = true;
                c = 2;
                z3 = true;
                break;
            default:
                z = true;
                c = 2;
                z2 = z;
                z3 = false;
                break;
        }
        if (z3) {
            stringOrNull2.getClass();
            switch (stringOrNull2.hashCode()) {
                case 100571:
                    if (!stringOrNull2.equals("end")) {
                        r16 = -1;
                    } else {
                        r16 = 0;
                    }
                    break;
                case 3317767:
                    if (!stringOrNull2.equals("left")) {
                        r16 = -1;
                    } else {
                        r16 = z;
                    }
                    break;
                case 108511772:
                    if (!stringOrNull2.equals("right")) {
                        r16 = -1;
                    } else {
                        r16 = c;
                    }
                    break;
                case 109757538:
                    if (!stringOrNull2.equals("start")) {
                        r16 = -1;
                    } else {
                        r16 = 3;
                    }
                    break;
                default:
                    r16 = -1;
                    break;
            }
            switch (r16) {
                case 0:
                    z4 = zIsRtl;
                    break;
                case 1:
                default:
                    z4 = z;
                    break;
                case 2:
                    z4 = false;
                    break;
                case 3:
                    z4 = z5;
                    break;
            }
            if (z2) {
                if (z4) {
                    constraintReference.leftToLeft(constraintReferenceConstraints2);
                } else {
                    constraintReference.leftToRight(constraintReferenceConstraints2);
                }
            } else if (z4) {
                constraintReference.rightToLeft(constraintReferenceConstraints2);
            } else {
                constraintReference.rightToRight(constraintReferenceConstraints2);
            }
        }
        constraintReference.margin(Float.valueOf(f2)).marginGone(Float.valueOf(pix2));
    }

    public static void parseConstraintSets(CoreMotionScene coreMotionScene, CLObject cLObject) throws CLParsingException {
        ArrayList<String> arrayListNames = cLObject.names();
        if (arrayListNames == null) {
            return;
        }
        int size = arrayListNames.size();
        int i2 = 0;
        while (i2 < size) {
            String str = arrayListNames.get(i2);
            i2++;
            String str2 = str;
            CLObject object = cLObject.getObject(str2);
            String stringOrNull = object.getStringOrNull("Extends");
            if (stringOrNull == null || stringOrNull.isEmpty()) {
                coreMotionScene.setConstraintSetContent(str2, object.toJSON());
            } else {
                String constraintSet = coreMotionScene.getConstraintSet(stringOrNull);
                if (constraintSet != null) {
                    CLObject cLObject2 = CLParser.parse(constraintSet);
                    ArrayList<String> arrayListNames2 = object.names();
                    if (arrayListNames2 != null) {
                        int size2 = arrayListNames2.size();
                        int i3 = 0;
                        while (i3 < size2) {
                            String str3 = arrayListNames2.get(i3);
                            i3++;
                            String str4 = str3;
                            CLElement cLElement = object.get(str4);
                            if (cLElement instanceof CLObject) {
                                override(cLObject2, str4, (CLObject) cLElement);
                            }
                        }
                        coreMotionScene.setConstraintSetContent(str2, cLObject2.toJSON());
                    }
                }
            }
        }
    }

    public static void parseCustomProperties(CLObject cLObject, ConstraintReference constraintReference, String str) throws CLParsingException {
        ArrayList<String> arrayListNames;
        CLObject objectOrNull = cLObject.getObjectOrNull(str);
        if (objectOrNull == null || (arrayListNames = objectOrNull.names()) == null) {
            return;
        }
        int size = arrayListNames.size();
        int i2 = 0;
        while (i2 < size) {
            String str2 = arrayListNames.get(i2);
            i2++;
            String str3 = str2;
            CLElement cLElement = objectOrNull.get(str3);
            if (cLElement instanceof CLNumber) {
                constraintReference.addCustomFloat(str3, cLElement.getFloat());
            } else if (cLElement instanceof CLString) {
                long colorString = parseColorString(cLElement.content());
                if (colorString != -1) {
                    constraintReference.addCustomColor(str3, (int) colorString);
                }
            }
        }
    }

    public static void parseDesignElementsJSON(String str, ArrayList<DesignElement> arrayList) throws CLParsingException {
        CLObject cLObject = CLParser.parse(str);
        ArrayList<String> arrayListNames = cLObject.names();
        if (arrayListNames != null && arrayListNames.size() > 0) {
            String str2 = arrayListNames.get(0);
            CLElement cLElement = cLObject.get(str2);
            str2.getClass();
            if (str2.equals("Design") && (cLElement instanceof CLObject)) {
                CLObject cLObject2 = (CLObject) cLElement;
                ArrayList<String> arrayListNames2 = cLObject2.names();
                for (int i2 = 0; i2 < arrayListNames2.size(); i2++) {
                    String str3 = arrayListNames2.get(i2);
                    CLObject cLObject3 = (CLObject) cLObject2.get(str3);
                    System.out.printf(AbstractC0271e0.m399g("element found ", str3, ""), new Object[0]);
                    String stringOrNull = cLObject3.getStringOrNull("type");
                    if (stringOrNull != null) {
                        HashMap map = new HashMap();
                        int size = cLObject3.size();
                        for (int i3 = 0; i3 < size; i3++) {
                            CLKey cLKey = (CLKey) cLObject3.get(i2);
                            String strContent = cLKey.content();
                            String strContent2 = cLKey.getValue().content();
                            if (strContent2 != null) {
                                map.put(strContent, strContent2);
                            }
                        }
                        arrayList.add(new DesignElement(str2, stringOrNull, map));
                    }
                }
            }
        }
    }

    public static Dimension parseDimension(CLObject cLObject, String str, State state, CorePixelDp corePixelDp) throws CLParsingException {
        CLElement cLElement = cLObject.get(str);
        Dimension dimensionCreateFixed = Dimension.createFixed(0);
        if (cLElement instanceof CLString) {
            return parseDimensionMode(cLElement.content());
        }
        if (cLElement instanceof CLNumber) {
            return Dimension.createFixed(state.convertDimension(Float.valueOf(corePixelDp.toPixels(cLObject.getFloat(str)))));
        }
        if (cLElement instanceof CLObject) {
            CLObject cLObject2 = (CLObject) cLElement;
            String stringOrNull = cLObject2.getStringOrNull("value");
            if (stringOrNull != null) {
                dimensionCreateFixed = parseDimensionMode(stringOrNull);
            }
            CLElement orNull = cLObject2.getOrNull("min");
            if (orNull != null) {
                if (orNull instanceof CLNumber) {
                    dimensionCreateFixed.min(state.convertDimension(Float.valueOf(corePixelDp.toPixels(((CLNumber) orNull).getFloat()))));
                } else if (orNull instanceof CLString) {
                    dimensionCreateFixed.min(Dimension.WRAP_DIMENSION);
                }
            }
            CLElement orNull2 = cLObject2.getOrNull("max");
            if (orNull2 != null) {
                if (orNull2 instanceof CLNumber) {
                    dimensionCreateFixed.max(state.convertDimension(Float.valueOf(corePixelDp.toPixels(((CLNumber) orNull2).getFloat()))));
                    return dimensionCreateFixed;
                }
                if (orNull2 instanceof CLString) {
                    dimensionCreateFixed.max(Dimension.WRAP_DIMENSION);
                }
            }
        }
        return dimensionCreateFixed;
    }

    public static Dimension parseDimensionMode(String str) {
        Dimension dimensionCreateFixed = Dimension.createFixed(0);
        str.getClass();
        switch (str) {
            case "preferWrap":
                return Dimension.createSuggested(Dimension.WRAP_DIMENSION);
            case "parent":
                return Dimension.createParent();
            case "spread":
                return Dimension.createSuggested(Dimension.SPREAD_DIMENSION);
            case "wrap":
                return Dimension.createWrap();
            default:
                if (str.endsWith("%")) {
                    return Dimension.createPercent(0, Float.parseFloat(str.substring(0, str.indexOf(37))) / 100.0f).suggested(0);
                }
                return str.contains(":") ? Dimension.createRatio(str).suggested(Dimension.SPREAD_DIMENSION) : dimensionCreateFixed;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:10:0x0040  */
    /* JADX WARN: Code duplicated, block: B:111:0x0228  */
    /* JADX WARN: Code duplicated, block: B:131:0x0294  */
    /* JADX WARN: Code duplicated, block: B:141:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:153:0x0337  */
    /* JADX WARN: Code duplicated, block: B:181:0x03ac  */
    /* JADX WARN: Code duplicated, block: B:197:0x0408  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static void parseFlowType(String str, State state, String str2, LayoutVariables layoutVariables, CLObject cLObject) throws CLParsingException {
        int i2;
        int i3;
        int i4;
        String strContent;
        String string;
        String string2;
        Float fValueOf;
        Float fValueOf2;
        Float fValueOf3;
        int i5;
        String strContent2;
        String string3;
        String string4;
        float f2;
        float f3;
        float f4;
        float f5;
        Float fValueOf4;
        Float fValueOf5;
        Float fValueOf6;
        float f6;
        float pix;
        float pix2;
        float f7;
        float f8 = 0.5f;
        Float fValueOf7 = Float.valueOf(0.5f);
        int i6 = 0;
        int i7 = 1;
        FlowReference flow = state.getFlow(str2, str.charAt(0) == 'v');
        ArrayList<String> arrayListNames = cLObject.names();
        int size = arrayListNames.size();
        int i8 = 0;
        while (i8 < size) {
            String str3 = arrayListNames.get(i8);
            i8++;
            String str4 = str3;
            str4.getClass();
            int i9 = 3;
            float f9 = f8;
            int i10 = 2;
            switch (str4.hashCode()) {
                case -1254185091:
                    if (!str4.equals("hAlign")) {
                        i2 = -1;
                    } else {
                        i2 = i6;
                    }
                    break;
                case -1237307863:
                    if (!str4.equals("hStyle")) {
                        i2 = -1;
                    } else {
                        i2 = i7;
                    }
                    break;
                case -1198076529:
                    if (!str4.equals("hFlowBias")) {
                        i2 = -1;
                    } else {
                        i2 = 2;
                    }
                    break;
                case -853376977:
                    if (!str4.equals("vAlign")) {
                        i2 = -1;
                    } else {
                        i2 = 3;
                    }
                    break;
                case -836499749:
                    if (!str4.equals("vStyle")) {
                        i2 = -1;
                    } else {
                        i2 = 4;
                    }
                    break;
                case -806339567:
                    if (!str4.equals("padding")) {
                        i2 = -1;
                    } else {
                        i2 = 5;
                    }
                    break;
                case -732635235:
                    if (!str4.equals("vFlowBias")) {
                        i2 = -1;
                    } else {
                        i2 = 6;
                    }
                    break;
                case -567445985:
                    if (!str4.equals("contains")) {
                        i2 = -1;
                    } else {
                        i2 = 7;
                    }
                    break;
                case -488900360:
                    if (!str4.equals("maxElement")) {
                        i2 = -1;
                    } else {
                        i2 = 8;
                    }
                    break;
                case 3169614:
                    if (!str4.equals("hGap")) {
                        i2 = -1;
                    } else {
                        i2 = 9;
                    }
                    break;
                case 3575610:
                    if (!str4.equals("type")) {
                        i2 = -1;
                    } else {
                        i2 = 10;
                    }
                    break;
                case 3586688:
                    if (!str4.equals("vGap")) {
                        i2 = -1;
                    } else {
                        i2 = 11;
                    }
                    break;
                case 3657802:
                    if (!str4.equals("wrap")) {
                        i2 = -1;
                    } else {
                        i2 = 12;
                    }
                    break;
                default:
                    i2 = -1;
                    break;
            }
            switch (i2) {
                case 0:
                    String strContent3 = cLObject.get(str4).content();
                    strContent3.getClass();
                    if (strContent3.equals("end")) {
                        i3 = 0;
                        i4 = 1;
                        flow.setHorizontalAlign(1);
                    } else {
                        if (strContent3.equals("start")) {
                            i3 = 0;
                            flow.setHorizontalAlign(0);
                        } else {
                            flow.setHorizontalAlign(2);
                            i3 = 0;
                        }
                        i4 = 1;
                    }
                    i6 = i3;
                    i7 = i4;
                    f8 = f9;
                    break;
                case 1:
                    CLElement cLElement = cLObject.get(str4);
                    if (cLElement instanceof CLArray) {
                        CLArray cLArray = (CLArray) cLElement;
                        if (cLArray.size() > 1) {
                            string = cLArray.getString(0);
                            strContent = cLArray.getString(1);
                            string2 = cLArray.size() > 2 ? cLArray.getString(2) : "";
                        } else {
                            strContent = cLElement.content();
                            string = "";
                            string2 = string;
                        }
                    } else {
                        strContent = cLElement.content();
                        string = "";
                        string2 = string;
                    }
                    if (!strContent.equals("")) {
                        flow.setHorizontalStyle(State.Chain.getValueByString(strContent));
                    }
                    if (!string.equals("")) {
                        flow.setFirstHorizontalStyle(State.Chain.getValueByString(string));
                    }
                    if (!string2.equals("")) {
                        flow.setLastHorizontalStyle(State.Chain.getValueByString(string2));
                    }
                    i3 = 0;
                    i4 = 1;
                    i6 = i3;
                    i7 = i4;
                    f8 = f9;
                    break;
                case 2:
                    int i11 = i7;
                    CLElement cLElement2 = cLObject.get(str4);
                    if (cLElement2 instanceof CLArray) {
                        CLArray cLArray2 = (CLArray) cLElement2;
                        if (cLArray2.size() > i11) {
                            fValueOf2 = Float.valueOf(cLArray2.getFloat(0));
                            fValueOf = Float.valueOf(cLArray2.getFloat(i11));
                            fValueOf3 = cLArray2.size() > 2 ? Float.valueOf(cLArray2.getFloat(2)) : fValueOf7;
                        } else {
                            fValueOf = Float.valueOf(cLElement2.getFloat());
                            fValueOf2 = fValueOf7;
                            fValueOf3 = fValueOf2;
                        }
                    } else {
                        fValueOf = Float.valueOf(cLElement2.getFloat());
                        fValueOf2 = fValueOf7;
                        fValueOf3 = fValueOf2;
                    }
                    flow.horizontalBias(fValueOf.floatValue());
                    if (fValueOf2.floatValue() != f9) {
                        flow.setFirstHorizontalBias(fValueOf2.floatValue());
                    }
                    if (fValueOf3.floatValue() != f9) {
                        flow.setLastHorizontalBias(fValueOf3.floatValue());
                    }
                    i3 = 0;
                    i4 = 1;
                    i6 = i3;
                    i7 = i4;
                    f8 = f9;
                    break;
                case 3:
                    String strContent4 = cLObject.get(str4).content();
                    strContent4.getClass();
                    switch (strContent4) {
                        case "baseline":
                            i5 = 1;
                            flow.setVerticalAlign(3);
                            break;
                        case "bottom":
                            i5 = 1;
                            flow.setVerticalAlign(1);
                            break;
                        case "top":
                            flow.setVerticalAlign(0);
                            i5 = 1;
                            break;
                        default:
                            flow.setVerticalAlign(2);
                            i5 = 1;
                            break;
                    }
                    i4 = i5;
                    i3 = 0;
                    i6 = i3;
                    i7 = i4;
                    f8 = f9;
                    break;
                case 4:
                    CLElement cLElement3 = cLObject.get(str4);
                    if (cLElement3 instanceof CLArray) {
                        CLArray cLArray3 = (CLArray) cLElement3;
                        if (cLArray3.size() > 1) {
                            string3 = cLArray3.getString(0);
                            strContent2 = cLArray3.getString(1);
                            string4 = cLArray3.size() > 2 ? cLArray3.getString(2) : "";
                        } else {
                            strContent2 = cLElement3.content();
                            string3 = "";
                            string4 = string3;
                        }
                    } else {
                        strContent2 = cLElement3.content();
                        string3 = "";
                        string4 = string3;
                    }
                    if (!strContent2.equals("")) {
                        flow.setVerticalStyle(State.Chain.getValueByString(strContent2));
                    }
                    if (!string3.equals("")) {
                        flow.setFirstVerticalStyle(State.Chain.getValueByString(string3));
                    }
                    if (!string4.equals("")) {
                        flow.setLastVerticalStyle(State.Chain.getValueByString(string4));
                    }
                    i3 = 0;
                    i4 = 1;
                    i6 = i3;
                    i7 = i4;
                    f8 = f9;
                    break;
                case 5:
                    CLElement cLElement4 = cLObject.get(str4);
                    if (cLElement4 instanceof CLArray) {
                        CLArray cLArray4 = (CLArray) cLElement4;
                        if (cLArray4.size() > 1) {
                            f2 = cLArray4.getInt(0);
                            f5 = cLArray4.getInt(1);
                            if (cLArray4.size() > 2) {
                                f4 = cLArray4.getInt(2);
                                try {
                                    f3 = ((CLArray) cLElement4).getInt(3);
                                } catch (ArrayIndexOutOfBoundsException unused) {
                                    f3 = 0.0f;
                                }
                            } else {
                                f4 = f2;
                                f3 = f5;
                            }
                        } else {
                            f2 = cLElement4.getInt();
                            f3 = f2;
                            f4 = f3;
                            f5 = f4;
                        }
                    } else {
                        f2 = cLElement4.getInt();
                        f3 = f2;
                        f4 = f3;
                        f5 = f4;
                    }
                    flow.setPaddingLeft(Math.round(toPix(state, f2)));
                    flow.setPaddingTop(Math.round(toPix(state, f5)));
                    flow.setPaddingRight(Math.round(toPix(state, f4)));
                    flow.setPaddingBottom(Math.round(toPix(state, f3)));
                    i3 = 0;
                    i4 = 1;
                    i6 = i3;
                    i7 = i4;
                    f8 = f9;
                    break;
                case 6:
                    CLElement cLElement5 = cLObject.get(str4);
                    if (cLElement5 instanceof CLArray) {
                        CLArray cLArray5 = (CLArray) cLElement5;
                        if (cLArray5.size() > 1) {
                            fValueOf5 = Float.valueOf(cLArray5.getFloat(0));
                            fValueOf4 = Float.valueOf(cLArray5.getFloat(1));
                            fValueOf6 = cLArray5.size() > 2 ? Float.valueOf(cLArray5.getFloat(2)) : fValueOf7;
                        } else {
                            fValueOf4 = Float.valueOf(cLElement5.getFloat());
                            fValueOf5 = fValueOf7;
                            fValueOf6 = fValueOf5;
                        }
                    } else {
                        fValueOf4 = Float.valueOf(cLElement5.getFloat());
                        fValueOf5 = fValueOf7;
                        fValueOf6 = fValueOf5;
                    }
                    try {
                        flow.verticalBias(fValueOf4.floatValue());
                        if (fValueOf5.floatValue() != f9) {
                            flow.setFirstVerticalBias(fValueOf5.floatValue());
                        }
                        if (fValueOf6.floatValue() != f9) {
                            flow.setLastVerticalBias(fValueOf6.floatValue());
                        }
                    } catch (NumberFormatException unused2) {
                    }
                    i3 = 0;
                    i4 = 1;
                    i6 = i3;
                    i7 = i4;
                    f8 = f9;
                    break;
                case 7:
                    CLElement cLElement6 = cLObject.get(str4);
                    if (cLElement6 instanceof CLArray) {
                        CLArray cLArray6 = (CLArray) cLElement6;
                        if (cLArray6.size() >= i7) {
                            int i12 = i6;
                            while (i12 < cLArray6.size()) {
                                CLElement cLElement7 = cLArray6.get(i12);
                                if (cLElement7 instanceof CLArray) {
                                    CLArray cLArray7 = (CLArray) cLElement7;
                                    if (cLArray7.size() > 0) {
                                        String strContent5 = cLArray7.get(i6).content();
                                        int size2 = cLArray7.size();
                                        if (size2 != i10) {
                                            if (size2 == i9) {
                                                f7 = cLArray7.getFloat(1);
                                                pix = toPix(state, cLArray7.getFloat(2));
                                                pix2 = pix;
                                            } else if (size2 != 4) {
                                                f6 = Float.NaN;
                                                pix = Float.NaN;
                                            } else {
                                                f7 = cLArray7.getFloat(1);
                                                pix2 = toPix(state, cLArray7.getFloat(i10));
                                                pix = toPix(state, cLArray7.getFloat(3));
                                            }
                                            f6 = f7;
                                            flow.addFlowElement(strContent5, f6, pix2, pix);
                                        } else {
                                            f6 = cLArray7.getFloat(1);
                                            pix = Float.NaN;
                                        }
                                        pix2 = pix;
                                        flow.addFlowElement(strContent5, f6, pix2, pix);
                                    }
                                } else {
                                    flow.add(cLElement7.content());
                                }
                                i12++;
                                i10 = 2;
                                i6 = 0;
                                i7 = 1;
                                i9 = 3;
                            }
                            i4 = i7;
                            i3 = i6;
                            i6 = i3;
                            i7 = i4;
                            f8 = f9;
                            break;
                        }
                    }
                    PrintStream printStream = System.err;
                    StringBuilder sbM410r = AbstractC0271e0.m410r(str2, " contains should be an array \"");
                    sbM410r.append(cLElement6.content());
                    sbM410r.append("\"");
                    printStream.println(sbM410r.toString());
                    break;
                case 8:
                    flow.setMaxElementsWrap(cLObject.get(str4).getInt());
                    i4 = i7;
                    i3 = i6;
                    i6 = i3;
                    i7 = i4;
                    f8 = f9;
                    break;
                case 9:
                    flow.setHorizontalGap(cLObject.get(str4).getInt());
                    i4 = i7;
                    i3 = i6;
                    i6 = i3;
                    i7 = i4;
                    f8 = f9;
                    break;
                case 10:
                    if (cLObject.get(str4).content().equals("hFlow")) {
                        flow.setOrientation(i6);
                    } else {
                        flow.setOrientation(i7);
                    }
                    i4 = i7;
                    i3 = i6;
                    i6 = i3;
                    i7 = i4;
                    f8 = f9;
                    break;
                case 11:
                    flow.setVerticalGap(cLObject.get(str4).getInt());
                    i4 = i7;
                    i3 = i6;
                    i6 = i3;
                    i7 = i4;
                    f8 = f9;
                    break;
                case 12:
                    flow.setWrapMode(State.Wrap.getValueByString(cLObject.get(str4).content()));
                    i4 = i7;
                    i3 = i6;
                    i6 = i3;
                    i7 = i4;
                    f8 = f9;
                    break;
                default:
                    applyAttribute(state, layoutVariables, state.constraints(str2), cLObject, str4);
                    i4 = i7;
                    i3 = i6;
                    i6 = i3;
                    i7 = i4;
                    f8 = f9;
                    break;
            }
            return;
        }
    }

    public static void parseGenerate(State state, LayoutVariables layoutVariables, CLObject cLObject) throws CLParsingException {
        ArrayList<String> arrayListNames = cLObject.names();
        if (arrayListNames == null) {
            return;
        }
        int size = arrayListNames.size();
        int i2 = 0;
        while (i2 < size) {
            String str = arrayListNames.get(i2);
            i2++;
            String str2 = str;
            CLElement cLElement = cLObject.get(str2);
            ArrayList<String> list = layoutVariables.getList(str2);
            if (list != null && (cLElement instanceof CLObject)) {
                int size2 = list.size();
                int i3 = 0;
                while (i3 < size2) {
                    String str3 = list.get(i3);
                    i3++;
                    parseWidget(state, layoutVariables, str3, (CLObject) cLElement);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:118:0x01ed  */
    private static void parseGridType(String str, State state, String str2, LayoutVariables layoutVariables, CLObject cLObject) throws CLParsingException {
        float f2;
        float f3;
        float f4;
        float f5;
        int i2;
        GridReference grid = state.getGrid(str2, str);
        ArrayList<String> arrayListNames = cLObject.names();
        int size = arrayListNames.size();
        int i3 = 0;
        while (i3 < size) {
            String str3 = arrayListNames.get(i3);
            i3++;
            String str4 = str3;
            str4.getClass();
            switch (str4) {
                case "orientation":
                    grid.setOrientation(cLObject.get(str4).getInt());
                    break;
                case "padding":
                    CLElement cLElement = cLObject.get(str4);
                    if (cLElement instanceof CLArray) {
                        CLArray cLArray = (CLArray) cLElement;
                        if (cLArray.size() > 1) {
                            f2 = cLArray.getInt(0);
                            f5 = cLArray.getInt(1);
                            if (cLArray.size() > 2) {
                                f4 = cLArray.getInt(2);
                                try {
                                    f3 = ((CLArray) cLElement).getInt(3);
                                } catch (ArrayIndexOutOfBoundsException unused) {
                                    f3 = 0.0f;
                                }
                            } else {
                                f3 = f5;
                                f4 = f2;
                            }
                        } else {
                            f2 = cLElement.getInt();
                            f3 = f2;
                            f4 = f3;
                            f5 = f4;
                        }
                    } else {
                        f2 = cLElement.getInt();
                        f3 = f2;
                        f4 = f3;
                        f5 = f4;
                    }
                    grid.setPaddingStart(Math.round(toPix(state, f2)));
                    grid.setPaddingTop(Math.round(toPix(state, f5)));
                    grid.setPaddingEnd(Math.round(toPix(state, f4)));
                    grid.setPaddingBottom(Math.round(toPix(state, f3)));
                    break;
                case "contains":
                    CLArray arrayOrNull = cLObject.getArrayOrNull(str4);
                    if (arrayOrNull != null) {
                        for (int i4 = 0; i4 < arrayOrNull.size(); i4++) {
                            grid.add(state.constraints(arrayOrNull.get(i4).content()));
                        }
                        break;
                    } else {
                        break;
                    }
                    break;
                case "hGap":
                    grid.setHorizontalGaps(toPix(state, cLObject.get(str4).getFloat()));
                    break;
                case "rows":
                    int i5 = cLObject.get(str4).getInt();
                    if (i5 > 0) {
                        grid.setRowsSet(i5);
                        break;
                    } else {
                        break;
                    }
                    break;
                case "vGap":
                    grid.setVerticalGaps(toPix(state, cLObject.get(str4).getFloat()));
                    break;
                case "flags":
                    String strContent = "";
                    try {
                        CLElement cLElement2 = cLObject.get(str4);
                        if (cLElement2 instanceof CLNumber) {
                            i2 = cLElement2.getInt();
                        } else {
                            strContent = cLElement2.content();
                            i2 = 0;
                        }
                    } catch (Exception e) {
                        System.err.println("Error parsing grid flags " + e);
                    }
                    if (strContent != null && !strContent.isEmpty()) {
                        grid.setFlags(strContent);
                        break;
                    } else {
                        grid.setFlags(i2);
                        break;
                    }
                    break;
                case "skips":
                    String strContent2 = cLObject.get(str4).content();
                    if (strContent2 == null || !strContent2.contains(":")) {
                        break;
                    } else {
                        grid.setSkips(strContent2);
                        break;
                    }
                    break;
                case "spans":
                    String strContent3 = cLObject.get(str4).content();
                    if (strContent3 == null || !strContent3.contains(":")) {
                        break;
                    } else {
                        grid.setSpans(strContent3);
                        break;
                    }
                    break;
                case "rowWeights":
                    String strContent4 = cLObject.get(str4).content();
                    if (strContent4 == null || !strContent4.contains(",")) {
                        break;
                    } else {
                        grid.setRowWeights(strContent4);
                        break;
                    }
                    break;
                case "columns":
                    int i6 = cLObject.get(str4).getInt();
                    if (i6 > 0) {
                        grid.setColumnsSet(i6);
                        break;
                    } else {
                        break;
                    }
                    break;
                case "columnWeights":
                    String strContent5 = cLObject.get(str4).content();
                    if (strContent5 == null || !strContent5.contains(",")) {
                        break;
                    } else {
                        grid.setColumnWeights(strContent5);
                        break;
                    }
                    break;
                default:
                    applyAttribute(state, layoutVariables, state.constraints(str2), cLObject, str4);
                    break;
            }
        }
    }

    public static void parseGuideline(int i2, State state, CLArray cLArray) throws CLParsingException {
        CLObject cLObject;
        String stringOrNull;
        CLElement cLElement = cLArray.get(1);
        if ((cLElement instanceof CLObject) && (stringOrNull = (cLObject = (CLObject) cLElement).getStringOrNull("id")) != null) {
            parseGuidelineParams(i2, state, stringOrNull, cLObject);
        }
    }

    public static void parseGuidelineParams(int i2, State state, String str, CLObject cLObject) throws CLParsingException {
        float pix;
        ArrayList<String> arrayListNames = cLObject.names();
        if (arrayListNames == null) {
            return;
        }
        ConstraintReference constraintReferenceConstraints = state.constraints(str);
        if (i2 == 0) {
            state.horizontalGuideline(str);
        } else {
            state.verticalGuideline(str);
        }
        boolean z = !state.isRtl() || i2 == 0;
        GuidelineReference guidelineReference = (GuidelineReference) constraintReferenceConstraints.getFacade();
        int size = arrayListNames.size();
        float pix2 = 0.0f;
        boolean z2 = false;
        boolean z3 = true;
        int i3 = 0;
        while (i3 < size) {
            String str2 = arrayListNames.get(i3);
            i3++;
            String str3 = str2;
            str3.getClass();
            switch (str3) {
                case "percent":
                    CLArray arrayOrNull = cLObject.getArrayOrNull(str3);
                    if (arrayOrNull != null) {
                        if (arrayOrNull.size() > 1) {
                            String string = arrayOrNull.getString(0);
                            float f2 = arrayOrNull.getFloat(1);
                            string.getClass();
                            switch (string) {
                                case "end":
                                    z3 = !z;
                                    pix2 = f2;
                                    break;
                                case "left":
                                    pix2 = f2;
                                    z2 = true;
                                    z3 = true;
                                    break;
                                case "right":
                                    pix2 = f2;
                                    z3 = false;
                                    break;
                                case "start":
                                    z3 = z;
                                    pix2 = f2;
                                    break;
                                default:
                                    pix2 = f2;
                                    break;
                            }
                        }
                        z2 = true;
                        break;
                    } else {
                        pix2 = cLObject.getFloat(str3);
                        z2 = true;
                        z3 = true;
                        break;
                    }
                    break;
                case "end":
                    pix = toPix(state, cLObject.getFloat(str3));
                    z3 = !z;
                    pix2 = pix;
                    break;
                case "left":
                    pix2 = toPix(state, cLObject.getFloat(str3));
                    z3 = true;
                    break;
                case "right":
                    pix2 = toPix(state, cLObject.getFloat(str3));
                    z3 = false;
                    break;
                case "start":
                    pix = toPix(state, cLObject.getFloat(str3));
                    z3 = z;
                    pix2 = pix;
                    break;
                default:
                    break;
            }
        }
        if (z2) {
            if (z3) {
                guidelineReference.percent(pix2);
                return;
            } else {
                guidelineReference.percent(1.0f - pix2);
                return;
            }
        }
        if (z3) {
            guidelineReference.start(Float.valueOf(pix2));
        } else {
            guidelineReference.end(Float.valueOf(pix2));
        }
    }

    public static void parseHeader(CoreMotionScene coreMotionScene, CLObject cLObject) {
        String stringOrNull = cLObject.getStringOrNull("export");
        if (stringOrNull != null) {
            coreMotionScene.setDebugName(stringOrNull);
        }
    }

    public static void parseHelpers(State state, LayoutVariables layoutVariables, CLArray cLArray) throws CLParsingException {
        for (int i2 = 0; i2 < cLArray.size(); i2++) {
            CLElement cLElement = cLArray.get(i2);
            if (cLElement instanceof CLArray) {
                CLArray cLArray2 = (CLArray) cLElement;
                if (cLArray2.size() > 1) {
                    String string = cLArray2.getString(0);
                    string.getClass();
                    switch (string) {
                        case "vGuideline":
                            parseGuideline(1, state, cLArray2);
                            break;
                        case "hChain":
                            parseChain(0, state, layoutVariables, cLArray2);
                            break;
                        case "vChain":
                            parseChain(1, state, layoutVariables, cLArray2);
                            break;
                        case "hGuideline":
                            parseGuideline(0, state, cLArray2);
                            break;
                    }
                }
            }
        }
    }

    public static void parseJSON(String str, Transition transition, int i2) {
        CLObject objectOrNull;
        try {
            CLObject cLObject = CLParser.parse(str);
            ArrayList<String> arrayListNames = cLObject.names();
            if (arrayListNames == null) {
                return;
            }
            int size = arrayListNames.size();
            int i3 = 0;
            while (i3 < size) {
                String str2 = arrayListNames.get(i3);
                i3++;
                String str3 = str2;
                CLElement cLElement = cLObject.get(str3);
                if ((cLElement instanceof CLObject) && (objectOrNull = ((CLObject) cLElement).getObjectOrNull("custom")) != null) {
                    ArrayList<String> arrayListNames2 = objectOrNull.names();
                    int size2 = arrayListNames2.size();
                    int i4 = 0;
                    while (i4 < size2) {
                        String str4 = arrayListNames2.get(i4);
                        i4++;
                        String str5 = str4;
                        CLElement cLElement2 = objectOrNull.get(str5);
                        if (cLElement2 instanceof CLNumber) {
                            transition.addCustomFloat(i2, str3, str5, cLElement2.getFloat());
                        } else if (cLElement2 instanceof CLString) {
                            long colorString = parseColorString(cLElement2.content());
                            if (colorString != -1) {
                                transition.addCustomColor(i2, str3, str5, (int) colorString);
                            }
                        }
                    }
                }
            }
        } catch (CLParsingException e) {
            System.err.println("Error parsing JSON " + e);
        }
    }

    private static void parseMotionProperties(CLElement cLElement, ConstraintReference constraintReference) throws CLParsingException {
        if (cLElement instanceof CLObject) {
            CLObject cLObject = (CLObject) cLElement;
            TypedBundle typedBundle = new TypedBundle();
            ArrayList<String> arrayListNames = cLObject.names();
            if (arrayListNames == null) {
                return;
            }
            int size = arrayListNames.size();
            int i2 = 0;
            while (i2 < size) {
                String str = arrayListNames.get(i2);
                i2++;
                String str2 = str;
                str2.getClass();
                switch (str2) {
                    case "stagger":
                        typedBundle.add(600, cLObject.getFloat(str2));
                        break;
                    case "easing":
                        typedBundle.add(TypedValues.MotionType.TYPE_EASING, cLObject.getString(str2));
                        break;
                    case "quantize":
                        CLElement cLElement2 = cLObject.get(str2);
                        if (cLElement2 instanceof CLArray) {
                            CLArray cLArray = (CLArray) cLElement2;
                            int size2 = cLArray.size();
                            if (size2 > 0) {
                                typedBundle.add(TypedValues.MotionType.TYPE_QUANTIZE_MOTIONSTEPS, cLArray.getInt(0));
                                if (size2 > 1) {
                                    typedBundle.add(TypedValues.MotionType.TYPE_QUANTIZE_INTERPOLATOR_TYPE, cLArray.getString(1));
                                    if (size2 > 2) {
                                        typedBundle.add(TypedValues.MotionType.TYPE_QUANTIZE_MOTION_PHASE, cLArray.getFloat(2));
                                    }
                                }
                            }
                            break;
                        } else {
                            typedBundle.add(TypedValues.MotionType.TYPE_QUANTIZE_MOTIONSTEPS, cLObject.getInt(str2));
                            break;
                        }
                        break;
                    case "pathArc":
                        String string = cLObject.getString(str2);
                        int iIndexOf = indexOf(string, "none", "startVertical", "startHorizontal", "flip", "below", "above");
                        if (iIndexOf == -1) {
                            System.err.println(cLObject.getLine() + " pathArc = '" + string + "'");
                            break;
                        } else {
                            typedBundle.add(TypedValues.MotionType.TYPE_PATHMOTION_ARC, iIndexOf);
                            break;
                        }
                        break;
                    case "relativeTo":
                        typedBundle.add(TypedValues.MotionType.TYPE_ANIMATE_RELATIVE_TO, cLObject.getString(str2));
                        break;
                }
            }
            constraintReference.mMotionProperties = typedBundle;
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x005a  */
    public static void parseMotionSceneJSON(CoreMotionScene coreMotionScene, String str) {
        byte b;
        try {
            CLObject cLObject = CLParser.parse(str);
            ArrayList<String> arrayListNames = cLObject.names();
            if (arrayListNames == null) {
                return;
            }
            int size = arrayListNames.size();
            int i2 = 0;
            while (i2 < size) {
                String str2 = arrayListNames.get(i2);
                i2++;
                String str3 = str2;
                CLElement cLElement = cLObject.get(str3);
                if (cLElement instanceof CLObject) {
                    CLObject cLObject2 = (CLObject) cLElement;
                    int iHashCode = str3.hashCode();
                    if (iHashCode != -2137403731) {
                        if (iHashCode != -241441378) {
                            if (iHashCode == 1101852654 && str3.equals("ConstraintSets")) {
                                b = 0;
                            } else {
                                b = -1;
                            }
                        } else if (str3.equals(TypedValues.TransitionType.NAME)) {
                            b = 1;
                        } else {
                            b = -1;
                        }
                    } else if (str3.equals("Header")) {
                        b = 2;
                    } else {
                        b = -1;
                    }
                    if (b == 0) {
                        parseConstraintSets(coreMotionScene, cLObject2);
                    } else if (b == 1) {
                        parseTransitions(coreMotionScene, cLObject2);
                    } else if (b == 2) {
                        parseHeader(coreMotionScene, cLObject2);
                    }
                }
            }
        } catch (CLParsingException e) {
            System.err.println("Error parsing JSON " + e);
        }
    }

    public static void parseTransitions(CoreMotionScene coreMotionScene, CLObject cLObject) {
        ArrayList<String> arrayListNames = cLObject.names();
        if (arrayListNames == null) {
            return;
        }
        int size = arrayListNames.size();
        int i2 = 0;
        while (i2 < size) {
            String str = arrayListNames.get(i2);
            i2++;
            String str2 = str;
            coreMotionScene.setTransitionContent(str2, cLObject.getObject(str2).toJSON());
        }
    }

    private static void parseVariables(State state, LayoutVariables layoutVariables, CLObject cLObject) throws CLParsingException {
        ArrayList<String> arrayListNames = cLObject.names();
        if (arrayListNames == null) {
            return;
        }
        int size = arrayListNames.size();
        int i2 = 0;
        while (i2 < size) {
            String str = arrayListNames.get(i2);
            i2++;
            String str2 = str;
            CLElement cLElement = cLObject.get(str2);
            if (cLElement instanceof CLNumber) {
                layoutVariables.put(str2, cLElement.getInt());
            } else if (cLElement instanceof CLObject) {
                CLObject cLObject2 = (CLObject) cLElement;
                if (cLObject2.has("from") && cLObject2.has(TypedValues.TransitionType.S_TO)) {
                    layoutVariables.put(str2, layoutVariables.get(cLObject2.get("from")), layoutVariables.get(cLObject2.get(TypedValues.TransitionType.S_TO)), 1.0f, cLObject2.getStringOrNull("prefix"), cLObject2.getStringOrNull("postfix"));
                } else if (cLObject2.has("from") && cLObject2.has("step")) {
                    layoutVariables.put(str2, layoutVariables.get(cLObject2.get("from")), layoutVariables.get(cLObject2.get("step")));
                } else if (cLObject2.has("ids")) {
                    CLArray array = cLObject2.getArray("ids");
                    ArrayList<String> arrayList = new ArrayList<>();
                    for (int i3 = 0; i3 < array.size(); i3++) {
                        arrayList.add(array.getString(i3));
                    }
                    layoutVariables.put(str2, arrayList);
                } else if (cLObject2.has("tag")) {
                    layoutVariables.put(str2, state.getIdsForTag(cLObject2.getString("tag")));
                }
            }
        }
    }

    public static void parseWidget(State state, LayoutVariables layoutVariables, String str, CLObject cLObject) throws CLParsingException {
        parseWidget(state, layoutVariables, state.constraints(str), cLObject);
    }

    public static void populateState(CLObject cLObject, State state, LayoutVariables layoutVariables) throws CLParsingException {
        ArrayList<String> arrayListNames = cLObject.names();
        if (arrayListNames == null) {
            return;
        }
        int size = arrayListNames.size();
        int i2 = 0;
        while (i2 < size) {
            String str = arrayListNames.get(i2);
            i2++;
            String str2 = str;
            CLElement cLElement = cLObject.get(str2);
            str2.getClass();
            switch (str2) {
                case "Helpers":
                    if (cLElement instanceof CLArray) {
                        parseHelpers(state, layoutVariables, (CLArray) cLElement);
                        break;
                    } else {
                        break;
                    }
                    break;
                case "Generate":
                    if (cLElement instanceof CLObject) {
                        parseGenerate(state, layoutVariables, (CLObject) cLElement);
                        break;
                    } else {
                        break;
                    }
                    break;
                case "Variables":
                    if (cLElement instanceof CLObject) {
                        parseVariables(state, layoutVariables, (CLObject) cLElement);
                        break;
                    } else {
                        break;
                    }
                    break;
                default:
                    if (cLElement instanceof CLObject) {
                        CLObject cLObject2 = (CLObject) cLElement;
                        String strLookForType = lookForType(cLObject2);
                        if (strLookForType != null) {
                            switch (strLookForType) {
                                case "vGuideline":
                                    parseGuidelineParams(1, state, str2, cLObject2);
                                    break;
                                case "column":
                                case "row":
                                case "grid":
                                    parseGridType(strLookForType, state, str2, layoutVariables, cLObject2);
                                    break;
                                case "hChain":
                                case "vChain":
                                    parseChainType(strLookForType, state, str2, layoutVariables, cLObject2);
                                    break;
                                case "barrier":
                                    parseBarrier(state, str2, cLObject2);
                                    break;
                                case "hFlow":
                                case "vFlow":
                                    parseFlowType(strLookForType, state, str2, layoutVariables, cLObject2);
                                    break;
                                case "hGuideline":
                                    parseGuidelineParams(0, state, str2, cLObject2);
                                    break;
                            }
                        } else {
                            parseWidget(state, layoutVariables, str2, cLObject2);
                            break;
                        }
                    } else {
                        if (cLElement instanceof CLNumber) {
                            layoutVariables.put(str2, cLElement.getInt());
                        }
                        break;
                    }
                    break;
            }
        }
    }

    private static float toPix(State state, float f2) {
        return state.getDpToPixel().toPixels(f2);
    }

    public static void parseWidget(State state, LayoutVariables layoutVariables, ConstraintReference constraintReference, CLObject cLObject) throws CLParsingException {
        if (constraintReference.getWidth() == null) {
            constraintReference.setWidth(Dimension.createWrap());
        }
        if (constraintReference.getHeight() == null) {
            constraintReference.setHeight(Dimension.createWrap());
        }
        ArrayList<String> arrayListNames = cLObject.names();
        if (arrayListNames == null) {
            return;
        }
        int size = arrayListNames.size();
        int i2 = 0;
        while (i2 < size) {
            String str = arrayListNames.get(i2);
            i2++;
            applyAttribute(state, layoutVariables, constraintReference, cLObject, str);
        }
    }

    public static void parseJSON(String str, State state, LayoutVariables layoutVariables) {
        try {
            populateState(CLParser.parse(str), state, layoutVariables);
        } catch (CLParsingException e) {
            System.err.println("Error parsing JSON " + e);
        }
    }
}
