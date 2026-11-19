package androidx.constraintlayout.core.parser;

import java.util.ArrayList;
import java.util.Objects;
import p011H.AbstractC0271e0;

/* JADX INFO: loaded from: classes.dex */
public class CLContainer extends CLElement {
    ArrayList<CLElement> mElements;

    public CLContainer(char[] cArr) {
        super(cArr);
        this.mElements = new ArrayList<>();
    }

    public static CLElement allocate(char[] cArr) {
        return new CLContainer(cArr);
    }

    public void add(CLElement cLElement) {
        this.mElements.add(cLElement);
        if (CLParser.sDebug) {
            System.out.println("added element " + cLElement + " to " + this);
        }
    }

    public void clear() {
        this.mElements.clear();
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CLContainer) {
            return this.mElements.equals(((CLContainer) obj).mElements);
        }
        return false;
    }

    public CLElement get(String str) throws CLParsingException {
        ArrayList<CLElement> arrayList = this.mElements;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            CLElement cLElement = arrayList.get(i2);
            i2++;
            CLKey cLKey = (CLKey) cLElement;
            if (cLKey.content().equals(str)) {
                return cLKey.getValue();
            }
        }
        throw new CLParsingException(AbstractC0271e0.m399g("no element for key <", str, ">"), this);
    }

    public CLArray getArray(String str) throws CLParsingException {
        CLElement cLElement = get(str);
        if (cLElement instanceof CLArray) {
            return (CLArray) cLElement;
        }
        StringBuilder sbM411s = AbstractC0271e0.m411s("no array found for key <", str, ">, found [");
        sbM411s.append(cLElement.getStrClass());
        sbM411s.append("] : ");
        sbM411s.append(cLElement);
        throw new CLParsingException(sbM411s.toString(), this);
    }

    public CLArray getArrayOrCreate(String str) {
        CLArray arrayOrNull = getArrayOrNull(str);
        if (arrayOrNull != null) {
            return arrayOrNull;
        }
        CLArray cLArray = new CLArray(new char[0]);
        put(str, cLArray);
        return cLArray;
    }

    public CLArray getArrayOrNull(String str) {
        CLElement orNull = getOrNull(str);
        if (orNull instanceof CLArray) {
            return (CLArray) orNull;
        }
        return null;
    }

    public boolean getBoolean(String str) throws CLParsingException {
        CLElement cLElement = get(str);
        if (cLElement instanceof CLToken) {
            return ((CLToken) cLElement).getBoolean();
        }
        StringBuilder sbM411s = AbstractC0271e0.m411s("no boolean found for key <", str, ">, found [");
        sbM411s.append(cLElement.getStrClass());
        sbM411s.append("] : ");
        sbM411s.append(cLElement);
        throw new CLParsingException(sbM411s.toString(), this);
    }

    public float getFloat(String str) throws CLParsingException {
        CLElement cLElement = get(str);
        if (cLElement != null) {
            return cLElement.getFloat();
        }
        StringBuilder sbM411s = AbstractC0271e0.m411s("no float found for key <", str, ">, found [");
        sbM411s.append(cLElement.getStrClass());
        sbM411s.append("] : ");
        sbM411s.append(cLElement);
        throw new CLParsingException(sbM411s.toString(), this);
    }

    public float getFloatOrNaN(String str) {
        CLElement orNull = getOrNull(str);
        if (orNull instanceof CLNumber) {
            return orNull.getFloat();
        }
        return Float.NaN;
    }

    public int getInt(String str) throws CLParsingException {
        CLElement cLElement = get(str);
        if (cLElement != null) {
            return cLElement.getInt();
        }
        StringBuilder sbM411s = AbstractC0271e0.m411s("no int found for key <", str, ">, found [");
        sbM411s.append(cLElement.getStrClass());
        sbM411s.append("] : ");
        sbM411s.append(cLElement);
        throw new CLParsingException(sbM411s.toString(), this);
    }

    public CLObject getObject(String str) throws CLParsingException {
        CLElement cLElement = get(str);
        if (cLElement instanceof CLObject) {
            return (CLObject) cLElement;
        }
        StringBuilder sbM411s = AbstractC0271e0.m411s("no object found for key <", str, ">, found [");
        sbM411s.append(cLElement.getStrClass());
        sbM411s.append("] : ");
        sbM411s.append(cLElement);
        throw new CLParsingException(sbM411s.toString(), this);
    }

    public CLObject getObjectOrNull(String str) {
        CLElement orNull = getOrNull(str);
        if (orNull instanceof CLObject) {
            return (CLObject) orNull;
        }
        return null;
    }

    public CLElement getOrNull(String str) {
        ArrayList<CLElement> arrayList = this.mElements;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            CLElement cLElement = arrayList.get(i2);
            i2++;
            CLKey cLKey = (CLKey) cLElement;
            if (cLKey.content().equals(str)) {
                return cLKey.getValue();
            }
        }
        return null;
    }

    public String getString(String str) throws CLParsingException {
        CLElement cLElement = get(str);
        if (cLElement instanceof CLString) {
            return cLElement.content();
        }
        throw new CLParsingException("no string found for key <" + str + ">, found [" + (cLElement != null ? cLElement.getStrClass() : null) + "] : " + cLElement, this);
    }

    public String getStringOrNull(String str) {
        CLElement orNull = getOrNull(str);
        if (orNull instanceof CLString) {
            return orNull.content();
        }
        return null;
    }

    public boolean has(String str) {
        ArrayList<CLElement> arrayList = this.mElements;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            CLElement cLElement = arrayList.get(i2);
            i2++;
            CLElement cLElement2 = cLElement;
            if ((cLElement2 instanceof CLKey) && ((CLKey) cLElement2).content().equals(str)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    public int hashCode() {
        return Objects.hash(this.mElements, Integer.valueOf(super.hashCode()));
    }

    public ArrayList<String> names() {
        ArrayList<String> arrayList = new ArrayList<>();
        ArrayList<CLElement> arrayList2 = this.mElements;
        int size = arrayList2.size();
        int i2 = 0;
        while (i2 < size) {
            CLElement cLElement = arrayList2.get(i2);
            i2++;
            CLElement cLElement2 = cLElement;
            if (cLElement2 instanceof CLKey) {
                arrayList.add(((CLKey) cLElement2).content());
            }
        }
        return arrayList;
    }

    public void put(String str, CLElement cLElement) {
        ArrayList<CLElement> arrayList = this.mElements;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            CLElement cLElement2 = arrayList.get(i2);
            i2++;
            CLKey cLKey = (CLKey) cLElement2;
            if (cLKey.content().equals(str)) {
                cLKey.set(cLElement);
                return;
            }
        }
        this.mElements.add((CLKey) CLKey.allocate(str, cLElement));
    }

    public void putNumber(String str, float f2) {
        put(str, new CLNumber(f2));
    }

    public void putString(String str, String str2) {
        CLString cLString = new CLString(str2.toCharArray());
        cLString.setStart(0L);
        cLString.setEnd(str2.length() - 1);
        put(str, cLString);
    }

    public void remove(String str) {
        ArrayList arrayList = new ArrayList();
        ArrayList<CLElement> arrayList2 = this.mElements;
        int size = arrayList2.size();
        int i2 = 0;
        int i3 = 0;
        while (i3 < size) {
            CLElement cLElement = arrayList2.get(i3);
            i3++;
            CLElement cLElement2 = cLElement;
            if (((CLKey) cLElement2).content().equals(str)) {
                arrayList.add(cLElement2);
            }
        }
        int size2 = arrayList.size();
        while (i2 < size2) {
            Object obj = arrayList.get(i2);
            i2++;
            this.mElements.remove((CLElement) obj);
        }
    }

    public int size() {
        return this.mElements.size();
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    public String toString() {
        StringBuilder sb = new StringBuilder();
        ArrayList<CLElement> arrayList = this.mElements;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            CLElement cLElement = arrayList.get(i2);
            i2++;
            CLElement cLElement2 = cLElement;
            if (sb.length() > 0) {
                sb.append("; ");
            }
            sb.append(cLElement2);
        }
        return super.toString() + " = <" + ((Object) sb) + " >";
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public CLContainer mo12274clone() {
        CLContainer cLContainer = (CLContainer) super.mo12274clone();
        ArrayList<CLElement> arrayList = new ArrayList<>(this.mElements.size());
        ArrayList<CLElement> arrayList2 = this.mElements;
        int size = arrayList2.size();
        int i2 = 0;
        while (i2 < size) {
            CLElement cLElement = arrayList2.get(i2);
            i2++;
            CLElement cLElementMo12274clone = cLElement.mo12274clone();
            cLElementMo12274clone.setContainer(cLContainer);
            arrayList.add(cLElementMo12274clone);
        }
        cLContainer.mElements = arrayList;
        return cLContainer;
    }

    public String getStringOrNull(int i2) {
        CLElement orNull = getOrNull(i2);
        if (orNull instanceof CLString) {
            return orNull.content();
        }
        return null;
    }

    public CLElement getOrNull(int i2) {
        if (i2 < 0 || i2 >= this.mElements.size()) {
            return null;
        }
        return this.mElements.get(i2);
    }

    public String getString(int i2) throws CLParsingException {
        CLElement cLElement = get(i2);
        if (cLElement instanceof CLString) {
            return cLElement.content();
        }
        throw new CLParsingException(AbstractC0271e0.m396d(i2, "no string at index "), this);
    }

    public float getFloat(int i2) throws CLParsingException {
        CLElement cLElement = get(i2);
        if (cLElement != null) {
            return cLElement.getFloat();
        }
        throw new CLParsingException(AbstractC0271e0.m396d(i2, "no float at index "), this);
    }

    public int getInt(int i2) throws CLParsingException {
        CLElement cLElement = get(i2);
        if (cLElement != null) {
            return cLElement.getInt();
        }
        throw new CLParsingException(AbstractC0271e0.m396d(i2, "no int at index "), this);
    }

    public CLArray getArray(int i2) throws CLParsingException {
        CLElement cLElement = get(i2);
        if (cLElement instanceof CLArray) {
            return (CLArray) cLElement;
        }
        throw new CLParsingException(AbstractC0271e0.m396d(i2, "no array at index "), this);
    }

    public boolean getBoolean(int i2) throws CLParsingException {
        CLElement cLElement = get(i2);
        if (cLElement instanceof CLToken) {
            return ((CLToken) cLElement).getBoolean();
        }
        throw new CLParsingException(AbstractC0271e0.m396d(i2, "no boolean at index "), this);
    }

    public CLObject getObject(int i2) throws CLParsingException {
        CLElement cLElement = get(i2);
        if (cLElement instanceof CLObject) {
            return (CLObject) cLElement;
        }
        throw new CLParsingException(AbstractC0271e0.m396d(i2, "no object at index "), this);
    }

    public CLElement get(int i2) throws CLParsingException {
        if (i2 >= 0 && i2 < this.mElements.size()) {
            return this.mElements.get(i2);
        }
        throw new CLParsingException(AbstractC0271e0.m396d(i2, "no element at index "), this);
    }
}
