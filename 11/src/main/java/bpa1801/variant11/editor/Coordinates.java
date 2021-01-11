package bpa1801.variant11.editor;

public interface Coordinates {

    public enum CoordinatesType {
        Center,
        Corners
    };

    public class CoordinatesValues {
        public final double value1;

        public final double value2;
    
        public final double value3;
    
        public final double value4;

        public CoordinatesValues(double value1, double value2, double value3, double value4) {
            this.value1 = value1;
            this.value2 = value2;
            this.value3 = value3;
            this.value4 = value4;
        }
    }

    public CoordinatesType getType();

    public CoordinatesValues getValues();
}
