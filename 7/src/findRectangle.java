public class findRectangle {
    int[] height;
    String word;

    public findRectangle(int[] height, String word){
        this.height = height;
        this.word = word;
    }

    public int designerPdfViewer() {
        int max = 0;
        for(char ch:word.toCharArray())
            if(height[(int)ch - 97] > max)max = height[(int)ch - 97];
        return word.length()*max;

    }
}