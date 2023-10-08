import java.awt.*;

public class ImageArray {

    public static final int COLOR_YELLOW = new Color(250, 201, 20).getRGB();
    public static final int COLOR_BLUE = new Color(17, 13, 99).getRGB();
    public static final int COLOR_RED = new Color(196, 0, 15).getRGB();
    public static final int COLOR_BLACK = new Color(5, 5, 5).getRGB();
    public static final int COLOR_WHITE = new Color(255, 255, 255).getRGB();
    public static final int COLOR_GREEN = new Color(35, 138, 51).getRGB();

    
    //colombia
    public static int[][] createCOLFlag(int height, int width) {
        int[][] flag = new int[height][width];
        int rowIni = 0;
        int rowEnd = 0;

        rowIni = 0;
        rowEnd = (int) (height * 0.50);
        for (int row = rowIni; row < rowEnd; row++) {
            for (int cell = 0; cell < flag[row].length; cell++) {
                flag[row][cell] = COLOR_YELLOW;
            }

        }
        rowIni = (int) (height * 0.50);
        rowEnd = (int) (height * 0.75);
        for (int row = rowIni; row < rowEnd; row++) {

            for (int cell = 0; cell < flag[row].length; cell++) {
                flag[row][cell] = COLOR_BLUE;
            }
        }
        rowIni = (int) (height * 0.75);
        rowEnd = (int) (height);

        for (int row = rowIni; row < rowEnd; row++) {
            for (int cell = 0; cell < flag[row].length; cell++) {
                flag[row][cell] = COLOR_RED;
            }
        }

        return flag;
    }

    //venezuela
    public static int[][] createVENFlag(int height, int width) {
        int[][] flag = new int[height][width];
        int rowIni = 0;
        int rowEnd = 0;

        rowIni = 0;
        rowEnd = (int) (height * 0.35);
        for (int row = rowIni; row < rowEnd; row++) {
            for (int cell = 0; cell < flag[row].length; cell++) {
                flag[row][cell] = COLOR_YELLOW;
            }

        }
        rowIni = (int) (height * 0.35);
        rowEnd = (int) (height * 0.70);
        for (int row = rowIni; row < rowEnd; row++) {

            for (int cell = 0; cell < flag[row].length; cell++) {
                flag[row][cell] = COLOR_BLUE;
            }
        }
        rowIni = (int) (height * 0.70);
        rowEnd = (int) (height);

        for (int row = rowIni; row < rowEnd; row++) {
            for (int cell = 0; cell < flag[row].length; cell++) {
                flag[row][cell] = COLOR_RED;
            }
        }

        return flag;
    }

    //polonia
    public static int[][] createPOLFlag(int height, int width) {
        int[][] flag = new int[height][width];
        int rowIni = 0;
        int rowEnd = 0;

        rowIni = 0;
        rowEnd = (int) (height * 0.50);
        for (int row = rowIni; row < rowEnd; row++) {
            for (int cell = 0; cell < flag[row].length; cell++) {
                flag[row][cell] = COLOR_WHITE;
            }

        }

        rowIni = (int) (height * 0.50);
        rowEnd = (int) (height);

        for (int row = rowIni; row < rowEnd; row++) {
            for (int cell = 0; cell < flag[row].length; cell++) {
                flag[row][cell] = COLOR_RED;
            }
        }

        return flag;
    }

    //panama
    public static int[][] createPanFlag(int height, int width){
        int [][] flag=new int[height][width];
        int rowInt=0;
        int rowIntTwo=0;
        int rowEnd=0;
        int rowEndTwo=0;

        rowEnd=(int)(height*0.5);
        rowEndTwo=(int) (width*0.5);
        for(int row=0; row<rowEnd;row++){
            for (int cell=0;cell<(rowEndTwo);cell++){
                flag[row][cell]=COLOR_WHITE;
            }
        }

        rowInt=(int)(height*0.5);
        rowEnd=(int)(height);
        rowIntTwo=(int) (width*0.5);
        rowEndTwo=(int) (width);
        for(int row=rowInt; row<rowEnd;row++){
            for (int cell=rowIntTwo;cell<(rowEndTwo);cell++){
                flag[row][cell]=COLOR_WHITE;
            }
        }

        rowInt=(int)(height);
        rowEnd=(int)(height*0.5);
        rowIntTwo=(int) (width*0.5);
        rowEndTwo=(int) (width);
        for(int row=0; row<rowEnd;row++){
            for (int cell=rowIntTwo;cell< rowEndTwo;cell++){
                flag[row][cell]=COLOR_RED;
            }
        }

        rowInt=(int)(height*0.5);
        rowEnd=(int)(height);
        rowIntTwo=(int) (width);
        rowEndTwo=(int) (width*0.5);
        for(int row=rowInt; row<rowEnd;row++){
            for (int cell=0;cell< rowEndTwo;cell++){
                flag[row][cell]=COLOR_BLUE;
            }
        }

        return flag;
    }

