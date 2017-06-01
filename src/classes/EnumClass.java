package classes;

/**
 * Created by Mohamed Hassan on 6/1/2017.
 * mhabulazm@gmail.com
 */
public enum EnumClass {
    Minor(-1) {
        @Override
        String text() {
            return "Minor Priority";
        }
    },
    Major(2) {
        @Override
        String text() {
            return "Major Priority";
        }
    },
    Critical(11) {
        @Override
        String text() {
            return "Critical Priority";

        }
    },
    Normal(1) {
        @Override
        String text() {
            return "Normal Priority";

        }
    };

    EnumClass(int i) {
    }

    abstract String text();
}
