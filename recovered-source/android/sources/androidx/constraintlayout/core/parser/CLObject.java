package androidx.constraintlayout.core.parser;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class CLObject extends CLContainer implements Iterable<CLKey> {

    public static class CLObjectIterator implements Iterator<CLKey> {
        int mIndex = 0;
        CLObject mObject;

        public CLObjectIterator(CLObject cLObject) {
            this.mObject = cLObject;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.mIndex < this.mObject.size();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.Iterator
        public CLKey next() {
            CLKey cLKey = (CLKey) this.mObject.mElements.get(this.mIndex);
            this.mIndex++;
            return cLKey;
        }
    }

    public CLObject(char[] cArr) {
        super(cArr);
    }

    public static CLObject allocate(char[] cArr) {
        return new CLObject(cArr);
    }

    @Override // java.lang.Iterable
    public Iterator<CLKey> iterator() {
        return new CLObjectIterator(this);
    }

    public String toFormattedJSON() {
        return toFormattedJSON(0, 0);
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    public String toJSON() {
        StringBuilder sb = new StringBuilder(getDebugName() + "{ ");
        ArrayList<CLElement> arrayList = this.mElements;
        int size = arrayList.size();
        boolean z = true;
        int i2 = 0;
        while (i2 < size) {
            CLElement cLElement = arrayList.get(i2);
            i2++;
            CLElement cLElement2 = cLElement;
            if (z) {
                z = false;
            } else {
                sb.append(", ");
            }
            sb.append(cLElement2.toJSON());
        }
        sb.append(" }");
        return sb.toString();
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    public String toFormattedJSON(int i2, int i3) {
        StringBuilder sb = new StringBuilder(getDebugName());
        sb.append("{\n");
        ArrayList<CLElement> arrayList = this.mElements;
        int size = arrayList.size();
        boolean z = true;
        int i4 = 0;
        while (i4 < size) {
            CLElement cLElement = arrayList.get(i4);
            i4++;
            CLElement cLElement2 = cLElement;
            if (z) {
                z = false;
            } else {
                sb.append(",\n");
            }
            sb.append(cLElement2.toFormattedJSON(CLElement.sBaseIndent + i2, i3 - 1));
        }
        sb.append("\n");
        addIndent(sb, i2);
        sb.append("}");
        return sb.toString();
    }

    @Override // androidx.constraintlayout.core.parser.CLContainer, androidx.constraintlayout.core.parser.CLElement
    /* JADX INFO: renamed from: clone */
    public CLObject mo12274clone() {
        return (CLObject) super.mo12274clone();
    }
}