    //chile
    public static int[][] createChiFlag(int height, int width){
        int[][] flag=new int[height][width];
        int rowInt=0;
        int rowIntTwo=0;
        int rowEnd=0;
        int rowEndTwo=0;

        rowEnd=(int)(height*0.5);
        rowEndTwo=(int)(width*0.35);
        for (int row=rowInt; row<rowEnd; row++){
            for (int cell=rowIntTwo;cell<rowEndTwo;cell++){
                flag[row][cell]=COLOR_BLUE;
            }
        }

        rowEnd=(int)(height*0.5);
        rowIntTwo=(int)(width*0.35);
        rowEndTwo=(width);
        for (int row=rowInt; row<rowEnd; row++){
            for (int cell=rowIntTwo;cell<rowEndTwo;cell++){
                flag[row][cell]=COLOR_WHITE;
            }
        }

        rowInt=(int)(height*0.5);
        rowEnd=(int)(height);
        rowEndTwo=(width);
        for (int row=rowInt; row<rowEnd; row++){
            for (int cell=0;cell<rowEndTwo;cell++){
                flag[row][cell]=COLOR_RED;
            }
        }

        return flag;
    }

    //usa
    public static int[][] createUsaFlag(int height, int width){
        int[][] flag=new int[height][width];
        int rowInt=0;
        int rowIntTwo=0;
        int rowEnd=0;
        int rowEndTwo=0;

        rowEnd=(int)(height*0.5);
        rowEndTwo=(int)(width*0.35);
        for (int row=rowInt; row<rowEnd; row++){
            for (int cell=rowIntTwo;cell<rowEndTwo;cell++){
                flag[row][cell]=COLOR_BLUE;
            }
        }

        rowInt=(int)(height*0.5);
        rowEnd=(int)(height);
        rowIntTwo=(int)(width*0);
        rowEndTwo=(int)(width*0.35);
        for (int row=rowInt; row<rowEnd; row++){
            for (int cell=rowIntTwo;cell<rowEndTwo;cell++){
                if (row%2==0){
                    flag[row][cell]=COLOR_RED;
                }else {
                    flag[row][cell]=COLOR_WHITE;
                }
            }
        }

        rowInt=(int)(height*0);
        rowEnd=(int)(height);
        rowIntTwo=(int)(width*0.35);
        rowEndTwo=(int)(width);
        for (int row=rowInt; row<rowEnd; row++){
            for (int cell=rowIntTwo;cell<rowEndTwo;cell++){
                if (row%2==0){
                    flag[row][cell]=COLOR_RED;
                }else {
                    flag[row][cell]=COLOR_WHITE;
                }
            }
        }
        return flag;
    }

    //czech republic
    public static int[][] createCzeFlag(int height, int width){
        int[][] flag=new int[height][width];
        int rowInt=0;
        int rowEnd=0;
        int rowIntTwo=0;
        int rowEndTwo=0;

        rowInt=(int)(height*0);
        rowEnd=(int)(height*0.5);
        rowIntTwo=(int)(width*0);
        rowEndTwo=(int)(width);
        for (int row=rowInt; row<rowEnd; row++){
            for (int cell=rowIntTwo; cell<rowEndTwo; cell++){
                flag[row][cell]=COLOR_WHITE;
            }
        }

        rowInt=(int)(height*0.5);
        rowEnd=(int)(height);
        rowIntTwo=(int)(width*0);
        rowEndTwo=(int)(width);
        for (int row=rowInt; row<rowEnd; row++){
            for (int cell=rowIntTwo; cell<rowEndTwo; cell++){
                flag[row][cell]=COLOR_RED;
            }
        }

        rowEnd=(int)(height*0.5);
        rowInt=height*0;
        rowIntTwo=0;
        rowEndTwo=0;
        for (int row=rowInt; row<rowEnd; row++){
            rowEndTwo++;
            for (int cell=rowIntTwo; cell<rowEndTwo; cell++){
                flag[row][cell]=COLOR_BLUE;
                flag[height-1-row][cell]=COLOR_BLUE;
            }
        }

        return flag;
    }

