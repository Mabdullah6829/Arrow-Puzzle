package androidx.constraintlayout.core.parser;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class CLArray extends CLContainer {
    public CLArray(char[] cArr) {
        super(cArr);
    }

    public static CLElement allocate(char[] cArr) {
        return new CLArray(cArr);
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    public String toFormattedJSON(int i2, int i3) {
        StringBuilder sb = new StringBuilder();
        String json = toJSON();
        if (i3 > 0 || json.length() + i2 >= CLElement.sMaxLine) {
            sb.append("[\n");
            ArrayList<CLElement> arrayList = this.mElements;
            int size = arrayList.size();
            int i4 = 0;
            boolean z = true;
            while (i4 < size) {
                CLElement cLElement = arrayList.get(i4);
                i4++;
                CLElement cLElement2 = cLElement;
                if (z) {
                    z = false;
                } else {
                    sb.append(",\n");
                }
                addIndent(sb, CLElement.sBaseIndent + i2);
                sb.append(cLElement2.toFormattedJSON(CLElement.sBaseIndent + i2, i3 - 1));
            }
            sb.append("\n");
            addIndent(sb, i2);
            sb.append("]");
        } else {
            sb.append(json);
        }
        return sb.toString();
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    public String toJSON() {
        StringBuilder sb = new StringBuilder(getDebugName() + "[");
        boolean z = true;
        for (int i2 = 0; i2 < this.mElements.size(); i2++) {
            if (z) {
                z = false;
            } else {
                sb.append(", ");
            }
            sb.append(this.mElements.get(i2).toJSON());
        }
        return ((Object) sb) + "]";
    }
}
