package UkazkaQS.java;

class Quicksort {
    static void qsort(char prvky[]) {
        qs(prvky, 0, prvky.length-1);
    }

    private static void qs(char prvky[], int lavy, int pravy)
    {
        int i, j;
        char x, y;
        i = lavy; j = pravy;
        x = prvky[(lavy + pravy) / 2];

        do {
            while((prvky[i] < x) && (i < pravy)) i++;
            while((x < prvky[j]) && (j > lavy)) j--;

            if (i <= j) {
                y = prvky[i];
                prvky[i] = prvky[j];
                prvky[j] = y;
                i++; j--;
            }
        } while(i <= j);

        if (lavy < j) qs(prvky, lavy, j);
        if (i < pravy) qs(prvky, i, pravy);
    }
}

class UkazkaQS {
    public static void main(String[] args) {
        char pole[] = { 'd', 'x', 'a', 'r', 'p', 'j', 'i' };
        int i;

        System.out.print("Pôvodné pole: ");
        for (i=0; i<pole.length; i++)
            System.out.print(pole[i]);
        System.out.println();

        Quicksort.qsort(pole);
        System.out.print("Zoradené pole: ");
        for (i=0; i<pole.length; i++)
            System.out.print(pole[i]);
    }
}