    //denmark
    public static int[][] createDinFlag(int height, int width){
        int[][] flag=new int[height][width];
        int rowInt=0;
        int rowEnd=0;
        int cellInt=0;
        int cellEnd=0;

        rowEnd=height;
        cellInt=(int)(width*0.3);
        cellEnd=(int)(width*0.4);
        for (int row=0; row<rowEnd; row++){
            for (int cell=cellInt; cell<cellEnd; cell++){
                flag[row][cell]=COLOR_WHITE;
            }
        }

        rowEnd=(int)(height*0.45);
        cellEnd=(int)(width*0.3);
        for (int row=0; row<rowEnd; row++){
            for (int cell=0; cell<cellEnd; cell++){
                flag[row][cell]=COLOR_RED;
            }
        }

        rowEnd=(int)(height*0.45);
        cellInt=(int)(width*0.4);
        cellEnd=(width);
        for (int row=0; row<rowEnd; row++){
            for (int cell=cellInt; cell<cellEnd; cell++){
                flag[row][cell]=COLOR_RED;
            }
        }

        rowInt=(int)(height*0.45);
        rowEnd=(int)(height*0.55);
        cellInt=(int)(width*0);
        cellEnd=(width);
        for (int row=rowInt; row<rowEnd; row++){
            for (int cell=cellInt; cell<cellEnd; cell++){
                flag[row][cell]=COLOR_WHITE;
            }
        }

        rowInt=(int)(height*0.55);
        rowEnd=(height);
        cellInt=(width*0);
        cellEnd=(int)(width*0.3);
        for (int row=rowInt; row<rowEnd; row++){
            for (int cell=cellInt; cell<cellEnd; cell++){
                flag[row][cell]=COLOR_RED;
            }
        }

        rowInt=(int)(height*0.55);
        rowEnd=(height);
        cellInt=(int)(width*0.4);
        cellEnd=(width);
        for (int row=rowInt; row<rowEnd; row++){
            for (int cell=cellInt; cell<cellEnd; cell++){
                flag[row][cell]=COLOR_RED;
            }
        }

        return flag;
    }

    //finland
    public static int[][] createFinFlag(int height, int width){
        int[][] flag=new int[height][width];
        int rowInt=0;
        int rowEnd=0;
        int cellInt=0;
        int cellEnd=0;

        rowEnd=(int)(height*0.4);
        cellEnd=(int)(width*0.2);
        for (int row=0; row<rowEnd; row++){
            for (int cell=0; cell<cellEnd; cell++){
                flag[row][cell]=COLOR_WHITE;
            }
        }

        rowEnd=(int)(height*0.45);
        cellInt=(int)(width*0.4);
        cellEnd=(width);
        for (int row=0; row<rowEnd; row++){
            for (int cell=cellInt; cell<cellEnd; cell++){
                flag[row][cell]=COLOR_WHITE;
            }
        }

        rowInt=(int)(height*0.55);
        rowEnd=(height);
        cellInt=(width*0);
        cellEnd=(int)(width*0.3);
        for (int row=rowInt; row<rowEnd; row++){
            for (int cell=cellInt; cell<cellEnd; cell++){
                flag[row][cell]=COLOR_WHITE;
            }
        }

        rowInt=(int)(height*0.55);
        rowEnd=(height);
        cellInt=(int)(width*0.4);
        cellEnd=(width);
        for (int row=rowInt; row<rowEnd; row++){
            for (int cell=cellInt; cell<cellEnd; cell++){
                flag[row][cell]=COLOR_WHITE;
            }
        }

        rowInt=(int)(height*0.35);
        rowEnd=(int)(height*0.6);
        cellInt=(int)(width*0);
        cellEnd=(width);
        for (int row=rowInt; row<rowEnd; row++){
            for (int cell=cellInt; cell<cellEnd; cell++){
                flag[row][cell]=COLOR_BLUE;
            }
        }

        rowEnd=height;
        cellInt=(int)(width*0.2);
        cellEnd=(int)(width*0.45);
        for (int row=0; row<rowEnd; row++){
            for (int cell=cellInt; cell<cellEnd; cell++){
                flag[row][cell]=COLOR_BLUE;
            }
        }
        return flag;
    }

    //norway
    public static int[][] createNorFlag(int height, int width){
        int[][] flag=new int[height][width];
        int rowInt=0;
        int rowEnd=0;
        int cellInt=0;
        int cellEnd=0;

        rowEnd=(int)(height*0.4);
        cellEnd=(int)(width*0.2);
        for (int row=0; row<rowEnd; row++){
            for (int cell=0; cell<cellEnd; cell++){
                flag[row][cell]=COLOR_RED;
            }
        }

        rowEnd=(int)(height*0.45);
        cellInt=(int)(width*0.4);
        cellEnd=(width);
        for (int row=0; row<rowEnd; row++){
            for (int cell=cellInt; cell<cellEnd; cell++){
                flag[row][cell]=COLOR_RED;
            }
        }

        rowInt=(int)(height*0.55);
        rowEnd=(height);
        cellInt=(width*0);
        cellEnd=(int)(width*0.3);
        for (int row=rowInt; row<rowEnd; row++){
            for (int cell=cellInt; cell<cellEnd; cell++){
                flag[row][cell]=COLOR_RED;
            }
        }

        rowInt=(int)(height*0.55);
        rowEnd=(height);
        cellInt=(int)(width*0.4);
        cellEnd=(width);
        for (int row=rowInt; row<rowEnd; row++){
            for (int cell=cellInt; cell<cellEnd; cell++){
                flag[row][cell]=COLOR_RED;
            }
        }

        rowInt=(int)(height*0.35);
        rowEnd=(int)(height*0.6);
        cellInt=(int)(width*0);
        cellEnd=(width);
        for (int row=rowInt; row<rowEnd; row++){
            for (int cell=cellInt; cell<cellEnd; cell++){
                flag[row][cell]=COLOR_WHITE;
            }
        }


        rowEnd=height;
        cellInt=(int)(width*0.2);
        cellEnd=(int)(width*0.45);
        for (int row=0; row<rowEnd; row++){
            for (int cell=cellInt; cell<cellEnd; cell++){
                flag[row][cell]=COLOR_WHITE;
            }
        }

        rowInt=(int)(height*0.45);
        rowEnd=(int)(height*0.5);
        cellInt=(int)(width*0);
        cellEnd=(width);
        for (int row=rowInt; row<rowEnd; row++){
            for (int cell=cellInt; cell<cellEnd; cell++){
                flag[row][cell]=COLOR_BLUE;
            }
        }

        rowEnd=height;
        cellInt=(int)(width*0.29);
        cellEnd=(int)(width*0.38);
        for (int row=0; row<rowEnd; row++){
            for (int cell=cellInt; cell<cellEnd; cell++){
                flag[row][cell]=COLOR_BLUE;
            }
        }
        return flag;
    }

    //kuwait
    public static int[][] createKWTFLAG(int heigth, int width) {
        int[][] flag = new int[heigth][width];
        int rowIni = 0;
        int rowEnd = (int) ((double) heigth * 0.35);
        int cellIni = 0;
        int cellEnd = width;

        int row;
        int cell;
        for (row = rowIni; row < rowEnd; ++row) {
            for (cell = cellIni; cell < cellEnd; ++cell) {
                flag[row][cell] = COLOR_GREEN;
            }
        }

        rowIni = rowEnd;
        rowEnd = (int) ((double) heigth * 0.7);
        cellIni = 0;
        cellEnd = width;

        for (row = rowIni; row < rowEnd; ++row) {
            for (cell = cellIni; cell < cellEnd; ++cell) {
                flag[row][cell] = COLOR_WHITE;
            }
        }

        rowIni = rowEnd;
        rowEnd = heigth;
        cellIni = 0;
        cellEnd = width;

        for (row = rowIni; row < rowEnd; ++row) {
            for (cell = cellIni; cell < cellEnd; ++cell) {
                flag[row][cell] = COLOR_RED;
            }
        }

        rowIni = 0;
        rowEnd = (int) ((double) heigth * 0.5);
        cellIni = 0;
        cellEnd = 0;

        for (row = rowIni; row < rowEnd; ++row) {
            ++cellEnd;

            for (cell = cellIni; cell < cellEnd; ++cell) {
                flag[row][cell] = COLOR_BLACK;
                flag[heigth - 1 - row][cell] = COLOR_BLACK;
            }
        }
        return flag;
    }

    //south africa
    public static int[][] createZAFFLAG(int heigth, int width){
        int[][] flag = new int[heigth][width];
        int rowIni = 0;
        int rowEnd = 0;
        int cellIni = 0;
        int cellEnd = 0;

        //COLOR RED
        rowIni = 0;
        rowEnd = (int)(heigth*0.35);
        cellIni = 0;
        cellEnd = width;

        for(int row=rowIni; row<rowEnd; row++){

            for(int cell=cellIni; cell<cellEnd; cell++){
                flag[row][cell] = COLOR_RED;
            }
        }

        //COLOR WHITE
        rowIni = rowEnd;
        rowEnd = (int)(heigth*0.7);
        cellIni = 0;
        cellEnd = width;

        for(int row=rowIni; row<rowEnd; row++){

            for(int cell=cellIni; cell<cellEnd; cell++){
                flag[row][cell] = COLOR_WHITE;
            }
        }

        //COLOR BLUE
        rowIni = rowEnd;
        rowEnd = heigth;
        cellIni = 0;
        cellEnd = width;

        for(int row=rowIni; row<rowEnd; row++){

            for(int cell=cellIni; cell<cellEnd; cell++){
                flag[row][cell] = COLOR_BLUE;
            }
        }

        //COLOR WHITE >
        rowIni = 0;
        rowEnd = (int)(heigth*0.5);
        cellIni = 0;
        cellEnd = 1;

        for (int row=rowIni; row<rowEnd; row++){
            cellEnd++;
            for(int cell=cellIni; cell<cellEnd; cell++){
                flag[row][cell] = COLOR_WHITE;
                flag[heigth-1-row][cell] = COLOR_WHITE;
            }
        }

        //COLOR GREEN >
        rowIni = 0;
        rowEnd = (int)(heigth*0.5);
        cellIni = 0;
        cellEnd = 0;

        for (int row=rowIni; row<rowEnd; row++){
            cellEnd++;
            for(int cell=cellIni; cell<cellEnd; cell++){
                flag[row][cell] = COLOR_GREEN;
                flag[heigth-1-row][cell] = COLOR_GREEN;
            }
        }

        //COLOR GREEN --
        rowIni = (int)(heigth*0.5)-1;
        rowEnd = rowIni+2;
        cellIni = 0;
        cellEnd = width;

        for(int row=rowIni; row<rowEnd; row++){

            for(int cell=cellIni; cell<cellEnd; cell++){
                flag[row][cell] = COLOR_GREEN;
            }
        }

        //COLOR YELLOW >
        rowIni = 2;
        rowEnd = (int)(heigth*0.5);
        cellIni = 0;
        cellEnd = 0;

        for (int row=rowIni; row<rowEnd; row++){
            cellEnd++;
            for(int cell=cellIni; cell<cellEnd; cell++){
                flag[row][cell] = COLOR_YELLOW;
                flag[heigth-1-row][cell] = COLOR_YELLOW;
            }
        }

        //COLOR BLACK >
        rowIni = 3;
        rowEnd = (int)(heigth*0.5);
        cellIni = 0;
        cellEnd = 0;

        for (int row=rowIni; row<rowEnd; row++){
            cellEnd++;
            for(int cell=cellIni; cell<cellEnd; cell++){
                flag[row][cell] = COLOR_BLACK;
                flag[heigth-1-row][cell] = COLOR_BLACK;
            }
        }

        return flag;
    }

    //switzerland
    public static int[][] createCheFlag(int height, int width){
        int[][] flag=new int[height][width];
        int rowInt=0;
        int rowEnd=0;
        int cellInt=0;
        int cellEnd=0;

        rowEnd=height;
        cellEnd=width;
        for (int row=0; row<rowEnd; row++){
            for (int cell=0; cell<cellEnd; cell++){
                flag[row][cell]=COLOR_WHITE;
            }
        }

        rowEnd=(int)(height*0.1);
        cellEnd=width;
        for (int row=0; row<rowEnd; row++){
            for (int cell=0; cell<cellEnd; cell++){
                flag[row][cell]=COLOR_RED;
            }
        }

        rowInt=(int)(height*0.1);
        rowEnd=(int)(height*0.35);
        cellEnd=(int)(width*0.4);
        for (int row=rowInt; row<rowEnd; row++){
            for (int cell=0; cell<cellEnd; cell++){
                flag[row][cell]=COLOR_RED;
            }
        }

        rowInt=(int)(height*0.35);
        rowEnd=(int)(height*0.6);
        cellEnd=(int)(width*0.20);
        for (int row=rowInt; row<rowEnd; row++){
            for (int cell=0; cell<cellEnd; cell++){
                flag[row][cell]=COLOR_RED;
            }
        }

        rowInt=(int)(height*0.6);
        rowEnd=(int)(height*0.9);
        cellEnd=(int)(width*0.4);
        for (int row=rowInt; row<rowEnd; row++){
            for (int cell=0; cell<cellEnd; cell++){
                flag[row][cell]=COLOR_RED;
            }
        }

        rowInt=(int) (height*0.9);
        rowEnd=height;
        cellEnd=width;
        for (int row=rowInt; row<rowEnd; row++){
            for (int cell=0; cell<cellEnd; cell++){
                flag[row][cell]=COLOR_RED;
            }
        }

        rowInt=(int)(height*0.1);
        rowEnd=(int)(height*0.35);
        cellInt=(int)(width*0.6);
        cellEnd=(width);
        for (int row=rowInt; row<rowEnd; row++){
            for (int cell=cellInt; cell<cellEnd; cell++){
                flag[row][cell]=COLOR_RED;
            }
        }

        rowInt=(int)(height*0.35);
        rowEnd=(int)(height*0.6);
        cellInt=(int)(width*0.8);
        cellEnd=(width);
        for (int row=rowInt; row<rowEnd; row++){
            for (int cell=cellInt; cell<cellEnd; cell++){
                flag[row][cell]=COLOR_RED;
            }
        }

        rowInt=(int)(height*0.6);
        rowEnd=(int)(height*0.9);
        cellInt=(int)(width*0.6);
        cellEnd=(width);
        for (int row=rowInt; row<rowEnd; row++){
            for (int cell=cellInt; cell<cellEnd; cell++){
                flag[row][cell]=COLOR_RED;
            }
        }

        return flag;
    }


    public static void main(String[] args) {
        int[][] flag = {};

        flag = createCOLFlag(24, 40);
        JOptionPaneArrays.showColorArray2D(null, flag);
        flag = createVENFlag(24, 40);
        JOptionPaneArrays.showColorArray2D(null, flag);
        flag = createPOLFlag(24, 40);
        JOptionPaneArrays.showColorArray2D(null, flag);
        flag = createPanFlag(24, 40);
        JOptionPaneArrays.showColorArray2D(null, flag);
        flag = createChiFlag(24, 40);
        JOptionPaneArrays.showColorArray2D(null, flag);
        flag = createUsaFlag(24, 40);
        JOptionPaneArrays.showColorArray2D(null, flag);
        flag = createCzeFlag(24, 40);
        JOptionPaneArrays.showColorArray2D(null, flag);
        flag = createDinFlag(24, 40);
        JOptionPaneArrays.showColorArray2D(null, flag);
        flag = createFinFlag(24, 40);
        JOptionPaneArrays.showColorArray2D(null, flag);
        flag = createNorFlag(24, 40);
        JOptionPaneArrays.showColorArray2D(null, flag);
        flag = createKWTFLAG(24, 40);
        JOptionPaneArrays.showColorArray2D(null, flag);
        flag = createZAFFLAG(24, 40);
        JOptionPaneArrays.showColorArray2D(null, flag);
        flag = createCheFlag(24, 40);
        JOptionPaneArrays.showColorArray2D(null, flag);
    }
}
